package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fq1 extends gq1 implements Iterator {
    public eq1 e;
    public boolean f = true;
    public final /* synthetic */ b90 g;

    public fq1(b90 b90Var) {
        this.g = b90Var;
    }

    @Override // defpackage.gq1
    public final void a(eq1 eq1Var) {
        boolean z;
        eq1 eq1Var2 = this.e;
        if (eq1Var == eq1Var2) {
            eq1 eq1Var3 = eq1Var2.h;
            this.e = eq1Var3;
            if (eq1Var3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.f = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f) {
            if (this.g.e == null) {
                return false;
            }
            return true;
        }
        eq1 eq1Var = this.e;
        if (eq1Var == null || eq1Var.g == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        eq1 eq1Var;
        if (this.f) {
            this.f = false;
            this.e = this.g.e;
        } else {
            eq1 eq1Var2 = this.e;
            if (eq1Var2 != null) {
                eq1Var = eq1Var2.g;
            } else {
                eq1Var = null;
            }
            this.e = eq1Var;
        }
        return this.e;
    }
}
