package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class x60 {
    public static final ec2 a = new ec2(i5.x, i5.y);
    public static final f22 b = mp0.M(0.0f, 400.0f, null, 5);
    public static final f22 c;
    public static final f22 d;

    static {
        mp0.M(0.0f, 400.0f, null, 5);
        Map map = vg2.a;
        c = mp0.M(0.0f, 400.0f, new xm0(4294967297L), 1);
        d = mp0.M(0.0f, 400.0f, new en0(4294967297L), 1);
    }

    public static c70 a(dc2 dc2Var, int i) {
        u90 u90Var = dc2Var;
        if ((i & 1) != 0) {
            u90Var = mp0.M(0.0f, 400.0f, null, 5);
        }
        return new c70(new nb2(new w80(u90Var), (ly1) null, (bm) null, (qr1) null, (LinkedHashMap) null, WebSocketProtocol.PAYLOAD_SHORT));
    }

    public static u70 b(dc2 dc2Var, int i) {
        u90 u90Var = dc2Var;
        if ((i & 1) != 0) {
            u90Var = mp0.M(0.0f, 400.0f, null, 5);
        }
        return new u70(new nb2(new w80(u90Var), (ly1) null, (bm) null, (qr1) null, (LinkedHashMap) null, WebSocketProtocol.PAYLOAD_SHORT));
    }

    public static c70 c(dc2 dc2Var, float f) {
        return new c70(new nb2((w80) null, (ly1) null, (bm) null, new qr1(f, cb2.b, dc2Var), (LinkedHashMap) null, 119));
    }

    public static u70 d(dc2 dc2Var) {
        return new u70(new nb2((w80) null, (ly1) null, (bm) null, new qr1(0.95f, cb2.b, dc2Var), (LinkedHashMap) null, 119));
    }

    public static final c70 e(oe0 oe0Var, dc2 dc2Var) {
        return new c70(new nb2((w80) null, new ly1(new w60(oe0Var, 2), dc2Var), (bm) null, (qr1) null, (LinkedHashMap) null, 125));
    }

    public static final u70 f(oe0 oe0Var, dc2 dc2Var) {
        return new u70(new nb2((w80) null, new ly1(new w60(oe0Var, 3), dc2Var), (bm) null, (qr1) null, (LinkedHashMap) null, 125));
    }
}
