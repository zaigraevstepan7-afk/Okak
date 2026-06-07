package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zj1 {
    public final xj1 a;
    public final boolean b;
    public final w02 c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public zj1(xj1 xj1Var, Object obj, boolean z, w02 w02Var, boolean z2) {
        this.a = xj1Var;
        this.b = z;
        this.c = w02Var;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        vr.b("Unexpected form of a provided value");
        se.c();
        return null;
    }
}
