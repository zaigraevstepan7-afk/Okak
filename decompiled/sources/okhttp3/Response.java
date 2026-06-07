package okhttp3;

import defpackage.bl1;
import defpackage.d12;
import defpackage.f00;
import defpackage.l60;
import defpackage.pk;
import defpackage.se;
import defpackage.y61;
import defpackage.yq1;
import java.io.Closeable;
import java.io.EOFException;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001dB\u008d\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b$\u0010%J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b&\u0010'J\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060)2\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010*J%\u0010,\u001a\u0004\u0018\u00010\u00062\u0006\u0010(\u001a\u00020\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b1\u0010/J\u0015\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u0015¢\u0006\u0004\b3\u00104J\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b5\u00106J\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b:\u0010;J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b<\u0010;J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b=\u0010;J\u0013\u0010?\u001a\b\u0012\u0004\u0012\u00020>0)¢\u0006\u0004\b?\u0010@J\u000f\u0010D\u001a\u00020AH\u0007¢\u0006\u0004\bB\u0010CJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010\u0017\u001a\u00020\u0015H\u0007¢\u0006\u0004\bG\u0010FJ\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0006H\u0016¢\u0006\u0004\bK\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\b\u0003\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010M\u001a\u0004\b\u0005\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\b\u0007\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\b\t\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010P\u001a\u0004\b\u000b\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010Q\u001a\u0004\b\r\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010R\u001a\u0004\b\u000f\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\b\u0011\u0010TR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0012\u0010U\u001a\u0004\b\u0012\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\b\u0013\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\b\u0014\u0010;R\u0017\u0010\u0016\u001a\u00020\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\b\u0016\u0010FR\u0017\u0010\u0017\u001a\u00020\u00158\u0007¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\b\u0017\u0010FR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010W\u001a\u0004\b\u0019\u0010XR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010YR$\u0010Z\u001a\u0004\u0018\u00010A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010C\"\u0004\b]\u0010^R\u0017\u0010`\u001a\u00020_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\b`\u0010bR\u0017\u0010c\u001a\u00020_8\u0006¢\u0006\f\n\u0004\bc\u0010a\u001a\u0004\bc\u0010bR\u0011\u0010D\u001a\u00020A8G¢\u0006\u0006\u001a\u0004\bD\u0010C¨\u0006e"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Lokhttp3/Request;", "request", "Lokhttp3/Protocol;", "protocol", "", "message", "", "code", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Headers;", "headers", "Lokhttp3/ResponseBody;", "body", "Ld12;", "socket", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lokhttp3/TrailersSource;", "trailersSource", "<init>", "(Lokhttp3/Request;Lokhttp3/Protocol;Ljava/lang/String;ILokhttp3/Handshake;Lokhttp3/Headers;Lokhttp3/ResponseBody;Ld12;Lokhttp3/Response;Lokhttp3/Response;Lokhttp3/Response;JJLokhttp3/internal/connection/Exchange;Lokhttp3/TrailersSource;)V", "-deprecated_request", "()Lokhttp3/Request;", "-deprecated_protocol", "()Lokhttp3/Protocol;", "-deprecated_code", "()I", "-deprecated_message", "()Ljava/lang/String;", "-deprecated_handshake", "()Lokhttp3/Handshake;", "name", "", "(Ljava/lang/String;)Ljava/util/List;", "defaultValue", "header", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "trailers", "peekTrailers", "byteCount", "peekBody", "(J)Lokhttp3/ResponseBody;", "-deprecated_body", "()Lokhttp3/ResponseBody;", "Lokhttp3/Response$Builder;", "newBuilder", "()Lokhttp3/Response$Builder;", "-deprecated_networkResponse", "()Lokhttp3/Response;", "-deprecated_cacheResponse", "-deprecated_priorResponse", "Lokhttp3/Challenge;", "challenges", "()Ljava/util/List;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "-deprecated_sentRequestAtMillis", "()J", "-deprecated_receivedResponseAtMillis", "Lod2;", "close", "()V", "toString", "Lokhttp3/Request;", "Lokhttp3/Protocol;", "Ljava/lang/String;", "I", "Lokhttp3/Handshake;", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "Ld12;", "()Ld12;", "Lokhttp3/Response;", "J", "Lokhttp3/internal/connection/Exchange;", "()Lokhttp3/internal/connection/Exchange;", "Lokhttp3/TrailersSource;", "lazyCacheControl", "Lokhttp3/CacheControl;", "getLazyCacheControl$okhttp", "setLazyCacheControl$okhttp", "(Lokhttp3/CacheControl;)V", "", "isSuccessful", "Z", "()Z", "isRedirect", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private final boolean isRedirect;
    private final boolean isSuccessful;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;
    private final d12 socket;
    private TrailersSource trailersSource;

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, d12 d12Var, Response response, Response response2, Response response3, long j, long j2, Exchange exchange, TrailersSource trailersSource) {
        boolean z;
        request.getClass();
        protocol.getClass();
        str.getClass();
        headers.getClass();
        responseBody.getClass();
        trailersSource.getClass();
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.socket = d12Var;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange;
        this.trailersSource = trailersSource;
        boolean z2 = true;
        if (200 <= i && i < 300) {
            z = true;
        } else {
            z = false;
        }
        this.isSuccessful = z;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    z2 = false;
                    break;
            }
        }
        this.isRedirect = z2;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    @f00
    /* renamed from: -deprecated_body, reason: not valid java name and from getter */
    public final ResponseBody getBody() {
        return this.body;
    }

    @f00
    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m256deprecated_cacheControl() {
        return cacheControl();
    }

    @f00
    /* renamed from: -deprecated_cacheResponse, reason: not valid java name and from getter */
    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    @f00
    /* renamed from: -deprecated_code, reason: not valid java name and from getter */
    public final int getCode() {
        return this.code;
    }

    @f00
    /* renamed from: -deprecated_handshake, reason: not valid java name and from getter */
    public final Handshake getHandshake() {
        return this.handshake;
    }

    @f00
    /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @f00
    /* renamed from: -deprecated_message, reason: not valid java name and from getter */
    public final String getMessage() {
        return this.message;
    }

    @f00
    /* renamed from: -deprecated_networkResponse, reason: not valid java name and from getter */
    public final Response getNetworkResponse() {
        return this.networkResponse;
    }

    @f00
    /* renamed from: -deprecated_priorResponse, reason: not valid java name and from getter */
    public final Response getPriorResponse() {
        return this.priorResponse;
    }

    @f00
    /* renamed from: -deprecated_protocol, reason: not valid java name and from getter */
    public final Protocol getProtocol() {
        return this.protocol;
    }

    @f00
    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name and from getter */
    public final long getReceivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    @f00
    /* renamed from: -deprecated_request, reason: not valid java name and from getter */
    public final Request getRequest() {
        return this.request;
    }

    @f00
    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name and from getter */
    public final long getSentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.INSTANCE.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i = this.code;
        if (i != 401) {
            if (i != 407) {
                return l60.e;
            }
            str = "Proxy-Authenticate";
        } else {
            str = "WWW-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.body.close();
    }

    public final int code() {
        return this.code;
    }

    /* renamed from: exchange, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    /* renamed from: getLazyCacheControl$okhttp, reason: from getter */
    public final CacheControl getLazyCacheControl() {
        return this.lazyCacheControl;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final String header(String name, String defaultValue) {
        name.getClass();
        String str = this.headers.get(name);
        if (str == null) {
            return defaultValue;
        }
        return str;
    }

    public final List<String> headers(String name) {
        name.getClass();
        return this.headers.values(name);
    }

    /* renamed from: isRedirect, reason: from getter */
    public final boolean getIsRedirect() {
        return this.isRedirect;
    }

    /* renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hk, java.lang.Object, pk] */
    public final ResponseBody peekBody(long byteCount) {
        bl1 peek = this.body.source().peek();
        ?? obj = new Object();
        peek.C(byteCount);
        long min = Math.min(byteCount, peek.f.f);
        while (min > 0) {
            long read = peek.read(obj, min);
            if (read != -1) {
                min -= read;
            } else {
                throw new EOFException();
            }
        }
        return ResponseBody.INSTANCE.create((pk) obj, this.body.contentType(), obj.f);
    }

    public final Headers peekTrailers() {
        return this.trailersSource.peek();
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final void setLazyCacheControl$okhttp(CacheControl cacheControl) {
        this.lazyCacheControl = cacheControl;
    }

    /* renamed from: socket, reason: from getter */
    public final d12 getSocket() {
        return this.socket;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + AbstractJsonLexerKt.END_OBJ;
    }

    public final Headers trailers() {
        return this.trailersSource.get();
    }

    public final Headers headers() {
        return this.headers;
    }

    public final String header(String str) {
        str.getClass();
        return header$default(this, str, null, 2, null);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b'\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0012J\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b(\u0010&J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020-H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00106\u001a\u0002032\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u00108J!\u00109\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b9\u0010:R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\u001d\u001a\u00020T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010#\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010%\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010d\u001a\u0004\be\u00108\"\u0004\bf\u0010\u0006R$\u0010'\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010d\u001a\u0004\bg\u00108\"\u0004\bh\u0010\u0006R$\u0010(\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010d\u001a\u0004\bi\u00108\"\u0004\bj\u0010\u0006R\"\u0010.\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u00100\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010k\u001a\u0004\bp\u0010m\"\u0004\bq\u0010oR$\u00102\u001a\u0004\u0018\u0001018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u00105R\"\u0010*\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010z¨\u0006{"}, d2 = {"Lokhttp3/Response$Builder;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)Lokhttp3/Response$Builder;", "Lokhttp3/Protocol;", "protocol", "(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;", "", "code", "(I)Lokhttp3/Response$Builder;", "", "message", "(Ljava/lang/String;)Lokhttp3/Response$Builder;", "Lokhttp3/Handshake;", "handshake", "(Lokhttp3/Handshake;)Lokhttp3/Response$Builder;", "name", "value", "header", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Response$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Response$Builder;", "Lokhttp3/ResponseBody;", "body", "(Lokhttp3/ResponseBody;)Lokhttp3/Response$Builder;", "Ld12;", "socket", "(Ld12;)Lokhttp3/Response$Builder;", "networkResponse", "(Lokhttp3/Response;)Lokhttp3/Response$Builder;", "cacheResponse", "priorResponse", "Lokhttp3/TrailersSource;", "trailersSource", "trailers", "(Lokhttp3/TrailersSource;)Lokhttp3/Response$Builder;", "", "sentRequestAtMillis", "(J)Lokhttp3/Response$Builder;", "receivedResponseAtMillis", "Lokhttp3/internal/connection/Exchange;", "exchange", "Lod2;", "initExchange$okhttp", "(Lokhttp3/internal/connection/Exchange;)V", "initExchange", "build", "()Lokhttp3/Response;", "checkSupportResponse", "(Ljava/lang/String;Lokhttp3/Response;)V", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "setRequest$okhttp", "(Lokhttp3/Request;)V", "Lokhttp3/Protocol;", "getProtocol$okhttp", "()Lokhttp3/Protocol;", "setProtocol$okhttp", "(Lokhttp3/Protocol;)V", "I", "getCode$okhttp", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Handshake;", "getHandshake$okhttp", "()Lokhttp3/Handshake;", "setHandshake$okhttp", "(Lokhttp3/Handshake;)V", "Lokhttp3/Headers$Builder;", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "Lokhttp3/ResponseBody;", "getBody$okhttp", "()Lokhttp3/ResponseBody;", "setBody$okhttp", "(Lokhttp3/ResponseBody;)V", "Ld12;", "getSocket$okhttp", "()Ld12;", "setSocket$okhttp", "(Ld12;)V", "Lokhttp3/Response;", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "setExchange$okhttp", "Lokhttp3/TrailersSource;", "getTrailersSource$okhttp", "()Lokhttp3/TrailersSource;", "setTrailersSource$okhttp", "(Lokhttp3/TrailersSource;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;
        private d12 socket;
        private TrailersSource trailersSource;

        public Builder(Response response) {
            response.getClass();
            this.code = -1;
            this.body = ResponseBody.EMPTY;
            this.trailersSource = TrailersSource.EMPTY;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.socket = response.getSocket();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.getExchange();
            this.trailersSource = response.trailersSource;
        }

        private final void checkSupportResponse(String name, Response response) {
            if (response != null) {
                if (response.networkResponse() == null) {
                    if (response.cacheResponse() == null) {
                        if (response.priorResponse() == null) {
                            return;
                        }
                        y61.g(name, ".priorResponse != null");
                        return;
                    }
                    y61.g(name, ".cacheResponse != null");
                    return;
                }
                y61.g(name, ".networkResponse != null");
            }
        }

        public Builder addHeader(String name, String value) {
            name.getClass();
            value.getClass();
            this.headers.add(name, value);
            return this;
        }

        public Builder body(ResponseBody body) {
            body.getClass();
            this.body = body;
            return this;
        }

        public Response build() {
            int i = this.code;
            if (i >= 0) {
                Request request = this.request;
                if (request != null) {
                    Protocol protocol = this.protocol;
                    if (protocol != null) {
                        String str = this.message;
                        if (str != null) {
                            return new Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.socket, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange, this.trailersSource);
                        }
                        se.p("message == null");
                        return null;
                    }
                    se.p("protocol == null");
                    return null;
                }
                se.p("request == null");
                return null;
            }
            y61.e(this.code, "code < 0: ");
            return null;
        }

        public Builder cacheResponse(Response cacheResponse) {
            checkSupportResponse("cacheResponse", cacheResponse);
            this.cacheResponse = cacheResponse;
            return this;
        }

        public Builder code(int code) {
            this.code = code;
            return this;
        }

        /* renamed from: getBody$okhttp, reason: from getter */
        public final ResponseBody getBody() {
            return this.body;
        }

        /* renamed from: getCacheResponse$okhttp, reason: from getter */
        public final Response getCacheResponse() {
            return this.cacheResponse;
        }

        /* renamed from: getCode$okhttp, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        /* renamed from: getExchange$okhttp, reason: from getter */
        public final Exchange getExchange() {
            return this.exchange;
        }

        /* renamed from: getHandshake$okhttp, reason: from getter */
        public final Handshake getHandshake() {
            return this.handshake;
        }

        /* renamed from: getHeaders$okhttp, reason: from getter */
        public final Headers.Builder getHeaders() {
            return this.headers;
        }

        /* renamed from: getMessage$okhttp, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: getNetworkResponse$okhttp, reason: from getter */
        public final Response getNetworkResponse() {
            return this.networkResponse;
        }

        /* renamed from: getPriorResponse$okhttp, reason: from getter */
        public final Response getPriorResponse() {
            return this.priorResponse;
        }

        /* renamed from: getProtocol$okhttp, reason: from getter */
        public final Protocol getProtocol() {
            return this.protocol;
        }

        /* renamed from: getReceivedResponseAtMillis$okhttp, reason: from getter */
        public final long getReceivedResponseAtMillis() {
            return this.receivedResponseAtMillis;
        }

        /* renamed from: getRequest$okhttp, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }

        /* renamed from: getSentRequestAtMillis$okhttp, reason: from getter */
        public final long getSentRequestAtMillis() {
            return this.sentRequestAtMillis;
        }

        /* renamed from: getSocket$okhttp, reason: from getter */
        public final d12 getSocket() {
            return this.socket;
        }

        /* renamed from: getTrailersSource$okhttp, reason: from getter */
        public final TrailersSource getTrailersSource() {
            return this.trailersSource;
        }

        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        public Builder header(String name, String value) {
            name.getClass();
            value.getClass();
            this.headers.set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            headers.getClass();
            this.headers = headers.newBuilder();
            return this;
        }

        public final void initExchange$okhttp(Exchange exchange) {
            exchange.getClass();
            this.exchange = exchange;
        }

        public Builder message(String message) {
            message.getClass();
            this.message = message;
            return this;
        }

        public Builder networkResponse(Response networkResponse) {
            checkSupportResponse("networkResponse", networkResponse);
            this.networkResponse = networkResponse;
            return this;
        }

        public Builder priorResponse(Response priorResponse) {
            this.priorResponse = priorResponse;
            return this;
        }

        public Builder protocol(Protocol protocol) {
            protocol.getClass();
            this.protocol = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long receivedResponseAtMillis) {
            this.receivedResponseAtMillis = receivedResponseAtMillis;
            return this;
        }

        public Builder removeHeader(String name) {
            name.getClass();
            this.headers.removeAll(name);
            return this;
        }

        public Builder request(Request request) {
            request.getClass();
            this.request = request;
            return this;
        }

        public Builder sentRequestAtMillis(long sentRequestAtMillis) {
            this.sentRequestAtMillis = sentRequestAtMillis;
            return this;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            responseBody.getClass();
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            builder.getClass();
            this.headers = builder;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public final void setSocket$okhttp(d12 d12Var) {
            this.socket = d12Var;
        }

        public final void setTrailersSource$okhttp(TrailersSource trailersSource) {
            trailersSource.getClass();
            this.trailersSource = trailersSource;
        }

        public Builder socket(d12 socket) {
            socket.getClass();
            this.socket = socket;
            return this;
        }

        public Builder trailers(TrailersSource trailersSource) {
            trailersSource.getClass();
            this.trailersSource = trailersSource;
            return this;
        }

        public Builder() {
            this.code = -1;
            this.body = ResponseBody.EMPTY;
            this.trailersSource = TrailersSource.EMPTY;
            this.headers = new Headers.Builder();
        }
    }
}
