package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qb implements j01 {
    public final ac a;
    public boolean b;

    public qb(ac acVar) {
        this.a = acVar;
    }

    @Override // defpackage.j01
    public final int a(mn0 mn0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int s = ((e01) list.get(0)).s(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int s2 = ((e01) list.get(i2)).s(i);
                if (s2 > s) {
                    s = s2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return s;
    }

    @Override // defpackage.j01
    public final k01 b(l01 l01Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ig1 x = ((e01) list.get(i3)).x(j);
            i = Math.max(i, x.e);
            i2 = Math.max(i2, x.f);
            arrayList.add(x);
        }
        boolean S = l01Var.S();
        ac acVar = this.a;
        if (S) {
            this.b = true;
            acVar.a.setValue(new en0((i2 & 4294967295L) | (i << 32)));
        } else if (!this.b) {
            acVar.a.setValue(new en0((i2 & 4294967295L) | (i << 32)));
        }
        return l01Var.s0(i, i2, m60.e, new a7(arrayList, 2));
    }

    @Override // defpackage.j01
    public final int c(mn0 mn0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int n = ((e01) list.get(0)).n(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int n2 = ((e01) list.get(i2)).n(i);
                if (n2 > n) {
                    n = n2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return n;
    }

    @Override // defpackage.j01
    public final int d(mn0 mn0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int c = ((e01) list.get(0)).c(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int c2 = ((e01) list.get(i2)).c(i);
                if (c2 > c) {
                    c = c2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return c;
    }

    @Override // defpackage.j01
    public final int e(mn0 mn0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int Y = ((e01) list.get(0)).Y(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int Y2 = ((e01) list.get(i2)).Y(i);
                if (Y2 > Y) {
                    Y = Y2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return Y;
    }
}
