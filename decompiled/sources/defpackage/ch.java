package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ch extends d21 implements b40, w81, pu1 {
    public lo A;
    public long s;
    public ck t;
    public float u;
    public kw1 v;
    public long w;
    public jq0 x;
    public lo y;
    public kw1 z;

    @Override // defpackage.w81
    public final void e0() {
        this.w = 9205357640488583168L;
        this.x = null;
        this.y = null;
        this.z = null;
        fp.I(this);
    }

    @Override // defpackage.b40
    public final void f0(cr0 cr0Var) {
        lo loVar;
        ck ckVar;
        float f;
        n8 n8Var;
        cr0 cr0Var2;
        vl vlVar = cr0Var.e;
        if (this.v == d6.w) {
            if (!co.c(this.s, co.g)) {
                c40.X(cr0Var, this.s, 0L, 0L, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
            }
            ck ckVar2 = this.t;
            if (ckVar2 != null) {
                c40.z(cr0Var, ckVar2, 0L, 0L, this.u, null, 118);
            }
        } else {
            if (fy1.a(vlVar.d(), this.w) && cr0Var.getLayoutDirection() == this.x && sn0.r(this.z, this.v)) {
                loVar = this.y;
                loVar.getClass();
            } else {
                io.F(this, new j1(6, this, cr0Var));
                loVar = this.A;
                this.A = null;
            }
            this.y = loVar;
            this.w = vlVar.d();
            this.x = cr0Var.getLayoutDirection();
            this.z = this.v;
            loVar.getClass();
            if (!co.c(this.s, co.g)) {
                qo.A(cr0Var, loVar, this.s);
            }
            ck ckVar3 = this.t;
            if (ckVar3 != null) {
                float f2 = this.u;
                boolean z = loVar instanceof vb1;
                o90 o90Var = o90.a;
                if (z) {
                    pl1 pl1Var = ((vb1) loVar).e;
                    float f3 = pl1Var.a;
                    float f4 = pl1Var.b;
                    cr0Var.e(ckVar3, (4294967295L & Float.floatToRawIntBits(f4)) | (Float.floatToRawIntBits(f3) << 32), qo.b0(pl1Var), f2, o90Var);
                } else {
                    if (loVar instanceof wb1) {
                        wb1 wb1Var = (wb1) loVar;
                        ckVar = ckVar3;
                        n8Var = wb1Var.f;
                        if (n8Var != null) {
                            cr0Var2 = cr0Var;
                            f = f2;
                        } else {
                            ip1 ip1Var = wb1Var.e;
                            float f5 = ip1Var.b;
                            float f6 = ip1Var.a;
                            float intBitsToFloat = Float.intBitsToFloat((int) (ip1Var.h >> 32));
                            float f7 = ip1Var.c - f6;
                            float f8 = ip1Var.d - f5;
                            cr0Var.h(ckVar, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), f2, o90Var);
                        }
                    } else if (loVar instanceof ub1) {
                        n8 n8Var2 = ((ub1) loVar).e;
                        ckVar = ckVar3;
                        f = f2;
                        n8Var = n8Var2;
                        cr0Var2 = cr0Var;
                    } else {
                        se.m();
                        return;
                    }
                    cr0Var2.f(n8Var, ckVar, f, o90Var, 3);
                }
            }
        }
        cr0Var.b();
    }

    @Override // defpackage.pu1
    public final boolean i() {
        return false;
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        xu1.f(av1Var, this.v);
    }
}
