package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.elixir.loader.R;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class xp1 {
    public static ij0 a;

    public static final void a(ur urVar, e21 e21Var) {
        b7 b7Var = b7.i;
        int hashCode = Long.hashCode(urVar.T);
        e21 Q = fp.Q(urVar, e21Var);
        sf1 l = urVar.l();
        lr.b.getClass();
        hs hsVar = kr.b;
        urVar.a0();
        if (urVar.S) {
            urVar.k(hsVar);
        } else {
            urVar.k0();
        }
        op1.q(urVar, kr.f, b7Var);
        op1.q(urVar, kr.e, l);
        op1.o(urVar, kr.h);
        op1.q(urVar, kr.d, Q);
        op1.l(urVar, Integer.valueOf(hashCode), kr.g);
        urVar.p(true);
    }

    public static final void b(boolean z, um1 um1Var, b82 b82Var, ur urVar, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        x82 d;
        int i3;
        int i4;
        int i5;
        urVar.Y(-1344558920);
        if ((i & 6) == 0) {
            if (urVar.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.d(um1Var.ordinal())) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (urVar.h(b82Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i2 & 1, z2)) {
            int i6 = i2 & 14;
            if (i6 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f = z3 | urVar.f(b82Var);
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (f || L == xl1Var) {
                L = new y72(b82Var, z);
                urVar.h0(L);
            }
            b72 b72Var = (b72) L;
            boolean h = urVar.h(b82Var);
            if (i6 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | h;
            Object L2 = urVar.L();
            if (z5 || L2 == xl1Var) {
                L2 = new c82(b82Var, z);
                urVar.h0(L2);
            }
            d91 d91Var = (d91) L2;
            boolean g = d92.g(b82Var.n().b);
            if (z) {
                j = b82Var.n().b >> 32;
            } else {
                j = b82Var.n().b & 4294967295L;
            }
            int i7 = (int) j;
            gu0 gu0Var = b82Var.d;
            float f2 = 0.0f;
            if (gu0Var != null && (d = gu0Var.d()) != null) {
                w82 w82Var = d.a;
                if (i7 >= 0) {
                    v82 v82Var = w82Var.a;
                    g31 g31Var = w82Var.b;
                    if (v82Var.a.f.length() != 0) {
                        int min = Math.min(g31Var.d(i7), Math.min(g31Var.b - 1, g31Var.f - 1));
                        if (i7 <= g31Var.c(min, false)) {
                            g31Var.l(min);
                            ArrayList arrayList = g31Var.h;
                            zd1 zd1Var = (zd1) arrayList.get(vn.y(min, arrayList));
                            i8 i8Var = zd1Var.a;
                            int i8 = min - zd1Var.d;
                            u82 u82Var = i8Var.d;
                            f2 = u82Var.e(i8) - u82Var.g(i8);
                        }
                    }
                }
            }
            float f3 = f2;
            boolean h2 = urVar.h(b72Var);
            Object L3 = urVar.L();
            if (h2 || L3 == xl1Var) {
                L3 = new i7(b72Var, 7);
                urVar.h0(L3);
            }
            d6.k(d91Var, z, um1Var, g, 0L, f3, s42.a(b21.a, b72Var, (PointerInputEventHandler) L3), urVar, (i2 << 3) & 1008);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new o9(z, um1Var, b82Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [tl1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.ds1 r9, float r10, defpackage.hc r11, defpackage.tx r12, defpackage.oe0 r13, defpackage.wt r14) {
        /*
            boolean r0 = r14 instanceof defpackage.e02
            if (r0 == 0) goto L13
            r0 = r14
            e02 r0 = (defpackage.e02) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            e02 r0 = new e02
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.h
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            float r10 = r0.e
            tl1 r9 = r0.g
            hc r11 = r0.f
            defpackage.io.K(r14)
            goto L69
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r9)
            r9 = 0
            return r9
        L32:
            defpackage.io.K(r14)
            tl1 r5 = new tl1
            r5.<init>()
            java.lang.Object r14 = r11.a()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4b
            r14 = r2
            goto L4c
        L4b:
            r14 = 0
        L4c:
            r14 = r14 ^ r2
            d02 r3 = new d02
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f = r11
            r0.g = r5
            r0.e = r4
            r0.i = r2
            java.lang.Object r9 = defpackage.yq1.h(r11, r12, r14, r3, r0)
            hv r10 = defpackage.hv.e
            if (r9 != r10) goto L67
            return r10
        L67:
            r10 = r4
            r9 = r5
        L69:
            dc r12 = new dc
            float r9 = r9.e
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.c(ds1, float, hc, tx, oe0, wt):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0, types: [tl1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.ds1 r16, float r17, float r18, defpackage.hc r19, defpackage.gc r20, defpackage.oe0 r21, defpackage.wt r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.f02
            if (r2 == 0) goto L18
            r2 = r1
            f02 r2 = (defpackage.f02) r2
            int r3 = r2.j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.j = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            f02 r2 = new f02
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.i
            int r2 = r8.j
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            float r0 = r8.f
            float r2 = r8.e
            tl1 r3 = r8.h
            hc r4 = r8.g
            defpackage.io.K(r1)
            r1 = r0
            r0 = r2
            goto L8f
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r0)
            r0 = 0
            return r0
        L3d:
            defpackage.io.K(r1)
            tl1 r12 = new tl1
            r12.<init>()
            java.lang.Object r1 = r19.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L64
            r2 = r3
            goto L65
        L64:
            r2 = 0
        L65:
            r6 = r2 ^ 1
            d02 r10 = new d02
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.g = r2
            r8.h = r12
            r8.e = r0
            r8.f = r1
            r8.j = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = defpackage.yq1.i(r3, r4, r5, r6, r7, r8)
            hv r3 = defpackage.hv.e
            if (r2 != r3) goto L8c
            return r3
        L8c:
            r4 = r19
            r3 = r12
        L8f:
            java.lang.Object r2 = r4.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = i(r2, r1)
            dc r2 = new dc
            float r3 = r3.e
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            hc r0 = defpackage.c01.r(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.d(ds1, float, float, hc, gc, oe0, wt):java.lang.Object");
    }

    public static final float e(hg1 hg1Var, boolean z, hi0[] hi0VarArr, float f) {
        boolean z2;
        float f2 = Float.NaN;
        for (hi0 hi0Var : hi0VarArr) {
            float c = hg1Var.c(hi0Var);
            if (!Float.isNaN(f2)) {
                if (c > f2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                }
            }
            f2 = c;
        }
        if (Float.isNaN(f2)) {
            return f;
        }
        return f2;
    }

    public static final void f(fc fcVar, ds1 ds1Var, oe0 oe0Var, float f) {
        float f2;
        try {
            f2 = ds1Var.a(f);
        } catch (CancellationException unused) {
            fcVar.a();
            f2 = 0.0f;
        }
        oe0Var.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            fcVar.a();
        }
    }

    public static void g(StringBuilder sb, Object obj, oe0 oe0Var) {
        boolean z;
        if (oe0Var != null) {
            sb.append((CharSequence) oe0Var.invoke(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static np1 h(int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 8;
        } else {
            i2 = 10;
        }
        float f = i2;
        float cos = 1.0f / ((float) Math.cos(be2.b / f));
        tu tuVar = new tu(2, 1.0f);
        float[] fArr = new float[i2 * 2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long U = lo.U(be2.e(cos, (be2.b / f) * 2.0f * i4), ha0.a(0.0f, 0.0f));
            int i5 = i3 + 1;
            fArr[i3] = lo.G(U);
            i3 += 2;
            fArr[i5] = lo.H(U);
        }
        return op1.a(fArr, tuVar, null, 0.0f, 0.0f);
    }

    public static final float i(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 <= 0.0f ? f < f2 : f > f2) {
            return f2;
        }
        return f;
    }

    public static final boolean j(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final ViewParent k(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final ij0 l() {
        ij0 ij0Var = a;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Outlined.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(1.0f, 21.0f);
        rg2Var.o(22.0f);
        rg2Var.q(12.0f, 2.0f);
        rg2Var.q(1.0f, 21.0f);
        rg2Var.f();
        rg2Var.s(13.0f, 18.0f);
        rg2Var.o(-2.0f);
        rg2Var.E(-2.0f);
        rg2Var.o(2.0f);
        rg2Var.E(2.0f);
        rg2Var.f();
        rg2Var.s(13.0f, 14.0f);
        rg2Var.o(-2.0f);
        rg2Var.E(-4.0f);
        rg2Var.o(2.0f);
        rg2Var.E(4.0f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b = hj0Var.b();
        a = b;
        return b;
    }

    public static final void m(pu1 pu1Var) {
        hp.M(pu1Var).F();
    }

    public static MappedByteBuffer n(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final Object o(ga2 ga2Var, se0 se0Var) {
        Object lpVar;
        Object S;
        lo.J(ga2Var, true, new t10(fp.z(ga2Var.h.getContext()).A(ga2Var.i, ga2Var, ga2Var.g), 0));
        try {
            if (!(se0Var instanceof eh)) {
                lpVar = go.Z(se0Var, ga2Var, ga2Var);
            } else {
                fc2.t(2, se0Var);
                lpVar = se0Var.invoke(ga2Var, ga2Var);
            }
        } catch (Throwable th) {
            lpVar = new lp(th, false);
        }
        hv hvVar = hv.e;
        if (lpVar != hvVar && (S = ga2Var.S(lpVar)) != d6.m) {
            if (S instanceof lp) {
                Throwable th2 = ((lp) S).a;
                if (th2 instanceof fa2) {
                    if (((fa2) th2).e == ga2Var) {
                        if (lpVar instanceof lp) {
                            throw ((lp) lpVar).a;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    throw th2;
                }
            } else {
                lpVar = d6.G(S);
            }
            return lpVar;
        }
        return hvVar;
    }

    public static np1 p(int i, tu tuVar) {
        tuVar.getClass();
        float[] fArr = new float[i * 4];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f = be2.b / i;
            long e = be2.e(1.0f, 2.0f * f * i3);
            fArr[i2] = lo.G(e) + 0.0f;
            fArr[i2 + 1] = lo.H(e) + 0.0f;
            long e2 = be2.e(0.8f, f * ((i3 * 2) + 1));
            int i4 = i2 + 3;
            fArr[i2 + 2] = lo.G(e2) + 0.0f;
            i2 += 4;
            fArr[i4] = lo.H(e2) + 0.0f;
        }
        return op1.a(fArr, tuVar, null, 0.0f, 0.0f);
    }

    public static final void q(ru1 ru1Var, int i, yr1 yr1Var) {
        ru1 ru1Var2;
        q41 q41Var = new q41(new ru1[16]);
        List i2 = ru1Var.i(false, false);
        while (true) {
            q41Var.d(q41Var.g, i2);
            while (true) {
                int i3 = q41Var.g;
                if (i3 != 0) {
                    ru1Var2 = (ru1) q41Var.k(i3 - 1);
                    boolean A = mp0.A(ru1Var2);
                    mu1 mu1Var = ru1Var2.d;
                    i41 i41Var = mu1Var.e;
                    if (!A && !i41Var.c(vu1.i)) {
                        e81 d = ru1Var2.d();
                        if (d != null) {
                            bn0 O = hp.O(qo.j(d, true));
                            if (O.a < O.c && O.b < O.d) {
                                Object g = mu1Var.e.g(lu1.e);
                                Object obj = null;
                                if (g == null) {
                                    g = null;
                                }
                                se0 se0Var = (se0) g;
                                Object g2 = i41Var.g(vu1.v);
                                if (g2 != null) {
                                    obj = g2;
                                }
                                xr1 xr1Var = (xr1) obj;
                                if (se0Var != null && xr1Var != null && ((Number) xr1Var.b.invoke()).floatValue() > 0.0f) {
                                    int i4 = 1 + i;
                                    yr1Var.invoke(new zr1(ru1Var2, i4, O, d));
                                    q(ru1Var2, i4, yr1Var);
                                }
                            }
                        } else {
                            throw l90.f("Expected semantics node to have a coordinator.");
                        }
                    }
                } else {
                    return;
                }
            }
            i2 = ru1Var2.i(false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, wl1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(long r6, defpackage.se0 r8, defpackage.wt r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ha2
            if (r0 == 0) goto L13
            r0 = r9
            ha2 r0 = (defpackage.ha2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ha2 r0 = new ha2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            wl1 r6 = r0.e
            defpackage.io.K(r9)     // Catch: defpackage.fa2 -> L28
            return r9
        L28:
            r7 = move-exception
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            return r2
        L30:
            defpackage.io.K(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3a
            goto L5c
        L3a:
            wl1 r9 = new wl1
            r9.<init>()
            r0.e = r9     // Catch: defpackage.fa2 -> L54
            r0.g = r3     // Catch: defpackage.fa2 -> L54
            ga2 r1 = new ga2     // Catch: defpackage.fa2 -> L54
            r1.<init>(r6, r0)     // Catch: defpackage.fa2 -> L54
            r9.e = r1     // Catch: defpackage.fa2 -> L54
            java.lang.Object r6 = o(r1, r8)     // Catch: defpackage.fa2 -> L54
            hv r7 = defpackage.hv.e
            if (r6 != r7) goto L53
            return r7
        L53:
            return r6
        L54:
            r7 = move-exception
            r6 = r9
        L56:
            go0 r8 = r7.e
            java.lang.Object r6 = r6.e
            if (r8 != r6) goto L5d
        L5c:
            return r2
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp1.r(long, se0, wt):java.lang.Object");
    }
}
