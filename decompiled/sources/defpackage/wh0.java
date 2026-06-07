package defpackage;

import com.topjohnwu.superuser.Shell;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wh0 extends q42 implements se0 {
    public int f;
    public final /* synthetic */ bi0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh0(bi0 bi0Var, vt vtVar) {
        super(2, vtVar);
        this.g = bi0Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        return new wh0(this.g, vtVar);
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((wh0) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                io.K(obj);
                return obj;
            }
            se.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        io.K(obj);
        bi0 bi0Var = this.g;
        gx1 gx1Var = bi0Var.e;
        String m = l90.m("killall -9 ", bi0Var.f.getName(), " 2>/dev/null || true");
        this.f = 1;
        gx1Var.getClass();
        Shell.Result exec = Shell.cmd(m).exec();
        exec.getClass();
        hv hvVar = hv.e;
        if (exec == hvVar) {
            return hvVar;
        }
        return exec;
    }
}
