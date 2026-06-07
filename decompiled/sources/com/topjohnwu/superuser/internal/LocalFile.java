package com.topjohnwu.superuser.internal;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
class LocalFile extends FileImpl<LocalFile> {
    public LocalFile(String str) {
        super(str);
    }

    private boolean createLink(String str, boolean z) {
        try {
            if (z) {
                Os.symlink(str, getPath());
                return true;
            }
            Os.link(str, getPath());
            return true;
        } catch (ErrnoException e) {
            if (e.errno == OsConstants.EEXIST) {
                return false;
            }
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.topjohnwu.superuser.internal.FileImpl
    public LocalFile create(String str) {
        return new LocalFile(str);
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile
    public boolean createNewLink(String str) {
        return createLink(str, false);
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile
    public boolean createNewSymlink(String str) {
        return createLink(str, true);
    }

    @Override // com.topjohnwu.superuser.internal.FileImpl, com.topjohnwu.superuser.nio.ExtendedFile
    public LocalFile getChildFile(String str) {
        return new LocalFile(getPath(), str);
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile
    public boolean isBlock() {
        try {
            return OsConstants.S_ISBLK(Os.lstat(getPath()).st_mode);
        } catch (ErrnoException unused) {
            return false;
        }
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile
    public boolean isCharacter() {
        try {
            return OsConstants.S_ISCHR(Os.lstat(getPath()).st_mode);
        } catch (ErrnoException unused) {
            return false;
        }
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile
    public boolean isNamedPipe() {
        try {
            return OsConstants.S_ISFIFO(Os.lstat(getPath()).st_mode);
        } catch (ErrnoException unused) {
            return false;
        }
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile
    public boolean isSocket() {
        try {
            return OsConstants.S_ISSOCK(Os.lstat(getPath()).st_mode);
        } catch (ErrnoException unused) {
            return false;
        }
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile
    public boolean isSymlink() {
        try {
            return OsConstants.S_ISLNK(Os.lstat(getPath()).st_mode);
        } catch (ErrnoException unused) {
            return false;
        }
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile
    public InputStream newInputStream() {
        return new FileInputStream(this);
    }

    @Override // com.topjohnwu.superuser.nio.ExtendedFile
    public OutputStream newOutputStream(boolean z) {
        return new FileOutputStream(this, z);
    }

    public LocalFile(String str, String str2) {
        super(str, str2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.topjohnwu.superuser.internal.FileImpl
    public LocalFile[] createArray(int i) {
        return new LocalFile[i];
    }
}
