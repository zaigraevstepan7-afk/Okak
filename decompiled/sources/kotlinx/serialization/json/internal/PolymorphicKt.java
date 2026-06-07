package kotlinx.serialization.json.internal;

import defpackage.de0;
import defpackage.l90;
import defpackage.se;
import defpackage.yl1;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aM\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\r\u001a\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a9\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\f\u001a\u00020\u0006*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\f\u0010\u001d\u001a!\u0010\"\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"T", "Lkotlinx/serialization/json/JsonEncoder;", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "Lkotlin/Function2;", "", "Lod2;", "ifPolymorphic", "encodePolymorphically", "(Lkotlinx/serialization/json/JsonEncoder;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Lse0;)V", "actualSerializer", "classDiscriminator", "validateIfSealed", "(Lkotlinx/serialization/SerializationStrategy;Lkotlinx/serialization/SerializationStrategy;Ljava/lang/String;)V", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "checkKind", "(Lkotlinx/serialization/descriptors/SerialKind;)V", "Lkotlinx/serialization/json/JsonDecoder;", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Lkotlin/Function0;", "path", "decodeSerializableValuePolymorphic", "(Lkotlinx/serialization/json/JsonDecoder;Lkotlinx/serialization/DeserializationStrategy;Lde0;)Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/Json;", "json", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/Json;)Ljava/lang/String;", "serialName", "Lkotlinx/serialization/json/JsonElement;", "element", "", "throwJsonElementPolymorphicException", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Void;", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class PolymorphicKt {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void checkKind(SerialKind serialKind) {
        serialKind.getClass();
        if (!(serialKind instanceof SerialKind.ENUM)) {
            if (!(serialKind instanceof PrimitiveKind)) {
                if (!(serialKind instanceof PolymorphicKind)) {
                    return;
                }
                se.p("Actual serializer for polymorphic cannot be polymorphic itself");
                return;
            }
            se.p("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
            return;
        }
        se.p("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
    }

    public static final String classDiscriminator(SerialDescriptor serialDescriptor, Json json) {
        serialDescriptor.getClass();
        json.getClass();
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    public static final <T> T decodeSerializableValuePolymorphic(JsonDecoder jsonDecoder, DeserializationStrategy<? extends T> deserializationStrategy, de0 de0Var) {
        String str;
        JsonPrimitive jsonPrimitive;
        jsonDecoder.getClass();
        deserializationStrategy.getClass();
        de0Var.getClass();
        if ((deserializationStrategy instanceof AbstractPolymorphicSerializer) && !jsonDecoder.getJson().getConfiguration().getUseArrayPolymorphism()) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) deserializationStrategy;
            String classDiscriminator = classDiscriminator(abstractPolymorphicSerializer.getDescriptor(), jsonDecoder.getJson());
            JsonElement decodeJsonElement = jsonDecoder.decodeJsonElement();
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
                    DeserializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) deserializationStrategy, jsonDecoder, str);
                    findPolymorphicSerializer.getClass();
                    return (T) TreeJsonDecoderKt.readPolymorphicJson(jsonDecoder.getJson(), classDiscriminator, jsonObject, findPolymorphicSerializer);
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
            sb.append((String) de0Var.invoke());
            throw JsonExceptionsKt.JsonDecodingException(-1, sb.toString(), decodeJsonElement.toString());
        }
        return deserializationStrategy.deserialize(jsonDecoder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (defpackage.sn0.r(r1, kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if (r3.getJson().getConfiguration().getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void encodePolymorphically(kotlinx.serialization.json.JsonEncoder r3, kotlinx.serialization.SerializationStrategy<? super T> r4, T r5, defpackage.se0 r6) {
        /*
            r3.getClass()
            r4.getClass()
            r6.getClass()
            kotlinx.serialization.json.Json r0 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r0 = r0.getConfiguration()
            boolean r0 = r0.getUseArrayPolymorphism()
            if (r0 == 0) goto L1b
            r4.serialize(r3, r5)
            return
        L1b:
            boolean r0 = r4 instanceof kotlinx.serialization.internal.AbstractPolymorphicSerializer
            if (r0 == 0) goto L30
            kotlinx.serialization.json.Json r1 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.getConfiguration()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.getClassDiscriminatorMode()
            kotlinx.serialization.json.ClassDiscriminatorMode r2 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r2) goto L76
            goto L65
        L30:
            kotlinx.serialization.json.Json r1 = r3.getJson()
            kotlinx.serialization.json.JsonConfiguration r1 = r1.getConfiguration()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.getClassDiscriminatorMode()
            int[] r2 = kotlinx.serialization.json.internal.PolymorphicKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L76
            r2 = 2
            if (r1 == r2) goto L76
            r2 = 3
            if (r1 != r2) goto L72
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            kotlinx.serialization.descriptors.SerialKind r1 = r1.getKind()
            kotlinx.serialization.descriptors.StructureKind$CLASS r2 = kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE
            boolean r2 = defpackage.sn0.r(r1, r2)
            if (r2 != 0) goto L65
            kotlinx.serialization.descriptors.StructureKind$OBJECT r2 = kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE
            boolean r1 = defpackage.sn0.r(r1, r2)
            if (r1 == 0) goto L76
        L65:
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r4.getDescriptor()
            kotlinx.serialization.json.Json r2 = r3.getJson()
            java.lang.String r1 = classDiscriminator(r1, r2)
            goto L77
        L72:
            defpackage.se.m()
            return
        L76:
            r1 = 0
        L77:
            if (r0 == 0) goto La3
            r0 = r4
            kotlinx.serialization.internal.AbstractPolymorphicSerializer r0 = (kotlinx.serialization.internal.AbstractPolymorphicSerializer) r0
            if (r5 == 0) goto L97
            kotlinx.serialization.SerializationStrategy r0 = kotlinx.serialization.PolymorphicSerializerKt.findPolymorphicSerializer(r0, r3, r5)
            if (r1 == 0) goto L92
            access$validateIfSealed(r4, r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r0.getDescriptor()
            kotlinx.serialization.descriptors.SerialKind r4 = r4.getKind()
            checkKind(r4)
        L92:
            r0.getClass()
            r4 = r0
            goto La3
        L97:
            kotlinx.serialization.descriptors.SerialDescriptor r3 = r0.getDescriptor()
            java.lang.String r4 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r5 = "Value for serializer "
            defpackage.y61.r(r5, r3, r4)
            return
        La3:
            if (r1 == 0) goto Lb0
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r4.getDescriptor()
            java.lang.String r0 = r0.getSerialName()
            r6.invoke(r1, r0)
        Lb0:
            r4.serialize(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically(kotlinx.serialization.json.JsonEncoder, kotlinx.serialization.SerializationStrategy, java.lang.Object, se0):void");
    }

    public static final Void throwJsonElementPolymorphicException(String str, JsonElement jsonElement) {
        jsonElement.getClass();
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + yl1.a(jsonElement.getClass()).d() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateIfSealed(SerializationStrategy<?> serializationStrategy, SerializationStrategy<?> serializationStrategy2, String str) {
        if (!(serializationStrategy instanceof SealedClassSerializer) || !JsonInternalDependenciesKt.jsonCachedSerialNames(serializationStrategy2.getDescriptor()).contains(str)) {
            return;
        }
        String serialName = ((SealedClassSerializer) serializationStrategy).getDescriptor().getSerialName();
        throw new IllegalStateException(("Sealed class '" + serializationStrategy2.getDescriptor().getSerialName() + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
    }
}
