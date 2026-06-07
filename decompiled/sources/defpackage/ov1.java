package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ov1 implements ga0, he, te2, rh2 {
    public final /* synthetic */ int e;
    public Object f;

    public ov1(long[] jArr) {
        s31 s31Var;
        this.e = 2;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            s31Var = new s31(copyOf.length);
            int i = s31Var.b;
            if (i >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i;
                    long[] jArr2 = s31Var.a;
                    if (jArr2.length < length) {
                        s31Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = s31Var.a;
                    int i2 = s31Var.b;
                    if (i != i2) {
                        bf.C(jArr3, jArr3, copyOf.length + i, i, i2);
                    }
                    bf.C(copyOf, jArr3, i, 0, copyOf.length);
                    s31Var.b += copyOf.length;
                }
            } else {
                se.u("");
                throw null;
            }
        } else {
            s31Var = new s31(16);
        }
        this.f = s31Var;
    }

    @Override // defpackage.te2, defpackage.qe2
    public boolean a() {
        ((q4) this.f).getClass();
        return false;
    }

    @Override // defpackage.qe2
    public long b(mc mcVar, mc mcVar2, mc mcVar3) {
        return ((q4) this.f).b(mcVar, mcVar2, mcVar3);
    }

    @Override // defpackage.ga0
    public float c() {
        return 0.0f;
    }

    @Override // defpackage.ga0
    public float d(float f, float f2, long j) {
        float f3;
        long j2 = j / 1000000;
        aa0 a = ((ua) this.f).a(f2);
        long j3 = a.c;
        if (j3 > 0) {
            f3 = ((float) j2) / ((float) j3);
        } else {
            f3 = 1.0f;
        }
        return (Math.signum(a.a) * a.b * o7.a(f3).a) + f;
    }

    @Override // defpackage.he
    public Object e(ds1 ds1Var, Float f, Float f2, oe0 oe0Var, b02 b02Var) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object d = xp1.d(ds1Var, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, c01.a(0.0f, floatValue2, 28), (gc) this.f, oe0Var, b02Var);
        if (d == hv.e) {
            return d;
        }
        return (dc) d;
    }

    public long f(long j) {
        jz jzVar = (jz) this.f;
        jzVar.getClass();
        if (ye2.b(j) <= 0.0f || ye2.c(j) <= 0.0f) {
            kl0.b("maximumVelocity should be a positive value. You specified=" + ((Object) ye2.g(j)));
        }
        return xq1.c(jzVar.a.b(ye2.b(j)), jzVar.b.b(ye2.c(j)));
    }

    @Override // defpackage.ga0
    public long g(float f) {
        return ((long) (Math.exp(((ua) this.f).b(f) / (ba0.a - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.qe2
    public mc h(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        return ((q4) this.f).h(j, mcVar, mcVar2, mcVar3);
    }

    @Override // defpackage.ga0
    public float i(float f, float f2) {
        double b = ((ua) this.f).b(f2);
        double d = ba0.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * b) * r8.e * r8.f))) + f;
    }

    @Override // defpackage.ga0
    public float j(long j, float f) {
        float f2;
        long j2 = j / 1000000;
        aa0 a = ((ua) this.f).a(f);
        long j3 = a.c;
        if (j3 > 0) {
            f2 = ((float) j2) / ((float) j3);
        } else {
            f2 = 1.0f;
        }
        return (((Math.signum(a.a) * o7.a(f2).b) * a.b) / ((float) j3)) * 1000.0f;
    }

    public ea0 k(int i) {
        switch (this.e) {
            case 8:
                return ((ka0[]) this.f)[i];
            case 9:
                return (ka0) this.f;
            default:
                return (ea0) this.f;
        }
    }

    public void l(boolean z) {
        h12 h12Var = (h12) this.f;
        WindowInsetsController windowInsetsController = (WindowInsetsController) h12Var.f;
        Window window = (Window) h12Var.g;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    public void n(boolean z) {
        h12 h12Var = (h12) this.f;
        WindowInsetsController windowInsetsController = (WindowInsetsController) h12Var.f;
        Window window = (Window) h12Var.g;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | SharedConstants.DefaultBufferSize);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // defpackage.qe2
    public mc p(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        return ((q4) this.f).p(j, mcVar, mcVar2, mcVar3);
    }

    @Override // defpackage.qe2
    public mc q(mc mcVar, mc mcVar2, mc mcVar3) {
        return ((q4) this.f).q(mcVar, mcVar2, mcVar3);
    }

    public ov1(c00 c00Var) {
        this.e = 4;
        this.f = new ua(d22.a, c00Var);
    }

    public ov1(yi2 yi2Var, mh2 mh2Var, wm1 wm1Var) {
        this.e = 15;
        this.f = mh2Var;
    }

    public ov1(lq1 lq1Var) {
        this.e = 14;
        this.f = new WeakReference(lq1Var);
    }

    public ov1(View view) {
        this.e = 3;
        this.f = new h12(view);
    }

    public ov1(int i) {
        this.e = i;
        switch (i) {
            case 12:
                this.f = new jz();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ ov1(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    public ov1(Window window, View view) {
        this.e = 17;
        if (Build.VERSION.SDK_INT >= 35) {
            this.f = new h12(window);
        } else {
            this.f = new h12(window);
        }
    }

    public ov1(float f, float f2, mc mcVar) {
        ov1 ov1Var;
        this.e = 11;
        int[] iArr = re2.a;
        if (mcVar != null) {
            ov1Var = new ov1(mcVar, f, f2);
        } else {
            ov1Var = new ov1(f, f2);
        }
        this.f = new q4(ov1Var);
    }

    public ov1(mc mcVar, float f, float f2) {
        this.e = 8;
        int b = mcVar.b();
        ka0[] ka0VarArr = new ka0[b];
        for (int i = 0; i < b; i++) {
            ka0VarArr[i] = new ka0(f, f2, mcVar.a(i));
        }
        this.f = ka0VarArr;
    }

    public ov1(float f, float f2) {
        this.e = 9;
        this.f = new ka0(f, f2, 0.01f);
    }
}
