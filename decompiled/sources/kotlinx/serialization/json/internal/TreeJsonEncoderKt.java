package kotlinx.serialization.json.internal;

import defpackage.a61;
import defpackage.de0;
import defpackage.od2;
import defpackage.sn0;
import defpackage.wl1;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\r\u001a\u00028\u0000\"\n\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"T", "Lkotlinx/serialization/json/Json;", "json", "value", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "Lkotlinx/serialization/json/JsonElement;", "writeJson", "(Lkotlinx/serialization/json/Json;Ljava/lang/Object;Lkotlinx/serialization/SerializationStrategy;)Lkotlinx/serialization/json/JsonElement;", "", "serialName", "Lkotlin/Function0;", "path", "cast", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Lde0;)Lkotlinx/serialization/json/JsonElement;", "PRIMITIVE_TAG", "Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "getRequiresTopLevelTag", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "requiresTopLevelTag", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class TreeJsonEncoderKt {
    public static final String PRIMITIVE_TAG = "primitive";

    public static /* synthetic */ od2 a(wl1 wl1Var, JsonElement jsonElement) {
        return writeJson$lambda$0(wl1Var, jsonElement);
    }

    public static final /* synthetic */ <T extends JsonElement> T cast(JsonElement jsonElement, String str, de0 de0Var) {
        jsonElement.getClass();
        str.getClass();
        de0Var.getClass();
        sn0.R();
        throw null;
    }

    public static final boolean getRequiresTopLevelTag(SerialDescriptor serialDescriptor) {
        if (!(serialDescriptor.getKind() instanceof PrimitiveKind) && serialDescriptor.getKind() != SerialKind.ENUM.INSTANCE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wl1] */
    @JsonFriendModuleApi
    public static final <T> JsonElement writeJson(Json json, T t, SerializationStrategy<? super T> serializationStrategy) {
        json.getClass();
        serializationStrategy.getClass();
        ?? obj = new Object();
        new JsonTreeEncoder(json, new a61(obj, 2)).encodeSerializableValue(serializationStrategy, t);
        Object obj2 = obj.e;
        if (obj2 != null) {
            return (JsonElement) obj2;
        }
        sn0.V("result");
        throw null;
    }

    public static final od2 writeJson$lambda$0(wl1 wl1Var, JsonElement jsonElement) {
        jsonElement.getClass();
        wl1Var.e = jsonElement;
        return od2.a;
    }
}
