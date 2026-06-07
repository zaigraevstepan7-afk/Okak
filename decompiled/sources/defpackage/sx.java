package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sx implements bc {
    public final ue2 a;
    public final ec2 b;
    public final Object c;
    public final mc d;
    public final mc e;
    public final mc f;
    public final Object g;
    public final long h;

    public sx(tx txVar, ec2 ec2Var, Object obj, mc mcVar) {
        ue2 ue2Var = new ue2(txVar.a);
        this.a = ue2Var;
        this.b = ec2Var;
        this.c = obj;
        mc mcVar2 = (mc) ec2Var.a.invoke(obj);
        this.d = mcVar2;
        this.e = fc2.v(mcVar);
        oe0 oe0Var = ec2Var.b;
        if (ue2Var.d == null) {
            ue2Var.d = mcVar2.c();
        }
        mc mcVar3 = ue2Var.d;
        if (mcVar3 != null) {
            int b = mcVar3.b();
            int i = 0;
            while (true) {
                mc mcVar4 = ue2Var.d;
                ga0 ga0Var = ue2Var.a;
                if (i < b) {
                    if (mcVar4 != null) {
                        mcVar4.e(i, ga0Var.i(mcVar2.a(i), mcVar.a(i)));
                        i++;
                    } else {
                        sn0.V("targetVector");
                        throw null;
                    }
                } else {
                    if (mcVar4 != null) {
                        this.g = oe0Var.invoke(mcVar4);
                        if (ue2Var.c == null) {
                            ue2Var.c = mcVar2.c();
                        }
                        mc mcVar5 = ue2Var.c;
                        if (mcVar5 != null) {
                            int b2 = mcVar5.b();
                            long j = 0;
                            for (int i2 = 0; i2 < b2; i2++) {
                                mcVar2.getClass();
                                j = Math.max(j, ga0Var.g(mcVar.a(i2)));
                            }
                            this.h = j;
                            mc v = fc2.v(this.a.a(j, this.d, mcVar));
                            this.f = v;
                            int b3 = v.b();
                            for (int i3 = 0; i3 < b3; i3++) {
                                mc mcVar6 = this.f;
                                float a = mcVar6.a(i3);
                                float f = this.a.e;
                                mcVar6.e(i3, go.o(a, -f, f));
                            }
                            return;
                        }
                        sn0.V("velocityVector");
                        throw null;
                    }
                    sn0.V("targetVector");
                    throw null;
                }
            }
        } else {
            sn0.V("targetVector");
            throw null;
        }
    }

    @Override // defpackage.bc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.bc
    public final long b() {
        return this.h;
    }

    @Override // defpackage.bc
    public final ec2 c() {
        return this.b;
    }

    @Override // defpackage.bc
    public final mc d(long j) {
        if (!e(j)) {
            return this.a.a(j, this.d, this.e);
        }
        return this.f;
    }

    @Override // defpackage.bc
    public final Object f(long j) {
        if (!e(j)) {
            oe0 oe0Var = this.b.b;
            ue2 ue2Var = this.a;
            mc mcVar = ue2Var.b;
            mc mcVar2 = this.d;
            if (mcVar == null) {
                ue2Var.b = mcVar2.c();
            }
            mc mcVar3 = ue2Var.b;
            if (mcVar3 != null) {
                int b = mcVar3.b();
                int i = 0;
                while (true) {
                    mc mcVar4 = ue2Var.b;
                    if (i < b) {
                        if (mcVar4 != null) {
                            mcVar4.e(i, ue2Var.a.d(mcVar2.a(i), this.e.a(i), j));
                            i++;
                        } else {
                            sn0.V("valueVector");
                            throw null;
                        }
                    } else {
                        if (mcVar4 != null) {
                            return oe0Var.invoke(mcVar4);
                        }
                        sn0.V("valueVector");
                        throw null;
                    }
                }
            } else {
                sn0.V("valueVector");
                throw null;
            }
        } else {
            return this.g;
        }
    }

    @Override // defpackage.bc
    public final Object g() {
        return this.g;
    }
}
