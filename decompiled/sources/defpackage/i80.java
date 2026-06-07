package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i80 implements bi1 {
    public final int e;
    public final o41 f;
    public final y70 g;
    public final q3 h;
    public final q3 i;
    public final kh2 j;
    public final kh2 k;
    public final r3 l;
    public final r3 m;
    public final lh2 n;
    public final lh2 o;

    public i80(c00 c00Var, int i, o41 o41Var, y70 y70Var) {
        float f = w01.a;
        int j0 = c00Var.j0(48.0f);
        this.e = i;
        this.f = o41Var;
        this.g = y70Var;
        ii iiVar = g3.r;
        this.h = new q3(iiVar, iiVar);
        ii iiVar2 = g3.t;
        this.i = new q3(iiVar2, iiVar2);
        this.j = new kh2(bf.c);
        this.k = new kh2(bf.d);
        ji jiVar = g3.o;
        ji jiVar2 = g3.q;
        this.l = new r3(jiVar, jiVar2);
        this.m = new r3(jiVar2, jiVar);
        this.n = new lh2(jiVar, j0);
        this.o = new lh2(jiVar2, j0);
    }

    @Override // defpackage.bi1
    public final long c(bn0 bn0Var, long j, jq0 jq0Var, long j2) {
        kh2 kh2Var;
        bn0 bn0Var2;
        char c;
        long j3;
        int i;
        lh2 lh2Var;
        o41 o41Var = this.f;
        if (o41Var != null) {
            o41Var.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((int) (j >> 32)) << 32) | ((((int) (j & 4294967295L)) + this.e) & 4294967295L);
        int i2 = (int) (j5 >> 32);
        if (((int) (bn0Var.a() >> 32)) < i2 / 2) {
            kh2Var = this.j;
        } else {
            kh2Var = this.k;
        }
        int i3 = 0;
        List F = xn.F(this.h, this.i, kh2Var);
        int size = F.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                c = c2;
                j3 = j4;
                int i5 = (int) (j2 >> c);
                int i6 = size;
                int i7 = i4;
                bn0Var2 = bn0Var;
                List list = F;
                i = ((x01) F.get(i4)).a(bn0Var2, j5, i5, jq0Var);
                if (i7 == list.size() - 1 || (i >= 0 && i5 + i <= i2)) {
                    break;
                }
                i4 = i7 + 1;
                F = list;
                size = i6;
                c2 = c;
                j4 = j3;
            } else {
                bn0Var2 = bn0Var;
                c = c2;
                j3 = j4;
                i = 0;
                break;
            }
        }
        int i8 = (int) (j5 & j3);
        if (((int) (bn0Var2.a() & j3)) < i8 / 2) {
            lh2Var = this.n;
        } else {
            lh2Var = this.o;
        }
        List F2 = xn.F(this.l, this.m, lh2Var);
        int size2 = F2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            int i10 = (int) (j2 & j3);
            int a = ((y01) F2.get(i9)).a(bn0Var2, j5, i10);
            if (i9 == F2.size() - 1 || (a >= 0 && i10 + a <= i8)) {
                i3 = a;
                break;
            }
        }
        long j6 = (i << c) | (i3 & j3);
        this.g.invoke(bn0Var2, hp.b(j6, j2));
        return j6;
    }
}
