package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t00 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public t00(d51 d51Var, jb jbVar) {
        this.e = 2;
        this.g = d51Var;
        this.f = jbVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj3 = this.f;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && urVar.A()) {
                    urVar.R();
                } else {
                    ((x00) obj3).k.invoke((d51) obj4, urVar, 0);
                }
                return od2Var;
            case 1:
                ur urVar2 = (ur) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && urVar2.A()) {
                    urVar2.R();
                } else {
                    io.i((lq1) obj3, (fq) obj4, urVar2, 0);
                }
                return od2Var;
            default:
                ur urVar3 = (ur) obj;
                d51 d51Var = (d51) obj4;
                if ((((Number) obj2).intValue() & 3) == 2 && urVar3.A()) {
                    urVar3.R();
                } else {
                    r51 r51Var = d51Var.f;
                    r51Var.getClass();
                    ((vq) r51Var).j.c((jb) obj3, d51Var, urVar3, 0);
                }
                return od2Var;
        }
    }

    public /* synthetic */ t00(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
