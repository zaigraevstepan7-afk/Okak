package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ha extends zu {
    public static final b52 q = new b52(e6.o);
    public static final fa r = new fa(0);
    public final Choreographer g;
    public final Handler h;
    public boolean m;
    public boolean n;
    public final ja p;
    public final Object i = new Object();
    public final te j = new te();
    public ArrayList k = new ArrayList();
    public ArrayList l = new ArrayList();
    public final ga o = new ga(this);

    public ha(Choreographer choreographer, Handler handler) {
        this.g = choreographer;
        this.h = handler;
        this.p = new ja(choreographer, this);
    }

    public static final void S(ha haVar) {
        Object removeFirst;
        Runnable runnable;
        boolean z;
        Object removeFirst2;
        do {
            synchronized (haVar.i) {
                te teVar = haVar.j;
                if (teVar.isEmpty()) {
                    removeFirst = null;
                } else {
                    removeFirst = teVar.removeFirst();
                }
                runnable = (Runnable) removeFirst;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (haVar.i) {
                    te teVar2 = haVar.j;
                    if (teVar2.isEmpty()) {
                        removeFirst2 = null;
                    } else {
                        removeFirst2 = teVar2.removeFirst();
                    }
                    runnable = (Runnable) removeFirst2;
                }
            }
            synchronized (haVar.i) {
                if (haVar.j.isEmpty()) {
                    z = false;
                    haVar.m = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.zu
    public final void P(xu xuVar, Runnable runnable) {
        synchronized (this.i) {
            this.j.addLast(runnable);
            if (!this.m) {
                this.m = true;
                this.h.post(this.o);
                if (!this.n) {
                    this.n = true;
                    this.g.postFrameCallback(this.o);
                }
            }
        }
    }
}
