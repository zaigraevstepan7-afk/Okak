package okhttp3.internal.http;

import defpackage.sn0;
import defpackage.yq1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jsoup.helper.HttpConnection;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "<init>", "(Lokhttp3/OkHttpClient;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "recover", "", "e", "Ljava/io/IOException;", "call", "Lokhttp3/internal/connection/RealCall;", "userRequest", "Lokhttp3/Request;", "requestIsOneShot", "isRecoverable", "requestSendStarted", "followUpRequest", "userResponse", "exchange", "Lokhttp3/internal/connection/Exchange;", "buildRedirectRequest", "method", "", "retryAfter", "", "defaultDelay", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.client = okHttpClient;
    }

    private final Request buildRedirectRequest(Response userResponse, String method) {
        String header$default;
        HttpUrl resolve;
        boolean z;
        RequestBody requestBody = null;
        if (!this.client.followRedirects() || (header$default = Response.header$default(userResponse, "Location", null, 2, null)) == null || (resolve = userResponse.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!sn0.r(resolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            int code = userResponse.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            if (!httpMethod.redirectsWithBody(method) && code != 308 && code != 307) {
                z = false;
            } else {
                z = true;
            }
            if (httpMethod.redirectsToGet(method) && code != 308 && code != 307) {
                newBuilder.method("GET", null);
            } else {
                if (z) {
                    requestBody = userResponse.request().body();
                }
                newBuilder.method(method, requestBody);
            }
            if (!z) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader(HttpConnection.CONTENT_TYPE);
            }
        }
        if (!_UtilJvmKt.canReuseConnectionFor(userResponse.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final Request followUpRequest(Response userResponse, Exchange exchange) {
        Route route;
        RealConnection connection$okhttp;
        if (exchange != null && (connection$okhttp = exchange.getConnection$okhttp()) != null) {
            route = connection$okhttp.route();
        } else {
            route = null;
        }
        int code = userResponse.code();
        String method = userResponse.request().method();
        if (code != 307 && code != 308) {
            if (code != 401) {
                if (code != 421) {
                    if (code != 503) {
                        if (code != 407) {
                            if (code != 408) {
                                switch (code) {
                                    case 300:
                                    case 301:
                                    case 302:
                                    case 303:
                                        break;
                                    default:
                                        return null;
                                }
                            } else {
                                if (!this.client.retryOnConnectionFailure()) {
                                    return null;
                                }
                                RequestBody body = userResponse.request().body();
                                if (body != null && body.isOneShot()) {
                                    return null;
                                }
                                Response priorResponse = userResponse.priorResponse();
                                if ((priorResponse != null && priorResponse.code() == 408) || retryAfter(userResponse, 0) > 0) {
                                    return null;
                                }
                                return userResponse.request();
                            }
                        } else {
                            route.getClass();
                            if (route.proxy().type() == Proxy.Type.HTTP) {
                                return this.client.proxyAuthenticator().authenticate(route, userResponse);
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        Response priorResponse2 = userResponse.priorResponse();
                        if ((priorResponse2 != null && priorResponse2.code() == 503) || retryAfter(userResponse, Integer.MAX_VALUE) != 0) {
                            return null;
                        }
                        return userResponse.request();
                    }
                } else {
                    RequestBody body2 = userResponse.request().body();
                    if ((body2 != null && body2.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                        return null;
                    }
                    exchange.getConnection$okhttp().noCoalescedConnections$okhttp();
                    return userResponse.request();
                }
            } else {
                return this.client.authenticator().authenticate(route, userResponse);
            }
        }
        return buildRedirectRequest(userResponse, method);
    }

    private final boolean isRecoverable(IOException e, boolean requestSendStarted) {
        if (e instanceof ProtocolException) {
            return false;
        }
        if (e instanceof InterruptedIOException) {
            if (!(e instanceof SocketTimeoutException) || requestSendStarted) {
                return false;
            }
            return true;
        }
        if (((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) || (e instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return true;
    }

    private final boolean recover(IOException e, RealCall call, Request userRequest) {
        boolean z = e instanceof ConnectionShutdownException;
        boolean z2 = !z;
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((!z && requestIsOneShot(e, userRequest)) || !isRecoverable(e, z2) || !call.retryAfterFailure()) {
            return false;
        }
        return true;
    }

    private final boolean requestIsOneShot(IOException e, Request userRequest) {
        RequestBody body = userRequest.body();
        if ((body != null && body.isOneShot()) || (e instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }

    private final int retryAfter(Response userResponse, int defaultDelay) {
        String header$default = Response.header$default(userResponse, "Retry-After", null, 2, null);
        if (header$default == null) {
            return defaultDelay;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (compile.matcher(header$default).matches()) {
            Integer valueOf = Integer.valueOf(header$default);
            valueOf.getClass();
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r0 = r12.proceed(r0).newBuilder().request(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r6 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r7 = r0.priorResponse(r6).build();
        r0 = r1.getInterceptorScopedExchange();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r6 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r0.isOneShot() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        okhttp3.internal._UtilCommonKt.closeQuietly(r7.body());
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r8 > 20) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004e, code lost:
    
        if (r0.isDuplex$okhttp() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        r1.getEventListener().followUpDecision(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005e, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d7, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0035, code lost:
    
        r6 = null;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r12) {
        /*
            r11 = this;
            r12.getClass()
            okhttp3.internal.http.RealInterceptorChain r12 = (okhttp3.internal.http.RealInterceptorChain) r12
            okhttp3.Request r0 = r12.getRequest()
            okhttp3.internal.connection.RealCall r1 = r12.getCall()
            r2 = 0
            r3 = 0
            r4 = 1
            l60 r5 = defpackage.l60.e
            r8 = r2
            r7 = r3
        L14:
            r6 = r4
        L15:
            r1.enterNetworkInterceptorExchange(r0, r6, r12)
            boolean r6 = r1.getCanceled()     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto Lcc
            okhttp3.Response r6 = r12.proceed(r0)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> Laf
            okhttp3.Response$Builder r6 = r6.newBuilder()     // Catch: java.lang.Throwable -> L31
            okhttp3.Response$Builder r0 = r6.request(r0)     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L35
            okhttp3.Response r6 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r7)     // Catch: java.lang.Throwable -> L31
            goto L36
        L31:
            r11 = move-exception
            r2 = r4
            goto Ld4
        L35:
            r6 = r3
        L36:
            okhttp3.Response$Builder r0 = r0.priorResponse(r6)     // Catch: java.lang.Throwable -> L31
            okhttp3.Response r7 = r0.build()     // Catch: java.lang.Throwable -> L31
            okhttp3.internal.connection.Exchange r0 = r1.getInterceptorScopedExchange()     // Catch: java.lang.Throwable -> L31
            okhttp3.Request r6 = r11.followUpRequest(r7, r0)     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L61
            if (r0 == 0) goto L53
            boolean r11 = r0.getIsDuplex()     // Catch: java.lang.Throwable -> L31
            if (r11 == 0) goto L53
            r1.timeoutEarlyExit()     // Catch: java.lang.Throwable -> L31
        L53:
            okhttp3.EventListener r11 = r1.getEventListener()     // Catch: java.lang.Throwable -> L5e
            r11.followUpDecision(r1, r7, r3)     // Catch: java.lang.Throwable -> L5e
            r1.exitNetworkInterceptorExchange$okhttp(r2)
            return r7
        L5e:
            r11 = move-exception
            goto Ld4
        L61:
            okhttp3.RequestBody r0 = r6.body()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L78
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L78
            okhttp3.EventListener r11 = r1.getEventListener()     // Catch: java.lang.Throwable -> L5e
            r11.followUpDecision(r1, r7, r3)     // Catch: java.lang.Throwable -> L5e
            r1.exitNetworkInterceptorExchange$okhttp(r2)
            return r7
        L78:
            okhttp3.ResponseBody r0 = r7.body()     // Catch: java.lang.Throwable -> L31
            okhttp3.internal._UtilCommonKt.closeQuietly(r0)     // Catch: java.lang.Throwable -> L31
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L91
            okhttp3.EventListener r0 = r1.getEventListener()     // Catch: java.lang.Throwable -> L31
            r0.followUpDecision(r1, r7, r6)     // Catch: java.lang.Throwable -> L31
            r1.exitNetworkInterceptorExchange$okhttp(r4)
            r0 = r6
            goto L14
        L91:
            okhttp3.EventListener r11 = r1.getEventListener()     // Catch: java.lang.Throwable -> L31
            r11.followUpDecision(r1, r7, r3)     // Catch: java.lang.Throwable -> L31
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r12.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "Too many follow-up requests: "
            r12.append(r0)     // Catch: java.lang.Throwable -> L31
            r12.append(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L31
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L31
            throw r11     // Catch: java.lang.Throwable -> L31
        Laf:
            r6 = move-exception
            boolean r9 = r11.recover(r6, r1, r0)     // Catch: java.lang.Throwable -> L31
            okhttp3.EventListener r10 = r1.getEventListener()     // Catch: java.lang.Throwable -> L31
            r10.retryDecision(r1, r6, r9)     // Catch: java.lang.Throwable -> L31
            if (r9 == 0) goto Lc7
            java.util.ArrayList r5 = defpackage.wn.r0(r5, r6)     // Catch: java.lang.Throwable -> L31
            r1.exitNetworkInterceptorExchange$okhttp(r4)
            r6 = r2
            goto L15
        Lc7:
            java.lang.Throwable r11 = okhttp3.internal._UtilCommonKt.withSuppressed(r6, r5)     // Catch: java.lang.Throwable -> L31
            throw r11     // Catch: java.lang.Throwable -> L31
        Lcc:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L31
            java.lang.String r12 = "Canceled"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L31
            throw r11     // Catch: java.lang.Throwable -> L31
        Ld4:
            r1.exitNetworkInterceptorExchange$okhttp(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
