package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wj2 extends n90 {
    public static final oe1 h;
    public final oe1 e;
    public final n90 f;
    public final LinkedHashMap g;

    static {
        String str = oe1.f;
        h = wc0.k("/", false);
    }

    public wj2(oe1 oe1Var, n90 n90Var, LinkedHashMap linkedHashMap) {
        this.e = oe1Var;
        this.f = n90Var;
        this.g = linkedHashMap;
    }

    @Override // defpackage.n90
    public final ey1 appendingSink(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.n90
    public final void atomicMove(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    public final List b(oe1 oe1Var, boolean z) {
        vj2 vj2Var = (vj2) this.g.get(h.e(oe1Var, true));
        if (vj2Var == null) {
            if (!z) {
                return null;
            }
            se.w(l90.h(oe1Var, "not a directory: "));
            return null;
        }
        return wn.A0(vj2Var.q);
    }

    @Override // defpackage.n90
    public final oe1 canonicalize(oe1 oe1Var) {
        oe1Var.getClass();
        oe1 oe1Var2 = h;
        oe1Var2.getClass();
        oe1 b = f.b(oe1Var2, oe1Var, true);
        if (this.g.containsKey(b)) {
            return b;
        }
        throw new FileNotFoundException(String.valueOf(oe1Var));
    }

    @Override // defpackage.n90
    public final void createDirectory(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.n90
    public final void createSymlink(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.n90
    public final void delete(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.n90
    public final List list(oe1 oe1Var) {
        oe1Var.getClass();
        List b = b(oe1Var, true);
        b.getClass();
        return b;
    }

    @Override // defpackage.n90
    public final List listOrNull(oe1 oe1Var) {
        oe1Var.getClass();
        return b(oe1Var, false);
    }

    @Override // defpackage.n90
    public final j90 metadataOrNull(oe1 oe1Var) {
        Long valueOf;
        boolean z;
        Long l;
        Long l2;
        Long l3;
        Long valueOf2;
        Throwable th;
        Throwable th2;
        oe1Var.getClass();
        oe1 oe1Var2 = h;
        oe1Var2.getClass();
        vj2 vj2Var = (vj2) this.g.get(f.b(oe1Var2, oe1Var, true));
        if (vj2Var == null) {
            return null;
        }
        long j = vj2Var.h;
        if (j != -1) {
            i90 openReadOnly = this.f.openReadOnly(this.e);
            try {
                bl1 bl1Var = new bl1(openReadOnly.p(j));
                try {
                    vj2Var = pp1.F(bl1Var, vj2Var);
                    vj2Var.getClass();
                    try {
                        bl1Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        bl1Var.close();
                    } catch (Throwable th5) {
                        qo.g(th4, th5);
                    }
                    th2 = th4;
                    vj2Var = null;
                }
            } catch (Throwable th6) {
                if (openReadOnly != null) {
                    try {
                        openReadOnly.close();
                    } catch (Throwable th7) {
                        qo.g(th6, th7);
                    }
                }
                th = th6;
                vj2Var = null;
            }
            if (th2 == null) {
                try {
                    openReadOnly.close();
                    th = null;
                } catch (Throwable th8) {
                    th = th8;
                }
                if (th != null) {
                    throw th;
                }
            } else {
                throw th2;
            }
        }
        boolean z2 = vj2Var.b;
        boolean z3 = !z2;
        if (z2) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(vj2Var.f);
        }
        Long l4 = vj2Var.m;
        if (l4 != null) {
            l = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
            z = true;
        } else {
            if (vj2Var.p != null) {
                z = true;
                l = Long.valueOf(r0.intValue() * 1000);
            } else {
                z = true;
                l = null;
            }
        }
        Long l5 = vj2Var.k;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            if (vj2Var.n != null) {
                l2 = Long.valueOf(r2.intValue() * 1000);
            } else {
                int i = vj2Var.j;
                if (i != -1) {
                    int i2 = vj2Var.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        l2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l2 = null;
            }
        }
        Long l6 = vj2Var.l;
        if (l6 != null) {
            valueOf2 = Long.valueOf((l6.longValue() / 10000) - 11644473600000L);
        } else {
            if (vj2Var.o != null) {
                valueOf2 = Long.valueOf(r1.intValue() * 1000);
            } else {
                l3 = null;
                return new j90(z3, z2, null, valueOf, l, l2, l3);
            }
        }
        l3 = valueOf2;
        return new j90(z3, z2, null, valueOf, l, l2, l3);
    }

    @Override // defpackage.n90
    public final i90 openReadOnly(oe1 oe1Var) {
        oe1Var.getClass();
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.n90
    public final i90 openReadWrite(oe1 oe1Var, boolean z, boolean z2) {
        oe1Var.getClass();
        throw new IOException("zip entries are not writable");
    }

    @Override // defpackage.n90
    public final ey1 sink(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.n90
    public final k12 source(oe1 oe1Var) {
        bl1 bl1Var;
        Throwable th;
        oe1Var.getClass();
        oe1 oe1Var2 = h;
        oe1Var2.getClass();
        vj2 vj2Var = (vj2) this.g.get(f.b(oe1Var2, oe1Var, true));
        if (vj2Var != null) {
            long j = vj2Var.f;
            i90 openReadOnly = this.f.openReadOnly(this.e);
            try {
                bl1Var = new bl1(openReadOnly.p(vj2Var.h));
                try {
                    openReadOnly.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (openReadOnly != null) {
                    try {
                        openReadOnly.close();
                    } catch (Throwable th4) {
                        qo.g(th3, th4);
                    }
                }
                bl1Var = null;
                th = th3;
            }
            if (th == null) {
                bl1Var.getClass();
                pp1.F(bl1Var, null);
                if (vj2Var.g == 0) {
                    return new w90(bl1Var, j, true);
                }
                return new w90(new wk0(new w90(bl1Var, vj2Var.e, true), new Inflater(true)), j, false);
            }
            throw th;
        }
        throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
    }
}
