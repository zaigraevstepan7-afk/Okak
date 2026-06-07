package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lr32;", "Li21;", "Ls32;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class r32 extends i21 {
    public final de0 a;

    public r32(de0 de0Var) {
        this.a = de0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r32)) {
            return false;
        }
        if (this.a == ((r32) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new s32(this.a);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ((s32) d21Var).u = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
