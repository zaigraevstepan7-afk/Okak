package defpackage;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pd0 implements nd0 {
    public final float[] a;
    public final float[] b;

    public pd0(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.a = fArr;
            this.b = fArr2;
        } else {
            se.h("Array lengths must match and be nonzero");
            throw null;
        }
    }

    @Override // defpackage.nd0
    public final float a(float f) {
        return wc0.e(f, this.b, this.a);
    }

    @Override // defpackage.nd0
    public final float b(float f) {
        return wc0.e(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof pd0)) {
                pd0 pd0Var = (pd0) obj;
                if (Arrays.equals(this.a, pd0Var.a) && Arrays.equals(this.b, pd0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
