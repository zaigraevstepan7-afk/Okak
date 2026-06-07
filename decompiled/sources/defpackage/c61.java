package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c61 {
    public final Context a;
    public final j51 b;
    public final y50 c;
    public final Activity d;
    public boolean e;
    public final tg f;
    public final boolean g;

    public c61(Context context) {
        Object obj;
        context.getClass();
        this.a = context;
        this.b = new j51(this, new td(this, 1));
        this.c = new y50(context, 1);
        Iterator it = mv1.G(context, new mm0(24)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.d = (Activity) obj;
        this.f = new tg(this, 1);
        this.g = true;
        h71 h71Var = this.b.s;
        h71Var.a(new b61(h71Var));
        this.b.s.a(new b2(this.a));
        new b52(new td(this, 2));
    }

    public final void a(String str, oe0 oe0Var) {
        String str2;
        j51 j51Var = this.b;
        j51Var.getClass();
        l61 K = go.K(oe0Var);
        if (j51Var.c != null) {
            w51 i = j51Var.i();
            q51 e = i.e(str, true, i);
            if (e != null) {
                r51 r51Var = e.e;
                Bundle a = r51Var.a(e.f);
                if (a == null) {
                    a = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                }
                int i2 = r51.i;
                String str3 = (String) r51Var.f.e;
                if (str3 != null) {
                    str2 = "android-app://androidx.navigation/".concat(str3);
                } else {
                    str2 = "";
                }
                Uri parse = Uri.parse(str2);
                parse.getClass();
                Intent intent = new Intent();
                intent.setDataAndType(parse, null);
                intent.setAction(null);
                a.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                j51Var.k(r51Var, a, K);
                return;
            }
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + j51Var.c);
        }
        se.q("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", j51Var, 46);
    }
}
