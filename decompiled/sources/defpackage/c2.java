package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c2 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intent intent;
        switch (this.a) {
            case 0:
                parcel.getClass();
                int readInt = parcel.readInt();
                if (parcel.readInt() == 0) {
                    intent = null;
                } else {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                }
                return new d2(readInt, intent);
            case 1:
                return new oy(parcel.readInt());
            case 2:
                parcel.getClass();
                return new gn0(parcel);
            case 3:
                return new ParcelImpl(parcel);
            case 4:
                return new fe1(parcel.readFloat());
            case 5:
                return new ge1(parcel.readInt());
            default:
                return new he1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d2[i];
            case 1:
                return new oy[i];
            case 2:
                return new gn0[i];
            case 3:
                return new ParcelImpl[i];
            case 4:
                return new fe1[i];
            case 5:
                return new ge1[i];
            default:
                return new he1[i];
        }
    }
}
