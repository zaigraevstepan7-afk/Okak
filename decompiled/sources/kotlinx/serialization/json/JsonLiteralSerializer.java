package kotlinx.serialization.json;

import defpackage.yl1;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.internal.JsonExceptionsKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/json/JsonLiteralSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonLiteral;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonLiteral;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonLiteral;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonLiteralSerializer implements KSerializer<JsonLiteral> {
    public static final JsonLiteralSerializer INSTANCE = new JsonLiteralSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", PrimitiveKind.STRING.INSTANCE);

    private JsonLiteralSerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public JsonLiteral deserialize(Decoder decoder) {
        decoder.getClass();
        JsonElement decodeJsonElement = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
        if (decodeJsonElement instanceof JsonLiteral) {
            return (JsonLiteral) decodeJsonElement;
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonLiteral, had " + yl1.a(decodeJsonElement.getClass()), decodeJsonElement.toString());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    @Override // kotlinx.serialization.SerializationStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serialize(kotlinx.serialization.encoding.Encoder r4, kotlinx.serialization.json.JsonLiteral r5) {
        /*
            r3 = this;
            r4.getClass()
            r5.getClass()
            kotlinx.serialization.json.JsonElementSerializersKt.access$verify(r4)
            boolean r3 = r5.getIsString()
            if (r3 == 0) goto L17
            java.lang.String r3 = r5.getContent()
            r4.encodeString(r3)
            return
        L17:
            kotlinx.serialization.descriptors.SerialDescriptor r3 = r5.getCoerceToInlineType()
            if (r3 == 0) goto L2d
            kotlinx.serialization.descriptors.SerialDescriptor r3 = r5.getCoerceToInlineType()
            kotlinx.serialization.encoding.Encoder r3 = r4.encodeInline(r3)
            java.lang.String r4 = r5.getContent()
            r3.encodeString(r4)
            return
        L2d:
            java.lang.String r3 = r5.getContent()
            java.lang.Long r3 = defpackage.p32.F(r3)
            if (r3 == 0) goto L3f
            long r0 = r3.longValue()
            r4.encodeLong(r0)
            return
        L3f:
            java.lang.String r3 = r5.getContent()
            bd2 r3 = defpackage.nq1.t(r3)
            if (r3 == 0) goto L5d
            long r0 = r3.e
            ad2 r3 = defpackage.bd2.f
            kotlinx.serialization.KSerializer r3 = kotlinx.serialization.builtins.BuiltinSerializersKt.serializer(r3)
            kotlinx.serialization.descriptors.SerialDescriptor r3 = r3.getDescriptor()
            kotlinx.serialization.encoding.Encoder r3 = r4.encodeInline(r3)
            r3.encodeLong(r0)
            return
        L5d:
            java.lang.String r3 = r5.getContent()
            r3.getClass()
            r0 = 0
            boolean r1 = defpackage.o32.u(r3)     // Catch: java.lang.NumberFormatException -> L74
            if (r1 == 0) goto L74
            double r1 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.NumberFormatException -> L74
            java.lang.Double r3 = java.lang.Double.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L74
            goto L75
        L74:
            r3 = r0
        L75:
            if (r3 == 0) goto L7f
            double r0 = r3.doubleValue()
            r4.encodeDouble(r0)
            return
        L7f:
            java.lang.String r3 = r5.getContent()
            r3.getClass()
            java.lang.String r1 = "true"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L91
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L9b
        L91:
            java.lang.String r1 = "false"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L9b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L9b:
            if (r0 == 0) goto La5
            boolean r3 = r0.booleanValue()
            r4.encodeBoolean(r3)
            return
        La5:
            java.lang.String r3 = r5.getContent()
            r4.encodeString(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.JsonLiteralSerializer.serialize(kotlinx.serialization.encoding.Encoder, kotlinx.serialization.json.JsonLiteral):void");
    }
}
