package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ah extends kg2 {
    public final String b = "SaveableStateHolder_BackStackEntryKey";
    public final String c;
    public ov1 d;

    public ah(sq1 sq1Var) {
        Object obj;
        sq1Var.getClass();
        qg qgVar = sq1Var.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) qgVar.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) qgVar.d;
        try {
            r22 r22Var = (r22) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (r22Var == null || (obj = r22Var.getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) qgVar.c).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = UUID.randomUUID().toString();
            String str2 = this.b;
            str2.getClass();
            if (str != null) {
                ArrayList arrayList = uq1.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()).isInstance(str)) {
                        }
                    }
                }
                y61.r("Can't put value with type ", str.getClass(), " into saved state");
                throw null;
            }
            ArrayList arrayList2 = uq1.a;
            sq1Var.a.get(str2);
            qgVar.l(str, str2);
        }
        this.c = str;
    }

    @Override // defpackage.kg2
    public final void d() {
        ov1 ov1Var = this.d;
        if (ov1Var != null) {
            lq1 lq1Var = (lq1) ((WeakReference) ov1Var.f).get();
            if (lq1Var != null) {
                lq1Var.f(this.c);
            }
            ov1 ov1Var2 = this.d;
            if (ov1Var2 != null) {
                ((WeakReference) ov1Var2.f).clear();
                return;
            } else {
                sn0.V("saveableStateHolderRef");
                throw null;
            }
        }
        sn0.V("saveableStateHolderRef");
        throw null;
    }
}
