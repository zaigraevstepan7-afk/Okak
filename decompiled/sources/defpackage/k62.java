package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk62;", "Li21;", "Lm62;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class k62 extends i21 {
    public final v72 a;

    public k62(v72 v72Var) {
        this.a = v72Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k62) {
                if (this.a != ((k62) obj).a) {
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
        return new m62(this.a);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ((m62) d21Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
