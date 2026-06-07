package kotlinx.serialization;

import defpackage.cn;
import defpackage.d32;
import defpackage.hh1;
import defpackage.l60;
import defpackage.lo;
import defpackage.od2;
import defpackage.rr0;
import defpackage.to0;
import defpackage.v3;
import defpackage.xt0;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0011\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/PolymorphicSerializer;", "", "T", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "Lto0;", "baseClass", "<init>", "(Lto0;)V", "", "", "classAnnotations", "(Lto0;[Ljava/lang/annotation/Annotation;)V", "", "toString", "()Ljava/lang/String;", "Lto0;", "getBaseClass", "()Lto0;", "", "_annotations", "Ljava/util/List;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lrr0;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class PolymorphicSerializer<T> extends AbstractPolymorphicSerializer<T> {
    private List<? extends Annotation> _annotations;
    private final to0 baseClass;

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final rr0 descriptor;

    public PolymorphicSerializer(to0 to0Var) {
        to0Var.getClass();
        this.baseClass = to0Var;
        this._annotations = l60.e;
        this.descriptor = lo.O(xt0.e, new v3(this, 25));
    }

    public static /* synthetic */ SerialDescriptor a(PolymorphicSerializer polymorphicSerializer) {
        return descriptor_delegate$lambda$1(polymorphicSerializer);
    }

    public static final SerialDescriptor descriptor_delegate$lambda$1(PolymorphicSerializer polymorphicSerializer) {
        return ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Polymorphic", PolymorphicKind.OPEN.INSTANCE, new SerialDescriptor[0], new hh1(polymorphicSerializer, 1)), polymorphicSerializer.getBaseClass());
    }

    public static final od2 descriptor_delegate$lambda$1$lambda$0(PolymorphicSerializer polymorphicSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        classSerialDescriptorBuilder.getClass();
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "type", BuiltinSerializersKt.serializer(d32.a).getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "value", SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.Polymorphic<" + ((cn) polymorphicSerializer.getBaseClass()).d() + '>', SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
        classSerialDescriptorBuilder.setAnnotations(polymorphicSerializer._annotations);
        return od2.a;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public to0 getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + getBaseClass() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolymorphicSerializer(to0 to0Var, Annotation[] annotationArr) {
        this(to0Var);
        to0Var.getClass();
        annotationArr.getClass();
        List<? extends Annotation> asList = Arrays.asList(annotationArr);
        asList.getClass();
        this._annotations = asList;
    }
}
