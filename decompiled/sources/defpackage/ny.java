package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ny extends s70 implements Executor {
    public static final ny g = new zu();
    public static final zu h;

    /* JADX WARN: Type inference failed for: r0v0, types: [zu, ny] */
    static {
        pd2 pd2Var = pd2.g;
        int i = j52.a;
        if (64 >= i) {
            i = 64;
        }
        h = pd2Var.R(pp1.I(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.zu
    public final void P(xu xuVar, Runnable runnable) {
        h.P(xuVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        P(j60.e, runnable);
    }

    @Override // defpackage.zu
    public final String toString() {
        return "Dispatchers.IO";
    }
}
