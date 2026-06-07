package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class je1 extends v22 implements Parcelable, u02 {
    public static final Parcelable.Creator<je1> CREATOR = new Object();
    public final w02 f;
    public v02 g;

    public je1(Object obj, w02 w02Var) {
        this.f = w02Var;
        i02 j = q02.j();
        v02 v02Var = new v02(obj, j.g());
        if (!(j instanceof of0)) {
            v02Var.b = new v02(obj, 1L);
        }
        this.g = v02Var;
    }

    @Override // defpackage.u22
    public final w22 a() {
        return this.g;
    }

    @Override // defpackage.u22
    public final w22 b(w22 w22Var, w22 w22Var2, w22 w22Var3) {
        if (this.f.f(((v02) w22Var2).c, ((v02) w22Var3).c)) {
            return w22Var2;
        }
        return null;
    }

    @Override // defpackage.u02
    public final w02 c() {
        return this.f;
    }

    @Override // defpackage.u22
    public final void d(w22 w22Var) {
        w22Var.getClass();
        this.g = (v02) w22Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.o22
    public final Object getValue() {
        return ((v02) q02.t(this.g, this)).c;
    }

    @Override // defpackage.o41
    public final void setValue(Object obj) {
        i02 j;
        v02 v02Var = (v02) q02.h(this.g);
        if (!this.f.f(v02Var.c, obj)) {
            v02 v02Var2 = this.g;
            synchronized (q02.c) {
                j = q02.j();
                ((v02) q02.o(v02Var2, this, j, v02Var)).c = obj;
            }
            q02.n(j, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((v02) q02.h(this.g)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        g3 g3Var = g3.S;
        w02 w02Var = this.f;
        if (sn0.r(w02Var, g3Var)) {
            i2 = 0;
        } else if (sn0.r(w02Var, xl1.o)) {
            i2 = 1;
        } else if (sn0.r(w02Var, xl1.f)) {
            i2 = 2;
        } else {
            se.p("Only known types of MutableState's SnapshotMutationPolicy are supported");
            return;
        }
        parcel.writeInt(i2);
    }
}
