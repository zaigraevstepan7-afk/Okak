package defpackage;

import java.io.File;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lg2 implements pg2 {
    public final jd a;

    public lg2(jd jdVar) {
        this.a = jdVar;
    }

    @Override // defpackage.pg2
    public final kg2 a(Class cls) {
        jd jdVar = this.a;
        b52 b52Var = jdVar.q;
        b52 b52Var2 = jdVar.w;
        b52 b52Var3 = jdVar.r;
        if (cls.isAssignableFrom(c22.class)) {
            return new c22(jdVar.a(), (gx1) b52Var3.getValue(), (pw0) jdVar.s.getValue(), (cd) jdVar.u.getValue(), jdVar.b);
        }
        if (cls.isAssignableFrom(ag.class)) {
            return new ag((of) jdVar.p.getValue(), jdVar.a(), (gx1) b52Var3.getValue());
        }
        if (cls.isAssignableFrom(bi0.class)) {
            return new bi0(jdVar.a(), (tx0) jdVar.t.getValue(), (kf2) b52Var.getValue(), (gx1) b52Var3.getValue(), (File) b52Var2.getValue());
        }
        if (cls.isAssignableFrom(vf2.class)) {
            return new vf2(jdVar.a(), (kf2) b52Var.getValue(), (File) b52Var2.getValue());
        }
        if (cls.isAssignableFrom(ew1.class)) {
            return new ew1(jdVar.a());
        }
        if (cls.isAssignableFrom(co1.class)) {
            File parentFile = ((File) b52Var2.getValue()).getParentFile();
            parentFile.getClass();
            return new co1(parentFile, (xg2) jdVar.v.getValue());
        }
        if (cls.isAssignableFrom(el0.class)) {
            return new el0(jdVar.a, jdVar.a());
        }
        se.h("Unknown ViewModel class: ".concat(cls.getName()));
        return null;
    }
}
