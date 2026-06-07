package defpackage;

import com.elixir.loader.MainActivity;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mr extends u {
    public final je1 m;
    public boolean n;

    public mr(MainActivity mainActivity) {
        super(mainActivity);
        this.m = fr1.k(null);
    }

    @Override // defpackage.u
    public final void a(int i, ur urVar) {
        int i2;
        boolean z;
        urVar.Y(420213850);
        int i3 = 4;
        if (urVar.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i4 & 1, z)) {
            se0 se0Var = (se0) this.m.getValue();
            if (se0Var == null) {
                urVar.X(-1238823553);
            } else {
                urVar.X(98585282);
                se0Var.invoke(urVar, 0);
            }
            urVar.p(false);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new t(this, i, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return mr.class.getName();
    }

    @Override // defpackage.u
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.n;
    }

    public final void setContent(se0 se0Var) {
        this.n = true;
        this.m.setValue(se0Var);
        if (isAttachedToWindow()) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
