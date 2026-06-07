package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ei2 extends di2 {
    public ei2(ni2 ni2Var, WindowInsets windowInsets) {
        super(ni2Var, windowInsets);
    }

    @Override // defpackage.ji2
    public ni2 a() {
        return ni2.b(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.ji2
    public l10 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new l10(displayCutout);
    }

    @Override // defpackage.ji2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei2)) {
            return false;
        }
        ei2 ei2Var = (ei2) obj;
        if (Objects.equals(this.c, ei2Var.c) && Objects.equals(null, null) && ci2.q(this.e, ei2Var.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ji2
    public int hashCode() {
        return this.c.hashCode();
    }
}
