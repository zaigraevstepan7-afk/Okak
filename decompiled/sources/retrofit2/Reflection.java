package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
class Reflection {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class Android24 extends Reflection {
        @Override // retrofit2.Reflection
        public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        public boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Java8 extends Reflection {
        @Override // retrofit2.Reflection
        public String describeMethodParameter(Method method, int i) {
            Parameter parameter = method.getParameters()[i];
            if (parameter.isNamePresent()) {
                return "parameter '" + parameter.getName() + '\'';
            }
            return super.describeMethodParameter(method, i);
        }

        @Override // retrofit2.Reflection
        public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        public boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    public String describeMethodParameter(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    @Nullable
    public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) {
        throw new AssertionError();
    }

    public boolean isDefaultMethod(Method method) {
        return false;
    }
}
