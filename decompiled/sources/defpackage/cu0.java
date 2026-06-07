package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cu0 {
    public final y7 a;
    public final sl0 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public i82 j;
    public w82 k;
    public c91 l;
    public pl1 m;
    public pl1 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = d01.a();
    public final Matrix q = new Matrix();

    public cu0(y7 y7Var, sl0 sl0Var) {
        this.a = y7Var;
        this.b = sl0Var;
    }

    public final void a() {
        float f;
        float f2;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        sl0 sl0Var = this.b;
        InputMethodManager t = sl0Var.t();
        View view = (View) sl0Var.e;
        if (t.isActive(view) && this.j != null && this.l != null && this.k != null && this.m != null && this.n != null) {
            float[] fArr = this.p;
            d01.d(fArr);
            iq0 iq0Var = (iq0) this.a.e.v.getValue();
            if (iq0Var != null) {
                if (!iq0Var.j()) {
                    iq0Var = null;
                }
                if (iq0Var != null) {
                    iq0Var.k(fArr);
                }
            }
            pl1 pl1Var = this.n;
            pl1Var.getClass();
            float f3 = -pl1Var.a;
            pl1 pl1Var2 = this.n;
            pl1Var2.getClass();
            d01.i(fArr, f3, -pl1Var2.b);
            Matrix matrix = this.q;
            mp0.L(matrix, fArr);
            i82 i82Var = this.j;
            i82Var.getClass();
            long j = i82Var.b;
            c91 c91Var = this.l;
            c91Var.getClass();
            w82 w82Var = this.k;
            w82Var.getClass();
            g31 g31Var = w82Var.b;
            pl1 pl1Var3 = this.m;
            pl1Var3.getClass();
            float f4 = pl1Var3.d;
            float f5 = pl1Var3.b;
            pl1 pl1Var4 = this.n;
            pl1Var4.getClass();
            boolean z2 = this.f;
            boolean z3 = this.g;
            boolean z4 = this.h;
            boolean z5 = this.i;
            CursorAnchorInfo.Builder builder = this.o;
            builder.reset();
            builder.setMatrix(matrix);
            d92 d92Var = i82Var.c;
            int f6 = d92.f(j);
            builder.setSelectionRange(f6, d92.e(j));
            um1 um1Var = um1.f;
            if (z2 && f6 >= 0) {
                int d = c91Var.d(f6);
                pl1 c = w82Var.c(d);
                f = f4;
                f2 = f5;
                float o = go.o(c.a, 0.0f, (int) (w82Var.c >> 32));
                boolean q = vn.q(pl1Var3, o, c.b);
                boolean q2 = vn.q(pl1Var3, o, c.d);
                if (w82Var.a(d) == um1Var) {
                    z = true;
                } else {
                    z = false;
                }
                if (!q && !q2) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
                if (!q || !q2) {
                    i6 |= 2;
                }
                if (z) {
                    i6 |= 4;
                }
                float f7 = c.b;
                float f8 = c.d;
                builder.setInsertionMarkerLocation(o, f7, f8, f8, i6);
            } else {
                f = f4;
                f2 = f5;
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z3) {
                int i7 = -1;
                if (d92Var != null) {
                    i = d92.f(d92Var.a);
                } else {
                    i = -1;
                }
                if (d92Var != null) {
                    i7 = d92.e(d92Var.a);
                }
                if (i >= 0 && i < i7) {
                    builder2.setComposingText(i, i82Var.a.f.subSequence(i, i7));
                    int d2 = c91Var.d(i);
                    int d3 = c91Var.d(i7);
                    float[] fArr2 = new float[(d3 - d2) * 4];
                    g31Var.a(fr1.a(d2, d3), fArr2);
                    while (i < i7) {
                        int d4 = c91Var.d(i);
                        int i8 = (d4 - d2) * 4;
                        float f9 = fArr2[i8];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f10 = fArr2[i8 + 1];
                        int i9 = d2;
                        float f11 = fArr2[i8 + 2];
                        float f12 = fArr2[i8 + 3];
                        int i10 = i7;
                        if (pl1Var3.a < f11) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (f9 < pl1Var3.c) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        int i11 = i2 & i3;
                        if (f2 < f12) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        int i12 = i11 & i4;
                        if (f10 < f) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        int i13 = i12 & i5;
                        if (!vn.q(pl1Var3, f9, f10) || !vn.q(pl1Var3, f11, f12)) {
                            i13 |= 2;
                        }
                        if (w82Var.a(d4) == um1Var) {
                            i13 |= 4;
                        }
                        int i14 = i;
                        builder3.addCharacterBounds(i14, f9, f10, f11, f12, i13);
                        builder2 = builder3;
                        i = i14 + 1;
                        d2 = i9;
                        i7 = i10;
                    }
                }
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 33 && z4) {
                editorBounds = d1.j().setEditorBounds(fp.X(pl1Var4));
                handwritingBounds = editorBounds.setHandwritingBounds(fp.X(pl1Var4));
                build = handwritingBounds.build();
                builder2.setEditorBoundsInfo(build);
            }
            if (i15 >= 34 && z5 && !pl1Var3.f()) {
                int i16 = g31Var.f - 1;
                if (i16 < 0) {
                    i16 = 0;
                }
                int p = go.p(g31Var.e(f2), 0, i16);
                int p2 = go.p(g31Var.e(f), 0, i16);
                if (p <= p2) {
                    while (true) {
                        builder2.addVisibleLineBounds(w82Var.d(p), g31Var.f(p), w82Var.e(p), g31Var.b(p));
                        if (p == p2) {
                            break;
                        } else {
                            p++;
                        }
                    }
                }
            }
            sl0Var.t().updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
