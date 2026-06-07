package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dp implements h50 {
    public final rc a;
    public final int b;

    public dp(String str, int i) {
        this(new rc(str), i);
    }

    @Override // defpackage.h50
    public final void a(i50 i50Var) {
        int length;
        int i = i50Var.d;
        rc rcVar = this.a;
        int i2 = -1;
        if (i != -1) {
            i50Var.d(i, i50Var.e, rcVar.f);
        } else {
            i50Var.d(i50Var.b, i50Var.c, rcVar.f);
        }
        int i3 = i50Var.b;
        int i4 = i50Var.c;
        if (i3 == i4) {
            i2 = i4;
        }
        int i5 = this.b;
        if (i5 > 0) {
            length = (i2 + i5) - 1;
        } else {
            length = (i2 + i5) - rcVar.f.length();
        }
        int p = go.p(length, 0, i50Var.a.b());
        i50Var.f(p, p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp)) {
            return false;
        }
        dp dpVar = (dp) obj;
        if (sn0.r(this.a.f, dpVar.a.f) && this.b == dpVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.f.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.a.f);
        sb.append("', newCursorPosition=");
        return l90.o(sb, this.b, ')');
    }

    public dp(rc rcVar, int i) {
        this.a = rcVar;
        this.b = i;
    }
}
