package defpackage;

import defpackage.ih;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\"\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lfh;", "Lih;", "N", "Li21;", "material3"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
abstract class fh<N extends ih> extends i21 {
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fh) {
                fh fhVar = (fh) obj;
                if (!co.c(h(), fhVar.h()) || !co.c(k(), fhVar.k()) || !sn0.r(j(), fhVar.j()) || !sn0.r(l(), fhVar.l()) || !f20.b(i(), fhVar.i()) || !f20.b(n(), fhVar.n()) || !f20.b(m(), fhVar.m())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public abstract long h();

    public int hashCode() {
        long h = h();
        int i = co.h;
        return Float.hashCode(m()) + l90.a(n(), l90.a(i(), (l().hashCode() + ((j().hashCode() + l90.e(k(), Long.hashCode(h) * 31, 31)) * 31)) * 31, 31), 31);
    }

    public abstract float i();

    public abstract q32 j();

    public abstract long k();

    public abstract q32 l();

    public abstract float m();

    public abstract float n();

    public final void o(ih ihVar) {
        long h = h();
        if (!co.c(ihVar.u, h)) {
            ihVar.u = h;
            ihVar.O0();
        }
        long k = k();
        if (!co.c(ihVar.v, k)) {
            ihVar.v = k;
            ihVar.O0();
        }
        q32 j = j();
        if (!sn0.r(ihVar.w, j)) {
            ihVar.w = j;
            ihVar.P0();
        }
        q32 l = l();
        if (!sn0.r(ihVar.x, l)) {
            ihVar.x = l;
            ihVar.P0();
        }
        float i = i();
        if (!f20.b(ihVar.y, i)) {
            ihVar.y = i;
            ihVar.P0();
        }
        float n = n();
        if (!f20.b(ihVar.z, n)) {
            ihVar.z = n;
            ihVar.R0();
            ihVar.P0();
        }
        float m = m();
        if (!f20.b(ihVar.A, m)) {
            ihVar.A = m;
            ihVar.R0();
            ihVar.P0();
        }
    }
}
