package defpackage;

import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ba implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ba(Object obj, int i, long j) {
        this.e = i;
        this.g = obj;
        this.f = j;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        long _init_$lambda$0;
        int i = this.e;
        long j = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((fw1) ((ck) obj)).b(j);
            case 1:
                _init_$lambda$0 = Http2Connection._init_$lambda$0((Http2Connection) obj, j);
                return Long.valueOf(_init_$lambda$0);
            default:
                return Long.valueOf(RealWebSocket.d((RealWebSocket) obj, j));
        }
    }
}
