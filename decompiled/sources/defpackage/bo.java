package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bo implements kv1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ bo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kv1
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                return new pv0(this);
            case 2:
                return yq1.t((se0) obj);
            default:
                return (Iterator) obj;
        }
    }
}
