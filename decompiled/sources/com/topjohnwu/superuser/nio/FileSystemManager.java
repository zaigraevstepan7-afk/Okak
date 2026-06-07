package com.topjohnwu.superuser.nio;

import android.os.Binder;
import android.os.IBinder;
import com.topjohnwu.superuser.internal.NIOFactory;
import java.io.File;
import java.net.URI;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class FileSystemManager {
    private static final FileSystemManager LOCAL = NIOFactory.createLocal();
    public static final int MODE_APPEND = 33554432;
    public static final int MODE_CREATE = 134217728;
    public static final int MODE_READ_ONLY = 268435456;
    public static final int MODE_READ_WRITE = 805306368;
    public static final int MODE_TRUNCATE = 67108864;
    public static final int MODE_WRITE_ONLY = 536870912;
    private static Binder fsService;

    public static FileSystemManager getLocal() {
        return LOCAL;
    }

    public static FileSystemManager getRemote(IBinder iBinder) {
        return NIOFactory.createRemote(iBinder);
    }

    public static synchronized Binder getService() {
        Binder binder;
        synchronized (FileSystemManager.class) {
            try {
                if (fsService == null) {
                    fsService = NIOFactory.createFsService();
                }
                binder = fsService;
            } catch (Throwable th) {
                throw th;
            }
        }
        return binder;
    }

    public abstract ExtendedFile getFile(String str);

    public abstract ExtendedFile getFile(String str, String str2);

    public final ExtendedFile getFile(URI uri) {
        return getFile(new File(uri).getPath());
    }

    public abstract FileChannel openChannel(File file, int i);

    public final FileChannel openChannel(String str, int i) {
        return openChannel(new File(str), i);
    }

    public final ExtendedFile getFile(File file, String str) {
        return getFile(file == null ? null : file.getPath(), str);
    }
}
