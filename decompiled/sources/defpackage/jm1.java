package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jm1 extends w implements av {
    public final /* synthetic */ bs f;
    public final /* synthetic */ km1 g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jm1(defpackage.bs r2, defpackage.km1 r3) {
        /*
            r1 = this;
            g3 r0 = defpackage.g3.z
            r1.f = r2
            r1.g = r3
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jm1.<init>(bs, km1):void");
    }

    @Override // defpackage.av
    public final void k(xu xuVar, Throwable th) {
        bs bsVar = this.f;
        km1 km1Var = this.g;
        qo.e0(th, new j1(9, bsVar, km1Var));
        av avVar = (av) km1Var.e.H(g3.z);
        if (avVar != null) {
            avVar.k(xuVar, th);
            return;
        }
        throw th;
    }
}
