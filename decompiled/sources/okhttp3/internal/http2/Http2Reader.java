package okhttp3.internal.http2;

import defpackage.bl;
import defpackage.ea2;
import defpackage.hk;
import defpackage.k12;
import defpackage.l90;
import defpackage.pk;
import defpackage.se;
import defpackage.yq1;
import defpackage.yx;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http2.Hpack;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0003/0.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u0010J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J/\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "Lpk;", "source", "", "client", "<init>", "(Lpk;Z)V", "Lokhttp3/internal/http2/Http2Reader$Handler;", "handler", "", "length", "flags", "streamId", "Lod2;", "readHeaders", "(Lokhttp3/internal/http2/Http2Reader$Handler;III)V", "padding", "", "Lokhttp3/internal/http2/Header;", "readHeaderBlock", "(IIII)Ljava/util/List;", "readData", "readPriority", "(Lokhttp3/internal/http2/Http2Reader$Handler;I)V", "readRstStream", "readSettings", "readPushPromise", "readPing", "readGoAway", "readWindowUpdate", "readConnectionPreface", "(Lokhttp3/internal/http2/Http2Reader$Handler;)V", "requireSettings", "nextFrame", "(ZLokhttp3/internal/http2/Http2Reader$Handler;)Z", "close", "()V", "Lpk;", "Z", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "continuation", "Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lokhttp3/internal/http2/Hpack$Reader;", "hpackReader", "Lokhttp3/internal/http2/Hpack$Reader;", "Companion", "ContinuationSource", "Handler", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Http2Reader implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Logger logger;
    private final boolean client;
    private final ContinuationSource continuation;
    private final Hpack.Reader hpackReader;
    private final pk source;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J/\u0010-\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010.J-\u00101\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b1\u00102J?\u00109\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\"2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020&H&¢\u0006\u0004\b9\u0010:¨\u0006;À\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "", "inFinished", "", "streamId", "Lpk;", "source", "length", "Lod2;", "data", "(ZILpk;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "(ZLokhttp3/internal/http2/Settings;)V", "ackSettings", "()V", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Lbl;", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Lbl;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", "priority", "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", "protocol", "host", "port", "maxAge", "alternateService", "(ILjava/lang/String;Lbl;Ljava/lang/String;IJ)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public interface Handler {
        void ackSettings();

        void alternateService(int streamId, String origin, bl protocol, String host, int port, long maxAge);

        void data(boolean inFinished, int streamId, pk source, int length);

        void goAway(int lastGoodStreamId, ErrorCode errorCode, bl debugData);

        void headers(boolean inFinished, int streamId, int associatedStreamId, List<Header> headerBlock);

        void ping(boolean ack, int payload1, int payload2);

        void priority(int streamId, int streamDependency, int weight, boolean exclusive);

        void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders);

        void rstStream(int streamId, ErrorCode errorCode);

        void settings(boolean clearPrevious, Settings settings);

        void windowUpdate(int streamId, long windowSizeIncrement);
    }

    static {
        Logger logger2 = Logger.getLogger(Http2.class.getName());
        logger2.getClass();
        logger = logger2;
    }

    public Http2Reader(pk pkVar, boolean z) {
        pkVar.getClass();
        this.source = pkVar;
        this.client = z;
        ContinuationSource continuationSource = new ContinuationSource(pkVar);
        this.continuation = continuationSource;
        this.hpackReader = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    private final void readData(Handler handler, int length, int flags, int streamId) {
        boolean z;
        if (streamId != 0) {
            int i = 0;
            if ((flags & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((flags & 32) == 0) {
                if ((flags & 8) != 0) {
                    i = _UtilCommonKt.and(this.source.readByte(), 255);
                }
                handler.data(z, streamId, this.source, INSTANCE.lengthWithoutPadding(length, flags, i));
                this.source.skip(i);
                return;
            }
            se.w("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
            return;
        }
        se.w("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    private final void readGoAway(Handler handler, int length, int flags, int streamId) {
        if (length >= 8) {
            if (streamId == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                int i = length - 8;
                ErrorCode fromHttp2 = ErrorCode.INSTANCE.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    bl blVar = bl.h;
                    if (i > 0) {
                        blVar = this.source.e(i);
                    }
                    handler.goAway(readInt, fromHttp2, blVar);
                    return;
                }
                se.w(l90.g(readInt2, "TYPE_GOAWAY unexpected error code: "));
                return;
            }
            se.w("TYPE_GOAWAY streamId != 0");
            return;
        }
        se.w(l90.g(length, "TYPE_GOAWAY length < 8: "));
    }

    private final List<Header> readHeaderBlock(int length, int padding, int flags, int streamId) {
        this.continuation.setLeft(length);
        ContinuationSource continuationSource = this.continuation;
        continuationSource.setLength(continuationSource.getLeft());
        this.continuation.setPadding(padding);
        this.continuation.setFlags(flags);
        this.continuation.setStreamId(streamId);
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private final void readHeaders(Handler handler, int length, int flags, int streamId) {
        boolean z;
        if (streamId != 0) {
            int i = 0;
            if ((flags & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((flags & 8) != 0) {
                i = _UtilCommonKt.and(this.source.readByte(), 255);
            }
            if ((flags & 32) != 0) {
                readPriority(handler, streamId);
                length -= 5;
            }
            handler.headers(z, streamId, -1, readHeaderBlock(INSTANCE.lengthWithoutPadding(length, flags, i), i, flags, streamId));
            return;
        }
        se.w("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void readPing(Handler handler, int length, int flags, int streamId) {
        if (length == 8) {
            if (streamId == 0) {
                int readInt = this.source.readInt();
                int readInt2 = this.source.readInt();
                boolean z = true;
                if ((flags & 1) == 0) {
                    z = false;
                }
                handler.ping(z, readInt, readInt2);
                return;
            }
            se.w("TYPE_PING streamId != 0");
            return;
        }
        se.w(l90.g(length, "TYPE_PING length != 8: "));
    }

    private final void readPriority(Handler handler, int streamId) {
        boolean z;
        int readInt = this.source.readInt();
        if ((Integer.MIN_VALUE & readInt) != 0) {
            z = true;
        } else {
            z = false;
        }
        handler.priority(streamId, readInt & Integer.MAX_VALUE, _UtilCommonKt.and(this.source.readByte(), 255) + 1, z);
    }

    private final void readPushPromise(Handler handler, int length, int flags, int streamId) {
        int i;
        if (streamId != 0) {
            if ((flags & 8) != 0) {
                i = _UtilCommonKt.and(this.source.readByte(), 255);
            } else {
                i = 0;
            }
            handler.pushPromise(streamId, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(INSTANCE.lengthWithoutPadding(length - 4, flags, i), i, flags, streamId));
            return;
        }
        se.w("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void readRstStream(Handler handler, int length, int flags, int streamId) {
        if (length == 4) {
            if (streamId != 0) {
                int readInt = this.source.readInt();
                ErrorCode fromHttp2 = ErrorCode.INSTANCE.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    handler.rstStream(streamId, fromHttp2);
                    return;
                } else {
                    se.w(l90.g(readInt, "TYPE_RST_STREAM unexpected error code: "));
                    return;
                }
            }
            se.w("TYPE_RST_STREAM streamId == 0");
            return;
        }
        se.w(l90.i("TYPE_RST_STREAM length: ", length, " != 4"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        defpackage.se.w(defpackage.l90.g(r4, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void readSettings(okhttp3.internal.http2.Http2Reader.Handler r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            if (r10 != 0) goto L8d
            r10 = 1
            r9 = r9 & r10
            if (r9 == 0) goto L12
            if (r8 != 0) goto Lc
            r7.ackSettings()
            return
        Lc:
            java.lang.String r6 = "FRAME_SIZE_ERROR ack frame should be empty!"
            defpackage.se.w(r6)
            return
        L12:
            int r9 = r8 % 6
            if (r9 != 0) goto L83
            okhttp3.internal.http2.Settings r9 = new okhttp3.internal.http2.Settings
            r9.<init>()
            r0 = 0
            an0 r8 = defpackage.go.X(r0, r8)
            r1 = 6
            ym0 r8 = defpackage.go.T(r8, r1)
            int r1 = r8.e
            int r2 = r8.f
            int r8 = r8.g
            if (r8 <= 0) goto L2f
            if (r1 <= r2) goto L33
        L2f:
            if (r8 >= 0) goto L7f
            if (r2 > r1) goto L7f
        L33:
            pk r3 = r6.source
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = okhttp3.internal._UtilCommonKt.and(r3, r4)
            pk r4 = r6.source
            int r4 = r4.readInt()
            r5 = 2
            if (r3 == r5) goto L6d
            r5 = 4
            if (r3 == r5) goto L64
            r5 = 5
            if (r3 == r5) goto L50
            goto L78
        L50:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L5a
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L5a
            goto L78
        L5a:
            java.lang.String r6 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r6 = defpackage.l90.g(r4, r6)
            defpackage.se.w(r6)
            return
        L64:
            if (r4 < 0) goto L67
            goto L78
        L67:
            java.lang.String r6 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            defpackage.se.w(r6)
            return
        L6d:
            if (r4 == 0) goto L78
            if (r4 != r10) goto L72
            goto L78
        L72:
            java.lang.String r6 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            defpackage.se.w(r6)
            return
        L78:
            r9.set(r3, r4)
            if (r1 == r2) goto L7f
            int r1 = r1 + r8
            goto L33
        L7f:
            r7.settings(r0, r9)
            return
        L83:
            java.lang.String r6 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r6 = defpackage.l90.g(r8, r6)
            defpackage.se.w(r6)
            return
        L8d:
            java.lang.String r6 = "TYPE_SETTINGS streamId != 0"
            defpackage.se.w(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.readSettings(okhttp3.internal.http2.Http2Reader$Handler, int, int, int):void");
    }

    private final void readWindowUpdate(Handler handler, int length, int flags, int streamId) {
        int i;
        try {
            if (length == 4) {
                try {
                    long and = _UtilCommonKt.and(this.source.readInt(), 2147483647L);
                    if (and != 0) {
                        Logger logger2 = logger;
                        if (logger2.isLoggable(Level.FINE)) {
                            i = streamId;
                            logger2.fine(Http2.INSTANCE.frameLogWindowUpdate(true, streamId, length, and));
                        } else {
                            i = streamId;
                        }
                        handler.windowUpdate(i, and);
                        return;
                    }
                    throw new IOException("windowSizeIncrement was 0");
                } catch (Exception e) {
                    e = e;
                    Exception exc = e;
                    logger.fine(Http2.INSTANCE.frameLog(true, streamId, length, 8, flags));
                    throw exc;
                }
            }
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + length);
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public final boolean nextFrame(boolean requireSettings, Handler handler) {
        int readMedium;
        handler.getClass();
        try {
            this.source.K(9L);
            readMedium = _UtilCommonKt.readMedium(this.source);
        } catch (EOFException unused) {
        }
        if (readMedium <= 16384) {
            int and = _UtilCommonKt.and(this.source.readByte(), 255);
            int and2 = _UtilCommonKt.and(this.source.readByte(), 255);
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            if (and != 8) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Http2.INSTANCE.frameLog(true, readInt, readMedium, and, and2));
                }
            }
            if (requireSettings && and != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + Http2.INSTANCE.formattedType$okhttp(and));
            }
            switch (and) {
                case 0:
                    readData(handler, readMedium, and2, readInt);
                    return true;
                case 1:
                    readHeaders(handler, readMedium, and2, readInt);
                    return true;
                case 2:
                    readPriority(handler, readMedium, and2, readInt);
                    return true;
                case 3:
                    readRstStream(handler, readMedium, and2, readInt);
                    return true;
                case 4:
                    readSettings(handler, readMedium, and2, readInt);
                    return true;
                case 5:
                    readPushPromise(handler, readMedium, and2, readInt);
                    return true;
                case 6:
                    readPing(handler, readMedium, and2, readInt);
                    return true;
                case 7:
                    readGoAway(handler, readMedium, and2, readInt);
                    return true;
                case 8:
                    readWindowUpdate(handler, readMedium, and2, readInt);
                    return true;
                default:
                    this.source.skip(readMedium);
                    return true;
            }
        }
        se.w(l90.g(readMedium, "FRAME_SIZE_ERROR: "));
        return false;
    }

    public final void readConnectionPreface(Handler handler) {
        handler.getClass();
        if (this.client) {
            if (!nextFrame(true, handler)) {
                se.w("Required SETTINGS preface not received");
                return;
            }
            return;
        }
        pk pkVar = this.source;
        bl blVar = Http2.CONNECTION_PREFACE;
        bl e = pkVar.e(blVar.d());
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(_UtilJvmKt.format("<< CONNECTION " + e.e(), new Object[0]));
        }
        if (blVar.equals(e)) {
            return;
        }
        se.w("Expected a connection header but was ".concat(e.r()));
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "<init>", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "lengthWithoutPadding", "", "length", "flags", "padding", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final Logger getLogger() {
            return Http2Reader.logger;
        }

        public final int lengthWithoutPadding(int length, int flags, int padding) {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            se.w(l90.j("PROTOCOL_ERROR padding ", padding, " > remaining length ", length));
            return 0;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\"\u0010!\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\"\u0010$\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001a¨\u0006'"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "Lk12;", "Lpk;", "source", "<init>", "(Lpk;)V", "Lod2;", "readContinuationHeader", "()V", "Lhk;", "sink", "", "byteCount", "read", "(Lhk;J)J", "Lea2;", "timeout", "()Lea2;", "close", "Lpk;", "", "length", "I", "getLength", "()I", "setLength", "(I)V", "flags", "getFlags", "setFlags", "streamId", "getStreamId", "setStreamId", "left", "getLeft", "setLeft", "padding", "getPadding", "setPadding", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class ContinuationSource implements k12 {
        private int flags;
        private int left;
        private int length;
        private int padding;
        private final pk source;
        private int streamId;

        public ContinuationSource(pk pkVar) {
            pkVar.getClass();
            this.source = pkVar;
        }

        private final void readContinuationHeader() {
            int i = this.streamId;
            int readMedium = _UtilCommonKt.readMedium(this.source);
            this.left = readMedium;
            this.length = readMedium;
            int and = _UtilCommonKt.and(this.source.readByte(), 255);
            this.flags = _UtilCommonKt.and(this.source.readByte(), 255);
            Companion companion = Http2Reader.INSTANCE;
            if (companion.getLogger().isLoggable(Level.FINE)) {
                companion.getLogger().fine(Http2.INSTANCE.frameLog(true, this.streamId, this.length, and, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (and == 9) {
                if (readInt == i) {
                    return;
                }
                se.w("TYPE_CONTINUATION streamId changed");
            } else {
                throw new IOException(and + " != TYPE_CONTINUATION");
            }
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLength() {
            return this.length;
        }

        public final int getPadding() {
            return this.padding;
        }

        public final int getStreamId() {
            return this.streamId;
        }

        @Override // defpackage.k12
        public long read(hk sink, long byteCount) {
            sink.getClass();
            while (true) {
                int i = this.left;
                pk pkVar = this.source;
                if (i == 0) {
                    pkVar.skip(this.padding);
                    this.padding = 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long read = pkVar.read(sink, Math.min(byteCount, i));
                    if (read == -1) {
                        return -1L;
                    }
                    this.left -= (int) read;
                    return read;
                }
            }
        }

        public final void setFlags(int i) {
            this.flags = i;
        }

        public final void setLeft(int i) {
            this.left = i;
        }

        public final void setLength(int i) {
            this.length = i;
        }

        public final void setPadding(int i) {
            this.padding = i;
        }

        public final void setStreamId(int i) {
            this.streamId = i;
        }

        @Override // defpackage.k12
        /* renamed from: timeout */
        public ea2 getTimeout() {
            return this.source.getTimeout();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    private final void readPriority(Handler handler, int length, int flags, int streamId) {
        if (length != 5) {
            se.w(l90.i("TYPE_PRIORITY length: ", length, " != 5"));
        } else if (streamId != 0) {
            readPriority(handler, streamId);
        } else {
            se.w("TYPE_PRIORITY streamId == 0");
        }
    }
}
