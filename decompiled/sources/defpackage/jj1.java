package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class jj1 {
    public static final tm1 a = new Object();
    public static final Object b = new Object();
    public static wc0 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return f1.b(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static wc0 b() {
        wc0 wc0Var = new wc0(27);
        c = wc0Var;
        tm1 tm1Var = a;
        tm1Var.getClass();
        if (o0.j.x(tm1Var, null, wc0Var)) {
            o0.b(tm1Var);
        }
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:34|35|36|(2:76|77)(1:38)|39|(9:46|(1:50)|(1:57)|58|(2:66|67)|62|63|64|65)|(1:73)(1:(1:75))|(1:50)|(3:52|55|57)|58|(1:60)|66|67|62|63|64|65) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj1.c(android.content.Context, boolean):void");
    }
}
