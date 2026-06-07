package kotlinx.serialization.json;

import defpackage.oe0;
import defpackage.sn0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a$\u0010\u000b\u001a\u00020\n\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a$\u0010\u000e\u001a\u00028\u0000\"\u0006\b\u0000\u0010\b\u0018\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/json/Json;", "from", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonBuilder;", "Lod2;", "builderAction", "Json", "(Lkotlinx/serialization/json/Json;Loe0;)Lkotlinx/serialization/json/Json;", "T", "value", "Lkotlinx/serialization/json/JsonElement;", "encodeToJsonElement", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "json", "decodeFromJsonElement", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "", "defaultIndent", "Ljava/lang/String;", "defaultDiscriminator", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonKt {
    private static final String defaultDiscriminator = "type";
    private static final String defaultIndent = "    ";

    public static final Json Json(Json json, oe0 oe0Var) {
        json.getClass();
        oe0Var.getClass();
        JsonBuilder jsonBuilder = new JsonBuilder(json);
        oe0Var.invoke(jsonBuilder);
        return new JsonImpl(jsonBuilder.build$kotlinx_serialization_json(), jsonBuilder.getSerializersModule());
    }

    public static /* synthetic */ Json Json$default(Json json, oe0 oe0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            json = Json.INSTANCE;
        }
        return Json(json, oe0Var);
    }

    public static final /* synthetic */ <T> T decodeFromJsonElement(Json json, JsonElement jsonElement) {
        json.getClass();
        jsonElement.getClass();
        json.getSerializersModule();
        sn0.R();
        throw null;
    }

    public static final /* synthetic */ <T> JsonElement encodeToJsonElement(Json json, T t) {
        json.getClass();
        json.getSerializersModule();
        sn0.R();
        throw null;
    }
}
