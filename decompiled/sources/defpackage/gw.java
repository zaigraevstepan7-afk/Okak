package defpackage;

import com.elixir.loader.UserSettings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gw extends q42 implements se0 {
    public /* synthetic */ Object f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(String str, String str2, vt vtVar) {
        super(2, vtVar);
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        gw gwVar = new gw(this.g, this.h, vtVar);
        gwVar.f = obj;
        return gwVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((gw) create((UserSettings) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        UserSettings userSettings = (UserSettings) this.f;
        io.K(obj);
        UserSettings build = userSettings.toBuilder().setSavedKey(this.g).setSubType(this.h).build();
        build.getClass();
        return build;
    }
}
