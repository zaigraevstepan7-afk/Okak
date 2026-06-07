package okhttp3;

import defpackage.bf;
import defpackage.bl;
import defpackage.de0;
import defpackage.f00;
import defpackage.fc2;
import defpackage.i32;
import defpackage.l60;
import defpackage.l90;
import defpackage.p32;
import defpackage.qd;
import defpackage.se;
import defpackage.sn0;
import defpackage.wn;
import defpackage.xl1;
import defpackage.yn;
import defpackage.yq1;
import defpackage.yx;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.tls.CertificateChainCleaner;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 *2\u00020\u0001:\u0003+,*B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0016\"\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0017J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lokhttp3/CertificatePinner;", "", "", "Lokhttp3/CertificatePinner$Pin;", "pins", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lod2;", "check", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "check$okhttp", "(Ljava/lang/String;Lde0;)V", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "findMatchingPins", "(Ljava/lang/String;)Ljava/util/List;", "withCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;", "withCertificateChainCleaner", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "Companion", "Pin", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class CertificatePinner {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\f\"\u00020\u000b¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String pattern, String... pins) {
            pattern.getClass();
            pins.getClass();
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final CertificatePinner build() {
            return new CertificatePinner(wn.D0(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hostname", "", "matchesHostname", "(Ljava/lang/String;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "(Ljava/security/cert/X509Certificate;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getPattern", "hashAlgorithm", "getHashAlgorithm", "Lbl;", "hash", "Lbl;", "getHash", "()Lbl;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Pin {
        private final bl hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            str.getClass();
            str2.getClass();
            if ((p32.D(str, "*.", false) && i32.L(str, "*", 1, false, 4) == -1) || ((p32.D(str, "**.", false) && i32.L(str, "*", 2, false, 4) == -1) || i32.L(str, "*", 0, false, 6) == -1)) {
                String canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    this.pattern = canonicalHost;
                    if (p32.D(str2, "sha1/", false)) {
                        this.hashAlgorithm = "sha1";
                        bl blVar = bl.h;
                        bl n = xl1.n(str2.substring(5));
                        if (n != null) {
                            this.hash = n;
                            return;
                        } else {
                            se.h("Invalid pin hash: ".concat(str2));
                            throw null;
                        }
                    }
                    if (p32.D(str2, "sha256/", false)) {
                        this.hashAlgorithm = "sha256";
                        bl blVar2 = bl.h;
                        bl n2 = xl1.n(str2.substring(7));
                        if (n2 != null) {
                            this.hash = n2;
                            return;
                        } else {
                            se.h("Invalid pin hash: ".concat(str2));
                            throw null;
                        }
                    }
                    se.h("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
                    throw null;
                }
                se.h("Invalid pattern: ".concat(str));
                throw null;
            }
            se.e("Unexpected pattern: ".concat(str));
            throw null;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            if (sn0.r(this.pattern, pin.pattern) && sn0.r(this.hashAlgorithm, pin.hashAlgorithm) && sn0.r(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        public final bl getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + l90.d(this.pattern.hashCode() * 31, 31, this.hashAlgorithm);
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            certificate.getClass();
            String str = this.hashAlgorithm;
            if (sn0.r(str, "sha256")) {
                return sn0.r(this.hash, CertificatePinner.INSTANCE.sha256Hash(certificate));
            }
            if (sn0.r(str, "sha1")) {
                return sn0.r(this.hash, CertificatePinner.INSTANCE.sha1Hash(certificate));
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0068 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean matchesHostname(java.lang.String r12) {
            /*
                r11 = this;
                r12.getClass()
                java.lang.String r0 = r11.pattern
                java.lang.String r1 = "**."
                r2 = 0
                boolean r0 = defpackage.p32.D(r0, r1, r2)
                java.lang.String r1 = r11.pattern
                r3 = 46
                r4 = 1
                if (r0 == 0) goto L39
                int r0 = r1.length()
                int r9 = r0 + (-3)
                int r0 = r12.length()
                int r0 = r0 - r9
                int r1 = r12.length()
                int r6 = r1 - r9
                java.lang.String r7 = r11.pattern
                r8 = 3
                r10 = 0
                r5 = r12
                boolean r11 = defpackage.p32.z(r5, r6, r7, r8, r9, r10)
                if (r11 == 0) goto L69
                if (r0 == 0) goto L68
                int r0 = r0 - r4
                char r11 = r5.charAt(r0)
                if (r11 != r3) goto L69
                goto L68
            L39:
                r5 = r12
                java.lang.String r12 = "*."
                boolean r12 = defpackage.p32.D(r1, r12, r2)
                java.lang.String r0 = r11.pattern
                if (r12 == 0) goto L6a
                int r12 = r0.length()
                int r9 = r12 + (-1)
                int r12 = r5.length()
                int r12 = r12 - r9
                int r0 = r5.length()
                int r6 = r0 - r9
                java.lang.String r7 = r11.pattern
                r8 = 1
                r10 = 0
                boolean r11 = defpackage.p32.z(r5, r6, r7, r8, r9, r10)
                if (r11 == 0) goto L69
                int r12 = r12 - r4
                r11 = 4
                int r11 = defpackage.i32.P(r5, r3, r12, r11)
                r12 = -1
                if (r11 != r12) goto L69
            L68:
                return r4
            L69:
                return r2
            L6a:
                boolean r11 = r5.equals(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.matchesHostname(java.lang.String):boolean");
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.a();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        set.getClass();
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List check$lambda$0(CertificatePinner certificatePinner, List list, String str) {
        List<Certificate> clean;
        CertificateChainCleaner certificateChainCleaner = certificatePinner.certificateChainCleaner;
        if (certificateChainCleaner != null && (clean = certificateChainCleaner.clean(list, str)) != null) {
            list = clean;
        }
        ArrayList arrayList = new ArrayList(yn.a0(list, 10));
        for (Certificate certificate : list) {
            certificate.getClass();
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public static final String pin(Certificate certificate) {
        return INSTANCE.pin(certificate);
    }

    public static final bl sha1Hash(X509Certificate x509Certificate) {
        return INSTANCE.sha1Hash(x509Certificate);
    }

    public static final bl sha256Hash(X509Certificate x509Certificate) {
        return INSTANCE.sha256Hash(x509Certificate);
    }

    public final void check(String hostname, List<? extends Certificate> peerCertificates) {
        hostname.getClass();
        peerCertificates.getClass();
        check$okhttp(hostname, new qd(this, peerCertificates, hostname, 4));
    }

    public final void check$okhttp(String hostname, de0 cleanedPeerCertificatesFn) {
        hostname.getClass();
        cleanedPeerCertificatesFn.getClass();
        List<Pin> findMatchingPins = findMatchingPins(hostname);
        if (!findMatchingPins.isEmpty()) {
            List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
            for (X509Certificate x509Certificate : list) {
                bl blVar = null;
                bl blVar2 = null;
                for (Pin pin : findMatchingPins) {
                    String hashAlgorithm = pin.getHashAlgorithm();
                    if (sn0.r(hashAlgorithm, "sha256")) {
                        if (blVar == null) {
                            blVar = INSTANCE.sha256Hash(x509Certificate);
                        }
                        if (sn0.r(pin.getHash(), blVar)) {
                            return;
                        }
                    } else if (sn0.r(hashAlgorithm, "sha1")) {
                        if (blVar2 == null) {
                            blVar2 = INSTANCE.sha1Hash(x509Certificate);
                        }
                        if (sn0.r(pin.getHash(), blVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(INSTANCE.pin(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(hostname);
            sb.append(":");
            for (Pin pin2 : findMatchingPins) {
                sb.append("\n    ");
                sb.append(pin2);
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    public boolean equals(Object other) {
        if (other instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) other;
            if (sn0.r(certificatePinner.pins, this.pins) && sn0.r(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String hostname) {
        hostname.getClass();
        List list = l60.e;
        for (Object obj : this.pins) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                fc2.q(list).add(obj);
            }
        }
        return list;
    }

    /* renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            i = certificateChainCleaner.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        certificateChainCleaner.getClass();
        if (sn0.r(this.certificateChainCleaner, certificateChainCleaner)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner);
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "Lbl;", "sha1Hash", "(Ljava/security/cert/X509Certificate;)Lbl;", "sha256Hash", "Ljava/security/cert/Certificate;", "certificate", "", "pin", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            certificate.getClass();
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).a();
            }
            se.h("Certificate pinning requires X509 certificates");
            return null;
        }

        public final bl sha1Hash(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            bl blVar = bl.h;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            return xl1.q(encoded).c("SHA-1");
        }

        public final bl sha256Hash(X509Certificate x509Certificate) {
            x509Certificate.getClass();
            bl blVar = bl.h;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            return xl1.q(encoded).c("SHA-256");
        }

        private Companion() {
        }
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i, yx yxVar) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner);
    }

    @f00
    public final void check(String hostname, Certificate... peerCertificates) {
        hostname.getClass();
        peerCertificates.getClass();
        check(hostname, bf.e0(peerCertificates));
    }
}
