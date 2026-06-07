package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class eh implements vt, iv, Serializable {
    private final vt<Object> completion;

    public eh(vt vtVar) {
        this.completion = vtVar;
    }

    public vt<od2> create(vt<?> vtVar) {
        vtVar.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.iv
    public iv getCallerFrame() {
        vt<Object> vtVar = this.completion;
        if (vtVar instanceof iv) {
            return (iv) vtVar;
        }
        return null;
    }

    public final vt<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i2;
        qx qxVar = (qx) getClass().getAnnotation(qx.class);
        String str2 = null;
        if (qxVar == null || qxVar.v() < 1) {
            return null;
        }
        int i3 = -1;
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(this);
            if (obj2 instanceof Integer) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            i = i2 - 1;
        } catch (Exception unused) {
            i = -1;
        }
        if (i >= 0) {
            i3 = qxVar.l()[i];
        }
        ld ldVar = rx.m;
        ld ldVar2 = rx.n;
        if (ldVar2 == null) {
            try {
                ld ldVar3 = new ld(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 7);
                rx.n = ldVar3;
                ldVar2 = ldVar3;
            } catch (Exception unused2) {
                rx.n = ldVar;
                ldVar2 = ldVar;
            }
        }
        if (ldVar2 != ldVar && (method = (Method) ldVar2.f) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) ldVar2.g) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) ldVar2.h;
            if (method3 != null) {
                obj = method3.invoke(invoke2, null);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        if (str2 == null) {
            str = qxVar.c();
        } else {
            str = str2 + '/' + qxVar.c();
        }
        return new StackTraceElement(str, qxVar.m(), qxVar.f(), i3);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [vt<java.lang.Object>, java.lang.Object, vt] */
    @Override // defpackage.vt
    public final void resumeWith(Object obj) {
        while (true) {
            eh ehVar = this;
            ?? r0 = ehVar.completion;
            r0.getClass();
            try {
                obj = ehVar.invokeSuspend(obj);
                if (obj == hv.e) {
                    return;
                }
            } catch (Throwable th) {
                obj = new fo1(th);
            }
            ehVar.releaseIntercepted();
            if (r0 instanceof eh) {
                this = r0;
            } else {
                r0.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public vt<od2> create(Object obj, vt<?> vtVar) {
        vtVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
