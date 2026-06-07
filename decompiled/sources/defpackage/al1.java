package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class al1 implements ok {
    public final ey1 e;
    public final hk f;
    public boolean g;

    /* JADX WARN: Type inference failed for: r1v1, types: [hk, java.lang.Object] */
    public al1(ey1 ey1Var) {
        ey1Var.getClass();
        this.e = ey1Var;
        this.f = new Object();
    }

    @Override // defpackage.ok
    public final ok B(int i, int i2, String str) {
        str.getClass();
        if (!this.g) {
            this.f.X(i, i2, str);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ok
    public final ok L(long j) {
        if (!this.g) {
            this.f.R(j);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ok
    public final hk a() {
        return this.f;
    }

    @Override // defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        ey1 ey1Var = this.e;
        if (!this.g) {
            try {
                hk hkVar = this.f;
                long j = hkVar.f;
                if (j > 0) {
                    ey1Var.write(hkVar, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                ey1Var.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.g = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // defpackage.ok
    public final ok f(int i) {
        if (!this.g) {
            this.f.Z(i);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ok, defpackage.ey1, java.io.Flushable
    public final void flush() {
        if (!this.g) {
            hk hkVar = this.f;
            long j = hkVar.f;
            ey1 ey1Var = this.e;
            if (j > 0) {
                ey1Var.write(hkVar, j);
            }
            ey1Var.flush();
            return;
        }
        se.p("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.g;
    }

    @Override // defpackage.ok
    public final long l(k12 k12Var) {
        k12Var.getClass();
        long j = 0;
        while (true) {
            long read = k12Var.read(this.f, 8192L);
            if (read != -1) {
                j += read;
                m();
            } else {
                return j;
            }
        }
    }

    @Override // defpackage.ok
    public final ok m() {
        if (!this.g) {
            hk hkVar = this.f;
            long g = hkVar.g();
            if (g > 0) {
                this.e.write(hkVar, g);
            }
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ey1
    public final ea2 timeout() {
        return this.e.timeout();
    }

    public final String toString() {
        return "buffer(" + this.e + ')';
    }

    @Override // defpackage.ok
    public final ok u(String str) {
        str.getClass();
        if (!this.g) {
            this.f.Y(str);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ok
    public final ok w(bl blVar) {
        blVar.getClass();
        if (!this.g) {
            this.f.P(blVar);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ok
    public final ok write(byte[] bArr) {
        bArr.getClass();
        if (!this.g) {
            this.f.m79write(bArr, 0, bArr.length);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ok
    public final ok writeByte(int i) {
        if (!this.g) {
            this.f.Q(i);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ok
    public final ok writeInt(int i) {
        if (!this.g) {
            this.f.T(i);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ok
    public final ok writeShort(int i) {
        if (!this.g) {
            this.f.V(i);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ok
    public final ok y(long j) {
        if (!this.g) {
            this.f.S(j);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }

    @Override // defpackage.ey1
    public final void write(hk hkVar, long j) {
        hkVar.getClass();
        if (!this.g) {
            this.f.write(hkVar, j);
            m();
        } else {
            se.p("closed");
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.g) {
            int write = this.f.write(byteBuffer);
            m();
            return write;
        }
        se.p("closed");
        return 0;
    }

    @Override // defpackage.ok
    public final ok write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.g) {
            this.f.m79write(bArr, i, i2);
            m();
            return this;
        }
        se.p("closed");
        return null;
    }
}
