package defpackage;

import android.util.Log;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class hr1 implements oe0 {
    public final /* synthetic */ int e;

    public /* synthetic */ hr1(int i) {
        this.e = i;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        qc qcVar;
        Float f;
        Float f2;
        hx0 hx0Var;
        String str;
        gv0 gv0Var;
        iv0 iv0Var;
        tc tcVar;
        Integer num;
        Integer num2;
        String str2;
        qc qcVar2;
        b62 b62Var;
        a72 a72Var;
        n92 n92Var;
        m82 m82Var;
        rg1 rg1Var;
        jv0 jv0Var;
        ev0 ev0Var;
        xi0 xi0Var;
        co coVar;
        n92 n92Var2;
        sd0 sd0Var;
        qd0 qd0Var;
        rd0 rd0Var;
        String str3;
        n92 n92Var3;
        jh jhVar;
        l82 l82Var;
        ix0 ix0Var;
        co coVar2;
        x62 x62Var;
        Boolean bool;
        a92 a92Var;
        o92 o92Var = null;
        Boolean bool2 = null;
        r13 = null;
        f60 f60Var = null;
        r13 = null;
        hw1 hw1Var = null;
        r13 = null;
        b92 b92Var = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        r13 = null;
        qv0 qv0Var = null;
        r13 = null;
        rv0 rv0Var = null;
        r13 = null;
        yd2 yd2Var = null;
        r13 = null;
        bf2 bf2Var = null;
        r13 = null;
        m12 m12Var = null;
        r13 = null;
        de1 de1Var = null;
        hv0 hv0Var = null;
        r13 = null;
        z82 z82Var = null;
        Float f3 = null;
        boolean z = false;
        r14 = false;
        boolean z2 = false;
        switch (this.e) {
            case 0:
                obj.getClass();
                return new a72(((Integer) obj).intValue());
            case 1:
                obj.getClass();
                return new xi0(((Integer) obj).intValue());
            case 2:
                obj.getClass();
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    sl0 sl0Var = lr1.b;
                    if (sn0.r(obj2, Boolean.FALSE) || obj2 == null) {
                        qcVar = null;
                    } else {
                        qcVar = (qc) ((oe0) sl0Var.f).invoke(obj2);
                    }
                    qcVar.getClass();
                    arrayList.add(qcVar);
                }
                return arrayList;
            case 3:
                obj.getClass();
                return new qd0(((Integer) obj).intValue());
            case 4:
                obj.getClass();
                return new rd0(((Integer) obj).intValue());
            case 5:
                Boolean bool3 = Boolean.FALSE;
                if (sn0.r(obj, bool3)) {
                    return new n92(n92.c);
                }
                obj.getClass();
                List list2 = (List) obj;
                Object obj3 = list2.get(0);
                if (obj3 != null) {
                    f = (Float) obj3;
                } else {
                    f = null;
                }
                f.getClass();
                float floatValue = f.floatValue();
                Object obj4 = list2.get(1);
                kr1 kr1Var = lr1.w;
                sn0.r(obj4, bool3);
                if (obj4 != null) {
                    o92Var = (o92) kr1Var.f.invoke(obj4);
                }
                o92Var.getClass();
                return new n92(pp1.C(o92Var.a, floatValue));
            case 6:
                if (sn0.r(obj, 0)) {
                    return new o92(8589934592L);
                }
                if (sn0.r(obj, 1)) {
                    return new o92(4294967296L);
                }
                return new o92(0L);
            case 7:
                if (sn0.r(obj, Boolean.FALSE)) {
                    return new z81(9205357640488583168L);
                }
                obj.getClass();
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                if (obj5 != null) {
                    f2 = (Float) obj5;
                } else {
                    f2 = null;
                }
                f2.getClass();
                float floatValue2 = f2.floatValue();
                Object obj6 = list3.get(1);
                if (obj6 != null) {
                    f3 = (Float) obj6;
                }
                f3.getClass();
                float floatValue3 = f3.floatValue();
                return new z81((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(floatValue3) & 4294967295L));
            case 8:
                obj.getClass();
                List list4 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list4.size());
                int size2 = list4.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj7 = list4.get(i2);
                    sl0 sl0Var2 = lr1.z;
                    if (sn0.r(obj7, Boolean.FALSE) || obj7 == null) {
                        hx0Var = null;
                    } else {
                        hx0Var = (hx0) ((oe0) sl0Var2.f).invoke(obj7);
                    }
                    hx0Var.getClass();
                    arrayList2.add(hx0Var);
                }
                return new ix0(arrayList2);
            case 9:
                obj.getClass();
                String str7 = (String) obj;
                pg1.a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str7);
                if (sn0.r(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str7 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new hx0(forLanguageTag);
            case 10:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                if (obj8 != null) {
                    str = (String) obj8;
                } else {
                    str = null;
                }
                str.getClass();
                Object obj9 = list5.get(1);
                sl0 sl0Var3 = lr1.i;
                if (!sn0.r(obj9, Boolean.FALSE) && obj9 != null) {
                    z82Var = (z82) ((oe0) sl0Var3.f).invoke(obj9);
                }
                return new qv0(str, z82Var);
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                float f4 = gv0.b;
                kr1 kr1Var2 = lr1.B;
                Boolean bool4 = Boolean.FALSE;
                sn0.r(obj10, bool4);
                if (obj10 != null) {
                    gv0Var = (gv0) kr1Var2.f.invoke(obj10);
                } else {
                    gv0Var = null;
                }
                gv0Var.getClass();
                float f5 = gv0Var.a;
                Object obj11 = list6.get(1);
                kr1 kr1Var3 = lr1.C;
                sn0.r(obj11, bool4);
                if (obj11 != null) {
                    iv0Var = (iv0) kr1Var3.f.invoke(obj11);
                } else {
                    iv0Var = null;
                }
                iv0Var.getClass();
                int i3 = iv0Var.a;
                Object obj12 = list6.get(2);
                kr1 kr1Var4 = lr1.D;
                sn0.r(obj12, bool4);
                if (obj12 != null) {
                    hv0Var = (hv0) kr1Var4.f.invoke(obj12);
                }
                hv0Var.getClass();
                return new jv0(f5, i3, hv0Var.a);
            case 12:
                obj.getClass();
                float floatValue4 = ((Float) obj).floatValue();
                gv0.a(floatValue4);
                return new gv0(floatValue4);
            case 13:
                obj.getClass();
                return new iv0(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                List list7 = (List) obj;
                Object obj13 = list7.get(0);
                if (obj13 != null) {
                    tcVar = (tc) obj13;
                } else {
                    tcVar = null;
                }
                tcVar.getClass();
                Object obj14 = list7.get(2);
                if (obj14 != null) {
                    num = (Integer) obj14;
                } else {
                    num = null;
                }
                num.getClass();
                int intValue = num.intValue();
                Object obj15 = list7.get(3);
                if (obj15 != null) {
                    num2 = (Integer) obj15;
                } else {
                    num2 = null;
                }
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj16 = list7.get(4);
                if (obj16 != null) {
                    str2 = (String) obj16;
                } else {
                    str2 = null;
                }
                str2.getClass();
                switch (tcVar.ordinal()) {
                    case 0:
                        Object obj17 = list7.get(1);
                        sl0 sl0Var4 = lr1.g;
                        if (!sn0.r(obj17, Boolean.FALSE) && obj17 != null) {
                            de1Var = (de1) ((oe0) sl0Var4.f).invoke(obj17);
                        }
                        de1Var.getClass();
                        qcVar2 = new qc(str2, intValue, intValue2, de1Var);
                        break;
                    case 1:
                        Object obj18 = list7.get(1);
                        sl0 sl0Var5 = lr1.h;
                        if (!sn0.r(obj18, Boolean.FALSE) && obj18 != null) {
                            m12Var = (m12) ((oe0) sl0Var5.f).invoke(obj18);
                        }
                        m12Var.getClass();
                        qcVar2 = new qc(str2, intValue, intValue2, m12Var);
                        break;
                    case 2:
                        Object obj19 = list7.get(1);
                        sl0 sl0Var6 = lr1.c;
                        if (!sn0.r(obj19, Boolean.FALSE) && obj19 != null) {
                            bf2Var = (bf2) ((oe0) sl0Var6.f).invoke(obj19);
                        }
                        bf2Var.getClass();
                        qcVar2 = new qc(str2, intValue, intValue2, bf2Var);
                        break;
                    case 3:
                        Object obj20 = list7.get(1);
                        sl0 sl0Var7 = lr1.d;
                        if (!sn0.r(obj20, Boolean.FALSE) && obj20 != null) {
                            yd2Var = (yd2) ((oe0) sl0Var7.f).invoke(obj20);
                        }
                        yd2Var.getClass();
                        qcVar2 = new qc(str2, intValue, intValue2, yd2Var);
                        break;
                    case 4:
                        Object obj21 = list7.get(1);
                        sl0 sl0Var8 = lr1.e;
                        if (!sn0.r(obj21, Boolean.FALSE) && obj21 != null) {
                            rv0Var = (rv0) ((oe0) sl0Var8.f).invoke(obj21);
                        }
                        rv0Var.getClass();
                        qcVar2 = new qc(str2, intValue, intValue2, rv0Var);
                        break;
                    case 5:
                        Object obj22 = list7.get(1);
                        sl0 sl0Var9 = lr1.f;
                        if (!sn0.r(obj22, Boolean.FALSE) && obj22 != null) {
                            qv0Var = (qv0) ((oe0) sl0Var9.f).invoke(obj22);
                        }
                        qv0Var.getClass();
                        qcVar2 = new qc(str2, intValue, intValue2, qv0Var);
                        break;
                    case 6:
                        Object obj23 = list7.get(1);
                        if (obj23 != null) {
                            str6 = (String) obj23;
                        }
                        str6.getClass();
                        qcVar2 = new qc(str2, intValue, intValue2, new c32(str6));
                        break;
                    default:
                        se.m();
                        return null;
                }
                return qcVar2;
            case 15:
                obj.getClass();
                return new hv0(((Integer) obj).intValue());
            case 16:
                if (obj != null) {
                    str5 = (String) obj;
                }
                str5.getClass();
                return new bf2(str5);
            case 17:
                if (obj != null) {
                    str4 = (String) obj;
                }
                str4.getClass();
                return new yd2(str4);
            case 18:
                obj.getClass();
                List list8 = (List) obj;
                Object obj24 = list8.get(0);
                kr1 kr1Var5 = lr1.q;
                Boolean bool5 = Boolean.FALSE;
                sn0.r(obj24, bool5);
                if (obj24 != null) {
                    b62Var = (b62) kr1Var5.f.invoke(obj24);
                } else {
                    b62Var = null;
                }
                b62Var.getClass();
                int i4 = b62Var.a;
                Object obj25 = list8.get(1);
                kr1 kr1Var6 = lr1.r;
                sn0.r(obj25, bool5);
                if (obj25 != null) {
                    a72Var = (a72) kr1Var6.f.invoke(obj25);
                } else {
                    a72Var = null;
                }
                a72Var.getClass();
                int i5 = a72Var.a;
                Object obj26 = list8.get(2);
                o92[] o92VarArr = n92.b;
                kr1 kr1Var7 = lr1.v;
                sn0.r(obj26, bool5);
                if (obj26 != null) {
                    n92Var = (n92) kr1Var7.f.invoke(obj26);
                } else {
                    n92Var = null;
                }
                n92Var.getClass();
                long j = n92Var.a;
                Object obj27 = list8.get(3);
                m82 m82Var2 = m82.c;
                sl0 sl0Var10 = lr1.l;
                if (sn0.r(obj27, bool5) || obj27 == null) {
                    m82Var = null;
                } else {
                    m82Var = (m82) ((oe0) sl0Var10.f).invoke(obj27);
                }
                Object obj28 = list8.get(4);
                sl0 sl0Var11 = f2.o;
                if (sn0.r(obj28, bool5) || obj28 == null) {
                    rg1Var = null;
                } else {
                    rg1Var = (rg1) ((oe0) sl0Var11.f).invoke(obj28);
                }
                Object obj29 = list8.get(5);
                jv0 jv0Var2 = jv0.d;
                sl0 sl0Var12 = lr1.A;
                if (sn0.r(obj29, bool5) || obj29 == null) {
                    jv0Var = null;
                } else {
                    jv0Var = (jv0) ((oe0) sl0Var12.f).invoke(obj29);
                }
                Object obj30 = list8.get(6);
                sl0 sl0Var13 = f2.q;
                if (sn0.r(obj30, bool5) || obj30 == null) {
                    ev0Var = null;
                } else {
                    ev0Var = (ev0) ((oe0) sl0Var13.f).invoke(obj30);
                }
                ev0Var.getClass();
                int i6 = ev0Var.a;
                Object obj31 = list8.get(7);
                kr1 kr1Var8 = lr1.s;
                sn0.r(obj31, bool5);
                if (obj31 != null) {
                    xi0Var = (xi0) kr1Var8.f.invoke(obj31);
                } else {
                    xi0Var = null;
                }
                xi0Var.getClass();
                int i7 = xi0Var.a;
                Object obj32 = list8.get(8);
                sl0 sl0Var14 = f2.r;
                if (!sn0.r(obj32, bool5) && obj32 != null) {
                    b92Var = (b92) ((oe0) sl0Var14.f).invoke(obj32);
                }
                return new de1(i4, i5, j, m82Var, rg1Var, jv0Var, i6, i7, b92Var);
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                obj.getClass();
                List list9 = (List) obj;
                Object obj33 = list9.get(0);
                int i8 = co.h;
                Boolean bool6 = Boolean.FALSE;
                sn0.r(obj33, bool6);
                if (obj33 != null) {
                    if (obj33.equals(bool6)) {
                        coVar = new co(co.g);
                    } else {
                        coVar = new co(go.b(((Integer) obj33).intValue()));
                    }
                } else {
                    coVar = null;
                }
                coVar.getClass();
                long j2 = coVar.a;
                Object obj34 = list9.get(1);
                o92[] o92VarArr2 = n92.b;
                oe0 oe0Var = lr1.v.f;
                sn0.r(obj34, bool6);
                if (obj34 != null) {
                    n92Var2 = (n92) oe0Var.invoke(obj34);
                } else {
                    n92Var2 = null;
                }
                n92Var2.getClass();
                long j3 = n92Var2.a;
                Object obj35 = list9.get(2);
                sd0 sd0Var2 = sd0.f;
                sl0 sl0Var15 = lr1.m;
                if (sn0.r(obj35, bool6) || obj35 == null) {
                    sd0Var = null;
                } else {
                    sd0Var = (sd0) ((oe0) sl0Var15.f).invoke(obj35);
                }
                Object obj36 = list9.get(3);
                sl0 sl0Var16 = lr1.t;
                if (sn0.r(obj36, bool6) || obj36 == null) {
                    qd0Var = null;
                } else {
                    qd0Var = (qd0) ((oe0) sl0Var16.f).invoke(obj36);
                }
                Object obj37 = list9.get(4);
                sl0 sl0Var17 = lr1.u;
                if (sn0.r(obj37, bool6) || obj37 == null) {
                    rd0Var = null;
                } else {
                    rd0Var = (rd0) ((oe0) sl0Var17.f).invoke(obj37);
                }
                Object obj38 = list9.get(6);
                if (obj38 != null) {
                    str3 = (String) obj38;
                } else {
                    str3 = null;
                }
                Object obj39 = list9.get(7);
                sn0.r(obj39, bool6);
                if (obj39 != null) {
                    n92Var3 = (n92) oe0Var.invoke(obj39);
                } else {
                    n92Var3 = null;
                }
                n92Var3.getClass();
                long j4 = n92Var3.a;
                Object obj40 = list9.get(8);
                sl0 sl0Var18 = lr1.n;
                if (sn0.r(obj40, bool6) || obj40 == null) {
                    jhVar = null;
                } else {
                    jhVar = (jh) ((oe0) sl0Var18.f).invoke(obj40);
                }
                Object obj41 = list9.get(9);
                sl0 sl0Var19 = lr1.k;
                if (sn0.r(obj41, bool6) || obj41 == null) {
                    l82Var = null;
                } else {
                    l82Var = (l82) ((oe0) sl0Var19.f).invoke(obj41);
                }
                Object obj42 = list9.get(10);
                ix0 ix0Var2 = ix0.g;
                sl0 sl0Var20 = lr1.y;
                if (sn0.r(obj42, bool6) || obj42 == null) {
                    ix0Var = null;
                } else {
                    ix0Var = (ix0) ((oe0) sl0Var20.f).invoke(obj42);
                }
                Object obj43 = list9.get(11);
                sn0.r(obj43, bool6);
                if (obj43 != null) {
                    if (obj43.equals(bool6)) {
                        coVar2 = new co(co.g);
                    } else {
                        coVar2 = new co(go.b(((Integer) obj43).intValue()));
                    }
                } else {
                    coVar2 = null;
                }
                coVar2.getClass();
                long j5 = coVar2.a;
                Object obj44 = list9.get(12);
                sl0 sl0Var21 = lr1.j;
                if (sn0.r(obj44, bool6) || obj44 == null) {
                    x62Var = null;
                } else {
                    x62Var = (x62) ((oe0) sl0Var21.f).invoke(obj44);
                }
                Object obj45 = list9.get(13);
                hw1 hw1Var2 = hw1.d;
                sl0 sl0Var22 = lr1.o;
                if (!sn0.r(obj45, bool6) && obj45 != null) {
                    hw1Var = (hw1) ((oe0) sl0Var22.f).invoke(obj45);
                }
                return new m12(j2, j3, sd0Var, qd0Var, rd0Var, (g52) null, str3, j4, jhVar, l82Var, ix0Var, j5, x62Var, hw1Var, 49184);
            case 20:
                obj.getClass();
                List list10 = (List) obj;
                Object obj46 = list10.get(0);
                if (obj46 != null) {
                    bool = (Boolean) obj46;
                } else {
                    bool = null;
                }
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                Object obj47 = list10.get(1);
                sl0 sl0Var23 = f2.p;
                if (!sn0.r(obj47, Boolean.FALSE) && obj47 != null) {
                    f60Var = (f60) ((oe0) sl0Var23.f).invoke(obj47);
                }
                f60Var.getClass();
                return new rg1(f60Var.a, booleanValue);
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                obj.getClass();
                return new f60(((Integer) obj).intValue());
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                obj.getClass();
                return new ev0(((Integer) obj).intValue());
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                obj.getClass();
                List list11 = (List) obj;
                Object obj48 = list11.get(0);
                sl0 sl0Var24 = f2.s;
                if (sn0.r(obj48, Boolean.FALSE) || obj48 == null) {
                    a92Var = null;
                } else {
                    a92Var = (a92) ((oe0) sl0Var24.f).invoke(obj48);
                }
                a92Var.getClass();
                int i9 = a92Var.a;
                Object obj49 = list11.get(1);
                if (obj49 != null) {
                    bool2 = (Boolean) obj49;
                }
                bool2.getClass();
                return new b92(i9, bool2.booleanValue());
            case 24:
                obj.getClass();
                return new a92(((Integer) obj).intValue());
            case 25:
                return new fs1(((Integer) obj).intValue());
            case 26:
                wh1 wh1Var = (wh1) obj;
                if (wh1Var != null && wh1Var.a == 2) {
                    z2 = true;
                }
                return Boolean.valueOf(!z2);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                z81 z81Var = (z81) obj;
                long j6 = z81Var.a;
                if ((9223372034707292159L & j6) != 9205357640488583168L) {
                    return new jc(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (z81Var.a & 4294967295L)));
                }
                return ju1.a;
            case 28:
                jc jcVar = (jc) obj;
                float f6 = jcVar.a;
                float f7 = jcVar.b;
                return new z81((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L));
            default:
                if (obj == null) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
