package okhttp3.internal.publicsuffix;

import defpackage.bl;
import defpackage.bl1;
import defpackage.k12;
import defpackage.lo;
import defpackage.sn0;
import defpackage.yq1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "()V", "Lod2;", "readTheList", "readTheListUninterruptibly", "Lk12;", "listSource", "()Lk12;", "ensureLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "Lbl;", "bytes", "Lbl;", "getBytes", "()Lbl;", "setBytes", "(Lbl;)V", "exceptionBytes", "getExceptionBytes", "setExceptionBytes", "Ljava/io/IOException;", "readFailure", "Ljava/io/IOException;", "", "getPath", "()Ljava/lang/Object;", "path", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class BasePublicSuffixList implements PublicSuffixList {
    public bl bytes;
    public bl exceptionBytes;
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);
    private IOException readFailure;

    private final void readTheList() {
        try {
            bl1 l = lo.l(listSource());
            try {
                bl e = l.e(l.readInt());
                bl e2 = l.e(l.readInt());
                l.close();
                synchronized (this) {
                    e.getClass();
                    setBytes(e);
                    e2.getClass();
                    setExceptionBytes(e2);
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    this.readFailure = e;
                    if (!z) {
                        return;
                    }
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public void ensureLoaded() {
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.bytes != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + getPath() + " resource.");
        illegalStateException.initCause(this.readFailure);
        throw illegalStateException;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public bl getBytes() {
        bl blVar = this.bytes;
        if (blVar != null) {
            return blVar;
        }
        sn0.V("bytes");
        throw null;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public bl getExceptionBytes() {
        bl blVar = this.exceptionBytes;
        if (blVar != null) {
            return blVar;
        }
        sn0.V("exceptionBytes");
        throw null;
    }

    public abstract Object getPath();

    public abstract k12 listSource();

    public void setBytes(bl blVar) {
        blVar.getClass();
        this.bytes = blVar;
    }

    public void setExceptionBytes(bl blVar) {
        blVar.getClass();
        this.exceptionBytes = blVar;
    }
}
