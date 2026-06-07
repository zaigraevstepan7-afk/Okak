package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m61 {
    public final k61 a;
    public int b;
    public String c;
    public boolean d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r0v0, types: [k61, java.lang.Object] */
    public m61() {
        ?? obj = new Object();
        obj.a = -1;
        obj.e = -1;
        obj.f = -1;
        this.a = obj;
        this.b = -1;
    }

    public final void a(String str) {
        if (!i32.N(str)) {
            this.c = str;
            this.d = false;
        } else {
            se.h("Cannot pop up to an empty route");
        }
    }
}
