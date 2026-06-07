package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ox0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(ox0.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(ox0.class, "_state$volatile");
    public static final ad0 g = new ad0("REMOVE_FROZEN", 5);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public ox0(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            se.p("Check failed.");
            throw null;
        }
        se.p("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                if ((2305843009213693952L & j) != 0) {
                    return 2;
                }
                return 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) != (i & i3)) {
                boolean z = this.b;
                AtomicReferenceArray atomicReferenceArray = this.d;
                if (!z && atomicReferenceArray.get(i2 & i3) != null) {
                    int i4 = this.a;
                    if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                } else {
                    ox0 ox0Var = this;
                    if (f.compareAndSet(ox0Var, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i2 & i3, obj);
                        ox0 ox0Var2 = ox0Var;
                        while ((atomicLongFieldUpdater.get(ox0Var2) & 1152921504606846976L) != 0) {
                            ox0Var2 = ox0Var2.c();
                            AtomicReferenceArray atomicReferenceArray2 = ox0Var2.d;
                            int i5 = ox0Var2.c & i2;
                            Object obj2 = atomicReferenceArray2.get(i5);
                            if ((obj2 instanceof nx0) && ((nx0) obj2).a == i2) {
                                atomicReferenceArray2.set(i5, obj);
                            } else {
                                ox0Var2 = null;
                            }
                            if (ox0Var2 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    this = ox0Var;
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            ox0 ox0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(ox0Var, j, 2305843009213693952L | j)) {
                return true;
            }
            this = ox0Var;
        }
    }

    public final ox0 c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        ox0 ox0Var;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                ox0Var = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            ox0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(ox0Var, j, j2)) {
                j = j2;
                break;
            }
            this = ox0Var;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            ox0 ox0Var2 = (ox0) atomicReferenceFieldUpdater.get(ox0Var);
            if (ox0Var2 != null) {
                return ox0Var2;
            }
            ox0 ox0Var3 = new ox0(ox0Var.a * 2, ox0Var.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = ox0Var.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = ox0Var.d.get(i4);
                if (obj == null) {
                    obj = new nx0(i);
                }
                ox0Var3.d.set(ox0Var3.c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(ox0Var3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(ox0Var, null, ox0Var3) && atomicReferenceFieldUpdater.get(ox0Var) == null) {
            }
        }
    }

    public final Object d() {
        ox0 ox0Var = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(ox0Var);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = ox0Var.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = ox0Var.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = ox0Var.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof nx0) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(ox0Var, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                ox0Var = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(ox0Var);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            ox0Var = ox0Var.c();
                        } else {
                            ox0 ox0Var2 = ox0Var;
                            if (f.compareAndSet(ox0Var2, j3, (j3 & (-1073741824)) | j2)) {
                                ox0Var2.d.set(i4 & ox0Var2.c, null);
                                ox0Var = null;
                            } else {
                                ox0Var = ox0Var2;
                            }
                        }
                        if (ox0Var == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
