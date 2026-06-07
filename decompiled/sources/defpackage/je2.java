package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class je2 extends ee2 {
    public final yf0 b;
    public String c;
    public boolean d;
    public final z30 e;
    public de0 f;
    public final je1 g;
    public ni h;
    public final je1 i;
    public long j;
    public float k;
    public float l;
    public final ie2 m;

    public je2(yf0 yf0Var) {
        this.b = yf0Var;
        yf0Var.i = new ie2(this, 0);
        this.c = "";
        this.d = true;
        this.e = new z30();
        this.f = hs.q;
        this.g = fr1.k(null);
        this.i = fr1.k(new fy1(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new ie2(this, 1);
    }

    @Override // defpackage.ee2
    public final void a(c40 c40Var) {
        e(c40Var, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r3 != r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
    
        if (r9.d == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.c40 r33, float r34, defpackage.ni r35) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je2.e(c40, float, ni):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        je1 je1Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((fy1) je1Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((fy1) je1Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
