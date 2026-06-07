package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Collection f;

    public /* synthetic */ f0(int i, Collection collection) {
        this.e = i;
        this.f = collection;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.e;
        Collection<?> collection = this.f;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
