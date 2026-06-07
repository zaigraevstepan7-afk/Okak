package okhttp3.internal.cache;

import defpackage.sn0;
import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.internal.http.HttpMethod;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0002¨\u0006\u0002"}, d2 = {"requestForCache", "Lokhttp3/Request;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class CacheInterceptorKt {
    public static final /* synthetic */ Request access$requestForCache(Request request) {
        return requestForCache(request);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Request requestForCache(Request request) {
        HttpUrl cacheUrlOverride = request.getCacheUrlOverride();
        if (cacheUrlOverride != null) {
            if (HttpMethod.INSTANCE.isCacheable(request.method()) || sn0.r(request.method(), "POST")) {
                return request.newBuilder().get().url(cacheUrlOverride).cacheUrlOverride(null).build();
            }
            return request;
        }
        return request;
    }
}
