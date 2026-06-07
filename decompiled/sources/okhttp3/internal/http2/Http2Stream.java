package okhttp3.internal.http2;

import defpackage.d12;
import defpackage.ea2;
import defpackage.ey1;
import defpackage.hk;
import defpackage.k12;
import defpackage.kf;
import defpackage.pk;
import defpackage.se;
import defpackage.y61;
import defpackage.yq1;
import defpackage.yx;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0004vwuxB3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010%\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00172\u0006\u0010)\u001a\u00020!¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00172\u0006\u0010)\u001a\u00020!¢\u0006\u0004\b3\u0010+J\u000f\u00105\u001a\u00020\u0017H\u0000¢\u0006\u0004\b4\u0010(J\u0015\u00108\u001a\u00020\u00172\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020\u0017H\u0000¢\u0006\u0004\b:\u0010(J\u000f\u0010=\u001a\u00020\u0017H\u0000¢\u0006\u0004\b<\u0010(J!\u0010>\u001a\u00020\u00072\u0006\u0010)\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0007H\u0002¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR*\u0010N\u001a\u0002062\u0006\u0010M\u001a\u0002068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u00109R*\u0010S\u001a\u0002062\u0006\u0010M\u001a\u0002068\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010O\u001a\u0004\bT\u0010Q\"\u0004\bU\u00109R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\n0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010-\u001a\u00060[R\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\\\u001a\u0004\b]\u0010^R\u001e\u0010`\u001a\u00060_R\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001e\u0010\u001e\u001a\u00060dR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010e\u001a\u0004\bf\u0010gR\u001e\u0010 \u001a\u00060dR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010e\u001a\u0004\bh\u0010gR$\u0010)\u001a\u0004\u0018\u00010!8@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010+R$\u0010$\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0011\u0010r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\br\u0010AR\u0011\u0010s\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bs\u0010AR\u0011\u0010t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bt\u0010A¨\u0006y"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "Lokhttp3/internal/concurrent/Lockable;", "Ld12;", "", "id", "Lokhttp3/internal/http2/Http2Connection;", "connection", "", "outFinished", "inFinished", "Lokhttp3/Headers;", "headers", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "callerIsIdle", "takeHeaders", "(Z)Lokhttp3/Headers;", "peekTrailers", "()Lokhttp3/Headers;", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "flushHeaders", "Lod2;", "writeHeaders", "(Ljava/util/List;ZZ)V", "trailers", "enqueueTrailers", "(Lokhttp3/Headers;)V", "Lea2;", "readTimeout", "()Lea2;", "writeTimeout", "Lokhttp3/internal/http2/ErrorCode;", "rstStatusCode", "Ljava/io/IOException;", "errorException", "close", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "cancel", "()V", "errorCode", "closeLater", "(Lokhttp3/internal/http2/ErrorCode;)V", "Lpk;", "source", "length", "receiveData", "(Lpk;I)V", "receiveHeaders", "(Lokhttp3/Headers;Z)V", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "(J)V", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "closeInternal", "(Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)Z", "doReadTimeout", "()Z", "I", "getId", "()I", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "readBytes", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "getReadBytes", "()Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "value", "writeBytesTotal", "J", "getWriteBytesTotal", "()J", "setWriteBytesTotal$okhttp", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getWriteTimeout$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "isOpen", "isLocallyInitiated", "isSourceComplete", "Companion", "FramingSource", "FramingSink", "StreamTimeout", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Http2Stream implements Lockable, d12 {
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private final WindowCounter readBytes;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010-\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001f¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lk12;", "", "maxByteCount", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "read", "Lod2;", "updateConnectionFlowControl", "(J)V", "Lhk;", "sink", "byteCount", "(Lhk;J)J", "Lpk;", "source", "receive$okhttp", "(Lpk;J)V", "receive", "Lea2;", "timeout", "()Lea2;", "close", "()V", "J", "Z", "getFinished$okhttp", "()Z", "setFinished$okhttp", "(Z)V", "receiveBuffer", "Lhk;", "getReceiveBuffer", "()Lhk;", "readBuffer", "getReadBuffer", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed$okhttp", "setClosed$okhttp", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class FramingSource implements k12 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final hk receiveBuffer = new Object();
        private final hk readBuffer = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [hk, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [hk, java.lang.Object] */
        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long read) {
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
            } else {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(read);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                hk hkVar = this.readBuffer;
                j = hkVar.f;
                hkVar.b();
                http2Stream.getClass();
                http2Stream.notifyAll();
            }
            if (j > 0) {
                updateConnectionFlowControl(j);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        /* renamed from: getClosed$okhttp, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* renamed from: getFinished$okhttp, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        public final hk getReadBuffer() {
            return this.readBuffer;
        }

        public final hk getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f2, code lost:
        
            throw new java.io.IOException("stream closed");
         */
        @Override // defpackage.k12
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(defpackage.hk r28, long r29) {
            /*
                Method dump skipped, instructions count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(hk, long):long");
        }

        public final void receive$okhttp(pk source, long byteCount) {
            boolean z;
            boolean z2;
            boolean z3;
            source.getClass();
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            long j = byteCount;
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = false;
                    if (this.readBuffer.f + j > this.maxByteCount) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    source.skip(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    source.skip(j);
                    return;
                }
                long read = source.read(this.receiveBuffer, j);
                if (read != -1) {
                    j -= read;
                    Http2Stream http2Stream2 = Http2Stream.this;
                    synchronized (http2Stream2) {
                        try {
                            if (this.closed) {
                                this.receiveBuffer.b();
                            } else {
                                hk hkVar = this.readBuffer;
                                if (hkVar.f == 0) {
                                    z2 = true;
                                }
                                hkVar.l(this.receiveBuffer);
                                if (z2) {
                                    http2Stream2.getClass();
                                    http2Stream2.notifyAll();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    throw new EOFException();
                }
            }
            updateConnectionFlowControl(byteCount);
            Http2Stream.this.getConnection().getFlowControlListener().receivingStreamWindowChanged(Http2Stream.this.getId(), Http2Stream.this.getReadBytes(), this.readBuffer.f);
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // defpackage.k12
        public ea2 timeout() {
            return Http2Stream.this.getReadTimeout();
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lkf;", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "Lod2;", "timedOut", "()V", "Ljava/io/IOException;", "cause", "newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "exitAndThrowIfTimedOut", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class StreamTimeout extends kf {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() {
            if (!exit()) {
            } else {
                throw newTimeoutException(null);
            }
        }

        @Override // defpackage.kf
        public IOException newTimeoutException(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        @Override // defpackage.kf
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        http2Connection.getClass();
        this.id = i;
        this.connection = http2Connection;
        this.readBytes = new WindowCounter(i);
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            } else {
                se.p("locally-initiated streams shouldn't have headers yet");
                throw null;
            }
        }
        if (isLocallyInitiated()) {
            return;
        }
        se.p("remotely-initiated streams should have headers");
        throw null;
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException errorException) {
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return false;
        }
        synchronized (this) {
            if (getErrorCode$okhttp() != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            notifyAll();
            if (getSource().getFinished()) {
                if (getSink().getFinished()) {
                    return false;
                }
            }
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doReadTimeout() {
        if (this.connection.getClient() && !getSink().getClosed() && !getSink().getFinished()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Headers takeHeaders$default(Http2Stream http2Stream, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return http2Stream.takeHeaders(z);
    }

    public final void addBytesToWriteWindow(long delta) {
        this.writeBytesMaximum += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    @Override // defpackage.d12
    public void cancel() {
        closeLater(ErrorCode.CANCEL);
    }

    public final void cancelStreamIfNecessary$okhttp() {
        boolean z;
        boolean isOpen;
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this) {
            try {
                if (getSource().getFinished() || !getSource().getClosed() || (!getSink().getFinished() && !getSink().getClosed())) {
                    z = false;
                    isOpen = isOpen();
                }
                z = true;
                isOpen = isOpen();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            close(ErrorCode.CANCEL, null);
        } else if (!isOpen) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() {
        if (!getSink().getClosed()) {
            if (!getSink().getFinished()) {
                if (getErrorCode$okhttp() != null) {
                    IOException iOException = this.errorException;
                    if (iOException == null) {
                        ErrorCode errorCode$okhttp = getErrorCode$okhttp();
                        errorCode$okhttp.getClass();
                        throw new StreamResetException(errorCode$okhttp);
                    }
                    throw iOException;
                }
                return;
            }
            se.w("stream finished");
            return;
        }
        se.w("stream closed");
    }

    public final void close(ErrorCode rstStatusCode, IOException errorException) {
        rstStatusCode.getClass();
        if (!closeInternal(rstStatusCode, errorException)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
    }

    public final void closeLater(ErrorCode errorCode) {
        errorCode.getClass();
        if (!closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode);
    }

    public final void enqueueTrailers(Headers trailers) {
        trailers.getClass();
        synchronized (this) {
            if (!getSink().getFinished()) {
                if (trailers.size() != 0) {
                    getSink().setTrailers(trailers);
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0");
                }
            } else {
                throw new IllegalStateException("already finished");
            }
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final ErrorCode getErrorCode$okhttp() {
        ErrorCode errorCode;
        synchronized (this) {
            errorCode = this.errorCode;
        }
        return errorCode;
    }

    /* renamed from: getErrorException$okhttp, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    /* renamed from: getReadTimeout$okhttp, reason: from getter */
    public final StreamTimeout getReadTimeout() {
        return this.readTimeout;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    /* renamed from: getWriteTimeout$okhttp, reason: from getter */
    public final StreamTimeout getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean z;
        if ((this.id & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.connection.getClient() == z) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        synchronized (this) {
            try {
                if (getErrorCode$okhttp() != null) {
                    return false;
                }
                if (!getSource().getFinished()) {
                    if (getSource().getClosed()) {
                    }
                    return true;
                }
                if (getSink().getFinished() || getSink().getClosed()) {
                    if (this.hasResponseHeaders) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isSourceComplete() {
        boolean z;
        synchronized (this) {
            if (getSource().getFinished()) {
                if (getSource().getReadBuffer().j()) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    public final Headers peekTrailers() {
        synchronized (this) {
            if (getSource().getFinished() && getSource().getReceiveBuffer().j() && getSource().getReadBuffer().j()) {
                Headers trailers = getSource().getTrailers();
                if (trailers == null) {
                    trailers = Headers.EMPTY;
                }
                return trailers;
            }
            if (getErrorCode$okhttp() != null) {
                IOException iOException = this.errorException;
                if (iOException == null) {
                    ErrorCode errorCode$okhttp = getErrorCode$okhttp();
                    errorCode$okhttp.getClass();
                    throw new StreamResetException(errorCode$okhttp);
                }
                throw iOException;
            }
            return null;
        }
    }

    public final ea2 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(pk source, int length) {
        source.getClass();
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
        } else {
            getSource().receive$okhttp(source, length);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:10:0x001d, B:12:0x0022, B:14:0x002a, B:17:0x0033, B:19:0x0046, B:20:0x004d, B:27:0x003d), top: B:9:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = okhttp3.internal._UtilJvmKt.assertionsEnabled
            if (r0 == 0) goto L1c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Le
            goto L1c
        Le:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = " MUST NOT hold lock on "
            defpackage.y61.h(r3, r4, r2)
            return
        L1c:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L3b
            r1 = 1
            if (r0 == 0) goto L3d
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L3d
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L33
            goto L3d
        L33:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.getSource()     // Catch: java.lang.Throwable -> L3b
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L3b
            goto L44
        L3b:
            r3 = move-exception
            goto L5f
        L3d:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L3b
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L3b
            r0.add(r3)     // Catch: java.lang.Throwable -> L3b
        L44:
            if (r4 == 0) goto L4d
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.getSource()     // Catch: java.lang.Throwable -> L3b
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L3b
        L4d:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L3b
            r2.notifyAll()     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)
            if (r3 != 0) goto L5e
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r2 = r2.id
            r3.removeStream$okhttp(r2)
        L5e:
            return
        L5f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final void receiveRstStream(ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this) {
            if (getErrorCode$okhttp() == null) {
                this.errorCode = errorCode;
                notifyAll();
            }
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0011, B:13:0x001f, B:18:0x0029, B:25:0x0032, B:26:0x0037, B:30:0x0038, B:32:0x0040, B:35:0x004d, B:40:0x005e, B:39:0x0052, B:15:0x0024), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0001 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Headers takeHeaders(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
        L1:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L38
            okhttp3.internal.http2.ErrorCode r0 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L38
            if (r3 != 0) goto L1c
            boolean r0 = r2.doReadTimeout()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            goto L1c
        L18:
            r0 = 0
            goto L1d
        L1a:
            r3 = move-exception
            goto L5f
        L1c:
            r0 = 1
        L1d:
            if (r0 == 0) goto L24
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch: java.lang.Throwable -> L1a
            r1.enter()     // Catch: java.lang.Throwable -> L1a
        L24:
            r2.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L1
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L1a
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L1a
            goto L1
        L2f:
            r3 = move-exception
            if (r0 == 0) goto L37
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L1a
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L1a
        L37:
            throw r3     // Catch: java.lang.Throwable -> L1a
        L38:
            java.util.ArrayDeque<okhttp3.Headers> r3 = r2.headersQueue     // Catch: java.lang.Throwable -> L1a
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L4d
            java.util.ArrayDeque<okhttp3.Headers> r3 = r2.headersQueue     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r3.removeFirst()     // Catch: java.lang.Throwable -> L1a
            r3.getClass()     // Catch: java.lang.Throwable -> L1a
            okhttp3.Headers r3 = (okhttp3.Headers) r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            return r3
        L4d:
            java.io.IOException r3 = r2.errorException     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L52
            goto L5e
        L52:
            okhttp3.internal.http2.StreamResetException r3 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L1a
            okhttp3.internal.http2.ErrorCode r0 = r2.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L1a
            r0.getClass()     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1a
        L5e:
            throw r3     // Catch: java.lang.Throwable -> L1a
        L5f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.takeHeaders(boolean):okhttp3.Headers");
    }

    public final void waitForIo$okhttp() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> responseHeaders, boolean outFinished, boolean flushHeaders) {
        responseHeaders.getClass();
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (outFinished) {
                getSink().setFinished(true);
                notifyAll();
            }
        }
        if (!flushHeaders) {
            synchronized (this) {
                if (this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum()) {
                    flushHeaders = true;
                } else {
                    flushHeaders = false;
                }
            }
        }
        this.connection.writeHeaders$okhttp(this.id, outFinished, responseHeaders);
        if (flushHeaders) {
            this.connection.flush();
        }
    }

    public final ea2 writeTimeout() {
        return this.writeTimeout;
    }

    @Override // defpackage.d12
    public FramingSink getSink() {
        return this.sink;
    }

    @Override // defpackage.d12
    public FramingSource getSource() {
        return this.source;
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\t¨\u0006&"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Ley1;", "", "finished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "outFinishedOnLastFrame", "Lod2;", "emitFrame", "(Z)V", "Lhk;", "source", "", "byteCount", "write", "(Lhk;J)V", "flush", "()V", "Lea2;", "timeout", "()Lea2;", "close", "Z", "getFinished", "()Z", "setFinished", "sendBuffer", "Lhk;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed", "setClosed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class FramingSink implements ey1 {
        private boolean closed;
        private boolean finished;
        private final hk sendBuffer;
        private Headers trailers;

        /* JADX WARN: Type inference failed for: r1v1, types: [hk, java.lang.Object] */
        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new Object();
        }

        /* JADX WARN: Finally extract failed */
        private final void emitFrame(boolean outFinishedOnLastFrame) {
            long min;
            boolean z;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    try {
                        http2Stream.waitForIo$okhttp();
                    } catch (Throwable th) {
                        http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                http2Stream.getWriteTimeout().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.f);
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                if (outFinishedOnLastFrame && min == this.sendBuffer.f) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z;
            }
            Http2Stream.this.getWriteTimeout().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
            }
        }

        @Override // defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            boolean z;
            boolean z2;
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                if (http2Stream2.getErrorCode$okhttp() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!Http2Stream.this.getSink().finished) {
                    if (this.sendBuffer.f > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.trailers != null) {
                        while (this.sendBuffer.f > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        headers.getClass();
                        connection.writeHeaders$okhttp(id, z, _UtilJvmKt.toHeaderList(headers));
                    } else if (z2) {
                        while (this.sendBuffer.f > 0) {
                            emitFrame(true);
                        }
                    } else if (z) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                Http2Stream http2Stream3 = Http2Stream.this;
                synchronized (http2Stream3) {
                    this.closed = true;
                    http2Stream3.getClass();
                    http2Stream3.notifyAll();
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // defpackage.ey1, java.io.Flushable
        public void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
            }
            while (this.sendBuffer.f > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // defpackage.ey1
        public ea2 timeout() {
            return Http2Stream.this.getWriteTimeout();
        }

        @Override // defpackage.ey1
        public void write(hk source, long byteCount) {
            source.getClass();
            Http2Stream http2Stream = Http2Stream.this;
            if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", http2Stream);
                return;
            }
            this.sendBuffer.write(source, byteCount);
            while (this.sendBuffer.f >= Http2Stream.EMIT_BUFFER_SIZE) {
                emitFrame(false);
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, yx yxVar) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
