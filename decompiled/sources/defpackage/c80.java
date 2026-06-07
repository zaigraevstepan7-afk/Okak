package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c80 {
    public static final c80 a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, c80] */
    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (16.0f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (0.0f >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (16.0f >= 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z3 & z5;
        if (0.0f >= 0.0f) {
            z4 = true;
        }
        if (!(z6 & z4)) {
            il0.a("Padding must be non-negative");
        }
    }

    public final void a(boolean z, e21 e21Var, ur urVar, int i) {
        int i2;
        boolean z2;
        ur urVar2;
        float f;
        urVar.Y(-1732824199);
        if (urVar.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 48;
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i3 & 1, z2)) {
            ij0 ij0Var = io.c;
            if (ij0Var == null) {
                hj0 hj0Var = new hj0("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i4 = me2.a;
                i12 i12Var = new i12(co.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new ve1(7.0f, 10.0f));
                arrayList.add(new cf1(5.0f, 5.0f));
                arrayList.add(new cf1(5.0f, -5.0f));
                arrayList.add(re1.c);
                hj0.a(hj0Var, arrayList, i12Var);
                ij0Var = hj0Var.b();
                io.c = ij0Var;
            }
            ij0 ij0Var2 = ij0Var;
            if (z) {
                f = 180.0f;
            } else {
                f = 0.0f;
            }
            urVar2 = urVar;
            ej0.a(ij0Var2, null, fp.U(f), 0L, urVar2, 48, 8);
            e21Var = b21.a;
        } else {
            urVar2 = urVar;
            urVar2.R();
        }
        dl1 r = urVar2.r();
        if (r != null) {
            r.d = new b80(this, z, e21Var, i);
        }
    }
}
