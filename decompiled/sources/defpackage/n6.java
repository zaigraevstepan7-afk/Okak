package defpackage;

import android.util.LongSparseArray;
import com.topjohnwu.superuser.CallbackList;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.internal.MainShell;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ n6(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                d6.v((p6) obj2, (LongSparseArray) obj);
                return;
            case 1:
                ((CallbackList) obj2).lambda$add$0(obj);
                return;
            case 2:
                yp ypVar = (yp) obj2;
                ypVar.e.a(new pp((y91) obj, ypVar));
                return;
            case 3:
                ((Shell.GetShellCallback) obj2).onShell((Shell) obj);
                return;
            default:
                MainShell.lambda$get$1((Executor) obj2, (Shell.GetShellCallback) obj);
                return;
        }
    }
}
