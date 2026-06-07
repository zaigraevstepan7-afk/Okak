package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gu0 {
    public final je1 A;
    public final je1 B;
    public z62 a;
    public final dl1 b;
    public final f12 c;
    public final sl0 d;
    public r82 e;
    public final je1 f;
    public final je1 g;
    public iq0 h;
    public final je1 i;
    public rc j;
    public final je1 k;
    public final je1 l;
    public final je1 m;
    public final je1 n;
    public final je1 o;
    public boolean p;
    public final je1 q;
    public final tp0 r;
    public final je1 s;
    public final je1 t;
    public oe0 u;
    public final fu v;
    public final fu w;
    public final fu x;
    public final f8 y;
    public long z;

    /* JADX WARN: Type inference failed for: r8v1, types: [sl0, java.lang.Object] */
    public gu0(z62 z62Var, dl1 dl1Var, f12 f12Var) {
        this.a = z62Var;
        this.b = dl1Var;
        this.c = f12Var;
        ?? obj = new Object();
        rc rcVar = sc.a;
        long j = d92.b;
        i82 i82Var = new i82(rcVar, j, (d92) null);
        obj.e = i82Var;
        obj.f = new i50(rcVar, i82Var.b);
        this.d = obj;
        Boolean bool = Boolean.FALSE;
        this.f = fr1.k(bool);
        this.g = fr1.k(new f20(0.0f));
        this.i = fr1.k(null);
        this.k = fr1.k(jg0.e);
        this.l = fr1.k(bool);
        this.m = fr1.k(bool);
        this.n = fr1.k(bool);
        this.o = fr1.k(bool);
        this.p = true;
        this.q = fr1.k(Boolean.TRUE);
        this.r = new tp0(f12Var);
        this.s = fr1.k(bool);
        this.t = fr1.k(bool);
        this.u = new mm0(12);
        this.v = new fu(this, 2);
        this.w = new fu(this, 3);
        this.x = new fu(this, 4);
        this.y = fc2.j();
        this.z = co.g;
        this.A = fr1.k(new d92(j));
        this.B = fr1.k(new d92(j));
    }

    public final jg0 a() {
        return (jg0) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final iq0 c() {
        iq0 iq0Var = this.h;
        if (iq0Var != null && iq0Var.j()) {
            return iq0Var;
        }
        return null;
    }

    public final x82 d() {
        return (x82) this.i.getValue();
    }

    public final void e(long j) {
        this.B.setValue(new d92(j));
    }

    public final void f(long j) {
        this.A.setValue(new d92(j));
    }
}
