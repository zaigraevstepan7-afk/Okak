package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class op implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ yp f;

    public /* synthetic */ op(yp ypVar, int i) {
        this.e = i;
        this.f = ypVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, a71] */
    @Override // defpackage.de0
    public final Object invoke() {
        Bundle bundle;
        int i = this.e;
        yp ypVar = this.f;
        switch (i) {
            case 0:
                ypVar.reportFullyDrawn();
                return od2.a;
            case 1:
                return new ce0(ypVar.j, new op(ypVar, 0));
            case 2:
                ?? obj = new Object();
                ypVar.b().b.d(obj);
                return obj;
            case 3:
                Application application = ypVar.getApplication();
                if (ypVar.getIntent() != null) {
                    bundle = ypVar.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new dr1(application, ypVar, bundle);
            default:
                y91 y91Var = new y91(new r5(ypVar, 3));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!sn0.r(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new n6(2, ypVar, y91Var));
                    } else {
                        ypVar.e.a(new pp(y91Var, ypVar));
                    }
                }
                return y91Var;
        }
    }
}
