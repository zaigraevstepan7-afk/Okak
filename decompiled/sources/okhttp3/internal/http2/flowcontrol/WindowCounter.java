package okhttp3.internal.http2.flowcontrol;

import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "", "", "streamId", "<init>", "(I)V", "", "total", "acknowledged", "Lod2;", "update", "(JJ)V", "", "toString", "()Ljava/lang/String;", "I", "getStreamId", "()I", "value", "J", "getTotal", "()J", "getAcknowledged", "getUnacknowledged", "unacknowledged", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class WindowCounter {
    private long acknowledged;
    private final int streamId;
    private long total;

    public WindowCounter(int i) {
        this.streamId = i;
    }

    public static /* synthetic */ void update$default(WindowCounter windowCounter, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        windowCounter.update(j, j2);
    }

    public final long getAcknowledged() {
        return this.acknowledged;
    }

    public final int getStreamId() {
        return this.streamId;
    }

    public final long getTotal() {
        return this.total;
    }

    public final synchronized long getUnacknowledged() {
        return this.total - this.acknowledged;
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.streamId + ", total=" + this.total + ", acknowledged=" + this.acknowledged + ", unacknowledged=" + getUnacknowledged() + ')';
    }

    public final synchronized void update(long total, long acknowledged) {
        try {
            if (total >= 0) {
                if (acknowledged >= 0) {
                    long j = this.total + total;
                    this.total = j;
                    long j2 = this.acknowledged + acknowledged;
                    this.acknowledged = j2;
                    if (j2 > j) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
