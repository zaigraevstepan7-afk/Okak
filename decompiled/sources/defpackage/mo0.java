package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mo0 implements rj0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(mo0.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(mo0.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(mo0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final g81 e;

    public mo0(g81 g81Var, Throwable th) {
        this.e = g81Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c = c();
        if (c == null) {
            g.set(this, th);
            return;
        }
        if (th != c) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                se.t(obj, "State is ");
            }
        }
    }

    @Override // defpackage.rj0
    public final boolean b() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final Throwable c() {
        return (Throwable) g.get(this);
    }

    @Override // defpackage.rj0
    public final g81 d() {
        return this.e;
    }

    public final boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            se.t(obj, "State is ");
            return null;
        }
        Throwable c = c();
        if (c != null) {
            arrayList.add(0, c);
        }
        if (th != null && !th.equals(c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, d6.p);
        return arrayList;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        if (f.get(this) != 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(h.get(this));
        sb.append(", list=");
        sb.append(this.e);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
