package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.fl0;
import defpackage.l60;
import defpackage.ld;
import defpackage.mu0;
import defpackage.ou0;
import defpackage.pu0;
import defpackage.se;
import defpackage.xi1;
import defpackage.yi1;
import defpackage.yq1;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lfl0;", "Luu0;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements fl0 {
    @Override // defpackage.fl0
    public final Object create(Context context) {
        context.getClass();
        ld j = ld.j(context);
        j.getClass();
        if (((HashSet) j.g).contains(ProcessLifecycleInitializer.class)) {
            if (!pu0.a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new ou0());
            }
            yi1 yi1Var = yi1.l;
            yi1Var.getClass();
            yi1Var.i = new Handler();
            yi1Var.j.d(mu0.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new xi1(yi1Var));
            return yi1Var;
        }
        se.p("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        return null;
    }

    @Override // defpackage.fl0
    public final List dependencies() {
        return l60.e;
    }
}
