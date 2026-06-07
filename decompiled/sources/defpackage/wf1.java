package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wf1 extends e0 {
    public final /* synthetic */ int e;
    public final rf1 f;

    public /* synthetic */ wf1(int i, rf1 rf1Var) {
        this.e = i;
        this.f = rf1Var;
    }

    @Override // defpackage.e0
    public final int a() {
        switch (this.e) {
            case 0:
                return this.f.i;
            default:
                return this.f.i;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.e) {
            case 0:
                this.f.clear();
                return;
            default:
                this.f.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                rf1 rf1Var = this.f;
                Object obj2 = rf1Var.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !rf1Var.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return this.f.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new xf1(this.f);
            default:
                zb2[] zb2VarArr = new zb2[8];
                for (int i = 0; i < 8; i++) {
                    zb2VarArr[i] = new ac2(1);
                }
                return new vf1(this.f, zb2VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f.remove(entry.getKey(), entry.getValue());
            default:
                rf1 rf1Var = this.f;
                if (!rf1Var.containsKey(obj)) {
                    return false;
                }
                rf1Var.remove(obj);
                return true;
        }
    }
}
