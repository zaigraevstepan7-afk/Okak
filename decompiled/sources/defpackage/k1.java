package defpackage;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class k1 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ k1(uu0 uu0Var, av0 av0Var, oe0 oe0Var) {
        this.e = 11;
        this.g = uu0Var;
        this.h = av0Var;
        this.f = oe0Var;
    }

    private final Object b(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        final b82 b82Var = (b82) this.g;
        gv gvVar = (gv) this.f;
        Context context = (Context) this.h;
        f62 f62Var = (f62) obj;
        b41 b41Var = f62Var.a;
        b41 b41Var2 = f62Var.a;
        s62 s62Var = s62.b;
        b41Var.a(s62Var);
        p62[] p62VarArr = p62.f;
        final int i = 1;
        final int i2 = 0;
        if (!d92.c(b82Var.n().b) && b82Var.j() && b82Var.g != null) {
            z = true;
        } else {
            z = false;
        }
        vt vtVar = null;
        int i3 = 5;
        ii1 ii1Var = new ii1(i3, gvVar, new w72(b82Var, vtVar, i));
        Resources resources = context.getResources();
        int i4 = 7;
        fl1 fl1Var = new fl1(i4, ii1Var, vtVar);
        if (z) {
            b41Var2.a(new o62(d6.B, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, fl1Var));
        }
        p62[] p62VarArr2 = p62.f;
        if (!d92.c(b82Var.n().b) && b82Var.g != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        final int i5 = 2;
        ii1 ii1Var2 = new ii1(i3, gvVar, new w72(b82Var, vtVar, i5));
        Resources resources2 = context.getResources();
        fl1 fl1Var2 = new fl1(i4, ii1Var2, vtVar);
        if (z2) {
            b41Var2.a(new o62(d6.C, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, fl1Var2));
        }
        p62[] p62VarArr3 = p62.f;
        if (b82Var.j() && ((Boolean) b82Var.w.getValue()).booleanValue() && b82Var.g != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        ii1 ii1Var3 = new ii1(i3, gvVar, new w72(b82Var, vtVar, 3));
        Resources resources3 = context.getResources();
        fl1 fl1Var3 = new fl1(i4, ii1Var3, vtVar);
        if (z3) {
            b41Var2.a(new o62(d6.D, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, fl1Var3));
        }
        p62[] p62VarArr4 = p62.f;
        if (d92.d(b82Var.n().b) != b82Var.n().a.f.length()) {
            z4 = true;
        } else {
            z4 = false;
        }
        de0 de0Var = new de0() { // from class: f82
            @Override // defpackage.de0
            public final Object invoke() {
                int i6 = i2;
                od2 od2Var = od2.a;
                b82 b82Var2 = b82Var;
                switch (i6) {
                    case 0:
                        return Boolean.valueOf(!b82Var2.A);
                    case 1:
                        i82 e = b82.e(b82Var2.n().a, fr1.a(0, b82Var2.n().a.f.length()));
                        b82Var2.c.invoke(e);
                        long j = e.b;
                        b82Var2.v = new d92(j);
                        b82Var2.t = i82.a(b82Var2.t, null, j, 5);
                        b82Var2.h(true);
                        return od2Var;
                    default:
                        de0 de0Var2 = b82Var2.f;
                        if (de0Var2 != null) {
                            de0Var2.invoke();
                        }
                        return od2Var;
                }
            }
        };
        de0 de0Var2 = new de0() { // from class: f82
            @Override // defpackage.de0
            public final Object invoke() {
                int i6 = i;
                od2 od2Var = od2.a;
                b82 b82Var2 = b82Var;
                switch (i6) {
                    case 0:
                        return Boolean.valueOf(!b82Var2.A);
                    case 1:
                        i82 e = b82.e(b82Var2.n().a, fr1.a(0, b82Var2.n().a.f.length()));
                        b82Var2.c.invoke(e);
                        long j = e.b;
                        b82Var2.v = new d92(j);
                        b82Var2.t = i82.a(b82Var2.t, null, j, 5);
                        b82Var2.h(true);
                        return od2Var;
                    default:
                        de0 de0Var22 = b82Var2.f;
                        if (de0Var22 != null) {
                            de0Var22.invoke();
                        }
                        return od2Var;
                }
            }
        };
        Resources resources4 = context.getResources();
        fl1 fl1Var4 = new fl1(i4, de0Var2, de0Var);
        if (z4) {
            b41Var2.a(new o62(d6.E, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, fl1Var4));
        }
        p62[] p62VarArr5 = p62.f;
        if (!b82Var.j() || !d92.c(b82Var.n().b)) {
            i = 0;
        }
        de0 de0Var3 = new de0() { // from class: f82
            @Override // defpackage.de0
            public final Object invoke() {
                int i6 = i5;
                od2 od2Var = od2.a;
                b82 b82Var2 = b82Var;
                switch (i6) {
                    case 0:
                        return Boolean.valueOf(!b82Var2.A);
                    case 1:
                        i82 e = b82.e(b82Var2.n().a, fr1.a(0, b82Var2.n().a.f.length()));
                        b82Var2.c.invoke(e);
                        long j = e.b;
                        b82Var2.v = new d92(j);
                        b82Var2.t = i82.a(b82Var2.t, null, j, 5);
                        b82Var2.h(true);
                        return od2Var;
                    default:
                        de0 de0Var22 = b82Var2.f;
                        if (de0Var22 != null) {
                            de0Var22.invoke();
                        }
                        return od2Var;
                }
            }
        };
        Resources resources5 = context.getResources();
        fl1 fl1Var5 = new fl1(i4, de0Var3, vtVar);
        if (i != 0) {
            b41Var2.a(new o62(d6.F, resources5.getString(R.string.autofill), 0, fl1Var5));
        }
        b41Var2.a(s62Var);
        return od2.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0a17: MOVE (r5 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]) (LINE:2584), block:B:435:0x0a17 */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r1v43, types: [qu0, tu0] */
    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        long j;
        boolean z;
        tl tlVar;
        tl tlVar2;
        long j2;
        float f2;
        int i;
        boolean z2;
        fq fqVar;
        fq fqVar2;
        fq fqVar3;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        gu0 gu0Var;
        Integer e;
        Integer d;
        Integer d2;
        Integer e2;
        w82 w82Var;
        w82 w82Var2;
        x82 x82Var;
        x82 x82Var2;
        w82 w82Var3;
        w82 w82Var4;
        x82 x82Var3;
        x82 x82Var4;
        Integer d3;
        Integer e3;
        Integer e4;
        Integer d4;
        h12 h12Var;
        int i2 = this.e;
        int i3 = 12;
        int i4 = 13;
        int i5 = 10;
        int i6 = 7;
        float f8 = 0.0f;
        int i7 = 2;
        int i8 = 4;
        i82 i82Var = null;
        final int i9 = 0;
        final int i10 = 1;
        od2 od2Var = od2.a;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.g;
        switch (i2) {
            case 0:
                uu0 uu0Var = (uu0) obj4;
                int i11 = 0;
                m1 m1Var = new m1((oe0) obj3, i11);
                uu0Var.g().a(m1Var);
                return new n1((de0) obj2, uu0Var, m1Var, i11);
            case 1:
                oe0 oe0Var = (oe0) obj3;
                o41 o41Var = (o41) obj2;
                i82 i82Var2 = (i82) obj;
                ((o41) obj4).setValue(i82Var2);
                boolean r = sn0.r((String) o41Var.getValue(), i82Var2.a.f);
                rc rcVar = i82Var2.a;
                o41Var.setValue(rcVar.f);
                if (!r) {
                    oe0Var.invoke(rcVar.f);
                }
                return od2Var;
            case 2:
                rx.C((gv) obj4, null, new l((sc0) obj, (o41) obj3, (ta2) obj2, null, 7), 3);
                return od2Var;
            case 3:
                j1 j1Var = new j1(8, (gv) obj3, (ta2) obj2);
                ep0[] ep0VarArr = xu1.a;
                ((av1) obj).a(lu1.c, new s0((String) obj4, j1Var));
                return od2Var;
            case 4:
                jt jtVar = (jt) obj4;
                go0 go0Var = (go0) obj3;
                ys1 ys1Var = (ys1) obj2;
                float floatValue = ((Float) obj).floatValue();
                if (jtVar.u) {
                    f = 1.0f;
                } else {
                    f = -1.0f;
                }
                at1 at1Var = jtVar.t;
                long e5 = at1Var.e(at1Var.h(f * floatValue));
                at1 at1Var2 = ys1Var.a;
                float g = at1Var.g(at1Var.e(at1Var2.c(at1Var2.k, e5, 1))) * f;
                if (Math.abs(g) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + g + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    go0Var.c(cancellationException);
                }
                return od2Var;
            case 5:
                gu0 gu0Var2 = (gu0) obj4;
                long j3 = ((i82) obj3).b;
                c91 c91Var = (c91) obj2;
                c40 c40Var = (c40) obj;
                x82 d5 = gu0Var2.d();
                if (d5 != null) {
                    tl h = c40Var.b0().h();
                    long j4 = ((d92) gu0Var2.A.getValue()).a;
                    long j5 = ((d92) gu0Var2.B.getValue()).a;
                    w82 w82Var5 = d5.a;
                    v82 v82Var = w82Var5.a;
                    g31 g31Var = w82Var5.b;
                    f8 f8Var = gu0Var2.y;
                    long j6 = gu0Var2.z;
                    if (!d92.c(j4)) {
                        f8Var.e(j6);
                        int d6 = c91Var.d(d92.f(j4));
                        int d7 = c91Var.d(d92.e(j4));
                        if (d6 != d7) {
                            h.f(w82Var5.h(d6, d7), f8Var);
                        }
                    } else if (!d92.c(j5)) {
                        long b = v82Var.b.b();
                        co coVar = new co(b);
                        if (b == 16) {
                            coVar = null;
                        }
                        if (coVar != null) {
                            j = coVar.a;
                        } else {
                            j = co.b;
                        }
                        f8Var.e(co.b(j, co.d(j) * 0.2f));
                        int d8 = c91Var.d(d92.f(j5));
                        int d9 = c91Var.d(d92.e(j5));
                        if (d8 != d9) {
                            h.f(w82Var5.h(d8, d9), f8Var);
                        }
                    } else if (!d92.c(j3)) {
                        f8Var.e(j6);
                        int d10 = c91Var.d(d92.f(j3));
                        int d11 = c91Var.d(d92.e(j3));
                        if (d10 != d11) {
                            h.f(w82Var5.h(d10, d11), f8Var);
                        }
                    }
                    long j7 = w82Var5.c;
                    if (((int) (j7 >> 32)) >= g31Var.d && !g31Var.c && ((int) (j7 & 4294967295L)) >= g31Var.e) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z || v82Var.f == 3) {
                        i10 = 0;
                    }
                    if (i10 != 0) {
                        pl1 e6 = hp.e(0L, (Float.floatToRawIntBits((int) (j7 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L));
                        h.h();
                        tl.q(h, e6);
                    }
                    m12 m12Var = v82Var.b.a;
                    x62 x62Var = m12Var.m;
                    k82 k82Var = m12Var.a;
                    if (x62Var == null) {
                        x62Var = x62.b;
                    }
                    x62 x62Var2 = x62Var;
                    hw1 hw1Var = m12Var.n;
                    if (hw1Var == null) {
                        hw1Var = hw1.d;
                    }
                    hw1 hw1Var2 = hw1Var;
                    d40 d40Var = m12Var.p;
                    if (d40Var == null) {
                        d40Var = o90.a;
                    }
                    d40 d40Var2 = d40Var;
                    try {
                        ck b2 = k82Var.b();
                        j82 j82Var = j82.a;
                        try {
                            if (b2 != null) {
                                if (k82Var != j82Var) {
                                    f2 = k82Var.c();
                                } else {
                                    f2 = 1.0f;
                                }
                                g31.i(g31Var, h, b2, f2, hw1Var2, x62Var2, d40Var2);
                                tlVar = h;
                            } else {
                                tl tlVar3 = h;
                                if (k82Var != j82Var) {
                                    j2 = k82Var.a();
                                } else {
                                    j2 = co.b;
                                }
                                long j8 = j2;
                                tlVar3.h();
                                ArrayList arrayList = g31Var.h;
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    zd1 zd1Var = (zd1) arrayList.get(i12);
                                    zd1Var.a.f(tlVar3, j8, hw1Var2, x62Var2, d40Var2);
                                    tlVar = tlVar3;
                                    try {
                                        tlVar.o(0.0f, zd1Var.a.b());
                                        i12++;
                                        tlVar3 = tlVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (i10 != 0) {
                                            tlVar.p();
                                        }
                                        throw th;
                                    }
                                }
                                tlVar = tlVar3;
                                tlVar.p();
                            }
                            if (i10 != 0) {
                                tlVar.p();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            tlVar = tlVar2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        tlVar = h;
                    }
                }
                return od2Var;
            case 6:
                tl1 tl1Var = (tl1) obj4;
                fc fcVar = (fc) obj;
                float floatValue2 = ((Number) fcVar.e.getValue()).floatValue() - tl1Var.e;
                float a = ((ds1) obj3).a(floatValue2);
                tl1Var.e = ((Number) fcVar.e.getValue()).floatValue();
                ((tl1) obj2).e = ((Number) fcVar.b()).floatValue();
                if (Math.abs(floatValue2 - a) > 0.5f) {
                    fcVar.a();
                }
                return od2Var;
            case 7:
                Context context = (Context) obj3;
                t62 t62Var = (t62) obj2;
                qt qtVar = (qt) obj;
                List list = ((h62) obj4).a;
                int size2 = list.size();
                int i13 = 0;
                while (i13 < size2) {
                    g62 g62Var = (g62) list.get(i13);
                    if (g62Var instanceof o62) {
                        o62 o62Var = (o62) g62Var;
                        h8 h8Var = new h8(o62Var, i6);
                        if (o62Var.c == 0) {
                            fqVar3 = null;
                        } else {
                            fqVar3 = new fq(-1930700965, true, new hz(o62Var, i9));
                        }
                        qt.b(qtVar, h8Var, fqVar3, new j1(i3, o62Var, t62Var), 6);
                    } else {
                        if (g62Var instanceof u62) {
                            u62 u62Var = (u62) g62Var;
                            if (context != null) {
                                int i14 = u62Var.c;
                                TextClassification textClassification = u62Var.b;
                                if (i14 < 0) {
                                    h8 h8Var2 = new h8(textClassification, 22);
                                    Drawable icon = textClassification.getIcon();
                                    if (icon != null) {
                                        fqVar2 = new fq(-1123224187, true, new hz(icon, i10));
                                    } else {
                                        fqVar2 = null;
                                    }
                                    qt.b(qtVar, h8Var2, fqVar2, new ii1(i8, context, textClassification), 6);
                                } else {
                                    RemoteAction remoteAction = textClassification.getActions().get(i14);
                                    if (i14 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    h8 h8Var3 = new h8(remoteAction, 23);
                                    if (!z2 && !remoteAction.shouldShowIcon()) {
                                        fqVar = null;
                                    } else {
                                        fqVar = new fq(-1261173016, true, new hz(remoteAction, i7));
                                    }
                                    i = 13;
                                    qt.b(qtVar, h8Var3, fqVar, new vm1(remoteAction, i), 6);
                                }
                            }
                        } else {
                            i = 13;
                            if (g62Var instanceof s62) {
                                qtVar.a.add(bf.q);
                            }
                        }
                        i13++;
                        i9 = 0;
                        i6 = 7;
                    }
                    i = 13;
                    i13++;
                    i9 = 0;
                    i6 = 7;
                }
                return od2Var;
            case 8:
                a12 a12Var = (a12) obj4;
                d51 d51Var = (d51) obj3;
                a12Var.add(d51Var);
                return new n1((y00) obj2, d51Var, a12Var, i7);
            case 9:
                r30 r30Var = (r30) obj3;
                ig1 ig1Var = (ig1) obj2;
                hg1 hg1Var = (hg1) obj;
                boolean S = ((l01) obj4).S();
                n4 n4Var = r30Var.s;
                if (S) {
                    f3 = n4Var.c().f(r30Var.s.i.getValue());
                } else {
                    f3 = n4Var.f();
                }
                jq0 jq0Var = hp.M(r30Var).D;
                jq0 jq0Var2 = jq0.f;
                sb1 sb1Var = sb1.f;
                if (jq0Var == jq0Var2 && r30Var.u == sb1Var) {
                    f4 = -1.0f;
                } else {
                    f4 = 1.0f;
                }
                sb1 sb1Var2 = r30Var.u;
                if (sb1Var2 == sb1Var) {
                    f5 = f4 * f3;
                } else {
                    f5 = 0.0f;
                }
                if (sb1Var2 == sb1.e) {
                    f8 = f3;
                }
                hg1Var.e = true;
                hg1.i(hg1Var, ig1Var, c01.R(f5), c01.R(f8));
                hg1Var.e = false;
                return od2Var;
            case 10:
                o41 o41Var2 = (o41) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                List list2 = (List) obj2;
                hg1 hg1Var2 = (hg1) obj;
                hg1Var2.e = true;
                int size3 = arrayList2.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    ((nt0) arrayList2.get(i15)).b(hg1Var2);
                }
                int size4 = list2.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    ((nt0) list2.get(i16)).b(hg1Var2);
                }
                hg1Var2.e = false;
                o41Var2.getValue();
                return od2Var;
            case 11:
                uu0 uu0Var2 = (uu0) obj4;
                final av0 av0Var = (av0) obj2;
                final oe0 oe0Var2 = (oe0) obj3;
                final ?? obj5 = new Object();
                ?? r1 = new su0() { // from class: qu0
                    @Override // defpackage.su0
                    public final void g(uu0 uu0Var3, mu0 mu0Var) {
                        int i17 = ru0.a[mu0Var.ordinal()];
                        wl1 wl1Var = obj5;
                        if (i17 != 1) {
                            if (i17 != 2) {
                                return;
                            }
                            yg ygVar = (yg) wl1Var.e;
                            if (ygVar != null) {
                                ygVar.a();
                            }
                            wl1Var.e = null;
                            return;
                        }
                        wl1Var.e = oe0Var2.invoke(av0.this);
                    }
                };
                uu0Var2.g().a(r1);
                return new n1(uu0Var2, r1, obj5);
            case 12:
                l40 l40Var = (l40) obj3;
                gv gvVar = (gv) obj2;
                av1 av1Var = (av1) obj;
                xu1.c(av1Var, (String) obj4);
                if (l40Var.c()) {
                    av1Var.a(lu1.v, new s0(null, new rd(l40Var, gvVar)));
                }
                return od2Var;
            case 13:
                pc1 pc1Var = (pc1) obj3;
                h3 h3Var = (h3) obj2;
                cr0 cr0Var = (cr0) obj;
                long j9 = ((fy1) ((i72) obj4).get()).a;
                float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                if (intBitsToFloat > 0.0f) {
                    float W = cr0Var.W(4.0f);
                    vl vlVar = cr0Var.e;
                    float a2 = h3Var.a(c01.R(intBitsToFloat), c01.R((Float.intBitsToFloat((int) (vlVar.d() >> 32)) - r6) - cr0Var.W(pc1Var.c(cr0Var.getLayoutDirection()))), cr0Var.getLayoutDirection()) + cr0Var.W(pc1Var.b(cr0Var.getLayoutDirection()));
                    float f9 = intBitsToFloat / 2.0f;
                    float f10 = a2 + f9;
                    float f11 = (f10 - f9) - W;
                    if (f11 < 0.0f) {
                        f6 = 0.0f;
                    } else {
                        f6 = f11;
                    }
                    float f12 = f10 + f9 + W;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (vlVar.d() >> 32));
                    if (f12 > intBitsToFloat2) {
                        f7 = intBitsToFloat2;
                    } else {
                        f7 = f12;
                    }
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                    float f13 = (-intBitsToFloat3) / 2.0f;
                    float f14 = intBitsToFloat3 / 2.0f;
                    ld ldVar = vlVar.f;
                    long k = ldVar.k();
                    ldVar.h().h();
                    try {
                        ((ld) ((rg2) ldVar.f).f).h().n(f6, f13, f7, f14, 0);
                        cr0Var.b();
                    } finally {
                        l90.v(ldVar, k);
                    }
                } else {
                    cr0Var.b();
                }
                return od2Var;
            case 14:
                mq1 mq1Var = (mq1) obj4;
                rq1 rq1Var = (rq1) obj2;
                i41 i41Var = mq1Var.f;
                if (!i41Var.b(obj3)) {
                    mq1Var.e.remove(obj3);
                    i41Var.m(obj3, rq1Var);
                    return new n1(mq1Var, obj3, rq1Var, i8);
                }
                y61.r("Key ", obj3, " was used multiple times ");
                return null;
            case 15:
                cy1 cy1Var = (cy1) obj4;
                y61 y61Var = (y61) obj3;
                sl1 sl1Var = (sl1) obj2;
                qh1 qh1Var = (qh1) obj;
                long j10 = qh1Var.c;
                b82 b82Var = (b82) cy1Var.d;
                if (b82Var.k() && b82Var.n().a.f.length() != 0 && (gu0Var = b82Var.d) != null && gu0Var.d() != null) {
                    cy1Var.c(b82Var.n(), j10, false, y61Var);
                    i9 = 1;
                }
                if (i9 != 0) {
                    qh1Var.a();
                    sl1Var.e = true;
                }
                return od2Var;
            case 16:
                final h32 h32Var = (h32) obj4;
                final ew1 ew1Var = (ew1) obj3;
                final o22 o22Var = (o22) obj2;
                it0 it0Var = (it0) obj;
                it0Var.getClass();
                it0.c0(it0Var, new fq(-1316053850, true, new te0() { // from class: zv1
                    @Override // defpackage.te0
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        boolean z3;
                        String str;
                        boolean z4;
                        String str2;
                        int i17 = i9;
                        od2 od2Var2 = od2.a;
                        b21 b21Var = b21.a;
                        final o22 o22Var2 = o22Var;
                        final ew1 ew1Var2 = ew1Var;
                        final h32 h32Var2 = h32Var;
                        final int i18 = 1;
                        final int i19 = 0;
                        ur urVar = (ur) obj7;
                        int intValue = ((Integer) obj8).intValue();
                        ((tr0) obj6).getClass();
                        int i20 = intValue & 17;
                        switch (i17) {
                            case 0:
                                if (i20 != 16) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (urVar.O(intValue & 1, z3)) {
                                    yo a3 = wo.a(new pe(2.0f, true, new le(0)), g3.r, urVar, 6);
                                    int hashCode = Long.hashCode(urVar.T);
                                    sf1 l = urVar.l();
                                    e21 Q = fp.Q(urVar, b21Var);
                                    lr.b.getClass();
                                    hs hsVar = kr.b;
                                    urVar.a0();
                                    if (urVar.S) {
                                        urVar.k(hsVar);
                                    } else {
                                        urVar.k0();
                                    }
                                    op1.q(urVar, kr.f, a3);
                                    op1.q(urVar, kr.e, l);
                                    op1.l(urVar, Integer.valueOf(hashCode), kr.g);
                                    op1.o(urVar, kr.h);
                                    op1.q(urVar, kr.d, Q);
                                    switch (h32Var2.a) {
                                        case 0:
                                            str = "Binary Execution";
                                            break;
                                        case 1:
                                            str = "Execução Binária";
                                            break;
                                        case 2:
                                            str = "Исполнение бинарника";
                                            break;
                                        case 3:
                                            str = "Виконання бінарника";
                                            break;
                                        default:
                                            str = "二进制执行";
                                            break;
                                    }
                                    c01.l(str, urVar, 0);
                                    c01.i(bg0.e, go.N(-533264343, new se0() { // from class: aw1
                                        @Override // defpackage.se0
                                        public final Object invoke(Object obj9, Object obj10) {
                                            boolean z5;
                                            String str3;
                                            String str4;
                                            boolean z6;
                                            String str5;
                                            String str6;
                                            boolean z7;
                                            String str7;
                                            String str8;
                                            int i21 = i19;
                                            od2 od2Var3 = od2.a;
                                            xl1 xl1Var = or.a;
                                            o22 o22Var3 = o22Var2;
                                            final ew1 ew1Var3 = ew1Var2;
                                            h32 h32Var3 = h32Var2;
                                            final int i22 = 1;
                                            switch (i21) {
                                                case 0:
                                                    ur urVar2 = (ur) obj9;
                                                    int intValue2 = ((Integer) obj10).intValue();
                                                    if ((intValue2 & 3) != 2) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (urVar2.O(intValue2 & 1, z5)) {
                                                        ij0 ij0Var = fr1.c;
                                                        if (ij0Var == null) {
                                                            hj0 hj0Var = new hj0("Rounded.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i23 = me2.a;
                                                            i12 i12Var = new i12(co.b);
                                                            rg2 rg2Var = new rg2(21);
                                                            rg2Var.s(12.0f, 4.0f);
                                                            rg2Var.h(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
                                                            rg2Var.h(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
                                                            rg2Var.w(9.27f, -3.11f, 11.0f, -7.5f);
                                                            rg2Var.h(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 16.5f);
                                                            rg2Var.i(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                                                            rg2Var.w(2.24f, -5.0f, 5.0f, -5.0f);
                                                            rg2Var.w(5.0f, 2.24f, 5.0f, 5.0f);
                                                            rg2Var.w(-2.24f, 5.0f, -5.0f, 5.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 8.5f);
                                                            rg2Var.i(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                                                            rg2Var.w(1.34f, 3.0f, 3.0f, 3.0f);
                                                            rg2Var.w(3.0f, -1.34f, 3.0f, -3.0f);
                                                            rg2Var.w(-1.34f, -3.0f, -3.0f, -3.0f);
                                                            rg2Var.f();
                                                            hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                                                            ij0Var = hj0Var.b();
                                                            fr1.c = ij0Var;
                                                        }
                                                        ij0 ij0Var2 = ij0Var;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str3 = "Hide on Record";
                                                                break;
                                                            case 1:
                                                                str3 = "Ocultar ao Gravar";
                                                                break;
                                                            case 2:
                                                                str3 = "Скрыть при записи";
                                                                break;
                                                            case 3:
                                                                str3 = "Сховати при записі";
                                                                break;
                                                            default:
                                                                str3 = "录屏时隐藏";
                                                                break;
                                                        }
                                                        String str9 = str3;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str4 = "Hide menu when screen recording is detected";
                                                                break;
                                                            case 1:
                                                                str4 = "Oculta o menu quando a gravação de tela é detectada";
                                                                break;
                                                            case 2:
                                                                str4 = "Скрывать меню при обнаружении записи экрана";
                                                                break;
                                                            case 3:
                                                                str4 = "Сховати меню при виявленні запису екрана";
                                                                break;
                                                            default:
                                                                str4 = "检测到屏幕录制时隐藏菜单";
                                                                break;
                                                        }
                                                        String str10 = str4;
                                                        boolean z8 = ((bw1) o22Var3.getValue()).a;
                                                        boolean h2 = urVar2.h(ew1Var3);
                                                        Object L = urVar2.L();
                                                        if (h2 || L == xl1Var) {
                                                            final int i24 = 0;
                                                            L = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i25 = i24;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i26 = 3;
                                                                    switch (i25) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue3 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue3, vtVar, i26), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar2.h0(L);
                                                        }
                                                        c01.j(ij0Var2, str9, str10, z8, (oe0) L, urVar2, 0);
                                                    } else {
                                                        urVar2.R();
                                                    }
                                                    return od2Var3;
                                                case 1:
                                                    ur urVar3 = (ur) obj9;
                                                    int intValue3 = ((Integer) obj10).intValue();
                                                    if ((intValue3 & 3) != 2) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (urVar3.O(intValue3 & 1, z6)) {
                                                        ij0 ij0Var3 = nq1.b;
                                                        if (ij0Var3 == null) {
                                                            hj0 hj0Var2 = new hj0("Rounded.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i25 = me2.a;
                                                            i12 i12Var2 = new i12(co.b);
                                                            rg2 rg2Var2 = new rg2(21);
                                                            rg2Var2.s(8.79f, 9.24f);
                                                            rg2Var2.D(5.5f);
                                                            rg2Var2.i(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
                                                            rg2Var2.w(2.5f, 1.12f, 2.5f, 2.5f);
                                                            rg2Var2.E(3.74f);
                                                            rg2Var2.i(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
                                                            rg2Var2.i(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
                                                            rg2Var2.w(-4.5f, 2.01f, -4.5f, 4.5f);
                                                            rg2Var2.h(6.79f, 7.06f, 7.58f, 8.43f, 8.79f, 9.24f);
                                                            rg2Var2.f();
                                                            rg2Var2.s(14.29f, 11.71f);
                                                            rg2Var2.i(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
                                                            rg2Var2.o(-0.61f);
                                                            rg2Var2.E(-6.0f);
                                                            rg2Var2.i(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                                                            rg2Var2.w(-1.5f, 0.67f, -1.5f, 1.5f);
                                                            rg2Var2.E(10.74f);
                                                            rg2Var2.r(-3.44f, -0.72f);
                                                            rg2Var2.i(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
                                                            rg2Var2.i(-0.43f, 0.44f, -0.43f, 1.14f, 0.0f, 1.58f);
                                                            rg2Var2.r(4.01f, 4.01f);
                                                            rg2Var2.h(9.71f, 21.79f, 10.22f, 22.0f, 10.75f, 22.0f);
                                                            rg2Var2.o(6.1f);
                                                            rg2Var2.i(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
                                                            rg2Var2.r(0.63f, -4.47f);
                                                            rg2Var2.i(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
                                                            rg2Var2.q(14.29f, 11.71f);
                                                            rg2Var2.f();
                                                            hj0.a(hj0Var2, (ArrayList) rg2Var2.f, i12Var2);
                                                            ij0Var3 = hj0Var2.b();
                                                            nq1.b = ij0Var3;
                                                        }
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str5 = "Fix Touch";
                                                                break;
                                                            case 1:
                                                                str5 = "Corrigir Toque";
                                                                break;
                                                            case 2:
                                                                str5 = "Исправить касание";
                                                                break;
                                                            case 3:
                                                                str5 = "Виправити дотик";
                                                                break;
                                                            default:
                                                                str5 = "修复触摸";
                                                                break;
                                                        }
                                                        String str11 = str5;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str6 = "Fix touch passing through menu overlay";
                                                                break;
                                                            case 1:
                                                                str6 = "Corrige o toque passando pelo overlay do menu";
                                                                break;
                                                            case 2:
                                                                str6 = "Исправить прохождение касания сквозь оверлей меню";
                                                                break;
                                                            case 3:
                                                                str6 = "Виправити проходження дотику крізь оверлей меню";
                                                                break;
                                                            default:
                                                                str6 = "修复触摸穿透菜单覆盖层";
                                                                break;
                                                        }
                                                        boolean z9 = ((bw1) o22Var3.getValue()).b;
                                                        boolean h3 = urVar3.h(ew1Var3);
                                                        Object L2 = urVar3.L();
                                                        if (h3 || L2 == xl1Var) {
                                                            L2 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i22;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i26 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i26), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar3.h0(L2);
                                                        }
                                                        c01.j(ij0Var3, str11, str6, z9, (oe0) L2, urVar3, 0);
                                                    } else {
                                                        urVar3.R();
                                                    }
                                                    return od2Var3;
                                                default:
                                                    ur urVar4 = (ur) obj9;
                                                    int intValue4 = ((Integer) obj10).intValue();
                                                    if ((intValue4 & 3) != 2) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (urVar4.O(1 & intValue4, z7)) {
                                                        ij0 ij0Var4 = io.e;
                                                        if (ij0Var4 == null) {
                                                            hj0 hj0Var3 = new hj0("Rounded.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i26 = me2.a;
                                                            i12 i12Var3 = new i12(co.b);
                                                            rg2 rg2Var3 = new rg2(21);
                                                            rg2Var3.s(11.99f, 2.0f);
                                                            rg2Var3.h(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                                                            rg2Var3.w(4.47f, 10.0f, 9.99f, 10.0f);
                                                            rg2Var3.h(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                                                            rg2Var3.v(17.52f, 2.0f, 11.99f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(18.92f, 8.0f);
                                                            rg2Var3.o(-2.95f);
                                                            rg2Var3.i(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
                                                            rg2Var3.i(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 4.04f);
                                                            rg2Var3.i(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
                                                            rg2Var3.o(-3.82f);
                                                            rg2Var3.i(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(4.26f, 14.0f);
                                                            rg2Var3.h(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
                                                            rg2Var3.w(0.1f, -1.36f, 0.26f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
                                                            rg2Var3.w(0.06f, 1.34f, 0.14f, 2.0f);
                                                            rg2Var3.q(4.26f, 14.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(5.08f, 16.0f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
                                                            rg2Var3.i(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(8.03f, 8.0f);
                                                            rg2Var3.q(5.08f, 8.0f);
                                                            rg2Var3.i(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
                                                            rg2Var3.h(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 19.96f);
                                                            rg2Var3.i(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
                                                            rg2Var3.o(3.82f);
                                                            rg2Var3.i(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.34f, 14.0f);
                                                            rg2Var3.q(9.66f, 14.0f);
                                                            rg2Var3.i(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
                                                            rg2Var3.w(0.07f, -1.35f, 0.16f, -2.0f);
                                                            rg2Var3.o(4.68f);
                                                            rg2Var3.i(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
                                                            rg2Var3.w(-0.07f, 1.34f, -0.16f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.59f, 19.56f);
                                                            rg2Var3.i(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(16.36f, 14.0f);
                                                            rg2Var3.i(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
                                                            rg2Var3.w(-0.06f, -1.34f, -0.14f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
                                                            rg2Var3.w(-0.1f, 1.36f, -0.26f, 2.0f);
                                                            rg2Var3.o(-3.38f);
                                                            rg2Var3.f();
                                                            hj0.a(hj0Var3, (ArrayList) rg2Var3.f, i12Var3);
                                                            ij0Var4 = hj0Var3.b();
                                                            io.e = ij0Var4;
                                                        }
                                                        ij0 ij0Var5 = ij0Var4;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str7 = "Interface Language";
                                                                break;
                                                            case 1:
                                                                str7 = "Idioma da Interface";
                                                                break;
                                                            case 2:
                                                                str7 = "Язык интерфейса";
                                                                break;
                                                            case 3:
                                                                str7 = "Мова інтерфейсу";
                                                                break;
                                                            default:
                                                                str7 = "界面语言";
                                                                break;
                                                        }
                                                        String str12 = str7;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str8 = "Select your preferred language for the binary interface";
                                                                break;
                                                            case 1:
                                                                str8 = "Selecione seu idioma preferido para a interface binária";
                                                                break;
                                                            case 2:
                                                                str8 = "Выберите язык интерфейса бинарника";
                                                                break;
                                                            case 3:
                                                                str8 = "Оберіть мову інтерфейсу бінарника";
                                                                break;
                                                            default:
                                                                str8 = "选择二进制界面的首选语言";
                                                                break;
                                                        }
                                                        String str13 = str8;
                                                        int i27 = ((bw1) o22Var3.getValue()).c;
                                                        boolean h4 = urVar4.h(ew1Var3);
                                                        Object L3 = urVar4.L();
                                                        if (h4 || L3 == xl1Var) {
                                                            final int i28 = 2;
                                                            L3 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i28;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar4.h0(L3);
                                                        }
                                                        c01.e(ij0Var5, str12, str13, i27, (oe0) L3, urVar4, 0);
                                                    } else {
                                                        urVar4.R();
                                                    }
                                                    return od2Var3;
                                            }
                                        }
                                    }, urVar), urVar, 54);
                                    c01.i(bg0.f, go.N(-602230574, new se0() { // from class: aw1
                                        @Override // defpackage.se0
                                        public final Object invoke(Object obj9, Object obj10) {
                                            boolean z5;
                                            String str3;
                                            String str4;
                                            boolean z6;
                                            String str5;
                                            String str6;
                                            boolean z7;
                                            String str7;
                                            String str8;
                                            int i21 = i18;
                                            od2 od2Var3 = od2.a;
                                            xl1 xl1Var = or.a;
                                            o22 o22Var3 = o22Var2;
                                            final ew1 ew1Var3 = ew1Var2;
                                            h32 h32Var3 = h32Var2;
                                            final int i22 = 1;
                                            switch (i21) {
                                                case 0:
                                                    ur urVar2 = (ur) obj9;
                                                    int intValue2 = ((Integer) obj10).intValue();
                                                    if ((intValue2 & 3) != 2) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (urVar2.O(intValue2 & 1, z5)) {
                                                        ij0 ij0Var = fr1.c;
                                                        if (ij0Var == null) {
                                                            hj0 hj0Var = new hj0("Rounded.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i23 = me2.a;
                                                            i12 i12Var = new i12(co.b);
                                                            rg2 rg2Var = new rg2(21);
                                                            rg2Var.s(12.0f, 4.0f);
                                                            rg2Var.h(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
                                                            rg2Var.h(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
                                                            rg2Var.w(9.27f, -3.11f, 11.0f, -7.5f);
                                                            rg2Var.h(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 16.5f);
                                                            rg2Var.i(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                                                            rg2Var.w(2.24f, -5.0f, 5.0f, -5.0f);
                                                            rg2Var.w(5.0f, 2.24f, 5.0f, 5.0f);
                                                            rg2Var.w(-2.24f, 5.0f, -5.0f, 5.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 8.5f);
                                                            rg2Var.i(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                                                            rg2Var.w(1.34f, 3.0f, 3.0f, 3.0f);
                                                            rg2Var.w(3.0f, -1.34f, 3.0f, -3.0f);
                                                            rg2Var.w(-1.34f, -3.0f, -3.0f, -3.0f);
                                                            rg2Var.f();
                                                            hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                                                            ij0Var = hj0Var.b();
                                                            fr1.c = ij0Var;
                                                        }
                                                        ij0 ij0Var2 = ij0Var;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str3 = "Hide on Record";
                                                                break;
                                                            case 1:
                                                                str3 = "Ocultar ao Gravar";
                                                                break;
                                                            case 2:
                                                                str3 = "Скрыть при записи";
                                                                break;
                                                            case 3:
                                                                str3 = "Сховати при записі";
                                                                break;
                                                            default:
                                                                str3 = "录屏时隐藏";
                                                                break;
                                                        }
                                                        String str9 = str3;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str4 = "Hide menu when screen recording is detected";
                                                                break;
                                                            case 1:
                                                                str4 = "Oculta o menu quando a gravação de tela é detectada";
                                                                break;
                                                            case 2:
                                                                str4 = "Скрывать меню при обнаружении записи экрана";
                                                                break;
                                                            case 3:
                                                                str4 = "Сховати меню при виявленні запису екрана";
                                                                break;
                                                            default:
                                                                str4 = "检测到屏幕录制时隐藏菜单";
                                                                break;
                                                        }
                                                        String str10 = str4;
                                                        boolean z8 = ((bw1) o22Var3.getValue()).a;
                                                        boolean h2 = urVar2.h(ew1Var3);
                                                        Object L = urVar2.L();
                                                        if (h2 || L == xl1Var) {
                                                            final int i24 = 0;
                                                            L = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i24;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar2.h0(L);
                                                        }
                                                        c01.j(ij0Var2, str9, str10, z8, (oe0) L, urVar2, 0);
                                                    } else {
                                                        urVar2.R();
                                                    }
                                                    return od2Var3;
                                                case 1:
                                                    ur urVar3 = (ur) obj9;
                                                    int intValue3 = ((Integer) obj10).intValue();
                                                    if ((intValue3 & 3) != 2) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (urVar3.O(intValue3 & 1, z6)) {
                                                        ij0 ij0Var3 = nq1.b;
                                                        if (ij0Var3 == null) {
                                                            hj0 hj0Var2 = new hj0("Rounded.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i25 = me2.a;
                                                            i12 i12Var2 = new i12(co.b);
                                                            rg2 rg2Var2 = new rg2(21);
                                                            rg2Var2.s(8.79f, 9.24f);
                                                            rg2Var2.D(5.5f);
                                                            rg2Var2.i(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
                                                            rg2Var2.w(2.5f, 1.12f, 2.5f, 2.5f);
                                                            rg2Var2.E(3.74f);
                                                            rg2Var2.i(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
                                                            rg2Var2.i(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
                                                            rg2Var2.w(-4.5f, 2.01f, -4.5f, 4.5f);
                                                            rg2Var2.h(6.79f, 7.06f, 7.58f, 8.43f, 8.79f, 9.24f);
                                                            rg2Var2.f();
                                                            rg2Var2.s(14.29f, 11.71f);
                                                            rg2Var2.i(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
                                                            rg2Var2.o(-0.61f);
                                                            rg2Var2.E(-6.0f);
                                                            rg2Var2.i(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                                                            rg2Var2.w(-1.5f, 0.67f, -1.5f, 1.5f);
                                                            rg2Var2.E(10.74f);
                                                            rg2Var2.r(-3.44f, -0.72f);
                                                            rg2Var2.i(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
                                                            rg2Var2.i(-0.43f, 0.44f, -0.43f, 1.14f, 0.0f, 1.58f);
                                                            rg2Var2.r(4.01f, 4.01f);
                                                            rg2Var2.h(9.71f, 21.79f, 10.22f, 22.0f, 10.75f, 22.0f);
                                                            rg2Var2.o(6.1f);
                                                            rg2Var2.i(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
                                                            rg2Var2.r(0.63f, -4.47f);
                                                            rg2Var2.i(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
                                                            rg2Var2.q(14.29f, 11.71f);
                                                            rg2Var2.f();
                                                            hj0.a(hj0Var2, (ArrayList) rg2Var2.f, i12Var2);
                                                            ij0Var3 = hj0Var2.b();
                                                            nq1.b = ij0Var3;
                                                        }
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str5 = "Fix Touch";
                                                                break;
                                                            case 1:
                                                                str5 = "Corrigir Toque";
                                                                break;
                                                            case 2:
                                                                str5 = "Исправить касание";
                                                                break;
                                                            case 3:
                                                                str5 = "Виправити дотик";
                                                                break;
                                                            default:
                                                                str5 = "修复触摸";
                                                                break;
                                                        }
                                                        String str11 = str5;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str6 = "Fix touch passing through menu overlay";
                                                                break;
                                                            case 1:
                                                                str6 = "Corrige o toque passando pelo overlay do menu";
                                                                break;
                                                            case 2:
                                                                str6 = "Исправить прохождение касания сквозь оверлей меню";
                                                                break;
                                                            case 3:
                                                                str6 = "Виправити проходження дотику крізь оверлей меню";
                                                                break;
                                                            default:
                                                                str6 = "修复触摸穿透菜单覆盖层";
                                                                break;
                                                        }
                                                        boolean z9 = ((bw1) o22Var3.getValue()).b;
                                                        boolean h3 = urVar3.h(ew1Var3);
                                                        Object L2 = urVar3.L();
                                                        if (h3 || L2 == xl1Var) {
                                                            L2 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i22;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar3.h0(L2);
                                                        }
                                                        c01.j(ij0Var3, str11, str6, z9, (oe0) L2, urVar3, 0);
                                                    } else {
                                                        urVar3.R();
                                                    }
                                                    return od2Var3;
                                                default:
                                                    ur urVar4 = (ur) obj9;
                                                    int intValue4 = ((Integer) obj10).intValue();
                                                    if ((intValue4 & 3) != 2) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (urVar4.O(1 & intValue4, z7)) {
                                                        ij0 ij0Var4 = io.e;
                                                        if (ij0Var4 == null) {
                                                            hj0 hj0Var3 = new hj0("Rounded.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i26 = me2.a;
                                                            i12 i12Var3 = new i12(co.b);
                                                            rg2 rg2Var3 = new rg2(21);
                                                            rg2Var3.s(11.99f, 2.0f);
                                                            rg2Var3.h(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                                                            rg2Var3.w(4.47f, 10.0f, 9.99f, 10.0f);
                                                            rg2Var3.h(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                                                            rg2Var3.v(17.52f, 2.0f, 11.99f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(18.92f, 8.0f);
                                                            rg2Var3.o(-2.95f);
                                                            rg2Var3.i(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
                                                            rg2Var3.i(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 4.04f);
                                                            rg2Var3.i(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
                                                            rg2Var3.o(-3.82f);
                                                            rg2Var3.i(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(4.26f, 14.0f);
                                                            rg2Var3.h(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
                                                            rg2Var3.w(0.1f, -1.36f, 0.26f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
                                                            rg2Var3.w(0.06f, 1.34f, 0.14f, 2.0f);
                                                            rg2Var3.q(4.26f, 14.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(5.08f, 16.0f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
                                                            rg2Var3.i(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(8.03f, 8.0f);
                                                            rg2Var3.q(5.08f, 8.0f);
                                                            rg2Var3.i(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
                                                            rg2Var3.h(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 19.96f);
                                                            rg2Var3.i(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
                                                            rg2Var3.o(3.82f);
                                                            rg2Var3.i(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.34f, 14.0f);
                                                            rg2Var3.q(9.66f, 14.0f);
                                                            rg2Var3.i(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
                                                            rg2Var3.w(0.07f, -1.35f, 0.16f, -2.0f);
                                                            rg2Var3.o(4.68f);
                                                            rg2Var3.i(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
                                                            rg2Var3.w(-0.07f, 1.34f, -0.16f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.59f, 19.56f);
                                                            rg2Var3.i(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(16.36f, 14.0f);
                                                            rg2Var3.i(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
                                                            rg2Var3.w(-0.06f, -1.34f, -0.14f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
                                                            rg2Var3.w(-0.1f, 1.36f, -0.26f, 2.0f);
                                                            rg2Var3.o(-3.38f);
                                                            rg2Var3.f();
                                                            hj0.a(hj0Var3, (ArrayList) rg2Var3.f, i12Var3);
                                                            ij0Var4 = hj0Var3.b();
                                                            io.e = ij0Var4;
                                                        }
                                                        ij0 ij0Var5 = ij0Var4;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str7 = "Interface Language";
                                                                break;
                                                            case 1:
                                                                str7 = "Idioma da Interface";
                                                                break;
                                                            case 2:
                                                                str7 = "Язык интерфейса";
                                                                break;
                                                            case 3:
                                                                str7 = "Мова інтерфейсу";
                                                                break;
                                                            default:
                                                                str7 = "界面语言";
                                                                break;
                                                        }
                                                        String str12 = str7;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str8 = "Select your preferred language for the binary interface";
                                                                break;
                                                            case 1:
                                                                str8 = "Selecione seu idioma preferido para a interface binária";
                                                                break;
                                                            case 2:
                                                                str8 = "Выберите язык интерфейса бинарника";
                                                                break;
                                                            case 3:
                                                                str8 = "Оберіть мову інтерфейсу бінарника";
                                                                break;
                                                            default:
                                                                str8 = "选择二进制界面的首选语言";
                                                                break;
                                                        }
                                                        String str13 = str8;
                                                        int i27 = ((bw1) o22Var3.getValue()).c;
                                                        boolean h4 = urVar4.h(ew1Var3);
                                                        Object L3 = urVar4.L();
                                                        if (h4 || L3 == xl1Var) {
                                                            final int i28 = 2;
                                                            L3 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i28;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar4.h0(L3);
                                                        }
                                                        c01.e(ij0Var5, str12, str13, i27, (oe0) L3, urVar4, 0);
                                                    } else {
                                                        urVar4.R();
                                                    }
                                                    return od2Var3;
                                            }
                                        }
                                    }, urVar), urVar, 54);
                                    urVar.p(true);
                                } else {
                                    urVar.R();
                                }
                                return od2Var2;
                            default:
                                if (i20 != 16) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (urVar.O(intValue & 1, z4)) {
                                    yo a4 = wo.a(new pe(2.0f, true, new le(0)), g3.r, urVar, 6);
                                    int hashCode2 = Long.hashCode(urVar.T);
                                    sf1 l2 = urVar.l();
                                    e21 Q2 = fp.Q(urVar, b21Var);
                                    lr.b.getClass();
                                    hs hsVar2 = kr.b;
                                    urVar.a0();
                                    if (urVar.S) {
                                        urVar.k(hsVar2);
                                    } else {
                                        urVar.k0();
                                    }
                                    op1.q(urVar, kr.f, a4);
                                    op1.q(urVar, kr.e, l2);
                                    op1.l(urVar, Integer.valueOf(hashCode2), kr.g);
                                    op1.o(urVar, kr.h);
                                    op1.q(urVar, kr.d, Q2);
                                    switch (h32Var2.a) {
                                        case 0:
                                            str2 = "Localization";
                                            break;
                                        case 1:
                                            str2 = "Localização";
                                            break;
                                        case 2:
                                            str2 = "Локализация";
                                            break;
                                        case 3:
                                            str2 = "Локалізація";
                                            break;
                                        default:
                                            str2 = "本地化";
                                            break;
                                    }
                                    c01.l(str2, urVar, 0);
                                    final int i21 = 2;
                                    c01.i(bg0.g, go.N(1132513170, new se0() { // from class: aw1
                                        @Override // defpackage.se0
                                        public final Object invoke(Object obj9, Object obj10) {
                                            boolean z5;
                                            String str3;
                                            String str4;
                                            boolean z6;
                                            String str5;
                                            String str6;
                                            boolean z7;
                                            String str7;
                                            String str8;
                                            int i212 = i21;
                                            od2 od2Var3 = od2.a;
                                            xl1 xl1Var = or.a;
                                            o22 o22Var3 = o22Var2;
                                            final ew1 ew1Var3 = ew1Var2;
                                            h32 h32Var3 = h32Var2;
                                            final int i22 = 1;
                                            switch (i212) {
                                                case 0:
                                                    ur urVar2 = (ur) obj9;
                                                    int intValue2 = ((Integer) obj10).intValue();
                                                    if ((intValue2 & 3) != 2) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (urVar2.O(intValue2 & 1, z5)) {
                                                        ij0 ij0Var = fr1.c;
                                                        if (ij0Var == null) {
                                                            hj0 hj0Var = new hj0("Rounded.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i23 = me2.a;
                                                            i12 i12Var = new i12(co.b);
                                                            rg2 rg2Var = new rg2(21);
                                                            rg2Var.s(12.0f, 4.0f);
                                                            rg2Var.h(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
                                                            rg2Var.h(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
                                                            rg2Var.w(9.27f, -3.11f, 11.0f, -7.5f);
                                                            rg2Var.h(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 16.5f);
                                                            rg2Var.i(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                                                            rg2Var.w(2.24f, -5.0f, 5.0f, -5.0f);
                                                            rg2Var.w(5.0f, 2.24f, 5.0f, 5.0f);
                                                            rg2Var.w(-2.24f, 5.0f, -5.0f, 5.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 8.5f);
                                                            rg2Var.i(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                                                            rg2Var.w(1.34f, 3.0f, 3.0f, 3.0f);
                                                            rg2Var.w(3.0f, -1.34f, 3.0f, -3.0f);
                                                            rg2Var.w(-1.34f, -3.0f, -3.0f, -3.0f);
                                                            rg2Var.f();
                                                            hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                                                            ij0Var = hj0Var.b();
                                                            fr1.c = ij0Var;
                                                        }
                                                        ij0 ij0Var2 = ij0Var;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str3 = "Hide on Record";
                                                                break;
                                                            case 1:
                                                                str3 = "Ocultar ao Gravar";
                                                                break;
                                                            case 2:
                                                                str3 = "Скрыть при записи";
                                                                break;
                                                            case 3:
                                                                str3 = "Сховати при записі";
                                                                break;
                                                            default:
                                                                str3 = "录屏时隐藏";
                                                                break;
                                                        }
                                                        String str9 = str3;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str4 = "Hide menu when screen recording is detected";
                                                                break;
                                                            case 1:
                                                                str4 = "Oculta o menu quando a gravação de tela é detectada";
                                                                break;
                                                            case 2:
                                                                str4 = "Скрывать меню при обнаружении записи экрана";
                                                                break;
                                                            case 3:
                                                                str4 = "Сховати меню при виявленні запису екрана";
                                                                break;
                                                            default:
                                                                str4 = "检测到屏幕录制时隐藏菜单";
                                                                break;
                                                        }
                                                        String str10 = str4;
                                                        boolean z8 = ((bw1) o22Var3.getValue()).a;
                                                        boolean h2 = urVar2.h(ew1Var3);
                                                        Object L = urVar2.L();
                                                        if (h2 || L == xl1Var) {
                                                            final int i24 = 0;
                                                            L = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i24;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar2.h0(L);
                                                        }
                                                        c01.j(ij0Var2, str9, str10, z8, (oe0) L, urVar2, 0);
                                                    } else {
                                                        urVar2.R();
                                                    }
                                                    return od2Var3;
                                                case 1:
                                                    ur urVar3 = (ur) obj9;
                                                    int intValue3 = ((Integer) obj10).intValue();
                                                    if ((intValue3 & 3) != 2) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (urVar3.O(intValue3 & 1, z6)) {
                                                        ij0 ij0Var3 = nq1.b;
                                                        if (ij0Var3 == null) {
                                                            hj0 hj0Var2 = new hj0("Rounded.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i25 = me2.a;
                                                            i12 i12Var2 = new i12(co.b);
                                                            rg2 rg2Var2 = new rg2(21);
                                                            rg2Var2.s(8.79f, 9.24f);
                                                            rg2Var2.D(5.5f);
                                                            rg2Var2.i(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
                                                            rg2Var2.w(2.5f, 1.12f, 2.5f, 2.5f);
                                                            rg2Var2.E(3.74f);
                                                            rg2Var2.i(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
                                                            rg2Var2.i(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
                                                            rg2Var2.w(-4.5f, 2.01f, -4.5f, 4.5f);
                                                            rg2Var2.h(6.79f, 7.06f, 7.58f, 8.43f, 8.79f, 9.24f);
                                                            rg2Var2.f();
                                                            rg2Var2.s(14.29f, 11.71f);
                                                            rg2Var2.i(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
                                                            rg2Var2.o(-0.61f);
                                                            rg2Var2.E(-6.0f);
                                                            rg2Var2.i(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                                                            rg2Var2.w(-1.5f, 0.67f, -1.5f, 1.5f);
                                                            rg2Var2.E(10.74f);
                                                            rg2Var2.r(-3.44f, -0.72f);
                                                            rg2Var2.i(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
                                                            rg2Var2.i(-0.43f, 0.44f, -0.43f, 1.14f, 0.0f, 1.58f);
                                                            rg2Var2.r(4.01f, 4.01f);
                                                            rg2Var2.h(9.71f, 21.79f, 10.22f, 22.0f, 10.75f, 22.0f);
                                                            rg2Var2.o(6.1f);
                                                            rg2Var2.i(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
                                                            rg2Var2.r(0.63f, -4.47f);
                                                            rg2Var2.i(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
                                                            rg2Var2.q(14.29f, 11.71f);
                                                            rg2Var2.f();
                                                            hj0.a(hj0Var2, (ArrayList) rg2Var2.f, i12Var2);
                                                            ij0Var3 = hj0Var2.b();
                                                            nq1.b = ij0Var3;
                                                        }
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str5 = "Fix Touch";
                                                                break;
                                                            case 1:
                                                                str5 = "Corrigir Toque";
                                                                break;
                                                            case 2:
                                                                str5 = "Исправить касание";
                                                                break;
                                                            case 3:
                                                                str5 = "Виправити дотик";
                                                                break;
                                                            default:
                                                                str5 = "修复触摸";
                                                                break;
                                                        }
                                                        String str11 = str5;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str6 = "Fix touch passing through menu overlay";
                                                                break;
                                                            case 1:
                                                                str6 = "Corrige o toque passando pelo overlay do menu";
                                                                break;
                                                            case 2:
                                                                str6 = "Исправить прохождение касания сквозь оверлей меню";
                                                                break;
                                                            case 3:
                                                                str6 = "Виправити проходження дотику крізь оверлей меню";
                                                                break;
                                                            default:
                                                                str6 = "修复触摸穿透菜单覆盖层";
                                                                break;
                                                        }
                                                        boolean z9 = ((bw1) o22Var3.getValue()).b;
                                                        boolean h3 = urVar3.h(ew1Var3);
                                                        Object L2 = urVar3.L();
                                                        if (h3 || L2 == xl1Var) {
                                                            L2 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i22;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar3.h0(L2);
                                                        }
                                                        c01.j(ij0Var3, str11, str6, z9, (oe0) L2, urVar3, 0);
                                                    } else {
                                                        urVar3.R();
                                                    }
                                                    return od2Var3;
                                                default:
                                                    ur urVar4 = (ur) obj9;
                                                    int intValue4 = ((Integer) obj10).intValue();
                                                    if ((intValue4 & 3) != 2) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (urVar4.O(1 & intValue4, z7)) {
                                                        ij0 ij0Var4 = io.e;
                                                        if (ij0Var4 == null) {
                                                            hj0 hj0Var3 = new hj0("Rounded.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i26 = me2.a;
                                                            i12 i12Var3 = new i12(co.b);
                                                            rg2 rg2Var3 = new rg2(21);
                                                            rg2Var3.s(11.99f, 2.0f);
                                                            rg2Var3.h(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                                                            rg2Var3.w(4.47f, 10.0f, 9.99f, 10.0f);
                                                            rg2Var3.h(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                                                            rg2Var3.v(17.52f, 2.0f, 11.99f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(18.92f, 8.0f);
                                                            rg2Var3.o(-2.95f);
                                                            rg2Var3.i(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
                                                            rg2Var3.i(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 4.04f);
                                                            rg2Var3.i(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
                                                            rg2Var3.o(-3.82f);
                                                            rg2Var3.i(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(4.26f, 14.0f);
                                                            rg2Var3.h(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
                                                            rg2Var3.w(0.1f, -1.36f, 0.26f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
                                                            rg2Var3.w(0.06f, 1.34f, 0.14f, 2.0f);
                                                            rg2Var3.q(4.26f, 14.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(5.08f, 16.0f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
                                                            rg2Var3.i(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(8.03f, 8.0f);
                                                            rg2Var3.q(5.08f, 8.0f);
                                                            rg2Var3.i(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
                                                            rg2Var3.h(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 19.96f);
                                                            rg2Var3.i(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
                                                            rg2Var3.o(3.82f);
                                                            rg2Var3.i(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.34f, 14.0f);
                                                            rg2Var3.q(9.66f, 14.0f);
                                                            rg2Var3.i(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
                                                            rg2Var3.w(0.07f, -1.35f, 0.16f, -2.0f);
                                                            rg2Var3.o(4.68f);
                                                            rg2Var3.i(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
                                                            rg2Var3.w(-0.07f, 1.34f, -0.16f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.59f, 19.56f);
                                                            rg2Var3.i(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(16.36f, 14.0f);
                                                            rg2Var3.i(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
                                                            rg2Var3.w(-0.06f, -1.34f, -0.14f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
                                                            rg2Var3.w(-0.1f, 1.36f, -0.26f, 2.0f);
                                                            rg2Var3.o(-3.38f);
                                                            rg2Var3.f();
                                                            hj0.a(hj0Var3, (ArrayList) rg2Var3.f, i12Var3);
                                                            ij0Var4 = hj0Var3.b();
                                                            io.e = ij0Var4;
                                                        }
                                                        ij0 ij0Var5 = ij0Var4;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str7 = "Interface Language";
                                                                break;
                                                            case 1:
                                                                str7 = "Idioma da Interface";
                                                                break;
                                                            case 2:
                                                                str7 = "Язык интерфейса";
                                                                break;
                                                            case 3:
                                                                str7 = "Мова інтерфейсу";
                                                                break;
                                                            default:
                                                                str7 = "界面语言";
                                                                break;
                                                        }
                                                        String str12 = str7;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str8 = "Select your preferred language for the binary interface";
                                                                break;
                                                            case 1:
                                                                str8 = "Selecione seu idioma preferido para a interface binária";
                                                                break;
                                                            case 2:
                                                                str8 = "Выберите язык интерфейса бинарника";
                                                                break;
                                                            case 3:
                                                                str8 = "Оберіть мову інтерфейсу бінарника";
                                                                break;
                                                            default:
                                                                str8 = "选择二进制界面的首选语言";
                                                                break;
                                                        }
                                                        String str13 = str8;
                                                        int i27 = ((bw1) o22Var3.getValue()).c;
                                                        boolean h4 = urVar4.h(ew1Var3);
                                                        Object L3 = urVar4.L();
                                                        if (h4 || L3 == xl1Var) {
                                                            final int i28 = 2;
                                                            L3 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i28;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar4.h0(L3);
                                                        }
                                                        c01.e(ij0Var5, str12, str13, i27, (oe0) L3, urVar4, 0);
                                                    } else {
                                                        urVar4.R();
                                                    }
                                                    return od2Var3;
                                            }
                                        }
                                    }, urVar), urVar, 54);
                                    urVar.p(true);
                                } else {
                                    urVar.R();
                                }
                                return od2Var2;
                        }
                    }
                }));
                it0.c0(it0Var, new fq(491073743, true, new te0() { // from class: zv1
                    @Override // defpackage.te0
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        boolean z3;
                        String str;
                        boolean z4;
                        String str2;
                        int i17 = i10;
                        od2 od2Var2 = od2.a;
                        b21 b21Var = b21.a;
                        final o22 o22Var2 = o22Var;
                        final ew1 ew1Var2 = ew1Var;
                        final h32 h32Var2 = h32Var;
                        final int i18 = 1;
                        final int i19 = 0;
                        ur urVar = (ur) obj7;
                        int intValue = ((Integer) obj8).intValue();
                        ((tr0) obj6).getClass();
                        int i20 = intValue & 17;
                        switch (i17) {
                            case 0:
                                if (i20 != 16) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (urVar.O(intValue & 1, z3)) {
                                    yo a3 = wo.a(new pe(2.0f, true, new le(0)), g3.r, urVar, 6);
                                    int hashCode = Long.hashCode(urVar.T);
                                    sf1 l = urVar.l();
                                    e21 Q = fp.Q(urVar, b21Var);
                                    lr.b.getClass();
                                    hs hsVar = kr.b;
                                    urVar.a0();
                                    if (urVar.S) {
                                        urVar.k(hsVar);
                                    } else {
                                        urVar.k0();
                                    }
                                    op1.q(urVar, kr.f, a3);
                                    op1.q(urVar, kr.e, l);
                                    op1.l(urVar, Integer.valueOf(hashCode), kr.g);
                                    op1.o(urVar, kr.h);
                                    op1.q(urVar, kr.d, Q);
                                    switch (h32Var2.a) {
                                        case 0:
                                            str = "Binary Execution";
                                            break;
                                        case 1:
                                            str = "Execução Binária";
                                            break;
                                        case 2:
                                            str = "Исполнение бинарника";
                                            break;
                                        case 3:
                                            str = "Виконання бінарника";
                                            break;
                                        default:
                                            str = "二进制执行";
                                            break;
                                    }
                                    c01.l(str, urVar, 0);
                                    c01.i(bg0.e, go.N(-533264343, new se0() { // from class: aw1
                                        @Override // defpackage.se0
                                        public final Object invoke(Object obj9, Object obj10) {
                                            boolean z5;
                                            String str3;
                                            String str4;
                                            boolean z6;
                                            String str5;
                                            String str6;
                                            boolean z7;
                                            String str7;
                                            String str8;
                                            int i212 = i19;
                                            od2 od2Var3 = od2.a;
                                            xl1 xl1Var = or.a;
                                            o22 o22Var3 = o22Var2;
                                            final ew1 ew1Var3 = ew1Var2;
                                            h32 h32Var3 = h32Var2;
                                            final int i22 = 1;
                                            switch (i212) {
                                                case 0:
                                                    ur urVar2 = (ur) obj9;
                                                    int intValue2 = ((Integer) obj10).intValue();
                                                    if ((intValue2 & 3) != 2) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (urVar2.O(intValue2 & 1, z5)) {
                                                        ij0 ij0Var = fr1.c;
                                                        if (ij0Var == null) {
                                                            hj0 hj0Var = new hj0("Rounded.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i23 = me2.a;
                                                            i12 i12Var = new i12(co.b);
                                                            rg2 rg2Var = new rg2(21);
                                                            rg2Var.s(12.0f, 4.0f);
                                                            rg2Var.h(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
                                                            rg2Var.h(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
                                                            rg2Var.w(9.27f, -3.11f, 11.0f, -7.5f);
                                                            rg2Var.h(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 16.5f);
                                                            rg2Var.i(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                                                            rg2Var.w(2.24f, -5.0f, 5.0f, -5.0f);
                                                            rg2Var.w(5.0f, 2.24f, 5.0f, 5.0f);
                                                            rg2Var.w(-2.24f, 5.0f, -5.0f, 5.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 8.5f);
                                                            rg2Var.i(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                                                            rg2Var.w(1.34f, 3.0f, 3.0f, 3.0f);
                                                            rg2Var.w(3.0f, -1.34f, 3.0f, -3.0f);
                                                            rg2Var.w(-1.34f, -3.0f, -3.0f, -3.0f);
                                                            rg2Var.f();
                                                            hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                                                            ij0Var = hj0Var.b();
                                                            fr1.c = ij0Var;
                                                        }
                                                        ij0 ij0Var2 = ij0Var;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str3 = "Hide on Record";
                                                                break;
                                                            case 1:
                                                                str3 = "Ocultar ao Gravar";
                                                                break;
                                                            case 2:
                                                                str3 = "Скрыть при записи";
                                                                break;
                                                            case 3:
                                                                str3 = "Сховати при записі";
                                                                break;
                                                            default:
                                                                str3 = "录屏时隐藏";
                                                                break;
                                                        }
                                                        String str9 = str3;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str4 = "Hide menu when screen recording is detected";
                                                                break;
                                                            case 1:
                                                                str4 = "Oculta o menu quando a gravação de tela é detectada";
                                                                break;
                                                            case 2:
                                                                str4 = "Скрывать меню при обнаружении записи экрана";
                                                                break;
                                                            case 3:
                                                                str4 = "Сховати меню при виявленні запису екрана";
                                                                break;
                                                            default:
                                                                str4 = "检测到屏幕录制时隐藏菜单";
                                                                break;
                                                        }
                                                        String str10 = str4;
                                                        boolean z8 = ((bw1) o22Var3.getValue()).a;
                                                        boolean h2 = urVar2.h(ew1Var3);
                                                        Object L = urVar2.L();
                                                        if (h2 || L == xl1Var) {
                                                            final int i24 = 0;
                                                            L = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i24;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar2.h0(L);
                                                        }
                                                        c01.j(ij0Var2, str9, str10, z8, (oe0) L, urVar2, 0);
                                                    } else {
                                                        urVar2.R();
                                                    }
                                                    return od2Var3;
                                                case 1:
                                                    ur urVar3 = (ur) obj9;
                                                    int intValue3 = ((Integer) obj10).intValue();
                                                    if ((intValue3 & 3) != 2) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (urVar3.O(intValue3 & 1, z6)) {
                                                        ij0 ij0Var3 = nq1.b;
                                                        if (ij0Var3 == null) {
                                                            hj0 hj0Var2 = new hj0("Rounded.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i25 = me2.a;
                                                            i12 i12Var2 = new i12(co.b);
                                                            rg2 rg2Var2 = new rg2(21);
                                                            rg2Var2.s(8.79f, 9.24f);
                                                            rg2Var2.D(5.5f);
                                                            rg2Var2.i(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
                                                            rg2Var2.w(2.5f, 1.12f, 2.5f, 2.5f);
                                                            rg2Var2.E(3.74f);
                                                            rg2Var2.i(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
                                                            rg2Var2.i(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
                                                            rg2Var2.w(-4.5f, 2.01f, -4.5f, 4.5f);
                                                            rg2Var2.h(6.79f, 7.06f, 7.58f, 8.43f, 8.79f, 9.24f);
                                                            rg2Var2.f();
                                                            rg2Var2.s(14.29f, 11.71f);
                                                            rg2Var2.i(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
                                                            rg2Var2.o(-0.61f);
                                                            rg2Var2.E(-6.0f);
                                                            rg2Var2.i(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                                                            rg2Var2.w(-1.5f, 0.67f, -1.5f, 1.5f);
                                                            rg2Var2.E(10.74f);
                                                            rg2Var2.r(-3.44f, -0.72f);
                                                            rg2Var2.i(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
                                                            rg2Var2.i(-0.43f, 0.44f, -0.43f, 1.14f, 0.0f, 1.58f);
                                                            rg2Var2.r(4.01f, 4.01f);
                                                            rg2Var2.h(9.71f, 21.79f, 10.22f, 22.0f, 10.75f, 22.0f);
                                                            rg2Var2.o(6.1f);
                                                            rg2Var2.i(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
                                                            rg2Var2.r(0.63f, -4.47f);
                                                            rg2Var2.i(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
                                                            rg2Var2.q(14.29f, 11.71f);
                                                            rg2Var2.f();
                                                            hj0.a(hj0Var2, (ArrayList) rg2Var2.f, i12Var2);
                                                            ij0Var3 = hj0Var2.b();
                                                            nq1.b = ij0Var3;
                                                        }
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str5 = "Fix Touch";
                                                                break;
                                                            case 1:
                                                                str5 = "Corrigir Toque";
                                                                break;
                                                            case 2:
                                                                str5 = "Исправить касание";
                                                                break;
                                                            case 3:
                                                                str5 = "Виправити дотик";
                                                                break;
                                                            default:
                                                                str5 = "修复触摸";
                                                                break;
                                                        }
                                                        String str11 = str5;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str6 = "Fix touch passing through menu overlay";
                                                                break;
                                                            case 1:
                                                                str6 = "Corrige o toque passando pelo overlay do menu";
                                                                break;
                                                            case 2:
                                                                str6 = "Исправить прохождение касания сквозь оверлей меню";
                                                                break;
                                                            case 3:
                                                                str6 = "Виправити проходження дотику крізь оверлей меню";
                                                                break;
                                                            default:
                                                                str6 = "修复触摸穿透菜单覆盖层";
                                                                break;
                                                        }
                                                        boolean z9 = ((bw1) o22Var3.getValue()).b;
                                                        boolean h3 = urVar3.h(ew1Var3);
                                                        Object L2 = urVar3.L();
                                                        if (h3 || L2 == xl1Var) {
                                                            L2 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i22;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar3.h0(L2);
                                                        }
                                                        c01.j(ij0Var3, str11, str6, z9, (oe0) L2, urVar3, 0);
                                                    } else {
                                                        urVar3.R();
                                                    }
                                                    return od2Var3;
                                                default:
                                                    ur urVar4 = (ur) obj9;
                                                    int intValue4 = ((Integer) obj10).intValue();
                                                    if ((intValue4 & 3) != 2) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (urVar4.O(1 & intValue4, z7)) {
                                                        ij0 ij0Var4 = io.e;
                                                        if (ij0Var4 == null) {
                                                            hj0 hj0Var3 = new hj0("Rounded.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i26 = me2.a;
                                                            i12 i12Var3 = new i12(co.b);
                                                            rg2 rg2Var3 = new rg2(21);
                                                            rg2Var3.s(11.99f, 2.0f);
                                                            rg2Var3.h(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                                                            rg2Var3.w(4.47f, 10.0f, 9.99f, 10.0f);
                                                            rg2Var3.h(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                                                            rg2Var3.v(17.52f, 2.0f, 11.99f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(18.92f, 8.0f);
                                                            rg2Var3.o(-2.95f);
                                                            rg2Var3.i(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
                                                            rg2Var3.i(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 4.04f);
                                                            rg2Var3.i(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
                                                            rg2Var3.o(-3.82f);
                                                            rg2Var3.i(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(4.26f, 14.0f);
                                                            rg2Var3.h(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
                                                            rg2Var3.w(0.1f, -1.36f, 0.26f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
                                                            rg2Var3.w(0.06f, 1.34f, 0.14f, 2.0f);
                                                            rg2Var3.q(4.26f, 14.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(5.08f, 16.0f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
                                                            rg2Var3.i(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(8.03f, 8.0f);
                                                            rg2Var3.q(5.08f, 8.0f);
                                                            rg2Var3.i(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
                                                            rg2Var3.h(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 19.96f);
                                                            rg2Var3.i(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
                                                            rg2Var3.o(3.82f);
                                                            rg2Var3.i(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.34f, 14.0f);
                                                            rg2Var3.q(9.66f, 14.0f);
                                                            rg2Var3.i(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
                                                            rg2Var3.w(0.07f, -1.35f, 0.16f, -2.0f);
                                                            rg2Var3.o(4.68f);
                                                            rg2Var3.i(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
                                                            rg2Var3.w(-0.07f, 1.34f, -0.16f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.59f, 19.56f);
                                                            rg2Var3.i(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(16.36f, 14.0f);
                                                            rg2Var3.i(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
                                                            rg2Var3.w(-0.06f, -1.34f, -0.14f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
                                                            rg2Var3.w(-0.1f, 1.36f, -0.26f, 2.0f);
                                                            rg2Var3.o(-3.38f);
                                                            rg2Var3.f();
                                                            hj0.a(hj0Var3, (ArrayList) rg2Var3.f, i12Var3);
                                                            ij0Var4 = hj0Var3.b();
                                                            io.e = ij0Var4;
                                                        }
                                                        ij0 ij0Var5 = ij0Var4;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str7 = "Interface Language";
                                                                break;
                                                            case 1:
                                                                str7 = "Idioma da Interface";
                                                                break;
                                                            case 2:
                                                                str7 = "Язык интерфейса";
                                                                break;
                                                            case 3:
                                                                str7 = "Мова інтерфейсу";
                                                                break;
                                                            default:
                                                                str7 = "界面语言";
                                                                break;
                                                        }
                                                        String str12 = str7;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str8 = "Select your preferred language for the binary interface";
                                                                break;
                                                            case 1:
                                                                str8 = "Selecione seu idioma preferido para a interface binária";
                                                                break;
                                                            case 2:
                                                                str8 = "Выберите язык интерфейса бинарника";
                                                                break;
                                                            case 3:
                                                                str8 = "Оберіть мову інтерфейсу бінарника";
                                                                break;
                                                            default:
                                                                str8 = "选择二进制界面的首选语言";
                                                                break;
                                                        }
                                                        String str13 = str8;
                                                        int i27 = ((bw1) o22Var3.getValue()).c;
                                                        boolean h4 = urVar4.h(ew1Var3);
                                                        Object L3 = urVar4.L();
                                                        if (h4 || L3 == xl1Var) {
                                                            final int i28 = 2;
                                                            L3 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i28;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar4.h0(L3);
                                                        }
                                                        c01.e(ij0Var5, str12, str13, i27, (oe0) L3, urVar4, 0);
                                                    } else {
                                                        urVar4.R();
                                                    }
                                                    return od2Var3;
                                            }
                                        }
                                    }, urVar), urVar, 54);
                                    c01.i(bg0.f, go.N(-602230574, new se0() { // from class: aw1
                                        @Override // defpackage.se0
                                        public final Object invoke(Object obj9, Object obj10) {
                                            boolean z5;
                                            String str3;
                                            String str4;
                                            boolean z6;
                                            String str5;
                                            String str6;
                                            boolean z7;
                                            String str7;
                                            String str8;
                                            int i212 = i18;
                                            od2 od2Var3 = od2.a;
                                            xl1 xl1Var = or.a;
                                            o22 o22Var3 = o22Var2;
                                            final ew1 ew1Var3 = ew1Var2;
                                            h32 h32Var3 = h32Var2;
                                            final int i22 = 1;
                                            switch (i212) {
                                                case 0:
                                                    ur urVar2 = (ur) obj9;
                                                    int intValue2 = ((Integer) obj10).intValue();
                                                    if ((intValue2 & 3) != 2) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (urVar2.O(intValue2 & 1, z5)) {
                                                        ij0 ij0Var = fr1.c;
                                                        if (ij0Var == null) {
                                                            hj0 hj0Var = new hj0("Rounded.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i23 = me2.a;
                                                            i12 i12Var = new i12(co.b);
                                                            rg2 rg2Var = new rg2(21);
                                                            rg2Var.s(12.0f, 4.0f);
                                                            rg2Var.h(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
                                                            rg2Var.h(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
                                                            rg2Var.w(9.27f, -3.11f, 11.0f, -7.5f);
                                                            rg2Var.h(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 16.5f);
                                                            rg2Var.i(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                                                            rg2Var.w(2.24f, -5.0f, 5.0f, -5.0f);
                                                            rg2Var.w(5.0f, 2.24f, 5.0f, 5.0f);
                                                            rg2Var.w(-2.24f, 5.0f, -5.0f, 5.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 8.5f);
                                                            rg2Var.i(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                                                            rg2Var.w(1.34f, 3.0f, 3.0f, 3.0f);
                                                            rg2Var.w(3.0f, -1.34f, 3.0f, -3.0f);
                                                            rg2Var.w(-1.34f, -3.0f, -3.0f, -3.0f);
                                                            rg2Var.f();
                                                            hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                                                            ij0Var = hj0Var.b();
                                                            fr1.c = ij0Var;
                                                        }
                                                        ij0 ij0Var2 = ij0Var;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str3 = "Hide on Record";
                                                                break;
                                                            case 1:
                                                                str3 = "Ocultar ao Gravar";
                                                                break;
                                                            case 2:
                                                                str3 = "Скрыть при записи";
                                                                break;
                                                            case 3:
                                                                str3 = "Сховати при записі";
                                                                break;
                                                            default:
                                                                str3 = "录屏时隐藏";
                                                                break;
                                                        }
                                                        String str9 = str3;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str4 = "Hide menu when screen recording is detected";
                                                                break;
                                                            case 1:
                                                                str4 = "Oculta o menu quando a gravação de tela é detectada";
                                                                break;
                                                            case 2:
                                                                str4 = "Скрывать меню при обнаружении записи экрана";
                                                                break;
                                                            case 3:
                                                                str4 = "Сховати меню при виявленні запису екрана";
                                                                break;
                                                            default:
                                                                str4 = "检测到屏幕录制时隐藏菜单";
                                                                break;
                                                        }
                                                        String str10 = str4;
                                                        boolean z8 = ((bw1) o22Var3.getValue()).a;
                                                        boolean h2 = urVar2.h(ew1Var3);
                                                        Object L = urVar2.L();
                                                        if (h2 || L == xl1Var) {
                                                            final int i24 = 0;
                                                            L = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i24;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar2.h0(L);
                                                        }
                                                        c01.j(ij0Var2, str9, str10, z8, (oe0) L, urVar2, 0);
                                                    } else {
                                                        urVar2.R();
                                                    }
                                                    return od2Var3;
                                                case 1:
                                                    ur urVar3 = (ur) obj9;
                                                    int intValue3 = ((Integer) obj10).intValue();
                                                    if ((intValue3 & 3) != 2) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (urVar3.O(intValue3 & 1, z6)) {
                                                        ij0 ij0Var3 = nq1.b;
                                                        if (ij0Var3 == null) {
                                                            hj0 hj0Var2 = new hj0("Rounded.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i25 = me2.a;
                                                            i12 i12Var2 = new i12(co.b);
                                                            rg2 rg2Var2 = new rg2(21);
                                                            rg2Var2.s(8.79f, 9.24f);
                                                            rg2Var2.D(5.5f);
                                                            rg2Var2.i(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
                                                            rg2Var2.w(2.5f, 1.12f, 2.5f, 2.5f);
                                                            rg2Var2.E(3.74f);
                                                            rg2Var2.i(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
                                                            rg2Var2.i(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
                                                            rg2Var2.w(-4.5f, 2.01f, -4.5f, 4.5f);
                                                            rg2Var2.h(6.79f, 7.06f, 7.58f, 8.43f, 8.79f, 9.24f);
                                                            rg2Var2.f();
                                                            rg2Var2.s(14.29f, 11.71f);
                                                            rg2Var2.i(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
                                                            rg2Var2.o(-0.61f);
                                                            rg2Var2.E(-6.0f);
                                                            rg2Var2.i(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                                                            rg2Var2.w(-1.5f, 0.67f, -1.5f, 1.5f);
                                                            rg2Var2.E(10.74f);
                                                            rg2Var2.r(-3.44f, -0.72f);
                                                            rg2Var2.i(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
                                                            rg2Var2.i(-0.43f, 0.44f, -0.43f, 1.14f, 0.0f, 1.58f);
                                                            rg2Var2.r(4.01f, 4.01f);
                                                            rg2Var2.h(9.71f, 21.79f, 10.22f, 22.0f, 10.75f, 22.0f);
                                                            rg2Var2.o(6.1f);
                                                            rg2Var2.i(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
                                                            rg2Var2.r(0.63f, -4.47f);
                                                            rg2Var2.i(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
                                                            rg2Var2.q(14.29f, 11.71f);
                                                            rg2Var2.f();
                                                            hj0.a(hj0Var2, (ArrayList) rg2Var2.f, i12Var2);
                                                            ij0Var3 = hj0Var2.b();
                                                            nq1.b = ij0Var3;
                                                        }
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str5 = "Fix Touch";
                                                                break;
                                                            case 1:
                                                                str5 = "Corrigir Toque";
                                                                break;
                                                            case 2:
                                                                str5 = "Исправить касание";
                                                                break;
                                                            case 3:
                                                                str5 = "Виправити дотик";
                                                                break;
                                                            default:
                                                                str5 = "修复触摸";
                                                                break;
                                                        }
                                                        String str11 = str5;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str6 = "Fix touch passing through menu overlay";
                                                                break;
                                                            case 1:
                                                                str6 = "Corrige o toque passando pelo overlay do menu";
                                                                break;
                                                            case 2:
                                                                str6 = "Исправить прохождение касания сквозь оверлей меню";
                                                                break;
                                                            case 3:
                                                                str6 = "Виправити проходження дотику крізь оверлей меню";
                                                                break;
                                                            default:
                                                                str6 = "修复触摸穿透菜单覆盖层";
                                                                break;
                                                        }
                                                        boolean z9 = ((bw1) o22Var3.getValue()).b;
                                                        boolean h3 = urVar3.h(ew1Var3);
                                                        Object L2 = urVar3.L();
                                                        if (h3 || L2 == xl1Var) {
                                                            L2 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i22;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar3.h0(L2);
                                                        }
                                                        c01.j(ij0Var3, str11, str6, z9, (oe0) L2, urVar3, 0);
                                                    } else {
                                                        urVar3.R();
                                                    }
                                                    return od2Var3;
                                                default:
                                                    ur urVar4 = (ur) obj9;
                                                    int intValue4 = ((Integer) obj10).intValue();
                                                    if ((intValue4 & 3) != 2) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (urVar4.O(1 & intValue4, z7)) {
                                                        ij0 ij0Var4 = io.e;
                                                        if (ij0Var4 == null) {
                                                            hj0 hj0Var3 = new hj0("Rounded.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i26 = me2.a;
                                                            i12 i12Var3 = new i12(co.b);
                                                            rg2 rg2Var3 = new rg2(21);
                                                            rg2Var3.s(11.99f, 2.0f);
                                                            rg2Var3.h(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                                                            rg2Var3.w(4.47f, 10.0f, 9.99f, 10.0f);
                                                            rg2Var3.h(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                                                            rg2Var3.v(17.52f, 2.0f, 11.99f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(18.92f, 8.0f);
                                                            rg2Var3.o(-2.95f);
                                                            rg2Var3.i(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
                                                            rg2Var3.i(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 4.04f);
                                                            rg2Var3.i(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
                                                            rg2Var3.o(-3.82f);
                                                            rg2Var3.i(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(4.26f, 14.0f);
                                                            rg2Var3.h(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
                                                            rg2Var3.w(0.1f, -1.36f, 0.26f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
                                                            rg2Var3.w(0.06f, 1.34f, 0.14f, 2.0f);
                                                            rg2Var3.q(4.26f, 14.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(5.08f, 16.0f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
                                                            rg2Var3.i(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(8.03f, 8.0f);
                                                            rg2Var3.q(5.08f, 8.0f);
                                                            rg2Var3.i(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
                                                            rg2Var3.h(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 19.96f);
                                                            rg2Var3.i(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
                                                            rg2Var3.o(3.82f);
                                                            rg2Var3.i(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.34f, 14.0f);
                                                            rg2Var3.q(9.66f, 14.0f);
                                                            rg2Var3.i(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
                                                            rg2Var3.w(0.07f, -1.35f, 0.16f, -2.0f);
                                                            rg2Var3.o(4.68f);
                                                            rg2Var3.i(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
                                                            rg2Var3.w(-0.07f, 1.34f, -0.16f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.59f, 19.56f);
                                                            rg2Var3.i(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(16.36f, 14.0f);
                                                            rg2Var3.i(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
                                                            rg2Var3.w(-0.06f, -1.34f, -0.14f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
                                                            rg2Var3.w(-0.1f, 1.36f, -0.26f, 2.0f);
                                                            rg2Var3.o(-3.38f);
                                                            rg2Var3.f();
                                                            hj0.a(hj0Var3, (ArrayList) rg2Var3.f, i12Var3);
                                                            ij0Var4 = hj0Var3.b();
                                                            io.e = ij0Var4;
                                                        }
                                                        ij0 ij0Var5 = ij0Var4;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str7 = "Interface Language";
                                                                break;
                                                            case 1:
                                                                str7 = "Idioma da Interface";
                                                                break;
                                                            case 2:
                                                                str7 = "Язык интерфейса";
                                                                break;
                                                            case 3:
                                                                str7 = "Мова інтерфейсу";
                                                                break;
                                                            default:
                                                                str7 = "界面语言";
                                                                break;
                                                        }
                                                        String str12 = str7;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str8 = "Select your preferred language for the binary interface";
                                                                break;
                                                            case 1:
                                                                str8 = "Selecione seu idioma preferido para a interface binária";
                                                                break;
                                                            case 2:
                                                                str8 = "Выберите язык интерфейса бинарника";
                                                                break;
                                                            case 3:
                                                                str8 = "Оберіть мову інтерфейсу бінарника";
                                                                break;
                                                            default:
                                                                str8 = "选择二进制界面的首选语言";
                                                                break;
                                                        }
                                                        String str13 = str8;
                                                        int i27 = ((bw1) o22Var3.getValue()).c;
                                                        boolean h4 = urVar4.h(ew1Var3);
                                                        Object L3 = urVar4.L();
                                                        if (h4 || L3 == xl1Var) {
                                                            final int i28 = 2;
                                                            L3 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i28;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar4.h0(L3);
                                                        }
                                                        c01.e(ij0Var5, str12, str13, i27, (oe0) L3, urVar4, 0);
                                                    } else {
                                                        urVar4.R();
                                                    }
                                                    return od2Var3;
                                            }
                                        }
                                    }, urVar), urVar, 54);
                                    urVar.p(true);
                                } else {
                                    urVar.R();
                                }
                                return od2Var2;
                            default:
                                if (i20 != 16) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (urVar.O(intValue & 1, z4)) {
                                    yo a4 = wo.a(new pe(2.0f, true, new le(0)), g3.r, urVar, 6);
                                    int hashCode2 = Long.hashCode(urVar.T);
                                    sf1 l2 = urVar.l();
                                    e21 Q2 = fp.Q(urVar, b21Var);
                                    lr.b.getClass();
                                    hs hsVar2 = kr.b;
                                    urVar.a0();
                                    if (urVar.S) {
                                        urVar.k(hsVar2);
                                    } else {
                                        urVar.k0();
                                    }
                                    op1.q(urVar, kr.f, a4);
                                    op1.q(urVar, kr.e, l2);
                                    op1.l(urVar, Integer.valueOf(hashCode2), kr.g);
                                    op1.o(urVar, kr.h);
                                    op1.q(urVar, kr.d, Q2);
                                    switch (h32Var2.a) {
                                        case 0:
                                            str2 = "Localization";
                                            break;
                                        case 1:
                                            str2 = "Localização";
                                            break;
                                        case 2:
                                            str2 = "Локализация";
                                            break;
                                        case 3:
                                            str2 = "Локалізація";
                                            break;
                                        default:
                                            str2 = "本地化";
                                            break;
                                    }
                                    c01.l(str2, urVar, 0);
                                    final int i21 = 2;
                                    c01.i(bg0.g, go.N(1132513170, new se0() { // from class: aw1
                                        @Override // defpackage.se0
                                        public final Object invoke(Object obj9, Object obj10) {
                                            boolean z5;
                                            String str3;
                                            String str4;
                                            boolean z6;
                                            String str5;
                                            String str6;
                                            boolean z7;
                                            String str7;
                                            String str8;
                                            int i212 = i21;
                                            od2 od2Var3 = od2.a;
                                            xl1 xl1Var = or.a;
                                            o22 o22Var3 = o22Var2;
                                            final ew1 ew1Var3 = ew1Var2;
                                            h32 h32Var3 = h32Var2;
                                            final int i22 = 1;
                                            switch (i212) {
                                                case 0:
                                                    ur urVar2 = (ur) obj9;
                                                    int intValue2 = ((Integer) obj10).intValue();
                                                    if ((intValue2 & 3) != 2) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (urVar2.O(intValue2 & 1, z5)) {
                                                        ij0 ij0Var = fr1.c;
                                                        if (ij0Var == null) {
                                                            hj0 hj0Var = new hj0("Rounded.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i23 = me2.a;
                                                            i12 i12Var = new i12(co.b);
                                                            rg2 rg2Var = new rg2(21);
                                                            rg2Var.s(12.0f, 4.0f);
                                                            rg2Var.h(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
                                                            rg2Var.h(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
                                                            rg2Var.w(9.27f, -3.11f, 11.0f, -7.5f);
                                                            rg2Var.h(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 16.5f);
                                                            rg2Var.i(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                                                            rg2Var.w(2.24f, -5.0f, 5.0f, -5.0f);
                                                            rg2Var.w(5.0f, 2.24f, 5.0f, 5.0f);
                                                            rg2Var.w(-2.24f, 5.0f, -5.0f, 5.0f);
                                                            rg2Var.f();
                                                            rg2Var.s(12.0f, 8.5f);
                                                            rg2Var.i(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                                                            rg2Var.w(1.34f, 3.0f, 3.0f, 3.0f);
                                                            rg2Var.w(3.0f, -1.34f, 3.0f, -3.0f);
                                                            rg2Var.w(-1.34f, -3.0f, -3.0f, -3.0f);
                                                            rg2Var.f();
                                                            hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                                                            ij0Var = hj0Var.b();
                                                            fr1.c = ij0Var;
                                                        }
                                                        ij0 ij0Var2 = ij0Var;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str3 = "Hide on Record";
                                                                break;
                                                            case 1:
                                                                str3 = "Ocultar ao Gravar";
                                                                break;
                                                            case 2:
                                                                str3 = "Скрыть при записи";
                                                                break;
                                                            case 3:
                                                                str3 = "Сховати при записі";
                                                                break;
                                                            default:
                                                                str3 = "录屏时隐藏";
                                                                break;
                                                        }
                                                        String str9 = str3;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str4 = "Hide menu when screen recording is detected";
                                                                break;
                                                            case 1:
                                                                str4 = "Oculta o menu quando a gravação de tela é detectada";
                                                                break;
                                                            case 2:
                                                                str4 = "Скрывать меню при обнаружении записи экрана";
                                                                break;
                                                            case 3:
                                                                str4 = "Сховати меню при виявленні запису екрана";
                                                                break;
                                                            default:
                                                                str4 = "检测到屏幕录制时隐藏菜单";
                                                                break;
                                                        }
                                                        String str10 = str4;
                                                        boolean z8 = ((bw1) o22Var3.getValue()).a;
                                                        boolean h2 = urVar2.h(ew1Var3);
                                                        Object L = urVar2.L();
                                                        if (h2 || L == xl1Var) {
                                                            final int i24 = 0;
                                                            L = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i24;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar2.h0(L);
                                                        }
                                                        c01.j(ij0Var2, str9, str10, z8, (oe0) L, urVar2, 0);
                                                    } else {
                                                        urVar2.R();
                                                    }
                                                    return od2Var3;
                                                case 1:
                                                    ur urVar3 = (ur) obj9;
                                                    int intValue3 = ((Integer) obj10).intValue();
                                                    if ((intValue3 & 3) != 2) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (urVar3.O(intValue3 & 1, z6)) {
                                                        ij0 ij0Var3 = nq1.b;
                                                        if (ij0Var3 == null) {
                                                            hj0 hj0Var2 = new hj0("Rounded.TouchApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i25 = me2.a;
                                                            i12 i12Var2 = new i12(co.b);
                                                            rg2 rg2Var2 = new rg2(21);
                                                            rg2Var2.s(8.79f, 9.24f);
                                                            rg2Var2.D(5.5f);
                                                            rg2Var2.i(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
                                                            rg2Var2.w(2.5f, 1.12f, 2.5f, 2.5f);
                                                            rg2Var2.E(3.74f);
                                                            rg2Var2.i(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
                                                            rg2Var2.i(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
                                                            rg2Var2.w(-4.5f, 2.01f, -4.5f, 4.5f);
                                                            rg2Var2.h(6.79f, 7.06f, 7.58f, 8.43f, 8.79f, 9.24f);
                                                            rg2Var2.f();
                                                            rg2Var2.s(14.29f, 11.71f);
                                                            rg2Var2.i(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
                                                            rg2Var2.o(-0.61f);
                                                            rg2Var2.E(-6.0f);
                                                            rg2Var2.i(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                                                            rg2Var2.w(-1.5f, 0.67f, -1.5f, 1.5f);
                                                            rg2Var2.E(10.74f);
                                                            rg2Var2.r(-3.44f, -0.72f);
                                                            rg2Var2.i(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
                                                            rg2Var2.i(-0.43f, 0.44f, -0.43f, 1.14f, 0.0f, 1.58f);
                                                            rg2Var2.r(4.01f, 4.01f);
                                                            rg2Var2.h(9.71f, 21.79f, 10.22f, 22.0f, 10.75f, 22.0f);
                                                            rg2Var2.o(6.1f);
                                                            rg2Var2.i(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
                                                            rg2Var2.r(0.63f, -4.47f);
                                                            rg2Var2.i(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
                                                            rg2Var2.q(14.29f, 11.71f);
                                                            rg2Var2.f();
                                                            hj0.a(hj0Var2, (ArrayList) rg2Var2.f, i12Var2);
                                                            ij0Var3 = hj0Var2.b();
                                                            nq1.b = ij0Var3;
                                                        }
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str5 = "Fix Touch";
                                                                break;
                                                            case 1:
                                                                str5 = "Corrigir Toque";
                                                                break;
                                                            case 2:
                                                                str5 = "Исправить касание";
                                                                break;
                                                            case 3:
                                                                str5 = "Виправити дотик";
                                                                break;
                                                            default:
                                                                str5 = "修复触摸";
                                                                break;
                                                        }
                                                        String str11 = str5;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str6 = "Fix touch passing through menu overlay";
                                                                break;
                                                            case 1:
                                                                str6 = "Corrige o toque passando pelo overlay do menu";
                                                                break;
                                                            case 2:
                                                                str6 = "Исправить прохождение касания сквозь оверлей меню";
                                                                break;
                                                            case 3:
                                                                str6 = "Виправити проходження дотику крізь оверлей меню";
                                                                break;
                                                            default:
                                                                str6 = "修复触摸穿透菜单覆盖层";
                                                                break;
                                                        }
                                                        boolean z9 = ((bw1) o22Var3.getValue()).b;
                                                        boolean h3 = urVar3.h(ew1Var3);
                                                        Object L2 = urVar3.L();
                                                        if (h3 || L2 == xl1Var) {
                                                            L2 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i22;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar3.h0(L2);
                                                        }
                                                        c01.j(ij0Var3, str11, str6, z9, (oe0) L2, urVar3, 0);
                                                    } else {
                                                        urVar3.R();
                                                    }
                                                    return od2Var3;
                                                default:
                                                    ur urVar4 = (ur) obj9;
                                                    int intValue4 = ((Integer) obj10).intValue();
                                                    if ((intValue4 & 3) != 2) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    if (urVar4.O(1 & intValue4, z7)) {
                                                        ij0 ij0Var4 = io.e;
                                                        if (ij0Var4 == null) {
                                                            hj0 hj0Var3 = new hj0("Rounded.Language", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                            int i26 = me2.a;
                                                            i12 i12Var3 = new i12(co.b);
                                                            rg2 rg2Var3 = new rg2(21);
                                                            rg2Var3.s(11.99f, 2.0f);
                                                            rg2Var3.h(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                                                            rg2Var3.w(4.47f, 10.0f, 9.99f, 10.0f);
                                                            rg2Var3.h(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                                                            rg2Var3.v(17.52f, 2.0f, 11.99f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(18.92f, 8.0f);
                                                            rg2Var3.o(-2.95f);
                                                            rg2Var3.i(-0.32f, -1.25f, -0.78f, -2.45f, -1.38f, -3.56f);
                                                            rg2Var3.i(1.84f, 0.63f, 3.37f, 1.91f, 4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 4.04f);
                                                            rg2Var3.i(0.83f, 1.2f, 1.48f, 2.53f, 1.91f, 3.96f);
                                                            rg2Var3.o(-3.82f);
                                                            rg2Var3.i(0.43f, -1.43f, 1.08f, -2.76f, 1.91f, -3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(4.26f, 14.0f);
                                                            rg2Var3.h(4.1f, 13.36f, 4.0f, 12.69f, 4.0f, 12.0f);
                                                            rg2Var3.w(0.1f, -1.36f, 0.26f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(-0.08f, 0.66f, -0.14f, 1.32f, -0.14f, 2.0f);
                                                            rg2Var3.w(0.06f, 1.34f, 0.14f, 2.0f);
                                                            rg2Var3.q(4.26f, 14.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(5.08f, 16.0f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(0.32f, 1.25f, 0.78f, 2.45f, 1.38f, 3.56f);
                                                            rg2Var3.i(-1.84f, -0.63f, -3.37f, -1.9f, -4.33f, -3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(8.03f, 8.0f);
                                                            rg2Var3.q(5.08f, 8.0f);
                                                            rg2Var3.i(0.96f, -1.66f, 2.49f, -2.93f, 4.33f, -3.56f);
                                                            rg2Var3.h(8.81f, 5.55f, 8.35f, 6.75f, 8.03f, 8.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(12.0f, 19.96f);
                                                            rg2Var3.i(-0.83f, -1.2f, -1.48f, -2.53f, -1.91f, -3.96f);
                                                            rg2Var3.o(3.82f);
                                                            rg2Var3.i(-0.43f, 1.43f, -1.08f, 2.76f, -1.91f, 3.96f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.34f, 14.0f);
                                                            rg2Var3.q(9.66f, 14.0f);
                                                            rg2Var3.i(-0.09f, -0.66f, -0.16f, -1.32f, -0.16f, -2.0f);
                                                            rg2Var3.w(0.07f, -1.35f, 0.16f, -2.0f);
                                                            rg2Var3.o(4.68f);
                                                            rg2Var3.i(0.09f, 0.65f, 0.16f, 1.32f, 0.16f, 2.0f);
                                                            rg2Var3.w(-0.07f, 1.34f, -0.16f, 2.0f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(14.59f, 19.56f);
                                                            rg2Var3.i(0.6f, -1.11f, 1.06f, -2.31f, 1.38f, -3.56f);
                                                            rg2Var3.o(2.95f);
                                                            rg2Var3.i(-0.96f, 1.65f, -2.49f, 2.93f, -4.33f, 3.56f);
                                                            rg2Var3.f();
                                                            rg2Var3.s(16.36f, 14.0f);
                                                            rg2Var3.i(0.08f, -0.66f, 0.14f, -1.32f, 0.14f, -2.0f);
                                                            rg2Var3.w(-0.06f, -1.34f, -0.14f, -2.0f);
                                                            rg2Var3.o(3.38f);
                                                            rg2Var3.i(0.16f, 0.64f, 0.26f, 1.31f, 0.26f, 2.0f);
                                                            rg2Var3.w(-0.1f, 1.36f, -0.26f, 2.0f);
                                                            rg2Var3.o(-3.38f);
                                                            rg2Var3.f();
                                                            hj0.a(hj0Var3, (ArrayList) rg2Var3.f, i12Var3);
                                                            ij0Var4 = hj0Var3.b();
                                                            io.e = ij0Var4;
                                                        }
                                                        ij0 ij0Var5 = ij0Var4;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str7 = "Interface Language";
                                                                break;
                                                            case 1:
                                                                str7 = "Idioma da Interface";
                                                                break;
                                                            case 2:
                                                                str7 = "Язык интерфейса";
                                                                break;
                                                            case 3:
                                                                str7 = "Мова інтерфейсу";
                                                                break;
                                                            default:
                                                                str7 = "界面语言";
                                                                break;
                                                        }
                                                        String str12 = str7;
                                                        switch (h32Var3.a) {
                                                            case 0:
                                                                str8 = "Select your preferred language for the binary interface";
                                                                break;
                                                            case 1:
                                                                str8 = "Selecione seu idioma preferido para a interface binária";
                                                                break;
                                                            case 2:
                                                                str8 = "Выберите язык интерфейса бинарника";
                                                                break;
                                                            case 3:
                                                                str8 = "Оберіть мову інтерфейсу бінарника";
                                                                break;
                                                            default:
                                                                str8 = "选择二进制界面的首选语言";
                                                                break;
                                                        }
                                                        String str13 = str8;
                                                        int i27 = ((bw1) o22Var3.getValue()).c;
                                                        boolean h4 = urVar4.h(ew1Var3);
                                                        Object L3 = urVar4.L();
                                                        if (h4 || L3 == xl1Var) {
                                                            final int i28 = 2;
                                                            L3 = new oe0() { // from class: tv1
                                                                @Override // defpackage.oe0
                                                                public final Object invoke(Object obj11) {
                                                                    int i252 = i28;
                                                                    od2 od2Var4 = od2.a;
                                                                    vt vtVar = null;
                                                                    ew1 ew1Var4 = ew1Var3;
                                                                    int i262 = 3;
                                                                    switch (i252) {
                                                                        case 0:
                                                                            boolean booleanValue = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue, vtVar, 1), 3);
                                                                            return od2Var4;
                                                                        case 1:
                                                                            boolean booleanValue2 = ((Boolean) obj11).booleanValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new cw1(ew1Var4, booleanValue2, vtVar, 0), 3);
                                                                            return od2Var4;
                                                                        default:
                                                                            int intValue32 = ((Integer) obj11).intValue();
                                                                            ew1Var4.getClass();
                                                                            rx.C(rx.x(ew1Var4), null, new hh(ew1Var4, intValue32, vtVar, i262), 3);
                                                                            return od2Var4;
                                                                    }
                                                                }
                                                            };
                                                            urVar4.h0(L3);
                                                        }
                                                        c01.e(ij0Var5, str12, str13, i27, (oe0) L3, urVar4, 0);
                                                    } else {
                                                        urVar4.R();
                                                    }
                                                    return od2Var3;
                                            }
                                        }
                                    }, urVar), urVar, 54);
                                    urVar.p(true);
                                } else {
                                    urVar.R();
                                }
                                return od2Var2;
                        }
                    }
                }));
                return od2Var;
            case 17:
                le leVar = (le) obj2;
                Throwable th4 = (Throwable) obj;
                ((r) obj4).invoke(th4);
                lk lkVar = (lk) ((q4) obj3).h;
                lkVar.i(th4, false);
                while (true) {
                    Object B = fc2.B(lkVar.d());
                    if (B != null) {
                        leVar.invoke(B, th4);
                    } else {
                        return od2Var;
                    }
                }
            case 18:
                oe0 oe0Var3 = (oe0) obj3;
                r82 r82Var = (r82) ((wl1) obj2).e;
                i82 o = ((sl0) obj4).o((List) obj);
                if (r82Var != null) {
                    r82Var.a(null, o);
                }
                oe0Var3.invoke(o);
                return od2Var;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                m72 m72Var = (m72) obj3;
                sl1 sl1Var2 = (sl1) obj2;
                p72 p72Var = (p72) obj;
                switch (((kp0) obj4).ordinal()) {
                    case 0:
                        p72Var.e.a = null;
                        if (p72Var.g.f.length() > 0) {
                            if (d92.c(p72Var.f)) {
                                p72Var.i();
                                break;
                            } else {
                                boolean f15 = p72Var.f();
                                long j11 = p72Var.f;
                                if (f15) {
                                    int f16 = d92.f(j11);
                                    p72Var.q(f16, f16);
                                    break;
                                } else {
                                    int e7 = d92.e(j11);
                                    p72Var.q(e7, e7);
                                    break;
                                }
                            }
                        }
                        break;
                    case 1:
                        p72Var.e.a = null;
                        if (p72Var.g.f.length() > 0) {
                            if (d92.c(p72Var.f)) {
                                p72Var.m();
                                break;
                            } else {
                                boolean f17 = p72Var.f();
                                long j12 = p72Var.f;
                                if (f17) {
                                    int e8 = d92.e(j12);
                                    p72Var.q(e8, e8);
                                    break;
                                } else {
                                    int f18 = d92.f(j12);
                                    p72Var.q(f18, f18);
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        c92 c92Var = p72Var.e;
                        c92Var.a = null;
                        rc rcVar2 = p72Var.g;
                        String str = rcVar2.f;
                        String str2 = rcVar2.f;
                        if (str.length() > 0) {
                            if (p72Var.f()) {
                                c92Var.a = null;
                                if (str2.length() > 0 && (d = p72Var.d()) != null) {
                                    int intValue = d.intValue();
                                    p72Var.q(intValue, intValue);
                                    break;
                                }
                            } else {
                                c92Var.a = null;
                                if (str2.length() > 0 && (e = p72Var.e()) != null) {
                                    int intValue2 = e.intValue();
                                    p72Var.q(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        c92 c92Var2 = p72Var.e;
                        c92Var2.a = null;
                        rc rcVar3 = p72Var.g;
                        String str3 = rcVar3.f;
                        String str4 = rcVar3.f;
                        if (str3.length() > 0) {
                            if (p72Var.f()) {
                                c92Var2.a = null;
                                if (str4.length() > 0 && (e2 = p72Var.e()) != null) {
                                    int intValue3 = e2.intValue();
                                    p72Var.q(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                c92Var2.a = null;
                                if (str4.length() > 0 && (d2 = p72Var.d()) != null) {
                                    int intValue4 = d2.intValue();
                                    p72Var.q(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        p72Var.j();
                        break;
                    case 5:
                        p72Var.l();
                        break;
                    case 6:
                        p72Var.o();
                        break;
                    case 7:
                        p72Var.n();
                        break;
                    case 8:
                        p72Var.e.a = null;
                        if (p72Var.g.f.length() > 0) {
                            if (p72Var.f()) {
                                p72Var.o();
                                break;
                            } else {
                                p72Var.n();
                                break;
                            }
                        }
                        break;
                    case 9:
                        p72Var.e.a = null;
                        if (p72Var.g.f.length() > 0) {
                            if (p72Var.f()) {
                                p72Var.n();
                                break;
                            } else {
                                p72Var.o();
                                break;
                            }
                        }
                        break;
                    case 10:
                        if (p72Var.g.f.length() > 0 && (w82Var = p72Var.c) != null) {
                            int g2 = p72Var.g(w82Var, -1);
                            p72Var.q(g2, g2);
                            break;
                        }
                        break;
                    case 11:
                        if (p72Var.g.f.length() > 0 && (w82Var2 = p72Var.c) != null) {
                            int g3 = p72Var.g(w82Var2, 1);
                            p72Var.q(g3, g3);
                            break;
                        }
                        break;
                    case 12:
                    case yq1.f /* 48 */:
                        break;
                    case 13:
                        if (p72Var.g.f.length() > 0 && (x82Var = p72Var.i) != null) {
                            int h2 = p72Var.h(x82Var, -1);
                            p72Var.q(h2, h2);
                            break;
                        }
                        break;
                    case 14:
                        if (p72Var.g.f.length() > 0 && (x82Var2 = p72Var.i) != null) {
                            int h3 = p72Var.h(x82Var2, 1);
                            p72Var.q(h3, h3);
                            break;
                        }
                        break;
                    case 15:
                        p72Var.e.a = null;
                        if (p72Var.g.f.length() > 0) {
                            p72Var.q(0, 0);
                            break;
                        }
                        break;
                    case 16:
                        p72Var.e.a = null;
                        rc rcVar4 = p72Var.g;
                        if (rcVar4.f.length() > 0) {
                            int length = rcVar4.f.length();
                            p72Var.q(length, length);
                            break;
                        }
                        break;
                    case 17:
                        m72Var.b.d(false);
                        break;
                    case 18:
                        m72Var.b.p();
                        break;
                    case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                        m72Var.b.f();
                        break;
                    case 20:
                        List a3 = p72Var.a(new nv1(i5));
                        if (a3 != null) {
                            m72Var.a(a3);
                            break;
                        }
                        break;
                    case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                        List a4 = p72Var.a(new nv1(11));
                        if (a4 != null) {
                            m72Var.a(a4);
                            break;
                        }
                        break;
                    case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                        List a5 = p72Var.a(new nv1(i3));
                        if (a5 != null) {
                            m72Var.a(a5);
                            break;
                        }
                        break;
                    case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                        List a6 = p72Var.a(new nv1(i4));
                        if (a6 != null) {
                            m72Var.a(a6);
                            break;
                        }
                        break;
                    case 24:
                        List a7 = p72Var.a(new nv1(14));
                        if (a7 != null) {
                            m72Var.a(a7);
                            break;
                        }
                        break;
                    case 25:
                        List a8 = p72Var.a(new nv1(15));
                        if (a8 != null) {
                            m72Var.a(a8);
                            break;
                        }
                        break;
                    case 26:
                        p72Var.e.a = null;
                        rc rcVar5 = p72Var.g;
                        if (rcVar5.f.length() > 0) {
                            p72Var.q(0, rcVar5.f.length());
                            break;
                        }
                        break;
                    case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                        p72Var.i();
                        p72Var.p();
                        break;
                    case 28:
                        p72Var.m();
                        p72Var.p();
                        break;
                    case 29:
                        if (p72Var.g.f.length() > 0 && (w82Var3 = p72Var.c) != null) {
                            int g4 = p72Var.g(w82Var3, -1);
                            p72Var.q(g4, g4);
                        }
                        p72Var.p();
                        break;
                    case 30:
                        if (p72Var.g.f.length() > 0 && (w82Var4 = p72Var.c) != null) {
                            int g5 = p72Var.g(w82Var4, 1);
                            p72Var.q(g5, g5);
                        }
                        p72Var.p();
                        break;
                    case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                        if (p72Var.g.f.length() > 0 && (x82Var3 = p72Var.i) != null) {
                            int h4 = p72Var.h(x82Var3, -1);
                            p72Var.q(h4, h4);
                        }
                        p72Var.p();
                        break;
                    case 32:
                        if (p72Var.g.f.length() > 0 && (x82Var4 = p72Var.i) != null) {
                            int h5 = p72Var.h(x82Var4, 1);
                            p72Var.q(h5, h5);
                        }
                        p72Var.p();
                        break;
                    case 33:
                        p72Var.e.a = null;
                        if (p72Var.g.f.length() > 0) {
                            p72Var.q(0, 0);
                        }
                        p72Var.p();
                        break;
                    case 34:
                        p72Var.e.a = null;
                        rc rcVar6 = p72Var.g;
                        if (rcVar6.f.length() > 0) {
                            int length2 = rcVar6.f.length();
                            p72Var.q(length2, length2);
                        }
                        p72Var.p();
                        break;
                    case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                        c92 c92Var3 = p72Var.e;
                        c92Var3.a = null;
                        rc rcVar7 = p72Var.g;
                        String str5 = rcVar7.f;
                        String str6 = rcVar7.f;
                        if (str5.length() > 0) {
                            if (p72Var.f()) {
                                c92Var3.a = null;
                                if (str6.length() > 0 && (e3 = p72Var.e()) != null) {
                                    int intValue5 = e3.intValue();
                                    p72Var.q(intValue5, intValue5);
                                }
                            } else {
                                c92Var3.a = null;
                                if (str6.length() > 0 && (d3 = p72Var.d()) != null) {
                                    int intValue6 = d3.intValue();
                                    p72Var.q(intValue6, intValue6);
                                }
                            }
                        }
                        p72Var.p();
                        break;
                    case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                        c92 c92Var4 = p72Var.e;
                        c92Var4.a = null;
                        rc rcVar8 = p72Var.g;
                        String str7 = rcVar8.f;
                        String str8 = rcVar8.f;
                        if (str7.length() > 0) {
                            if (p72Var.f()) {
                                c92Var4.a = null;
                                if (str8.length() > 0 && (d4 = p72Var.d()) != null) {
                                    int intValue7 = d4.intValue();
                                    p72Var.q(intValue7, intValue7);
                                }
                            } else {
                                c92Var4.a = null;
                                if (str8.length() > 0 && (e4 = p72Var.e()) != null) {
                                    int intValue8 = e4.intValue();
                                    p72Var.q(intValue8, intValue8);
                                }
                            }
                        }
                        p72Var.p();
                        break;
                    case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                        p72Var.j();
                        p72Var.p();
                        break;
                    case 38:
                        p72Var.l();
                        p72Var.p();
                        break;
                    case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                        p72Var.o();
                        p72Var.p();
                        break;
                    case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                        p72Var.n();
                        p72Var.p();
                        break;
                    case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                        p72Var.e.a = null;
                        if (p72Var.g.f.length() > 0) {
                            if (p72Var.f()) {
                                p72Var.o();
                            } else {
                                p72Var.n();
                            }
                        }
                        p72Var.p();
                        break;
                    case 42:
                        p72Var.e.a = null;
                        if (p72Var.g.f.length() > 0) {
                            if (p72Var.f()) {
                                p72Var.n();
                            } else {
                                p72Var.o();
                            }
                        }
                        p72Var.p();
                        break;
                    case 43:
                        p72Var.e.a = null;
                        if (p72Var.g.f.length() > 0) {
                            long j13 = p72Var.f;
                            int i17 = d92.c;
                            int i18 = (int) (j13 & 4294967295L);
                            p72Var.q(i18, i18);
                            break;
                        }
                        break;
                    case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                        if (!m72Var.e) {
                            m72Var.a(xn.E(new dp("\n", 1)));
                            break;
                        } else {
                            sl1Var2.e = m72Var.a.x.f.r.b(m72Var.l);
                            break;
                        }
                    case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                        if (!m72Var.e) {
                            m72Var.a(xn.E(new dp("\t", 1)));
                            break;
                        } else {
                            sl1Var2.e = false;
                            break;
                        }
                    case 46:
                        kd2 kd2Var = m72Var.h;
                        if (kd2Var != null) {
                            kd2Var.a(i82.a(p72Var.h, p72Var.g, p72Var.f, 4));
                        }
                        kd2 kd2Var2 = m72Var.h;
                        if (kd2Var2 != null) {
                            h12 h12Var2 = kd2Var2.a;
                            if (h12Var2 != null && (h12Var = (h12) h12Var2.f) != null) {
                                kd2Var2.a = h12Var;
                                kd2Var2.c -= ((i82) h12Var2.g).a.f.length();
                                kd2Var2.b = new h12(i8, kd2Var2.b, (i82) h12Var2.g);
                                i82Var = (i82) h12Var.g;
                            }
                            if (i82Var != null) {
                                m72Var.k.invoke(i82Var);
                                break;
                            }
                        }
                        break;
                    case 47:
                        kd2 kd2Var3 = m72Var.h;
                        if (kd2Var3 != null) {
                            h12 h12Var3 = kd2Var3.b;
                            if (h12Var3 != null) {
                                kd2Var3.b = (h12) h12Var3.f;
                                i82 i82Var3 = (i82) h12Var3.g;
                                kd2Var3.a = new h12(i8, kd2Var3.a, i82Var3);
                                kd2Var3.c = i82Var3.a.f.length() + kd2Var3.c;
                                i82Var = (i82) h12Var3.g;
                            }
                            if (i82Var != null) {
                                m72Var.k.invoke(i82Var);
                                break;
                            }
                        }
                        break;
                    default:
                        se.m();
                        return null;
                }
                return od2Var;
            case 20:
                return b(obj);
            default:
                ArrayList arrayList3 = (ArrayList) obj4;
                it0 it0Var2 = (it0) obj;
                it0Var2.getClass();
                it0Var2.d0(arrayList3.size(), new ou(i5, new ke2(i6), arrayList3), new on1(arrayList3, 1), new fq(802480018, true, new pn1(arrayList3, (oe0) obj3, (h32) obj2, i7)));
                return od2Var;
        }
    }

    public /* synthetic */ k1(oe0 oe0Var, o41 o41Var, o41 o41Var2) {
        this.e = 1;
        this.f = oe0Var;
        this.g = o41Var;
        this.h = o41Var2;
    }

    public /* synthetic */ k1(jt jtVar, wd2 wd2Var, go0 go0Var, ys1 ys1Var) {
        this.e = 4;
        this.g = jtVar;
        this.f = go0Var;
        this.h = ys1Var;
    }

    public /* synthetic */ k1(o41 o41Var, ArrayList arrayList, List list, boolean z) {
        this.e = 10;
        this.g = o41Var;
        this.f = arrayList;
        this.h = list;
    }

    public /* synthetic */ k1(tl1 tl1Var, ds1 ds1Var, tl1 tl1Var2, hy hyVar) {
        this.e = 6;
        this.g = tl1Var;
        this.f = ds1Var;
        this.h = tl1Var2;
    }

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.g = obj;
        this.f = obj2;
        this.h = obj3;
    }
}
