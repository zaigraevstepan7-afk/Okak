package com.topjohnwu.superuser.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.LruCache;
import com.topjohnwu.superuser.internal.IFileSystemService;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class FileSystemService extends IFileSystemService.Stub {
    static final int PIPE_CAPACITY = 65536;
    private final LruCache<String, File> mCache = new LruCache<String, File>(100) { // from class: com.topjohnwu.superuser.internal.FileSystemService.1
        public AnonymousClass1(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public File create(String str) {
            return new File(str);
        }
    };
    private final FileContainer openFiles = new FileContainer();
    private final ExecutorService streamPool = Executors.newCachedThreadPool();

    public static /* synthetic */ void lambda$openReadStream$1(OpenFile openFile, ParcelFileDescriptor parcelFileDescriptor) {
        try {
            try {
                openFile.write = FileUtils.createFileDescriptor(parcelFileDescriptor.detachFd());
                do {
                } while (openFile.pread(PIPE_CAPACITY, -1L) > 0);
                openFile.close();
            } catch (ErrnoException | IOException unused) {
            }
        } catch (Throwable th) {
            if (openFile != null) {
                try {
                    openFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* synthetic */ void lambda$openWriteStream$2(OpenFile openFile, ParcelFileDescriptor parcelFileDescriptor) {
        try {
            try {
                openFile.read = FileUtils.createFileDescriptor(parcelFileDescriptor.detachFd());
                do {
                } while (openFile.pwrite(PIPE_CAPACITY, -1L, false) > 0);
                openFile.close();
            } catch (ErrnoException | IOException unused) {
            }
        } catch (Throwable th) {
            if (openFile != null) {
                try {
                    openFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public /* synthetic */ void lambda$register$0(int i) {
        this.openFiles.pidDied(i);
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean checkAccess(String str, int i) {
        try {
            return Os.access(str, i);
        } catch (ErrnoException unused) {
            return false;
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public void close(int i) {
        this.openFiles.remove(i);
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult createLink(String str, String str2, boolean z) {
        try {
            if (z) {
                Os.symlink(str2, str);
            } else {
                Os.link(str2, str);
            }
            return new IOResult(Boolean.TRUE);
        } catch (ErrnoException e) {
            if (e.errno == OsConstants.EEXIST) {
                return new IOResult(Boolean.FALSE);
            }
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult createNewFile(String str) {
        try {
            return new IOResult(Boolean.valueOf(this.mCache.get(str).createNewFile()));
        } catch (IOException e) {
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean delete(String str) {
        return this.mCache.get(str).delete();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult ftruncate(int i, long j) {
        try {
            this.openFiles.get(i).ftruncate(j);
            return new IOResult();
        } catch (ErrnoException | IOException e) {
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult getCanonicalPath(String str) {
        try {
            return new IOResult(this.mCache.get(str).getCanonicalPath());
        } catch (IOException e) {
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public long getFreeSpace(String str) {
        return this.mCache.get(str).getFreeSpace();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public int getMode(String str) {
        try {
            return Os.lstat(str).st_mode;
        } catch (ErrnoException unused) {
            return 0;
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public long getTotalSpace(String str) {
        return this.mCache.get(str).getTotalSpace();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public long getUsableSpace(String str) {
        return this.mCache.get(str).getUsableSpace();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean isDirectory(String str) {
        return this.mCache.get(str).isDirectory();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean isFile(String str) {
        return this.mCache.get(str).isFile();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean isHidden(String str) {
        return this.mCache.get(str).isHidden();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public long lastModified(String str) {
        return this.mCache.get(str).lastModified();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public long length(String str) {
        return this.mCache.get(str).length();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public String[] list(String str) {
        return this.mCache.get(str).list();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult lseek(int i, long j, int i2) {
        try {
            return new IOResult(Long.valueOf(this.openFiles.get(i).lseek(j, i2)));
        } catch (ErrnoException | IOException e) {
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean mkdir(String str) {
        return this.mCache.get(str).mkdir();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean mkdirs(String str) {
        return this.mCache.get(str).mkdirs();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult openChannel(String str, int i, String str2) {
        OpenFile openFile = new OpenFile();
        try {
            int i2 = OsConstants.O_NONBLOCK;
            openFile.fd = Os.open(str, i | i2, 438);
            openFile.read = Os.open(str2, OsConstants.O_RDONLY | i2, 0);
            openFile.write = Os.open(str2, OsConstants.O_WRONLY | i2, 0);
            return new IOResult(Integer.valueOf(this.openFiles.put(openFile)));
        } catch (ErrnoException e) {
            openFile.close();
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult openReadStream(String str, ParcelFileDescriptor parcelFileDescriptor) {
        OpenFile openFile = new OpenFile();
        try {
            openFile.fd = Os.open(str, OsConstants.O_RDONLY, 0);
            this.streamPool.execute(new b(openFile, parcelFileDescriptor, 1));
            return new IOResult();
        } catch (ErrnoException e) {
            openFile.close();
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult openWriteStream(String str, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        int i;
        OpenFile openFile = new OpenFile();
        try {
            int i2 = OsConstants.O_CREAT | OsConstants.O_WRONLY;
            if (z) {
                i = OsConstants.O_APPEND;
            } else {
                i = OsConstants.O_TRUNC;
            }
            openFile.fd = Os.open(str, i | i2, 438);
            this.streamPool.execute(new b(openFile, parcelFileDescriptor, 0));
            return new IOResult();
        } catch (ErrnoException e) {
            openFile.close();
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult pread(int i, int i2, long j) {
        try {
            return new IOResult(Integer.valueOf(this.openFiles.get(i).pread(i2, j)));
        } catch (ErrnoException | IOException e) {
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult pwrite(int i, int i2, long j) {
        try {
            this.openFiles.get(i).pwrite(i2, j, true);
            return new IOResult();
        } catch (ErrnoException | IOException e) {
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public void register(IBinder iBinder) {
        final int callingPid = Binder.getCallingPid();
        try {
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.topjohnwu.superuser.internal.c
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    FileSystemService.this.lambda$register$0(callingPid);
                }
            }, 0);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean renameTo(String str, String str2) {
        return this.mCache.get(str).renameTo(this.mCache.get(str2));
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean setExecutable(String str, boolean z, boolean z2) {
        return this.mCache.get(str).setExecutable(z, z2);
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean setLastModified(String str, long j) {
        return this.mCache.get(str).setLastModified(j);
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean setReadOnly(String str) {
        return this.mCache.get(str).setReadOnly();
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean setReadable(String str, boolean z, boolean z2) {
        return this.mCache.get(str).setReadable(z, z2);
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public boolean setWritable(String str, boolean z, boolean z2) {
        return this.mCache.get(str).setWritable(z, z2);
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult size(int i) {
        try {
            return new IOResult(Long.valueOf(this.openFiles.get(i).size()));
        } catch (ErrnoException | IOException e) {
            return new IOResult(e);
        }
    }

    @Override // com.topjohnwu.superuser.internal.IFileSystemService
    public IOResult sync(int i, boolean z) {
        try {
            this.openFiles.get(i).sync(z);
            return new IOResult();
        } catch (ErrnoException | IOException e) {
            return new IOResult(e);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* renamed from: com.topjohnwu.superuser.internal.FileSystemService$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends LruCache<String, File> {
        public AnonymousClass1(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public File create(String str) {
            return new File(str);
        }
    }
}
