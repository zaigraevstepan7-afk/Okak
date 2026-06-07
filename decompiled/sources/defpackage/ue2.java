package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ue2 {
    public final ga0 a;
    public mc b;
    public mc c;
    public mc d;
    public final float e;

    public ue2(ga0 ga0Var) {
        this.a = ga0Var;
        this.e = ga0Var.c();
    }

    public final mc a(long j, mc mcVar, mc mcVar2) {
        if (this.c == null) {
            this.c = mcVar.c();
        }
        mc mcVar3 = this.c;
        if (mcVar3 != null) {
            int b = mcVar3.b();
            int i = 0;
            while (true) {
                mc mcVar4 = this.c;
                if (i < b) {
                    if (mcVar4 != null) {
                        mcVar.getClass();
                        mcVar4.e(i, this.a.j(j, mcVar2.a(i)));
                        i++;
                    } else {
                        sn0.V("velocityVector");
                        throw null;
                    }
                } else {
                    if (mcVar4 != null) {
                        return mcVar4;
                    }
                    sn0.V("velocityVector");
                    throw null;
                }
            }
        } else {
            sn0.V("velocityVector");
            throw null;
        }
    }
}
