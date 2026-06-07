package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class tj2 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.rj2 a(defpackage.u r6, defpackage.xr r7, defpackage.fq r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.pf0.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L41
            r0 = 6
            lk r0 = defpackage.sn0.c(r2, r0, r3)
            b52 r2 = defpackage.ha.q
            java.lang.Object r2 = r2.getValue()
            xu r2 = (defpackage.xu) r2
            ut r2 = defpackage.fp.b(r2)
            l r4 = new l
            r5 = 19
            r4.<init>(r0, r3, r5)
            r5 = 3
            defpackage.rx.C(r2, r3, r4, r5)
            n3 r2 = new n3
            r4 = 13
            r2.<init>(r0, r4)
            java.lang.Object r0 = defpackage.q02.c
            monitor-enter(r0)
            java.util.List r4 = defpackage.q02.i     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r2 = defpackage.wn.r0(r4, r2)     // Catch: java.lang.Throwable -> L3e
            defpackage.q02.i = r2     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            defpackage.q02.a()
            goto L41
        L3e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L41:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L54
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof defpackage.q5
            if (r1 == 0) goto L52
            q5 r0 = (defpackage.q5) r0
            goto L58
        L52:
            r0 = r3
            goto L58
        L54:
            r6.removeAllViews()
            goto L52
        L58:
            if (r0 != 0) goto L70
            q5 r0 = new q5
            android.content.Context r1 = r6.getContext()
            xu r2 = r7.j()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = defpackage.tj2.a
            r6.addView(r1, r2)
        L70:
            android.view.View r6 = r0.getView()
            r1 = 2131034235(0x7f05007b, float:1.7678982E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof defpackage.rj2
            if (r2 == 0) goto L82
            r3 = r6
            rj2 r3 = (defpackage.rj2) r3
        L82:
            if (r3 != 0) goto L9e
            rj2 r3 = new rj2
            gd2 r6 = new gd2
            ar0 r2 = r0.getRoot()
            r6.<init>(r2)
            ds r2 = new ds
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        L9e:
            r3.d(r8)
            xu r6 = r0.getCoroutineContext()
            xu r8 = r7.j()
            boolean r6 = defpackage.sn0.r(r6, r8)
            if (r6 != 0) goto Lb6
            xu r6 = r7.j()
            r0.setCoroutineContext(r6)
        Lb6:
            sj2 r6 = new sj2
            r6.<init>(r7)
            r0.setFrameEndScheduler$ui(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj2.a(u, xr, fq):rj2");
    }
}
