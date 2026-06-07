package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Loj;", "Li21;", "Lrj;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class oj extends i21 {
    public final qj a;

    public oj(qj qjVar) {
        this.a = qjVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oj) {
                if (!sn0.r(this.a, ((oj) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, rj] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        rj rjVar = (rj) d21Var;
        qj qjVar = rjVar.s;
        if (qjVar != null) {
            qjVar.a.j(rjVar);
        }
        qj qjVar2 = this.a;
        if (qjVar2 != null) {
            qjVar2.a.b(rjVar);
        }
        rjVar.s = qjVar2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
