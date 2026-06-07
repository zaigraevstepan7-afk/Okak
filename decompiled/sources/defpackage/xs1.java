package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xs1 extends q42 implements se0 {
    public at1 f;
    public vl1 g;
    public long h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ at1 k;
    public final /* synthetic */ vl1 l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs1(at1 at1Var, vl1 vl1Var, long j, vt vtVar) {
        super(2, vtVar);
        this.k = at1Var;
        this.l = vl1Var;
        this.m = j;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        xs1 xs1Var = new xs1(this.k, this.l, this.m, vtVar);
        xs1Var.j = obj;
        return xs1Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((xs1) create((ys1) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        at1 at1Var;
        float c;
        vl1 vl1Var;
        at1 at1Var2;
        long j;
        long a;
        int i = this.i;
        sb1 sb1Var = sb1.f;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                j = this.h;
                vl1Var = this.g;
                at1Var = this.f;
                at1Var2 = (at1) this.j;
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            ys1 ys1Var = (ys1) this.j;
            at1Var = this.k;
            f4 f4Var = new f4(i2, at1Var, ys1Var);
            z90 z90Var = at1Var.c;
            vl1 vl1Var2 = this.l;
            long j2 = vl1Var2.e;
            sb1 sb1Var2 = at1Var.d;
            long j3 = this.m;
            if (sb1Var2 == sb1Var) {
                c = ye2.b(j3);
            } else {
                c = ye2.c(j3);
            }
            float d = at1Var.d(c);
            this.j = at1Var;
            this.f = at1Var;
            this.g = vl1Var2;
            this.h = j2;
            this.i = 1;
            obj = z90Var.a(f4Var, d, this);
            hv hvVar = hv.e;
            if (obj == hvVar) {
                return hvVar;
            }
            vl1Var = vl1Var2;
            at1Var2 = at1Var;
            j = j2;
        }
        float d2 = at1Var2.d(((Number) obj).floatValue());
        if (at1Var.d == sb1Var) {
            a = ye2.a(j, d2, 0.0f, 2);
        } else {
            a = ye2.a(j, 0.0f, d2, 1);
        }
        vl1Var.e = a;
        return od2.a;
    }
}
