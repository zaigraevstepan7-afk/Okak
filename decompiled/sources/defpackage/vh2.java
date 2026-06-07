package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vh2 extends WindowInsetsAnimation.Callback {
    public final uh2 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public vh2(uh2 uh2Var) {
        super(uh2Var.e);
        this.d = new HashMap();
        this.a = uh2Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [wh2, java.lang.Object] */
    public final wh2 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        wh2 wh2Var = (wh2) hashMap.get(windowInsetsAnimation);
        if (wh2Var == null) {
            ?? obj = new Object();
            new WindowInsetsAnimation(0, null, 0L);
            obj.a = new ov1(windowInsetsAnimation, 16);
            hashMap.put(windowInsetsAnimation, obj);
            return obj;
        }
        return wh2Var;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            wh2 a = a(windowInsetsAnimation);
            ((WindowInsetsAnimation) a.a.f).setFraction(windowInsetsAnimation.getFraction());
            this.c.add(a);
        }
        ji2 ji2Var = this.a.d(ni2.b(null, windowInsets), this.b).a;
        if (!(ji2Var instanceof ci2)) {
            return null;
        }
        return ((ci2) ji2Var).c;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        h12 e = this.a.e(a(windowInsetsAnimation), new h12(bounds));
        e.getClass();
        return new WindowInsetsAnimation.Bounds(((yl0) e.f).d(), ((yl0) e.g).d());
    }
}
