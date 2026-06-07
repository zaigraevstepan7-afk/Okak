package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class is {
    public static final y22 a = new xj1(e6.q);
    public static final y22 b = new xj1(e6.r);
    public static final y22 c = new xj1(e6.t);
    public static final y22 d = new xj1(e6.s);
    public static final y22 e = new xj1(e6.v);
    public static final y22 f = new xj1(e6.u);
    public static final y22 g = new xj1(e6.B);
    public static final y22 h = new xj1(e6.x);
    public static final y22 i = new xj1(e6.y);
    public static final y22 j = new xj1(e6.A);
    public static final y22 k = new xj1(e6.z);
    public static final y22 l = new xj1(e6.C);
    public static final y22 m = new xj1(e6.D);
    public static final y22 n = new xj1(e6.E);
    public static final y22 o = new xj1(e6.I);
    public static final y22 p = new xj1(e6.H);
    public static final y22 q = new xj1(hs.f);
    public static final y22 r = new xj1(hs.g);
    public static final y22 s = new xj1(hs.h);
    public static final y22 t = new xj1(hs.i);
    public static final y22 u = new xj1(e6.F);
    public static final js v = new js(e6.G);
    public static final y22 w = new xj1(e6.w);

    public static final void a(jc1 jc1Var, ka kaVar, se0 se0Var, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        urVar.Y(1925803616);
        if (urVar.f(jc1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (urVar.f(kaVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (urVar.h(se0Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i8 & 1, z)) {
            q5 q5Var = (q5) jc1Var;
            zj1 a2 = a.a(q5Var.getAccessibilityManager());
            zj1 a3 = b.a(q5Var.getAutofill());
            zj1 a4 = d.a(q5Var.getAutofillManager());
            zj1 a5 = c.a(q5Var.getAutofillTree());
            zj1 a6 = e.a(q5Var.getClipboardManager());
            zj1 a7 = f.a(q5Var.getClipboard());
            zj1 a8 = h.a(q5Var.getDensity());
            zj1 a9 = i.a(q5Var.getFocusOwner());
            zj1 a10 = j.a(q5Var.getFontLoader());
            a10.f = false;
            zj1 a11 = k.a(q5Var.getFontFamilyResolver());
            a11.f = false;
            vn.c(new zj1[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, l.a(q5Var.getHapticFeedBack()), m.a(q5Var.getInputModeManager()), n.a(q5Var.getLayoutDirection()), o.a(q5Var.getTextInputService()), p.a(q5Var.getSoftwareKeyboardController()), q.a(q5Var.getTextToolbar()), r.a(kaVar), s.a(q5Var.getViewConfiguration()), t.a(q5Var.getWindowInfo()), u.a(q5Var.getPointerIconService()), g.a(q5Var.getGraphicsContext()), ex0.a.a(q5Var.getRetainedValuesStore())}, se0Var, urVar, ((i8 >> 3) & 112) | 8);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new f6(jc1Var, kaVar, se0Var, i2, 2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
