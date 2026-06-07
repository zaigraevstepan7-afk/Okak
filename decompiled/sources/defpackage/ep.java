package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ep implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ b82 f;
    public final /* synthetic */ fq g;
    public final /* synthetic */ int h;

    public /* synthetic */ ep(b82 b82Var, fq fqVar, int i, int i2) {
        this.e = i2;
        this.f = b82Var;
        this.g = fqVar;
        this.h = i;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        int i2 = this.h;
        fq fqVar = this.g;
        b82 b82Var = this.f;
        ur urVar = (ur) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                fp.a(b82Var, fqVar, urVar, lo.b0(i2 | 1));
                return od2Var;
            default:
                hp.a(b82Var, fqVar, urVar, lo.b0(i2 | 1));
                return od2Var;
        }
    }
}
