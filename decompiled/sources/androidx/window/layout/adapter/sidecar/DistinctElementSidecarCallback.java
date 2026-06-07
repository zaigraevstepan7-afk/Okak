package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.ox1;
import defpackage.px1;
import defpackage.sn0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState b;
    public final px1 d;
    public final SidecarInterface.SidecarCallback e;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public DistinctElementSidecarCallback(px1 px1Var, SidecarInterface.SidecarCallback sidecarCallback) {
        this.d = px1Var;
        this.e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x001f, code lost:
    
        if (defpackage.ox1.b(r2) == defpackage.ox1.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r3.a
            monitor-enter(r0)
            px1 r1 = r3.d     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarDeviceState r2 = r3.b     // Catch: java.lang.Throwable -> L23
            r1.getClass()     // Catch: java.lang.Throwable -> L23
            boolean r1 = defpackage.sn0.r(r2, r4)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L14
            goto L21
        L14:
            if (r2 != 0) goto L17
            goto L25
        L17:
            int r1 = defpackage.ox1.b(r2)     // Catch: java.lang.Throwable -> L23
            int r2 = defpackage.ox1.b(r4)     // Catch: java.lang.Throwable -> L23
            if (r1 != r2) goto L25
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r3 = move-exception
            goto L2e
        L25:
            r3.b = r4     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            androidx.window.sidecar.SidecarInterface$SidecarCallback r3 = r3.e
            r3.onDeviceStateChanged(r4)
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean b;
        synchronized (this.a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.c.get(iBinder);
                this.d.getClass();
                if (sn0.r(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    b = true;
                } else {
                    if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                        b = px1.b(ox1.c(sidecarWindowLayoutInfo2), ox1.c(sidecarWindowLayoutInfo));
                    }
                    b = false;
                }
                if (b) {
                    return;
                }
                this.c.put(iBinder, sidecarWindowLayoutInfo);
                this.e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } finally {
            }
        }
    }
}
