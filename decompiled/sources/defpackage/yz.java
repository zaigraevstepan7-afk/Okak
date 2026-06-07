package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yz implements h50 {
    public final int a;
    public final int b;

    public yz(int i, int i2) {
        boolean z;
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ll0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
        }
    }

    @Override // defpackage.h50
    public final void a(i50 i50Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = i50Var.b;
                if (i5 > i4) {
                    char b = i50Var.b((i5 - i4) - 1);
                    char b2 = i50Var.b(i50Var.b - i4);
                    if (Character.isHighSurrogate(b) && Character.isLowSurrogate(b2)) {
                        i3 += 2;
                    } else {
                        i3 = i4;
                    }
                    i2++;
                } else {
                    i3 = i5;
                    break;
                }
            } else {
                break;
            }
        }
        int i6 = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i7 = i6 + 1;
            int i8 = i50Var.c;
            ne1 ne1Var = i50Var.a;
            if (i8 + i7 < ne1Var.b()) {
                char b3 = i50Var.b((i50Var.c + i7) - 1);
                char b4 = i50Var.b(i50Var.c + i7);
                if (Character.isHighSurrogate(b3) && Character.isLowSurrogate(b4)) {
                    i6 += 2;
                } else {
                    i6 = i7;
                }
                i++;
            } else {
                i6 = ne1Var.b() - i50Var.c;
                break;
            }
        }
        int i9 = i50Var.c;
        i50Var.a(i9, i6 + i9);
        int i10 = i50Var.b;
        i50Var.a(i10 - i3, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz)) {
            return false;
        }
        yz yzVar = (yz) obj;
        if (this.a == yzVar.a && this.b == yzVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return l90.o(sb, this.b, ')');
    }
}
