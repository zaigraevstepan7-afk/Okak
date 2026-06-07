package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Log;", "Li21;", "Lng;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class og extends i21 {
    public ng a;
    public ip b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new ng(this);
    }

    @Override // defpackage.i21
    public final /* bridge */ /* synthetic */ void g(d21 d21Var) {
    }

    public final Object h(wt wtVar) {
        ip ipVar = this.b;
        if (ipVar == null) {
            ipVar = vn.a();
            this.b = ipVar;
            ng ngVar = this.a;
            if (ngVar != null && ngVar.r) {
                ngVar.L0();
            }
        }
        Object q = ipVar.q(wtVar);
        if (q == hv.e) {
            return q;
        }
        return od2.a;
    }

    public final int hashCode() {
        return 234;
    }
}
