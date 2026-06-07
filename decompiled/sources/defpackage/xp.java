package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xp {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ yp h;

    public xp(yp ypVar) {
        this.h = ypVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        l2 l2Var;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        i2 i2Var = (i2) this.e.get(str);
        if (i2Var != null) {
            l2Var = i2Var.a;
        } else {
            l2Var = null;
        }
        if (l2Var != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                l2 l2Var2 = i2Var.a;
                ((oe0) ((o41) l2Var2.e).getValue()).invoke(i2Var.b.D(i2, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new d2(i2, intent));
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r16, defpackage.f2 r17, java.io.Serializable r18) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xp.b(int, f2, java.io.Serializable):void");
    }
}
