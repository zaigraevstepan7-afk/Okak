package defpackage;

import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fg0 implements ey1 {
    public final al1 e;
    public final Deflater f;
    public final nz g;
    public boolean h;
    public final CRC32 i;

    public fg0(ok okVar) {
        okVar.getClass();
        al1 al1Var = new al1(okVar);
        this.e = al1Var;
        Deflater deflater = new Deflater(-1, true);
        this.f = deflater;
        this.g = new nz(al1Var, deflater);
        this.i = new CRC32();
        hk hkVar = al1Var.f;
        hkVar.V(8075);
        hkVar.Q(8);
        hkVar.Q(0);
        hkVar.T(0);
        hkVar.Q(0);
        hkVar.Q(0);
    }

    @Override // defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int value;
        boolean z;
        hk hkVar;
        Deflater deflater = this.f;
        al1 al1Var = this.e;
        if (!this.h) {
            try {
                nz nzVar = this.g;
                nzVar.f.finish();
                nzVar.b(false);
                value = (int) this.i.getValue();
                z = al1Var.g;
                hkVar = al1Var.f;
            } catch (Throwable th) {
                th = th;
            }
            if (!z) {
                hkVar.T(rx.L(value));
                al1Var.m();
                int bytesRead = (int) deflater.getBytesRead();
                if (!al1Var.g) {
                    hkVar.T(rx.L(bytesRead));
                    al1Var.m();
                    th = null;
                    try {
                        deflater.end();
                    } catch (Throwable th2) {
                        if (th == null) {
                            th = th2;
                        }
                    }
                    try {
                        al1Var.close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        }
                    }
                    this.h = true;
                    if (th == null) {
                        return;
                    } else {
                        throw th;
                    }
                }
                throw new IllegalStateException("closed");
            }
            throw new IllegalStateException("closed");
        }
    }

    @Override // defpackage.ey1, java.io.Flushable
    public final void flush() {
        this.g.flush();
    }

    @Override // defpackage.ey1
    public final ea2 timeout() {
        return this.e.e.timeout();
    }

    @Override // defpackage.ey1
    public final void write(hk hkVar, long j) {
        hkVar.getClass();
        if (j >= 0) {
            if (j == 0) {
                return;
            }
            mt1 mt1Var = hkVar.e;
            mt1Var.getClass();
            long j2 = j;
            while (j2 > 0) {
                int min = (int) Math.min(j2, mt1Var.c - mt1Var.b);
                this.i.update(mt1Var.a, mt1Var.b, min);
                j2 -= min;
                mt1Var = mt1Var.f;
                mt1Var.getClass();
            }
            this.g.write(hkVar, j);
            return;
        }
        se.e(l90.k("byteCount < 0: ", j));
    }
}
