package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class br0 {
    public final o3 a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public o3 h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public br0(o3 o3Var, int i) {
        this.j = i;
        this.a = o3Var;
    }

    public static final void a(br0 br0Var, j3 j3Var, int i, e81 e81Var) {
        float intBitsToFloat;
        HashMap hashMap = br0Var.i;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (br0Var.j) {
                    case 0:
                        ic1 ic1Var = e81Var.P;
                        if (ic1Var != null) {
                            vf0 vf0Var = (vf0) ic1Var;
                            float[] b = vf0Var.b();
                            if (!vf0Var.w) {
                                j = d01.b(j, b);
                            }
                        }
                        j = fp.R(j, e81Var.D);
                        break;
                    default:
                        vy0 T0 = e81Var.T0();
                        T0.getClass();
                        long j2 = T0.t;
                        j = z81.e((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                e81Var = e81Var.u;
                e81Var.getClass();
                if (e81Var.equals(br0Var.a.h())) {
                    if (j3Var instanceof ei0) {
                        intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    }
                    int round = Math.round(intBitsToFloat);
                    if (hashMap.containsKey(j3Var)) {
                        int intValue = ((Number) tz0.b0(j3Var, hashMap)).intValue();
                        ei0 ei0Var = m3.a;
                        round = ((Number) j3Var.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(j3Var, Integer.valueOf(round));
                    return;
                }
            } while (!br0Var.b(e81Var).containsKey(j3Var));
            float c = br0Var.c(e81Var, j3Var);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(e81 e81Var) {
        switch (this.j) {
            case 0:
                return e81Var.D0().b();
            default:
                vy0 T0 = e81Var.T0();
                T0.getClass();
                return T0.D0().b();
        }
    }

    public final int c(e81 e81Var, j3 j3Var) {
        switch (this.j) {
            case 0:
                return e81Var.a0(j3Var);
            default:
                vy0 T0 = e81Var.T0();
                T0.getClass();
                return T0.a0(j3Var);
        }
    }

    public final boolean d() {
        if (!this.c && !this.e && !this.f && !this.g) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        h();
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        this.b = true;
        o3 o3Var = this.a;
        o3 i = o3Var.i();
        if (i == null) {
            return;
        }
        if (this.c) {
            i.U();
        } else if (this.e || this.d) {
            i.requestLayout();
        }
        if (this.f) {
            o3Var.U();
        }
        if (this.g) {
            o3Var.requestLayout();
        }
        i.b().f();
    }

    public final void g() {
        HashMap hashMap = this.i;
        hashMap.clear();
        n3 n3Var = new n3(this, 0);
        o3 o3Var = this.a;
        o3Var.E(n3Var);
        hashMap.putAll(b(o3Var.h()));
        this.b = false;
    }

    public final void h() {
        br0 b;
        br0 b2;
        boolean d = d();
        o3 o3Var = this.a;
        if (!d) {
            o3 i = o3Var.i();
            if (i != null) {
                o3Var = i.b().h;
                if (o3Var == null || !o3Var.b().d()) {
                    o3 o3Var2 = this.h;
                    if (o3Var2 != null && !o3Var2.b().d()) {
                        o3 i2 = o3Var2.i();
                        if (i2 != null && (b2 = i2.b()) != null) {
                            b2.h();
                        }
                        o3 i3 = o3Var2.i();
                        if (i3 != null && (b = i3.b()) != null) {
                            o3Var = b.h;
                        } else {
                            o3Var = null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.h = o3Var;
    }
}
