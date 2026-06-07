package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls2;", "Li21;", "Lt2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class s2 extends i21 {
    public final xx1 a;

    public s2(xx1 xx1Var) {
        this.a = xx1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s2) {
                if (this.a != ((s2) obj).a) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, rz, java.lang.Object, t2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [r2, d21, qz] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? rzVar = new rz();
        rzVar.u = this.a;
        r rVar = new r(rzVar, 2);
        ?? d21Var = new d21();
        d21Var.s = rVar;
        rzVar.L0(d21Var);
        return rzVar;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ((t2) d21Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
