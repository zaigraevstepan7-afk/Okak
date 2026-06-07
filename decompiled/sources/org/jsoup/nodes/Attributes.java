package org.jsoup.nodes;

import defpackage.l90;
import defpackage.y61;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.SharedConstants;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Range;
import org.jsoup.parser.ParseSettings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Attributes implements Iterable<Attribute>, Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String EmptyString = "";
    private static final int GrowthFactor = 2;
    private static final int InitialCapacity = 3;
    static final char InternalPrefix = '/';
    static final int NotFound = -1;
    protected static final String dataPrefix = "data-";
    private int size = 0;
    String[] keys = new String[3];
    Object[] vals = new Object[3];

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Dataset extends AbstractMap<String, String> {
        private final Attributes attributes;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public class DatasetIterator implements Iterator<Map.Entry<String, String>> {
            private Attribute attr;
            private final Iterator<Attribute> attrIter;

            private DatasetIterator() {
                this.attrIter = Dataset.this.attributes.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                while (this.attrIter.hasNext()) {
                    Attribute next = this.attrIter.next();
                    this.attr = next;
                    if (next.isDataAttribute()) {
                        return true;
                    }
                }
                return Attributes.$assertionsDisabled;
            }

            @Override // java.util.Iterator
            public Map.Entry<String, String> next() {
                return new Attribute(this.attr.getKey().substring(5), this.attr.getValue());
            }

            @Override // java.util.Iterator
            public void remove() {
                Dataset.this.attributes.remove(this.attr.getKey());
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            private EntrySet() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<String, String>> iterator() {
                return new DatasetIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                DatasetIterator datasetIterator = new DatasetIterator();
                int i = 0;
                while (datasetIterator.hasNext()) {
                    i++;
                }
                return i;
            }
        }

        private Dataset(Attributes attributes) {
            this.attributes = attributes;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public String put(String str, String str2) {
            String str3;
            String dataKey = Attributes.dataKey(str);
            if (this.attributes.hasKey(dataKey)) {
                str3 = this.attributes.get(dataKey);
            } else {
                str3 = null;
            }
            this.attributes.put(dataKey, str2);
            return str3;
        }
    }

    private void addObject(String str, Object obj) {
        checkCapacity(this.size + 1);
        String[] strArr = this.keys;
        int i = this.size;
        strArr[i] = str;
        this.vals[i] = obj;
        this.size = i + 1;
    }

    private void checkCapacity(int i) {
        boolean z;
        if (i >= this.size) {
            z = true;
        } else {
            z = $assertionsDisabled;
        }
        Validate.isTrue(z);
        String[] strArr = this.keys;
        int length = strArr.length;
        if (length >= i) {
            return;
        }
        int i2 = 3;
        if (length >= 3) {
            i2 = this.size * 2;
        }
        if (i <= i2) {
            i = i2;
        }
        this.keys = (String[]) Arrays.copyOf(strArr, i);
        this.vals = Arrays.copyOf(this.vals, i);
    }

    public static String checkNotNull(Object obj) {
        if (obj == null) {
            return "";
        }
        return (String) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String dataKey(String str) {
        return l90.l(dataPrefix, str);
    }

    private int indexOfKeyIgnoreCase(String str) {
        Validate.notNull(str);
        for (int i = 0; i < this.size; i++) {
            if (str.equalsIgnoreCase(this.keys[i])) {
                return i;
            }
        }
        return -1;
    }

    public static String internalKey(String str) {
        return l90.l("/", str);
    }

    public static boolean isInternalKey(String str) {
        if (str.length() <= 1 || str.charAt(0) != '/') {
            return $assertionsDisabled;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void remove(int i) {
        boolean z;
        if (i >= this.size) {
            z = true;
        } else {
            z = $assertionsDisabled;
        }
        Validate.isFalse(z);
        int i2 = (this.size - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.keys;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.vals;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.size - 1;
        this.size = i4;
        this.keys[i4] = null;
        this.vals[i4] = null;
    }

    public Attributes add(String str, String str2) {
        addObject(str, str2);
        return this;
    }

    public void addAll(Attributes attributes) {
        boolean z;
        if (attributes.size() != 0) {
            checkCapacity(this.size + attributes.size);
            if (this.size != 0) {
                z = true;
            } else {
                z = $assertionsDisabled;
            }
            Iterator<Attribute> it = attributes.iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                if (z) {
                    put(next);
                } else {
                    add(next.getKey(), next.getValue());
                }
            }
        }
    }

    public List<Attribute> asList() {
        ArrayList arrayList = new ArrayList(this.size);
        for (int i = 0; i < this.size; i++) {
            String str = this.keys[i];
            if (!isInternalKey(str)) {
                arrayList.add(new Attribute(str, (String) this.vals[i], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Attribute attribute(String str) {
        int indexOfKey = indexOfKey(str);
        if (indexOfKey == -1) {
            return null;
        }
        return new Attribute(str, checkNotNull(this.vals[indexOfKey]), this);
    }

    public Attributes clone() {
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.size = this.size;
            attributes.keys = (String[]) Arrays.copyOf(this.keys, this.size);
            attributes.vals = Arrays.copyOf(this.vals, this.size);
            return attributes;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, String> dataset() {
        return new Dataset();
    }

    public int deduplicate(ParseSettings parseSettings) {
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean preserveAttributeCase = parseSettings.preserveAttributeCase();
        int i2 = 0;
        while (i < this.size) {
            String str = this.keys[i];
            i++;
            int i3 = i;
            while (i3 < this.size) {
                if ((preserveAttributeCase && str.equals(this.keys[i3])) || (!preserveAttributeCase && str.equalsIgnoreCase(this.keys[i3]))) {
                    i2++;
                    remove(i3);
                    i3--;
                }
                i3++;
            }
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return $assertionsDisabled;
        }
        Attributes attributes = (Attributes) obj;
        if (this.size != attributes.size) {
            return $assertionsDisabled;
        }
        for (int i = 0; i < this.size; i++) {
            int indexOfKey = attributes.indexOfKey(this.keys[i]);
            if (indexOfKey == -1 || !Objects.equals(this.vals[i], attributes.vals[indexOfKey])) {
                return $assertionsDisabled;
            }
        }
        return true;
    }

    public String get(String str) {
        int indexOfKey = indexOfKey(str);
        if (indexOfKey == -1) {
            return "";
        }
        return checkNotNull(this.vals[indexOfKey]);
    }

    public String getIgnoreCase(String str) {
        int indexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        if (indexOfKeyIgnoreCase == -1) {
            return "";
        }
        return checkNotNull(this.vals[indexOfKeyIgnoreCase]);
    }

    public Map<String, Range.AttributeRange> getRanges() {
        return (Map) userData(SharedConstants.AttrRangeKey);
    }

    public boolean hasDeclaredValueForKey(String str) {
        int indexOfKey = indexOfKey(str);
        if (indexOfKey != -1 && this.vals[indexOfKey] != null) {
            return true;
        }
        return $assertionsDisabled;
    }

    public boolean hasDeclaredValueForKeyIgnoreCase(String str) {
        int indexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        if (indexOfKeyIgnoreCase != -1 && this.vals[indexOfKeyIgnoreCase] != null) {
            return true;
        }
        return $assertionsDisabled;
    }

    public boolean hasKey(String str) {
        if (indexOfKey(str) != -1) {
            return true;
        }
        return $assertionsDisabled;
    }

    public boolean hasKeyIgnoreCase(String str) {
        if (indexOfKeyIgnoreCase(str) != -1) {
            return true;
        }
        return $assertionsDisabled;
    }

    public int hashCode() {
        return Arrays.hashCode(this.vals) + (((this.size * 31) + Arrays.hashCode(this.keys)) * 31);
    }

    public final void html(Appendable appendable, Document.OutputSettings outputSettings) {
        String validKey;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.keys[i2];
            if (!isInternalKey(str) && (validKey = Attribute.getValidKey(str, outputSettings.syntax())) != null) {
                Attribute.htmlNoValidate(validKey, (String) this.vals[i2], appendable.append(' '), outputSettings);
            }
        }
    }

    public int indexOfKey(String str) {
        Validate.notNull(str);
        for (int i = 0; i < this.size; i++) {
            if (str.equals(this.keys[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return $assertionsDisabled;
    }

    @Override // java.lang.Iterable
    public Iterator<Attribute> iterator() {
        return new Iterator<Attribute>() { // from class: org.jsoup.nodes.Attributes.1
            static final /* synthetic */ boolean $assertionsDisabled = false;
            int expectedSize;
            int i = 0;

            {
                this.expectedSize = Attributes.this.size;
            }

            private void checkModified() {
                if (Attributes.this.size == this.expectedSize) {
                } else {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                checkModified();
                while (this.i < Attributes.this.size && Attributes.isInternalKey(Attributes.this.keys[this.i])) {
                    this.i++;
                }
                if (this.i < Attributes.this.size) {
                    return true;
                }
                return Attributes.$assertionsDisabled;
            }

            @Override // java.util.Iterator
            public Attribute next() {
                checkModified();
                if (this.i < Attributes.this.size) {
                    String str = Attributes.this.keys[this.i];
                    Attributes attributes = Attributes.this;
                    Attribute attribute = new Attribute(str, (String) attributes.vals[this.i], attributes);
                    this.i++;
                    return attribute;
                }
                y61.c();
                return null;
            }

            @Override // java.util.Iterator
            public void remove() {
                Attributes attributes = Attributes.this;
                int i = this.i - 1;
                this.i = i;
                attributes.remove(i);
                this.expectedSize--;
            }
        };
    }

    public void normalize() {
        for (int i = 0; i < this.size; i++) {
            String str = this.keys[i];
            if (!isInternalKey(str)) {
                this.keys[i] = Normalizer.lowerCase(str);
            }
        }
    }

    public Attributes put(String str, String str2) {
        Validate.notNull(str);
        int indexOfKey = indexOfKey(str);
        if (indexOfKey != -1) {
            this.vals[indexOfKey] = str2;
            return this;
        }
        add(str, str2);
        return this;
    }

    public void putIgnoreCase(String str, String str2) {
        int indexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        if (indexOfKeyIgnoreCase != -1) {
            this.vals[indexOfKeyIgnoreCase] = str2;
            if (!this.keys[indexOfKeyIgnoreCase].equals(str)) {
                this.keys[indexOfKeyIgnoreCase] = str;
                return;
            }
            return;
        }
        add(str, str2);
    }

    public void removeIgnoreCase(String str) {
        int indexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        if (indexOfKeyIgnoreCase != -1) {
            remove(indexOfKeyIgnoreCase);
        }
    }

    public int size() {
        return this.size;
    }

    public Range.AttributeRange sourceRange(String str) {
        if (!hasKey(str)) {
            return Range.AttributeRange.UntrackedAttr;
        }
        Map<String, Range.AttributeRange> ranges = getRanges();
        if (ranges == null) {
            return Range.AttributeRange.UntrackedAttr;
        }
        Range.AttributeRange attributeRange = ranges.get(str);
        if (attributeRange != null) {
            return attributeRange;
        }
        return Range.AttributeRange.UntrackedAttr;
    }

    public String toString() {
        return html();
    }

    public Map<String, Object> userData() {
        int indexOfKey = indexOfKey(SharedConstants.UserDataKey);
        if (indexOfKey == -1) {
            HashMap hashMap = new HashMap();
            addObject(SharedConstants.UserDataKey, hashMap);
            return hashMap;
        }
        return (Map) this.vals[indexOfKey];
    }

    public Attributes put(String str, boolean z) {
        if (z) {
            putIgnoreCase(str, null);
            return this;
        }
        remove(str);
        return this;
    }

    public Attributes put(Attribute attribute) {
        Validate.notNull(attribute);
        put(attribute.getKey(), attribute.getValue());
        attribute.parent = this;
        return this;
    }

    public Object userData(String str) {
        Validate.notNull(str);
        if (hasKey(SharedConstants.UserDataKey)) {
            return userData().get(str);
        }
        return null;
    }

    public Attributes sourceRange(String str, Range.AttributeRange attributeRange) {
        Validate.notNull(str);
        Validate.notNull(attributeRange);
        Map<String, Range.AttributeRange> ranges = getRanges();
        if (ranges == null) {
            ranges = new HashMap<>();
            userData(SharedConstants.AttrRangeKey, ranges);
        }
        ranges.put(str, attributeRange);
        return this;
    }

    public Attributes userData(String str, Object obj) {
        Validate.notNull(str);
        userData().put(str, obj);
        return this;
    }

    public void remove(String str) {
        int indexOfKey = indexOfKey(str);
        if (indexOfKey != -1) {
            remove(indexOfKey);
        }
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            html(borrowBuilder, new Document("").outputSettings());
            return StringUtil.releaseBuilder(borrowBuilder);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }
}
