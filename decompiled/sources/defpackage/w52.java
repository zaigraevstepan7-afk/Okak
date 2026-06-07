package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class w52 {
    public static final t30 a = new t30(3, null, 2);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.v42 r5, boolean r6, defpackage.kh1 r7, defpackage.eh r8) {
        /*
            boolean r0 = r8 instanceof defpackage.p52
            if (r0 == 0) goto L13
            r0 = r8
            p52 r0 = (defpackage.p52) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            p52 r0 = new p52
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.h
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.g
            kh1 r6 = r0.f
            v42 r7 = r0.e
            defpackage.io.K(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            r5 = 0
            return r5
        L36:
            defpackage.io.K(r8)
        L39:
            r0.e = r5
            r0.f = r7
            r0.g = r6
            r0.i = r2
            java.lang.Object r8 = r5.b(r7, r0)
            hv r1 = defpackage.hv.e
            if (r8 != r1) goto L4a
            return r1
        L4a:
            jh1 r8 = (defpackage.jh1) r8
            boolean r1 = d(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w52.a(v42, boolean, kh1, eh):java.lang.Object");
    }

    public static /* synthetic */ Object b(v42 v42Var, eo1 eo1Var, int i) {
        boolean z;
        kh1 kh1Var;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            kh1Var = kh1.f;
        } else {
            kh1Var = kh1.e;
        }
        return a(v42Var, z, kh1Var, eo1Var);
    }

    public static Object c(uh1 uh1Var, az1 az1Var, oe0 oe0Var, vt vtVar, int i) {
        te0 te0Var = az1Var;
        if ((i & 4) != 0) {
            te0Var = a;
        }
        Object u = fp.u(new a8(uh1Var, te0Var, oe0Var, (vt) null), vtVar);
        if (u == hv.e) {
            return u;
        }
        return od2.a;
    }

    public static boolean d(jh1 jh1Var, boolean z) {
        boolean o;
        List list = jh1Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qh1 qh1Var = (qh1) list.get(i);
            if (z) {
                o = qo.n(qh1Var);
            } else {
                o = qo.o(qh1Var);
            }
            if (!o) {
                return false;
            }
        }
        return true;
    }

    public static i22 e(gv gvVar, go0 go0Var, se0 se0Var) {
        return rx.C(gvVar, null, new iu1(go0Var, se0Var, (vt) null, 3), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r0 == r7) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.v42 r17, defpackage.kh1 r18, defpackage.eh r19) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w52.f(v42, kh1, eh):java.lang.Object");
    }
}
