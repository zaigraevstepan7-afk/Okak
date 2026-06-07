package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xv extends q42 implements se0 {
    public final /* synthetic */ int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv(Object obj, Object obj2, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                xv xvVar = new xv((yv) obj2, vtVar, 0);
                xvVar.g = obj;
                return xvVar;
            case 1:
                xv xvVar2 = new xv((n22) obj2, vtVar, 1);
                xvVar2.g = obj;
                return xvVar2;
            case 2:
                xv xvVar3 = new xv((el0) obj2, vtVar, 2);
                xvVar3.g = obj;
                return xvVar3;
            case 3:
                return new xv((de0) this.g, (o41) obj2, vtVar, 3);
            case 4:
                return new xv((l40) this.g, (oc0) obj2, vtVar, 4);
            default:
                return new xv((co1) this.g, (Exception) obj2, vtVar, 5);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((xv) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((xv) create((n22) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                ((xv) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
                return od2Var;
            case 3:
                ((xv) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
                return od2Var;
            case 4:
                ((xv) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
                return od2Var;
            default:
                ((xv) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
                return od2Var;
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        boolean z = false;
        vt vtVar = null;
        od2 od2Var = od2.a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                io.K(obj);
                gv gvVar = (gv) this.g;
                yv yvVar = (yv) obj2;
                go0 go0Var = (go0) yvVar.b.getAndSet(null);
                AtomicReference atomicReference = yvVar.b;
                i22 C = rx.C(gvVar, null, new j(go0Var, yvVar, vtVar, 13), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, C)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                io.K(obj);
                n22 n22Var = (n22) this.g;
                if ((n22Var instanceof aw) && ((aw) n22Var).a <= ((aw) ((n22) obj2)).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                gv gvVar2 = (gv) this.g;
                io.K(obj);
                el0 el0Var = (el0) obj2;
                kd e = el0.e(el0Var, el0Var.f, "Standoff 2");
                kd e2 = el0.e(el0Var, el0Var.g, "Elixir Loader");
                el0Var.h = e;
                el0Var.i = e2;
                rx.C(gvVar2, null, new l(el0Var, e, e2, null, 23), 3);
                return od2Var;
            case 3:
                io.K(obj);
                if (((uf) ((o41) obj2).getValue()) instanceof tf) {
                    ((de0) this.g).invoke();
                }
                return od2Var;
            case 4:
                io.K(obj);
                if (((l40) this.g).c()) {
                    oc0.a((oc0) obj2);
                }
                return od2Var;
            default:
                io.K(obj);
                r22 r22Var = ((co1) this.g).h;
                String str = "Cannot play: " + ((Exception) obj2).getMessage();
                r22Var.getClass();
                r22Var.k(null, str);
                return od2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv(Object obj, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = obj;
    }
}
