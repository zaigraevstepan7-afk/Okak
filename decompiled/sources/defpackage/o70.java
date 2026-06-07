package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class o70 implements Runnable, Comparable, q10 {
    private volatile Object _heap;
    public long e;
    public int f = -1;

    public o70(long j) {
        this.e = j;
    }

    @Override // defpackage.q10
    public final void a() {
        p70 p70Var;
        synchronized (this) {
            try {
                Object obj = this._heap;
                ad0 ad0Var = mp0.q;
                if (obj == ad0Var) {
                    return;
                }
                t92 t92Var = null;
                if (obj instanceof p70) {
                    p70Var = (p70) obj;
                } else {
                    p70Var = null;
                }
                if (p70Var != null) {
                    synchronized (p70Var) {
                        Object obj2 = this._heap;
                        if (obj2 instanceof t92) {
                            t92Var = (t92) obj2;
                        }
                        if (t92Var != null) {
                            p70Var.b(this.f);
                        }
                    }
                }
                this._heap = ad0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, p70 p70Var, q70 q70Var) {
        o70 o70Var;
        boolean z;
        synchronized (this) {
            if (this._heap == mp0.q) {
                return 2;
            }
            synchronized (p70Var) {
                try {
                    o70[] o70VarArr = p70Var.a;
                    if (o70VarArr != null) {
                        o70Var = o70VarArr[0];
                    } else {
                        o70Var = null;
                    }
                    if (q70.m.get(q70Var) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return 1;
                    }
                    if (o70Var == null) {
                        p70Var.c = j;
                    } else {
                        long j2 = o70Var.e;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - p70Var.c > 0) {
                            p70Var.c = j;
                        }
                    }
                    long j3 = this.e;
                    long j4 = p70Var.c;
                    if (j3 - j4 < 0) {
                        this.e = j4;
                    }
                    p70Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.e - ((o70) obj).e;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    public final void d(p70 p70Var) {
        if (this._heap != mp0.q) {
            this._heap = p70Var;
        } else {
            se.h("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.e + AbstractJsonLexerKt.END_LIST;
    }
}
