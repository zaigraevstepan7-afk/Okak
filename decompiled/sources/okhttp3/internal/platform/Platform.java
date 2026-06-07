package okhttp3.internal.platform;

import defpackage.l60;
import defpackage.se;
import defpackage.y61;
import defpackage.yn;
import defpackage.yq1;
import defpackage.yx;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SNIServerName;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010&\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J-\u0010,\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020$2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0004\u0018\u00010\u00012\u0006\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u00103J!\u00105\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020:2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0004H\u0016¢\u0006\u0004\b?\u0010\u0006¨\u0006A"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "<init>", "()V", "", "getPrefix", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "platformTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;)Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/Protocol;", "protocols", "Lod2;", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "afterHandshake", "(Ljavax/net/ssl/SSLSocket;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "getHandshakeServerNames", "(Ljavax/net/ssl/SSLSocket;)Ljava/util/List;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "connectSocket", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "message", "level", "", "t", "log", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "", "isCleartextTrafficPermitted", "(Ljava/lang/String;)Z", "closer", "getStackTraceForCloseable", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "logCloseableLeak", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/TrustRootIndex;", "newSslSocketFactory", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public class Platform {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final int INFO = 4;
    public static final int WARN = 5;
    private static final Logger logger;
    private static volatile Platform platform;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        platform = companion.findPlatform();
        logger = Logger.getLogger(OkHttpClient.class.getName());
    }

    public static final Platform get() {
        return INSTANCE.get();
    }

    public static /* synthetic */ void log$default(Platform platform2, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            platform2.log(str, i, th);
            return;
        }
        se.v("Super calls with default arguments not supported in this target, function: log");
    }

    public void afterHandshake(SSLSocket sslSocket) {
        sslSocket.getClass();
    }

    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager trustManager) {
        trustManager.getClass();
        return new BasicCertificateChainCleaner(buildTrustRootIndex(trustManager));
    }

    public TrustRootIndex buildTrustRootIndex(X509TrustManager trustManager) {
        trustManager.getClass();
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new BasicTrustRootIndex((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void configureTlsExtensions(SSLSocket sslSocket, String hostname, List<Protocol> protocols) {
        sslSocket.getClass();
        protocols.getClass();
    }

    public void connectSocket(Socket socket, InetSocketAddress address, int connectTimeout) {
        socket.getClass();
        address.getClass();
        socket.connect(address, connectTimeout);
    }

    public List<String> getHandshakeServerNames(SSLSocket sslSocket) {
        ExtendedSSLSession extendedSSLSession;
        SNIHostName sNIHostName;
        String str;
        sslSocket.getClass();
        SSLSession session = sslSocket.getSession();
        if (session instanceof ExtendedSSLSession) {
            extendedSSLSession = (ExtendedSSLSession) session;
        } else {
            extendedSSLSession = null;
        }
        l60 l60Var = l60.e;
        if (extendedSSLSession == null) {
            return l60Var;
        }
        try {
            List<SNIServerName> requestedServerNames = extendedSSLSession.getRequestedServerNames();
            requestedServerNames.getClass();
            ArrayList arrayList = new ArrayList();
            for (SNIServerName sNIServerName : requestedServerNames) {
                if (sNIServerName instanceof SNIHostName) {
                    sNIHostName = (SNIHostName) sNIServerName;
                } else {
                    sNIHostName = null;
                }
                if (sNIHostName != null) {
                    str = sNIHostName.getAsciiName();
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (UnsupportedOperationException unused) {
            return l60Var;
        }
    }

    public final String getPrefix() {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sslSocket) {
        sslSocket.getClass();
        return null;
    }

    public Object getStackTraceForCloseable(String closer) {
        closer.getClass();
        if (logger.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean isCleartextTrafficPermitted(String hostname) {
        hostname.getClass();
        return true;
    }

    public void log(String message, int level, Throwable t) {
        Level level2;
        message.getClass();
        if (level == 5) {
            level2 = Level.WARNING;
        } else {
            level2 = Level.INFO;
        }
        logger.log(level2, message, t);
    }

    public void logCloseableLeak(String message, Object stackTrace) {
        message.getClass();
        if (stackTrace == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        log(message, 5, (Throwable) stackTrace);
    }

    public SSLContext newSSLContext() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }

    public SSLSocketFactory newSslSocketFactory(X509TrustManager trustManager) {
        trustManager.getClass();
        try {
            SSLContext newSSLContext = newSSLContext();
            newSSLContext.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = newSSLContext.getSocketFactory();
            socketFactory.getClass();
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager platformTrustManager() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        trustManagers.getClass();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                trustManager.getClass();
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        arrays.getClass();
        y61.f("Unexpected default trust managers: ".concat(arrays));
        return null;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public X509TrustManager trustManager(SSLSocketFactory sslSocketFactory) {
        sslSocketFactory.getClass();
        try {
            Object readFieldOrNull = _UtilJvmKt.readFieldOrNull(sslSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (readFieldOrNull == null) {
                return null;
            }
            return (X509TrustManager) _UtilJvmKt.readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (!e.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
                throw e;
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001c\u0010\u001f\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lokhttp3/internal/platform/Platform$Companion;", "", "<init>", "()V", "Lokhttp3/internal/platform/Platform;", "findPlatform", "()Lokhttp3/internal/platform/Platform;", "get", "platform", "Lod2;", "resetForTests", "(Lokhttp3/internal/platform/Platform;)V", "", "Lokhttp3/Protocol;", "protocols", "", "alpnProtocolNames", "(Ljava/util/List;)Ljava/util/List;", "", "concatLengthPrefixed", "(Ljava/util/List;)[B", "", "isAndroid", "()Z", "Lokhttp3/internal/platform/Platform;", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Platform findPlatform() {
            return PlatformRegistry.INSTANCE.findPlatform();
        }

        public static /* synthetic */ void resetForTests$default(Companion companion, Platform platform, int i, Object obj) {
            if ((i & 1) != 0) {
                platform = companion.findPlatform();
            }
            companion.resetForTests(platform);
        }

        public final List<String> alpnProtocolNames(List<? extends Protocol> protocols) {
            protocols.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(yn.a0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [hk, java.lang.Object] */
        public final byte[] concatLengthPrefixed(List<? extends Protocol> protocols) {
            protocols.getClass();
            ?? obj = new Object();
            for (String str : alpnProtocolNames(protocols)) {
                obj.Q(str.length());
                obj.Y(str);
            }
            return obj.t(obj.f);
        }

        public final Platform get() {
            return Platform.platform;
        }

        public final boolean isAndroid() {
            return PlatformRegistry.INSTANCE.isAndroid();
        }

        public final void resetForTests(Platform platform) {
            platform.getClass();
            Platform.platform = platform;
            PublicSuffixDatabase.INSTANCE.resetForTests$okhttp();
        }

        private Companion() {
        }
    }
}
