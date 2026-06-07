package defpackage;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.protobuf.DescriptorProtos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i(boolean z, String str, String str2, String str3, f80 f80Var, f12 f12Var) {
        this.e = 11;
        this.f = f80Var;
        this.g = f12Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        jw0 jw0Var;
        long f;
        long j;
        long f2;
        long j2;
        w51 w51Var;
        wu0 g;
        int i = this.e;
        sb1 sb1Var = sb1.e;
        int i2 = 6;
        int i3 = 2;
        int i4 = 0;
        od2 od2Var = od2.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ((r31) obj3).b((ri1) obj2);
                return od2Var;
            case 1:
                lw0 lw0Var = (lw0) obj3;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                if (((mu0) obj) == mu0.ON_RESUME) {
                    lw0Var.getClass();
                    lw0Var.g.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(lw0Var);
                    kw0 kw0Var = lw0Var.h;
                    if (kw0Var != null) {
                        kw0Var.e.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(kw0Var);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (jw0Var = lw0Var.i) != null) {
                        jw0Var.a.setValue(Boolean.valueOf(lw0.a(accessibilityManager)));
                        jw0Var.b.setValue(Boolean.valueOf(lw0.b(accessibilityManager)));
                        f1.a(accessibilityManager, d1.g(jw0Var));
                    }
                }
                return od2Var;
            case 2:
                h4 h4Var = (h4) obj3;
                m4 m4Var = (m4) obj2;
                long j3 = ((w20) obj).a;
                if (h4Var.h1()) {
                    f = z81.f(j3, -1.0f);
                } else {
                    f = z81.f(j3, 1.0f);
                }
                if (h4Var.N == sb1Var) {
                    j = f & 4294967295L;
                } else {
                    j = f >> 32;
                }
                m4Var.a(h4Var.M.e(Float.intBitsToFloat((int) j)), 0.0f);
                return od2Var;
            case 3:
                ng ngVar = (ng) obj3;
                og ogVar = (og) obj2;
                w92 w92Var = ngVar.s;
                if (w92Var != null) {
                    w92Var.b();
                }
                ngVar.s = null;
                ip ipVar = ogVar.b;
                if (ipVar != null) {
                    ipVar.R(od2Var);
                }
                ogVar.b = null;
                return od2Var;
            case 4:
                ug ugVar = (ug) obj3;
                qq qqVar = (qq) obj2;
                ugVar.a(qqVar);
                return new h6(i3, ugVar, qqVar);
            case 5:
                cr0 cr0Var = (cr0) obj;
                cr0Var.b();
                c40.T(cr0Var, (n8) obj3, (ck) obj2, 0.0f, null, 60);
                return od2Var;
            case 6:
                cr0 cr0Var2 = (cr0) obj;
                cr0Var2.b();
                c40.T(cr0Var2, ((ub1) obj3).e, (ck) obj2, 0.0f, null, 60);
                return od2Var;
            case 7:
                ((nj) obj3).a.j((ft) obj2);
                return od2Var;
            case 8:
                gu0 gu0Var = (gu0) obj3;
                ck ckVar = (ck) obj2;
                cr0 cr0Var3 = (cr0) obj;
                cr0Var3.b();
                if (((Boolean) gu0Var.s.getValue()).booleanValue() || ((Boolean) gu0Var.t.getValue()).booleanValue()) {
                    c40.z(cr0Var3, ckVar, 0L, 0L, 0.0f, null, WebSocketProtocol.PAYLOAD_SHORT);
                }
                return od2Var;
            case 9:
                return DiskLruCache.Editor.a((DiskLruCache) obj3, (DiskLruCache.Editor) obj2, (IOException) obj);
            case 10:
                cz1 cz1Var = (cz1) obj3;
                w30 w30Var = (w30) obj2;
                long j4 = ((w20) obj).a;
                if (w30Var.R) {
                    f2 = z81.f(j4, -1.0f);
                } else {
                    f2 = z81.f(j4, 1.0f);
                }
                sb1 sb1Var2 = w30Var.N;
                t30 t30Var = u30.a;
                if (sb1Var2 == sb1Var) {
                    j2 = f2 & 4294967295L;
                } else {
                    j2 = f2 >> 32;
                }
                cz1Var.a.a(Float.intBitsToFloat((int) j2));
                return od2Var;
            case 11:
                av1 av1Var = (av1) obj;
                xu1.e(av1Var, 6);
                av1Var.a(lu1.b, new s0(null, new v3((f80) obj3, (f12) obj2)));
                return od2Var;
            case 12:
                return new m2(new j80((View) obj3, (de0) obj2), 8);
            case 13:
                ((r31) obj3).b((hn0) obj2);
                return od2Var;
            case 14:
                ((mg0) obj3).g.removeCallbacks((lg0) obj2);
                return od2Var;
            case 15:
                uk0 uk0Var = (uk0) obj3;
                sk0 sk0Var = (sk0) obj2;
                uk0Var.a.b(sk0Var);
                uk0Var.b.setValue(Boolean.TRUE);
                return new h6(4, uk0Var, sk0Var);
            case 16:
                vt0 vt0Var = (vt0) obj3;
                vt0Var.g.i(obj2);
                return new h6(5, vt0Var, obj2);
            case 17:
                return new vt0((oq1) obj3, (Map) obj, (lq1) obj2);
            case 18:
                ((ag) obj3).e();
                ((de0) obj2).invoke();
                return od2Var;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                ag agVar = (ag) obj3;
                ((tp0) obj).getClass();
                if (((Boolean) ((o22) obj2).getValue()).booleanValue()) {
                    r22 r22Var = agVar.s;
                    r22Var.getClass();
                    r22Var.k(null, 2);
                }
                return od2Var;
            case 20:
                ya yaVar = (ya) obj2;
                io1 io1Var = (io1) obj;
                float g2 = ((ex1) obj3).d.j.g();
                float intBitsToFloat = Float.intBitsToFloat((int) (io1Var.r & 4294967295L));
                if (!Float.isNaN(g2) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
                    float floatValue = ((Number) yaVar.d()).floatValue();
                    io1Var.j(x11.d(io1Var, floatValue));
                    io1Var.k(x11.e(io1Var, floatValue));
                    io1Var.o(yq1.a(0.5f, (g2 + intBitsToFloat) / intBitsToFloat));
                }
                return od2Var;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                de0 de0Var = (de0) obj2;
                if (!((ex1) obj3).e()) {
                    de0Var.invoke();
                }
                return od2Var;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                r51 r51Var = (r51) obj3;
                j51 j51Var = ((c61) obj2).b;
                m61 m61Var = (m61) obj;
                m61Var.getClass();
                k61 k61Var = m61Var.a;
                k61Var.e = 0;
                k61Var.f = 0;
                if (r51Var instanceof w51) {
                    int i5 = r51.i;
                    Iterator it = fp.B(r51Var).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            r51 r51Var2 = (r51) it.next();
                            r51 g3 = j51Var.g();
                            if (g3 != null) {
                                w51Var = g3.g;
                            } else {
                                w51Var = null;
                            }
                            if (sn0.r(r51Var2, w51Var)) {
                            }
                        } else {
                            int i6 = w51.k;
                            w51 w51Var2 = j51Var.c;
                            if (w51Var2 != null) {
                                Iterator it2 = mv1.G(w51Var2, new v51(i4)).iterator();
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    while (it2.hasNext()) {
                                        next = it2.next();
                                    }
                                    m61Var.b = ((r51) next).f.a;
                                    m61Var.d = false;
                                    m61Var.e = true;
                                } else {
                                    y61.j("Sequence is empty.");
                                    return null;
                                }
                            } else {
                                se.p("You must call setGraph() before calling getGraph()");
                                return null;
                            }
                        }
                    }
                }
                return od2Var;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                c61 c61Var = (c61) obj3;
                uu0 uu0Var = (uu0) obj2;
                c61Var.getClass();
                uu0Var.getClass();
                j51 j51Var2 = c61Var.b;
                m1 m1Var = j51Var2.r;
                if (!uu0Var.equals(j51Var2.n)) {
                    uu0 uu0Var2 = j51Var2.n;
                    if (uu0Var2 != null && (g = uu0Var2.g()) != null) {
                        g.f(m1Var);
                    }
                    j51Var2.n = uu0Var;
                    uu0Var.g().a(m1Var);
                }
                return new x8(2);
            case 24:
                return new h6(i2, (o22) obj3, (wq) obj2);
            case 25:
                f91 f91Var = (f91) obj3;
                ig1 ig1Var = (ig1) obj2;
                hg1 hg1Var = (hg1) obj;
                long j5 = ((xm0) f91Var.s.invoke(hg1Var)).a;
                if (f91Var.t) {
                    hg1.l(hg1Var, ig1Var, (int) (j5 >> 32), (int) (j5 & 4294967295L));
                } else {
                    hg1.m(hg1Var, ig1Var, (int) (j5 >> 32), (int) (j5 & 4294967295L), null, 12);
                }
                return od2Var;
            case 26:
                oc1 oc1Var = (oc1) obj3;
                ig1 ig1Var2 = (ig1) obj2;
                hg1 hg1Var2 = (hg1) obj;
                boolean z = oc1Var.w;
                float f3 = oc1Var.s;
                if (z) {
                    hg1.k(hg1Var2, ig1Var2, hg1Var2.j0(f3), hg1Var2.j0(oc1Var.t));
                } else {
                    hg1.i(hg1Var2, ig1Var2, hg1Var2.j0(f3), hg1Var2.j0(oc1Var.t));
                }
                return od2Var;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                hg1 hg1Var3 = (hg1) obj;
                dd1 dd1Var = new dd1((ArrayList) obj2, i4);
                hg1Var3.e = true;
                dd1Var.invoke(hg1Var3);
                hg1Var3.e = false;
                ((o41) obj3).getValue();
                return od2Var;
            case 28:
                ug ugVar2 = (ug) obj3;
                cr crVar = (cr) obj2;
                ugVar2.a(crVar);
                return new h6(7, ugVar2, crVar);
            default:
                j41 j41Var = (j41) obj2;
                ((ds) obj3).A(obj);
                if (j41Var != null) {
                    j41Var.a(obj);
                }
                return od2Var;
        }
    }

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
