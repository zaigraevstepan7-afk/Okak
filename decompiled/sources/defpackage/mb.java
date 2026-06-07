package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mb extends cq0 implements oe0 {
    public final /* synthetic */ ob e;
    public final /* synthetic */ ig1 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(ob obVar, ig1 ig1Var, long j) {
        super(1);
        this.e = obVar;
        this.f = ig1Var;
        this.g = j;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        i3 i3Var = this.e.u.b;
        hg1.j((hg1) obj, this.f, i3Var.a((r0.f & 4294967295L) | (r0.e << 32), this.g, jq0.e));
        return od2.a;
    }
}
