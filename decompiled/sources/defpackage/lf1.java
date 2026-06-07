package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lf1 {
    public final ds a;
    public final xr b;
    public final ur c;
    public final se0 d;
    public final boolean e;
    public final gd2 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(nf1.g);
    public long i = rp1.g();
    public j41 j;
    public final fm1 k;
    public final kl1 l;

    public lf1(ds dsVar, xr xrVar, ur urVar, l41 l41Var, se0 se0Var, boolean z, gd2 gd2Var, Object obj) {
        this.a = dsVar;
        this.b = xrVar;
        this.c = urVar;
        this.d = se0Var;
        this.e = z;
        this.f = gd2Var;
        this.g = obj;
        j41 j41Var = tr1.a;
        j41Var.getClass();
        this.j = j41Var;
        fm1 fm1Var = new fm1();
        fm1Var.g(l41Var, urVar.z());
        this.k = fm1Var;
        this.l = new kl1(gd2Var.g);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (((nf1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    nf1 nf1Var = nf1.j;
                    nf1 nf1Var2 = nf1.k;
                    while (!atomicReference.compareAndSet(nf1Var, nf1Var2)) {
                        if (atomicReference.get() != nf1Var) {
                            ei1.b("Unexpected state change from: " + nf1Var + " to: " + nf1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e) {
            atomicReference.set(nf1.e);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.c();
                    this.k.d();
                } finally {
                    this.k.b();
                    this.a.u = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        if (((nf1) this.h.get()).compareTo(nf1.j) >= 0) {
            return true;
        }
        return false;
    }

    public final void d() {
        nf1 nf1Var;
        nf1 nf1Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.h;
            nf1Var = nf1.h;
            nf1Var2 = nf1.j;
            if (atomicReference.compareAndSet(nf1Var, nf1Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != nf1Var) {
                z = false;
                break;
            }
        }
        if (!z) {
            ei1.b("Unexpected state change from: " + nf1Var + " to: " + nf1Var2 + '.');
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    public final boolean e(se seVar) {
        nf1 nf1Var = nf1.i;
        AtomicReference atomicReference = this.h;
        try {
            int ordinal = ((nf1) atomicReference.get()).ordinal();
            nf1 nf1Var2 = nf1.h;
            ds dsVar = this.a;
            xr xrVar = this.b;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    ur urVar = this.c;
                    boolean z = this.e;
                    if (z) {
                        urVar.z = 0;
                        urVar.y = true;
                    }
                    try {
                        this.j = xrVar.b(dsVar, seVar, this.d);
                        nf1 nf1Var3 = nf1.g;
                        while (true) {
                            if (!atomicReference.compareAndSet(nf1Var3, nf1Var2)) {
                                if (atomicReference.get() != nf1Var3) {
                                    ei1.b("Unexpected state change from: " + nf1Var3 + " to: " + nf1Var2 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z) {
                            urVar.s();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(nf1Var2, nf1Var)) {
                            if (atomicReference.get() != nf1Var2) {
                                ei1.b("Unexpected state change from: " + nf1Var2 + " to: " + nf1Var + '.');
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = rp1.g();
                        this.j = xrVar.n(dsVar, seVar, this.j);
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(nf1Var, nf1Var2)) {
                                if (atomicReference.get() != nf1Var) {
                                    ei1.b("Unexpected state change from: " + nf1Var + " to: " + nf1Var2 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(nf1Var, nf1Var2)) {
                                if (atomicReference.get() != nf1Var) {
                                    ei1.b("Unexpected state change from: " + nf1Var + " to: " + nf1Var2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    vr.b("Recursive call to resume()");
                    throw new RuntimeException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new RuntimeException();
            }
        } catch (Exception e) {
            atomicReference.set(nf1.e);
            throw e;
        }
    }
}
