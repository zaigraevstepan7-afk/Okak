package okhttp3.internal.http;

import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "<init>", "()V", "invalidatesCache", "", "method", "", "requiresRequestBody", "permitsRequestBody", "redirectsWithBody", "redirectsToGet", "isCacheable", "requestMethod", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean invalidatesCache(String method) {
        method.getClass();
        if (!method.equals("POST") && !method.equals("PATCH") && !method.equals("PUT") && !method.equals("DELETE") && !method.equals("MOVE")) {
            return false;
        }
        return true;
    }

    public static final boolean permitsRequestBody(String method) {
        method.getClass();
        if (!method.equals("GET") && !method.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static final boolean requiresRequestBody(String method) {
        method.getClass();
        if (!method.equals("POST") && !method.equals("PUT") && !method.equals("PATCH") && !method.equals("PROPPATCH") && !method.equals("QUERY") && !method.equals("REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean isCacheable(String requestMethod) {
        requestMethod.getClass();
        if (!requestMethod.equals("GET") && !requestMethod.equals("QUERY")) {
            return false;
        }
        return true;
    }

    public final boolean redirectsToGet(String method) {
        method.getClass();
        return !method.equals("PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        method.getClass();
        return method.equals("PROPFIND");
    }
}
