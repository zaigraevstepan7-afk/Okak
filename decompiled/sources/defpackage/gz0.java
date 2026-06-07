package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class gz0 {
    public static final mg0 a;

    /* JADX WARN: Type inference failed for: r0v4, types: [d7, java.lang.Object] */
    static {
        String str;
        int i = j52.a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = mv1.H(mv1.E(Arrays.asList(new Object()).iterator())).iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    ((d7) obj).getClass();
                    do {
                        ((d7) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((d7) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    a = new mg0(ng0.a(mainLooper));
                    return;
                } else {
                    se.p("The main looper is not available");
                    return;
                }
            }
            se.p("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
