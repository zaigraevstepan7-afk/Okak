package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class og1 {
    public static final Method a;
    public static final Method b;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 < length) {
                method2 = methods[i2];
                if (sn0.r(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 1) {
                        cls = parameterTypes[0];
                    } else {
                        cls = null;
                    }
                    if (sn0.r(cls, Throwable.class)) {
                        break;
                    }
                }
                i2++;
            } else {
                method2 = null;
                break;
            }
        }
        a = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            Method method3 = methods[i];
            if (sn0.r(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        b = method;
    }
}
