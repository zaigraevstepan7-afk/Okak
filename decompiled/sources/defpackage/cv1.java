package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class cv1 {
    public static final Comparator[] a;
    public static final yu1 b;

    static {
        uc0 uc0Var;
        Comparator[] comparatorArr = new Comparator[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                uc0Var = uc0.e;
            } else {
                uc0Var = uc0.c;
            }
            comparatorArr[i] = new bv1(new bv1(uc0Var));
        }
        a = comparatorArr;
        b = yu1.g;
    }

    public static final void a(ru1 ru1Var, ArrayList arrayList, n3 n3Var, n3 n3Var2, p31 p31Var) {
        mu1 mu1Var = ru1Var.d;
        Object g = mu1Var.e.g(vu1.m);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) n3Var2.invoke(ru1Var)).booleanValue()) && ((Boolean) n3Var.invoke(ru1Var)).booleanValue()) {
            arrayList.add(ru1Var);
        }
        if (booleanValue) {
            p31Var.i(ru1Var.g, b(ru1Var, n3Var, n3Var2, ru1.j(7, ru1Var)));
            return;
        }
        List j = ru1.j(7, ru1Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((ru1) j.get(i), arrayList, n3Var, n3Var2, p31Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(defpackage.ru1 r17, defpackage.n3 r18, defpackage.n3 r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv1.b(ru1, n3, n3, java.util.List):java.util.ArrayList");
    }
}
