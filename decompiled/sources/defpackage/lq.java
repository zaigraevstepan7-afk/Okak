package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class lq implements ve0 {
    public final /* synthetic */ int e;

    public /* synthetic */ lq(int i) {
        this.e = i;
    }

    @Override // defpackage.ve0
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        boolean h;
        boolean h2;
        int i2;
        boolean h3;
        boolean h4;
        int i3 = this.e;
        boolean z = false;
        int i4 = 128;
        int i5 = 16;
        int i6 = 2;
        od2 od2Var = od2.a;
        switch (i3) {
            case 0:
                t62 t62Var = (t62) obj;
                i62 i62Var = (i62) obj2;
                de0 de0Var = (de0) obj3;
                ur urVar = (ur) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h2 = urVar.f(t62Var);
                    } else {
                        h2 = urVar.h(t62Var);
                    }
                    if (h2) {
                        i6 = 4;
                    }
                    i = intValue | i6;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    if ((intValue & 64) == 0) {
                        h = urVar.f(i62Var);
                    } else {
                        h = urVar.h(i62Var);
                    }
                    if (h) {
                        i5 = 32;
                    }
                    i |= i5;
                }
                if ((intValue & 384) == 0) {
                    if (urVar.h(de0Var)) {
                        i4 = 256;
                    }
                    i |= i4;
                }
                if ((i & 1171) != 1170) {
                    z = true;
                }
                if (urVar.O(i & 1, z)) {
                    iz.c(t62Var, i62Var, de0Var, urVar, i & 1022);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                t62 t62Var2 = (t62) obj;
                i62 i62Var2 = (i62) obj2;
                de0 de0Var2 = (de0) obj3;
                ur urVar2 = (ur) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        h4 = urVar2.f(t62Var2);
                    } else {
                        h4 = urVar2.h(t62Var2);
                    }
                    if (h4) {
                        i6 = 4;
                    }
                    i2 = intValue2 | i6;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if ((intValue2 & 64) == 0) {
                        h3 = urVar2.f(i62Var2);
                    } else {
                        h3 = urVar2.h(i62Var2);
                    }
                    if (h3) {
                        i5 = 32;
                    }
                    i2 |= i5;
                }
                if ((intValue2 & 384) == 0) {
                    if (urVar2.h(de0Var2)) {
                        i4 = 256;
                    }
                    i2 |= i4;
                }
                if ((i2 & 1171) != 1170) {
                    z = true;
                }
                if (urVar2.O(i2 & 1, z)) {
                    iz.c(t62Var2, i62Var2, de0Var2, urVar2, i2 & 1022);
                } else {
                    urVar2.R();
                }
                return od2Var;
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j = ((d92) obj5).a;
                String obj6 = ((CharSequence) obj4).subSequence(d92.f(j), d92.e(j)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                return od2Var;
        }
    }
}
