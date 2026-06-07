package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class de2 implements Comparable, Serializable {
    public static final ce2 g = new Object();
    public static final de2 h = new de2(0, 0);
    public final long e;
    public final long f;

    public de2(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        de2 de2Var = (de2) obj;
        de2Var.getClass();
        long j = de2Var.e;
        long j2 = this.e;
        if (j2 != j) {
            return Long.compareUnsigned(j2, j);
        }
        return Long.compareUnsigned(this.f, de2Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de2)) {
            return false;
        }
        de2 de2Var = (de2) obj;
        if (this.e == de2Var.e && this.f == de2Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e ^ this.f);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        rp1.j(this.e, bArr, 0, 0, 4);
        bArr[8] = 45;
        rp1.j(this.e, bArr, 9, 4, 6);
        bArr[13] = 45;
        rp1.j(this.e, bArr, 14, 6, 8);
        bArr[18] = 45;
        rp1.j(this.f, bArr, 19, 0, 2);
        bArr[23] = 45;
        rp1.j(this.f, bArr, 24, 2, 8);
        return new String(bArr, sm.a);
    }
}
