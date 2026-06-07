package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ak extends pg {
    public pl a;
    public oe0 b;

    @Override // defpackage.pg
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.pg
    public final void b(Throwable th) {
        pl plVar = this.a;
        if (plVar != null) {
            plVar.resumeWith(io.s(th));
        }
    }
}
