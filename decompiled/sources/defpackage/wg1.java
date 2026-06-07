package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wg1 {
    public final xu a;
    public final Context b;
    public final ut1 c;
    public final ix0 d;
    public TextClassifier f;
    public final b51 e = new b51();
    public final je1 g = fr1.k(null);
    public final Object h = new Object();

    public wg1(xu xuVar, Context context, ut1 ut1Var, ix0 ix0Var) {
        this.a = xuVar;
        this.b = context;
        this.c = ut1Var;
        this.d = ix0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.wg1 r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, defpackage.wt r21) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg1.a(wg1, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, wt):java.lang.Object");
    }

    public final LocaleList b() {
        ix0 ix0Var = this.d;
        if (ix0Var != null) {
            ArrayList arrayList = new ArrayList(yn.a0(ix0Var, 10));
            Iterator it = ix0Var.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((hx0) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        return new LocaleList(((hx0) pg1.a.i().e.get(0)).a);
    }
}
