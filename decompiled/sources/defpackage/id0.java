package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class id0 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id0)) {
            return false;
        }
        id0 id0Var = (id0) obj;
        if (Objects.equals(this.a, id0Var.a) && Objects.equals(this.b, id0Var.b) && Objects.equals(this.c, id0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
