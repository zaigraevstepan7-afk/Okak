package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yf0 extends ee2 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = co.g;
    public List f;
    public boolean g;
    public n8 h;
    public oe0 i;
    public final n3 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public yf0() {
        int i = me2.a;
        this.f = l60.e;
        this.g = true;
        this.j = new n3(this, 16);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.ee2
    public final void a(c40 c40Var) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = d01.a();
                this.b = fArr;
            } else {
                d01.d(fArr);
            }
            d01.i(fArr, this.q + this.m, this.r + this.n);
            d01.e(fArr, this.l);
            d01.f(fArr, this.o, this.p);
            d01.i(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                n8 n8Var = this.h;
                if (n8Var == null) {
                    n8Var = p8.a();
                    this.h = n8Var;
                }
                hp.R(this.f, n8Var);
            }
            this.g = false;
        }
        ld b0 = c40Var.b0();
        long k = b0.k();
        b0.h().h();
        try {
            ld ldVar = (ld) ((rg2) b0.f).f;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                ldVar.h().l(fArr2);
            }
            n8 n8Var2 = this.h;
            if (!this.f.isEmpty() && n8Var2 != null) {
                ldVar.h().m(n8Var2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ee2) arrayList.get(i)).a(c40Var);
            }
        } finally {
            l90.v(b0, k);
        }
    }

    @Override // defpackage.ee2
    public final oe0 b() {
        return this.i;
    }

    @Override // defpackage.ee2
    public final void d(n3 n3Var) {
        this.i = n3Var;
    }

    public final void e(int i, ee2 ee2Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, ee2Var);
        } else {
            arrayList.add(ee2Var);
        }
        g(ee2Var);
        ee2Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = me2.a;
            if (co.h(j2) != co.h(j) || co.g(j2) != co.g(j) || co.e(j2) != co.e(j)) {
                this.d = false;
                this.e = co.g;
            }
        }
    }

    public final void g(ee2 ee2Var) {
        if (ee2Var instanceof pe1) {
            pe1 pe1Var = (pe1) ee2Var;
            ck ckVar = pe1Var.b;
            if (this.d && ckVar != null) {
                if (ckVar instanceof i12) {
                    f(((i12) ckVar).a);
                } else {
                    this.d = false;
                    this.e = co.g;
                }
            }
            ck ckVar2 = pe1Var.g;
            if (this.d && ckVar2 != null) {
                if (ckVar2 instanceof i12) {
                    f(((i12) ckVar2).a);
                    return;
                } else {
                    this.d = false;
                    this.e = co.g;
                    return;
                }
            }
            return;
        }
        if (ee2Var instanceof yf0) {
            yf0 yf0Var = (yf0) ee2Var;
            if (yf0Var.d && this.d) {
                f(yf0Var.e);
            } else {
                this.d = false;
                this.e = co.g;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ee2 ee2Var = (ee2) arrayList.get(i);
            sb.append("\t");
            sb.append(ee2Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
