package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l40 {
    public final oe0 a;
    public final n4 b;
    public final je1 c;
    public u90 d;
    public u90 e;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, u90] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, u90] */
    public l40(m40 m40Var, oe0 oe0Var) {
        this.a = oe0Var;
        dc2 dc2Var = u61.a;
        tx txVar = t3.c;
        p1 p1Var = new p1(25);
        v3 v3Var = new v3(this, 9);
        n4 n4Var = new n4(m40Var, oe0Var);
        n4Var.b = p1Var;
        n4Var.c = v3Var;
        n4Var.d = dc2Var;
        n4Var.e = txVar;
        this.b = n4Var;
        this.c = fr1.k(null);
        this.d = new Object();
        this.e = new Object();
    }

    public static Object a(l40 l40Var, m40 m40Var, gc gcVar, q42 q42Var) {
        float g = l40Var.b.k.g();
        Object a = l40Var.b.a(m40Var, t41.e, new k40(l40Var, g, gcVar, null), q42Var);
        if (a == hv.e) {
            return a;
        }
        return od2.a;
    }

    public final Object b(q42 q42Var) {
        Object a = a(this, m40.e, this.e, q42Var);
        if (a == hv.e) {
            return a;
        }
        return od2.a;
    }

    public final boolean c() {
        if (((m40) this.b.h.getValue()) == m40.f) {
            return true;
        }
        return false;
    }
}
