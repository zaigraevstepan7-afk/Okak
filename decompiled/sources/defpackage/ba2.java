package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ba2 extends d21 implements rq0 {
    public r31 s;
    public boolean t;
    public u90 u;
    public boolean v;
    public ya w;
    public ya x;
    public float y;
    public float z;

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.d21
    public final void D0() {
        rx.C(z0(), null, new vf(this, (vt) null, 16), 3);
    }

    @Override // defpackage.d21
    public final void F0() {
        this.w = null;
        this.x = null;
        this.z = Float.NaN;
        this.y = Float.NaN;
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        Float f3;
        Float f4;
        float f5 = mp0.q0;
        int i = 0;
        int i2 = 1;
        if (e01Var.c(us.h(j)) != 0 && e01Var.s(us.g(j)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.v) {
            f = mp0.j0;
        } else if (!z && !this.t) {
            f = a52.b;
        } else {
            f = a52.a;
        }
        float W = l01Var.W(f);
        ya yaVar = this.x;
        if (yaVar != null) {
            f2 = ((Number) yaVar.d()).floatValue();
        } else {
            f2 = W;
        }
        int i3 = (int) f2;
        if (i3 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(z2 & z3)) {
            ml0.a("width and height must be >= 0");
        }
        ig1 x = e01Var.x(vs.h(i3, i3, i3, i3));
        float W2 = l01Var.W((a52.d - l01Var.M(W)) / 2.0f);
        float W3 = l01Var.W((a52.c - a52.a) - a52.e);
        boolean z4 = this.v;
        if (z4 && this.t) {
            W2 = W3 - l01Var.W(f5);
        } else if (z4 && !this.t) {
            W2 = l01Var.W(f5);
        } else if (this.t) {
            W2 = W3;
        }
        ya yaVar2 = this.x;
        vt vtVar = null;
        if (yaVar2 != null) {
            f3 = (Float) yaVar2.e.getValue();
        } else {
            f3 = null;
        }
        if (f3 == null || f3.floatValue() != W) {
            rx.C(z0(), null, new aa2(this, W, vtVar, i), 3);
        }
        ya yaVar3 = this.w;
        if (yaVar3 != null) {
            f4 = (Float) yaVar3.e.getValue();
        } else {
            f4 = null;
        }
        if (f4 == null || f4.floatValue() != W2) {
            rx.C(z0(), null, new aa2(this, W2, vtVar, i2), 3);
        }
        if (Float.isNaN(this.z) && Float.isNaN(this.y)) {
            this.z = W;
            this.y = W2;
        }
        return l01Var.s0(i3, i3, m60.e, new w6(x, this, W2));
    }
}
