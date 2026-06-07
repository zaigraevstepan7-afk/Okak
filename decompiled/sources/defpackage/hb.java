package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hb extends cq0 implements oe0 {
    public final /* synthetic */ ig1[] e;
    public final /* synthetic */ ib f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(ig1[] ig1VarArr, ib ibVar, int i, int i2) {
        super(1);
        this.e = ig1VarArr;
        this.f = ibVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        hg1 hg1Var = (hg1) obj;
        for (ig1 ig1Var : this.e) {
            if (ig1Var != null) {
                long a = this.f.a.b.a((ig1Var.e << 32) | (ig1Var.f & 4294967295L), (this.g << 32) | (this.h & 4294967295L), jq0.e);
                hg1.i(hg1Var, ig1Var, (int) (a >> 32), (int) (a & 4294967295L));
            }
        }
        return od2.a;
    }
}
