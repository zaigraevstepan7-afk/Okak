package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ir0 implements c42 {
    public jq0 e = jq0.f;
    public float f;
    public float g;
    public final /* synthetic */ nr0 h;

    public ir0(nr0 nr0Var) {
        this.h = nr0Var;
    }

    @Override // defpackage.c00
    public final float P() {
        return this.g;
    }

    @Override // defpackage.mn0
    public final boolean S() {
        wq0 wq0Var = this.h.e.K.d;
        if (wq0Var != wq0.h && wq0Var != wq0.f) {
            return false;
        }
        return true;
    }

    @Override // defpackage.c00
    public final float a() {
        return this.f;
    }

    @Override // defpackage.mn0
    public final jq0 getLayoutDirection() {
        return this.e;
    }

    @Override // defpackage.l01
    public final k01 i0(int i, int i2, Map map, oe0 oe0Var, oe0 oe0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            kl0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new hr0(i, i2, map, oe0Var, this, this.h, oe0Var2);
    }

    @Override // defpackage.c42
    public final List t(se0 se0Var, Object obj) {
        nr0 nr0Var = this.h;
        nr0Var.g();
        ar0 ar0Var = nr0Var.e;
        wq0 wq0Var = ar0Var.K.d;
        wq0 wq0Var2 = wq0.g;
        wq0 wq0Var3 = wq0.e;
        if (wq0Var != wq0Var3 && wq0Var != wq0Var2 && wq0Var != wq0.f && wq0Var != wq0.h) {
            kl0.b("subcompose can only be used inside the measure or layout blocks");
        }
        i41 i41Var = nr0Var.k;
        Object g = i41Var.g(obj);
        if (g == null) {
            g = (ar0) nr0Var.n.k(obj);
            if (g != null) {
                if (nr0Var.s <= 0) {
                    kl0.b("Check failed.");
                }
                nr0Var.s--;
            } else {
                g = nr0Var.l(obj);
                if (g == null) {
                    int i = nr0Var.h;
                    ar0 ar0Var2 = new ar0(2);
                    ar0Var.u = true;
                    ar0Var.B(i, ar0Var2);
                    ar0Var.u = false;
                    g = ar0Var2;
                }
            }
            i41Var.m(obj, g);
        }
        ar0 ar0Var3 = (ar0) g;
        if (wn.i0(nr0Var.h, ar0Var.o()) != ar0Var3) {
            int i2 = ((q41) ((z31) ar0Var.o()).f).i(ar0Var3);
            if (i2 < nr0Var.h) {
                kl0.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = nr0Var.h;
            if (i3 != i2) {
                nr0Var.i(i2, i3);
            }
        }
        nr0Var.h++;
        nr0Var.k(ar0Var3, obj, false, se0Var);
        if (wq0Var != wq0Var3 && wq0Var != wq0Var2) {
            return ar0Var3.l();
        }
        return ar0Var3.m();
    }
}
