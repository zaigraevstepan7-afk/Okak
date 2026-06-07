package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ft {
    public final sj a;
    public final pl b;

    public ft(sj sjVar, pl plVar) {
        this.a = sjVar;
        this.b = plVar;
    }

    public final String toString() {
        pl plVar = this.b;
        if (plVar.i.H(cv.f) == null) {
            StringBuilder sb = new StringBuilder("Request@");
            int hashCode = hashCode();
            mp0.m(16);
            String num = Integer.toString(hashCode, 16);
            num.getClass();
            sb.append(num);
            sb.append("(currentBounds()=");
            sb.append(this.a.invoke());
            sb.append(", continuation=");
            sb.append(plVar);
            sb.append(')');
            return sb.toString();
        }
        se.s();
        return null;
    }
}
