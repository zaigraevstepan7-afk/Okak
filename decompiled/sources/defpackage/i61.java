package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i61 implements ue0 {
    public final /* synthetic */ lt1 e;
    public final /* synthetic */ d51 f;
    public final /* synthetic */ lq1 g;
    public final /* synthetic */ o41 h;
    public final /* synthetic */ o22 i;

    public i61(lt1 lt1Var, d51 d51Var, mq1 mq1Var, o41 o41Var, o22 o22Var) {
        this.e = lt1Var;
        this.f = d51Var;
        this.g = mq1Var;
        this.h = o41Var;
        this.i = o22Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // defpackage.ue0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        d51 d51Var;
        jb jbVar = (jb) obj;
        d51 d51Var2 = (d51) obj2;
        ur urVar = (ur) obj3;
        ((Number) obj4).intValue();
        boolean r = sn0.r(this.e.c.getValue(), this.f);
        if (!((Boolean) this.h.getValue()).booleanValue() && !r) {
            List list = (List) this.i.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    d51Var = listIterator.previous();
                    if (sn0.r(d51Var2, (d51) d51Var)) {
                        break;
                    }
                } else {
                    d51Var = 0;
                    break;
                }
            }
            d51Var2 = d51Var;
        }
        if (d51Var2 == null) {
            urVar.X(105930796);
        } else {
            urVar.X(-1520603531);
            io.f(d51Var2, this.g, go.N(-1263531443, new t00(d51Var2, jbVar), urVar), urVar, 384);
        }
        urVar.p(false);
        return od2.a;
    }
}
