package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ie1 implements Parcelable.ClassLoaderCreator {
    public static je1 a(Parcel parcel, ClassLoader classLoader) {
        w02 w02Var;
        if (classLoader == null) {
            classLoader = ie1.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt != 0) {
            if (readInt != 1) {
                if (readInt == 2) {
                    w02Var = xl1.f;
                } else {
                    se.p(l90.i("Unsupported MutableState policy ", readInt, " was restored"));
                    return null;
                }
            } else {
                w02Var = xl1.o;
            }
        } else {
            w02Var = g3.S;
        }
        return new je1(readValue, w02Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new je1[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
