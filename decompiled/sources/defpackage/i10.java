package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class i10 extends y52 {
    public int g;

    public i10(int i) {
        super(0L, false);
        this.g = i;
    }

    public abstract vt c();

    public Throwable d(Object obj) {
        lp lpVar;
        if (obj instanceof lp) {
            lpVar = (lp) obj;
        } else {
            lpVar = null;
        }
        if (lpVar == null) {
            return null;
        }
        return lpVar.a;
    }

    public final void g(Throwable th) {
        qo.O(c().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.go0) r5.H(defpackage.g3.O);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            vt r0 = r11.c()     // Catch: java.lang.Throwable -> L1f
            r0.getClass()     // Catch: java.lang.Throwable -> L1f
            g10 r0 = (defpackage.g10) r0     // Catch: java.lang.Throwable -> L1f
            wt r1 = r0.i     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.k     // Catch: java.lang.Throwable -> L1f
            xu r2 = r1.getContext()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = defpackage.mp0.Q(r2, r0)     // Catch: java.lang.Throwable -> L1f
            ad0 r3 = defpackage.mp0.y0     // Catch: java.lang.Throwable -> L1f
            r4 = 0
            if (r0 == r3) goto L22
            jd2 r3 = defpackage.io.N(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r0 = move-exception
            goto L8b
        L22:
            r3 = r4
        L23:
            xu r5 = r1.getContext()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = r11.i()     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r7 = r11.d(r6)     // Catch: java.lang.Throwable -> L46
            if (r7 != 0) goto L48
            int r8 = r11.g     // Catch: java.lang.Throwable -> L46
            r9 = 1
            if (r8 == r9) goto L3b
            r10 = 2
            if (r8 != r10) goto L3a
            goto L3b
        L3a:
            r9 = 0
        L3b:
            if (r9 == 0) goto L48
            g3 r4 = defpackage.g3.O     // Catch: java.lang.Throwable -> L46
            vu r4 = r5.H(r4)     // Catch: java.lang.Throwable -> L46
            go0 r4 = (defpackage.go0) r4     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r1 = move-exception
            goto L7f
        L48:
            if (r4 == 0) goto L5f
            boolean r5 = r4.b()     // Catch: java.lang.Throwable -> L46
            if (r5 != 0) goto L5f
            java.util.concurrent.CancellationException r4 = r4.o()     // Catch: java.lang.Throwable -> L46
            r11.b(r4)     // Catch: java.lang.Throwable -> L46
            fo1 r4 = defpackage.io.s(r4)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
            goto L71
        L5f:
            if (r7 == 0) goto L6a
            fo1 r4 = new fo1     // Catch: java.lang.Throwable -> L46
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
            goto L71
        L6a:
            java.lang.Object r4 = r11.f(r6)     // Catch: java.lang.Throwable -> L46
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L46
        L71:
            if (r3 == 0) goto L7b
            boolean r1 = r3.h0()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            defpackage.mp0.J(r2, r0)     // Catch: java.lang.Throwable -> L1f
            return
        L7f:
            if (r3 == 0) goto L87
            boolean r3 = r3.h0()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L8a
        L87:
            defpackage.mp0.J(r2, r0)     // Catch: java.lang.Throwable -> L1f
        L8a:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L8b:
            r11.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i10.run():void");
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
