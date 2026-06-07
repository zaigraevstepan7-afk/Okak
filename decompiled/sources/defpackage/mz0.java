package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class mz0 {
    public int e;
    public int f;
    public int g;
    public Object h;

    public mz0() {
        if (wm1.f == null) {
            wm1.f = new wm1(18);
        }
    }

    public int a(int i) {
        if (i < this.g) {
            return ((ByteBuffer) this.h).getShort(this.f + i);
        }
        return 0;
    }

    public void b() {
        if (((nz0) this.h).l == this.g) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.e;
            nz0 nz0Var = (nz0) this.h;
            if (i < nz0Var.j && nz0Var.g[i] < 0) {
                this.e = i + 1;
            } else {
                return;
            }
        }
    }

    public boolean hasNext() {
        if (this.e < ((nz0) this.h).j) {
            return true;
        }
        return false;
    }

    public void remove() {
        nz0 nz0Var = (nz0) this.h;
        b();
        if (this.f != -1) {
            nz0Var.b();
            nz0Var.j(this.f);
            this.f = -1;
            this.g = nz0Var.l;
            return;
        }
        se.p("Call next() before removing element from the iterator.");
    }
}
