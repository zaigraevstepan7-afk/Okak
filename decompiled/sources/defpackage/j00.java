package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j00 extends v22 implements o22 {
    public final de0 f;
    public final w02 g;
    public i00 h = new i00(q02.j().g());

    public j00(de0 de0Var, w02 w02Var) {
        this.f = de0Var;
        this.g = w02Var;
    }

    @Override // defpackage.u22
    public final w22 a() {
        return this.h;
    }

    @Override // defpackage.u22
    public final void d(w22 w22Var) {
        w22Var.getClass();
        this.h = (i00) w22Var;
    }

    public final i00 g(i00 i00Var, i02 i02Var, boolean z, de0 de0Var) {
        q41 g;
        i00 i00Var2;
        w02 w02Var;
        int i;
        if (i00Var.c(this, i02Var)) {
            if (z) {
                g = fr1.g();
                Object[] objArr = g.e;
                int i2 = g.g;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((tr) objArr[i3]).b();
                }
                try {
                    x31 x31Var = i00Var.e;
                    ld ldVar = x02.a;
                    cn0 cn0Var = (cn0) ldVar.g();
                    if (cn0Var == null) {
                        cn0Var = new cn0();
                        ldVar.q(cn0Var);
                    }
                    int i4 = cn0Var.a;
                    Object[] objArr2 = x31Var.b;
                    int[] iArr = x31Var.c;
                    long[] jArr = x31Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        u22 u22Var = (u22) objArr2[i9];
                                        i = i6;
                                        cn0Var.a = i4 + iArr[i9];
                                        oe0 e = i02Var.e();
                                        if (e != null) {
                                            e.invoke(u22Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    cn0Var.a = i4;
                    Object[] objArr3 = g.e;
                    int i10 = g.g;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((tr) objArr3[i11]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i00Var;
        }
        x31 x31Var2 = new x31();
        ld ldVar2 = x02.a;
        cn0 cn0Var2 = (cn0) ldVar2.g();
        if (cn0Var2 == null) {
            cn0Var2 = new cn0();
            ldVar2.q(cn0Var2);
        }
        int i12 = cn0Var2.a;
        g = fr1.g();
        Object[] objArr4 = g.e;
        int i13 = g.g;
        for (int i14 = 0; i14 < i13; i14++) {
            ((tr) objArr4[i14]).b();
        }
        try {
            cn0Var2.a = i12 + 1;
            Object k = nq1.k(new h00(this, cn0Var2, x31Var2, i12, 0), de0Var);
            cn0Var2.a = i12;
            Object[] objArr5 = g.e;
            int i15 = g.g;
            for (int i16 = 0; i16 < i15; i16++) {
                ((tr) objArr5[i16]).a();
            }
            Object obj = q02.c;
            synchronized (obj) {
                try {
                    i02 j2 = q02.j();
                    Object obj2 = i00Var.f;
                    if (obj2 != i00.h && (w02Var = this.g) != null && w02Var.f(k, obj2)) {
                        i00Var.e = x31Var2;
                        i00Var.g = i00Var.d(this, j2);
                        i00Var2 = i00Var;
                    } else {
                        i00 i00Var3 = this.h;
                        synchronized (obj) {
                            w22 m = q02.m(i00Var3, this);
                            m.a(i00Var3);
                            m.a = j2.g();
                            i00Var2 = (i00) m;
                            i00Var2.e = x31Var2;
                            i00Var2.g = i00Var2.d(this, j2);
                            i00Var2.f = k;
                        }
                        return i00Var2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            cn0 cn0Var3 = (cn0) x02.a.g();
            if (cn0Var3 != null && cn0Var3.a == 0) {
                q02.j().m();
                synchronized (obj) {
                    i02 j3 = q02.j();
                    i00Var2.c = j3.g();
                    i00Var2.d = j3.h();
                    return i00Var2;
                }
            }
            return i00Var2;
        } finally {
            Object[] objArr6 = g.e;
            int i17 = g.g;
            for (int i18 = 0; i18 < i17; i18++) {
                ((tr) objArr6[i18]).a();
            }
        }
    }

    @Override // defpackage.o22
    public final Object getValue() {
        oe0 e = q02.j().e();
        if (e != null) {
            e.invoke(this);
        }
        i02 j = q02.j();
        return g((i00) q02.i(this.h, j), j, true, this.f).f;
    }

    public final i00 h() {
        i02 j = q02.j();
        return g((i00) q02.i(this.h, j), j, false, this.f);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        i00 i00Var = (i00) q02.h(this.h);
        if (i00Var.c(this, q02.j())) {
            str = String.valueOf(i00Var.f);
        } else {
            str = "<Not calculated>";
        }
        sb.append(str);
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
