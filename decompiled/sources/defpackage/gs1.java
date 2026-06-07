package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lgs1;", "Li21;", "Lhs1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class gs1 extends i21 {
    public final us1 a;
    public final sb1 b;
    public final boolean c;
    public final z90 d;
    public final r31 e;
    public final xj f;
    public final boolean g;
    public final j7 h;

    public gs1(j7 j7Var, xj xjVar, z90 z90Var, r31 r31Var, sb1 sb1Var, us1 us1Var, boolean z, boolean z2) {
        this.a = us1Var;
        this.b = sb1Var;
        this.c = z;
        this.d = z90Var;
        this.e = r31Var;
        this.f = xjVar;
        this.g = z2;
        this.h = j7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && gs1.class == obj.getClass()) {
                gs1 gs1Var = (gs1) obj;
                if (sn0.r(this.a, gs1Var.a) && this.b == gs1Var.b && this.c == gs1Var.c && sn0.r(this.d, gs1Var.d) && sn0.r(this.e, gs1Var.e) && sn0.r(this.f, gs1Var.f) && this.g == gs1Var.g && sn0.r(this.h, gs1Var.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, hs1, rz] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? rzVar = new rz();
        rzVar.u = this.a;
        rzVar.v = this.b;
        rzVar.w = this.c;
        rzVar.x = this.d;
        rzVar.y = this.e;
        rzVar.z = this.f;
        rzVar.A = this.g;
        rzVar.B = this.h;
        return rzVar;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        r31 r31Var = this.e;
        ((hs1) d21Var).Q0(this.h, this.f, this.d, r31Var, this.b, this.a, this.g, this.c);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int a = mb2.a(mb2.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        z90 z90Var = this.d;
        if (z90Var != null) {
            i = z90Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = (a + i) * 31;
        r31 r31Var = this.e;
        if (r31Var != null) {
            i2 = r31Var.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        xj xjVar = this.f;
        if (xjVar != null) {
            i3 = xjVar.hashCode();
        } else {
            i3 = 0;
        }
        int a2 = mb2.a((i6 + i3) * 31, 31, this.g);
        j7 j7Var = this.h;
        if (j7Var != null) {
            i4 = j7Var.hashCode();
        }
        return a2 + i4;
    }
}
