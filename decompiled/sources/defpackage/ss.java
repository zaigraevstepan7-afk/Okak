package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ss {
    public static final p31 a;

    static {
        po1 po1Var = so.e;
        int i = po1Var.c;
        rs rsVar = new rs(po1Var, po1Var, 1);
        int i2 = po1Var.c;
        p91 p91Var = so.x;
        int i3 = (p91Var.c << 6) | i2;
        rs rsVar2 = new rs(po1Var, p91Var, 0);
        int i4 = (i2 << 6) | p91Var.c;
        rs rsVar3 = new rs(p91Var, po1Var, 0);
        p31 p31Var = wm0.a;
        p31 p31Var2 = new p31();
        p31Var2.i(i | (i << 6), rsVar);
        p31Var2.i(i3, rsVar2);
        p31Var2.i(i4, rsVar3);
        a = p31Var2;
    }
}
