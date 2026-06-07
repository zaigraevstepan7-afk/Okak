package kotlinx.serialization.json.internal;

import defpackage.l90;
import defpackage.oe0;
import defpackage.p32;
import defpackage.se;
import defpackage.sn0;
import defpackage.yq1;
import defpackage.yx;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\fJ#\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00028\u0000\"\n\b\u0000\u0010\u0011\u0018\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0086\b¢\u0006\u0004\b\u001f\u0010 J4\u0010\u001f\u001a\u00028\u0000\"\n\b\u0000\u0010\u0011\u0018\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b\u001f\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J \u0010+\u001a\u00020*2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0084\b¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0007H$¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u0002002\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u001aH\u0014¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u00107J\u0017\u0010:\u001a\u0002092\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u0002002\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020A2\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020D2\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020G2\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020J2\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\bM\u0010\u000fJ\u001f\u0010P\u001a\u00020O2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u001aH\u0014¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020O2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\bR\u0010SJ@\u0010+\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020T2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u00072\u0014\u0010W\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0006\u0012\u0004\u0018\u00018\u00000VH\u0082\b¢\u0006\u0004\b+\u0010XJ'\u0010[\u001a\u0002032\u0006\u0010Y\u001a\u00020*2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b[\u0010\\R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010`\u001a\u0004\ba\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010b\u001a\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j\u0082\u0001\u0003lmn¨\u0006o"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "Lkotlinx/serialization/internal/NamedValueDecoder;", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/JsonElement;", "value", "", "polymorphicDiscriminator", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "currentObject", "()Lkotlinx/serialization/json/JsonElement;", "currentTag", "renderTagStack", "(Ljava/lang/String;)Ljava/lang/String;", "decodeJsonElement", "T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "decodeSerializableValue", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "parentName", "childName", "composeName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/encoding/CompositeDecoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeDecoder;", "cast", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/JsonElement;", "serialName", "tag", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Lod2;", "endStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "decodeNotNullMark", "()Z", "Lkotlinx/serialization/json/JsonPrimitive;", "getPrimitiveValue", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/JsonPrimitive;", "currentElement", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "enumDescriptor", "", "decodeTaggedEnum", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "decodeTaggedNull", "(Ljava/lang/String;)Ljava/lang/Void;", "decodeTaggedNotNullMark", "(Ljava/lang/String;)Z", "decodeTaggedBoolean", "", "decodeTaggedByte", "(Ljava/lang/String;)B", "", "decodeTaggedShort", "(Ljava/lang/String;)S", "decodeTaggedInt", "(Ljava/lang/String;)I", "", "decodeTaggedLong", "(Ljava/lang/String;)J", "", "decodeTaggedFloat", "(Ljava/lang/String;)F", "", "decodeTaggedDouble", "(Ljava/lang/String;)D", "", "decodeTaggedChar", "(Ljava/lang/String;)C", "decodeTaggedString", "inlineDescriptor", "Lkotlinx/serialization/encoding/Decoder;", "decodeTaggedInline", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "decodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "", "primitiveName", "Lkotlin/Function1;", "convert", "(Ljava/lang/String;Ljava/lang/String;Loe0;)Ljava/lang/Object;", "literal", TreeJsonEncoderKt.PRIMITIVE_TAG, "unparsedPrimitive", "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/json/JsonElement;", "getValue", "Ljava/lang/String;", "getPolymorphicDiscriminator", "()Ljava/lang/String;", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/json/internal/JsonPrimitiveDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/JsonTreeListDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class AbstractJsonTreeDecoder extends NamedValueDecoder implements JsonDecoder {
    protected final JsonConfiguration configuration;
    private final Json json;
    private final String polymorphicDiscriminator;
    private final JsonElement value;

    private AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str) {
        this.json = json;
        this.value = jsonElement;
        this.polymorphicDiscriminator = str;
        this.configuration = getJson().getConfiguration();
    }

    private final <T> T getPrimitiveValue(String tag, String primitiveName, oe0 convert) {
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                T t = (T) convert.invoke(jsonPrimitive);
                if (t != null) {
                    return t;
                }
                unparsedPrimitive(jsonPrimitive, primitiveName, tag);
                throw new RuntimeException();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, primitiveName, tag);
                se.c();
                return null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of ");
        sb.append(primitiveName);
        sb.append(" at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }

    private final Void unparsedPrimitive(JsonPrimitive literal, String primitive, String tag) {
        String str;
        if (p32.D(primitive, "i", false)) {
            str = "an ";
        } else {
            str = "a ";
        }
        throw JsonExceptionsKt.JsonDecodingException(-1, "Failed to parse literal '" + literal + "' as " + str.concat(primitive) + " value at element: " + renderTagStack(tag), currentObject().toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        descriptor.getClass();
        JsonElement currentObject = currentObject();
        SerialKind kind = descriptor.getKind();
        if (!sn0.r(kind, StructureKind.LIST.INSTANCE) && !(kind instanceof PolymorphicKind)) {
            if (sn0.r(kind, StructureKind.MAP.INSTANCE)) {
                Json json = getJson();
                SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
                SerialKind kind2 = carrierDescriptor.getKind();
                if (!(kind2 instanceof PrimitiveKind) && !sn0.r(kind2, SerialKind.ENUM.INSTANCE)) {
                    if (json.getConfiguration().getAllowStructuredMapKeys()) {
                        Json json2 = getJson();
                        String serialName = descriptor.getSerialName();
                        if (currentObject instanceof JsonArray) {
                            return new JsonTreeListDecoder(json2, (JsonArray) currentObject);
                        }
                        StringBuilder sb = new StringBuilder("Expected ");
                        l90.w(JsonArray.class, sb, ", but had ", currentObject, " as the serialized body of ");
                        sb.append(serialName);
                        sb.append(" at element: ");
                        sb.append(renderTagStack());
                        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentObject.toString());
                    }
                    throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
                }
                Json json3 = getJson();
                String serialName2 = descriptor.getSerialName();
                if (currentObject instanceof JsonObject) {
                    return new JsonTreeMapDecoder(json3, (JsonObject) currentObject);
                }
                StringBuilder sb2 = new StringBuilder("Expected ");
                l90.w(JsonObject.class, sb2, ", but had ", currentObject, " as the serialized body of ");
                sb2.append(serialName2);
                sb2.append(" at element: ");
                sb2.append(renderTagStack());
                throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), currentObject.toString());
            }
            Json json4 = getJson();
            String serialName3 = descriptor.getSerialName();
            if (currentObject instanceof JsonObject) {
                return new JsonTreeDecoder(json4, (JsonObject) currentObject, this.polymorphicDiscriminator, null, 8, null);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            l90.w(JsonObject.class, sb3, ", but had ", currentObject, " as the serialized body of ");
            sb3.append(serialName3);
            sb3.append(" at element: ");
            sb3.append(renderTagStack());
            throw JsonExceptionsKt.JsonDecodingException(-1, sb3.toString(), currentObject.toString());
        }
        Json json5 = getJson();
        String serialName4 = descriptor.getSerialName();
        if (currentObject instanceof JsonArray) {
            return new JsonTreeListDecoder(json5, (JsonArray) currentObject);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        l90.w(JsonArray.class, sb4, ", but had ", currentObject, " as the serialized body of ");
        sb4.append(serialName4);
        sb4.append(" at element: ");
        sb4.append(renderTagStack());
        throw JsonExceptionsKt.JsonDecodingException(-1, sb4.toString(), currentObject.toString());
    }

    public final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, SerialDescriptor descriptor) {
        value.getClass();
        descriptor.getClass();
        descriptor.getSerialName();
        sn0.R();
        throw null;
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String composeName(String parentName, String childName) {
        parentName.getClass();
        childName.getClass();
        return childName;
    }

    public abstract JsonElement currentElement(String tag);

    public final JsonElement currentObject() {
        JsonElement currentElement;
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull != null && (currentElement = currentElement(currentTagOrNull)) != null) {
            return currentElement;
        }
        return getValue();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        descriptor.getClass();
        if (getCurrentTagOrNull() != null) {
            return super.decodeInline(descriptor);
        }
        return new JsonPrimitiveDecoder(getJson(), getValue(), this.polymorphicDiscriminator).decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return currentObject();
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !(currentObject() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializer) {
        String str;
        JsonPrimitive jsonPrimitive;
        deserializer.getClass();
        if ((deserializer instanceof AbstractPolymorphicSerializer) && !getJson().getConfiguration().getUseArrayPolymorphism()) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) deserializer;
            String classDiscriminator = PolymorphicKt.classDiscriminator(abstractPolymorphicSerializer.getDescriptor(), getJson());
            JsonElement decodeJsonElement = decodeJsonElement();
            String serialName = abstractPolymorphicSerializer.getDescriptor().getSerialName();
            if (decodeJsonElement instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) decodeJsonElement;
                JsonElement jsonElement = (JsonElement) jsonObject.get((Object) classDiscriminator);
                if (jsonElement != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                    str = JsonElementKt.getContentOrNull(jsonPrimitive);
                } else {
                    str = null;
                }
                try {
                    DeserializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) deserializer, this, str);
                    findPolymorphicSerializer.getClass();
                    return (T) TreeJsonDecoderKt.readPolymorphicJson(getJson(), classDiscriminator, jsonObject, findPolymorphicSerializer);
                } catch (SerializationException e) {
                    String message = e.getMessage();
                    message.getClass();
                    throw JsonExceptionsKt.JsonDecodingException(-1, message, jsonObject.toString());
                }
            }
            StringBuilder sb = new StringBuilder("Expected ");
            l90.w(JsonObject.class, sb, ", but had ", decodeJsonElement, " as the serialized body of ");
            sb.append(serialName);
            sb.append(" at element: ");
            sb.append(renderTagStack());
            throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), decodeJsonElement.toString());
        }
        return deserializer.deserialize(this);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedBoolean(String tag) {
        tag.getClass();
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                Boolean booleanOrNull = JsonElementKt.getBooleanOrNull(jsonPrimitive);
                if (booleanOrNull != null) {
                    return booleanOrNull.booleanValue();
                }
                unparsedPrimitive(jsonPrimitive, "boolean", tag);
                throw new RuntimeException();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "boolean", tag);
                se.c();
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of boolean at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public byte decodeTaggedByte(String tag) {
        Byte b;
        tag.getClass();
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                long parseLongImpl = JsonElementKt.parseLongImpl(jsonPrimitive);
                if (-128 <= parseLongImpl && parseLongImpl <= 127) {
                    b = Byte.valueOf((byte) parseLongImpl);
                } else {
                    b = null;
                }
                if (b != null) {
                    return b.byteValue();
                }
                unparsedPrimitive(jsonPrimitive, "byte", tag);
                throw new RuntimeException();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "byte", tag);
                se.c();
                return (byte) 0;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of byte at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public char decodeTaggedChar(String tag) {
        tag.getClass();
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                String content = jsonPrimitive.getContent();
                content.getClass();
                int length = content.length();
                if (length != 0) {
                    if (length == 1) {
                        return content.charAt(0);
                    }
                    throw new IllegalArgumentException("Char sequence has more than one element.");
                }
                throw new NoSuchElementException("Char sequence is empty.");
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "char", tag);
                se.c();
                return (char) 0;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of char at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public double decodeTaggedDouble(String tag) {
        tag.getClass();
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                double d = JsonElementKt.getDouble(jsonPrimitive);
                if (!getJson().getConfiguration().getAllowSpecialFloatingPointValues() && Math.abs(d) > Double.MAX_VALUE) {
                    throw JsonExceptionsKt.InvalidFloatingPointDecoded(Double.valueOf(d), tag, currentObject().toString());
                }
                return d;
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "double", tag);
                se.c();
                return 0.0d;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of double at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedEnum(String tag, SerialDescriptor enumDescriptor) {
        tag.getClass();
        enumDescriptor.getClass();
        Json json = getJson();
        JsonElement currentElement = currentElement(tag);
        String serialName = enumDescriptor.getSerialName();
        if (currentElement instanceof JsonPrimitive) {
            return JsonNamesMapKt.getJsonNameIndexOrThrow$default(enumDescriptor, json, ((JsonPrimitive) currentElement).getContent(), null, 4, null);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of ");
        sb.append(serialName);
        sb.append(" at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public float decodeTaggedFloat(String tag) {
        tag.getClass();
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                float f = JsonElementKt.getFloat(jsonPrimitive);
                if (!getJson().getConfiguration().getAllowSpecialFloatingPointValues() && Math.abs(f) > Float.MAX_VALUE) {
                    throw JsonExceptionsKt.InvalidFloatingPointDecoded(Float.valueOf(f), tag, currentObject().toString());
                }
                return f;
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "float", tag);
                se.c();
                return 0.0f;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of float at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public Decoder decodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        tag.getClass();
        inlineDescriptor.getClass();
        if (StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            Json json = getJson();
            JsonElement currentElement = currentElement(tag);
            String serialName = inlineDescriptor.getSerialName();
            if (currentElement instanceof JsonPrimitive) {
                return new JsonDecoderForUnsignedTypes(StringJsonLexerKt.StringJsonLexer(json, ((JsonPrimitive) currentElement).getContent()), getJson());
            }
            StringBuilder sb = new StringBuilder("Expected ");
            l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of ");
            sb.append(serialName);
            sb.append(" at element: ");
            sb.append(renderTagStack(tag));
            throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
        }
        return super.decodeTaggedInline((AbstractJsonTreeDecoder) tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public int decodeTaggedInt(String tag) {
        Integer num;
        tag.getClass();
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                long parseLongImpl = JsonElementKt.parseLongImpl(jsonPrimitive);
                if (-2147483648L <= parseLongImpl && parseLongImpl <= 2147483647L) {
                    num = Integer.valueOf((int) parseLongImpl);
                } else {
                    num = null;
                }
                if (num != null) {
                    return num.intValue();
                }
                unparsedPrimitive(jsonPrimitive, "int", tag);
                throw new RuntimeException();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "int", tag);
                se.c();
                return 0;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of int at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public long decodeTaggedLong(String tag) {
        tag.getClass();
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                return JsonElementKt.parseLongImpl(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                this.unparsedPrimitive(jsonPrimitive, "long", tag);
                se.c();
                return 0L;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of long at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public boolean decodeTaggedNotNullMark(String tag) {
        tag.getClass();
        if (currentElement(tag) != JsonNull.INSTANCE) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public short decodeTaggedShort(String tag) {
        Short sh;
        tag.getClass();
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            try {
                long parseLongImpl = JsonElementKt.parseLongImpl(jsonPrimitive);
                if (-32768 <= parseLongImpl && parseLongImpl <= 32767) {
                    sh = Short.valueOf((short) parseLongImpl);
                } else {
                    sh = null;
                }
                if (sh != null) {
                    return sh.shortValue();
                }
                unparsedPrimitive(jsonPrimitive, "short", tag);
                throw new RuntimeException();
            } catch (IllegalArgumentException unused) {
                unparsedPrimitive(jsonPrimitive, "short", tag);
                se.c();
                return (short) 0;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of short at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public String decodeTaggedString(String tag) {
        tag.getClass();
        JsonElement currentElement = currentElement(tag);
        if (currentElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) currentElement;
            if (jsonPrimitive instanceof JsonLiteral) {
                JsonLiteral jsonLiteral = (JsonLiteral) jsonPrimitive;
                if (!jsonLiteral.getIsString() && !getJson().getConfiguration().getIsLenient()) {
                    StringBuilder sb = new StringBuilder("String literal for key '");
                    sb.append(tag);
                    sb.append("' should be quoted at element: ");
                    throw JsonExceptionsKt.JsonDecodingException(-1, l90.p(sb, renderTagStack(tag), ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON."), currentObject().toString());
                }
                return jsonLiteral.getContent();
            }
            throw JsonExceptionsKt.JsonDecodingException(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + renderTagStack(tag), currentObject().toString());
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb2, ", but had ", currentElement, " as the serialized body of string at element: ");
        sb2.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb2.toString(), currentElement.toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        descriptor.getClass();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public Json getJson() {
        return this.json;
    }

    public final String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return getJson().getSerializersModule();
    }

    public JsonElement getValue() {
        return this.value;
    }

    public final String renderTagStack(String currentTag) {
        currentTag.getClass();
        return renderTagStack() + '.' + currentTag;
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    public Void decodeTaggedNull(String tag) {
        tag.getClass();
        return null;
    }

    public final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, String serialName, String tag) {
        value.getClass();
        serialName.getClass();
        tag.getClass();
        sn0.R();
        throw null;
    }

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, int i, yx yxVar) {
        this(json, jsonElement, (i & 4) != 0 ? null : str, null);
    }

    public /* synthetic */ AbstractJsonTreeDecoder(Json json, JsonElement jsonElement, String str, yx yxVar) {
        this(json, jsonElement, str);
    }

    public final JsonPrimitive getPrimitiveValue(String tag, SerialDescriptor descriptor) {
        tag.getClass();
        descriptor.getClass();
        JsonElement currentElement = currentElement(tag);
        String serialName = descriptor.getSerialName();
        if (currentElement instanceof JsonPrimitive) {
            return (JsonPrimitive) currentElement;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        l90.w(JsonPrimitive.class, sb, ", but had ", currentElement, " as the serialized body of ");
        sb.append(serialName);
        sb.append(" at element: ");
        sb.append(renderTagStack(tag));
        throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), currentElement.toString());
    }
}
