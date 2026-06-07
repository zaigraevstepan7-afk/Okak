package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ir {
    public final Object a;

    public ir(int i) {
        switch (i) {
            case 1:
                this.a = fr1.k(Boolean.FALSE);
                return;
            default:
                this.a = new ArrayList();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r8, defpackage.dg0 r9, java.lang.Object r10) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r9.a
            r1 = 1
            if (r0 != 0) goto La
            r10 = 0
            r7.b(r8, r9, r10)
            return r1
        La:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L3a
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof defpackage.p3
            if (r6 == 0) goto L21
            if (r5 == r10) goto L1d
            goto L32
        L1d:
            r7.b(r3, r9, r5)
            return r1
        L21:
            boolean r6 = r5 instanceof defpackage.dg0
            if (r6 == 0) goto L35
            r6 = r5
            dg0 r6 = (defpackage.dg0) r6
            boolean r6 = r7.a(r8, r6, r10)
            if (r6 == 0) goto L32
            r7.b(r3, r9, r5)
            return r1
        L32:
            int r4 = r4 + 1
            goto L10
        L35:
            java.lang.String r7 = "Unexpected child source info "
            defpackage.se.t(r5, r7)
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir.a(int, dg0, java.lang.Object):boolean");
    }

    public void b(int i, dg0 dg0Var, Object obj) {
        ((ArrayList) this.a).add(new jr(i, null, null));
    }

    public abstract Object c();

    public abstract Object d();

    public void e(int i, Object obj, dg0 dg0Var, Object obj2) {
        if (!sn0.r(obj, or.a)) {
            return;
        }
        b(i, dg0Var, null);
    }

    public abstract void f(Object obj);

    public abstract void g(lb2 lb2Var);

    public abstract void h();
}
