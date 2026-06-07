package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x50 extends hp {
    public final /* synthetic */ hp b;
    public final /* synthetic */ ThreadPoolExecutor c;

    public x50(hp hpVar, ThreadPoolExecutor threadPoolExecutor) {
        this.b = hpVar;
        this.c = threadPoolExecutor;
    }

    @Override // defpackage.hp
    public final void F(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.c;
        try {
            this.b.F(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.hp
    public final void G(q4 q4Var) {
        ThreadPoolExecutor threadPoolExecutor = this.c;
        try {
            this.b.G(q4Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
