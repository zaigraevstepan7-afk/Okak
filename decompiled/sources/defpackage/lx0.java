package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class lx0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(lx0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(lx0.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(lx0.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(lx0 lx0Var, int i) {
        while (true) {
            lx0 f2 = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            if (f2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f2 = (lx0) obj;
                    if (!f2.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f2);
                }
            }
            if (f2 instanceof wv0) {
                if ((((wv0) f2).h & i) == 0 && f2.e(lx0Var, i)) {
                    return true;
                }
                return false;
            }
            atomicReferenceFieldUpdater.set(lx0Var, f2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
            atomicReferenceFieldUpdater2.set(lx0Var, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f2, this, lx0Var)) {
                if (atomicReferenceFieldUpdater2.get(f2) != this) {
                    break;
                }
            }
            lx0Var.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((defpackage.lm1) r6).a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lx0 f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.lx0.f
            java.lang.Object r1 = r0.get(r9)
            lx0 r1 = (defpackage.lx0) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.lx0.e
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L1c
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
        L1c:
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.i()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof defpackage.lm1
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            lm1 r6 = (defpackage.lm1) r6
            lx0 r6 = r6.a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            lx0 r3 = (defpackage.lx0) r3
            goto Lb
        L4b:
            r6.getClass()
            r4 = r6
            lx0 r4 = (defpackage.lx0) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx0.f():lx0");
    }

    public final void g(lx0 lx0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            lx0 lx0Var2 = (lx0) atomicReferenceFieldUpdater.get(lx0Var);
            if (e.get(this) != lx0Var) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lx0Var, lx0Var2, this)) {
                if (atomicReferenceFieldUpdater.get(lx0Var) != lx0Var2) {
                    break;
                }
            }
            if (i()) {
                lx0Var.f();
                return;
            }
            return;
        }
    }

    public final lx0 h() {
        lm1 lm1Var;
        Object obj = e.get(this);
        if (obj instanceof lm1) {
            lm1Var = (lm1) obj;
        } else {
            lm1Var = null;
        }
        if (lm1Var != null) {
            return lm1Var.a;
        }
        obj.getClass();
        return (lx0) obj;
    }

    public boolean i() {
        return e.get(this) instanceof lm1;
    }

    public String toString() {
        return new ps0(1, 2, rx.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + rx.w(this);
    }
}
