package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ff2;
import defpackage.gf2;
import defpackage.se;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(ff2 ff2Var) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.a;
        if (ff2Var.e(1)) {
            i = ((gf2) ff2Var).e.readInt();
        }
        iconCompat.a = i;
        byte[] bArr = iconCompat.c;
        if (ff2Var.e(2)) {
            Parcel parcel = ((gf2) ff2Var).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = ff2Var.f(iconCompat.d, 3);
        int i2 = iconCompat.e;
        if (ff2Var.e(4)) {
            i2 = ((gf2) ff2Var).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (ff2Var.e(5)) {
            i3 = ((gf2) ff2Var).e.readInt();
        }
        iconCompat.f = i3;
        iconCompat.g = (ColorStateList) ff2Var.f(iconCompat.g, 6);
        String str = iconCompat.i;
        if (ff2Var.e(7)) {
            str = ((gf2) ff2Var).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (ff2Var.e(8)) {
            str2 = ((gf2) ff2Var).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                se.h("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, ff2 ff2Var) {
        ff2Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            ff2Var.h(1);
            ((gf2) ff2Var).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            ff2Var.h(2);
            Parcel parcel = ((gf2) ff2Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            ff2Var.h(3);
            ((gf2) ff2Var).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            ff2Var.h(4);
            ((gf2) ff2Var).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            ff2Var.h(5);
            ((gf2) ff2Var).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            ff2Var.h(6);
            ((gf2) ff2Var).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            ff2Var.h(7);
            ((gf2) ff2Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            ff2Var.h(8);
            ((gf2) ff2Var).e.writeString(str2);
        }
    }
}
