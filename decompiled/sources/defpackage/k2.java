package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class k2 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ k2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        Object obj2;
        gu0 gu0Var;
        b82 b82Var;
        List list;
        pl1 pl1Var;
        float rint;
        int i = this.e;
        od2 od2Var = od2.a;
        boolean z = true;
        hg2 hg2Var = null;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                g2 g2Var = (g2) obj7;
                xp xpVar = (xp) obj6;
                String str = (String) obj5;
                f2 f2Var = (f2) obj4;
                l2 l2Var = new l2((o41) obj3);
                o41 o41Var = (o41) l2Var.e;
                Bundle bundle = xpVar.g;
                LinkedHashMap linkedHashMap = xpVar.a;
                LinkedHashMap linkedHashMap2 = xpVar.f;
                str.getClass();
                LinkedHashMap linkedHashMap3 = xpVar.b;
                if (((Integer) linkedHashMap3.get(str)) == null) {
                    h2 h2Var = new h2(0);
                    Iterator it = ((ts) mv1.F(new a00(2, new hh1(h2Var, 10), h2Var))).iterator();
                    while (it.hasNext()) {
                        Number number = (Number) it.next();
                        if (!linkedHashMap.containsKey(Integer.valueOf(number.intValue()))) {
                            int intValue = number.intValue();
                            linkedHashMap.put(Integer.valueOf(intValue), str);
                            linkedHashMap3.put(str, Integer.valueOf(intValue));
                        }
                    }
                    y61.j("Sequence contains no element matching the predicate.");
                    return null;
                }
                xpVar.e.put(str, new i2(l2Var, f2Var));
                if (linkedHashMap2.containsKey(str)) {
                    Object obj8 = linkedHashMap2.get(str);
                    linkedHashMap2.remove(str);
                    ((oe0) o41Var.getValue()).invoke(obj8);
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    obj2 = f1.c(str, bundle);
                } else {
                    Parcelable parcelable = bundle.getParcelable(str);
                    if (d2.class.isInstance(parcelable)) {
                        obj2 = parcelable;
                    } else {
                        obj2 = null;
                    }
                }
                d2 d2Var = (d2) obj2;
                if (d2Var != null) {
                    bundle.remove(str);
                    ((oe0) o41Var.getValue()).invoke(f2Var.D(d2Var.e, d2Var.f));
                }
                g2Var.a = new j2(xpVar, str, f2Var);
                return new m2(g2Var, 0);
            case 1:
                hu0 hu0Var = (hu0) obj;
                bu0 bu0Var = ((b8) obj6).a;
                hu0Var.h = (i82) obj7;
                hu0Var.i = (nj0) obj5;
                hu0Var.c = (k1) obj4;
                hu0Var.d = (oe0) obj3;
                if (bu0Var != null) {
                    gu0Var = bu0Var.t;
                } else {
                    gu0Var = null;
                }
                hu0Var.e = gu0Var;
                if (bu0Var != null) {
                    b82Var = bu0Var.u;
                } else {
                    b82Var = null;
                }
                hu0Var.f = b82Var;
                if (bu0Var != null) {
                    hg2Var = (hg2) hp.s(bu0Var, is.s);
                }
                hu0Var.g = hg2Var;
                return od2Var;
            case 2:
                n00 n00Var = (n00) obj7;
                wl1 wl1Var = (wl1) obj6;
                tl1 tl1Var = (tl1) obj5;
                at1 at1Var = (at1) obj4;
                sl1 sl1Var = (sl1) obj3;
                float floatValue = ((Float) obj).floatValue();
                w21 g = n00.g((lk) n00Var.f);
                if (g != null) {
                    n00Var.h(g);
                    w21 a = ((w21) wl1Var.e).a(g);
                    wl1Var.e = a;
                    tl1Var.e = at1Var.i(at1Var.e(a.a));
                    sl1Var.e = !hp.k(r0 - floatValue);
                }
                if (g == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ArrayList arrayList = (ArrayList) obj6;
                ul1 ul1Var = (ul1) obj5;
                j51 j51Var = (j51) obj4;
                Bundle bundle2 = (Bundle) obj3;
                d51 d51Var = (d51) obj;
                d51Var.getClass();
                ((sl1) obj7).e = true;
                int indexOf = arrayList.indexOf(d51Var);
                if (indexOf != -1) {
                    int i2 = indexOf + 1;
                    list = arrayList.subList(ul1Var.e, i2);
                    ul1Var.e = i2;
                } else {
                    list = l60.e;
                }
                j51Var.a(d51Var.f, bundle2, d51Var, list);
                return od2Var;
            default:
                c91 c91Var = (c91) obj6;
                i82 i82Var = (i82) obj5;
                gu0 gu0Var2 = (gu0) obj4;
                i12 i12Var = (i12) obj3;
                cr0 cr0Var = (cr0) obj;
                cr0Var.b();
                vl vlVar = cr0Var.e;
                float g2 = ((yv) obj7).c.g();
                if (g2 != 0.0f) {
                    long j = i82Var.b;
                    int i3 = d92.c;
                    int d = c91Var.d((int) (j >> 32));
                    x82 d2 = gu0Var2.d();
                    if (d2 != null) {
                        pl1Var = d2.a.c(d);
                    } else {
                        pl1Var = new pl1(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float floor = (float) Math.floor(cr0Var.W(2.0f));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f = floor / 2.0f;
                    float f2 = pl1Var.a + f;
                    float intBitsToFloat = Float.intBitsToFloat((int) (vlVar.d() >> 32)) - f;
                    if (f2 > intBitsToFloat) {
                        f2 = intBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    if (((int) floor) % 2 == 1) {
                        rint = ((float) Math.floor(f)) + 0.5f;
                    } else {
                        rint = (float) Math.rint(f);
                    }
                    float f3 = pl1Var.b;
                    long floatToRawIntBits = (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                    float f4 = pl1Var.d;
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
                    tl tlVar = vlVar.e.c;
                    f8 f8Var = vlVar.h;
                    if (f8Var == null) {
                        f8Var = fc2.j();
                        f8Var.l(1);
                        vlVar.h = f8Var;
                    }
                    Paint paint = (Paint) f8Var.b;
                    i12Var.a(g2, vlVar.d(), f8Var);
                    if (!sn0.r((ni) f8Var.d, null)) {
                        f8Var.f(null);
                    }
                    if (f8Var.a != 3) {
                        f8Var.d(3);
                    }
                    if (paint.getStrokeWidth() != floor) {
                        f8Var.k(floor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (f8Var.a() != 0) {
                        f8Var.i(0);
                    }
                    if (f8Var.b() != 0) {
                        f8Var.j(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        f8Var.g(1);
                    }
                    tlVar.i(floatToRawIntBits, floatToRawIntBits2, f8Var);
                }
                return od2Var;
        }
    }
}
