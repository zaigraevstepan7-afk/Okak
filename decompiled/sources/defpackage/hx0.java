package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hx0 {
    public final Locale a;

    public hx0(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof hx0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return sn0.r(this.a.toLanguageTag(), ((hx0) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
