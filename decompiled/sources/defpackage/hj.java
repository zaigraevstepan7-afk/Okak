package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class hj {
    public static final i41 a = c(true);
    public static final i41 b = c(false);
    public static final b7 c = b7.d;

    public static final void a(e21 e21Var, ur urVar, int i) {
        int i2;
        boolean z;
        urVar.Y(-211209833);
        int i3 = 2;
        if (urVar.f(e21Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i4 & 1, z)) {
            int hashCode = Long.hashCode(urVar.T);
            e21 Q = fp.Q(urVar, e21Var);
            sf1 l = urVar.l();
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, c);
            op1.q(urVar, kr.e, l);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h8(e21Var, i, i3);
        }
    }

    public static final void b(hg1 hg1Var, ig1 ig1Var, e01 e01Var, jq0 jq0Var, int i, int i2, i3 i3Var) {
        gj gjVar;
        i3 i3Var2;
        ki kiVar;
        Object C = e01Var.C();
        if (C instanceof gj) {
            gjVar = (gj) C;
        } else {
            gjVar = null;
        }
        if (gjVar != null && (kiVar = gjVar.s) != null) {
            i3Var2 = kiVar;
        } else {
            i3Var2 = i3Var;
        }
        hg1.j(hg1Var, ig1Var, i3Var2.a((ig1Var.e << 32) | (ig1Var.f & 4294967295L), (i << 32) | (i2 & 4294967295L), jq0Var));
    }

    public static final i41 c(boolean z) {
        i41 i41Var = new i41(9);
        ki kiVar = g3.f;
        i41Var.m(kiVar, new kj(kiVar, z));
        ki kiVar2 = g3.g;
        i41Var.m(kiVar2, new kj(kiVar2, z));
        ki kiVar3 = g3.h;
        i41Var.m(kiVar3, new kj(kiVar3, z));
        ki kiVar4 = g3.i;
        i41Var.m(kiVar4, new kj(kiVar4, z));
        ki kiVar5 = g3.j;
        i41Var.m(kiVar5, new kj(kiVar5, z));
        ki kiVar6 = g3.k;
        i41Var.m(kiVar6, new kj(kiVar6, z));
        ki kiVar7 = g3.l;
        i41Var.m(kiVar7, new kj(kiVar7, z));
        ki kiVar8 = g3.m;
        i41Var.m(kiVar8, new kj(kiVar8, z));
        ki kiVar9 = g3.n;
        i41Var.m(kiVar9, new kj(kiVar9, z));
        return i41Var;
    }

    public static final j01 d(i3 i3Var, boolean z) {
        i41 i41Var;
        if (z) {
            i41Var = a;
        } else {
            i41Var = b;
        }
        j01 j01Var = (j01) i41Var.g(i3Var);
        if (j01Var == null) {
            return new kj(i3Var, z);
        }
        return j01Var;
    }
}
