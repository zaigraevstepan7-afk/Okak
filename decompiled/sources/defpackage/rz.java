package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class rz extends d21 {
    public final int s = f81.e(this);
    public d21 t;

    @Override // defpackage.d21
    public final void B0() {
        super.B0();
        for (d21 d21Var = this.t; d21Var != null; d21Var = d21Var.j) {
            d21Var.K0(this.l);
            if (!d21Var.r) {
                d21Var.B0();
            }
        }
    }

    @Override // defpackage.d21
    public final void C0() {
        for (d21 d21Var = this.t; d21Var != null; d21Var = d21Var.j) {
            d21Var.C0();
        }
        super.C0();
    }

    @Override // defpackage.d21
    public final void G0() {
        super.G0();
        for (d21 d21Var = this.t; d21Var != null; d21Var = d21Var.j) {
            d21Var.G0();
        }
    }

    @Override // defpackage.d21
    public final void H0() {
        for (d21 d21Var = this.t; d21Var != null; d21Var = d21Var.j) {
            d21Var.H0();
        }
        super.H0();
    }

    @Override // defpackage.d21
    public final void I0() {
        super.I0();
        for (d21 d21Var = this.t; d21Var != null; d21Var = d21Var.j) {
            d21Var.I0();
        }
    }

    @Override // defpackage.d21
    public final void J0(d21 d21Var) {
        this.e = d21Var;
        for (d21 d21Var2 = this.t; d21Var2 != null; d21Var2 = d21Var2.j) {
            d21Var2.J0(d21Var);
        }
    }

    @Override // defpackage.d21
    public final void K0(e81 e81Var) {
        this.l = e81Var;
        for (d21 d21Var = this.t; d21Var != null; d21Var = d21Var.j) {
            d21Var.K0(e81Var);
        }
    }

    public final qz L0(qz qzVar) {
        d21 d21Var;
        d21 d21Var2;
        d21 d21Var3 = ((d21) qzVar).e;
        if (d21Var3 != qzVar) {
            if (qzVar instanceof d21) {
                d21Var = (d21) qzVar;
            } else {
                d21Var = null;
            }
            if (d21Var != null) {
                d21Var2 = d21Var.i;
            } else {
                d21Var2 = null;
            }
            if (d21Var3 != this.e || !sn0.r(d21Var2, this)) {
                se.p("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (d21Var3.r) {
                kl0.b("Cannot delegate to an already attached node");
            }
            d21Var3.J0(this.e);
            int i = this.g;
            int f = f81.f(d21Var3);
            d21Var3.g = f;
            int i2 = this.g;
            int i3 = f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof rq0)) {
                kl0.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + d21Var3);
            }
            d21Var3.j = this.t;
            this.t = d21Var3;
            d21Var3.i = this;
            N0(f | this.g, false);
            if (this.r) {
                if (i3 != 0 && (i & 2) == 0) {
                    a81 a81Var = hp.M(this).J;
                    this.e.K0(null);
                    a81Var.g();
                } else {
                    K0(this.l);
                }
                d21Var3.B0();
                d21Var3.H0();
                if (!d21Var3.r) {
                    kl0.b("autoInvalidateInsertedNode called on unattached node");
                }
                f81.a(d21Var3, -1, 1);
            }
        }
        return qzVar;
    }

    public final void M0(qz qzVar) {
        d21 d21Var = null;
        for (d21 d21Var2 = this.t; d21Var2 != null; d21Var2 = d21Var2.j) {
            if (d21Var2 == qzVar) {
                boolean z = d21Var2.r;
                if (z) {
                    x31 x31Var = f81.a;
                    if (!z) {
                        kl0.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    f81.a(d21Var2, -1, 2);
                    d21Var2.I0();
                    d21Var2.C0();
                }
                d21Var2.J0(d21Var2);
                d21Var2.h = 0;
                d21 d21Var3 = d21Var2.j;
                if (d21Var == null) {
                    this.t = d21Var3;
                } else {
                    d21Var.j = d21Var3;
                }
                d21Var2.j = null;
                d21Var2.i = null;
                int i = this.g;
                int f = f81.f(this);
                N0(f, true);
                if (this.r && (i & 2) != 0 && (f & 2) == 0) {
                    a81 a81Var = hp.M(this).J;
                    this.e.K0(null);
                    a81Var.g();
                    return;
                }
                return;
            }
            d21Var = d21Var2;
        }
        se.t(qzVar, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void N0(int i, boolean z) {
        int i2;
        d21 d21Var;
        int i3 = this.g;
        this.g = i;
        if (i3 != i) {
            d21 d21Var2 = this.e;
            if (d21Var2 == this) {
                this.h = i;
            }
            boolean z2 = this.r;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.g;
                    r2.g = i;
                    if (r2 == d21Var2) {
                        break;
                    } else {
                        r2 = r2.i;
                    }
                }
                if (z && r2 == d21Var2) {
                    i = f81.f(d21Var2);
                    d21Var2.g = i;
                }
                if (r2 != 0 && (d21Var = r2.j) != null) {
                    i2 = d21Var.h;
                } else {
                    i2 = 0;
                }
                int i4 = i | i2;
                for (d21 d21Var3 = r2; d21Var3 != null; d21Var3 = d21Var3.i) {
                    i4 |= d21Var3.g;
                    d21Var3.h = i4;
                }
            }
        }
    }
}
