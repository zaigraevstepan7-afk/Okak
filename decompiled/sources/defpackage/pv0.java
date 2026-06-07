package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pv0 implements Iterator, xo0 {
    public String e;
    public boolean f;
    public final /* synthetic */ bo g;

    public pv0(bo boVar) {
        this.g = boVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e == null && !this.f) {
            String readLine = ((BufferedReader) this.g.b).readLine();
            this.e = readLine;
            if (readLine == null) {
                this.f = true;
            }
        }
        if (this.e != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.e;
            this.e = null;
            str.getClass();
            return str;
        }
        y61.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
