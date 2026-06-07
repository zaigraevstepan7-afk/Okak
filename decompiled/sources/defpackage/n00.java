package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import android.view.ViewConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n00 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Serializable d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public n00(AssetManager assetManager, Executor executor, fj1 fj1Var, String str, File file) {
        ?? r1;
        this.a = false;
        this.b = executor;
        this.c = fj1Var;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            r1 = fc2.u;
        } else if (i != 30) {
            r1 = 0;
        } else {
            r1 = fc2.v;
        }
        this.d = r1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r1v2, types: [tl1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, wl1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.n00 r16, defpackage.at1 r17, defpackage.w21 r18, float r19, float r20, defpackage.wt r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n00.a(n00, at1, w21, float, float, wt):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.n00 r11, defpackage.wl1 r12, defpackage.tl1 r13, defpackage.at1 r14, defpackage.wl1 r15, long r16, defpackage.wt r18) {
        /*
            r0 = r16
            r2 = r18
            boolean r3 = r2 instanceof defpackage.z21
            if (r3 == 0) goto L17
            r3 = r2
            z21 r3 = (defpackage.z21) r3
            int r4 = r3.k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.k = r4
            goto L1c
        L17:
            z21 r3 = new z21
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.j
            int r4 = r3.k
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L3e
            if (r4 != r6) goto L38
            wl1 r11 = r3.i
            at1 r12 = r3.h
            tl1 r0 = r3.g
            wl1 r1 = r3.f
            n00 r3 = r3.e
            defpackage.io.K(r2)
            r7 = r11
            r5 = r12
            r12 = r1
            r11 = r3
            goto L69
        L38:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r11)
            return r5
        L3e:
            defpackage.io.K(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L4a
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L4a:
            vf r2 = new vf
            r4 = 10
            r2.<init>(r11, r5, r4)
            r3.e = r11
            r3.f = r12
            r3.g = r13
            r3.h = r14
            r3.i = r15
            r3.k = r6
            java.lang.Object r2 = defpackage.xp1.r(r0, r2, r3)
            hv r0 = defpackage.hv.e
            if (r2 != r0) goto L66
            return r0
        L66:
            r0 = r13
            r5 = r14
            r7 = r15
        L69:
            w21 r2 = (defpackage.w21) r2
            if (r2 == 0) goto La3
            java.lang.Object r1 = r12.e
            w21 r1 = (defpackage.w21) r1
            boolean r1 = r1.c
            long r3 = r2.a
            long r8 = r2.b
            w21 r10 = new w21
            r18 = r1
            r14 = r3
            r16 = r8
            r13 = r10
            r13.<init>(r14, r16, r18)
            r1 = r13
            r12.e = r1
            long r3 = r5.e(r3)
            float r12 = r5.i(r3)
            r0.e = r12
            r12 = 30
            r1 = 0
            hc r12 = defpackage.c01.a(r1, r1, r12)
            r7.e = r12
            r11.h(r2)
            float r11 = r0.e
            boolean r11 = defpackage.hp.k(r11)
            r11 = r11 ^ r6
            goto La4
        La3:
            r11 = 0
        La4:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n00.b(n00, wl1, tl1, at1, wl1, long, wt):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static w21 g(lk lkVar) {
        w21 w21Var = null;
        lv1 t = yq1.t(new d(new v3(lkVar, 21), 0 == true ? 1 : 0, 3));
        while (t.hasNext()) {
            w21 w21Var2 = (w21) t.next();
            if (w21Var != null) {
                w21Var2 = w21Var.a(w21Var2);
            }
            w21Var = w21Var2;
        }
        return w21Var;
    }

    public float c(ys1 ys1Var, float f) {
        at1 at1Var = (at1) this.b;
        long h = at1Var.h(at1Var.d(f));
        at1 at1Var2 = ys1Var.a;
        return at1Var.g(at1Var.e(at1Var2.c(at1Var2.k, h, 1)));
    }

    public boolean d(jh1 jh1Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) ((rg2) this.c).f;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = jh1Var.a;
        z81 z81Var = new z81(0L);
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            j = z81Var.a;
            if (i >= size) {
                break;
            }
            z81Var = new z81(z81.e(j, ((qh1) list.get(i)).j));
            i++;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        at1 at1Var = (at1) this.b;
        float i2 = at1Var.i(at1Var.e(floatToRawIntBits));
        if (i2 != 0.0f) {
            us1 us1Var = at1Var.a;
            if (i2 > 0.0f) {
                z = us1Var.c();
            } else {
                z = us1Var.b();
            }
        }
        if (z) {
            return !(((lk) this.f).j(new w21(floatToRawIntBits, ((qh1) wn.g0(jh1Var.a)).b, false)) instanceof nm);
        }
        return this.a;
    }

    public FileInputStream e(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((fj1) this.c).a();
                return null;
            }
            return null;
        }
    }

    public void f(int i, Serializable serializable) {
        ((Executor) this.b).execute(new wp(this, i, 2, serializable));
    }

    public void h(w21 w21Var) {
        sl0 sl0Var = (sl0) this.h;
        long j = w21Var.b;
        long j2 = w21Var.a;
        ((af2) sl0Var.e).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((af2) sl0Var.f).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.at1 r6, defpackage.y21 r7, defpackage.wt r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.a31
            if (r0 == 0) goto L13
            r0 = r8
            a31 r0 = (defpackage.a31) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            a31 r0 = new a31
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L27
            defpackage.io.K(r8)
            goto L4b
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            return r3
        L2d:
            defpackage.io.K(r8)
            r5.a = r4
            b31 r8 = new b31
            r8.<init>(r6, r7, r3, r2)
            r0.g = r4
            g42 r6 = new g42
            xu r7 = r0.getContext()
            r6.<init>(r0, r7)
            java.lang.Object r6 = defpackage.xq1.t(r6, r6, r8)
            hv r7 = defpackage.hv.e
            if (r6 != r7) goto L4b
            return r7
        L4b:
            r5.a = r2
            od2 r5 = defpackage.od2.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n00.i(at1, y21, wt):java.lang.Object");
    }

    public n00(at1 at1Var, rg2 rg2Var, eq eqVar, c00 c00Var) {
        this.b = at1Var;
        this.c = rg2Var;
        this.d = eqVar;
        this.e = c00Var;
        this.f = sn0.c(Integer.MAX_VALUE, 6, null);
        this.h = new sl0(16);
    }
}
