package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gn0 implements Parcelable {
    public static final Parcelable.Creator<gn0> CREATOR = new c2(2);
    public final IntentSender e;
    public final Intent f;
    public final int g;
    public final int h;

    public gn0(Parcel parcel) {
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        readParcelable.getClass();
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.e = (IntentSender) readParcelable;
        this.f = intent;
        this.g = readInt;
        this.h = readInt2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
    }
}
