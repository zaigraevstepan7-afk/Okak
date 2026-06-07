package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v02 extends w22 {
    public Object c;

    public v02(Object obj, long j) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.w22
    public final void a(w22 w22Var) {
        w22Var.getClass();
        this.c = ((v02) w22Var).c;
    }

    @Override // defpackage.w22
    public final w22 b(long j) {
        return new v02(this.c, q02.j().g());
    }
}
