package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ud0 {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;
    public final int f;

    public ud0(String str, String str2) {
        this.a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.b = 0;
        this.c = 400;
        this.d = false;
        this.e = str2;
        this.f = 0;
    }

    public ud0(Uri uri, int i, int i2, boolean z, int i3) {
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = null;
        this.f = i3;
    }
}
