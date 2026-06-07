package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qw1 implements q10 {
    public final sw1 e;
    public final long f;
    public final Object g;
    public final pl h;

    public qw1(sw1 sw1Var, long j, Object obj, pl plVar) {
        this.e = sw1Var;
        this.f = j;
        this.g = obj;
        this.h = plVar;
    }

    @Override // defpackage.q10
    public final void a() {
        sw1 sw1Var = this.e;
        synchronized (sw1Var) {
            if (this.f < sw1Var.o()) {
                return;
            }
            Object[] objArr = sw1Var.l;
            objArr.getClass();
            long j = this.f;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            fc2.o(objArr, j, fc2.C);
            sw1Var.j();
        }
    }
}
