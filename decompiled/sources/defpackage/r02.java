package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r02 extends w22 {
    public float c;

    public r02(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.w22
    public final void a(w22 w22Var) {
        w22Var.getClass();
        this.c = ((r02) w22Var).c;
    }

    @Override // defpackage.w22
    public final w22 b(long j) {
        return new r02(j, this.c);
    }
}
