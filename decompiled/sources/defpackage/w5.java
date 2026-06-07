package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.elixir.loader.R;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w5 extends v0 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final o31 S;
    public final af A;
    public final lk B;
    public boolean C;
    public s5 D;
    public p31 E;
    public final q31 F;
    public final n31 G;
    public final n31 H;
    public final String I;
    public final String J;
    public final ld K;
    public final p31 L;
    public su1 M;
    public boolean N;
    public final n31 O;
    public final r5 P;
    public final ArrayList Q;
    public final v5 R;
    public final q5 h;
    public int i = Integer.MIN_VALUE;
    public final v5 j = new v5(this, 0);
    public final AccessibilityManager k;
    public long l;
    public List m;
    public final Handler n;
    public final sl0 o;
    public int p;
    public int q;
    public h1 r;
    public h1 s;
    public boolean t;
    public final p31 u;
    public final p31 v;
    public final o12 w;
    public final o12 x;
    public int y;
    public Integer z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        o31 o31Var = um0.a;
        o31 o31Var2 = new o31(32);
        int i = o31Var2.b;
        if (i >= 0) {
            int i2 = i + 32;
            o31Var2.b(i2);
            int[] iArr2 = o31Var2.a;
            int i3 = o31Var2.b;
            if (i != i3) {
                bf.B(iArr2, iArr2, i2, i, i3);
            }
            bf.F(iArr, iArr2, i, 0, 12);
            o31Var2.b += 32;
            S = o31Var2;
            return;
        }
        se.u("");
    }

    public w5(q5 q5Var) {
        this.h = q5Var;
        Object systemService = q5Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.k = (AccessibilityManager) systemService;
        this.l = 100L;
        this.n = new Handler(Looper.getMainLooper());
        this.o = new sl0(this);
        this.p = Integer.MIN_VALUE;
        this.q = Integer.MIN_VALUE;
        this.u = new p31();
        this.v = new p31();
        this.w = new o12();
        this.x = new o12();
        this.y = -1;
        this.A = new af();
        this.B = sn0.c(1, 6, null);
        this.C = true;
        p31 p31Var = wm0.a;
        p31Var.getClass();
        this.E = p31Var;
        this.F = new q31();
        this.G = new n31();
        this.H = new n31();
        this.I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.J = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.K = new ld(16);
        this.L = new p31();
        this.M = new su1(q5Var.getSemanticsOwner().a(), p31Var);
        int i = rm0.a;
        this.O = new n31();
        q5Var.addOnAttachStateChangeListener(this);
        this.P = new r5(this, 0);
        this.Q = new ArrayList();
        this.R = new v5(this, 1);
    }

    public static Rect D(lo loVar, float f, float f2) {
        if (!(loVar instanceof vb1) && !(loVar instanceof wb1)) {
            return null;
        }
        pl1 A = loVar.A();
        return new Rect((int) (A.a + f), (int) (A.b + f2), (int) (A.c + f), (int) (A.d + f2));
    }

    public static float[] F(lo loVar) {
        if (loVar instanceof wb1) {
            ip1 ip1Var = ((wb1) loVar).e;
            long j = ip1Var.h;
            long j2 = ip1Var.g;
            long j3 = ip1Var.f;
            long j4 = ip1Var.e;
            return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
        }
        return null;
    }

    public static Region G(lo loVar, float f, float f2) {
        if (loVar instanceof ub1) {
            ub1 ub1Var = (ub1) loVar;
            pl1 h = ub1Var.A().h(f, f2);
            Region region = new Region(new Rect((int) (h.a + 0.0f), (int) (h.b + 0.0f), (int) (h.c + 0.0f), (int) (h.d + 0.0f)));
            Region region2 = new Region();
            n8 n8Var = ub1Var.e;
            if (n8Var instanceof n8) {
                Path path = n8Var.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            se.v("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String l(ru1 ru1Var) {
        rc rcVar;
        if (ru1Var != null) {
            mu1 mu1Var = ru1Var.d;
            i41 i41Var = mu1Var.e;
            zu1 zu1Var = vu1.a;
            if (i41Var.c(zu1Var)) {
                return iw0.a((List) mu1Var.c(zu1Var), ",", null, 62);
            }
            zu1 zu1Var2 = vu1.F;
            if (i41Var.c(zu1Var2)) {
                Object g = i41Var.g(zu1Var2);
                if (g == null) {
                    g = null;
                }
                rc rcVar2 = (rc) g;
                if (rcVar2 != null) {
                    return rcVar2.f;
                }
            } else {
                Object g2 = i41Var.g(vu1.B);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (rcVar = (rc) wn.h0(list)) != null) {
                    return rcVar.f;
                }
            }
        }
        return null;
    }

    public static final boolean p(xr1 xr1Var, float f) {
        de0 de0Var = xr1Var.a;
        if (f >= 0.0f || ((Number) de0Var.invoke()).floatValue() <= 0.0f) {
            if (f > 0.0f && ((Number) de0Var.invoke()).floatValue() < ((Number) xr1Var.b.invoke()).floatValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean q(xr1 xr1Var) {
        de0 de0Var = xr1Var.a;
        if (((Number) de0Var.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) de0Var.invoke()).floatValue();
        ((Number) xr1Var.b.invoke()).floatValue();
        return false;
    }

    public static final boolean r(xr1 xr1Var) {
        de0 de0Var = xr1Var.a;
        if (((Number) de0Var.invoke()).floatValue() < ((Number) xr1Var.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) de0Var.invoke()).floatValue();
        return false;
    }

    public static /* synthetic */ void w(w5 w5Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        w5Var.v(i, i2, num, null);
    }

    public final void A(ar0 ar0Var, q31 q31Var) {
        mu1 x;
        if (ar0Var.H() && !this.h.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(ar0Var)) {
            ar0 ar0Var2 = null;
            if (!ar0Var.J.d(8)) {
                ar0Var = ar0Var.v();
                while (true) {
                    if (ar0Var != null) {
                        if (ar0Var.J.d(8)) {
                            break;
                        } else {
                            ar0Var = ar0Var.v();
                        }
                    } else {
                        ar0Var = null;
                        break;
                    }
                }
            }
            if (ar0Var != null && (x = ar0Var.x()) != null) {
                if (!x.g) {
                    ar0 v = ar0Var.v();
                    while (true) {
                        if (v != null) {
                            mu1 x2 = v.x();
                            if (x2 != null && x2.g) {
                                ar0Var2 = v;
                                break;
                            }
                            v = v.v();
                        } else {
                            break;
                        }
                    }
                    if (ar0Var2 != null) {
                        ar0Var = ar0Var2;
                    }
                }
                int i = ar0Var.f;
                if (q31Var.a(i)) {
                    w(this, s(i), 2048, 1, 8);
                }
            }
        }
    }

    public final void B(ar0 ar0Var) {
        if (ar0Var.H() && !this.h.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(ar0Var)) {
            int i = ar0Var.f;
            xr1 xr1Var = (xr1) this.u.b(i);
            xr1 xr1Var2 = (xr1) this.v.b(i);
            if (xr1Var == null && xr1Var2 == null) {
                return;
            }
            AccessibilityEvent g = g(i, 4096);
            if (xr1Var != null) {
                g.setScrollX((int) ((Number) xr1Var.a.invoke()).floatValue());
                g.setMaxScrollX((int) ((Number) xr1Var.b.invoke()).floatValue());
            }
            if (xr1Var2 != null) {
                g.setScrollY((int) ((Number) xr1Var2.a.invoke()).floatValue());
                g.setMaxScrollY((int) ((Number) xr1Var2.b.invoke()).floatValue());
            }
            u(g);
        }
    }

    public final boolean C(ru1 ru1Var, int i, int i2, boolean z) {
        String l;
        Integer num;
        Integer num2;
        mu1 mu1Var = ru1Var.d;
        int i3 = ru1Var.g;
        zu1 zu1Var = lu1.j;
        boolean z2 = false;
        if (mu1Var.e.c(zu1Var) && f2.f(ru1Var)) {
            te0 te0Var = (te0) ((s0) ru1Var.d.c(zu1Var)).b;
            if (te0Var != null) {
                return ((Boolean) te0Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.y) && (l = l(ru1Var)) != null) {
            if (i < 0 || i != i2 || i2 > l.length()) {
                i = -1;
            }
            this.y = i;
            if (l.length() > 0) {
                z2 = true;
            }
            int s = s(i3);
            Integer num3 = null;
            if (z2) {
                num = Integer.valueOf(this.y);
            } else {
                num = null;
            }
            if (z2) {
                num2 = Integer.valueOf(this.y);
            } else {
                num2 = null;
            }
            if (z2) {
                num3 = Integer.valueOf(l.length());
            }
            u(h(s, num, num2, num3, l));
            y(i3);
            return true;
        }
        return false;
    }

    public final Rect E(float f, float f2, float f3, float f4) {
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        q5 q5Var = this.h;
        long s = q5Var.s((Float.floatToRawIntBits(f2) & 4294967295L) | (floatToRawIntBits << 32));
        long s2 = q5Var.s((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (s >> 32);
        int i2 = (int) (s2 >> 32);
        int i3 = (int) (s & 4294967295L);
        int i4 = (int) (s2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5.I():void");
    }

    @Override // defpackage.v0
    public final sl0 a(View view) {
        return this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, h1 h1Var, String str, Bundle bundle) {
        ru1 ru1Var;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i2;
        pl1 pl1Var;
        int i3;
        int i4;
        q5 q5Var;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = h1Var.a;
        tu1 tu1Var = (tu1) k().b(i);
        if (tu1Var != null && (ru1Var = tu1Var.a) != null) {
            ar0 ar0Var = ru1Var.c;
            mu1 mu1Var = ru1Var.d;
            i41 i41Var = mu1Var.e;
            String l = l(ru1Var);
            if (sn0.r(str, this.I)) {
                int d = this.G.d(i);
                if (d != -1) {
                    accessibilityNodeInfo.getExtras().putInt(str, d);
                    return;
                }
                return;
            }
            if (sn0.r(str, this.J)) {
                int d2 = this.H.d(i);
                if (d2 != -1) {
                    accessibilityNodeInfo.getExtras().putInt(str, d2);
                    return;
                }
                return;
            }
            boolean c = i41Var.c(lu1.a);
            q5 q5Var2 = this.h;
            e81 e81Var = null;
            if (c && bundle != null && sn0.r(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i6 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i6 > 0 && i5 >= 0) {
                    if (l != null) {
                        i2 = l.length();
                    } else {
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i5 < i2) {
                        w82 p = xq1.p(mu1Var);
                        if (p != null) {
                            ArrayList arrayList = new ArrayList();
                            int i7 = 0;
                            while (i7 < i6) {
                                int i8 = i5 + i7;
                                if (i8 >= p.a.a.f.length()) {
                                    arrayList.add(e81Var);
                                    i3 = i5;
                                    i4 = i6;
                                    q5Var = q5Var2;
                                } else {
                                    pl1 b = p.b(i8);
                                    e81 d3 = ru1Var.d();
                                    long j = 0;
                                    if (d3 != null) {
                                        if (!d3.V0().r) {
                                            d3 = e81Var;
                                        }
                                        if (d3 != null) {
                                            j = d3.Q(0L);
                                        }
                                    }
                                    pl1 i9 = b.i(j);
                                    pl1 g = ru1Var.g();
                                    if (i9.g(g)) {
                                        pl1Var = i9.e(g);
                                    } else {
                                        pl1Var = e81Var;
                                    }
                                    if (pl1Var != 0) {
                                        float f = pl1Var.a;
                                        long s = q5Var2.s((Float.floatToRawIntBits(pl1Var.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                                        float f2 = pl1Var.c;
                                        q5Var = q5Var2;
                                        long s2 = q5Var.s((Float.floatToRawIntBits(pl1Var.d) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                                        int i10 = (int) (s >> 32);
                                        i3 = i5;
                                        i4 = i6;
                                        int i11 = (int) (s2 >> 32);
                                        int i12 = (int) (s & 4294967295L);
                                        int i13 = (int) (s2 & 4294967295L);
                                        rectF = new RectF(Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.min(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13)));
                                    } else {
                                        i3 = i5;
                                        i4 = i6;
                                        q5Var = q5Var2;
                                        rectF = null;
                                    }
                                    arrayList.add(rectF);
                                }
                                i7++;
                                i6 = i4;
                                q5Var2 = q5Var;
                                i5 = i3;
                                e81Var = null;
                            }
                            accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                            return;
                        }
                        return;
                    }
                }
                Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                return;
            }
            zu1 zu1Var = vu1.z;
            if (i41Var.c(zu1Var) && bundle != null && sn0.r(str, "androidx.compose.ui.semantics.testTag")) {
                Object g2 = i41Var.g(zu1Var);
                if (g2 == null) {
                    obj5 = null;
                } else {
                    obj5 = g2;
                }
                String str2 = (String) obj5;
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (sn0.r(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, ru1Var.g);
                return;
            }
            if (sn0.r(str, "androidx.compose.ui.semantics.shapeType")) {
                Object g3 = i41Var.g(vu1.P);
                if (g3 == null) {
                    obj4 = null;
                } else {
                    obj4 = g3;
                }
                kw1 kw1Var = (kw1) obj4;
                if (kw1Var != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    pl1 m = m(ru1Var, rect, kw1Var);
                    float f3 = m.b;
                    float f4 = m.a;
                    lo a = kw1Var.a(m.c(), ar0Var.D, q5Var2.getDensity());
                    if (a instanceof vb1) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D(a, f4, f3));
                        return;
                    } else if (a instanceof wb1) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D(a, f4, f3));
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", F(a));
                        return;
                    } else if (a instanceof ub1) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", G(a, f4, f3));
                        return;
                    } else {
                        se.m();
                        return;
                    }
                }
                return;
            }
            if (sn0.r(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object g4 = i41Var.g(vu1.P);
                if (g4 == null) {
                    obj3 = null;
                } else {
                    obj3 = g4;
                }
                kw1 kw1Var2 = (kw1) obj3;
                if (kw1Var2 != null) {
                    Rect rect2 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                    pl1 m2 = m(ru1Var, rect2, kw1Var2);
                    Rect D = D(kw1Var2.a(m2.c(), ar0Var.D, q5Var2.getDensity()), m2.a, m2.b);
                    if (D != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", D);
                        return;
                    }
                    return;
                }
                return;
            }
            if (sn0.r(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object g5 = i41Var.g(vu1.P);
                if (g5 == null) {
                    obj2 = null;
                } else {
                    obj2 = g5;
                }
                kw1 kw1Var3 = (kw1) obj2;
                if (kw1Var3 != null) {
                    Rect rect3 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    float[] F = F(kw1Var3.a(m(ru1Var, rect3, kw1Var3).c(), ar0Var.D, q5Var2.getDensity()));
                    if (F != null) {
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", F);
                        return;
                    }
                    return;
                }
                return;
            }
            if (sn0.r(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object g6 = i41Var.g(vu1.P);
                if (g6 == null) {
                    obj = null;
                } else {
                    obj = g6;
                }
                kw1 kw1Var4 = (kw1) obj;
                if (kw1Var4 != null) {
                    Rect rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    pl1 m3 = m(ru1Var, rect4, kw1Var4);
                    Region G = G(kw1Var4.a(m3.c(), ar0Var.D, q5Var2.getDensity()), m3.a, m3.b);
                    if (G != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", G);
                    }
                }
            }
        }
    }

    public final Rect c(tu1 tu1Var) {
        bn0 bn0Var = tu1Var.b;
        return E(bn0Var.a, bn0Var.b, bn0Var.c, bn0Var.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f1, code lost:
    
        if (defpackage.fp.w(r4, r2) == r7) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005c, B:21:0x006e, B:23:0x0076, B:25:0x007f, B:27:0x0085, B:29:0x0094, B:31:0x009c, B:53:0x0046, B:55:0x004d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:14:0x00f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.wt r17) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5.d(wt):java.lang.Object");
    }

    public final boolean e(int i, long j, boolean z) {
        zu1 zu1Var;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (sn0.r(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            vm0 k = k();
            if (!z81.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    zu1Var = vu1.v;
                } else if (!z) {
                    zu1Var = vu1.u;
                } else {
                    se.m();
                    return false;
                }
                Object[] objArr = k.c;
                long[] jArr = k.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z6 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    tu1 tu1Var = (tu1) objArr[(i3 << 3) + i6];
                                    bn0 bn0Var = tu1Var.b;
                                    float f = bn0Var.a;
                                    i2 = i4;
                                    float f2 = bn0Var.b;
                                    float f3 = bn0Var.c;
                                    float f4 = bn0Var.d;
                                    float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if (intBitsToFloat >= f) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (intBitsToFloat < f3) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    boolean z7 = z2 & z3;
                                    if (intBitsToFloat2 >= f2) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    boolean z8 = z7 & z4;
                                    if (intBitsToFloat2 < f4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 & z8) {
                                        Object g = tu1Var.a.d.e.g(zu1Var);
                                        if (g == null) {
                                            g = null;
                                        }
                                        xr1 xr1Var = (xr1) g;
                                        if (xr1Var != null) {
                                            de0 de0Var = xr1Var.a;
                                            if (i < 0) {
                                                if (((Number) de0Var.invoke()).floatValue() <= 0.0f) {
                                                }
                                                z6 = true;
                                            } else {
                                                if (((Number) de0Var.invoke()).floatValue() >= ((Number) xr1Var.b.invoke()).floatValue()) {
                                                }
                                                z6 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z6;
                            }
                        }
                        if (i3 != length) {
                            i3++;
                        } else {
                            return z6;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void f() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (n()) {
                t(this.h.getSemanticsOwner().a(), this.M);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                z(k());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    I();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent g(int i, int i2) {
        tu1 tu1Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        q5 q5Var = this.h;
        obtain.setPackageName(q5Var.getContext().getPackageName());
        obtain.setSource(q5Var, i);
        if (n() && (tu1Var = (tu1) k().b(i)) != null) {
            ru1 ru1Var = tu1Var.a;
            obtain.setPassword(ru1Var.d.e.c(vu1.K));
            Object g = ru1Var.d.e.g(vu1.n);
            if (g == null) {
                g = null;
            }
            boolean r = sn0.r(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                w0.f(obtain, r);
            }
        }
        return obtain;
    }

    public final AccessibilityEvent h(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent g = g(i, SharedConstants.DefaultBufferSize);
        if (num != null) {
            g.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            g.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            g.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            g.getText().add(charSequence);
        }
        return g;
    }

    public final int i(ru1 ru1Var) {
        mu1 mu1Var = ru1Var.d;
        if (!mu1Var.e.c(vu1.a)) {
            zu1 zu1Var = vu1.G;
            if (mu1Var.e.c(zu1Var)) {
                return (int) (((d92) mu1Var.c(zu1Var)).a & 4294967295L);
            }
        }
        return this.y;
    }

    public final int j(ru1 ru1Var) {
        mu1 mu1Var = ru1Var.d;
        if (!mu1Var.e.c(vu1.a)) {
            zu1 zu1Var = vu1.G;
            if (mu1Var.e.c(zu1Var)) {
                return (int) (((d92) mu1Var.c(zu1Var)).a >> 32);
            }
        }
        return this.y;
    }

    public final vm0 k() {
        ru1 ru1Var;
        if (this.C) {
            this.C = false;
            q5 q5Var = this.h;
            this.E = mp0.t(q5Var.getSemanticsOwner(), i5.g);
            if (n()) {
                p31 p31Var = this.E;
                Resources resources = q5Var.getContext().getResources();
                n31 n31Var = this.G;
                n31Var.a();
                n31 n31Var2 = this.H;
                n31Var2.a();
                tu1 tu1Var = (tu1) p31Var.b(-1);
                if (tu1Var != null) {
                    ru1Var = tu1Var.a;
                } else {
                    ru1Var = null;
                }
                ru1Var.getClass();
                ArrayList b = cv1.b(ru1Var, new n3(p31Var, 3), new n3(resources, 4), xn.E(ru1Var));
                int i = 1;
                int size = b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((ru1) b.get(i - 1)).g;
                        int i3 = ((ru1) b.get(i)).g;
                        n31Var.f(i2, i3);
                        n31Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.E;
    }

    public final pl1 m(ru1 ru1Var, Rect rect, kw1 kw1Var) {
        u5 u5Var = new u5(kw1Var);
        ar0 ar0Var = ru1Var.c;
        d21 d21Var = ar0Var.J.f;
        qz qzVar = null;
        if ((d21Var.h & 8) != 0) {
            loop0: while (true) {
                if (d21Var == null) {
                    break;
                }
                if ((d21Var.g & 8) != 0) {
                    d21 d21Var2 = d21Var;
                    q41 q41Var = null;
                    while (d21Var2 != null) {
                        if (d21Var2 instanceof pu1) {
                            ((pu1) d21Var2).u0(u5Var);
                            if (u5Var.e) {
                                qzVar = d21Var2;
                                break loop0;
                            }
                        } else if ((d21Var2.g & 8) != 0 && (d21Var2 instanceof rz)) {
                            int i = 0;
                            for (d21 d21Var3 = ((rz) d21Var2).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                                if ((d21Var3.g & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        d21Var2 = d21Var3;
                                    } else {
                                        if (q41Var == null) {
                                            q41Var = new q41(new d21[16]);
                                        }
                                        if (d21Var2 != null) {
                                            q41Var.b(d21Var2);
                                            d21Var2 = null;
                                        }
                                        q41Var.b(d21Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        d21Var2 = hp.l(q41Var);
                    }
                }
                if ((d21Var.h & 8) == 0) {
                    break;
                }
                d21Var = d21Var.j;
            }
        }
        qz qzVar2 = (pu1) qzVar;
        if (qzVar2 != null && ((d21) qzVar2).e.r) {
            e81 L = hp.L(qzVar2);
            pl1 O = qo.D(L).O(L, true);
            Rect E = E(O.a, O.b, O.c, O.d);
            float f = E.left - rect.left;
            float f2 = E.top - rect.top;
            return new pl1(f, f2, E.width() + f, E.height() + f2);
        }
        return qo.j(ar0Var.J.d, false);
    }

    public final boolean n() {
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager.isEnabled()) {
            List<AccessibilityServiceInfo> list = this.m;
            if (list == null) {
                list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                this.m = list;
            }
            if (!list.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(ar0 ar0Var) {
        if (this.A.add(ar0Var)) {
            this.B.j(od2.a);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager.isEnabled()) {
            this.m = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.n.removeCallbacks(this.P);
        AccessibilityManager accessibilityManager = this.k;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int s(int i) {
        if (i == this.h.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }

    public final void t(ru1 ru1Var, su1 su1Var) {
        int[] iArr = dn0.a;
        q31 q31Var = new q31();
        List j = ru1.j(4, ru1Var);
        ar0 ar0Var = ru1Var.c;
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ru1 ru1Var2 = (ru1) j.get(i);
            vm0 k = k();
            int i2 = ru1Var2.g;
            if (k.a(i2)) {
                if (!su1Var.b.b(i2)) {
                    o(ar0Var);
                    return;
                }
                q31Var.a(i2);
            }
        }
        q31 q31Var2 = su1Var.b;
        int[] iArr2 = q31Var2.b;
        long[] jArr = q31Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128 && !q31Var.b(iArr2[(i3 << 3) + i5])) {
                            o(ar0Var);
                            return;
                        }
                        j2 >>= 8;
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
        List j3 = ru1.j(4, ru1Var);
        int size2 = j3.size();
        for (int i6 = 0; i6 < size2; i6++) {
            ru1 ru1Var3 = (ru1) j3.get(i6);
            su1 su1Var2 = (su1) this.L.b(ru1Var3.g);
            if (su1Var2 != null && k().a(ru1Var3.g)) {
                t(ru1Var3, su1Var2);
            }
        }
    }

    public final boolean u(AccessibilityEvent accessibilityEvent) {
        if (!n()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.t = true;
        }
        try {
            return ((Boolean) this.j.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.t = false;
        }
    }

    public final boolean v(int i, int i2, Integer num, List list) {
        if (i != Integer.MIN_VALUE && n()) {
            AccessibilityEvent g = g(i, i2);
            if (num != null) {
                g.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                g.setContentDescription(iw0.a(list, ",", null, 62));
            }
            return u(g);
        }
        return false;
    }

    public final void x(int i, int i2, String str) {
        AccessibilityEvent g = g(s(i), 32);
        g.setContentChangeTypes(i2);
        if (str != null) {
            g.getText().add(str);
        }
        u(g);
    }

    public final void y(int i) {
        s5 s5Var = this.D;
        if (s5Var != null) {
            ru1 ru1Var = s5Var.a;
            if (i != ru1Var.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - s5Var.f <= 1000) {
                AccessibilityEvent g = g(s(ru1Var.g), 131072);
                g.setFromIndex(s5Var.d);
                g.setToIndex(s5Var.e);
                g.setAction(s5Var.b);
                g.setMovementGranularity(s5Var.c);
                g.getText().add(l(ru1Var));
                u(g);
            }
        }
        this.D = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x04dd, code lost:
    
        if (r1.isEmpty() == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x050e, code lost:
    
        if (r12 != null) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0513, code lost:
    
        if (r12 == null) goto L574;
     */
    /* JADX WARN: Removed duplicated region for block: B:230:0x051c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.vm0 r57) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w5.z(vm0):void");
    }
}
