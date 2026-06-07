package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ga implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ ha e;

    public ga(ha haVar) {
        this.e = haVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.e.h.removeCallbacks(this);
        ha.S(this.e);
        ha haVar = this.e;
        synchronized (haVar.i) {
            if (!haVar.n) {
                return;
            }
            haVar.n = false;
            ArrayList arrayList = haVar.k;
            haVar.k = haVar.l;
            haVar.l = arrayList;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
            }
            arrayList.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ha.S(this.e);
        ha haVar = this.e;
        synchronized (haVar.i) {
            if (haVar.k.isEmpty()) {
                haVar.g.removeFrameCallback(this);
                haVar.n = false;
            }
        }
    }
}
