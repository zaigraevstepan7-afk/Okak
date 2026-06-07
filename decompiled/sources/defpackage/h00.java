package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class h00 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ h00(ig1[] ig1VarArr, up1 up1Var, int i, int[] iArr) {
        this.e = 2;
        this.g = ig1VarArr;
        this.h = up1Var;
        this.f = i;
        this.i = iArr;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        sp1 sp1Var;
        ov ovVar;
        int a;
        int i2 = this.e;
        int i3 = 0;
        od2 od2Var = od2.a;
        Object obj2 = this.i;
        int i4 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        w82 w82Var = null;
        switch (i2) {
            case 0:
                cn0 cn0Var = (cn0) obj3;
                x31 x31Var = (x31) obj2;
                if (obj != ((j00) obj4)) {
                    if (obj instanceof u22) {
                        int i5 = cn0Var.a - i4;
                        int d = x31Var.d(obj);
                        if (d >= 0) {
                            i = x31Var.c[d];
                        } else {
                            i = Integer.MAX_VALUE;
                        }
                        x31Var.g(Math.min(i5, i), obj);
                        return od2Var;
                    }
                    return od2Var;
                }
                se.p("A derived state calculation cannot read itself");
                return null;
            case 1:
                ii0 ii0Var = (ii0) obj4;
                l01 l01Var = (l01) obj3;
                ig1 ig1Var = (ig1) obj2;
                hg1 hg1Var = (hg1) obj;
                int i6 = ii0Var.b;
                u72 u72Var = ii0Var.a;
                db2 db2Var = ii0Var.c;
                x82 x82Var = (x82) ii0Var.d.invoke();
                if (x82Var != null) {
                    w82Var = x82Var.a;
                }
                w82 w82Var2 = w82Var;
                if (l01Var.getLayoutDirection() == jq0.f) {
                    z = true;
                } else {
                    z = false;
                }
                u72Var.a(sb1.f, rp1.d(hg1Var, i6, db2Var, w82Var2, z, ig1Var.e), i4, ig1Var.e);
                hg1.k(hg1Var, ig1Var, Math.round(-u72Var.a.g()), 0);
                return od2Var;
            default:
                ig1[] ig1VarArr = (ig1[]) obj4;
                up1 up1Var = (up1) obj3;
                int[] iArr = (int[]) obj2;
                hg1 hg1Var2 = (hg1) obj;
                int length = ig1VarArr.length;
                int i7 = 0;
                while (i3 < length) {
                    ig1 ig1Var2 = ig1VarArr[i3];
                    int i8 = i7 + 1;
                    ig1Var2.getClass();
                    Object C = ig1Var2.C();
                    if (C instanceof sp1) {
                        sp1Var = (sp1) C;
                    } else {
                        sp1Var = null;
                    }
                    if (sp1Var != null) {
                        ovVar = sp1Var.c;
                    } else {
                        ovVar = null;
                    }
                    if (ovVar != null) {
                        a = ovVar.b.a(ig1Var2.f, i4, jq0.e);
                    } else {
                        a = up1Var.b.a(ig1Var2.f, i4);
                    }
                    hg1.i(hg1Var2, ig1Var2, iArr[i7], a);
                    i3++;
                    i7 = i8;
                }
                return od2Var;
        }
    }

    public /* synthetic */ h00(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.f = i;
    }
}
