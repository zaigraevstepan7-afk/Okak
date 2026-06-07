package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv70;", "Li21;", "Lw70;", "material3"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
final class v70 extends i21 {
    public final z9 a;

    public v70(z9 z9Var) {
        this.a = z9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v70) {
                if (this.a == ((v70) obj).a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w70, d21] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ((w70) d21Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
