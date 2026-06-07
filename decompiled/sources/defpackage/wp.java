package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.IBinder;
import com.topjohnwu.superuser.internal.RootServiceServer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class wp implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ wp(Object obj, int i, int i2, Object obj2) {
        this.e = i2;
        this.f = obj;
        this.g = i;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l2 l2Var;
        int i = this.e;
        Object obj = this.h;
        int i2 = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                xp xpVar = (xp) obj2;
                Object obj3 = ((e2) obj).a;
                String str = (String) xpVar.a.get(Integer.valueOf(i2));
                if (str != null) {
                    i2 i2Var = (i2) xpVar.e.get(str);
                    if (i2Var != null) {
                        l2Var = i2Var.a;
                    } else {
                        l2Var = null;
                    }
                    if (l2Var == null) {
                        xpVar.g.remove(str);
                        xpVar.f.put(str, obj3);
                        return;
                    } else {
                        l2 l2Var2 = i2Var.a;
                        if (xpVar.d.remove(str)) {
                            ((oe0) ((o41) l2Var2.e).getValue()).invoke(obj3);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1:
                ((xp) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                return;
            case 2:
                ((fj1) ((n00) obj2).c).b(i2, obj);
                return;
            default:
                ((RootServiceServer) obj2).lambda$connect$0(i2, (IBinder) obj);
                return;
        }
    }
}
