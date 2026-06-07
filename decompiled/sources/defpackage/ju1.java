package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ju1 {
    public static final jc a = new jc(Float.NaN, Float.NaN);
    public static final ec2 b = new ec2(new hr1(27), new hr1(28));
    public static final long c;
    public static final f22 d;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = floatToRawIntBits;
        d = new f22(new z81(floatToRawIntBits));
    }
}
