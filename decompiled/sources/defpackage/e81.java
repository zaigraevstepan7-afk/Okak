package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.ViewParent;
import com.topjohnwu.superuser.internal.HiddenAPIs;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class e81 extends ty0 implements e01, iq0, kc1 {
    public static final io1 Q = new io1();
    public static final fq0 R = new fq0();
    public static final float[] S = d01.a();
    public static final wc0 T = new wc0(15);
    public static final wc0 U = new wc0(16);
    public k01 B;
    public x31 C;
    public float E;
    public h41 F;
    public fq0 G;
    public boolean I;
    public boolean J;
    public tf0 K;
    public tl L;
    public g6 M;
    public boolean O;
    public ic1 P;
    public final ar0 s;
    public e81 t;
    public e81 u;
    public boolean v;
    public boolean w;
    public oe0 x;
    public c00 y;
    public jq0 z;
    public float A = 0.8f;
    public long D = 0;
    public kw1 H = d6.w;
    public final b81 N = new b81(this, 1);

    public e81(ar0 ar0Var) {
        this.s = ar0Var;
        this.y = ar0Var.C;
        this.z = ar0Var.D;
    }

    public static e81 p1(iq0 iq0Var) {
        wy0 wy0Var;
        e81 e81Var;
        if (iq0Var instanceof wy0) {
            wy0Var = (wy0) iq0Var;
        } else {
            wy0Var = null;
        }
        if (wy0Var != null && (e81Var = wy0Var.e.s) != null) {
            return e81Var;
        }
        iq0Var.getClass();
        return (e81) iq0Var;
    }

    @Override // defpackage.iq0
    public final long A(long j) {
        if (!V0().r) {
            kl0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        iq0 D = qo.D(this);
        q5 q5Var = (q5) dr0.a(this.s);
        q5Var.A();
        return L(D, z81.d(d01.b(j, q5Var.e0), D.Q(0L)));
    }

    @Override // defpackage.ty0
    public final boolean B0() {
        if (this.B != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [d21] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [d21] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.ig1, defpackage.e01
    public final Object C() {
        ar0 ar0Var = this.s;
        if (!ar0Var.J.d(64)) {
            return null;
        }
        V0();
        Object obj = null;
        for (d21 d21Var = ar0Var.J.e; d21Var != null; d21Var = d21Var.i) {
            if ((d21Var.g & 64) != 0) {
                rz rzVar = d21Var;
                ?? r4 = 0;
                while (rzVar != 0) {
                    if (rzVar instanceof ke1) {
                        obj = ((ke1) rzVar).x0(obj);
                    } else if ((rzVar.g & 64) != 0 && (rzVar instanceof rz)) {
                        d21 d21Var2 = rzVar.t;
                        int i = 0;
                        rzVar = rzVar;
                        r4 = r4;
                        while (d21Var2 != null) {
                            if ((d21Var2.g & 64) != 0) {
                                i++;
                                r4 = r4;
                                if (i == 1) {
                                    rzVar = d21Var2;
                                } else {
                                    if (r4 == 0) {
                                        r4 = new q41(new d21[16]);
                                    }
                                    if (rzVar != 0) {
                                        r4.b(rzVar);
                                        rzVar = 0;
                                    }
                                    r4.b(d21Var2);
                                }
                            }
                            d21Var2 = d21Var2.j;
                            rzVar = rzVar;
                            r4 = r4;
                        }
                        if (i == 1) {
                        }
                    }
                    rzVar = hp.l(r4);
                }
            }
        }
        return obj;
    }

    @Override // defpackage.ty0
    public final ar0 C0() {
        return this.s;
    }

    @Override // defpackage.iq0
    public final iq0 D() {
        boolean z = V0().r;
        ar0 ar0Var = this.s;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (ar0 ar0Var2 = ar0Var; ar0Var2 != null; ar0Var2 = ar0Var2.v()) {
                sb.append("\n|");
                sb.append(ar0Var2);
                sb.append(" isAttached=");
                sb.append(ar0Var2.H());
                sb.append(" modifier=");
                sb.append(ar0Var2.O);
                sb.append(" tail=");
                sb.append(V0());
            }
            kl0.b(sb.toString());
        }
        e1();
        return ar0Var.J.d.u;
    }

    @Override // defpackage.ty0
    public final k01 D0() {
        k01 k01Var = this.B;
        if (k01Var != null) {
            return k01Var;
        }
        se.p("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.ty0
    public final ty0 E0() {
        return this.u;
    }

    @Override // defpackage.ty0
    public final long F0() {
        return this.D;
    }

    @Override // defpackage.iq0
    public final long I(iq0 iq0Var, long j) {
        return L(iq0Var, j);
    }

    @Override // defpackage.iq0
    public final long J(long j) {
        if (!V0().r) {
            kl0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return L(qo.D(this), ((q5) dr0.a(this.s)).E(j));
    }

    @Override // defpackage.ty0
    public final void J0() {
        m0(this.D, this.E, this.x);
    }

    public final void K0(e81 e81Var, h41 h41Var, boolean z) {
        if (e81Var != this) {
            e81 e81Var2 = this.u;
            if (e81Var2 != null) {
                e81Var2.K0(e81Var, h41Var, z);
            }
            long j = this.D;
            float f = (int) (j >> 32);
            h41Var.a -= f;
            h41Var.c -= f;
            float f2 = (int) (j & 4294967295L);
            h41Var.b -= f2;
            h41Var.d -= f2;
            ic1 ic1Var = this.P;
            if (ic1Var != null) {
                vf0 vf0Var = (vf0) ic1Var;
                float[] a = vf0Var.a();
                if (!vf0Var.w) {
                    if (a == null) {
                        h41Var.a = 0.0f;
                        h41Var.b = 0.0f;
                        h41Var.c = 0.0f;
                        h41Var.d = 0.0f;
                    } else {
                        d01.c(a, h41Var);
                    }
                }
                if (this.w && z) {
                    long j2 = this.g;
                    h41Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
            }
        }
    }

    @Override // defpackage.iq0
    public final long L(iq0 iq0Var, long j) {
        if (iq0Var instanceof wy0) {
            wy0 wy0Var = (wy0) iq0Var;
            wy0Var.e.s.e1();
            return wy0Var.L(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        e81 p1 = p1(iq0Var);
        p1.e1();
        e81 R0 = R0(p1);
        while (p1 != R0) {
            ic1 ic1Var = p1.P;
            if (ic1Var != null) {
                vf0 vf0Var = (vf0) ic1Var;
                float[] b = vf0Var.b();
                if (!vf0Var.w) {
                    j = d01.b(j, b);
                }
            }
            j = fp.R(j, p1.D);
            p1 = p1.u;
            p1.getClass();
        }
        return L0(R0, j);
    }

    public final long L0(e81 e81Var, long j) {
        if (e81Var == this) {
            return j;
        }
        e81 e81Var2 = this.u;
        if (e81Var2 != null && !sn0.r(e81Var, e81Var2)) {
            return S0(e81Var2.L0(e81Var, j));
        }
        return S0(j);
    }

    public final long M0(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - f0();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - e0();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final float N0(long j, long j2) {
        float f0;
        float e0;
        if (f0() >= Float.intBitsToFloat((int) (j2 >> 32)) && e0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long M0 = M0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (M0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (M0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat3 < 0.0f) {
            f0 = -intBitsToFloat3;
        } else {
            f0 = intBitsToFloat3 - f0();
        }
        float max = Math.max(0.0f, f0);
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat4 < 0.0f) {
            e0 = -intBitsToFloat4;
        } else {
            e0 = intBitsToFloat4 - e0();
        }
        float max2 = Math.max(0.0f, e0);
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat5 = Float.intBitsToFloat(i);
                    float intBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat6 * intBitsToFloat6) + (intBitsToFloat5 * intBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // defpackage.iq0
    public final pl1 O(iq0 iq0Var, boolean z) {
        if (!V0().r) {
            kl0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!iq0Var.j()) {
            kl0.b("LayoutCoordinates " + iq0Var + " is not attached!");
        }
        e81 p1 = p1(iq0Var);
        p1.e1();
        e81 R0 = R0(p1);
        h41 h41Var = this.F;
        if (h41Var == null) {
            h41Var = new h41();
            this.F = h41Var;
        }
        h41Var.a = 0.0f;
        h41Var.b = 0.0f;
        h41Var.c = (int) (iq0Var.m() >> 32);
        h41Var.d = (int) (iq0Var.m() & 4294967295L);
        while (p1 != R0) {
            p1.m1(h41Var, z, false);
            if (h41Var.b()) {
                return pl1.e;
            }
            p1 = p1.u;
            p1.getClass();
        }
        K0(R0, h41Var, z);
        return new pl1(h41Var.a, h41Var.b, h41Var.c, h41Var.d);
    }

    public final void O0(tl tlVar, tf0 tf0Var) {
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        boolean z5;
        float f;
        float f2;
        ic1 ic1Var = this.P;
        if (ic1Var != null) {
            vf0 vf0Var = (vf0) ic1Var;
            vl vlVar = vf0Var.q;
            vf0Var.g();
            if (vf0Var.e.a.m > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            vf0Var.x = z;
            ld ldVar = vlVar.f;
            ldVar.r(tlVar);
            ldVar.g = tf0Var;
            tf0 tf0Var2 = vf0Var.e;
            tl h = vlVar.b0().h();
            tf0 tf0Var3 = (tf0) vlVar.b0().g;
            xf0 xf0Var = tf0Var2.a;
            xf0 xf0Var2 = tf0Var2.a;
            RenderNode renderNode = xf0Var.c;
            if (!tf0Var2.s) {
                tf0Var2.a();
                if (!renderNode.hasDisplayList()) {
                    try {
                        tf0Var2.f();
                    } catch (Throwable unused) {
                    }
                }
                if (xf0Var2.m > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    h.s();
                }
                Canvas a = v4.a(h);
                boolean isHardwareAccelerated = a.isHardwareAccelerated();
                if (!isHardwareAccelerated) {
                    long j = tf0Var2.t;
                    float f3 = (int) (j >> 32);
                    float f4 = (int) (j & 4294967295L);
                    long j2 = tf0Var2.u;
                    float f5 = f3 + ((int) (j2 >> 32));
                    float f6 = f4 + ((int) (j2 & 4294967295L));
                    float f7 = xf0Var2.h;
                    int i = xf0Var.i;
                    if (f7 >= 1.0f && i == 3 && xf0Var.u != 1) {
                        a.save();
                        f = f3;
                        f2 = f4;
                        obj = null;
                    } else {
                        f8 f8Var = tf0Var2.p;
                        if (f8Var == null) {
                            f8Var = fc2.j();
                            tf0Var2.p = f8Var;
                        }
                        f8Var.c(f7);
                        f8Var.d(i);
                        obj = null;
                        f8Var.f(null);
                        f = f3;
                        f2 = f4;
                        a.saveLayer(f, f2, f5, f6, (Paint) f8Var.b);
                    }
                    a.translate(f, f2);
                    Matrix matrix = xf0Var.f;
                    if (matrix == null) {
                        matrix = new Matrix();
                        xf0Var.f = matrix;
                    }
                    renderNode.getMatrix(matrix);
                    a.concat(matrix);
                } else {
                    obj = null;
                }
                if (!isHardwareAccelerated && tf0Var2.w) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    h.h();
                    lo d = tf0Var2.d();
                    if (d instanceof vb1) {
                        tl.q(h, ((vb1) d).e);
                    } else if (d instanceof wb1) {
                        n8 n8Var = tf0Var2.m;
                        if (n8Var != null) {
                            n8Var.h();
                        } else {
                            n8Var = p8.a();
                            tf0Var2.m = n8Var;
                        }
                        n8.b(n8Var, ((wb1) d).e);
                        h.m(n8Var);
                    } else if (d instanceof ub1) {
                        h.m(((ub1) d).e);
                    } else {
                        se.m();
                        return;
                    }
                }
                if (tf0Var3 != null) {
                    xm xmVar = tf0Var3.r;
                    if (!xmVar.a) {
                        jl0.a("Only add dependencies during a tracking");
                    }
                    j41 j41Var = (j41) xmVar.d;
                    if (j41Var != null) {
                        j41Var.a(tf0Var2);
                    } else if (((tf0) xmVar.b) != null) {
                        j41 j41Var2 = tr1.a;
                        j41 j41Var3 = new j41();
                        tf0 tf0Var4 = (tf0) xmVar.b;
                        tf0Var4.getClass();
                        j41Var3.a(tf0Var4);
                        j41Var3.a(tf0Var2);
                        xmVar.d = j41Var3;
                        xmVar.b = obj;
                    } else {
                        xmVar.b = tf0Var2;
                    }
                    j41 j41Var4 = (j41) xmVar.e;
                    if (j41Var4 != null) {
                        z5 = !j41Var4.l(tf0Var2);
                    } else if (((tf0) xmVar.c) != tf0Var2) {
                        z5 = true;
                    } else {
                        xmVar.c = obj;
                        z5 = false;
                    }
                    if (z5) {
                        tf0Var2.q++;
                    }
                }
                u4 u4Var = (u4) h;
                if (!u4Var.a.isHardwareAccelerated()) {
                    vl vlVar2 = tf0Var2.o;
                    if (vlVar2 == null) {
                        vlVar2 = new vl();
                        tf0Var2.o = vlVar2;
                    }
                    ld ldVar2 = vlVar2.f;
                    c00 c00Var = tf0Var2.b;
                    jq0 jq0Var = tf0Var2.c;
                    long O = vn.O(tf0Var2.u);
                    ul ulVar = ((vl) ldVar2.h).e;
                    c00 c00Var2 = ulVar.a;
                    jq0 jq0Var2 = ulVar.b;
                    tl h2 = ldVar2.h();
                    long k = ldVar2.k();
                    z4 = z2;
                    tf0 tf0Var5 = (tf0) ldVar2.g;
                    ldVar2.s(c00Var);
                    ldVar2.t(jq0Var);
                    ldVar2.r(h);
                    ldVar2.u(O);
                    ldVar2.g = tf0Var2;
                    h.h();
                    try {
                        tf0Var2.c(vlVar2);
                    } finally {
                        h.p();
                        ldVar2.s(c00Var2);
                        ldVar2.t(jq0Var2);
                        ldVar2.r(h2);
                        ldVar2.u(k);
                        ldVar2.g = tf0Var5;
                    }
                } else {
                    z4 = z2;
                    u4Var.a.drawRenderNode(renderNode);
                }
                if (z3) {
                    h.p();
                }
                if (z4) {
                    h.j();
                }
                if (!isHardwareAccelerated) {
                    a.restore();
                    return;
                }
                return;
            }
            return;
        }
        long j3 = this.D;
        float f8 = (int) (j3 >> 32);
        float f9 = (int) (j3 & 4294967295L);
        tlVar.o(f8, f9);
        P0(tlVar, tf0Var);
        tlVar.o(-f8, -f9);
    }

    @Override // defpackage.c00
    public final float P() {
        return this.s.C.P();
    }

    public final void P0(tl tlVar, tf0 tf0Var) {
        e81 e81Var;
        tl tlVar2;
        tf0 tf0Var2;
        d21 W0 = W0(4);
        if (W0 == null) {
            k1(tlVar, tf0Var);
            return;
        }
        ar0 ar0Var = this.s;
        ar0Var.getClass();
        cr0 sharedDrawScope = ((q5) dr0.a(ar0Var)).getSharedDrawScope();
        long O = vn.O(this.g);
        sharedDrawScope.getClass();
        q41 q41Var = null;
        while (W0 != null) {
            if (W0 instanceof b40) {
                e81Var = this;
                tlVar2 = tlVar;
                tf0Var2 = tf0Var;
                sharedDrawScope.c(tlVar2, O, e81Var, (b40) W0, tf0Var2);
            } else {
                e81Var = this;
                tlVar2 = tlVar;
                tf0Var2 = tf0Var;
                if ((W0.g & 4) != 0 && (W0 instanceof rz)) {
                    int i = 0;
                    for (d21 d21Var = ((rz) W0).t; d21Var != null; d21Var = d21Var.j) {
                        if ((d21Var.g & 4) != 0) {
                            i++;
                            if (i == 1) {
                                W0 = d21Var;
                            } else {
                                if (q41Var == null) {
                                    q41Var = new q41(new d21[16]);
                                }
                                if (W0 != null) {
                                    q41Var.b(W0);
                                    W0 = null;
                                }
                                q41Var.b(d21Var);
                            }
                        }
                    }
                    if (i == 1) {
                        tlVar = tlVar2;
                        this = e81Var;
                        tf0Var = tf0Var2;
                    }
                }
            }
            W0 = hp.l(q41Var);
            tlVar = tlVar2;
            this = e81Var;
            tf0Var = tf0Var2;
        }
    }

    @Override // defpackage.iq0
    public final long Q(long j) {
        if (!V0().r) {
            kl0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        e1();
        while (this != null) {
            ar0 ar0Var = this.s;
            if (this == ar0Var.J.d && !ar0Var.g) {
                long b = ((q5) dr0.a(ar0Var)).getRectManager().b(ar0Var);
                if (!xm0.a(b, 9223372034707292159L)) {
                    return fp.R(j, b);
                }
            }
            ic1 ic1Var = this.P;
            if (ic1Var != null) {
                vf0 vf0Var = (vf0) ic1Var;
                float[] b2 = vf0Var.b();
                if (!vf0Var.w) {
                    j = d01.b(j, b2);
                }
            }
            j = fp.R(j, this.D);
            this = this.u;
        }
        return j;
    }

    public abstract void Q0();

    public final e81 R0(e81 e81Var) {
        ar0 ar0Var = e81Var.s;
        ar0 ar0Var2 = this.s;
        if (ar0Var == ar0Var2) {
            d21 V0 = e81Var.V0();
            d21 V02 = V0();
            if (!V02.e.r) {
                kl0.b("visitLocalAncestors called on an unattached node");
            }
            for (d21 d21Var = V02.e.i; d21Var != null; d21Var = d21Var.i) {
                if ((d21Var.g & 2) != 0 && d21Var == V0) {
                    return e81Var;
                }
            }
            return this;
        }
        while (ar0Var.t > ar0Var2.t) {
            ar0Var = ar0Var.v();
            ar0Var.getClass();
        }
        ar0 ar0Var3 = ar0Var2;
        while (ar0Var3.t > ar0Var.t) {
            ar0Var3 = ar0Var3.v();
            ar0Var3.getClass();
        }
        while (ar0Var != ar0Var3) {
            ar0Var = ar0Var.v();
            ar0Var3 = ar0Var3.v();
            if (ar0Var == null || ar0Var3 == null) {
                se.h("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (ar0Var3 != ar0Var2) {
            if (ar0Var != e81Var.s) {
                return ar0Var.J.c;
            }
            return e81Var;
        }
        return this;
    }

    public final long S0(long j) {
        long j2 = this.D;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        ic1 ic1Var = this.P;
        if (ic1Var != null) {
            vf0 vf0Var = (vf0) ic1Var;
            float[] a = vf0Var.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!vf0Var.w) {
                return d01.b(floatToRawIntBits, a);
            }
        }
        return floatToRawIntBits;
    }

    public abstract vy0 T0();

    public final long U0() {
        return this.y.n0(this.s.E.d());
    }

    public abstract d21 V0();

    public final d21 W0(int i) {
        boolean g = f81.g(i);
        d21 V0 = V0();
        if (g || (V0 = V0.i) != null) {
            for (d21 X0 = X0(g); X0 != null && (X0.h & i) != 0; X0 = X0.j) {
                if ((X0.g & i) != 0) {
                    return X0;
                }
                if (X0 == V0) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final d21 X0(boolean z) {
        d21 V0;
        a81 a81Var = this.s.J;
        if (a81Var.d == this) {
            return a81Var.f;
        }
        e81 e81Var = this.u;
        if (z) {
            if (e81Var != null && (V0 = e81Var.V0()) != null) {
                return V0.j;
            }
            return null;
        }
        if (e81Var != null) {
            return e81Var.V0();
        }
        return null;
    }

    public final void Y0(d21 d21Var, wc0 wc0Var, long j, ch0 ch0Var, int i, boolean z) {
        if (d21Var == null) {
            b1(wc0Var, j, ch0Var, i, z);
            return;
        }
        int i2 = ch0Var.g;
        b41 b41Var = ch0Var.e;
        ch0Var.b(i2 + 1, b41Var.b);
        ch0Var.g++;
        b41Var.a(d21Var);
        ch0Var.f.a(xn.b(-1.0f, z, false));
        Y0(xn.o(d21Var, wc0Var.j()), wc0Var, j, ch0Var, i, z);
        ch0Var.g = i2;
    }

    public final void Z0(d21 d21Var, wc0 wc0Var, long j, ch0 ch0Var, int i, boolean z, float f) {
        if (d21Var == null) {
            b1(wc0Var, j, ch0Var, i, z);
            return;
        }
        int i2 = ch0Var.g;
        b41 b41Var = ch0Var.e;
        ch0Var.b(i2 + 1, b41Var.b);
        ch0Var.g++;
        b41Var.a(d21Var);
        ch0Var.f.a(xn.b(f, z, false));
        j1(xn.o(d21Var, wc0Var.j()), wc0Var, j, ch0Var, i, z, f, true);
        ch0Var.g = i2;
    }

    @Override // defpackage.c00
    public final float a() {
        return this.s.C.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (defpackage.hp.o(r18.a(), defpackage.xn.b(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a1(defpackage.wc0 r15, long r16, defpackage.ch0 r18, int r19, boolean r20) {
        /*
            r14 = this;
            r3 = r16
            r5 = r18
            r6 = r19
            int r0 = r15.j()
            d21 r1 = r14.W0(r0)
            boolean r0 = r14.v1(r3)
            r8 = 0
            r9 = 2139095040(0x7f800000, float:Infinity)
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 1
            if (r0 != 0) goto L4c
            if (r6 != r11) goto L4b
            long r12 = r14.U0()
            float r0 = r14.N0(r3, r12)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r10
            if (r2 >= r9) goto L4b
            int r2 = r5.g
            b41 r7 = r5.e
            int r7 = r7.b
            int r7 = r7 - r11
            if (r2 != r7) goto L36
            goto L44
        L36:
            long r7 = defpackage.xn.b(r0, r8, r8)
            long r9 = r5.a()
            int r2 = defpackage.hp.o(r9, r7)
            if (r2 <= 0) goto L4b
        L44:
            r7 = 0
            r2 = r15
            r8 = r0
            r0 = r14
            r0.Z0(r1, r2, r3, r5, r6, r7, r8)
        L4b:
            return
        L4c:
            if (r1 != 0) goto L52
            r14.b1(r15, r16, r18, r19, r20)
            return
        L52:
            r0 = 32
            long r2 = r16 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r16 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L90
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L90
            int r3 = r14.f0()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L90
            int r0 = r14.e0()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L90
            r0 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.Y0(r1, r2, r3, r5, r6, r7)
            return
        L90:
            r3 = r16
            r5 = r18
            r6 = r19
            if (r6 != r11) goto La1
            long r12 = r14.U0()
            float r2 = r14.N0(r3, r12)
            goto La3
        La1:
            r2 = 2139095040(0x7f800000, float:Infinity)
        La3:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r10
            if (r7 >= r9) goto Lcb
            int r7 = r5.g
            b41 r9 = r5.e
            int r9 = r9.b
            int r9 = r9 - r11
            if (r7 != r9) goto Lb6
            r7 = r20
            goto Lc6
        Lb6:
            r7 = r20
            long r9 = defpackage.xn.b(r2, r7, r8)
            long r12 = r5.a()
            int r9 = defpackage.hp.o(r12, r9)
            if (r9 <= 0) goto Lcd
        Lc6:
            r9 = r11
        Lc7:
            r0 = r14
            r8 = r2
            r2 = r15
            goto Lcf
        Lcb:
            r7 = r20
        Lcd:
            r9 = r8
            goto Lc7
        Lcf:
            r0.j1(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e81.a1(wc0, long, ch0, int, boolean):void");
    }

    public void b1(wc0 wc0Var, long j, ch0 ch0Var, int i, boolean z) {
        e81 e81Var = this.t;
        if (e81Var != null) {
            e81Var.a1(wc0Var, e81Var.S0(j), ch0Var, i, z);
        }
    }

    public final void c1() {
        ic1 ic1Var = this.P;
        if (ic1Var != null) {
            ((vf0) ic1Var).c();
            return;
        }
        e81 e81Var = this.u;
        if (e81Var != null) {
            e81Var.c1();
        }
    }

    public final boolean d1() {
        if (this.P != null && this.A <= 0.0f) {
            return true;
        }
        e81 e81Var = this.u;
        if (e81Var != null) {
            return e81Var.d1();
        }
        return false;
    }

    @Override // defpackage.iq0
    public final long e(long j) {
        long Q2 = Q(j);
        q5 q5Var = (q5) dr0.a(this.s);
        q5Var.A();
        return d01.b(Q2, q5Var.d0);
    }

    public final void e1() {
        this.s.K.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [d21] */
    /* JADX WARN: Type inference failed for: r7v7, types: [d21] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [q41] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void f1() {
        oe0 oe0Var;
        d21 d21Var;
        boolean g = f81.g(128);
        d21 X0 = X0(g);
        if (X0 != null && (X0.e.h & 128) != 0) {
            i02 e = nq1.e();
            if (e != null) {
                oe0Var = e.e();
            } else {
                oe0Var = null;
            }
            i02 j = nq1.j(e);
            try {
                if (g) {
                    d21Var = V0();
                } else {
                    d21Var = V0().i;
                    if (d21Var == null) {
                    }
                }
                for (d21 X02 = X0(g); X02 != null; X02 = X02.j) {
                    if ((X02.h & 128) == 0) {
                        break;
                    }
                    if ((X02.g & 128) != 0) {
                        rz rzVar = X02;
                        ?? r8 = 0;
                        while (rzVar != 0) {
                            if (rzVar instanceof gq0) {
                                ((gq0) rzVar).o(this.g);
                            } else if ((rzVar.g & 128) != 0 && (rzVar instanceof rz)) {
                                d21 d21Var2 = rzVar.t;
                                int i = 0;
                                rzVar = rzVar;
                                r8 = r8;
                                while (d21Var2 != null) {
                                    if ((d21Var2.g & 128) != 0) {
                                        i++;
                                        r8 = r8;
                                        if (i == 1) {
                                            rzVar = d21Var2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new q41(new d21[16]);
                                            }
                                            if (rzVar != 0) {
                                                r8.b(rzVar);
                                                rzVar = 0;
                                            }
                                            r8.b(d21Var2);
                                        }
                                    }
                                    d21Var2 = d21Var2.j;
                                    rzVar = rzVar;
                                    r8 = r8;
                                }
                                if (i == 1) {
                                }
                            }
                            rzVar = hp.l(r8);
                        }
                    }
                    if (X02 == d21Var) {
                        break;
                    }
                }
            } finally {
                nq1.o(e, j, oe0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void g1() {
        boolean g = f81.g(HiddenAPIs.FLAG_RECEIVER_FROM_SHELL);
        d21 V0 = V0();
        if (g || (V0 = V0.i) != null) {
            for (d21 X0 = X0(g); X0 != null && (X0.h & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0; X0 = X0.j) {
                if ((X0.g & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0) {
                    rz rzVar = X0;
                    ?? r5 = 0;
                    while (rzVar != 0) {
                        if (rzVar instanceof gq0) {
                            ((gq0) rzVar).l(this);
                        } else if ((rzVar.g & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0 && (rzVar instanceof rz)) {
                            d21 d21Var = rzVar.t;
                            int i = 0;
                            rzVar = rzVar;
                            r5 = r5;
                            while (d21Var != null) {
                                if ((d21Var.g & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        rzVar = d21Var;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new q41(new d21[16]);
                                        }
                                        if (rzVar != 0) {
                                            r5.b(rzVar);
                                            rzVar = 0;
                                        }
                                        r5.b(d21Var);
                                    }
                                }
                                d21Var = d21Var.j;
                                rzVar = rzVar;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        rzVar = hp.l(r5);
                    }
                }
                if (X0 == V0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.mn0
    public final jq0 getLayoutDirection() {
        return this.s.D;
    }

    public final void h1() {
        this.v = true;
        this.N.invoke();
        n1();
        if (!xm0.a(this.D, 0L)) {
            this.s.N();
        }
    }

    public final void i1() {
        boolean g = f81.g(1048576);
        d21 X0 = X0(g);
        if (X0 != null && (X0.e.h & 1048576) != 0) {
            d21 V0 = V0();
            if (g || (V0 = V0.i) != null) {
                for (d21 X02 = X0(g); X02 != null && (X02.h & 1048576) != 0; X02 = X02.j) {
                    if ((X02.g & 1048576) != 0) {
                        d21 d21Var = X02;
                        q41 q41Var = null;
                        while (d21Var != null) {
                            if ((d21Var.g & 1048576) != 0 && (d21Var instanceof rz)) {
                                int i = 0;
                                for (d21 d21Var2 = ((rz) d21Var).t; d21Var2 != null; d21Var2 = d21Var2.j) {
                                    if ((d21Var2.g & 1048576) != 0) {
                                        i++;
                                        if (i == 1) {
                                            d21Var = d21Var2;
                                        } else {
                                            if (q41Var == null) {
                                                q41Var = new q41(new d21[16]);
                                            }
                                            if (d21Var != null) {
                                                q41Var.b(d21Var);
                                                d21Var = null;
                                            }
                                            q41Var.b(d21Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            d21Var = hp.l(q41Var);
                        }
                    }
                    if (X02 == V0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.iq0
    public final boolean j() {
        return V0().r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [d21] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [d21] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    public final void j1(d21 d21Var, wc0 wc0Var, long j, ch0 ch0Var, int i, boolean z, float f, boolean z2) {
        int f2;
        int f3;
        d21 l;
        boolean z3;
        int i2;
        int i3;
        if (d21Var == null) {
            b1(wc0Var, j, ch0Var, i, z);
            return;
        }
        int i4 = i;
        if (i4 == 3 || i4 == 4) {
            rz rzVar = d21Var;
            q41 q41Var = null;
            while (true) {
                if (rzVar == 0) {
                    break;
                }
                if (rzVar instanceof th1) {
                    long n = ((th1) rzVar).n();
                    int i5 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i5);
                    ar0 ar0Var = this.s;
                    jq0 jq0Var = ar0Var.D;
                    int i6 = ya2.b;
                    long j2 = Long.MIN_VALUE & n;
                    jq0 jq0Var2 = jq0.e;
                    if (j2 != 0 && jq0Var != jq0Var2) {
                        f2 = wm1.f(2, n);
                    } else {
                        f2 = wm1.f(0, n);
                    }
                    if (intBitsToFloat >= (-f2)) {
                        float intBitsToFloat2 = Float.intBitsToFloat(i5);
                        int f0 = f0();
                        jq0 jq0Var3 = ar0Var.D;
                        if (j2 != 0 && jq0Var3 != jq0Var2) {
                            f3 = wm1.f(0, n);
                        } else {
                            f3 = wm1.f(2, n);
                        }
                        if (intBitsToFloat2 < f0 + f3) {
                            int i7 = (int) (j & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat(i7);
                            int i8 = ya2.b;
                            if (intBitsToFloat3 >= (-wm1.f(1, n))) {
                                if (Float.intBitsToFloat(i7) < wm1.f(3, n) + e0()) {
                                    c81 c81Var = new c81(this, d21Var, wc0Var, j, ch0Var, i4, z, f, z2);
                                    s31 s31Var = ch0Var.f;
                                    b41 b41Var = ch0Var.e;
                                    int i9 = ch0Var.g;
                                    int i10 = b41Var.b;
                                    if (i9 == i10 - 1) {
                                        ch0Var.b(i9 + 1, i10);
                                        ch0Var.g++;
                                        b41Var.a(d21Var);
                                        s31Var.a(xn.b(0.0f, z, true));
                                        c81Var.invoke();
                                        ch0Var.g = i9;
                                        return;
                                    }
                                    long a = ch0Var.a();
                                    int i11 = ch0Var.g;
                                    if (hp.B(a)) {
                                        int i12 = b41Var.b;
                                        int i13 = i12 - 1;
                                        ch0Var.g = i13;
                                        ch0Var.b(i12, b41Var.b);
                                        ch0Var.g++;
                                        b41Var.a(d21Var);
                                        s31Var.a(xn.b(0.0f, z, true));
                                        c81Var.invoke();
                                        ch0Var.g = i13;
                                        if (hp.w(ch0Var.a()) < 0.0f) {
                                            ch0Var.b(i11 + 1, ch0Var.g + 1);
                                        }
                                        ch0Var.g = i11;
                                        return;
                                    }
                                    if (hp.w(a) > 0.0f) {
                                        int i14 = ch0Var.g;
                                        ch0Var.b(i14 + 1, b41Var.b);
                                        ch0Var.g++;
                                        b41Var.a(d21Var);
                                        s31Var.a(xn.b(0.0f, z, true));
                                        c81Var.invoke();
                                        ch0Var.g = i14;
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((rzVar.g & 16) != 0 && (rzVar instanceof rz)) {
                        d21 d21Var2 = rzVar.t;
                        int i15 = 0;
                        l = rzVar;
                        q41Var = q41Var;
                        while (d21Var2 != null) {
                            if ((d21Var2.g & 16) != 0) {
                                i15++;
                                q41Var = q41Var;
                                if (i15 == 1) {
                                    l = d21Var2;
                                } else {
                                    if (q41Var == null) {
                                        q41Var = new q41(new d21[16]);
                                    }
                                    if (l != null) {
                                        q41Var.b(l);
                                        l = null;
                                    }
                                    q41Var.b(d21Var2);
                                }
                            }
                            d21Var2 = d21Var2.j;
                            l = l;
                            q41Var = q41Var;
                        }
                        if (i15 == 1) {
                            i4 = i;
                            rzVar = l;
                            q41Var = q41Var;
                        }
                    }
                    l = hp.l(q41Var);
                    i4 = i;
                    rzVar = l;
                    q41Var = q41Var;
                }
            }
        }
        if (z2) {
            Z0(d21Var, wc0Var, j, ch0Var, i, z, f);
            return;
        }
        switch (wc0Var.e) {
            case 15:
                ?? r4 = 0;
                rz rzVar2 = d21Var;
                while (rzVar2 != 0) {
                    if (rzVar2 instanceof th1) {
                        if (((th1) rzVar2).J()) {
                            z3 = true;
                            break;
                        }
                    } else if ((rzVar2.g & 16) != 0 && (rzVar2 instanceof rz)) {
                        d21 d21Var3 = rzVar2.t;
                        int i16 = 0;
                        rzVar2 = rzVar2;
                        r4 = r4;
                        while (d21Var3 != null) {
                            if ((d21Var3.g & 16) != 0) {
                                i16++;
                                r4 = r4;
                                if (i16 == 1) {
                                    rzVar2 = d21Var3;
                                } else {
                                    if (r4 == 0) {
                                        r4 = new q41(new d21[16]);
                                    }
                                    if (rzVar2 != 0) {
                                        r4.b(rzVar2);
                                        rzVar2 = 0;
                                    }
                                    r4.b(d21Var3);
                                }
                            }
                            d21Var3 = d21Var3.j;
                            rzVar2 = rzVar2;
                            r4 = r4;
                        }
                        if (i16 == 1) {
                        }
                    }
                    rzVar2 = hp.l(r4);
                }
                break;
            default:
                z3 = false;
                break;
        }
        if (z3) {
            d81 d81Var = new d81(this, d21Var, wc0Var, j, ch0Var, i, z, f);
            s31 s31Var2 = ch0Var.f;
            b41 b41Var2 = ch0Var.e;
            int i17 = ch0Var.g;
            int i18 = b41Var2.b;
            if (i17 == i18 - 1) {
                int i19 = i17 + 1;
                ch0Var.b(i19, i18);
                ch0Var.g++;
                b41Var2.a(d21Var);
                s31Var2.a(xn.b(f, z, false));
                d81Var.invoke();
                ch0Var.g = i17;
                if (i19 != b41Var2.b - 1 && !hp.B(ch0Var.a())) {
                    return;
                }
                int i20 = ch0Var.g;
                int i21 = i20 + 1;
                b41Var2.k(i21);
                if (i21 >= 0 && i21 < (i3 = s31Var2.b)) {
                    long[] jArr = s31Var2.a;
                    long j3 = jArr[i21];
                    if (i21 != i3 - 1) {
                        bf.C(jArr, jArr, i21, i20 + 2, i3);
                    }
                    s31Var2.b--;
                    return;
                }
                se.u("Index must be between 0 and size");
                return;
            }
            long a2 = ch0Var.a();
            int i22 = ch0Var.g;
            int i23 = b41Var2.b;
            int i24 = i23 - 1;
            ch0Var.g = i24;
            ch0Var.b(i23, b41Var2.b);
            ch0Var.g++;
            b41Var2.a(d21Var);
            s31Var2.a(xn.b(f, z, false));
            d81Var.invoke();
            ch0Var.g = i24;
            long a3 = ch0Var.a();
            if (ch0Var.g + 1 < b41Var2.b - 1 && hp.o(a2, a3) > 0) {
                int i25 = i22 + 1;
                boolean B = hp.B(a3);
                int i26 = ch0Var.g;
                if (B) {
                    i2 = i26 + 2;
                } else {
                    i2 = i26 + 1;
                }
                ch0Var.b(i25, i2);
            } else {
                ch0Var.b(ch0Var.g + 1, b41Var2.b);
            }
            ch0Var.g = i22;
            return;
        }
        j1(xn.o(d21Var, wc0Var.j()), wc0Var, j, ch0Var, i, z, f, false);
    }

    @Override // defpackage.iq0
    public final void k(float[] fArr) {
        jc1 a = dr0.a(this.s);
        e81 p1 = p1(qo.D(this));
        s1(p1, fArr);
        if (a instanceof q5) {
            ((q5) a).r(fArr);
            return;
        }
        long u = p1.u(0L);
        if ((9223372034707292159L & u) != 9205357640488583168L) {
            d01.i(fArr, Float.intBitsToFloat((int) (u >> 32)), Float.intBitsToFloat((int) (u & 4294967295L)));
        }
    }

    public abstract void k1(tl tlVar, tf0 tf0Var);

    @Override // defpackage.iq0
    public final void l(iq0 iq0Var, float[] fArr) {
        e81 p1 = p1(iq0Var);
        p1.e1();
        e81 R0 = R0(p1);
        d01.d(fArr);
        p1.s1(R0, fArr);
        r1(R0, fArr);
    }

    public final void l1(long j, float f, oe0 oe0Var) {
        t1(false, oe0Var);
        boolean a = xm0.a(this.D, j);
        ar0 ar0Var = this.s;
        if (!a) {
            ((q5) dr0.a(ar0Var)).K(-4.0f);
            this.D = j;
            ar0Var.K.p.x0();
            ic1 ic1Var = this.P;
            if (ic1Var != null) {
                ((vf0) ic1Var).d(j);
            } else {
                e81 e81Var = this.u;
                if (e81Var != null) {
                    e81Var.c1();
                }
            }
            ar0Var.N();
            ty0.H0(this);
            jc1 jc1Var = ar0Var.s;
            if (jc1Var != null) {
                ((q5) jc1Var).w(ar0Var);
            }
        }
        this.E = f;
        if (this == ar0Var.J.d) {
            ((q5) dr0.a(ar0Var)).getRectManager().f(ar0Var, false);
        }
        if (!this.o) {
            x0(D0());
        }
    }

    @Override // defpackage.iq0
    public final long m() {
        return this.g;
    }

    public final void m1(h41 h41Var, boolean z, boolean z2) {
        ic1 ic1Var = this.P;
        if (ic1Var != null) {
            if (this.w) {
                if (z2) {
                    long U0 = U0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (U0 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (U0 & 4294967295L)) / 2.0f;
                    long j = this.g;
                    h41Var.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j >> 32)) + intBitsToFloat, ((int) (j & 4294967295L)) + intBitsToFloat2);
                } else if (z) {
                    long j2 = this.g;
                    h41Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (h41Var.b()) {
                    return;
                }
            }
            vf0 vf0Var = (vf0) ic1Var;
            float[] b = vf0Var.b();
            if (!vf0Var.w) {
                if (b == null) {
                    h41Var.a = 0.0f;
                    h41Var.b = 0.0f;
                    h41Var.c = 0.0f;
                    h41Var.d = 0.0f;
                } else {
                    d01.c(b, h41Var);
                }
            }
        }
        long j3 = this.D;
        float f = (int) (j3 >> 32);
        h41Var.a += f;
        h41Var.c += f;
        float f2 = (int) (j3 & 4294967295L);
        h41Var.b += f2;
        h41Var.d += f2;
    }

    public final void n1() {
        if (this.P != null) {
            t1(false, null);
            this.s.W(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [d21] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [q41] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [q41] */
    public final void o1(k01 k01Var) {
        e81 e81Var;
        k01 k01Var2 = this.B;
        if (k01Var != k01Var2) {
            this.B = k01Var;
            ar0 ar0Var = this.s;
            int i = 0;
            if (k01Var2 == null || k01Var.d() != k01Var2.d() || k01Var.c() != k01Var2.c()) {
                int d = k01Var.d();
                int c = k01Var.c();
                ic1 ic1Var = this.P;
                if (ic1Var != null) {
                    ((vf0) ic1Var).e((d << 32) | (c & 4294967295L));
                } else if (ar0Var.I() && (e81Var = this.u) != null) {
                    e81Var.c1();
                }
                o0((c & 4294967295L) | (d << 32));
                if (this.x != null) {
                    u1(false);
                }
                boolean g = f81.g(4);
                d21 V0 = V0();
                if (g || (V0 = V0.i) != null) {
                    for (d21 X0 = X0(g); X0 != null && (X0.h & 4) != 0; X0 = X0.j) {
                        if ((X0.g & 4) != 0) {
                            rz rzVar = X0;
                            ?? r9 = 0;
                            while (rzVar != 0) {
                                if (rzVar instanceof b40) {
                                    ((b40) rzVar).I();
                                } else if ((rzVar.g & 4) != 0 && (rzVar instanceof rz)) {
                                    d21 d21Var = rzVar.t;
                                    int i2 = 0;
                                    rzVar = rzVar;
                                    r9 = r9;
                                    while (d21Var != null) {
                                        if ((d21Var.g & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                rzVar = d21Var;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r9.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r9.b(d21Var);
                                            }
                                        }
                                        d21Var = d21Var.j;
                                        rzVar = rzVar;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                rzVar = hp.l(r9);
                            }
                        }
                        if (X0 == V0) {
                            break;
                        }
                    }
                }
                jc1 jc1Var = ar0Var.s;
                if (jc1Var != null) {
                    ((q5) jc1Var).w(ar0Var);
                }
            }
            x31 x31Var = this.C;
            if ((x31Var != null && x31Var.e != 0) || !k01Var.b().isEmpty()) {
                x31 x31Var2 = this.C;
                Map b = k01Var.b();
                if (x31Var2 != null && x31Var2.e == b.size()) {
                    Object[] objArr = x31Var2.b;
                    int[] iArr = x31Var2.c;
                    long[] jArr = x31Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        loop0: while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = i; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        int i6 = (i3 << 3) + i5;
                                        Object obj = objArr[i6];
                                        int i7 = iArr[i6];
                                        Integer num = (Integer) b.get((j3) obj);
                                        if (num == null || num.intValue() != i7) {
                                            break loop0;
                                        }
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                    return;
                                }
                            }
                            if (i3 != length) {
                                i3++;
                                i = 0;
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                ar0Var.K.p.B.f();
                x31 x31Var3 = this.C;
                if (x31Var3 == null) {
                    x31 x31Var4 = t81.a;
                    x31Var3 = new x31();
                    this.C = x31Var3;
                }
                x31Var3.a();
                for (Map.Entry entry : k01Var.b().entrySet()) {
                    x31Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
                }
            }
        }
    }

    public final pl1 q1() {
        if (V0().r) {
            iq0 D = qo.D(this);
            h41 h41Var = this.F;
            if (h41Var == null) {
                h41Var = new h41();
                this.F = h41Var;
            }
            long M0 = M0(U0());
            int i = (int) (M0 >> 32);
            h41Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (M0 & 4294967295L);
            h41Var.b = -Float.intBitsToFloat(i2);
            h41Var.c = Float.intBitsToFloat(i) + f0();
            h41Var.d = Float.intBitsToFloat(i2) + e0();
            while (this != D) {
                this.m1(h41Var, false, true);
                if (!h41Var.b()) {
                    this = this.u;
                    this.getClass();
                }
            }
            return new pl1(h41Var.a, h41Var.b, h41Var.c, h41Var.d);
        }
        return pl1.e;
    }

    @Override // defpackage.kc1
    public final boolean r() {
        if (this.P != null && !this.v && this.s.H()) {
            return true;
        }
        return false;
    }

    public final void r1(e81 e81Var, float[] fArr) {
        float[] a;
        if (!sn0.r(e81Var, this)) {
            e81 e81Var2 = this.u;
            e81Var2.getClass();
            e81Var2.r1(e81Var, fArr);
            if (!xm0.a(this.D, 0L)) {
                float[] fArr2 = S;
                d01.d(fArr2);
                long j = this.D;
                d01.i(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
                d01.h(fArr, fArr2);
            }
            ic1 ic1Var = this.P;
            if (ic1Var != null && (a = ((vf0) ic1Var).a()) != null) {
                d01.h(fArr, a);
            }
        }
    }

    public final void s1(e81 e81Var, float[] fArr) {
        while (!this.equals(e81Var)) {
            ic1 ic1Var = this.P;
            if (ic1Var != null) {
                d01.h(fArr, ((vf0) ic1Var).b());
            }
            if (!xm0.a(this.D, 0L)) {
                float[] fArr2 = S;
                d01.d(fArr2);
                d01.i(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                d01.h(fArr, fArr2);
            }
            this = this.u;
            this.getClass();
        }
    }

    public final void t1(boolean z, oe0 oe0Var) {
        boolean z2;
        jc1 jc1Var;
        q41 q41Var;
        Reference poll;
        g6 g6Var;
        q41 q41Var2;
        Reference poll2;
        Object obj;
        int i = 0;
        ar0 ar0Var = this.s;
        if (!z && this.x == oe0Var && sn0.r(this.y, ar0Var.C) && this.z == ar0Var.D) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.y = ar0Var.C;
        this.z = ar0Var.D;
        boolean H = ar0Var.H();
        b81 b81Var = this.N;
        if (H && oe0Var != null) {
            this.x = oe0Var;
            if (this.P == null) {
                jc1 a = dr0.a(ar0Var);
                g6 g6Var2 = this.M;
                if (g6Var2 == null) {
                    g6 g6Var3 = new g6(3, this, new b81(this, i));
                    this.M = g6Var3;
                    g6Var = g6Var3;
                } else {
                    g6Var = g6Var2;
                }
                q5 q5Var = (q5) a;
                h12 h12Var = q5Var.y0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) h12Var.g;
                    q41Var2 = (q41) h12Var.f;
                    poll2 = referenceQueue.poll();
                    if (poll2 != null) {
                        q41Var2.j(poll2);
                    }
                } while (poll2 != null);
                while (true) {
                    int i2 = q41Var2.g;
                    if (i2 != 0) {
                        obj = ((Reference) q41Var2.k(i2 - 1)).get();
                        if (obj != null) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ic1 ic1Var = (ic1) obj;
                if (ic1Var != null) {
                    vf0 vf0Var = (vf0) ic1Var;
                    sf0 sf0Var = vf0Var.f;
                    if (sf0Var != null) {
                        if (!vf0Var.e.s) {
                            kl0.a("layer should have been released before reuse");
                        }
                        vf0Var.e = sf0Var.b();
                        vf0Var.k = false;
                        vf0Var.h = g6Var;
                        vf0Var.i = b81Var;
                        vf0Var.u = false;
                        vf0Var.v = false;
                        vf0Var.w = true;
                        d01.d(vf0Var.l);
                        float[] fArr = vf0Var.m;
                        if (fArr != null) {
                            d01.d(fArr);
                        }
                        vf0Var.s = cb2.b;
                        vf0Var.x = false;
                        vf0Var.j = 9223372034707292159L;
                        vf0Var.t = null;
                        vf0Var.r = 0;
                    } else {
                        throw l90.f("currently reuse is only supported when we manage the layer lifecycle");
                    }
                } else {
                    ic1Var = new vf0(q5Var.getGraphicsContext().b(), q5Var.getGraphicsContext(), q5Var, g6Var, b81Var);
                }
                vf0 vf0Var2 = (vf0) ic1Var;
                vf0Var2.e(this.g);
                vf0Var2.d(this.D);
                this.P = ic1Var;
                u1(true);
                ar0Var.N = true;
                b81Var.invoke();
                return;
            }
            if (z2) {
                u1(true);
                return;
            }
            return;
        }
        this.x = null;
        ic1 ic1Var2 = this.P;
        if (ic1Var2 != null) {
            vf0 vf0Var3 = (vf0) ic1Var2;
            if (!qo.Q(vf0Var3.b())) {
                ar0Var.N();
            }
            vf0Var3.h = null;
            vf0Var3.i = null;
            vf0Var3.k = true;
            vf0Var3.f(false);
            sf0 sf0Var2 = vf0Var3.f;
            if (sf0Var2 != null) {
                sf0Var2.a(vf0Var3.e);
                q5 q5Var2 = vf0Var3.g;
                h12 h12Var2 = q5Var2.y0;
                do {
                    ReferenceQueue referenceQueue2 = (ReferenceQueue) h12Var2.g;
                    q41Var = (q41) h12Var2.f;
                    poll = referenceQueue2.poll();
                    if (poll != null) {
                        q41Var.j(poll);
                    }
                } while (poll != null);
                q41Var.b(new WeakReference(vf0Var3, (ReferenceQueue) h12Var2.g));
                q5Var2.H.j(vf0Var3);
            }
            ar0Var.N = true;
            b81Var.invoke();
            if (V0().r && ar0Var.I() && (jc1Var = ar0Var.s) != null) {
                ((q5) jc1Var).w(ar0Var);
            }
        }
        this.P = null;
        this.O = false;
    }

    @Override // defpackage.iq0
    public final long u(long j) {
        if (!V0().r) {
            kl0.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((q5) dr0.a(this.s)).s(Q(j));
    }

    public final void u1(boolean z) {
        char c;
        q5 q5Var;
        boolean z2;
        q5 q5Var2;
        boolean z3;
        jc1 jc1Var;
        de0 de0Var;
        de0 de0Var2;
        ic1 ic1Var = this.P;
        oe0 oe0Var = this.x;
        if (ic1Var != null) {
            if (oe0Var != null) {
                io1 io1Var = Q;
                io1Var.b();
                ar0 ar0Var = this.s;
                io1Var.s = ar0Var.C;
                io1Var.t = ar0Var.D;
                io1Var.r = vn.O(this.g);
                ((q5) dr0.a(ar0Var)).getSnapshotObserver().a.c(this, i5.I, new f5(8, oe0Var, this));
                fq0 fq0Var = this.G;
                if (fq0Var == null) {
                    fq0Var = new fq0();
                    this.G = fq0Var;
                }
                fq0 fq0Var2 = R;
                fq0Var2.getClass();
                fq0Var2.a = fq0Var.a;
                fq0Var2.b = fq0Var.b;
                fq0Var2.c = fq0Var.c;
                fq0Var2.d = fq0Var.d;
                fq0Var2.e = fq0Var.e;
                fq0Var2.f = fq0Var.f;
                float f = io1Var.f;
                fq0Var.a = f;
                fq0Var.b = io1Var.g;
                fq0Var.c = io1Var.i;
                fq0Var.d = io1Var.m;
                fq0Var.e = io1Var.n;
                long j = io1Var.o;
                fq0Var.f = j;
                vf0 vf0Var = (vf0) ic1Var;
                q5 q5Var3 = vf0Var.g;
                int i = io1Var.e | vf0Var.r;
                vf0Var.p = io1Var.t;
                vf0Var.o = io1Var.s;
                int i2 = i & 4096;
                if (i2 != 0) {
                    vf0Var.s = j;
                }
                if ((i & 1) != 0) {
                    xf0 xf0Var = vf0Var.e.a;
                    if (xf0Var.j != f) {
                        xf0Var.j = f;
                        xf0Var.c.setScaleX(f);
                    }
                }
                if ((i & 2) != 0) {
                    tf0 tf0Var = vf0Var.e;
                    float f2 = io1Var.g;
                    xf0 xf0Var2 = tf0Var.a;
                    if (xf0Var2.k != f2) {
                        xf0Var2.k = f2;
                        xf0Var2.c.setScaleY(f2);
                    }
                }
                if ((i & 4) != 0) {
                    tf0 tf0Var2 = vf0Var.e;
                    float f3 = io1Var.h;
                    xf0 xf0Var3 = tf0Var2.a;
                    if (xf0Var3.h != f3) {
                        xf0Var3.h = f3;
                        xf0Var3.c.setAlpha(f3);
                    }
                }
                if ((i & 8) != 0) {
                    xf0 xf0Var4 = vf0Var.e.a;
                }
                if ((i & 16) != 0) {
                    tf0 tf0Var3 = vf0Var.e;
                    float f4 = io1Var.i;
                    xf0 xf0Var5 = tf0Var3.a;
                    if (xf0Var5.l != f4) {
                        xf0Var5.l = f4;
                        xf0Var5.c.setTranslationY(f4);
                    }
                }
                if ((i & 32) != 0) {
                    tf0 tf0Var4 = vf0Var.e;
                    float f5 = io1Var.j;
                    xf0 xf0Var6 = tf0Var4.a;
                    if (xf0Var6.m != f5) {
                        xf0Var6.m = f5;
                        xf0Var6.c.setElevation(f5);
                        tf0Var4.g = true;
                        tf0Var4.a();
                    }
                    if (io1Var.j > 0.0f && !vf0Var.x && (de0Var2 = vf0Var.i) != null) {
                        de0Var2.invoke();
                    }
                }
                if ((i & 64) != 0) {
                    tf0 tf0Var5 = vf0Var.e;
                    long j2 = io1Var.k;
                    xf0 xf0Var7 = tf0Var5.a;
                    if (!co.c(j2, xf0Var7.n)) {
                        xf0Var7.n = j2;
                        xf0Var7.c.setAmbientShadowColor(go.U(j2));
                    }
                }
                if ((i & 128) != 0) {
                    tf0 tf0Var6 = vf0Var.e;
                    long j3 = io1Var.l;
                    xf0 xf0Var8 = tf0Var6.a;
                    if (!co.c(j3, xf0Var8.o)) {
                        xf0Var8.o = j3;
                        xf0Var8.c.setSpotShadowColor(go.U(j3));
                    }
                }
                if ((i & 1024) != 0) {
                    tf0 tf0Var7 = vf0Var.e;
                    float f6 = io1Var.m;
                    xf0 xf0Var9 = tf0Var7.a;
                    if (xf0Var9.p != f6) {
                        xf0Var9.p = f6;
                        xf0Var9.c.setRotationZ(f6);
                    }
                }
                if ((i & 256) != 0) {
                    xf0 xf0Var10 = vf0Var.e.a;
                }
                if ((i & 512) != 0) {
                    xf0 xf0Var11 = vf0Var.e.a;
                }
                if ((i & 2048) != 0) {
                    tf0 tf0Var8 = vf0Var.e;
                    float f7 = io1Var.n;
                    xf0 xf0Var12 = tf0Var8.a;
                    if (xf0Var12.q != f7) {
                        xf0Var12.q = f7;
                        xf0Var12.c.setCameraDistance(f7);
                    }
                }
                if (i2 != 0) {
                    c = ' ';
                    boolean a = cb2.a(vf0Var.s, cb2.b);
                    tf0 tf0Var9 = vf0Var.e;
                    if (a) {
                        tf0Var9.g(9205357640488583168L);
                    } else {
                        float intBitsToFloat = Float.intBitsToFloat((int) (vf0Var.s >> 32)) * ((int) (vf0Var.j >> 32));
                        tf0Var9.g((Float.floatToRawIntBits(Float.intBitsToFloat((int) (vf0Var.s & 4294967295L)) * ((int) (vf0Var.j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
                    }
                } else {
                    c = ' ';
                }
                if ((i & 16384) != 0) {
                    tf0 tf0Var10 = vf0Var.e;
                    boolean z4 = io1Var.q;
                    if (tf0Var10.w != z4) {
                        tf0Var10.w = z4;
                        tf0Var10.g = true;
                        tf0Var10.a();
                    }
                }
                if ((131072 & i) != 0) {
                    xf0 xf0Var13 = vf0Var.e.a;
                }
                if ((262144 & i) != 0) {
                    xf0 xf0Var14 = vf0Var.e.a;
                }
                if ((524288 & i) != 0) {
                    tf0 tf0Var11 = vf0Var.e;
                    int i3 = io1Var.u;
                    xf0 xf0Var15 = tf0Var11.a;
                    if (xf0Var15.i != i3) {
                        xf0Var15.i = i3;
                        Paint paint = xf0Var15.e;
                        if (paint == null) {
                            paint = new Paint();
                            xf0Var15.e = paint;
                        }
                        paint.setBlendMode(c01.T(i3));
                        xf0Var15.c();
                    }
                }
                if ((32768 & i) != 0) {
                    xf0 xf0Var16 = vf0Var.e.a;
                    if (xf0Var16.u != 0) {
                        xf0Var16.u = 0;
                        xf0Var16.c();
                    }
                }
                if ((i & 7963) != 0) {
                    vf0Var.u = true;
                    vf0Var.v = true;
                }
                if (!sn0.r(vf0Var.t, io1Var.v)) {
                    lo loVar = io1Var.v;
                    vf0Var.t = loVar;
                    if (loVar == null) {
                        q5Var = q5Var3;
                    } else {
                        tf0 tf0Var12 = vf0Var.e;
                        if (loVar instanceof vb1) {
                            pl1 pl1Var = ((vb1) loVar).e;
                            float f8 = pl1Var.a;
                            float f9 = pl1Var.b;
                            q5Var = q5Var3;
                            tf0Var12.i(0.0f, (Float.floatToRawIntBits(f8) << c) | (Float.floatToRawIntBits(f9) & 4294967295L), (Float.floatToRawIntBits(pl1Var.c - f8) << c) | (Float.floatToRawIntBits(pl1Var.d - f9) & 4294967295L));
                        } else {
                            q5Var = q5Var3;
                            if (loVar instanceof ub1) {
                                n8 n8Var = ((ub1) loVar).e;
                                tf0Var12.k = null;
                                tf0Var12.i = 9205357640488583168L;
                                tf0Var12.h = 0L;
                                tf0Var12.j = 0.0f;
                                tf0Var12.g = true;
                                tf0Var12.n = false;
                                tf0Var12.l = n8Var;
                                tf0Var12.a();
                            } else if (loVar instanceof wb1) {
                                wb1 wb1Var = (wb1) loVar;
                                n8 n8Var2 = wb1Var.f;
                                if (n8Var2 != null) {
                                    tf0Var12.k = null;
                                    tf0Var12.i = 9205357640488583168L;
                                    tf0Var12.h = 0L;
                                    tf0Var12.j = 0.0f;
                                    tf0Var12.g = true;
                                    tf0Var12.n = false;
                                    tf0Var12.l = n8Var2;
                                    tf0Var12.a();
                                } else {
                                    ip1 ip1Var = wb1Var.e;
                                    float f10 = ip1Var.b;
                                    float f11 = ip1Var.a;
                                    tf0Var12.i(Float.intBitsToFloat((int) (ip1Var.h >> c)), (Float.floatToRawIntBits(f11) << c) | (Float.floatToRawIntBits(f10) & 4294967295L), (Float.floatToRawIntBits(ip1Var.c - f11) << c) | (Float.floatToRawIntBits(ip1Var.d - f10) & 4294967295L));
                                }
                            } else {
                                se.m();
                                return;
                            }
                        }
                        if ((loVar instanceof ub1) && Build.VERSION.SDK_INT < 33 && (de0Var = vf0Var.i) != null) {
                            de0Var.invoke();
                        }
                    }
                    z2 = true;
                } else {
                    q5Var = q5Var3;
                    z2 = false;
                }
                vf0Var.r = io1Var.e;
                if (i != 0 || z2) {
                    ViewParent parent = q5Var.getParent();
                    if (parent != null) {
                        q5Var2 = q5Var;
                        parent.onDescendantInvalidated(q5Var2, q5Var2);
                    } else {
                        q5Var2 = q5Var;
                    }
                    if (q5Var2.p) {
                        q5Var2.K(0.0f);
                    }
                }
                boolean z5 = this.w;
                this.w = io1Var.q;
                this.A = io1Var.h;
                if (fq0Var2.a == fq0Var.a && fq0Var2.b == fq0Var.b && fq0Var2.c == fq0Var.c && fq0Var2.d == fq0Var.d && fq0Var2.e == fq0Var.e && cb2.a(fq0Var2.f, fq0Var.f)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && ((!z3 || z5 != this.w) && (jc1Var = ar0Var.s) != null)) {
                    ((q5) jc1Var).w(ar0Var);
                }
                if (!z3) {
                    er0 er0Var = ar0Var.K;
                    if (er0Var.l > 0) {
                        if (er0Var.k || er0Var.j) {
                            ar0Var.W(false);
                        }
                        er0Var.p.x0();
                    }
                    ar0Var.N();
                    q5 q5Var4 = (q5) dr0.a(ar0Var);
                    rl1 rectManager = q5Var4.getRectManager();
                    if (this == ar0Var.J.d) {
                        rectManager.f(ar0Var, false);
                    } else {
                        rectManager.getClass();
                        if (ar0Var.I()) {
                            long g = rl1.g(ar0Var);
                            if (!xm0.a(g, 9223372034707292159L)) {
                                ar0Var.j = g;
                                ar0Var.k = false;
                                q41 z6 = ar0Var.z();
                                Object[] objArr = z6.e;
                                int i4 = z6.g;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    rectManager.f((ar0) objArr[i5], false);
                                }
                                rectManager.e(ar0Var);
                            } else {
                                rectManager.d(ar0Var);
                            }
                        }
                    }
                    if (ar0Var.R > 0) {
                        sl0 sl0Var = q5Var4.W.e;
                        sl0Var.getClass();
                        if (ar0Var.R > 0) {
                            ((q41) sl0Var.e).b(ar0Var);
                            ar0Var.Q = true;
                        }
                        q5Var4.D(null);
                        return;
                    }
                    return;
                }
                return;
            }
            throw l90.f("updateLayerParameters requires a non-null layerBlock");
        }
        if (oe0Var == null) {
            return;
        }
        kl0.b("null layer with a non-null layerBlock");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v1(long r24) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e81.v1(long):boolean");
    }

    @Override // defpackage.ty0
    public final ty0 z0() {
        return this.t;
    }

    @Override // defpackage.ty0
    public final iq0 A0() {
        return this;
    }
}
