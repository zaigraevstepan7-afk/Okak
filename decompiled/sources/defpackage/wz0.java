package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wz0 extends s {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ wz0(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.s
    public final int a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((Matcher) ((q4) obj).f).groupCount() + 1;
            default:
                tf1 tf1Var = (tf1) obj;
                tf1Var.getClass();
                return tf1Var.f;
        }
    }

    public uz0 b(int i) {
        Matcher matcher = (Matcher) ((q4) this.f).f;
        an0 X = go.X(matcher.start(i), matcher.end(i));
        if (X.e >= 0) {
            String group = matcher.group(i);
            group.getClass();
            return new uz0(group, X);
        }
        return null;
    }

    @Override // defpackage.s, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                if (obj == null) {
                    z = true;
                } else {
                    z = obj instanceof uz0;
                }
                if (!z) {
                    return false;
                }
                return super.contains((uz0) obj);
            default:
                return ((tf1) this.f).containsValue(obj);
        }
    }

    @Override // defpackage.s, java.util.Collection
    public boolean isEmpty() {
        switch (this.e) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new eb2(new o52(new bo(xn.z(this), 0), new r(this, 22), 1));
            default:
                yb2 yb2Var = ((tf1) this.f).e;
                zb2[] zb2VarArr = new zb2[8];
                for (int i = 0; i < 8; i++) {
                    zb2VarArr[i] = new ac2(2);
                }
                return new uf1(yb2Var, zb2VarArr);
        }
    }
}
