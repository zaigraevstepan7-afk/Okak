package defpackage;

import android.view.Choreographer;
import com.topjohnwu.superuser.Shell;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ea extends q42 implements se0 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea(int i, vt vtVar, int i2) {
        super(i, vtVar);
        this.f = i2;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                return new ea(2, vtVar, 0);
            case 1:
                return new ea(2, vtVar, 1);
            case 2:
                return new ea(2, vtVar, 2);
            case 3:
                return new ea(2, vtVar, 3);
            case 4:
                return new ea(2, vtVar, 4);
            default:
                return new ea(2, vtVar, 5);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((ea) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                ((ea) create((va0) obj, (vt) obj2)).invokeSuspend(od2Var);
                return od2Var;
            case 2:
                ((ea) create((ds1) obj, (vt) obj2)).invokeSuspend(od2Var);
                return od2Var;
            case 3:
                return ((ea) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 4:
                ((ea) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
                return od2Var;
            default:
                ((ea) create((wa0) obj, (vt) obj2)).invokeSuspend(od2Var);
                return od2Var;
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                io.K(obj);
                return Choreographer.getInstance();
            case 1:
                io.K(obj);
                return od2Var;
            case 2:
                io.K(obj);
                return od2Var;
            case 3:
                io.K(obj);
                return Boolean.valueOf(Shell.getShell().isRoot());
            case 4:
                io.K(obj);
                Shell.getShell().close();
                return od2Var;
            default:
                io.K(obj);
                return od2Var;
        }
    }
}
