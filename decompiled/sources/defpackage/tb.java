package defpackage;

import android.media.MediaPlayer;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tb extends q42 implements se0 {
    public final /* synthetic */ int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(Object obj, Object obj2, Object obj3, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                tb tbVar = new tb((ub) obj3, (kp1) obj2, vtVar, 0);
                tbVar.g = obj;
                return tbVar;
            case 1:
                return new tb((o41) this.g, (y00) obj3, (a12) obj2, vtVar, 1);
            case 2:
                return new tb((de0) this.g, (o41) obj3, (o22) obj2, vtVar, 2);
            case 3:
                tb tbVar2 = new tb((uh1) obj3, (b72) obj2, vtVar, 3);
                tbVar2.g = obj;
                return tbVar2;
            default:
                return new tb((co1) this.g, (MediaPlayer) obj3, (zm1) obj2, vtVar, 4);
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
                return ((tb) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                ((tb) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 2:
                ((tb) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 3:
                return ((tb) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                ((tb) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        int i2 = 2;
        int i3 = 1;
        od2 od2Var = od2.a;
        int i4 = 3;
        vt vtVar = null;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                io.K(obj);
                gv gvVar = (gv) this.g;
                ub ubVar = (ub) obj3;
                kp1 kp1Var = (kp1) obj2;
                rx.C(gvVar, null, new sb(ubVar, kp1Var, vtVar, i3), 3);
                rx.C(gvVar, null, new sb(ubVar, kp1Var, vtVar, i2), 3);
                rx.C(gvVar, null, new sb(ubVar, kp1Var, vtVar, i4), 3);
                return rx.C(gvVar, null, new sb(ubVar, kp1Var, vtVar, 4), 3);
            case 1:
                io.K(obj);
                y00 y00Var = (y00) obj3;
                a12 a12Var = (a12) obj2;
                for (d51 d51Var : (Set) ((o41) this.g).getValue()) {
                    if (!((List) y00Var.b().e.e.getValue()).contains(d51Var) && !a12Var.contains(d51Var)) {
                        y00Var.b().c(d51Var);
                    }
                }
                return od2Var;
            case 2:
                io.K(obj);
                if ((((uf) ((o41) obj3).getValue()) instanceof tf) && ((pf) ((o22) obj2).getValue()) == pf.e) {
                    ((de0) this.g).invoke();
                }
                return od2Var;
            case 3:
                io.K(obj);
                gv gvVar2 = (gv) this.g;
                uh1 uh1Var = (uh1) obj3;
                b72 b72Var = (b72) obj2;
                rx.C(gvVar2, null, new lu(uh1Var, b72Var, vtVar, i3), 1);
                return rx.C(gvVar2, null, new lu(uh1Var, b72Var, vtVar, i2), 1);
            default:
                io.K(obj);
                final co1 co1Var = (co1) this.g;
                MediaPlayer mediaPlayer = (MediaPlayer) obj3;
                co1Var.x = mediaPlayer;
                co1Var.n.j((zm1) obj2);
                r22 r22Var = co1Var.v;
                Integer num = new Integer(mediaPlayer.getDuration());
                r22Var.getClass();
                r22Var.k(null, num);
                r22 r22Var2 = co1Var.r;
                Float f = new Float(0.0f);
                r22Var2.getClass();
                r22Var2.k(null, f);
                r22 r22Var3 = co1Var.t;
                Integer num2 = new Integer(0);
                r22Var3.getClass();
                r22Var3.k(null, num2);
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: bo1
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                        co1 co1Var2 = co1.this;
                        r22 r22Var4 = co1Var2.p;
                        Boolean bool = Boolean.FALSE;
                        r22Var4.getClass();
                        r22Var4.k(null, bool);
                        r22 r22Var5 = co1Var2.r;
                        Float valueOf = Float.valueOf(1.0f);
                        r22Var5.getClass();
                        r22Var5.k(null, valueOf);
                        i22 i22Var = co1Var2.y;
                        if (i22Var != null) {
                            i22Var.c(null);
                        }
                        co1Var2.y = null;
                    }
                });
                mediaPlayer.start();
                r22 r22Var4 = co1Var.p;
                Boolean bool = Boolean.TRUE;
                r22Var4.getClass();
                r22Var4.k(null, bool);
                i22 i22Var = co1Var.y;
                if (i22Var != null) {
                    i22Var.c(null);
                }
                co1Var.y = rx.C(rx.x(co1Var), null, new vf(co1Var, vtVar, 11), 3);
                return od2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb(Object obj, Object obj2, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = obj;
        this.i = obj2;
    }
}
