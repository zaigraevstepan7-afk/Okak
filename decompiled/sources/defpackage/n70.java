package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n70 extends o70 {
    public final ga2 g;

    public n70(long j, ga2 ga2Var) {
        super(j);
        this.g = ga2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    @Override // defpackage.o70
    public final String toString() {
        return super.toString() + this.g;
    }
}
