package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fq implements se0, te0, ue0, ve0, we0, xe0, ye0, ze0, ee0, fe0, he0, ie0, je0, ke0, le0, me0, ne0, pe0, qe0 {
    public final int e;
    public final boolean f;
    public af0 g;
    public dl1 h;
    public ArrayList i;

    public fq(int i, boolean z, af0 af0Var) {
        this.e = i;
        this.f = z;
        this.g = af0Var;
    }

    public final Object b(int i, ur urVar) {
        int k;
        urVar.Y(this.e);
        j(urVar);
        if (urVar.f(this)) {
            k = go.k(2, 0);
        } else {
            k = go.k(1, 0);
        }
        int i2 = i | k;
        af0 af0Var = this.g;
        fc2.t(2, af0Var);
        Object invoke = ((se0) af0Var).invoke(urVar, Integer.valueOf(i2));
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new eq(2, this, fq.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return invoke;
    }

    @Override // defpackage.ue0
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        return i(obj, obj2, (ur) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.ye0
    public final /* bridge */ /* synthetic */ Object d(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ur urVar, Integer num) {
        return h(obj, bool, obj2, obj3, obj4, urVar, num.intValue());
    }

    public final Object e(mh mhVar, Object obj, Object obj2, ur urVar, int i) {
        int k;
        urVar.Y(this.e);
        j(urVar);
        if (urVar.f(this)) {
            k = go.k(2, 3);
        } else {
            k = go.k(1, 3);
        }
        af0 af0Var = this.g;
        fc2.t(5, af0Var);
        Object f = ((ve0) af0Var).f(mhVar, obj, obj2, urVar, Integer.valueOf(k | i));
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new c3(this, mhVar, obj, obj2, i);
        }
        return f;
    }

    @Override // defpackage.ve0
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e((mh) obj, obj2, obj3, (ur) obj4, ((Number) obj5).intValue());
    }

    public final Object g(Object obj, ur urVar, int i) {
        int k;
        urVar.Y(this.e);
        j(urVar);
        if (urVar.f(this)) {
            k = go.k(2, 1);
        } else {
            k = go.k(1, 1);
        }
        af0 af0Var = this.g;
        fc2.t(3, af0Var);
        Object invoke = ((te0) af0Var).invoke(obj, urVar, Integer.valueOf(k | i));
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new cq(this, i, 0, obj);
        }
        return invoke;
    }

    public final Object h(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ur urVar, int i) {
        int k;
        urVar.Y(this.e);
        j(urVar);
        if (urVar.f(this)) {
            k = go.k(2, 6);
        } else {
            k = go.k(1, 6);
        }
        af0 af0Var = this.g;
        fc2.t(8, af0Var);
        Object d = ((ye0) af0Var).d(obj, bool, obj2, obj3, obj4, urVar, Integer.valueOf(i | k));
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new dq(this, obj, bool, obj2, obj3, obj4, i);
        }
        return d;
    }

    public final Object i(Object obj, Object obj2, ur urVar, int i) {
        int k;
        urVar.Y(this.e);
        j(urVar);
        if (urVar.f(this)) {
            k = go.k(2, 2);
        } else {
            k = go.k(1, 2);
        }
        af0 af0Var = this.g;
        fc2.t(4, af0Var);
        Object c = ((ue0) af0Var).c(obj, obj2, urVar, Integer.valueOf(k | i));
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h9(this, obj, obj2, i);
        }
        return c;
    }

    @Override // defpackage.se0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b(((Number) obj2).intValue(), (ur) obj);
    }

    public final void j(ur urVar) {
        dl1 x;
        if (this.f && (x = urVar.x()) != null) {
            x.b |= 1;
            dl1 dl1Var = this.h;
            if (dl1Var != null && dl1Var.a() && dl1Var != x && !sn0.r(dl1Var.c, x.c)) {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(x);
                    return;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    dl1 dl1Var2 = (dl1) arrayList.get(i);
                    if (dl1Var2 == null || !dl1Var2.a() || dl1Var2 == x || sn0.r(dl1Var2.c, x.c)) {
                        arrayList.set(i, x);
                        return;
                    }
                }
                arrayList.add(x);
                return;
            }
            this.h = x;
        }
    }

    @Override // defpackage.te0
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return g(obj, (ur) obj2, ((Number) obj3).intValue());
    }
}
