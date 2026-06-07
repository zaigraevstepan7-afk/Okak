package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r22 extends q0 implements va0, ff0, p22, m41 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(r22.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int i;

    public r22(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        r1 = r1;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r13.equals(r15) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if (r9 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r15 != r2) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0079, B:16:0x0081, B:19:0x0088, B:20:0x008c, B:24:0x008f, B:26:0x00b0, B:29:0x00c0, B:30:0x00dc, B:36:0x00ec, B:32:0x00e3, B:35:0x00e9, B:45:0x0095, B:48:0x009c, B:56:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0034, B:14:0x0079, B:16:0x0081, B:19:0x0088, B:20:0x008c, B:24:0x008f, B:26:0x00b0, B:29:0x00c0, B:30:0x00dc, B:36:0x00ec, B:32:0x00e3, B:35:0x00e9, B:45:0x0095, B:48:0x009c, B:56:0x004b), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [s22] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [r0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [s22] */
    /* JADX WARN: Type inference failed for: r1v7, types: [s22] */
    /* JADX WARN: Type inference failed for: r1v8, types: [s22] */
    /* JADX WARN: Type inference failed for: r8v1, types: [q0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [r22] */
    /* JADX WARN: Type inference failed for: r8v5, types: [r22, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [r22] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00bf -> B:14:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.va0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.wa0 r14, defpackage.vt r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r22.a(wa0, vt):java.lang.Object");
    }

    @Override // defpackage.wa0
    public final Object b(Object obj, vt vtVar) {
        j(obj);
        return od2.a;
    }

    @Override // defpackage.ff0
    public final va0 c(xu xuVar, int i, jk jkVar) {
        if ((((i >= 0 && i < 2) || i == -2) && jkVar == jk.f) || ((i == 0 || i == -3) && jkVar == jk.e)) {
            return this;
        }
        return new gm(this, xuVar, i, jkVar);
    }

    @Override // defpackage.q0
    public final r0 e() {
        return new s22();
    }

    @Override // defpackage.q0
    public final r0[] f() {
        return new s22[2];
    }

    @Override // defpackage.p22
    public final Object getValue() {
        ad0 ad0Var = c01.p;
        Object obj = j.get(this);
        if (obj == ad0Var) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        ad0 ad0Var = c01.p;
        if (obj == null) {
            obj = ad0Var;
        }
        if (obj2 == null) {
            obj2 = ad0Var;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = c01.p;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i;
        r0[] r0VarArr;
        ad0 ad0Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !sn0.r(obj3, obj)) {
                return false;
            }
            if (sn0.r(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.i;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.i = i3;
                r0[] r0VarArr2 = this.e;
                while (true) {
                    s22[] s22VarArr = (s22[]) r0VarArr2;
                    if (s22VarArr != null) {
                        for (s22 s22Var : s22VarArr) {
                            if (s22Var != null) {
                                AtomicReference atomicReference = s22Var.a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (ad0Var = d6.A)) {
                                        ad0 ad0Var2 = d6.z;
                                        if (obj4 == ad0Var2) {
                                            while (!atomicReference.compareAndSet(obj4, ad0Var)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, ad0Var2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((pl) obj4).resumeWith(od2.a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.i;
                        if (i == i3) {
                            this.i = i3 + 1;
                            return true;
                        }
                        r0VarArr = this.e;
                    }
                    r0VarArr2 = r0VarArr;
                    i3 = i;
                }
            } else {
                this.i = i2 + 2;
                return true;
            }
        }
    }
}
