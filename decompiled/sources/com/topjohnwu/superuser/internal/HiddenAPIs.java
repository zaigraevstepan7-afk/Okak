package com.topjohnwu.superuser.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.IBinder;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class HiddenAPIs {
    public static final int FLAG_RECEIVER_FROM_SHELL = 4194304;
    private static Method addService;
    private static Method attachBaseContext;
    private static Method setAppName;

    static {
        Class<?> cls = Integer.TYPE;
        try {
            Class<?> cls2 = Class.forName("android.os.ServiceManager");
            try {
                addService = cls2.getDeclaredMethod("addService", String.class, IBinder.class, Boolean.TYPE, cls);
            } catch (NoSuchMethodException unused) {
            }
            if (addService == null) {
                addService = cls2.getDeclaredMethod("addService", String.class, IBinder.class);
            }
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            attachBaseContext = declaredMethod;
            declaredMethod.setAccessible(true);
            setAppName = Class.forName("android.ddm.DdmHandleAppName").getDeclaredMethod("setAppName", String.class, cls);
        } catch (ReflectiveOperationException e) {
            Utils.err("IPC", e);
        }
    }

    public static void addService(String str, IBinder iBinder) {
        try {
            if (addService.getParameterTypes().length == 4) {
                addService.invoke(null, str, iBinder, Boolean.FALSE, 0);
            } else {
                addService.invoke(null, str, iBinder);
            }
        } catch (ReflectiveOperationException e) {
            Utils.err("IPC", e);
        }
    }

    public static void attachBaseContext(Object obj, Context context) {
        if (obj instanceof ContextWrapper) {
            try {
                attachBaseContext.invoke(obj, context);
            } catch (ReflectiveOperationException unused) {
            }
        }
    }

    public static void setAppName(String str) {
        try {
            setAppName.invoke(null, str, 0);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
}
