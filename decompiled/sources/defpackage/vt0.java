package defpackage;

import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vt0 implements oq1, lq1 {
    public final pq1 e;
    public final lq1 f;
    public final j41 g;

    public vt0(oq1 oq1Var, Map map, lq1 lq1Var) {
        r rVar = new r(oq1Var, 20);
        y22 y22Var = qq1.a;
        this.e = new pq1(map, rVar);
        this.f = lq1Var;
        j41 j41Var = tr1.a;
        this.g = new j41();
    }

    @Override // defpackage.oq1
    public final ld a(String str, de0 de0Var) {
        return this.e.a(str, de0Var);
    }

    @Override // defpackage.lq1
    public final void b(Object obj, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        urVar.Y(-858296452);
        if ((i & 6) == 0) {
            if (urVar.h(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        int i6 = 16;
        if ((i & 48) == 0) {
            if (urVar.h(fqVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (urVar.h(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            this.f.b(obj, fqVar, urVar, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            boolean h = urVar.h(this) | urVar.h(obj);
            Object L = urVar.L();
            if (h || L == or.a) {
                L = new i(i6, this, obj);
                urVar.h0(L);
            }
            bf.d(obj, (oe0) L, urVar);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h9(this, obj, fqVar, i, 8);
        }
    }

    @Override // defpackage.oq1
    public final boolean c(Object obj) {
        return this.e.c(obj);
    }

    @Override // defpackage.oq1
    public final Map d() {
        j41 j41Var = this.g;
        Object[] objArr = j41Var.b;
        long[] jArr = j41Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.f.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.e.d();
    }

    @Override // defpackage.oq1
    public final Object e(String str) {
        return this.e.e(str);
    }

    @Override // defpackage.lq1
    public final void f(Object obj) {
        this.f.f(obj);
    }
}
