package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fn {
    public static final fn c = new fn();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, en enVar, mu0 mu0Var, Class cls) {
        mu0 mu0Var2 = (mu0) hashMap.get(enVar);
        if (mu0Var2 != null && mu0Var != mu0Var2) {
            throw new IllegalArgumentException("Method " + enVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + mu0Var2 + ", new value " + mu0Var);
        }
        if (mu0Var2 == null) {
            hashMap.put(enVar, mu0Var);
        }
    }

    public final dn a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            dn dnVar = (dn) hashMap2.get(superclass);
            if (dnVar == null) {
                dnVar = a(superclass, null);
            }
            hashMap.putAll(dnVar.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            dn dnVar2 = (dn) hashMap2.get(cls2);
            if (dnVar2 == null) {
                dnVar2 = a(cls2, null);
            }
            for (Map.Entry entry : dnVar2.b.entrySet()) {
                b(hashMap, (en) entry.getKey(), (mu0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            ca1 ca1Var = (ca1) method.getAnnotation(ca1.class);
            if (ca1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (uu0.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        se.h("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i = 0;
                }
                mu0 value = ca1Var.value();
                if (parameterTypes.length > 1) {
                    if (mu0.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == mu0.ON_ANY) {
                            i = 2;
                        } else {
                            se.h("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        se.h("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new en(method, i), value, cls);
                    z = true;
                } else {
                    se.h("cannot have more than 2 params");
                    return null;
                }
            }
        }
        dn dnVar3 = new dn(hashMap);
        hashMap2.put(cls, dnVar3);
        this.b.put(cls, Boolean.valueOf(z));
        return dnVar3;
    }
}
