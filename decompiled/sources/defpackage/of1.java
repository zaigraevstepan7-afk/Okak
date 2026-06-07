package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class of1 implements k12 {
    public final pk e;
    public final hk f;
    public mt1 g;
    public int h;
    public boolean i;
    public long j;

    public of1(pk pkVar) {
        int i;
        this.e = pkVar;
        hk a = pkVar.a();
        this.f = a;
        mt1 mt1Var = a.e;
        this.g = mt1Var;
        if (mt1Var != null) {
            i = mt1Var.b;
        } else {
            i = -1;
        }
        this.h = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.k12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(defpackage.hk r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.i
            if (r3 != 0) goto L5f
            mt1 r3 = r8.g
            hk r4 = r8.f
            if (r3 == 0) goto L27
            mt1 r5 = r4.e
            if (r3 != r5) goto L21
            int r3 = r8.h
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.se.p(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.j
            r2 = 1
            long r0 = r0 + r2
            pk r2 = r8.e
            boolean r0 = r2.C(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            mt1 r0 = r8.g
            if (r0 != 0) goto L48
            mt1 r0 = r4.e
            if (r0 == 0) goto L48
            r8.g = r0
            int r0 = r0.b
            r8.h = r0
        L48:
            long r0 = r4.f
            long r2 = r8.j
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            hk r2 = r8.f
            long r3 = r8.j
            r5 = r9
            r2.i(r3, r5, r6)
            long r9 = r8.j
            long r9 = r9 + r6
            r8.j = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.se.p(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.l90.k(r8, r10)
            defpackage.se.e(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of1.read(hk, long):long");
    }

    @Override // defpackage.k12
    public final ea2 timeout() {
        return this.e.timeout();
    }
}
