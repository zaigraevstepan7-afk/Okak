package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hv1 extends nt1 {
    public final /* synthetic */ AtomicReferenceArray e;

    public hv1(long j, hv1 hv1Var, int i) {
        super(j, hv1Var, i);
        this.e = new AtomicReferenceArray(gv1.f);
    }

    @Override // defpackage.nt1
    public final int f() {
        return gv1.f;
    }

    @Override // defpackage.nt1
    public final void g(int i, xu xuVar) {
        this.e.set(i, gv1.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + AbstractJsonLexerKt.END_LIST;
    }
}
