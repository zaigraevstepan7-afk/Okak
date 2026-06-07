package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class f81 {
    public static final x31 a;

    static {
        x31 x31Var = t81.a;
        a = new x31();
    }

    public static final void a(d21 d21Var, int i, int i2) {
        if (d21Var instanceof rz) {
            rz rzVar = (rz) d21Var;
            int i3 = rzVar.s;
            b(d21Var, i3 & i, i2);
            int i4 = (~i3) & i;
            for (d21 d21Var2 = rzVar.t; d21Var2 != null; d21Var2 = d21Var2.j) {
                a(d21Var2, i4, i2);
            }
            return;
        }
        b(d21Var, i & d21Var.g, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(d21 d21Var, int i, int i2) {
        if (i2 != 0 || d21Var.A0()) {
            if ((i & 2) != 0 && (d21Var instanceof rq0)) {
                hp.A((rq0) d21Var);
                if (i2 == 2) {
                    hp.K(d21Var, 2).h1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                hp.M(d21Var).E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                hp.M(d21Var).W(false);
            }
            if ((i & 256) != 0 && (d21Var instanceof kf0)) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        hp.M(d21Var).c0(r0.R - 1);
                    }
                } else {
                    ar0 M = hp.M(d21Var);
                    M.c0(M.R + 1);
                }
                if (i2 != 2) {
                    ar0 M2 = hp.M(d21Var);
                    if (M2.R != 0 && !M2.p() && !M2.q() && !M2.Q) {
                        q5 q5Var = (q5) dr0.a(M2);
                        sl0 sl0Var = q5Var.W.e;
                        sl0Var.getClass();
                        if (M2.R > 0) {
                            ((q41) sl0Var.e).b(M2);
                            M2.Q = true;
                        }
                        q5Var.D(null);
                    }
                }
            }
            if ((i & 4) != 0 && (d21Var instanceof b40)) {
                fp.I((b40) d21Var);
            }
            if ((i & 8) != 0 && (d21Var instanceof pu1)) {
                hp.M(d21Var).v = true;
            }
            if ((i & 64) != 0 && (d21Var instanceof ke1)) {
                er0 er0Var = hp.M((ke1) d21Var).K;
                er0Var.p.u = true;
                zy0 zy0Var = er0Var.q;
                if (zy0Var != null) {
                    zy0Var.A = true;
                }
            }
            if ((i & 2048) != 0 && (d21Var instanceof dh)) {
                c21 c21Var = ((dh) d21Var).s;
                kl0.b("applyFocusProperties called on wrong node");
                c21Var.getClass();
                se.s();
                return;
            }
            if ((i & 4096) != 0 && (d21Var instanceof bc0)) {
                bc0 bc0Var = (bc0) d21Var;
                hc0 hc0Var = ((mc0) ((q5) hp.N(bc0Var)).getFocusOwner()).d;
                if (hc0Var.d.a(bc0Var)) {
                    hc0Var.a();
                }
            }
        }
    }

    public static final void c(d21 d21Var) {
        if (!d21Var.r) {
            kl0.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(d21Var, -1, 0);
    }

    public static final int d(c21 c21Var) {
        int i;
        if (c21Var instanceof pq0) {
            i = 3;
        } else {
            i = 1;
        }
        if (c21Var instanceof a40) {
            i |= 4;
        }
        if (c21Var instanceof nu1) {
            i |= 8;
        }
        if (c21Var instanceof kb) {
            i |= 64;
        }
        if (c21Var instanceof mj) {
            return 524288 | i;
        }
        return i;
    }

    public static final int e(d21 d21Var) {
        int i;
        int i2 = d21Var.g;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = d21Var.getClass();
        x31 x31Var = a;
        int d = x31Var.d(cls);
        if (d >= 0) {
            return x31Var.c[d];
        }
        if (d21Var instanceof rq0) {
            i = 3;
        } else {
            i = 1;
        }
        if (d21Var instanceof b40) {
            i |= 4;
        }
        if (d21Var instanceof pu1) {
            i |= 8;
        }
        if (d21Var instanceof th1) {
            i |= 16;
        }
        if (d21Var instanceof g21) {
            i |= 32;
        }
        if (d21Var instanceof ke1) {
            i |= 64;
        }
        if (d21Var instanceof ea1) {
            i |= 128;
        } else if (d21Var instanceof gq0) {
            i |= 4194432;
        }
        if (d21Var instanceof kf0) {
            i |= 256;
        }
        if (d21Var instanceof tc0) {
            i |= 1024;
        }
        if (d21Var instanceof dh) {
            i |= 2048;
        }
        if (d21Var instanceof bc0) {
            i |= 4096;
        }
        if (d21Var instanceof pp0) {
            i |= SharedConstants.DefaultBufferSize;
        }
        if (d21Var instanceof c5) {
            i |= 16384;
        }
        if (d21Var instanceof es) {
            i |= 32768;
        }
        if (d21Var instanceof ub2) {
            i |= 262144;
        }
        if (d21Var instanceof mj) {
            i |= 524288;
        }
        if (d21Var instanceof ok0) {
            i |= 2097152;
        }
        if (d21Var instanceof yr0) {
            i |= 8388608;
        }
        x31Var.g(i, cls);
        return i;
    }

    public static final int f(d21 d21Var) {
        if (d21Var instanceof rz) {
            rz rzVar = (rz) d21Var;
            int i = rzVar.s;
            for (d21 d21Var2 = rzVar.t; d21Var2 != null; d21Var2 = d21Var2.j) {
                i |= f(d21Var2);
            }
            return i;
        }
        return e(d21Var);
    }

    public static final boolean g(int i) {
        boolean z;
        boolean z2 = false;
        if ((i & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0) {
            z2 = true;
        }
        return z | z2;
    }
}
