package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ih extends rz {
    public float A;
    public i22 C;
    public ya D;
    public i22 E;
    public long u;
    public long v;
    public q32 w;
    public q32 x;
    public float y;
    public float z;
    public final fe1 B = new fe1(0.0f);
    public final nv0 F = new nv0();

    public ih(long j, long j2, q32 q32Var, q32 q32Var2, float f, float f2, float f3) {
        this.u = j;
        this.v = j2;
        this.w = q32Var;
        this.x = q32Var2;
        this.y = f;
        this.z = f2;
        this.A = f3;
    }

    @Override // defpackage.d21
    public final void D0() {
        R0();
    }

    @Override // defpackage.d21
    public final void E0() {
        this.D = null;
    }

    public abstract void O0();

    public abstract void P0();

    public final void Q0(float f) {
        ya yaVar = this.D;
        if (yaVar == null) {
            yaVar = fc2.a(f);
            this.D = yaVar;
        }
        if (this.r && ((Number) yaVar.e.getValue()).floatValue() != f) {
            i22 i22Var = this.E;
            if (i22Var == null || i22Var.P()) {
                this.E = rx.C(z0(), null, new gh(yaVar, f, null), 3);
            }
        }
    }

    public final void R0() {
        i22 i22Var = this.C;
        vt vtVar = null;
        if (i22Var != null) {
            i22Var.c(null);
        }
        this.C = null;
        if (!this.r) {
            return;
        }
        if (f20.a(this.A, 0.0f) > 0 && f20.a(this.z, 0.0f) > 0) {
            int round = Math.round((this.z / this.A) * 1000.0f);
            if (round < 50) {
                round = 50;
            }
            this.C = rx.C(z0(), null, new hh(this, round, vtVar, 0), 3);
            return;
        }
        this.B.h(0.0f);
    }
}
