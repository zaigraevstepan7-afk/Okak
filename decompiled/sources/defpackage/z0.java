package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z0 extends x0 {
    public static z0 e;
    public static final um1 f = um1.f;
    public static final um1 g = um1.e;
    public w82 c;
    public ru1 d;

    @Override // defpackage.x0
    public final int[] a(int i) {
        int i2;
        if (c().length() > 0 && i < c().length()) {
            try {
                ru1 ru1Var = this.d;
                if (ru1Var != null) {
                    pl1 g2 = ru1Var.g();
                    int round = Math.round(g2.d - g2.b);
                    if (i <= 0) {
                        i = 0;
                    }
                    w82 w82Var = this.c;
                    if (w82Var != null) {
                        int d = w82Var.b.d(i);
                        w82 w82Var2 = this.c;
                        if (w82Var2 != null) {
                            float f2 = w82Var2.b.f(d) + round;
                            w82 w82Var3 = this.c;
                            if (w82Var3 != null) {
                                float f3 = w82Var3.b.f(r0.f - 1);
                                w82 w82Var4 = this.c;
                                if (f2 < f3) {
                                    if (w82Var4 != null) {
                                        i2 = w82Var4.b.e(f2);
                                    } else {
                                        sn0.V("layoutResult");
                                        throw null;
                                    }
                                } else if (w82Var4 != null) {
                                    i2 = w82Var4.b.f;
                                } else {
                                    sn0.V("layoutResult");
                                    throw null;
                                }
                                return b(i, j(i2 - 1, g) + 1);
                            }
                            sn0.V("layoutResult");
                            throw null;
                        }
                        sn0.V("layoutResult");
                        throw null;
                    }
                    sn0.V("layoutResult");
                    throw null;
                }
                sn0.V("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.x0
    public final int[] i(int i) {
        int i2;
        if (c().length() > 0 && i > 0) {
            try {
                ru1 ru1Var = this.d;
                if (ru1Var != null) {
                    pl1 g2 = ru1Var.g();
                    int round = Math.round(g2.d - g2.b);
                    int length = c().length();
                    if (length <= i) {
                        i = length;
                    }
                    w82 w82Var = this.c;
                    if (w82Var != null) {
                        int d = w82Var.b.d(i);
                        w82 w82Var2 = this.c;
                        if (w82Var2 != null) {
                            float f2 = w82Var2.b.f(d) - round;
                            if (f2 > 0.0f) {
                                w82 w82Var3 = this.c;
                                if (w82Var3 != null) {
                                    i2 = w82Var3.b.e(f2);
                                } else {
                                    sn0.V("layoutResult");
                                    throw null;
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i == c().length() && i2 < d) {
                                i2++;
                            }
                            return b(j(i2, f), i);
                        }
                        sn0.V("layoutResult");
                        throw null;
                    }
                    sn0.V("layoutResult");
                    throw null;
                }
                sn0.V("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int j(int i, um1 um1Var) {
        w82 w82Var = this.c;
        if (w82Var != null) {
            int f2 = w82Var.f(i);
            w82 w82Var2 = this.c;
            if (w82Var2 != null) {
                um1 g2 = w82Var2.g(f2);
                w82 w82Var3 = this.c;
                if (um1Var != g2) {
                    if (w82Var3 != null) {
                        return w82Var3.f(i);
                    }
                    sn0.V("layoutResult");
                    throw null;
                }
                if (w82Var3 != null) {
                    return w82Var3.b.c(i, false) - 1;
                }
                sn0.V("layoutResult");
                throw null;
            }
            sn0.V("layoutResult");
            throw null;
        }
        sn0.V("layoutResult");
        throw null;
    }
}
