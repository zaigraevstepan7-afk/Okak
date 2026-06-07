package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.protobuf.DescriptorProtos;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.builtins.InstantComponentSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class mm0 implements oe0 {
    public final /* synthetic */ int e;

    public /* synthetic */ mm0(int i, mt0 mt0Var) {
        this.e = 11;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        boolean z = true;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return InstantComponentSerializer.a((ClassSerialDescriptorBuilder) obj);
            case 1:
                if (((Character) obj).charValue() != '-') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (((Character) obj).charValue() != '-') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (((Character) obj).charValue() != ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (((Character) obj).charValue() != ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                char charValue2 = ((Character) obj).charValue();
                if ('0' > charValue2 || charValue2 >= ':') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                return JsonElementSerializer.a((ClassSerialDescriptorBuilder) obj);
            case 8:
                return JsonObject.a((Map.Entry) obj);
            case 9:
                ((Integer) obj).getClass();
                return null;
            case 10:
                List list = (List) obj;
                return new st0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 11:
                return od2Var;
            case 12:
                return od2Var;
            case 13:
                return od2Var;
            case 14:
                return od2Var;
            case 15:
                float f = cw0.a;
                return od2Var;
            case 16:
                ((String) obj).getClass();
                return od2Var;
            case 17:
                ((Long) obj).getClass();
                return od2Var;
            case 18:
                int i2 = x11.b;
                return Boolean.TRUE;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                xu1.g((av1) obj);
                return od2Var;
            case 20:
                ep0[] ep0VarArr = xu1.a;
                ((av1) obj).a(vu1.x, od2Var);
                return od2Var;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                zd1 zd1Var = (zd1) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(zd1Var.b);
                sb.append(", ");
                return l90.o(sb, zd1Var.c, ')');
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                nv nvVar = (nv) obj;
                nvVar.getClass();
                return new e51(c01.t(nvVar));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new ah(c01.t((nv) obj));
            case 24:
                Context context = (Context) obj;
                context.getClass();
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
            case 25:
                r51 r51Var = (r51) obj;
                r51Var.getClass();
                w51 w51Var = r51Var.g;
                if (w51Var == null || w51Var.j.c != r51Var.f.a) {
                    return null;
                }
                return w51Var;
            case 26:
                r51 r51Var2 = (r51) obj;
                r51Var2.getClass();
                w51 w51Var2 = r51Var2.g;
                if (w51Var2 == null || w51Var2.j.c != r51Var2.f.a) {
                    return null;
                }
                return w51Var2;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                r51 r51Var3 = (r51) obj;
                r51Var3.getClass();
                return Integer.valueOf(r51Var3.f.a);
            case 28:
                ((nv) obj).getClass();
                return new k51();
            default:
                r51 r51Var4 = (r51) obj;
                r51Var4.getClass();
                return r51Var4.g;
        }
    }

    public /* synthetic */ mm0(int i) {
        this.e = i;
    }
}
