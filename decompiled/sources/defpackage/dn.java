package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dn {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public dn(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            mu0 mu0Var = (mu0) entry.getValue();
            List list = (List) this.a.get(mu0Var);
            if (list == null) {
                list = new ArrayList();
                this.a.put(mu0Var, list);
            }
            list.add((en) entry.getKey());
        }
    }

    public static void a(List list, uu0 uu0Var, mu0 mu0Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                en enVar = (en) list.get(size);
                Method method = enVar.b;
                try {
                    int i = enVar.a;
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                method.invoke(obj, uu0Var, mu0Var);
                            }
                        } else {
                            method.invoke(obj, uu0Var);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
