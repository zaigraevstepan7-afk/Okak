package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class as0 implements oe0 {
    public static final as0 f = new as0(0);
    public static final as0 g = new as0(1);
    public final /* synthetic */ int e;

    public /* synthetic */ as0(int i) {
        this.e = i;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                ((Number) obj).intValue();
                return null;
            default:
                if (sn0.r(obj, Boolean.FALSE)) {
                    return new co(co.g);
                }
                obj.getClass();
                return new co(go.b(((Integer) obj).intValue()));
        }
    }
}
