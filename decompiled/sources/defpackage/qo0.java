package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class qo0 extends n90 {
    public static ArrayList b(oe1 oe1Var, boolean z) {
        File file = oe1Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z) {
                return null;
            }
            if (file.exists()) {
                se.w(l90.h(oe1Var, "failed to list "));
                return null;
            }
            throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(oe1Var.f(str));
        }
        ao.b0(arrayList);
        return arrayList;
    }

    @Override // defpackage.n90
    public ey1 appendingSink(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        if (z && !exists(oe1Var)) {
            se.f(oe1Var, " doesn't exist.");
            return null;
        }
        return new hf(1, new FileOutputStream(oe1Var.toFile(), true), new Object());
    }

    @Override // defpackage.n90
    public void atomicMove(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        if (oe1Var.toFile().renameTo(oe1Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + oe1Var + " to " + oe1Var2);
    }

    @Override // defpackage.n90
    public oe1 canonicalize(oe1 oe1Var) {
        oe1Var.getClass();
        File canonicalFile = oe1Var.toFile().getCanonicalFile();
        if (canonicalFile.exists()) {
            String str = oe1.f;
            return wc0.l(canonicalFile);
        }
        throw new FileNotFoundException("no such file");
    }

    @Override // defpackage.n90
    public void createDirectory(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        if (!oe1Var.toFile().mkdir()) {
            j90 metadataOrNull = metadataOrNull(oe1Var);
            if (metadataOrNull != null && metadataOrNull.b) {
                if (z) {
                    se.f(oe1Var, " already exists.");
                    return;
                }
                return;
            }
            se.w(l90.h(oe1Var, "failed to create directory: "));
        }
    }

    @Override // defpackage.n90
    public void createSymlink(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        throw new IOException("unsupported");
    }

    @Override // defpackage.n90
    public void delete(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        if (!Thread.interrupted()) {
            File file = oe1Var.toFile();
            if (!file.delete()) {
                if (!file.exists()) {
                    if (z) {
                        throw new FileNotFoundException(l90.h(oe1Var, "no such file: "));
                    }
                    return;
                } else {
                    se.w(l90.h(oe1Var, "failed to delete "));
                    return;
                }
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // defpackage.n90
    public List list(oe1 oe1Var) {
        oe1Var.getClass();
        ArrayList b = b(oe1Var, true);
        b.getClass();
        return b;
    }

    @Override // defpackage.n90
    public List listOrNull(oe1 oe1Var) {
        oe1Var.getClass();
        return b(oe1Var, false);
    }

    @Override // defpackage.n90
    public j90 metadataOrNull(oe1 oe1Var) {
        oe1Var.getClass();
        File file = oe1Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new j90(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // defpackage.n90
    public i90 openReadOnly(oe1 oe1Var) {
        oe1Var.getClass();
        return new po0(false, new RandomAccessFile(oe1Var.toFile(), "r"), 0);
    }

    @Override // defpackage.n90
    public i90 openReadWrite(oe1 oe1Var, boolean z, boolean z2) {
        oe1Var.getClass();
        if (z && z2) {
            se.h("Cannot require mustCreate and mustExist at the same time.");
            return null;
        }
        if (z && exists(oe1Var)) {
            se.f(oe1Var, " already exists.");
            return null;
        }
        if (z2 && !exists(oe1Var)) {
            se.f(oe1Var, " doesn't exist.");
            return null;
        }
        return new po0(true, new RandomAccessFile(oe1Var.toFile(), "rw"), 0);
    }

    @Override // defpackage.n90
    public ey1 sink(oe1 oe1Var, boolean z) {
        oe1Var.getClass();
        if (z && exists(oe1Var)) {
            se.f(oe1Var, " already exists.");
            return null;
        }
        return new hf(1, new FileOutputStream(oe1Var.toFile(), false), new Object());
    }

    @Override // defpackage.n90
    public k12 source(oe1 oe1Var) {
        oe1Var.getClass();
        return new jf(new FileInputStream(oe1Var.toFile()), ea2.NONE);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
