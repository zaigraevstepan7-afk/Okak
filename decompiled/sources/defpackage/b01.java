package defpackage;

import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class b01 {
    public static final y22 a;

    /* JADX WARN: Type inference failed for: r1v2, types: [y22, xj1] */
    static {
        lo.P(new ax0(7));
        a = new xj1(new ax0(8));
    }

    public static final void a(mo moVar, t21 t21Var, ow1 ow1Var, pc2 pc2Var, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        ow1 ow1Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        urVar.Y(904511636);
        if ((i & 6) == 0) {
            if (urVar.f(moVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(t21Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            if (urVar.f(pc2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (urVar.h(fqVar)) {
                i3 = 16384;
            } else {
                i3 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i3;
        }
        int i7 = 0;
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                ow1Var2 = ow1Var;
            } else {
                ow1Var2 = (ow1) urVar.j(pw1.a);
            }
            urVar.q();
            zo1 a2 = xo1.a(0.0f, 7, false);
            long j = moVar.a;
            boolean e = urVar.e(j);
            Object L = urVar.L();
            if (e || L == or.a) {
                L = new e92(j, co.b(j, 0.4f));
                urVar.h0(L);
            }
            vn.c(new zj1[]{oo.a.a(moVar), a.a(t21Var), ak0.a.a(a2), pw1.a.a(ow1Var2), f92.a.a((e92) L), rc2.a.a(pc2Var)}, go.N(-1750539308, new a01(pc2Var, fqVar, i7), urVar), urVar, 56);
        } else {
            urVar.R();
            ow1Var2 = ow1Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new uh(moVar, t21Var, ow1Var2, pc2Var, fqVar, i);
        }
    }
}
