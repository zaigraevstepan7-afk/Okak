package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class va implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ va(sl1 sl1Var, j51 j51Var, r51 r51Var, Bundle bundle) {
        this.e = 6;
        this.i = sl1Var;
        this.f = j51Var;
        this.g = r51Var;
        this.h = bundle;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, wl1] */
    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        long j;
        int i;
        int i2 = this.e;
        int i3 = 3;
        int i4 = 2;
        od2 od2Var = od2.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i2) {
            case 0:
                ya yaVar = (ya) obj5;
                hc hcVar = (hc) obj4;
                oe0 oe0Var = (oe0) obj3;
                sl1 sl1Var = (sl1) obj2;
                fc fcVar = (fc) obj;
                yq1.C(fcVar, yaVar.c);
                je1 je1Var = fcVar.e;
                Object c = yaVar.c(je1Var.getValue());
                if (!sn0.r(c, je1Var.getValue())) {
                    yaVar.c.f.setValue(c);
                    hcVar.f.setValue(c);
                    if (oe0Var != null) {
                        oe0Var.invoke(yaVar);
                    }
                    fcVar.a();
                    sl1Var.e = true;
                } else if (oe0Var != null) {
                    oe0Var.invoke(yaVar);
                }
                return od2Var;
            case 1:
                gu0 gu0Var = (gu0) obj5;
                n82 n82Var = (n82) obj4;
                i82 i82Var = (i82) obj3;
                nj0 nj0Var = (nj0) obj2;
                if (gu0Var.b()) {
                    sl0 sl0Var = gu0Var.d;
                    fu fuVar = gu0Var.v;
                    fu fuVar2 = gu0Var.w;
                    ?? obj6 = new Object();
                    k1 k1Var = new k1(sl0Var, fuVar, (Object) obj6, 18);
                    dh1 dh1Var = n82Var.a;
                    dh1Var.h(i82Var, nj0Var, k1Var, fuVar2);
                    r82 r82Var = new r82(n82Var, dh1Var);
                    n82Var.b.set(r82Var);
                    obj6.e = r82Var;
                    gu0Var.e = r82Var;
                }
                return new x8(1);
            case 2:
                uk0 uk0Var = (uk0) obj4;
                tl1 tl1Var = (tl1) obj3;
                gv gvVar = (gv) obj2;
                long longValue = ((Long) obj).longValue();
                o22 o22Var = (o22) ((o41) obj5).getValue();
                if (o22Var != null) {
                    j = ((Number) o22Var.getValue()).longValue();
                } else {
                    j = longValue;
                }
                long j2 = uk0Var.c;
                q41 q41Var = uk0Var.a;
                if (j2 == Long.MIN_VALUE || tl1Var.e != yq1.r(gvVar.A())) {
                    uk0Var.c = longValue;
                    Object[] objArr = q41Var.e;
                    int i5 = q41Var.g;
                    for (int i6 = 0; i6 < i5; i6++) {
                        ((sk0) objArr[i6]).j = true;
                    }
                    tl1Var.e = yq1.r(gvVar.A());
                }
                float f = tl1Var.e;
                if (f == 0.0f) {
                    Object[] objArr2 = q41Var.e;
                    int i7 = q41Var.g;
                    for (int i8 = 0; i8 < i7; i8++) {
                        sk0 sk0Var = (sk0) objArr2[i8];
                        sk0Var.g.setValue(sk0Var.h.c);
                        sk0Var.j = true;
                    }
                } else {
                    long j3 = ((float) (j - uk0Var.c)) / f;
                    Object[] objArr3 = q41Var.e;
                    int i9 = q41Var.g;
                    boolean z = true;
                    for (int i10 = 0; i10 < i9; i10++) {
                        sk0 sk0Var2 = (sk0) objArr3[i10];
                        if (!sk0Var2.i) {
                            sk0Var2.l.b.setValue(Boolean.FALSE);
                            if (sk0Var2.j) {
                                sk0Var2.j = false;
                                sk0Var2.k = j3;
                            }
                            long j4 = j3 - sk0Var2.k;
                            sk0Var2.g.setValue(sk0Var2.h.f(j4));
                            sk0Var2.i = sk0Var2.h.e(j4);
                        }
                        if (!sk0Var2.i) {
                            z = false;
                        }
                    }
                    uk0Var.d.setValue(Boolean.valueOf(!z));
                }
                return od2Var;
            case 3:
                bl0 bl0Var = (bl0) obj5;
                it0 it0Var = (it0) obj;
                it0Var.getClass();
                it0.c0(it0Var, new fq(-878257797, true, new ol(bl0Var, i3)));
                it0.c0(it0Var, new fq(1887384740, true, new y2(i4, bl0Var, (Context) obj4)));
                it0.c0(it0Var, new fq(2141774147, true, new fh0((o41) obj3, (h32) obj2)));
                return od2Var;
            case 4:
                vs0 vs0Var = (vs0) obj5;
                vs0Var.c = new dq0((hs0) obj4, (b42) obj3, (li1) obj2);
                return new m2(vs0Var, 10);
            case 5:
                tl1 tl1Var2 = (tl1) obj5;
                n00 n00Var = (n00) obj4;
                ys1 ys1Var = (ys1) obj3;
                k2 k2Var = (k2) obj2;
                fc fcVar2 = (fc) obj;
                float floatValue = ((Number) fcVar2.e.getValue()).floatValue() - tl1Var2.e;
                if (!hp.k(floatValue)) {
                    if (!hp.k(floatValue - n00Var.c(ys1Var, floatValue))) {
                        fcVar2.a();
                        return od2Var;
                    }
                    tl1Var2.e += floatValue;
                }
                if (((Boolean) k2Var.invoke(Float.valueOf(tl1Var2.e))).booleanValue()) {
                    fcVar2.a();
                }
                return od2Var;
            case 6:
                d51 d51Var = (d51) obj;
                d51Var.getClass();
                ((sl1) obj2).e = true;
                ((j51) obj5).a((r51) obj4, (Bundle) obj3, d51Var, l60.e);
                return od2Var;
            default:
                iz0 iz0Var = (iz0) obj5;
                iz0 iz0Var2 = (iz0) obj4;
                co1 co1Var = (co1) obj3;
                o41 o41Var = (o41) obj2;
                Map map = (Map) obj;
                map.getClass();
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            o41Var.setValue(null);
                            co1Var.l.j(od2Var);
                            return od2Var;
                        }
                    }
                }
                an1 an1Var = (an1) o41Var.getValue();
                if (an1Var == null) {
                    i = -1;
                } else {
                    i = tn1.a[an1Var.ordinal()];
                }
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                se.m();
                                return null;
                            }
                        } else {
                            iz0Var2.H("image/*");
                        }
                    } else {
                        iz0Var.H("audio/mpeg");
                    }
                }
                o41Var.setValue(null);
                return od2Var;
        }
    }

    public /* synthetic */ va(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }
}
