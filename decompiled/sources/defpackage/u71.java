package defpackage;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class u71 extends qo0 {
    public static j90 c(Path path) {
        Path path2;
        oe1 oe1Var;
        Long l;
        Long l2;
        Long l3 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            if (readAttributes.isSymbolicLink()) {
                path2 = Files.readSymbolicLink(path);
            } else {
                path2 = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path2 != null) {
                String str = oe1.f;
                oe1Var = wc0.m(path2);
            } else {
                oe1Var = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l = g(creationTime);
            } else {
                l = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l2 = g(lastModifiedTime);
            } else {
                l2 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l3 = g(lastAccessTime);
            }
            return new j90(isRegularFile, isDirectory, oe1Var, valueOf, l, l2, l3);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    public static Long g(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // defpackage.qo0, defpackage.n90
    public void atomicMove(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        try {
            Files.move(oe1Var.g(), oe1Var2.g(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            se.w("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.qo0, defpackage.n90
    public void createSymlink(oe1 oe1Var, oe1 oe1Var2) {
        oe1Var.getClass();
        oe1Var2.getClass();
        Files.createSymbolicLink(oe1Var.g(), oe1Var2.g(), new FileAttribute[0]);
    }

    @Override // defpackage.qo0, defpackage.n90
    public j90 metadataOrNull(oe1 oe1Var) {
        oe1Var.getClass();
        return c(oe1Var.g());
    }

    @Override // defpackage.qo0
    public String toString() {
        return "NioSystemFileSystem";
    }
}
