package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m4 {
    public Object a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ n4 d;

    public m4(n4 n4Var) {
        this.d = n4Var;
    }

    public final void a(float f, float f2) {
        boolean z;
        Object obj;
        float f3;
        n4 n4Var = this.d;
        fe1 fe1Var = n4Var.j;
        float g = fe1Var.g();
        fe1Var.h(f);
        n4Var.k.h(f2);
        if (!Float.isNaN(g)) {
            if (f >= g) {
                z = true;
            } else {
                z = false;
            }
            cy c = n4Var.c();
            je1 je1Var = n4Var.g;
            if (fe1Var.g() == c.f(je1Var.getValue())) {
                float g2 = fe1Var.g();
                if (z) {
                    f3 = 1.0f;
                } else {
                    f3 = -1.0f;
                }
                Object b = n4Var.c().b(g2 + f3, z);
                if (b == null) {
                    b = je1Var.getValue();
                }
                if (z) {
                    this.a = je1Var.getValue();
                    this.b = b;
                } else {
                    this.a = b;
                    this.b = je1Var.getValue();
                }
            } else {
                Object b2 = n4Var.c().b(fe1Var.g(), false);
                if (b2 == null) {
                    b2 = je1Var.getValue();
                }
                Object b3 = n4Var.c().b(fe1Var.g(), true);
                if (b3 == null) {
                    b3 = je1Var.getValue();
                }
                this.a = b2;
                this.b = b3;
            }
            cy c2 = n4Var.c();
            Object obj2 = this.a;
            obj2.getClass();
            float f4 = c2.f(obj2);
            cy c3 = n4Var.c();
            Object obj3 = this.b;
            obj3.getClass();
            this.c = Math.abs(f4 - c3.f(obj3));
            if (Math.abs(fe1Var.g() - n4Var.c().f(je1Var.getValue())) >= this.c / 2.0f) {
                if (z) {
                    obj = this.b;
                } else {
                    obj = this.a;
                }
                if (obj == null) {
                    obj = je1Var.getValue();
                }
                if (((Boolean) n4Var.a.invoke(obj)).booleanValue()) {
                    n4Var.g(obj);
                }
            }
        }
    }
}
