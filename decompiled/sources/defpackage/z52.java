package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z52 extends y52 {
    public final Runnable g;

    public z52(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.g;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(rx.w(runnable));
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        if (this.f) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        sb.append(str);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
