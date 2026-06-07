package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class u70 {
    public static final u70 b = new u70(new nb2((w80) null, (ly1) null, (bm) null, (qr1) null, (LinkedHashMap) null, 127));
    public static final u70 c = new u70(new nb2((w80) null, (ly1) null, (bm) null, (qr1) null, (LinkedHashMap) null, 95));
    public final nb2 a;

    public u70(nb2 nb2Var) {
        this.a = nb2Var;
    }

    public final u70 a(u70 u70Var) {
        boolean z;
        nb2 nb2Var = u70Var.a;
        w80 w80Var = nb2Var.a;
        nb2 nb2Var2 = this.a;
        if (w80Var == null) {
            w80Var = nb2Var2.a;
        }
        ly1 ly1Var = nb2Var.b;
        if (ly1Var == null) {
            ly1Var = nb2Var2.b;
        }
        bm bmVar = nb2Var.c;
        if (bmVar == null) {
            bmVar = nb2Var2.c;
        }
        qr1 qr1Var = nb2Var.d;
        if (qr1Var == null) {
            qr1Var = nb2Var2.d;
        }
        if (!nb2Var.e && !nb2Var2.e) {
            z = false;
        } else {
            z = true;
        }
        Map map = nb2Var2.f;
        Map map2 = nb2Var.f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new u70(new nb2(w80Var, ly1Var, bmVar, qr1Var, z, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u70) && ((u70) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        nb2 nb2Var = this.a;
        w80 w80Var = nb2Var.a;
        String str4 = null;
        if (w80Var != null) {
            str = w80Var.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - ");
        ly1 ly1Var = nb2Var.b;
        if (ly1Var != null) {
            str2 = ly1Var.toString();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(",\nShrink - ");
        bm bmVar = nb2Var.c;
        if (bmVar != null) {
            str3 = bmVar.toString();
        } else {
            str3 = null;
        }
        sb.append(str3);
        sb.append(",\nScale - ");
        qr1 qr1Var = nb2Var.d;
        if (qr1Var != null) {
            str4 = qr1Var.toString();
        }
        sb.append(str4);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(nb2Var.e);
        return sb.toString();
    }
}
