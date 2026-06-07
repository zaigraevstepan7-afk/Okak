package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class f61 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ o22 f;

    public /* synthetic */ f61(o22 o22Var, int i) {
        this.e = i;
        this.f = o22Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        boolean z = false;
        o22 o22Var = this.f;
        switch (i) {
            case 0:
                List list = (List) o22Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (sn0.r(((d51) obj).f.e, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return new z81(((z81) o22Var.getValue()).a);
            case 2:
                jc jcVar = ju1.a;
                return new z81(((z81) o22Var.getValue()).a);
            case 3:
                if (((Number) o22Var.getValue()).floatValue() > 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                if (((Number) o22Var.getValue()).floatValue() > 0.0f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return Float.valueOf(((Number) o22Var.getValue()).floatValue());
            case 6:
                return Float.valueOf(((Number) o22Var.getValue()).floatValue());
            case 7:
                return Float.valueOf(((Number) o22Var.getValue()).floatValue());
            default:
                return Float.valueOf(((Number) o22Var.getValue()).floatValue());
        }
    }
}
