package okhttp3;

import defpackage.f00;
import defpackage.i32;
import defpackage.sn0;
import defpackage.yq1;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal._HostnamesCommonKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\rJ\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u000eJ\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0018"}, d2 = {"Lokhttp3/Route;", "", "address", "Lokhttp3/Address;", "proxy", "Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "<init>", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "()Lokhttp3/Address;", "()Ljava/net/Proxy;", "()Ljava/net/InetSocketAddress;", "-deprecated_address", "-deprecated_proxy", "-deprecated_socketAddress", "requiresTunnel", "", "equals", "other", "hashCode", "", "toString", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        address.getClass();
        proxy.getClass();
        inetSocketAddress.getClass();
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    @f00
    /* renamed from: -deprecated_address, reason: not valid java name and from getter */
    public final Address getAddress() {
        return this.address;
    }

    @f00
    /* renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @f00
    /* renamed from: -deprecated_socketAddress, reason: not valid java name and from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public boolean equals(Object other) {
        if (other instanceof Route) {
            Route route = (Route) other;
            if (sn0.r(route.address, this.address) && sn0.r(route.proxy, this.proxy) && sn0.r(route.socketAddress, this.socketAddress)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31);
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        if (this.proxy.type() != Proxy.Type.HTTP) {
            return false;
        }
        if (this.address.sslSocketFactory() == null && !this.address.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            return false;
        }
        return true;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        String str;
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        String host = this.address.url().host();
        InetAddress address = this.socketAddress.getAddress();
        if (address != null && (hostAddress = address.getHostAddress()) != null) {
            str = _HostnamesCommonKt.toCanonicalHost(hostAddress);
        } else {
            str = null;
        }
        if (i32.H(host, AbstractJsonLexerKt.COLON)) {
            sb.append("[");
            sb.append(host);
            sb.append("]");
        } else {
            sb.append(host);
        }
        if (this.address.url().port() != this.socketAddress.getPort() || host.equals(str)) {
            sb.append(":");
            sb.append(this.address.url().port());
        }
        if (!host.equals(str)) {
            if (sn0.r(this.proxy, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (str == null) {
                sb.append("<unresolved>");
            } else if (i32.H(str, AbstractJsonLexerKt.COLON)) {
                sb.append("[");
                sb.append(str);
                sb.append("]");
            } else {
                sb.append(str);
            }
            sb.append(":");
            sb.append(this.socketAddress.getPort());
        }
        return sb.toString();
    }
}
