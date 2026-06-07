package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wk0 implements k12 {
    public final bl1 e;
    public final Inflater f;
    public int g;
    public boolean h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wk0(k12 k12Var, Inflater inflater) {
        this(new bl1(k12Var), inflater);
        k12Var.getClass();
    }

    public final long b(hk hkVar, long j) {
        Inflater inflater = this.f;
        hkVar.getClass();
        if (j >= 0) {
            if (!this.h) {
                if (j != 0) {
                    try {
                        mt1 O = hkVar.O(1);
                        int min = (int) Math.min(j, 8192 - O.c);
                        boolean needsInput = inflater.needsInput();
                        bl1 bl1Var = this.e;
                        if (needsInput && !bl1Var.j()) {
                            mt1 mt1Var = bl1Var.f.e;
                            mt1Var.getClass();
                            int i = mt1Var.c;
                            int i2 = mt1Var.b;
                            int i3 = i - i2;
                            this.g = i3;
                            inflater.setInput(mt1Var.a, i2, i3);
                        }
                        int inflate = inflater.inflate(O.a, O.c, min);
                        int i4 = this.g;
                        if (i4 != 0) {
                            int remaining = i4 - inflater.getRemaining();
                            this.g -= remaining;
                            bl1Var.skip(remaining);
                        }
                        if (inflate > 0) {
                            O.c += inflate;
                            long j2 = inflate;
                            hkVar.f += j2;
                            return j2;
                        }
                        if (O.b == O.c) {
                            hkVar.e = O.a();
                            pt1.a(O);
                        }
                    } catch (DataFormatException e) {
                        throw new IOException(e);
                    }
                }
                return 0L;
            }
            se.p("closed");
            return 0L;
        }
        se.e(l90.k("byteCount < 0: ", j));
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h) {
            return;
        }
        this.f.end();
        this.h = true;
        this.e.close();
    }

    @Override // defpackage.k12
    public final long read(hk hkVar, long j) {
        hkVar.getClass();
        do {
            long b = b(hkVar, j);
            if (b > 0) {
                return b;
            }
            Inflater inflater = this.f;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.e.j());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // defpackage.k12
    public final ea2 timeout() {
        return this.e.e.timeout();
    }

    public wk0(bl1 bl1Var, Inflater inflater) {
        this.e = bl1Var;
        this.f = inflater;
    }
}
