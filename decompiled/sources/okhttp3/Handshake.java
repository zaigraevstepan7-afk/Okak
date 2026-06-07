package okhttp3;

import defpackage.b52;
import defpackage.de0;
import defpackage.f00;
import defpackage.l60;
import defpackage.og0;
import defpackage.rr0;
import defpackage.se;
import defpackage.sn0;
import defpackage.wn;
import defpackage.yd;
import defpackage.yn;
import defpackage.yq1;
import defpackage.yx;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal._UtilJvmKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0001-B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\u0005\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b\b\u0010\u0012R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010,\u001a\u00020\"*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016¨\u0006."}, d2 = {"Lokhttp3/Handshake;", "", "Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lde0;)V", "-deprecated_tlsVersion", "()Lokhttp3/TlsVersion;", "-deprecated_cipherSuite", "()Lokhttp3/CipherSuite;", "-deprecated_peerCertificates", "()Ljava/util/List;", "peerCertificates", "Ljava/security/Principal;", "-deprecated_peerPrincipal", "()Ljava/security/Principal;", "peerPrincipal", "-deprecated_localCertificates", "-deprecated_localPrincipal", "localPrincipal", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lokhttp3/TlsVersion;", "Lokhttp3/CipherSuite;", "Ljava/util/List;", "peerCertificates$delegate", "Lrr0;", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Handshake {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;

    /* renamed from: peerCertificates$delegate, reason: from kotlin metadata */
    private final rr0 peerCertificates;
    private final TlsVersion tlsVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, de0 de0Var) {
        tlsVersion.getClass();
        cipherSuite.getClass();
        list.getClass();
        de0Var.getClass();
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates = new b52(new og0(de0Var, 0));
    }

    public static final Handshake get(SSLSession sSLSession) {
        return INSTANCE.get(sSLSession);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    public static final List peerCertificates_delegate$lambda$0(de0 de0Var) {
        try {
            return (List) de0Var.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return l60.e;
        }
    }

    @f00
    /* renamed from: -deprecated_cipherSuite, reason: from getter */
    public final CipherSuite getCipherSuite() {
        return this.cipherSuite;
    }

    @f00
    /* renamed from: -deprecated_localCertificates */
    public final List<Certificate> m174deprecated_localCertificates() {
        return this.localCertificates;
    }

    @f00
    /* renamed from: -deprecated_localPrincipal */
    public final Principal m175deprecated_localPrincipal() {
        return localPrincipal();
    }

    @f00
    /* renamed from: -deprecated_peerCertificates */
    public final List<Certificate> m176deprecated_peerCertificates() {
        return peerCertificates();
    }

    @f00
    /* renamed from: -deprecated_peerPrincipal */
    public final Principal m177deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @f00
    /* renamed from: -deprecated_tlsVersion, reason: from getter */
    public final TlsVersion getTlsVersion() {
        return this.tlsVersion;
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(Object other) {
        if (other instanceof Handshake) {
            Handshake handshake = (Handshake) other;
            if (handshake.tlsVersion == this.tlsVersion && sn0.r(handshake.cipherSuite, this.cipherSuite) && sn0.r(handshake.peerCertificates(), peerCertificates()) && sn0.r(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final Principal localPrincipal() {
        X509Certificate x509Certificate;
        Object h0 = wn.h0(this.localCertificates);
        if (h0 instanceof X509Certificate) {
            x509Certificate = (X509Certificate) h0;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates.getValue();
    }

    public final Principal peerPrincipal() {
        X509Certificate x509Certificate;
        Object h0 = wn.h0(peerCertificates());
        if (h0 instanceof X509Certificate) {
            x509Certificate = (X509Certificate) h0;
        } else {
            x509Certificate = null;
        }
        if (x509Certificate == null) {
            return null;
        }
        return x509Certificate.getSubjectX500Principal();
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public String toString() {
        List<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(yn.a0(peerCertificates, 10));
        Iterator<T> it = peerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(yn.a0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\tJ4\u0010\u0007\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¨\u0006\u0012"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "<init>", "()V", "handshake", "Lokhttp3/Handshake;", "Ljavax/net/ssl/SSLSession;", "get", "sslSession", "-deprecated_get", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "peerCertificates", "", "Ljava/security/cert/Certificate;", "localCertificates", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        @f00
        /* renamed from: -deprecated_get */
        public final Handshake m179deprecated_get(SSLSession sslSession) {
            sslSession.getClass();
            return get(sslSession);
        }

        public final Handshake get(SSLSession sSLSession) {
            List list;
            sSLSession.getClass();
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") && !cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                    CipherSuite forJavaName = CipherSuite.INSTANCE.forJavaName(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!"NONE".equals(protocol)) {
                            TlsVersion forJavaName2 = TlsVersion.INSTANCE.forJavaName(protocol);
                            try {
                                list = _UtilJvmKt.toImmutableList(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                list = l60.e;
                            }
                            return new Handshake(forJavaName2, forJavaName, _UtilJvmKt.toImmutableList(sSLSession.getLocalCertificates()), new yd(3, list));
                        }
                        se.w("tlsVersion == NONE");
                        return null;
                    }
                    se.p("tlsVersion == null");
                    return null;
                }
                se.w("cipherSuite == ".concat(cipherSuite));
                return null;
            }
            se.p("cipherSuite == null");
            return null;
        }

        private Companion() {
        }

        public static final List get$lambda$0(List list) {
            return list;
        }

        public static final List handshake$lambda$2(List list) {
            return list;
        }

        public final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            tlsVersion.getClass();
            cipherSuite.getClass();
            peerCertificates.getClass();
            localCertificates.getClass();
            return new Handshake(tlsVersion, cipherSuite, _UtilJvmKt.toImmutableList(localCertificates), new yd(2, _UtilJvmKt.toImmutableList(peerCertificates)));
        }
    }

    public static final Handshake get(TlsVersion tlsVersion, CipherSuite cipherSuite, List<? extends Certificate> list, List<? extends Certificate> list2) {
        return INSTANCE.get(tlsVersion, cipherSuite, list, list2);
    }
}
