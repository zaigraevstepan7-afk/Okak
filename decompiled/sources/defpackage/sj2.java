package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class sj2 implements xu0, bf0 {
    public final /* synthetic */ xr a;

    public sj2(xr xrVar) {
        this.a = xrVar;
    }

    @Override // defpackage.bf0
    public final af0 b() {
        return new df0(1, 0, xr.class, this.a, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xu0) && (obj instanceof bf0)) {
            return b().equals(((bf0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
