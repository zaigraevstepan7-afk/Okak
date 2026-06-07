package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersCacheKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ir1 implements se0 {
    public final /* synthetic */ int e;

    public /* synthetic */ ir1(int i) {
        this.e = i;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        tc tcVar;
        Object a;
        KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3;
        KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5;
        int i = this.e;
        od2 od2Var = od2.a;
        boolean z = false;
        boolean z2 = false;
        switch (i) {
            case 0:
                long j = ((o92) obj2).a;
                if (o92.a(j, 8589934592L)) {
                    return 0;
                }
                if (o92.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 1:
                z81 z81Var = (z81) obj2;
                if (z81Var != null) {
                    z = z81.b(z81Var.a, 9205357640488583168L);
                }
                if (z) {
                    return Boolean.FALSE;
                }
                return xn.p(Float.valueOf(Float.intBitsToFloat((int) (z81Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (z81Var.a & 4294967295L))));
            case 2:
                kq1 kq1Var = (kq1) obj;
                qc qcVar = (qc) obj2;
                Object obj3 = qcVar.a;
                if (obj3 instanceof de1) {
                    tcVar = tc.e;
                } else if (obj3 instanceof m12) {
                    tcVar = tc.f;
                } else if (obj3 instanceof bf2) {
                    tcVar = tc.g;
                } else if (obj3 instanceof yd2) {
                    tcVar = tc.h;
                } else if (obj3 instanceof rv0) {
                    tcVar = tc.i;
                } else if (obj3 instanceof qv0) {
                    tcVar = tc.j;
                } else if (obj3 instanceof c32) {
                    tcVar = tc.k;
                } else {
                    throw new UnsupportedOperationException();
                }
                switch (tcVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        a = lr1.a((de1) obj3, lr1.g, kq1Var);
                        break;
                    case 1:
                        obj3.getClass();
                        a = lr1.a((m12) obj3, lr1.h, kq1Var);
                        break;
                    case 2:
                        obj3.getClass();
                        a = lr1.a((bf2) obj3, lr1.c, kq1Var);
                        break;
                    case 3:
                        obj3.getClass();
                        a = lr1.a((yd2) obj3, lr1.d, kq1Var);
                        break;
                    case 4:
                        obj3.getClass();
                        a = lr1.a((rv0) obj3, lr1.e, kq1Var);
                        break;
                    case 5:
                        obj3.getClass();
                        a = lr1.a((qv0) obj3, lr1.f, kq1Var);
                        break;
                    case 6:
                        obj3.getClass();
                        a = ((c32) obj3).a;
                        break;
                    default:
                        se.m();
                        return null;
                }
                return xn.p(tcVar, a, Integer.valueOf(qcVar.b), Integer.valueOf(qcVar.c), qcVar.d);
            case 3:
                kq1 kq1Var2 = (kq1) obj;
                List list = ((ix0) obj2).e;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(lr1.a((hx0) list.get(i2), lr1.z, kq1Var2));
                }
                return arrayList;
            case 4:
                return ((hx0) obj2).a.toLanguageTag();
            case 5:
                kq1 kq1Var3 = (kq1) obj;
                jv0 jv0Var = (jv0) obj2;
                return xn.p(lr1.a(new gv0(jv0Var.a), lr1.B, kq1Var3), lr1.a(new iv0(jv0Var.b), lr1.C, kq1Var3), lr1.a(new hv0(jv0Var.c), lr1.D, kq1Var3));
            case 6:
                return Float.valueOf(((gv0) obj2).a);
            case 7:
                return Integer.valueOf(((iv0) obj2).a);
            case 8:
                return Integer.valueOf(((hv0) obj2).a);
            case 9:
                return ((bf2) obj2).a;
            case 10:
                kq1 kq1Var4 = (kq1) obj;
                de1 de1Var = (de1) obj2;
                Object a2 = lr1.a(new b62(de1Var.a), lr1.q, kq1Var4);
                Object a3 = lr1.a(new a72(de1Var.b), lr1.r, kq1Var4);
                Object a4 = lr1.a(new n92(de1Var.c), lr1.v, kq1Var4);
                m82 m82Var = de1Var.d;
                m82 m82Var2 = m82.c;
                Object a5 = lr1.a(m82Var, lr1.l, kq1Var4);
                Object a6 = lr1.a(de1Var.e, f2.o, kq1Var4);
                jv0 jv0Var2 = de1Var.f;
                jv0 jv0Var3 = jv0.d;
                return xn.p(a2, a3, a4, a5, a6, lr1.a(jv0Var2, lr1.A, kq1Var4), lr1.a(new ev0(de1Var.g), f2.q, kq1Var4), lr1.a(new xi0(de1Var.h), lr1.s, kq1Var4), lr1.a(de1Var.i, f2.r, kq1Var4));
            case 11:
                return ((yd2) obj2).a;
            case 12:
                kq1 kq1Var5 = (kq1) obj;
                m12 m12Var = (m12) obj2;
                co coVar = new co(m12Var.a.a());
                kr1 kr1Var = lr1.p;
                Object a7 = lr1.a(coVar, kr1Var, kq1Var5);
                n92 n92Var = new n92(m12Var.b);
                kr1 kr1Var2 = lr1.v;
                Object a8 = lr1.a(n92Var, kr1Var2, kq1Var5);
                sd0 sd0Var = m12Var.c;
                sd0 sd0Var2 = sd0.f;
                Object a9 = lr1.a(sd0Var, lr1.m, kq1Var5);
                Object a10 = lr1.a(m12Var.d, lr1.t, kq1Var5);
                Object a11 = lr1.a(m12Var.e, lr1.u, kq1Var5);
                String str = m12Var.g;
                Object a12 = lr1.a(new n92(m12Var.h), kr1Var2, kq1Var5);
                Object a13 = lr1.a(m12Var.i, lr1.n, kq1Var5);
                Object a14 = lr1.a(m12Var.j, lr1.k, kq1Var5);
                ix0 ix0Var = m12Var.k;
                ix0 ix0Var2 = ix0.g;
                Object a15 = lr1.a(ix0Var, lr1.y, kq1Var5);
                Object a16 = lr1.a(new co(m12Var.l), kr1Var, kq1Var5);
                Object a17 = lr1.a(m12Var.m, lr1.j, kq1Var5);
                hw1 hw1Var = m12Var.n;
                hw1 hw1Var2 = hw1.d;
                return xn.p(a7, a8, a9, a10, a11, -1, str, a12, a13, a14, a15, a16, a17, lr1.a(hw1Var, lr1.o, kq1Var5));
            case 13:
                kq1 kq1Var6 = (kq1) obj;
                z82 z82Var = (z82) obj2;
                m12 m12Var2 = z82Var.a;
                sl0 sl0Var = lr1.h;
                return xn.p(lr1.a(m12Var2, sl0Var, kq1Var6), lr1.a(z82Var.b, sl0Var, kq1Var6), lr1.a(z82Var.c, sl0Var, kq1Var6), lr1.a(z82Var.d, sl0Var, kq1Var6));
            case 14:
                rg1 rg1Var = (rg1) obj2;
                Boolean valueOf = Boolean.valueOf(rg1Var.a);
                sl0 sl0Var2 = lr1.a;
                return xn.p(valueOf, lr1.a(new f60(rg1Var.b), f2.p, (kq1) obj));
            case 15:
                return Integer.valueOf(((f60) obj2).a);
            case 16:
                return Integer.valueOf(((ev0) obj2).a);
            case 17:
                b92 b92Var = (b92) obj2;
                return xn.p(lr1.a(new a92(b92Var.a), f2.s, (kq1) obj), Boolean.valueOf(b92Var.b));
            case 18:
                return Integer.valueOf(((a92) obj2).a);
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return Integer.valueOf(((fs1) obj2).a.g());
            case 20:
                PARAMETRIZED_SERIALIZERS_CACHE$lambda$3 = SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE$lambda$3((to0) obj, (List) obj2);
                return PARAMETRIZED_SERIALIZERS_CACHE$lambda$3;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5 = SerializersCacheKt.PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5((to0) obj, (List) obj2);
                return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                return ((ex1) obj2).c();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                rx.f(lo.b0(1), (ur) obj);
                return od2Var;
            case 24:
                ((Integer) obj2).getClass();
                rx.e(lo.b0(1), (ur) obj);
                return od2Var;
            case 25:
                ((Integer) obj2).getClass();
                rx.k(lo.b0(1), (ur) obj);
                return od2Var;
            case 26:
                u72 u72Var = (u72) obj2;
                Float valueOf2 = Float.valueOf(u72Var.a.g());
                if (((sb1) u72Var.f.getValue()) == sb1.e) {
                    z2 = true;
                }
                return xn.F(valueOf2, Boolean.valueOf(z2));
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return obj;
            case 28:
                if (obj == null) {
                } else {
                    se.s();
                }
                return null;
            default:
                return (u92) obj;
        }
    }

    public /* synthetic */ ir1(int i, int i2) {
        this.e = i2;
    }
}
