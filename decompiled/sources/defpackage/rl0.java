package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rl0 {
    public final /* synthetic */ int a;
    public final hi0 b;
    public final hi0 c;
    public final hi0 d;
    public final hi0 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public rl0(rl0[] rl0VarArr) {
        int i = 0;
        this.a = 0;
        this.f = rl0VarArr;
        int length = rl0VarArr.length;
        hi0[] hi0VarArr = new hi0[length];
        for (int i2 = 0; i2 < length; i2++) {
            hi0VarArr[i2] = ((rl0[]) this.f)[i2].b();
        }
        int i3 = 1;
        this.b = new hi0(1, new xf2(hi0VarArr, i));
        int length2 = ((rl0[]) this.f).length;
        hi0[] hi0VarArr2 = new hi0[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            hi0VarArr2[i4] = ((rl0[]) this.f)[i4].d();
        }
        this.c = new hi0(0, new gi0(hi0VarArr2, i));
        int length3 = ((rl0[]) this.f).length;
        hi0[] hi0VarArr3 = new hi0[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            hi0VarArr3[i5] = ((rl0[]) this.f)[i5].c();
        }
        this.d = new hi0(1, new xf2(hi0VarArr3, i3));
        int length4 = ((rl0[]) this.f).length;
        hi0[] hi0VarArr4 = new hi0[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            hi0VarArr4[i6] = ((rl0[]) this.f)[i6].a();
        }
        this.e = new hi0(0, new gi0(hi0VarArr4, i3));
    }

    public final hi0 a() {
        int i = this.a;
        return this.e;
    }

    public final hi0 b() {
        int i = this.a;
        return this.b;
    }

    public final hi0 c() {
        int i = this.a;
        return this.d;
    }

    public final hi0 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i2 = 0;
                for (rl0 rl0Var : (rl0[]) obj) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    xp1.g(sb, rl0Var, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return "RectRulers(" + ((String) obj) + ')';
        }
    }

    public rl0(String str) {
        this.a = 1;
        this.f = str;
        this.b = new hi0(1, null);
        this.c = new hi0(0, null);
        this.d = new hi0(1, null);
        this.e = new hi0(0, null);
    }
}
