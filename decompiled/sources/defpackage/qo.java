package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class qo {
    public static ij0 a;
    public static ij0 b;

    public static void A(c40 c40Var, lo loVar, long j) {
        if (loVar instanceof vb1) {
            pl1 pl1Var = ((vb1) loVar).e;
            float f = pl1Var.a;
            float f2 = pl1Var.b;
            c40Var.v0(j, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), b0(pl1Var), 1.0f, 3);
            return;
        }
        boolean z = loVar instanceof wb1;
        o90 o90Var = o90.a;
        if (z) {
            wb1 wb1Var = (wb1) loVar;
            n8 n8Var = wb1Var.f;
            if (n8Var != null) {
                c40Var.g(n8Var, j, 1.0f, o90Var);
                return;
            }
            ip1 ip1Var = wb1Var.e;
            float f3 = ip1Var.b;
            float f4 = ip1Var.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (ip1Var.h >> 32));
            float f5 = ip1Var.c - f4;
            float f6 = ip1Var.d - f3;
            c40Var.V(j, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)));
            return;
        }
        if (loVar instanceof ub1) {
            c40Var.g(((ub1) loVar).e, j, 1.0f, o90Var);
        } else {
            se.m();
        }
    }

    public static int B(HandwritingGesture handwritingGesture, hh1 hh1Var) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        hh1Var.invoke(new dp(fallbackText, 1));
        return 5;
    }

    public static final ArrayList C(hr hrVar) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = hrVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            jr jrVar = (jr) list.get(i);
            if (!bf.y(iArr, jrVar.a)) {
                if (jrVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((jr) list.get(i3)).a == 1000) {
                        break;
                    }
                    wn.v0(arrayList);
                } else {
                    arrayList.add(jrVar);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static final iq0 D(iq0 iq0Var) {
        iq0 iq0Var2;
        e81 e81Var;
        iq0 D = iq0Var.D();
        while (true) {
            iq0 iq0Var3 = D;
            iq0Var2 = iq0Var;
            iq0Var = iq0Var3;
            if (iq0Var == null) {
                break;
            }
            D = iq0Var.D();
        }
        if (iq0Var2 instanceof e81) {
            e81Var = (e81) iq0Var2;
        } else {
            e81Var = null;
        }
        if (e81Var == null) {
            return iq0Var2;
        }
        e81 e81Var2 = e81Var.u;
        while (true) {
            e81 e81Var3 = e81Var2;
            e81 e81Var4 = e81Var;
            e81Var = e81Var3;
            if (e81Var != null) {
                e81Var2 = e81Var.u;
            } else {
                return e81Var4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, wl1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(defpackage.va0 r5, defpackage.se0 r6, defpackage.wt r7) {
        /*
            ad0 r0 = defpackage.c01.p
            boolean r1 = r7 instanceof defpackage.pb0
            if (r1 == 0) goto L15
            r1 = r7
            pb0 r1 = (defpackage.pb0) r1
            int r2 = r1.i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.i = r2
            goto L1a
        L15:
            pb0 r1 = new pb0
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.h
            int r2 = r1.i
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            lb0 r5 = r1.g
            wl1 r6 = r1.f
            q42 r1 = r1.e
            se0 r1 = (defpackage.se0) r1
            defpackage.io.K(r7)     // Catch: defpackage.g -> L2f
            goto L67
        L2f:
            r7 = move-exception
            goto L63
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            r5 = 0
            return r5
        L38:
            defpackage.io.K(r7)
            wl1 r7 = new wl1
            r7.<init>()
            r7.e = r0
            lb0 r2 = new lb0
            r2.<init>(r3, r6, r7)
            r4 = r6
            q42 r4 = (defpackage.q42) r4     // Catch: defpackage.g -> L5e
            r1.e = r4     // Catch: defpackage.g -> L5e
            r1.f = r7     // Catch: defpackage.g -> L5e
            r1.g = r2     // Catch: defpackage.g -> L5e
            r1.i = r3     // Catch: defpackage.g -> L5e
            java.lang.Object r5 = r5.a(r2, r1)     // Catch: defpackage.g -> L5e
            hv r1 = defpackage.hv.e
            if (r5 != r1) goto L5b
            return r1
        L5b:
            r1 = r6
            r6 = r7
            goto L67
        L5e:
            r5 = move-exception
            r1 = r6
            r6 = r7
            r7 = r5
            r5 = r2
        L63:
            java.lang.Object r2 = r7.e
            if (r2 != r5) goto L80
        L67:
            java.lang.Object r5 = r6.e
            if (r5 == r0) goto L6c
            return r5
        L6c:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L80:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.E(va0, se0, wt):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, wl1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.eb0 r6, defpackage.wt r7) {
        /*
            ad0 r0 = defpackage.c01.p
            boolean r1 = r7 instanceof defpackage.ob0
            if (r1 == 0) goto L15
            r1 = r7
            ob0 r1 = (defpackage.ob0) r1
            int r2 = r1.h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.h = r2
            goto L1a
        L15:
            ob0 r1 = new ob0
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.g
            int r2 = r1.h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            x7 r6 = r1.f
            wl1 r1 = r1.e
            defpackage.io.K(r7)     // Catch: defpackage.g -> L2c
            goto L5d
        L2c:
            r7 = move-exception
            goto L59
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            return r3
        L34:
            defpackage.io.K(r7)
            wl1 r7 = new wl1
            r7.<init>()
            r7.e = r0
            x7 r2 = new x7
            r5 = 2
            r2.<init>(r7, r5)
            r1.e = r7     // Catch: defpackage.g -> L55
            r1.f = r2     // Catch: defpackage.g -> L55
            r1.h = r4     // Catch: defpackage.g -> L55
            java.lang.Object r6 = r6.a(r2, r1)     // Catch: defpackage.g -> L55
            hv r1 = defpackage.hv.e
            if (r6 != r1) goto L53
            return r1
        L53:
            r1 = r7
            goto L5d
        L55:
            r6 = move-exception
            r1 = r7
            r7 = r6
            r6 = r2
        L59:
            java.lang.Object r2 = r7.e
            if (r2 != r6) goto L68
        L5d:
            java.lang.Object r6 = r1.e
            if (r6 == r0) goto L62
            return r6
        L62:
            java.lang.String r6 = "Expected at least one element"
            defpackage.y61.j(r6)
            return r3
        L68:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.F(eb0, wt):java.lang.Object");
    }

    public static final va0 G(il ilVar, xu xuVar) {
        if (xuVar.H(g3.O) == null) {
            if (xuVar.equals(j60.e)) {
                return ilVar;
            }
            return xn.x(ilVar, xuVar, 0, null, 6);
        }
        y61.q(xuVar, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static final boolean H(tc0 tc0Var, cb cbVar) {
        int ordinal = tc0Var.Q0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (tc0Var.N0().a) {
                            return ((Boolean) cbVar.invoke(tc0Var)).booleanValue();
                        }
                        return W(tc0Var, cbVar);
                    }
                    se.m();
                    return false;
                }
            } else {
                tc0 z = lo.z(tc0Var);
                if (z != null) {
                    if (!H(z, cbVar) && !I(tc0Var, z, 1, cbVar)) {
                        return false;
                    }
                    return true;
                }
                se.p("ActiveParent must have a focusedChild");
                return false;
            }
        }
        return W(tc0Var, cbVar);
    }

    public static final boolean I(tc0 tc0Var, tc0 tc0Var2, int i, cb cbVar) {
        if (Y(tc0Var, tc0Var2, i, cbVar)) {
            return true;
        }
        Boolean bool = (Boolean) sn0.T(tc0Var, i, new fa1(((mc0) ((q5) hp.N(tc0Var)).getFocusOwner()).f(), tc0Var, tc0Var2, i, cbVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final Rect J(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    textPaint2.getTextBounds(charSequence, i, nextSpanTransition, rect2);
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        textPaint.getTextBounds(charSequence, i, i2, rect3);
        return rect3;
    }

    public static final String[] K(nt ntVar) {
        ntVar.getClass();
        return (String[]) ((r6) ntVar).b.toArray(new String[0]);
    }

    public static final ij0 L() {
        ij0 ij0Var = b;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.Image", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(21.0f, 19.0f);
        rg2Var.D(5.0f);
        rg2Var.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        rg2Var.n(5.0f);
        rg2Var.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        rg2Var.E(14.0f);
        rg2Var.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        rg2Var.o(14.0f);
        rg2Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        rg2Var.f();
        rg2Var.s(8.9f, 13.98f);
        rg2Var.r(2.1f, 2.53f);
        rg2Var.r(3.1f, -3.99f);
        rg2Var.i(0.2f, -0.26f, 0.6f, -0.26f, 0.8f, 0.01f);
        rg2Var.r(3.51f, 4.68f);
        rg2Var.i(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f);
        rg2Var.n(6.02f);
        rg2Var.i(-0.42f, 0.0f, -0.65f, -0.48f, -0.39f, -0.81f);
        rg2Var.q(8.12f, 14.0f);
        rg2Var.i(0.19f, -0.26f, 0.57f, -0.27f, 0.78f, -0.02f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b2 = hj0Var.b();
        b = b2;
        return b2;
    }

    public static k51 M(sg2 sg2Var) {
        gl0 gl0Var = l51.a;
        mv mvVar = mv.b;
        gl0Var.getClass();
        mvVar.getClass();
        q4 q4Var = new q4(sg2Var, gl0Var, mvVar);
        cn a2 = yl1.a(k51.class);
        String c = a2.c();
        if (c != null) {
            return (k51) q4Var.n(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(c));
        }
        se.h("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final ja N(xu xuVar) {
        ja jaVar = (ja) xuVar.H(g3.P);
        if (jaVar != null) {
            return jaVar;
        }
        se.p("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void O(xu xuVar, Throwable th) {
        try {
            av avVar = (av) xuVar.H(g3.z);
            if (avVar != null) {
                avVar.k(xuVar, th);
            } else {
                lo.I(xuVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                g(runtimeException, th);
                th = runtimeException;
            }
            lo.I(xuVar, th);
        }
    }

    public static final float[] P(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final boolean Q(float[] fArr) {
        if (fArr.length < 16 || fArr[0] != 1.0f || fArr[1] != 0.0f || fArr[2] != 0.0f || fArr[3] != 0.0f || fArr[4] != 0.0f || fArr[5] != 1.0f || fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 0.0f || fArr[9] != 0.0f || fArr[10] != 1.0f || fArr[11] != 0.0f || fArr[12] != 0.0f || fArr[13] != 0.0f || fArr[14] != 0.0f || fArr[15] != 1.0f) {
            return false;
        }
        return true;
    }

    public static final boolean R(qh1 qh1Var, long j, long j2) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (qh1Var.i == 1) {
            i = 1;
        } else {
            i = 0;
        }
        long j3 = qh1Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        float f3 = ((int) (j & 4294967295L)) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat > f2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 | z;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        if (intBitsToFloat2 > f3) {
            z4 = true;
        }
        return z6 | z4;
    }

    public static final float[] S(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final float[] T(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    public static void U(long j, rc rcVar, boolean z, hh1 hh1Var) {
        int i;
        if (z) {
            int i2 = d92.c;
            int i3 = (int) (j >> 32);
            int i4 = (int) (j & 4294967295L);
            int i5 = 10;
            if (i3 > 0) {
                i = Character.codePointBefore(rcVar, i3);
            } else {
                i = 10;
            }
            if (i4 < rcVar.f.length()) {
                i5 = Character.codePointAt(rcVar, i4);
            }
            if (fp.N(i) && (fp.M(i5) || fp.L(i5))) {
                do {
                    i3 -= Character.charCount(i);
                    if (i3 == 0) {
                        break;
                    } else {
                        i = Character.codePointBefore(rcVar, i3);
                    }
                } while (fp.N(i));
                j = fr1.a(i3, i4);
            } else if (fp.N(i5) && (fp.M(i) || fp.L(i))) {
                do {
                    i4 += Character.charCount(i5);
                    if (i4 == rcVar.f.length()) {
                        break;
                    } else {
                        i5 = Character.codePointAt(rcVar, i4);
                    }
                } while (fp.N(i5));
                j = fr1.a(i3, i4);
            }
        }
        int i6 = (int) (4294967295L & j);
        hh1Var.invoke(new qg0(new h50[]{new sv1(i6, i6), new xz(d92.d(j), 0)}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean V(tc0 tc0Var, cb cbVar) {
        tc0[] tc0VarArr = new tc0[16];
        if (!tc0Var.e.r) {
            kl0.b("visitChildren called on an unattached node");
        }
        q41 q41Var = new q41(new d21[16]);
        d21 d21Var = tc0Var.e;
        d21 d21Var2 = d21Var.j;
        if (d21Var2 == null) {
            hp.i(q41Var, d21Var);
        } else {
            q41Var.b(d21Var2);
        }
        int i = 0;
        while (true) {
            int i2 = q41Var.g;
            if (i2 == 0) {
                break;
            }
            d21 d21Var3 = (d21) q41Var.k(i2 - 1);
            if ((d21Var3.h & 1024) == 0) {
                hp.i(q41Var, d21Var3);
            } else {
                while (true) {
                    if (d21Var3 == null) {
                        break;
                    }
                    if ((d21Var3.g & 1024) != 0) {
                        q41 q41Var2 = null;
                        while (d21Var3 != null) {
                            if (d21Var3 instanceof tc0) {
                                tc0 tc0Var2 = (tc0) d21Var3;
                                int i3 = i + 1;
                                if (tc0VarArr.length < i3) {
                                    int length = tc0VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(tc0VarArr, 0, r10, 0, length);
                                    tc0VarArr = r10;
                                }
                                tc0VarArr[i] = tc0Var2;
                                i = i3;
                            } else if ((d21Var3.g & 1024) != 0 && (d21Var3 instanceof rz)) {
                                int i4 = 0;
                                for (d21 d21Var4 = ((rz) d21Var3).t; d21Var4 != null; d21Var4 = d21Var4.j) {
                                    if ((d21Var4.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            d21Var3 = d21Var4;
                                        } else {
                                            if (q41Var2 == null) {
                                                q41Var2 = new q41(new d21[16]);
                                            }
                                            if (d21Var3 != null) {
                                                q41Var2.b(d21Var3);
                                                d21Var3 = null;
                                            }
                                            q41Var2.b(d21Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            d21Var3 = hp.l(q41Var2);
                        }
                    } else {
                        d21Var3 = d21Var3.j;
                    }
                }
            }
        }
        Arrays.sort(tc0VarArr, 0, i, uc0.b);
        int i5 = i - 1;
        if (i5 < tc0VarArr.length) {
            while (i5 >= 0) {
                tc0 tc0Var3 = tc0VarArr[i5];
                if (lo.L(tc0Var3) && h(tc0Var3, cbVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean W(tc0 tc0Var, cb cbVar) {
        tc0[] tc0VarArr = new tc0[16];
        if (!tc0Var.e.r) {
            kl0.b("visitChildren called on an unattached node");
        }
        q41 q41Var = new q41(new d21[16]);
        d21 d21Var = tc0Var.e;
        d21 d21Var2 = d21Var.j;
        if (d21Var2 == null) {
            hp.i(q41Var, d21Var);
        } else {
            q41Var.b(d21Var2);
        }
        int i = 0;
        while (true) {
            int i2 = q41Var.g;
            if (i2 == 0) {
                break;
            }
            d21 d21Var3 = (d21) q41Var.k(i2 - 1);
            if ((d21Var3.h & 1024) == 0) {
                hp.i(q41Var, d21Var3);
            } else {
                while (true) {
                    if (d21Var3 == null) {
                        break;
                    }
                    if ((d21Var3.g & 1024) != 0) {
                        q41 q41Var2 = null;
                        while (d21Var3 != null) {
                            if (d21Var3 instanceof tc0) {
                                tc0 tc0Var2 = (tc0) d21Var3;
                                int i3 = i + 1;
                                if (tc0VarArr.length < i3) {
                                    int length = tc0VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(tc0VarArr, 0, r10, 0, length);
                                    tc0VarArr = r10;
                                }
                                tc0VarArr[i] = tc0Var2;
                                i = i3;
                            } else if ((d21Var3.g & 1024) != 0 && (d21Var3 instanceof rz)) {
                                int i4 = 0;
                                for (d21 d21Var4 = ((rz) d21Var3).t; d21Var4 != null; d21Var4 = d21Var4.j) {
                                    if ((d21Var4.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            d21Var3 = d21Var4;
                                        } else {
                                            if (q41Var2 == null) {
                                                q41Var2 = new q41(new d21[16]);
                                            }
                                            if (d21Var3 != null) {
                                                q41Var2.b(d21Var3);
                                                d21Var3 = null;
                                            }
                                            q41Var2.b(d21Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            d21Var3 = hp.l(q41Var2);
                        }
                    } else {
                        d21Var3 = d21Var3.j;
                    }
                }
            }
        }
        Arrays.sort(tc0VarArr, 0, i, uc0.b);
        for (int i5 = 0; i5 < i; i5++) {
            tc0 tc0Var3 = tc0VarArr[i5];
            if (lo.L(tc0Var3) && H(tc0Var3, cbVar)) {
                return true;
            }
        }
        return false;
    }

    public static final long X(qh1 qh1Var, boolean z) {
        long d = z81.d(qh1Var.c, qh1Var.g);
        if (!z && qh1Var.b()) {
            return 0L;
        }
        return d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197 A[EDGE_INSN: B:151:0x0197->B:132:0x0197 BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean Y(defpackage.tc0 r12, defpackage.tc0 r13, int r14, defpackage.cb r15) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.Y(tc0, tc0, int, cb):boolean");
    }

    public static void Z(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            j50.a(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static final r6 a(String str) {
        Set singleton = Collections.singleton(str);
        singleton.getClass();
        return new r6(singleton);
    }

    public static final String a0(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return simpleName + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x028a, code lost:
    
        if (r43.g(true) != false) goto L171;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0375  */
    /* JADX WARN: Type inference failed for: r0v19, types: [tr0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r38, int r39, defpackage.h3 r40, defpackage.j7 r41, defpackage.qe r42, defpackage.ur r43, defpackage.z90 r44, defpackage.oe0 r45, defpackage.st0 r46, defpackage.e21 r47, defpackage.pc1 r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.b(int, int, h3, j7, qe, ur, z90, oe0, st0, e21, pc1, boolean):void");
    }

    public static final long b0(pl1 pl1Var) {
        float f = pl1Var.c - pl1Var.a;
        float f2 = pl1Var.d - pl1Var.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.v42 r6, defpackage.eh r7) {
        /*
            boolean r0 = r7 instanceof defpackage.qo1
            if (r0 == 0) goto L13
            r0 = r7
            qo1 r0 = (defpackage.qo1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            qo1 r0 = new qo1
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
            int r1 = r7.d
            java.util.List r7 = r7.a
            r1 = r1 & 66
            if (r1 == 0) goto L31
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L50:
            if (r4 >= r1) goto L62
            java.lang.Object r5 = r7.get(r4)
            qh1 r5 = (defpackage.qh1) r5
            boolean r5 = n(r5)
            if (r5 != 0) goto L5f
            goto L31
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.c(v42, eh):java.lang.Object");
    }

    public static final yk1 c0(va0 va0Var, gv gvVar, m22 m22Var, Object obj) {
        sl0 sl0Var;
        jv jvVar;
        v vVar;
        fm fmVar;
        va0 f;
        dm.a.getClass();
        cm cmVar = cm.a;
        if ((va0Var instanceof fm) && (f = (fmVar = (fm) va0Var).f()) != null) {
            if (fmVar.f != -3) {
            }
            sl0Var = new sl0(f, fmVar.e);
        } else {
            sl0Var = new sl0(va0Var, j60.e);
        }
        r22 j = d6.j(obj);
        xu xuVar = (xu) sl0Var.f;
        va0 va0Var2 = (va0) sl0Var.e;
        if (m22Var.equals(vw1.a)) {
            jvVar = jv.e;
        } else {
            jvVar = jv.h;
        }
        a8 a8Var = new a8(m22Var, va0Var2, j, obj, (vt) null);
        xu E = io.E(gvVar, xuVar);
        if (jvVar == jv.f) {
            vVar = new wt0(E, a8Var);
        } else {
            vVar = new v(E, true);
        }
        vVar.g0(jvVar, vVar, a8Var);
        return new yk1(j);
    }

    public static final ExtractedText d(i82 i82Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = i82Var.a.f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = i82Var.b;
        extractedText.selectionStart = d92.f(j);
        extractedText.selectionEnd = d92.e(j);
        extractedText.flags = !i32.H(i82Var.a.f, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final ExtractedText d0(i82 i82Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = i82Var.a.f;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = i82Var.b;
        extractedText.selectionStart = d92.f(j);
        extractedText.selectionEnd = d92.e(j);
        extractedText.flags = !i32.H(i82Var.a.f, '\n') ? 1 : 0;
        return extractedText;
    }

    public static po e(po poVar) {
        jh2 jh2Var = mp0.z;
        if (io.u(poVar.b, 12884901888L)) {
            po1 po1Var = (po1) poVar;
            jh2 jh2Var2 = po1Var.d;
            if (!w(jh2Var2, jh2Var)) {
                return new po1(po1Var.a, po1Var.h, jh2Var, S(u(p2.c.b, jh2Var2.a(), jh2Var.a()), po1Var.i), po1Var.k, po1Var.n, po1Var.e, po1Var.f, po1Var.g, -1);
            }
        }
        return poVar;
    }

    public static final boolean e0(Throwable th, de0 de0Var) {
        List asList;
        Object invoke;
        th.getClass();
        Integer num = eo0.a;
        p00 p00Var = null;
        if (num != null && num.intValue() < 19) {
            Method method = og1.b;
            if (method != null && (invoke = method.invoke(th, null)) != null) {
                asList = Arrays.asList((Throwable[]) invoke);
                asList.getClass();
            } else {
                asList = l60.e;
            }
        } else {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = Arrays.asList(suppressed);
            asList.getClass();
        }
        int size = asList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) asList.get(i)) instanceof p00) {
                return false;
            }
        }
        try {
            hr hrVar = (hr) de0Var.invoke();
            if (hrVar != null && !hrVar.a.isEmpty()) {
                z = true;
            }
            if (z) {
                hrVar.getClass();
                p00Var = new p00(hrVar);
            }
        } catch (Throwable th2) {
            p00Var = th2;
        }
        if (p00Var != null) {
            g(th, p00Var);
        }
        return z;
    }

    public static final void f(f62 f62Var, Context context, final boolean z, final String str, final long j) {
        if (!d92.c(j) && str.length() != 0) {
            PackageManager packageManager = context.getPackageManager();
            final Context context2 = context;
            List list = (List) sn0.I.invoke(context2);
            if (!list.isEmpty()) {
                b41 b41Var = f62Var.a;
                b41 b41Var2 = f62Var.a;
                s62 s62Var = s62.b;
                b41Var.a(s62Var);
                int size = list.size();
                int i = 0;
                while (i < size) {
                    final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
                    b41Var2.a(new o62(new zi1(i), resolveInfo.loadLabel(packageManager).toString(), 0, new oe0() { // from class: aj1
                        @Override // defpackage.oe0
                        public final Object invoke(Object obj) {
                            sn0.J.f(context2, resolveInfo, Boolean.valueOf(z), str, new d92(j));
                            ((t62) obj).close();
                            return od2.a;
                        }
                    }));
                    i++;
                    context2 = context;
                }
                b41Var2.a(s62Var);
            }
        }
    }

    public static final Exception f0(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean z = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                Process.myUserHandle().writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                i = obtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            Object invoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            invoke.getClass();
            z = ((String) invoke).equals("true");
        } catch (Throwable th) {
            g(fileNotFoundException, th);
        }
        if (z) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new c10(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static void g(Throwable th, Throwable th2) {
        boolean z;
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = eo0.a;
            if (num != null && num.intValue() < 19) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                th.addSuppressed(th2);
                return;
            }
            Method method = og1.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean h(defpackage.tc0 r7, defpackage.cb r8) {
        /*
            sc0 r0 = r7.Q0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L81
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L35
            if (r0 == r3) goto L81
            if (r0 != r1) goto L31
            boolean r0 = V(r7, r8)
            if (r0 != 0) goto L77
            nc0 r0 = r7.N0()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L76
            goto L77
        L31:
            defpackage.se.m()
            return r2
        L35:
            tc0 r0 = defpackage.lo.z(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L7d
            sc0 r6 = r0.Q0()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L78
            if (r6 == r4) goto L55
            if (r6 == r3) goto L78
            if (r6 == r1) goto L51
            defpackage.se.m()
            return r2
        L51:
            defpackage.se.p(r5)
            return r2
        L55:
            boolean r1 = h(r0, r8)
            if (r1 != 0) goto L77
            boolean r7 = I(r7, r0, r3, r8)
            if (r7 != 0) goto L77
            nc0 r7 = r0.N0()
            boolean r7 = r7.a
            if (r7 == 0) goto L76
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            goto L77
        L76:
            return r2
        L77:
            return r4
        L78:
            boolean r7 = I(r7, r0, r3, r8)
            return r7
        L7d:
            defpackage.se.p(r5)
            return r2
        L81:
            boolean r7 = V(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.h(tc0, cb):boolean");
    }

    public static final pl1 i(iq0 iq0Var) {
        iq0 D = iq0Var.D();
        if (D != null) {
            return D.O(iq0Var, true);
        }
        return new pl1(0.0f, 0.0f, (int) (iq0Var.m() >> 32), (int) (iq0Var.m() & 4294967295L));
    }

    public static final pl1 j(iq0 iq0Var, boolean z) {
        iq0 D = D(iq0Var);
        float m = (int) (D.m() >> 32);
        float m2 = (int) (D.m() & 4294967295L);
        pl1 O = D.O(iq0Var, z);
        float f = O.a;
        float f2 = 0.0f;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > m) {
                f = m;
            }
        }
        float f3 = O.b;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > m2) {
                f3 = m2;
            }
        }
        float f4 = O.c;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 <= m) {
                m = f4;
            }
            f4 = m;
        }
        float f5 = O.d;
        if (z) {
            if (f5 >= 0.0f) {
                f2 = f5;
            }
            if (f2 <= m2) {
                m2 = f2;
            }
            f5 = m2;
        }
        if (f == f4 || f3 == f5) {
            return pl1.e;
        }
        long e = D.e((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long e2 = D.e((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long e3 = D.e((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        long e4 = D.e((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (e >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (e4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (e3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (e & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (e2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (e4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (e3 & 4294967295L));
        return new pl1(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static va0 k(va0 va0Var, int i) {
        jk jkVar;
        j60 j60Var = null;
        if (i < 0 && i != -2 && i != -1) {
            se.e(l90.g(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        jk jkVar2 = jk.e;
        if (i == -1) {
            i = 0;
            jkVar = jk.f;
        } else {
            jkVar = jkVar2;
        }
        if (va0Var instanceof ff0) {
            return xn.x((ff0) va0Var, null, i, jkVar, 1);
        }
        if ((2 & 2) != 0) {
            j60Var = j60.e;
        }
        if ((2 & 4) != 0) {
            i = -3;
        }
        if ((2 & 8) == 0) {
            jkVar2 = jkVar;
        }
        return new gm(va0Var, j60Var, i, jkVar2);
    }

    public static final List l(is0 is0Var, ss0 ss0Var, nj njVar) {
        boolean z;
        ym0 ym0Var;
        q41 q41Var = njVar.a;
        if (q41Var.g != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ss0Var.e.isEmpty()) {
            return l60.e;
        }
        ArrayList arrayList = new ArrayList();
        if (njVar.a.g != 0) {
            int i = q41Var.g;
            if (i != 0) {
                Object[] objArr = q41Var.e;
                int i2 = ((ur0) objArr[0]).a;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = ((ur0) objArr[i3]).a;
                    if (i4 < i2) {
                        i2 = i4;
                    }
                }
                if (i2 < 0) {
                    nl0.a("negative minIndex");
                }
                int i5 = q41Var.g;
                if (i5 != 0) {
                    Object[] objArr2 = q41Var.e;
                    int i6 = ((ur0) objArr2[0]).b;
                    for (int i7 = 0; i7 < i5; i7++) {
                        int i8 = ((ur0) objArr2[i7]).b;
                        if (i8 > i6) {
                            i6 = i8;
                        }
                    }
                    ym0Var = new ym0(i2, Math.min(i6, is0Var.a() - 1), 1);
                } else {
                    y61.j("MutableVector is empty.");
                    return null;
                }
            } else {
                y61.j("MutableVector is empty.");
                return null;
            }
        } else {
            ym0Var = an0.h;
        }
        int size = ss0Var.e.size();
        for (int i9 = 0; i9 < size; i9++) {
            qs0 qs0Var = (qs0) ss0Var.get(i9);
            int w = vn.w(qs0Var.c, is0Var, qs0Var.a);
            int i10 = ym0Var.e;
            if ((w > ym0Var.f || i10 > w) && w >= 0 && w < is0Var.a()) {
                arrayList.add(Integer.valueOf(w));
            }
        }
        int i11 = ym0Var.e;
        int i12 = ym0Var.f;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, wl1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m(defpackage.va0 r4, defpackage.wa0 r5, defpackage.wt r6) {
        /*
            boolean r0 = r6 instanceof defpackage.gb0
            if (r0 == 0) goto L13
            r0 = r6
            gb0 r0 = (defpackage.gb0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            gb0 r0 = new gb0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f
            int r1 = r0.g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            wl1 r4 = r0.e
            defpackage.io.K(r6)     // Catch: java.lang.Throwable -> L28
            goto L4a
        L28:
            r5 = move-exception
            goto L4d
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            return r2
        L30:
            defpackage.io.K(r6)
            wl1 r6 = new wl1
            r6.<init>()
            v10 r1 = new v10     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4b
            r0.e = r6     // Catch: java.lang.Throwable -> L4b
            r0.g = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r4.a(r1, r0)     // Catch: java.lang.Throwable -> L4b
            hv r5 = defpackage.hv.e
            if (r4 != r5) goto L4a
            return r5
        L4a:
            return r2
        L4b:
            r5 = move-exception
            r4 = r6
        L4d:
            java.lang.Object r4 = r4.e
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L59
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7b
        L59:
            xu r6 = r0.getContext()
            g3 r0 = defpackage.g3.O
            vu r6 = r6.H(r0)
            go0 r6 = (defpackage.go0) r6
            if (r6 == 0) goto L7c
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L6e
            goto L7c
        L6e:
            java.util.concurrent.CancellationException r6 = r6.o()
            if (r6 == 0) goto L7c
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7b
            goto L7c
        L7b:
            throw r5
        L7c:
            if (r4 != 0) goto L7f
            return r5
        L7f:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L87
            g(r4, r5)
            throw r4
        L87:
            g(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.m(va0, wa0, wt):java.io.Serializable");
    }

    public static final boolean n(qh1 qh1Var) {
        if (!qh1Var.b() && !qh1Var.h && qh1Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean o(qh1 qh1Var) {
        if (!qh1Var.h && qh1Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean p(qh1 qh1Var) {
        if (!qh1Var.b() && qh1Var.h && !qh1Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean q(qh1 qh1Var) {
        if (qh1Var.h && !qh1Var.d) {
            return true;
        }
        return false;
    }

    public static final void r(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
    }

    public static final void s(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
    }

    public static final void t(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            se.h(l90.j("fromIndex: ", i, " > toIndex: ", i2));
            return;
        }
        y61.k("fromIndex: ", i, i2, i3, ", toIndex: ");
    }

    public static final float[] u(float[] fArr, float[] fArr2, float[] fArr3) {
        T(fArr, fArr2);
        T(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] P = P(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return S(P, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final Object v(va0 va0Var, se0 se0Var, q42 q42Var) {
        int i = mb0.a;
        Object a2 = k(new lm(new d4(se0Var, null), va0Var, j60.e, -2, jk.e), 0).a(m81.e, q42Var);
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        if (a2 != hvVar) {
            a2 = od2Var;
        }
        if (a2 == hvVar) {
            return a2;
        }
        return od2Var;
    }

    public static final boolean w(jh2 jh2Var, jh2 jh2Var2) {
        if (jh2Var == jh2Var2) {
            return true;
        }
        if (Math.abs(jh2Var.a - jh2Var2.a) < 0.001f && Math.abs(jh2Var.b - jh2Var2.b) < 0.001f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.md0 x(android.content.Context r12) {
        /*
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            defpackage.go.m(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L19
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L19
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L19
            goto L36
        L35:
            r3 = r4
        L36:
            if (r3 != 0) goto L3a
        L38:
            r5 = r4
            goto L6f
        L3a:
            java.lang.String r6 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r7 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r3 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
        L4c:
            if (r2 >= r3) goto L5a
            r5 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            byte[] r5 = r5.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1.add(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r2 = r2 + 1
            goto L4c
        L5a:
            java.util.List r9 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            kd0 r5 = new kd0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r8 = "emojicompat-emoji-font"
            r10 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            goto L6f
        L68:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L38
        L6f:
            if (r5 != 0) goto L72
            goto L7c
        L72:
            md0 r4 = new md0
            ld0 r0 = new ld0
            r0.<init>(r12, r5)
            r4.<init>(r0)
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.x(android.content.Context):md0");
    }

    public static final rs y(po poVar, po poVar2) {
        if (poVar == poVar2) {
            return new rs(poVar, poVar, 1);
        }
        if (io.u(poVar.b, 12884901888L) && io.u(poVar2.b, 12884901888L)) {
            return new qs((po1) poVar, (po1) poVar2);
        }
        return new rs(poVar, poVar2, 0);
    }

    public static final va0 z(va0 va0Var) {
        if (va0Var instanceof p22) {
            return va0Var;
        }
        if (va0Var instanceof w10) {
            return va0Var;
        }
        return new w10(va0Var);
    }
}
