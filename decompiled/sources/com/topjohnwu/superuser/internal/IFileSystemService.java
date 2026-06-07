package com.topjohnwu.superuser.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface IFileSystemService extends IInterface {
    public static final String DESCRIPTOR = "com.topjohnwu.superuser.internal.IFileSystemService";

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    boolean checkAccess(String str, int i);

    void close(int i);

    IOResult createLink(String str, String str2, boolean z);

    IOResult createNewFile(String str);

    boolean delete(String str);

    IOResult ftruncate(int i, long j);

    IOResult getCanonicalPath(String str);

    long getFreeSpace(String str);

    int getMode(String str);

    long getTotalSpace(String str);

    long getUsableSpace(String str);

    boolean isDirectory(String str);

    boolean isFile(String str);

    boolean isHidden(String str);

    long lastModified(String str);

    long length(String str);

    String[] list(String str);

    IOResult lseek(int i, long j, int i2);

    boolean mkdir(String str);

    boolean mkdirs(String str);

    IOResult openChannel(String str, int i, String str2);

    IOResult openReadStream(String str, ParcelFileDescriptor parcelFileDescriptor);

    IOResult openWriteStream(String str, ParcelFileDescriptor parcelFileDescriptor, boolean z);

    IOResult pread(int i, int i2, long j);

    IOResult pwrite(int i, int i2, long j);

    void register(IBinder iBinder);

    boolean renameTo(String str, String str2);

    boolean setExecutable(String str, boolean z, boolean z2);

    boolean setLastModified(String str, long j);

    boolean setReadOnly(String str);

    boolean setReadable(String str, boolean z, boolean z2);

    boolean setWritable(String str, boolean z, boolean z2);

    IOResult size(int i);

    IOResult sync(int i, boolean z);

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IFileSystemService {
        static final int TRANSACTION_checkAccess = 18;
        static final int TRANSACTION_close = 28;
        static final int TRANSACTION_createLink = 23;
        static final int TRANSACTION_createNewFile = 7;
        static final int TRANSACTION_delete = 8;
        static final int TRANSACTION_ftruncate = 33;
        static final int TRANSACTION_getCanonicalPath = 1;
        static final int TRANSACTION_getFreeSpace = 20;
        static final int TRANSACTION_getMode = 22;
        static final int TRANSACTION_getTotalSpace = 19;
        static final int TRANSACTION_getUsableSpace = 21;
        static final int TRANSACTION_isDirectory = 2;
        static final int TRANSACTION_isFile = 3;
        static final int TRANSACTION_isHidden = 4;
        static final int TRANSACTION_lastModified = 5;
        static final int TRANSACTION_length = 6;
        static final int TRANSACTION_list = 9;
        static final int TRANSACTION_lseek = 31;
        static final int TRANSACTION_mkdir = 10;
        static final int TRANSACTION_mkdirs = 11;
        static final int TRANSACTION_openChannel = 25;
        static final int TRANSACTION_openReadStream = 26;
        static final int TRANSACTION_openWriteStream = 27;
        static final int TRANSACTION_pread = 29;
        static final int TRANSACTION_pwrite = 30;
        static final int TRANSACTION_register = 24;
        static final int TRANSACTION_renameTo = 12;
        static final int TRANSACTION_setExecutable = 17;
        static final int TRANSACTION_setLastModified = 13;
        static final int TRANSACTION_setReadOnly = 14;
        static final int TRANSACTION_setReadable = 16;
        static final int TRANSACTION_setWritable = 15;
        static final int TRANSACTION_size = 32;
        static final int TRANSACTION_sync = 34;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static class Proxy implements IFileSystemService {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean checkAccess(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    boolean z = false;
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public void close(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_close, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult createLink(String str, String str2, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult createNewFile(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean delete(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult ftruncate(int i, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    this.mRemote.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult getCanonicalPath(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public long getFreeSpace(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IFileSystemService.DESCRIPTOR;
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public int getMode(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public long getTotalSpace(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public long getUsableSpace(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean isDirectory(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean isFile(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean isHidden(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public long lastModified(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public long length(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public String[] list(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult lseek(int i, long j, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeInt(i2);
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean mkdir(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean mkdirs(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult openChannel(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.mRemote.transact(Stub.TRANSACTION_openChannel, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult openReadStream(String str, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, parcelFileDescriptor, 0);
                    this.mRemote.transact(Stub.TRANSACTION_openReadStream, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult openWriteStream(String str, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, parcelFileDescriptor, 0);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult pread(int i, int i2, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    this.mRemote.transact(Stub.TRANSACTION_pread, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult pwrite(int i, int i2, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    this.mRemote.transact(Stub.TRANSACTION_pwrite, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public void register(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(Stub.TRANSACTION_register, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean renameTo(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    boolean z = false;
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean setExecutable(String str, boolean z, boolean z2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    boolean z3 = false;
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z3 = true;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean setLastModified(String str, long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeLong(j);
                    boolean z = false;
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean setReadOnly(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    boolean z = false;
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean setReadable(String str, boolean z, boolean z2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    boolean z3 = false;
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z3 = true;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public boolean setWritable(String str, boolean z, boolean z2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    boolean z3 = false;
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z3 = true;
                    }
                    return z3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult size(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IFileSystemService
            public IOResult sync(int i, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IFileSystemService.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                    return (IOResult) _Parcel.readTypedObject(obtain2, IOResult.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IFileSystemService.DESCRIPTOR);
        }

        public static IFileSystemService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IFileSystemService.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IFileSystemService)) {
                return (IFileSystemService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IFileSystemService.DESCRIPTOR);
            }
            if (i != 1598968902) {
                boolean z4 = false;
                switch (i) {
                    case 1:
                        IOResult canonicalPath = getCanonicalPath(parcel.readString());
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, canonicalPath, 1);
                        return true;
                    case 2:
                        boolean isDirectory = isDirectory(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isDirectory ? 1 : 0);
                        return true;
                    case 3:
                        boolean isFile = isFile(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isFile ? 1 : 0);
                        return true;
                    case 4:
                        boolean isHidden = isHidden(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(isHidden ? 1 : 0);
                        return true;
                    case 5:
                        long lastModified = lastModified(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeLong(lastModified);
                        return true;
                    case 6:
                        long length = length(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeLong(length);
                        return true;
                    case 7:
                        IOResult createNewFile = createNewFile(parcel.readString());
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, createNewFile, 1);
                        return true;
                    case 8:
                        boolean delete = delete(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(delete ? 1 : 0);
                        return true;
                    case 9:
                        String[] list = list(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeStringArray(list);
                        return true;
                    case 10:
                        boolean mkdir = mkdir(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(mkdir ? 1 : 0);
                        return true;
                    case 11:
                        boolean mkdirs = mkdirs(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(mkdirs ? 1 : 0);
                        return true;
                    case 12:
                        boolean renameTo = renameTo(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(renameTo ? 1 : 0);
                        return true;
                    case 13:
                        boolean lastModified2 = setLastModified(parcel.readString(), parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeInt(lastModified2 ? 1 : 0);
                        return true;
                    case 14:
                        boolean readOnly = setReadOnly(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(readOnly ? 1 : 0);
                        return true;
                    case 15:
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        boolean writable = setWritable(readString, z, z4);
                        parcel2.writeNoException();
                        parcel2.writeInt(writable ? 1 : 0);
                        return true;
                    case 16:
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        boolean readable = setReadable(readString2, z2, z4);
                        parcel2.writeNoException();
                        parcel2.writeInt(readable ? 1 : 0);
                        return true;
                    case 17:
                        String readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        boolean executable = setExecutable(readString3, z3, z4);
                        parcel2.writeNoException();
                        parcel2.writeInt(executable ? 1 : 0);
                        return true;
                    case 18:
                        boolean checkAccess = checkAccess(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(checkAccess ? 1 : 0);
                        return true;
                    case 19:
                        long totalSpace = getTotalSpace(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeLong(totalSpace);
                        return true;
                    case 20:
                        long freeSpace = getFreeSpace(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeLong(freeSpace);
                        return true;
                    case 21:
                        long usableSpace = getUsableSpace(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeLong(usableSpace);
                        return true;
                    case 22:
                        int mode = getMode(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(mode);
                        return true;
                    case 23:
                        String readString4 = parcel.readString();
                        String readString5 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        IOResult createLink = createLink(readString4, readString5, z4);
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, createLink, 1);
                        return true;
                    case TRANSACTION_register /* 24 */:
                        register(parcel.readStrongBinder());
                        return true;
                    case TRANSACTION_openChannel /* 25 */:
                        IOResult openChannel = openChannel(parcel.readString(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, openChannel, 1);
                        return true;
                    case TRANSACTION_openReadStream /* 26 */:
                        IOResult openReadStream = openReadStream(parcel.readString(), (ParcelFileDescriptor) _Parcel.readTypedObject(parcel, ParcelFileDescriptor.CREATOR));
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, openReadStream, 1);
                        return true;
                    case 27:
                        String readString6 = parcel.readString();
                        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) _Parcel.readTypedObject(parcel, ParcelFileDescriptor.CREATOR);
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        IOResult openWriteStream = openWriteStream(readString6, parcelFileDescriptor, z4);
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, openWriteStream, 1);
                        return true;
                    case TRANSACTION_close /* 28 */:
                        close(parcel.readInt());
                        return true;
                    case TRANSACTION_pread /* 29 */:
                        IOResult pread = pread(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, pread, 1);
                        return true;
                    case TRANSACTION_pwrite /* 30 */:
                        IOResult pwrite = pwrite(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, pwrite, 1);
                        return true;
                    case 31:
                        IOResult lseek = lseek(parcel.readInt(), parcel.readLong(), parcel.readInt());
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, lseek, 1);
                        return true;
                    case 32:
                        IOResult size = size(parcel.readInt());
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, size, 1);
                        return true;
                    case 33:
                        IOResult ftruncate = ftruncate(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, ftruncate, 1);
                        return true;
                    case 34:
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        }
                        IOResult sync = sync(readInt, z4);
                        parcel2.writeNoException();
                        _Parcel.writeTypedObject(parcel2, sync, 1);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(IFileSystemService.DESCRIPTOR);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Default implements IFileSystemService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean checkAccess(String str, int i) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult createLink(String str, String str2, boolean z) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult createNewFile(String str) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean delete(String str) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult ftruncate(int i, long j) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult getCanonicalPath(String str) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public long getFreeSpace(String str) {
            return 0L;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public int getMode(String str) {
            return 0;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public long getTotalSpace(String str) {
            return 0L;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public long getUsableSpace(String str) {
            return 0L;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean isDirectory(String str) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean isFile(String str) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean isHidden(String str) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public long lastModified(String str) {
            return 0L;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public long length(String str) {
            return 0L;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public String[] list(String str) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult lseek(int i, long j, int i2) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean mkdir(String str) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean mkdirs(String str) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult openChannel(String str, int i, String str2) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult openReadStream(String str, ParcelFileDescriptor parcelFileDescriptor) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult openWriteStream(String str, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult pread(int i, int i2, long j) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult pwrite(int i, int i2, long j) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean renameTo(String str, String str2) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean setExecutable(String str, boolean z, boolean z2) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean setLastModified(String str, long j) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean setReadOnly(String str) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean setReadable(String str, boolean z, boolean z2) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public boolean setWritable(String str, boolean z, boolean z2) {
            return false;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult size(int i) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public IOResult sync(int i, boolean z) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public void close(int i) {
        }

        @Override // com.topjohnwu.superuser.internal.IFileSystemService
        public void register(IBinder iBinder) {
        }
    }
}
