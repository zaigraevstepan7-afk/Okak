package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ux {
    public Parcel a;

    public long a() {
        int i = co.h;
        long readLong = this.a.readLong();
        long j = 63 & readLong;
        if (j < 16) {
            return readLong;
        }
        return (readLong & (-64)) | (j + 1);
    }

    public long b() {
        long j;
        Parcel parcel = this.a;
        byte readByte = parcel.readByte();
        if (readByte == 1) {
            j = 4294967296L;
        } else if (readByte == 2) {
            j = 8589934592L;
        } else {
            j = 0;
        }
        if (o92.a(j, 0L)) {
            return n92.c;
        }
        return pp1.C(j, parcel.readFloat());
    }

    public void c(byte b) {
        this.a.writeByte(b);
    }

    public void d(float f) {
        this.a.writeFloat(f);
    }

    public void e(long j) {
        long b = n92.b(j);
        byte b2 = 0;
        if (!o92.a(b, 0L)) {
            if (o92.a(b, 4294967296L)) {
                b2 = 1;
            } else if (o92.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        c(b2);
        if (!o92.a(n92.b(j), 0L)) {
            d(n92.c(j));
        }
    }
}
