package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class em extends fm {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(em.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final dm h;
    public final boolean i;

    public /* synthetic */ em(dm dmVar, boolean z) {
        this(dmVar, z, j60.e, -3, jk.e);
    }

    @Override // defpackage.fm, defpackage.va0
    public final Object a(wa0 wa0Var, vt vtVar) {
        int i = this.f;
        hv hvVar = hv.e;
        if (i == -3) {
            boolean z = this.i;
            if (z && j.getAndSet(this, 1) != 0) {
                se.p("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object x = fp.x(wa0Var, this.h, z, vtVar);
            if (x == hvVar) {
                return x;
            }
        } else {
            Object a = super.a(wa0Var, vtVar);
            if (a == hvVar) {
                return a;
            }
        }
        return od2.a;
    }

    @Override // defpackage.fm
    public final String b() {
        return "channel=" + this.h;
    }

    @Override // defpackage.fm
    public final Object d(dj1 dj1Var, vt vtVar) {
        Object x = fp.x(new jv1(dj1Var), this.h, this.i, vtVar);
        if (x == hv.e) {
            return x;
        }
        return od2.a;
    }

    @Override // defpackage.fm
    public final fm e(xu xuVar, int i, jk jkVar) {
        return new em(this.h, this.i, xuVar, i, jkVar);
    }

    @Override // defpackage.fm
    public final va0 f() {
        return new em(this.h, this.i);
    }

    @Override // defpackage.fm
    public final dm g(gv gvVar) {
        if (this.i && j.getAndSet(this, 1) != 0) {
            se.p("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        if (this.f == -3) {
            return this.h;
        }
        return super.g(gvVar);
    }

    public em(dm dmVar, boolean z, xu xuVar, int i, jk jkVar) {
        super(xuVar, i, jkVar);
        this.h = dmVar;
        this.i = z;
        this.consumed$volatile = 0;
    }
}
