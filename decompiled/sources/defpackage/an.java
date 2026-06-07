package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lan;", "Li21;", "Lzm;", "material3"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class an extends i21 {
    public final v51 a;

    public an(v51 v51Var) {
        this.a = v51Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof an) {
                if (this.a == ((an) obj).a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, zm] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        zm zmVar = (zm) d21Var;
        zmVar.s = this.a;
        xp1.m(zmVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
