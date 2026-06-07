package okhttp3.internal.cache;

import defpackage.ey1;
import defpackage.hk;
import defpackage.oe0;
import defpackage.yd0;
import defpackage.yq1;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lyd0;", "Ley1;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lod2;", "onException", "<init>", "(Ley1;Loe0;)V", "Lhk;", "source", "", "byteCount", "write", "(Lhk;J)V", "flush", "()V", "close", "Loe0;", "getOnException", "()Loe0;", "", "hasErrors", "Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public class FaultHidingSink extends yd0 {
    private boolean hasErrors;
    private final oe0 onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(ey1 ey1Var, oe0 oe0Var) {
        super(ey1Var);
        ey1Var.getClass();
        oe0Var.getClass();
        this.onException = oe0Var;
    }

    @Override // defpackage.yd0, defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // defpackage.yd0, defpackage.ey1, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    public final oe0 getOnException() {
        return this.onException;
    }

    @Override // defpackage.yd0, defpackage.ey1
    public void write(hk source, long byteCount) {
        source.getClass();
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
