package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rv1 implements h50 {
    public final rc a;
    public final int b;

    public rv1(String str, int i) {
        this.a = new rc(str);
        this.b = i;
    }

    @Override // defpackage.h50
    public final void a(i50 i50Var) {
        int length;
        int i = i50Var.d;
        rc rcVar = this.a;
        int i2 = -1;
        if (i != -1) {
            int i3 = i50Var.e;
            String str = rcVar.f;
            String str2 = rcVar.f;
            i50Var.d(i, i3, str);
            if (str2.length() > 0) {
                i50Var.e(i, str2.length() + i);
            }
        } else {
            int i4 = i50Var.b;
            int i5 = i50Var.c;
            String str3 = rcVar.f;
            String str4 = rcVar.f;
            i50Var.d(i4, i5, str3);
            if (str4.length() > 0) {
                i50Var.e(i4, str4.length() + i4);
            }
        }
        int i6 = i50Var.b;
        int i7 = i50Var.c;
        if (i6 == i7) {
            i2 = i7;
        }
        int i8 = this.b;
        if (i8 > 0) {
            length = (i2 + i8) - 1;
        } else {
            length = (i2 + i8) - rcVar.f.length();
        }
        int p = go.p(length, 0, i50Var.a.b());
        i50Var.f(p, p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv1)) {
            return false;
        }
        rv1 rv1Var = (rv1) obj;
        if (sn0.r(this.a.f, rv1Var.a.f) && this.b == rv1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.f.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.f);
        sb.append("', newCursorPosition=");
        return l90.o(sb, this.b, ')');
    }
}
