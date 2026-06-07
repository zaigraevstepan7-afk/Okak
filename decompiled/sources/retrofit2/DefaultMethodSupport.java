package retrofit2;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
final class DefaultMethodSupport {

    @Nullable
    private static Constructor<MethodHandles.Lookup> lookupConstructor;

    private DefaultMethodSupport() {
    }

    @Nullable
    public static Object invoke(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) {
        Constructor<MethodHandles.Lookup> constructor = lookupConstructor;
        if (constructor == null) {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            lookupConstructor = constructor;
        }
        return constructor.newInstance(cls, -1).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
