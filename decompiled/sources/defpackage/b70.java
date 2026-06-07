package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b70 extends uq0 {
    public long A = -9223372034707292160L;
    public i3 B;
    public final a70 C;
    public final a70 D;
    public lb2 s;
    public hb2 t;
    public hb2 u;
    public hb2 v;
    public c70 w;
    public u70 x;
    public de0 y;
    public t60 z;

    public b70(lb2 lb2Var, hb2 hb2Var, hb2 hb2Var2, hb2 hb2Var3, c70 c70Var, u70 u70Var, de0 de0Var, t60 t60Var) {
        this.s = lb2Var;
        this.t = hb2Var;
        this.u = hb2Var2;
        this.v = hb2Var3;
        this.w = c70Var;
        this.x = u70Var;
        this.y = de0Var;
        this.z = t60Var;
        vs.b(0, 0, 15);
        this.C = new a70(this, 0);
        this.D = new a70(this, 1);
    }

    @Override // defpackage.d21
    public final void D0() {
        this.A = -9223372034707292160L;
    }

    public final i3 L0() {
        if (this.s.f().a(r60.e, r60.f)) {
            bm bmVar = this.w.a.c;
            if (bmVar != null) {
                return bmVar.a;
            }
            bm bmVar2 = this.x.a.c;
            if (bmVar2 != null) {
                return bmVar2.a;
            }
            return null;
        }
        bm bmVar3 = this.x.a.c;
        if (bmVar3 != null) {
            return bmVar3.a;
        }
        bm bmVar4 = this.w.a.c;
        if (bmVar4 != null) {
            return bmVar4.a;
        }
        return null;
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        gb2 gb2Var;
        char c;
        gb2 gb2Var2;
        cb2 cb2Var;
        gb2 gb2Var3;
        long j2;
        gb2 gb2Var4;
        long j3;
        long j4;
        if (this.s.a.c() == this.s.d.getValue()) {
            this.B = null;
        } else if (this.B == null) {
            i3 L0 = L0();
            if (L0 == null) {
                L0 = g3.f;
            }
            this.B = L0;
        }
        boolean S = l01Var.S();
        m60 m60Var = m60.e;
        if (S) {
            ig1 x = e01Var.x(j);
            long j5 = (x.e << 32) | (x.f & 4294967295L);
            this.A = j5;
            return l01Var.s0((int) (j5 >> 32), (int) (4294967295L & j5), m60Var, new b5(x, 3));
        }
        if (((Boolean) this.y.invoke()).booleanValue()) {
            t60 t60Var = this.z;
            hb2 hb2Var = t60Var.a;
            hb2 hb2Var2 = t60Var.b;
            lb2 lb2Var = t60Var.c;
            c70 c70Var = t60Var.d;
            nb2 nb2Var = c70Var.a;
            u70 u70Var = t60Var.e;
            hb2 hb2Var3 = t60Var.f;
            if (hb2Var != null) {
                gb2Var = hb2Var.a(new u60(c70Var, u70Var, 0), new u60(c70Var, u70Var, 1));
            } else {
                gb2Var = null;
            }
            if (hb2Var2 != null) {
                c = ' ';
                gb2Var2 = hb2Var2.a(new u60(c70Var, u70Var, 2), new u60(c70Var, u70Var, 3));
            } else {
                c = ' ';
                gb2Var2 = null;
            }
            if (lb2Var.a.c() == r60.e) {
                qr1 qr1Var = nb2Var.d;
                if (qr1Var != null) {
                    cb2Var = new cb2(qr1Var.b);
                } else {
                    qr1 qr1Var2 = u70Var.a.d;
                    if (qr1Var2 != null) {
                        cb2Var = new cb2(qr1Var2.b);
                    }
                    cb2Var = null;
                }
            } else {
                qr1 qr1Var3 = u70Var.a.d;
                if (qr1Var3 != null) {
                    cb2Var = new cb2(qr1Var3.b);
                } else {
                    qr1 qr1Var4 = nb2Var.d;
                    if (qr1Var4 != null) {
                        cb2Var = new cb2(qr1Var4.b);
                    }
                    cb2Var = null;
                }
            }
            if (hb2Var3 != null) {
                gb2Var3 = hb2Var3.a(i5.z, new cb(cb2Var, c70Var, u70Var, 3));
            } else {
                gb2Var3 = null;
            }
            cb cbVar = new cb(gb2Var, gb2Var2, gb2Var3, 2);
            ig1 x2 = e01Var.x(j);
            long j6 = (x2.e << c) | (x2.f & 4294967295L);
            if (!en0.a(this.A, -9223372034707292160L)) {
                j2 = this.A;
            } else {
                j2 = j6;
            }
            hb2 hb2Var4 = this.t;
            if (hb2Var4 != null) {
                gb2Var4 = hb2Var4.a(this.C, new z60(this, j2, 0));
            } else {
                gb2Var4 = null;
            }
            if (gb2Var4 != null) {
                j6 = ((en0) gb2Var4.getValue()).a;
            }
            long d = vs.d(j, j6);
            hb2 hb2Var5 = this.u;
            long j7 = 0;
            if (hb2Var5 != null) {
                j3 = ((xm0) hb2Var5.a(i5.C, new z60(this, j2, 1)).getValue()).a;
            } else {
                j3 = 0;
            }
            hb2 hb2Var6 = this.v;
            if (hb2Var6 != null) {
                j4 = ((xm0) hb2Var6.a(this.D, new z60(this, j2, 2)).getValue()).a;
            } else {
                j4 = 0;
            }
            i3 i3Var = this.B;
            if (i3Var != null) {
                j7 = i3Var.a(j2, d, jq0.e);
            }
            return l01Var.s0((int) (d >> c), (int) (d & 4294967295L), m60Var, new y60(x2, xm0.c(j7, j4), j3, cbVar));
        }
        ig1 x3 = e01Var.x(j);
        return l01Var.s0(x3.e, x3.f, m60Var, new b5(x3, 4));
    }
}
