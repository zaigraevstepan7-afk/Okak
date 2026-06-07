package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class lh0 {
    public static final am1 a = new am1("^\\[[^\\]]+-(VERBOSE|DEBUG|INFO|WARN|ERROR|FATAL|ASSERT)\\]");

    public static final void a(final sh0 sh0Var, final de0 de0Var, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        final boolean z2;
        de0 de0Var2 = de0Var;
        ur urVar2 = urVar;
        sh0Var.getClass();
        de0Var2.getClass();
        urVar2.Y(727151360);
        if (urVar2.f(sh0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (urVar2.h(de0Var2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar2.O(i5 & 1, z)) {
            final h32 c = jx0.c(urVar2);
            boolean z3 = sh0Var instanceof ph0;
            if (!z3 && !(sh0Var instanceof nh0) && !(sh0Var instanceof mh0) && !(sh0Var instanceof rh0)) {
                urVar2.X(-1242542334);
                urVar2.p(false);
            } else {
                urVar2.X(-1248364072);
                ex1 f = x11.f(6, 2, urVar2);
                final sk0 j = go.j(go.O(null, urVar2, 1), 0.0f, 360.0f, mp0.y(mp0.P(4000, 2, y40.c), 6), null, urVar2, 4536, 8);
                if (!z3 && !(sh0Var instanceof mh0) && !(sh0Var instanceof rh0)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                de0Var2 = de0Var;
                x11.a(de0Var2, null, f, 0.0f, false, null, 0L, 0L, 0L, null, null, null, go.N(464477945, new te0() { // from class: dh0
                    /* JADX WARN: Removed duplicated region for block: B:33:0x03d6  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x0413  */
                    @Override // defpackage.te0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r47, java.lang.Object r48, java.lang.Object r49) {
                        /*
                            Method dump skipped, instructions count: 1518
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }, urVar2), urVar, (i5 >> 3) & 14, 8186);
                urVar2 = urVar;
                urVar2.p(false);
            }
        } else {
            urVar2.R();
        }
        dl1 r = urVar2.r();
        if (r != null) {
            r.d = new u2(sh0Var, i, 14, de0Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c3, code lost:
    
        if (r4 == r3) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.bi0 r31, defpackage.de0 r32, defpackage.ur r33, int r34) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh0.b(bi0, de0, ur, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r4.equals("ASSERT") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        r3 = r3.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r4.equals("FATAL") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r4.equals("ERROR") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r24, defpackage.ur r25, int r26) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh0.c(java.lang.String, ur, int):void");
    }
}
