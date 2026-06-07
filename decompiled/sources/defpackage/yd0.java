package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class yd0 implements ey1 {
    private final ey1 delegate;

    public yd0(ey1 ey1Var) {
        ey1Var.getClass();
        this.delegate = ey1Var;
    }

    @f00
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final ey1 m299deprecated_delegate() {
        return this.delegate;
    }

    @Override // defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.delegate.close();
    }

    public final ey1 delegate() {
        return this.delegate;
    }

    @Override // defpackage.ey1, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // defpackage.ey1
    public ea2 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // defpackage.ey1
    public void write(hk hkVar, long j) {
        hkVar.getClass();
        this.delegate.write(hkVar, j);
    }
}
