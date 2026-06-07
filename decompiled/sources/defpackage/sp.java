package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class sp {
    public final /* synthetic */ yp a;

    public /* synthetic */ sp(yp ypVar) {
        this.a = ypVar;
    }

    public final void a(Context context) {
        context.getClass();
        yp ypVar = this.a;
        Bundle q = ((sl0) ypVar.h.f).q("android:support:activity-result");
        if (q != null) {
            xp xpVar = ypVar.l;
            LinkedHashMap linkedHashMap = xpVar.b;
            LinkedHashMap linkedHashMap2 = xpVar.a;
            Bundle bundle = xpVar.g;
            ArrayList<Integer> integerArrayList = q.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = q.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = q.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    xpVar.d.addAll(stringArrayList2);
                }
                Bundle bundle2 = q.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = stringArrayList.get(i);
                    if (linkedHashMap.containsKey(str)) {
                        Integer num = (Integer) linkedHashMap.remove(str);
                        if (!bundle.containsKey(str)) {
                            fc2.r(linkedHashMap2).remove(num);
                        }
                    }
                    Integer num2 = integerArrayList.get(i);
                    num2.getClass();
                    int intValue = num2.intValue();
                    String str2 = stringArrayList.get(i);
                    str2.getClass();
                    String str3 = str2;
                    linkedHashMap2.put(Integer.valueOf(intValue), str3);
                    xpVar.b.put(str3, Integer.valueOf(intValue));
                }
            }
        }
    }
}
