package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pq1 implements oq1 {
    public final oe0 e;
    public final i41 f;
    public i41 g;

    public pq1(Map map, oe0 oe0Var) {
        i41 i41Var;
        this.e = oe0Var;
        if (map != null && !map.isEmpty()) {
            i41Var = new i41(map.size());
            for (Map.Entry entry : map.entrySet()) {
                i41Var.m(entry.getKey(), entry.getValue());
            }
        } else {
            i41Var = null;
        }
        this.f = i41Var;
    }

    @Override // defpackage.oq1
    public final ld a(String str, de0 de0Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!mp0.C(str.charAt(i))) {
                i41 i41Var = this.g;
                if (i41Var == null) {
                    long[] jArr = sr1.a;
                    i41Var = new i41();
                    this.g = i41Var;
                }
                Object g = i41Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    i41Var.m(str, g);
                }
                ((List) g).add(de0Var);
                return new ld(i41Var, str, de0Var, 11);
            }
        }
        se.h("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.oq1
    public final boolean c(Object obj) {
        return ((Boolean) this.e.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // defpackage.oq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map d() {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq1.d():java.util.Map");
    }

    @Override // defpackage.oq1
    public final Object e(String str) {
        List list;
        i41 i41Var = this.f;
        if (i41Var != null) {
            list = (List) i41Var.k(str);
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && i41Var != null) {
            List subList = list.subList(1, list.size());
            int f = i41Var.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = i41Var.c;
            Object obj = objArr[f];
            i41Var.b[f] = str;
            objArr[f] = subList;
        }
        return list.get(0);
    }
}
