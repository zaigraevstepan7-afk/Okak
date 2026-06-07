package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hs1 extends rz implements es, w81 {
    public boolean A;
    public j7 B;
    public ts1 C;
    public qz D;
    public k7 E;
    public j7 F;
    public boolean G;
    public us1 u;
    public sb1 v;
    public boolean w;
    public z90 x;
    public r31 y;
    public xj z;

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.d21
    public final void D0() {
        j7 j7Var;
        this.G = P0();
        O0();
        if (this.C == null) {
            us1 us1Var = this.u;
            if (this.A) {
                j7Var = this.F;
            } else {
                j7Var = this.B;
            }
            j7 j7Var2 = j7Var;
            z90 z90Var = this.x;
            sb1 sb1Var = this.v;
            boolean z = this.w;
            boolean z2 = this.G;
            ts1 ts1Var = new ts1(j7Var2, this.z, z90Var, this.y, sb1Var, us1Var, z, z2);
            L0(ts1Var);
            this.C = ts1Var;
        }
    }

    @Override // defpackage.d21
    public final void E0() {
        qz qzVar = this.D;
        if (qzVar != null) {
            M0(qzVar);
        }
    }

    @Override // defpackage.qz
    public final void L() {
        j7 j7Var;
        boolean P0 = P0();
        if (this.G != P0) {
            this.G = P0;
            us1 us1Var = this.u;
            sb1 sb1Var = this.v;
            boolean z = this.A;
            if (z) {
                j7Var = this.F;
            } else {
                j7Var = this.B;
            }
            j7 j7Var2 = j7Var;
            boolean z2 = this.w;
            Q0(j7Var2, this.z, this.x, this.y, sb1Var, us1Var, z, z2);
        }
    }

    public final void O0() {
        j7 j7Var;
        qz qzVar = this.D;
        if (qzVar == null) {
            if (this.A) {
                io.F(this, new vm1(this, 6));
            }
            if (this.A) {
                j7Var = this.F;
            } else {
                j7Var = this.B;
            }
            if (j7Var != null) {
                rz rzVar = j7Var.i;
                if (!rzVar.e.r) {
                    L0(rzVar);
                    this.D = rzVar;
                    return;
                }
                return;
            }
            return;
        }
        if (!((d21) qzVar).e.r) {
            L0(qzVar);
        }
    }

    public final boolean P0() {
        jq0 jq0Var;
        if (this.r) {
            jq0Var = hp.M(this).D;
        } else {
            jq0Var = jq0.e;
        }
        sb1 sb1Var = this.v;
        if (jq0Var == jq0.f && sb1Var != sb1.e) {
            return false;
        }
        return true;
    }

    public final void Q0(j7 j7Var, xj xjVar, z90 z90Var, r31 r31Var, sb1 sb1Var, us1 us1Var, boolean z, boolean z2) {
        boolean z3;
        j7 j7Var2;
        this.u = us1Var;
        this.v = sb1Var;
        boolean z4 = true;
        if (this.A != z) {
            this.A = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (!sn0.r(this.B, j7Var)) {
            this.B = j7Var;
        } else {
            z4 = false;
        }
        if (z3 || (z4 && !z)) {
            qz qzVar = this.D;
            if (qzVar != null) {
                M0(qzVar);
            }
            this.D = null;
            O0();
        }
        this.w = z2;
        this.x = z90Var;
        this.y = r31Var;
        this.z = xjVar;
        boolean P0 = P0();
        this.G = P0;
        ts1 ts1Var = this.C;
        if (ts1Var != null) {
            if (this.A) {
                j7Var2 = this.F;
            } else {
                j7Var2 = this.B;
            }
            ts1Var.g1(j7Var2, xjVar, z90Var, r31Var, sb1Var, us1Var, z2, P0);
        }
    }

    @Override // defpackage.w81
    public final void e0() {
        j7 j7Var;
        k7 k7Var = (k7) hp.s(this, hc1.a);
        if (!sn0.r(k7Var, this.E)) {
            this.E = k7Var;
            this.F = null;
            qz qzVar = this.D;
            if (qzVar != null) {
                M0(qzVar);
            }
            this.D = null;
            O0();
            ts1 ts1Var = this.C;
            if (ts1Var != null) {
                us1 us1Var = this.u;
                sb1 sb1Var = this.v;
                if (this.A) {
                    j7Var = this.F;
                } else {
                    j7Var = this.B;
                }
                j7 j7Var2 = j7Var;
                boolean z = this.w;
                boolean z2 = this.G;
                ts1Var.g1(j7Var2, this.z, this.x, this.y, sb1Var, us1Var, z, z2);
            }
        }
    }
}
