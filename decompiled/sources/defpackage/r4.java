package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r4 extends cq0 implements ue0 {
    public final /* synthetic */ t4 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(t4 t4Var, int i) {
        super(4);
        this.e = t4Var;
        this.f = i;
    }

    @Override // defpackage.ue0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        t4 t4Var = this.e;
        rg2 rg2Var = t4Var.e;
        ((AutofillManager) rg2Var.f).notifyViewEntered(t4Var.g, this.f, new Rect(intValue, intValue2, intValue3, intValue4));
        return od2.a;
    }
}
