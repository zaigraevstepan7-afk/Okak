package com.topjohnwu.superuser.internal;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((BinderHolder) obj).onBinderDied();
                return;
            default:
                ShellImpl.b((ShellImpl) obj);
                return;
        }
    }
}
