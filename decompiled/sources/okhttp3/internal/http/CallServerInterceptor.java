package okhttp3.internal.http;

import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.Interceptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "", "code", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class CallServerInterceptor implements Interceptor {
    public static final CallServerInterceptor INSTANCE = new CallServerInterceptor();

    private CallServerInterceptor() {
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        if (102 <= code && code < 200) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc A[Catch: IOException -> 0x00cd, TryCatch #2 {IOException -> 0x00cd, blocks: (B:71:0x00bf, B:73:0x00c8, B:25:0x00d0, B:26:0x00f6, B:28:0x00fc, B:30:0x0105, B:32:0x0108, B:35:0x012f, B:39:0x013b, B:42:0x0146, B:43:0x014d, B:47:0x0151, B:52:0x0162, B:53:0x01a5, B:55:0x01b3, B:62:0x01c8, B:64:0x01d7, B:65:0x01fd, B:66:0x01bd, B:67:0x018c), top: B:70:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r19) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
