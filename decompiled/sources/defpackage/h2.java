package defpackage;

import com.elixir.loader.data.api.configs.ConfigsListResponse;
import com.google.protobuf.DescriptorProtos;
import java.io.File;
import java.util.UUID;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonKt;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class h2 implements de0 {
    public final /* synthetic */ int e;

    public /* synthetic */ h2(int i) {
        this.e = i;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        SerialDescriptor descriptor$lambda$5$lambda$0;
        SerialDescriptor descriptor$lambda$5$lambda$1;
        SerialDescriptor descriptor$lambda$5$lambda$2;
        SerialDescriptor descriptor$lambda$5$lambda$3;
        SerialDescriptor descriptor$lambda$5$lambda$4;
        switch (this.e) {
            case 0:
                h0 h0Var = uk1.e;
                return Integer.valueOf(uk1.e.a().nextInt(2147418112) + 65536);
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                rc1 rc1Var = f3.a;
                return xx.a;
            case 3:
                js jsVar = hd.a;
                return cz.a;
            case 4:
                js jsVar2 = hd.a;
                return g3.A;
            case 5:
                return JsonKt.Json$default(null, new p1(7), 1, null);
            case 6:
                return new File("/data/data/com.elixir.loader/files", "elixir_executable");
            case 7:
                return new Object();
            case 8:
                return new tx0();
            case 9:
                return new i12(go.b(1308617531));
            case 10:
                y22 y22Var = sh.a;
                return null;
            case 11:
                return oo.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            case 12:
                y22 y22Var2 = oo.a;
                return Boolean.TRUE;
            case 13:
                return od2.a;
            case 14:
                y22 y22Var3 = cs.a;
                return null;
            case 15:
                vr.b("Unexpected call to default provider");
                throw new RuntimeException();
            case 16:
                return ConfigsListResponse.a();
            case 17:
                return Float.valueOf(1.0f);
            case 18:
                float f = g30.a;
                return Boolean.TRUE;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                js jsVar3 = ak0.a;
                return ay.a;
            case 20:
                y22 y22Var4 = jm0.a;
                return null;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                ei0 ei0Var = kn0.a;
                return Boolean.TRUE;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                return new f20(48.0f);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                descriptor$lambda$5$lambda$0 = JsonElementSerializer.descriptor$lambda$5$lambda$0();
                return descriptor$lambda$5$lambda$0;
            case 24:
                descriptor$lambda$5$lambda$1 = JsonElementSerializer.descriptor$lambda$5$lambda$1();
                return descriptor$lambda$5$lambda$1;
            case 25:
                descriptor$lambda$5$lambda$2 = JsonElementSerializer.descriptor$lambda$5$lambda$2();
                return descriptor$lambda$5$lambda$2;
            case 26:
                descriptor$lambda$5$lambda$3 = JsonElementSerializer.descriptor$lambda$5$lambda$3();
                return descriptor$lambda$5$lambda$3;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                descriptor$lambda$5$lambda$4 = JsonElementSerializer.descriptor$lambda$5$lambda$4();
                return descriptor$lambda$5$lambda$4;
            case 28:
                return new st0(0, 0);
            default:
                js jsVar4 = zw0.a;
                return null;
        }
    }
}
