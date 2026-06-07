package kotlinx.serialization.internal;

import defpackage.fp0;
import defpackage.l60;
import defpackage.se;
import defpackage.to0;
import defpackage.yq1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J;\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "T", "", "Lto0;", "key", "", "Lfp0;", "types", "Lgo1;", "Lkotlinx/serialization/KSerializer;", "get-gIAlu-s", "(Lto0;Ljava/util/List;)Ljava/lang/Object;", "get", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public interface ParametrizedSerializerCache<T> {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: get-gIAlu-s$default, reason: not valid java name */
    static /* synthetic */ Object m84getgIAlus$default(ParametrizedSerializerCache parametrizedSerializerCache, to0 to0Var, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                list = l60.e;
            }
            return parametrizedSerializerCache.mo80getgIAlus(to0Var, list);
        }
        se.v("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
        return null;
    }

    /* renamed from: get-gIAlu-s */
    Object mo80getgIAlus(to0 key, List<? extends fp0> types);
}
