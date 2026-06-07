package okhttp3.internal.tls;

import defpackage.sn0;
import defpackage.yq1;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/tls/BasicTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "caCerts", "", "Ljava/security/cert/X509Certificate;", "<init>", "([Ljava/security/cert/X509Certificate;)V", "subjectToCaCerts", "", "Ljavax/security/auth/x500/X500Principal;", "", "findByIssuerAndSignature", "cert", "equals", "", "other", "", "hashCode", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class BasicTrustRootIndex implements TrustRootIndex {
    private final Map<X500Principal, Set<X509Certificate>> subjectToCaCerts;

    public BasicTrustRootIndex(X509Certificate... x509CertificateArr) {
        x509CertificateArr.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.subjectToCaCerts = linkedHashMap;
    }

    public boolean equals(Object other) {
        if (other != this) {
            if (!(other instanceof BasicTrustRootIndex) || !sn0.r(((BasicTrustRootIndex) other).subjectToCaCerts, this.subjectToCaCerts)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
        cert.getClass();
        Set<X509Certificate> set = this.subjectToCaCerts.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public int hashCode() {
        return this.subjectToCaCerts.hashCode();
    }
}
