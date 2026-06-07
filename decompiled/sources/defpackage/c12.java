package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c12 {
    public final oe0 a;
    public boolean c;
    public l2 h;
    public b12 i;
    public final AtomicReference b = new AtomicReference(null);
    public final h8 d = new h8(this, 20);
    public final hh1 e = new hh1(this, 14);
    public final q41 f = new q41(new b12[16]);
    public final Object g = new Object();
    public long j = -1;

    public c12(oe0 oe0Var) {
        this.a = oe0Var;
    }

    public final void a() {
        synchronized (this.g) {
            q41 q41Var = this.f;
            Object[] objArr = q41Var.e;
            int i = q41Var.g;
            for (int i2 = 0; i2 < i; i2++) {
                b12 b12Var = (b12) objArr[i2];
                b12Var.e.a();
                b12Var.f.a();
                b12Var.l.a();
                b12Var.m.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else if (obj instanceof List) {
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                } else {
                    vr.b("Unexpected notification");
                    se.c();
                    return false;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                q41 q41Var = this.f;
                Object[] objArr = q41Var.e;
                int i = q41Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (!((b12) objArr[i2]).a(set) && !z2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
            }
        }
    }

    public final void c(Object obj, oe0 oe0Var, de0 de0Var) {
        n41 n41Var;
        Object obj2;
        b12 b12Var;
        boolean z;
        x31 x31Var;
        i02 rb2Var;
        i02 j;
        Object obj3;
        Object obj4;
        long[] jArr;
        int i;
        long[] jArr2;
        long j2;
        boolean z2;
        synchronized (this.g) {
            q41 q41Var = this.f;
            Object[] objArr = q41Var.e;
            int i2 = q41Var.g;
            int i3 = 0;
            while (true) {
                n41Var = null;
                if (i3 < i2) {
                    obj2 = objArr[i3];
                    if (((b12) obj2).a == oe0Var) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            b12Var = (b12) obj2;
            z = true;
            if (b12Var == null) {
                oe0Var.getClass();
                fc2.t(1, oe0Var);
                b12Var = new b12(oe0Var);
                q41Var.b(b12Var);
            }
        }
        b12 b12Var2 = this.i;
        long j3 = this.j;
        if (j3 != -1 && j3 != rp1.g()) {
            ei1.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j3 + "), currentThread={id=" + rp1.g() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.i = b12Var;
            this.j = rp1.g();
            hh1 hh1Var = this.e;
            Object obj5 = b12Var.b;
            x31 x31Var2 = b12Var.c;
            int i4 = b12Var.d;
            b12Var.b = obj;
            b12Var.c = (x31) b12Var.f.g(obj);
            if (b12Var.d == -1) {
                b12Var.d = Long.hashCode(q02.j().g());
            }
            tr trVar = b12Var.i;
            q41 g = fr1.g();
            try {
                g.b(trVar);
                if (hh1Var == null) {
                    de0Var.invoke();
                    x31Var = x31Var2;
                } else {
                    i02 i02Var = (i02) q02.b.g();
                    if (i02Var instanceof rb2) {
                        x31Var = x31Var2;
                        if (((rb2) i02Var).t == rp1.g()) {
                            oe0 oe0Var2 = ((rb2) i02Var).r;
                            oe0 oe0Var3 = ((rb2) i02Var).s;
                            try {
                                ((rb2) i02Var).r = q02.k(hh1Var, oe0Var2, true);
                                ((rb2) i02Var).s = oe0Var3;
                                de0Var.invoke();
                                ((rb2) i02Var).r = oe0Var2;
                                ((rb2) i02Var).s = oe0Var3;
                            } catch (Throwable th) {
                                ((rb2) i02Var).r = oe0Var2;
                                ((rb2) i02Var).s = oe0Var3;
                                throw th;
                            }
                        }
                    } else {
                        x31Var = x31Var2;
                    }
                    try {
                        try {
                            if (i02Var != null && !(i02Var instanceof n41)) {
                                rb2Var = i02Var.u(hh1Var);
                                j = rb2Var.j();
                                de0Var.invoke();
                                i02.q(j);
                                rb2Var.c();
                            }
                            de0Var.invoke();
                            i02.q(j);
                            rb2Var.c();
                        } catch (Throwable th2) {
                            try {
                                i02.q(j);
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    rb2Var.c();
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    g.k(g.g - 1);
                                    throw th;
                                }
                            }
                        }
                        j = rb2Var.j();
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    if (i02Var instanceof n41) {
                        n41Var = (n41) i02Var;
                    }
                    rb2Var = new rb2(n41Var, hh1Var, null, true, false);
                }
                g.k(g.g - 1);
                Object obj6 = b12Var.b;
                obj6.getClass();
                int i5 = b12Var.d;
                x31 x31Var3 = b12Var.c;
                if (x31Var3 != null) {
                    long[] jArr3 = x31Var3.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j4 = jArr3[i6];
                            boolean z3 = z;
                            obj4 = obj5;
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j4 & 255) < 128) {
                                        i = i8;
                                        int i9 = (i6 << 3) + i;
                                        jArr2 = jArr3;
                                        Object obj7 = x31Var3.b[i9];
                                        j2 = j4;
                                        if (x31Var3.c[i9] != i5) {
                                            z2 = z3;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            b12Var.c(obj6, obj7);
                                        }
                                        if (z2) {
                                            x31Var3.f(i9);
                                        }
                                    } else {
                                        i = i8;
                                        jArr2 = jArr3;
                                        j2 = j4;
                                    }
                                    j4 = j2 >> 8;
                                    i8 = i + 1;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i7 != 8) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i6 == length) {
                                break;
                            }
                            i6++;
                            z = z3;
                            obj5 = obj4;
                            jArr3 = jArr;
                        }
                        obj3 = obj4;
                        b12Var.b = obj3;
                        b12Var.c = x31Var;
                        b12Var.d = i4;
                        this.i = b12Var2;
                        this.j = j3;
                    }
                }
                obj3 = obj5;
                b12Var.b = obj3;
                b12Var.c = x31Var;
                b12Var.d = i4;
                this.i = b12Var2;
                this.j = j3;
            } catch (Throwable th6) {
                th = th6;
                g.k(g.g - 1);
                throw th;
            }
        } finally {
            this.i = b12Var2;
            this.j = j3;
        }
    }

    public final void d() {
        h8 h8Var = this.d;
        q02.e(q02.a);
        synchronized (q02.c) {
            q02.h = wn.r0(q02.h, h8Var);
        }
        this.h = new l2(h8Var);
    }
}
