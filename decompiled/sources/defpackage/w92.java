package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w92 {
    public final int a;
    public final ng b;
    public final i c;
    public w92 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ x92 h;

    public w92(x92 x92Var, int i, ng ngVar, i iVar) {
        this.h = x92Var;
        this.a = i;
        this.b = ngVar;
        this.c = iVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        dm1 dm1Var;
        dm1 dm1Var2;
        long j5 = this.h.f;
        ng ngVar = this.b;
        e81 K = hp.K(ngVar, 2);
        ar0 M = hp.M(ngVar);
        boolean I = M.I();
        a81 a81Var = M.J;
        if (!I) {
            dm1Var2 = null;
        } else {
            if (a81Var.d != K) {
                long floatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = K.g;
                e81 e81Var = a81Var.d;
                e81Var.getClass();
                dm1Var = new dm1(fp.V(e81Var.L(K, floatToRawIntBits)), (4294967295L & (((int) (r3 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (r3 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, ngVar);
            } else {
                dm1Var = new dm1(j, j2, j3, j4, j5, fArr, ngVar);
            }
            dm1Var2 = dm1Var;
        }
        if (dm1Var2 == null) {
            return;
        }
        this.c.invoke(dm1Var2);
    }

    public final void b() {
        w92 w92Var;
        x92 x92Var = this.h;
        p31 p31Var = x92Var.a;
        int i = this.a;
        w92 w92Var2 = (w92) p31Var.g(i);
        if (w92Var2 != null) {
            if (w92Var2 != this) {
                int d = p31Var.d(i);
                Object[] objArr = p31Var.c;
                Object obj = objArr[d];
                p31Var.b[d] = i;
                objArr[d] = w92Var2;
                while (true) {
                    w92 w92Var3 = w92Var2.d;
                    if (w92Var3 == null) {
                        break;
                    }
                    if (w92Var3 == this) {
                        w92Var2.d = this.d;
                        this.d = null;
                        return;
                    }
                    w92Var2 = w92Var3;
                }
            } else {
                w92 w92Var4 = this.d;
                this.d = null;
                if (w92Var4 != null) {
                    int d2 = p31Var.d(i);
                    Object[] objArr2 = p31Var.c;
                    Object obj2 = objArr2[d2];
                    p31Var.b[d2] = i;
                    objArr2[d2] = w92Var4;
                    return;
                }
                ar0 M = hp.M(this.b.e);
                if (M.l) {
                    ((q5) dr0.a(M)).getRectManager().a.f(M.f, false);
                    return;
                }
                return;
            }
        }
        w92 w92Var5 = x92Var.b;
        if (w92Var5 == this) {
            x92Var.b = w92Var5.d;
            this.d = null;
            return;
        }
        if (w92Var5 != null) {
            w92Var = w92Var5.d;
        } else {
            w92Var = null;
        }
        while (true) {
            w92 w92Var6 = w92Var5;
            w92Var5 = w92Var;
            if (w92Var5 != null) {
                if (w92Var5 == this) {
                    if (w92Var6 != null) {
                        w92Var6.d = w92Var5.d;
                    }
                    this.d = null;
                    return;
                }
                w92Var = w92Var5.d;
            } else {
                return;
            }
        }
    }
}
