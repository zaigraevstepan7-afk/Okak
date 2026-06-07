package defpackage;

import android.content.ComponentName;
import com.topjohnwu.superuser.internal.RootServiceServer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class gp1 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ RootServiceServer f;
    public final /* synthetic */ ComponentName g;

    public /* synthetic */ gp1(RootServiceServer rootServiceServer, ComponentName componentName, int i) {
        this.e = i;
        this.f = rootServiceServer;
        this.g = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        ComponentName componentName = this.g;
        RootServiceServer rootServiceServer = this.f;
        switch (i) {
            case 0:
                rootServiceServer.lambda$selfStop$4(componentName);
                return;
            default:
                rootServiceServer.lambda$unbindService$5(componentName);
                return;
        }
    }
}
