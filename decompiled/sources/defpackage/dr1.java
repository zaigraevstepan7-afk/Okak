package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dr1 implements pg2 {
    public final Application a;
    public final og2 b;
    public final Bundle c;
    public final wu0 d;
    public final sl0 e;

    public dr1(Application application, cr1 cr1Var, Bundle bundle) {
        og2 og2Var;
        this.e = cr1Var.f();
        this.d = cr1Var.g();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (og2.c == null) {
                og2.c = new og2(application);
            }
            og2Var = og2.c;
            og2Var.getClass();
        } else {
            og2Var = new og2(null);
        }
        this.b = og2Var;
    }

    @Override // defpackage.pg2
    public final kg2 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        se.h("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.pg2
    public final kg2 b(Class cls, k31 k31Var) {
        Constructor a;
        LinkedHashMap linkedHashMap = k31Var.a;
        String str = (String) linkedHashMap.get(rg2.g);
        if (str != null) {
            if (linkedHashMap.get(c01.w) != null && linkedHashMap.get(c01.x) != null) {
                Application application = (Application) linkedHashMap.get(og2.d);
                boolean isAssignableFrom = na.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a = er1.a(cls, er1.a);
                } else {
                    a = er1.a(cls, er1.b);
                }
                if (a == null) {
                    return this.b.b(cls, k31Var);
                }
                if (isAssignableFrom && application != null) {
                    return er1.b(cls, a, application, c01.t(k31Var));
                }
                return er1.b(cls, a, c01.t(k31Var));
            }
            if (this.d != null) {
                return d(str, cls);
            }
            se.p("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        se.p("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    }

    @Override // defpackage.pg2
    public final kg2 c(cn cnVar, k31 k31Var) {
        Class b = cnVar.b();
        b.getClass();
        return b(b, k31Var);
    }

    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, qg2] */
    public final kg2 d(String str, Class cls) {
        Constructor a;
        sq1 sq1Var;
        kg2 b;
        wu0 wu0Var = this.d;
        if (wu0Var != null) {
            boolean isAssignableFrom = na.class.isAssignableFrom(cls);
            Application application = this.a;
            if (isAssignableFrom && application != null) {
                a = er1.a(cls, er1.a);
            } else {
                a = er1.a(cls, er1.b);
            }
            if (a == null) {
                if (application != null) {
                    return this.b.a(cls);
                }
                if (qg2.a == null) {
                    qg2.a = new Object();
                }
                qg2.a.getClass();
                return hp.r(cls);
            }
            sl0 sl0Var = this.e;
            sl0Var.getClass();
            Bundle q = sl0Var.q(str);
            if (q == null) {
                q = this.c;
            }
            if (q == null) {
                sq1Var = new sq1();
            } else {
                ClassLoader classLoader = sq1.class.getClassLoader();
                classLoader.getClass();
                q.setClassLoader(classLoader);
                nz0 nz0Var = new nz0(q.size());
                for (String str2 : q.keySet()) {
                    str2.getClass();
                    nz0Var.put(str2, q.get(str2));
                }
                sq1Var = new sq1(tz0.a0(nz0Var));
            }
            tq1 tq1Var = new tq1(str, sq1Var);
            tq1Var.k(sl0Var, wu0Var);
            nu0 nu0Var = wu0Var.c;
            if (nu0Var != nu0.f && nu0Var.compareTo(nu0.h) < 0) {
                wu0Var.a(new sy(sl0Var, wu0Var));
            } else {
                sl0Var.B();
            }
            if (isAssignableFrom && application != null) {
                b = er1.b(cls, a, application, sq1Var);
            } else {
                b = er1.b(cls, a, sq1Var);
            }
            b.a("androidx.lifecycle.savedstate.vm.tag", tq1Var);
            return b;
        }
        se.v("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    public dr1() {
        this.b = new og2(null);
    }
}
