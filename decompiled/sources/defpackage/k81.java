package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k81 extends w implements go0 {
    public static final k81 f = new w(g3.O);

    @Override // defpackage.go0
    public final Object M(wt wtVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.go0
    public final q10 O(boolean z, boolean z2, k kVar) {
        return l81.e;
    }

    @Override // defpackage.go0
    public final boolean b() {
        return true;
    }

    @Override // defpackage.go0
    public final vm i(no0 no0Var) {
        return l81.e;
    }

    @Override // defpackage.go0
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.go0
    public final CancellationException o() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.go0
    public final q10 r(oe0 oe0Var) {
        return l81.e;
    }

    @Override // defpackage.go0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.go0, defpackage.dm
    public final void c(CancellationException cancellationException) {
    }
}
