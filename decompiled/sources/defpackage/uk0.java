package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uk0 {
    public final q41 a = new q41(new sk0[16]);
    public final je1 b = fr1.k(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final je1 d = fr1.k(Boolean.TRUE);

    public final void a(int i, ur urVar) {
        int i2;
        boolean z;
        urVar.Y(-318043801);
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
            Object L = urVar.L();
            vt vtVar = null;
            xl1 xl1Var = or.a;
            if (L == xl1Var) {
                L = fr1.k(null);
                urVar.h0(L);
            }
            o41 o41Var = (o41) L;
            if (!((Boolean) this.d.getValue()).booleanValue() && !((Boolean) this.b.getValue()).booleanValue()) {
                urVar.X(-151918981);
            } else {
                urVar.X(-144841960);
                boolean h = urVar.h(this);
                Object L2 = urVar.L();
                if (h || L2 == xl1Var) {
                    L2 = new a8(o41Var, this, vtVar, 6);
                    urVar.h0(L2);
                }
                bf.i(urVar, (se0) L2, this);
            }
            urVar.p(false);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h8(this, i, 9);
        }
    }
}
