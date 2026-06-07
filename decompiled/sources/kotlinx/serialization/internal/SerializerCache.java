package kotlinx.serialization.internal;

import defpackage.to0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/SerializerCache;", "T", "", "Lto0;", "key", "Lkotlinx/serialization/KSerializer;", "get", "(Lto0;)Lkotlinx/serialization/KSerializer;", "", "isStored", "(Lto0;)Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public interface SerializerCache<T> {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean isStored(SerializerCache<T> serializerCache, to0 to0Var) {
            to0Var.getClass();
            return SerializerCache.super.isStored(to0Var);
        }
    }

    KSerializer<T> get(to0 key);

    default boolean isStored(to0 key) {
        key.getClass();
        return false;
    }
}
