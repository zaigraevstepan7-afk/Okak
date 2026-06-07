package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class sm {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static volatile Charset e;
    public static volatile Charset f;

    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        a = forName;
        Charset.forName("UTF-16").getClass();
        Charset forName2 = Charset.forName("UTF-16BE");
        forName2.getClass();
        b = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        forName3.getClass();
        c = forName3;
        Charset.forName("US-ASCII").getClass();
        Charset forName4 = Charset.forName("ISO-8859-1");
        forName4.getClass();
        d = forName4;
    }
}
