package defpackage;

import android.os.Trace;
import com.topjohnwu.superuser.nio.FileSystemManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ur {
    public int A;
    public int B;
    public boolean C;
    public final tr D;
    public final ArrayList E;
    public boolean F;
    public fz1 G;
    public gz1 H;
    public jz1 I;
    public boolean J;
    public sf1 K;
    public am L;
    public final pr M;
    public p3 N;
    public y90 O;
    public se P;
    public final bs Q;
    public final xu R;
    public boolean S;
    public long T;
    public as U;
    public final gd2 a;
    public final xr b;
    public final gz1 c;
    public final l41 d;
    public final am e;
    public final am f;
    public final rg2 g;
    public final ds h;
    public pf1 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public n31 p;
    public boolean q;
    public boolean r;
    public p31 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final fn0 n = new fn0();
    public final ArrayList s = new ArrayList();
    public final fn0 t = new fn0();
    public sf1 u = sf1.h;
    public final fn0 x = new fn0();
    public int z = -1;

    public ur(gd2 gd2Var, xr xrVar, gz1 gz1Var, l41 l41Var, am amVar, am amVar2, rg2 rg2Var, ds dsVar) {
        boolean z;
        this.a = gd2Var;
        this.b = xrVar;
        this.c = gz1Var;
        this.d = l41Var;
        this.e = amVar;
        this.f = amVar2;
        this.g = rg2Var;
        this.h = dsVar;
        if (!xrVar.f() && !xrVar.d()) {
            z = false;
        } else {
            z = true;
        }
        this.C = z;
        this.D = new tr(this, 0);
        this.E = new ArrayList();
        fz1 c = gz1Var.c();
        c.c();
        this.G = c;
        gz1 gz1Var2 = new gz1();
        if (xrVar.f()) {
            gz1Var2.b();
        }
        if (xrVar.d()) {
            gz1Var2.o = new p31();
        }
        this.H = gz1Var2;
        jz1 d = gz1Var2.d();
        d.e(true);
        this.I = d;
        this.M = new pr(this, amVar);
        fz1 c2 = this.H.c();
        try {
            p3 a = c2.a(0);
            c2.c();
            this.N = a;
            this.O = new y90();
            this.Q = new bs(this);
            xu j = xrVar.j();
            xu z2 = z();
            this.R = j.G(z2 == null ? j60.e : z2);
        } catch (Throwable th) {
            c2.c();
            throw th;
        }
    }

    public static final int N(ur urVar, int i, boolean z, int i2) {
        boolean z2;
        int i3;
        hm1 hm1Var;
        Object obj;
        fz1 fz1Var = urVar.G;
        if (fz1Var.j(i)) {
            int i4 = fz1Var.i(i);
            Object p = fz1Var.p(fz1Var.b, i);
            if (i4 == 206 && sn0.r(p, vr.e)) {
                Object h = fz1Var.h(i, 0);
                rr rrVar = null;
                if (h instanceof hm1) {
                    hm1Var = (hm1) h;
                } else {
                    hm1Var = null;
                }
                if (hm1Var != null) {
                    obj = hm1Var.a;
                } else {
                    obj = null;
                }
                if (obj instanceof rr) {
                    rrVar = (rr) obj;
                }
                if (rrVar != null) {
                    for (ur urVar2 : rrVar.e.e) {
                        gz1 gz1Var = urVar2.c;
                        if (gz1Var.f > 0 && (gz1Var.e[1] & FileSystemManager.MODE_TRUNCATE) != 0) {
                            ds dsVar = urVar2.h;
                            synchronized (dsVar.h) {
                                dsVar.p();
                                i41 i41Var = dsVar.r;
                                dsVar.r = rp1.f();
                                try {
                                    dsVar.z.d0(i41Var);
                                } finally {
                                }
                            }
                            am amVar = new am();
                            urVar2.L = amVar;
                            fz1 c = urVar2.c.c();
                            try {
                                urVar2.G = c;
                                pr prVar = urVar2.M;
                                am amVar2 = prVar.b;
                                try {
                                    prVar.b = amVar;
                                    urVar2.M(0);
                                    pr prVar2 = urVar2.M;
                                    prVar2.b();
                                    if (prVar2.c) {
                                        prVar2.b.d.e0(gb1.c);
                                        if (prVar2.c) {
                                            prVar2.d(false);
                                            prVar2.d(false);
                                            prVar2.b.d.e0(qa1.c);
                                            prVar2.c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                c.c();
                            }
                        }
                        urVar.b.r(urVar2.h);
                    }
                }
                return fz1Var.o(i);
            }
            if (!fz1Var.l(i)) {
                return fz1Var.o(i);
            }
        } else if (fz1Var.d(i)) {
            int i5 = fz1Var.b[(i * 5) + 3] + i;
            int i6 = 0;
            for (int i7 = i + 1; i7 < i5; i7 += fz1Var.b[(i7 * 5) + 3]) {
                boolean l = fz1Var.l(i7);
                if (l) {
                    urVar.M.c();
                    pr prVar3 = urVar.M;
                    Object n = fz1Var.n(i7);
                    prVar3.c();
                    prVar3.h.add(n);
                }
                if (!l && !z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (l) {
                    i3 = 0;
                } else {
                    i3 = i2 + i6;
                }
                i6 += N(urVar, i7, z2, i3);
                if (l) {
                    urVar.M.c();
                    urVar.M.a();
                }
            }
            if (!fz1Var.l(i)) {
                return i6;
            }
        } else if (!fz1Var.l(i)) {
            return fz1Var.o(i);
        }
        return 1;
    }

    public final boolean A() {
        dl1 x;
        if (!this.S && !this.y && !this.w && (x = x()) != null && (x.b & 8) == 0) {
            return true;
        }
        return false;
    }

    public final void B(ArrayList arrayList) {
        am amVar = this.f;
        pr prVar = this.M;
        am amVar2 = prVar.b;
        try {
            prVar.b = amVar;
            amVar.d.e0(eb1.c);
            if (arrayList.size() <= 0) {
                prVar.b();
                prVar.b.d.e0(ra1.c);
                prVar.f = 0;
            } else {
                xd1 xd1Var = (xd1) arrayList.get(0);
                d31 d31Var = (d31) xd1Var.e;
                d31Var.getClass();
                throw null;
            }
        } finally {
            prVar.b = amVar2;
        }
    }

    public final void C(sf1 sf1Var, Object obj) {
        boolean z;
        V(126665345, null);
        D();
        i0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                jz1.z(this.I);
            }
            if (this.S || sn0.r(this.G.f(), sf1Var)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                J(sf1Var);
            }
            S(vr.c, 202, 0, sf1Var);
            this.K = null;
            this.w = z;
            throw null;
        } finally {
        }
    }

    public final Object D() {
        boolean z = this.S;
        xl1 xl1Var = or.a;
        if (z) {
            if (this.r) {
                vr.a("A call to createNode(), emitNode() or useNode() expected");
                return xl1Var;
            }
        } else {
            Object m = this.G.m();
            if (!this.y || (m instanceof jo1)) {
                return m;
            }
        }
        return xl1Var;
    }

    public final List E() {
        ds dsVar;
        xr xrVar = this.b;
        wr h = xrVar.h();
        if (h != null) {
            dsVar = (ds) h;
        } else {
            dsVar = null;
        }
        if (dsVar != null) {
            gz1 gz1Var = dsVar.j;
            fz1 c = gz1Var.c();
            try {
                Integer x = lo.x(c, xrVar, 0, c.c);
                if (x != null) {
                    c = gz1Var.c();
                    try {
                        ArrayList Z = lo.Z(c, x.intValue(), 0);
                        c.c();
                        return wn.q0(dsVar.z.E(), Z);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return l60.e;
    }

    public final int F(int i) {
        int q = this.G.q(i) + 1;
        int i2 = 0;
        while (q < i) {
            if (!this.G.k(q)) {
                i2++;
            }
            q += this.G.b[(q * 5) + 3];
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(defpackage.ds r9, defpackage.ds r10, java.lang.Integer r11, java.util.List r12, defpackage.de0 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            xd1 r6 = (defpackage.xd1) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.e     // Catch: java.lang.Throwable -> L24
            dl1 r7 = (defpackage.dl1) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.f     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.c0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L5e
        L26:
            r8.c0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L55
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L4f
            if (r10 == r9) goto L4f
            if (r11 < 0) goto L4f
            r9.v = r10     // Catch: java.lang.Throwable -> L24
            r9.w = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L49
            r9.v = r5     // Catch: java.lang.Throwable -> L24
            r9.w = r2     // Catch: java.lang.Throwable -> L24
            goto L53
        L49:
            r10 = move-exception
            r9.v = r5     // Catch: java.lang.Throwable -> L24
            r9.w = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L4f:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L53:
            if (r10 != 0) goto L59
        L55:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L59:
            r8.F = r0
            r8.k = r1
            return r10
        L5e:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.G(ds, ds, java.lang.Integer, java.util.List, de0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        if (r4.b < r6) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H() {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.H():void");
    }

    public final void I() {
        int i;
        M(this.G.g);
        pr prVar = this.M;
        prVar.d(false);
        fn0 fn0Var = prVar.d;
        ur urVar = prVar.a;
        fz1 fz1Var = urVar.G;
        if (fz1Var.c > 0 && fn0Var.a(-2) != (i = fz1Var.i)) {
            if (!prVar.c && prVar.e) {
                prVar.d(false);
                prVar.b.d.e0(ua1.c);
                prVar.c = true;
            }
            if (i > 0) {
                p3 a = fz1Var.a(i);
                fn0Var.c(i);
                prVar.d(false);
                pb1 pb1Var = prVar.b.d;
                pb1Var.e0(ta1.c);
                vn.K(pb1Var, 0, a);
                prVar.c = true;
            }
        }
        prVar.b.d.e0(cb1.c);
        int i2 = prVar.f;
        fz1 fz1Var2 = urVar.G;
        prVar.f = fz1Var2.b[(fz1Var2.g * 5) + 3] + i2;
    }

    public final void J(sf1 sf1Var) {
        p31 p31Var = this.v;
        if (p31Var == null) {
            p31Var = new p31();
            this.v = p31Var;
        }
        p31Var.i(this.G.g, sf1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(int r7, int r8, int r9) {
        /*
            r6 = this;
            fz1 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            pr r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.o(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.K(int, int, int):void");
    }

    public final Object L() {
        boolean z = this.S;
        xl1 xl1Var = or.a;
        if (z) {
            if (this.r) {
                vr.a("A call to createNode(), emitNode() or useNode() expected");
                return xl1Var;
            }
        } else {
            Object m = this.G.m();
            if (!this.y || (m instanceof jo1)) {
                if (m instanceof hm1) {
                    return ((hm1) m).a;
                }
                return m;
            }
        }
        return xl1Var;
    }

    public final void M(int i) {
        boolean l = this.G.l(i);
        pr prVar = this.M;
        if (l) {
            prVar.c();
            Object n = this.G.n(i);
            prVar.c();
            prVar.h.add(n);
        }
        N(this, i, l, 0);
        prVar.c();
        if (l) {
            prVar.a();
        }
    }

    public final boolean O(int i, boolean z) {
        if ((i & 1) == 0 && (this.S || this.y)) {
            if (this.P != null) {
                x();
            }
        } else if (!z && A()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.P():void");
    }

    public final void Q() {
        int i;
        fz1 fz1Var = this.G;
        int i2 = fz1Var.i;
        if (i2 >= 0) {
            i = fz1Var.b[(i2 * 5) + 1] & 67108863;
        } else {
            i = 0;
        }
        this.l = i;
        fz1Var.t();
    }

    public final void R() {
        if (this.l != 0) {
            vr.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (!this.S) {
            dl1 x = x();
            if (x != null) {
                int i = x.b;
                if ((i & 128) == 0) {
                    x.b = i | 16;
                }
            }
            if (this.s.isEmpty()) {
                Q();
            } else {
                H();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(java.lang.Object r27, int r28, int r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.S(java.lang.Object, int, int, java.lang.Object):void");
    }

    public final void T() {
        S(null, -127, 0, null);
    }

    public final void U(int i, ga1 ga1Var) {
        S(ga1Var, i, 0, null);
    }

    public final void V(int i, Object obj) {
        S(obj, i, 0, null);
    }

    public final void W(Object obj, boolean z) {
        if (z) {
            fz1 fz1Var = this.G;
            if (fz1Var.k <= 0) {
                if ((fz1Var.b[(fz1Var.g * 5) + 1] & 1073741824) == 0) {
                    ei1.a("Expected a node group");
                }
                fz1Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            pr prVar = this.M;
            prVar.getClass();
            prVar.d(false);
            pb1 pb1Var = prVar.b.d;
            pb1Var.e0(jb1.c);
            vn.K(pb1Var, 0, obj);
        }
        this.G.u();
    }

    public final void X(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            S(null, i, 0, null);
            return;
        }
        if (this.r) {
            vr.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.m;
        this.m++;
        fz1 fz1Var = this.G;
        boolean z = this.S;
        xl1 xl1Var = or.a;
        if (z) {
            fz1Var.k++;
            this.I.Q(i, xl1Var, xl1Var, false);
            u(false, null);
            return;
        }
        if (fz1Var.g() == i && ((i3 = fz1Var.g) >= fz1Var.h || (fz1Var.b[(i3 * 5) + 1] & FileSystemManager.MODE_WRITE_ONLY) == 0)) {
            fz1Var.u();
            u(false, null);
            return;
        }
        if (fz1Var.k <= 0 && (i2 = fz1Var.g) != fz1Var.h) {
            int i4 = this.k;
            I();
            this.M.e(i4, fz1Var.s());
            mp0.f(i2, fz1Var.g, this.s);
        }
        fz1Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            jz1 d = this.H.d();
            this.I = d;
            d.M();
            this.J = false;
            this.K = null;
        }
        jz1 jz1Var = this.I;
        jz1Var.d();
        int i5 = jz1Var.t;
        jz1Var.Q(i, xl1Var, xl1Var, false);
        this.N = jz1Var.b(i5);
        u(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ur Y(int r7) {
        /*
            r6 = this;
            r6.X(r7)
            boolean r7 = r6.S
            rg2 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            ds r2 = r6.h
            if (r7 == 0) goto L26
            dl1 r7 = new dl1
            r7.<init>(r2)
            r1.add(r7)
            r6.i0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.g()
            return r6
        L26:
            fz1 r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = defpackage.mp0.q(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            ao0 r7 = (defpackage.ao0) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            fz1 r3 = r6.G
            java.lang.Object r3 = r3.m()
            xl1 r4 = defpackage.or.a
            boolean r4 = defpackage.sn0.r(r3, r4)
            if (r4 == 0) goto L51
            dl1 r3 = new dl1
            r3.<init>(r2)
            r6.i0(r3)
            goto L56
        L51:
            r3.getClass()
            dl1 r3 = (defpackage.dl1) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.b = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.b
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.g()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.b = r7
            pr r7 = r6.M
            am r7 = r7.b
            pb1 r7 = r7.d
            hb1 r0 = defpackage.hb1.c
            r7.e0(r0)
            defpackage.vn.K(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lba
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lba
            r6.y = r4
            fz1 r0 = r6.G
            int r0 = r0.i
            r6.z = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.Y(int):ur");
    }

    public final void Z(Object obj) {
        if (!this.S && this.G.g() == 207 && !sn0.r(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        S(null, 207, 0, obj);
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        y90 y90Var = this.O;
        y90Var.e.a0();
        y90Var.d.a0();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        fz1 fz1Var = this.G;
        if (!fz1Var.f) {
            fz1Var.c();
        }
        if (!this.I.w) {
            v();
        }
    }

    public final void a0() {
        S(null, 125, 2, null);
        this.r = true;
    }

    public final void b(se0 se0Var, Object obj) {
        if (this.S) {
            pb1 pb1Var = this.O.d;
            pb1Var.e0(kb1.c);
            vn.K(pb1Var, 0, obj);
            se0Var.getClass();
            fc2.t(2, se0Var);
            vn.K(pb1Var, 1, se0Var);
            return;
        }
        pr prVar = this.M;
        prVar.b();
        pb1 pb1Var2 = prVar.b.d;
        pb1Var2.e0(kb1.c);
        se0Var.getClass();
        fc2.t(2, se0Var);
        vn.L(pb1Var2, 0, obj, 1, se0Var);
    }

    public final void b0() {
        this.m = 0;
        this.G = this.c.c();
        S(null, 100, 0, null);
        xr xrVar = this.b;
        xrVar.t();
        sf1 i = xrVar.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(i);
        this.K = null;
        if (!this.q) {
            this.q = xrVar.e();
        }
        if (!this.C) {
            this.C = xrVar.f();
        }
        if (this.C) {
            y22 y22Var = cs.a;
            y22Var.getClass();
            i = i.b(y22Var, new z22(z()));
        }
        this.u = i;
        Set set = (Set) xn.M(i, jm0.a);
        if (set != null) {
            set.add(w());
            xrVar.o(set);
        }
        S(null, Long.hashCode(xrVar.g()), 0, null);
    }

    public final boolean c(float f) {
        Object D = D();
        if ((D instanceof Float) && f == ((Number) D).floatValue()) {
            return false;
        }
        i0(Float.valueOf(f));
        return true;
    }

    public final boolean c0(dl1 dl1Var, Object obj) {
        p3 p3Var = dl1Var.c;
        if (p3Var != null) {
            int a = this.G.a.a(p3Var);
            if (this.F && a >= this.G.g) {
                ArrayList arrayList = this.s;
                int q = mp0.q(a, arrayList);
                if (q < 0) {
                    int i = -(q + 1);
                    if (!(obj instanceof j00)) {
                        obj = null;
                    }
                    arrayList.add(i, new ao0(dl1Var, a, obj));
                    return true;
                }
                ao0 ao0Var = (ao0) arrayList.get(q);
                if (obj instanceof j00) {
                    Object obj2 = ao0Var.c;
                    if (obj2 == null) {
                        ao0Var.c = obj;
                        return true;
                    }
                    if (obj2 instanceof j41) {
                        ((j41) obj2).a(obj);
                        return true;
                    }
                    j41 j41Var = tr1.a;
                    j41 j41Var2 = new j41(2);
                    j41Var2.k(obj2);
                    j41Var2.k(obj);
                    ao0Var.c = j41Var2;
                    return true;
                }
                ao0Var.c = null;
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d(int i) {
        Object D = D();
        if ((D instanceof Integer) && i == ((Number) D).intValue()) {
            return false;
        }
        i0(Integer.valueOf(i));
        return true;
    }

    public final void d0(i41 i41Var) {
        ArrayList arrayList = this.s;
        for (int A = xn.A(arrayList); -1 < A; A--) {
            ao0 ao0Var = (ao0) arrayList.get(A);
            p3 p3Var = ao0Var.a.c;
            if (p3Var != null && p3Var.a()) {
                int i = ao0Var.b;
                int i2 = p3Var.a;
                if (i != i2) {
                    ao0Var.b = i2;
                }
            } else {
                arrayList.remove(A);
            }
        }
        Object[] objArr = i41Var.b;
        Object[] objArr2 = i41Var.c;
        long[] jArr = i41Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            dl1 dl1Var = (dl1) obj;
                            p3 p3Var2 = dl1Var.c;
                            if (p3Var2 != null) {
                                int i7 = p3Var2.a;
                                if (obj2 == xl1.g) {
                                    obj2 = null;
                                }
                                arrayList.add(new ao0(dl1Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        ao.c0(arrayList, mp0.n);
    }

    public final boolean e(long j) {
        Object D = D();
        if ((D instanceof Long) && j == ((Number) D).longValue()) {
            return false;
        }
        i0(Long.valueOf(j));
        return true;
    }

    public final void e0(int i, int i2) {
        if (j0(i) != i2) {
            if (i < 0) {
                n31 n31Var = this.p;
                if (n31Var == null) {
                    n31Var = new n31();
                    this.p = n31Var;
                }
                n31Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean f(Object obj) {
        if (!sn0.r(D(), obj)) {
            i0(obj);
            return true;
        }
        return false;
    }

    public final void f0(int i, int i2) {
        int j0 = j0(i);
        if (j0 != i2) {
            int i3 = i2 - j0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int j02 = j0(i) + i3;
                e0(i, j02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        pf1 pf1Var = (pf1) arrayList.get(i4);
                        if (pf1Var != null && pf1Var.a(i, j02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                fz1 fz1Var = this.G;
                if (i < 0) {
                    i = fz1Var.i;
                } else if (!fz1Var.l(i)) {
                    i = this.G.q(i);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean g(boolean z) {
        Object D = D();
        if ((D instanceof Boolean) && z == ((Boolean) D).booleanValue()) {
            return false;
        }
        i0(Boolean.valueOf(z));
        return true;
    }

    public final sf1 g0(sf1 sf1Var, sf1 sf1Var2) {
        sf1Var.getClass();
        rf1 rf1Var = new rf1(sf1Var);
        rf1Var.putAll(sf1Var2);
        sf1 a = rf1Var.a();
        U(204, vr.d);
        D();
        i0(a);
        D();
        i0(sf1Var2);
        p(false);
        return a;
    }

    public final boolean h(Object obj) {
        if (D() != obj) {
            i0(obj);
            return true;
        }
        return false;
    }

    public final void h0(Object obj) {
        if (obj instanceof gm1) {
            hm1 hm1Var = new hm1((gm1) obj, this.m - 1);
            if (this.S) {
                pb1 pb1Var = this.M.b.d;
                pb1Var.e0(ab1.c);
                vn.K(pb1Var, 0, hm1Var);
            }
            this.d.add(obj);
            obj = hm1Var;
        }
        i0(obj);
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        pr prVar = this.M;
        prVar.c = false;
        prVar.d.b = 0;
        prVar.f = 0;
        prVar.e = true;
        prVar.g = 0;
        prVar.h.clear();
        prVar.i = -1;
        prVar.j = -1;
        prVar.k = -1;
        prVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(Object obj) {
        if (this.S) {
            jz1 jz1Var = this.I;
            if (jz1Var.n > 0 && jz1Var.i != jz1Var.k) {
                p31 p31Var = jz1Var.s;
                if (p31Var == null) {
                    p31Var = new p31();
                }
                jz1Var.s = p31Var;
                int i = jz1Var.v;
                Object b = p31Var.b(i);
                if (b == null) {
                    b = new b41();
                    p31Var.i(i, b);
                }
                ((b41) b).a(obj);
                return;
            }
            jz1Var.F(obj);
            return;
        }
        fz1 fz1Var = this.G;
        boolean z = fz1Var.n;
        pr prVar = this.M;
        if (z) {
            int b2 = (fz1Var.l - iz1.b(fz1Var.b, fz1Var.i)) - 1;
            if (prVar.a.G.i - prVar.f < 0) {
                fz1 fz1Var2 = this.G;
                p3 a = fz1Var2.a(fz1Var2.i);
                pb1 pb1Var = prVar.b.d;
                pb1Var.e0(va1.f);
                vn.L(pb1Var, 0, obj, 1, a);
                pb1Var.f[pb1Var.g - pb1Var.d[pb1Var.e - 1].a] = b2;
                return;
            }
            prVar.d(true);
            pb1 pb1Var2 = prVar.b.d;
            pb1Var2.e0(va1.g);
            vn.K(pb1Var2, 0, obj);
            pb1Var2.f[pb1Var2.g - pb1Var2.d[pb1Var2.e - 1].a] = b2;
            return;
        }
        p3 a2 = fz1Var.a(fz1Var.i);
        pb1 pb1Var3 = prVar.b.d;
        pb1Var3.e0(ia1.c);
        vn.L(pb1Var3, 0, a2, 1, obj);
    }

    public final Object j(xj1 xj1Var) {
        return xn.M(l(), xj1Var);
    }

    public final int j0(int i) {
        int i2;
        if (i < 0) {
            n31 n31Var = this.p;
            if (n31Var != null && n31Var.c(i) >= 0) {
                int c = n31Var.c(i);
                if (c >= 0) {
                    return n31Var.c[c];
                }
                y61.j(l90.g(i, "Cannot find value for key "));
            }
            return 0;
        }
        int[] iArr = this.o;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.G.o(i);
    }

    public final void k(de0 de0Var) {
        if (!this.r) {
            vr.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            vr.a("createNode() can only be called when inserting");
        }
        fn0 fn0Var = this.n;
        int i = fn0Var.a[fn0Var.b - 1];
        jz1 jz1Var = this.I;
        p3 b = jz1Var.b(jz1Var.v);
        this.l++;
        y90 y90Var = this.O;
        pb1 pb1Var = y90Var.d;
        pb1Var.e0(va1.d);
        vn.K(pb1Var, 0, de0Var);
        pb1Var.f[pb1Var.g - pb1Var.d[pb1Var.e - 1].a] = i;
        vn.K(pb1Var, 1, b);
        pb1 pb1Var2 = y90Var.e;
        pb1Var2.e0(va1.e);
        pb1Var2.f[pb1Var2.g - pb1Var2.d[pb1Var2.e - 1].a] = i;
        vn.K(pb1Var2, 0, b);
    }

    public final void k0() {
        if (!this.r) {
            vr.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            vr.a("useNode() called while inserting");
        }
        fz1 fz1Var = this.G;
        Object n = fz1Var.n(fz1Var.i);
        pr prVar = this.M;
        prVar.c();
        prVar.h.add(n);
        if (this.y && (n instanceof yq)) {
            prVar.b();
            prVar.b.d.e0(mb1.c);
        }
    }

    public final sf1 l() {
        sf1 sf1Var;
        sf1 sf1Var2 = this.K;
        if (sf1Var2 != null) {
            return sf1Var2;
        }
        int i = this.G.i;
        boolean z = this.S;
        ga1 ga1Var = vr.c;
        if (z && this.J) {
            int i2 = this.I.v;
            while (i2 > 0) {
                if (this.I.s(i2) == 202 && sn0.r(this.I.t(i2), ga1Var)) {
                    Object q = this.I.q(i2);
                    q.getClass();
                    sf1 sf1Var3 = (sf1) q;
                    this.K = sf1Var3;
                    return sf1Var3;
                }
                jz1 jz1Var = this.I;
                i2 = jz1Var.E(jz1Var.b, i2);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    fz1 fz1Var = this.G;
                    if (sn0.r(fz1Var.p(fz1Var.b, i), ga1Var)) {
                        p31 p31Var = this.v;
                        if (p31Var == null || (sf1Var = (sf1) p31Var.b(i)) == null) {
                            fz1 fz1Var2 = this.G;
                            Object b = fz1Var2.b(fz1Var2.b, i);
                            b.getClass();
                            sf1Var = (sf1) b;
                        }
                        this.K = sf1Var;
                        return sf1Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        sf1 sf1Var4 = this.u;
        this.K = sf1Var4;
        return sf1Var4;
    }

    public final hr m() {
        Collection collection;
        Object obj;
        if (!this.b.k()) {
            return null;
        }
        vv0 v = xn.v();
        jz1 jz1Var = this.I;
        v.addAll(lo.m(jz1Var, null, jz1Var.t, null));
        fz1 fz1Var = this.G;
        boolean z = fz1Var.f;
        int[] iArr = fz1Var.b;
        if (!z && fz1Var.c != 0) {
            wk1 wk1Var = new wk1(fz1Var);
            int i = fz1Var.i;
            Object valueOf = Integer.valueOf(fz1Var.l - iz1.b(iArr, i));
            while (i >= 0) {
                if (fz1Var.k(i)) {
                    obj = fz1Var.p(iArr, i);
                } else {
                    obj = or.a;
                }
                wk1Var.e(fz1Var.i(i), obj, fz1Var.a.f(i), valueOf);
                valueOf = fz1Var.a(i);
                i = fz1Var.q(i);
            }
            collection = (ArrayList) wk1Var.a;
        } else {
            collection = l60.e;
        }
        v.addAll(collection);
        v.addAll(E());
        return new hr(xn.s(v));
    }

    public final void n(i41 i41Var, se0 se0Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            vr.a("Reentrant composition is not supported");
        }
        this.g.g();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(q02.j().g());
            this.v = null;
            d0(i41Var);
            this.k = 0;
            this.F = true;
            try {
                b0();
                Object D = D();
                if (D != se0Var && se0Var != null) {
                    i0(se0Var);
                }
                tr trVar = this.D;
                q41 g = fr1.g();
                try {
                    g.b(trVar);
                    ga1 ga1Var = vr.a;
                    if (se0Var != null) {
                        U(200, ga1Var);
                        fc2.t(2, se0Var);
                        se0Var.invoke(this, 1);
                        p(false);
                    } else if (this.w && D != null && !D.equals(or.a)) {
                        U(200, ga1Var);
                        fc2.t(2, D);
                        se0 se0Var2 = (se0) D;
                        fc2.t(2, se0Var2);
                        se0Var2.invoke(this, 1);
                        p(false);
                    } else {
                        P();
                    }
                    g.k(g.g - 1);
                    t();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        vr.a("Check failed");
                    }
                    v();
                } catch (Throwable th) {
                    g.k(g.g - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i, int i2) {
        if (i > 0 && i != i2) {
            o(this.G.q(i), i2);
            if (this.G.l(i)) {
                Object n = this.G.n(i);
                pr prVar = this.M;
                prVar.c();
                prVar.h.add(n);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05ad  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r43) {
        /*
            Method dump skipped, instructions count: 1603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur.p(boolean):void");
    }

    public final void q() {
        p(false);
        dl1 x = x();
        if (x != null) {
            int i = x.b;
            if ((i & 1) != 0) {
                x.b = i | 2;
            }
        }
    }

    public final dl1 r() {
        dl1 dl1Var;
        dl1 dl1Var2;
        p3 a;
        cl1 cl1Var;
        ArrayList arrayList = this.E;
        if (!arrayList.isEmpty()) {
            dl1Var = (dl1) arrayList.remove(arrayList.size() - 1);
        } else {
            dl1Var = null;
        }
        int i = 0;
        if (dl1Var != null) {
            dl1Var.b &= -9;
            this.g.g();
            int i2 = this.B;
            x31 x31Var = dl1Var.f;
            if (x31Var != null && (dl1Var.b & 16) == 0) {
                Object[] objArr = x31Var.b;
                int[] iArr = x31Var.c;
                long[] jArr = x31Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    loop0: while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = objArr[i6];
                                    if (iArr[i6] != i2) {
                                        cl1Var = new cl1(dl1Var, i2, i, x31Var);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            cl1Var = null;
            pr prVar = this.M;
            if (cl1Var != null) {
                pb1 pb1Var = prVar.b.d;
                pb1Var.e0(pa1.c);
                vn.L(pb1Var, 0, cl1Var, 1, this.h);
            }
            int i7 = dl1Var.b;
            if ((i7 & 512) != 0) {
                dl1Var.b = i7 & (-513);
                pb1 pb1Var2 = prVar.b.d;
                pb1Var2.e0(sa1.c);
                vn.K(pb1Var2, 0, dl1Var);
                int i8 = dl1Var.b;
                dl1Var.b = i8 & (-129);
                if ((i8 & 1024) != 0) {
                    dl1Var.b = i8 & (-1153);
                    if (this.z == this.G.i) {
                        this.y = false;
                        this.z = -1;
                    }
                }
            }
        }
        if (dl1Var != null) {
            int i9 = dl1Var.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.q)) {
                if (dl1Var.c == null) {
                    if (this.S) {
                        jz1 jz1Var = this.I;
                        a = jz1Var.b(jz1Var.v);
                    } else {
                        fz1 fz1Var = this.G;
                        a = fz1Var.a(fz1Var.i);
                    }
                    dl1Var.c = a;
                }
                dl1Var.b &= -5;
                dl1Var2 = dl1Var;
                p(false);
                return dl1Var2;
            }
        }
        dl1Var2 = null;
        p(false);
        return dl1Var2;
    }

    public final void s() {
        if (this.F || this.z != 0) {
            ei1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void t() {
        boolean z = false;
        p(false);
        this.b.c();
        p(false);
        pr prVar = this.M;
        if (prVar.c) {
            prVar.d(false);
            prVar.d(false);
            prVar.b.d.e0(qa1.c);
            prVar.c = false;
        }
        prVar.b();
        if (prVar.d.b != 0) {
            vr.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            vr.a("Start/end imbalance");
        }
        i();
        this.G.c();
        if (this.x.b() != 0) {
            z = true;
        }
        this.w = z;
    }

    public final void u(boolean z, pf1 pf1Var) {
        this.i.add(this.j);
        this.j = pf1Var;
        int i = this.l;
        fn0 fn0Var = this.n;
        fn0Var.c(i);
        fn0Var.c(this.m);
        fn0Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void v() {
        gz1 gz1Var = new gz1();
        if (this.C) {
            gz1Var.b();
        }
        if (this.b.d()) {
            gz1Var.o = new p31();
        }
        this.H = gz1Var;
        jz1 d = gz1Var.d();
        d.e(true);
        this.I = d;
    }

    public final zr w() {
        as asVar = this.U;
        if (asVar == null) {
            as asVar2 = new as(this.h);
            this.U = asVar2;
            return asVar2;
        }
        return asVar;
    }

    public final dl1 x() {
        if (this.A == 0) {
            ArrayList arrayList = this.E;
            if (!arrayList.isEmpty()) {
                return (dl1) arrayList.get(arrayList.size() - 1);
            }
            return null;
        }
        return null;
    }

    public final boolean y() {
        if (A() && !this.w) {
            dl1 x = x();
            if (x == null || (x.b & 4) == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final bs z() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }
}
