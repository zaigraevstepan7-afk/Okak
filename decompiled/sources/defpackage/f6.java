package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f6 extends cq0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ se0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(q5 q5Var, ka kaVar, se0 se0Var) {
        super(2);
        this.e = 0;
        this.f = q5Var;
        this.g = kaVar;
        this.h = se0Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        se0 se0Var = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    is.a((q5) obj4, (ka) obj3, se0Var, urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                ((Number) obj2).intValue();
                bf.c((de0) obj4, (z00) obj3, (fq) se0Var, (ur) obj, lo.b0(385));
                return od2Var;
            default:
                ((Number) obj2).intValue();
                is.a((jc1) obj4, (ka) obj3, se0Var, (ur) obj, lo.b0(1));
                return od2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(Object obj, Object obj2, se0 se0Var, int i, int i2) {
        super(2);
        this.e = i2;
        this.f = obj;
        this.g = obj2;
        this.h = se0Var;
    }
}
