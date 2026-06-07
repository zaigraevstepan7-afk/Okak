package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.elixir.loader.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class l6 {
    public static final js a = new js(e6.f);
    public static final y22 b = new xj1(e6.g);
    public static final js c = new js(i5.h);
    public static final y22 d = new xj1(e6.h);
    public static final y22 e = new xj1(e6.i);
    public static final y22 f = new xj1(e6.j);

    public static final void a(q5 q5Var, se0 se0Var, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        String str;
        boolean z2;
        urVar.Y(-520299287);
        if (urVar.h(q5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.h(se0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        int i6 = 1;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            Context context = q5Var.getContext();
            Object L = urVar.L();
            Object obj = or.a;
            if (L == obj) {
                L = new Object();
                urVar.h0(L);
            }
            ka kaVar = (ka) L;
            d5 viewTreeOwners = q5Var.getViewTreeOwners();
            if (viewTreeOwners != null) {
                cr1 cr1Var = viewTreeOwners.b;
                Object L2 = urVar.L();
                if (L2 == obj) {
                    Object parent = q5Var.getParent();
                    parent.getClass();
                    View view = (View) parent;
                    Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                    LinkedHashMap linkedHashMap = null;
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = String.valueOf(view.getId());
                    }
                    String str2 = oq1.class.getSimpleName() + AbstractJsonLexerKt.COLON + str;
                    sl0 f2 = cr1Var.f();
                    Bundle q = f2.q(str2);
                    if (q != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (String str3 : q.keySet()) {
                            ArrayList parcelableArrayList = q.getParcelableArrayList(str3);
                            parcelableArrayList.getClass();
                            linkedHashMap.put(str3, parcelableArrayList);
                        }
                    }
                    i5 i5Var = i5.w;
                    y22 y22Var = qq1.a;
                    pq1 pq1Var = new pq1(linkedHashMap, i5Var);
                    try {
                        f2.z(str2, new rp(pq1Var, i6));
                        z2 = true;
                    } catch (IllegalArgumentException unused) {
                        z2 = false;
                    }
                    Object r10Var = new r10(pq1Var, new s10(z2, f2, str2));
                    urVar.h0(r10Var);
                    L2 = r10Var;
                }
                Object obj2 = (r10) L2;
                boolean h = urVar.h(obj2);
                Object L3 = urVar.L();
                if (h || L3 == obj) {
                    L3 = new n3(obj2, 5);
                    urVar.h0(L3);
                }
                bf.d(od2.a, (oe0) L3, urVar);
                Object L4 = urVar.L();
                if (L4 == obj) {
                    if (Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) {
                        L4 = new ky(q5Var.getView(), 0);
                    } else {
                        L4 = new Object();
                    }
                    urVar.h0(L4);
                }
                rg0 rg0Var = (rg0) L4;
                Configuration configuration = q5Var.getConfiguration();
                Object L5 = urVar.L();
                if (L5 == obj) {
                    L5 = new lj0();
                    urVar.h0(L5);
                }
                lj0 lj0Var = (lj0) L5;
                Object L6 = urVar.L();
                Object obj3 = L6;
                if (L6 == obj) {
                    Configuration configuration2 = new Configuration();
                    if (configuration != null) {
                        configuration2.setTo(configuration);
                    }
                    urVar.h0(configuration2);
                    obj3 = configuration2;
                }
                Configuration configuration3 = (Configuration) obj3;
                Object L7 = urVar.L();
                if (L7 == obj) {
                    L7 = new j6(configuration3, lj0Var);
                    urVar.h0(L7);
                }
                j6 j6Var = (j6) L7;
                boolean h2 = urVar.h(context);
                Object L8 = urVar.L();
                if (h2 || L8 == obj) {
                    L8 = new i6(0, context, j6Var);
                    urVar.h0(L8);
                }
                bf.d(lj0Var, (oe0) L8, urVar);
                Object L9 = urVar.L();
                if (L9 == obj) {
                    L9 = new ym1();
                    urVar.h0(L9);
                }
                ym1 ym1Var = (ym1) L9;
                Object L10 = urVar.L();
                if (L10 == obj) {
                    L10 = new k6(ym1Var);
                    urVar.h0(L10);
                }
                k6 k6Var = (k6) L10;
                boolean h3 = urVar.h(context);
                Object L11 = urVar.L();
                if (h3 || L11 == obj) {
                    L11 = new i6(1, context, k6Var);
                    urVar.h0(L11);
                }
                bf.d(ym1Var, (oe0) L11, urVar);
                xj1 xj1Var = is.v;
                vn.c(new zj1[]{a.a(q5Var.getConfiguration()), b.a(context), bx0.a.a(viewTreeOwners.a), fx0.a.a(cr1Var), qq1.a.a(obj2), f.a(q5Var.getView()), d.a(lj0Var), e.a(ym1Var), xj1Var.a(Boolean.valueOf(((Boolean) urVar.j(xj1Var)).booleanValue() | q5Var.getScrollCaptureInProgress$ui())), is.l.a(rg0Var)}, go.N(1059770793, new f6(q5Var, kaVar, se0Var), urVar), urVar, 56);
            } else {
                se.p("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new g6(q5Var, se0Var, i, 0);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
