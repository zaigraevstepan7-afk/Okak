package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k51 extends kg2 {
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // defpackage.kg2
    public final void d() {
        LinkedHashMap linkedHashMap = this.b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((sg2) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        mp0.m(16);
        sb.append(yq1.B(16, identityHashCode & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
