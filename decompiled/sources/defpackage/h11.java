package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h11 extends u {
    public final je1 m;
    public boolean n;

    public h11(Context context) {
        super(context);
        this.m = fr1.k(f2.b);
    }

    @Override // defpackage.u
    public final void a(int i, ur urVar) {
        int i2;
        boolean z;
        urVar.Y(576708319);
        if (urVar.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i3 & 1, z)) {
            ((se0) this.m.getValue()).invoke(urVar, 0);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h8(this, i, 11);
        }
    }

    @Override // defpackage.u
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.n;
    }
}
