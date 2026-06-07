package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class n12 {
    public static final long a = pp1.s(14);
    public static final long b = pp1.s(0);
    public static final long c = co.f;
    public static final k82 d;

    static {
        k82 k82Var;
        long j = co.b;
        if (j != 16) {
            k82Var = new uo(j);
        } else {
            k82Var = j82.a;
        }
        d = k82Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x00b6, code lost:
    
        if (r15.equals(r24.i) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00c5, code lost:
    
        if (r39.equals(r24.j) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00d4, code lost:
    
        if (r40.equals(r24.k) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.m12 a(defpackage.m12 r24, long r25, defpackage.ck r27, float r28, long r29, defpackage.sd0 r31, defpackage.qd0 r32, defpackage.rd0 r33, defpackage.g52 r34, java.lang.String r35, long r36, defpackage.jh r38, defpackage.l82 r39, defpackage.ix0 r40, long r41, defpackage.x62 r43, defpackage.hw1 r44, defpackage.zg1 r45, defpackage.d40 r46) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n12.a(m12, long, ck, float, long, sd0, qd0, rd0, g52, java.lang.String, long, jh, l82, ix0, long, x62, hw1, zg1, d40):m12");
    }

    public static final Object b(Object obj, Object obj2, float f) {
        if (f < 0.5d) {
            return obj;
        }
        return obj2;
    }

    public static final long c(float f, long j, long j2) {
        o92[] o92VarArr = n92.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    ml0.a("Cannot perform operation for Unspecified type.");
                }
                if (!o92.a(n92.b(j), n92.b(j2))) {
                    ml0.a("Cannot perform operation for " + ((Object) o92.b(n92.b(j))) + " and " + ((Object) o92.b(n92.b(j2))));
                }
                return pp1.C(j3, lo.Q(n92.c(j), n92.c(j2), f));
            }
        }
        return ((n92) b(new n92(j), new n92(j2), f)).a;
    }
}
