package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class o0 implements Future {
    public static final boolean h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger i = Logger.getLogger(o0.class.getName());
    public static final sn0 j;
    public static final Object k;
    public volatile Object e;
    public volatile k0 f;
    public volatile n0 g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [sn0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r3;
        try {
            th = null;
            r3 = new l0(AtomicReferenceFieldUpdater.newUpdater(n0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(n0.class, n0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o0.class, n0.class, "g"), AtomicReferenceFieldUpdater.newUpdater(o0.class, k0.class, "f"), AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, "e"));
        } catch (Throwable th) {
            th = th;
            r3 = new Object();
        }
        j = r3;
        if (th != null) {
            i.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        k = new Object();
    }

    public static void b(o0 o0Var) {
        n0 n0Var;
        k0 k0Var;
        do {
            n0Var = o0Var.g;
        } while (!j.y(o0Var, n0Var, n0.c));
        while (n0Var != null) {
            Thread thread = n0Var.a;
            if (thread != null) {
                n0Var.a = null;
                LockSupport.unpark(thread);
            }
            n0Var = n0Var.b;
        }
        do {
            k0Var = o0Var.f;
        } while (!j.w(o0Var, k0Var));
        k0 k0Var2 = null;
        while (k0Var != null) {
            k0 k0Var3 = k0Var.a;
            k0Var.a = k0Var2;
            k0Var2 = k0Var;
            k0Var = k0Var3;
        }
        while (k0Var2 != null) {
            k0Var2 = k0Var2.a;
            try {
                throw null;
                break;
            } catch (RuntimeException e) {
                i.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof i0)) {
            if (!(obj instanceof j0)) {
                if (obj == k) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException((Throwable) null);
        }
        Throwable th = ((i0) obj).a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object d(o0 o0Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = o0Var.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String valueOf;
        try {
            Object d = d(this);
            sb.append("SUCCESS, result=[");
            if (d == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(d);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        i0 i0Var;
        Object obj = this.e;
        if (obj == null) {
            if (h) {
                i0Var = new i0(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                i0Var = i0.b;
            } else {
                i0Var = i0.c;
            }
            if (j.x(this, obj, i0Var)) {
                b(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void e(n0 n0Var) {
        n0Var.a = null;
        while (true) {
            n0 n0Var2 = this.g;
            if (n0Var2 != n0.c) {
                n0 n0Var3 = null;
                while (n0Var2 != null) {
                    n0 n0Var4 = n0Var2.b;
                    if (n0Var2.a != null) {
                        n0Var3 = n0Var2;
                    } else if (n0Var3 != null) {
                        n0Var3.b = n0Var4;
                        if (n0Var3.a == null) {
                            break;
                        }
                    } else if (!j.y(this, n0Var2, n0Var4)) {
                        break;
                    }
                    n0Var2 = n0Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long j3;
        boolean z;
        n0 n0Var = n0.c;
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.e;
            if (obj != null) {
                return c(obj);
            }
            if (nanos > 0) {
                j3 = System.nanoTime() + nanos;
            } else {
                j3 = 0;
            }
            if (nanos >= 1000) {
                n0 n0Var2 = this.g;
                if (n0Var2 != n0Var) {
                    n0 n0Var3 = new n0();
                    do {
                        sn0 sn0Var = j;
                        sn0Var.P(n0Var3, n0Var2);
                        if (sn0Var.y(this, n0Var2, n0Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.e;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = j3 - System.nanoTime();
                                } else {
                                    e(n0Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(n0Var3);
                        } else {
                            n0Var2 = this.g;
                        }
                    } while (n0Var2 != n0Var);
                }
                return c(this.e);
            }
            while (nanos > 0) {
                Object obj3 = this.e;
                if (obj3 != null) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j3 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String o0Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                } else {
                    z = true;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + o0Var);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.e instanceof i0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.e instanceof i0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        n0 n0Var = n0.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if (obj2 != null) {
                return c(obj2);
            }
            n0 n0Var2 = this.g;
            if (n0Var2 != n0Var) {
                n0 n0Var3 = new n0();
                do {
                    sn0 sn0Var = j;
                    sn0Var.P(n0Var3, n0Var2);
                    if (sn0Var.y(this, n0Var2, n0Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                e(n0Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    n0Var2 = this.g;
                } while (n0Var2 != n0Var);
            }
            return c(this.e);
        }
        throw new InterruptedException();
    }
}
