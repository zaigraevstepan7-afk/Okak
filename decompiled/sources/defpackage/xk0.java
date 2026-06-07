package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class xk0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    public /* synthetic */ xk0(Context context, int i) {
        this.e = i;
        this.f = context;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        Bundle bundle;
        Bundle[] bundleArr;
        String str;
        int i = this.e;
        od2 od2Var = od2.a;
        Context context = this.f;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                str2.getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(str2))));
                return od2Var;
            case 1:
                ((String) obj).getClass();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/elixir_cheat")));
                return od2Var;
            default:
                Bundle bundle2 = (Bundle) obj;
                c61 r = vn.r(context);
                if (bundle2 != null) {
                    bundle2.setClassLoader(r.a.getClassLoader());
                }
                j51 j51Var = r.b;
                LinkedHashMap linkedHashMap = j51Var.m;
                Boolean bool = null;
                boolean z = false;
                if (bundle2 != null) {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            yq1.u("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    j51Var.d = bundle;
                    if (bundle2.containsKey("android-support-nav:controller:backStack")) {
                        bundleArr = (Bundle[]) xq1.l("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]);
                    } else {
                        bundleArr = null;
                    }
                    j51Var.e = bundleArr;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray != null) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (stringArrayList != null) {
                                int length = intArray.length;
                                int i2 = 0;
                                int i3 = 0;
                                while (i2 < length) {
                                    int i4 = i3 + 1;
                                    Integer valueOf = Integer.valueOf(intArray[i2]);
                                    LinkedHashMap linkedHashMap2 = j51Var.l;
                                    if (!sn0.r(stringArrayList.get(i3), "")) {
                                        str = stringArrayList.get(i3);
                                    } else {
                                        str = null;
                                    }
                                    linkedHashMap2.put(valueOf, str);
                                    i2++;
                                    i3 = i4;
                                }
                            } else {
                                yq1.u("android-support-nav:controller:backStackIds");
                                throw null;
                            }
                        } else {
                            yq1.u("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                    }
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 != null) {
                            for (String str3 : stringArrayList2) {
                                if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str3)) {
                                    ArrayList l = xq1.l("android-support-nav:controller:backStackStates:" + str3, bundle2);
                                    te teVar = new te(l.size());
                                    Iterator it = l.iterator();
                                    while (it.hasNext()) {
                                        teVar.addLast(new g51((Bundle) it.next()));
                                    }
                                    linkedHashMap.put(str3, teVar);
                                }
                            }
                        } else {
                            yq1.u("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z2 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    if (z2 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) {
                        bool = Boolean.valueOf(z2);
                    }
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    r.e = z;
                }
                return r;
        }
    }
}
