package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ab {
    public static final f22 a = mp0.M(0.0f, 0.0f, null, 7);

    static {
        Map map = vg2.a;
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final o22 a(float f, u90 u90Var, ur urVar, int i, int i2) {
        String str;
        Float valueOf = Float.valueOf(0.01f);
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        } else {
            str = "fabRotation";
        }
        String str2 = str;
        if (u90Var == a) {
            urVar.X(1144089983);
            boolean c = urVar.c(0.01f);
            Object L = urVar.L();
            if (c || L == or.a) {
                L = mp0.M(0.0f, 0.0f, valueOf, 3);
                urVar.h0(L);
            }
            u90Var = (f22) L;
            urVar.p(false);
        } else {
            urVar.X(1144199909);
            urVar.p(false);
        }
        return b(Float.valueOf(f), f2.A, u90Var, valueOf, str2, urVar, (i << 3) & 57344, 0);
    }

    public static final o22 b(Object obj, ec2 ec2Var, gc gcVar, Float f, String str, ur urVar, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object L = urVar.L();
        Object obj2 = or.a;
        if (L == obj2) {
            L = fr1.k(null);
            urVar.h0(L);
        }
        o41 o41Var = (o41) L;
        Object L2 = urVar.L();
        if (L2 == obj2) {
            L2 = new ya(obj, ec2Var, f);
            urVar.h0(L2);
        }
        ya yaVar = (ya) L2;
        Object p = fr1.p(null, urVar);
        if (f != null && (gcVar instanceof f22)) {
            f22 f22Var = (f22) gcVar;
            if (!sn0.r(f22Var.c, f)) {
                gcVar = new f22(f22Var.a, f22Var.b, f);
            }
        }
        Object p2 = fr1.p(gcVar, urVar);
        Object L3 = urVar.L();
        if (L3 == obj2) {
            L3 = sn0.c(-1, 6, null);
            urVar.h0(L3);
        }
        Object obj3 = (dm) L3;
        boolean h = urVar.h(obj3) | urVar.h(obj);
        Object L4 = urVar.L();
        if (h || L4 == obj2) {
            L4 = new j1(2, obj3, obj);
            urVar.h0(L4);
        }
        bf.p((de0) L4, urVar);
        boolean h2 = urVar.h(obj3) | urVar.h(yaVar) | urVar.f(p2) | urVar.f(p);
        Object L5 = urVar.L();
        if (h2 || L5 == obj2) {
            Object zaVar = new za(obj3, yaVar, p2, p, (vt) null, 0);
            urVar.h0(zaVar);
            L5 = zaVar;
        }
        bf.i(urVar, (se0) L5, obj3);
        o22 o22Var = (o22) o41Var.getValue();
        if (o22Var == null) {
            return yaVar.c;
        }
        return o22Var;
    }
}
