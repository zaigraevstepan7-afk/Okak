package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luf0;", "Li21;", "Lwx1;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class uf0 extends i21 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final kw1 g;
    public final boolean h;
    public final long i;
    public final long j;

    public uf0(float f, float f2, float f3, float f4, float f5, long j, kw1 kw1Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = j;
        this.g = kw1Var;
        this.h = z;
        this.i = j2;
        this.j = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uf0) {
                uf0 uf0Var = (uf0) obj;
                if (Float.compare(this.a, uf0Var.a) != 0 || Float.compare(this.b, uf0Var.b) != 0 || Float.compare(this.c, uf0Var.c) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.d, uf0Var.d) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.e, uf0Var.e) != 0 || Float.compare(8.0f, 8.0f) != 0 || !cb2.a(this.f, uf0Var.f) || !sn0.r(this.g, uf0Var.g) || this.h != uf0Var.h || !co.c(this.i, uf0Var.i) || !co.c(this.j, uf0Var.j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wx1, d21, java.lang.Object] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        d21Var.u = this.c;
        d21Var.v = this.d;
        d21Var.w = this.e;
        d21Var.x = 8.0f;
        d21Var.y = this.f;
        d21Var.z = this.g;
        d21Var.A = this.h;
        d21Var.B = this.i;
        d21Var.C = this.j;
        d21Var.D = 3;
        d21Var.E = new n3(d21Var, 26);
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        e81 e81Var;
        wx1 wx1Var = (wx1) d21Var;
        wx1Var.s = this.a;
        wx1Var.t = this.b;
        wx1Var.u = this.c;
        wx1Var.v = this.d;
        wx1Var.w = this.e;
        wx1Var.x = 8.0f;
        wx1Var.y = this.f;
        wx1Var.z = this.g;
        wx1Var.A = this.h;
        wx1Var.B = this.i;
        wx1Var.C = this.j;
        wx1Var.D = 3;
        n3 n3Var = wx1Var.E;
        if (wx1Var.e.r && (e81Var = hp.K(wx1Var, 2).t) != null) {
            e81Var.t1(true, n3Var);
        }
    }

    public final int hashCode() {
        int a = l90.a(8.0f, l90.a(this.e, l90.a(0.0f, l90.a(0.0f, l90.a(this.d, l90.a(0.0f, l90.a(0.0f, l90.a(this.c, l90.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = cb2.c;
        int a2 = mb2.a((this.g.hashCode() + l90.e(this.f, a, 31)) * 31, 961, this.h);
        int i2 = co.h;
        return l90.b(3, l90.b(0, l90.e(this.j, l90.e(this.i, a2, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.b);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.e);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) cb2.b(this.f));
        sb.append(", shape=");
        sb.append(this.g);
        sb.append(", clip=");
        sb.append(this.h);
        sb.append(", renderEffect=null, ambientShadowColor=");
        l90.u(this.i, sb, ", spotShadowColor=");
        sb.append((Object) co.i(this.j));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) c01.U(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
