package defpackage;

import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bi0 extends kg2 {
    public final rw b;
    public final tx0 c;
    public final kf2 d;
    public final gx1 e;
    public final File f;
    public final r22 g;
    public final yk1 h;
    public final r22 i;
    public final yk1 j;
    public final r22 k;
    public final yk1 l;
    public final r22 m;
    public final yk1 n;
    public final r22 o;
    public final yk1 p;
    public final r22 q;
    public final yk1 r;
    public String s;
    public List t;
    public i22 u;
    public i22 v;

    public bi0(rw rwVar, tx0 tx0Var, kf2 kf2Var, gx1 gx1Var, File file) {
        rwVar.getClass();
        tx0Var.getClass();
        kf2Var.getClass();
        gx1Var.getClass();
        file.getClass();
        this.b = rwVar;
        this.c = tx0Var;
        this.d = kf2Var;
        this.e = gx1Var;
        this.f = file;
        r22 j = d6.j(oh0.a);
        this.g = j;
        this.h = new yk1(j);
        r22 j2 = d6.j(l60.e);
        this.i = j2;
        this.j = new yk1(j2);
        vt vtVar = null;
        r22 j3 = d6.j(null);
        this.k = j3;
        this.l = new yk1(j3);
        Boolean bool = Boolean.FALSE;
        r22 j4 = d6.j(bool);
        this.m = j4;
        this.n = new yk1(j4);
        r22 j5 = d6.j(bool);
        this.o = j5;
        this.p = new yk1(j5);
        r22 j6 = d6.j(bool);
        this.q = j6;
        this.r = new yk1(j6);
        rx.C(rx.x(this), null, new vh0(this, vtVar, 1), 3);
        rx.C(rx.x(this), null, new vh0(this, vtVar, 0), 3);
        rx.C(rx.x(this), null, new l(this, vtVar, 22), 3);
    }

    public static final File e(bi0 bi0Var) {
        bi0Var.getClass();
        return new File(bi0Var.f.getParent(), "elixir_stdout.log");
    }

    public static final File f(bi0 bi0Var) {
        bi0Var.getClass();
        return new File(bi0Var.f.getParent(), "elixir_run.pid");
    }

    @Override // defpackage.kg2
    public final void d() {
        i22 i22Var = this.u;
        if (i22Var != null) {
            i22Var.c(null);
        }
        this.u = null;
        i22 i22Var2 = this.v;
        if (i22Var2 != null) {
            i22Var2.c(null);
        }
        this.v = null;
    }
}
