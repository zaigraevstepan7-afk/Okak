package defpackage;

import android.content.ContentResolver;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class wm1 implements se2 {
    public static wm1 f;
    public final /* synthetic */ int e;

    public wm1() {
        this.e = 17;
        new ConcurrentHashMap();
    }

    public static final void c(wm1 wm1Var, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            ArrayList arrayList2 = new ArrayList(yn.a0(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new hj2(intValue, ((Number) it2.next()).intValue()));
            }
            wn.d0(arrayList2, arrayList);
        }
        wn.D0(arrayList);
    }

    public static final boolean d(oe1 oe1Var) {
        oe1 oe1Var2 = xm1.h;
        return !p32.w(oe1Var.b(), ".class", true);
    }

    public static final sa e(int i, String str) {
        WeakHashMap weakHashMap = pi2.w;
        return new sa(i, str);
    }

    public static final int f(int i, long j) {
        int i2 = ya2.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static final he2 g(int i, String str) {
        WeakHashMap weakHashMap = pi2.w;
        return new he2(new hm0(0, 0, 0, 0), str);
    }

    public static rg2 i(tg2 tg2Var, pg2 pg2Var, int i) {
        nv nvVar;
        if ((i & 2) != 0) {
            if (tg2Var instanceof tg0) {
                pg2Var = ((tg0) tg2Var).c();
            } else {
                pg2Var = kz.b;
            }
        }
        if (tg2Var instanceof tg0) {
            nvVar = ((tg0) tg2Var).d();
        } else {
            nvVar = mv.b;
        }
        pg2Var.getClass();
        nvVar.getClass();
        return new rg2(tg2Var.e(), pg2Var, nvVar);
    }

    public static pi2 j(ur urVar) {
        View view = (View) urVar.j(l6.f);
        pi2 s = s(view);
        boolean h = urVar.h(s) | urVar.h(view);
        Object L = urVar.L();
        if (h || L == or.a) {
            L = new fl1(14, s, view);
            urVar.h0(L);
        }
        bf.d(s, (oe0) L, urVar);
        return s;
    }

    public static Font k(FontFamily fontFamily) {
        FontStyle fontStyle = new FontStyle(400, 0);
        Font font = fontFamily.getFont(0);
        int r = r(fontStyle, font.getStyle());
        for (int i = 1; i < fontFamily.getSize(); i++) {
            Font font2 = fontFamily.getFont(i);
            int r2 = r(fontStyle, font2.getStyle());
            if (r2 < r) {
                font = font2;
                r = r2;
            }
        }
        return font;
    }

    public static int r(FontStyle fontStyle, FontStyle fontStyle2) {
        int i;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    public static pi2 s(View view) {
        pi2 pi2Var;
        WeakHashMap weakHashMap = pi2.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new pi2(view);
                    weakHashMap.put(view, obj);
                }
                pi2Var = (pi2) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pi2Var;
    }

    public static long t(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    public static oe1 u(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        String r = oe1Var2.e.r();
        oe1 oe1Var3 = xm1.h;
        String replace = i32.U(oe1Var.e.r(), r).replace(AbstractJsonLexerKt.STRING_ESC, '/');
        replace.getClass();
        return oe1Var3.f(replace);
    }

    public FontFamily l(ud0[] ud0VarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (ud0 ud0Var : ud0VarArr) {
            if (Objects.equals(ud0Var.a.getScheme(), "systemfont")) {
                font = n(ud0Var);
            } else {
                try {
                    Uri uri = ud0Var.a;
                    str = ud0Var.e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(ud0Var.c).setSlant(ud0Var.d ? 1 : 0).setTtcIndex(ud0Var.b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // defpackage.se2
    public int m() {
        return 0;
    }

    public Font n(ud0 ud0Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.se2
    public int o() {
        return 0;
    }

    @Override // defpackage.qe2
    public mc p(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        if (j < 0) {
            return mcVar;
        }
        return mcVar2;
    }

    public String toString() {
        switch (this.e) {
            case 6:
                return "SharingStarted.Eagerly";
            case 7:
                return "SharingStarted.Lazily";
            case 8:
            default:
                return super.toString();
            case 9:
                return "ReusedSlotId";
        }
    }

    public wm1(s8 s8Var) {
        this.e = 15;
    }

    public /* synthetic */ wm1(int i) {
        this.e = i;
    }

    @Override // defpackage.qe2
    public mc h(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        return mcVar3;
    }
}
