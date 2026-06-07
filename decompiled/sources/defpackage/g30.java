package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class g30 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        if (defpackage.z81.b(defpackage.qo.X(r6, true), 0) == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, vl1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.v42 r12, long r13, defpackage.wt r15) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g30.a(v42, long, wt):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[Catch: lh1 -> 0x00a4, TRY_LEAVE, TryCatch #0 {lh1 -> 0x00a4, blocks: (B:11:0x0028, B:12:0x0097, B:14:0x009b, B:34:0x007b), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [sl1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r9v3, types: [wl1] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.v42 r8, long r9, defpackage.wt r11) {
        /*
            boolean r0 = r11 instanceof defpackage.b30
            if (r0 == 0) goto L13
            r0 = r11
            b30 r0 = (defpackage.b30) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            b30 r0 = new b30
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.h
            int r1 = r0.i
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            sl1 r8 = r0.g
            wl1 r9 = r0.f
            qh1 r10 = r0.e
            defpackage.io.K(r11)     // Catch: defpackage.lh1 -> La4
            goto L97
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r8)
            return r3
        L32:
            defpackage.io.K(r11)
            w42 r11 = r8.j
            jh1 r11 = r11.w
            boolean r11 = e(r11, r9)
            if (r11 == 0) goto L40
            goto La3
        L40:
            w42 r11 = r8.j
            jh1 r11 = r11.w
            java.util.List r11 = r11.a
            int r1 = r11.size()
            r4 = 0
        L4b:
            if (r4 >= r1) goto L60
            java.lang.Object r5 = r11.get(r4)
            r6 = r5
            qh1 r6 = (defpackage.qh1) r6
            long r6 = r6.a
            boolean r6 = defpackage.hp.v(r6, r9)
            if (r6 == 0) goto L5d
            goto L61
        L5d:
            int r4 = r4 + 1
            goto L4b
        L60:
            r5 = r3
        L61:
            r10 = r5
            qh1 r10 = (defpackage.qh1) r10
            if (r10 != 0) goto L67
            goto La3
        L67:
            wl1 r9 = new wl1
            r9.<init>()
            wl1 r11 = new wl1
            r11.<init>()
            r11.e = r10
            hg2 r1 = r8.i()
            long r4 = r1.b()
            sl1 r1 = new sl1     // Catch: defpackage.lh1 -> La4
            r1.<init>()     // Catch: defpackage.lh1 -> La4
            c30 r6 = new c30     // Catch: defpackage.lh1 -> La4
            r6.<init>(r1, r11, r9, r3)     // Catch: defpackage.lh1 -> La4
            r0.e = r10     // Catch: defpackage.lh1 -> La4
            r0.f = r9     // Catch: defpackage.lh1 -> La4
            r0.g = r1     // Catch: defpackage.lh1 -> La4
            r0.i = r2     // Catch: defpackage.lh1 -> La4
            java.lang.Object r8 = r8.j(r4, r6, r0)     // Catch: defpackage.lh1 -> La4
            hv r11 = defpackage.hv.e
            if (r8 != r11) goto L96
            return r11
        L96:
            r8 = r1
        L97:
            boolean r8 = r8.e     // Catch: defpackage.lh1 -> La4
            if (r8 == 0) goto La3
            java.lang.Object r8 = r9.e     // Catch: defpackage.lh1 -> La4
            qh1 r8 = (defpackage.qh1) r8     // Catch: defpackage.lh1 -> La4
            if (r8 != 0) goto La2
            return r10
        La2:
            return r8
        La3:
            return r3
        La4:
            java.lang.Object r8 = r9.e
            qh1 r8 = (defpackage.qh1) r8
            if (r8 != 0) goto Lab
            goto Lac
        Lab:
            r10 = r8
        Lac:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g30.b(v42, long, wt):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, vl1] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0160 -> B:11:0x0162). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.v42 r20, long r21, defpackage.h8 r23, defpackage.eh r24) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g30.c(v42, long, h8, eh):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.v42 r4, long r5, defpackage.oe0 r7, defpackage.wt r8) {
        /*
            boolean r0 = r8 instanceof defpackage.f30
            if (r0 == 0) goto L13
            r0 = r8
            f30 r0 = (defpackage.f30) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            f30 r0 = new f30
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.g
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            oe0 r4 = r0.f
            v42 r5 = r0.e
            defpackage.io.K(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L32:
            defpackage.io.K(r8)
        L35:
            r0.e = r4
            r0.f = r7
            r0.h = r2
            java.lang.Object r8 = a(r4, r5, r0)
            hv r5 = defpackage.hv.e
            if (r8 != r5) goto L44
            return r5
        L44:
            qh1 r8 = (defpackage.qh1) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.qo.q(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.a
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g30.d(v42, long, oe0, wt):java.lang.Object");
    }

    public static final boolean e(jh1 jh1Var, long j) {
        Object obj;
        List list = jh1Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (hp.v(((qh1) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        qh1 qh1Var = (qh1) obj;
        if (qh1Var != null && qh1Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float f(hg2 hg2Var, int i) {
        if (i == 2) {
            return hg2Var.f() * a;
        }
        return hg2Var.f();
    }
}
