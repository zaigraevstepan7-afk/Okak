package defpackage;

import java.io.IOException;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nz implements ey1 {
    public final al1 e;
    public final Deflater f;
    public boolean g;

    public nz(al1 al1Var, Deflater deflater) {
        this.e = al1Var;
        this.f = deflater;
    }

    public final void b(boolean z) {
        mt1 O;
        int deflate;
        al1 al1Var = this.e;
        hk hkVar = al1Var.f;
        while (true) {
            O = hkVar.O(1);
            byte[] bArr = O.a;
            int i = O.c;
            Deflater deflater = this.f;
            if (z) {
                try {
                    deflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                deflate = deflater.deflate(bArr, i, 8192 - i);
            }
            if (deflate > 0) {
                O.c += deflate;
                hkVar.f += deflate;
                al1Var.m();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (O.b == O.c) {
            hkVar.e = O.a();
            pt1.a(O);
        }
    }

    @Override // defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        Deflater deflater = this.f;
        if (!this.g) {
            try {
                deflater.finish();
                b(false);
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                deflater.end();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            try {
                this.e.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.g = true;
            if (th == null) {
            } else {
                throw th;
            }
        }
    }

    @Override // defpackage.ey1, java.io.Flushable
    public final void flush() {
        b(true);
        this.e.flush();
    }

    @Override // defpackage.ey1
    public final ea2 timeout() {
        return this.e.e.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.e + ')';
    }

    @Override // defpackage.ey1
    public final void write(hk hkVar, long j) {
        hkVar.getClass();
        rx.q(hkVar.f, 0L, j);
        while (true) {
            Deflater deflater = this.f;
            if (j > 0) {
                mt1 mt1Var = hkVar.e;
                mt1Var.getClass();
                int min = (int) Math.min(j, mt1Var.c - mt1Var.b);
                deflater.setInput(mt1Var.a, mt1Var.b, min);
                b(false);
                long j2 = min;
                hkVar.f -= j2;
                int i = mt1Var.b + min;
                mt1Var.b = i;
                if (i == mt1Var.c) {
                    hkVar.e = mt1Var.a();
                    pt1.a(mt1Var);
                }
                j -= j2;
            } else {
                deflater.setInput(c01.B, 0, 0);
                return;
            }
        }
    }
}
