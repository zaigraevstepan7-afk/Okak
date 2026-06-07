package kotlinx.serialization.json.internal;

import defpackage.od2;
import defpackage.oe0;
import defpackage.se;
import defpackage.sn0;
import defpackage.yq1;
import defpackage.yx;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0002WZ\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000fH\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\rH\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020*H\u0014¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020-H\u0014¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u000203H\u0014¢\u0006\u0004\b4\u00105J+\u00109\u001a\u00020\u0007\"\u0004\b\u0000\u001062\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0006\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020;H\u0014¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0015H\u0014¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020@H\u0014¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0014¢\u0006\u0004\bC\u0010DJ'\u0010G\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\rH\u0014¢\u0006\u0004\bG\u0010HJ\u001f\u0010J\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020IH\u0014¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020M2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u000bH\u0014¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020M2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020R2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u0010$\u001a\u00020\u000fH\u0003¢\u0006\u0004\bX\u0010YJ\u001f\u0010[\u001a\u00020Z2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u000bH\u0002¢\u0006\u0004\b[\u0010\\R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010]\u001a\u0004\b^\u0010_R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010`\u001a\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010gR\u0011\u0010l\u001a\u00020i8F¢\u0006\u0006\u001a\u0004\bj\u0010k\u0082\u0001\u0003mno¨\u0006p"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "Lkotlinx/serialization/internal/NamedValueEncoder;", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "Lod2;", "nodeConsumer", "<init>", "(Lkotlinx/serialization/json/Json;Loe0;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "elementName", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "element", "encodeJsonElement", "(Lkotlinx/serialization/json/JsonElement;)V", "", "shouldEncodeElementDefault", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "parentName", "childName", "composeName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "key", "putElement", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "getCurrent", "()Lkotlinx/serialization/json/JsonElement;", "encodeNotNullMark", "()V", "encodeNull", "tag", "encodeTaggedNull", "(Ljava/lang/String;)V", "value", "encodeTaggedInt", "(Ljava/lang/String;I)V", "", "encodeTaggedByte", "(Ljava/lang/String;B)V", "", "encodeTaggedShort", "(Ljava/lang/String;S)V", "", "encodeTaggedLong", "(Ljava/lang/String;J)V", "", "encodeTaggedFloat", "(Ljava/lang/String;F)V", "T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "encodeSerializableValue", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "", "encodeTaggedDouble", "(Ljava/lang/String;D)V", "encodeTaggedBoolean", "(Ljava/lang/String;Z)V", "", "encodeTaggedChar", "(Ljava/lang/String;C)V", "encodeTaggedString", "(Ljava/lang/String;Ljava/lang/String;)V", "enumDescriptor", "ordinal", "encodeTaggedEnum", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;I)V", "", "encodeTaggedValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "inlineDescriptor", "Lkotlinx/serialization/encoding/Encoder;", "encodeTaggedInline", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "encodeInline", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "beginStructure", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;", "endEncode", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1", "inlineUnsignedNumberEncoder", "(Ljava/lang/String;)Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1;", "kotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1", "inlineUnquotedLiteralEncoder", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1;", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "Loe0;", "getNodeConsumer", "()Loe0;", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "polymorphicDiscriminator", "Ljava/lang/String;", "polymorphicSerialName", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "Lkotlinx/serialization/json/internal/JsonPrimitiveEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeEncoder;", "Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class AbstractJsonTreeEncoder extends NamedValueEncoder implements JsonEncoder {
    protected final JsonConfiguration configuration;
    private final Json json;
    private final oe0 nodeConsumer;
    private String polymorphicDiscriminator;
    private String polymorphicSerialName;

    private AbstractJsonTreeEncoder(Json json, oe0 oe0Var) {
        this.json = json;
        this.nodeConsumer = oe0Var;
        this.configuration = json.getConfiguration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final od2 beginStructure$lambda$2(AbstractJsonTreeEncoder abstractJsonTreeEncoder, JsonElement jsonElement) {
        jsonElement.getClass();
        abstractJsonTreeEncoder.putElement(abstractJsonTreeEncoder.getCurrentTag(), jsonElement);
        return od2.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1] */
    private final AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1 inlineUnquotedLiteralEncoder(final String tag, final SerialDescriptor inlineDescriptor) {
        return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnquotedLiteralEncoder$1
            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeString(String value) {
                value.getClass();
                AbstractJsonTreeEncoder.this.putElement(tag, new JsonLiteral(value, false, inlineDescriptor));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            public SerializersModule getSerializersModule() {
                return AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1] */
    private final AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1 inlineUnsignedNumberEncoder(final String tag) {
        return new AbstractEncoder() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1
            private final SerializersModule serializersModule;

            {
                this.serializersModule = AbstractJsonTreeEncoder.this.getJson().getSerializersModule();
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeByte(byte value) {
                putUnquotedString(String.valueOf(value & 255));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeInt(int value) {
                putUnquotedString(Integer.toUnsignedString(value));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeLong(long value) {
                putUnquotedString(Long.toUnsignedString(value));
            }

            @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
            public void encodeShort(short value) {
                putUnquotedString(String.valueOf(value & 65535));
            }

            @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
            public SerializersModule getSerializersModule() {
                return this.serializersModule;
            }

            public final void putUnquotedString(String s) {
                s.getClass();
                AbstractJsonTreeEncoder.this.putElement(tag, new JsonLiteral(s, false, null, 4, null));
            }
        };
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public CompositeEncoder beginStructure(SerialDescriptor descriptor) {
        oe0 oe0Var;
        AbstractJsonTreeEncoder jsonTreeListEncoder;
        descriptor.getClass();
        if (getCurrentTagOrNull() == null) {
            oe0Var = this.nodeConsumer;
        } else {
            oe0Var = new oe0() { // from class: kotlinx.serialization.json.internal.a
                @Override // defpackage.oe0
                public final Object invoke(Object obj) {
                    od2 beginStructure$lambda$2;
                    beginStructure$lambda$2 = AbstractJsonTreeEncoder.beginStructure$lambda$2(AbstractJsonTreeEncoder.this, (JsonElement) obj);
                    return beginStructure$lambda$2;
                }
            };
        }
        SerialKind kind = descriptor.getKind();
        if (!sn0.r(kind, StructureKind.LIST.INSTANCE) && !(kind instanceof PolymorphicKind)) {
            boolean r = sn0.r(kind, StructureKind.MAP.INSTANCE);
            Json json = this.json;
            if (r) {
                SerialDescriptor carrierDescriptor = WriteModeKt.carrierDescriptor(descriptor.getElementDescriptor(0), json.getSerializersModule());
                SerialKind kind2 = carrierDescriptor.getKind();
                if (!(kind2 instanceof PrimitiveKind) && !sn0.r(kind2, SerialKind.ENUM.INSTANCE)) {
                    if (json.getConfiguration().getAllowStructuredMapKeys()) {
                        jsonTreeListEncoder = new JsonTreeListEncoder(this.json, oe0Var);
                    } else {
                        throw JsonExceptionsKt.InvalidKeyKindException(carrierDescriptor);
                    }
                } else {
                    jsonTreeListEncoder = new JsonTreeMapEncoder(this.json, oe0Var);
                }
            } else {
                jsonTreeListEncoder = new JsonTreeEncoder(json, oe0Var);
            }
        } else {
            jsonTreeListEncoder = new JsonTreeListEncoder(this.json, oe0Var);
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            if (jsonTreeListEncoder instanceof JsonTreeMapEncoder) {
                JsonTreeMapEncoder jsonTreeMapEncoder = (JsonTreeMapEncoder) jsonTreeListEncoder;
                jsonTreeMapEncoder.putElement("key", JsonElementKt.JsonPrimitive(str));
                String str2 = this.polymorphicSerialName;
                if (str2 == null) {
                    str2 = descriptor.getSerialName();
                }
                jsonTreeMapEncoder.putElement("value", JsonElementKt.JsonPrimitive(str2));
            } else {
                String str3 = this.polymorphicSerialName;
                if (str3 == null) {
                    str3 = descriptor.getSerialName();
                }
                jsonTreeListEncoder.putElement(str, JsonElementKt.JsonPrimitive(str3));
            }
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        return jsonTreeListEncoder;
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public String composeName(String parentName, String childName) {
        parentName.getClass();
        childName.getClass();
        return childName;
    }

    @Override // kotlinx.serialization.internal.NamedValueEncoder
    public String elementName(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return JsonNamesMapKt.getJsonElementName(descriptor, this.json, index);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public Encoder encodeInline(SerialDescriptor descriptor) {
        descriptor.getClass();
        if (getCurrentTagOrNull() != null) {
            if (this.polymorphicDiscriminator != null) {
                this.polymorphicSerialName = descriptor.getSerialName();
            }
            return super.encodeInline(descriptor);
        }
        return new JsonPrimitiveEncoder(this.json, this.nodeConsumer).encodeInline(descriptor);
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(JsonElement element) {
        element.getClass();
        if (this.polymorphicDiscriminator != null && !(element instanceof JsonObject)) {
            PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element);
            se.c();
        } else {
            encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        String currentTagOrNull = getCurrentTagOrNull();
        if (currentTagOrNull == null) {
            this.nodeConsumer.invoke(JsonNull.INSTANCE);
        } else {
            encodeTaggedNull(currentTagOrNull);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (getJson().getConfiguration().getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        if (defpackage.sn0.r(r1, kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE) == false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void encodeSerializableValue(kotlinx.serialization.SerializationStrategy<? super T> r4, T r5) {
        /*
            r3 = this;
            r4.getClass()
            java.lang.Object r0 = r3.getCurrentTagOrNull()
            if (r0 != 0) goto L29
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.getDescriptor()
            kotlinx.serialization.modules.SerializersModule r1 = r3.getSerializersModule()
            kotlinx.serialization.descriptors.SerialDescriptor r0 = kotlinx.serialization.json.internal.WriteModeKt.carrierDescriptor(r0, r1)
            boolean r0 = kotlinx.serialization.json.internal.TreeJsonEncoderKt.access$getRequiresTopLevelTag(r0)
            if (r0 != 0) goto L1c
            goto L29
        L1c:
            kotlinx.serialization.json.internal.JsonPrimitiveEncoder r0 = new kotlinx.serialization.json.internal.JsonPrimitiveEncoder
            kotlinx.serialization.json.Json r1 = r3.json
            oe0 r3 = r3.nodeConsumer
            r0.<init>(r1, r3)
            r0.encodeSerializableValue(r4, r5)
            return
        L29:
            kotlinx.serialization.json.Json r0 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r0 = r0.getConfiguration()
            boolean r0 = r0.getUseArrayPolymorphism()
            if (r0 == 0) goto L3b
            r4.serialize(r3, r5)
            return
        L3b:
            boolean r0 = r4 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer
            if (r0 == 0) goto L50
            kotlinx.serialization.json.Json r1 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.getConfiguration()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.getClassDiscriminatorMode()
            kotlinx.serialization.json.ClassDiscriminatorMode r2 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r2) goto L96
            goto L85
        L50:
            kotlinx.serialization.json.Json r1 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.getConfiguration()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.getClassDiscriminatorMode()
            int[] r2 = kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L96
            r2 = 2
            if (r1 == r2) goto L96
            r2 = 3
            if (r1 != r2) goto L92
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            kotlinx.serialization.descriptors.SerialKind r1 = r1.getKind()
            kotlinx.serialization.descriptors.StructureKind$CLASS r2 = kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE
            boolean r2 = defpackage.sn0.r(r1, r2)
            if (r2 != 0) goto L85
            kotlinx.serialization.descriptors.StructureKind$OBJECT r2 = kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE
            boolean r1 = defpackage.sn0.r(r1, r2)
            if (r1 == 0) goto L96
        L85:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            kotlinx.serialization.json.Json r2 = r3.getJson()
            java.lang.String r1 = kotlinx.serialization.json.internal.PolymorphicKt.classDiscriminator(r1, r2)
            goto L97
        L92:
            defpackage.se.m()
            return
        L96:
            r1 = 0
        L97:
            if (r0 == 0) goto Lc3
            r0 = r4
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r0 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r0
            if (r5 == 0) goto Lb7
            kotlinx.serialization.SerializationStrategy r0 = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(r0, r3, r5)
            if (r1 == 0) goto Lb2
            kotlinx.serialization.json.internal.PolymorphicKt.access$validateIfSealed(r4, r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r0.getDescriptor()
            kotlinx.serialization.descriptors.SerialKind r4 = r4.getKind()
            kotlinx.serialization.json.internal.PolymorphicKt.checkKind(r4)
        Lb2:
            r0.getClass()
            r4 = r0
            goto Lc3
        Lb7:
            kotlinx.serialization.descriptors.SerialDescriptor r3 = r0.getDescriptor()
            java.lang.String r4 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r5 = "Value for serializer "
            defpackage.y61.r(r5, r3, r4)
            return
        Lc3:
            if (r1 == 0) goto Ld1
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.getDescriptor()
            java.lang.String r0 = r0.getSerialName()
            r3.polymorphicDiscriminator = r1
            r3.polymorphicSerialName = r0
        Ld1:
            r4.serialize(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder.encodeSerializableValue(kotlinx.serialization.SerializationStrategy, java.lang.Object):void");
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedBoolean(String tag, boolean value) {
        tag.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(Boolean.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedByte(String tag, byte value) {
        tag.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(Byte.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedChar(String tag, char value) {
        tag.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(String.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedDouble(String tag, double value) {
        tag.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(Double.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues() || Math.abs(value) <= Double.MAX_VALUE) {
        } else {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(value), tag, getCurrent().toString());
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedEnum(String tag, SerialDescriptor enumDescriptor, int ordinal) {
        tag.getClass();
        enumDescriptor.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(enumDescriptor.getElementName(ordinal)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedFloat(String tag, float value) {
        tag.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(Float.valueOf(value)));
        if (this.configuration.getAllowSpecialFloatingPointValues() || Math.abs(value) <= Float.MAX_VALUE) {
        } else {
            throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(value), tag, getCurrent().toString());
        }
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public Encoder encodeTaggedInline(String tag, SerialDescriptor inlineDescriptor) {
        tag.getClass();
        inlineDescriptor.getClass();
        if (StreamingJsonEncoderKt.isUnsignedNumber(inlineDescriptor)) {
            return inlineUnsignedNumberEncoder(tag);
        }
        if (StreamingJsonEncoderKt.isUnquotedLiteral(inlineDescriptor)) {
            return inlineUnquotedLiteralEncoder(tag, inlineDescriptor);
        }
        return super.encodeTaggedInline((AbstractJsonTreeEncoder) tag, inlineDescriptor);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedInt(String tag, int value) {
        tag.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(Integer.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedLong(String tag, long value) {
        tag.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(Long.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedNull(String tag) {
        tag.getClass();
        putElement(tag, JsonNull.INSTANCE);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedShort(String tag, short value) {
        tag.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(Short.valueOf(value)));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedString(String tag, String value) {
        tag.getClass();
        value.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(value));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void encodeTaggedValue(String tag, Object value) {
        tag.getClass();
        value.getClass();
        putElement(tag, JsonElementKt.JsonPrimitive(value.toString()));
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder
    public void endEncode(SerialDescriptor descriptor) {
        descriptor.getClass();
        this.nodeConsumer.invoke(getCurrent());
    }

    public abstract JsonElement getCurrent();

    @Override // kotlinx.serialization.json.JsonEncoder
    public final Json getJson() {
        return this.json;
    }

    public final oe0 getNodeConsumer() {
        return this.nodeConsumer;
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    public final SerializersModule getSerializersModule() {
        return this.json.getSerializersModule();
    }

    public abstract void putElement(String key, JsonElement element);

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(SerialDescriptor descriptor, int index) {
        descriptor.getClass();
        return this.configuration.getEncodeDefaults();
    }

    public /* synthetic */ AbstractJsonTreeEncoder(Json json, oe0 oe0Var, yx yxVar) {
        this(json, oe0Var);
    }

    @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNotNullMark() {
    }
}
