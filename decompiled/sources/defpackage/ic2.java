package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ic2 {
    public static final wm1 a;
    public static Paint b;

    static {
        xq1.g("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            a = new wm1();
        } else {
            a = new wm1();
        }
        new hl0(1);
        b = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, ud0[] ud0VarArr) {
        xq1.g("TypefaceCompat.createFromFontInfo");
        try {
            wm1 wm1Var = a;
            wm1Var.getClass();
            Typeface typeface = null;
            try {
                FontFamily l = wm1Var.l(ud0VarArr, context.getContentResolver());
                if (l != null) {
                    typeface = new Typeface.CustomFallbackBuilder(l).setStyle(wm1.k(l).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            return typeface;
        } finally {
            Trace.endSection();
        }
    }

    public static Font b(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        if (b == null) {
            b = new Paint();
        }
        b.setTextSize(10.0f);
        b.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, b);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount != 0) {
            font = shapeTextRun.getFont(0);
            return font;
        }
        return null;
    }
}
