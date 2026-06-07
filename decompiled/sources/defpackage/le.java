package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class le implements se0 {
    public final /* synthetic */ int e;

    public /* synthetic */ le(int i) {
        this.e = i;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        float f;
        boolean z;
        boolean z2;
        ap apVar;
        int i = this.e;
        b21 b21Var = b21.a;
        boolean z3 = false;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                float intValue = ((Integer) obj).intValue() / 2.0f;
                if (((jq0) obj2) == jq0.e) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                return Integer.valueOf(Math.round((1.0f + f) * intValue));
            case 1:
                String str = (String) obj;
                vu vuVar = (vu) obj2;
                str.getClass();
                vuVar.getClass();
                if (str.length() == 0) {
                    return vuVar.toString();
                }
                return str + ", " + vuVar;
            case 2:
                ur urVar = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                }
                if (!urVar.O(intValue2 & 1, z3)) {
                    urVar.R();
                }
                return od2Var;
            case 3:
                ur urVar2 = (ur) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                if (!urVar2.O(intValue3 & 1, z3)) {
                    urVar2.R();
                }
                return od2Var;
            case 4:
                ur urVar3 = (ur) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                }
                if (!urVar3.O(intValue4 & 1, z3)) {
                    urVar3.R();
                }
                return od2Var;
            case 5:
                ur urVar4 = (ur) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z3 = true;
                }
                if (!urVar4.O(intValue5 & 1, z3)) {
                    urVar4.R();
                }
                return od2Var;
            case 6:
                ur urVar5 = (ur) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                }
                if (!urVar5.O(intValue6 & 1, z3)) {
                    urVar5.R();
                }
                return od2Var;
            case 7:
                ur urVar6 = (ur) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar6.O(intValue7 & 1, z)) {
                    j01 d = hj.d(g3.j, false);
                    int hashCode = Long.hashCode(urVar6.T);
                    sf1 l = urVar6.l();
                    e21 Q = fp.Q(urVar6, b21Var);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar6.a0();
                    if (urVar6.S) {
                        urVar6.k(hsVar);
                    } else {
                        urVar6.k0();
                    }
                    op1.q(urVar6, kr.f, d);
                    op1.q(urVar6, kr.e, l);
                    op1.l(urVar6, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar6, kr.h);
                    op1.q(urVar6, kr.d, Q);
                    ej0.a(rp1.m(), null, hy1.f(b21Var, 32.0f), ((mo) urVar6.j(oo.a)).d, urVar6, 432, 0);
                    urVar6.p(true);
                } else {
                    urVar6.R();
                }
                return od2Var;
            case 8:
                ur urVar7 = (ur) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar7.O(intValue8 & 1, z2)) {
                    j01 d2 = hj.d(g3.j, false);
                    int hashCode2 = Long.hashCode(urVar7.T);
                    sf1 l2 = urVar7.l();
                    e21 Q2 = fp.Q(urVar7, b21Var);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar7.a0();
                    if (urVar7.S) {
                        urVar7.k(hsVar2);
                    } else {
                        urVar7.k0();
                    }
                    op1.q(urVar7, kr.f, d2);
                    op1.q(urVar7, kr.e, l2);
                    op1.l(urVar7, Integer.valueOf(hashCode2), kr.g);
                    op1.o(urVar7, kr.h);
                    op1.q(urVar7, kr.d, Q2);
                    ej0.a(rp1.m(), null, hy1.f(b21Var, 32.0f), ((mo) urVar7.j(oo.a)).d, urVar7, 432, 0);
                    urVar7.p(true);
                } else {
                    urVar7.R();
                }
                return od2Var;
            case 9:
                ur urVar8 = (ur) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z3 = true;
                }
                if (urVar8.O(intValue9 & 1, z3)) {
                    cj.a.a(null, 0.0f, 0.0f, null, 0L, urVar8, 196608);
                } else {
                    urVar8.R();
                }
                return od2Var;
            case 10:
                ur urVar9 = (ur) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z3 = true;
                }
                if (urVar9.O(intValue10 & 1, z3)) {
                    cj.a.a(null, 0.0f, 0.0f, null, 0L, urVar9, 196608);
                } else {
                    urVar9.R();
                }
                return od2Var;
            case 11:
                ur urVar10 = (ur) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z3 = true;
                }
                if (!urVar10.O(intValue11 & 1, z3)) {
                    urVar10.R();
                }
                return od2Var;
            case 12:
                ur urVar11 = (ur) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z3 = true;
                }
                if (!urVar11.O(intValue12 & 1, z3)) {
                    urVar11.R();
                }
                return od2Var;
            case 13:
                ur urVar12 = (ur) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z3 = true;
                }
                if (!urVar12.O(intValue13 & 1, z3)) {
                    urVar12.R();
                }
                return od2Var;
            case 14:
                ur urVar13 = (ur) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z3 = true;
                }
                if (!urVar13.O(intValue14 & 1, z3)) {
                    urVar13.R();
                }
                return od2Var;
            case 15:
                ur urVar14 = (ur) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z3 = true;
                }
                if (!urVar14.O(intValue15 & 1, z3)) {
                    urVar14.R();
                }
                return od2Var;
            case 16:
                ur urVar15 = (ur) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z3 = true;
                }
                if (urVar15.O(intValue16 & 1, z3)) {
                    ej0.a(fc2.A(), null, null, ((mo) urVar15.j(oo.a)).a, urVar15, 48, 4);
                } else {
                    urVar15.R();
                }
                return od2Var;
            case 17:
                xu xuVar = (xu) obj;
                vu vuVar2 = (vu) obj2;
                xuVar.getClass();
                vuVar2.getClass();
                xu s = xuVar.s(vuVar2.getKey());
                j60 j60Var = j60.e;
                if (s != j60Var) {
                    g3 g3Var = g3.y;
                    zu zuVar = (zu) s.H(g3Var);
                    if (zuVar == null) {
                        apVar = new ap(vuVar2, s);
                    } else {
                        xu s2 = s.s(g3Var);
                        if (s2 == j60Var) {
                            return new ap(zuVar, vuVar2);
                        }
                        apVar = new ap(zuVar, new ap(vuVar2, s2));
                    }
                    return apVar;
                }
                return vuVar2;
            case 18:
                return ((xu) obj).G((vu) obj2);
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return ((xu) obj).G((vu) obj2);
            case 20:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                z01 z01Var = (z01) obj;
                Throwable th = (Throwable) obj2;
                z01Var.getClass();
                ip ipVar = z01Var.b;
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                ipVar.R(new lp(th, false));
                return od2Var;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                uy uyVar = (uy) obj2;
                return xn.F(Integer.valueOf(uyVar.l()), Float.valueOf(go.o(uyVar.m(), -0.5f, 0.5f)), Integer.valueOf(uyVar.o()));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return (m40) ((l40) obj2).b.h.getValue();
            case 24:
                Integer num = (Integer) obj;
                num.intValue();
                ((String) obj2).getClass();
                return num;
            case 25:
                st0 st0Var = (st0) obj2;
                return xn.F(Integer.valueOf(st0Var.g()), Integer.valueOf(st0Var.h()));
            case 26:
                Map d3 = ((vt0) obj2).d();
                if (d3.isEmpty()) {
                    return null;
                }
                return d3;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((Integer) obj2).getClass();
                c01.g(lo.b0(1), (ur) obj);
                return od2Var;
            case 28:
                ((Integer) obj2).getClass();
                c01.m(lo.b0(1), (ur) obj);
                return od2Var;
            default:
                ur urVar16 = (ur) obj;
                ((Integer) obj2).getClass();
                urVar16.X(-1520918041);
                WeakHashMap weakHashMap = pi2.w;
                sa saVar = wm1.j(urVar16).c;
                urVar16.p(false);
                return saVar;
        }
    }

    public /* synthetic */ le(int i, int i2) {
        this.e = i2;
    }
}
