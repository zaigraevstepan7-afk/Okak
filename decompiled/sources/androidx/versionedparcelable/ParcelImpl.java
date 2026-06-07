package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c2;
import defpackage.gf2;
import defpackage.hf2;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new c2(3);
    public final hf2 e;

    public ParcelImpl(Parcel parcel) {
        this.e = new gf2(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new gf2(parcel).i(this.e);
    }
}
