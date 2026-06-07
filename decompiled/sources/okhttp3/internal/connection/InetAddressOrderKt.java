package okhttp3.internal.connection;

import defpackage.yq1;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"reorderForHappyEyeballs", "", "Ljava/net/InetAddress;", "addresses", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class InetAddressOrderKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<InetAddress> reorderForHappyEyeballs(List<? extends InetAddress> list) {
        list.getClass();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((InetAddress) obj) instanceof Inet6Address) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList;
            ArrayList arrayList4 = arrayList2;
            if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                return _UtilCommonKt.interleave(arrayList3, arrayList4);
            }
            return list;
        }
        return list;
    }
}
