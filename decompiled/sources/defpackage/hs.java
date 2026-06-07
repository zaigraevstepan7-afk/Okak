package defpackage;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hs extends cq0 implements de0 {
    public static final hs f;
    public static final hs g;
    public static final hs h;
    public static final hs i;
    public static final hs j;
    public static final hs k;
    public static final hs l;
    public static final hs m;
    public static final hs n;
    public static final hs o;
    public static final hs p;
    public static final hs q;
    public final /* synthetic */ int e;

    static {
        int i2 = 0;
        f = new hs(i2, 0);
        g = new hs(i2, 1);
        h = new hs(i2, 2);
        i = new hs(i2, 3);
        j = new hs(i2, 4);
        k = new hs(i2, 5);
        l = new hs(i2, 6);
        m = new hs(i2, 7);
        n = new hs(i2, 8);
        o = new hs(i2, 9);
        p = new hs(i2, 10);
        q = new hs(i2, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        switch (this.e) {
            case 0:
                is.b("LocalTextToolbar");
                throw null;
            case 1:
                is.b("LocalUriHandler");
                throw null;
            case 2:
                is.b("LocalViewConfiguration");
                throw null;
            case 3:
                is.b("LocalWindowInfo");
                throw null;
            case 4:
                return Boolean.TRUE;
            case 5:
                return Boolean.FALSE;
            case 6:
                return Boolean.FALSE;
            case 7:
                return new ar0(3);
            case 8:
                return new o8(new PathMeasure());
            case 9:
            case 10:
                return null;
            default:
                return od2.a;
        }
    }
}
