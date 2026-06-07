package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.CollectionDescriptorsKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cn implements to0, bn {
    public static final Map f;
    public final Class e;

    static {
        List F = xn.F(de0.class, oe0.class, se0.class, te0.class, ue0.class, ve0.class, we0.class, xe0.class, ye0.class, ze0.class, ee0.class, fe0.class, ge0.class, he0.class, ie0.class, je0.class, ke0.class, le0.class, me0.class, ne0.class, pe0.class, qe0.class, re0.class);
        ArrayList arrayList = new ArrayList(yn.a0(F, 10));
        int i = 0;
        for (Object obj : F) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new xd1((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                xn.U();
                throw null;
            }
        }
        f = tz0.e0(arrayList);
    }

    public cn(Class cls) {
        cls.getClass();
        this.e = cls;
    }

    @Override // defpackage.bn
    public final Class b() {
        return this.e;
    }

    public final String c() {
        String x;
        Class cls = this.e;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (x = bf.x(componentType.getName())) != null) {
                str = x.concat("Array");
            }
            if (str == null) {
                return CollectionDescriptorsKt.ARRAY_NAME;
            }
            return str;
        }
        String x2 = bf.x(cls.getName());
        if (x2 == null) {
            return cls.getCanonicalName();
        }
        return x2;
    }

    public final String d() {
        String b0;
        Class cls = this.e;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return i32.W(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return i32.W(simpleName, enclosingConstructor.getName() + '$');
            }
            int K = i32.K(simpleName, '$', 0, 6);
            if (K == -1) {
                return simpleName;
            }
            return simpleName.substring(K + 1, simpleName.length());
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (b0 = bf.b0(componentType.getName())) != null) {
                str = b0.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        }
        String b02 = bf.b0(cls.getName());
        if (b02 == null) {
            return cls.getSimpleName();
        }
        return b02;
    }

    public final boolean e(Object obj) {
        Class cls = this.e;
        cls.getClass();
        Map map = f;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return fc2.C(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = fp.E(yl1.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cn) && fp.E(this).equals(fp.E((to0) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return fp.E(this).hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
