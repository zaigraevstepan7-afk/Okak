package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.internal.RootServiceManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Shell.GetShellCallback, RootServiceManager.Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.topjohnwu.superuser.internal.RootServiceManager.Predicate
    public boolean eval(RootServiceManager.RemoteServiceRecord remoteServiceRecord) {
        boolean lambda$onBinderDied$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                return ((RootServiceManager.RemoteServiceRecord) obj).equals(remoteServiceRecord);
            default:
                lambda$onBinderDied$0 = ((RootServiceManager.RemoteProcess) obj).lambda$onBinderDied$0(remoteServiceRecord);
                return lambda$onBinderDied$0;
        }
    }

    @Override // com.topjohnwu.superuser.Shell.GetShellCallback
    public void onShell(Shell shell) {
        ((PendingJob) this.b).lambda$submit0$0(shell);
    }
}
