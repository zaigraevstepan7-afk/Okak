package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class y implements Iterator, xo0 {
    public final /* synthetic */ int e;
    public int f;
    public final Object g;

    public y(Object[] objArr) {
        this.e = 1;
        objArr.getClass();
        this.g = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                if (this.f >= ((b0) obj).a()) {
                    return false;
                }
                return true;
            case 1:
                if (this.f >= ((Object[]) obj).length) {
                    return false;
                }
                return true;
            case 2:
                if (this.f >= ((o12) obj).e()) {
                    return false;
                }
                return true;
            case 3:
                if (this.f >= ((byte[]) obj).length) {
                    return false;
                }
                return true;
            case 4:
                if (this.f >= ((int[]) obj).length) {
                    return false;
                }
                return true;
            case 5:
                if (this.f >= ((long[]) obj).length) {
                    return false;
                }
                return true;
            default:
                if (this.f >= ((short[]) obj).length) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                if (hasNext()) {
                    int i2 = this.f;
                    this.f = i2 + 1;
                    return ((b0) obj).get(i2);
                }
                y61.c();
                return null;
            case 1:
                try {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f--;
                    y61.j(e.getMessage());
                    return null;
                }
            case 2:
                int i4 = this.f;
                this.f = i4 + 1;
                return ((o12) obj).f(i4);
            case 3:
                int i5 = this.f;
                byte[] bArr = (byte[]) obj;
                if (i5 < bArr.length) {
                    this.f = i5 + 1;
                    return new vc2(bArr[i5]);
                }
                y61.j(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.f;
                int[] iArr = (int[]) obj;
                if (i6 < iArr.length) {
                    this.f = i6 + 1;
                    return new yc2(iArr[i6]);
                }
                y61.j(String.valueOf(i6));
                return null;
            case 5:
                int i7 = this.f;
                long[] jArr = (long[]) obj;
                if (i7 < jArr.length) {
                    this.f = i7 + 1;
                    return new bd2(jArr[i7]);
                }
                y61.j(String.valueOf(i7));
                return null;
            default:
                int i8 = this.f;
                short[] sArr = (short[]) obj;
                if (i8 < sArr.length) {
                    this.f = i8 + 1;
                    return new ed2(sArr[i8]);
                }
                y61.j(String.valueOf(i8));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ y(Object obj, int i) {
        this.e = i;
        this.g = obj;
    }

    public y(byte[] bArr) {
        this.e = 3;
        bArr.getClass();
        this.g = bArr;
    }

    public y(int[] iArr) {
        this.e = 4;
        iArr.getClass();
        this.g = iArr;
    }

    public y(long[] jArr) {
        this.e = 5;
        jArr.getClass();
        this.g = jArr;
    }

    public y(short[] sArr) {
        this.e = 6;
        sArr.getClass();
        this.g = sArr;
    }
}
