package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class md1 extends q42 implements se0 {
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ od1 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ float j;
    public final /* synthetic */ gc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md1(od1 od1Var, int i, float f, gc gcVar, vt vtVar) {
        super(2, vtVar);
        this.h = od1Var;
        this.i = i;
        this.j = f;
        this.k = gcVar;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        md1 md1Var = new md1(this.h, this.i, this.j, this.k, vtVar);
        md1Var.g = obj;
        return md1Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((md1) create((ds1) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        int i2 = this.f;
        od2 od2Var = od2.a;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                io.K(obj);
                return od2Var;
            }
            se.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        io.K(obj);
        ds1 ds1Var = (ds1) this.g;
        od1 od1Var = this.h;
        ot0 ot0Var = new ot0(ds1Var, od1Var, i3);
        this.f = 1;
        pd1 pd1Var = qd1.a;
        int i4 = this.i;
        od1Var.s.h(od1Var.k(new Integer(i4).intValue()));
        if (i4 > od1Var.e) {
            z = true;
        } else {
            z = false;
        }
        int e = (ot0Var.e() - od1Var.e) + 1;
        if (((z && i4 > ot0Var.e()) || (!z && i4 < od1Var.e)) && Math.abs(i4 - od1Var.e) >= 3) {
            if (z) {
                i = i4 - e;
                int i5 = od1Var.e;
                if (i < i5) {
                    i = i5;
                }
            } else {
                int i6 = e + i4;
                i = od1Var.e;
                if (i6 <= i) {
                    i = i6;
                }
            }
            ot0Var.f(i);
        }
        Object g = yq1.g(0.0f, ot0Var.b(i4) + this.j, this.k, new u2(25, new Object(), ot0Var), this, 4);
        hv hvVar = hv.e;
        if (g != hvVar) {
            g = od2Var;
        }
        if (g == hvVar) {
            return hvVar;
        }
        return od2Var;
    }
}
