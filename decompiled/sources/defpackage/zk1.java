package defpackage;

import java.io.OutputStream;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zk1 extends OutputStream {
    public final /* synthetic */ al1 e;

    public zk1(al1 al1Var) {
        this.e = al1Var;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        al1 al1Var = this.e;
        if (!al1Var.g) {
            al1Var.flush();
        }
    }

    public final String toString() {
        return this.e + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        al1 al1Var = this.e;
        if (!al1Var.g) {
            al1Var.f.m79write(bArr, i, i2);
            al1Var.m();
        } else {
            se.w("closed");
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        al1 al1Var = this.e;
        if (!al1Var.g) {
            al1Var.f.Q((byte) i);
            al1Var.m();
        } else {
            se.w("closed");
        }
    }
}
