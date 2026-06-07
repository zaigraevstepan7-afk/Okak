package defpackage;

import android.view.View;
import com.elixir.loader.R;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qj2 extends cq0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ rj2 f;
    public final /* synthetic */ se0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj2(rj2 rj2Var, se0 se0Var, int i) {
        super(2);
        this.e = i;
        this.f = rj2Var;
        this.g = se0Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Set set;
        View view;
        Object obj3;
        int i = this.e;
        od2 od2Var = od2.a;
        se0 se0Var = this.g;
        rj2 rj2Var = this.f;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    l6.a(rj2Var.e, se0Var, urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                ur urVar2 = (ur) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar2.O(intValue2 & 1, z2)) {
                    q5 q5Var = rj2Var.e;
                    Object tag = q5Var.getTag(R.id.inspection_slot_table_set);
                    vt vtVar = null;
                    if ((tag instanceof Set) && (!(tag instanceof xo0) || (tag instanceof bp0))) {
                        set = (Set) tag;
                    } else {
                        set = null;
                    }
                    if (set == null) {
                        Object parent = q5Var.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            obj3 = view.getTag(R.id.inspection_slot_table_set);
                        } else {
                            obj3 = null;
                        }
                        if ((obj3 instanceof Set) && (!(obj3 instanceof xo0) || (obj3 instanceof bp0))) {
                            set = (Set) obj3;
                        } else {
                            set = null;
                        }
                    }
                    if (set != null) {
                        set.add(urVar2.w());
                        urVar2.q = true;
                        urVar2.C = true;
                        urVar2.c.b();
                        urVar2.H.b();
                        jz1 jz1Var = urVar2.I;
                        gz1 gz1Var = jz1Var.a;
                        jz1Var.e = gz1Var.n;
                        jz1Var.f = gz1Var.o;
                    }
                    boolean h = urVar2.h(rj2Var);
                    Object L = urVar2.L();
                    xl1 xl1Var = or.a;
                    if (h || L == xl1Var) {
                        L = new pj2(rj2Var, vtVar, i3);
                        urVar2.h0(L);
                    }
                    bf.i(urVar2, (se0) L, q5Var);
                    boolean h2 = urVar2.h(rj2Var);
                    Object L2 = urVar2.L();
                    if (h2 || L2 == xl1Var) {
                        L2 = new pj2(rj2Var, vtVar, i2);
                        urVar2.h0(L2);
                    }
                    bf.i(urVar2, (se0) L2, q5Var);
                    vn.b(jm0.a.a(set), go.N(-280240369, new qj2(rj2Var, se0Var, i3), urVar2), urVar2, 56);
                } else {
                    urVar2.R();
                }
                return od2Var;
        }
    }
}
