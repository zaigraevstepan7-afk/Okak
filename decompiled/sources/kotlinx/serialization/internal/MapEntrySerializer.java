package kotlinx.serialization.internal;

import defpackage.od2;
import defpackage.rz0;
import defpackage.sn0;
import defpackage.xo0;
import defpackage.yq1;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0003:\u0001\u0015B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u0014R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "", "keySerializer", "Lkotlinx/serialization/KSerializer;", "valueSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "key", "getKey", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "value", "getValue", "toResult", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "MapEntry", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class MapEntrySerializer<K, V> extends KeyValueSerializer<K, V, Map.Entry<? extends K, ? extends V>> {
    private final SerialDescriptor descriptor;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00022\b\b\u0002\u0010\u0005\u001a\u00028\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00028\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer$MapEntry;", "K", "V", "", "key", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/serialization/internal/MapEntrySerializer$MapEntry;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final /* data */ class MapEntry<K, V> implements Map.Entry<K, V>, xo0 {
        private final K key;
        private final V value;

        public MapEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MapEntry copy$default(MapEntry mapEntry, Object obj, Object obj2, int i, Object obj3) {
            if ((i & 1) != 0) {
                obj = mapEntry.key;
            }
            if ((i & 2) != 0) {
                obj2 = mapEntry.value;
            }
            return mapEntry.copy(obj, obj2);
        }

        public final K component1() {
            return this.key;
        }

        public final V component2() {
            return this.value;
        }

        public final MapEntry<K, V> copy(K key, V value) {
            return new MapEntry<>(key, value);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry) other;
            if (sn0.r(this.key, mapEntry.key) && sn0.r(this.value, mapEntry.value)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k = this.key;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            int i2 = hashCode * 31;
            V v = this.value;
            if (v != null) {
                i = v.hashCode();
            }
            return i2 + i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.key + ", value=" + this.value + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        kSerializer.getClass();
        kSerializer2.getClass();
        this.descriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlin.collections.Map.Entry", StructureKind.MAP.INSTANCE, new SerialDescriptor[0], new rz0(kSerializer, kSerializer2, 0));
    }

    public static final od2 descriptor$lambda$0(KSerializer kSerializer, KSerializer kSerializer2, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        classSerialDescriptorBuilder.getClass();
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "key", kSerializer.getDescriptor(), null, false, 12, null);
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "value", kSerializer2.getDescriptor(), null, false, 12, null);
        return od2.a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public K getKey(Map.Entry<? extends K, ? extends V> entry) {
        entry.getClass();
        return entry.getKey();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public V getValue(Map.Entry<? extends K, ? extends V> entry) {
        entry.getClass();
        return entry.getValue();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public Map.Entry<K, V> toResult(K key, V value) {
        return new MapEntry(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public /* bridge */ /* synthetic */ Object toResult(Object obj, Object obj2) {
        return toResult((MapEntrySerializer<K, V>) obj, obj2);
    }
}
