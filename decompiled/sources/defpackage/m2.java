package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import com.elixir.loader.R;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m2 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n10
    public final void a() {
        Integer num;
        int i = this.a;
        Object obj = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j2 j2Var = ((g2) obj2).a;
                if (j2Var != null) {
                    xp xpVar = j2Var.I;
                    String str = j2Var.J;
                    Bundle bundle = xpVar.g;
                    LinkedHashMap linkedHashMap = xpVar.f;
                    str.getClass();
                    if (!xpVar.d.contains(str) && (num = (Integer) xpVar.b.remove(str)) != null) {
                        xpVar.a.remove(num);
                    }
                    xpVar.e.remove(str);
                    if (linkedHashMap.containsKey(str)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
                        linkedHashMap.remove(str);
                    }
                    if (bundle.containsKey(str)) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            obj = f1.c(str, bundle);
                        } else {
                            Parcelable parcelable = bundle.getParcelable(str);
                            if (d2.class.isInstance(parcelable)) {
                                obj = parcelable;
                            }
                        }
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((d2) obj));
                        bundle.remove(str);
                    }
                    if (xpVar.c.get(str) != null) {
                        se.s();
                        return;
                    }
                    return;
                }
                se.p("Launcher has not been initialized");
                return;
            case 1:
                ((r10) obj2).f.invoke();
                return;
            case 2:
                b10 b10Var = (b10) obj2;
                b10Var.dismiss();
                b10Var.l.e();
                return;
            case 3:
                ai1 ai1Var = (ai1) obj2;
                ai1Var.e();
                ai1Var.setTag(R.id.view_tree_lifecycle_owner, null);
                ai1Var.s.removeViewImmediate(ai1Var);
                return;
            case 4:
                x9 x9Var = (x9) obj2;
                c12 c12Var = x9Var.e;
                l2 l2Var = c12Var.h;
                if (l2Var != null) {
                    l2Var.c();
                }
                c12Var.a();
                ActionMode actionMode = x9Var.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                x9Var.h = null;
                return;
            case 5:
                mh mhVar = (mh) ((nh) obj2).c.getValue();
                if (mhVar != null) {
                    mhVar.close();
                    return;
                }
                return;
            case 6:
                pl plVar = ((ta2) obj2).c;
                if (plVar != null) {
                    plVar.h(null);
                    return;
                }
                return;
            case 7:
                ((b82) obj2).o();
                return;
            case 8:
                j80 j80Var = (j80) obj2;
                View view = j80Var.f;
                if (j80Var.e) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(j80Var);
                    j80Var.e = false;
                }
                view.removeOnAttachStateChangeListener(j80Var);
                return;
            case 9:
                ((gs0) obj2).d = null;
                return;
            case 10:
                vs0 vs0Var = (vs0) obj2;
                dq0 dq0Var = vs0Var.c;
                if (dq0Var != null) {
                    dq0Var.a = false;
                }
                vs0Var.c = null;
                return;
            case 11:
                ((qs0) obj2).f = true;
                return;
            default:
                k11 k11Var = (k11) obj2;
                k11Var.dismiss();
                k11Var.m.e();
                return;
        }
    }
}
