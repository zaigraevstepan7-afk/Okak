package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d41 extends eo1 implements se0 {
    public if0 e;
    public e41 f;
    public long[] g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ e41 k;
    public final /* synthetic */ if0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d41(e41 e41Var, if0 if0Var, vt vtVar) {
        super(2, vtVar);
        this.k = e41Var;
        this.l = if0Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        d41 d41Var = new d41(this.k, this.l, vtVar);
        d41Var.j = obj;
        return d41Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((d41) create((lv1) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        lv1 lv1Var;
        e41 e41Var;
        long[] jArr;
        int i;
        if0 if0Var;
        int i2 = this.i;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.h;
                jArr = this.g;
                e41Var = this.f;
                if0Var = this.e;
                lv1Var = (lv1) this.j;
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            lv1Var = (lv1) this.j;
            e41Var = this.k;
            c41 c41Var = e41Var.f;
            jArr = c41Var.c;
            i = c41Var.e;
            if0Var = this.l;
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
            if0Var.f = i;
            Object obj2 = e41Var.f.b[i];
            this.j = lv1Var;
            this.e = if0Var;
            this.f = e41Var;
            this.g = jArr;
            this.h = i3;
            this.i = 1;
            lv1Var.b(this, obj2);
            return hv.e;
        }
        return od2.a;
    }
}
