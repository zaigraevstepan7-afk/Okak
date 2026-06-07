package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class di0 extends d21 implements ke1 {
    public ii s;

    @Override // defpackage.ke1
    public final Object x0(Object obj) {
        sp1 sp1Var;
        if (obj instanceof sp1) {
            sp1Var = (sp1) obj;
        } else {
            sp1Var = null;
        }
        if (sp1Var == null) {
            sp1Var = new sp1();
        }
        sp1Var.c = new ov(this.s);
        return sp1Var;
    }
}
