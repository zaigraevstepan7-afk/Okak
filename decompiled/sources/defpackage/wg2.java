package defpackage;

import java.io.File;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wg2 extends wt {
    public File e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xg2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg2(xg2 xg2Var, wt wtVar) {
        super(wtVar);
        this.g = xg2Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, 0, 0, this);
    }
}
