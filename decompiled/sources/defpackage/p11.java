package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class p11 implements se0 {
    public final /* synthetic */ int e;

    public /* synthetic */ p11(int i) {
        this.e = i;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        Bundle bundle = null;
        boolean z = false;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                ((Integer) obj2).getClass();
                urVar.X(-511854661);
                cj cjVar = cj.a;
                WeakHashMap weakHashMap = pi2.w;
                cv0 cv0Var = new cv0(wm1.j(urVar).l, 48);
                urVar.p(false);
                return cv0Var;
            case 1:
                c61 c61Var = (c61) obj2;
                j51 j51Var = c61Var.b;
                LinkedHashMap linkedHashMap = j51Var.m;
                te teVar = j51Var.f;
                LinkedHashMap linkedHashMap2 = j51Var.l;
                ArrayList arrayList = new ArrayList();
                Bundle v = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                for (Map.Entry entry : tz0.f0(j51Var.s.a).entrySet()) {
                    ((g71) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundle = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                    fr1.o(v, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", v);
                }
                if (!teVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator<E> it = teVar.iterator();
                    while (it.hasNext()) {
                        d51 d51Var = (d51) it.next();
                        d51Var.getClass();
                        int i2 = d51Var.f.f.a;
                        String str = d51Var.j;
                        f51 f51Var = d51Var.l;
                        Bundle a = f51Var.a();
                        Bundle v2 = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                        f51Var.h.y(v2);
                        Bundle v3 = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                        str.getClass();
                        v3.putString("nav-entry-state:id", str);
                        v3.putInt("nav-entry-state:destination-id", i2);
                        if (a == null) {
                            a = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                        }
                        v3.putBundle("nav-entry-state:args", a);
                        v3.putBundle("nav-entry-state:saved-state", v2);
                        arrayList2.add(v3);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        int i4 = i3 + 1;
                        iArr[i3] = intValue;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList3.add(str2);
                        i3 = i4;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    fr1.o(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        te teVar2 = (te) entry3.getValue();
                        arrayList4.add(str3);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it2 = teVar2.iterator();
                        while (it2.hasNext()) {
                            f8 f8Var = ((g51) it2.next()).a;
                            f8Var.getClass();
                            Bundle v4 = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                            String str4 = (String) f8Var.b;
                            str4.getClass();
                            v4.putString("nav-entry-state:id", str4);
                            v4.putInt("nav-entry-state:destination-id", f8Var.a);
                            Bundle bundle2 = (Bundle) f8Var.c;
                            if (bundle2 == null) {
                                bundle2 = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                            }
                            v4.putBundle("nav-entry-state:args", bundle2);
                            Bundle bundle3 = (Bundle) f8Var.d;
                            bundle3.getClass();
                            v4.putBundle("nav-entry-state:saved-state", bundle3);
                            arrayList5.add(v4);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str3, arrayList5);
                    }
                    fr1.o(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (c61Var.e) {
                    if (bundle == null) {
                        bundle = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", c61Var.e);
                }
                return bundle;
            case 2:
                oe1 oe1Var = (oe1) obj;
                oe1Var.getClass();
                ((n90) obj2).getClass();
                return new ay1(wc0.k(oe1Var.e.r(), true).e.r());
            case 3:
                return Integer.valueOf(((e01) obj).Y(((Integer) obj2).intValue()));
            case 4:
                return Integer.valueOf(((e01) obj).s(((Integer) obj2).intValue()));
            case 5:
                return Integer.valueOf(((e01) obj).c(((Integer) obj2).intValue()));
            case 6:
                return Integer.valueOf(((e01) obj).n(((Integer) obj2).intValue()));
            case 7:
                return (Float) ((qk1) obj2).a.d();
            case 8:
                ((Integer) obj2).getClass();
                bf.f(lo.b0(1), (ur) obj);
                return od2Var;
            case 9:
                ((Integer) obj2).getClass();
                bf.k(lo.b0(1), (ur) obj);
                return od2Var;
            case 10:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 11:
                mq1 mq1Var = (mq1) obj2;
                Map map = mq1Var.e;
                i41 i41Var = mq1Var.f;
                Object[] objArr = i41Var.b;
                Object[] objArr2 = i41Var.c;
                long[] jArr = i41Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj3 = objArr[i8];
                                    Map d = ((oq1) objArr2[i8]).d();
                                    if (d.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, d);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 12:
                return obj2;
            case 13:
                rc rcVar = (rc) obj2;
                return xn.p(rcVar.f, lr1.a(rcVar.e, lr1.a, (kq1) obj));
            case 14:
                return Integer.valueOf(((x62) obj2).a);
            case 15:
                l82 l82Var = (l82) obj2;
                return xn.p(Float.valueOf(l82Var.a), Float.valueOf(l82Var.b));
            case 16:
                kq1 kq1Var = (kq1) obj;
                m82 m82Var = (m82) obj2;
                n92 n92Var = new n92(m82Var.a);
                kr1 kr1Var = lr1.v;
                return xn.p(lr1.a(n92Var, kr1Var, kq1Var), lr1.a(new n92(m82Var.b), kr1Var, kq1Var));
            case 17:
                return Integer.valueOf(((sd0) obj2).e);
            case 18:
                rv0 rv0Var = (rv0) obj2;
                return xn.p(rv0Var.a, lr1.a(rv0Var.b, lr1.i, (kq1) obj));
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return Float.valueOf(((jh) obj2).a);
            case 20:
                kq1 kq1Var2 = (kq1) obj;
                List list = (List) obj2;
                ArrayList arrayList6 = new ArrayList(list.size());
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList6.add(lr1.a((qc) list.get(i9), lr1.b, kq1Var2));
                }
                return arrayList6;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                d92 d92Var = (d92) obj2;
                return xn.p(Integer.valueOf((int) (d92Var.a >> 32)), Integer.valueOf((int) (d92Var.a & 4294967295L)));
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                kq1 kq1Var3 = (kq1) obj;
                hw1 hw1Var = (hw1) obj2;
                return xn.p(lr1.a(new co(hw1Var.a), lr1.p, kq1Var3), lr1.a(new z81(hw1Var.b), lr1.x, kq1Var3), Float.valueOf(hw1Var.c));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return Integer.valueOf(((b62) obj2).a);
            case 24:
                return Integer.valueOf(((a72) obj2).a);
            case 25:
                return Integer.valueOf(((xi0) obj2).a);
            case 26:
                return Integer.valueOf(((qd0) obj2).a);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return Integer.valueOf(((rd0) obj2).a);
            case 28:
                kq1 kq1Var4 = (kq1) obj;
                n92 n92Var2 = (n92) obj2;
                long j2 = n92.c;
                if (n92Var2 != null) {
                    z = n92.a(n92Var2.a, j2);
                }
                if (z) {
                    return Boolean.FALSE;
                }
                return xn.p(Float.valueOf(n92.c(n92Var2.a)), lr1.a(new o92(n92.b(n92Var2.a)), lr1.w, kq1Var4));
            default:
                qv0 qv0Var = (qv0) obj2;
                return xn.p(qv0Var.a, lr1.a(qv0Var.b, lr1.i, (kq1) obj));
        }
    }

    public /* synthetic */ p11(int i, int i2) {
        this.e = i2;
    }
}
