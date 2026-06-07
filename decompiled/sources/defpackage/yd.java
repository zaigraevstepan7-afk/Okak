package defpackage;

import java.util.List;
import kotlinx.serialization.SerializersCacheKt;
import okhttp3.Handshake;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class yd implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ List f;

    public /* synthetic */ yd(int i, List list) {
        this.e = i;
        this.f = list;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                return Integer.valueOf(list.size());
            case 1:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 2:
                return Handshake.Companion.b(list);
            case 3:
                return Handshake.Companion.a(list);
            case 4:
                return SerializersCacheKt.c(list);
            default:
                return SerializersCacheKt.f(list);
        }
    }
}
