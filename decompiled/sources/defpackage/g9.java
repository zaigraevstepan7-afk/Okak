package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g9 extends d21 implements es, b40, gq0 {
    public boolean A;
    public vo1 C;
    public wo1 D;
    public final r31 s;
    public final boolean t;
    public final float u;
    public final uz v;
    public final tz w;
    public xm x;
    public float y;
    public long z = 0;
    public final b41 B = new b41();

    public g9(r31 r31Var, boolean z, float f, uz uzVar, tz tzVar) {
        this.s = r31Var;
        this.t = z;
        this.u = f;
        this.v = uzVar;
        this.w = tzVar;
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.d21
    public final void D0() {
        rx.C(z0(), null, new b31(this, null, 4), 3);
    }

    @Override // defpackage.d21
    public final void E0() {
        vo1 vo1Var = this.C;
        if (vo1Var != null) {
            this.D = null;
            fp.I(this);
            sl0 sl0Var = vo1Var.h;
            wo1 wo1Var = (wo1) ((LinkedHashMap) sl0Var.e).get(this);
            if (wo1Var != null) {
                wo1Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) sl0Var.e;
                wo1 wo1Var2 = (wo1) linkedHashMap.get(this);
                if (wo1Var2 != null) {
                }
                linkedHashMap.remove(this);
                vo1Var.g.add(wo1Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L0(ui1 ui1Var) {
        wo1 wo1Var;
        Object remove;
        View view;
        vo1 vo1Var;
        if (ui1Var instanceof si1) {
            si1 si1Var = (si1) ui1Var;
            long j = this.z;
            float f = this.y;
            vo1 vo1Var2 = this.C;
            vo1 vo1Var3 = vo1Var2;
            if (vo1Var2 == null) {
                Object obj = (View) hp.s(this, l6.f);
                while (!(obj instanceof ViewGroup)) {
                    Object parent = ((View) obj).getParent();
                    if (parent instanceof View) {
                        obj = parent;
                    } else {
                        y61.r("Couldn't find a valid parent for ", obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                        return;
                    }
                }
                ViewGroup viewGroup = (ViewGroup) obj;
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i < childCount) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof vo1) {
                            vo1Var = (vo1) childAt;
                            break;
                        }
                        i++;
                    } else {
                        vo1 vo1Var4 = new vo1(viewGroup.getContext());
                        viewGroup.addView(vo1Var4);
                        vo1Var = vo1Var4;
                        break;
                    }
                }
                this.C = vo1Var;
                vo1Var3 = vo1Var;
            }
            ArrayList arrayList = vo1Var3.f;
            sl0 sl0Var = vo1Var3.h;
            LinkedHashMap linkedHashMap = (LinkedHashMap) sl0Var.e;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) sl0Var.e;
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) sl0Var.f;
            wo1 wo1Var2 = (wo1) linkedHashMap.get(this);
            int i2 = 1;
            View view2 = wo1Var2;
            if (wo1Var2 == null) {
                ArrayList arrayList2 = vo1Var3.g;
                arrayList2.getClass();
                if (arrayList2.isEmpty()) {
                    remove = null;
                } else {
                    remove = arrayList2.remove(0);
                }
                wo1 wo1Var3 = (wo1) remove;
                View view3 = wo1Var3;
                if (wo1Var3 == null) {
                    if (vo1Var3.i > xn.A(arrayList)) {
                        View view4 = new View(vo1Var3.getContext());
                        vo1Var3.addView(view4);
                        arrayList.add(view4);
                        view = view4;
                    } else {
                        wo1 wo1Var4 = (wo1) arrayList.get(vo1Var3.i);
                        g9 g9Var = (g9) linkedHashMap3.get(wo1Var4);
                        view = wo1Var4;
                        if (g9Var != null) {
                            g9Var.D = null;
                            fp.I(g9Var);
                            wo1 wo1Var5 = (wo1) linkedHashMap2.get(g9Var);
                            if (wo1Var5 != null) {
                            }
                            linkedHashMap2.remove(g9Var);
                            wo1Var4.c();
                            view = wo1Var4;
                        }
                    }
                    int i3 = vo1Var3.i;
                    if (i3 < vo1Var3.e - 1) {
                        vo1Var3.i = i3 + 1;
                        view3 = view;
                    } else {
                        vo1Var3.i = 0;
                        view3 = view;
                    }
                }
                linkedHashMap2.put(this, view3);
                linkedHashMap3.put(view3, this);
                view2 = view3;
            }
            wo1 wo1Var6 = view2;
            int R = c01.R(f);
            long a = this.v.a();
            this.w.invoke();
            wo1Var6.b(si1Var, this.t, j, R, a, new v3(this, i2));
            this.D = wo1Var6;
            fp.I(this);
            return;
        }
        if (ui1Var instanceof ti1) {
            wo1 wo1Var7 = this.D;
            if (wo1Var7 != null) {
                wo1Var7.d();
                return;
            }
            return;
        }
        if ((ui1Var instanceof ri1) && (wo1Var = this.D) != null) {
            wo1Var.d();
        }
    }

    @Override // defpackage.b40
    public final void f0(cr0 cr0Var) {
        vl vlVar = cr0Var.e;
        cr0Var.b();
        xm xmVar = this.x;
        if (xmVar != null) {
            float f = this.y;
            long a = this.v.a();
            float floatValue = ((Number) ((ya) xmVar.c).d()).floatValue();
            if (floatValue > 0.0f) {
                long b = co.b(a, floatValue);
                if (xmVar.a) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (vlVar.d() >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (vlVar.d() & 4294967295L));
                    ld ldVar = vlVar.f;
                    long k = ldVar.k();
                    ldVar.h().h();
                    try {
                        ((ld) ((rg2) ldVar.f).f).h().n(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2, 1);
                        c40.q0(cr0Var, b, f, 0L, 124);
                    } finally {
                        l90.v(ldVar, k);
                    }
                } else {
                    c40.q0(cr0Var, b, f, 0L, 124);
                }
            }
        }
        tl h = vlVar.f.h();
        wo1 wo1Var = this.D;
        if (wo1Var != null) {
            long j = this.z;
            int R = c01.R(this.y);
            long a2 = this.v.a();
            this.w.invoke();
            wo1Var.e(j, a2, R);
            wo1Var.draw(v4.a(h));
        }
    }

    @Override // defpackage.gq0
    public final void o(long j) {
        float W;
        this.A = true;
        c00 c00Var = hp.M(this).C;
        this.z = vn.O(j);
        float f = this.u;
        if (Float.isNaN(f)) {
            long j2 = this.z;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            W = z81.c((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (this.t) {
                W += c00Var.W(10.0f);
            }
        } else {
            W = c00Var.W(f);
        }
        this.y = W;
        b41 b41Var = this.B;
        Object[] objArr = b41Var.a;
        int i = b41Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            L0((ui1) objArr[i2]);
        }
        b41Var.d();
    }
}
