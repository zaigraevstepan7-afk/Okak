package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bz implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bz(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.de0
    public final Object invoke() {
        Object valueOf;
        boolean z;
        Object obj;
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ua2 ua2Var = ((by1) obj2).j;
                return new co(go.G(y40.b.a(0.0f), ua2Var.a, ua2Var.b));
            default:
                ArrayList arrayList = ((pf1) obj2).a;
                i41 i41Var = new i41(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    np0 np0Var = (np0) arrayList.get(i2);
                    Object obj3 = np0Var.b;
                    int i3 = np0Var.a;
                    if (obj3 != null) {
                        valueOf = new oo0(Integer.valueOf(i3), np0Var.b);
                    } else {
                        valueOf = Integer.valueOf(i3);
                    }
                    int f = i41Var.f(valueOf);
                    if (f < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        obj = null;
                    } else {
                        obj = i41Var.c[f];
                    }
                    if (obj != null) {
                        if (obj instanceof b41) {
                            b41 b41Var = (b41) obj;
                            b41Var.a(np0Var);
                            np0Var = b41Var;
                        } else {
                            Object[] objArr = u81.a;
                            b41 b41Var2 = new b41(2);
                            b41Var2.a(obj);
                            b41Var2.a(np0Var);
                            np0Var = b41Var2;
                        }
                    }
                    if (z) {
                        int i4 = ~f;
                        i41Var.b[i4] = valueOf;
                        i41Var.c[i4] = np0Var;
                    } else {
                        i41Var.c[f] = np0Var;
                    }
                }
                return new i31(i41Var);
        }
    }
}
