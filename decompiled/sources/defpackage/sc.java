package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class sc {
    public static final rc a = new rc("");

    public static final List a(rc rcVar, int i, int i2, p1 p1Var) {
        List list;
        boolean z;
        if (i == i2 || (list = rcVar.e) == null) {
            return null;
        }
        if (i == 0 && i2 >= rcVar.f.length()) {
            if (p1Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                if (((Boolean) p1Var.invoke(((qc) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            qc qcVar = (qc) list.get(i4);
            boolean z2 = true;
            if (p1Var != null) {
                z = ((Boolean) p1Var.invoke(qcVar.a)).booleanValue();
            } else {
                z = true;
            }
            if (!z || !b(i, i2, qcVar.b, qcVar.c)) {
                z2 = false;
            }
            if (z2) {
                arrayList2.add(new qc(qcVar.d, go.p(qcVar.b, i, i2) - i, go.p(qcVar.c, i, i2) - i, (nc) qcVar.a));
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        if (i3 == i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z | z2;
        if (i == i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z6 & z3;
        if (i < i4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i3 < i2) {
            z5 = true;
        }
        return (z4 & z5) | z7;
    }
}
