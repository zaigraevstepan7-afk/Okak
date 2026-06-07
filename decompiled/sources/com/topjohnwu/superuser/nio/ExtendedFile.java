package com.topjohnwu.superuser.nio;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ExtendedFile extends File {
    public ExtendedFile(String str) {
        super(str);
    }

    public abstract boolean createNewLink(String str);

    public abstract boolean createNewSymlink(String str);

    @Override // java.io.File
    public abstract ExtendedFile getAbsoluteFile();

    @Override // java.io.File
    public abstract ExtendedFile getCanonicalFile();

    public abstract ExtendedFile getChildFile(String str);

    @Override // java.io.File
    public abstract ExtendedFile getParentFile();

    public abstract boolean isBlock();

    public abstract boolean isCharacter();

    public abstract boolean isNamedPipe();

    public abstract boolean isSocket();

    public abstract boolean isSymlink();

    @Override // java.io.File
    public abstract ExtendedFile[] listFiles();

    @Override // java.io.File
    public abstract ExtendedFile[] listFiles(FileFilter fileFilter);

    @Override // java.io.File
    public abstract ExtendedFile[] listFiles(FilenameFilter filenameFilter);

    public abstract InputStream newInputStream();

    public final OutputStream newOutputStream() {
        return newOutputStream(false);
    }

    public abstract OutputStream newOutputStream(boolean z);

    public ExtendedFile(String str, String str2) {
        super(str, str2);
    }

    public ExtendedFile(File file, String str) {
        super(file, str);
    }

    public ExtendedFile(URI uri) {
        super(uri);
    }
}
