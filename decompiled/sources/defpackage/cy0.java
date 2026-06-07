package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class cy0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ h32 f;
    public final /* synthetic */ o22 g;

    public /* synthetic */ cy0(h32 h32Var, o22 o22Var, int i) {
        this.e = i;
        this.f = h32Var;
        this.g = o22Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        String q;
        String str;
        int i = this.e;
        od2 od2Var = od2.a;
        boolean z = false;
        o22 o22Var = this.g;
        h32 h32Var = this.f;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (urVar.O(intValue & 1, z)) {
                    if (sn0.r((String) o22Var.getValue(), "external")) {
                        q = h32Var.p();
                    } else {
                        q = h32Var.q();
                    }
                    t82.b(q, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar, 0, 0, 262142);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (urVar2.O(intValue2 & 1, z)) {
                    ij0 ij0Var = bf.j1;
                    if (ij0Var == null) {
                        hj0 hj0Var = new hj0("Rounded.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = me2.a;
                        i12 i12Var = new i12(co.b);
                        rg2 rg2Var = new rg2(21);
                        rg2Var.s(18.0f, 13.0f);
                        rg2Var.o(-5.0f);
                        rg2Var.E(5.0f);
                        rg2Var.i(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
                        rg2Var.w(-1.0f, -0.45f, -1.0f, -1.0f);
                        rg2Var.E(-5.0f);
                        rg2Var.n(6.0f);
                        rg2Var.i(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                        rg2Var.w(0.45f, -1.0f, 1.0f, -1.0f);
                        rg2Var.o(5.0f);
                        rg2Var.D(6.0f);
                        rg2Var.i(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                        rg2Var.w(1.0f, 0.45f, 1.0f, 1.0f);
                        rg2Var.E(5.0f);
                        rg2Var.o(5.0f);
                        rg2Var.i(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                        rg2Var.w(-0.45f, 1.0f, -1.0f, 1.0f);
                        rg2Var.f();
                        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                        ij0Var = hj0Var.b();
                        bf.j1 = ij0Var;
                    }
                    ij0 ij0Var2 = ij0Var;
                    switch (h32Var.a) {
                        case 0:
                            str = "Add";
                            break;
                        case 1:
                            str = "Adicionar";
                            break;
                        case 2:
                            str = "Добавить";
                            break;
                        case 3:
                            str = "Додати";
                            break;
                        default:
                            str = "添加";
                            break;
                    }
                    ej0.a(ij0Var2, str, fp.U(((Number) o22Var.getValue()).floatValue()), 0L, urVar2, 0, 8);
                } else {
                    urVar2.R();
                }
                return od2Var;
        }
    }
}
