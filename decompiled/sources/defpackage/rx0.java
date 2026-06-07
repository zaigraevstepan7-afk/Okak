package defpackage;

import com.topjohnwu.superuser.Shell;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rx0 extends q42 implements se0 {
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ tx0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx0(tx0 tx0Var, vt vtVar) {
        super(2, vtVar);
        this.h = tx0Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        rx0 rx0Var = new rx0(this.h, vtVar);
        rx0Var.g = obj;
        return rx0Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((rx0) create((dj1) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, wl1] */
    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        dj1 dj1Var = (dj1) this.g;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            Shell.cmd("logcat -c").submit();
            v3 v3Var = new v3(rx.C(dj1Var, null, new qx0(this.h, obj2, obj3, dj1Var, null), 3), 18);
            this.g = null;
            this.f = 1;
            Object r = fp.r(dj1Var, v3Var, this);
            hv hvVar = hv.e;
            if (r == hvVar) {
                return hvVar;
            }
        }
        return od2.a;
    }
}
