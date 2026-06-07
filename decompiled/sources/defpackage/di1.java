package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class di1 {
    public static final /* synthetic */ int a = 0;

    static {
        new xj1(new ax0(14));
    }

    public static final void a(fq fqVar, ur urVar, int i) {
        boolean z;
        urVar.Y(442516910);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i & 1, z)) {
            urVar.X(1766838549);
            urVar.p(false);
            urVar.X(1767392772);
            fqVar.invoke(urVar, 6);
            urVar.p(false);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new bj0(fqVar, i, 6);
        }
    }
}
