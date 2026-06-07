package okhttp3.internal.connection;

import defpackage.de0;
import defpackage.ea2;
import defpackage.fp;
import defpackage.kf;
import defpackage.se;
import defpackage.sn0;
import defpackage.to0;
import defpackage.wn;
import defpackage.y61;
import defpackage.yl1;
import defpackage.yq1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Tags;
import okhttp3.internal.TagsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000Ï\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001k\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008e\u0001\u008f\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J5\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0013\u0010\u0019J5\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0013\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010#J\u000f\u0010-\u001a\u00020$H\u0000¢\u0006\u0004\b,\u0010&J%\u00101\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u0002032\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b4\u00105J\u0015\u00109\u001a\u00020\u001f2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:JK\u0010D\u001a\u0004\u0018\u00010@2\u0006\u0010;\u001a\u0002032\b\b\u0002\u0010<\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\b2\b\b\u0002\u0010>\u001a\u00020\b2\b\b\u0002\u0010?\u001a\u00020\b2\b\u0010A\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0004\bB\u0010CJ\u001b\u0010G\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@H\u0000¢\u0006\u0004\bE\u0010FJ\u0011\u0010K\u001a\u0004\u0018\u00010HH\u0000¢\u0006\u0004\bI\u0010JJ\r\u0010L\u001a\u00020\u001f¢\u0006\u0004\bL\u0010!J\r\u0010M\u001a\u00020\u001f¢\u0006\u0004\bM\u0010!J\u0017\u0010Q\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\bH\u0000¢\u0006\u0004\bO\u0010PJ\r\u0010R\u001a\u00020\b¢\u0006\u0004\bR\u0010#J\u000f\u0010V\u001a\u00020SH\u0000¢\u0006\u0004\bT\u0010UJ\u000f\u0010W\u001a\u00020\u001fH\u0002¢\u0006\u0004\bW\u0010!J\u001b\u0010X\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\bX\u0010FJ\u001b\u0010Z\u001a\u0004\u0018\u00010@2\b\u0010Y\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\bZ\u0010FJ\u000f\u0010[\u001a\u00020SH\u0002¢\u0006\u0004\b[\u0010UR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\\\u001a\u0004\b]\u0010^R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010_\u001a\u0004\b`\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010a\u001a\u0004\bb\u0010#R\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010g\u001a\u00020f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010\r\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010lR\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR(\u00108\u001a\u0004\u0018\u0001072\b\u0010u\u001a\u0004\u0018\u0001078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u0010v\u001a\u0004\bw\u0010xR\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010aR(\u0010y\u001a\u0004\u0018\u0001032\b\u0010u\u001a\u0004\u0018\u0001038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010aR\u0016\u0010~\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010aR\u0016\u0010\u007f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010aR\u0018\u0010\u0080\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010aR\u0018\u0010\u0081\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010aR\u0018\u0010\u0082\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010aR\u0018\u0010;\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010zR'\u0010\u0085\u0001\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R)\u0010\u008c\u0001\u001a\u0014\u0012\u000f\u0012\r \u008b\u0001*\u0005\u0018\u00010\u008a\u00010\u008a\u00010\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0090\u0001"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "", "Lokhttp3/internal/concurrent/Lockable;", "Lokhttp3/OkHttpClient;", "client", "Lokhttp3/Request;", "originalRequest", "", "forWebSocket", "<init>", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "Lea2;", "timeout", "()Lea2;", "", "T", "Lto0;", "type", "tag", "(Lto0;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/Function0;", "computeIfAbsent", "(Lto0;Lde0;)Ljava/lang/Object;", "(Ljava/lang/Class;Lde0;)Ljava/lang/Object;", "clone", "()Lokhttp3/Call;", "request", "()Lokhttp3/Request;", "Lod2;", "cancel", "()V", "isCanceled", "()Z", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "Lokhttp3/Callback;", "responseCallback", "enqueue", "(Lokhttp3/Callback;)V", "isExecuted", "getResponseWithInterceptorChain$okhttp", "getResponseWithInterceptorChain", "newRoutePlanner", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "enterNetworkInterceptorExchange", "(Lokhttp3/Request;ZLokhttp3/internal/http/RealInterceptorChain;)V", "Lokhttp3/internal/connection/Exchange;", "initExchange$okhttp", "(Lokhttp3/internal/http/RealInterceptorChain;)Lokhttp3/internal/connection/Exchange;", "initExchange", "Lokhttp3/internal/connection/RealConnection;", "connection", "acquireConnectionNoEvents", "(Lokhttp3/internal/connection/RealConnection;)V", "exchange", "requestDone", "responseDone", "socketSourceDone", "socketSinkDone", "Ljava/io/IOException;", "e", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZZZLjava/io/IOException;)Ljava/io/IOException;", "messageDone", "noMoreExchanges$okhttp", "(Ljava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "()Ljava/net/Socket;", "releaseConnectionNoEvents", "timeoutEarlyExit", "upgradeToSocket", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "(Z)V", "exitNetworkInterceptorExchange", "retryAfterFailure", "", "redactedUrl$okhttp", "()Ljava/lang/String;", "redactedUrl", "callStart", "callDone", "cause", "timeoutExit", "toLoggableString", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "Lokhttp3/Request;", "getOriginalRequest", "Z", "getForWebSocket", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "callStackTrace", "Ljava/lang/Object;", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "value", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "interceptorScopedExchange", "Lokhttp3/internal/connection/Exchange;", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "requestBodyOpen", "responseBodyOpen", "socketSinkOpen", "socketSourceOpen", "expectMoreExchanges", "canceled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "plansToCancel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getPlansToCancel$okhttp", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/Tags;", "kotlin.jvm.PlatformType", "tags", "Ljava/util/concurrent/atomic/AtomicReference;", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class RealCall implements Call, Cloneable, Lockable {
    private Object callStackTrace;
    private volatile boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener;
    private volatile Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private Exchange interceptorScopedExchange;
    private final Request originalRequest;
    private final CopyOnWriteArrayList<RoutePlanner.Plan> plansToCancel;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private boolean socketSinkOpen;
    private boolean socketSourceOpen;
    private final AtomicReference<Tags> tags;
    private final RealCall$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R$\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "Lokhttp3/Callback;", "responseCallback", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "Lokhttp3/internal/connection/RealCall;", "other", "Lod2;", "reuseCallsPerHostFrom", "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "executeOn", "(Ljava/util/concurrent/ExecutorService;)V", "Ljava/util/concurrent/RejectedExecutionException;", "e", "failRejected$okhttp", "(Ljava/util/concurrent/RejectedExecutionException;)V", "failRejected", "run", "()V", "Lokhttp3/Callback;", "Ljava/util/concurrent/atomic/AtomicInteger;", "value", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "", "getHost", "()Ljava/lang/String;", "host", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "request", "getCall", "()Lokhttp3/internal/connection/RealCall;", "call", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost;
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(RealCall realCall, Callback callback) {
            callback.getClass();
            this.this$0 = realCall;
            this.responseCallback = callback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public static /* synthetic */ void failRejected$okhttp$default(AsyncCall asyncCall, RejectedExecutionException rejectedExecutionException, int i, Object obj) {
            if ((i & 1) != 0) {
                rejectedExecutionException = null;
            }
            asyncCall.failRejected$okhttp(rejectedExecutionException);
        }

        public final void executeOn(ExecutorService executorService) {
            executorService.getClass();
            _UtilJvmKt.assertLockNotHeld(this.this$0.getClient().dispatcher());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    failRejected$okhttp(e);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th) {
                this.this$0.getClient().dispatcher().finished$okhttp(this);
                throw th;
            }
        }

        public final void failRejected$okhttp(RejectedExecutionException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(e);
            this.this$0.noMoreExchanges$okhttp(interruptedIOException);
            this.responseCallback.onFailure(this.this$0, interruptedIOException);
        }

        /* renamed from: getCall, reason: from getter */
        public final RealCall getThis$0() {
            return this.this$0;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final String getHost() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request getRequest() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(AsyncCall other) {
            other.getClass();
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            OkHttpClient client;
            String str = "OkHttp " + this.this$0.redactedUrl$okhttp();
            RealCall realCall = this.this$0;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                realCall.timeout.enter();
                boolean z = false;
                try {
                    try {
                        try {
                            this.responseCallback.onResponse(realCall, realCall.getResponseWithInterceptorChain$okhttp());
                            client = realCall.getClient();
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (z) {
                                Platform.INSTANCE.get().log("Callback failure for " + realCall.toLoggableString(), 4, e);
                            } else {
                                this.responseCallback.onFailure(realCall, e);
                            }
                            client = realCall.getClient();
                            client.dispatcher().finished$okhttp(this);
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            realCall.cancel();
                            if (!z) {
                                IOException iOException = new IOException("canceled due to " + th);
                                iOException.initCause(th);
                                this.responseCallback.onFailure(realCall, iOException);
                            }
                            if (th instanceof InterruptedException) {
                                Thread.currentThread().interrupt();
                                client = realCall.getClient();
                                client.dispatcher().finished$okhttp(this);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        realCall.getClient().dispatcher().finished$okhttp(this);
                        throw th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
                client.dispatcher().finished$okhttp(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "callStackTrace", "", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class CallReference extends WeakReference<RealCall> {
        private final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallReference(RealCall realCall, Object obj) {
            super(realCall);
            realCall.getClass();
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [ea2, okhttp3.internal.connection.RealCall$timeout$1] */
    public RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        okHttpClient.getClass();
        request.getClass();
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient.connectionPool().getDelegate();
        this.eventListener = okHttpClient.eventListenerFactory().create(this);
        ?? r5 = new kf() { // from class: okhttp3.internal.connection.RealCall$timeout$1
            @Override // defpackage.kf
            public void timedOut() {
                RealCall.this.cancel();
            }
        };
        r5.timeout(okHttpClient.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = r5;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
        this.plansToCancel = new CopyOnWriteArrayList<>();
        this.tags = new AtomicReference<>(request.getTags());
    }

    private final IOException callDone(IOException e) {
        Socket releaseConnectionNoEvents$okhttp;
        boolean z = _UtilJvmKt.assertionsEnabled;
        if (z && Thread.holdsLock(this)) {
            y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", this);
            return null;
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z && Thread.holdsLock(realConnection)) {
                y61.h(Thread.currentThread().getName(), " MUST NOT hold lock on ", realConnection);
                return null;
            }
            synchronized (realConnection) {
                releaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.connection == null) {
                if (releaseConnectionNoEvents$okhttp != null) {
                    _UtilJvmKt.closeQuietly(releaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this, realConnection);
                realConnection.getConnectionListener().connectionReleased(realConnection, this);
                if (releaseConnectionNoEvents$okhttp != null) {
                    realConnection.getConnectionListener().connectionClosed(realConnection);
                }
            } else if (releaseConnectionNoEvents$okhttp != null) {
                se.p("Check failed.");
                return null;
            }
        }
        IOException timeoutExit = timeoutExit(e);
        EventListener eventListener = this.eventListener;
        if (e != null) {
            timeoutExit.getClass();
            eventListener.callFailed(this, timeoutExit);
            return timeoutExit;
        }
        eventListener.callEnd(this);
        return timeoutExit;
    }

    private final void callStart() {
        this.callStackTrace = Platform.INSTANCE.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    public static /* synthetic */ IOException messageDone$okhttp$default(RealCall realCall, Exchange exchange, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        return realCall.messageDone$okhttp(exchange, z, z2, z3, z4, iOException);
    }

    private final IOException timeoutExit(IOException cause) {
        if (this.timeoutEarlyExit || !exit()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final String toLoggableString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (getCanceled()) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.forWebSocket) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        sb.append(str2);
        sb.append(" to ");
        sb.append(redactedUrl$okhttp());
        return sb.toString();
    }

    public final void acquireConnectionNoEvents(RealConnection connection) {
        connection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(connection)) {
            y61.h(Thread.currentThread().getName(), " MUST hold lock on ", connection);
        } else if (this.connection == null) {
            this.connection = connection;
            connection.getCalls().add(new CallReference(this, this.callStackTrace));
        } else {
            se.p("Check failed.");
        }
    }

    @Override // okhttp3.Call
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            exchange.cancel();
        }
        Iterator<RoutePlanner.Plan> it = this.plansToCancel.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().mo273cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override // okhttp3.Call
    public Call clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    @Override // okhttp3.Call
    public void enqueue(Callback responseCallback) {
        responseCallback.getClass();
        if (this.executed.compareAndSet(false, true)) {
            callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, responseCallback));
        } else {
            se.p("Already Executed");
        }
    }

    public final void enterNetworkInterceptorExchange(Request request, boolean newRoutePlanner, RealInterceptorChain chain) {
        ExchangeFinder sequentialExchangeFinder;
        request.getClass();
        chain.getClass();
        if (this.interceptorScopedExchange == null) {
            synchronized (this) {
                if (!this.responseBodyOpen) {
                    if (this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
            }
            if (newRoutePlanner) {
                RealRoutePlanner realRoutePlanner = new RealRoutePlanner(this.client.getTaskRunner(), this.connectionPool, this.client.readTimeoutMillis(), this.client.writeTimeoutMillis(), chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis(), this.client.pingIntervalMillis(), this.client.retryOnConnectionFailure(), this.client.getFastFallback(), this.client.address(request.url()), this.client.getRouteDatabase(), this, request);
                if (this.client.getFastFallback()) {
                    sequentialExchangeFinder = new FastFallbackExchangeFinder(realRoutePlanner, this.client.getTaskRunner());
                } else {
                    sequentialExchangeFinder = new SequentialExchangeFinder(realRoutePlanner);
                }
                this.exchangeFinder = sequentialExchangeFinder;
                return;
            }
            return;
        }
        se.p("Check failed.");
    }

    @Override // okhttp3.Call
    public Response execute() {
        if (this.executed.compareAndSet(false, true)) {
            enter();
            callStart();
            try {
                this.client.dispatcher().executed$okhttp(this);
                return getResponseWithInterceptorChain$okhttp();
            } finally {
                this.client.dispatcher().finished$okhttp(this);
            }
        }
        se.p("Already Executed");
        return null;
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean closeExchange) {
        Exchange exchange;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
        }
        if (closeExchange && (exchange = this.exchange) != null) {
            exchange.detachWithViolence();
        }
        this.interceptorScopedExchange = null;
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    /* renamed from: getEventListener$okhttp, reason: from getter */
    public final EventListener getEventListener() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* renamed from: getInterceptorScopedExchange$okhttp, reason: from getter */
    public final Exchange getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    public final CopyOnWriteArrayList<RoutePlanner.Plan> getPlansToCancel$okhttp() {
        return this.plansToCancel;
    }

    public final Response getResponseWithInterceptorChain$okhttp() {
        ArrayList arrayList = new ArrayList();
        wn.d0(this.client.interceptors(), arrayList);
        arrayList.add(new RetryAndFollowUpInterceptor(this.client));
        arrayList.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList.add(new CacheInterceptor(this.client.cache()));
        arrayList.add(ConnectInterceptor.INSTANCE);
        if (!this.forWebSocket) {
            wn.d0(this.client.networkInterceptors(), arrayList);
        }
        arrayList.add(CallServerInterceptor.INSTANCE);
        try {
            try {
                Response proceed = new RealInterceptorChain(this, arrayList, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis()).proceed(this.originalRequest);
                if (!getCanceled()) {
                    noMoreExchanges$okhttp(null);
                    return proceed;
                }
                _UtilCommonKt.closeQuietly(proceed);
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException noMoreExchanges$okhttp = noMoreExchanges$okhttp(e);
                noMoreExchanges$okhttp.getClass();
                throw noMoreExchanges$okhttp;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                noMoreExchanges$okhttp(null);
            }
            throw th;
        }
    }

    public final Exchange initExchange$okhttp(RealInterceptorChain chain) {
        chain.getClass();
        synchronized (this) {
            if (this.expectMoreExchanges) {
                if (this.responseBodyOpen || this.requestBodyOpen || this.socketSourceOpen || this.socketSinkOpen) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        ExchangeFinder exchangeFinder = this.exchangeFinder;
        exchangeFinder.getClass();
        Exchange exchange = new Exchange(this, this.eventListener, exchangeFinder, exchangeFinder.find().newCodec$okhttp(this.client, chain));
        this.interceptorScopedExchange = exchange;
        this.exchange = exchange;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (!this.canceled) {
            return exchange;
        }
        se.w("Canceled");
        return null;
    }

    @Override // okhttp3.Call
    /* renamed from: isCanceled, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:53:0x0011, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001a, B:46:0x0020, B:49:0x0026), top: B:52:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:53:0x0011, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001a, B:46:0x0020, B:49:0x0026), top: B:52:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:53:0x0011, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001a, B:46:0x0020, B:49:0x0026), top: B:52:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:53:0x0011, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001a, B:46:0x0020, B:49:0x0026), top: B:52:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #0 {all -> 0x0016, blocks: (B:53:0x0011, B:10:0x002c, B:12:0x0030, B:14:0x0034, B:16:0x0038, B:17:0x003a, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001a, B:46:0x0020, B:49:0x0026), top: B:52:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException messageDone$okhttp(okhttp3.internal.connection.Exchange r3, boolean r4, boolean r5, boolean r6, boolean r7, java.io.IOException r8) {
        /*
            r2 = this;
            r3.getClass()
            okhttp3.internal.connection.Exchange r0 = r2.exchange
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Ld
            goto L70
        Ld:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L18
            boolean r0 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L2a
            goto L18
        L16:
            r3 = move-exception
            goto L59
        L18:
            if (r5 == 0) goto L1e
            boolean r0 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L2a
        L1e:
            if (r7 == 0) goto L24
            boolean r0 = r2.socketSinkOpen     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L2a
        L24:
            if (r6 == 0) goto L5b
            boolean r0 = r2.socketSourceOpen     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L5b
        L2a:
            if (r4 == 0) goto L2e
            r2.requestBodyOpen = r3     // Catch: java.lang.Throwable -> L16
        L2e:
            if (r5 == 0) goto L32
            r2.responseBodyOpen = r3     // Catch: java.lang.Throwable -> L16
        L32:
            if (r7 == 0) goto L36
            r2.socketSinkOpen = r3     // Catch: java.lang.Throwable -> L16
        L36:
            if (r6 == 0) goto L3a
            r2.socketSourceOpen = r3     // Catch: java.lang.Throwable -> L16
        L3a:
            boolean r4 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L16
            r5 = 1
            if (r4 != 0) goto L4d
            boolean r4 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L4d
            boolean r4 = r2.socketSinkOpen     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L4d
            boolean r4 = r2.socketSourceOpen     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto L4d
            r4 = r5
            goto L4e
        L4d:
            r4 = r3
        L4e:
            if (r4 == 0) goto L55
            boolean r6 = r2.expectMoreExchanges     // Catch: java.lang.Throwable -> L16
            if (r6 != 0) goto L55
            r3 = r5
        L55:
            r1 = r4
            r4 = r3
            r3 = r1
            goto L5c
        L59:
            monitor-exit(r2)
            throw r3
        L5b:
            r4 = r3
        L5c:
            monitor-exit(r2)
            if (r3 == 0) goto L69
            r3 = 0
            r2.exchange = r3
            okhttp3.internal.connection.RealConnection r3 = r2.connection
            if (r3 == 0) goto L69
            r3.incrementSuccessCount$okhttp()
        L69:
            if (r4 == 0) goto L70
            java.io.IOException r2 = r2.callDone(r8)
            return r2
        L70:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealCall.messageDone$okhttp(okhttp3.internal.connection.Exchange, boolean, boolean, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException noMoreExchanges$okhttp(IOException e) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if (!this.requestBodyOpen && !this.responseBodyOpen && !this.socketSinkOpen) {
                    if (!this.socketSourceOpen) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return callDone(e);
        }
        return e;
    }

    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection = this.connection;
        realConnection.getClass();
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            y61.h(Thread.currentThread().getName(), " MUST hold lock on ", realConnection);
            return null;
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        Iterator<Reference<RealCall>> it = calls.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (sn0.r(it.next().get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            calls.remove(i);
            this.connection = null;
            if (calls.isEmpty()) {
                realConnection.setIdleAtNs(System.nanoTime());
                if (this.connectionPool.connectionBecameIdle(realConnection)) {
                    return realConnection.getJavaNetSocket();
                }
            }
            return null;
        }
        se.p("Check failed.");
        return null;
    }

    @Override // okhttp3.Call
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        RealConnection realConnection;
        Exchange exchange = this.exchange;
        if (exchange != null && exchange.getHasFailure$okhttp()) {
            ExchangeFinder exchangeFinder = this.exchangeFinder;
            exchangeFinder.getClass();
            RoutePlanner routePlanner = exchangeFinder.getRoutePlanner();
            Exchange exchange2 = this.exchange;
            if (exchange2 != null) {
                realConnection = exchange2.getConnection$okhttp();
            } else {
                realConnection = null;
            }
            if (routePlanner.hasNext(realConnection)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // okhttp3.Call
    public <T> T tag(to0 type) {
        type.getClass();
        return (T) fp.D(type).cast(this.tags.get().get(type));
    }

    @Override // okhttp3.Call
    public ea2 timeout() {
        return this.timeout;
    }

    public final void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            exit();
        } else {
            se.p("Check failed.");
        }
    }

    public final void upgradeToSocket() {
        timeoutEarlyExit();
        synchronized (this) {
            if (this.exchange != null) {
                if (!this.socketSinkOpen && !this.socketSourceOpen) {
                    if (!this.requestBodyOpen) {
                        if (this.responseBodyOpen) {
                            this.responseBodyOpen = false;
                            this.socketSinkOpen = true;
                            this.socketSourceOpen = true;
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    @Override // okhttp3.Call
    public <T> T tag(Class<? extends T> type) {
        type.getClass();
        return (T) tag(yl1.a(type));
    }

    @Override // okhttp3.Call
    public <T> T tag(to0 type, de0 computeIfAbsent) {
        type.getClass();
        computeIfAbsent.getClass();
        return (T) TagsKt.computeIfAbsent(this.tags, type, computeIfAbsent);
    }

    @Override // okhttp3.Call
    public <T> T tag(Class<T> type, de0 computeIfAbsent) {
        type.getClass();
        computeIfAbsent.getClass();
        return (T) TagsKt.computeIfAbsent(this.tags, yl1.a(type), computeIfAbsent);
    }
}
