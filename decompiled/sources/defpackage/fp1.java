package defpackage;

import android.content.ComponentName;
import com.topjohnwu.superuser.internal.RootServiceServer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class fp1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ RootServiceServer f;
    public final /* synthetic */ ComponentName g;
    public final /* synthetic */ int h;

    public /* synthetic */ fp1(RootServiceServer rootServiceServer, ComponentName componentName, int i, int i2) {
        this.e = i2;
        this.f = rootServiceServer;
        this.g = componentName;
        this.h = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        int i2 = this.h;
        ComponentName componentName = this.g;
        RootServiceServer rootServiceServer = this.f;
        switch (i) {
            case 0:
                RootServiceServer.f(rootServiceServer, componentName, i2);
                return;
            default:
                RootServiceServer.a(rootServiceServer, componentName, i2);
                return;
        }
    }
}
