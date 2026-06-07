package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@f71("activity")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lb2;", "Lg71;", "La2;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public class b2 extends g71 {
    public final Activity c;

    public b2(Context context) {
        Object obj;
        context.getClass();
        Iterator it = mv1.G(context, new p1(1)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.c = (Activity) obj;
    }

    @Override // defpackage.g71
    public final r51 a() {
        return new r51(this);
    }

    @Override // defpackage.g71
    public final r51 c(r51 r51Var) {
        throw new IllegalStateException(("Destination " + ((a2) r51Var).f.a + " does not have an Intent set.").toString());
    }

    @Override // defpackage.g71
    public final boolean f() {
        Activity activity = this.c;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
