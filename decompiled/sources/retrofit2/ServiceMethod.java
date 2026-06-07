package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
abstract class ServiceMethod<T> {
    public static <T> ServiceMethod<T> parseAnnotations(Retrofit retrofit, Class<?> cls, Method method) {
        RequestFactory parseAnnotations = RequestFactory.parseAnnotations(retrofit, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!Utils.hasUnresolvableType(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                return HttpServiceMethod.parseAnnotations(retrofit, method, parseAnnotations);
            }
            throw Utils.methodError(method, "Service methods cannot return void.", new Object[0]);
        }
        throw Utils.methodError(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
    }

    @Nullable
    public abstract T invoke(Object obj, Object[] objArr);
}
