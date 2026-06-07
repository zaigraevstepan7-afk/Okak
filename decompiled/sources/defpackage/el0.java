package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import com.elixir.loader.ElixirApplication;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class el0 extends kg2 {
    public final ElixirApplication b;
    public final rw c;
    public final r22 d;
    public final yk1 e;
    public final String f;
    public final String g;
    public kd h;
    public kd i;

    public el0(ElixirApplication elixirApplication, rw rwVar) {
        rwVar.getClass();
        this.b = elixirApplication;
        this.c = rwVar;
        r22 j = d6.j(cl0.a);
        this.d = j;
        this.e = new yk1(j);
        this.f = "com.axlebolt.standoff2";
        this.g = "com.elixir.loader";
        vt vtVar = null;
        rx.C(rx.x(this), null, new vf(this, vtVar, 4), 3);
        rx.C(rx.x(this), null, new xv(this, vtVar, 2), 3);
    }

    public static final kd e(el0 el0Var, String str, String str2) {
        String str3;
        try {
            PackageManager packageManager = el0Var.b.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            applicationInfo.getClass();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
            applicationIcon.getClass();
            str3 = str;
            try {
                return new kd(true, applicationIcon, packageManager.getApplicationLabel(applicationInfo).toString(), packageInfo.versionName, str3, 32);
            } catch (PackageManager.NameNotFoundException unused) {
                return new kd(false, (Drawable) null, str2, (String) null, str3, 42);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            str3 = str;
        }
    }
}
