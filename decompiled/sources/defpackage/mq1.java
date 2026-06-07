package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mq1 implements lq1 {
    public static final sl0 i = new sl0(new p11(11), new v51(17));
    public final Map e;
    public final i41 f;
    public oq1 g;
    public final hh1 h;

    public mq1(Map map) {
        this.e = map;
        long[] jArr = sr1.a;
        this.f = new i41();
        this.h = new hh1(this, 6);
    }

    @Override // defpackage.lq1
    public final void b(Object obj, fq fqVar, ur urVar, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        urVar.Y(533563200);
        if ((i2 & 6) == 0) {
            if (urVar.h(obj)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.h(fqVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (urVar.h(this)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i3 & 1, z)) {
            urVar.Z(obj);
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (L == xl1Var) {
                hh1 hh1Var = this.h;
                if (((Boolean) hh1Var.invoke(obj)).booleanValue()) {
                    Map map = (Map) this.e.get(obj);
                    y22 y22Var = qq1.a;
                    rq1 rq1Var = new rq1(new pq1(map, hh1Var));
                    urVar.h0(rq1Var);
                    L = rq1Var;
                } else {
                    y61.r("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
            }
            rq1 rq1Var2 = (rq1) L;
            vn.c(new zj1[]{qq1.a.a(rq1Var2), fx0.a.a(rq1Var2)}, fqVar, urVar, (i3 & 112) | 8);
            boolean h = urVar.h(this) | urVar.h(obj) | urVar.h(rq1Var2);
            Object L2 = urVar.L();
            if (h || L2 == xl1Var) {
                L2 = new k1(this, obj, rq1Var2, 14);
                urVar.h0(L2);
            }
            bf.d(od2.a, (oe0) L2, urVar);
            if (urVar.y && urVar.G.i == urVar.z) {
                urVar.z = -1;
                urVar.y = false;
            }
            urVar.p(false);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h9(this, obj, fqVar, i2, 10);
        }
    }

    @Override // defpackage.lq1
    public final void f(Object obj) {
        if (this.f.k(obj) == null) {
            this.e.remove(obj);
        }
    }
}
