package defpackage;

import android.view.textclassifier.TextClassification;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e62 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public e62(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e62)) {
            return false;
        }
        e62 e62Var = (e62) obj;
        if (sn0.r(this.a, e62Var.a) && d92.b(this.b, e62Var.b) && sn0.r(this.c, e62Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = d92.c;
        return this.c.hashCode() + l90.e(this.b, hashCode, 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) d92.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
