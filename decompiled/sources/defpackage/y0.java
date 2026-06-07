package defpackage;

import java.text.BreakIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y0 extends x0 {
    public static y0 e;
    public static y0 f;
    public static y0 g;
    public static final um1 h = um1.f;
    public static final um1 i = um1.e;
    public final /* synthetic */ int c;
    public Object d;

    public /* synthetic */ y0(int i2) {
        this.c = i2;
    }

    @Override // defpackage.x0
    public final int[] a(int i2) {
        int i3;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i2);
                        BreakIterator breakIterator2 = (BreakIterator) this.d;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i2 = breakIterator2.following(i2);
                            } else {
                                sn0.V("impl");
                                throw null;
                            }
                        } else {
                            if (breakIterator2 != null) {
                                int following = breakIterator2.following(i2);
                                if (following == -1) {
                                    return null;
                                }
                                return b(i2, following);
                            }
                            sn0.V("impl");
                            throw null;
                        }
                    } else {
                        sn0.V("impl");
                        throw null;
                    }
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!m(i2) && (!m(i2) || (i2 != 0 && m(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 != null) {
                        i2 = breakIterator3.following(i2);
                        if (i2 == -1) {
                            return null;
                        }
                    } else {
                        sn0.V("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 != null) {
                    int following2 = breakIterator4.following(i2);
                    if (following2 == -1 || !l(following2)) {
                        return null;
                    }
                    return b(i2, following2);
                }
                sn0.V("impl");
                throw null;
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                w82 w82Var = (w82) this.d;
                um1 um1Var = h;
                if (i2 < 0) {
                    if (w82Var != null) {
                        i3 = w82Var.b.d(0);
                    } else {
                        sn0.V("layoutResult");
                        throw null;
                    }
                } else if (w82Var != null) {
                    int d = w82Var.b.d(i2);
                    if (j(d, um1Var) == i2) {
                        i3 = d;
                    } else {
                        i3 = d + 1;
                    }
                } else {
                    sn0.V("layoutResult");
                    throw null;
                }
                w82 w82Var2 = (w82) this.d;
                if (w82Var2 != null) {
                    if (i3 >= w82Var2.b.f) {
                        return null;
                    }
                    return b(j(i3, um1Var), j(i3, i) + 1);
                }
                sn0.V("layoutResult");
                throw null;
        }
    }

    @Override // defpackage.x0
    public final int[] i(int i2) {
        int i3;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i2);
                        BreakIterator breakIterator2 = (BreakIterator) this.d;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i2 = breakIterator2.preceding(i2);
                            } else {
                                sn0.V("impl");
                                throw null;
                            }
                        } else {
                            if (breakIterator2 != null) {
                                int preceding = breakIterator2.preceding(i2);
                                if (preceding == -1) {
                                    return null;
                                }
                                return b(preceding, i2);
                            }
                            sn0.V("impl");
                            throw null;
                        }
                    } else {
                        sn0.V("impl");
                        throw null;
                    }
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !m(i2 - 1) && !l(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 != null) {
                        i2 = breakIterator3.preceding(i2);
                        if (i2 == -1) {
                            return null;
                        }
                    } else {
                        sn0.V("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 != null) {
                    int preceding2 = breakIterator4.preceding(i2);
                    if (preceding2 == -1 || !m(preceding2)) {
                        return null;
                    }
                    if (preceding2 != 0 && m(preceding2 - 1)) {
                        return null;
                    }
                    return b(preceding2, i2);
                }
                sn0.V("impl");
                throw null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                w82 w82Var = (w82) this.d;
                um1 um1Var = i;
                if (i2 > length3) {
                    if (w82Var != null) {
                        i3 = w82Var.b.d(c().length());
                    } else {
                        sn0.V("layoutResult");
                        throw null;
                    }
                } else if (w82Var != null) {
                    int d = w82Var.b.d(i2);
                    if (j(d, um1Var) + 1 == i2) {
                        i3 = d;
                    } else {
                        i3 = d - 1;
                    }
                } else {
                    sn0.V("layoutResult");
                    throw null;
                }
                if (i3 < 0) {
                    return null;
                }
                return b(j(i3, h), j(i3, um1Var) + 1);
        }
    }

    public int j(int i2, um1 um1Var) {
        w82 w82Var = (w82) this.d;
        if (w82Var != null) {
            int f2 = w82Var.f(i2);
            w82 w82Var2 = (w82) this.d;
            if (w82Var2 != null) {
                um1 g2 = w82Var2.g(f2);
                w82 w82Var3 = (w82) this.d;
                if (um1Var != g2) {
                    if (w82Var3 != null) {
                        return w82Var3.f(i2);
                    }
                    sn0.V("layoutResult");
                    throw null;
                }
                if (w82Var3 != null) {
                    return w82Var3.b.c(i2, false) - 1;
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

    public void k(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    sn0.V("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    sn0.V("impl");
                    throw null;
                }
        }
    }

    public boolean l(int i2) {
        if (i2 > 0 && m(i2 - 1)) {
            if (i2 == c().length() || !m(i2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean m(int i2) {
        if (i2 >= 0 && i2 < c().length()) {
            return Character.isLetterOrDigit(c().codePointAt(i2));
        }
        return false;
    }
}
