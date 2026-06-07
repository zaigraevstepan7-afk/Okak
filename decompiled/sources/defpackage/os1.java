package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class os1 implements l71 {
    public final at1 e;
    public boolean f;

    public os1(at1 at1Var, boolean z) {
        this.e = at1Var;
        this.f = z;
    }

    @Override // defpackage.l71
    public final long o0(long j, long j2, int i) {
        if (this.f) {
            at1 at1Var = this.e;
            if (!at1Var.a.a()) {
                return at1Var.h(at1Var.d(at1Var.a.e(at1Var.d(at1Var.g(j2)))));
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.l71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t0(long r4, long r6, defpackage.vt r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof defpackage.ns1
            if (r4 == 0) goto L13
            r4 = r8
            ns1 r4 = (defpackage.ns1) r4
            int r5 = r4.h
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.h = r5
            goto L1a
        L13:
            ns1 r4 = new ns1
            wt r8 = (defpackage.wt) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.f
            int r8 = r4.h
            r0 = 1
            if (r8 == 0) goto L30
            if (r8 != r0) goto L29
            long r6 = r4.e
            defpackage.io.K(r5)
            goto L4d
        L29:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r3)
            r3 = 0
            return r3
        L30:
            defpackage.io.K(r5)
            boolean r5 = r3.f
            r1 = 0
            if (r5 == 0) goto L55
            at1 r3 = r3.e
            boolean r5 = r3.i
            if (r5 == 0) goto L40
            goto L51
        L40:
            r4.e = r6
            r4.h = r0
            java.lang.Object r5 = r3.a(r6, r4)
            hv r3 = defpackage.hv.e
            if (r5 != r3) goto L4d
            return r3
        L4d:
            ye2 r5 = (defpackage.ye2) r5
            long r1 = r5.a
        L51:
            long r1 = defpackage.ye2.d(r6, r1)
        L55:
            ye2 r3 = new ye2
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os1.t0(long, long, vt):java.lang.Object");
    }
}
