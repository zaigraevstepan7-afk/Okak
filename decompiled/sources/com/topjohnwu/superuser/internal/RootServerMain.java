package com.topjohnwu.superuser.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Looper;
import android.util.Log;
import defpackage.l90;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class RootServerMain extends ContextWrapper implements Callable<Object[]> {
    static final String CMDLINE_START_DAEMON = "daemon";
    static final String CMDLINE_START_SERVICE = "start";
    static final String CMDLINE_STOP_SERVICE = "stop";
    private static final Method attachBaseContext;
    private static final Method getService;
    private final boolean isDaemon;
    private final int uid;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class ResourcesWrapper extends Resources {
        public ResourcesWrapper(Resources resources) {
            super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
            Method declaredMethod = Resources.class.getDeclaredMethod("getImpl", null);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = Resources.class.getDeclaredMethod("setImpl", declaredMethod.getReturnType());
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(this, declaredMethod.invoke(resources, null));
        }

        @Override // android.content.res.Resources
        public boolean getBoolean(int i) {
            try {
                return super.getBoolean(i);
            } catch (Resources.NotFoundException unused) {
                return false;
            }
        }
    }

    static {
        try {
            getService = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            attachBaseContext = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r12 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        java.lang.System.exit(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r12 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r12 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x002e, code lost:
    
        if (r12.equals(com.topjohnwu.superuser.internal.RootServerMain.CMDLINE_START_SERVICE) == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0046. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RootServerMain(java.lang.String[] r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topjohnwu.superuser.internal.RootServerMain.<init>(java.lang.String[]):void");
    }

    public static String getServiceName(String str) {
        return l90.l("libsu-", str);
    }

    public static Context getSystemContext() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            return (Context) cls.getMethod("getSystemContext", null).invoke(cls.getMethod("systemMain", null).invoke(null, null), null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] strArr) {
        System.out.close();
        System.err.close();
        if (strArr.length < 3) {
            System.exit(1);
        }
        Looper.prepareMainLooper();
        try {
            new RootServerMain(strArr);
        } catch (Exception e) {
            Log.e("IPC", "Error in IPCMain", e);
            System.exit(1);
        }
        Looper.loop();
        System.exit(1);
    }

    @Override // java.util.concurrent.Callable
    public Object[] call() {
        return new Object[]{Integer.valueOf(this.uid), Boolean.valueOf(this.isDaemon)};
    }
}
