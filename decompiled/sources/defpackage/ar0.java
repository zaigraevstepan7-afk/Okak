package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ar0 implements yq, kc1, lr {
    public static final dp1 T = new dp1("Undefined intrinsics block and it is required", 1);
    public static final vq0 U = new Object();
    public static final d9 V = new d9(5);
    public j01 A;
    public sl0 B;
    public c00 C;
    public jq0 D;
    public hg2 E;
    public gs F;
    public yq0 G;
    public yq0 H;
    public boolean I;
    public final a81 J;
    public final er0 K;
    public nr0 L;
    public e81 M;
    public boolean N;
    public e21 O;
    public e21 P;
    public boolean Q;
    public int R;
    public boolean S;
    public final boolean e;
    public int f;
    public boolean g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public ar0 m;
    public int n;
    public final sl0 o;
    public q41 p;
    public boolean q;
    public ar0 r;
    public jc1 s;
    public int t;
    public boolean u;
    public boolean v;
    public mu1 w;
    public boolean x;
    public final q41 y;
    public boolean z;

    public ar0(boolean z, int i) {
        this.e = z;
        this.f = i;
        this.h = 9223372034707292159L;
        this.i = 0L;
        this.j = 9223372034707292159L;
        this.k = true;
        this.o = new sl0(new q41(new ar0[16]), new s8(this, 5));
        this.y = new q41(new ar0[16]);
        this.z = true;
        this.A = T;
        this.C = dr0.a;
        this.D = jq0.e;
        this.E = U;
        gs.c.getClass();
        this.F = fs.b;
        yq0 yq0Var = yq0.g;
        this.G = yq0Var;
        this.H = yq0Var;
        this.J = new a81(this);
        this.K = new er0(this);
        this.N = true;
        this.O = b21.a;
    }

    public static boolean Q(ar0 ar0Var) {
        us usVar;
        i01 i01Var = ar0Var.K.p;
        if (i01Var.n) {
            usVar = new us(i01Var.h);
        } else {
            usVar = null;
        }
        return ar0Var.P(usVar);
    }

    public static void V(ar0 ar0Var, boolean z, int i) {
        boolean z2;
        ar0 v;
        boolean z3 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if (ar0Var.m == null) {
            kl0.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        jc1 jc1Var = ar0Var.s;
        if (jc1Var != null && !ar0Var.u && !ar0Var.e) {
            ((q5) jc1Var).x(ar0Var, true, z, z2);
            if (z3) {
                zy0 zy0Var = ar0Var.K.q;
                zy0Var.getClass();
                er0 er0Var = zy0Var.j;
                ar0 v2 = er0Var.a.v();
                yq0 yq0Var = er0Var.a.G;
                if (v2 != null && yq0Var != yq0.g) {
                    while (v2.G == yq0Var && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int ordinal = yq0Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            if (v2.m != null) {
                                v2.U(z);
                                return;
                            } else {
                                v2.W(z);
                                return;
                            }
                        }
                        se.p("Intrinsics isn't used by the parent");
                        return;
                    }
                    if (v2.m != null) {
                        V(v2, z, 6);
                    } else {
                        X(v2, z, 6);
                    }
                }
            }
        }
    }

    public static void X(ar0 ar0Var, boolean z, int i) {
        boolean z2;
        boolean z3;
        jc1 jc1Var;
        ar0 v;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!ar0Var.u && !ar0Var.e && (jc1Var = ar0Var.s) != null) {
            ((q5) jc1Var).x(ar0Var, false, z, z2);
            if (z3) {
                er0 er0Var = ar0Var.K.p.j;
                ar0 v2 = er0Var.a.v();
                yq0 yq0Var = er0Var.a.G;
                if (v2 != null && yq0Var != yq0.g) {
                    while (v2.G == yq0Var && (v = v2.v()) != null) {
                        v2 = v;
                    }
                    int ordinal = yq0Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            v2.W(z);
                            return;
                        } else {
                            se.p("Intrinsics isn't used by the parent");
                            return;
                        }
                    }
                    X(v2, z, 6);
                }
            }
        }
    }

    public static void Y(ar0 ar0Var) {
        int i = zq0.a[ar0Var.K.d.ordinal()];
        er0 er0Var = ar0Var.K;
        if (i == 1) {
            if (er0Var.e) {
                V(ar0Var, true, 6);
                return;
            }
            if (er0Var.f) {
                ar0Var.U(true);
            }
            if (ar0Var.q()) {
                X(ar0Var, true, 6);
                return;
            } else {
                if (ar0Var.p()) {
                    ar0Var.W(true);
                    return;
                }
                return;
            }
        }
        se.g(er0Var.d, "Unexpected state ");
    }

    private final String j(ar0 ar0Var) {
        String str;
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(ar0Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        ar0 ar0Var2 = ar0Var.r;
        if (ar0Var2 != null) {
            str = ar0Var2.g(0);
        } else {
            str = null;
        }
        sb.append(str);
        return sb.toString();
    }

    public final void A(long j, ch0 ch0Var, int i, boolean z) {
        a81 a81Var = this.J;
        e81 e81Var = a81Var.d;
        io1 io1Var = e81.Q;
        a81Var.d.a1(e81.T, e81Var.S0(j), ch0Var, i, z);
    }

    public final void B(int i, ar0 ar0Var) {
        if (ar0Var.r != null && ar0Var.s != null) {
            kl0.b(j(ar0Var));
        }
        ar0Var.r = this;
        sl0 sl0Var = this.o;
        ((q41) sl0Var.e).a(i, ar0Var);
        ((s8) sl0Var.f).invoke();
        O();
        if (ar0Var.e) {
            this.n++;
        }
        G();
        jc1 jc1Var = this.s;
        if (jc1Var != null) {
            ar0Var.d(jc1Var);
        }
        if (ar0Var.K.l > 0) {
            er0 er0Var = this.K;
            er0Var.d(er0Var.l + 1);
        }
        if (ar0Var.R > 0) {
            c0(this.R + 1);
        }
    }

    public final void C() {
        ic1 ic1Var;
        if (this.N) {
            a81 a81Var = this.J;
            e81 e81Var = a81Var.c;
            e81 e81Var2 = a81Var.d.u;
            this.M = null;
            while (true) {
                if (sn0.r(e81Var, e81Var2)) {
                    break;
                }
                if (e81Var != null) {
                    ic1Var = e81Var.P;
                } else {
                    ic1Var = null;
                }
                if (ic1Var != null) {
                    this.M = e81Var;
                    break;
                } else if (e81Var != null) {
                    e81Var = e81Var.u;
                } else {
                    e81Var = null;
                }
            }
        }
        e81 e81Var3 = this.M;
        if (e81Var3 != null && e81Var3.P == null) {
            throw l90.f("layer was not set");
        }
        if (e81Var3 != null) {
            e81Var3.c1();
            return;
        }
        ar0 v = v();
        if (v != null) {
            v.C();
        }
    }

    public final void D() {
        a81 a81Var = this.J;
        e81 e81Var = a81Var.d;
        ql0 ql0Var = a81Var.c;
        while (e81Var != ql0Var) {
            e81Var.getClass();
            tq0 tq0Var = (tq0) e81Var;
            ic1 ic1Var = tq0Var.P;
            if (ic1Var != null) {
                ((vf0) ic1Var).c();
            }
            e81Var = tq0Var.t;
        }
        ic1 ic1Var2 = a81Var.c.P;
        if (ic1Var2 != null) {
            ((vf0) ic1Var2).c();
        }
    }

    public final void E() {
        if (this.e) {
            ar0 v = v();
            if (v != null) {
                v.E();
                return;
            }
            return;
        }
        if (this.m != null) {
            V(this, false, 7);
        } else {
            X(this, false, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, wl1] */
    public final void F() {
        if (this.x) {
            return;
        }
        if (this.J.b.j != null || this.P != null) {
            this.v = true;
            return;
        }
        mu1 mu1Var = this.w;
        this.x = true;
        ?? obj = new Object();
        obj.e = new mu1();
        lc1 snapshotObserver = ((q5) dr0.a(this)).getSnapshotObserver();
        f5 f5Var = new f5(7, this, obj);
        snapshotObserver.a.c(this, snapshotObserver.d, f5Var);
        this.x = false;
        this.w = (mu1) obj.e;
        this.v = false;
        q5 q5Var = (q5) dr0.a(this);
        q5Var.getSemanticsOwner().b(this, mu1Var);
        q5Var.z();
    }

    public final void G() {
        ar0 ar0Var;
        if (this.n > 0) {
            this.q = true;
        }
        if (this.e && (ar0Var = this.r) != null) {
            ar0Var.G();
        }
    }

    public final boolean H() {
        if (this.s != null) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        return this.K.p.w;
    }

    public final Boolean J() {
        boolean z;
        zy0 zy0Var = this.K.q;
        if (zy0Var != null) {
            if (zy0Var.u != xy0.g) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    public final void K() {
        ar0 v;
        if (this.G == yq0.g) {
            f();
        }
        zy0 zy0Var = this.K.q;
        zy0Var.getClass();
        boolean z = true;
        try {
            zy0Var.k = true;
            if (!zy0Var.p) {
                kl0.b("replace() called on item that was not placed");
            }
            zy0Var.F = false;
            if (zy0Var.u == xy0.g) {
                z = false;
            }
            zy0Var.B0(zy0Var.s, zy0Var.t);
            if (z && !zy0Var.F && (v = zy0Var.j.a.v()) != null) {
                v.U(false);
            }
            zy0Var.k = false;
        } catch (Throwable th) {
            zy0Var.k = false;
            throw th;
        }
    }

    public final void L(int i, int i2, int i3) {
        int i4;
        if (i == i2) {
            return;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            if (i > i2) {
                i4 = i + i5;
            } else {
                i4 = i;
            }
            int i6 = i > i2 ? i2 + i5 : (i2 + i3) - 2;
            sl0 sl0Var = this.o;
            q41 q41Var = (q41) sl0Var.e;
            s8 s8Var = (s8) sl0Var.f;
            Object k = q41Var.k(i4);
            s8Var.invoke();
            ((q41) sl0Var.e).a(i6, (ar0) k);
            s8Var.invoke();
        }
        O();
        G();
        E();
    }

    public final void M(ar0 ar0Var) {
        if (ar0Var.K.l > 0) {
            this.K.d(r0.l - 1);
        }
        if (this.s != null) {
            ar0Var.h();
        }
        ar0Var.r = null;
        if (ar0Var.R > 0) {
            c0(this.R - 1);
        }
        ar0Var.J.d.u = null;
        if (ar0Var.e) {
            this.n--;
            q41 q41Var = (q41) ar0Var.o.e;
            Object[] objArr = q41Var.e;
            int i = q41Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((ar0) objArr[i2]).J.d.u = null;
            }
        }
        G();
        O();
    }

    public final void N() {
        rl1 rectManager;
        this.k = true;
        jc1 jc1Var = this.s;
        if (jc1Var != null && (rectManager = ((q5) jc1Var).getRectManager()) != null) {
            rectManager.e(this);
        }
    }

    public final void O() {
        if (this.e) {
            ar0 v = v();
            if (v != null) {
                v.O();
                return;
            }
            return;
        }
        this.z = true;
    }

    public final boolean P(us usVar) {
        if (usVar != null) {
            if (this.G == yq0.g) {
                e();
            }
            return this.K.p.C0(usVar.a);
        }
        return false;
    }

    public final void R() {
        sl0 sl0Var = this.o;
        int i = ((q41) sl0Var.e).g;
        while (true) {
            i--;
            q41 q41Var = (q41) sl0Var.e;
            if (-1 < i) {
                M((ar0) q41Var.e[i]);
            } else {
                q41Var.g();
                ((s8) sl0Var.f).invoke();
                return;
            }
        }
    }

    public final void S(int i, int i2) {
        if (i2 < 0) {
            kl0.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            sl0 sl0Var = this.o;
            M((ar0) ((q41) sl0Var.e).e[i3]);
            Object k = ((q41) sl0Var.e).k(i3);
            ((s8) sl0Var.f).invoke();
            if (i3 != i) {
                i3--;
            } else {
                return;
            }
        }
    }

    public final void T() {
        ar0 v;
        if (this.G == yq0.g) {
            f();
        }
        i01 i01Var = this.K.p;
        er0 er0Var = i01Var.j;
        try {
            i01Var.k = true;
            if (!i01Var.o) {
                kl0.b("replace called on unplaced item");
            }
            boolean z = i01Var.w;
            i01Var.B0(i01Var.r, i01Var.t, i01Var.s);
            if (z && !i01Var.J && (v = er0Var.a.v()) != null) {
                v.W(false);
            }
        } finally {
        }
    }

    public final void U(boolean z) {
        jc1 jc1Var;
        if (!this.e && (jc1Var = this.s) != null) {
            ((q5) jc1Var).y(this, true, z);
        }
    }

    public final void W(boolean z) {
        jc1 jc1Var;
        if (!this.e && (jc1Var = this.s) != null) {
            ((q5) jc1Var).y(this, false, z);
        }
    }

    public final void Z() {
        q41 z = z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var = (ar0) objArr[i2];
            yq0 yq0Var = ar0Var.H;
            ar0Var.G = yq0Var;
            if (yq0Var != yq0.g) {
                ar0Var.Z();
            }
        }
    }

    @Override // defpackage.yq
    public final void a() {
        nr0 nr0Var = this.L;
        if (nr0Var != null) {
            nr0Var.a();
        }
        a81 a81Var = this.J;
        e81 e81Var = a81Var.c.t;
        for (e81 e81Var2 = a81Var.d; !sn0.r(e81Var2, e81Var) && e81Var2 != null; e81Var2 = e81Var2.t) {
            e81Var2.h1();
        }
    }

    public final void a0(Throwable th) {
        gs gsVar = this.F;
        y22 y22Var = cs.a;
        sf1 sf1Var = (sf1) gsVar;
        sf1Var.getClass();
        bs bsVar = (bs) xn.M(sf1Var, y22Var);
        if (bsVar != null) {
            qo.e0(th, new j1(9, bsVar, this));
            throw th;
        }
        throw th;
    }

    @Override // defpackage.yq
    public final void b() {
        t4 t4Var;
        nr0 nr0Var = this.L;
        if (nr0Var != null) {
            nr0Var.h(true);
        }
        this.S = true;
        d21 d21Var = this.J.e;
        for (d21 d21Var2 = d21Var; d21Var2 != null; d21Var2 = d21Var2.i) {
            if (d21Var2.r) {
                d21Var2.G0();
            }
        }
        for (d21 d21Var3 = d21Var; d21Var3 != null; d21Var3 = d21Var3.i) {
            if (d21Var3.r) {
                d21Var3.I0();
            }
        }
        while (d21Var != null) {
            if (d21Var.r) {
                d21Var.C0();
            }
            d21Var = d21Var.i;
        }
        if (H()) {
            this.w = null;
            this.v = false;
        }
        jc1 jc1Var = this.s;
        if (jc1Var != null && (t4Var = ((q5) jc1Var).O) != null && t4Var.l.e(this.f)) {
            t4Var.e.t(t4Var.g, this.f, false);
        }
    }

    public final void b0(c00 c00Var) {
        if (!sn0.r(this.C, c00Var)) {
            this.C = c00Var;
            E();
            ar0 v = v();
            if (v != null) {
                v.C();
            }
            D();
            for (d21 d21Var = this.J.f; d21Var != null; d21Var = d21Var.j) {
                d21Var.c();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3, types: [d21, e81] */
    public final void c(e21 e21Var) {
        int i;
        ?? r7;
        boolean z;
        a81 a81Var;
        z71 z71Var;
        q41 q41Var;
        boolean z2;
        ql0 ql0Var;
        boolean z3;
        boolean z4;
        q41 q41Var2;
        boolean z5;
        boolean z6;
        n3 n3Var;
        a81 a81Var2 = this.J;
        boolean d = a81Var2.d(16);
        d21 d21Var = a81Var2.e;
        boolean d2 = a81Var2.d(1024);
        this.O = e21Var;
        ql0 ql0Var2 = a81Var2.c;
        ar0 ar0Var = a81Var2.a;
        d21 d21Var2 = a81Var2.f;
        z71 z71Var2 = a81Var2.b;
        if (d21Var2 == z71Var2) {
            kl0.b("padChain called on already padded chain");
        }
        d21 d21Var3 = a81Var2.f;
        d21Var3.i = z71Var2;
        z71Var2.j = d21Var3;
        q41 q41Var3 = a81Var2.g;
        if (q41Var3 != null) {
            i = q41Var3.g;
        } else {
            i = 0;
        }
        q41 q41Var4 = a81Var2.h;
        if (q41Var4 == null) {
            q41Var4 = new q41(new c21[16]);
        }
        q41 q41Var5 = a81Var2.i;
        q41Var5.b(e21Var);
        n3 n3Var2 = null;
        while (true) {
            int i2 = q41Var5.g;
            if (i2 == 0) {
                break;
            }
            e21 e21Var2 = (e21) q41Var5.k(i2 - 1);
            if (e21Var2 instanceof bp) {
                bp bpVar = (bp) e21Var2;
                q41Var5.b(bpVar.b);
                q41Var5.b(bpVar.a);
            } else if (e21Var2 instanceof c21) {
                q41Var4.b(e21Var2);
            } else {
                if (n3Var2 == null) {
                    n3Var = new n3(q41Var4, 18);
                    n3Var2 = n3Var;
                } else {
                    n3Var = n3Var2;
                }
                e21Var2.c(n3Var);
            }
        }
        int i3 = q41Var4.g;
        if (i3 == i) {
            d21 d21Var4 = z71Var2.j;
            int i4 = 0;
            while (d21Var4 != null && i4 < i) {
                if (q41Var3 != null) {
                    c21 c21Var = (c21) q41Var3.e[i4];
                    c21 c21Var2 = (c21) q41Var4.e[i4];
                    if (sn0.r(c21Var, c21Var2)) {
                        q41Var2 = q41Var3;
                        z6 = 2;
                    } else {
                        q41Var2 = q41Var3;
                        if (c21Var.getClass() == c21Var2.getClass()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    if (z6) {
                        if (z6) {
                            a81.h(c21Var, c21Var2, d21Var4);
                        }
                        d21Var4 = d21Var4.j;
                        i4++;
                        q41Var3 = q41Var2;
                    } else {
                        d21Var4 = d21Var4.i;
                        break;
                    }
                } else {
                    throw l90.f("expected prior modifier list to be non-empty");
                }
            }
            q41Var2 = q41Var3;
            if (i4 < i) {
                if (q41Var2 != null) {
                    if (d21Var4 != null) {
                        if (ar0Var.P != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        d21 d21Var5 = d21Var4;
                        a81Var = a81Var2;
                        q41Var = q41Var4;
                        q41Var3 = q41Var2;
                        z4 = false;
                        a81Var.f(i4, q41Var3, q41Var, d21Var5, !z5);
                        z71Var = z71Var2;
                        z2 = true;
                        r7 = z4;
                    } else {
                        throw l90.f("structuralUpdate requires a non-null tail");
                    }
                } else {
                    throw l90.f("expected prior modifier list to be non-empty");
                }
            } else {
                a81Var2 = a81Var2;
                q41Var3 = q41Var2;
                z3 = false;
                a81Var = a81Var2;
                z71Var = z71Var2;
                q41Var = q41Var4;
                z2 = false;
                r7 = z3;
            }
        } else {
            r7 = 0;
            z4 = false;
            z3 = false;
            e21 e21Var3 = ar0Var.P;
            if (e21Var3 != null && i == 0) {
                d21 d21Var6 = z71Var2;
                for (int i5 = 0; i5 < q41Var4.g; i5++) {
                    d21Var6 = a81.b((c21) q41Var4.e[i5], d21Var6);
                }
                int i6 = 0;
                for (d21 d21Var7 = d21Var.i; d21Var7 != null && d21Var7 != z71Var2; d21Var7 = d21Var7.i) {
                    i6 |= d21Var7.g;
                    d21Var7.h = i6;
                }
                a81Var = a81Var2;
                z71Var = z71Var2;
                q41Var = q41Var4;
                z2 = true;
                r7 = z4;
            } else if (i3 == 0) {
                if (q41Var3 != null) {
                    d21 d21Var8 = z71Var2.j;
                    for (int i7 = 0; d21Var8 != null && i7 < q41Var3.g; i7++) {
                        d21Var8 = a81.c(d21Var8).j;
                    }
                    ar0 v = ar0Var.v();
                    if (v != null) {
                        ql0Var = v.J.c;
                    } else {
                        ql0Var = null;
                    }
                    ql0Var2.u = ql0Var;
                    a81Var2.d = ql0Var2;
                    a81Var = a81Var2;
                    z71Var = z71Var2;
                    q41Var = q41Var4;
                    z2 = false;
                    r7 = z3;
                } else {
                    throw l90.f("expected prior modifier list to be non-empty");
                }
            } else {
                if (q41Var3 == null) {
                    q41Var3 = new q41(new c21[16]);
                }
                if (e21Var3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                a81Var = a81Var2;
                z71Var = z71Var2;
                q41Var = q41Var4;
                a81Var.f(0, q41Var3, q41Var, z71Var, !z);
                z2 = true;
            }
        }
        a81Var.g = q41Var;
        if (q41Var3 != null) {
            q41Var3.g();
        } else {
            q41Var3 = r7;
        }
        a81Var.h = q41Var3;
        d21 d21Var9 = z71Var.j;
        if (d21Var9 != null) {
            d21Var = d21Var9;
        }
        d21Var.i = r7;
        z71Var.j = r7;
        z71Var.h = -1;
        z71Var.l = r7;
        if (d21Var == z71Var) {
            kl0.b("trimChain did not update the head");
        }
        a81Var.f = d21Var;
        if (z2) {
            a81Var.g();
        }
        boolean d3 = a81Var.d(16);
        boolean d4 = a81Var.d(1024);
        this.K.j();
        if (this.m == null && a81Var.d(512)) {
            d0(this);
        }
        if (d != d3 || d2 != d4) {
            rl1 rectManager = ((q5) dr0.a(this)).getRectManager();
            rectManager.getClass();
            if (H()) {
                u7 u7Var = rectManager.a;
                int i8 = this.f & 33554431;
                long[] jArr = (long[]) u7Var.b;
                int i9 = u7Var.a;
                for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                    int i11 = i10 + 2;
                    long j = jArr[i11];
                    if ((((int) j) & 33554431) == i8) {
                        jArr[i11] = ((-6917529027641081857L) & j) | ((d4 ? 1L : 0L) * 2305843009213693952L) | ((d3 ? 1L : 0L) * 4611686018427387904L);
                        return;
                    }
                }
            }
        }
    }

    public final void c0(int i) {
        ar0 v;
        ar0 v2;
        int i2 = this.R;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (v2 = v()) != null) {
                v2.c0(v2.R + 1);
            }
            if (i == 0 && this.R > 0 && (v = v()) != null) {
                v.c0(v.R - 1);
            }
            this.R = i;
        }
    }

    public final void d(jc1 jc1Var) {
        ql0 ql0Var;
        int i;
        ar0 ar0Var;
        mu1 x;
        jc1 jc1Var2;
        String str;
        if (this.s != null) {
            kl0.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        ar0 ar0Var2 = this.r;
        if (ar0Var2 != null && !sn0.r(ar0Var2.s, jc1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(jc1Var);
            sb.append(") than the parent's owner(");
            ar0 v = v();
            if (v != null) {
                jc1Var2 = v.s;
            } else {
                jc1Var2 = null;
            }
            sb.append(jc1Var2);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            ar0 ar0Var3 = this.r;
            if (ar0Var3 != null) {
                str = ar0Var3.g(0);
            } else {
                str = null;
            }
            sb.append(str);
            kl0.b(sb.toString());
        }
        ar0 v2 = v();
        er0 er0Var = this.K;
        if (v2 == null) {
            er0Var.p.w = true;
            ((q5) jc1Var).getRectManager().f(this, false);
            zy0 zy0Var = er0Var.q;
            if (zy0Var != null) {
                zy0Var.u = xy0.e;
            }
        }
        a81 a81Var = this.J;
        e81 e81Var = a81Var.d;
        if (v2 != null) {
            ql0Var = v2.J.c;
        } else {
            ql0Var = null;
        }
        e81Var.u = ql0Var;
        this.s = jc1Var;
        if (v2 != null) {
            i = v2.t;
        } else {
            i = -1;
        }
        this.t = i + 1;
        e21 e21Var = this.P;
        if (e21Var != null) {
            c(e21Var);
        }
        this.P = null;
        ((q5) jc1Var).m294getLayoutNodes().i(this.f, this);
        ar0 ar0Var4 = this.r;
        if (ar0Var4 == null || (ar0Var = ar0Var4.m) == null) {
            ar0Var = this.m;
        }
        d0(ar0Var);
        if (this.m == null && a81Var.d(512)) {
            d0(this);
        }
        if (!this.S) {
            for (d21 d21Var = a81Var.f; d21Var != null; d21Var = d21Var.j) {
                d21Var.B0();
            }
        }
        q41 q41Var = (q41) this.o.e;
        Object[] objArr = q41Var.e;
        int i2 = q41Var.g;
        for (int i3 = 0; i3 < i2; i3++) {
            ((ar0) objArr[i3]).d(jc1Var);
        }
        if (!this.S) {
            a81Var.e();
        }
        E();
        if (v2 != null) {
            v2.E();
        }
        er0Var.j();
        if (!this.S && a81Var.d(8)) {
            F();
        }
        t4 t4Var = ((q5) jc1Var).O;
        if (t4Var != null && (x = x()) != null && x.e.b(vu1.q)) {
            t4Var.l.a(this.f);
            t4Var.e.t(t4Var.g, this.f, true);
        }
    }

    public final void d0(ar0 ar0Var) {
        if (!sn0.r(ar0Var, this.m)) {
            this.m = ar0Var;
            er0 er0Var = this.K;
            if (ar0Var != null) {
                if (er0Var.q == null) {
                    er0Var.q = new zy0(er0Var);
                }
                a81 a81Var = this.J;
                e81 e81Var = a81Var.c.t;
                for (e81 e81Var2 = a81Var.d; !sn0.r(e81Var2, e81Var) && e81Var2 != null; e81Var2 = e81Var2.t) {
                    e81Var2.Q0();
                }
            } else {
                er0Var.q = null;
                er0Var.f = false;
                er0Var.e = false;
            }
            E();
        }
    }

    public final void e() {
        this.H = this.G;
        yq0 yq0Var = yq0.g;
        this.G = yq0Var;
        q41 z = z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var = (ar0) objArr[i2];
            if (ar0Var.G != yq0Var) {
                ar0Var.e();
            }
        }
    }

    public final void e0(j01 j01Var) {
        if (!sn0.r(this.A, j01Var)) {
            this.A = j01Var;
            sl0 sl0Var = this.B;
            if (sl0Var != null) {
                ((je1) sl0Var.f).setValue(j01Var);
            }
            E();
        }
    }

    public final void f() {
        this.H = this.G;
        this.G = yq0.g;
        q41 z = z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var = (ar0) objArr[i2];
            if (ar0Var.G == yq0.f) {
                ar0Var.f();
            }
        }
    }

    public final void f0(e21 e21Var) {
        if (this.e && this.O != b21.a) {
            kl0.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.S) {
            kl0.a("modifier is updated when deactivated");
        }
        if (H()) {
            c(e21Var);
            if (this.v) {
                F();
                return;
            }
            return;
        }
        this.P = e21Var;
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        q41 z = z();
        Object[] objArr = z.e;
        int i3 = z.g;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((ar0) objArr[i4]).g(i + 1));
        }
        String sb2 = sb.toString();
        if (i == 0) {
            return sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [d21] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void g0(hg2 hg2Var) {
        if (!sn0.r(this.E, hg2Var)) {
            this.E = hg2Var;
            d21 d21Var = this.J.f;
            if ((d21Var.h & 16) != 0) {
                while (d21Var != null) {
                    if ((d21Var.g & 16) != 0) {
                        rz rzVar = d21Var;
                        ?? r2 = 0;
                        while (rzVar != 0) {
                            if (rzVar instanceof th1) {
                                ((th1) rzVar).p0();
                            } else if ((rzVar.g & 16) != 0 && (rzVar instanceof rz)) {
                                d21 d21Var2 = rzVar.t;
                                int i = 0;
                                rzVar = rzVar;
                                r2 = r2;
                                while (d21Var2 != null) {
                                    if ((d21Var2.g & 16) != 0) {
                                        i++;
                                        r2 = r2;
                                        if (i == 1) {
                                            rzVar = d21Var2;
                                        } else {
                                            if (r2 == 0) {
                                                r2 = new q41(new d21[16]);
                                            }
                                            if (rzVar != 0) {
                                                r2.b(rzVar);
                                                rzVar = 0;
                                            }
                                            r2.b(d21Var2);
                                        }
                                    }
                                    d21Var2 = d21Var2.j;
                                    rzVar = rzVar;
                                    r2 = r2;
                                }
                                if (i == 1) {
                                }
                            }
                            rzVar = hp.l(r2);
                        }
                    }
                    if ((d21Var.h & 16) != 0) {
                        d21Var = d21Var.j;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void h() {
        br0 br0Var;
        jc1 jc1Var = this.s;
        String str = null;
        if (jc1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            ar0 v = v();
            if (v != null) {
                str = v.g(0);
            }
            sb.append(str);
            kl0.c(sb.toString());
            se.c();
            return;
        }
        ar0 v2 = v();
        er0 er0Var = this.K;
        if (v2 != null) {
            v2.C();
            v2.E();
            i01 i01Var = er0Var.p;
            yq0 yq0Var = yq0.g;
            i01Var.p = yq0Var;
            zy0 zy0Var = er0Var.q;
            if (zy0Var != null) {
                zy0Var.n = yq0Var;
            }
        }
        br0 br0Var2 = er0Var.p.B;
        br0Var2.b = true;
        br0Var2.c = false;
        br0Var2.e = false;
        br0Var2.d = false;
        br0Var2.f = false;
        br0Var2.g = false;
        br0Var2.h = null;
        zy0 zy0Var2 = er0Var.q;
        if (zy0Var2 != null && (br0Var = zy0Var2.v) != null) {
            br0Var.b = true;
            br0Var.c = false;
            br0Var.e = false;
            br0Var.d = false;
            br0Var.f = false;
            br0Var.g = false;
            br0Var.h = null;
        }
        a81 a81Var = this.J;
        d21 d21Var = a81Var.e;
        e81 e81Var = a81Var.c.t;
        for (e81 e81Var2 = a81Var.d; !sn0.r(e81Var2, e81Var) && e81Var2 != null; e81Var2 = e81Var2.t) {
            e81Var2.n1();
            if (e81Var2.s.I()) {
                e81Var2.i1();
            }
        }
        for (d21 d21Var2 = d21Var; d21Var2 != null; d21Var2 = d21Var2.i) {
            if (d21Var2.r) {
                d21Var2.I0();
            }
        }
        this.u = true;
        q41 q41Var = (q41) this.o.e;
        Object[] objArr = q41Var.e;
        int i = q41Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ar0) objArr[i2]).h();
        }
        this.u = false;
        while (d21Var != null) {
            if (d21Var.r) {
                d21Var.C0();
            }
            d21Var = d21Var.i;
        }
        q5 q5Var = (q5) jc1Var;
        q5Var.m294getLayoutNodes().g(this.f);
        g01 g01Var = q5Var.W;
        ld ldVar = g01Var.b;
        ((rg2) ldVar.f).x(this);
        ((rg2) ldVar.g).x(this);
        ((rg2) ldVar.h).x(this);
        ((q41) g01Var.e.e).j(this);
        q5Var.P = true;
        t4 t4Var = q5Var.O;
        if (t4Var != null && t4Var.l.e(this.f)) {
            t4Var.e.t(t4Var.g, this.f, false);
        }
        q5Var.getRectManager().h(this);
        this.s = null;
        d0(null);
        this.t = 0;
        i01 i01Var2 = er0Var.p;
        i01Var2.m = Integer.MAX_VALUE;
        i01Var2.l = Integer.MAX_VALUE;
        i01Var2.w = false;
        zy0 zy0Var3 = er0Var.q;
        if (zy0Var3 != null) {
            zy0Var3.m = Integer.MAX_VALUE;
            zy0Var3.l = Integer.MAX_VALUE;
            zy0Var3.u = xy0.g;
        }
        if (a81Var.d(8)) {
            mu1 mu1Var = this.w;
            this.w = null;
            this.v = false;
            q5Var.getSemanticsOwner().b(this, mu1Var);
            q5Var.z();
        }
    }

    public final void h0() {
        if (this.n > 0 && this.q) {
            this.q = false;
            q41 q41Var = this.p;
            if (q41Var == null) {
                q41Var = new q41(new ar0[16]);
                this.p = q41Var;
            }
            q41Var.g();
            q41 q41Var2 = (q41) this.o.e;
            Object[] objArr = q41Var2.e;
            int i = q41Var2.g;
            for (int i2 = 0; i2 < i; i2++) {
                ar0 ar0Var = (ar0) objArr[i2];
                if (ar0Var.e) {
                    q41Var.c(q41Var.g, ar0Var.z());
                } else {
                    q41Var.b(ar0Var);
                }
            }
            er0 er0Var = this.K;
            er0Var.p.D = true;
            zy0 zy0Var = er0Var.q;
            if (zy0Var != null) {
                zy0Var.x = true;
            }
        }
    }

    public final void i(tl tlVar, tf0 tf0Var) {
        try {
            this.J.d.O0(tlVar, tf0Var);
        } catch (Throwable th) {
            a0(th);
            throw null;
        }
    }

    public final void k() {
        us usVar;
        if (this.m != null) {
            V(this, false, 5);
        } else {
            X(this, false, 5);
        }
        i01 i01Var = this.K.p;
        if (i01Var.n) {
            usVar = new us(i01Var.h);
        } else {
            usVar = null;
        }
        jc1 jc1Var = this.s;
        if (usVar != null) {
            if (jc1Var != null) {
                ((q5) jc1Var).u(this, usVar.a);
                return;
            }
            return;
        }
        if (jc1Var != null) {
            ((q5) jc1Var).t(true);
        }
    }

    public final List l() {
        zy0 zy0Var = this.K.q;
        zy0Var.getClass();
        q41 q41Var = zy0Var.w;
        er0 er0Var = zy0Var.j;
        er0Var.a.n();
        if (!zy0Var.x) {
            return q41Var.f();
        }
        ar0 ar0Var = er0Var.a;
        q41 z = ar0Var.z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var2 = (ar0) objArr[i2];
            if (q41Var.g <= i2) {
                zy0 zy0Var2 = ar0Var2.K.q;
                zy0Var2.getClass();
                q41Var.b(zy0Var2);
            } else {
                zy0 zy0Var3 = ar0Var2.K.q;
                zy0Var3.getClass();
                Object[] objArr2 = q41Var.e;
                Object obj = objArr2[i2];
                objArr2[i2] = zy0Var3;
            }
        }
        q41Var.l(((q41) ((z31) ar0Var.n()).f).g, q41Var.g);
        zy0Var.x = false;
        return q41Var.f();
    }

    public final List m() {
        return this.K.p.t0();
    }

    public final List n() {
        return z().f();
    }

    public final List o() {
        return ((q41) this.o.e).f();
    }

    public final boolean p() {
        return this.K.p.z;
    }

    public final boolean q() {
        return this.K.p.y;
    }

    @Override // defpackage.kc1
    public final boolean r() {
        return H();
    }

    public final yq0 s() {
        return this.K.p.p;
    }

    public final yq0 t() {
        yq0 yq0Var;
        zy0 zy0Var = this.K.q;
        if (zy0Var != null && (yq0Var = zy0Var.n) != null) {
            return yq0Var;
        }
        return yq0.g;
    }

    public final String toString() {
        return qo.a0(this) + " children: " + ((q41) ((z31) n()).f).g + " measurePolicy: " + this.A + " deactivated: " + this.S;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sl0, java.lang.Object] */
    public final sl0 u() {
        sl0 sl0Var = this.B;
        if (sl0Var == null) {
            j01 j01Var = this.A;
            ?? obj = new Object();
            obj.e = this;
            obj.f = fr1.k(j01Var);
            this.B = obj;
            return obj;
        }
        return sl0Var;
    }

    public final ar0 v() {
        ar0 ar0Var = this.r;
        while (ar0Var != null && ar0Var.e) {
            ar0Var = ar0Var.r;
        }
        return ar0Var;
    }

    public final int w() {
        return this.K.p.m;
    }

    public final mu1 x() {
        if (H() && !this.S && this.J.d(8)) {
            return this.w;
        }
        return null;
    }

    public final q41 y() {
        boolean z = this.z;
        q41 q41Var = this.y;
        if (z) {
            q41Var.g();
            q41Var.c(q41Var.g, z());
            Arrays.sort(q41Var.e, 0, q41Var.g, V);
            this.z = false;
        }
        return q41Var;
    }

    public final q41 z() {
        h0();
        if (this.n == 0) {
            return (q41) this.o.e;
        }
        q41 q41Var = this.p;
        q41Var.getClass();
        return q41Var;
    }

    public ar0(int i) {
        this((i & 1) == 0, ou1.a.addAndGet(1));
    }
}
