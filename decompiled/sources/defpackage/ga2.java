package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ga2 extends vr1 implements Runnable {
    public final long i;

    public ga2(long j, wt wtVar) {
        super(wtVar, wtVar.getContext());
        this.i = j;
    }

    @Override // defpackage.no0
    public final String T() {
        return super.T() + "(timeMillis=" + this.i + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        fp.z(this.g);
        u(new fa2("Timed out waiting for " + this.i + " ms", this));
    }
}
