package com.topjohnwu.superuser.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface IRootServiceManager extends IInterface {
    public static final String DESCRIPTOR = "com.topjohnwu.superuser.internal.IRootServiceManager";

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

    IBinder bind(Intent intent);

    void broadcast(int i);

    void connect(IBinder iBinder);

    void stop(ComponentName componentName, int i);

    void unbind(ComponentName componentName);

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IRootServiceManager {
        static final int TRANSACTION_bind = 4;
        static final int TRANSACTION_broadcast = 1;
        static final int TRANSACTION_connect = 3;
        static final int TRANSACTION_stop = 2;
        static final int TRANSACTION_unbind = 5;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static class Proxy implements IRootServiceManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.topjohnwu.superuser.internal.IRootServiceManager
            public IBinder bind(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRootServiceManager.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, intent, 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IRootServiceManager
            public void broadcast(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRootServiceManager.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IRootServiceManager
            public void connect(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRootServiceManager.DESCRIPTOR);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IRootServiceManager.DESCRIPTOR;
            }

            @Override // com.topjohnwu.superuser.internal.IRootServiceManager
            public void stop(ComponentName componentName, int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRootServiceManager.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, componentName, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.topjohnwu.superuser.internal.IRootServiceManager
            public void unbind(ComponentName componentName) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IRootServiceManager.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, componentName, 0);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IRootServiceManager.DESCRIPTOR);
        }

        public static IRootServiceManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IRootServiceManager.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IRootServiceManager)) {
                return (IRootServiceManager) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IRootServiceManager.DESCRIPTOR);
            }
            if (i != 1598968902) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return super.onTransact(i, parcel, parcel2, i2);
                                }
                                unbind((ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR));
                            } else {
                                IBinder bind = bind((Intent) _Parcel.readTypedObject(parcel, Intent.CREATOR));
                                parcel2.writeNoException();
                                parcel2.writeStrongBinder(bind);
                            }
                        } else {
                            connect(parcel.readStrongBinder());
                            parcel2.writeNoException();
                        }
                    } else {
                        stop((ComponentName) _Parcel.readTypedObject(parcel, ComponentName.CREATOR), parcel.readInt());
                    }
                } else {
                    broadcast(parcel.readInt());
                }
                return true;
            }
            parcel2.writeString(IRootServiceManager.DESCRIPTOR);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class Default implements IRootServiceManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IRootServiceManager
        public IBinder bind(Intent intent) {
            return null;
        }

        @Override // com.topjohnwu.superuser.internal.IRootServiceManager
        public void broadcast(int i) {
        }

        @Override // com.topjohnwu.superuser.internal.IRootServiceManager
        public void connect(IBinder iBinder) {
        }

        @Override // com.topjohnwu.superuser.internal.IRootServiceManager
        public void unbind(ComponentName componentName) {
        }

        @Override // com.topjohnwu.superuser.internal.IRootServiceManager
        public void stop(ComponentName componentName, int i) {
        }
    }
}
