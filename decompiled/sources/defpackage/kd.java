package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kd {
    public final boolean a;
    public final Drawable b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public kd(boolean z, Drawable drawable, String str, String str2, String str3, String str4) {
        str.getClass();
        str3.getClass();
        this.a = z;
        this.b = drawable;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd)) {
            return false;
        }
        kd kdVar = (kd) obj;
        if (this.a == kdVar.a && sn0.r(this.b, kdVar.b) && sn0.r(this.c, kdVar.c) && sn0.r(this.d, kdVar.d) && sn0.r(this.e, kdVar.e) && sn0.r(this.f, kdVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Boolean.hashCode(this.a) * 31;
        int i = 0;
        Drawable drawable = this.b;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int d = l90.d((hashCode3 + hashCode) * 31, 31, this.c);
        String str = this.d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int d2 = l90.d((d + hashCode2) * 31, 31, this.e);
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        return "AppInfo(isInstalled=" + this.a + ", icon=" + this.b + ", name=" + this.c + ", versionName=" + this.d + ", packageName=" + this.e + ", latestVersion=" + this.f + ")";
    }

    public /* synthetic */ kd(boolean z, Drawable drawable, String str, String str2, String str3, int i) {
        this(z, (i & 2) != 0 ? null : drawable, str, (i & 8) != 0 ? null : str2, str3, (String) null);
    }
}
