package okhttp3.internal.http;

import defpackage.al1;
import defpackage.fg0;
import defpackage.ok;
import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/http/GzipRequestBody;", "Lokhttp3/RequestBody;", "delegate", "<init>", "(Lokhttp3/RequestBody;)V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lok;", "sink", "Lod2;", "writeTo", "(Lok;)V", "", "isOneShot", "()Z", "Lokhttp3/RequestBody;", "getDelegate", "()Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class GzipRequestBody extends RequestBody {
    private final RequestBody delegate;

    public GzipRequestBody(RequestBody requestBody) {
        requestBody.getClass();
        this.delegate = requestBody;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return -1L;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public MediaType getContentType() {
        return this.delegate.getContentType();
    }

    public final RequestBody getDelegate() {
        return this.delegate;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return this.delegate.isOneShot();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(ok sink) {
        sink.getClass();
        al1 al1Var = new al1(new fg0(sink));
        try {
            this.delegate.writeTo(al1Var);
            al1Var.close();
        } finally {
        }
    }
}
