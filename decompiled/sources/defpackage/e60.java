package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e60 {
    public int a = 1;
    public final c11 b;
    public c11 c;
    public c11 d;
    public int e;
    public int f;

    public e60(c11 c11Var) {
        this.b = c11Var;
        this.c = c11Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        a11 b = this.c.b.b();
        int a = b.a(6);
        if ((a != 0 && ((ByteBuffer) b.h).get(a + b.e) != 0) || this.e == 65039) {
            return true;
        }
        return false;
    }
}
