package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sy implements su0 {
    public final /* synthetic */ int e = 0;
    public final Object f;
    public final Object g;

    public sy(tu0 tu0Var) {
        this.f = tu0Var;
        fn fnVar = fn.c;
        Class<?> cls = tu0Var.getClass();
        dn dnVar = (dn) fnVar.a.get(cls);
        this.g = dnVar == null ? fnVar.a(cls, null) : dnVar;
    }

    @Override // defpackage.su0
    public final void g(uu0 uu0Var, mu0 mu0Var) {
        int i = this.e;
        Object obj = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                qy qyVar = (qy) obj;
                switch (ry.a[mu0Var.ordinal()]) {
                    case 1:
                        qyVar.getClass();
                        break;
                    case 2:
                        qyVar.c(uu0Var);
                        break;
                    case 3:
                        qyVar.i(uu0Var);
                        break;
                    case 4:
                        qyVar.getClass();
                        break;
                    case 5:
                        qyVar.b(uu0Var);
                        break;
                    case 6:
                        qyVar.getClass();
                        break;
                    case 7:
                        se.h("ON_ANY must not been send by anybody");
                        return;
                    default:
                        se.m();
                        return;
                }
                su0 su0Var = (su0) obj2;
                if (su0Var != null) {
                    su0Var.g(uu0Var, mu0Var);
                    return;
                }
                return;
            case 1:
                if (mu0Var == mu0.ON_START) {
                    ((wu0) obj).f(this);
                    ((sl0) obj2).B();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((dn) obj2).a;
                dn.a((List) hashMap.get(mu0Var), uu0Var, mu0Var, obj);
                dn.a((List) hashMap.get(mu0.ON_ANY), uu0Var, mu0Var, obj);
                return;
        }
    }

    public sy(qy qyVar, su0 su0Var) {
        qyVar.getClass();
        this.f = qyVar;
        this.g = su0Var;
    }

    public sy(sl0 sl0Var, wu0 wu0Var) {
        this.f = wu0Var;
        this.g = sl0Var;
    }
}
