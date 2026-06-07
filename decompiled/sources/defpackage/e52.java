package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e52 {
    public final c52 a;
    public final ArrayList b = new ArrayList();
    public yl0 c;
    public yl0 d;
    public int e;

    public e52(ViewGroup viewGroup) {
        int i;
        yl0 yl0Var = yl0.e;
        this.c = yl0Var;
        this.d = yl0Var;
        Drawable background = viewGroup.getBackground();
        if (background instanceof ColorDrawable) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        this.e = i;
        c52 c52Var = new c52(this, viewGroup.getContext(), viewGroup);
        this.a = c52Var;
        c52Var.setWillNotDraw(true);
        l2 l2Var = new l2(this);
        int i2 = eg2.a;
        ag2.a(c52Var, l2Var);
        eg2.a(c52Var, new d52(this));
        viewGroup.addView(c52Var, 0);
    }
}
