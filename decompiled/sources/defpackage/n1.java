package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n1 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public n1(uu0 uu0Var, qu0 qu0Var, wl1 wl1Var) {
        this.a = 3;
        this.c = uu0Var;
        this.b = qu0Var;
        this.d = wl1Var;
    }

    @Override // defpackage.n10
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((de0) obj3).invoke();
                ((uu0) obj2).g().f((m1) obj);
                return;
            case 1:
                ((a12) obj3).remove(obj2);
                ((pb) obj).d.k(obj2);
                return;
            case 2:
                d51 d51Var = (d51) obj2;
                ((y00) obj3).b().c(d51Var);
                ((a12) obj).remove(d51Var);
                return;
            case 3:
                ((uu0) obj2).g().f((qu0) obj3);
                yg ygVar = (yg) ((wl1) obj).e;
                if (ygVar != null) {
                    ygVar.a();
                    return;
                }
                return;
            default:
                mq1 mq1Var = (mq1) obj3;
                rq1 rq1Var = (rq1) obj;
                if (mq1Var.f.k(obj2) == rq1Var) {
                    Map map = mq1Var.e;
                    Map d = rq1Var.d();
                    if (d.isEmpty()) {
                        map.remove(obj2);
                        return;
                    } else {
                        map.put(obj2, d);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
