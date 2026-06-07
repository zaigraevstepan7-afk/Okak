package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ff2 {
    public final ze a;
    public final ze b;
    public final ze c;

    public ff2(ze zeVar, ze zeVar2, ze zeVar3) {
        this.a = zeVar;
        this.b = zeVar2;
        this.c = zeVar3;
    }

    public abstract gf2 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        ze zeVar = this.c;
        Class cls2 = (Class) zeVar.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
            zeVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        ze zeVar = this.a;
        Method method = (Method) zeVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, ff2.class.getClassLoader()).getDeclaredMethod("read", ff2.class);
            zeVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        ze zeVar = this.b;
        Method method = (Method) zeVar.get(name);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, ff2.class);
            zeVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((gf2) this).e.readParcelable(gf2.class.getClassLoader());
    }

    public final hf2 g() {
        String readString = ((gf2) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (hf2) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(hf2 hf2Var) {
        if (hf2Var == null) {
            ((gf2) this).e.writeString(null);
            return;
        }
        try {
            ((gf2) this).e.writeString(b(hf2Var.getClass()).getName());
            gf2 a = a();
            try {
                d(hf2Var.getClass()).invoke(null, hf2Var, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(hf2Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
