package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ww0 extends q42 implements se0 {
    public final /* synthetic */ int f = 1;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ o22 k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww0(lb2 lb2Var, c61 c61Var, d51 d51Var, w31 w31Var, o22 o22Var, wq wqVar, vt vtVar) {
        super(2, vtVar);
        this.g = lb2Var;
        this.h = c61Var;
        this.i = d51Var;
        this.j = w31Var;
        this.k = o22Var;
        this.l = wqVar;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.l;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ww0 ww0Var = new ww0((ya) obj5, (List) obj3, (ge1) this.k, (fe1) obj2, (ya) obj4, vtVar);
                ww0Var.g = obj;
                return ww0Var;
            default:
                return new ww0((lb2) this.g, (c61) obj5, (d51) obj4, (w31) obj3, this.k, (wq) obj2, vtVar);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        gv gvVar = (gv) obj;
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                ((ww0) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            default:
                ((ww0) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        char c;
        char c2;
        char c3;
        int i = this.f;
        od2 od2Var = od2.a;
        Object obj2 = this.j;
        Object obj3 = this.l;
        o22 o22Var = this.k;
        Object obj4 = this.i;
        Object obj5 = this.h;
        char c4 = 3;
        vt vtVar = null;
        switch (i) {
            case 0:
                io.K(obj);
                gv gvVar = (gv) this.g;
                ya yaVar = (ya) obj5;
                List list = (List) obj2;
                ge1 ge1Var = (ge1) o22Var;
                fe1 fe1Var = (fe1) obj3;
                ya yaVar2 = (ya) obj4;
                if (gvVar.A().H(g3.N) == null) {
                    rx.C(gvVar, null, new uw0(yaVar, list, ge1Var, fe1Var, null), 3);
                    rx.C(gvVar, null, new vw0(yaVar2, vtVar, 0), 3);
                    return od2Var;
                }
                se.s();
                return null;
            default:
                io.K(obj);
                lb2 lb2Var = (lb2) this.g;
                Object c5 = lb2Var.a.c();
                je1 je1Var = lb2Var.d;
                if (sn0.r(c5, je1Var.getValue()) && (((d51) ((c61) obj5).b.f.g()) == null || sn0.r(je1Var.getValue(), (d51) obj4))) {
                    wq wqVar = (wq) obj3;
                    Iterator it = ((List) o22Var.getValue()).iterator();
                    while (it.hasNext()) {
                        wqVar.b().c((d51) it.next());
                    }
                    w31 w31Var = (w31) obj2;
                    long[] jArr = w31Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            char c6 = 7;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                int i4 = 0;
                                while (i4 < i3) {
                                    if ((j & 255) < 128) {
                                        int i5 = (i2 << 3) + i4;
                                        c3 = c6;
                                        Object obj6 = w31Var.b[i5];
                                        float f = w31Var.c[i5];
                                        if (!sn0.r((String) obj6, ((d51) je1Var.getValue()).j)) {
                                            w31Var.e--;
                                            long[] jArr2 = w31Var.a;
                                            int i6 = w31Var.d;
                                            int i7 = i5 >> 3;
                                            int i8 = (i5 & 7) << 3;
                                            c2 = c4;
                                            long j2 = (jArr2[i7] & (~(255 << i8))) | (254 << i8);
                                            jArr2[i7] = j2;
                                            jArr2[(((i5 - 7) & i6) + (i6 & 7)) >> 3] = j2;
                                            w31Var.b[i5] = null;
                                        } else {
                                            c2 = c4;
                                        }
                                    } else {
                                        c2 = c4;
                                        c3 = c6;
                                    }
                                    j >>= 8;
                                    i4++;
                                    c6 = c3;
                                    c4 = c2;
                                }
                                c = c4;
                                if (i3 != 8) {
                                }
                            } else {
                                c = c4;
                            }
                            if (i2 != length) {
                                i2++;
                                c4 = c;
                            }
                        }
                    }
                }
                return od2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww0(ya yaVar, List list, ge1 ge1Var, fe1 fe1Var, ya yaVar2, vt vtVar) {
        super(2, vtVar);
        this.h = yaVar;
        this.j = list;
        this.k = ge1Var;
        this.l = fe1Var;
        this.i = yaVar2;
    }
}
