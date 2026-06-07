package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dl1 {
    public ds a;
    public int b;
    public p3 c;
    public se0 d;
    public int e;
    public x31 f;
    public i41 g;

    public dl1(ds dsVar) {
        this.a = dsVar;
    }

    public final boolean a() {
        boolean z;
        if (this.a != null) {
            p3 p3Var = this.c;
            if (p3Var != null) {
                z = p3Var.a();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final bo0 b(Object obj) {
        bo0 s;
        ds dsVar = this.a;
        if (dsVar != null && (s = dsVar.s(this, obj)) != null) {
            return s;
        }
        return bo0.e;
    }

    public final void c() {
        ds dsVar = this.a;
        if (dsVar != null) {
            dsVar.s = true;
            dsVar.x.g();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i;
        int i2 = this.b;
        if (z) {
            i = i2 | 32;
        } else {
            i = i2 & (-33);
        }
        this.b = i;
    }
}
