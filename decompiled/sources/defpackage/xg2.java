package defpackage;

import java.io.File;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xg2 {
    public final ah2 a;
    public final File b;

    public xg2(File file, ah2 ah2Var) {
        this.a = ah2Var;
        File file2 = new File(file, "vrm_thumbnails");
        file2.mkdirs();
        this.b = file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, int r12, int r13, defpackage.wt r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.wg2
            if (r0 == 0) goto L13
            r0 = r14
            wg2 r0 = (defpackage.wg2) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            wg2 r0 = new wg2
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f
            int r1 = r0.h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L29
            java.io.File r10 = r0.e
            defpackage.io.K(r14)
            goto La3
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r10)
            return r3
        L2f:
            defpackage.io.K(r14)
            java.io.File r14 = new java.io.File
            r14.<init>(r11)
            boolean r1 = r14.isFile()
            if (r1 != 0) goto L3e
            goto La7
        L3e:
            java.io.File r1 = new java.io.File
            java.lang.String r4 = r14.getName()
            r4.getClass()
            long r5 = r14.lastModified()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r4)
            java.lang.String r4 = "_"
            r14.append(r4)
            r14.append(r5)
            r14.append(r4)
            r14.append(r12)
            java.lang.String r4 = "x"
            r14.append(r4)
            r14.append(r13)
            java.lang.String r4 = ".png"
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            java.io.File r4 = r10.b
            r1.<init>(r4, r14)
            boolean r14 = r1.isFile()
            if (r14 == 0) goto L88
            java.lang.String r14 = r1.getAbsolutePath()
            android.graphics.Bitmap r14 = android.graphics.BitmapFactory.decodeFile(r14)
            if (r14 == 0) goto L88
            return r14
        L88:
            r0.e = r1
            r0.h = r2
            ah2 r5 = r10.a
            t70 r10 = r5.a
            de r4 = new de
            r9 = 0
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r14 = defpackage.rx.S(r10, r4, r0)
            hv r10 = defpackage.hv.e
            if (r14 != r10) goto La2
            return r10
        La2:
            r10 = r1
        La3:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            if (r14 != 0) goto La8
        La7:
            return r3
        La8:
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lc1
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Lc1
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> Lb8
            r12 = 100
            r14.compress(r10, r12, r11)     // Catch: java.lang.Throwable -> Lb8
            r11.close()     // Catch: java.lang.Throwable -> Lc1
            return r14
        Lb8:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r0 = move-exception
            r12 = r0
            defpackage.fc2.u(r11, r10)     // Catch: java.lang.Throwable -> Lc1
            throw r12     // Catch: java.lang.Throwable -> Lc1
        Lc1:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg2.a(java.lang.String, int, int, wt):java.lang.Object");
    }
}
