package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h6 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.n10
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((j6) obj);
                return;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((k6) obj);
                return;
            case 2:
                ((ug) obj2).b((qq) obj);
                return;
            case 3:
                ((d51) obj2).l.j.f((s00) obj);
                return;
            case 4:
                ((uk0) obj2).a.j((sk0) obj);
                return;
            case 5:
                ((vt0) obj2).g.k(obj);
                return;
            case 6:
                Iterator it = ((List) ((o22) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((wq) obj).b().c((d51) it.next());
                }
                return;
            case 7:
                ((ug) obj2).b((cr) obj);
                return;
            case 8:
                o41 o41Var = (o41) obj2;
                si1 si1Var = (si1) o41Var.getValue();
                if (si1Var != null) {
                    ri1 ri1Var = new ri1(si1Var);
                    r31 r31Var = (r31) obj;
                    if (r31Var != null) {
                        r31Var.b(ri1Var);
                    }
                    o41Var.setValue(null);
                    return;
                }
                return;
            case 9:
                ((lb2) obj2).j.remove((lb2) obj);
                return;
            case 10:
                lb2 lb2Var = (lb2) obj2;
                lb2Var.getClass();
                gb2 gb2Var = (gb2) ((hb2) obj).b.getValue();
                if (gb2Var != null) {
                    lb2Var.i.remove(gb2Var.e);
                    return;
                }
                return;
            case 11:
                ((lb2) obj2).i.remove((kb2) obj);
                return;
            default:
                pi2 pi2Var = (pi2) obj2;
                View view = (View) obj;
                int i2 = pi2Var.u - 1;
                pi2Var.u = i2;
                if (i2 == 0) {
                    int i3 = eg2.a;
                    ag2.a(view, null);
                    view.setWindowInsetsAnimationCallback(null);
                    view.removeOnAttachStateChangeListener(pi2Var.v);
                    return;
                }
                return;
        }
    }
}
