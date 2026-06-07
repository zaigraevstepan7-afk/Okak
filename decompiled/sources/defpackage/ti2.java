package defpackage;

import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ti2 {
    public static final p31 a;
    public static final ri2[] b;

    static {
        p31 p31Var = new p31(8);
        ri2.a.getClass();
        si2 si2Var = qi2.g;
        p31Var.i(1, si2Var);
        si2 si2Var2 = qi2.f;
        p31Var.i(2, si2Var2);
        si2 si2Var3 = qi2.b;
        p31Var.i(4, si2Var3);
        si2 si2Var4 = qi2.d;
        p31Var.i(8, si2Var4);
        si2 si2Var5 = qi2.h;
        p31Var.i(16, si2Var5);
        si2 si2Var6 = qi2.e;
        p31Var.i(32, si2Var6);
        si2 si2Var7 = qi2.i;
        p31Var.i(64, si2Var7);
        si2 si2Var8 = qi2.c;
        p31Var.i(128, si2Var8);
        a = p31Var;
        b = new ri2[]{si2Var, si2Var2, si2Var3, si2Var7, si2Var5, si2Var6, si2Var4, qi2.j, si2Var8};
    }

    public static final void a(qy0 qy0Var, rl0 rl0Var, long j, int i, int i2) {
        if (!xp1.j(j, -1L)) {
            float f = (int) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
            float f2 = (int) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
            float f3 = i - ((int) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
            float f4 = i2 - ((int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX));
            qy0Var.b(rl0Var.b(), f);
            qy0Var.b(rl0Var.d(), f2);
            qy0Var.b(rl0Var.c(), f3);
            qy0Var.b(rl0Var.a(), f4);
        }
    }
}
