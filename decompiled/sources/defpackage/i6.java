package defpackage;

import android.content.Context;
import android.view.Choreographer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i6 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6(int i, Object obj, Object obj2) {
        super(1);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        ml1 ml1Var;
        int i = 0;
        int i2 = 1;
        switch (this.e) {
            case 0:
                Context context = (Context) this.f;
                Context applicationContext = context.getApplicationContext();
                j6 j6Var = (j6) this.g;
                applicationContext.registerComponentCallbacks(j6Var);
                return new h6(i, context, j6Var);
            case 1:
                Context context2 = (Context) this.f;
                Context applicationContext2 = context2.getApplicationContext();
                k6 k6Var = (k6) this.g;
                applicationContext2.registerComponentCallbacks(k6Var);
                return new h6(i2, context2, k6Var);
            case 2:
                return new tl0((hu0) this.f, new s8((t8) this.g, 0));
            case 3:
                tl0 tl0Var = (tl0) this.f;
                synchronized (tl0Var.c) {
                    try {
                        tl0Var.e = true;
                        q41 q41Var = tl0Var.d;
                        Object[] objArr = q41Var.e;
                        int i3 = q41Var.g;
                        while (i < i3) {
                            q81 q81Var = (q81) ((hh2) objArr[i]).get();
                            if (q81Var != null && (ml1Var = q81Var.b) != null) {
                                ml1Var.closeConnection();
                                q81Var.b = null;
                            }
                            i++;
                        }
                        tl0Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                n82 n82Var = ((t8) this.g).f;
                n82Var.b.set(null);
                n82Var.a.c();
                return od2.a;
            case 4:
                ai1 ai1Var = (ai1) this.f;
                ai1Var.setPositionProvider((bi1) this.g);
                ai1Var.o();
                return new x8(0);
            case 5:
                ha haVar = (ha) this.f;
                ia iaVar = (ia) this.g;
                synchronized (haVar.i) {
                    haVar.k.remove(iaVar);
                }
                return od2.a;
            case 6:
                ((Choreographer) ((ja) this.f).f).removeFrameCallback((ia) this.g);
                return od2.a;
            case 7:
                hg1 hg1Var = (hg1) obj;
                ig1 ig1Var = (ig1) this.f;
                float g = ((lt) this.g).c.g();
                hg1Var.getClass();
                hg1.b(hg1Var, ig1Var);
                ig1Var.m0(xm0.c(0L, ig1Var.i), g, null);
                return od2.a;
            case 8:
                hg1.m((hg1) obj, (ig1) this.f, 0, 0, ((pi) this.g).s, 4);
                return od2.a;
            case 9:
                hg1.m((hg1) obj, (ig1) this.f, 0, 0, ((wx1) this.g).E, 4);
                return od2.a;
            default:
                d5 d5Var = (d5) obj;
                se0 se0Var = (se0) this.g;
                rj2 rj2Var = (rj2) this.f;
                if (!rj2Var.g) {
                    wu0 g2 = d5Var.a.g();
                    rj2Var.i = se0Var;
                    if (rj2Var.h == null) {
                        rj2Var.h = g2;
                        g2.a(rj2Var);
                    } else if (g2.c.compareTo(nu0.g) >= 0) {
                        rj2Var.f.B(new fq(1330788943, true, new qj2(rj2Var, se0Var, i2)));
                    }
                }
                return od2.a;
        }
    }
}
