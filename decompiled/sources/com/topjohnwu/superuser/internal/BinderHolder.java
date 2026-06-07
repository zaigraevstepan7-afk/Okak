package com.topjohnwu.superuser.internal;

import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class BinderHolder implements IBinder.DeathRecipient {
    private final IBinder binder;

    public BinderHolder(IBinder iBinder) {
        this.binder = iBinder;
        iBinder.linkToDeath(this, 0);
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.binder.unlinkToDeath(this, 0);
        UiThreadHandler.run(new a(this, 0));
    }

    public abstract void onBinderDied();
}
