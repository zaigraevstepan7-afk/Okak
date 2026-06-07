package defpackage;

import android.app.Activity;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bt {
    public final ClassLoader a;

    public bt(ClassLoader classLoader, int i) {
        switch (i) {
            case 1:
                this.a = classLoader;
                return;
            default:
                classLoader.getClass();
                this.a = classLoader;
                return;
        }
    }

    public at a(Object obj, cn cnVar, Activity activity, n80 n80Var) {
        zs zsVar = new zs(cnVar, n80Var);
        ClassLoader classLoader = this.a;
        Class<?> loadClass = classLoader.loadClass("java.util.function.Consumer");
        loadClass.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{loadClass}, zsVar);
        newProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> loadClass2 = classLoader.loadClass("java.util.function.Consumer");
        loadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, loadClass2).invoke(obj, activity, newProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> loadClass3 = classLoader.loadClass("java.util.function.Consumer");
        loadClass3.getClass();
        return new at(cls2.getMethod("removeWindowLayoutInfoListener", loadClass3), obj, newProxyInstance);
    }
}
