package defpackage;

import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class yy implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ o22 f;

    public /* synthetic */ yy(o22 o22Var, int i) {
        this.e = i;
        this.f = o22Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        o22 o22Var = this.f;
        switch (i) {
            case 0:
                c40 c40Var = (c40) obj;
                long j = ((co) o22Var.getValue()).a;
                if (!co.c(j, co.g)) {
                    c40.X(c40Var, j, 0L, 0L, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
                }
                return od2Var;
            case 1:
                it0 it0Var = (it0) obj;
                it0Var.getClass();
                List list = (List) o22Var.getValue();
                it0Var.d0(list.size(), new ou(3, new le(24), list), new jh0(0, list), new fq(2039820996, true, new kh0(list)));
                return od2Var;
            default:
                ((io1) obj).c(((Number) o22Var.getValue()).floatValue());
                return od2Var;
        }
    }
}
