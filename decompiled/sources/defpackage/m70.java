package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m70 extends o70 {
    public final pl g;
    public final /* synthetic */ q70 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m70(q70 q70Var, long j, pl plVar) {
        super(j);
        this.h = q70Var;
        this.g = plVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.C(this.h);
    }

    @Override // defpackage.o70
    public final String toString() {
        return super.toString() + this.g;
    }
}
