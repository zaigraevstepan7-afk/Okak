package defpackage;

import com.elixir.loader.UserSettings;
import java.io.IOException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qw extends q42 implements te0 {
    public int f;
    public /* synthetic */ wa0 g;
    public /* synthetic */ Throwable h;

    /* JADX WARN: Type inference failed for: r1v1, types: [qw, q42] */
    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? q42Var = new q42(3, (vt) obj3);
        q42Var.g = (wa0) obj;
        q42Var.h = (Throwable) obj2;
        return q42Var.invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        wa0 wa0Var = this.g;
        Throwable th = this.h;
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
            if (th instanceof IOException) {
                UserSettings defaultInstance = UserSettings.getDefaultInstance();
                defaultInstance.getClass();
                this.g = null;
                this.h = null;
                this.f = 1;
                Object b = wa0Var.b(defaultInstance, this);
                hv hvVar = hv.e;
                if (b == hvVar) {
                    return hvVar;
                }
            } else {
                throw th;
            }
        }
        return od2.a;
    }
}
