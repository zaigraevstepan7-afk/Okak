package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g60 implements rj0 {
    public final boolean e;

    public g60(boolean z) {
        this.e = z;
    }

    @Override // defpackage.rj0
    public final boolean b() {
        return this.e;
    }

    @Override // defpackage.rj0
    public final g81 d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.e) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
