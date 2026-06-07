package kotlinx.serialization.json.internal;

import defpackage.cn;
import defpackage.f00;
import defpackage.oe0;
import defpackage.sn0;
import defpackage.to0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.modules.SerializersModuleCollector;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0002¢\u0006\u0004\b\r\u0010\fJI\u0010\u0015\u001a\u00020\n\"\b\b\u0000\u0010\u000f*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b2 \u0010\u0014\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JM\u0010\u001b\u001a\u00020\n\"\b\b\u0000\u0010\u0017*\u00020\u000e\"\b\b\u0001\u0010\u0018*\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJC\u0010\u001f\u001a\u00020\n\"\b\b\u0000\u0010\u0017*\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u0016JE\u0010#\u001a\u00020\n\"\b\b\u0000\u0010\u0017*\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u001c\u0010\"\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!0\u0011H\u0016¢\u0006\u0004\b#\u0010\u0016R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006*"}, d2 = {"Lkotlinx/serialization/json/internal/JsonSerializersModuleValidator;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lto0;", "actualClass", "Lod2;", "checkKind", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lto0;)V", "checkDiscriminatorCollisions", "", "T", "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "provider", "contextual", "(Lto0;Loe0;)V", "Base", "Sub", "baseClass", "actualSerializer", "polymorphic", "(Lto0;Lto0;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "discriminator", "Ljava/lang/String;", "", "useArrayPolymorphism", "Z", "isDiscriminatorRequired", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonSerializersModuleValidator implements SerializersModuleCollector {
    private final String discriminator;
    private final boolean isDiscriminatorRequired;
    private final boolean useArrayPolymorphism;

    public JsonSerializersModuleValidator(JsonConfiguration jsonConfiguration) {
        boolean z;
        jsonConfiguration.getClass();
        this.discriminator = jsonConfiguration.getClassDiscriminator();
        this.useArrayPolymorphism = jsonConfiguration.getUseArrayPolymorphism();
        if (jsonConfiguration.getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE) {
            z = true;
        } else {
            z = false;
        }
        this.isDiscriminatorRequired = z;
    }

    private final void checkDiscriminatorCollisions(SerialDescriptor descriptor, to0 actualClass) {
        int elementsCount = descriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            String elementName = descriptor.getElementName(i);
            if (sn0.r(elementName, this.discriminator)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + elementName + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void checkKind(SerialDescriptor descriptor, to0 actualClass) {
        SerialKind kind = descriptor.getKind();
        if (!(kind instanceof PolymorphicKind) && !sn0.r(kind, SerialKind.CONTEXTUAL.INSTANCE)) {
            if (!this.useArrayPolymorphism && this.isDiscriminatorRequired) {
                if (!sn0.r(kind, StructureKind.LIST.INSTANCE) && !sn0.r(kind, StructureKind.MAP.INSTANCE) && !(kind instanceof PrimitiveKind) && !(kind instanceof SerialKind.ENUM)) {
                    return;
                }
                throw new IllegalArgumentException("Serializer for " + ((cn) actualClass).d() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
            return;
        }
        throw new IllegalArgumentException("Serializer for " + ((cn) actualClass).d() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(to0 kClass, oe0 provider) {
        kClass.getClass();
        provider.getClass();
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(to0 baseClass, to0 actualClass, KSerializer<Sub> actualSerializer) {
        baseClass.getClass();
        actualClass.getClass();
        actualSerializer.getClass();
        SerialDescriptor descriptor = actualSerializer.getDescriptor();
        checkKind(descriptor, actualClass);
        if (!this.useArrayPolymorphism && this.isDiscriminatorRequired) {
            checkDiscriminatorCollisions(descriptor, actualClass);
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    @f00
    public <Base> void polymorphicDefault(to0 to0Var, oe0 oe0Var) {
        super.polymorphicDefault(to0Var, oe0Var);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultDeserializer(to0 baseClass, oe0 defaultDeserializerProvider) {
        baseClass.getClass();
        defaultDeserializerProvider.getClass();
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultSerializer(to0 baseClass, oe0 defaultSerializerProvider) {
        baseClass.getClass();
        defaultSerializerProvider.getClass();
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(to0 to0Var, KSerializer<T> kSerializer) {
        super.contextual(to0Var, kSerializer);
    }
}
