package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tp0 {
    public final f12 a;
    public up0 b;
    public jc0 c;

    public tp0(f12 f12Var) {
        this.a = f12Var;
    }

    public final up0 a() {
        up0 up0Var = this.b;
        if (up0Var != null) {
            return up0Var;
        }
        sn0.V("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        oe0 oe0Var;
        f12 f12Var;
        if (i == 7) {
            oe0Var = a().a;
        } else {
            if (i == 2) {
                a();
            } else if (i == 6) {
                a();
            } else if (i == 5) {
                a();
            } else if (i == 3) {
                a();
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                se.p("invalid ImeAction");
                return false;
            }
            oe0Var = null;
        }
        if (oe0Var != null) {
            oe0Var.invoke(this);
            return true;
        }
        if (i == 6) {
            jc0 jc0Var = this.c;
            if (jc0Var != null) {
                ((mc0) jc0Var).g(1, true);
                return true;
            }
            sn0.V("focusManager");
            throw null;
        }
        if (i == 5) {
            jc0 jc0Var2 = this.c;
            if (jc0Var2 != null) {
                ((mc0) jc0Var2).g(2, true);
                return true;
            }
            sn0.V("focusManager");
            throw null;
        }
        if (i != 7 || (f12Var = this.a) == null) {
            return false;
        }
        ((sz) f12Var).a();
        return true;
    }
}
