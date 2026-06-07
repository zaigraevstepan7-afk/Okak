package defpackage;

import java.util.RandomAccess;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qb1 extends b0 implements RandomAccess {
    public final bl[] e;
    public final int[] f;

    public qb1(bl[] blVarArr, int[] iArr) {
        this.e = blVarArr;
        this.f = iArr;
    }

    @Override // defpackage.s
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.s, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof bl)) {
            return false;
        }
        return super.contains((bl) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.e[i];
    }

    @Override // defpackage.b0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof bl)) {
            return -1;
        }
        return super.indexOf((bl) obj);
    }

    @Override // defpackage.b0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof bl)) {
            return -1;
        }
        return super.lastIndexOf((bl) obj);
    }
}
