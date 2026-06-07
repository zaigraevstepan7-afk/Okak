package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gz1 implements zr, Iterable, xo0 {
    public int f;
    public int h;
    public int i;
    public boolean k;
    public int l;
    public HashMap n;
    public p31 o;
    public int[] e = new int[0];
    public Object[] g = new Object[0];
    public final Object j = new Object();
    public ArrayList m = new ArrayList();

    public final int a(p3 p3Var) {
        if (this.k) {
            vr.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!p3Var.a()) {
            ei1.a("Anchor refers to a group that was removed");
        }
        return p3Var.a;
    }

    public final void b() {
        this.n = new HashMap();
    }

    public final fz1 c() {
        if (!this.k) {
            this.i++;
            return new fz1(this);
        }
        se.p("Cannot read while a writer is pending");
        return null;
    }

    public final jz1 d() {
        if (this.k) {
            vr.a("Cannot start a writer when another writer is pending");
        }
        if (this.i > 0) {
            vr.a("Cannot start a writer when a reader is pending");
        }
        this.k = true;
        this.l++;
        return new jz1(this);
    }

    public final boolean e(p3 p3Var) {
        int d;
        if (p3Var.a() && (d = iz1.d(this.m, p3Var.a, this.f)) >= 0 && sn0.r(this.m.get(d), p3Var)) {
            return true;
        }
        return false;
    }

    public final dg0 f(int i) {
        p3 p3Var;
        int i2;
        ArrayList arrayList;
        int d;
        HashMap hashMap = this.n;
        if (hashMap != null) {
            if (this.k) {
                vr.a("use active SlotWriter to crate an anchor for location instead");
            }
            if (i >= 0 && i < (i2 = this.f) && (d = iz1.d((arrayList = this.m), i, i2)) >= 0) {
                p3Var = (p3) arrayList.get(d);
            } else {
                p3Var = null;
            }
            if (p3Var != null) {
                return (dg0) hashMap.get(p3Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ag0(this, 0, this.f);
    }
}
