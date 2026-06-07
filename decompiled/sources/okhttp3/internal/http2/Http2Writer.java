package okhttp3.internal.http2;

import defpackage.hk;
import defpackage.ok;
import defpackage.yq1;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.http2.Hpack;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0011J\u001d\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J/\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b&\u0010'J/\u0010*\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010$2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u0015J%\u00100\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\r2\u0006\u00102\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u00107\u001a\u00020\u000b¢\u0006\u0004\b8\u0010\u000fJ-\u0010;\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010\u0011J+\u0010?\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010AR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010BR\u0014\u0010C\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010G\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010BR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Lok;", "sink", "", "client", "<init>", "(Lok;Z)V", "", "streamId", "", "byteCount", "Lod2;", "writeContinuationFrames", "(IJ)V", "connectionPreface", "()V", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "(Lokhttp3/internal/http2/Settings;)V", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "maxDataLength", "()I", "outFinished", "Lhk;", "source", "data", "(ZILhk;I)V", "flags", "buffer", "dataFrame", "(IILhk;I)V", "settings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;[B)V", "windowSizeIncrement", "windowUpdate", "length", "type", "frameHeader", "(IIII)V", "close", "headerBlock", "headers", "(ZILjava/util/List;)V", "Lok;", "Z", "hpackBuffer", "Lhk;", "maxFrameSize", "I", "closed", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Http2Writer implements Closeable, Lockable {
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final hk hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final ok sink;

    /* JADX WARN: Type inference failed for: r3v0, types: [hk, java.lang.Object] */
    public Http2Writer(ok okVar, boolean z) {
        okVar.getClass();
        this.sink = okVar;
        this.client = z;
        ?? obj = new Object();
        this.hpackBuffer = obj;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, obj, 3, null);
    }

    private final void writeContinuationFrames(int streamId, long byteCount) {
        int i;
        while (byteCount > 0) {
            long min = Math.min(this.maxFrameSize, byteCount);
            byteCount -= min;
            int i2 = (int) min;
            if (byteCount == 0) {
                i = 4;
            } else {
                i = 0;
            }
            frameHeader(streamId, i2, 9, i);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final void applyAndAckSettings(Settings peerSettings) {
        peerSettings.getClass();
        synchronized (this) {
            try {
                if (!this.closed) {
                    this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
                    if (peerSettings.getHeaderTableSize() != -1) {
                        this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
                    }
                    frameHeader(0, 0, 4, 1);
                    this.sink.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.closed = true;
            this.sink.close();
        }
    }

    public final void connectionPreface() {
        synchronized (this) {
            try {
                if (!this.closed) {
                    if (!this.client) {
                        return;
                    }
                    Logger logger2 = logger;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(_UtilJvmKt.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.e(), new Object[0]));
                    }
                    this.sink.w(Http2.CONNECTION_PREFACE);
                    this.sink.flush();
                    return;
                }
                throw new IOException("closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void data(boolean outFinished, int streamId, hk source, int byteCount) {
        synchronized (this) {
            if (!this.closed) {
                dataFrame(streamId, outFinished ? 1 : 0, source, byteCount);
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void dataFrame(int streamId, int flags, hk buffer, int byteCount) {
        frameHeader(streamId, byteCount, 0, flags);
        if (byteCount > 0) {
            ok okVar = this.sink;
            buffer.getClass();
            okVar.write(buffer, byteCount);
        }
    }

    public final void flush() {
        synchronized (this) {
            if (!this.closed) {
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void frameHeader(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            r0 = 8
            if (r11 == r0) goto L1d
            java.util.logging.Logger r0 = okhttp3.internal.http2.Http2Writer.logger
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r1 = r0.isLoggable(r1)
            if (r1 == 0) goto L1d
            okhttp3.internal.http2.Http2 r2 = okhttp3.internal.http2.Http2.INSTANCE
            r3 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r2.frameLog(r3, r4, r5, r6, r7)
            r0.fine(r9)
            goto L21
        L1d:
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
        L21:
            int r9 = r8.maxFrameSize
            if (r5 > r9) goto L51
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 & r4
            if (r9 != 0) goto L47
            ok r9 = r8.sink
            okhttp3.internal._UtilCommonKt.writeMedium(r9, r5)
            ok r9 = r8.sink
            r10 = r6 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            ok r9 = r8.sink
            r10 = r7 & 255(0xff, float:3.57E-43)
            r9.writeByte(r10)
            ok r8 = r8.sink
            r9 = 2147483647(0x7fffffff, float:NaN)
            r9 = r9 & r4
            r8.writeInt(r9)
            return
        L47:
            java.lang.String r8 = "reserved bit set: "
            java.lang.String r8 = defpackage.l90.g(r4, r8)
            defpackage.se.e(r8)
            return
        L51:
            int r8 = r8.maxFrameSize
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "FRAME_SIZE_ERROR length > "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r8 = ": "
            r9.append(r8)
            r9.append(r5)
            java.lang.String r8 = r9.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Writer.frameHeader(int, int, int, int):void");
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final void goAway(int lastGoodStreamId, ErrorCode errorCode, byte[] debugData) {
        errorCode.getClass();
        debugData.getClass();
        synchronized (this) {
            if (!this.closed) {
                if (errorCode.getHttpCode() != -1) {
                    frameHeader(0, debugData.length + 8, 7, 0);
                    this.sink.writeInt(lastGoodStreamId);
                    this.sink.writeInt(errorCode.getHttpCode());
                    if (debugData.length != 0) {
                        this.sink.write(debugData);
                    }
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void headers(boolean outFinished, int streamId, List<Header> headerBlock) {
        int i;
        headerBlock.getClass();
        synchronized (this) {
            if (!this.closed) {
                this.hpackWriter.writeHeaders(headerBlock);
                long j = this.hpackBuffer.f;
                long min = Math.min(this.maxFrameSize, j);
                if (j == min) {
                    i = 4;
                } else {
                    i = 0;
                }
                if (outFinished) {
                    i |= 1;
                }
                frameHeader(streamId, (int) min, 1, i);
                this.sink.write(this.hpackBuffer, min);
                if (j > min) {
                    writeContinuationFrames(streamId, j - min);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    /* renamed from: maxDataLength, reason: from getter */
    public final int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public final void ping(boolean ack, int payload1, int payload2) {
        synchronized (this) {
            if (!this.closed) {
                frameHeader(0, 8, 6, ack ? 1 : 0);
                this.sink.writeInt(payload1);
                this.sink.writeInt(payload2);
                this.sink.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) {
        int i;
        requestHeaders.getClass();
        synchronized (this) {
            if (!this.closed) {
                this.hpackWriter.writeHeaders(requestHeaders);
                long j = this.hpackBuffer.f;
                int min = (int) Math.min(this.maxFrameSize - 4, j);
                int i2 = min + 4;
                long j2 = min;
                if (j == j2) {
                    i = 4;
                } else {
                    i = 0;
                }
                frameHeader(streamId, i2, 5, i);
                this.sink.writeInt(promisedStreamId & Integer.MAX_VALUE);
                this.sink.write(this.hpackBuffer, j2);
                if (j > j2) {
                    writeContinuationFrames(streamId, j - j2);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void rstStream(int streamId, ErrorCode errorCode) {
        errorCode.getClass();
        synchronized (this) {
            if (!this.closed) {
                if (errorCode.getHttpCode() != -1) {
                    frameHeader(streamId, 4, 3, 0);
                    this.sink.writeInt(errorCode.getHttpCode());
                    this.sink.flush();
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void settings(Settings settings) {
        settings.getClass();
        synchronized (this) {
            try {
                if (!this.closed) {
                    frameHeader(0, settings.size() * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        if (settings.isSet(i)) {
                            this.sink.writeShort(i);
                            this.sink.writeInt(settings.get(i));
                        }
                    }
                    this.sink.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void windowUpdate(int streamId, long windowSizeIncrement) {
        int i;
        long j;
        synchronized (this) {
            try {
                if (!this.closed) {
                    if (windowSizeIncrement != 0 && windowSizeIncrement <= 2147483647L) {
                        Logger logger2 = logger;
                        if (logger2.isLoggable(Level.FINE)) {
                            i = streamId;
                            j = windowSizeIncrement;
                            logger2.fine(Http2.INSTANCE.frameLogWindowUpdate(false, i, 4, j));
                        } else {
                            i = streamId;
                            j = windowSizeIncrement;
                        }
                        frameHeader(i, 4, 8, 0);
                        this.sink.writeInt((int) j);
                        this.sink.flush();
                    } else {
                        throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + windowSizeIncrement).toString());
                    }
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
