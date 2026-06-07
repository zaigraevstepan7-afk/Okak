package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class dy1 {
    public static final f22 a = mp0.M(0.0f, 0.0f, null, 7);

    public static final o22 a(long j, u90 u90Var, String str, ur urVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            u90Var = a;
        }
        u90 u90Var2 = u90Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean f = urVar.f(co.f(j));
        Object L = urVar.L();
        if (f || L == or.a) {
            ec2 ec2Var = new ec2(i5.p, new n3(co.f(j), 8));
            urVar.h0(ec2Var);
            L = ec2Var;
        }
        return ab.b(new co(j), (ec2) L, u90Var2, null, str2, urVar, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
