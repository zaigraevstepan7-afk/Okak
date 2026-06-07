package defpackage;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o12 implements Cloneable {
    public /* synthetic */ boolean e;
    public /* synthetic */ int[] f;
    public /* synthetic */ Object[] g;
    public /* synthetic */ int h;

    public o12() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f = new int[i4];
        this.g = new Object[i4];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o12 clone() {
        Object clone = super.clone();
        clone.getClass();
        o12 o12Var = (o12) clone;
        o12Var.f = (int[]) this.f.clone();
        o12Var.g = (Object[]) this.g.clone();
        return o12Var;
    }

    public final Object b(int i) {
        Object obj;
        int m = f2.m(this.f, this.h, i);
        if (m >= 0 && (obj = this.g[m]) != f2.z) {
            return obj;
        }
        return null;
    }

    public final int c(int i) {
        if (this.e) {
            f2.g(this);
        }
        return this.f[i];
    }

    public final void d(int i, Object obj) {
        int m = f2.m(this.f, this.h, i);
        if (m >= 0) {
            this.g[m] = obj;
            return;
        }
        int i2 = ~m;
        int i3 = this.h;
        if (i2 < i3) {
            Object[] objArr = this.g;
            if (objArr[i2] == f2.z) {
                this.f[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.e && i3 >= this.f.length) {
            f2.g(this);
            i2 = ~f2.m(this.f, this.h, i);
        }
        int i4 = this.h;
        if (i4 >= this.f.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.f = Arrays.copyOf(this.f, i8);
            this.g = Arrays.copyOf(this.g, i8);
        }
        int i9 = this.h;
        if (i9 - i2 != 0) {
            int[] iArr = this.f;
            int i10 = i2 + 1;
            bf.B(iArr, iArr, i10, i2, i9);
            Object[] objArr2 = this.g;
            bf.D(objArr2, objArr2, i10, i2, this.h);
        }
        this.f[i2] = i;
        this.g[i2] = obj;
        this.h++;
    }

    public final int e() {
        if (this.e) {
            f2.g(this);
        }
        return this.h;
    }

    public final Object f(int i) {
        if (this.e) {
            f2.g(this);
        }
        Object[] objArr = this.g;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object f = f(i2);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
