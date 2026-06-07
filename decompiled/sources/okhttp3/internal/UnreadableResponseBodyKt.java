package okhttp3.internal;

import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.Response;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"stripBody", "Lokhttp3/Response;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class UnreadableResponseBodyKt {
    public static final Response stripBody(Response response) {
        response.getClass();
        return response.newBuilder().body(new UnreadableResponseBody(response.body().getMediaType(), response.body().getContentLength())).build();
    }
}
