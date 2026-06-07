package defpackage;

import androidx.window.extensions.layout.WindowLayoutComponent;
import com.google.protobuf.DescriptorProtos;
import java.util.LinkedHashMap;
import java.util.UUID;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ax0 implements de0 {
    public final /* synthetic */ int e;

    public /* synthetic */ ax0(int i) {
        this.e = i;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        jq1 jq1Var;
        WindowLayoutComponent a;
        Object obj;
        Object obj2 = null;
        switch (this.e) {
            case 0:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 1:
                js jsVar = cx0.a;
                return null;
            case 2:
                js jsVar2 = dx0.a;
                return null;
            case 3:
                y22 y22Var = ex0.a;
                return g3.M;
            case 4:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 5:
                js jsVar3 = gx0.a;
                return null;
            case 6:
                js jsVar4 = jx0.a;
                return h32.b;
            case 7:
                y22 y22Var2 = b01.a;
                return Boolean.FALSE;
            case 8:
                return s21.a;
            case 9:
                return UUID.randomUUID();
            case 10:
                return new dr1();
            case 11:
                hl0 hl0Var = new hl0(0);
                hl0Var.a(yl1.a(e51.class), new mm0(22));
                return hl0Var.b();
            case 12:
                return new fc1();
            case 13:
                vy vyVar = k10.a;
                return ny.g;
            case 14:
                int i = di1.a;
                return Boolean.FALSE;
            case 15:
                return new qk1(new ya(Float.valueOf(0.0f), f2.A, obj2, 12));
            case 16:
                return new uo1();
            case 17:
                return new mq1(new LinkedHashMap());
            case 18:
                y22 y22Var3 = qq1.a;
                return null;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return new fs1(0);
            case 20:
                js jsVar5 = ku1.a;
                return null;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                return new ow1();
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                return new f20(0.0f);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                js jsVar6 = r62.a;
                return null;
            case 24:
                return tc2.a;
            case 25:
                return f92.b;
            case 26:
                c12 c12Var = new c12(new nv1(18));
                c12Var.d();
                return c12Var;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return new pc2(sc2.d, sc2.e, sc2.f, sc2.g, sc2.h, sc2.i, sc2.m, sc2.n, sc2.o, sc2.a, sc2.b, sc2.c, sc2.j, sc2.k, sc2.l);
            case 28:
                try {
                    ClassLoader classLoader = rh2.class.getClassLoader();
                    if (classLoader != null) {
                        jq1Var = new jq1(classLoader, new bt(classLoader, 0));
                    } else {
                        jq1Var = null;
                    }
                    if (jq1Var == null || (a = jq1Var.a()) == null) {
                        return null;
                    }
                    bt btVar = new bt(classLoader, 0);
                    int a2 = s80.a();
                    if (a2 >= 9) {
                        obj = new p80(a, btVar);
                    } else if (a2 >= 6) {
                        obj = new p80(a, btVar);
                    } else if (a2 >= 2) {
                        obj = new p80(a, btVar);
                    } else if (a2 == 1) {
                        obj = new o80(a, btVar);
                    } else {
                        obj = new Object();
                    }
                    return obj;
                } catch (Throwable unused) {
                    return null;
                }
            default:
                js jsVar7 = ij2.a;
                return Boolean.FALSE;
        }
    }
}
