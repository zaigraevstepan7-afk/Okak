package kotlinx.serialization;

import defpackage.bt1;
import defpackage.cn;
import defpackage.d32;
import defpackage.eg0;
import defpackage.ii1;
import defpackage.l60;
import defpackage.lo;
import defpackage.od2;
import defpackage.rr0;
import defpackage.to0;
import defpackage.tz0;
import defpackage.xd1;
import defpackage.xt0;
import defpackage.yl1;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b¢\u0006\u0004\b\f\u0010\rBY\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\f\u0010\u0010J)\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R0\u0010)\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R(\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lkotlinx/serialization/SealedClassSerializer;", "", "T", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "", "serialName", "Lto0;", "baseClass", "", "subclasses", "Lkotlinx/serialization/KSerializer;", "subclassSerializers", "<init>", "(Ljava/lang/String;Lto0;[Lto0;[Lkotlinx/serialization/KSerializer;)V", "", "classAnnotations", "(Ljava/lang/String;Lto0;[Lto0;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decoder", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "findPolymorphicSerializerOrNull", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "Lto0;", "getBaseClass", "()Lto0;", "", "_annotations", "Ljava/util/List;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lrr0;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "class2Serializer", "Ljava/util/Map;", "serialName2Serializer", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@InternalSerializationApi
/* loaded from: classes.dex */
public final class SealedClassSerializer<T> extends AbstractPolymorphicSerializer<T> {
    private List<? extends Annotation> _annotations;
    private final to0 baseClass;
    private final Map<to0, KSerializer<? extends T>> class2Serializer;

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final rr0 descriptor;
    private final Map<String, KSerializer<? extends T>> serialName2Serializer;

    public SealedClassSerializer(String str, to0 to0Var, to0[] to0VarArr, KSerializer<? extends T>[] kSerializerArr) {
        str.getClass();
        to0Var.getClass();
        to0VarArr.getClass();
        kSerializerArr.getClass();
        this.baseClass = to0Var;
        this._annotations = l60.e;
        this.descriptor = lo.O(xt0.e, new ii1(2, str, this));
        if (to0VarArr.length == kSerializerArr.length) {
            int min = Math.min(to0VarArr.length, kSerializerArr.length);
            ArrayList arrayList = new ArrayList(min);
            for (int i = 0; i < min; i++) {
                arrayList.add(new xd1(to0VarArr[i], kSerializerArr[i]));
            }
            Map<to0, KSerializer<? extends T>> e0 = tz0.e0(arrayList);
            this.class2Serializer = e0;
            final Set<Map.Entry<to0, KSerializer<? extends T>>> entrySet = e0.entrySet();
            eg0 eg0Var = new eg0() { // from class: kotlinx.serialization.SealedClassSerializer$special$$inlined$groupingBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eg0
                public String keyOf(Map.Entry<? extends to0, ? extends KSerializer<? extends T>> element) {
                    return ((KSerializer) element.getValue()).getDescriptor().getSerialName();
                }

                @Override // defpackage.eg0
                public Iterator<Map.Entry<? extends to0, ? extends KSerializer<? extends T>>> sourceIterator() {
                    return entrySet.iterator();
                }
            };
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator sourceIterator = eg0Var.sourceIterator();
            while (sourceIterator.hasNext()) {
                Object next = sourceIterator.next();
                Object keyOf = eg0Var.keyOf(next);
                Object obj = linkedHashMap.get(keyOf);
                if (obj == null) {
                    linkedHashMap.containsKey(keyOf);
                }
                Map.Entry entry = (Map.Entry) next;
                Map.Entry entry2 = (Map.Entry) obj;
                String str2 = (String) keyOf;
                if (entry2 == null) {
                    linkedHashMap.put(keyOf, entry);
                } else {
                    StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                    sb.append(getBaseClass());
                    sb.append("' have the same serial name '");
                    sb.append(str2);
                    sb.append("': '");
                    sb.append(entry2.getKey());
                    Object key = entry.getKey();
                    sb.append("', '");
                    sb.append(key);
                    sb.append('\'');
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(tz0.c0(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.serialName2Serializer = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + ((cn) getBaseClass()).d() + " should be marked @Serializable");
    }

    public static final SerialDescriptor descriptor_delegate$lambda$3(String str, SealedClassSerializer sealedClassSerializer) {
        return SerialDescriptorsKt.buildSerialDescriptor(str, PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], new bt1(sealedClassSerializer, 0));
    }

    public static final od2 descriptor_delegate$lambda$3$lambda$2(SealedClassSerializer sealedClassSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        classSerialDescriptorBuilder.getClass();
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "type", BuiltinSerializersKt.serializer(d32.a).getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "value", SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Sealed<" + ((cn) sealedClassSerializer.getBaseClass()).d() + '>', SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], new bt1(sealedClassSerializer, 1)), null, false, 12, null);
        classSerialDescriptorBuilder.setAnnotations(sealedClassSerializer._annotations);
        return od2.a;
    }

    public static final od2 descriptor_delegate$lambda$3$lambda$2$lambda$1(SealedClassSerializer sealedClassSerializer, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        classSerialDescriptorBuilder.getClass();
        for (Map.Entry<String, KSerializer<? extends T>> entry : sealedClassSerializer.serialName2Serializer.entrySet()) {
            ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, entry.getKey(), entry.getValue().getDescriptor(), null, false, 12, null);
        }
        return od2.a;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(Encoder encoder, T value) {
        KSerializer<? extends T> findPolymorphicSerializerOrNull;
        encoder.getClass();
        value.getClass();
        KSerializer<? extends T> kSerializer = this.class2Serializer.get(yl1.a(value.getClass()));
        if (kSerializer != null) {
            findPolymorphicSerializerOrNull = kSerializer;
        } else {
            findPolymorphicSerializerOrNull = super.findPolymorphicSerializerOrNull(encoder, (Encoder) value);
        }
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        return null;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public to0 getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor.getValue();
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(CompositeDecoder decoder, String klassName) {
        decoder.getClass();
        KSerializer<? extends T> kSerializer = this.serialName2Serializer.get(klassName);
        return kSerializer != null ? kSerializer : super.findPolymorphicSerializerOrNull(decoder, klassName);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer(String str, to0 to0Var, to0[] to0VarArr, KSerializer<? extends T>[] kSerializerArr, Annotation[] annotationArr) {
        this(str, to0Var, to0VarArr, kSerializerArr);
        str.getClass();
        to0Var.getClass();
        to0VarArr.getClass();
        kSerializerArr.getClass();
        annotationArr.getClass();
        List<? extends Annotation> asList = Arrays.asList(annotationArr);
        asList.getClass();
        this._annotations = asList;
    }
}
