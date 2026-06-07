package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tv extends cq0 implements se0 {
    public final /* synthetic */ lb2 e;
    public final /* synthetic */ u90 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ fq h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(lb2 lb2Var, u90 u90Var, Object obj, fq fqVar) {
        super(2);
        this.e = lb2Var;
        this.f = u90Var;
        this.g = obj;
        this.h = fqVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Object c;
        float f;
        oe0 oe0Var;
        ur urVar = (ur) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(intValue & 1, z)) {
            bb bbVar = new bb(this.f, 1);
            ec2 ec2Var = f2.A;
            lb2 lb2Var = this.e;
            boolean g = lb2Var.g();
            ir irVar = lb2Var.a;
            xl1 xl1Var = or.a;
            if (!g) {
                urVar.X(1666573488);
                boolean f2 = urVar.f(lb2Var);
                c = urVar.L();
                if (f2 || c == xl1Var) {
                    i02 e = nq1.e();
                    if (e != null) {
                        oe0Var = e.e();
                    } else {
                        oe0Var = null;
                    }
                    i02 j = nq1.j(e);
                    try {
                        Object c2 = irVar.c();
                        nq1.o(e, j, oe0Var);
                        urVar.h0(c2);
                        c = c2;
                    } catch (Throwable th) {
                        nq1.o(e, j, oe0Var);
                        throw th;
                    }
                }
                urVar.p(false);
            } else {
                urVar.X(1666827533);
                urVar.p(false);
                c = irVar.c();
            }
            urVar.X(1378811975);
            Object obj3 = this.g;
            boolean r = sn0.r(c, obj3);
            float f3 = 0.0f;
            if (r) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            urVar.p(false);
            Float valueOf = Float.valueOf(f);
            boolean f4 = urVar.f(lb2Var);
            Object L = urVar.L();
            if (f4 || L == xl1Var) {
                L = fr1.h(new sv(lb2Var, 0));
                urVar.h0(L);
            }
            Object value = ((o22) L).getValue();
            urVar.X(1378811975);
            if (sn0.r(value, obj3)) {
                f3 = 1.0f;
            }
            urVar.p(false);
            Float valueOf2 = Float.valueOf(f3);
            boolean f5 = urVar.f(lb2Var);
            Object L2 = urVar.L();
            if (f5 || L2 == xl1Var) {
                L2 = fr1.h(new sv(lb2Var, 1));
                urVar.h0(L2);
            }
            kb2 c3 = qb2.c(lb2Var, valueOf, valueOf2, (u90) bbVar.invoke(((o22) L2).getValue(), urVar, 0), ec2Var, urVar, 0);
            boolean f6 = urVar.f(c3);
            Object L3 = urVar.L();
            if (f6 || L3 == xl1Var) {
                L3 = new n3(c3, 11);
                urVar.h0(L3);
            }
            e21 x = d6.x(b21.a, (oe0) L3);
            j01 d = hj.d(g3.f, false);
            int hashCode = Long.hashCode(urVar.T);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, x);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, d);
            op1.q(urVar, kr.e, l);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q);
            this.h.invoke(obj3, urVar, 0);
            urVar.p(true);
        } else {
            urVar.R();
        }
        return od2.a;
    }
}
