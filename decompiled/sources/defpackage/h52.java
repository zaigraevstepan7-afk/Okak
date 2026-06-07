package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh52;", "Li21;", "Li52;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class h52 extends i21 {
    public final ke2 a;

    public h52(ke2 ke2Var) {
        this.a = ke2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h52) {
                if (this.a == ((h52) obj).a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, i52, fm0] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? fm0Var = new fm0(bf.i1);
        fm0Var.v = this.a;
        return fm0Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        i52 i52Var = (i52) d21Var;
        ke2 ke2Var = i52Var.v;
        ke2 ke2Var2 = this.a;
        if (ke2Var != ke2Var2) {
            i52Var.v = ke2Var2;
            pi2 pi2Var = i52Var.w;
            if (pi2Var != null) {
                sa saVar = pi2Var.c;
                if (!sn0.r(saVar, i52Var.u)) {
                    i52Var.u = saVar;
                    i52Var.M0();
                }
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
