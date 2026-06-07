package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bg1 extends p0 implements Set, Collection, xo0 {
    public static final bg1 h;
    public final Object e;
    public final Object f;
    public final tf1 g;

    static {
        g3 g3Var = g3.J;
        h = new bg1(g3Var, g3Var, tf1.g);
    }

    public bg1(Object obj, Object obj2, tf1 tf1Var) {
        this.e = obj;
        this.f = obj2;
        this.g = tf1Var;
    }

    @Override // defpackage.s
    public final int a() {
        return this.g.f;
    }

    @Override // defpackage.s, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.g.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new if0(this.e, this.g);
    }
}
