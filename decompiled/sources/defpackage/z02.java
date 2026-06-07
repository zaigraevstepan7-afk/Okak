package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z02 implements Parcelable.ClassLoaderCreator {
    public static a12 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = z02.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new a12();
        }
        dg1 e = kz1.f.e();
        for (int i = 0; i < readInt; i++) {
            e.add(parcel.readValue(classLoader));
        }
        return new a12(e.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new a12[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
