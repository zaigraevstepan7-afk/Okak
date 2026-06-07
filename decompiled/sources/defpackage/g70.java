package defpackage;

import java.util.List;
import kotlinx.serialization.internal.EnumDescriptor;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class g70 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ g70(int i, String str, EnumDescriptor enumDescriptor) {
        this.e = 0;
        this.f = i;
        this.g = str;
        this.h = enumDescriptor;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        od2 pushRequestLater$lambda$1;
        int i = this.e;
        Object obj = this.h;
        int i2 = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return EnumDescriptor.d(i2, (String) obj2, (EnumDescriptor) obj);
            case 1:
                pushRequestLater$lambda$1 = Http2Connection.pushRequestLater$lambda$1((Http2Connection) obj2, i2, (List) obj);
                return pushRequestLater$lambda$1;
            default:
                ((oe0) obj2).invoke(Integer.valueOf(i2));
                ((o41) obj).setValue(Boolean.FALSE);
                return od2.a;
        }
    }

    public /* synthetic */ g70(Object obj, int i, int i2, Object obj2) {
        this.e = i2;
        this.g = obj;
        this.f = i;
        this.h = obj2;
    }
}
