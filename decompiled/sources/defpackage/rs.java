package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class rs {
    public final po a;
    public final po b;
    public final po c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rs(defpackage.po r9, defpackage.po r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.io.u(r0, r2)
            if (r0 == 0) goto L12
            po r0 = defpackage.qo.e(r9)
            goto L13
        L12:
            r0 = r9
        L13:
            long r4 = r10.b
            boolean r1 = defpackage.io.u(r4, r2)
            if (r1 == 0) goto L20
            po r1 = defpackage.qo.e(r10)
            goto L21
        L20:
            r1 = r10
        L21:
            float[] r4 = defpackage.mp0.C
            r5 = 3
            if (r11 != r5) goto L6c
            long r6 = r9.b
            boolean r11 = defpackage.io.u(r6, r2)
            long r6 = r10.b
            boolean r2 = defpackage.io.u(r6, r2)
            if (r11 == 0) goto L37
            if (r2 == 0) goto L37
            goto L6c
        L37:
            if (r11 != 0) goto L3b
            if (r2 == 0) goto L6c
        L3b:
            if (r11 == 0) goto L3e
            goto L3f
        L3e:
            r9 = r10
        L3f:
            po1 r9 = (defpackage.po1) r9
            jh2 r9 = r9.d
            if (r11 == 0) goto L4a
            float[] r11 = r9.a()
            goto L4b
        L4a:
            r11 = r4
        L4b:
            if (r2 == 0) goto L51
            float[] r4 = r9.a()
        L51:
            r9 = 0
            r2 = r11[r9]
            r3 = r4[r9]
            float r2 = r2 / r3
            r3 = 1
            r6 = r11[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r11 = r11[r7]
            r4 = r4[r7]
            float r11 = r11 / r4
            float[] r4 = new float[r5]
            r4[r9] = r2
            r4[r3] = r6
            r4[r7] = r11
            goto L6d
        L6c:
            r4 = 0
        L6d:
            r8.<init>(r10, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs.<init>(po, po, int):void");
    }

    public long a(long j) {
        float h = co.h(j);
        float g = co.g(j);
        float e = co.e(j);
        float d = co.d(j);
        po poVar = this.b;
        long d2 = poVar.d(h, g, e);
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float e2 = poVar.e(h, g, e);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.c.f(f, f2, e2, d, this.a);
    }

    public rs(po poVar, po poVar2, po poVar3, float[] fArr) {
        this.a = poVar;
        this.b = poVar2;
        this.c = poVar3;
        this.d = fArr;
    }
}
