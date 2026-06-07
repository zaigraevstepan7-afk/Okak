package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.protobuf.DescriptorProtos;
import java.util.Random;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class gj1 implements Choreographer.FrameCallback {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ Object f;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new hj1((Context) obj, 0), new Random().nextInt(Math.max(DescriptorProtos.Edition.EDITION_2023_VALUE, 1)) + 5000);
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
