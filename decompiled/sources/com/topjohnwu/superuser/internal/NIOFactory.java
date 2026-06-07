package com.topjohnwu.superuser.internal;

import android.os.Binder;
import android.os.IBinder;
import com.topjohnwu.superuser.internal.IFileSystemService;
import com.topjohnwu.superuser.nio.ExtendedFile;
import com.topjohnwu.superuser.nio.FileSystemManager;
import defpackage.se;
import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.file.attribute.FileAttribute;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class NIOFactory {
    private NIOFactory() {
    }

    public static FileSystemService createFsService() {
        return new FileSystemService();
    }

    public static FileSystemManager createLocal() {
        return new FileSystemManager() { // from class: com.topjohnwu.superuser.internal.NIOFactory.1
            @Override // com.topjohnwu.superuser.nio.FileSystemManager
            public ExtendedFile getFile(String str) {
                return new LocalFile(str);
            }

            @Override // com.topjohnwu.superuser.nio.FileSystemManager
            public FileChannel openChannel(File file, int i) {
                return FileChannel.open(file.toPath(), FileUtils.modeToOptions(i), new FileAttribute[0]);
            }

            @Override // com.topjohnwu.superuser.nio.FileSystemManager
            public ExtendedFile getFile(String str, String str2) {
                return new LocalFile(str, str2);
            }
        };
    }

    public static FileSystemManager createRemote(IBinder iBinder) {
        final IFileSystemService asInterface = IFileSystemService.Stub.asInterface(iBinder);
        if (asInterface != null) {
            asInterface.register(new Binder());
            return new FileSystemManager() { // from class: com.topjohnwu.superuser.internal.NIOFactory.2
                @Override // com.topjohnwu.superuser.nio.FileSystemManager
                public ExtendedFile getFile(String str) {
                    return new RemoteFile(IFileSystemService.this, str);
                }

                @Override // com.topjohnwu.superuser.nio.FileSystemManager
                public FileChannel openChannel(File file, int i) {
                    return new RemoteFileChannel(IFileSystemService.this, file, i);
                }

                @Override // com.topjohnwu.superuser.nio.FileSystemManager
                public ExtendedFile getFile(String str, String str2) {
                    return new RemoteFile(IFileSystemService.this, str, str2);
                }
            };
        }
        se.h("The IBinder provided is invalid");
        return null;
    }
}
