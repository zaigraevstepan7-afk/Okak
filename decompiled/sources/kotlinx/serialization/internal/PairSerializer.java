package kotlinx.serialization.internal;

import defpackage.od2;
import defpackage.rz0;
import defpackage.xd1;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/PairSerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "Lxd1;", "Lkotlinx/serialization/KSerializer;", "keySerializer", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "key", "value", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Lxd1;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKey", "(Lxd1;)Ljava/lang/Object;", "getValue", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class PairSerializer<K, V> extends KeyValueSerializer<K, V, xd1> {
    private final SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        kSerializer.getClass();
        kSerializer2.getClass();
        this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Pair", new SerialDescriptor[0], new rz0(kSerializer, kSerializer2, 1));
    }

    public static final od2 descriptor$lambda$0(KSerializer kSerializer, KSerializer kSerializer2, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        classSerialDescriptorBuilder.getClass();
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "first", kSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "second", kSerializer2.getDescriptor(), null, false, 12, null);
        return od2.a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    /* renamed from: toResult */
    public xd1 toResult2(K key, V value) {
        return new xd1(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public /* bridge */ /* synthetic */ xd1 toResult(Object obj, Object obj2) {
        return toResult2((PairSerializer<K, V>) obj, obj2);
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public K getKey(xd1 xd1Var) {
        xd1Var.getClass();
        return (K) xd1Var.e;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public V getValue(xd1 xd1Var) {
        xd1Var.getClass();
        return (V) xd1Var.f;
    }
}
