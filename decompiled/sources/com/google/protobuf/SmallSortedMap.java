package com.google.protobuf;

import com.google.protobuf.FieldSet;
import defpackage.se;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class SmallSortedMap<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private Object[] entries;
    private int entriesSize;
    private boolean isImmutable;
    private volatile SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    private Map<K, V> overflowEntries;
    private Map<K, V> overflowEntriesDescending;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public class DescendingEntryIterator implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> lazyOverflowIterator;
        private int pos;

        private DescendingEntryIterator() {
            this.pos = SmallSortedMap.this.entriesSize;
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = SmallSortedMap.this.overflowEntriesDescending.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.pos;
            if ((i > 0 && i <= SmallSortedMap.this.entriesSize) || getOverflowIterator().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (!getOverflowIterator().hasNext()) {
                Object[] objArr = SmallSortedMap.this.entries;
                int i = this.pos - 1;
                this.pos = i;
                return (Entry) objArr[i];
            }
            return getOverflowIterator().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public class DescendingEntrySet extends SmallSortedMap<K, V>.EntrySet {
        private DescendingEntrySet() {
            super();
        }

        @Override // com.google.protobuf.SmallSortedMap.EntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new DescendingEntryIterator();
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public class EntryIterator implements Iterator<Map.Entry<K, V>> {
        private Iterator<Map.Entry<K, V>> lazyOverflowIterator;
        private boolean nextCalledBeforeRemove;
        private int pos;

        private EntryIterator() {
            this.pos = -1;
        }

        private Iterator<Map.Entry<K, V>> getOverflowIterator() {
            if (this.lazyOverflowIterator == null) {
                this.lazyOverflowIterator = SmallSortedMap.this.overflowEntries.entrySet().iterator();
            }
            return this.lazyOverflowIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.pos + 1 < SmallSortedMap.this.entriesSize || (!SmallSortedMap.this.overflowEntries.isEmpty() && getOverflowIterator().hasNext())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.nextCalledBeforeRemove = true;
            int i = this.pos + 1;
            this.pos = i;
            if (i < SmallSortedMap.this.entriesSize) {
                return (Entry) SmallSortedMap.this.entries[this.pos];
            }
            return getOverflowIterator().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.nextCalledBeforeRemove) {
                this.nextCalledBeforeRemove = false;
                SmallSortedMap.this.checkMutable();
                if (this.pos < SmallSortedMap.this.entriesSize) {
                    SmallSortedMap smallSortedMap = SmallSortedMap.this;
                    int i = this.pos;
                    this.pos = i - 1;
                    smallSortedMap.removeArrayEntryAt(i);
                    return;
                }
                getOverflowIterator().remove();
                return;
            }
            se.p("remove() was called before next()");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                SmallSortedMap.this.put((SmallSortedMap) entry.getKey(), (K) entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            SmallSortedMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = SmallSortedMap.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                if (obj2 == null || !obj2.equals(value)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                SmallSortedMap.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return SmallSortedMap.this.size();
        }
    }

    private SmallSortedMap() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.overflowEntries = map;
        this.overflowEntriesDescending = map;
    }

    private int binarySearchInArray(K k) {
        int i;
        int i2 = this.entriesSize;
        int i3 = i2 - 1;
        if (i3 >= 0) {
            int compareTo = k.compareTo(((Entry) this.entries[i3]).getKey());
            if (compareTo > 0) {
                i = i2 + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int compareTo2 = k.compareTo(((Entry) this.entries[i5]).getKey());
            if (compareTo2 < 0) {
                i3 = i5 - 1;
            } else if (compareTo2 > 0) {
                i4 = i5 + 1;
            } else {
                return i5;
            }
        }
        i = i4 + 1;
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (!this.isImmutable) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (this.entries == null) {
            this.entries = new Object[16];
        }
    }

    private SortedMap<K, V> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    public static <FieldDescriptorT extends FieldSet.FieldDescriptorLite<FieldDescriptorT>> SmallSortedMap<FieldDescriptorT, Object> newFieldMap() {
        return (SmallSortedMap<FieldDescriptorT, Object>) new SmallSortedMap<FieldDescriptorT, Object>() { // from class: com.google.protobuf.SmallSortedMap.1
            @Override // com.google.protobuf.SmallSortedMap
            public void makeImmutable() {
                if (!isImmutable()) {
                    for (int i = 0; i < getNumArrayEntries(); i++) {
                        Map.Entry<FieldDescriptorT, Object> arrayEntryAt = getArrayEntryAt(i);
                        if (((FieldSet.FieldDescriptorLite) arrayEntryAt.getKey()).isRepeated()) {
                            arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                        }
                    }
                    for (Map.Entry<FieldDescriptorT, Object> entry : getOverflowEntries()) {
                        if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.makeImmutable();
            }

            @Override // com.google.protobuf.SmallSortedMap, java.util.AbstractMap, java.util.Map
            public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((AnonymousClass1<FieldDescriptorT>) obj, (Comparable) obj2);
            }
        };
    }

    public static <K extends Comparable<K>, V> SmallSortedMap<K, V> newInstanceForTest() {
        return new SmallSortedMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V removeArrayEntryAt(int i) {
        checkMutable();
        V v = (V) ((Entry) this.entries[i]).getValue();
        Object[] objArr = this.entries;
        System.arraycopy(objArr, i + 1, objArr, i, (this.entriesSize - i) - 1);
        this.entriesSize--;
        if (!this.overflowEntries.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entries[this.entriesSize] = new Entry(this, it.next());
            this.entriesSize++;
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (this.entriesSize != 0) {
            this.entries = null;
            this.entriesSize = 0;
        }
        if (!this.overflowEntries.isEmpty()) {
            this.overflowEntries.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (binarySearchInArray(comparable) < 0 && !this.overflowEntries.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public Set<Map.Entry<K, V>> descendingEntrySet() {
        return new DescendingEntrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new EntrySet();
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmallSortedMap)) {
            return super.equals(obj);
        }
        SmallSortedMap smallSortedMap = (SmallSortedMap) obj;
        int size = size();
        if (size != smallSortedMap.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != smallSortedMap.getNumArrayEntries()) {
            return entrySet().equals(smallSortedMap.entrySet());
        }
        for (int i = 0; i < numArrayEntries; i++) {
            if (!getArrayEntryAt(i).equals(smallSortedMap.getArrayEntryAt(i))) {
                return false;
            }
        }
        if (numArrayEntries == size) {
            return true;
        }
        return this.overflowEntries.equals(smallSortedMap.overflowEntries);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return (V) ((Entry) this.entries[binarySearchInArray]).getValue();
        }
        return this.overflowEntries.get(comparable);
    }

    public Map.Entry<K, V> getArrayEntryAt(int i) {
        if (i < this.entriesSize) {
            return (Entry) this.entries[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public int getNumArrayEntries() {
        return this.entriesSize;
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable<Map.Entry<K, V>> getOverflowEntries() {
        if (this.overflowEntries.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.overflowEntries.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int i = 0;
        for (int i2 = 0; i2 < numArrayEntries; i2++) {
            i += this.entries[i2].hashCode();
        }
        if (getNumOverflowEntries() > 0) {
            return this.overflowEntries.hashCode() + i;
        }
        return i;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.isImmutable) {
            if (this.overflowEntries.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.overflowEntries);
            }
            this.overflowEntries = unmodifiableMap;
            if (this.overflowEntriesDescending.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.overflowEntriesDescending);
            }
            this.overflowEntriesDescending = unmodifiableMap2;
            this.isImmutable = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V put(K k, V v) {
        checkMutable();
        int binarySearchInArray = binarySearchInArray(k);
        if (binarySearchInArray >= 0) {
            return (V) ((Entry) this.entries[binarySearchInArray]).setValue(v);
        }
        ensureEntryArrayMutable();
        int i = -(binarySearchInArray + 1);
        if (i >= 16) {
            return getOverflowEntriesMutable().put(k, v);
        }
        int i2 = this.entriesSize;
        if (i2 == 16) {
            Entry entry = (Entry) this.entries[15];
            this.entriesSize = i2 - 1;
            getOverflowEntriesMutable().put(entry.getKey(), entry.getValue());
        }
        Object[] objArr = this.entries;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.entries[i] = new Entry(k, v);
        this.entriesSize++;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        checkMutable();
        Comparable comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return (V) removeArrayEntryAt(binarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.overflowEntries.size() + this.entriesSize;
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public class Entry implements Map.Entry<K, V>, Comparable<SmallSortedMap<K, V>.Entry> {
        private final K key;
        private V value;

        public Entry(SmallSortedMap smallSortedMap, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        public int compareTo(SmallSortedMap<K, V>.Entry entry) {
            return getKey().compareTo(entry.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (equals(this.key, entry.getKey()) && equals(this.value, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k = this.key;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.value;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            SmallSortedMap.this.checkMutable();
            V v2 = this.value;
            this.value = v;
            return v2;
        }

        public String toString() {
            return this.key + "=" + this.value;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        public Entry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        private boolean equals(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((SmallSortedMap<K, V>) obj, (Comparable) obj2);
    }
}
