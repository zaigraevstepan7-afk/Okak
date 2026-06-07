package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ns {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ns.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ns.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public ns(nt1 nt1Var) {
        this._prev$volatile = nt1Var;
    }

    public final void a() {
        b.set(this, null);
    }

    public final ns b() {
        Object obj = a.get(this);
        if (obj == fc2.k) {
            return null;
        }
        return (ns) obj;
    }

    public abstract boolean c();

    public final void d() {
        ns nsVar;
        ns b2;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            ns nsVar2 = (ns) atomicReferenceFieldUpdater.get(this);
            while (nsVar2 != null && nsVar2.c()) {
                nsVar2 = (ns) atomicReferenceFieldUpdater.get(nsVar2);
            }
            ns b3 = b();
            b3.getClass();
            while (b3.c() && (b2 = b3.b()) != null) {
                b3 = b2;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b3);
                if (((ns) obj) == null) {
                    nsVar = null;
                } else {
                    nsVar = nsVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b3, obj, nsVar)) {
                    if (atomicReferenceFieldUpdater.get(b3) != obj) {
                        break;
                    }
                }
            }
            if (nsVar2 != null) {
                a.set(nsVar2, b3);
            }
            if (!b3.c() || b3.b() == null) {
                if (nsVar2 == null || !nsVar2.c()) {
                    return;
                }
            }
        }
    }
}
