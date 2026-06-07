package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class xj1 {
    public final yt0 a;

    public xj1(de0 de0Var) {
        this.a = new yt0(de0Var);
    }

    public abstract zj1 a(Object obj);

    public ge2 b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ge2 c(zj1 zj1Var, ge2 ge2Var) {
        w40 w40Var = null;
        if (ge2Var instanceof w40) {
            if (zj1Var.d) {
                w40Var = (w40) ge2Var;
                w40Var.a.setValue(zj1Var.a());
            }
        } else if (ge2Var instanceof z22) {
            if ((zj1Var.b || zj1Var.e != null) && !zj1Var.d) {
                z22 z22Var = (z22) ge2Var;
                if (sn0.r(zj1Var.a(), z22Var.a)) {
                    w40Var = z22Var;
                }
            }
        } else if (ge2Var instanceof ks) {
            zj1Var.getClass();
        }
        if (w40Var == null) {
            if (zj1Var.d) {
                Object obj = zj1Var.e;
                w02 w02Var = zj1Var.c;
                if (w02Var == null) {
                    w02Var = xl1.o;
                }
                return new w40(new je1(obj, w02Var));
            }
            return new z22(zj1Var.a());
        }
        return w40Var;
    }
}
