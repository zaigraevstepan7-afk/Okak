package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class os extends lk {
    public final jk o;

    public os(int i, jk jkVar) {
        super(i);
        this.o = jkVar;
        if (jkVar != jk.e) {
            if (i >= 1) {
                return;
            }
            se.e(l90.i("Buffered channel capacity must be at least 1, but ", i, " was specified"));
            throw null;
        }
        y61.r("This implementation does not support suspension for senders, use ", yl1.a(lk.class).d(), " instead");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            jk r1 = r15.o
            jk r2 = defpackage.jk.g
            od2 r8 = defpackage.od2.a
            if (r1 != r2) goto L17
            java.lang.Object r0 = super.j(r16)
            boolean r1 = r0 instanceof defpackage.nm
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof defpackage.mm
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r0
        L17:
            ad0 r6 = defpackage.nk.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.lk.j
            java.lang.Object r1 = r1.get(r15)
            om r1 = (defpackage.om) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.lk.f
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.t(r2, r7)
            int r9 = defpackage.nk.b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            om r2 = defpackage.lk.b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r0 = r15.q()
            mm r1 = new mm
            r1.<init>(r0)
            return r1
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = defpackage.lk.g(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb5
            r3 = 1
            if (r12 == r3) goto Lb4
            r3 = 2
            r13 = 0
            if (r12 == r3) goto L8f
            r2 = 3
            if (r12 == r2) goto L89
            r2 = 4
            if (r12 == r2) goto L72
            r2 = 5
            if (r12 == r2) goto L6e
            goto L21
        L6e:
            r1.a()
            goto L21
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.lk.g
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7f
            r1.a()
        L7f:
            java.lang.Throwable r0 = r15.q()
            mm r1 = new mm
            r1.<init>(r0)
            return r1
        L89:
            java.lang.String r0 = "unexpected"
            defpackage.se.p(r0)
            return r13
        L8f:
            if (r7 == 0) goto L9e
            r1.h()
            java.lang.Throwable r0 = r15.q()
            mm r1 = new mm
            r1.<init>(r0)
            return r1
        L9e:
            boolean r3 = r6 instanceof defpackage.bh2
            if (r3 == 0) goto La5
            r13 = r6
            bh2 r13 = (defpackage.bh2) r13
        La5:
            if (r13 == 0) goto Lac
            int r12 = r2 + r9
            r13.a(r1, r12)
        Lac:
            long r3 = r1.c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.l(r3)
        Lb4:
            return r8
        Lb5:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os.F(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // defpackage.lk, defpackage.iv1
    public final Object a(vt vtVar, Object obj) {
        if (!(F(obj, true) instanceof mm)) {
            return od2.a;
        }
        throw q();
    }

    @Override // defpackage.lk, defpackage.iv1
    public final Object j(Object obj) {
        return F(obj, false);
    }

    @Override // defpackage.lk
    public final boolean v() {
        if (this.o == jk.f) {
            return true;
        }
        return false;
    }
}
