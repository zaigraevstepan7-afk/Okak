package kotlinx.serialization.json.internal;

import defpackage.de0;
import defpackage.yq1;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R<\u0010\u0015\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0013j\b\u0012\u0004\u0012\u00020\u0001`\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "", "<init>", "()V", "T", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "key", "value", "Lod2;", "set", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Lde0;)Ljava/lang/Object;", "get", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;)Ljava/lang/Object;", "", "Lkotlinx/serialization/json/internal/DescriptorData;", "map", "Ljava/util/Map;", "Key", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class DescriptorSchemaCache {
    private final Map<SerialDescriptor, Map<Key<Object>, Object>> map = CreateMapForCacheKt.createMapForCache(16);

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "T", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Key<T> {
    }

    public final <T> T get(SerialDescriptor descriptor, Key<T> key) {
        T t;
        descriptor.getClass();
        key.getClass();
        Map<Key<Object>, Object> map = this.map.get(descriptor);
        if (map != null) {
            t = (T) map.get(key);
        } else {
            t = null;
        }
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T> T getOrPut(SerialDescriptor descriptor, Key<T> key, de0 defaultValue) {
        descriptor.getClass();
        key.getClass();
        defaultValue.getClass();
        T t = (T) get(descriptor, key);
        if (t != null) {
            return t;
        }
        T t2 = (T) defaultValue.invoke();
        set(descriptor, key, t2);
        return t2;
    }

    public final <T> void set(SerialDescriptor descriptor, Key<T> key, T value) {
        descriptor.getClass();
        key.getClass();
        value.getClass();
        Map<SerialDescriptor, Map<Key<Object>, Object>> map = this.map;
        Map<Key<Object>, Object> map2 = map.get(descriptor);
        if (map2 == null) {
            map2 = CreateMapForCacheKt.createMapForCache(2);
            map.put(descriptor, map2);
        }
        map2.put(key, value);
    }
}
