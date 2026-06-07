package kotlinx.serialization.internal;

import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/LinkedHashMapClassDesc;", "Lkotlinx/serialization/internal/MapLikeDescriptor;", "keyDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "valueDesc", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class LinkedHashMapClassDesc extends MapLikeDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedHashMapClassDesc(SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        super(CollectionDescriptorsKt.LINKED_HASH_MAP_NAME, serialDescriptor, serialDescriptor2, null);
        serialDescriptor.getClass();
        serialDescriptor2.getClass();
    }
}
