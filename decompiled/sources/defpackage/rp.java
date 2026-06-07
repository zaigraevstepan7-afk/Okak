package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class rp implements ar1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rp(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ar1
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        xd1[] xd1VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                xp xpVar = ((yp) obj).l;
                xpVar.getClass();
                LinkedHashMap linkedHashMap = xpVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(xpVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(xpVar.g));
                return bundle;
            case 1:
                Map d = ((pq1) obj).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : d.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list instanceof ArrayList) {
                        arrayList = (ArrayList) list;
                    } else {
                        arrayList = new ArrayList<>(list);
                    }
                    bundle2.putParcelableArrayList(str, arrayList);
                }
                return bundle2;
            default:
                qg qgVar = (qg) obj;
                for (Map.Entry entry2 : tz0.f0((LinkedHashMap) qgVar.d).entrySet()) {
                    qgVar.l(((r22) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : tz0.f0((LinkedHashMap) qgVar.b).entrySet()) {
                    qgVar.l(((ar1) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) qgVar.a;
                if (linkedHashMap2.isEmpty()) {
                    xd1VarArr = new xd1[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList2.add(new xd1((String) entry4.getKey(), entry4.getValue()));
                    }
                    xd1VarArr = (xd1[]) arrayList2.toArray(new xd1[0]);
                }
                return bf.v((xd1[]) Arrays.copyOf(xd1VarArr, xd1VarArr.length));
        }
    }
}
