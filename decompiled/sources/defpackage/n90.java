package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.nio.file.FileSystem;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class n90 implements Closeable {
    public static final m90 Companion = new Object();
    public static final n90 RESOURCES;
    public static final n90 SYSTEM;
    public static final oe1 SYSTEM_TEMPORARY_DIRECTORY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, oe0] */
    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m126write$default(n90 n90Var, oe1 oe1Var, boolean z, oe0 oe0Var, int i, Object obj) {
        ?? r3;
        Object th = null;
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            oe1Var.getClass();
            oe0Var.getClass();
            al1 k = lo.k(n90Var.sink(oe1Var, z));
            try {
                Object invoke = oe0Var.invoke(k);
                try {
                    k.close();
                } catch (Throwable th2) {
                    th = th2;
                }
                Object obj2 = th;
                th = invoke;
                r3 = obj2;
            } catch (Throwable th3) {
                try {
                    k.close();
                    r3 = th3;
                } catch (Throwable th4) {
                    qo.g(th3, th4);
                    r3 = th3;
                }
            }
            if (r3 == 0) {
                return th;
            }
            throw r3;
        }
        se.v("Super calls with default arguments not supported in this target, function: write");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [n90] */
    static {
        ?? r0;
        try {
            Class.forName("java.nio.file.Files");
            r0 = new Object();
        } catch (ClassNotFoundException unused) {
            r0 = new Object();
        }
        SYSTEM = r0;
        String str = oe1.f;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        SYSTEM_TEMPORARY_DIRECTORY = wc0.k(property, false);
        ClassLoader classLoader = xm1.class.getClassLoader();
        classLoader.getClass();
        RESOURCES = new xm1(classLoader);
    }

    public static /* synthetic */ ey1 appendingSink$default(n90 n90Var, oe1 oe1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return n90Var.appendingSink(oe1Var, z);
        }
        se.v("Super calls with default arguments not supported in this target, function: appendingSink");
        return null;
    }

    public static /* synthetic */ void createDirectories$default(n90 n90Var, oe1 oe1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            n90Var.createDirectories(oe1Var, z);
            return;
        }
        se.v("Super calls with default arguments not supported in this target, function: createDirectories");
    }

    public static /* synthetic */ void createDirectory$default(n90 n90Var, oe1 oe1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            n90Var.createDirectory(oe1Var, z);
            return;
        }
        se.v("Super calls with default arguments not supported in this target, function: createDirectory");
    }

    public static /* synthetic */ void delete$default(n90 n90Var, oe1 oe1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            n90Var.delete(oe1Var, z);
            return;
        }
        se.v("Super calls with default arguments not supported in this target, function: delete");
    }

    public static /* synthetic */ void deleteRecursively$default(n90 n90Var, oe1 oe1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            n90Var.deleteRecursively(oe1Var, z);
            return;
        }
        se.v("Super calls with default arguments not supported in this target, function: deleteRecursively");
    }

    public static final n90 get(FileSystem fileSystem) {
        Companion.getClass();
        fileSystem.getClass();
        return new t71(fileSystem);
    }

    public static /* synthetic */ kv1 listRecursively$default(n90 n90Var, oe1 oe1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return n90Var.listRecursively(oe1Var, z);
        }
        se.v("Super calls with default arguments not supported in this target, function: listRecursively");
        return null;
    }

    public static /* synthetic */ i90 openReadWrite$default(n90 n90Var, oe1 oe1Var, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return n90Var.openReadWrite(oe1Var, z, z2);
        }
        se.v("Super calls with default arguments not supported in this target, function: openReadWrite");
        return null;
    }

    public static /* synthetic */ ey1 sink$default(n90 n90Var, oe1 oe1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return n90Var.sink(oe1Var, z);
        }
        se.v("Super calls with default arguments not supported in this target, function: sink");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, oe0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* renamed from: -read, reason: not valid java name */
    public final <T> T m127read(oe1 oe1Var, oe0 oe0Var) {
        ?? r3;
        oe1Var.getClass();
        oe0Var.getClass();
        bl1 l = lo.l(source(oe1Var));
        T th = null;
        try {
            ?? invoke = oe0Var.invoke(l);
            try {
                l.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r3 = th;
            th = invoke;
        } catch (Throwable th3) {
            try {
                l.close();
                r3 = th3;
            } catch (Throwable th4) {
                qo.g(th3, th4);
                r3 = th3;
            }
        }
        if (r3 == 0) {
            return th;
        }
        throw r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, oe0] */
    /* renamed from: -write, reason: not valid java name */
    public final <T> T m128write(oe1 oe1Var, boolean z, oe0 oe0Var) {
        ?? r3;
        oe1Var.getClass();
        oe0Var.getClass();
        al1 k = lo.k(sink(oe1Var, z));
        T th = null;
        try {
            ?? invoke = oe0Var.invoke(k);
            try {
                k.close();
            } catch (Throwable th2) {
                th = th2;
            }
            r3 = th;
            th = invoke;
        } catch (Throwable th3) {
            try {
                k.close();
                r3 = th3;
            } catch (Throwable th4) {
                qo.g(th3, th4);
                r3 = th3;
            }
        }
        if (r3 == 0) {
            return th;
        }
        throw r3;
    }

    public final ey1 appendingSink(oe1 oe1Var) {
        oe1Var.getClass();
        return appendingSink(oe1Var, false);
    }

    public abstract ey1 appendingSink(oe1 oe1Var, boolean z);

    public abstract void atomicMove(oe1 oe1Var, oe1 oe1Var2);

    public abstract oe1 canonicalize(oe1 oe1Var);

    public void copy(oe1 oe1Var, oe1 oe1Var2) {
        Throwable th;
        Long l;
        oe1Var.getClass();
        oe1Var2.getClass();
        k12 source = source(oe1Var);
        Throwable th2 = null;
        try {
            al1 k = lo.k(sink$default(this, oe1Var2, false, 2, null));
            try {
                l = Long.valueOf(k.l(source));
                try {
                    k.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    k.close();
                } catch (Throwable th5) {
                    qo.g(th4, th5);
                }
                th = th4;
                l = null;
            }
        } catch (Throwable th6) {
            th2 = th6;
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th7) {
                    qo.g(th2, th7);
                }
            }
        }
        if (th == null) {
            l.getClass();
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th8) {
                    th2 = th8;
                }
            }
            if (th2 == null) {
                return;
            } else {
                throw th2;
            }
        }
        throw th;
    }

    public final void createDirectories(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        te teVar = new te();
        for (oe1 oe1Var2 = oe1Var; oe1Var2 != null && !exists(oe1Var2); oe1Var2 = oe1Var2.c()) {
            teVar.addFirst(oe1Var2);
        }
        if (z && teVar.isEmpty()) {
            se.f(oe1Var, " already exists.");
            return;
        }
        Iterator<E> it = teVar.iterator();
        while (it.hasNext()) {
            createDirectory$default(this, (oe1) it.next(), false, 2, null);
        }
    }

    public final void createDirectory(oe1 oe1Var) {
        oe1Var.getClass();
        createDirectory(oe1Var, false);
    }

    public abstract void createDirectory(oe1 oe1Var, boolean z);

    public abstract void createSymlink(oe1 oe1Var, oe1 oe1Var2);

    public final void delete(oe1 oe1Var) {
        oe1Var.getClass();
        delete(oe1Var, false);
    }

    public abstract void delete(oe1 oe1Var, boolean z);

    public void deleteRecursively(oe1 oe1Var, boolean z) {
        boolean z2;
        oe1Var.getClass();
        lv1 t = yq1.t(new d(this, oe1Var, null, 0));
        while (t.hasNext()) {
            oe1 oe1Var2 = (oe1) t.next();
            if (z && !t.hasNext()) {
                z2 = true;
            } else {
                z2 = false;
            }
            delete(oe1Var2, z2);
        }
    }

    public final boolean exists(oe1 oe1Var) {
        oe1Var.getClass();
        if (metadataOrNull(oe1Var) != null) {
            return true;
        }
        return false;
    }

    public abstract List list(oe1 oe1Var);

    public abstract List listOrNull(oe1 oe1Var);

    public kv1 listRecursively(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        return new bo(new e(oe1Var, this, z, null), 2);
    }

    public final j90 metadata(oe1 oe1Var) {
        oe1Var.getClass();
        j90 metadataOrNull = metadataOrNull(oe1Var);
        if (metadataOrNull != null) {
            return metadataOrNull;
        }
        throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
    }

    public abstract j90 metadataOrNull(oe1 oe1Var);

    public abstract i90 openReadOnly(oe1 oe1Var);

    public final i90 openReadWrite(oe1 oe1Var) {
        oe1Var.getClass();
        return openReadWrite(oe1Var, false, false);
    }

    public abstract i90 openReadWrite(oe1 oe1Var, boolean z, boolean z2);

    public final ey1 sink(oe1 oe1Var) {
        oe1Var.getClass();
        return sink(oe1Var, false);
    }

    public abstract ey1 sink(oe1 oe1Var, boolean z);

    public abstract k12 source(oe1 oe1Var);

    public final kv1 listRecursively(oe1 oe1Var) {
        oe1Var.getClass();
        return listRecursively(oe1Var, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void deleteRecursively(oe1 oe1Var) {
        oe1Var.getClass();
        deleteRecursively(oe1Var, false);
    }

    public final void createDirectories(oe1 oe1Var) {
        oe1Var.getClass();
        createDirectories(oe1Var, false);
    }
}
