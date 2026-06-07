package com.topjohnwu.superuser.internal;

import com.topjohnwu.superuser.nio.ExtendedFile;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
abstract class FileImpl<T extends ExtendedFile> extends ExtendedFile {
    public FileImpl(String str) {
        super(str);
    }

    public abstract T create(String str);

    public abstract T[] createArray(int i);

    @Override // com.topjohnwu.superuser.nio.ExtendedFile, java.io.File
    public T getAbsoluteFile() {
        return create(getAbsolutePath());
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile, java.io.File
    public T getCanonicalFile() {
        return create(getCanonicalPath());
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile
    public abstract T getChildFile(String str);

    @Override // com.topjohnwu.superuser.nio.ExtendedFile, java.io.File
    public T getParentFile() {
        return create(getParent());
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile, java.io.File
    public T[] listFiles(FilenameFilter filenameFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (filenameFilter == null || filenameFilter.accept(this, str)) {
                arrayList.add(getChildFile(str));
            }
        }
        return (T[]) ((ExtendedFile[]) arrayList.toArray(createArray(0)));
    }

    public FileImpl(String str, String str2) {
        super(str, str2);
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile, java.io.File
    public T[] listFiles() {
        String[] list = list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        T[] createArray = createArray(length);
        for (int i = 0; i < length; i++) {
            createArray[i] = getChildFile(list[i]);
        }
        return createArray;
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile, java.io.File
    public T[] listFiles(FileFilter fileFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            T childFile = getChildFile(str);
            if (fileFilter == null || fileFilter.accept(childFile)) {
                arrayList.add(childFile);
            }
        }
        return (T[]) ((ExtendedFile[]) arrayList.toArray(createArray(0)));
    }
}
