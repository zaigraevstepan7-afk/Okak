package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vj1 {
    public final ArrayList a = new ArrayList();
    public final e52 b;
    public yl0 c;
    public yl0 d;
    public int e;
    public boolean f;

    public vj1(e52 e52Var, ArrayList arrayList) {
        yl0 yl0Var = yl0.e;
        this.c = yl0Var;
        this.d = yl0Var;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = e52Var.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            yl0 yl0Var2 = e52Var.c;
            yl0 yl0Var3 = e52Var.d;
            this.c = yl0Var2;
            this.d = yl0Var3;
            c();
            b(e52Var.e);
        }
        this.b = e52Var;
    }

    public final void a(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ko koVar = (ko) list.get(i);
            koVar.getClass();
            if (true == z) {
                vj1 vj1Var = koVar.e;
                if (vj1Var == null) {
                    koVar.e = this;
                    this.a.add(koVar);
                } else {
                    throw new IllegalStateException(koVar + " is already controlled by " + vj1Var);
                }
            }
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ko koVar = (ko) arrayList.get(size);
            if (!koVar.g) {
                ColorDrawable colorDrawable = koVar.f;
                if (koVar.h != i) {
                    koVar.h = i;
                    colorDrawable.setColor(i);
                    uj1 uj1Var = koVar.b;
                    uj1Var.e = colorDrawable;
                    sl0 sl0Var = uj1Var.i;
                    if (sl0Var != null) {
                        ((View) sl0Var.e).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i;
        yl0 b;
        boolean z;
        float f;
        ArrayList arrayList = this.a;
        yl0 yl0Var = yl0.e;
        yl0 yl0Var2 = yl0Var;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ko koVar = (ko) arrayList.get(size);
            yl0 yl0Var3 = this.c;
            yl0 yl0Var4 = this.d;
            koVar.c = yl0Var3;
            uj1 uj1Var = koVar.b;
            koVar.d = yl0Var4;
            if (!uj1Var.c.equals(yl0Var2)) {
                uj1Var.c = yl0Var2;
                sl0 sl0Var = uj1Var.i;
                if (sl0Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sl0Var.f;
                    layoutParams.leftMargin = yl0Var2.a;
                    layoutParams.topMargin = yl0Var2.b;
                    layoutParams.rightMargin = yl0Var2.c;
                    layoutParams.bottomMargin = yl0Var2.d;
                    ((View) sl0Var.e).setLayoutParams(layoutParams);
                }
            }
            int i2 = koVar.a;
            int i3 = 4;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 8) {
                            b = yl0Var;
                            i = 0;
                        } else {
                            i = koVar.c.d;
                            int i4 = koVar.d.d;
                            if (uj1Var.b != i4) {
                                uj1Var.b = i4;
                                sl0 sl0Var2 = uj1Var.i;
                                if (sl0Var2 != null) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) sl0Var2.f;
                                    layoutParams2.height = i4;
                                    ((View) sl0Var2.e).setLayoutParams(layoutParams2);
                                }
                            }
                            b = yl0.b(0, 0, 0, i);
                        }
                    } else {
                        i = koVar.c.c;
                        int i5 = koVar.d.c;
                        if (uj1Var.a != i5) {
                            uj1Var.a = i5;
                            sl0 sl0Var3 = uj1Var.i;
                            if (sl0Var3 != null) {
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) sl0Var3.f;
                                layoutParams3.width = i5;
                                ((View) sl0Var3.e).setLayoutParams(layoutParams3);
                            }
                        }
                        b = yl0.b(0, 0, i, 0);
                    }
                } else {
                    i = koVar.c.b;
                    int i6 = koVar.d.b;
                    if (uj1Var.b != i6) {
                        uj1Var.b = i6;
                        sl0 sl0Var4 = uj1Var.i;
                        if (sl0Var4 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) sl0Var4.f;
                            layoutParams4.height = i6;
                            ((View) sl0Var4.e).setLayoutParams(layoutParams4);
                        }
                    }
                    b = yl0.b(0, i, 0, 0);
                }
            } else {
                i = koVar.c.a;
                int i7 = koVar.d.a;
                if (uj1Var.a != i7) {
                    uj1Var.a = i7;
                    sl0 sl0Var5 = uj1Var.i;
                    if (sl0Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) sl0Var5.f;
                        layoutParams5.width = i7;
                        ((View) sl0Var5.e).setLayoutParams(layoutParams5);
                    }
                }
                b = yl0.b(i, 0, 0, 0);
            }
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (uj1Var.d != z) {
                uj1Var.d = z;
                sl0 sl0Var6 = uj1Var.i;
                if (sl0Var6 != null) {
                    View view = (View) sl0Var6.e;
                    if (z) {
                        i3 = 0;
                    }
                    view.setVisibility(i3);
                }
            }
            float f2 = 0.0f;
            if (i > 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            koVar.a(f);
            if (i > 0) {
                f2 = 1.0f;
            }
            koVar.b(f2);
            yl0Var2 = yl0.b(Math.max(yl0Var2.a, b.a), Math.max(yl0Var2.b, b.b), Math.max(yl0Var2.c, b.c), Math.max(yl0Var2.d, b.d));
        }
    }
}
