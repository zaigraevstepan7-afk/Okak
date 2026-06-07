package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lfe;", "Li21;", "Lyt;", "Lnu1;", "ui"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class fe extends i21 implements nu1 {
    public final boolean a;
    public final oe0 b;

    public fe(boolean z, oe0 oe0Var) {
        this.a = z;
        this.b = oe0Var;
    }

    @Override // defpackage.nu1
    public final mu1 e() {
        mu1 mu1Var = new mu1();
        mu1Var.g = this.a;
        this.b.invoke(mu1Var);
        return mu1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fe) {
                fe feVar = (fe) obj;
                if (this.a != feVar.a || this.b != feVar.b) {
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
        return new yt(this.a, false, this.b);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        yt ytVar = (yt) d21Var;
        ytVar.s = this.a;
        ytVar.u = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
