package kotlinx.serialization;

import defpackage.l60;
import defpackage.od2;
import defpackage.r;
import defpackage.se;
import defpackage.to0;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0007¢\u0006\u0004\b\t\u0010\nB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u001e\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lkotlinx/serialization/ContextualSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "Lto0;", "serializableClass", "fallbackSerializer", "", "typeArgumentsSerializers", "<init>", "(Lto0;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V", "(Lto0;)V", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModule", "serializer", "(Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lto0;", "Lkotlinx/serialization/KSerializer;", "", "Ljava/util/List;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public final class ContextualSerializer<T> implements KSerializer<T> {
    private final SerialDescriptor descriptor;
    private final KSerializer<T> fallbackSerializer;
    private final to0 serializableClass;
    private final List<KSerializer<?>> typeArgumentsSerializers;

    public ContextualSerializer(to0 to0Var, KSerializer<T> kSerializer, KSerializer<?>[] kSerializerArr) {
        to0Var.getClass();
        kSerializerArr.getClass();
        this.serializableClass = to0Var;
        this.fallbackSerializer = kSerializer;
        List<KSerializer<?>> asList = Arrays.asList(kSerializerArr);
        asList.getClass();
        this.typeArgumentsSerializers = asList;
        this.descriptor = ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.ContextualSerializer", SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], new r(this, 9)), to0Var);
    }

    public static /* synthetic */ od2 a(ContextualSerializer contextualSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        return descriptor$lambda$0(contextualSerializer, classSerialDescriptorBuilder);
    }

    public static final od2 descriptor$lambda$0(ContextualSerializer contextualSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        List<Annotation> list;
        SerialDescriptor descriptor;
        classSerialDescriptorBuilder.getClass();
        KSerializer<T> kSerializer = contextualSerializer.fallbackSerializer;
        if (kSerializer != null && (descriptor = kSerializer.getDescriptor()) != null) {
            list = descriptor.getAnnotations();
        } else {
            list = null;
        }
        if (list == null) {
            list = l60.e;
        }
        classSerialDescriptorBuilder.setAnnotations(list);
        return od2.a;
    }

    private final KSerializer<T> serializer(SerializersModule serializersModule) {
        KSerializer<T> contextual = serializersModule.getContextual(this.serializableClass, this.typeArgumentsSerializers);
        if (contextual == null) {
            KSerializer<T> kSerializer = this.fallbackSerializer;
            if (kSerializer != null) {
                return kSerializer;
            }
            Platform_commonKt.serializerNotRegistered(this.serializableClass);
            se.c();
            return null;
        }
        return contextual;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(Decoder decoder) {
        decoder.getClass();
        return (T) decoder.decodeSerializableValue(serializer(decoder.getSerializersModule()));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, T value) {
        encoder.getClass();
        value.getClass();
        encoder.encodeSerializableValue(serializer(encoder.getSerializersModule()), value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContextualSerializer(to0 to0Var) {
        this(to0Var, null, PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY);
        to0Var.getClass();
    }
}
