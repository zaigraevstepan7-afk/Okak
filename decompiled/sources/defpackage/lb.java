package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Llb;", "S", "Li21;", "Lob;", "animation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class lb<S> extends i21 {
    public final hb2 a;
    public final o41 b;
    public final pb c;

    public lb(hb2 hb2Var, o41 o41Var, pb pbVar) {
        this.a = hb2Var;
        this.b = o41Var;
        this.c = pbVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lb) {
            lb lbVar = (lb) obj;
            if (sn0.r(lbVar.a, this.a) && lbVar.b.equals(this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, ob] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        d21Var.u = this.c;
        d21Var.v = -9223372034707292160L;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ob obVar = (ob) d21Var;
        obVar.s = this.a;
        obVar.t = this.b;
        obVar.u = this.c;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        hb2 hb2Var = this.a;
        if (hb2Var != null) {
            i = hb2Var.hashCode();
        } else {
            i = 0;
        }
        return this.b.hashCode() + ((hashCode + i) * 31);
    }
}
