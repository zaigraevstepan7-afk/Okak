package defpackage;

import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class su extends rz implements pu1 {
    public b82 A;
    public nj0 B;
    public oc0 C;
    public db2 u;
    public i82 v;
    public gu0 w;
    public boolean x;
    public boolean y;
    public c91 z;

    /* JADX WARN: Multi-variable type inference failed */
    public static void O0(gu0 gu0Var, String str, boolean z, boolean z2) {
        if (!z && z2) {
            r82 r82Var = gu0Var.e;
            fu fuVar = gu0Var.v;
            if (r82Var != null) {
                i82 o = gu0Var.d.o(xn.F(new Object(), new dp(str, 1)));
                r82Var.a(null, o);
                fuVar.invoke(o);
            } else {
                int length = str.length();
                fuVar.invoke(new i82(4, str, fr1.a(length, length)));
            }
        }
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        rc rcVar = this.v.a;
        ep0[] ep0VarArr = xu1.a;
        zu1 zu1Var = vu1.E;
        ep0[] ep0VarArr2 = xu1.a;
        ep0 ep0Var = ep0VarArr2[18];
        av1Var.a(zu1Var, rcVar);
        rc rcVar2 = this.u.a;
        zu1 zu1Var2 = vu1.F;
        ep0 ep0Var2 = ep0VarArr2[19];
        av1Var.a(zu1Var2, rcVar2);
        long j = this.v.b;
        zu1 zu1Var3 = vu1.G;
        ep0 ep0Var3 = ep0VarArr2[20];
        av1Var.a(zu1Var3, new d92(j));
        q6 q6Var = g3.w;
        zu1 zu1Var4 = vu1.r;
        ep0 ep0Var4 = ep0VarArr2[9];
        av1Var.a(zu1Var4, q6Var);
        m7 m7Var = new m7(AutofillValue.forText(this.v.a));
        zu1 zu1Var5 = vu1.s;
        ep0 ep0Var5 = ep0VarArr2[10];
        av1Var.a(zu1Var5, m7Var);
        boolean z = false;
        z = false;
        av1Var.a(lu1.h, new s0(null, new ru(this, z ? 1 : 0)));
        int i = this.B.d;
        if (i == 6) {
            nt.a.getClass();
            r6 r6Var = mt.c;
            zu1 zu1Var6 = vu1.q;
            ep0 ep0Var6 = ep0VarArr2[8];
            av1Var.a(zu1Var6, r6Var);
        } else if (i == 7 || i == 8) {
            nt.a.getClass();
            r6 r6Var2 = mt.b;
            zu1 zu1Var7 = vu1.q;
            ep0 ep0Var7 = ep0VarArr2[8];
            av1Var.a(zu1Var7, r6Var2);
        } else if (i == 4) {
            nt.a.getClass();
            r6 r6Var3 = mt.d;
            zu1 zu1Var8 = vu1.q;
            ep0 ep0Var8 = ep0VarArr2[8];
            av1Var.a(zu1Var8, r6Var3);
        }
        if (!this.y) {
            av1Var.a(vu1.i, od2.a);
        }
        int i2 = 1;
        if (this.y && !this.x) {
            z = true;
        }
        zu1 zu1Var9 = vu1.N;
        ep0 ep0Var9 = ep0VarArr2[26];
        av1Var.a(zu1Var9, Boolean.valueOf(z));
        xu1.a(av1Var, new ru(this, i2));
        int i3 = 2;
        if (z) {
            av1Var.a(lu1.k, new s0(null, new ru(this, i3)));
            av1Var.a(lu1.o, new s0(null, new ru(this, av1Var)));
        }
        av1Var.a(lu1.j, new s0(null, new ol(this, 1)));
        int i4 = this.B.e;
        qu quVar = new qu(this, 6);
        av1Var.a(vu1.H, new mj0(i4));
        av1Var.a(lu1.p, new s0(null, quVar));
        av1Var.a(lu1.b, new s0(null, new qu(this, 7)));
        av1Var.a(lu1.c, new s0(null, new qu(this, 1)));
        if (!d92.c(this.v.b)) {
            av1Var.a(lu1.q, new s0(null, new qu(this, 2)));
            if (this.y && !this.x) {
                av1Var.a(lu1.r, new s0(null, new qu(this, 3)));
            }
        }
        if (this.y && !this.x) {
            av1Var.a(lu1.s, new s0(null, new qu(this, 5)));
        }
    }

    @Override // defpackage.pu1
    public final boolean w0() {
        return true;
    }
}
