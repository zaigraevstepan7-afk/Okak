package okhttp3.internal.ws;

import defpackage.ba;
import defpackage.bl;
import defpackage.d12;
import defpackage.ey1;
import defpackage.k12;
import defpackage.od2;
import defpackage.se;
import defpackage.sn0;
import defpackage.v3;
import defpackage.wl1;
import defpackage.xl1;
import defpackage.xn;
import defpackage.y61;
import defpackage.yq1;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.connection.BufferedSocketKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.ws.WebSocketReader;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\u0018\u0000 \u0085\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\b\u0086\u0001\u0087\u0001\u0088\u0001\u0085\u0001BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#J%\u0010*\u001a\u00020\u00182\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020)¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0018¢\u0006\u0004\b0\u0010\u001aJ\r\u00101\u001a\u00020\u0018¢\u0006\u0004\b1\u0010\u001aJ\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u000202¢\u0006\u0004\b5\u00104J\r\u00106\u001a\u000202¢\u0006\u0004\b6\u00104J\u0017\u00108\u001a\u00020\u00182\u0006\u00107\u001a\u00020%H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b8\u0010<J\u0017\u0010>\u001a\u00020\u00182\u0006\u0010=\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010<J\u0017\u0010?\u001a\u00020\u00182\u0006\u0010=\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010<J\u001f\u0010B\u001a\u00020\u00182\u0006\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020%H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020)2\u0006\u00107\u001a\u00020%H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010D\u001a\u00020)2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bD\u0010FJ\u0015\u0010G\u001a\u00020)2\u0006\u0010=\u001a\u00020:¢\u0006\u0004\bG\u0010FJ!\u0010H\u001a\u00020)2\u0006\u0010@\u001a\u0002022\b\u0010A\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\bH\u0010IJ'\u0010H\u001a\u00020)2\u0006\u0010@\u001a\u0002022\b\u0010A\u001a\u0004\u0018\u00010%2\u0006\u0010J\u001a\u00020\f¢\u0006\u0004\bH\u0010KJ\u000f\u0010M\u001a\u00020)H\u0000¢\u0006\u0004\bL\u0010/J\u000f\u0010O\u001a\u00020\u0018H\u0000¢\u0006\u0004\bN\u0010\u001aJ/\u0010T\u001a\u00020\u00182\n\u0010R\u001a\u00060Pj\u0002`Q2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010S\u001a\u00020)¢\u0006\u0004\bT\u0010UJ\u0013\u0010V\u001a\u00020)*\u00020\u000eH\u0002¢\u0006\u0004\bV\u0010WJ\u001f\u0010D\u001a\u00020)2\u0006\u0010X\u001a\u00020:2\u0006\u0010Y\u001a\u000202H\u0002¢\u0006\u0004\bD\u0010ZJ\u000f\u0010[\u001a\u00020\u0018H\u0002¢\u0006\u0004\b[\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\\R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010bR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010aR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010aR\u0014\u0010c\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010f\u001a\u0004\u0018\u00010e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010v\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010dR\u0018\u0010(\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010xR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020:0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020|0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010{R\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010aR\u0016\u0010~\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0019\u0010\u0080\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010dR\u0018\u0010\u0083\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u007fR\u0017\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010\u0081\u0001R\u0017\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b5\u0010\u0081\u0001R\u0017\u00106\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b6\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u007f¨\u0006\u0089\u0001"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/Request;", "originalRequest", "Lokhttp3/WebSocketListener;", "listener", "Ljava/util/Random;", "random", "", "pingIntervalMillis", "Lokhttp3/internal/ws/WebSocketExtensions;", "extensions", "minimumDeflateSize", "webSocketCloseTimeout", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;JJ)V", "request", "()Lokhttp3/Request;", "queueSize", "()J", "Lod2;", "cancel", "()V", "Lokhttp3/OkHttpClient;", "client", "connect", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", "response", "Ld12;", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;)Ld12;", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "", "initReaderAndWriter", "(Ljava/lang/String;Lokhttp3/internal/connection/BufferedSocket;Z)V", "loopReader", "(Lokhttp3/Response;)V", "processNextFrame", "()Z", "finishReader", "tearDown", "", "sentPingCount", "()I", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "(Ljava/lang/String;)V", "Lbl;", "bytes", "(Lbl;)V", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "send", "(Ljava/lang/String;)Z", "(Lbl;)Z", "pong", "close", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "(ILjava/lang/String;J)Z", "writeOneFrame$okhttp", "writeOneFrame", "writePingFrame$okhttp", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "isWriter", "failWebSocket", "(Ljava/lang/Exception;Lokhttp3/Response;Z)V", "isValid", "(Lokhttp3/internal/ws/WebSocketExtensions;)Z", "data", "formatOpcode", "(Lbl;I)Z", "runWriter", "Lokhttp3/Request;", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Ljava/util/Random;", "J", "Lokhttp3/internal/ws/WebSocketExtensions;", "key", "Ljava/lang/String;", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "getCall$okhttp", "()Lokhttp3/Call;", "setCall$okhttp", "(Lokhttp3/Call;)V", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Ld12;", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "enqueuedClose", "Z", "receivedCloseCode", "I", "receivedCloseReason", "failed", "awaitingPong", "Companion", "Message", "Close", "WriterTask", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<bl> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private d12 socket;
    private TaskQueue taskQueue;
    private final long webSocketCloseTimeout;
    private WebSocketWriter writer;
    private Task writerTask;
    private static final List<Protocol> ONLY_HTTP1 = xn.E(Protocol.HTTP_1_1);

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "", "code", "Lbl;", "reason", "", "cancelAfterCloseMillis", "<init>", "(ILbl;J)V", "I", "getCode", "()I", "Lbl;", "getReason", "()Lbl;", "J", "getCancelAfterCloseMillis", "()J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final bl reason;

        public Close(int i, bl blVar, long j) {
            this.code = i;
            this.reason = blVar;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final bl getReason() {
            return this.reason;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "", "formatOpcode", "Lbl;", "data", "<init>", "(ILbl;)V", "I", "getFormatOpcode", "()I", "Lbl;", "getData", "()Lbl;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Message {
        private final bl data;
        private final int formatOpcode;

        public Message(int i, bl blVar) {
            blVar.getClass();
            this.formatOpcode = i;
            this.data = blVar;
        }

        public final bl getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                if (RealWebSocket.this.writeOneFrame$okhttp()) {
                    return 0L;
                }
                return -1L;
            } catch (IOException e) {
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e, null, true, 2, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, WebSocketExtensions webSocketExtensions, long j2, long j3) {
        taskRunner.getClass();
        request.getClass();
        webSocketListener.getClass();
        random.getClass();
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.webSocketCloseTimeout = j3;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if ("GET".equals(request.method())) {
            bl blVar = bl.h;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.key = xl1.q(bArr).a();
            return;
        }
        y61.q(request.method(), "Request must be GET: ");
        throw null;
    }

    public static /* synthetic */ void failWebSocket$default(RealWebSocket realWebSocket, Exception exc, Response response, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            response = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        realWebSocket.failWebSocket(exc, response, z);
    }

    public static final od2 failWebSocket$lambda$0$0(wl1 wl1Var) {
        _UtilCommonKt.closeQuietly((Closeable) wl1Var.e);
        return od2.a;
    }

    public static final od2 finishReader$lambda$0$0(WebSocketWriter webSocketWriter) {
        _UtilCommonKt.closeQuietly(webSocketWriter);
        return od2.a;
    }

    public static final long initReaderAndWriter$lambda$0$0(RealWebSocket realWebSocket, long j) {
        realWebSocket.writePingFrame$okhttp();
        return j;
    }

    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        Integer num = webSocketExtensions.serverMaxWindowBits;
        if (num != null) {
            int intValue = num.intValue();
            if (8 > intValue || intValue >= 16) {
                return false;
            }
            return true;
        }
        return true;
    }

    private final void runWriter() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            y61.h(Thread.currentThread().getName(), " MUST hold lock on ", this);
            return;
        }
        Task task = this.writerTask;
        if (task != null) {
            TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
        }
    }

    private final synchronized boolean send(bl data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + data.d() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += data.d();
            this.messageAndCloseQueue.add(new Message(formatOpcode, data));
            runWriter();
            return true;
        }
        return false;
    }

    public static final od2 writeOneFrame$lambda$0$0(RealWebSocket realWebSocket) {
        realWebSocket.cancel();
        return od2.a;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        call.getClass();
        call.cancel();
    }

    public final d12 checkUpgradeSuccess$okhttp(Response response) {
        response.getClass();
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", null, 2, null);
            if ("Upgrade".equalsIgnoreCase(header$default)) {
                String header$default2 = Response.header$default(response, "Upgrade", null, 2, null);
                if ("websocket".equalsIgnoreCase(header$default2)) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
                    bl blVar = bl.h;
                    String a = xl1.p(this.key + WebSocketProtocol.ACCEPT_MAGIC).c("SHA-1").a();
                    if (sn0.r(a, header$default3)) {
                        d12 socket = response.getSocket();
                        if (socket != null) {
                            return socket;
                        }
                        throw new ProtocolException("Web Socket socket missing: bad interceptor?");
                    }
                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a + "' but was '" + header$default3 + '\'');
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header$default2 + '\'');
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header$default + '\'');
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
    }

    public final synchronized boolean close(int code, String reason, long cancelAfterCloseMillis) {
        bl blVar;
        try {
            WebSocketProtocol.INSTANCE.validateCloseCode(code);
            if (reason != null) {
                bl blVar2 = bl.h;
                blVar = xl1.p(reason);
                if (blVar.e.length > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(reason).toString());
                }
            } else {
                blVar = null;
            }
            if (!this.failed && !this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(code, blVar, cancelAfterCloseMillis));
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void connect(OkHttpClient client) {
        client.getClass();
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket$default(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        OkHttpClient build = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                call.getClass();
                e.getClass();
                RealWebSocket.failWebSocket$default(RealWebSocket.this, e, null, false, 6, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                k12 source;
                ey1 sink;
                boolean isValid;
                ArrayDeque arrayDeque;
                call.getClass();
                response.getClass();
                try {
                    d12 checkUpgradeSuccess$okhttp = RealWebSocket.this.checkUpgradeSuccess$okhttp(response);
                    WebSocketExtensions parse = WebSocketExtensions.INSTANCE.parse(response.headers());
                    RealWebSocket.this.extensions = parse;
                    isValid = RealWebSocket.this.isValid(parse);
                    if (!isValid) {
                        RealWebSocket realWebSocket = RealWebSocket.this;
                        synchronized (realWebSocket) {
                            arrayDeque = realWebSocket.messageAndCloseQueue;
                            arrayDeque.clear();
                            realWebSocket.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    RealWebSocket.this.initReaderAndWriter(_UtilJvmKt.okHttpName + " WebSocket " + build2.url().redact(), BufferedSocketKt.asBufferedSocket(checkUpgradeSuccess$okhttp), true);
                    RealWebSocket.this.loopReader(response);
                } catch (IOException e) {
                    RealWebSocket.failWebSocket$default(RealWebSocket.this, e, response, false, 4, null);
                    _UtilCommonKt.closeQuietly(response);
                    d12 socket = response.getSocket();
                    if (socket != null && (sink = socket.getSink()) != null) {
                        _UtilCommonKt.closeQuietly(sink);
                    }
                    d12 socket2 = response.getSocket();
                    if (socket2 != null && (source = socket2.getSource()) != null) {
                        _UtilCommonKt.closeQuietly(source);
                    }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, wl1] */
    public final void failWebSocket(Exception e, Response response, boolean isWriter) {
        WebSocketWriter webSocketWriter;
        e.getClass();
        ?? obj = new Object();
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                this.failed = true;
                d12 d12Var = this.socket;
                WebSocketWriter webSocketWriter2 = this.writer;
                obj.e = webSocketWriter2;
                this.writer = null;
                if (!isWriter && webSocketWriter2 != null) {
                    TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new v3((Object) obj, 29), 2, null);
                }
                this.taskQueue.shutdown();
                try {
                    this.listener.onFailure(this, e, response);
                    if (d12Var != null) {
                        d12Var.cancel();
                    }
                    if (isWriter && (webSocketWriter = (WebSocketWriter) obj.e) != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finishReader() {
        int i;
        String str;
        WebSocketReader webSocketReader;
        boolean z;
        synchronized (this) {
            try {
                i = this.receivedCloseCode;
                str = this.receivedCloseReason;
                webSocketReader = this.reader;
                this.reader = null;
                if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                    WebSocketWriter webSocketWriter = this.writer;
                    if (webSocketWriter != null) {
                        this.writer = null;
                        TaskQueue.execute$default(this.taskQueue, this.name + " writer close", 0L, false, new v3(webSocketWriter, 28), 2, null);
                    }
                    this.taskQueue.shutdown();
                }
                if (!this.failed && this.writer == null) {
                    if (this.receivedCloseCode != -1) {
                        z = true;
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            WebSocketListener webSocketListener = this.listener;
            str.getClass();
            webSocketListener.onClosed(this, i, str);
        }
        if (webSocketReader != null) {
            _UtilCommonKt.closeQuietly(webSocketReader);
        }
    }

    /* renamed from: getCall$okhttp, reason: from getter */
    public final Call getCall() {
        return this.call;
    }

    /* renamed from: getListener$okhttp, reason: from getter */
    public final WebSocketListener getListener() {
        return this.listener;
    }

    public final void initReaderAndWriter(String name, BufferedSocket socket, boolean client) {
        name.getClass();
        socket.getClass();
        WebSocketExtensions webSocketExtensions = this.extensions;
        webSocketExtensions.getClass();
        synchronized (this) {
            try {
                this.name = name;
                this.socket = socket;
                this.writer = new WebSocketWriter(client, socket.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(client), this.minimumDeflateSize);
                this.writerTask = new WriterTask();
                long j = this.pingIntervalMillis;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.taskQueue.schedule(name.concat(" ping"), nanos, new ba(this, 2, nanos));
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.reader = new WebSocketReader(client, socket.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!client));
    }

    public final void loopReader(Response response) {
        Throwable th;
        RealWebSocket realWebSocket;
        response.getClass();
        try {
            this.listener.onOpen(this, response);
            while (this.receivedCloseCode == -1) {
                WebSocketReader webSocketReader = this.reader;
                webSocketReader.getClass();
                webSocketReader.processNextFrame();
            }
            finishReader();
        } catch (Exception e) {
            realWebSocket = this;
            try {
                failWebSocket$default(realWebSocket, e, null, false, 6, null);
                realWebSocket.finishReader();
            } catch (Throwable th2) {
                th = th2;
                realWebSocket.finishReader();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            realWebSocket = this;
            realWebSocket.finishReader();
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int code, String reason) {
        reason.getClass();
        if (code != -1) {
            synchronized (this) {
                if (this.receivedCloseCode == -1) {
                    this.receivedCloseCode = code;
                    this.receivedCloseReason = reason;
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            this.listener.onClosing(this, code, reason);
            return;
        }
        se.h("Failed requirement.");
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String text) {
        text.getClass();
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(bl payload) {
        try {
            payload.getClass();
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                this.receivedPingCount++;
            }
        } finally {
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(bl payload) {
        payload.getClass();
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(bl payload) {
        try {
            payload.getClass();
            if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
                this.pongQueue.add(payload);
                runWriter();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final boolean processNextFrame() {
        try {
            WebSocketReader webSocketReader = this.reader;
            webSocketReader.getClass();
            webSocketReader.processNextFrame();
            if (this.receivedCloseCode != -1) {
                return false;
            }
            return true;
        } catch (Exception e) {
            failWebSocket$default(this, e, null, false, 6, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    /* renamed from: request, reason: from getter */
    public Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void setCall$okhttp(Call call) {
        this.call = call;
    }

    public final void tearDown() {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final boolean writeOneFrame$okhttp() {
        String str;
        int i;
        WebSocketWriter webSocketWriter;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.failed) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.writer;
                bl poll = this.pongQueue.poll();
                Message message = 0;
                if (poll == null) {
                    Object poll2 = this.messageAndCloseQueue.poll();
                    if (poll2 instanceof Close) {
                        i = this.receivedCloseCode;
                        str = this.receivedCloseReason;
                        if (i != -1) {
                            webSocketWriter = this.writer;
                            this.writer = null;
                            if (webSocketWriter != null && this.reader == null) {
                                z = true;
                            }
                            this.taskQueue.shutdown();
                        } else {
                            long cancelAfterCloseMillis = ((Close) poll2).getCancelAfterCloseMillis();
                            TaskQueue.execute$default(this.taskQueue, this.name + " cancel", TimeUnit.MILLISECONDS.toNanos(cancelAfterCloseMillis), false, new v3(this, 27), 4, null);
                            webSocketWriter = null;
                        }
                    } else {
                        if (poll2 == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        webSocketWriter = null;
                    }
                    message = poll2;
                } else {
                    str = null;
                    i = -1;
                    webSocketWriter = null;
                }
                try {
                    if (poll != null) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writePong(poll);
                    } else if (message instanceof Message) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writeMessageFrame(message.getFormatOpcode(), message.getData());
                        synchronized (this) {
                            this.queueSize -= message.getData().d();
                        }
                    } else if (message instanceof Close) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.writeClose(message.getCode(), ((Close) message).getReason());
                        if (z) {
                            WebSocketListener webSocketListener = this.listener;
                            str.getClass();
                            webSocketListener.onClosed(this, i, str);
                        }
                    } else {
                        throw new AssertionError();
                    }
                    return true;
                } finally {
                    if (webSocketWriter != null) {
                        _UtilCommonKt.closeQuietly(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void writePingFrame$okhttp() {
        int i;
        synchronized (this) {
            try {
                if (this.failed) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.writer;
                if (webSocketWriter == null) {
                    return;
                }
                if (this.awaitingPong) {
                    i = this.sentPingCount;
                } else {
                    i = -1;
                }
                this.sentPingCount++;
                this.awaitingPong = true;
                if (i != -1) {
                    failWebSocket$default(this, new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i - 1) + " successful ping/pongs)"), null, true, 2, null);
                    return;
                }
                try {
                    webSocketWriter.writePing(bl.h);
                } catch (IOException e) {
                    failWebSocket$default(this, e, null, true, 2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(bl bytes) {
        bytes.getClass();
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.WebSocket
    public boolean send(bl bytes) {
        bytes.getClass();
        return send(bytes, 2);
    }

    @Override // okhttp3.WebSocket
    public boolean send(String text) {
        text.getClass();
        bl blVar = bl.h;
        return send(xl1.p(text), 1);
    }

    @Override // okhttp3.WebSocket
    public boolean close(int code, String reason) {
        return close(code, reason, this.webSocketCloseTimeout);
    }
}
