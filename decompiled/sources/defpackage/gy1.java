package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgy1;", "Li21;", "Liy1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class gy1 extends i21 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public /* synthetic */ gy1(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gy1) {
                gy1 gy1Var = (gy1) obj;
                if (!f20.b(this.a, gy1Var.a) || !f20.b(this.b, gy1Var.b) || !f20.b(this.c, gy1Var.c) || !f20.b(this.d, gy1Var.d) || this.e != gy1Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [iy1, d21] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        d21Var.u = this.c;
        d21Var.v = this.d;
        d21Var.w = this.e;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        iy1 iy1Var = (iy1) d21Var;
        iy1Var.s = this.a;
        iy1Var.t = this.b;
        iy1Var.u = this.c;
        iy1Var.v = this.d;
        iy1Var.w = this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + l90.a(this.d, l90.a(this.c, l90.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public gy1(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }
}
