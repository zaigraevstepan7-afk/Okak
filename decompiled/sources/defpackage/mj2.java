package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmj2;", "Li21;", "Loj2;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class mj2 extends i21 {
    public final e10 a;
    public final se0 b;
    public final Object c;

    public mj2(e10 e10Var, se0 se0Var, Object obj) {
        this.a = e10Var;
        this.b = se0Var;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && mj2.class == obj.getClass()) {
                mj2 mj2Var = (mj2) obj;
                if (this.a != mj2Var.a || !this.c.equals(mj2Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, oj2] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        oj2 oj2Var = (oj2) d21Var;
        oj2Var.s = this.a;
        oj2Var.t = this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + mb2.a(this.a.hashCode() * 31, 31, false);
    }
}
