package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wk {
    public final float a;
    public final float b;

    public wk(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final hc a(boolean z, r31 r31Var, ur urVar, int i) {
        boolean z2;
        boolean z3;
        ya yaVar;
        Object L = urVar.L();
        Object obj = or.a;
        if (L == obj) {
            L = new a12();
            urVar.h0(L);
        }
        a12 a12Var = (a12) L;
        boolean z4 = true;
        int i2 = 0;
        if ((((i & 112) ^ 48) > 32 && urVar.f(r31Var)) || (i & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object L2 = urVar.L();
        vt vtVar = null;
        if (z2 || L2 == obj) {
            L2 = new uk(r31Var, a12Var, vtVar, i2);
            urVar.h0(L2);
        }
        bf.i(urVar, (se0) L2, r31Var);
        hn0 hn0Var = (hn0) wn.o0(a12Var);
        float f = 0.0f;
        if (z && !(hn0Var instanceof si1)) {
            if (hn0Var instanceof li0) {
                f = this.b;
            } else if (!(hn0Var instanceof cc0)) {
                f = this.a;
            }
        }
        Object L3 = urVar.L();
        if (L3 == obj) {
            L3 = new ya(new f20(f), f2.C, null, 12);
            urVar.h0(L3);
        }
        ya yaVar2 = (ya) L3;
        f20 f20Var = new f20(f);
        boolean h = urVar.h(yaVar2) | urVar.c(f);
        if ((((i & 14) ^ 6) > 4 && urVar.g(z)) || (i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = h | z3;
        if ((((i & 896) ^ 384) <= 256 || !urVar.f(this)) && (i & 384) != 256) {
            z4 = false;
        }
        boolean h2 = z5 | z4 | urVar.h(hn0Var);
        Object L4 = urVar.L();
        if (!h2 && L4 != obj) {
            yaVar = yaVar2;
        } else {
            yaVar = yaVar2;
            Object vkVar = new vk(yaVar, f, z, this, hn0Var, null, 0);
            urVar.h0(vkVar);
            L4 = vkVar;
        }
        bf.i(urVar, (se0) L4, f20Var);
        return yaVar.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof wk)) {
                wk wkVar = (wk) obj;
                if (f20.b(this.a, wkVar.a) && f20.b(0.0f, 0.0f) && f20.b(0.0f, 0.0f) && f20.b(this.b, wkVar.b) && f20.b(0.0f, 0.0f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + l90.a(this.b, l90.a(0.0f, l90.a(0.0f, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
