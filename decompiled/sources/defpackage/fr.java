package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fr implements ScrollCaptureCallback {
    public final ru1 a;
    public final bn0 b;
    public final rg2 c;
    public final q5 d;
    public final ut e;
    public final fi0 f;

    public fr(ru1 ru1Var, bn0 bn0Var, ut utVar, rg2 rg2Var, q5 q5Var) {
        this.a = ru1Var;
        this.b = bn0Var;
        this.c = rg2Var;
        this.d = q5Var;
        this.e = new ut(utVar.e.G(f10.f));
        this.f = new fi0(bn0Var.b(), new gh(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a2, code lost:
    
        if (r10 == r6) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.fr r12, android.view.ScrollCaptureSession r13, defpackage.bn0 r14, defpackage.wt r15) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr.a(fr, android.view.ScrollCaptureSession, bn0, wt):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        rx.C(this.e, k81.f, new j(this, runnable, null, 11), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        i22 C = rx.C(this.e, null, new a8(this, scrollCaptureSession, rect, consumer, null, 3), 3);
        C.r(new n3(cancellationSignal, 9));
        cancellationSignal.setOnCancelListener(new gr(C, 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(fp.W(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((je1) this.c.f).setValue(Boolean.TRUE);
        runnable.run();
    }
}
