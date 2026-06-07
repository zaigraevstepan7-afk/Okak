package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s02 extends w22 {
    public int c;

    public s02(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.w22
    public final void a(w22 w22Var) {
        w22Var.getClass();
        this.c = ((s02) w22Var).c;
    }

    @Override // defpackage.w22
    public final w22 b(long j) {
        return new s02(this.c, j);
    }
}
