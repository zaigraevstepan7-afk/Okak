package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j4 extends q42 implements oe0 {
    public final /* synthetic */ int f;
    public int g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(Object obj, Object obj2, vt vtVar, int i) {
        super(1, vtVar);
        this.f = i;
        this.h = obj;
        this.i = obj2;
    }

    @Override // defpackage.eh
    public final vt create(vt vtVar) {
        int i = this.f;
        Object obj = this.i;
        switch (i) {
            case 0:
                return new j4((n4) this.h, (te0) obj, vtVar, 0);
            case 1:
                return new j4((x9) this.h, (i62) obj, vtVar, 1);
            case 2:
                return new j4((nh) this.h, (mh) obj, vtVar, 2);
            default:
                return new j4((nx) obj, vtVar);
        }
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        vt vtVar = (vt) obj;
        switch (i) {
            case 0:
                return ((j4) create(vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((j4) create(vtVar)).invokeSuspend(od2Var);
            case 2:
                return ((j4) create(vtVar)).invokeSuspend(od2Var);
            default:
                return ((j4) create(vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        Looper myLooper;
        Handler handler;
        Looper looper;
        Looper looper2;
        u9 u9Var;
        Looper looper3;
        Throwable th;
        n22 n22Var;
        int i = this.f;
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        int i2 = 2;
        Object obj2 = this.i;
        vt vtVar = null;
        switch (i) {
            case 0:
                n4 n4Var = (n4) this.h;
                int i3 = this.g;
                if (i3 != 0) {
                    if (i3 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    i4 i4Var = new i4(n4Var, i2);
                    l lVar = new l((te0) obj2, n4Var, vtVar, 3);
                    this.g = 1;
                    if (mp0.g(i4Var, lVar, this) == hvVar) {
                        return hvVar;
                    }
                }
                cy c = n4Var.c();
                fe1 fe1Var = n4Var.j;
                Object a = c.a(fe1Var.g());
                if (a != null) {
                    if (Math.abs(fe1Var.g() - n4Var.c().f(a)) < 0.5f && ((Boolean) n4Var.a.invoke(a)).booleanValue()) {
                        n4Var.h.setValue(a);
                        n4Var.g(a);
                        return od2Var;
                    }
                    return od2Var;
                }
                return od2Var;
            case 1:
                x9 x9Var = (x9) this.h;
                c12 c12Var = x9Var.e;
                View view = x9Var.a;
                int i4 = this.g;
                try {
                    if (i4 != 0) {
                        if (i4 == 1) {
                            io.K(obj);
                        } else {
                            se.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        io.K(obj);
                        v9 v9Var = new v9();
                        i62 i62Var = (i62) obj2;
                        int i5 = 0;
                        u9 u9Var2 = new u9(v9Var, new s9(x9Var, i62Var, 0), new s9(x9Var, i62Var, 1), view);
                        oe0 oe0Var = x9Var.b;
                        if (oe0Var != null && (u9Var = (u9) oe0Var.invoke(u9Var2)) != null) {
                            u9Var2 = u9Var;
                        }
                        Looper myLooper2 = Looper.myLooper();
                        Handler handler2 = view.getHandler();
                        if (handler2 != null) {
                            looper2 = handler2.getLooper();
                        } else {
                            looper2 = null;
                        }
                        if (myLooper2 != looper2) {
                            w9 w9Var = x9Var.i;
                            if (w9Var == null) {
                                w9Var = new w9(x9Var, u9Var2, v9Var, i5);
                                x9Var.i = w9Var;
                            }
                            view.post(w9Var);
                        } else {
                            ActionMode startActionMode = view.startActionMode(new ua0(u9Var2), 1);
                            if (startActionMode != null) {
                                x9Var.h = startActionMode;
                            } else {
                                return od2Var;
                            }
                        }
                        this.g = 1;
                        Object f = v9Var.a.f(this);
                        if (f != hvVar) {
                            f = od2Var;
                        }
                        if (f == hvVar) {
                            return hvVar;
                        }
                    }
                    if (handler != null) {
                        looper3 = handler.getLooper();
                    } else {
                        looper3 = null;
                    }
                    if (myLooper != looper3) {
                        Runnable runnable = x9Var.j;
                        if (runnable == null) {
                            runnable = new r5(x9Var, i2);
                            x9Var.j = runnable;
                        }
                        view.post(runnable);
                    } else {
                        ActionMode actionMode = x9Var.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    w9 w9Var2 = x9Var.i;
                    if (w9Var2 != null) {
                        view.removeCallbacks(w9Var2);
                    }
                    x9Var.h = null;
                    return od2Var;
                } finally {
                    c12Var.a();
                    myLooper = Looper.myLooper();
                    handler = view.getHandler();
                    if (handler != null) {
                        looper = handler.getLooper();
                    } else {
                        looper = null;
                    }
                    if (myLooper != looper) {
                        Runnable runnable2 = x9Var.j;
                        if (runnable2 == null) {
                            runnable2 = new r5(x9Var, i2);
                            x9Var.j = runnable2;
                        }
                        view.post(runnable2);
                    } else {
                        ActionMode actionMode2 = x9Var.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    w9 w9Var3 = x9Var.i;
                    if (w9Var3 != null) {
                        view.removeCallbacks(w9Var3);
                    }
                    x9Var.h = null;
                }
            case 2:
                mh mhVar = (mh) obj2;
                je1 je1Var = ((nh) this.h).c;
                int i6 = this.g;
                try {
                    if (i6 != 0) {
                        if (i6 == 1) {
                            io.K(obj);
                        } else {
                            se.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        io.K(obj);
                        je1Var.setValue(mhVar);
                        this.g = 1;
                        Object f2 = mhVar.b.f(this);
                        if (f2 != hvVar) {
                            f2 = od2Var;
                        }
                        if (f2 == hvVar) {
                            return hvVar;
                        }
                    }
                    return od2Var;
                } finally {
                    je1Var.setValue(null);
                }
            default:
                nx nxVar = (nx) obj2;
                int i7 = this.g;
                try {
                } catch (Throwable th2) {
                    ay1 g = nxVar.g();
                    this.h = th2;
                    this.g = 2;
                    Integer a2 = g.a();
                    if (a2 != hvVar) {
                        obj = a2;
                        th = th2;
                    } else {
                        return hvVar;
                    }
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            th = (Throwable) this.h;
                            io.K(obj);
                            n22Var = new vk1(th, ((Number) obj).intValue());
                            return new xd1(n22Var, Boolean.TRUE);
                        }
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    io.K(obj);
                } else {
                    io.K(obj);
                    this.g = 1;
                    obj = nx.f(nxVar, true, this);
                    if (obj == hvVar) {
                        return hvVar;
                    }
                }
                n22Var = (n22) obj;
                return new xd1(n22Var, Boolean.TRUE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(nx nxVar, vt vtVar) {
        super(1, vtVar);
        this.f = 3;
        this.i = nxVar;
    }
}
