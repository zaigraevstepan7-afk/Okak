package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import com.google.protobuf.DescriptorProtos;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n3 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(Object obj, int i) {
        super(1);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        float f = 0.0f;
        int i2 = 0;
        int i3 = 1;
        od2 od2Var = od2.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                o3 o3Var = (o3) obj;
                br0 br0Var = (br0) obj2;
                if (o3Var.o() != Integer.MAX_VALUE) {
                    if (o3Var.b().b) {
                        o3Var.H();
                    }
                    for (Map.Entry entry : o3Var.b().i.entrySet()) {
                        br0.a(br0Var, (j3) entry.getKey(), ((Number) entry.getValue()).intValue(), o3Var.h());
                    }
                    e81 e81Var = o3Var.h().u;
                    e81Var.getClass();
                    while (!e81Var.equals(br0Var.a.h())) {
                        for (j3 j3Var : br0Var.b(e81Var).keySet()) {
                            br0.a(br0Var, j3Var, br0Var.c(e81Var, j3Var), e81Var);
                        }
                        e81Var = e81Var.u;
                        e81Var.getClass();
                    }
                }
                return od2Var;
            case 1:
                return Boolean.valueOf(((tc0) obj).S0(((ac0) obj2).a));
            case 2:
                qy0 qy0Var = (qy0) obj;
                q5 q5Var = ((c5) obj2).t;
                if (q5Var.getInsetsListener().j.g() > 0) {
                    p31 p31Var = ti2.a;
                    qy0Var.e = true;
                    ty0 ty0Var = qy0Var.h;
                    iq0 A0 = ty0Var.A0();
                    if (xm0.a(qy0Var.f, 9223372034707292159L)) {
                        qy0Var.f = fp.V(A0.u(0L));
                        qy0Var.g = A0.m();
                    }
                    ty0Var.C0().K.b();
                    long m = A0.m();
                    i41 i41Var = q5Var.getInsetsListener().i;
                    int i4 = (int) (m >> 32);
                    int i5 = (int) (m & 4294967295L);
                    for (ri2 ri2Var : ti2.b) {
                        Object g = i41Var.g(ri2Var);
                        g.getClass();
                        kj2 kj2Var = (kj2) g;
                        ti2.a(qy0Var, ((si2) ri2Var).c, kj2Var.h, i4, i5);
                        if (((Boolean) kj2Var.b.getValue()).booleanValue()) {
                            ti2.a(qy0Var, kj2Var.f, kj2Var.j, i4, i5);
                            ti2.a(qy0Var, kj2Var.g, kj2Var.k, i4, i5);
                        }
                        ti2.a(qy0Var, ((si2) ri2Var).d, kj2Var.i, i4, i5);
                    }
                    b41 b41Var = q5Var.getInsetsListener().k;
                    if (b41Var.i()) {
                        a12 a12Var = q5Var.getInsetsListener().l;
                        Object[] objArr = b41Var.a;
                        int i6 = b41Var.b;
                        while (i2 < i6) {
                            o41 o41Var = (o41) objArr[i2];
                            rl0 rl0Var = (rl0) a12Var.get(i2);
                            Rect rect = (Rect) o41Var.getValue();
                            qy0Var.b(rl0Var.b(), rect.left);
                            qy0Var.b(rl0Var.d(), rect.top);
                            qy0Var.b(rl0Var.c(), rect.right);
                            qy0Var.b(rl0Var.a(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return od2Var;
            case 3:
                return Boolean.valueOf(((vm0) obj2).a(((ru1) obj).g));
            case 4:
                return Boolean.valueOf(f2.i((ru1) obj, (Resources) obj2));
            case 5:
                return new m2((r10) obj2, i3);
            case 6:
                return Boolean.valueOf(sn0.r(obj, obj2));
            case 7:
                cr0 cr0Var = (cr0) obj;
                ((fl1) obj2).invoke(cr0Var);
                cr0Var.b();
                return od2Var;
            case 8:
                lc lcVar = (lc) obj;
                float f2 = lcVar.b;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                float f3 = 1.0f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                float f4 = lcVar.c;
                float f5 = -0.5f;
                if (f4 < -0.5f) {
                    f4 = -0.5f;
                }
                float f6 = 0.5f;
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                float f7 = lcVar.d;
                if (f7 >= -0.5f) {
                    f5 = f7;
                }
                if (f5 <= 0.5f) {
                    f6 = f5;
                }
                float f8 = lcVar.a;
                if (f8 >= 0.0f) {
                    f = f8;
                }
                if (f <= 1.0f) {
                    f3 = f;
                }
                return new co(co.a(go.a(f2, f4, f6, f3, so.x), (po) obj2));
            case 9:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return od2Var;
            case 10:
                return Boolean.valueOf(!sn0.r(obj, ((lb2) obj2).d.getValue()));
            case 11:
                ((io1) obj).c(((Number) ((o22) obj2).getValue()).floatValue());
                return od2Var;
            case 12:
                o20 o20Var = (o20) obj;
                if (!o20Var.e.r) {
                    return tb2.f;
                }
                o20 o20Var2 = o20Var.t;
                tb2 tb2Var = tb2.e;
                if (o20Var2 != null) {
                    n3 n3Var = new n3((rg2) obj2, 12);
                    if (n3Var.invoke(o20Var2) == tb2Var) {
                        fr1.w(o20Var2, n3Var);
                    }
                }
                o20Var.t = null;
                o20Var.s = null;
                return tb2Var;
            case 13:
                if (pf0.b.compareAndSet(false, true)) {
                    ((lk) obj2).j(od2Var);
                }
                return od2Var;
            case 14:
                c40 c40Var = (c40) obj;
                tf0 tf0Var = (tf0) obj2;
                n8 n8Var = tf0Var.l;
                if (tf0Var.n && tf0Var.w && n8Var != null) {
                    ld b0 = c40Var.b0();
                    long k = b0.k();
                    b0.h().h();
                    try {
                        ((ld) ((rg2) b0.f).f).h().m(n8Var);
                        tf0Var.c(c40Var);
                    } finally {
                        l90.v(b0, k);
                    }
                } else {
                    tf0Var.c(c40Var);
                }
                return od2Var;
            case 15:
                c40 c40Var2 = (c40) obj;
                tl h = c40Var2.b0().h();
                se0 se0Var = ((vf0) obj2).h;
                if (se0Var != null) {
                    se0Var.invoke(h, (tf0) c40Var2.b0().g);
                }
                return od2Var;
            case 16:
                ee2 ee2Var = (ee2) obj;
                yf0 yf0Var = (yf0) obj2;
                yf0Var.g(ee2Var);
                oe0 oe0Var = yf0Var.i;
                if (oe0Var != null) {
                    oe0Var.invoke(ee2Var);
                }
                return od2Var;
            case 17:
                q81 q81Var = (q81) obj;
                ml1 ml1Var = q81Var.b;
                if (ml1Var != null) {
                    ml1Var.closeConnection();
                    q81Var.b = null;
                }
                tl0 tl0Var = (tl0) obj2;
                q41 q41Var = tl0Var.d;
                Object[] objArr2 = q41Var.e;
                int i7 = q41Var.g;
                while (true) {
                    if (i2 < i7) {
                        if (!sn0.r((hh2) objArr2[i2], q81Var)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 >= 0) {
                    q41Var.k(i2);
                }
                if (q41Var.g == 0) {
                    tl0Var.b.invoke();
                }
                return od2Var;
            case 18:
                ((q41) obj2).b((c21) obj);
                return Boolean.TRUE;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                if (obj == ((b41) obj2)) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case 20:
                if (obj == ((c41) obj2)) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                if (obj == ((j41) obj2)) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                xu1.e((av1) obj, ((ap1) obj2).a);
                return od2Var;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                xu1.b((av1) obj, (String) obj2);
                return od2Var;
            case 24:
                ((List) obj).add((Float) ((et0) obj2).invoke());
                return true;
            case 25:
                io1 io1Var = (io1) obj;
                iw1 iw1Var = (iw1) obj2;
                io1Var.l(io1Var.s.a() * 3.0f);
                io1Var.m(iw1Var.a);
                io1Var.h(iw1Var.b);
                io1Var.e(iw1Var.c);
                io1Var.n(iw1Var.d);
                return od2Var;
            case 26:
                io1 io1Var2 = (io1) obj;
                wx1 wx1Var = (wx1) obj2;
                io1Var2.j(wx1Var.s);
                io1Var2.k(wx1Var.t);
                io1Var2.c(wx1Var.u);
                io1Var2.r(0.0f);
                io1Var2.l(wx1Var.v);
                io1Var2.i(wx1Var.w);
                float f9 = wx1Var.x;
                if (io1Var2.n != f9) {
                    io1Var2.e |= 2048;
                    io1Var2.n = f9;
                }
                io1Var2.o(wx1Var.y);
                io1Var2.m(wx1Var.z);
                io1Var2.h(wx1Var.A);
                io1Var2.e(wx1Var.B);
                io1Var2.n(wx1Var.C);
                int i8 = wx1Var.D;
                if (io1Var2.u != i8) {
                    io1Var2.e |= 524288;
                    io1Var2.u = i8;
                }
                return od2Var;
            default:
                Throwable th = (Throwable) obj;
                v42 v42Var = (v42) obj2;
                pl plVar = v42Var.g;
                if (plVar != null) {
                    plVar.h(th);
                }
                v42Var.g = null;
                return od2Var;
        }
    }
}
