package okhttp3.internal.http;

import defpackage.p32;
import defpackage.yq1;
import defpackage.yx;
import java.net.ProtocolException;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.Response;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0007H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "protocol", "Lokhttp3/Protocol;", "code", "", "message", "", "<init>", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class StatusLine {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final int code;
    public final String message;
    public final Protocol protocol;

    public StatusLine(Protocol protocol, int i, String str) {
        protocol.getClass();
        str.getClass();
        this.protocol = protocol;
        this.code = i;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        return sb.toString();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "<init>", "()V", "get", "Lokhttp3/internal/http/StatusLine;", "response", "Lokhttp3/Response;", "parse", "statusLine", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final StatusLine get(Response response) {
            response.getClass();
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String statusLine) {
            Protocol protocol;
            int i;
            String str;
            statusLine.getClass();
            if (p32.D(statusLine, "HTTP/1.", false)) {
                i = 9;
                if (statusLine.length() >= 9 && statusLine.charAt(8) == ' ') {
                    int charAt = statusLine.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            protocol = Protocol.HTTP_1_1;
                        } else {
                            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                        }
                    } else {
                        protocol = Protocol.HTTP_1_0;
                    }
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
            } else if (p32.D(statusLine, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else if (p32.D(statusLine, "SOURCETABLE ", false)) {
                protocol = Protocol.HTTP_1_1;
                i = 12;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int i2 = i + 3;
            if (statusLine.length() >= i2) {
                Integer E = p32.E(statusLine.substring(i, i2));
                if (E != null) {
                    int intValue = E.intValue();
                    if (statusLine.length() > i2) {
                        if (statusLine.charAt(i2) == ' ') {
                            str = statusLine.substring(i + 4);
                        } else {
                            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                        }
                    } else {
                        str = "";
                    }
                    return new StatusLine(protocol, intValue, str);
                }
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }

        private Companion() {
        }
    }
}
