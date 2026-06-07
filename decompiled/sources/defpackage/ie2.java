package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ie2 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ je2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie2(je2 je2Var, int i) {
        super(1);
        this.e = i;
        this.f = je2Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        je2 je2Var = this.f;
        switch (i) {
            case 0:
                je2Var.d = true;
                je2Var.f.invoke();
                return od2Var;
            default:
                c40 c40Var = (c40) obj;
                yf0 yf0Var = je2Var.b;
                float f = je2Var.k;
                float f2 = je2Var.l;
                ld b0 = c40Var.b0();
                long k = b0.k();
                b0.h().h();
                try {
                    ((rg2) b0.f).z(f, f2, 0L);
                    yf0Var.a(c40Var);
                    return od2Var;
                } finally {
                    l90.v(b0, k);
                }
        }
    }
}
