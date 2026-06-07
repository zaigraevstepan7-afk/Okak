package defpackage;

import java.util.List;
import okhttp3.Handshake;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class og0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ de0 f;

    public /* synthetic */ og0(de0 de0Var, int i) {
        this.e = i;
        this.f = de0Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        List peerCertificates_delegate$lambda$0;
        int i = this.e;
        float f = 0.0f;
        od2 od2Var = od2.a;
        de0 de0Var = this.f;
        switch (i) {
            case 0:
                peerCertificates_delegate$lambda$0 = Handshake.peerCertificates_delegate$lambda$0(de0Var);
                return peerCertificates_delegate$lambda$0;
            case 1:
                de0Var.invoke();
                break;
            case 2:
                de0Var.invoke();
                break;
            case 3:
                de0Var.invoke();
                break;
            case 4:
                return new uy(0, 0.0f, de0Var);
            case 5:
                float floatValue = ((Number) de0Var.invoke()).floatValue();
                if (floatValue >= 0.0f) {
                    f = floatValue;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                return Float.valueOf(f);
            case 6:
                de0Var.invoke();
                return od2Var;
            default:
                de0Var.invoke();
                return od2Var;
        }
        return Boolean.TRUE;
    }
}
