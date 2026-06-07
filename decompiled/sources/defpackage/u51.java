package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u51 {
    public int a;
    public Object b = new hi0[32];
    public Object c = new float[32];
    public Object d = new byte[32];
    public Object e;
    public Object f;

    public u51() {
        j41 j41Var = tr1.a;
        this.e = new j41();
        this.f = new j41();
    }

    public q51 a(String str) {
        p51 p51Var;
        str.getClass();
        b52 b52Var = (b52) this.f;
        if (b52Var != null && (p51Var = (p51) b52Var.getValue()) != null) {
            int i = r51.i;
            Uri parse = Uri.parse("android-app://androidx.navigation/".concat(str));
            parse.getClass();
            Bundle d = p51Var.d(parse, (LinkedHashMap) this.d);
            if (d != null) {
                return new q51((r51) this.b, d, p51Var.l, p51Var.b(parse), false);
            }
            return null;
        }
        return null;
    }
}
