package defpackage;

import com.elixir.loader.UserSettings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tf2 extends wt {
    public UserSettings e;
    public String f;
    public String g;
    public /* synthetic */ Object h;
    public final /* synthetic */ vf2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf2(vf2 vf2Var, wt wtVar) {
        super(wtVar);
        this.i = vf2Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return vf2.e(this.i, this);
    }
}
