package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zj0 implements Iterable, xo0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ zj0(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return new n40(d6.A((Object[]) ((v3) obj).f));
            default:
                return new zz((a00) obj);
        }
    }
}
