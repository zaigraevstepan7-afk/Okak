package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class x0 {
    public Object a;
    public final Object b;

    public x0(lo loVar) {
        this.a = new tg(this, 0);
        this.b = new sg(this, loVar);
    }

    public abstract int[] a(int i);

    public int[] b(int i, int i2) {
        if (i >= 0 && i2 >= 0 && i != i2) {
            int[] iArr = (int[]) this.b;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }
        return null;
    }

    public String c() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        sn0.V("text");
        throw null;
    }

    public boolean d() {
        if (((tg) this.a).b && ((sg) this.b).b) {
            return true;
        }
        return false;
    }

    public abstract void f();

    public abstract int[] i(int i);

    public x0() {
        this.b = new int[2];
    }

    public void e() {
    }

    public void h() {
    }

    public void g(rg rgVar) {
    }
}
