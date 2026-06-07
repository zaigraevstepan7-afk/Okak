package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hb2 {
    public final ec2 a;
    public final je1 b = fr1.k(null);
    public final /* synthetic */ lb2 c;

    public hb2(lb2 lb2Var, ec2 ec2Var, String str) {
        this.c = lb2Var;
        this.a = ec2Var;
    }

    public final gb2 a(oe0 oe0Var, oe0 oe0Var2) {
        je1 je1Var = this.b;
        gb2 gb2Var = (gb2) je1Var.getValue();
        lb2 lb2Var = this.c;
        if (gb2Var == null) {
            Object invoke = oe0Var2.invoke(lb2Var.a.c());
            Object invoke2 = oe0Var2.invoke(lb2Var.a.c());
            ec2 ec2Var = this.a;
            mc mcVar = (mc) ec2Var.a.invoke(invoke2);
            mcVar.d();
            kb2 kb2Var = new kb2(lb2Var, invoke, mcVar, ec2Var);
            gb2Var = new gb2(this, kb2Var, oe0Var, oe0Var2);
            je1Var.setValue(gb2Var);
            lb2Var.i.add(kb2Var);
        }
        gb2Var.g = oe0Var2;
        gb2Var.f = oe0Var;
        gb2Var.a(lb2Var.f());
        return gb2Var;
    }
}
