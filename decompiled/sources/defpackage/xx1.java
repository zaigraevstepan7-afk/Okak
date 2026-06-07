package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class xx1 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xx1(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        String str;
        d92 d92Var;
        int i;
        TextClassification textClassification;
        boolean z2;
        int i2 = this.e;
        od2 od2Var = od2.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                xq1.a((e21) obj4, (fq) obj3, (ur) obj, lo.b0(49));
                return od2Var;
            case 1:
                ((Integer) obj2).getClass();
                rx.i((e21) obj4, (kw1) obj3, (ur) obj, lo.b0(7));
                return od2Var;
            case 2:
                ((Integer) obj2).getClass();
                ((xl1) obj4).k((Drawable) obj3, (ur) obj, lo.b0(49));
                return od2Var;
            case 3:
                te0 te0Var = (te0) obj4;
                j72 j72Var = (j72) obj3;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    te0Var.invoke(j72Var, urVar, 6);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 4:
                b82 b82Var = (b82) obj4;
                gv gvVar = (gv) obj3;
                f62 f62Var = (f62) obj;
                Context context = (Context) obj2;
                boolean j = b82Var.j();
                rc m = b82Var.m();
                TextClassification textClassification2 = null;
                if (m != null) {
                    str = m.f;
                } else {
                    str = null;
                }
                d92 d92Var2 = b82Var.v;
                if (d92Var2 != null) {
                    long j2 = d92Var2.a;
                    c91 c91Var = b82Var.b;
                    d92Var = new d92(fr1.a(c91Var.d((int) (j2 >> 32)), c91Var.d((int) (j2 & 4294967295L))));
                } else {
                    d92Var = null;
                }
                wg1 wg1Var = b82Var.i;
                k1 k1Var = new k1(b82Var, gvVar, context, 20);
                y22 y22Var = yg1.a;
                if (str != null && d92Var != null && wg1Var != null) {
                    long j3 = d92Var.a;
                    Object obj5 = wg1Var.h;
                    b51 b51Var = wg1Var.e;
                    if (b51Var.e()) {
                        e62 e62Var = (e62) wg1Var.g.getValue();
                        if (e62Var != null && d92.b(j3, e62Var.b) && sn0.r(str, e62Var.a)) {
                            textClassification = e62Var.c;
                        } else {
                            textClassification = null;
                        }
                        b51Var.f(null);
                        textClassification2 = textClassification;
                    }
                    if (textClassification2 == null) {
                        k1Var.invoke(f62Var);
                    } else {
                        if (!textClassification2.getActions().isEmpty()) {
                            i = 0;
                            f62Var.a.a(new u62(obj5, textClassification2, 0));
                        } else {
                            i = 0;
                            if ((textClassification2.getIcon() != null || !TextUtils.isEmpty(textClassification2.getLabel())) && (textClassification2.getIntent() != null || textClassification2.getOnClickListener() != null)) {
                                f62Var.a.a(new u62(obj5, textClassification2, -1));
                            }
                        }
                        k1Var.invoke(f62Var);
                        List<RemoteAction> actions = textClassification2.getActions();
                        int size = actions.size();
                        for (int i3 = i; i3 < size; i3++) {
                            actions.get(i3);
                            if (i3 > 0) {
                                f62Var.a.a(new u62(obj5, textClassification2, i3));
                            }
                        }
                    }
                    qo.f(f62Var, context, j, str, d92Var.a);
                } else {
                    k1Var.invoke(f62Var);
                    if (str != null && d92Var != null) {
                        qo.f(f62Var, context, j, str, d92Var.a);
                    }
                }
                return od2Var;
            case 5:
                o41 o41Var = (o41) obj4;
                se0 se0Var = (se0) obj3;
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar2.O(intValue2 & 1, z2)) {
                    Object L = urVar2.L();
                    if (L == or.a) {
                        L = new aa(o41Var, 7);
                        urVar2.h0(L);
                    }
                    e21 C = f2.C(b21.a, (oe0) L);
                    j01 d = hj.d(g3.f, false);
                    int x = io.x(urVar2);
                    sf1 l = urVar2.l();
                    e21 Q = fp.Q(urVar2, C);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, kr.f, d);
                    op1.q(urVar2, kr.e, l);
                    gb gbVar = kr.g;
                    if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x))) {
                        l90.s(x, urVar2, x, gbVar);
                    }
                    op1.q(urVar2, kr.d, Q);
                    se0Var.invoke(urVar2, 0);
                    urVar2.p(true);
                } else {
                    urVar2.R();
                }
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                d6.g((String) obj4, (h32) obj3, (ur) obj, lo.b0(1));
                return od2Var;
        }
    }

    public /* synthetic */ xx1(Object obj, int i, int i2, Object obj2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
    }
}
