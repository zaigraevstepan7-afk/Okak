package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ke2 implements oe0 {
    public final /* synthetic */ int e;

    public /* synthetic */ ke2(int i) {
        this.e = i;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        switch (this.e) {
            case 0:
                long j = ((xm0) obj).a;
                return new jc((int) (j >> 32), (int) (4294967295L & j));
            case 1:
                jc jcVar = (jc) obj;
                return new xm0((Math.round(jcVar.b) & 4294967295L) | (Math.round(jcVar.a) << 32));
            case 2:
                long j2 = ((en0) obj).a;
                return new jc((int) (j2 >> 32), (int) (4294967295L & j2));
            case 3:
                jc jcVar2 = (jc) obj;
                int round = Math.round(jcVar2.a);
                int i = 0;
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(jcVar2.b);
                if (round2 >= 0) {
                    i = round2;
                }
                return new en0((round << 32) | (4294967295L & i));
            case 4:
                pl1 pl1Var = (pl1) obj;
                return new lc(pl1Var.a, pl1Var.b, pl1Var.c, pl1Var.d);
            case 5:
                lc lcVar = (lc) obj;
                return new pl1(lcVar.a, lcVar.b, lcVar.c, lcVar.d);
            case 6:
                return Float.valueOf(((ic) obj).a);
            case 7:
                ef2 ef2Var = (ef2) obj;
                ef2Var.getClass();
                return ef2Var.e;
            case 8:
                float floatValue = ((Float) obj).floatValue();
                if (floatValue > 0.1f && floatValue < 0.95f) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            case 9:
                return ((pi2) obj).c;
            default:
                xi2 xi2Var = (xi2) obj;
                xi2Var.getClass();
                return xi2Var;
        }
    }
}
