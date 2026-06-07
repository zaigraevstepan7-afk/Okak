package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p2 implements ih1 {
    public static final p2 c = new p2(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, 0);
    public final /* synthetic */ int a;
    public float[] b;

    public /* synthetic */ p2(float[] fArr, int i) {
        this.a = i;
        this.b = fArr;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.util.ArrayList b(defpackage.p2 r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2.b(p2, java.lang.String):java.util.ArrayList");
    }

    @Override // defpackage.ih1
    public long a(float f, float f2) {
        long b = d01.b((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), this.b);
        return ha0.a(Float.intBitsToFloat((int) (b >> 32)), Float.intBitsToFloat((int) (b & 4294967295L)));
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ p2() {
        this.a = 1;
    }
}
