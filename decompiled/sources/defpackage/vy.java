package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vy extends s70 {
    public static final vy h;
    public fv g;

    /* JADX WARN: Type inference failed for: r0v0, types: [vy, zu] */
    static {
        int i = a62.c;
        int i2 = a62.d;
        long j = a62.e;
        String str = a62.a;
        ?? zuVar = new zu();
        zuVar.g = new fv(i, i2, j, str);
        h = zuVar;
    }

    @Override // defpackage.zu
    public final void P(xu xuVar, Runnable runnable) {
        fv.g(this.g, runnable, 6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.zu
    public final String toString() {
        return "Dispatchers.Default";
    }
}
