package defpackage;

import com.elixir.loader.UserSettings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class iw extends q42 implements se0 {
    public /* synthetic */ Object f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(boolean z, vt vtVar) {
        super(2, vtVar);
        this.g = z;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        iw iwVar = new iw(this.g, vtVar);
        iwVar.f = obj;
        return iwVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((iw) create((UserSettings) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        UserSettings userSettings = (UserSettings) this.f;
        io.K(obj);
        UserSettings build = userSettings.toBuilder().setAutoUpdateDisabled(!this.g).build();
        build.getClass();
        return build;
    }
}
