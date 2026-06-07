package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t71 extends u71 {
    public final FileSystem e;

    public t71(FileSystem fileSystem) {
        this.e = fileSystem;
    }

    @Override // defpackage.qo0, defpackage.n90
    public final ey1 appendingSink(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        vv0 v = xn.v();
        v.add(StandardOpenOption.APPEND);
        if (!z) {
            v.add(StandardOpenOption.CREATE);
        }
        vv0 s = xn.s(v);
        Path k = k(oe1Var);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) s.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream newOutputStream = Files.newOutputStream(k, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        newOutputStream.getClass();
        return new hf(1, newOutputStream, new Object());
    }

    @Override // defpackage.u71, defpackage.qo0, defpackage.n90
    public final void atomicMove(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        try {
            Files.move(k(oe1Var), k(oe1Var2), (CopyOption[]) Arrays.copyOf(new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING}, 2)).getClass();
        } catch (UnsupportedOperationException unused) {
            se.w("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.qo0, defpackage.n90
    public final oe1 canonicalize(oe1 oe1Var) {
        oe1Var.getClass();
        try {
            String str = oe1.f;
            Path realPath = k(oe1Var).toRealPath(new LinkOption[0]);
            realPath.getClass();
            return wc0.m(realPath);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
        }
    }

    @Override // defpackage.n90, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.b == true) goto L8;
     */
    @Override // defpackage.qo0, defpackage.n90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void createDirectory(defpackage.oe1 r4, boolean r5) {
        /*
            r3 = this;
            r4.getClass()
            java.nio.file.Path r0 = r3.k(r4)
            j90 r0 = defpackage.u71.c(r0)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.b
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L20
            if (r5 != 0) goto L1a
            goto L20
        L1a:
            java.lang.String r3 = " already exists."
            defpackage.se.f(r4, r3)
            return
        L20:
            java.nio.file.Path r3 = r3.k(r4)     // Catch: java.io.IOException -> L34
            java.nio.file.attribute.FileAttribute[] r5 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L34
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch: java.io.IOException -> L34
            java.nio.file.attribute.FileAttribute[] r5 = (java.nio.file.attribute.FileAttribute[]) r5     // Catch: java.io.IOException -> L34
            java.nio.file.Path r3 = java.nio.file.Files.createDirectory(r3, r5)     // Catch: java.io.IOException -> L34
            r3.getClass()     // Catch: java.io.IOException -> L34
            return
        L34:
            r3 = move-exception
            if (r2 == 0) goto L38
            return
        L38:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = "failed to create directory: "
            java.lang.String r4 = defpackage.l90.h(r4, r0)
            r5.<init>(r4, r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t71.createDirectory(oe1, boolean):void");
    }

    @Override // defpackage.u71, defpackage.qo0, defpackage.n90
    public final void createSymlink(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        Files.createSymbolicLink(k(oe1Var), k(oe1Var2), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)).getClass();
    }

    @Override // defpackage.qo0, defpackage.n90
    public final void delete(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        if (!Thread.interrupted()) {
            Path k = k(oe1Var);
            try {
                Files.delete(k);
                return;
            } catch (NoSuchFileException unused) {
                if (!z) {
                    return;
                } else {
                    throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
                }
            } catch (IOException unused2) {
                if (Files.exists(k, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    se.w(l90.h(oe1Var, "failed to delete "));
                    return;
                }
                return;
            }
        }
        throw new InterruptedIOException("interrupted");
    }

    public final ArrayList i(oe1 oe1Var, boolean z) {
        Path k = k(oe1Var);
        try {
            DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(k, "*");
            try {
                newDirectoryStream.getClass();
                List<Path> A0 = wn.A0(newDirectoryStream);
                newDirectoryStream.close();
                ArrayList arrayList = new ArrayList();
                for (Path path : A0) {
                    String str = oe1.f;
                    arrayList.add(wc0.m(path));
                }
                ao.b0(arrayList);
                return arrayList;
            } finally {
            }
        } catch (Exception unused) {
            if (!z) {
                return null;
            }
            if (Files.exists(k, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                se.w(l90.h(oe1Var, "failed to list "));
                return null;
            }
            throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
        }
    }

    public final Path k(oe1 oe1Var) {
        Path path = this.e.getPath(oe1Var.e.r(), new String[0]);
        path.getClass();
        return path;
    }

    @Override // defpackage.qo0, defpackage.n90
    public final List list(oe1 oe1Var) {
        oe1Var.getClass();
        ArrayList i = i(oe1Var, true);
        i.getClass();
        return i;
    }

    @Override // defpackage.qo0, defpackage.n90
    public final List listOrNull(oe1 oe1Var) {
        oe1Var.getClass();
        return i(oe1Var, false);
    }

    @Override // defpackage.u71, defpackage.qo0, defpackage.n90
    public final j90 metadataOrNull(oe1 oe1Var) {
        oe1Var.getClass();
        return u71.c(k(oe1Var));
    }

    @Override // defpackage.qo0, defpackage.n90
    public final i90 openReadOnly(oe1 oe1Var) {
        oe1Var.getClass();
        try {
            FileChannel open = FileChannel.open(k(oe1Var), StandardOpenOption.READ);
            open.getClass();
            return new po0(false, open, 1);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
        }
    }

    @Override // defpackage.qo0, defpackage.n90
    public final i90 openReadWrite(oe1 oe1Var, boolean z, boolean z2) {
        oe1Var.getClass();
        if (z && z2) {
            se.h("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        vv0 v = xn.v();
        v.add(StandardOpenOption.READ);
        v.add(StandardOpenOption.WRITE);
        if (z) {
            v.add(StandardOpenOption.CREATE_NEW);
        } else if (!z2) {
            v.add(StandardOpenOption.CREATE);
        }
        vv0 s = xn.s(v);
        try {
            Path k = k(oe1Var);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) s.toArray(new StandardOpenOption[0]);
            FileChannel open = FileChannel.open(k, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            open.getClass();
            return new po0(true, open, 1);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
        }
    }

    @Override // defpackage.qo0, defpackage.n90
    public final ey1 sink(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        vv0 v = xn.v();
        if (z) {
            v.add(StandardOpenOption.CREATE_NEW);
        }
        vv0 s = xn.s(v);
        try {
            Path k = k(oe1Var);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) s.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream newOutputStream = Files.newOutputStream(k, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            newOutputStream.getClass();
            return new hf(1, newOutputStream, new Object());
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
        }
    }

    @Override // defpackage.qo0, defpackage.n90
    public final k12 source(oe1 oe1Var) {
        oe1Var.getClass();
        try {
            InputStream newInputStream = Files.newInputStream(k(oe1Var), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            newInputStream.getClass();
            return lo.W(newInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
        }
    }

    @Override // defpackage.u71, defpackage.qo0
    public final String toString() {
        String d = yl1.a(this.e.getClass()).d();
        d.getClass();
        return d;
    }
}
