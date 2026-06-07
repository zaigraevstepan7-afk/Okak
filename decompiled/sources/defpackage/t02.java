package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t02 extends w22 {
    public long c;

    public t02(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.w22
    public final void a(w22 w22Var) {
        w22Var.getClass();
        this.c = ((t02) w22Var).c;
    }

    @Override // defpackage.w22
    public final w22 b(long j) {
        return new t02(j, this.c);
    }
}
