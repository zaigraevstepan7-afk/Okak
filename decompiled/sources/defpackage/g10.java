package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g10 extends i10 implements iv, vt {
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(g10.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final zu h;
    public final wt i;
    public Object j;
    public final Object k;

    public g10(zu zuVar, wt wtVar) {
        super(-1);
        this.h = zuVar;
        this.i = wtVar;
        this.j = mp0.o;
        this.k = mp0.N(wtVar.getContext());
    }

    @Override // defpackage.iv
    public final iv getCallerFrame() {
        return this.i;
    }

    @Override // defpackage.vt
    public final xu getContext() {
        return this.i.getContext();
    }

    @Override // defpackage.i10
    public final Object i() {
        Object obj = this.j;
        this.j = mp0.o;
        return obj;
    }

    @Override // defpackage.vt
    public final void resumeWith(Object obj) {
        Object lpVar;
        Throwable a = go1.a(obj);
        if (a == null) {
            lpVar = obj;
        } else {
            lpVar = new lp(a, false);
        }
        wt wtVar = this.i;
        xu context = wtVar.getContext();
        zu zuVar = this.h;
        if (zuVar.Q(context)) {
            this.j = lpVar;
            this.g = 0;
            zuVar.P(wtVar.getContext(), this);
            return;
        }
        l70 a2 = r92.a();
        if (a2.g >= 4294967296L) {
            this.j = lpVar;
            this.g = 0;
            a2.T(this);
            return;
        }
        a2.U(true);
        try {
            xu context2 = wtVar.getContext();
            Object Q = mp0.Q(context2, this.k);
            try {
                wtVar.resumeWith(obj);
                do {
                } while (a2.W());
            } finally {
                mp0.J(context2, Q);
            }
        } catch (Throwable th) {
            try {
                g(th);
            } finally {
                a2.S(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.h + ", " + rx.N(this.i) + AbstractJsonLexerKt.END_LIST;
    }

    @Override // defpackage.i10
    public final vt c() {
        return this;
    }
}
