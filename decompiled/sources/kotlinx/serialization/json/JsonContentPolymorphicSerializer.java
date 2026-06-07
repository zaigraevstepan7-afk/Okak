package kotlinx.serialization.json;

import defpackage.cn;
import defpackage.se;
import defpackage.to0;
import defpackage.yl1;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0017\u001a\u00020\u0016H$¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lto0;", "baseClass", "<init>", "(Lto0;)V", "subClass", "", "throwSubtypeNotRegistered", "(Lto0;Lto0;)Ljava/lang/Void;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/DeserializationStrategy;", "selectDeserializer", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;", "Lto0;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class JsonContentPolymorphicSerializer<T> implements KSerializer<T> {
    private final to0 baseClass;
    private final SerialDescriptor descriptor;

    public JsonContentPolymorphicSerializer(to0 to0Var) {
        to0Var.getClass();
        this.baseClass = to0Var;
        this.descriptor = SerialDescriptorsKt.buildSerialDescriptor$default("JsonContentPolymorphicSerializer<" + ((cn) to0Var).d() + '>', PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], null, 8, null);
    }

    private final Void throwSubtypeNotRegistered(to0 subClass, to0 baseClass) {
        cn cnVar = (cn) subClass;
        String d = cnVar.d();
        if (d == null) {
            d = String.valueOf(cnVar);
        }
        throw new SerializationException("Class '" + d + "' is not registered for polymorphic serialization " + ("in the scope of '" + ((cn) baseClass).d() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final T deserialize(Decoder decoder) {
        decoder.getClass();
        JsonDecoder asJsonDecoder = JsonElementSerializersKt.asJsonDecoder(decoder);
        JsonElement decodeJsonElement = asJsonDecoder.decodeJsonElement();
        DeserializationStrategy<T> selectDeserializer = selectDeserializer(decodeJsonElement);
        selectDeserializer.getClass();
        return (T) asJsonDecoder.getJson().decodeFromJsonElement((KSerializer) selectDeserializer, decodeJsonElement);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public abstract DeserializationStrategy<T> selectDeserializer(JsonElement element);

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, T value) {
        encoder.getClass();
        value.getClass();
        KSerializer polymorphic = encoder.getSerializersModule().getPolymorphic(this.baseClass, (to0) value);
        if (polymorphic == null) {
            KSerializer serializerOrNull = SerializersKt.serializerOrNull(yl1.a(value.getClass()));
            if (serializerOrNull != null) {
                polymorphic = serializerOrNull;
            } else {
                throwSubtypeNotRegistered(yl1.a(value.getClass()), this.baseClass);
                se.c();
                return;
            }
        }
        ((KSerializer) polymorphic).serialize(encoder, value);
    }
}
