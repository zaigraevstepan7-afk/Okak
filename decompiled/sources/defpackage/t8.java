package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t8 implements gv {
    public final View e;
    public final n82 f;
    public final gv g;
    public final AtomicReference h = new AtomicReference(null);

    public t8(View view, n82 n82Var, gv gvVar) {
        this.e = view;
        this.f = n82Var;
        this.g = gvVar;
    }

    @Override // defpackage.gv
    public final xu A() {
        return this.g.A();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.hu0 r8, defpackage.wt r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.r8
            if (r0 == 0) goto L13
            r0 = r9
            r8 r0 = (defpackage.r8) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            r8 r0 = new r8
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r7)
            return
        L27:
            defpackage.io.K(r9)
            goto L50
        L2b:
            defpackage.io.K(r9)
            r9 = r2
            i6 r2 = new i6
            r1 = 2
            r2.<init>(r1, r8, r7)
            j r4 = new j
            r8 = 4
            r5 = 0
            r4.<init>(r7, r5, r8)
            r0.g = r9
            a8 r1 = new a8
            r6 = 13
            java.util.concurrent.atomic.AtomicReference r3 = r7.h
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.fp.u(r1, r0)
            hv r8 = defpackage.hv.e
            if (r7 != r8) goto L50
            return
        L50:
            defpackage.se.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t8.a(hu0, wt):void");
    }
}
