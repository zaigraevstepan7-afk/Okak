package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pe1 extends ee2 {
    public ck b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public ck g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public q32 q;
    public final n8 r;
    public n8 s;
    public n8 t;
    public final rr0 u;

    public pe1() {
        int i = me2.a;
        this.d = l60.e;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        n8 a = p8.a();
        this.r = a;
        this.s = a;
        this.u = lo.O(xt0.f, hs.n);
    }

    @Override // defpackage.ee2
    public final void a(c40 c40Var) {
        c40 c40Var2;
        q32 q32Var;
        if (this.n) {
            hp.R(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        ck ckVar = this.b;
        if (ckVar != null) {
            c40Var2 = c40Var;
            c40.T(c40Var2, this.s, ckVar, this.c, null, 56);
        } else {
            c40Var2 = c40Var;
        }
        ck ckVar2 = this.g;
        if (ckVar2 != null) {
            q32 q32Var2 = this.q;
            if (!this.o && q32Var2 != null) {
                q32Var = q32Var2;
            } else {
                q32 q32Var3 = new q32(this.f, this.j, this.h, this.i, 16);
                this.q = q32Var3;
                this.o = false;
                q32Var = q32Var3;
            }
            c40.T(c40Var2, this.s, ckVar2, this.e, q32Var, 48);
        }
    }

    public final void e() {
        int i;
        Path path;
        float f = this.k;
        n8 n8Var = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = n8Var;
            return;
        }
        if (sn0.r(this.s, n8Var)) {
            this.s = p8.a();
        } else {
            if (this.s.a.getFillType() == Path.FillType.EVEN_ODD) {
                i = 1;
            } else {
                i = 0;
            }
            this.s.h();
            this.s.i(i);
        }
        rr0 rr0Var = this.u;
        PathMeasure pathMeasure = ((o8) rr0Var.getValue()).a;
        if (n8Var != null) {
            path = n8Var.a;
        } else {
            path = null;
        }
        pathMeasure.setPath(path, false);
        float length = ((o8) rr0Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 > f5) {
            n8 n8Var2 = this.t;
            if (n8Var2 == null) {
                n8Var2 = p8.a();
                this.t = n8Var2;
            }
            n8Var2.g();
            ((o8) rr0Var.getValue()).a(f4, length, n8Var2);
            n8.a(this.s, n8Var2);
            n8Var2.g();
            ((o8) rr0Var.getValue()).a(0.0f, f5, n8Var2);
            n8.a(this.s, n8Var2);
            return;
        }
        ((o8) rr0Var.getValue()).a(f4, f5, this.s);
    }

    public final String toString() {
        return this.r.toString();
    }
}
