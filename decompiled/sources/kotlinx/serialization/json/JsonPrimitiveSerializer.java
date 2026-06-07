package kotlinx.serialization.json;

import defpackage.yl1;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/json/JsonPrimitiveSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonPrimitive;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonPrimitiveSerializer implements KSerializer<JsonPrimitive> {
    public static final JsonPrimitiveSerializer INSTANCE = new JsonPrimitiveSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.json.JsonPrimitive", PrimitiveKind.STRING.INSTANCE, new SerialDescriptor[0], null, 8, null);

    private JsonPrimitiveSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public JsonPrimitive deserialize(Decoder decoder) {
        decoder.getClass();
        JsonElement decodeJsonElement = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (decodeJsonElement instanceof JsonPrimitive) {
            return (JsonPrimitive) decodeJsonElement;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonPrimitive, had " + yl1.a(decodeJsonElement.getClass()), decodeJsonElement.toString());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, JsonPrimitive value) {
        encoder.getClass();
        value.getClass();
        JsonElementSerializersKt.access$verify(encoder);
        if (value instanceof JsonNull) {
            encoder.encodeSerializableValue(JsonNullSerializer.INSTANCE, JsonNull.INSTANCE);
        } else {
            encoder.encodeSerializableValue(JsonLiteralSerializer.INSTANCE, (JsonLiteral) value);
        }
    }
}
