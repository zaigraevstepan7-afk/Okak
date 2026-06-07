package defpackage;

import com.elixir.loader.UserSettings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ew extends q42 implements se0 {
    public /* synthetic */ Object f;

    /* JADX WARN: Type inference failed for: r1v1, types: [ew, q42, vt] */
    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        ?? q42Var = new q42(2, vtVar);
        q42Var.f = obj;
        return q42Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((ew) create((UserSettings) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        UserSettings userSettings = (UserSettings) this.f;
        io.K(obj);
        UserSettings build = userSettings.toBuilder().setLoggedIn(false).setAutologin(false).setSavedKey("").setSubType("").setIsLifetime(false).setExpiresAt(0L).build();
        build.getClass();
        return build;
    }
}
