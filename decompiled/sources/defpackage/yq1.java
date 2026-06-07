package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import com.elixir.loader.R;
import java.text.Bidi;
import java.util.List;

/* loaded from: classes.dex */
public abstract class yq1 {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;
    public static final int f = 48;

    public static final double A(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final String B(int i, long j) {
        if (j >= 0) {
            mp0.m(i);
            String l = Long.toString(j, i);
            l.getClass();
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        mp0.m(i);
        String l2 = Long.toString(j3, i);
        l2.getClass();
        mp0.m(i);
        String l3 = Long.toString(j4, i);
        l3.getClass();
        return l2.concat(l3);
    }

    public static final void C(fc fcVar, hc hcVar) {
        hcVar.f.setValue(fcVar.e.getValue());
        mc mcVar = hcVar.g;
        mc mcVar2 = fcVar.f;
        int b2 = mcVar.b();
        for (int i = 0; i < b2; i++) {
            mcVar.e(i, mcVar2.a(i));
        }
        hcVar.i = fcVar.h;
        hcVar.h = fcVar.g;
        hcVar.j = ((Boolean) fcVar.i.getValue()).booleanValue();
    }

    public static final void D(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final long a(float f2, float f3) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        int i = cb2.c;
        return floatToRawIntBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.v42 r6, defpackage.eh r7) {
        /*
            boolean r0 = r7 instanceof defpackage.zt1
            if (r0 == 0) goto L13
            r0 = r7
            zt1 r0 = (defpackage.zt1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            zt1 r0 = new zt1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            v42 r6 = r0.e
            defpackage.io.K(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.io.K(r7)
        L31:
            r0.e = r6
            r0.g = r2
            kh1 r7 = defpackage.kh1.f
            java.lang.Object r7 = r6.b(r7, r0)
            hv r1 = defpackage.hv.e
            if (r7 != r1) goto L40
            return r1
        L40:
            jh1 r7 = (defpackage.jh1) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            qh1 r5 = (defpackage.qh1) r5
            boolean r5 = defpackage.qo.n(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq1.b(v42, eh):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:12:0x002d, B:13:0x00c4, B:15:0x00cc, B:17:0x00d9, B:19:0x00e5, B:21:0x00e8, B:24:0x00eb, B:27:0x00ef, B:35:0x0091, B:37:0x0095, B:38:0x0097, B:40:0x009b, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:48:0x00ab, B:49:0x00b0, B:58:0x0051, B:60:0x005f, B:61:0x0064, B:64:0x0062), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, vl1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.v42 r11, defpackage.b72 r12, defpackage.jh1 r13, int r14, defpackage.eh r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq1.c(v42, b72, jh1, int, eh):java.lang.Object");
    }

    public static final void d(ov1 ov1Var, qh1 qh1Var, long j) {
        jz jzVar = (jz) ov1Var.f;
        jzVar.getClass();
        af2 af2Var = jzVar.b;
        af2 af2Var2 = jzVar.a;
        boolean o = qo.o(qh1Var);
        long j2 = qh1Var.b;
        if (o) {
            bf.P(af2Var2.d);
            af2Var2.e = 0;
            bf.P(af2Var.d);
            af2Var.e = 0;
            jzVar.c = 0L;
        }
        if (!qo.q(qh1Var)) {
            List list = qh1Var.k;
            if (list == null) {
                list = l60.e;
            }
            int i = 0;
            for (int size = list.size(); i < size; size = size) {
                yg0 yg0Var = (yg0) list.get(i);
                jzVar.a(yg0Var.a, z81.e(yg0Var.c, j));
                i++;
            }
            jzVar.a(j2, z81.e(qh1Var.l, j));
        }
        if (qo.q(qh1Var) && j2 - jzVar.c > 40) {
            bf.P(af2Var2.d);
            af2Var2.e = 0;
            bf.P(af2Var.d);
            af2Var.e = 0;
            jzVar.c = 0L;
        }
        jzVar.c = j2;
    }

    public static final Object e(float f2, float f3, float f4, gc gcVar, se0 se0Var, q42 q42Var) {
        ec2 ec2Var = f2.A;
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Float f7 = new Float(f4);
        oe0 oe0Var = ec2Var.a;
        mc mcVar = (mc) oe0Var.invoke(f7);
        if (mcVar == null) {
            mcVar = ((mc) oe0Var.invoke(f5)).c();
        }
        mc mcVar2 = mcVar;
        Object f8 = f(new hc(ec2Var, f5, mcVar2, 56), new x52(gcVar, ec2Var, f5, f6, mcVar2), Long.MIN_VALUE, new hh1(se0Var, 16), q42Var);
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        if (f8 != hvVar) {
            f8 = od2Var;
        }
        if (f8 == hvVar) {
            return f8;
        }
        return od2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0115 A[Catch: CancellationException -> 0x003c, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003c, blocks: (B:16:0x0037, B:18:0x0100, B:20:0x0115, B:25:0x0138, B:27:0x0148, B:29:0x0152, B:36:0x015f, B:37:0x0164, B:39:0x0165), top: B:15:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r0v11, types: [ja] */
    /* JADX WARN: Type inference failed for: r0v36, types: [ja] */
    /* JADX WARN: Type inference failed for: r1v10, types: [ja] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [wl1] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [wl1] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [wl1] */
    /* JADX WARN: Type inference failed for: r1v24, types: [wl1] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r5v11, types: [ja] */
    /* JADX WARN: Type inference failed for: r9v0, types: [vt, p42] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.hc r24, defpackage.bc r25, long r26, final defpackage.oe0 r28, defpackage.wt r29) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq1.f(hc, bc, long, oe0, wt):java.lang.Object");
    }

    public static /* synthetic */ Object g(float f2, float f3, gc gcVar, se0 se0Var, q42 q42Var, int i) {
        if ((i & 8) != 0) {
            gcVar = mp0.M(0.0f, 0.0f, null, 7);
        }
        return e(f2, f3, 0.0f, gcVar, se0Var, q42Var);
    }

    public static final Object h(hc hcVar, tx txVar, boolean z, oe0 oe0Var, wt wtVar) {
        long j;
        sx sxVar = new sx(txVar, hcVar.e, hcVar.f.getValue(), hcVar.g);
        if (z) {
            j = hcVar.h;
        } else {
            j = Long.MIN_VALUE;
        }
        Object f2 = f(hcVar, sxVar, j, oe0Var, wtVar);
        if (f2 == hv.e) {
            return f2;
        }
        return od2.a;
    }

    public static final Object i(hc hcVar, Float f2, gc gcVar, boolean z, oe0 oe0Var, wt wtVar) {
        long j;
        x52 x52Var = new x52(gcVar, hcVar.e, hcVar.f.getValue(), f2, hcVar.g);
        if (z) {
            j = hcVar.h;
        } else {
            j = Long.MIN_VALUE;
        }
        Object f3 = f(hcVar, x52Var, j, oe0Var, wtVar);
        if (f3 == hv.e) {
            return f3;
        }
        return od2.a;
    }

    public static /* synthetic */ Object j(hc hcVar, Float f2, f22 f22Var, boolean z, oe0 oe0Var, wt wtVar, int i) {
        int i2 = 7;
        if ((i & 2) != 0) {
            f22Var = mp0.M(0.0f, 0.0f, null, 7);
        }
        f22 f22Var2 = f22Var;
        if ((i & 8) != 0) {
            oe0Var = new nv1(i2);
        }
        return i(hcVar, f2, f22Var2, z, oe0Var, wtVar);
    }

    public static final int k(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else if (j < j2) {
                length = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static final void m(fc fcVar, long j, float f2, bc bcVar, hc hcVar, oe0 oe0Var) {
        long j2;
        if (f2 == 0.0f) {
            j2 = bcVar.b();
        } else {
            j2 = ((float) (j - fcVar.c)) / f2;
        }
        fcVar.g = j;
        fcVar.e.setValue(bcVar.f(j2));
        fcVar.f = bcVar.d(j2);
        if (bcVar.e(j2)) {
            fcVar.h = fcVar.g;
            fcVar.i.setValue(Boolean.FALSE);
        }
        C(fcVar, hcVar);
        oe0Var.invoke(fcVar);
    }

    public static final float n(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i = 0; i < length; i++) {
            f2 += fArr[i] * fArr2[i];
        }
        return f2;
    }

    public static final tg2 o(View view) {
        tg2 tg2Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            if (tag instanceof tg2) {
                tg2Var = (tg2) tag;
            } else {
                tg2Var = null;
            }
            if (tg2Var != null) {
                return tg2Var;
            }
            Object k = xp1.k(view);
            if (k instanceof View) {
                view = (View) k;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final long p(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final float q(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final float r(xu xuVar) {
        float f2;
        l21 l21Var = (l21) xuVar.H(g3.Q);
        if (l21Var != null) {
            f2 = l21Var.t();
        } else {
            f2 = 1.0f;
        }
        if (f2 >= 0.0f) {
            return f2;
        }
        gi1.b("negative scale factor");
        return f2;
    }

    public static final int s(u82 u82Var, Layout layout, qg qgVar, int i, RectF rectF, ot1 ot1Var, h8 h8Var, boolean z) {
        boolean z2;
        lq0[] lq0VarArr;
        ym0 ym0Var;
        float f2;
        float q;
        lq0[] lq0VarArr2;
        int i2;
        int l;
        float f3;
        float q2;
        int i3;
        int i4;
        int k;
        float f4;
        float q3;
        Bidi createLineBidi;
        boolean z3;
        boolean z4;
        float a2;
        float a3;
        float f5;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = u82Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int f6 = u82Var.f(i);
        if (i5 < (f6 - lineStart2) * 2) {
            ll0.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        fi0 fi0Var = new fi0(u82Var);
        boolean z5 = false;
        if (layout2.getParagraphDirection(i) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i6 = 0;
        while (lineStart2 < f6) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z2 && !isRtlCharAt) {
                a2 = fi0Var.a(lineStart2, z5, z5, true);
                f5 = fi0Var.a(lineStart2 + 1, true, true, true);
                z4 = z2;
            } else if (z2 && isRtlCharAt) {
                z4 = z2;
                f5 = fi0Var.a(lineStart2, false, false, false);
                a2 = fi0Var.a(lineStart2 + 1, true, true, false);
            } else {
                z4 = z2;
                if (isRtlCharAt) {
                    a3 = fi0Var.a(lineStart2, false, false, true);
                    a2 = fi0Var.a(lineStart2 + 1, true, true, true);
                } else {
                    a2 = fi0Var.a(lineStart2, false, false, false);
                    a3 = fi0Var.a(lineStart2 + 1, true, true, false);
                }
                f5 = a3;
            }
            fArr[i6] = a2;
            fArr[i6 + 1] = f5;
            i6 += 2;
            lineStart2++;
            z2 = z4;
            z5 = false;
        }
        Layout layout3 = (Layout) qgVar.a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int i7 = qgVar.i(lineStart3, false);
        int j = qgVar.j(i7);
        int i8 = lineStart3 - j;
        int i9 = lineEnd2 - j;
        Bidi e2 = qgVar.e(i7);
        if (e2 != null && (createLineBidi = e2.createLineBidi(i8, i9)) != null) {
            int runCount = createLineBidi.getRunCount();
            lq0VarArr = new lq0[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int runStart = createLineBidi.getRunStart(i10) + lineStart3;
                int runLimit = createLineBidi.getRunLimit(i10) + lineStart3;
                int i11 = runCount;
                if (createLineBidi.getRunLevel(i10) % 2 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                lq0VarArr[i10] = new lq0(runStart, runLimit, z3);
                i10++;
                runCount = i11;
            }
        } else {
            lq0VarArr = new lq0[]{new lq0(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        }
        if (z) {
            ym0Var = new ym0(0, lq0VarArr.length - 1, 1);
        } else {
            ym0Var = new ym0(lq0VarArr.length - 1, 0, -1);
        }
        int i12 = ym0Var.e;
        int i13 = ym0Var.f;
        int i14 = ym0Var.g;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            lq0 lq0Var = lq0VarArr[i12];
            boolean z6 = lq0Var.c;
            int i15 = lq0Var.a;
            int i16 = lq0Var.b;
            if (z6) {
                f2 = fArr[((i16 - 1) - lineStart) * 2];
            } else {
                f2 = fArr[(i15 - lineStart) * 2];
            }
            if (z6) {
                q = q(i15, lineStart, fArr);
            } else {
                q = q(i16 - 1, lineStart, fArr);
            }
            float f7 = rectF.left;
            int i17 = i14;
            if (z) {
                if (q >= f7) {
                    float f8 = rectF.right;
                    if (f2 <= f8) {
                        if ((!z6 && f7 <= f2) || (z6 && f8 >= q)) {
                            i4 = i15;
                        } else {
                            int i18 = i16;
                            int i19 = i15;
                            while (true) {
                                i3 = i18;
                                if (i18 - i19 <= 1) {
                                    break;
                                }
                                int i20 = (i3 + i19) / 2;
                                float f9 = fArr[(i20 - lineStart) * 2];
                                if ((!z6 && f9 > rectF.left) || (z6 && f9 < rectF.right)) {
                                    i18 = i20;
                                } else {
                                    i18 = i3;
                                    i19 = i20;
                                }
                            }
                            if (z6) {
                                i4 = i3;
                            } else {
                                i4 = i19;
                            }
                        }
                        int l2 = ot1Var.l(i4);
                        if (l2 != -1 && (k = ot1Var.k(l2)) < i16) {
                            if (k >= i15) {
                                i15 = k;
                            }
                            if (l2 > i16) {
                                l2 = i16;
                            }
                            lq0VarArr2 = lq0VarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i21 = l2;
                            while (true) {
                                if (z6) {
                                    f4 = fArr[((i21 - 1) - lineStart) * 2];
                                } else {
                                    f4 = fArr[(i15 - lineStart) * 2];
                                }
                                rectF2.left = f4;
                                if (z6) {
                                    q3 = q(i15, lineStart, fArr);
                                } else {
                                    q3 = q(i21 - 1, lineStart, fArr);
                                }
                                rectF2.right = q3;
                                if (!((Boolean) h8Var.invoke(rectF2, rectF)).booleanValue()) {
                                    i15 = ot1Var.f(i15);
                                    if (i15 == -1 || i15 >= i16) {
                                        break;
                                    }
                                    i21 = ot1Var.l(i15);
                                    if (i21 > i16) {
                                        i21 = i16;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i15 = -1;
                        }
                    }
                }
                lq0VarArr2 = lq0VarArr;
                i15 = -1;
            } else {
                lq0VarArr2 = lq0VarArr;
                if (q >= f7) {
                    float f10 = rectF.right;
                    if (f2 <= f10) {
                        if ((!z6 && f10 >= q) || (z6 && f7 <= f2)) {
                            i2 = i16 - 1;
                        } else {
                            int i22 = i16;
                            int i23 = i15;
                            while (i22 - i23 > 1) {
                                int i24 = (i22 + i23) / 2;
                                float f11 = fArr[(i24 - lineStart) * 2];
                                int i25 = i22;
                                if ((!z6 && f11 > rectF.right) || (z6 && f11 < rectF.left)) {
                                    i22 = i24;
                                } else {
                                    i22 = i25;
                                    i23 = i24;
                                }
                            }
                            int i26 = i22;
                            if (z6) {
                                i2 = i26;
                            } else {
                                i2 = i23;
                            }
                        }
                        int k2 = ot1Var.k(i2 + 1);
                        if (k2 != -1 && (l = ot1Var.l(k2)) > i15) {
                            if (k2 < i15) {
                                k2 = i15;
                            }
                            if (l <= i16) {
                                i16 = l;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i27 = k2;
                            while (true) {
                                if (z6) {
                                    f3 = fArr[((i16 - 1) - lineStart) * 2];
                                } else {
                                    f3 = fArr[(i27 - lineStart) * 2];
                                }
                                rectF3.left = f3;
                                if (z6) {
                                    q2 = q(i27, lineStart, fArr);
                                } else {
                                    q2 = q(i16 - 1, lineStart, fArr);
                                }
                                rectF3.right = q2;
                                if (!((Boolean) h8Var.invoke(rectF3, rectF)).booleanValue()) {
                                    i16 = ot1Var.g(i16);
                                    if (i16 == -1 || i16 <= i15) {
                                        break;
                                    }
                                    i27 = ot1Var.k(i16);
                                    if (i27 < i15) {
                                        i27 = i15;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i16 = -1;
                i15 = i16;
            }
            if (i15 >= 0) {
                return i15;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i17;
            i14 = i17;
            lq0VarArr = lq0VarArr2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [lv1, java.lang.Object, vt] */
    public static lv1 t(se0 se0Var) {
        ?? obj = new Object();
        obj.g = go.w(obj, obj, se0Var);
        return obj;
    }

    public static final void u(String str) {
        throw new IllegalArgumentException(l90.m("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final long v(long j, float f2) {
        if (!Float.isNaN(f2) && f2 < 1.0f) {
            return co.b(j, co.d(j) * f2);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0166, code lost:
    
        if (r3 == r13) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:36:0x004f, B:37:0x00b5, B:39:0x00bd, B:41:0x00c9, B:43:0x00d5, B:63:0x009b), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0056  */
    /* JADX WARN: Type inference failed for: r2v8, types: [sl1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.v42 r17, defpackage.cy1 r18, defpackage.u7 r19, defpackage.jh1 r20, defpackage.eh r21) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq1.w(v42, cy1, u7, jh1, eh):java.lang.Object");
    }

    public static final void x(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        float n;
        if (i == 0) {
            kl0.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        for (int i9 = 0; i9 < i3; i9++) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float n2 = n(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * n2);
                }
            }
            float sqrt = (float) Math.sqrt(n(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f2 = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f2;
            }
            float[] fArr10 = fArr6[i9];
            for (int i13 = 0; i13 < i3; i13++) {
                if (i13 < i9) {
                    n = 0.0f;
                } else {
                    n = n(fArr7, fArr4[i13]);
                }
                fArr10[i13] = n;
            }
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float n3 = n(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    n3 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = n3 / fArr11[i14];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:12:0x002c, B:13:0x00a1, B:15:0x00a9, B:17:0x00b5, B:19:0x00c1, B:21:0x00c4, B:24:0x00c7, B:28:0x00cb, B:32:0x0040, B:34:0x0063, B:36:0x0067, B:40:0x0086, B:45:0x004a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(defpackage.v42 r12, defpackage.b72 r13, defpackage.jh1 r14, defpackage.eh r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yq1.z(v42, b72, jh1, eh):java.lang.Object");
    }

    public abstract Object l();

    public abstract yq1 y(String str, oe0 oe0Var);
}
