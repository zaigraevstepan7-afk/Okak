package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nx {
    public final j91 a;
    public final gv b;
    public final zf c;
    public int e;
    public i22 f;
    public final q4 h;
    public final b52 i;
    public final b52 j;
    public final q4 k;
    public final b51 d = new b51();
    public final rg2 g = new rg2(9);

    public nx(j91 j91Var, List list, wc0 wc0Var, gv gvVar) {
        this.a = j91Var;
        this.b = gvVar;
        vt vtVar = null;
        int i = 10;
        this.c = new zf(new l(this, vtVar, i), 2);
        this.h = new q4(this, list);
        final int i2 = 0;
        this.i = new b52(new de0(this) { // from class: tw
            public final /* synthetic */ nx f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i3 = i2;
                nx nxVar = this.f;
                switch (i3) {
                    case 0:
                        j91 j91Var2 = nxVar.a;
                        String r = ((oe1) j91Var2.e.getValue()).e.r();
                        synchronized (j91.g) {
                            LinkedHashSet linkedHashSet = j91.f;
                            if (!linkedHashSet.contains(r)) {
                                linkedHashSet.add(r);
                            } else {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + r + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                        }
                        return new m91(j91Var2.a, (oe1) j91Var2.e.getValue(), j91Var2.b, (ay1) j91Var2.c.invoke((oe1) j91Var2.e.getValue(), j91Var2.a), new i91(j91Var2, 0));
                    default:
                        return ((m91) nxVar.i.getValue()).d;
                }
            }
        });
        final int i3 = 1;
        this.j = new b52(new de0(this) { // from class: tw
            public final /* synthetic */ nx f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i32 = i3;
                nx nxVar = this.f;
                switch (i32) {
                    case 0:
                        j91 j91Var2 = nxVar.a;
                        String r = ((oe1) j91Var2.e.getValue()).e.r();
                        synchronized (j91.g) {
                            LinkedHashSet linkedHashSet = j91.f;
                            if (!linkedHashSet.contains(r)) {
                                linkedHashSet.add(r);
                            } else {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + r + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                        }
                        return new m91(j91Var2.a, (oe1) j91Var2.e.getValue(), j91Var2.b, (ay1) j91Var2.c.invoke((oe1) j91Var2.e.getValue(), j91Var2.a), new i91(j91Var2, 0));
                    default:
                        return ((m91) nxVar.i.getValue()).d;
                }
            }
        });
        this.k = new q4(gvVar, new r(this, i), new le(21), new j(this, vtVar, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:11:0x0041, B:13:0x0049, B:15:0x004d, B:16:0x0053), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.nx r4, defpackage.wt r5) {
        /*
            boolean r0 = r5 instanceof defpackage.cx
            if (r0 == 0) goto L13
            r0 = r5
            cx r0 = (defpackage.cx) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            cx r0 = new cx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f
            int r1 = r0.h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            b51 r0 = r0.e
            defpackage.io.K(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            return r3
        L2e:
            defpackage.io.K(r5)
            b51 r5 = r4.d
            r0.e = r5
            r0.h = r2
            java.lang.Object r0 = r5.d(r0)
            hv r1 = defpackage.hv.e
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            int r5 = r4.e     // Catch: java.lang.Throwable -> L51
            int r5 = r5 + (-1)
            r4.e = r5     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L55
            i22 r5 = r4.f     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L53
            r5.c(r3)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r4 = move-exception
            goto L5b
        L53:
            r4.f = r3     // Catch: java.lang.Throwable -> L51
        L55:
            r0.f(r3)
            od2 r4 = defpackage.od2.a
            return r4
        L5b:
            r0.f(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.a(nx, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.nx r7, defpackage.z01 r8, defpackage.wt r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ex
            if (r0 == 0) goto L13
            r0 = r9
            ex r0 = (defpackage.ex) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ex r0 = new ex
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ip r7 = r0.e
            defpackage.io.K(r9)     // Catch: java.lang.Throwable -> L28
            goto L5e
        L28:
            r8 = move-exception
            goto L59
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r7)
            return r2
        L30:
            defpackage.io.K(r9)
            ip r9 = r8.b
            xu r1 = r8.d     // Catch: java.lang.Throwable -> L57
            xu r4 = r0.getContext()     // Catch: java.lang.Throwable -> L57
            xu r1 = r1.G(r4)     // Catch: java.lang.Throwable -> L57
            j r4 = new j     // Catch: java.lang.Throwable -> L57
            r5 = 15
            r4.<init>(r7, r8, r2, r5)     // Catch: java.lang.Throwable -> L57
            r0.e = r9     // Catch: java.lang.Throwable -> L57
            r0.h = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = defpackage.rx.S(r1, r4, r0)     // Catch: java.lang.Throwable -> L57
            hv r8 = defpackage.hv.e
            if (r7 != r8) goto L53
            return r8
        L53:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5e
        L57:
            r8 = move-exception
            r7 = r9
        L59:
            fo1 r9 = new fo1
            r9.<init>(r8)
        L5e:
            java.lang.Throwable r8 = defpackage.go1.a(r9)
            if (r8 != 0) goto L68
            r7.R(r9)
            goto L74
        L68:
            r7.getClass()
            lp r9 = new lp
            r0 = 0
            r9.<init>(r8, r0)
            r7.R(r9)
        L74:
            od2 r7 = defpackage.od2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.b(nx, z01, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:11:0x0041, B:13:0x0048), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.nx r4, defpackage.wt r5) {
        /*
            boolean r0 = r5 instanceof defpackage.fx
            if (r0 == 0) goto L13
            r0 = r5
            fx r0 = (defpackage.fx) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            fx r0 = new fx
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f
            int r1 = r0.h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            b51 r0 = r0.e
            defpackage.io.K(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            return r3
        L2e:
            defpackage.io.K(r5)
            b51 r5 = r4.d
            r0.e = r5
            r0.h = r2
            java.lang.Object r0 = r5.d(r0)
            hv r1 = defpackage.hv.e
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            int r5 = r4.e     // Catch: java.lang.Throwable -> L57
            int r5 = r5 + r2
            r4.e = r5     // Catch: java.lang.Throwable -> L57
            if (r5 != r2) goto L59
            gv r5 = r4.b     // Catch: java.lang.Throwable -> L57
            yw r1 = new yw     // Catch: java.lang.Throwable -> L57
            r1.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> L57
            r2 = 3
            i22 r5 = defpackage.rx.C(r5, r3, r1, r2)     // Catch: java.lang.Throwable -> L57
            r4.f = r5     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r4 = move-exception
            goto L5f
        L59:
            r0.f(r3)
            od2 r4 = defpackage.od2.a
            return r4
        L5f:
            r0.f(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.c(nx, wt):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r1.s(r0) != r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (r7 == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.nx r6, defpackage.wt r7) {
        /*
            boolean r0 = r7 instanceof defpackage.gx
            if (r0 == 0) goto L13
            r0 = r7
            gx r0 = (defpackage.gx) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            gx r0 = new gx
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f
            int r1 = r0.h
            r2 = 2
            r3 = 1
            hv r4 = defpackage.hv.e
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            int r0 = r0.e
            defpackage.io.K(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            r6 = 0
            return r6
        L35:
            defpackage.io.K(r7)
            goto L49
        L39:
            defpackage.io.K(r7)
            ay1 r7 = r6.g()
            r0.h = r3
            java.lang.Integer r7 = r7.a()
            if (r7 != r4) goto L49
            goto L5b
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            q4 r1 = r6.h     // Catch: java.lang.Throwable -> L5f
            r0.e = r7     // Catch: java.lang.Throwable -> L5f
            r0.h = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r1.s(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r4) goto L5c
        L5b:
            return r4
        L5c:
            od2 r6 = defpackage.od2.a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            rg2 r6 = r6.g
            vk1 r1 = new vk1
            r1.<init>(r7, r0)
            r6.C(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.d(nx, wt):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        if (r11 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.nx r9, boolean r10, defpackage.vt r11) {
        /*
            rg2 r0 = r9.g
            boolean r1 = r11 instanceof defpackage.hx
            if (r1 == 0) goto L15
            r1 = r11
            hx r1 = (defpackage.hx) r1
            int r2 = r1.i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.i = r2
            goto L1a
        L15:
            hx r1 = new hx
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.g
            int r2 = r1.i
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            hv r7 = defpackage.hv.e
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            defpackage.io.K(r11)
            goto La3
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r9)
            return r6
        L37:
            defpackage.io.K(r11)
            goto L8b
        L3b:
            boolean r10 = r1.e
            n22 r2 = r1.f
            defpackage.io.K(r11)
            goto L5f
        L43:
            defpackage.io.K(r11)
            n22 r2 = r0.k()
            boolean r11 = r2 instanceof defpackage.hd2
            if (r11 != 0) goto Lb7
            ay1 r11 = r9.g()
            r1.f = r2
            r1.e = r10
            r1.i = r5
            java.lang.Integer r11 = r11.a()
            if (r11 != r7) goto L5f
            goto La2
        L5f:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r5 = r2 instanceof defpackage.aw
            if (r5 == 0) goto L6f
            r8 = r2
            aw r8 = (defpackage.aw) r8
            int r8 = r8.a
            goto L70
        L6f:
            r8 = -1
        L70:
            if (r5 == 0) goto L75
            if (r11 != r8) goto L75
            return r2
        L75:
            if (r10 == 0) goto L8e
            ay1 r10 = r9.g()
            j4 r11 = new j4
            r11.<init>(r9, r6)
            r1.f = r6
            r1.i = r4
            java.lang.Object r11 = r10.b(r11, r1)
            if (r11 != r7) goto L8b
            goto La2
        L8b:
            xd1 r11 = (defpackage.xd1) r11
            goto La5
        L8e:
            ay1 r10 = r9.g()
            ix r11 = new ix
            r2 = 0
            r11.<init>(r9, r8, r6, r2)
            r1.f = r6
            r1.i = r3
            java.lang.Object r11 = r10.c(r11, r1)
            if (r11 != r7) goto La3
        La2:
            return r7
        La3:
            xd1 r11 = (defpackage.xd1) r11
        La5:
            java.lang.Object r9 = r11.e
            n22 r9 = (defpackage.n22) r9
            java.lang.Object r10 = r11.f
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb6
            r0.C(r9)
        Lb6:
            return r9
        Lb7:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.se.p(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.e(nx, boolean, vt):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        if (r10 != r5) goto L68;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c2 A[Catch: lv -> 0x0097, TryCatch #2 {lv -> 0x0097, blocks: (B:36:0x0092, B:37:0x0114, B:40:0x009c, B:41:0x00f9, B:44:0x00a6, B:45:0x00dd, B:48:0x00ac, B:50:0x00c2, B:51:0x00c6, B:57:0x00b5, B:60:0x00e9), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, ul1, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, wl1, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.nx r8, boolean r9, defpackage.wt r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.f(nx, boolean, wt):java.lang.Object");
    }

    public final ay1 g() {
        return (ay1) this.j.getValue();
    }

    public final Object h(wt wtVar) {
        return ((m91) this.i.getValue()).a(new ax(3, (vt) null), wtVar);
    }

    public final Object i(se0 se0Var, vt vtVar) {
        xd2 xd2Var = (xd2) vtVar.getContext().H(xl1.t);
        if (xd2Var != null) {
            xd2Var.a(this);
        }
        return rx.S(new xd2(xd2Var, this), new l(this, se0Var, null, 11), vtVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, ul1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r10, boolean r11, defpackage.wt r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.lx
            if (r0 == 0) goto L13
            r0 = r12
            lx r0 = (defpackage.lx) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            lx r0 = new lx
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ul1 r9 = r0.e
            defpackage.io.K(r12)
            goto L55
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.io.K(r12)
            ul1 r4 = new ul1
            r4.<init>()
            b52 r12 = r9.i
            java.lang.Object r12 = r12.getValue()
            m91 r12 = (defpackage.m91) r12
            mx r3 = new mx
            r8 = 0
            r5 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.e = r4
            r0.h = r2
            java.lang.Object r9 = r12.b(r3, r0)
            hv r10 = defpackage.hv.e
            if (r9 != r10) goto L54
            return r10
        L54:
            r9 = r4
        L55:
            int r9 = r9.e
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.j(java.lang.Object, boolean, wt):java.lang.Object");
    }
}
