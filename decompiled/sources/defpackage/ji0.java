package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ji0 implements kw1 {
    public static final ji0 b = new ji0(0);
    public static final ji0 c = new ji0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ji0(int i) {
        this.a = i;
    }

    @Override // defpackage.kw1
    public final lo a(long j, jq0 jq0Var, c00 c00Var) {
        switch (this.a) {
            case 0:
                float j0 = c00Var.j0(30.0f);
                return new vb1(new pl1(0.0f, -j0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + j0));
            case 1:
                float j02 = c00Var.j0(30.0f);
                return new vb1(new pl1(-j02, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + j02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new vb1(hp.e(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
