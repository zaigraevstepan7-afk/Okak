package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jq1 {
    public final ClassLoader a;
    public final bt b;
    public final bt c;

    public jq1(ClassLoader classLoader, bt btVar) {
        this.a = classLoader;
        this.b = btVar;
        this.c = new bt(classLoader, 1);
    }

    public static final boolean d(jq1 jq1Var) {
        Class<?> loadClass = jq1Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        loadClass.getClass();
        Method method = loadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (Modifier.isPublic(method.getModifiers())) {
            method2.getClass();
            if (Modifier.isPublic(method2.getModifiers())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final WindowLayoutComponent a() {
        int a;
        bt btVar = this.c;
        btVar.getClass();
        boolean z = false;
        try {
            btVar.a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (vn.Q("WindowExtensionsProvider#getWindowExtensions is not valid", new vm1(btVar, 1)) && vn.Q("WindowExtensions#getWindowLayoutComponent is not valid", new iq1(this, 0)) && vn.Q("FoldingFeature class is not valid", new iq1(this, 1)) && (a = s80.a()) >= 1) {
                if (a == 1) {
                    z = b();
                } else if (a < 5) {
                    z = c();
                } else if (c() && vn.Q("DisplayFoldFeature is not valid", new iq1(this, 3)) && vn.Q("SupportedWindowFeatures is not valid", new iq1(this, 2)) && vn.Q("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new iq1(this, 4))) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return vn.Q("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new iq1(this, 5));
    }

    public final boolean c() {
        if (b()) {
            if (vn.Q("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new iq1(this, 6))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
