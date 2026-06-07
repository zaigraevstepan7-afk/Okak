package defpackage;

import com.topjohnwu.superuser.Shell;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hx1 extends q42 implements se0 {
    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        return new q42(2, vtVar);
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((hx1) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        io.K(obj);
        Shell.Result exec = Shell.cmd("settings get secure android_id").exec();
        exec.getClass();
        if (exec.isSuccess()) {
            List<String> out = exec.getOut();
            out.getClass();
            return (String) wn.h0(out);
        }
        return null;
    }
}
