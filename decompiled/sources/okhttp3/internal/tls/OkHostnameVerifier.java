package okhttp3.internal.tls;

import defpackage.i32;
import defpackage.l60;
import defpackage.l90;
import defpackage.p32;
import defpackage.se;
import defpackage.sn0;
import defpackage.wn;
import defpackage.yq1;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import okhttp3.internal._HostnamesCommonKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\f\u0010\u0013\u001a\u00020\n*\u00020\nH\u0002J\f\u0010\u0014\u001a\u00020\b*\u00020\nH\u0002J\u001c\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0002J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "verify", "", "host", "", "session", "Ljavax/net/ssl/SSLSession;", "certificate", "Ljava/security/cert/X509Certificate;", "verifyIpAddress", "ipAddress", "verifyHostname", "hostname", "asciiToLowercase", "isAscii", "pattern", "allSubjectAltNames", "", "getSubjectAltNames", "type", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            return lowerCase;
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate certificate, int type) {
        Object obj;
        l60 l60Var = l60.e;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return l60Var;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && sn0.r(list.get(0), Integer.valueOf(type)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return l60Var;
        }
    }

    private final boolean isAscii(String str) {
        long j;
        char c;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j2 = 0;
                int i = 0;
                while (i < length2) {
                    char charAt = str.charAt(i);
                    if (charAt < 128) {
                        j2++;
                    } else {
                        if (charAt < 2048) {
                            j = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i2 = i + 1;
                            if (i2 < length2) {
                                c = str.charAt(i2);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j2 += 4;
                                i += 2;
                            } else {
                                j2++;
                                i = i2;
                            }
                        } else {
                            j = 3;
                        }
                        j2 += j;
                    }
                    i++;
                }
                if (length != ((int) j2)) {
                    return false;
                }
                return true;
            }
            se.l(l90.q("endIndex > string.length: ", length2, " > "), str.length());
            return false;
        }
        se.e(l90.j("endIndex < beginIndex: ", length2, " < ", 0));
        return false;
    }

    private final boolean verifyHostname(String hostname, String pattern) {
        int length;
        if (hostname != null && hostname.length() != 0 && !p32.D(hostname, ".", false) && !p32.w(hostname, "..", false) && pattern != null && pattern.length() != 0 && !p32.D(pattern, ".", false) && !p32.w(pattern, "..", false)) {
            if (!p32.w(hostname, ".", false)) {
                hostname = hostname.concat(".");
            }
            if (!p32.w(pattern, ".", false)) {
                pattern = pattern.concat(".");
            }
            String asciiToLowercase = asciiToLowercase(pattern);
            if (!i32.G(asciiToLowercase, "*", false)) {
                return hostname.equals(asciiToLowercase);
            }
            if (p32.D(asciiToLowercase, "*.", false) && i32.K(asciiToLowercase, '*', 1, 4) == -1 && hostname.length() >= asciiToLowercase.length() && !"*.".equals(asciiToLowercase)) {
                String substring = asciiToLowercase.substring(1);
                if (p32.w(hostname, substring, false) && ((length = hostname.length() - substring.length()) <= 0 || i32.P(hostname, '.', length - 1, 4) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String ipAddress, X509Certificate certificate) {
        String canonicalHost = _HostnamesCommonKt.toCanonicalHost(ipAddress);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (sn0.r(canonicalHost, _HostnamesCommonKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) {
        certificate.getClass();
        return wn.q0(getSubjectAltNames(certificate, 2), getSubjectAltNames(certificate, 7));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        host.getClass();
        session.getClass();
        if (!isAscii(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            certificate.getClass();
            return verify(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String host, X509Certificate certificate) {
        host.getClass();
        certificate.getClass();
        return _HostnamesCommonKt.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String hostname, X509Certificate certificate) {
        String asciiToLowercase = asciiToLowercase(hostname);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 2);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
