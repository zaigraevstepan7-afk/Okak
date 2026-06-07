package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qn implements AutoCloseable, gv {
    public final xu e;

    public qn(xu xuVar) {
        xuVar.getClass();
        this.e = xuVar;
    }

    @Override // defpackage.gv
    public final xu A() {
        return this.e;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        lo.o(this.e, null);
    }
}
