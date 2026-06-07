package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ag extends kg2 {
    public final of b;
    public final rw c;
    public final gx1 d;
    public final zu e;
    public final r22 f;
    public final yk1 g;
    public final r22 h;
    public final yk1 i;
    public final yk1 j;
    public final r22 k;
    public final yk1 l;
    public final r22 m;
    public final yk1 n;
    public final r22 o;
    public final yk1 p;
    public final r22 q;
    public final yk1 r;
    public final r22 s;
    public final yk1 t;
    public final r22 u;
    public final yk1 v;
    public final r22 w;
    public final yk1 x;

    public ag(of ofVar, rw rwVar, gx1 gx1Var) {
        vy vyVar = k10.a;
        ny nyVar = ny.g;
        ofVar.getClass();
        rwVar.getClass();
        gx1Var.getClass();
        nyVar.getClass();
        this.b = ofVar;
        this.c = rwVar;
        this.d = gx1Var;
        this.e = nyVar;
        r22 j = d6.j(rf.a);
        this.f = j;
        this.g = new yk1(j);
        r22 j2 = d6.j("");
        this.h = j2;
        this.i = new yk1(j2);
        zf zfVar = new zf(j2, 0);
        qn x = rx.x(this);
        m22 m22Var = new m22(5000L, Long.MAX_VALUE);
        Boolean bool = Boolean.FALSE;
        this.j = qo.c0(zfVar, x, m22Var, bool);
        r22 j3 = d6.j("external");
        this.k = j3;
        this.l = new yk1(j3);
        r22 j4 = d6.j(bool);
        this.m = j4;
        this.n = new yk1(j4);
        r22 j5 = d6.j(Boolean.TRUE);
        this.o = j5;
        this.p = new yk1(j5);
        r22 j6 = d6.j(pf.e);
        this.q = j6;
        this.r = new yk1(j6);
        r22 j7 = d6.j(1);
        this.s = j7;
        this.t = new yk1(j7);
        r22 j8 = d6.j(bool);
        this.u = j8;
        this.v = new yk1(j8);
        r22 j9 = d6.j(bool);
        this.w = j9;
        this.x = new yk1(j9);
        rx.C(rx.x(this), null, new vf(this, (vt) null, 0), 3);
    }

    public final void e() {
        r22 r22Var = this.q;
        r22Var.getClass();
        r22Var.k(null, pf.e);
        r22 r22Var2 = this.f;
        if (r22Var2.getValue() instanceof qf) {
            r22Var2.getClass();
            r22Var2.k(null, rf.a);
        }
    }

    public final void f(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!mp0.C(charAt)) {
                sb.append(charAt);
            }
        }
        String X = i32.X(64, sb.toString());
        r22 r22Var = this.h;
        r22Var.getClass();
        r22Var.k(null, X);
    }

    public final void g(boolean z) {
        if (((CharSequence) this.h.getValue()).length() == 0 || (this.f.getValue() instanceof sf)) {
            return;
        }
        rx.C(rx.x(this), this.e, new xf(this, z, null), 2);
    }
}
