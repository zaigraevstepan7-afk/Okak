package defpackage;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class yk0 implements te0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;

    public /* synthetic */ yk0(h32 h32Var, boolean z, long j) {
        this.h = h32Var;
        this.f = z;
        this.g = j;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.time.LocalDateTime] */
    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        String str2;
        int i = this.e;
        od2 od2Var = od2.a;
        boolean z2 = false;
        Object obj4 = this.h;
        final long j = this.g;
        boolean z3 = this.f;
        switch (i) {
            case 0:
                h32 h32Var = (h32) obj4;
                ur urVar = (ur) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    b21 b21Var = b21.a;
                    e21 K = sn0.K(b21Var, 20.0f);
                    yo a = wo.a(c01.g, g3.r, urVar, 0);
                    int hashCode = Long.hashCode(urVar.T);
                    sf1 l = urVar.l();
                    e21 Q = fp.Q(urVar, K);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, kr.f, a);
                    op1.q(urVar, kr.e, l);
                    op1.l(urVar, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar, kr.h);
                    op1.q(urVar, kr.d, Q);
                    switch (h32Var.a) {
                        case 0:
                            str = "Expires At";
                            break;
                        case 1:
                            str = "Expira Em";
                            break;
                        case 2:
                            str = "Истекает";
                            break;
                        case 3:
                            str = "Закінчується";
                            break;
                        default:
                            str = "过期时间";
                            break;
                    }
                    y22 y22Var = rc2.a;
                    k92 k92Var = ((pc2) urVar.j(y22Var)).m;
                    y22 y22Var2 = oo.a;
                    t82.b(str, null, co.b(((mo) urVar.j(y22Var2)).d, 0.7f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92Var, urVar, 0, 0, 131066);
                    xp1.a(urVar, hy1.c(b21Var, 8.0f));
                    if (!z3 && j != 0) {
                        str2 = Instant.ofEpochSecond(j).atZone(ZoneId.systemDefault()).toLocalDateTime().format(DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm"));
                        str2.getClass();
                    } else {
                        switch (h32Var.a) {
                            case 0:
                                str2 = "Never";
                                break;
                            case 1:
                                str2 = "Nunca";
                                break;
                            case 2:
                                str2 = "Никогда";
                                break;
                            case 3:
                                str2 = "Ніколи";
                                break;
                            default:
                                str2 = "永不过期";
                                break;
                        }
                    }
                    t82.b(str2, null, ((mo) urVar.j(y22Var2)).d, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar.j(y22Var)).h, 0L, 0L, sd0.i, null, 0L, 0L, null, 16777211), urVar, 0, 0, 131066);
                    urVar.p(true);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                final qk1 qk1Var = (qk1) obj4;
                ur urVar2 = (ur) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                }
                if (urVar2.O(intValue2 & 1, z2)) {
                    vn.g(Boolean.valueOf(z3), null, fp.a0(u21.g, urVar2), null, go.N(-2064098104, new te0() { // from class: bk1
                        @Override // defpackage.te0
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            boolean z4;
                            int i2;
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            ur urVar3 = (ur) obj6;
                            int intValue3 = ((Integer) obj7).intValue();
                            if ((intValue3 & 6) == 0) {
                                if (urVar3.g(booleanValue)) {
                                    i2 = 4;
                                } else {
                                    i2 = 2;
                                }
                                intValue3 |= i2;
                            }
                            if ((intValue3 & 19) != 18) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (urVar3.O(intValue3 & 1, z4)) {
                                long j2 = j;
                                if (booleanValue) {
                                    urVar3.X(-499763759);
                                    int i3 = jk1.a;
                                    pj1.a(hy1.f(b21.a, 16.0f), j2, 2.5f, 0L, 0, 0.0f, urVar3, 390, 56);
                                    urVar3.p(false);
                                } else {
                                    urVar3.X(-499540745);
                                    final qk1 qk1Var2 = qk1Var;
                                    boolean f = urVar3.f(qk1Var2);
                                    Object L = urVar3.L();
                                    if (f || L == or.a) {
                                        L = new ia0() { // from class: ek1
                                            @Override // defpackage.ia0
                                            public final float invoke() {
                                                return ((Number) qk1.this.a.d()).floatValue();
                                            }
                                        };
                                        urVar3.h0(L);
                                    }
                                    jk1.a((ia0) L, j2, urVar3, 0);
                                    urVar3.p(false);
                                }
                            } else {
                                urVar3.R();
                            }
                            return od2.a;
                        }
                    }, urVar2), urVar2, 24576, 10);
                } else {
                    urVar2.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ yk0(boolean z, long j, qk1 qk1Var) {
        this.f = z;
        this.g = j;
        this.h = qk1Var;
    }
}
