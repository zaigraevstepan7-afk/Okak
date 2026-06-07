package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s7 implements sf0 {
    public final q5 a;
    public final Object b = new Object();
    public boolean c;
    public final q7 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [q7, android.content.ComponentCallbacks, java.lang.Object] */
    public s7(q5 q5Var) {
        this.a = q5Var;
        ?? obj = new Object();
        this.d = obj;
        if (q5Var.isAttachedToWindow()) {
            Context context = q5Var.getContext();
            if (!this.c) {
                context.getApplicationContext().registerComponentCallbacks(obj);
                this.c = true;
            }
        }
        q5Var.addOnAttachStateChangeListener(new r7(this, 0));
    }

    @Override // defpackage.sf0
    public final void a(tf0 tf0Var) {
        synchronized (this.b) {
            if (!tf0Var.s) {
                tf0Var.s = true;
                tf0Var.b();
            }
        }
    }

    @Override // defpackage.sf0
    public final tf0 b() {
        tf0 tf0Var;
        synchronized (this.b) {
            this.a.getUniqueDrawingId();
            tf0Var = new tf0(new xf0());
        }
        return tf0Var;
    }
}
