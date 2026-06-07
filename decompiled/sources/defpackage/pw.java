package defpackage;

import com.elixir.loader.UserSettings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pw extends q42 implements se0 {
    public /* synthetic */ Object f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw(String str, vt vtVar) {
        super(2, vtVar);
        this.g = str;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        pw pwVar = new pw(this.g, vtVar);
        pwVar.f = obj;
        return pwVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((pw) create((UserSettings) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        UserSettings userSettings = (UserSettings) this.f;
        io.K(obj);
        UserSettings build = userSettings.toBuilder().setSelectedRelease(this.g).build();
        build.getClass();
        return build;
    }
}
