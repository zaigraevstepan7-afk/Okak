package okhttp3.internal.http2;

import defpackage.ba;
import defpackage.bl;
import defpackage.de0;
import defpackage.f80;
import defpackage.g70;
import defpackage.hk;
import defpackage.j1;
import defpackage.l90;
import defpackage.od2;
import defpackage.pk;
import defpackage.se;
import defpackage.sn0;
import defpackage.ui0;
import defpackage.v3;
import defpackage.wl1;
import defpackage.y61;
import defpackage.yq1;
import defpackage.yx;
import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http2.FlowControlListener;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000 Á\u00012\u00020\u00012\u00020\u0002:\bÂ\u0001Ã\u0001Ä\u0001Á\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J-\u0010%\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\b#\u0010$J/\u0010)\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010(\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u00100\u001a\u00020+H\u0000¢\u0006\u0004\b1\u0010.J\u001f\u00106\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0011H\u0000¢\u0006\u0004\b4\u00105J%\u0010:\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0013¢\u0006\u0004\b<\u0010=J\r\u0010:\u001a\u00020\u0013¢\u0006\u0004\b:\u0010=J\r\u0010>\u001a\u00020\u0013¢\u0006\u0004\b>\u0010=J\r\u0010?\u001a\u00020\u0013¢\u0006\u0004\b?\u0010=J\u0015\u0010@\u001a\u00020\u00132\u0006\u00100\u001a\u00020+¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0013H\u0016¢\u0006\u0004\bB\u0010=J)\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020+2\b\u0010F\u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020\u00132\b\b\u0002\u0010I\u001a\u00020\u001bH\u0007¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\u00132\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u0011¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020\u0013H\u0000¢\u0006\u0004\bS\u0010=J\u0017\u0010W\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0000¢\u0006\u0004\bU\u0010VJ%\u0010Z\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0000¢\u0006\u0004\bX\u0010YJ-\u0010^\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010[\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\\\u0010]J/\u0010c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010`\u001a\u00020_2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u001bH\u0000¢\u0006\u0004\ba\u0010bJ\u001f\u0010e\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\bd\u0010.J-\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010g\u001a\u00020\u00132\b\u0010f\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bg\u0010hR\u001a\u0010i\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001a\u0010n\u001a\u00020m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR&\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001a\u0010x\u001a\u00020w8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R#\u0010|\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\t\"\u0005\b\u007f\u0010\u0080\u0001R'\u0010\u0081\u0001\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0081\u0001\u0010}\u001a\u0005\b\u0082\u0001\u0010\t\"\u0006\b\u0083\u0001\u0010\u0080\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010jR\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0091\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0091\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0091\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0091\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0091\u0001R \u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010\u009d\u0001\u001a\u00020L8\u0006¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R(\u0010¡\u0001\u001a\u00020L8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¡\u0001\u0010\u009e\u0001\u001a\u0006\b¢\u0001\u0010 \u0001\"\u0005\b£\u0001\u0010OR\u001d\u0010¥\u0001\u001a\u00030¤\u00018\u0006¢\u0006\u0010\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001R*\u0010ª\u0001\u001a\u00020\u00112\u0007\u0010©\u0001\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bª\u0001\u0010\u0091\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R*\u0010\u00ad\u0001\u001a\u00020\u00112\u0007\u0010©\u0001\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0091\u0001\u001a\u0006\b®\u0001\u0010¬\u0001R \u0010°\u0001\u001a\u00030¯\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u001d\u0010µ\u0001\u001a\u00030´\u00018\u0006¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R!\u0010º\u0001\u001a\u00070¹\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R\u001e\u0010¿\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¾\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001¨\u0006Å\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/http2/Http2Connection$Builder;", "builder", "<init>", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "", "openStreamCount", "()I", "id", "Lokhttp3/internal/http2/Http2Stream;", "getStream", "(I)Lokhttp3/internal/http2/Http2Stream;", "streamId", "removeStream$okhttp", "removeStream", "", "read", "Lod2;", "updateConnectionFlowControl$okhttp", "(J)V", "updateConnectionFlowControl", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "out", "pushStream", "(ILjava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "newStream", "(Ljava/util/List;Z)Lokhttp3/internal/http2/Http2Stream;", "outFinished", "alternating", "writeHeaders$okhttp", "(IZLjava/util/List;)V", "writeHeaders", "Lhk;", "buffer", "byteCount", "writeData", "(IZLhk;J)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "writeSynResetLater$okhttp", "(ILokhttp3/internal/http2/ErrorCode;)V", "writeSynResetLater", "statusCode", "writeSynReset$okhttp", "writeSynReset", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "(IJ)V", "writeWindowUpdateLater", "reply", "payload1", "payload2", "writePing", "(ZII)V", "writePingAndAwaitPong", "()V", "awaitPong", "flush", "shutdown", "(Lokhttp3/internal/http2/ErrorCode;)V", "close", "connectionCode", "streamCode", "Ljava/io/IOException;", "cause", "close$okhttp", "(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V", "sendConnectionPreface", "start", "(Z)V", "Lokhttp3/internal/http2/Settings;", "settings", "setSettings", "(Lokhttp3/internal/http2/Settings;)V", "nowNs", "isHealthy", "(J)Z", "sendDegradedPingLater$okhttp", "sendDegradedPingLater", "pushedStream$okhttp", "(I)Z", "pushedStream", "pushRequestLater$okhttp", "(ILjava/util/List;)V", "pushRequestLater", "inFinished", "pushHeadersLater$okhttp", "(ILjava/util/List;Z)V", "pushHeadersLater", "Lpk;", "source", "pushDataLater$okhttp", "(ILpk;IZ)V", "pushDataLater", "pushResetLater$okhttp", "pushResetLater", "e", "failConnection", "(Ljava/io/IOException;)V", "client", "Z", "getClient$okhttp", "()Z", "Lokhttp3/internal/http2/Http2Connection$Listener;", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "", "streams", "Ljava/util/Map;", "getStreams$okhttp", "()Ljava/util/Map;", "", "connectionName", "Ljava/lang/String;", "getConnectionName$okhttp", "()Ljava/lang/String;", "lastGoodStreamId", "I", "getLastGoodStreamId$okhttp", "setLastGoodStreamId$okhttp", "(I)V", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "isShutdown", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/TaskQueue;", "writerQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "pushQueue", "settingsListenerQueue", "Lokhttp3/internal/http2/PushObserver;", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "intervalPingsSent", "J", "intervalPongsReceived", "degradedPingsSent", "degradedPongsReceived", "awaitPingsSent", "awaitPongsReceived", "degradedPongDeadlineNs", "Lokhttp3/internal/http2/FlowControlListener;", "flowControlListener", "Lokhttp3/internal/http2/FlowControlListener;", "getFlowControlListener$okhttp", "()Lokhttp3/internal/http2/FlowControlListener;", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "setPeerSettings", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "readBytes", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "getReadBytes", "()Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "value", "writeBytesTotal", "getWriteBytesTotal", "()J", "writeBytesMaximum", "getWriteBytesMaximum", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "Lokhttp3/internal/connection/BufferedSocket;", "getSocket$okhttp", "()Lokhttp3/internal/connection/BufferedSocket;", "Lokhttp3/internal/http2/Http2Writer;", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "", "currentPushRequests", "Ljava/util/Set;", "Companion", "Builder", "ReaderRunnable", "Listener", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Http2Connection implements Closeable, Lockable {
    public static final int AWAIT_PING = 3;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Settings DEFAULT_SETTINGS;
    public static final int DEGRADED_PING = 2;
    public static final int DEGRADED_PONG_TIMEOUT_NS = 1000000000;
    public static final int INTERVAL_PING = 1;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private long awaitPingsSent;
    private long awaitPongsReceived;
    private final boolean client;
    private final String connectionName;
    private final Set<Integer> currentPushRequests;
    private long degradedPingsSent;
    private long degradedPongDeadlineNs;
    private long degradedPongsReceived;
    private final FlowControlListener flowControlListener;
    private long intervalPingsSent;
    private long intervalPongsReceived;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private Settings peerSettings;
    private final PushObserver pushObserver;
    private final TaskQueue pushQueue;
    private final WindowCounter readBytes;
    private final ReaderRunnable readerRunnable;
    private final TaskQueue settingsListenerQueue;
    private final BufferedSocket socket;
    private final Map<Integer, Http2Stream> streams;
    private final TaskRunner taskRunner;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    private final TaskQueue writerQueue;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-J\u0006\u00103\u001a\u000204R\u001a\u0010\u0002\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "client", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "<init>", "(ZLokhttp3/internal/concurrent/TaskRunner;)V", "getClient$okhttp", "()Z", "setClient$okhttp", "(Z)V", "getTaskRunner$okhttp", "()Lokhttp3/internal/concurrent/TaskRunner;", "socket", "Lokhttp3/internal/connection/BufferedSocket;", "getSocket$okhttp", "()Lokhttp3/internal/connection/BufferedSocket;", "setSocket$okhttp", "(Lokhttp3/internal/connection/BufferedSocket;)V", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "pingIntervalMillis", "", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "flowControlListener", "Lokhttp3/internal/http2/FlowControlListener;", "getFlowControlListener$okhttp", "()Lokhttp3/internal/http2/FlowControlListener;", "setFlowControlListener$okhttp", "(Lokhttp3/internal/http2/FlowControlListener;)V", "peerName", "build", "Lokhttp3/internal/http2/Http2Connection;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private FlowControlListener flowControlListener;
        private Listener listener;
        private int pingIntervalMillis;
        private PushObserver pushObserver;
        public BufferedSocket socket;
        private final TaskRunner taskRunner;

        public Builder(boolean z, TaskRunner taskRunner) {
            taskRunner.getClass();
            this.client = z;
            this.taskRunner = taskRunner;
            this.listener = Listener.REFUSE_INCOMING_STREAMS;
            this.pushObserver = PushObserver.CANCEL;
            this.flowControlListener = FlowControlListener.None.INSTANCE;
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final Builder flowControlListener(FlowControlListener flowControlListener) {
            flowControlListener.getClass();
            this.flowControlListener = flowControlListener;
            return this;
        }

        /* renamed from: getClient$okhttp, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            sn0.V("connectionName");
            throw null;
        }

        /* renamed from: getFlowControlListener$okhttp, reason: from getter */
        public final FlowControlListener getFlowControlListener() {
            return this.flowControlListener;
        }

        /* renamed from: getListener$okhttp, reason: from getter */
        public final Listener getListener() {
            return this.listener;
        }

        /* renamed from: getPingIntervalMillis$okhttp, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        /* renamed from: getPushObserver$okhttp, reason: from getter */
        public final PushObserver getPushObserver() {
            return this.pushObserver;
        }

        public final BufferedSocket getSocket$okhttp() {
            BufferedSocket bufferedSocket = this.socket;
            if (bufferedSocket != null) {
                return bufferedSocket;
            }
            sn0.V("socket");
            throw null;
        }

        /* renamed from: getTaskRunner$okhttp, reason: from getter */
        public final TaskRunner getTaskRunner() {
            return this.taskRunner;
        }

        public final Builder listener(Listener listener) {
            listener.getClass();
            this.listener = listener;
            return this;
        }

        public final Builder pingIntervalMillis(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver) {
            pushObserver.getClass();
            this.pushObserver = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(String str) {
            str.getClass();
            this.connectionName = str;
        }

        public final void setFlowControlListener$okhttp(FlowControlListener flowControlListener) {
            flowControlListener.getClass();
            this.flowControlListener = flowControlListener;
        }

        public final void setListener$okhttp(Listener listener) {
            listener.getClass();
            this.listener = listener;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver) {
            pushObserver.getClass();
            this.pushObserver = pushObserver;
        }

        public final void setSocket$okhttp(BufferedSocket bufferedSocket) {
            bufferedSocket.getClass();
            this.socket = bufferedSocket;
        }

        public final Builder socket(BufferedSocket socket, String peerName) {
            String concat;
            socket.getClass();
            peerName.getClass();
            setSocket$okhttp(socket);
            if (this.client) {
                concat = _UtilJvmKt.okHttpName + ' ' + peerName;
            } else {
                concat = "MockWebServer ".concat(peerName);
            }
            setConnectionName$okhttp(concat);
            return this;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "<init>", "()V", "Lokhttp3/internal/http2/Http2Stream;", "stream", "Lod2;", "onStream", "(Lokhttp3/internal/http2/Http2Stream;)V", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Settings;", "settings", "onSettings", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Settings;)V", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream stream) {
                stream.getClass();
                stream.close(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public void onSettings(Http2Connection connection, Settings settings) {
            connection.getClass();
            settings.getClass();
        }

        public abstract void onStream(Http2Stream stream);
    }

    static {
        Settings settings = new Settings();
        settings.set(4, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings.set(5, 16384);
        DEFAULT_SETTINGS = settings;
    }

    public Http2Connection(Builder builder) {
        int i;
        builder.getClass();
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.connectionName = connectionName$okhttp;
        if (builder.getClient()) {
            i = 3;
        } else {
            i = 2;
        }
        this.nextStreamId = i;
        TaskRunner taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        TaskQueue newQueue = taskRunner.newQueue();
        this.writerQueue = newQueue;
        this.pushQueue = taskRunner.newQueue();
        this.settingsListenerQueue = taskRunner.newQueue();
        this.pushObserver = builder.getPushObserver();
        this.flowControlListener = builder.getFlowControlListener();
        Settings settings = new Settings();
        if (builder.getClient()) {
            settings.set(4, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        this.peerSettings = DEFAULT_SETTINGS;
        this.readBytes = new WindowCounter(0);
        this.writeBytesMaximum = this.peerSettings.getInitialWindowSize();
        BufferedSocket socket$okhttp = builder.getSocket$okhttp();
        this.socket = socket$okhttp;
        this.writer = new Http2Writer(socket$okhttp.getSink(), client);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(socket$okhttp.getSource(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            newQueue.schedule(connectionName$okhttp + " ping", nanos, new ba(this, 1, nanos));
        }
    }

    public static final long _init_$lambda$0(Http2Connection http2Connection, long j) {
        boolean z;
        synchronized (http2Connection) {
            long j2 = http2Connection.intervalPongsReceived;
            long j3 = http2Connection.intervalPingsSent;
            if (j2 < j3) {
                z = true;
            } else {
                http2Connection.intervalPingsSent = j3 + 1;
                z = false;
            }
        }
        if (z) {
            http2Connection.failConnection(null);
            return -1L;
        }
        http2Connection.writePing(false, 1, 0);
        return j;
    }

    public final void failConnection(IOException e) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, e);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x0027, B:16:0x002c, B:18:0x0034, B:22:0x0047, B:24:0x004d, B:41:0x0080, B:42:0x0085), top: B:10:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.internal.http2.Http2Stream newStream(int r10, java.util.List<okhttp3.internal.http2.Header> r11, boolean r12) {
        /*
            r9 = this;
            r3 = r12 ^ 1
            okhttp3.internal.http2.Http2Writer r6 = r9.writer
            monitor-enter(r6)
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L5f
            int r0 = r9.nextStreamId     // Catch: java.lang.Throwable -> L7c
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L18
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch: java.lang.Throwable -> L13
            r9.shutdown(r0)     // Catch: java.lang.Throwable -> L13
            goto L18
        L13:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L86
        L18:
            boolean r0 = r9.isShutdown     // Catch: java.lang.Throwable -> L7c
            if (r0 != 0) goto L7f
            int r1 = r9.nextStreamId     // Catch: java.lang.Throwable -> L7c
            int r0 = r1 + 2
            r9.nextStreamId = r0     // Catch: java.lang.Throwable -> L7c
            okhttp3.internal.http2.Http2Stream r0 = new okhttp3.internal.http2.Http2Stream     // Catch: java.lang.Throwable -> L7c
            r5 = 0
            r4 = 0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L43
            if (r12 == 0) goto L46
            long r4 = r2.writeBytesTotal     // Catch: java.lang.Throwable -> L43
            long r7 = r2.writeBytesMaximum     // Catch: java.lang.Throwable -> L43
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L46
            long r4 = r0.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L43
            long r7 = r0.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L43
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L41
            goto L46
        L41:
            r9 = 0
            goto L47
        L43:
            r0 = move-exception
        L44:
            r10 = r0
            goto L86
        L46:
            r9 = 1
        L47:
            boolean r12 = r0.isOpen()     // Catch: java.lang.Throwable -> L43
            if (r12 == 0) goto L56
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r12 = r2.streams     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L43
            r12.put(r4, r0)     // Catch: java.lang.Throwable -> L43
        L56:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            if (r10 != 0) goto L62
            okhttp3.internal.http2.Http2Writer r10 = r2.writer     // Catch: java.lang.Throwable -> L5f
            r10.headers(r3, r1, r11)     // Catch: java.lang.Throwable -> L5f
            goto L6b
        L5f:
            r0 = move-exception
            r9 = r0
            goto L88
        L62:
            boolean r12 = r2.client     // Catch: java.lang.Throwable -> L5f
            if (r12 != 0) goto L74
            okhttp3.internal.http2.Http2Writer r12 = r2.writer     // Catch: java.lang.Throwable -> L5f
            r12.pushPromise(r10, r1, r11)     // Catch: java.lang.Throwable -> L5f
        L6b:
            monitor-exit(r6)
            if (r9 == 0) goto L73
            okhttp3.internal.http2.Http2Writer r9 = r2.writer
            r9.flush()
        L73:
            return r0
        L74:
            java.lang.String r9 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5f
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L5f
            throw r10     // Catch: java.lang.Throwable -> L5f
        L7c:
            r0 = move-exception
            r2 = r9
            goto L44
        L7f:
            r2 = r9
            okhttp3.internal.http2.ConnectionShutdownException r9 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L43
            r9.<init>()     // Catch: java.lang.Throwable -> L43
            throw r9     // Catch: java.lang.Throwable -> L43
        L86:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5f
            throw r10     // Catch: java.lang.Throwable -> L5f
        L88:
            monitor-exit(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public static final od2 pushDataLater$lambda$0(Http2Connection http2Connection, int i, hk hkVar, int i2, boolean z) {
        try {
            boolean onData = http2Connection.pushObserver.onData(i, hkVar, i2, z);
            if (onData) {
                http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
            }
            if (onData || z) {
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(Integer.valueOf(i));
                }
            }
        } catch (IOException unused) {
        }
        return od2.a;
    }

    public static final od2 pushHeadersLater$lambda$0(Http2Connection http2Connection, int i, List list, boolean z) {
        boolean onHeaders = http2Connection.pushObserver.onHeaders(i, list, z);
        if (onHeaders) {
            try {
                http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
            } catch (IOException unused) {
            }
        }
        if (onHeaders || z) {
            synchronized (http2Connection) {
                http2Connection.currentPushRequests.remove(Integer.valueOf(i));
            }
        }
        return od2.a;
    }

    public static final od2 pushRequestLater$lambda$1(Http2Connection http2Connection, int i, List list) {
        if (http2Connection.pushObserver.onRequest(i, list)) {
            try {
                http2Connection.writer.rstStream(i, ErrorCode.CANCEL);
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(Integer.valueOf(i));
                }
            } catch (IOException unused) {
            }
        }
        return od2.a;
    }

    public static final od2 pushResetLater$lambda$0(Http2Connection http2Connection, int i, ErrorCode errorCode) {
        http2Connection.pushObserver.onReset(i, errorCode);
        synchronized (http2Connection) {
            http2Connection.currentPushRequests.remove(Integer.valueOf(i));
        }
        return od2.a;
    }

    public static final od2 sendDegradedPingLater$lambda$1(Http2Connection http2Connection) {
        http2Connection.writePing(false, 2, 0);
        return od2.a;
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        http2Connection.start(z);
    }

    public static final od2 writeSynResetLater$lambda$0(Http2Connection http2Connection, int i, ErrorCode errorCode) {
        try {
            http2Connection.writeSynReset$okhttp(i, errorCode);
        } catch (IOException e) {
            http2Connection.failConnection(e);
        }
        return od2.a;
    }

    public static final od2 writeWindowUpdateLater$lambda$0(Http2Connection http2Connection, int i, long j) {
        try {
            http2Connection.writer.windowUpdate(i, j);
        } catch (IOException e) {
            http2Connection.failConnection(e);
        }
        return od2.a;
    }

    public final void awaitPong() {
        synchronized (this) {
            while (this.awaitPongsReceived < this.awaitPingsSent) {
                wait();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void close$okhttp(ErrorCode connectionCode, ErrorCode streamCode, IOException cause) {
        int i;
        Object[] objArr;
        connectionCode.getClass();
        streamCode.getClass();
        if (_UtilJvmKt.assertionsEnabled && Thread.holdsLock(this)) {
            y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return;
        }
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                objArr = this.streams.values().toArray(new Http2Stream[0]);
                this.streams.clear();
            } else {
                objArr = null;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.cancel();
        } catch (IOException unused4) {
        }
        this.writerQueue.shutdown();
        this.pushQueue.shutdown();
        this.settingsListenerQueue.shutdown();
    }

    public final void flush() {
        this.writer.flush();
    }

    /* renamed from: getClient$okhttp, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    /* renamed from: getConnectionName$okhttp, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    /* renamed from: getFlowControlListener$okhttp, reason: from getter */
    public final FlowControlListener getFlowControlListener() {
        return this.flowControlListener;
    }

    /* renamed from: getLastGoodStreamId$okhttp, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    /* renamed from: getListener$okhttp, reason: from getter */
    public final Listener getListener() {
        return this.listener;
    }

    /* renamed from: getNextStreamId$okhttp, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final WindowCounter getReadBytes() {
        return this.readBytes;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    /* renamed from: getSocket$okhttp, reason: from getter */
    public final BufferedSocket getSocket() {
        return this.socket;
    }

    public final Http2Stream getStream(int id) {
        Http2Stream http2Stream;
        synchronized (this) {
            http2Stream = this.streams.get(Integer.valueOf(id));
        }
        return http2Stream;
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final boolean isHealthy(long nowNs) {
        synchronized (this) {
            if (this.isShutdown) {
                return false;
            }
            if (this.degradedPongsReceived < this.degradedPingsSent) {
                if (nowNs >= this.degradedPongDeadlineNs) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.streams.size();
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hk, java.lang.Object] */
    public final void pushDataLater$okhttp(final int streamId, pk source, final int byteCount, final boolean inFinished) {
        source.getClass();
        final ?? obj = new Object();
        long j = byteCount;
        source.K(j);
        source.read(obj, j);
        TaskQueue.execute$default(this.pushQueue, this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] onData", 0L, false, new de0() { // from class: si0
            @Override // defpackage.de0
            public final Object invoke() {
                od2 pushDataLater$lambda$0;
                pushDataLater$lambda$0 = Http2Connection.pushDataLater$lambda$0(Http2Connection.this, streamId, obj, byteCount, inFinished);
                return pushDataLater$lambda$0;
            }
        }, 6, null);
    }

    public final void pushHeadersLater$okhttp(final int streamId, final List<Header> requestHeaders, final boolean inFinished) {
        requestHeaders.getClass();
        TaskQueue.execute$default(this.pushQueue, this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] onHeaders", 0L, false, new de0() { // from class: vi0
            @Override // defpackage.de0
            public final Object invoke() {
                od2 pushHeadersLater$lambda$0;
                pushHeadersLater$lambda$0 = Http2Connection.pushHeadersLater$lambda$0(Http2Connection.this, streamId, requestHeaders, inFinished);
                return pushHeadersLater$lambda$0;
            }
        }, 6, null);
    }

    public final void pushRequestLater$okhttp(int streamId, List<Header> requestHeaders) {
        requestHeaders.getClass();
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(streamId));
            TaskQueue.execute$default(this.pushQueue, this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] onRequest", 0L, false, new g70(this, streamId, 1, requestHeaders), 6, null);
        }
    }

    public final void pushResetLater$okhttp(int streamId, ErrorCode errorCode) {
        errorCode.getClass();
        TaskQueue.execute$default(this.pushQueue, this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] onReset", 0L, false, new ui0(this, streamId, errorCode, 1), 6, null);
    }

    public final Http2Stream pushStream(int associatedStreamId, List<Header> requestHeaders, boolean out) {
        requestHeaders.getClass();
        if (!this.client) {
            return newStream(associatedStreamId, requestHeaders, out);
        }
        se.p("Client cannot push requests.");
        return null;
    }

    public final boolean pushedStream$okhttp(int streamId) {
        if (streamId != 0 && (streamId & 1) == 0) {
            return true;
        }
        return false;
    }

    public final Http2Stream removeStream$okhttp(int streamId) {
        Http2Stream remove;
        synchronized (this) {
            remove = this.streams.remove(Integer.valueOf(streamId));
            notifyAll();
        }
        return remove;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j = this.degradedPongsReceived;
            long j2 = this.degradedPingsSent;
            if (j < j2) {
                return;
            }
            this.degradedPingsSent = j2 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            TaskQueue.execute$default(this.writerQueue, l90.p(new StringBuilder(), this.connectionName, " ping"), 0L, false, new v3(this, 13), 6, null);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setPeerSettings(Settings settings) {
        settings.getClass();
        this.peerSettings = settings;
    }

    public final void setSettings(Settings settings) {
        settings.getClass();
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.okHttpSettings.merge(settings);
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
        }
    }

    public final void shutdown(ErrorCode statusCode) {
        statusCode.getClass();
        synchronized (this.writer) {
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                this.writer.goAway(this.lastGoodStreamId, statusCode, _UtilCommonKt.EMPTY_BYTE_ARRAY);
            }
        }
    }

    public final void start(boolean sendConnectionPreface) {
        if (sendConnectionPreface) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            if (this.okHttpSettings.getInitialWindowSize() != 65535) {
                this.writer.windowUpdate(0, r9 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        TaskQueue.execute$default(this.taskRunner.newQueue(), this.connectionName, 0L, false, this.readerRunnable, 6, null);
    }

    public final void updateConnectionFlowControl$okhttp(long read) {
        synchronized (this) {
            try {
                WindowCounter.update$default(this.readBytes, read, 0L, 2, null);
                long unacknowledged = this.readBytes.getUnacknowledged();
                if (unacknowledged >= this.okHttpSettings.getInitialWindowSize() / 2) {
                    writeWindowUpdateLater$okhttp(0, unacknowledged);
                    WindowCounter.update$default(this.readBytes, 0L, unacknowledged, 1, null);
                }
                this.flowControlListener.receivingConnectionWindowChanged(this.readBytes);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.getMaxFrameSize());
        r6 = r2;
        r8.writeBytesTotal += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeData(int r9, boolean r10, defpackage.hk r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            okhttp3.internal.http2.Http2Writer r8 = r8.writer
            r8.data(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r2 = r8.streams     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            r9 = move-exception
            goto L68
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L5b
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            okhttp3.internal.http2.Http2Writer r4 = r8.writer     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.getMaxFrameSize()     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.writer
            if (r10 == 0) goto L56
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = r3
        L57:
            r4.data(r5, r9, r11, r2)
            goto Ld
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, hk, long):void");
    }

    public final void writeHeaders$okhttp(int streamId, boolean outFinished, List<Header> alternating) {
        alternating.getClass();
        this.writer.headers(outFinished, streamId, alternating);
    }

    public final void writePing() {
        synchronized (this) {
            this.awaitPingsSent++;
        }
        writePing(false, 3, 1330343787);
    }

    public final void writePingAndAwaitPong() {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int streamId, ErrorCode statusCode) {
        statusCode.getClass();
        this.writer.rstStream(streamId, statusCode);
    }

    public final void writeSynResetLater$okhttp(int streamId, ErrorCode errorCode) {
        errorCode.getClass();
        TaskQueue.execute$default(this.writerQueue, this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] writeSynReset", 0L, false, new ui0(this, streamId, errorCode, 0), 6, null);
    }

    public final void writeWindowUpdateLater$okhttp(final int streamId, final long unacknowledgedBytesRead) {
        TaskQueue.execute$default(this.writerQueue, this.connectionName + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] windowUpdate", 0L, false, new de0() { // from class: ti0
            @Override // defpackage.de0
            public final Object invoke() {
                od2 writeWindowUpdateLater$lambda$0;
                writeWindowUpdateLater$lambda$0 = Http2Connection.writeWindowUpdateLater$lambda$0(Http2Connection.this, streamId, unacknowledgedBytesRead);
                return writeWindowUpdateLater$lambda$0;
            }
        }, 6, null);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "<init>", "()V", "OKHTTP_CLIENT_WINDOW_SIZE", "", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/Settings;", "getDEFAULT_SETTINGS", "()Lokhttp3/internal/http2/Settings;", "INTERVAL_PING", "DEGRADED_PING", "AWAIT_PING", "DEGRADED_PONG_TIMEOUT_NS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final Settings getDEFAULT_SETTINGS() {
            return Http2Connection.DEFAULT_SETTINGS;
        }

        private Companion() {
        }
    }

    public final void writePing(boolean reply, int payload1, int payload2) {
        try {
            this.writer.ping(reply, payload1, payload2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\tJ'\u0010&\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J/\u00104\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u00105J-\u00108\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b8\u00109J?\u0010@\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020-H\u0016¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "Lkotlin/Function0;", "Lod2;", "Lokhttp3/internal/http2/Http2Reader;", "reader", "<init>", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "invoke", "()V", "", "inFinished", "", "streamId", "Lpk;", "source", "length", "data", "(ZILpk;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "headers", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "(ILokhttp3/internal/http2/ErrorCode;)V", "clearPrevious", "Lokhttp3/internal/http2/Settings;", "settings", "(ZLokhttp3/internal/http2/Settings;)V", "applyAndAckSettings", "ackSettings", "ack", "payload1", "payload2", "ping", "(ZII)V", "lastGoodStreamId", "Lbl;", "debugData", "goAway", "(ILokhttp3/internal/http2/ErrorCode;Lbl;)V", "", "windowSizeIncrement", "windowUpdate", "(IJ)V", "streamDependency", "weight", "exclusive", "priority", "(IIIZ)V", "promisedStreamId", "requestHeaders", "pushPromise", "(IILjava/util/List;)V", "", "origin", "protocol", "host", "port", "maxAge", "alternateService", "(ILjava/lang/String;Lbl;Ljava/lang/String;IJ)V", "Lokhttp3/internal/http2/Http2Reader;", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class ReaderRunnable implements Http2Reader.Handler, de0 {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            http2Reader.getClass();
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        public static final od2 applyAndAckSettings$lambda$0$0$1(Http2Connection http2Connection, wl1 wl1Var) {
            http2Connection.getListener().onSettings(http2Connection, (Settings) wl1Var.e);
            return od2.a;
        }

        public static final od2 headers$lambda$0$0(Http2Connection http2Connection, Http2Stream http2Stream) {
            try {
                http2Connection.getListener().onStream(http2Stream);
            } catch (IOException e) {
                Platform.INSTANCE.get().log("Http2Connection.Listener failure for " + http2Connection.getConnectionName(), 4, e);
                try {
                    http2Stream.close(ErrorCode.PROTOCOL_ERROR, e);
                } catch (IOException unused) {
                }
            }
            return od2.a;
        }

        public static final od2 ping$lambda$1(Http2Connection http2Connection, int i, int i2) {
            http2Connection.writePing(true, i, i2);
            return od2.a;
        }

        public static final od2 settings$lambda$0(ReaderRunnable readerRunnable, boolean z, Settings settings) {
            readerRunnable.applyAndAckSettings(z, settings);
            return od2.a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int streamId, String origin, bl protocol, String host, int port, long maxAge) {
            origin.getClass();
            protocol.getClass();
            host.getClass();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wl1] */
        public final void applyAndAckSettings(boolean clearPrevious, Settings settings) {
            long initialWindowSize;
            int i;
            Http2Stream[] http2StreamArr;
            settings.getClass();
            ?? obj = new Object();
            Http2Writer writer = this.this$0.getWriter();
            Http2Connection http2Connection = this.this$0;
            synchronized (writer) {
                synchronized (http2Connection) {
                    try {
                        Settings peerSettings = http2Connection.getPeerSettings();
                        if (!clearPrevious) {
                            Settings settings2 = new Settings();
                            settings2.merge(peerSettings);
                            settings2.merge(settings);
                            settings = settings2;
                        }
                        obj.e = settings;
                        initialWindowSize = settings.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                        if (initialWindowSize != 0 && !http2Connection.getStreams$okhttp().isEmpty()) {
                            http2StreamArr = (Http2Stream[]) http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                            http2Connection.setPeerSettings((Settings) obj.e);
                            TaskQueue.execute$default(http2Connection.settingsListenerQueue, http2Connection.getConnectionName() + " onSettings", 0L, false, new j1(18, http2Connection, (Object) obj), 6, null);
                        }
                        http2StreamArr = null;
                        http2Connection.setPeerSettings((Settings) obj.e);
                        TaskQueue.execute$default(http2Connection.settingsListenerQueue, http2Connection.getConnectionName() + " onSettings", 0L, false, new j1(18, http2Connection, (Object) obj), 6, null);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.getWriter().applyAndAckSettings((Settings) obj.e);
                } catch (IOException e) {
                    http2Connection.failConnection(e);
                }
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(initialWindowSize);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean inFinished, int streamId, pk source, int length) {
            source.getClass();
            boolean pushedStream$okhttp = this.this$0.pushedStream$okhttp(streamId);
            Http2Connection http2Connection = this.this$0;
            if (pushedStream$okhttp) {
                http2Connection.pushDataLater$okhttp(streamId, source, length, inFinished);
                return;
            }
            Http2Stream stream = http2Connection.getStream(streamId);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(streamId, ErrorCode.PROTOCOL_ERROR);
                long j = length;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                source.skip(j);
                return;
            }
            stream.receiveData(source, length);
            if (inFinished) {
                stream.receiveHeaders(Headers.EMPTY, true);
            }
        }

        /* renamed from: getReader$okhttp, reason: from getter */
        public final Http2Reader getReader() {
            return this.reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int lastGoodStreamId, ErrorCode errorCode, bl debugData) {
            int i;
            Object[] array;
            errorCode.getClass();
            debugData.getClass();
            debugData.d();
            Http2Connection http2Connection = this.this$0;
            synchronized (http2Connection) {
                array = http2Connection.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                http2Connection.isShutdown = true;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.getId() > lastGoodStreamId && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean inFinished, int streamId, int associatedStreamId, List<Header> headerBlock) {
            headerBlock.getClass();
            boolean pushedStream$okhttp = this.this$0.pushedStream$okhttp(streamId);
            Http2Connection http2Connection = this.this$0;
            if (pushedStream$okhttp) {
                http2Connection.pushHeadersLater$okhttp(streamId, headerBlock, inFinished);
                return;
            }
            synchronized (http2Connection) {
                Http2Stream stream = http2Connection.getStream(streamId);
                if (stream == null) {
                    if (http2Connection.isShutdown) {
                        return;
                    }
                    if (streamId <= http2Connection.getLastGoodStreamId()) {
                        return;
                    }
                    if (streamId % 2 == http2Connection.getNextStreamId() % 2) {
                        return;
                    }
                    Http2Stream http2Stream = new Http2Stream(streamId, http2Connection, false, inFinished, _UtilJvmKt.toHeaders(headerBlock));
                    http2Connection.setLastGoodStreamId$okhttp(streamId);
                    http2Connection.getStreams$okhttp().put(Integer.valueOf(streamId), http2Stream);
                    TaskQueue.execute$default(http2Connection.taskRunner.newQueue(), http2Connection.getConnectionName() + AbstractJsonLexerKt.BEGIN_LIST + streamId + "] onStream", 0L, false, new j1(17, http2Connection, http2Stream), 6, null);
                    return;
                }
                stream.receiveHeaders(_UtilJvmKt.toHeaders(headerBlock), inFinished);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable, okhttp3.internal.http2.Http2Reader] */
        /* renamed from: invoke */
        public void m279invoke() {
            ErrorCode errorCode;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.reader.readConnectionPreface(this);
                    do {
                    } while (this.reader.nextFrame(false, this));
                    ErrorCode errorCode3 = ErrorCode.NO_ERROR;
                    try {
                        errorCode2 = ErrorCode.CANCEL;
                        this.this$0.close$okhttp(errorCode3, errorCode2, null);
                        errorCode = errorCode3;
                    } catch (IOException e2) {
                        e = e2;
                        errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.this$0;
                        http2Connection.close$okhttp(errorCode2, errorCode2, e);
                        errorCode = http2Connection;
                        this = this.reader;
                        _UtilCommonKt.closeQuietly(this);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(errorCode, errorCode2, e);
                    _UtilCommonKt.closeQuietly(this.reader);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode2;
                this.this$0.close$okhttp(errorCode, errorCode2, e);
                _UtilCommonKt.closeQuietly(this.reader);
                throw th;
            }
            this = this.reader;
            _UtilCommonKt.closeQuietly(this);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean ack, final int payload1, final int payload2) {
            Http2Connection http2Connection = this.this$0;
            if (!ack) {
                TaskQueue taskQueue = http2Connection.writerQueue;
                String str = this.this$0.getConnectionName() + " ping";
                final Http2Connection http2Connection2 = this.this$0;
                TaskQueue.execute$default(taskQueue, str, 0L, false, new de0() { // from class: wi0
                    @Override // defpackage.de0
                    public final Object invoke() {
                        od2 ping$lambda$1;
                        ping$lambda$1 = Http2Connection.ReaderRunnable.ping$lambda$1(Http2Connection.this, payload1, payload2);
                        return ping$lambda$1;
                    }
                }, 6, null);
                return;
            }
            synchronized (http2Connection) {
                try {
                    if (payload1 == 1) {
                        http2Connection.intervalPongsReceived++;
                    } else if (payload1 == 2) {
                        http2Connection.degradedPongsReceived++;
                    } else if (payload1 == 3) {
                        http2Connection.awaitPongsReceived++;
                        http2Connection.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int streamId, int promisedStreamId, List<Header> requestHeaders) {
            requestHeaders.getClass();
            this.this$0.pushRequestLater$okhttp(promisedStreamId, requestHeaders);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int streamId, ErrorCode errorCode) {
            errorCode.getClass();
            boolean pushedStream$okhttp = this.this$0.pushedStream$okhttp(streamId);
            Http2Connection http2Connection = this.this$0;
            if (pushedStream$okhttp) {
                http2Connection.pushResetLater$okhttp(streamId, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = http2Connection.removeStream$okhttp(streamId);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean clearPrevious, Settings settings) {
            settings.getClass();
            TaskQueue.execute$default(this.this$0.writerQueue, this.this$0.getConnectionName() + " applyAndAckSettings", 0L, false, new f80(this, clearPrevious, settings), 6, null);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int streamId, long windowSizeIncrement) {
            Http2Connection http2Connection = this.this$0;
            if (streamId == 0) {
                synchronized (http2Connection) {
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + windowSizeIncrement;
                    http2Connection.notifyAll();
                }
            } else {
                Http2Stream stream = http2Connection.getStream(streamId);
                if (stream != null) {
                    synchronized (stream) {
                        stream.addBytesToWriteWindow(windowSizeIncrement);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // defpackage.de0
        public /* bridge */ /* synthetic */ Object invoke() {
            m279invoke();
            return od2.a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int streamId, int streamDependency, int weight, boolean exclusive) {
        }
    }

    public final void start() {
        start$default(this, false, 1, null);
    }

    public final Http2Stream newStream(List<Header> requestHeaders, boolean out) {
        requestHeaders.getClass();
        return newStream(0, requestHeaders, out);
    }
}
