package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ca extends TextPaint {
    public f8 a;
    public x62 b;
    public int c;
    public hw1 d;
    public co e;
    public ck f;
    public j00 g;
    public fy1 h;
    public d40 i;

    public final f8 a() {
        f8 f8Var = this.a;
        if (f8Var != null) {
            return f8Var;
        }
        f8 f8Var2 = new f8(this);
        this.a = f8Var2;
        return f8Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().d(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r1 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ck r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof defpackage.i12
            if (r1 == 0) goto L1d
            i12 r6 = (defpackage.i12) r6
            long r6 = r6.a
            long r6 = defpackage.yq1.v(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof defpackage.fw1
            if (r1 == 0) goto L73
            ck r1 = r5.f
            boolean r1 = defpackage.sn0.r(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            fy1 r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = defpackage.fy1.a(r3, r7)
        L36:
            if (r1 != 0) goto L5a
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L43
            r1 = 1
            goto L44
        L43:
            r1 = r2
        L44:
            if (r1 == 0) goto L5a
            r5.f = r6
            fy1 r1 = new fy1
            r1.<init>(r7)
            r5.h = r1
            ba r1 = new ba
            r1.<init>(r6, r2, r7)
            j00 r6 = defpackage.fr1.h(r1)
            r5.g = r6
        L5a:
            f8 r6 = r5.a()
            j00 r7 = r5.g
            if (r7 == 0) goto L69
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L6a
        L69:
            r7 = r0
        L6a:
            r6.h(r7)
            r5.e = r0
            defpackage.bf.a0(r5, r9)
            return
        L73:
            defpackage.se.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.c(ck, long, float):void");
    }

    public final void d(long j) {
        boolean c;
        co coVar = this.e;
        boolean z = false;
        if (coVar == null) {
            c = false;
        } else {
            c = co.c(coVar.a, j);
        }
        if (!c) {
            if (j != 16) {
                z = true;
            }
            if (z) {
                this.e = new co(j);
                setColor(go.U(j));
                this.g = null;
                this.f = null;
                this.h = null;
                setShader(null);
            }
        }
    }

    public final void e(d40 d40Var) {
        if (d40Var != null && !sn0.r(this.i, d40Var)) {
            this.i = d40Var;
            if (d40Var.equals(o90.a)) {
                setStyle(Paint.Style.FILL);
                return;
            }
            if (d40Var instanceof q32) {
                a().l(1);
                q32 q32Var = (q32) d40Var;
                a().k(q32Var.a);
                f8 a = a();
                ((Paint) a.b).setStrokeMiter(q32Var.b);
                a().j(q32Var.d);
                a().i(q32Var.c);
                ((Paint) a().b).setPathEffect(null);
                return;
            }
            se.m();
        }
    }

    public final void f(hw1 hw1Var) {
        if (hw1Var != null && !sn0.r(this.d, hw1Var)) {
            this.d = hw1Var;
            if (hw1Var.equals(hw1.d)) {
                clearShadowLayer();
                return;
            }
            hw1 hw1Var2 = this.d;
            float f = hw1Var2.c;
            if (f == 0.0f) {
                f = Float.MIN_VALUE;
            }
            setShadowLayer(f, Float.intBitsToFloat((int) (hw1Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), go.U(this.d.a));
        }
    }

    public final void g(x62 x62Var) {
        boolean z;
        if (x62Var != null && !sn0.r(this.b, x62Var)) {
            this.b = x62Var;
            int i = x62Var.a;
            boolean z2 = false;
            if ((i | 1) == i) {
                z = true;
            } else {
                z = false;
            }
            setUnderlineText(z);
            int i2 = this.b.a;
            if ((i2 | 2) == i2) {
                z2 = true;
            }
            setStrikeThruText(z2);
        }
    }
}
