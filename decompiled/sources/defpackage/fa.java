package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fa extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ fa(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    ha haVar = new ha(choreographer, Handler.createAsync(myLooper));
                    return go.M(haVar, haVar.p);
                }
                se.p("no Looper on this thread");
                return null;
            default:
                return new Random();
        }
    }
}
