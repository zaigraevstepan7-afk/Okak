package okhttp3.internal.http2;

import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\rJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/FlowControlListener;", "", "", "streamId", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "windowCounter", "", "bufferSize", "Lod2;", "receivingStreamWindowChanged", "(ILokhttp3/internal/http2/flowcontrol/WindowCounter;J)V", "receivingConnectionWindowChanged", "(Lokhttp3/internal/http2/flowcontrol/WindowCounter;)V", "None", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public interface FlowControlListener {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http2/FlowControlListener$None;", "Lokhttp3/internal/http2/FlowControlListener;", "<init>", "()V", "", "streamId", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "windowCounter", "", "bufferSize", "Lod2;", "receivingStreamWindowChanged", "(ILokhttp3/internal/http2/flowcontrol/WindowCounter;J)V", "receivingConnectionWindowChanged", "(Lokhttp3/internal/http2/flowcontrol/WindowCounter;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class None implements FlowControlListener {
        public static final None INSTANCE = new None();

        private None() {
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public void receivingConnectionWindowChanged(WindowCounter windowCounter) {
            windowCounter.getClass();
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public void receivingStreamWindowChanged(int streamId, WindowCounter windowCounter, long bufferSize) {
            windowCounter.getClass();
        }
    }

    void receivingConnectionWindowChanged(WindowCounter windowCounter);

    void receivingStreamWindowChanged(int streamId, WindowCounter windowCounter, long bufferSize);
}
