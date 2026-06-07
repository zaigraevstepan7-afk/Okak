package defpackage;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zn1 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ co1 h;
    public final /* synthetic */ zm1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn1(zm1 zm1Var, co1 co1Var, vt vtVar) {
        super(2, vtVar);
        this.f = 2;
        this.i = zm1Var;
        this.h = co1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        co1 co1Var = this.h;
        zm1 zm1Var = this.i;
        switch (i) {
            case 0:
                return new zn1(co1Var, zm1Var, vtVar, 0);
            case 1:
                return new zn1(co1Var, zm1Var, vtVar, 1);
            default:
                return new zn1(zm1Var, co1Var, vtVar);
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
                return ((zn1) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((zn1) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((zn1) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = this.f;
        co1 co1Var = this.h;
        zm1 zm1Var = this.i;
        Object obj2 = od2.a;
        Object obj3 = hv.e;
        vt vtVar = null;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 != 0) {
                    if (i2 == 1) {
                        io.K(obj);
                        return obj;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                xg2 xg2Var = co1Var.b;
                String str2 = zm1Var.c;
                this.g = 1;
                Object a = xg2Var.a(str2, 540, 720, this);
                if (a == obj3) {
                    return obj3;
                }
                return a;
            case 1:
                int i3 = this.g;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            io.K(obj);
                        } else {
                            se.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        io.K(obj);
                        zm1 zm1Var2 = (zm1) co1Var.n.getValue();
                        if (zm1Var2 != null) {
                            str = zm1Var2.c;
                        } else {
                            str = null;
                        }
                        if (sn0.r(str, zm1Var.c)) {
                            co1Var.g();
                        }
                        vy vyVar = k10.a;
                        ny nyVar = ny.g;
                        xh xhVar = new xh(zm1Var, vtVar, 4);
                        this.g = 1;
                        if (rx.S(nyVar, xhVar, this) == obj3) {
                            return obj3;
                        }
                    }
                    co1Var.f();
                    return obj2;
                } catch (Exception e) {
                    r22 r22Var = co1Var.h;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    r22Var.getClass();
                    r22Var.k(null, message);
                    return obj2;
                }
            default:
                zm1 zm1Var3 = this.i;
                int i4 = this.g;
                co1 co1Var2 = this.h;
                vt vtVar2 = null;
                try {
                } catch (Exception e2) {
                    vy vyVar2 = k10.a;
                    mg0 mg0Var = gz0.a;
                    xv xvVar = new xv(co1Var2, e2, vtVar2, 5);
                    this.g = 2;
                    this = rx.S(mg0Var, xvVar, this);
                    if (this == obj3) {
                        obj2 = obj3;
                    } else {
                        return obj2;
                    }
                }
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            io.K(obj);
                            return obj2;
                        }
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    io.K(obj);
                } else {
                    io.K(obj);
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    mediaPlayer.setDataSource(zm1Var3.c);
                    mediaPlayer.prepare();
                    vy vyVar3 = k10.a;
                    mg0 mg0Var2 = gz0.a;
                    tb tbVar = new tb(co1Var2, mediaPlayer, zm1Var3, vtVar2, 4);
                    this.g = 1;
                    this = rx.S(mg0Var2, tbVar, this);
                    if (this != obj3) {
                        obj2 = obj3;
                    }
                    obj2 = obj3;
                }
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn1(co1 co1Var, zm1 zm1Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = co1Var;
        this.i = zm1Var;
    }
}
