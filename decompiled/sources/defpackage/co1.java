package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.File;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class co1 extends kg2 {
    private static final yn1 Companion = new Object();
    public final File A;
    public final File B;
    public final xg2 b;
    public final zu c;
    public final r22 d;
    public final yk1 e;
    public final r22 f;
    public final yk1 g;
    public final r22 h;
    public final yk1 i;
    public final r22 j;
    public final yk1 k;
    public final lk l;
    public final em m;
    public final r22 n;
    public final yk1 o;
    public final r22 p;
    public final yk1 q;
    public final r22 r;
    public final yk1 s;
    public final r22 t;
    public final yk1 u;
    public final r22 v;
    public final yk1 w;
    public MediaPlayer x;
    public i22 y;
    public final File z;

    public co1(File file, xg2 xg2Var) {
        vy vyVar = k10.a;
        ny nyVar = ny.g;
        xg2Var.getClass();
        nyVar.getClass();
        this.b = xg2Var;
        this.c = nyVar;
        r22 j = d6.j(wn1.a);
        this.d = j;
        this.e = new yk1(j);
        r22 j2 = d6.j(null);
        this.f = j2;
        this.g = new yk1(j2);
        r22 j3 = d6.j(null);
        this.h = j3;
        this.i = new yk1(j3);
        r22 j4 = d6.j(null);
        this.j = j4;
        this.k = new yk1(j4);
        lk c = sn0.c(-2, 6, null);
        this.l = c;
        this.m = new em(c, false);
        r22 j5 = d6.j(null);
        this.n = j5;
        this.o = new yk1(j5);
        r22 j6 = d6.j(Boolean.FALSE);
        this.p = j6;
        this.q = new yk1(j6);
        r22 j7 = d6.j(Float.valueOf(0.0f));
        this.r = j7;
        this.s = new yk1(j7);
        r22 j8 = d6.j(0);
        this.t = j8;
        this.u = new yk1(j8);
        r22 j9 = d6.j(0);
        this.v = j9;
        this.w = new yk1(j9);
        File file2 = new File(file, "sounds");
        this.z = file2;
        File file3 = new File(file, "esp_images");
        this.A = file3;
        File file4 = new File(file, "avatars");
        this.B = file4;
        file2.mkdirs();
        file3.mkdirs();
        file4.mkdirs();
        f();
    }

    @Override // defpackage.kg2
    public final void d() {
        g();
    }

    public final void e(Context context, Uri uri, an1 an1Var) {
        context.getClass();
        uri.getClass();
        rx.C(rx.x(this), null, new a8(this, an1Var, context, uri, null, 12), 3);
    }

    public final void f() {
        rx.C(rx.x(this), null, new l(this, (vt) null, 27), 3);
    }

    public final void g() {
        i22 i22Var = this.y;
        if (i22Var != null) {
            i22Var.c(null);
        }
        this.y = null;
        try {
            MediaPlayer mediaPlayer = this.x;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
        } catch (Exception unused) {
        }
        MediaPlayer mediaPlayer2 = this.x;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.x = null;
        this.n.j(null);
        Boolean bool = Boolean.FALSE;
        r22 r22Var = this.p;
        r22Var.getClass();
        r22Var.k(null, bool);
        Float valueOf = Float.valueOf(0.0f);
        r22 r22Var2 = this.r;
        r22Var2.getClass();
        r22Var2.k(null, valueOf);
        r22 r22Var3 = this.t;
        r22Var3.getClass();
        r22Var3.k(null, 0);
        r22 r22Var4 = this.v;
        r22Var4.getClass();
        r22Var4.k(null, 0);
    }
}
