package com.topjohnwu.superuser.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class IOResult implements Parcelable {
    private static final String REMOTE_ERR_MSG = "Exception thrown on remote process";
    private final Object val;
    private static final ClassLoader cl = IOResult.class.getClassLoader();
    static final Parcelable.Creator<IOResult> CREATOR = new Parcelable.Creator<IOResult>() { // from class: com.topjohnwu.superuser.internal.IOResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IOResult createFromParcel(Parcel parcel) {
            return new IOResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public IOResult[] newArray(int i) {
            return new IOResult[i];
        }
    };

    private IOResult(Parcel parcel) {
        this.val = parcel.readValue(cl);
    }

    public void checkException() {
        Object obj = this.val;
        if (!(obj instanceof Throwable)) {
        } else {
            throw new IOException(REMOTE_ERR_MSG, (Throwable) obj);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public <T> T tryAndGet() {
        checkException();
        return (T) this.val;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.val);
    }

    public IOResult() {
        this.val = null;
    }

    public IOResult(Object obj) {
        this.val = obj;
    }
}
