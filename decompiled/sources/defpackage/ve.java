package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ve implements Iterator, xo0 {
    public int e;
    public int f;
    public boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ve(ze zeVar, int i) {
        this(zeVar.g);
        this.h = i;
        switch (i) {
            case 1:
                this.i = zeVar;
                this(zeVar.g);
                return;
            default:
                this.i = zeVar;
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f < this.e) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object g;
        if (hasNext()) {
            int i = this.f;
            int i2 = this.h;
            Object obj = this.i;
            switch (i2) {
                case 0:
                    g = ((ze) obj).g(i);
                    break;
                case 1:
                    g = ((ze) obj).k(i);
                    break;
                default:
                    g = ((af) obj).f[i];
                    break;
            }
            this.f++;
            this.g = true;
            return g;
        }
        y61.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.g) {
            int i = this.f - 1;
            this.f = i;
            int i2 = this.h;
            Object obj = this.i;
            switch (i2) {
                case 0:
                    ((ze) obj).i(i);
                    break;
                case 1:
                    ((ze) obj).i(i);
                    break;
                default:
                    ((af) obj).a(i);
                    break;
            }
            this.e--;
            this.g = false;
            return;
        }
        se.p("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ve(af afVar) {
        this(afVar.g);
        this.h = 2;
        this.i = afVar;
    }

    public ve(int i) {
        this.e = i;
    }
}
