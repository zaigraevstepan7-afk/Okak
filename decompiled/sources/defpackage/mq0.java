package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmq0;", "Li21;", "Lnq0;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final /* data */ class mq0 extends i21 {
    public final Object a;

    public mq0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof mq0) || !this.a.equals(((mq0) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, nq0] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ((nq0) d21Var).s = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ')';
    }
}
