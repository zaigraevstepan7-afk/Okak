package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lg0 implements Runnable {
    public final /* synthetic */ int e;
    public Runnable f;
    public final zu g;

    public lg0(pl plVar, mg0 mg0Var) {
        this.e = 0;
        this.f = plVar;
        this.g = mg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        zu zuVar = this.g;
        switch (i) {
            case 0:
                ((pl) this.f).C((mg0) zuVar);
                return;
            case 1:
                dv0 dv0Var = (dv0) zuVar;
                zu zuVar2 = dv0Var.h;
                int i2 = 0;
                while (true) {
                    try {
                        this.f.run();
                    } catch (Throwable th) {
                        qo.O(j60.e, th);
                    }
                    Runnable S = dv0Var.S();
                    if (S != null) {
                        this.f = S;
                        i2++;
                        if (i2 >= 16 && zuVar2.Q(dv0Var)) {
                            zuVar2.P(dv0Var, this);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                break;
            default:
                ((pl) this.f).C((t70) zuVar);
                return;
        }
    }

    public /* synthetic */ lg0(zu zuVar, Runnable runnable, int i) {
        this.e = i;
        this.g = zuVar;
        this.f = runnable;
    }
}
