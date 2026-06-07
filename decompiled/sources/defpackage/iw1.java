package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Liw1;", "Li21;", "Lpi;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class iw1 extends i21 {
    public final kw1 a;

    /* renamed from: b, reason: from toString */
    public final boolean clip;
    public final long c;

    /* renamed from: d, reason: from toString */
    public final long ambientColor;

    public iw1(kw1 kw1Var, boolean z, long j, long j2) {
        this.a = kw1Var;
        this.clip = z;
        this.c = j;
        this.ambientColor = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iw1) {
                iw1 iw1Var = (iw1) obj;
                if (!f20.b(3.0f, 3.0f) || !sn0.r(this.a, iw1Var.a) || this.clip != iw1Var.clip || !co.c(this.c, iw1Var.c) || !co.c(this.ambientColor, iw1Var.ambientColor)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new pi(new n3(this, 25));
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        e81 e81Var;
        pi piVar = (pi) d21Var;
        n3 n3Var = new n3(this, 25);
        piVar.s = n3Var;
        if (piVar.e.r && (e81Var = hp.K(piVar, 2).t) != null) {
            e81Var.t1(true, n3Var);
        }
    }

    public final int hashCode() {
        int a = mb2.a((this.a.hashCode() + (Float.hashCode(3.0f) * 31)) * 31, 31, this.clip);
        int i = co.h;
        return Long.hashCode(this.ambientColor) + l90.e(this.c, a, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) f20.c(3.0f));
        sb.append(", shape=");
        sb.append(this.a);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", ambientColor=");
        l90.u(this.c, sb, ", spotColor=");
        sb.append((Object) co.i(this.ambientColor));
        sb.append(')');
        return sb.toString();
    }
}
