package kotlinx.serialization.json;

import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/json/JsonArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lkotlinx/serialization/json/JsonArray;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "JsonArrayDescriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonArraySerializer implements KSerializer<JsonArray> {
    public static final JsonArraySerializer INSTANCE = new JsonArraySerializer();
    private static final SerialDescriptor descriptor = JsonArrayDescriptor.INSTANCE;

    private JsonArraySerializer() {
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public JsonArray deserialize(Decoder decoder) {
        decoder.getClass();
        JsonElementSerializersKt.access$verify(decoder);
        return new JsonArray((List) BuiltinSerializersKt.ListSerializer(JsonElementSerializer.INSTANCE).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, JsonArray value) {
        encoder.getClass();
        value.getClass();
        JsonElementSerializersKt.access$verify(encoder);
        BuiltinSerializersKt.ListSerializer(JsonElementSerializer.INSTANCE).serialize(encoder, value);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001J\u0011\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0096\u0001J\u0011\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0005H\u0096\u0001J\u0011\u0010\u0011\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0096\u0001J\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00138VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00138VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0012\u0010\u001d\u001a\u00020\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lkotlinx/serialization/json/JsonArraySerializer$JsonArrayDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "serialName", "", "getSerialName$annotations", "getSerialName", "()Ljava/lang/String;", "getElementAnnotations", "", "", "index", "", "getElementDescriptor", "getElementIndex", "name", "getElementName", "isElementOptional", "", "annotations", "getAnnotations", "()Ljava/util/List;", "elementsCount", "getElementsCount", "()I", "isInline", "()Z", "isNullable", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class JsonArrayDescriptor implements SerialDescriptor {
        public static final JsonArrayDescriptor INSTANCE = new JsonArrayDescriptor();
        private static final String serialName = "kotlinx.serialization.json.JsonArray";
        private final /* synthetic */ SerialDescriptor $$delegate_0 = BuiltinSerializersKt.ListSerializer(JsonElementSerializer.INSTANCE).getDescriptor();

        private JsonArrayDescriptor() {
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> getAnnotations() {
            return this.$$delegate_0.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public List<Annotation> getElementAnnotations(int index) {
            return this.$$delegate_0.getElementAnnotations(index);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialDescriptor getElementDescriptor(int index) {
            return this.$$delegate_0.getElementDescriptor(index);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int getElementIndex(String name) {
            name.getClass();
            return this.$$delegate_0.getElementIndex(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String getElementName(int index) {
            return this.$$delegate_0.getElementName(index);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public int getElementsCount() {
            return this.$$delegate_0.getElementsCount();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public SerialKind getKind() {
            return this.$$delegate_0.getKind();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public String getSerialName() {
            return serialName;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isElementOptional(int index) {
            return this.$$delegate_0.isElementOptional(index);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: isInline */
        public boolean getIsInline() {
            return this.$$delegate_0.getIsInline();
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public boolean isNullable() {
            return this.$$delegate_0.isNullable();
        }

        @ExperimentalSerializationApi
        public static /* synthetic */ void getSerialName$annotations() {
        }
    }
}
