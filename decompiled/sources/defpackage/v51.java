package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class v51 implements oe0 {
    public final /* synthetic */ int e;

    public /* synthetic */ v51(int i) {
        this.e = i;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        m12 m12Var;
        m12 m12Var2;
        m12 m12Var3;
        List list;
        n92 n92Var;
        Integer num;
        co coVar;
        z81 z81Var;
        String str;
        int i = this.e;
        od2 od2Var = od2.a;
        m12 m12Var4 = null;
        r4 = null;
        z82 z82Var = null;
        Float f = null;
        Integer num2 = null;
        n92 n92Var2 = null;
        String str2 = null;
        m12Var4 = null;
        switch (i) {
            case 0:
                r51 r51Var = (r51) obj;
                r51Var.getClass();
                if (!(r51Var instanceof w51)) {
                    return null;
                }
                z51 z51Var = ((w51) r51Var).j;
                return z51Var.a(z51Var.c);
            case 1:
                return ((d51) obj).j;
            case 2:
                r51 r51Var2 = ((d51) ((pb) obj).c()).f;
                r51Var2.getClass();
                int i2 = r51.i;
                for (r51 r51Var3 : fp.B((vq) r51Var2)) {
                }
                return null;
            case 3:
                dc2 dc2Var = u61.a;
                return Boolean.TRUE;
            case 4:
                xu1.e((av1) obj, 4);
                return od2Var;
            case 5:
                s8 s8Var = ((s71) obj).a;
                if (s8Var != null) {
                    s8Var.invoke();
                }
                return od2Var;
            case 6:
                return od2Var;
            case 7:
                sf1 sf1Var = (sf1) obj;
                int i3 = e8.a;
                y22 y22Var = l6.b;
                sf1Var.getClass();
                Context context = (Context) xn.M(sf1Var, y22Var);
                c00 c00Var = (c00) xn.M(sf1Var, is.h);
                fc1 fc1Var = (fc1) xn.M(sf1Var, gc1.a);
                if (fc1Var == null) {
                    return null;
                }
                return new k7(context, c00Var, fc1Var.a, fc1Var.b);
            case 8:
                Context context2 = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i4);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str3 = activityInfo.permission;
                            if (str3 != null && context2.checkSelfPermission(str3) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            case 9:
                yp0 yp0Var = (yp0) obj;
                yp0Var.a = 6000;
                Float valueOf = Float.valueOf(90.0f);
                yp0Var.a(300, valueOf).b = v21.b;
                yp0Var.a(1500, valueOf);
                Float valueOf2 = Float.valueOf(180.0f);
                yp0Var.a(1800, valueOf2);
                yp0Var.a(3000, valueOf2);
                Float valueOf3 = Float.valueOf(270.0f);
                yp0Var.a(3300, valueOf3);
                yp0Var.a(4500, valueOf3);
                Float valueOf4 = Float.valueOf(360.0f);
                yp0Var.a(4800, valueOf4);
                yp0Var.a(6000, valueOf4);
                return od2Var;
            case 10:
                xu1.d((av1) obj, kj1.c);
                return od2Var;
            case 11:
                cr0 cr0Var = (cr0) obj;
                ld ldVar = cr0Var.e.f;
                long k = ldVar.k();
                ldVar.h().h();
                try {
                    ((ld) ((rg2) ldVar.f).f).h().n(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    cr0Var.b();
                    return od2Var;
                } finally {
                    l90.v(ldVar, k);
                }
            case 12:
                Float f2 = (Float) obj;
                f2.getClass();
                return new qk1(new ya(f2, f2.A, null, 12));
            case 13:
                zm1 zm1Var = (zm1) obj;
                zm1Var.getClass();
                return zm1Var.c;
            case 14:
                zm1 zm1Var2 = (zm1) obj;
                zm1Var2.getClass();
                return zm1Var2.c;
            case 15:
                Integer num3 = (Integer) obj;
                num3.intValue();
                return num3;
            case 16:
                List list2 = (List) obj;
                list2.getClass();
                return ((zm1) wn.g0(list2)).c;
            case 17:
                return new mq1((Map) obj);
            case 18:
                return obj;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                obj.getClass();
                List list3 = (List) obj;
                Object obj2 = list3.get(0);
                oe0 oe0Var = (oe0) lr1.h.f;
                Boolean bool = Boolean.FALSE;
                if (sn0.r(obj2, bool) || obj2 == null) {
                    m12Var = null;
                } else {
                    m12Var = (m12) oe0Var.invoke(obj2);
                }
                Object obj3 = list3.get(1);
                if (sn0.r(obj3, bool) || obj3 == null) {
                    m12Var2 = null;
                } else {
                    m12Var2 = (m12) oe0Var.invoke(obj3);
                }
                Object obj4 = list3.get(2);
                if (sn0.r(obj4, bool) || obj4 == null) {
                    m12Var3 = null;
                } else {
                    m12Var3 = (m12) oe0Var.invoke(obj4);
                }
                Object obj5 = list3.get(3);
                if (!sn0.r(obj5, bool) && obj5 != null) {
                    m12Var4 = (m12) oe0Var.invoke(obj5);
                }
                return new z82(m12Var, m12Var2, m12Var3, m12Var4);
            case 20:
                obj.getClass();
                List list4 = (List) obj;
                Object obj6 = list4.get(1);
                sl0 sl0Var = lr1.a;
                if (sn0.r(obj6, Boolean.FALSE) || obj6 == null) {
                    list = null;
                } else {
                    list = (List) ((oe0) sl0Var.f).invoke(obj6);
                }
                Object obj7 = list4.get(0);
                if (obj7 != null) {
                    str2 = (String) obj7;
                }
                str2.getClass();
                return new rc(list, str2);
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                obj.getClass();
                return new x62(((Integer) obj).intValue());
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                obj.getClass();
                List list5 = (List) obj;
                return new l82(((Number) list5.get(0)).floatValue(), ((Number) list5.get(1)).floatValue());
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                obj.getClass();
                List list6 = (List) obj;
                Object obj8 = list6.get(0);
                o92[] o92VarArr = n92.b;
                oe0 oe0Var2 = lr1.v.f;
                Boolean bool2 = Boolean.FALSE;
                sn0.r(obj8, bool2);
                if (obj8 != null) {
                    n92Var = (n92) oe0Var2.invoke(obj8);
                } else {
                    n92Var = null;
                }
                n92Var.getClass();
                long j = n92Var.a;
                Object obj9 = list6.get(1);
                sn0.r(obj9, bool2);
                if (obj9 != null) {
                    n92Var2 = (n92) oe0Var2.invoke(obj9);
                }
                n92Var2.getClass();
                return new m82(j, n92Var2.a);
            case 24:
                obj.getClass();
                return new sd0(((Integer) obj).intValue());
            case 25:
                obj.getClass();
                return new jh(((Float) obj).floatValue());
            case 26:
                obj.getClass();
                List list7 = (List) obj;
                Object obj10 = list7.get(0);
                if (obj10 != null) {
                    num = (Integer) obj10;
                } else {
                    num = null;
                }
                num.getClass();
                int intValue = num.intValue();
                Object obj11 = list7.get(1);
                if (obj11 != null) {
                    num2 = (Integer) obj11;
                }
                num2.getClass();
                return new d92(fr1.a(intValue, num2.intValue()));
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                obj.getClass();
                List list8 = (List) obj;
                Object obj12 = list8.get(0);
                int i5 = co.h;
                Boolean bool3 = Boolean.FALSE;
                sn0.r(obj12, bool3);
                if (obj12 != null) {
                    if (sn0.r(obj12, Boolean.FALSE)) {
                        coVar = new co(co.g);
                    } else {
                        coVar = new co(go.b(((Integer) obj12).intValue()));
                    }
                } else {
                    coVar = null;
                }
                coVar.getClass();
                long j2 = coVar.a;
                Object obj13 = list8.get(1);
                kr1 kr1Var = lr1.x;
                sn0.r(obj13, bool3);
                if (obj13 != null) {
                    z81Var = (z81) kr1Var.f.invoke(obj13);
                } else {
                    z81Var = null;
                }
                z81Var.getClass();
                long j3 = z81Var.a;
                Object obj14 = list8.get(2);
                if (obj14 != null) {
                    f = (Float) obj14;
                }
                f.getClass();
                return new hw1(f.floatValue(), j2, j3);
            case 28:
                obj.getClass();
                return new b62(((Integer) obj).intValue());
            default:
                obj.getClass();
                List list9 = (List) obj;
                Object obj15 = list9.get(0);
                if (obj15 != null) {
                    str = (String) obj15;
                } else {
                    str = null;
                }
                str.getClass();
                Object obj16 = list9.get(1);
                sl0 sl0Var2 = lr1.i;
                if (!sn0.r(obj16, Boolean.FALSE) && obj16 != null) {
                    z82Var = (z82) ((oe0) sl0Var2.f).invoke(obj16);
                }
                return new rv0(str, z82Var);
        }
    }
}
