package okhttp3.internal.ws;

import defpackage.hk;
import defpackage.se;
import defpackage.wk0;
import defpackage.yq1;
import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.Metadata;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lhk;", "buffer", "Lod2;", "inflate", "(Lhk;)V", "close", "()V", "Z", "deflatedBytes", "Lhk;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lwk0;", "inflaterSource", "Lwk0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class MessageInflater implements Closeable {
    private final hk deflatedBytes = new Object();
    private Inflater inflater;
    private wk0 inflaterSource;
    private final boolean noContextTakeover;

    /* JADX WARN: Type inference failed for: r1v1, types: [hk, java.lang.Object] */
    public MessageInflater(boolean z) {
        this.noContextTakeover = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        wk0 wk0Var = this.inflaterSource;
        if (wk0Var != null) {
            wk0Var.close();
        }
        this.inflaterSource = null;
        this.inflater = null;
    }

    public final void inflate(hk buffer) {
        buffer.getClass();
        if (this.deflatedBytes.f == 0) {
            Inflater inflater = this.inflater;
            if (inflater == null) {
                inflater = new Inflater(true);
                this.inflater = inflater;
            }
            wk0 wk0Var = this.inflaterSource;
            if (wk0Var == null) {
                wk0Var = new wk0(this.deflatedBytes, inflater);
                this.inflaterSource = wk0Var;
            }
            if (this.noContextTakeover) {
                inflater.reset();
            }
            this.deflatedBytes.l(buffer);
            this.deflatedBytes.T(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            long bytesRead = inflater.getBytesRead() + this.deflatedBytes.f;
            do {
                wk0Var.b(buffer, Long.MAX_VALUE);
                if (inflater.getBytesRead() >= bytesRead) {
                    break;
                }
            } while (!inflater.finished());
            if (inflater.getBytesRead() < bytesRead) {
                this.deflatedBytes.b();
                wk0Var.close();
                this.inflaterSource = null;
                this.inflater = null;
                return;
            }
            return;
        }
        se.h("Failed requirement.");
    }
}
