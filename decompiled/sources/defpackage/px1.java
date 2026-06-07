package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class px1 {
    public static final /* synthetic */ int b = 0;
    public final cf2 a = cf2.f;

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (sn0.r(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return sn0.r(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list != list2) {
            if (list.size() == list2.size()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getRect().left != 0 && sidecarDisplayFeature.getRect().top != 0) {
            return false;
        }
        return true;
    }

    public final ui2 c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new ui2(l60.e);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        ox1.d(sidecarDeviceState2, ox1.b(sidecarDeviceState));
        return new ui2(d(ox1.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sg0 i = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, oe0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, oe0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oe0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, oe0] */
    public final sg0 i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        ad0 ad0Var;
        ad0 ad0Var2 = ad0.k;
        sidecarDisplayFeature.getClass();
        g3 g3Var = g3.u;
        cf2 cf2Var = this.a;
        cf2Var.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new fe2(sidecarDisplayFeature, cf2Var, g3Var).y("Type must be either TYPE_FOLD or TYPE_HINGE", new Object()).y("Feature bounds must not be 0", new Object()).y("TYPE_FOLD must have 0 area", new Object()).y("Feature be pinned to either left or top", new Object()).l();
        if (sidecarDisplayFeature2 != null) {
            int type = sidecarDisplayFeature2.getType();
            if (type != 1) {
                if (type == 2) {
                    ad0Var = ad0.n;
                } else {
                    return null;
                }
            } else {
                ad0Var = ad0.m;
            }
            int b2 = ox1.b(sidecarDeviceState);
            if (b2 != 0 && b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3 && b2 == 4) {
                        return null;
                    }
                } else {
                    ad0Var2 = ad0.l;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                return new sg0(new ej(rect), ad0Var, ad0Var2);
            }
            return null;
        }
        return null;
    }
}
