package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class px0 extends ArrayList {
    public final /* synthetic */ tx0 e;
    public final /* synthetic */ dj1 f;

    public px0(tx0 tx0Var, dj1 dj1Var) {
        this.e = tx0Var;
        this.f = dj1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean add(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px0.add(java.lang.Object):boolean");
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.contains((String) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.indexOf((String) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof String)) {
            return -1;
        }
        return super.lastIndexOf((String) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return super.remove((String) obj);
    }
}
