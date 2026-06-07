package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class c9 {
    public static final js a = new js(e6.m);
    public static final js b = new js(e6.l);

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.bi1 r20, defpackage.de0 r21, defpackage.ci1 r22, defpackage.fq r23, defpackage.ur r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9.a(bi1, de0, ci1, fq, ur, int, int):void");
    }

    public static final boolean b(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & SharedConstants.DefaultBufferSize) == 0) {
            return false;
        }
        return true;
    }
}
