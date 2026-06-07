package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kc2 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final q4 b;
    public volatile int c = 0;

    public kc2(q4 q4Var, int i) {
        this.b = q4Var;
        this.a = i;
    }

    public final int a(int i) {
        a11 b = b();
        int a = b.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b.h;
            int i2 = a + b.e;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [mz0, java.lang.Object] */
    public final a11 b() {
        ThreadLocal threadLocal = d;
        a11 a11Var = (a11) threadLocal.get();
        a11 a11Var2 = a11Var;
        if (a11Var == null) {
            ?? mz0Var = new mz0();
            threadLocal.set(mz0Var);
            a11Var2 = mz0Var;
        }
        b11 b11Var = (b11) this.b.f;
        int a = b11Var.a(6);
        if (a != 0) {
            int i = a + b11Var.e;
            int i2 = (this.a * 4) + ((ByteBuffer) b11Var.h).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) b11Var.h).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) b11Var.h;
            a11Var2.h = byteBuffer;
            if (byteBuffer != null) {
                a11Var2.e = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                a11Var2.f = i4;
                a11Var2.g = ((ByteBuffer) a11Var2.h).getShort(i4);
                return a11Var2;
            }
            a11Var2.e = 0;
            a11Var2.f = 0;
            a11Var2.g = 0;
        }
        return a11Var2;
    }

    public final String toString() {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a11 b = b();
        int a = b.a(4);
        if (a != 0) {
            i = ((ByteBuffer) b.h).getInt(a + b.e);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        a11 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i3 = a2 + b2.e;
            i2 = ((ByteBuffer) b2.h).getInt(((ByteBuffer) b2.h).getInt(i3) + i3);
        } else {
            i2 = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(Integer.toHexString(a(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
