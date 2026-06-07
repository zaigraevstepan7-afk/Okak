package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b12 {
    public final oe0 a;
    public Object b;
    public x31 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final i41 e = rp1.f();
    public final i41 f = new i41();
    public final j41 g = new j41();
    public final q41 h = new q41(new j00[16]);
    public final tr i = new tr(this, 1);
    public final i41 l = rp1.f();
    public final HashMap m = new HashMap();

    public b12(oe0 oe0Var) {
        this.a = oe0Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b12.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i, Object obj2, x31 x31Var) {
        int i2;
        if (this.k <= 0) {
            int c = x31Var.c(obj);
            if (c < 0) {
                c = ~c;
                i2 = -1;
            } else {
                i2 = x31Var.c[c];
            }
            x31Var.b[c] = obj;
            x31Var.c[c] = i;
            if ((obj instanceof j00) && i2 != i) {
                i00 h = ((j00) obj).h();
                this.m.put(obj, h.f);
                x31 x31Var2 = h.e;
                i41 i41Var = this.l;
                rp1.s(i41Var, obj);
                Object[] objArr = x31Var2.b;
                long[] jArr = x31Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((j & 255) < 128) {
                                    u22 u22Var = (u22) objArr[(i3 << 3) + i5];
                                    if (u22Var instanceof v22) {
                                        ((v22) u22Var).f(2);
                                    }
                                    rp1.e(i41Var, u22Var, obj);
                                }
                                j >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            if (i2 == -1) {
                if (obj instanceof v22) {
                    ((v22) obj).f(2);
                }
                rp1.e(this.e, obj, obj2);
            }
        }
    }

    public final void c(Object obj, Object obj2) {
        i41 i41Var = this.e;
        rp1.r(i41Var, obj2, obj);
        if ((obj2 instanceof j00) && !i41Var.c(obj2)) {
            rp1.s(this.l, obj2);
            this.m.remove(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b12.d():void");
    }
}
