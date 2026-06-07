package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xf2 extends cq0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ hi0[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xf2(hi0[] hi0VarArr, int i) {
        super(2);
        this.e = i;
        this.f = hi0VarArr;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        hi0[] hi0VarArr = this.f;
        switch (i) {
            case 0:
                return Float.valueOf(xp1.e((hg1) obj, true, hi0VarArr, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(xp1.e((hg1) obj, false, hi0VarArr, ((Number) obj2).floatValue()));
        }
    }
}
