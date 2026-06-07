package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.protobuf.DescriptorProtos;
import java.util.List;
import kotlinx.serialization.json.JsonBuilder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 implements oe0 {
    public final /* synthetic */ int e;

    public /* synthetic */ p1(int i) {
        this.e = i;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                e21 e21Var = r1.a;
                return od2.a;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
            case 2:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 3:
                return Boolean.TRUE;
            case 4:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 5:
                return Boolean.TRUE;
            case 6:
                return Boolean.valueOf(!(((nc) obj) instanceof de1));
            case 7:
                JsonBuilder jsonBuilder = (JsonBuilder) obj;
                jsonBuilder.getClass();
                jsonBuilder.setIgnoreUnknownKeys(true);
                jsonBuilder.setCoerceInputValues(true);
                jsonBuilder.setEncodeDefaults(true);
                return od2.a;
            case 8:
                ((pb) obj).getClass();
                return x60.a(mp0.P(300, 6, null), 2).a(x60.c(mp0.P(300, 6, null), 0.95f));
            case 9:
                ((pb) obj).getClass();
                return x60.b(mp0.P(200, 6, null), 2).a(x60.d(mp0.P(200, 6, null)));
            case 10:
                ((pb) obj).getClass();
                return x60.a(mp0.P(300, 6, null), 2).a(x60.c(mp0.P(300, 6, null), 0.95f));
            case 11:
                ((pb) obj).getClass();
                return x60.b(mp0.P(200, 6, null), 2).a(x60.d(mp0.P(200, 6, null)));
            case 12:
                m61 m61Var = (m61) obj;
                m61Var.getClass();
                m61Var.a("main");
                m61Var.b = -1;
                od2 od2Var = od2.a;
                m61Var.d = true;
                m61Var.e = false;
                return od2Var;
            case 13:
                m61 m61Var2 = (m61) obj;
                m61Var2.getClass();
                m61Var2.a("login");
                m61Var2.b = -1;
                od2 od2Var2 = od2.a;
                m61Var2.d = true;
                m61Var2.e = false;
                return od2Var2;
            case 14:
                int i = ph.a;
                return od2.a;
            case 15:
                ((cr0) obj).b();
                return od2.a;
            case 16:
                sf1 sf1Var = (sf1) obj;
                y22 y22Var = l6.b;
                sf1Var.getClass();
                if (!((Context) xn.M(sf1Var, y22Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    xj.a.getClass();
                    return wj.c;
                }
                return zj.b;
            case 17:
                xu1.e((av1) obj, 0);
                return od2.a;
            case 18:
                xu1.e((av1) obj, 0);
                return od2.a;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                ub2 ub2Var = (ub2) obj;
                ub2Var.getClass();
                le1 le1Var = (le1) ub2Var;
                le1Var.t = false;
                xp1.m(le1Var);
                return Boolean.FALSE;
            case 20:
                vu vuVar = (vu) obj;
                if (!(vuVar instanceof zu)) {
                    return null;
                }
                return (zu) vuVar;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                ((Context) obj).getClass();
                return l60.e;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new uy(intValue, ((Float) obj3).floatValue(), new yd(1, list));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                xu1.g((av1) obj);
                return od2.a;
            case 24:
                return Boolean.TRUE;
            case 25:
                float floatValue = ((Float) obj).floatValue();
                dc2 dc2Var = u61.a;
                return Float.valueOf(floatValue * 0.5f);
            case 26:
                xu1.e((av1) obj, 0);
                return od2.a;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                synchronized (q02.c) {
                    List list2 = q02.i;
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((oe0) list2.get(i2)).invoke(obj);
                    }
                }
                return od2.a;
            case 28:
                xu1.e((av1) obj, 0);
                return od2.a;
            default:
                return od2.a;
        }
    }
}
