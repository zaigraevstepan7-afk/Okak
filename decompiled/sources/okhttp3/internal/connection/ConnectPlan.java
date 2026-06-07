package okhttp3.internal.connection;

import defpackage.ea2;
import defpackage.j32;
import defpackage.qd;
import defpackage.se;
import defpackage.sn0;
import defpackage.v3;
import defpackage.yn;
import defpackage.yq1;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.ConnectionSpec;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RoutePlanner;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0001iB\u0093\u0001\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0011\u0010)\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010-J\u000f\u00100\u001a\u00020+H\u0000¢\u0006\u0004\b/\u0010-J%\u00104\u001a\u00020\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00020%0\u00152\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b2\u00103J'\u00106\u001a\u0004\u0018\u00010\u00002\f\u00101\u001a\b\u0012\u0004\u0012\u00020%0\u00152\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b5\u00103J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J!\u0010<\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020 H\u0016¢\u0006\u0004\b>\u0010\"J\u000f\u0010?\u001a\u00020 H\u0016¢\u0006\u0004\b?\u0010\"J\u000f\u0010@\u001a\u00020\u0001H\u0016¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020 ¢\u0006\u0004\bB\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010CR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010DR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010ER\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ER\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ER\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010FR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010GR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010HR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bJ\u0010KR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010\u0017\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010ER\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010OR\u001a\u0010\u001a\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bP\u0010QR\u001a\u0010\u001b\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010F\u001a\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010FR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010X\u001a\u0004\u0018\u00010U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010W\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010a\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010f\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010h\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010S¨\u0006j"}, d2 = {"Lokhttp3/internal/connection/ConnectPlan;", "Lokhttp3/internal/connection/RoutePlanner$Plan;", "Lokhttp3/internal/http/ExchangeCodec$Carrier;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "", "readTimeoutMillis", "writeTimeoutMillis", "socketConnectTimeoutMillis", "socketReadTimeoutMillis", "pingIntervalMillis", "", "retryOnConnectionFailure", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/internal/connection/RealRoutePlanner;", "routePlanner", "Lokhttp3/Route;", "route", "", "routes", "attempt", "Lokhttp3/Request;", "tunnelRequest", "connectionSpecIndex", "isTlsFallback", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZLokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZ)V", "copy", "(ILokhttp3/Request;IZ)Lokhttp3/internal/connection/ConnectPlan;", "Lod2;", "connectSocket", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "Lokhttp3/ConnectionSpec;", "connectionSpec", "connectTls", "(Ljavax/net/ssl/SSLSocket;Lokhttp3/ConnectionSpec;)V", "createTunnel", "()Lokhttp3/Request;", "Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTcp", "()Lokhttp3/internal/connection/RoutePlanner$ConnectResult;", "connectTlsEtc", "connectTunnel$okhttp", "connectTunnel", "connectionSpecs", "planWithCurrentOrInitialConnectionSpec$okhttp", "(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/connection/ConnectPlan;", "planWithCurrentOrInitialConnectionSpec", "nextConnectionSpec$okhttp", "nextConnectionSpec", "Lokhttp3/internal/connection/RealConnection;", "handleSuccess", "()Lokhttp3/internal/connection/RealConnection;", "Ljava/io/IOException;", "e", "trackFailure", "(Lokhttp3/internal/connection/RealCall;Ljava/io/IOException;)V", "noNewExchanges", "cancel", "retry", "()Lokhttp3/internal/connection/RoutePlanner$Plan;", "closeQuietly", "Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/connection/RealConnectionPool;", "I", "Z", "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/internal/connection/RealRoutePlanner;", "Lokhttp3/Route;", "getRoute", "()Lokhttp3/Route;", "Ljava/util/List;", "getRoutes$okhttp", "()Ljava/util/List;", "Lokhttp3/Request;", "getConnectionSpecIndex$okhttp", "()I", "isTlsFallback$okhttp", "()Z", "canceled", "Ljava/net/Socket;", "rawSocket", "Ljava/net/Socket;", "javaNetSocket", "getJavaNetSocket$okhttp", "()Ljava/net/Socket;", "setJavaNetSocket$okhttp", "(Ljava/net/Socket;)V", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "Lokhttp3/internal/connection/BufferedSocket;", "socket", "Lokhttp3/internal/connection/BufferedSocket;", "connection", "Lokhttp3/internal/connection/RealConnection;", "isReady", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ConnectPlan implements RoutePlanner.Plan, ExchangeCodec.Carrier {
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private final int attempt;
    private final RealCall call;
    private volatile boolean canceled;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final int connectionSpecIndex;
    private Handshake handshake;
    private final boolean isTlsFallback;
    private Socket javaNetSocket;
    private final int pingIntervalMillis;
    private Protocol protocol;
    private Socket rawSocket;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final Route route;
    private final RealRoutePlanner routePlanner;
    private final List<Route> routes;
    private BufferedSocket socket;
    private final int socketConnectTimeoutMillis;
    private final int socketReadTimeoutMillis;
    private final TaskRunner taskRunner;
    private final Request tunnelRequest;
    private final int writeTimeoutMillis;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConnectPlan(TaskRunner taskRunner, RealConnectionPool realConnectionPool, int i, int i2, int i3, int i4, int i5, boolean z, RealCall realCall, RealRoutePlanner realRoutePlanner, Route route, List<Route> list, int i6, Request request, int i7, boolean z2) {
        taskRunner.getClass();
        realConnectionPool.getClass();
        realCall.getClass();
        realRoutePlanner.getClass();
        route.getClass();
        this.taskRunner = taskRunner;
        this.connectionPool = realConnectionPool;
        this.readTimeoutMillis = i;
        this.writeTimeoutMillis = i2;
        this.socketConnectTimeoutMillis = i3;
        this.socketReadTimeoutMillis = i4;
        this.pingIntervalMillis = i5;
        this.retryOnConnectionFailure = z;
        this.call = realCall;
        this.routePlanner = realRoutePlanner;
        this.route = route;
        this.routes = list;
        this.attempt = i6;
        this.tunnelRequest = request;
        this.connectionSpecIndex = i7;
        this.isTlsFallback = z2;
    }

    public static /* synthetic */ List a(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        return connectTls$lambda$0(certificatePinner, handshake, address);
    }

    public static /* synthetic */ List b(Handshake handshake) {
        return connectTls$lambda$1(handshake);
    }

    private final void connectSocket() {
        int i;
        Socket createSocket;
        Proxy.Type type = getRoute().proxy().type();
        if (type == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i != 1 && i != 2) {
            createSocket = new Socket(getRoute().proxy());
        } else {
            createSocket = getRoute().address().socketFactory().createSocket();
            createSocket.getClass();
        }
        this.rawSocket = createSocket;
        if (!this.canceled) {
            createSocket.setSoTimeout(this.socketReadTimeoutMillis);
            try {
                Platform.INSTANCE.get().connectSocket(createSocket, getRoute().socketAddress(), this.socketConnectTimeoutMillis);
                try {
                    this.socket = BufferedSocketKt.asBufferedSocket(createSocket);
                    return;
                } catch (NullPointerException e) {
                    if (!sn0.r(e.getMessage(), NPE_THROW_WITH_NULL)) {
                        return;
                    } else {
                        throw new IOException(e);
                    }
                }
            } catch (ConnectException e2) {
                ConnectException connectException = new ConnectException("Failed to connect to " + getRoute().socketAddress());
                connectException.initCause(e2);
                throw connectException;
            }
        }
        se.w("canceled");
    }

    private final void connectTls(SSLSocket sslSocket, ConnectionSpec connectionSpec) {
        String str;
        Protocol protocol;
        Address address = getRoute().address();
        try {
            if (connectionSpec.supportsTlsExtensions()) {
                Platform.INSTANCE.get().configureTlsExtensions(sslSocket, address.url().host(), address.protocols());
            }
            sslSocket.startHandshake();
            SSLSession session = sslSocket.getSession();
            Handshake.Companion companion = Handshake.INSTANCE;
            session.getClass();
            Handshake handshake = companion.get(session);
            HostnameVerifier hostnameVerifier = address.hostnameVerifier();
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(address.url().host(), session)) {
                List<Certificate> peerCertificates = handshake.peerCertificates();
                if (!peerCertificates.isEmpty()) {
                    Certificate certificate = peerCertificates.get(0);
                    certificate.getClass();
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    throw new SSLPeerUnverifiedException(j32.t("\n            |Hostname " + address.url().host() + " not verified:\n            |    certificate: " + CertificatePinner.INSTANCE.pin(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + OkHostnameVerifier.INSTANCE.allSubjectAltNames(x509Certificate) + "\n            "));
                }
                throw new SSLPeerUnverifiedException("Hostname " + address.url().host() + " not verified (no certificates)");
            }
            CertificatePinner certificatePinner = address.certificatePinner();
            certificatePinner.getClass();
            Handshake handshake2 = new Handshake(handshake.tlsVersion(), handshake.cipherSuite(), handshake.localCertificates(), new qd(certificatePinner, handshake, address, 6));
            this.handshake = handshake2;
            certificatePinner.check$okhttp(address.url().host(), new v3(handshake2, 5));
            if (connectionSpec.supportsTlsExtensions()) {
                str = Platform.INSTANCE.get().getSelectedProtocol(sslSocket);
            } else {
                str = null;
            }
            this.javaNetSocket = sslSocket;
            this.socket = BufferedSocketKt.asBufferedSocket(sslSocket);
            if (str != null) {
                protocol = Protocol.INSTANCE.get(str);
            } else {
                protocol = Protocol.HTTP_1_1;
            }
            this.protocol = protocol;
            Platform.INSTANCE.get().afterHandshake(sslSocket);
        } catch (Throwable th) {
            Platform.INSTANCE.get().afterHandshake(sslSocket);
            _UtilJvmKt.closeQuietly(sslSocket);
            throw th;
        }
    }

    public static final List connectTls$lambda$0(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        CertificateChainCleaner certificateChainCleaner = certificatePinner.getCertificateChainCleaner();
        certificateChainCleaner.getClass();
        return certificateChainCleaner.clean(handshake.peerCertificates(), address.url().host());
    }

    public static final List connectTls$lambda$1(Handshake handshake) {
        List<Certificate> peerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(yn.a0(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            certificate.getClass();
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    private final ConnectPlan copy(int attempt, Request tunnelRequest, int connectionSpecIndex, boolean isTlsFallback) {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, getRoute(), this.routes, attempt, tunnelRequest, connectionSpecIndex, isTlsFallback);
    }

    public static /* synthetic */ ConnectPlan copy$default(ConnectPlan connectPlan, int i, Request request, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = connectPlan.attempt;
        }
        if ((i3 & 2) != 0) {
            request = connectPlan.tunnelRequest;
        }
        if ((i3 & 4) != 0) {
            i2 = connectPlan.connectionSpecIndex;
        }
        if ((i3 & 8) != 0) {
            z = connectPlan.isTlsFallback;
        }
        return connectPlan.copy(i, request, i2, z);
    }

    private final Request createTunnel() {
        Request request = this.tunnelRequest;
        request.getClass();
        String str = "CONNECT " + _UtilJvmKt.toHostHeader(getRoute().address().url(), true) + " HTTP/1.1";
        while (true) {
            BufferedSocket bufferedSocket = this.socket;
            if (bufferedSocket != null) {
                Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec(null, this, bufferedSocket);
                BufferedSocket bufferedSocket2 = this.socket;
                if (bufferedSocket2 != null) {
                    ea2 timeout = bufferedSocket2.getSource().timeout();
                    long j = this.readTimeoutMillis;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    timeout.timeout(j, timeUnit);
                    BufferedSocket bufferedSocket3 = this.socket;
                    if (bufferedSocket3 != null) {
                        bufferedSocket3.getSink().timeout().timeout(this.writeTimeoutMillis, timeUnit);
                        http1ExchangeCodec.writeRequest(request.headers(), str);
                        http1ExchangeCodec.finishRequest();
                        Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
                        readResponseHeaders.getClass();
                        Response build = readResponseHeaders.request(request).build();
                        http1ExchangeCodec.skipConnectBody(build);
                        int code = build.code();
                        if (code != 200) {
                            if (code == 407) {
                                Request authenticate = getRoute().address().proxyAuthenticator().authenticate(getRoute(), build);
                                if (authenticate != null) {
                                    if ("close".equalsIgnoreCase(Response.header$default(build, "Connection", null, 2, null))) {
                                        return authenticate;
                                    }
                                    request = authenticate;
                                } else {
                                    se.w("Failed to authenticate with proxy");
                                    return null;
                                }
                            } else {
                                se.n(build.code(), "Unexpected response code for CONNECT: ");
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        sn0.V("socket");
                        throw null;
                    }
                } else {
                    sn0.V("socket");
                    throw null;
                }
            } else {
                sn0.V("socket");
                throw null;
            }
        }
        return null;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan, okhttp3.internal.http.ExchangeCodec.Carrier
    /* renamed from: cancel */
    public void mo273cancel() {
        this.canceled = true;
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    public final void closeQuietly() {
        Socket socket = this.javaNetSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTcp */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.internal.connection.RoutePlanner.ConnectResult getResult() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ConnectPlan.getResult():okhttp3.internal.connection.RoutePlanner$ConnectResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01d6  */
    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTlsEtc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.internal.connection.RoutePlanner.ConnectResult mo278connectTlsEtc() {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ConnectPlan.mo278connectTlsEtc():okhttp3.internal.connection.RoutePlanner$ConnectResult");
    }

    public final RoutePlanner.ConnectResult connectTunnel$okhttp() {
        Request createTunnel = createTunnel();
        if (createTunnel == null) {
            return new RoutePlanner.ConnectResult(this, null, null, 6, null);
        }
        Socket socket = this.rawSocket;
        if (socket != null) {
            _UtilJvmKt.closeQuietly(socket);
        }
        int i = this.attempt + 1;
        if (i < 21) {
            this.call.getEventListener().connectEnd(this.call, getRoute().socketAddress(), getRoute().proxy(), null);
            return new RoutePlanner.ConnectResult(this, copy$default(this, i, createTunnel, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.call.getEventListener().connectFailed(this.call, getRoute().socketAddress(), getRoute().proxy(), null, protocolException);
        this.connectionPool.getConnectionListener().connectFailed(getRoute(), this.call, protocolException);
        return new RoutePlanner.ConnectResult(this, null, protocolException, 2, null);
    }

    /* renamed from: getConnectionSpecIndex$okhttp, reason: from getter */
    public final int getConnectionSpecIndex() {
        return this.connectionSpecIndex;
    }

    /* renamed from: getJavaNetSocket$okhttp, reason: from getter */
    public final Socket getJavaNetSocket() {
        return this.javaNetSocket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public Route getRoute() {
        return this.route;
    }

    public final List<Route> getRoutes$okhttp() {
        return this.routes;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: handleSuccess */
    public RealConnection mo274handleSuccess() {
        this.call.getClient().getRouteDatabase().connected(getRoute());
        RealConnection realConnection = this.connection;
        realConnection.getClass();
        realConnection.getConnectionListener().connectEnd(realConnection, getRoute(), this.call);
        ReusePlan planReusePooledConnection$okhttp = this.routePlanner.planReusePooledConnection$okhttp(this, this.routes);
        if (planReusePooledConnection$okhttp != null) {
            return planReusePooledConnection$okhttp.getConnection();
        }
        synchronized (realConnection) {
            this.connectionPool.put(realConnection);
            this.call.acquireConnectionNoEvents(realConnection);
        }
        this.call.getEventListener().connectionAcquired(this.call, realConnection);
        realConnection.getConnectionListener().connectionAcquired(realConnection, this.call);
        return realConnection;
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: isReady */
    public boolean getIsReady() {
        if (this.protocol != null) {
            return true;
        }
        return false;
    }

    /* renamed from: isTlsFallback$okhttp, reason: from getter */
    public final boolean getIsTlsFallback() {
        return this.isTlsFallback;
    }

    public final ConnectPlan nextConnectionSpec$okhttp(List<ConnectionSpec> connectionSpecs, SSLSocket sslSocket) {
        connectionSpecs.getClass();
        sslSocket.getClass();
        boolean z = true;
        int i = this.connectionSpecIndex + 1;
        int size = connectionSpecs.size();
        for (int i2 = i; i2 < size; i2++) {
            if (connectionSpecs.get(i2).isCompatible(sslSocket)) {
                if (this.connectionSpecIndex == -1) {
                    z = false;
                }
                return copy$default(this, 0, null, i2, z, 3, null);
            }
        }
        return null;
    }

    public final ConnectPlan planWithCurrentOrInitialConnectionSpec$okhttp(List<ConnectionSpec> connectionSpecs, SSLSocket sslSocket) {
        connectionSpecs.getClass();
        sslSocket.getClass();
        if (this.connectionSpecIndex != -1) {
            return this;
        }
        ConnectPlan nextConnectionSpec$okhttp = nextConnectionSpec$okhttp(connectionSpecs, sslSocket);
        if (nextConnectionSpec$okhttp != null) {
            return nextConnectionSpec$okhttp;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isTlsFallback);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: retry */
    public RoutePlanner.Plan mo275retry() {
        return new ConnectPlan(this.taskRunner, this.connectionPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.socketConnectTimeoutMillis, this.socketReadTimeoutMillis, this.pingIntervalMillis, this.retryOnConnectionFailure, this.call, this.routePlanner, getRoute(), this.routes, this.attempt, this.tunnelRequest, this.connectionSpecIndex, this.isTlsFallback);
    }

    public final void setJavaNetSocket$okhttp(Socket socket) {
        this.javaNetSocket = socket;
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void trackFailure(RealCall call, IOException e) {
        call.getClass();
    }

    @Override // okhttp3.internal.http.ExchangeCodec.Carrier
    public void noNewExchanges() {
    }
}
