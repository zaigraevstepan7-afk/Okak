package defpackage;

import android.graphics.RectF;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d52 extends uh2 {
    public final HashMap f;
    public final /* synthetic */ e52 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d52(e52 e52Var) {
        super(0);
        this.g = e52Var;
        this.f = new HashMap();
    }

    @Override // defpackage.uh2
    public final void a(wh2 wh2Var) {
        boolean z;
        ArrayList arrayList = this.g.b;
        if ((((WindowInsetsAnimation) wh2Var.a.f).getTypeMask() & 519) != 0) {
            this.f.remove(wh2Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vj1 vj1Var = (vj1) arrayList.get(size);
                int i = vj1Var.e;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = i - 1;
                vj1Var.e = i2;
                if (z && i2 == 0) {
                    vj1Var.c();
                }
            }
        }
    }

    @Override // defpackage.uh2
    public final void c(wh2 wh2Var) {
        ArrayList arrayList = this.g.b;
        if ((((WindowInsetsAnimation) wh2Var.a.f).getTypeMask() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vj1) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.uh2
    public final ni2 d(ni2 ni2Var, List list) {
        ArrayList arrayList = this.g.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            wh2 wh2Var = (wh2) list.get(size);
            Integer num = (Integer) this.f.get(wh2Var);
            if (num != null) {
                int intValue = num.intValue();
                float alpha = ((WindowInsetsAnimation) wh2Var.a.f).getAlpha();
                if ((intValue & 1) != 0) {
                    rectF.left = alpha;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = alpha;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = alpha;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = alpha;
                }
                i |= intValue;
            }
        }
        ji2 ji2Var = ni2Var.a;
        yl0 a = yl0.a(ji2Var.f(519), ji2Var.f(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            vj1 vj1Var = (vj1) arrayList.get(size2);
            yl0 yl0Var = vj1Var.d;
            ArrayList arrayList2 = vj1Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ko koVar = (ko) arrayList2.get(size3);
                int i2 = koVar.a;
                if ((i2 & i) != 0) {
                    uj1 uj1Var = koVar.b;
                    if (!uj1Var.d) {
                        uj1Var.d = true;
                        sl0 sl0Var = uj1Var.i;
                        if (sl0Var != null) {
                            ((View) sl0Var.e).setVisibility(0);
                        }
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 4) {
                                if (i2 == 8) {
                                    int i3 = yl0Var.d;
                                    if (i3 > 0) {
                                        koVar.b(a.d / i3);
                                    }
                                    koVar.a(rectF.bottom);
                                }
                            } else {
                                int i4 = yl0Var.c;
                                if (i4 > 0) {
                                    koVar.b(a.c / i4);
                                }
                                koVar.a(rectF.right);
                            }
                        } else {
                            int i5 = yl0Var.b;
                            if (i5 > 0) {
                                koVar.b(a.b / i5);
                            }
                            koVar.a(rectF.top);
                        }
                    } else {
                        int i6 = yl0Var.a;
                        if (i6 > 0) {
                            koVar.b(a.a / i6);
                        }
                        koVar.a(rectF.left);
                    }
                }
            }
        }
        return ni2Var;
    }

    @Override // defpackage.uh2
    public final h12 e(wh2 wh2Var, h12 h12Var) {
        int i;
        if ((((WindowInsetsAnimation) wh2Var.a.f).getTypeMask() & 519) != 0) {
            yl0 yl0Var = (yl0) h12Var.g;
            yl0 yl0Var2 = (yl0) h12Var.f;
            if (yl0Var.a != yl0Var2.a) {
                i = 1;
            } else {
                i = 0;
            }
            if (yl0Var.b != yl0Var2.b) {
                i |= 2;
            }
            if (yl0Var.c != yl0Var2.c) {
                i |= 4;
            }
            if (yl0Var.d != yl0Var2.d) {
                i |= 8;
            }
            this.f.put(wh2Var, Integer.valueOf(i));
        }
        return h12Var;
    }
}
