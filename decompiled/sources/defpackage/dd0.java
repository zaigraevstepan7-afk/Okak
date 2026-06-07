package defpackage;

import com.google.protobuf.DescriptorProtos;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dd0 implements cd0 {
    public final xl1 a;
    public final p7 b;
    public final h12 c;
    public final hd0 d;
    public final rg2 e;

    /* JADX WARN: Type inference failed for: r1v0, types: [hd0, java.lang.Object] */
    public dd0(xl1 xl1Var, p7 p7Var) {
        h12 h12Var = ed0.a;
        ?? obj = new Object();
        gd0 gd0Var = hd0.a;
        mg0 mg0Var = j10.a;
        gd0Var.getClass();
        fp.b(go.M(gd0Var, mg0Var).G(j60.e).G(new io0(null)));
        rg2 rg2Var = new rg2(23);
        this.a = xl1Var;
        this.b = p7Var;
        this.c = h12Var;
        this.d = obj;
        this.e = rg2Var;
        new r(this, 15);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f A[Catch: Exception -> 0x0097, TRY_ENTER, TryCatch #2 {Exception -> 0x0097, blocks: (B:25:0x003f, B:27:0x0051, B:30:0x0056, B:32:0x005a, B:33:0x0067, B:48:0x008f, B:49:0x0096, B:51:0x0063), top: B:24:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.nc2 a(defpackage.mc2 r7) {
        /*
            r6 = this;
            h12 r0 = r6.c
            java.lang.Object r1 = r0.f
            wm1 r1 = (defpackage.wm1) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.g     // Catch: java.lang.Throwable -> L3a
            az0 r2 = (defpackage.az0) r2     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L3a
            nc2 r2 = (defpackage.nc2) r2     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L3e
            boolean r3 = r2.f     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.g     // Catch: java.lang.Throwable -> L3a
            az0 r2 = (defpackage.az0) r2     // Catch: java.lang.Throwable -> L3a
            wc0 r3 = r2.c     // Catch: java.lang.Throwable -> L3a
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3a
            hl0 r4 = r2.b     // Catch: java.lang.Throwable -> L34
            r4.getClass()     // Catch: java.lang.Throwable -> L34
            java.util.LinkedHashMap r4 = r4.a     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r4.remove(r7)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L36
            int r5 = r2.d     // Catch: java.lang.Throwable -> L34
            int r5 = r5 + (-1)
            r2.d = r5     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r6 = move-exception
            goto L3c
        L36:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            nc2 r4 = (defpackage.nc2) r4     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r6 = move-exception
            goto La0
        L3c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3a
            throw r6     // Catch: java.lang.Throwable -> L3a
        L3e:
            monitor-exit(r1)
            hd0 r1 = r6.d     // Catch: java.lang.Exception -> L97
            r1.getClass()     // Catch: java.lang.Exception -> L97
            g52 r1 = r7.a     // Catch: java.lang.Exception -> L97
            rg2 r6 = r6.e     // Catch: java.lang.Exception -> L97
            java.lang.Object r6 = r6.f     // Catch: java.lang.Exception -> L97
            int r6 = r7.c     // Catch: java.lang.Exception -> L97
            sd0 r2 = r7.b     // Catch: java.lang.Exception -> L97
            r3 = 0
            if (r1 == 0) goto L63
            boolean r4 = r1 instanceof defpackage.iy     // Catch: java.lang.Exception -> L97
            if (r4 == 0) goto L56
            goto L63
        L56:
            boolean r4 = r1 instanceof defpackage.jf0     // Catch: java.lang.Exception -> L97
            if (r4 == 0) goto L6c
            jf0 r1 = (defpackage.jf0) r1     // Catch: java.lang.Exception -> L97
            java.lang.String r1 = r1.d     // Catch: java.lang.Exception -> L97
            android.graphics.Typeface r6 = defpackage.wc0.h(r1, r2, r6)     // Catch: java.lang.Exception -> L97
            goto L67
        L63:
            android.graphics.Typeface r6 = defpackage.wc0.h(r3, r2, r6)     // Catch: java.lang.Exception -> L97
        L67:
            nc2 r3 = new nc2     // Catch: java.lang.Exception -> L97
            r3.<init>(r6)     // Catch: java.lang.Exception -> L97
        L6c:
            if (r3 == 0) goto L8f
            java.lang.Object r6 = r0.f
            wm1 r6 = (defpackage.wm1) r6
            monitor-enter(r6)
            java.lang.Object r1 = r0.g     // Catch: java.lang.Throwable -> L89
            az0 r1 = (defpackage.az0) r1     // Catch: java.lang.Throwable -> L89
            java.lang.Object r1 = r1.a(r7)     // Catch: java.lang.Throwable -> L89
            if (r1 != 0) goto L8b
            boolean r1 = r3.f     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L8b
            java.lang.Object r0 = r0.g     // Catch: java.lang.Throwable -> L89
            az0 r0 = (defpackage.az0) r0     // Catch: java.lang.Throwable -> L89
            r0.b(r7, r3)     // Catch: java.lang.Throwable -> L89
            goto L8b
        L89:
            r7 = move-exception
            goto L8d
        L8b:
            monitor-exit(r6)
            return r3
        L8d:
            monitor-exit(r6)
            throw r7
        L8f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L97
            java.lang.String r7 = "Could not load font"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L97
            throw r6     // Catch: java.lang.Exception -> L97
        L97:
            r6 = move-exception
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0, r6)
            throw r7
        La0:
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd0.a(mc2):nc2");
    }

    public final nc2 b(g52 g52Var, sd0 sd0Var, int i, int i2) {
        sd0 sd0Var2;
        p7 p7Var = this.b;
        p7Var.getClass();
        int i3 = p7Var.e;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            sd0Var2 = new sd0(go.p(sd0Var.e + i3, 1, DescriptorProtos.Edition.EDITION_2023_VALUE));
        } else {
            sd0Var2 = sd0Var;
        }
        this.a.getClass();
        return a(new mc2(g52Var, sd0Var2, i, i2, null));
    }
}
