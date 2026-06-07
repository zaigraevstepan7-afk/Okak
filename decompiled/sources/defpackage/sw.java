package defpackage;

import com.elixir.loader.data.local.UserSettingsSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class sw {
    public static final /* synthetic */ ep0[] a;
    public static final ox b;

    static {
        sj1 sj1Var = new sj1(sw.class, "userSettingsStore", "getUserSettingsStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        yl1.a.getClass();
        a = new ep0[]{sj1Var};
        UserSettingsSerializer userSettingsSerializer = UserSettingsSerializer.INSTANCE;
        p1 p1Var = new p1(21);
        vy vyVar = k10.a;
        ny nyVar = ny.g;
        h42 b2 = xq1.b();
        nyVar.getClass();
        ut b3 = fp.b(go.M(nyVar, b2));
        userSettingsSerializer.getClass();
        b = new ox(new rg2(userSettingsSerializer, 20), p1Var, b3);
    }
}
