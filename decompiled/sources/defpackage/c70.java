package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c70 {
    public static final c70 b = new c70(new nb2((w80) null, (ly1) null, (bm) null, (qr1) null, (LinkedHashMap) null, 127));
    public final nb2 a;

    public c70(nb2 nb2Var) {
        this.a = nb2Var;
    }

    public final c70 a(c70 c70Var) {
        nb2 nb2Var = c70Var.a;
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
        Map map = nb2Var2.f;
        Map map2 = nb2Var.f;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new c70(new nb2(w80Var, ly1Var, bmVar, qr1Var, linkedHashMap, 32));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c70) && ((c70) obj).a.equals(this.a)) {
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
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
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
        return sb.toString();
    }
}
