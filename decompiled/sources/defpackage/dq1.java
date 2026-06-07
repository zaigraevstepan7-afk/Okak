package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dq1 extends gq1 implements Iterator {
    public eq1 e;
    public eq1 f;
    public final /* synthetic */ int g;

    public dq1(eq1 eq1Var, eq1 eq1Var2, int i) {
        this.g = i;
        this.e = eq1Var2;
        this.f = eq1Var;
    }

    @Override // defpackage.gq1
    public final void a(eq1 eq1Var) {
        eq1 eq1Var2;
        eq1 eq1Var3 = null;
        if (this.e == eq1Var && eq1Var == this.f) {
            this.f = null;
            this.e = null;
        }
        eq1 eq1Var4 = this.e;
        if (eq1Var4 == eq1Var) {
            switch (this.g) {
                case 0:
                    eq1Var2 = eq1Var4.h;
                    break;
                default:
                    eq1Var2 = eq1Var4.g;
                    break;
            }
            this.e = eq1Var2;
        }
        eq1 eq1Var5 = this.f;
        if (eq1Var5 == eq1Var) {
            eq1 eq1Var6 = this.e;
            if (eq1Var5 != eq1Var6 && eq1Var6 != null) {
                eq1Var3 = b(eq1Var5);
            }
            this.f = eq1Var3;
        }
    }

    public final eq1 b(eq1 eq1Var) {
        switch (this.g) {
            case 0:
                return eq1Var.g;
            default:
                return eq1Var.h;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        eq1 eq1Var;
        eq1 eq1Var2 = this.f;
        eq1 eq1Var3 = this.e;
        if (eq1Var2 != eq1Var3 && eq1Var3 != null) {
            eq1Var = b(eq1Var2);
        } else {
            eq1Var = null;
        }
        this.f = eq1Var;
        return eq1Var2;
    }
}
