package okhttp3.internal;

import defpackage.bl1;
import defpackage.ea2;
import defpackage.hk;
import defpackage.k12;
import defpackage.pk;
import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/UnreadableResponseBody;", "Lokhttp3/ResponseBody;", "Lk12;", "Lokhttp3/MediaType;", "mediaType", "", "contentLength", "<init>", "(Lokhttp3/MediaType;J)V", "contentType", "()Lokhttp3/MediaType;", "()J", "Lpk;", "source", "()Lpk;", "Lhk;", "sink", "byteCount", "read", "(Lhk;J)J", "Lea2;", "timeout", "()Lea2;", "Lod2;", "close", "()V", "Lokhttp3/MediaType;", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class UnreadableResponseBody extends ResponseBody implements k12 {
    private final long contentLength;
    private final MediaType mediaType;

    public UnreadableResponseBody(MediaType mediaType, long j) {
        this.mediaType = mediaType;
        this.contentLength = j;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType, reason: from getter */
    public MediaType getMediaType() {
        return this.mediaType;
    }

    @Override // defpackage.k12
    public long read(hk sink, long byteCount) {
        sink.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public pk getSource() {
        return new bl1(this);
    }

    @Override // defpackage.k12
    public ea2 timeout() {
        return ea2.NONE;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
