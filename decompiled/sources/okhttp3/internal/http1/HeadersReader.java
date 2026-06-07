package okhttp3.internal.http1;

import defpackage.pk;
import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.Headers;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "Lpk;", "source", "<init>", "(Lpk;)V", "", "readLine", "()Ljava/lang/String;", "Lokhttp3/Headers;", "readHeaders", "()Lokhttp3/Headers;", "Lpk;", "getSource", "()Lpk;", "", "headerLimit", "J", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class HeadersReader {
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final pk source;

    public HeadersReader(pk pkVar) {
        pkVar.getClass();
        this.source = pkVar;
        this.headerLimit = 262144L;
    }

    public final pk getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String q = this.source.q(this.headerLimit);
        this.headerLimit -= q.length();
        return q;
    }
}
