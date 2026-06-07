package com.topjohnwu.superuser.internal;

import android.system.ErrnoException;
import android.system.Int64Ref;
import android.system.Os;
import android.system.OsConstants;
import android.util.ArraySet;
import android.util.MutableLong;
import com.topjohnwu.superuser.nio.FileSystemManager;
import defpackage.l90;
import defpackage.se;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class FileUtils {
    private static Object os;
    private static Method sendfile;
    private static AccessibleObject setFd;
    private static Method splice;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Flag {
        boolean append;
        boolean create;
        boolean read;
        boolean truncate;
        boolean write;
    }

    public static FileDescriptor createFileDescriptor(int i) {
        Class cls = Integer.TYPE;
        if (setFd == null) {
            try {
                try {
                    setFd = FileDescriptor.class.getDeclaredConstructor(cls);
                } catch (NoSuchMethodException unused) {
                }
            } catch (NoSuchMethodException unused2) {
                setFd = FileDescriptor.class.getDeclaredMethod("setInt$", cls);
            }
            setFd.setAccessible(true);
        }
        try {
            AccessibleObject accessibleObject = setFd;
            if (accessibleObject instanceof Constructor) {
                return (FileDescriptor) ((Constructor) accessibleObject).newInstance(Integer.valueOf(i));
            }
            FileDescriptor fileDescriptor = new FileDescriptor();
            ((Method) setFd).invoke(fileDescriptor, Integer.valueOf(i));
            return fileDescriptor;
        } catch (ReflectiveOperationException unused3) {
            return null;
        }
    }

    public static File createTempFIFO() {
        File createTempFile = File.createTempFile("libsu-fifo-", null);
        createTempFile.delete();
        Os.mkfifo(createTempFile.getPath(), 420);
        return createTempFile;
    }

    public static Flag modeToFlag(int i) {
        Flag flag = new Flag();
        if ((i & FileSystemManager.MODE_READ_WRITE) == 805306368) {
            flag.read = true;
            flag.write = true;
        } else if ((i & FileSystemManager.MODE_WRITE_ONLY) == 536870912) {
            flag.write = true;
        } else if ((i & FileSystemManager.MODE_READ_ONLY) == 268435456) {
            flag.read = true;
        } else {
            se.h(l90.g(i, "Bad mode: "));
            return null;
        }
        if ((i & FileSystemManager.MODE_CREATE) == 134217728) {
            flag.create = true;
        }
        if ((i & FileSystemManager.MODE_TRUNCATE) == 67108864) {
            flag.truncate = true;
        }
        if ((i & FileSystemManager.MODE_APPEND) == 33554432) {
            flag.append = true;
        }
        boolean z = flag.append;
        if (z && flag.read) {
            se.h("READ + APPEND not allowed");
            return null;
        }
        if (z && flag.truncate) {
            se.h("APPEND + TRUNCATE not allowed");
            return null;
        }
        return flag;
    }

    public static Set<OpenOption> modeToOptions(int i) {
        ArraySet arraySet = new ArraySet();
        if ((i & FileSystemManager.MODE_READ_WRITE) == 805306368) {
            arraySet.add(StandardOpenOption.READ);
            arraySet.add(StandardOpenOption.WRITE);
        } else if ((i & FileSystemManager.MODE_WRITE_ONLY) == 536870912) {
            arraySet.add(StandardOpenOption.WRITE);
        } else if ((i & FileSystemManager.MODE_READ_ONLY) == 268435456) {
            arraySet.add(StandardOpenOption.READ);
        } else {
            se.h(l90.g(i, "Bad mode: "));
            return null;
        }
        if ((i & FileSystemManager.MODE_CREATE) == 134217728) {
            arraySet.add(StandardOpenOption.CREATE);
        }
        if ((i & FileSystemManager.MODE_TRUNCATE) == 67108864) {
            arraySet.add(StandardOpenOption.TRUNCATE_EXISTING);
        }
        if ((i & FileSystemManager.MODE_APPEND) == 33554432) {
            arraySet.add(StandardOpenOption.APPEND);
        }
        return arraySet;
    }

    public static int modeToPosix(int i) {
        int i2;
        if ((i & FileSystemManager.MODE_READ_WRITE) == 805306368) {
            i2 = OsConstants.O_RDWR;
        } else if ((i & FileSystemManager.MODE_WRITE_ONLY) == 536870912) {
            i2 = OsConstants.O_WRONLY;
        } else if ((i & FileSystemManager.MODE_READ_ONLY) == 268435456) {
            i2 = OsConstants.O_RDONLY;
        } else {
            se.h(l90.g(i, "Bad mode: "));
            return 0;
        }
        if ((i & FileSystemManager.MODE_CREATE) == 134217728) {
            i2 |= OsConstants.O_CREAT;
        }
        if ((i & FileSystemManager.MODE_TRUNCATE) == 67108864) {
            i2 |= OsConstants.O_TRUNC;
        }
        if ((i & FileSystemManager.MODE_APPEND) == 33554432) {
            return OsConstants.O_APPEND | i2;
        }
        return i2;
    }

    public static long sendfile(FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, MutableLong mutableLong, long j) {
        Int64Ref int64Ref;
        if (mutableLong == null) {
            int64Ref = null;
        } else {
            int64Ref = new Int64Ref(mutableLong.value);
        }
        long sendfile2 = Os.sendfile(fileDescriptor, fileDescriptor2, int64Ref, j);
        if (int64Ref != null) {
            mutableLong.value = int64Ref.value;
        }
        return sendfile2;
    }

    public static long splice(FileDescriptor fileDescriptor, Int64Ref int64Ref, FileDescriptor fileDescriptor2, Int64Ref int64Ref2, long j, int i) {
        try {
            if (splice == null) {
                splice = Os.class.getMethod("splice", FileDescriptor.class, Int64Ref.class, FileDescriptor.class, Int64Ref.class, Long.TYPE, Integer.TYPE);
            }
            return ((Long) splice.invoke(null, fileDescriptor, int64Ref, fileDescriptor2, int64Ref2, Long.valueOf(j), Integer.valueOf(i))).longValue();
        } catch (InvocationTargetException e) {
            throw ((ErrnoException) e.getTargetException());
        } catch (ReflectiveOperationException unused) {
            throw new ErrnoException("splice", OsConstants.ENOSYS);
        }
    }
}
