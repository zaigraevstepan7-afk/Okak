package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ff2;
import defpackage.gf2;
import defpackage.hf2;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ff2 ff2Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        hf2 hf2Var = remoteActionCompat.a;
        boolean z = true;
        if (ff2Var.e(1)) {
            hf2Var = ff2Var.g();
        }
        remoteActionCompat.a = (IconCompat) hf2Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (ff2Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((gf2) ff2Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (ff2Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((gf2) ff2Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) ff2Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (ff2Var.e(5)) {
            if (((gf2) ff2Var).e.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!ff2Var.e(6)) {
            z = z3;
        } else if (((gf2) ff2Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ff2 ff2Var) {
        ff2Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        ff2Var.h(1);
        ff2Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        ff2Var.h(2);
        Parcel parcel = ((gf2) ff2Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        ff2Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        ff2Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        ff2Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        ff2Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
