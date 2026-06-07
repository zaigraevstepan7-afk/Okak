package defpackage;

import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ug {
    public final q4 a;
    public final y91 b;

    /* JADX WARN: Multi-variable type inference failed */
    public ug(q4 q4Var, y91 y91Var) {
        this.a = q4Var;
        this.b = y91Var;
        if ((q4Var == null ? y91Var : q4Var) != null) {
            return;
        }
        se.h("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(x0 x0Var) {
        q4 q4Var = this.a;
        if (q4Var != null) {
            q4.c(q4Var, (sg) x0Var.b);
            return;
        }
        y91 y91Var = this.b;
        if (y91Var != null) {
            tg tgVar = (tg) x0Var.a;
            tgVar.getClass();
            t91 t91Var = new t91(tgVar, new v91(null, tgVar));
            tgVar.a.add(t91Var);
            q4.c(y91Var.b, t91Var);
            return;
        }
        se.p("Unreachable");
    }

    public final void b(x0 x0Var) {
        boolean isTerminated;
        if (this.a != null) {
            ((sg) x0Var.b).e();
            return;
        }
        if (this.b != null) {
            tg tgVar = (tg) x0Var.a;
            ArrayList arrayList = tgVar.a;
            CopyOnWriteArrayList copyOnWriteArrayList = tgVar.c;
            Iterator it = copyOnWriteArrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                AutoCloseable autoCloseable = (AutoCloseable) it.next();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else {
                    throw new IllegalArgumentException();
                }
            }
            copyOnWriteArrayList.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((t91) it2.next()).e();
            }
            arrayList.clear();
            return;
        }
        se.p("Unreachable");
    }
}
