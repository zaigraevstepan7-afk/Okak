package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.l90;
import defpackage.se;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final long[] EMPTY_ARRAY;
    private static final LongArrayList EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        long[] jArr = new long[0];
        EMPTY_ARRAY = jArr;
        EMPTY_LIST = new LongArrayList(jArr, 0, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LongArrayList(com.google.protobuf.LongArrayList r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r3.size
            if (r0 != 0) goto L7
            long[] r0 = com.google.protobuf.LongArrayList.EMPTY_ARRAY
            goto Ld
        L7:
            long[] r1 = r3.array
            long[] r0 = java.util.Arrays.copyOf(r1, r0)
        Ld:
            int r3 = r3.size
            r2.<init>(r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LongArrayList.<init>(com.google.protobuf.LongArrayList, boolean):void");
    }

    private void addLong(int i, long j) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.size)) {
            long[] jArr = this.array;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[growSize(jArr.length)];
                System.arraycopy(this.array, 0, jArr2, 0, i);
                System.arraycopy(this.array, i, jArr2, i + 1, this.size - i);
                this.array = jArr2;
            }
            this.array[i] = j;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        se.u(makeOutOfBoundsExceptionMessage(i));
    }

    public static LongArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i) {
        if (i >= 0 && i < this.size) {
            return;
        }
        se.u(makeOutOfBoundsExceptionMessage(i));
    }

    private static int growSize(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        StringBuilder q = l90.q("Index:", i, ", Size:");
        q.append(this.size);
        return q.toString();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l) {
        addLong(l.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i = longArrayList.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.array;
            if (i3 > jArr.length) {
                this.array = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
            this.size = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public void ensureCapacity(int i) {
        long[] jArr = this.array;
        if (i <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.array = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i) {
            length = growSize(length);
        }
        this.array = Arrays.copyOf(this.array, length);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Internal.hashLong(this.array[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i) {
        long[] copyOf;
        if (i >= this.size) {
            if (i == 0) {
                copyOf = EMPTY_ARRAY;
            } else {
                copyOf = Arrays.copyOf(this.array, i);
            }
            return new LongArrayList(copyOf, this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j = jArr[i];
        if (i < this.size - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 >= i) {
            long[] jArr = this.array;
            System.arraycopy(jArr, i2, jArr, i, this.size - i2);
            this.size -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        se.u("toIndex < fromIndex");
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int i, long j) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i, Long l) {
        addLong(i, l.longValue());
    }

    private LongArrayList(long[] jArr, int i, boolean z) {
        super(z);
        this.array = jArr;
        this.size = i;
    }

    public LongArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long j) {
        ensureIsMutable();
        int i = this.size;
        long[] jArr = this.array;
        if (i == jArr.length) {
            long[] jArr2 = new long[growSize(jArr.length)];
            System.arraycopy(this.array, 0, jArr2, 0, this.size);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
    }
}
