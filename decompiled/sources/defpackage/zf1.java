package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zf1 extends p0 {
    public final /* synthetic */ int e;
    public final tf1 f;

    public /* synthetic */ zf1(tf1 tf1Var, int i) {
        this.e = i;
        this.f = tf1Var;
    }

    @Override // defpackage.s
    public final int a() {
        int i = this.e;
        tf1 tf1Var = this.f;
        switch (i) {
            case 0:
                tf1Var.getClass();
                return tf1Var.f;
            default:
                tf1Var.getClass();
                return tf1Var.f;
        }
    }

    @Override // defpackage.s, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.e;
        tf1 tf1Var = this.f;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = tf1Var.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !tf1Var.containsKey(entry.getKey())) {
                    return false;
                }
                return true;
            default:
                return tf1Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                yb2 yb2Var = this.f.e;
                zb2[] zb2VarArr = new zb2[8];
                for (int i = 0; i < 8; i++) {
                    zb2VarArr[i] = new ac2(0);
                }
                return new uf1(yb2Var, zb2VarArr);
            default:
                yb2 yb2Var2 = this.f.e;
                zb2[] zb2VarArr2 = new zb2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    zb2VarArr2[i2] = new ac2(1);
                }
                return new uf1(yb2Var2, zb2VarArr2);
        }
    }
}
