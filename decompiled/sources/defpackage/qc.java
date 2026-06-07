package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qc {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public qc(String str, int i, int i2, Object obj) {
        boolean z;
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ll0.a("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc)) {
            return false;
        }
        qc qcVar = (qc) obj;
        if (sn0.r(this.a, qcVar.a) && this.b == qcVar.b && this.c == qcVar.c && sn0.r(this.d, qcVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.d.hashCode() + l90.b(this.c, l90.b(this.b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }

    public qc(Object obj, int i, int i2) {
        this("", i, i2, obj);
    }
}
