package retrofit2;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import retrofit2.BuiltInFactories;
import retrofit2.Reflection;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
final class Platform {
    static final BuiltInFactories builtInFactories;

    @Nullable
    static final Executor callbackExecutor;
    static final Reflection reflection;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (!property.equals("RoboVM")) {
            if (!property.equals("Dalvik")) {
                callbackExecutor = null;
                reflection = new Reflection.Java8();
                builtInFactories = new BuiltInFactories.Java8();
                return;
            } else {
                callbackExecutor = new AndroidMainExecutor();
                reflection = new Reflection.Android24();
                builtInFactories = new BuiltInFactories.Java8();
                return;
            }
        }
        callbackExecutor = null;
        reflection = new Reflection();
        builtInFactories = new BuiltInFactories();
    }

    private Platform() {
    }
}
