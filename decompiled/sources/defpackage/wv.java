package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wv {
    public final q5 a;
    public final ld b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public i82 j;
    public w82 k;
    public c91 l;
    public pl1 n;
    public pl1 o;
    public final Object c = new Object();
    public oe0 m = i5.v;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = d01.a();
    public final Matrix r = new Matrix();

    public wv(q5 q5Var, ld ldVar) {
        this.a = q5Var;
        this.b = ldVar;
    }

    public final void a() {
        View view;
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
        ld ldVar = this.b;
        rr0 rr0Var = (rr0) ldVar.g;
        InputMethodManager inputMethodManager = (InputMethodManager) rr0Var.getValue();
        View view2 = (View) ldVar.f;
        if (!inputMethodManager.isActive(view2)) {
            return;
        }
        oe0 oe0Var = this.m;
        float[] fArr = this.q;
        oe0Var.invoke(new d01(fArr));
        this.a.r(fArr);
        Matrix matrix = this.r;
        mp0.L(matrix, fArr);
        i82 i82Var = this.j;
        i82Var.getClass();
        long j = i82Var.b;
        c91 c91Var = this.l;
        c91Var.getClass();
        w82 w82Var = this.k;
        w82Var.getClass();
        g31 g31Var = w82Var.b;
        pl1 pl1Var = this.n;
        pl1Var.getClass();
        float f = pl1Var.d;
        float f2 = pl1Var.b;
        pl1 pl1Var2 = this.o;
        pl1Var2.getClass();
        boolean z2 = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        boolean z5 = this.i;
        CursorAnchorInfo.Builder builder = this.p;
        builder.reset();
        builder.setMatrix(matrix);
        d92 d92Var = i82Var.c;
        int f3 = d92.f(j);
        builder.setSelectionRange(f3, d92.e(j));
        um1 um1Var = um1.f;
        if (z2 && f3 >= 0) {
            int d = c91Var.d(f3);
            pl1 c = w82Var.c(d);
            view = view2;
            float o = go.o(c.a, 0.0f, (int) (w82Var.c >> 32));
            boolean v = go.v(pl1Var, o, c.b);
            boolean v2 = go.v(pl1Var, o, c.d);
            if (w82Var.a(d) == um1Var) {
                z = true;
            } else {
                z = false;
            }
            if (!v && !v2) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            if (!v || !v2) {
                i6 |= 2;
            }
            if (z) {
                i6 |= 4;
            }
            float f4 = c.b;
            float f5 = c.d;
            builder.setInsertionMarkerLocation(o, f4, f5, f5, i6);
        } else {
            view = view2;
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
                    float f6 = fArr2[i8];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f7 = fArr2[i8 + 1];
                    int i9 = i7;
                    float f8 = fArr2[i8 + 2];
                    float f9 = fArr2[i8 + 3];
                    int i10 = i;
                    if (pl1Var.a < f8) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (f6 < pl1Var.c) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    int i11 = i2 & i3;
                    if (f2 < f9) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    int i12 = i11 & i4;
                    if (f7 < f) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    int i13 = i12 & i5;
                    if (!go.v(pl1Var, f6, f7) || !go.v(pl1Var, f8, f9)) {
                        i13 |= 2;
                    }
                    if (w82Var.a(d4) == um1Var) {
                        i13 |= 4;
                    }
                    builder3.addCharacterBounds(i10, f6, f7, f8, f9, i13);
                    builder2 = builder3;
                    i = i10 + 1;
                    i7 = i9;
                }
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33 && z4) {
            editorBounds = d1.j().setEditorBounds(fp.X(pl1Var2));
            handwritingBounds = editorBounds.setHandwritingBounds(fp.X(pl1Var2));
            build = handwritingBounds.build();
            builder2.setEditorBoundsInfo(build);
        }
        if (i14 >= 34 && z5 && !pl1Var.f()) {
            int i15 = g31Var.f - 1;
            if (i15 < 0) {
                i15 = 0;
            }
            int p = go.p(g31Var.e(f2), 0, i15);
            int p2 = go.p(g31Var.e(f), 0, i15);
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
        ((InputMethodManager) rr0Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
        this.e = false;
    }
}
