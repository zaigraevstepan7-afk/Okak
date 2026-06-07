package defpackage;

import android.view.ViewStructure;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yh1 extends cq0 implements ue0 {
    public final /* synthetic */ ViewStructure e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh1(ViewStructure viewStructure) {
        super(4);
        this.e = viewStructure;
    }

    @Override // defpackage.ue0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue() - intValue2;
        this.e.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4);
        return od2.a;
    }
}
