package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f4 implements ds1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ds1
    public final float a(float f) {
        long c;
        int i = this.a;
        float f2 = 0.0f;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                h4 h4Var = (h4) obj2;
                float e = h4Var.M.e(f);
                float g = e - h4Var.M.j.g();
                ((m4) obj).a(e, 0.0f);
                return g;
            case 1:
                at1 at1Var = (at1) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) at1Var.h.invoke()).booleanValue()) {
                    long e2 = at1Var.e(at1Var.h(f));
                    at1 at1Var2 = ((ys1) obj).a;
                    at1Var2.j = 2;
                    j7 j7Var = at1Var2.b;
                    if (j7Var != null && (at1Var2.a.c() || at1Var2.a.b())) {
                        c = j7Var.c(e2, at1Var2.j, at1Var2.m);
                    } else {
                        c = at1Var2.c(at1Var2.k, e2, 2);
                    }
                    return at1Var.d(at1Var.g(c));
                }
                throw new qg1("The fling animation was cancelled", 0);
            default:
                n4 n4Var = ((ex1) obj2).d;
                if (!Float.isNaN(n4Var.j.g())) {
                    f2 = n4Var.j.g();
                }
                float o = go.o(f2 + f, n4Var.c().e(), n4Var.c().d());
                float g2 = o - n4Var.j.g();
                ((m4) obj).a(o, 0.0f);
                return g2;
        }
    }
}
