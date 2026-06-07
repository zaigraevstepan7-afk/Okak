package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class az1 extends q42 implements te0 {
    public int f;
    public /* synthetic */ Object g;
    public /* synthetic */ long h;
    public final /* synthetic */ r31 i;
    public final /* synthetic */ dz1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az1(r31 r31Var, dz1 dz1Var, vt vtVar) {
        super(3, vtVar);
        this.i = r31Var;
        this.j = dz1Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((z81) obj2).a;
        az1 az1Var = new az1(this.i, this.j, (vt) obj3);
        az1Var.g = (qi1) obj;
        az1Var.h = j;
        return az1Var.invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        float intBitsToFloat;
        hn0 ri1Var;
        int i = this.f;
        si1 si1Var = null;
        r31 r31Var = this.i;
        hv hvVar = hv.e;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) this.g;
                    io.K(obj);
                    throw th;
                }
                io.K(obj);
                return od2.a;
            }
            si1Var = (si1) this.g;
            io.K(obj);
        } else {
            io.K(obj);
            qi1 qi1Var = (qi1) this.g;
            long j = this.h;
            si1 si1Var2 = new si1(j);
            try {
                r31Var.b(si1Var2);
                dz1 dz1Var = this.j;
                if (dz1Var.k == sb1.e) {
                    intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                } else if (dz1Var.h) {
                    intBitsToFloat = dz1Var.f.g() - Float.intBitsToFloat((int) (j >> 32));
                } else {
                    intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                }
                dz1Var.o.h(intBitsToFloat - dz1Var.n.g());
                this.g = si1Var2;
                this.f = 1;
                obj = qi1Var.e(this);
                if (obj != hvVar) {
                    si1Var = si1Var2;
                }
            } catch (Throwable th3) {
                th = th3;
                si1Var = si1Var2;
                if (si1Var != null) {
                    ri1 ri1Var2 = new ri1(si1Var);
                    this.g = th;
                    this.f = 3;
                    if (r31Var.a(ri1Var2, this) != hvVar) {
                        th = th;
                        throw th;
                    }
                    return hvVar;
                }
                throw th;
            }
            return hvVar;
        }
        if (((Boolean) obj).booleanValue()) {
            ri1Var = new ti1(si1Var);
        } else {
            ri1Var = new ri1(si1Var);
        }
        r31Var.b(ri1Var);
        return od2.a;
    }
}
