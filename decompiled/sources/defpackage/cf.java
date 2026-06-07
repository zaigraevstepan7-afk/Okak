package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcf;", "Li21;", "Lef;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class cf extends i21 {
    public final float a;
    public final boolean b;

    public cf(float f, boolean z) {
        this.a = f;
        this.b = z;
        if (f > 0.0f) {
            return;
        }
        il0.a("aspectRatio " + f + " must be > 0");
    }

    public final boolean equals(Object obj) {
        cf cfVar;
        if (this != obj) {
            if (obj instanceof cf) {
                cfVar = (cf) obj;
            } else {
                cfVar = null;
            }
            if (cfVar != null && this.a == cfVar.a) {
                if (this.b == ((cf) obj).b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ef, d21] */
    @Override // defpackage.i21
    public final d21 f() {
        ?? d21Var = new d21();
        d21Var.s = this.a;
        d21Var.t = this.b;
        return d21Var;
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        ef efVar = (ef) d21Var;
        efVar.s = this.a;
        efVar.t = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
