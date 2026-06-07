package defpackage;

import android.view.Choreographer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ja implements vu {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public ja(ja jaVar) {
        this.e = 2;
        this.f = jaVar;
        this.g = new dq0();
    }

    @Override // defpackage.xu
    public final xu G(xu xuVar) {
        switch (this.e) {
            case 0:
                return go.M(this, xuVar);
            case 1:
                return go.M(this, xuVar);
            default:
                return go.M(this, xuVar);
        }
    }

    @Override // defpackage.xu
    public final vu H(wu wuVar) {
        switch (this.e) {
            case 0:
                return go.D(this, wuVar);
            case 1:
                return go.D(this, wuVar);
            default:
                return go.D(this, wuVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r9 == r2) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Type inference failed for: r1v2, types: [pg, java.lang.Object, ak] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.oe0 r8, defpackage.vt r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ja.a(oe0, vt):java.lang.Object");
    }

    @Override // defpackage.vu
    public wu getKey() {
        return g3.P;
    }

    @Override // defpackage.xu
    public final Object p(se0 se0Var, Object obj) {
        switch (this.e) {
            case 0:
                return se0Var.invoke(obj, this);
            case 1:
                return se0Var.invoke(obj, this);
            default:
                return se0Var.invoke(obj, this);
        }
    }

    @Override // defpackage.xu
    public final xu s(wu wuVar) {
        switch (this.e) {
            case 0:
                return go.I(this, wuVar);
            case 1:
                return go.I(this, wuVar);
            default:
                return go.I(this, wuVar);
        }
    }

    public ja(Choreographer choreographer, ha haVar) {
        this.e = 0;
        this.f = choreographer;
        this.g = haVar;
    }

    public ja(el1 el1Var) {
        this.e = 1;
        this.f = el1Var;
        this.g = new qg();
    }
}
