package okhttp3.internal.connection;

import defpackage.bl1;
import defpackage.d12;
import defpackage.ey1;
import defpackage.hk;
import defpackage.k12;
import defpackage.se;
import defpackage.sn0;
import defpackage.yd0;
import defpackage.yq1;
import defpackage.zd0;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import org.jsoup.helper.HttpConnection;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002QRB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000e¢\u0006\u0004\b/\u0010\u001bJ\r\u00100\u001a\u00020\u000e¢\u0006\u0004\b0\u0010\u001bJ\r\u00101\u001a\u00020\u000e¢\u0006\u0004\b1\u0010\u001bJ?\u00107\u001a\u0004\u0018\u00010\f2\b\b\u0002\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u00152\b\b\u0002\u00105\u001a\u00020\u00152\b\b\u0002\u00106\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u000e¢\u0006\u0004\b9\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR$\u0010E\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR$\u0010I\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00158\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010HR\u0014\u0010N\u001a\u00020K8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010H¨\u0006S"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "Ljava/io/IOException;", "e", "Lod2;", "trackFailure", "(Ljava/io/IOException;)V", "Lokhttp3/Request;", "request", "writeRequestHeaders", "(Lokhttp3/Request;)V", "", "duplex", "Ley1;", "createRequestBody", "(Lokhttp3/Request;Z)Ley1;", "flushRequest", "()V", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "(Z)Lokhttp3/Response$Builder;", "Lokhttp3/Response;", "response", "responseHeadersEnd", "(Lokhttp3/Response;)V", "Lokhttp3/ResponseBody;", "openResponseBody", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "Ld12;", "upgradeToSocket", "()Ld12;", "noNewExchangesOnConnection", "cancel", "detachWithViolence", "", "bytesRead", "isSocket", "responseDone", "requestDone", "bodyComplete", "(JZZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/http/ExchangeCodec;", "value", "isDuplex", "Z", "isDuplex$okhttp", "()Z", "hasFailure", "getHasFailure$okhttp", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "connection", "isCoalescedConnection$okhttp", "isCoalescedConnection", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean hasFailure;
    private boolean isDuplex;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lyd0;", "Ley1;", "delegate", "", "contentLength", "", "isSocket", "<init>", "(Lokhttp3/internal/connection/Exchange;Ley1;JZ)V", "Ljava/io/IOException;", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lhk;", "source", "byteCount", "Lod2;", "write", "(Lhk;J)V", "flush", "()V", "close", "J", "Z", "completed", "bytesReceived", "invokeStartEvent", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class RequestBodySink extends yd0 {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        private final boolean isSocket;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, ey1 ey1Var, long j, boolean z) {
            super(ey1Var);
            ey1Var.getClass();
            this.this$0 = exchange;
            this.contentLength = j;
            this.isSocket = z;
            this.invokeStartEvent = z;
        }

        private final IOException complete(IOException e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            return Exchange.bodyComplete$default(this.this$0, this.bytesReceived, this.isSocket, false, true, e, 4, null);
        }

        @Override // defpackage.yd0, defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j = this.contentLength;
            if (j != -1 && this.bytesReceived != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                IOException complete = complete(e);
                complete.getClass();
                throw complete;
            }
        }

        @Override // defpackage.yd0, defpackage.ey1, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                IOException complete = complete(e);
                complete.getClass();
                throw complete;
            }
        }

        @Override // defpackage.yd0, defpackage.ey1
        public void write(hk source, long byteCount) {
            source.getClass();
            if (!this.closed) {
                long j = this.contentLength;
                if (j != -1 && this.bytesReceived + byteCount > j) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + byteCount));
                }
                try {
                    if (this.invokeStartEvent) {
                        this.invokeStartEvent = false;
                        this.this$0.getEventListener().requestBodyStart(this.this$0.getCall());
                    }
                    super.write(source, byteCount);
                    this.bytesReceived += byteCount;
                    return;
                } catch (IOException e) {
                    IOException complete = complete(e);
                    complete.getClass();
                    throw complete;
                }
            }
            se.p("closed");
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lzd0;", "Lk12;", "delegate", "", "contentLength", "", "isSocket", "<init>", "(Lokhttp3/internal/connection/Exchange;Lk12;JZ)V", "Lhk;", "sink", "byteCount", "read", "(Lhk;J)J", "Lod2;", "close", "()V", "Ljava/io/IOException;", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "J", "Z", "bytesReceived", "invokeStartEvent", "completed", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class ResponseBodySource extends zd0 {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        private final boolean isSocket;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, k12 k12Var, long j, boolean z) {
            super(k12Var);
            k12Var.getClass();
            this.this$0 = exchange;
            this.contentLength = j;
            this.isSocket = z;
            this.invokeStartEvent = true;
            if (j == 0) {
                complete(null);
            }
        }

        @Override // defpackage.zd0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e) {
                IOException complete = complete(e);
                complete.getClass();
                throw complete;
            }
        }

        public final IOException complete(IOException e) {
            if (this.completed) {
                return e;
            }
            this.completed = true;
            if (e == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener().responseBodyStart(this.this$0.getCall());
            }
            return Exchange.bodyComplete$default(this.this$0, this.bytesReceived, this.isSocket, true, false, e, 8, null);
        }

        @Override // defpackage.zd0, defpackage.k12
        public long read(hk sink, long byteCount) {
            sink.getClass();
            if (!this.closed) {
                try {
                    long read = delegate().read(sink, byteCount);
                    if (this.invokeStartEvent) {
                        this.invokeStartEvent = false;
                        this.this$0.getEventListener().responseBodyStart(this.this$0.getCall());
                    }
                    if (read == -1) {
                        complete(null);
                        return -1L;
                    }
                    long j = this.bytesReceived + read;
                    long j2 = this.contentLength;
                    if (j2 != -1 && j > j2) {
                        throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j);
                    }
                    this.bytesReceived = j;
                    if (this.this$0.codec.isResponseComplete()) {
                        complete(null);
                    }
                    return read;
                } catch (IOException e) {
                    IOException complete = complete(e);
                    complete.getClass();
                    throw complete;
                }
            }
            se.p("closed");
            return 0L;
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder exchangeFinder, ExchangeCodec exchangeCodec) {
        realCall.getClass();
        eventListener.getClass();
        exchangeFinder.getClass();
        exchangeCodec.getClass();
        this.call = realCall;
        this.eventListener = eventListener;
        this.finder = exchangeFinder;
        this.codec = exchangeCodec;
    }

    public static /* synthetic */ IOException bodyComplete$default(Exchange exchange, long j, boolean z, boolean z2, boolean z3, IOException iOException, int i, Object obj) {
        boolean z4;
        boolean z5;
        if ((i & 1) != 0) {
            j = -1;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & 8) != 0) {
            z5 = false;
        } else {
            z5 = z3;
        }
        return exchange.bodyComplete(j2, z, z4, z5, iOException);
    }

    private final void trackFailure(IOException e) {
        this.hasFailure = true;
        this.codec.getCarrier().trackFailure(this.call, e);
    }

    public final IOException bodyComplete(long bytesRead, boolean isSocket, boolean responseDone, boolean requestDone, IOException e) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (e != null) {
            trackFailure(e);
        }
        if (requestDone) {
            EventListener eventListener = this.eventListener;
            if (e != null) {
                eventListener.requestFailed(this.call, e);
            } else {
                eventListener.requestBodyEnd(this.call, bytesRead);
            }
        }
        if (responseDone) {
            EventListener eventListener2 = this.eventListener;
            if (e != null) {
                eventListener2.responseFailed(this.call, e);
            } else {
                eventListener2.responseBodyEnd(this.call, bytesRead);
            }
        }
        RealCall realCall = this.call;
        boolean z6 = false;
        if (requestDone && !isSocket) {
            z = false;
            z6 = true;
        } else {
            z = false;
        }
        if (responseDone && !isSocket) {
            z2 = isSocket;
            z3 = true;
        } else {
            z2 = isSocket;
            z3 = z;
        }
        if (requestDone && z2) {
            z4 = true;
        } else {
            z4 = z;
        }
        if (responseDone && z2) {
            z5 = true;
        } else {
            z5 = z;
        }
        return realCall.messageDone$okhttp(this, z6, z3, z5, z4, e);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final ey1 createRequestBody(Request request, boolean duplex) {
        request.getClass();
        this.isDuplex = duplex;
        RequestBody body = request.body();
        body.getClass();
        long contentLength = body.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, contentLength), contentLength, false);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, true, true, null);
    }

    public final void finishRequest() {
        try {
            this.codec.finishRequest();
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void flushRequest() {
        try {
            this.codec.flushRequest();
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    /* renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    public final RealConnection getConnection$okhttp() {
        RealConnection realConnection;
        ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        if (carrier instanceof RealConnection) {
            realConnection = (RealConnection) carrier;
        } else {
            realConnection = null;
        }
        if (realConnection != null) {
            return realConnection;
        }
        se.p("no connection for CONNECT tunnels");
        return null;
    }

    /* renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    /* renamed from: getFinder$okhttp, reason: from getter */
    public final ExchangeFinder getFinder() {
        return this.finder;
    }

    /* renamed from: getHasFailure$okhttp, reason: from getter */
    public final boolean getHasFailure() {
        return this.hasFailure;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !sn0.r(this.finder.getRoutePlanner().getAddress().url().host(), this.codec.getCarrier().getRoute().address().url().host());
    }

    /* renamed from: isDuplex$okhttp, reason: from getter */
    public final boolean getIsDuplex() {
        return this.isDuplex;
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getCarrier().noNewExchanges();
    }

    public final void noRequestBody() {
        RealCall.messageDone$okhttp$default(this.call, this, true, false, false, false, null, 28, null);
    }

    public final ResponseBody openResponseBody(Response response) {
        Exchange exchange;
        response.getClass();
        try {
            String header$default = Response.header$default(response, HttpConnection.CONTENT_TYPE, null, 2, null);
            long reportedContentLength = this.codec.reportedContentLength(response);
            exchange = this;
            try {
                return new RealResponseBody(header$default, reportedContentLength, new bl1(new ResponseBodySource(exchange, this.codec.openResponseBodySource(response), reportedContentLength, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                exchange.eventListener.responseFailed(exchange.call, iOException);
                exchange.trackFailure(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            exchange = this;
        }
    }

    public final Headers peekTrailers() {
        return this.codec.peekTrailers();
    }

    public final Response.Builder readResponseHeaders(boolean expectContinue) {
        try {
            Response.Builder readResponseHeaders = this.codec.readResponseHeaders(expectContinue);
            if (readResponseHeaders != null) {
                readResponseHeaders.initExchange$okhttp(this);
                return readResponseHeaders;
            }
            return readResponseHeaders;
        } catch (IOException e) {
            this.eventListener.responseFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }

    public final void responseHeadersEnd(Response response) {
        response.getClass();
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final d12 upgradeToSocket() {
        this.call.upgradeToSocket();
        ExchangeCodec.Carrier carrier = this.codec.getCarrier();
        carrier.getClass();
        ((RealConnection) carrier).useAsSocket$okhttp();
        return new d12() { // from class: okhttp3.internal.connection.Exchange$upgradeToSocket$1
            private final Exchange.RequestBodySink sink;
            private final Exchange.ResponseBodySource source;

            {
                this.sink = new Exchange.RequestBodySink(Exchange.this, Exchange.this.codec.getSocket().getSink(), -1L, true);
                this.source = new Exchange.ResponseBodySource(Exchange.this, Exchange.this.codec.getSocket().getSource(), -1L, true);
            }

            @Override // defpackage.d12
            public void cancel() {
                Exchange.this.cancel();
            }

            @Override // defpackage.d12
            public Exchange.RequestBodySink getSink() {
                return this.sink;
            }

            @Override // defpackage.d12
            public Exchange.ResponseBodySource getSource() {
                return this.source;
            }
        };
    }

    public final void writeRequestHeaders(Request request) {
        request.getClass();
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e) {
            this.eventListener.requestFailed(this.call, e);
            trackFailure(e);
            throw e;
        }
    }
}
