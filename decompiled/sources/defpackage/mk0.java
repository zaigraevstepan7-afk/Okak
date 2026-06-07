package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mk0 {
    public final m30 a;
    public hk0 b;
    public kk0 c;
    public jk0 d;
    public ik0 e;
    public vn f;
    public ov1 g;
    public long h = 9205357640488583168L;
    public za2 i;
    public final nk0 j;
    public final nk0 k;
    public long l;

    /* JADX WARN: Type inference failed for: r3v1, types: [nk0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [nk0, java.lang.Object] */
    public mk0(m30 m30Var) {
        this.a = m30Var;
        ?? obj = new Object();
        obj.b = new ArrayList();
        this.j = obj;
        ?? obj2 = new Object();
        obj2.b = new ArrayList();
        this.k = obj2;
        this.l = 0L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jk0] */
    public static void c(mk0 mk0Var, fk0 fk0Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        m30 m30Var = mk0Var.a;
        jk0 jk0Var = mk0Var.d;
        jk0 jk0Var2 = jk0Var;
        if (jk0Var == null) {
            ?? obj = new Object();
            obj.d = null;
            obj.e = Long.MAX_VALUE;
            obj.f = false;
            mk0Var.d = obj;
            jk0Var2 = obj;
        }
        jk0Var2.d = fk0Var;
        jk0Var2.e = j;
        za2 za2Var = mk0Var.i;
        sb1 sb1Var = m30Var.u;
        if (za2Var == null) {
            mk0Var.i = new za2(sb1Var);
        } else {
            za2Var.a = sb1Var;
            za2Var.b = j2;
        }
        jk0Var2.f = false;
        mk0Var.f = jk0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hk0] */
    public final void a() {
        hk0 hk0Var = this.b;
        gk0 gk0Var = gk0.g;
        hk0 hk0Var2 = hk0Var;
        if (hk0Var == null) {
            ?? obj = new Object();
            obj.d = gk0Var;
            obj.e = false;
            this.b = obj;
            hk0Var2 = obj;
        }
        hk0Var2.d = gk0Var;
        hk0Var2.e = false;
        this.f = hk0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ik0] */
    public final void b(fk0 fk0Var, long j, za2 za2Var) {
        ik0 ik0Var = this.e;
        ik0 ik0Var2 = ik0Var;
        if (ik0Var == null) {
            ?? obj = new Object();
            obj.d = null;
            obj.e = Long.MAX_VALUE;
            this.e = obj;
            ik0Var2 = obj;
        }
        ik0Var2.d = fk0Var;
        ik0Var2.e = j;
        za2Var.b = 0L;
        this.f = ik0Var2;
    }

    public final ov1 d() {
        ov1 ov1Var = this.g;
        if (ov1Var != null) {
            return ov1Var;
        }
        se.h("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(fk0 fk0Var, ek0 ek0Var, long j) {
        long j2;
        m30 m30Var = this.a;
        long u = hp.L(m30Var).u(0L);
        if (!z81.b(this.h, 9205357640488583168L) && !z81.b(u, this.h)) {
            this.l = z81.e(this.l, z81.d(u, this.h));
        }
        this.h = u;
        sb1 sb1Var = m30Var.u;
        sb1Var.getClass();
        t30 t30Var = u30.a;
        if (sb1Var == sb1.e) {
            j2 = j & 4294967295L;
        } else {
            j2 = j >> 32;
        }
        if (Math.abs(Float.intBitsToFloat((int) j2)) > 2.0f) {
            xn.k(d(), fk0Var, m30Var.u, ek0Var, this.j, this.l);
            nk0 nk0Var = this.k;
            ArrayList arrayList = nk0Var.b;
            if (arrayList.size() == 3) {
                int i = nk0Var.a;
                nk0Var.a = i + 1;
                arrayList.set(i, new z81(j));
            } else {
                arrayList.add(new z81(j));
            }
            if (nk0Var.a == 3) {
                nk0Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((z81) arrayList.get(i2)).a >> 32))));
            }
            float e0 = (float) wn.e0(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((z81) arrayList.get(i3)).a & 4294967295L))));
            }
            float e02 = (float) wn.e0(arrayList3);
            m30Var.W0(new w20((Float.floatToRawIntBits(e02) & 4294967295L) | (Float.floatToRawIntBits(e0) << 32), true));
        }
    }

    public final void f(fk0 fk0Var, fk0 fk0Var2, ek0 ek0Var, long j) {
        if (this.g == null) {
            this.g = new ov1(12);
        }
        this.l = 0L;
        ov1 d = d();
        m30 m30Var = this.a;
        xn.k(d, fk0Var, m30Var.u, ek0Var, this.j, this.l);
        long d2 = z81.d(xn.J(fk0Var2, m30Var.u, ek0Var), j);
        if (((Boolean) m30Var.v.invoke(new wh1(1))).booleanValue()) {
            this.h = hp.L(m30Var).u(0L);
            m30Var.W0(new x20(d2));
        }
        nk0 nk0Var = this.k;
        nk0Var.a = 0;
        nk0Var.b.clear();
    }
}
