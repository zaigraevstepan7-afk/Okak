package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ge1 extends v22 implements Parcelable, u02, o22, o41 {
    public static final Parcelable.Creator<ge1> CREATOR = new c2(5);
    public s02 f;

    public ge1(int i) {
        i02 j = q02.j();
        s02 s02Var = new s02(i, j.g());
        if (!(j instanceof of0)) {
            s02Var.b = new s02(i, 1L);
        }
        this.f = s02Var;
    }

    @Override // defpackage.u22
    public final w22 a() {
        return this.f;
    }

    @Override // defpackage.u22
    public final w22 b(w22 w22Var, w22 w22Var2, w22 w22Var3) {
        if (((s02) w22Var2).c == ((s02) w22Var3).c) {
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
        this.f = (s02) w22Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((s02) q02.t(this.f, this)).c;
    }

    @Override // defpackage.o22
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        i02 j;
        s02 s02Var = (s02) q02.h(this.f);
        if (s02Var.c != i) {
            s02 s02Var2 = this.f;
            synchronized (q02.c) {
                j = q02.j();
                ((s02) q02.o(s02Var2, this, j, s02Var)).c = i;
            }
            q02.n(j, this);
        }
    }

    @Override // defpackage.o41
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((s02) q02.h(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
