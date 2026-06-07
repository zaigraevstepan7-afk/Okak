package kotlinx.serialization.json;

import defpackage.h2;
import defpackage.mm0;
import defpackage.od2;
import defpackage.se;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/json/JsonElementSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonElement;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonElementSerializer implements KSerializer<JsonElement> {
    public static final JsonElementSerializer INSTANCE = new JsonElementSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], new mm0(7));

    private JsonElementSerializer() {
    }

    public static final od2 descriptor$lambda$5(ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        SerialDescriptor defer;
        SerialDescriptor defer2;
        SerialDescriptor defer3;
        SerialDescriptor defer4;
        SerialDescriptor defer5;
        classSerialDescriptorBuilder.getClass();
        defer = JsonElementSerializersKt.defer(new h2(23));
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "JsonPrimitive", defer, null, false, 12, null);
        defer2 = JsonElementSerializersKt.defer(new h2(24));
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "JsonNull", defer2, null, false, 12, null);
        defer3 = JsonElementSerializersKt.defer(new h2(25));
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "JsonLiteral", defer3, null, false, 12, null);
        defer4 = JsonElementSerializersKt.defer(new h2(26));
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "JsonObject", defer4, null, false, 12, null);
        defer5 = JsonElementSerializersKt.defer(new h2(27));
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "JsonArray", defer5, null, false, 12, null);
        return od2.a;
    }

    public static final SerialDescriptor descriptor$lambda$5$lambda$0() {
        return JsonPrimitiveSerializer.INSTANCE.getDescriptor();
    }

    public static final SerialDescriptor descriptor$lambda$5$lambda$1() {
        return JsonNullSerializer.INSTANCE.getDescriptor();
    }

    public static final SerialDescriptor descriptor$lambda$5$lambda$2() {
        return JsonLiteralSerializer.INSTANCE.getDescriptor();
    }

    public static final SerialDescriptor descriptor$lambda$5$lambda$3() {
        return JsonObjectSerializer.INSTANCE.getDescriptor();
    }

    public static final SerialDescriptor descriptor$lambda$5$lambda$4() {
        return JsonArraySerializer.INSTANCE.getDescriptor();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public JsonElement deserialize(Decoder decoder) {
        decoder.getClass();
        return JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, JsonElement value) {
        encoder.getClass();
        value.getClass();
        JsonElementSerializersKt.verify(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.encodeSerializableValue(JsonPrimitiveSerializer.INSTANCE, value);
            return;
        }
        if (value instanceof JsonObject) {
            encoder.encodeSerializableValue(JsonObjectSerializer.INSTANCE, value);
        } else if (value instanceof JsonArray) {
            encoder.encodeSerializableValue(JsonArraySerializer.INSTANCE, value);
        } else {
            se.m();
        }
    }
}
