package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class t80 {
    public static sg0 a(vi2 vi2Var, FoldingFeature foldingFeature) {
        ad0 ad0Var;
        ad0 ad0Var2;
        vi2Var.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                ad0Var = ad0.n;
            } else {
                return null;
            }
        } else {
            ad0Var = ad0.m;
        }
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                ad0Var2 = ad0.l;
            } else {
                return null;
            }
        } else {
            ad0Var2 = ad0.k;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        ej ejVar = new ej(bounds);
        Rect c = vi2Var.a.c();
        if (ejVar.a() != 0 || ejVar.b() != 0) {
            if (ejVar.b() == c.width() || ejVar.a() == c.height()) {
                if (ejVar.b() >= c.width() || ejVar.a() >= c.height()) {
                    if (ejVar.b() == c.width() && ejVar.a() == c.height()) {
                        return null;
                    }
                    Rect bounds2 = foldingFeature.getBounds();
                    bounds2.getClass();
                    return new sg0(new ej(bounds2), ad0Var, ad0Var2);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static ui2 b(vi2 vi2Var, WindowLayoutInfo windowLayoutInfo) {
        sg0 sg0Var;
        vi2Var.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                sg0Var = a(vi2Var, foldingFeature);
            } else {
                sg0Var = null;
            }
            if (sg0Var != null) {
                arrayList.add(sg0Var);
            }
        }
        return new ui2(arrayList);
    }

    public static ui2 c(Context context, WindowLayoutInfo windowLayoutInfo) {
        g3 g3Var;
        zi2 zi2Var;
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            g3Var = g3.B;
        } else {
            g3Var = g3.C;
        }
        xn.p(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 34) {
            zi2Var = aj2.e;
        } else {
            zi2Var = xl1.v;
        }
        return b(zi2Var.e(context, g3Var), windowLayoutInfo);
    }
}
