package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c11 {
    public final SparseArray a;
    public kc2 b;

    public c11(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(kc2 kc2Var, int i, int i2) {
        c11 c11Var;
        int a = kc2Var.a(i);
        SparseArray sparseArray = this.a;
        if (sparseArray == null) {
            c11Var = null;
        } else {
            c11Var = (c11) sparseArray.get(a);
        }
        if (c11Var == null) {
            c11Var = new c11(1);
            sparseArray.put(kc2Var.a(i), c11Var);
        }
        if (i2 > i) {
            c11Var.a(kc2Var, i + 1, i2);
        } else {
            c11Var.b = kc2Var;
        }
    }
}
