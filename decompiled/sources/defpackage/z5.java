package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z5 implements ViewTranslationCallback {
    public static final z5 a = new Object();

    public final boolean onClearTranslation(View view) {
        de0 de0Var;
        view.getClass();
        p6 contentCaptureManager$ui = ((q5) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.j = m6.e;
        vm0 f = contentCaptureManager$ui.f();
        Object[] objArr = f.c;
        long[] jArr = f.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            i41 i41Var = ((tu1) objArr[(i << 3) + i3]).a.d.e;
                            Object g = i41Var.g(vu1.D);
                            Object obj = null;
                            if (g == null) {
                                g = null;
                            }
                            if (g != null) {
                                Object g2 = i41Var.g(lu1.n);
                                if (g2 != null) {
                                    obj = g2;
                                }
                                s0 s0Var = (s0) obj;
                                if (s0Var != null && (de0Var = (de0) s0Var.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onHideTranslation(View view) {
        oe0 oe0Var;
        view.getClass();
        p6 contentCaptureManager$ui = ((q5) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.j = m6.e;
        vm0 f = contentCaptureManager$ui.f();
        Object[] objArr = f.c;
        long[] jArr = f.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            i41 i41Var = ((tu1) objArr[(i << 3) + i3]).a.d.e;
                            Object g = i41Var.g(vu1.D);
                            Object obj = null;
                            if (g == null) {
                                g = null;
                            }
                            if (sn0.r(g, Boolean.TRUE)) {
                                Object g2 = i41Var.g(lu1.m);
                                if (g2 != null) {
                                    obj = g2;
                                }
                                s0 s0Var = (s0) obj;
                                if (s0Var != null && (oe0Var = (oe0) s0Var.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onShowTranslation(View view) {
        oe0 oe0Var;
        view.getClass();
        p6 contentCaptureManager$ui = ((q5) view).getContentCaptureManager$ui();
        contentCaptureManager$ui.getClass();
        contentCaptureManager$ui.j = m6.f;
        vm0 f = contentCaptureManager$ui.f();
        Object[] objArr = f.c;
        long[] jArr = f.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            i41 i41Var = ((tu1) objArr[(i << 3) + i3]).a.d.e;
                            Object g = i41Var.g(vu1.D);
                            Object obj = null;
                            if (g == null) {
                                g = null;
                            }
                            if (sn0.r(g, Boolean.FALSE)) {
                                Object g2 = i41Var.g(lu1.m);
                                if (g2 != null) {
                                    obj = g2;
                                }
                                s0 s0Var = (s0) obj;
                                if (s0Var != null && (oe0Var = (oe0) s0Var.b) != null) {
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return true;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}
