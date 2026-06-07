package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class s61 implements se0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ e21 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ s61(fq fqVar, e21 e21Var, l40 l40Var, boolean z, long j, fq fqVar2, int i) {
        this.i = fqVar;
        this.f = e21Var;
        this.k = l40Var;
        this.g = z;
        this.h = j;
        this.j = fqVar2;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int b0 = lo.b0(196615);
                u61.c((fq) obj5, this.f, (l40) obj3, this.g, this.h, (fq) obj4, (ur) obj, b0);
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                int b02 = lo.b0(196609);
                ((ry1) obj5).a((r31) obj4, this.f, (my1) obj3, this.g, this.h, (ur) obj, b02);
                return od2Var;
        }
    }

    public /* synthetic */ s61(ry1 ry1Var, r31 r31Var, e21 e21Var, my1 my1Var, boolean z, long j, int i) {
        this.i = ry1Var;
        this.j = r31Var;
        this.f = e21Var;
        this.k = my1Var;
        this.g = z;
        this.h = j;
    }
}
