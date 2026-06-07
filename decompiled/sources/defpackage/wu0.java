package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wu0 {
    public final boolean a;
    public b90 b;
    public nu0 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final r22 i;

    public wu0(uu0 uu0Var, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new b90();
        nu0 nu0Var = nu0.f;
        this.c = nu0Var;
        this.h = new ArrayList();
        this.d = new WeakReference(uu0Var);
        this.i = d6.j(nu0Var);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [vu0, java.lang.Object] */
    public final void a(tu0 tu0Var) {
        su0 syVar;
        vu0 vu0Var;
        uu0 uu0Var;
        mu0 mu0Var;
        tu0Var.getClass();
        c("addObserver");
        nu0 nu0Var = this.c;
        nu0 nu0Var2 = nu0.e;
        if (nu0Var != nu0Var2) {
            nu0Var2 = nu0.f;
        }
        ?? obj = new Object();
        HashMap hashMap = bv0.a;
        boolean z = tu0Var instanceof su0;
        boolean z2 = tu0Var instanceof qy;
        int i = 2;
        boolean z3 = false;
        if (z && z2) {
            syVar = new sy((qy) tu0Var, (su0) tu0Var);
        } else if (z2) {
            syVar = new sy((qy) tu0Var, (su0) null);
        } else if (z) {
            syVar = (su0) tu0Var;
        } else {
            Class<?> cls = tu0Var.getClass();
            if (bv0.b(cls) == 2) {
                Object obj2 = bv0.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() != 1) {
                    int size = list.size();
                    hf0[] hf0VarArr = new hf0[size];
                    if (size <= 0) {
                        syVar = new ol1(hf0VarArr, i);
                    } else {
                        bv0.a((Constructor) list.get(0), tu0Var);
                        throw null;
                    }
                } else {
                    bv0.a((Constructor) list.get(0), tu0Var);
                    throw null;
                }
            } else {
                syVar = new sy(tu0Var);
            }
        }
        obj.b = syVar;
        obj.a = nu0Var2;
        b90 b90Var = this.b;
        eq1 eq1Var = (eq1) b90Var.i.get(tu0Var);
        if (eq1Var != null) {
            vu0Var = eq1Var.f;
        } else {
            HashMap hashMap2 = b90Var.i;
            eq1 eq1Var2 = new eq1(tu0Var, obj);
            b90Var.h++;
            eq1 eq1Var3 = b90Var.f;
            if (eq1Var3 == null) {
                b90Var.e = eq1Var2;
                b90Var.f = eq1Var2;
            } else {
                eq1Var3.g = eq1Var2;
                eq1Var2.h = eq1Var3;
                b90Var.f = eq1Var2;
            }
            hashMap2.put(tu0Var, eq1Var2);
            vu0Var = null;
        }
        if (vu0Var != null || (uu0Var = (uu0) this.d.get()) == null) {
            return;
        }
        if (this.e != 0 || this.f) {
            z3 = true;
        }
        nu0 b = b(tu0Var);
        this.e++;
        while (obj.a.compareTo(b) < 0 && this.b.i.containsKey(tu0Var)) {
            nu0 nu0Var3 = obj.a;
            ArrayList arrayList = this.h;
            arrayList.add(nu0Var3);
            ku0 ku0Var = mu0.Companion;
            nu0 nu0Var4 = obj.a;
            ku0Var.getClass();
            nu0Var4.getClass();
            int ordinal = nu0Var4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        mu0Var = null;
                    } else {
                        mu0Var = mu0.ON_RESUME;
                    }
                } else {
                    mu0Var = mu0.ON_START;
                }
            } else {
                mu0Var = mu0.ON_CREATE;
            }
            if (mu0Var != null) {
                obj.a(uu0Var, mu0Var);
                arrayList.remove(arrayList.size() - 1);
                b = b(tu0Var);
            } else {
                se.g(obj.a, "no event up from ");
                return;
            }
        }
        if (!z3) {
            g();
        }
        this.e--;
    }

    public final nu0 b(tu0 tu0Var) {
        eq1 eq1Var;
        nu0 nu0Var;
        HashMap hashMap = this.b.i;
        nu0 nu0Var2 = null;
        if (hashMap.containsKey(tu0Var)) {
            eq1Var = ((eq1) hashMap.get(tu0Var)).h;
        } else {
            eq1Var = null;
        }
        if (eq1Var != null) {
            nu0Var = eq1Var.f.a;
        } else {
            nu0Var = null;
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            nu0Var2 = (nu0) arrayList.get(arrayList.size() - 1);
        }
        nu0 nu0Var3 = this.c;
        nu0Var3.getClass();
        if (nu0Var == null || nu0Var.compareTo(nu0Var3) >= 0) {
            nu0Var = nu0Var3;
        }
        if (nu0Var2 != null && nu0Var2.compareTo(nu0Var) < 0) {
            return nu0Var2;
        }
        return nu0Var;
    }

    public final void c(String str) {
        je jeVar;
        if (this.a) {
            if (je.c != null) {
                jeVar = je.c;
            } else {
                synchronized (je.class) {
                    try {
                        if (je.c == null) {
                            je.c = new je(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                jeVar = je.c;
            }
            ((je) jeVar.b).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            y61.f(l90.m("Method ", str, " must be called on the main thread"));
        }
    }

    public final void d(mu0 mu0Var) {
        mu0Var.getClass();
        c("handleLifecycleEvent");
        e(mu0Var.a());
    }

    public final void e(nu0 nu0Var) {
        if (this.c != nu0Var) {
            uu0 uu0Var = (uu0) this.d.get();
            nu0 nu0Var2 = this.c;
            nu0Var2.getClass();
            nu0Var.getClass();
            nu0 nu0Var3 = nu0.f;
            nu0 nu0Var4 = nu0.e;
            if (nu0Var2 == nu0Var3 && nu0Var == nu0Var4) {
                throw new IllegalStateException(("State must be at least '" + nu0.g + "' to be moved to '" + nu0Var + "' in component " + uu0Var).toString());
            }
            if (nu0Var2 == nu0Var4 && nu0Var2 != nu0Var) {
                throw new IllegalStateException(("State is '" + nu0Var4 + "' and cannot be moved to `" + nu0Var + "` in component " + uu0Var).toString());
            }
            this.c = nu0Var;
            if (!this.f && this.e == 0) {
                this.f = true;
                g();
                this.f = false;
                if (this.c == nu0Var4) {
                    this.b = new b90();
                    return;
                }
                return;
            }
            this.g = true;
        }
    }

    public final void f(tu0 tu0Var) {
        tu0Var.getClass();
        c("removeObserver");
        b90 b90Var = this.b;
        WeakHashMap weakHashMap = b90Var.g;
        HashMap hashMap = b90Var.i;
        eq1 eq1Var = (eq1) hashMap.get(tu0Var);
        if (eq1Var != null) {
            b90Var.h--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((gq1) it.next()).a(eq1Var);
                }
            }
            eq1 eq1Var2 = eq1Var.h;
            eq1 eq1Var3 = eq1Var.g;
            if (eq1Var2 != null) {
                eq1Var2.g = eq1Var3;
            } else {
                b90Var.e = eq1Var3;
            }
            eq1 eq1Var4 = eq1Var.g;
            if (eq1Var4 != null) {
                eq1Var4.h = eq1Var2;
            } else {
                b90Var.f = eq1Var2;
            }
            eq1Var.g = null;
            eq1Var.h = null;
        }
        hashMap.remove(tu0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r11.g = false;
        r11.i.j(r11.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu0.g():void");
    }
}
