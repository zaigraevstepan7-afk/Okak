package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ib implements j01 {
    public final pb a;

    public ib(pb pbVar) {
        this.a = pbVar;
    }

    @Override // defpackage.j01
    public final int a(mn0 mn0Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((e01) list.get(0)).s(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((e01) list.get(i2)).s(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.j01
    public final k01 b(l01 l01Var, List list, long j) {
        ig1 ig1Var;
        int i;
        ig1 ig1Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int size = list.size();
        ig1[] ig1VarArr = new ig1[size];
        int size2 = list.size();
        long j2 = 0;
        int i8 = 0;
        while (true) {
            ig1Var = null;
            kb kbVar = null;
            i = 1;
            if (i8 >= size2) {
                break;
            }
            e01 e01Var = (e01) list.get(i8);
            Object C = e01Var.C();
            if (C instanceof kb) {
                kbVar = (kb) C;
            }
            if (kbVar != null && ((Boolean) kbVar.a.getValue()).booleanValue()) {
                ig1VarArr[i8] = e01Var.x(j);
                j2 = (r7.f & 4294967295L) | (r7.e << 32);
            }
            i8++;
        }
        int size3 = list.size();
        for (int i9 = 0; i9 < size3; i9++) {
            e01 e01Var2 = (e01) list.get(i9);
            if (ig1VarArr[i9] == null) {
                ig1VarArr[i9] = e01Var2.x(j);
            }
        }
        if (l01Var.S()) {
            i4 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                ig1Var2 = null;
            } else {
                ig1Var2 = ig1VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    if (ig1Var2 != null) {
                        i2 = ig1Var2.e;
                    } else {
                        i2 = 0;
                    }
                    if (1 <= i10) {
                        int i11 = 1;
                        while (true) {
                            ig1 ig1Var3 = ig1VarArr[i11];
                            if (ig1Var3 != null) {
                                i3 = ig1Var3.e;
                            } else {
                                i3 = 0;
                            }
                            if (i2 < i3) {
                                ig1Var2 = ig1Var3;
                                i2 = i3;
                            }
                            if (i11 == i10) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
            if (ig1Var2 != null) {
                i4 = ig1Var2.e;
            } else {
                i4 = 0;
            }
        }
        if (l01Var.S()) {
            i5 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                ig1Var = ig1VarArr[0];
                int i12 = size - 1;
                if (i12 != 0) {
                    if (ig1Var != null) {
                        i6 = ig1Var.f;
                    } else {
                        i6 = 0;
                    }
                    if (1 <= i12) {
                        while (true) {
                            ig1 ig1Var4 = ig1VarArr[i];
                            if (ig1Var4 != null) {
                                i7 = ig1Var4.f;
                            } else {
                                i7 = 0;
                            }
                            if (i6 < i7) {
                                ig1Var = ig1Var4;
                                i6 = i7;
                            }
                            if (i == i12) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            if (ig1Var != null) {
                i5 = ig1Var.f;
            } else {
                i5 = 0;
            }
        }
        if (!l01Var.S()) {
            this.a.c.setValue(new en0((i4 << 32) | (i5 & 4294967295L)));
        }
        return l01Var.s0(i4, i5, m60.e, new hb(ig1VarArr, this, i4, i5));
    }

    @Override // defpackage.j01
    public final int c(mn0 mn0Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((e01) list.get(0)).n(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((e01) list.get(i2)).n(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.j01
    public final int d(mn0 mn0Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((e01) list.get(0)).c(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((e01) list.get(i2)).c(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // defpackage.j01
    public final int e(mn0 mn0Var, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((e01) list.get(0)).Y(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((e01) list.get(i2)).Y(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }
}
