package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ol1 implements su0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ ol1(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.su0
    public final void g(uu0 uu0Var, mu0 mu0Var) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                cr1 cr1Var = (cr1) obj;
                if (mu0Var == mu0.ON_CREATE) {
                    uu0Var.g().f(this);
                    Bundle q = cr1Var.f().q("androidx.savedstate.Restarter");
                    if (q != null) {
                        ArrayList<String> stringArrayList = q.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            for (String str : stringArrayList) {
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str, false, ol1.class.getClassLoader()).asSubclass(zq1.class);
                                    asSubclass.getClass();
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            newInstance.getClass();
                                            if (cr1Var instanceof tg2) {
                                                LinkedHashMap linkedHashMap = ((tg2) cr1Var).e().a;
                                                sl0 f = cr1Var.f();
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String str2 = (String) it.next();
                                                    str2.getClass();
                                                    kg2 kg2Var = (kg2) linkedHashMap.get(str2);
                                                    if (kg2Var != null) {
                                                        xn.q(kg2Var, f, cr1Var.g());
                                                    }
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    f.B();
                                                }
                                            } else {
                                                y61.i(cr1Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                                return;
                                            }
                                        } catch (Exception e) {
                                            throw new RuntimeException(l90.l("Failed to instantiate ", str), e);
                                        }
                                    } catch (NoSuchMethodException e2) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                                    }
                                } catch (ClassNotFoundException e3) {
                                    throw new RuntimeException(l90.m("Class ", str, " wasn't found"), e3);
                                }
                            }
                            return;
                        }
                        se.p("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                yp ypVar = (yp) obj;
                if (ypVar.i == null) {
                    up upVar = (up) ypVar.getLastNonConfigurationInstance();
                    if (upVar != null) {
                        ypVar.i = upVar.a;
                    }
                    if (ypVar.i == null) {
                        ypVar.i = new sg2();
                    }
                }
                ypVar.e.f(this);
                return;
            case 2:
                new HashMap();
                hf0[] hf0VarArr = (hf0[]) obj;
                if (hf0VarArr.length <= 0) {
                    if (hf0VarArr.length <= 0) {
                        return;
                    }
                    hf0 hf0Var = hf0VarArr[0];
                    throw null;
                }
                hf0 hf0Var2 = hf0VarArr[0];
                throw null;
            default:
                if (mu0Var == mu0.ON_CREATE) {
                    uu0Var.g().f(this);
                    ((vq1) obj).b();
                    return;
                } else {
                    y61.i(mu0Var, "Next event must be ON_CREATE, it was ");
                    return;
                }
        }
    }
}
