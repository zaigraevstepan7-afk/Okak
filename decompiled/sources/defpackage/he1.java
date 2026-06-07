package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class he1 extends v22 implements Parcelable, u02, o22, o41 {
    public static final Parcelable.Creator<he1> CREATOR = new c2(6);
    public t02 f;

    public he1(long j) {
        i02 j2 = q02.j();
        t02 t02Var = new t02(j2.g(), j);
        if (!(j2 instanceof of0)) {
            t02Var.b = new t02(1L, j);
        }
        this.f = t02Var;
    }

    @Override // defpackage.u22
    public final w22 a() {
        return this.f;
    }

    @Override // defpackage.u22
    public final w22 b(w22 w22Var, w22 w22Var2, w22 w22Var3) {
        if (((t02) w22Var2).c == ((t02) w22Var3).c) {
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
        this.f = (t02) w22Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((t02) q02.t(this.f, this)).c;
    }

    @Override // defpackage.o22
    public final Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        i02 j2;
        t02 t02Var = (t02) q02.h(this.f);
        if (t02Var.c != j) {
            t02 t02Var2 = this.f;
            synchronized (q02.c) {
                j2 = q02.j();
                ((t02) q02.o(t02Var2, this, j2, t02Var)).c = j;
            }
            q02.n(j2, this);
        }
    }

    @Override // defpackage.o41
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((t02) q02.h(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
