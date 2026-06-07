package okhttp3.internal.http1;

import defpackage.ae0;
import defpackage.ea2;
import defpackage.ey1;
import defpackage.hk;
import defpackage.i32;
import defpackage.k12;
import defpackage.l90;
import defpackage.ok;
import defpackage.p32;
import defpackage.se;
import defpackage.y61;
import defpackage.yq1;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 Q2\u00020\u0001:\u0007RSTUVWQB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010\u0013J\u001d\u0010%\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u0010/J\u001f\u00104\u001a\u00020\u001a2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u001a2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u001a2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b8\u00107J\u0017\u0010;\u001a\u00020\u00112\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010N\u001a\u00020'*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0018\u0010N\u001a\u00020'*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010P¨\u0006X"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "carrier", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/ExchangeCodec$Carrier;Lokhttp3/internal/connection/BufferedSocket;)V", "Lokhttp3/Request;", "request", "", "contentLength", "Ley1;", "createRequestBody", "(Lokhttp3/Request;J)Ley1;", "Lod2;", "cancel", "()V", "writeRequestHeaders", "(Lokhttp3/Request;)V", "Lokhttp3/Response;", "response", "reportedContentLength", "(Lokhttp3/Response;)J", "Lk12;", "openResponseBodySource", "(Lokhttp3/Response;)Lk12;", "Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "flushRequest", "finishRequest", "headers", "", "requestLine", "writeRequest", "(Lokhttp3/Headers;Ljava/lang/String;)V", "", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "skipConnectBody", "(Lokhttp3/Response;)V", "newChunkedSink", "()Ley1;", "newKnownLengthSink", "Lokhttp3/HttpUrl;", "url", "length", "newFixedLengthSource", "(Lokhttp3/HttpUrl;J)Lk12;", "newChunkedSource", "(Lokhttp3/HttpUrl;)Lk12;", "newUnknownLengthSource", "Lae0;", "timeout", "detachTimeout", "(Lae0;)V", "Lokhttp3/OkHttpClient;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "getCarrier", "()Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/connection/BufferedSocket;", "getSocket", "()Lokhttp3/internal/connection/BufferedSocket;", "", "state", "I", "Lokhttp3/internal/http1/HeadersReader;", "headersReader", "Lokhttp3/internal/http1/HeadersReader;", "trailers", "Lokhttp3/Headers;", "isResponseComplete", "()Z", "isChunked", "(Lokhttp3/Response;)Z", "(Lokhttp3/Request;)Z", "Companion", "KnownLengthSink", "ChunkedSink", "AbstractSource", "FixedLengthSource", "ChunkedSource", "UnknownLengthSource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final ExchangeCodec.Carrier carrier;
    private final OkHttpClient client;
    private final HeadersReader headersReader;
    private final BufferedSocket socket;
    private int state;
    private Headers trailers;
    private static final Headers TRAILERS_RESPONSE_BODY_TRUNCATED = Headers.INSTANCE.of("OkHttp-Response-Body", "Truncated");

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b¢\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lk12;", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "Lea2;", "timeout", "()Lea2;", "Lhk;", "sink", "", "byteCount", "read", "(Lhk;J)J", "Lokhttp3/Headers;", "trailers", "Lod2;", "responseBodyComplete", "(Lokhttp3/Headers;)V", "Lokhttp3/HttpUrl;", "getUrl", "()Lokhttp3/HttpUrl;", "Lae0;", "Lae0;", "getTimeout", "()Lae0;", "", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public abstract class AbstractSource implements k12 {
        private boolean closed;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final ae0 timeout;
        private final HttpUrl url;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
            this.timeout = new ae0(http1ExchangeCodec.getSocket().getSource().getTimeout());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close();

        public final boolean getClosed() {
            return this.closed;
        }

        public final ae0 getTimeout() {
            return this.timeout;
        }

        public final HttpUrl getUrl() {
            return this.url;
        }

        @Override // defpackage.k12
        public long read(hk sink, long byteCount) {
            sink.getClass();
            try {
                return this.this$0.getSocket().getSource().read(sink, byteCount);
            } catch (IOException e) {
                this.this$0.getCarrier().noNewExchanges();
                this.responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                throw e;
            }
        }

        public final void responseBodyComplete(Headers trailers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            trailers.getClass();
            if (this.this$0.state != 6) {
                int i = this.this$0.state;
                Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                if (i == 5) {
                    http1ExchangeCodec.detachTimeout(this.timeout);
                    this.this$0.trailers = trailers;
                    this.this$0.state = 6;
                    if (trailers.size() > 0 && (okHttpClient = this.this$0.client) != null && (cookieJar = okHttpClient.cookieJar()) != null) {
                        HttpHeaders.receiveHeaders(cookieJar, this.url, trailers);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + http1ExchangeCodec.state);
            }
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // defpackage.k12
        /* renamed from: timeout */
        public ea2 getTimeout() {
            return this.timeout;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Ley1;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Lea2;", "timeout", "()Lea2;", "Lhk;", "source", "", "byteCount", "Lod2;", "write", "(Lhk;J)V", "flush", "()V", "close", "Lae0;", "Lae0;", "", "closed", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class ChunkedSink implements ey1 {
        private boolean closed;
        private final ae0 timeout;

        public ChunkedSink() {
            this.timeout = new ae0(Http1ExchangeCodec.this.getSocket().getSink().timeout());
        }

        @Override // defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.getSocket().getSink().u("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // defpackage.ey1, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.getSocket().getSink().flush();
        }

        @Override // defpackage.ey1
        public ea2 timeout() {
            return this.timeout;
        }

        @Override // defpackage.ey1
        public void write(hk source, long byteCount) {
            source.getClass();
            if (!this.closed) {
                if (byteCount == 0) {
                    return;
                }
                ok sink = Http1ExchangeCodec.this.getSocket().getSink();
                sink.y(byteCount);
                sink.u("\r\n");
                sink.write(source, byteCount);
                sink.u("\r\n");
                return;
            }
            se.p("closed");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "Lod2;", "readChunkSize", "()V", "Lhk;", "sink", "", "byteCount", "read", "(Lhk;J)J", "close", "bytesRemainingInChunk", "J", "", "hasMoreChunks", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.bytesRemainingInChunk = Http1ExchangeCodec.NO_CHUNK_YET;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != Http1ExchangeCodec.NO_CHUNK_YET) {
                this.this$0.getSocket().getSource().F();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.getSocket().getSource().N();
                String obj = i32.Y(this.this$0.getSocket().getSource().F()).toString();
                if (this.bytesRemainingInChunk >= 0 && (obj.length() <= 0 || p32.D(obj, ";", false))) {
                    if (this.bytesRemainingInChunk == 0) {
                        this.hasMoreChunks = false;
                        responseBodyComplete(this.this$0.headersReader.readHeaders());
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + obj + AbstractJsonLexerKt.STRING);
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.k12
        public long read(hk sink, long byteCount) {
            sink.getClass();
            if (byteCount >= 0) {
                if (!getClosed()) {
                    if (!this.hasMoreChunks) {
                        return Http1ExchangeCodec.NO_CHUNK_YET;
                    }
                    long j = this.bytesRemainingInChunk;
                    if (j == 0 || j == Http1ExchangeCodec.NO_CHUNK_YET) {
                        readChunkSize();
                        if (!this.hasMoreChunks) {
                            return Http1ExchangeCodec.NO_CHUNK_YET;
                        }
                    }
                    long read = super.read(sink, Math.min(byteCount, this.bytesRemainingInChunk));
                    if (read != Http1ExchangeCodec.NO_CHUNK_YET) {
                        this.bytesRemainingInChunk -= read;
                        return read;
                    }
                    this.this$0.getCarrier().noNewExchanges();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                    throw protocolException;
                }
                se.p("closed");
                return 0L;
            }
            se.e(l90.k("byteCount < 0: ", byteCount));
            return 0L;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "url", "", "bytesRemaining", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;J)V", "Lhk;", "sink", "byteCount", "read", "(Lhk;J)J", "Lod2;", "close", "()V", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl, long j) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete(Headers.EMPTY);
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !_UtilJvmKt.discard(this, 100, TimeUnit.MILLISECONDS)) {
                this.this$0.getCarrier().noNewExchanges();
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.k12
        public long read(hk sink, long byteCount) {
            sink.getClass();
            if (byteCount >= 0) {
                if (!getClosed()) {
                    long j = this.bytesRemaining;
                    if (j == 0) {
                        return Http1ExchangeCodec.NO_CHUNK_YET;
                    }
                    long read = super.read(sink, Math.min(j, byteCount));
                    if (read != Http1ExchangeCodec.NO_CHUNK_YET) {
                        long j2 = this.bytesRemaining - read;
                        this.bytesRemaining = j2;
                        if (j2 == 0) {
                            responseBodyComplete(Headers.EMPTY);
                        }
                        return read;
                    }
                    this.this$0.getCarrier().noNewExchanges();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
                    throw protocolException;
                }
                se.p("closed");
                return 0L;
            }
            se.e(l90.k("byteCount < 0: ", byteCount));
            return 0L;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Ley1;", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "Lea2;", "timeout", "()Lea2;", "Lhk;", "source", "", "byteCount", "Lod2;", "write", "(Lhk;J)V", "flush", "()V", "close", "Lae0;", "Lae0;", "", "closed", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class KnownLengthSink implements ey1 {
        private boolean closed;
        private final ae0 timeout;

        public KnownLengthSink() {
            this.timeout = new ae0(Http1ExchangeCodec.this.getSocket().getSink().timeout());
        }

        @Override // defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // defpackage.ey1, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.getSocket().getSink().flush();
        }

        @Override // defpackage.ey1
        public ea2 timeout() {
            return this.timeout;
        }

        @Override // defpackage.ey1
        public void write(hk source, long byteCount) {
            source.getClass();
            if (!this.closed) {
                _UtilCommonKt.checkOffsetAndCount(source.f, 0L, byteCount);
                Http1ExchangeCodec.this.getSocket().getSink().write(source, byteCount);
            } else {
                se.p("closed");
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/HttpUrl;", "url", "<init>", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "Lhk;", "sink", "", "byteCount", "read", "(Lhk;J)J", "Lod2;", "close", "()V", "", "inputExhausted", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;
        final /* synthetic */ Http1ExchangeCodec this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.this$0 = http1ExchangeCodec;
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete(Http1ExchangeCodec.TRAILERS_RESPONSE_BODY_TRUNCATED);
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.k12
        public long read(hk sink, long byteCount) {
            sink.getClass();
            if (byteCount >= 0) {
                if (!getClosed()) {
                    if (this.inputExhausted) {
                        return Http1ExchangeCodec.NO_CHUNK_YET;
                    }
                    long read = super.read(sink, byteCount);
                    if (read == Http1ExchangeCodec.NO_CHUNK_YET) {
                        this.inputExhausted = true;
                        responseBodyComplete(Headers.EMPTY);
                        return Http1ExchangeCodec.NO_CHUNK_YET;
                    }
                    return read;
                }
                se.p("closed");
                return 0L;
            }
            se.e(l90.k("byteCount < 0: ", byteCount));
            return 0L;
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, ExchangeCodec.Carrier carrier, BufferedSocket bufferedSocket) {
        carrier.getClass();
        bufferedSocket.getClass();
        this.client = okHttpClient;
        this.carrier = carrier;
        this.socket = bufferedSocket;
        this.headersReader = new HeadersReader(getSocket().getSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(ae0 timeout) {
        ea2 ea2Var = timeout.a;
        ea2 ea2Var2 = ea2.NONE;
        ea2Var2.getClass();
        timeout.a = ea2Var2;
        ea2Var.clearDeadline();
        ea2Var.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return "chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null));
    }

    private final ey1 newChunkedSink() {
        if (this.state == 1) {
            this.state = 2;
            return new ChunkedSink();
        }
        y61.e(this.state, "state: ");
        return null;
    }

    private final k12 newChunkedSource(HttpUrl url) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, url);
        }
        y61.e(this.state, "state: ");
        return null;
    }

    private final k12 newFixedLengthSource(HttpUrl url, long length) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(this, url, length);
        }
        y61.e(this.state, "state: ");
        return null;
    }

    private final ey1 newKnownLengthSink() {
        if (this.state == 1) {
            this.state = 2;
            return new KnownLengthSink();
        }
        y61.e(this.state, "state: ");
        return null;
    }

    private final k12 newUnknownLengthSource(HttpUrl url) {
        if (this.state == 4) {
            this.state = 5;
            getCarrier().noNewExchanges();
            return new UnknownLengthSource(this, url);
        }
        y61.e(this.state, "state: ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getCarrier().mo273cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public ey1 createRequestBody(Request request, long contentLength) {
        request.getClass();
        RequestBody body = request.body();
        if (body != null && body.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (contentLength != NO_CHUNK_YET) {
            return newKnownLengthSink();
        }
        se.p("Cannot stream a request body without chunked encoding or a known content length!");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        getSocket().getSink().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        getSocket().getSink().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public ExchangeCodec.Carrier getCarrier() {
        return this.carrier;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public boolean isResponseComplete() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public k12 openResponseBodySource(Response response) {
        response.getClass();
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(response.request().url(), 0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = _UtilJvmKt.headersContentLength(response);
        if (headersContentLength != NO_CHUNK_YET) {
            return newFixedLengthSource(response.request().url(), headersContentLength);
        }
        return newUnknownLengthSource(response.request().url());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers peekTrailers() {
        Headers headers = this.trailers;
        if (headers != TRAILERS_RESPONSE_BODY_TRUNCATED) {
            int i = this.state;
            if (i != 5 && i != 6) {
                y61.e(this.state, "Trailers cannot be read because the state is ");
                return null;
            }
            return headers;
        }
        se.w("Trailers cannot be read because the response body was truncated");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean expectContinue) {
        int i = this.state;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            y61.e(this.state, "state: ");
            return null;
        }
        try {
            StatusLine parse = StatusLine.INSTANCE.parse(this.headersReader.readLine());
            Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
            if (expectContinue && parse.code == 100) {
                return null;
            }
            int i2 = parse.code;
            if (i2 == 100) {
                this.state = 3;
                return headers;
            }
            if (102 <= i2 && i2 < 200) {
                this.state = 3;
                return headers;
            }
            this.state = 4;
            return headers;
        } catch (EOFException e) {
            throw new IOException(l90.l("unexpected end of stream on ", getCarrier().getRoute().address().url().redact()), e);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        response.getClass();
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return NO_CHUNK_YET;
        }
        return _UtilJvmKt.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        response.getClass();
        long headersContentLength = _UtilJvmKt.headersContentLength(response);
        if (headersContentLength == NO_CHUNK_YET) {
            return;
        }
        k12 newFixedLengthSource = newFixedLengthSource(response.request().url(), headersContentLength);
        _UtilJvmKt.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    public final void writeRequest(Headers headers, String requestLine) {
        headers.getClass();
        requestLine.getClass();
        if (this.state == 0) {
            getSocket().getSink().u(requestLine).u("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                getSocket().getSink().u(headers.name(i)).u(": ").u(headers.value(i)).u("\r\n");
            }
            getSocket().getSink().u("\r\n");
            this.state = 1;
            return;
        }
        y61.e(this.state, "state: ");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        request.getClass();
        RequestLine requestLine = RequestLine.INSTANCE;
        Proxy.Type type = getCarrier().getRoute().proxy().type();
        type.getClass();
        writeRequest(request.headers(), requestLine.get(request, type));
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public BufferedSocket getSocket() {
        return this.socket;
    }

    private final boolean isChunked(Request request) {
        return "chunked".equalsIgnoreCase(request.header("Transfer-Encoding"));
    }
}
