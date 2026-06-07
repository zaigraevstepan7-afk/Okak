package kotlinx.serialization.internal;

import defpackage.yq1;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"jsonCachedSerialNames", "", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonInternalDependenciesKt {
    @CoreFriendModuleApi
    public static final Set<String> jsonCachedSerialNames(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return Platform_commonKt.cachedSerialNames(serialDescriptor);
    }
}
