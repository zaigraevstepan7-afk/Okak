package com.topjohnwu.superuser.internal;

import android.content.ServiceConnection;
import com.topjohnwu.superuser.internal.RootServiceManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                JobTask.a((JobTask) obj2, (ResultImpl) obj);
                return;
            case 1:
                RootServiceManager.c((ServiceConnection) obj2, (RootServiceManager.ServiceKey) obj);
                return;
            default:
                RootServiceManager.ConnectionRecord.a((RootServiceManager.ConnectionRecord) obj2, (ServiceConnection) obj);
                return;
        }
    }
}
