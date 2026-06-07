package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wx1 extends d21 implements rq0, pu1 {
    public boolean A;
    public long B;
    public long C;
    public int D;
    public n3 E;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public kw1 z;

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        ig1 x = e01Var.x(j);
        return l01Var.s0(x.e, x.f, m60.e, new i6(9, x, this));
    }

    @Override // defpackage.pu1
    public final boolean i() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.s);
        sb.append(", scaleY=");
        sb.append(this.t);
        sb.append(", alpha = ");
        sb.append(this.u);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.v);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.w);
        sb.append(", cameraDistance=");
        sb.append(this.x);
        sb.append(", transformOrigin=");
        sb.append((Object) cb2.b(this.y));
        sb.append(", shape=");
        sb.append(this.z);
        sb.append(", clip=");
        sb.append(this.A);
        sb.append(", renderEffect=null, ambientShadowColor=");
        l90.u(this.B, sb, ", spotShadowColor=");
        l90.u(this.C, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) c01.U(this.D));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        if (!this.A) {
            return;
        }
        xu1.f(av1Var, this.z);
    }
}
