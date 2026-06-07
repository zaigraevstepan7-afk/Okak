package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class oy implements Parcelable {
    public static final Parcelable.Creator<oy> CREATOR = new c2(1);
    public final int e;

    public oy(int i) {
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oy) && this.e == ((oy) obj).e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }

    public final String toString() {
        return l90.o(new StringBuilder("DefaultLazyKey(index="), this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
    }
}
