package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class zd0 implements k12 {
    private final k12 delegate;

    public zd0(k12 k12Var) {
        k12Var.getClass();
        this.delegate = k12Var;
    }

    @f00
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final k12 m300deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final k12 delegate() {
        return this.delegate;
    }

    @Override // defpackage.k12
    public long read(hk hkVar, long j) {
        hkVar.getClass();
        return this.delegate.read(hkVar, j);
    }

    @Override // defpackage.k12
    public ea2 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
