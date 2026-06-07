package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fe1 extends v22 implements Parcelable, u02, o22, o41 {
    public static final Parcelable.Creator<fe1> CREATOR = new c2(4);
    public r02 f;

    public fe1(float f) {
        i02 j = q02.j();
        r02 r02Var = new r02(j.g(), f);
        if (!(j instanceof of0)) {
            r02Var.b = new r02(1L, f);
        }
        this.f = r02Var;
    }

    @Override // defpackage.u22
    public final w22 a() {
        return this.f;
    }

    @Override // defpackage.u22
    public final w22 b(w22 w22Var, w22 w22Var2, w22 w22Var3) {
        if (((r02) w22Var2).c == ((r02) w22Var3).c) {
            return w22Var2;
        }
        return null;
    }

    @Override // defpackage.u02
    public final w02 c() {
        return xl1.o;
    }

    @Override // defpackage.u22
    public final void d(w22 w22Var) {
        w22Var.getClass();
        this.f = (r02) w22Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((r02) q02.t(this.f, this)).c;
    }

    @Override // defpackage.o22
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        i02 j;
        r02 r02Var = (r02) q02.h(this.f);
        if (r02Var.c == f) {
            return;
        }
        r02 r02Var2 = this.f;
        synchronized (q02.c) {
            j = q02.j();
            ((r02) q02.o(r02Var2, this, j, r02Var)).c = f;
        }
        q02.n(j, this);
    }

    @Override // defpackage.o41
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((r02) q02.h(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
