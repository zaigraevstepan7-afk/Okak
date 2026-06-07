package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class co0 extends jo0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(co0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final k i;

    public co0(k kVar) {
        this.i = kVar;
    }

    @Override // defpackage.jo0
    public final boolean k() {
        return true;
    }

    @Override // defpackage.jo0
    public final void l(Throwable th) {
        if (j.compareAndSet(this, 0, 1)) {
            this.i.invoke(th);
        }
    }
}
