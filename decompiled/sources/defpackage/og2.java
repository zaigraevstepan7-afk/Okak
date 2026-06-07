package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class og2 extends qg2 {
    public static og2 c;
    public static final wm1 d = new wm1(20);
    public final Application b;

    public og2(Application application) {
        this.b = application;
    }

    @Override // defpackage.qg2, defpackage.pg2
    public final kg2 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        se.v("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.qg2, defpackage.pg2
    public final kg2 b(Class cls, k31 k31Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) k31Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!na.class.isAssignableFrom(cls)) {
            return hp.r(cls);
        }
        se.h("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final kg2 d(Class cls, Application application) {
        if (na.class.isAssignableFrom(cls)) {
            try {
                kg2 kg2Var = (kg2) cls.getConstructor(Application.class).newInstance(application);
                kg2Var.getClass();
                return kg2Var;
            } catch (IllegalAccessException e) {
                se.k("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                se.k("Cannot create an instance of ", cls, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                se.k("Cannot create an instance of ", cls, e3);
                return null;
            } catch (InvocationTargetException e4) {
                se.k("Cannot create an instance of ", cls, e4);
                return null;
            }
        }
        return hp.r(cls);
    }
}
