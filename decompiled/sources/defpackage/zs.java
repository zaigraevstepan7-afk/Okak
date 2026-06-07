package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zs implements InvocationHandler {
    public final cn a;
    public final n80 b;

    public zs(cn cnVar, n80 n80Var) {
        this.a = cnVar;
        this.b = n80Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean r = sn0.r(method.getName(), "accept");
        n80 n80Var = this.b;
        boolean z = false;
        if (r && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            cn cnVar = this.a;
            if (cnVar.e(obj2)) {
                obj2.getClass();
                n80Var.invoke(obj2);
                return od2.a;
            }
            throw new ClassCastException("Value cannot be cast to " + cnVar.c());
        }
        if (sn0.r(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            if (obj == objArr[0]) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (sn0.r(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(n80Var.hashCode());
        }
        if (sn0.r(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return n80Var.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
