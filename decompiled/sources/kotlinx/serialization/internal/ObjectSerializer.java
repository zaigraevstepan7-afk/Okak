package kotlinx.serialization.internal;

import defpackage.j1;
import defpackage.l60;
import defpackage.l90;
import defpackage.lo;
import defpackage.od2;
import defpackage.r;
import defpackage.rr0;
import defpackage.xt0;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bB'\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0007\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lkotlinx/serialization/internal/ObjectSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "objectInstance", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "", "classAnnotations", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lod2;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Ljava/lang/Object;", "", "_annotations", "Ljava/util/List;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lrr0;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ObjectSerializer<T> implements KSerializer<T> {
    private List<? extends Annotation> _annotations;

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final rr0 descriptor;
    private final T objectInstance;

    public ObjectSerializer(String str, T t) {
        str.getClass();
        t.getClass();
        this.objectInstance = t;
        this._annotations = l60.e;
        this.descriptor = lo.O(xt0.e, new j1(29, str, this));
    }

    public static /* synthetic */ od2 a(ObjectSerializer objectSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        return descriptor_delegate$lambda$1$lambda$0(objectSerializer, classSerialDescriptorBuilder);
    }

    public static /* synthetic */ SerialDescriptor b(String str, ObjectSerializer objectSerializer) {
        return descriptor_delegate$lambda$1(str, objectSerializer);
    }

    public static final SerialDescriptor descriptor_delegate$lambda$1(String str, ObjectSerializer objectSerializer) {
        return SerialDescriptorsKt.buildSerialDescriptor(str, StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], new r(objectSerializer, 28));
    }

    public static final od2 descriptor_delegate$lambda$1$lambda$0(ObjectSerializer objectSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        classSerialDescriptorBuilder.getClass();
        classSerialDescriptorBuilder.setAnnotations(objectSerializer._annotations);
        return od2.a;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(Decoder decoder) {
        int decodeElementIndex;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (beginStructure.decodeSequentially() || (decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor())) == -1) {
            beginStructure.endStructure(descriptor);
            return this.objectInstance;
        }
        throw new SerializationException(l90.g(decodeElementIndex, "Unexpected index "));
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor.getValue();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, T value) {
        encoder.getClass();
        value.getClass();
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectSerializer(String str, T t, Annotation[] annotationArr) {
        this(str, t);
        str.getClass();
        t.getClass();
        annotationArr.getClass();
        List<? extends Annotation> asList = Arrays.asList(annotationArr);
        asList.getClass();
        this._annotations = asList;
    }
}
