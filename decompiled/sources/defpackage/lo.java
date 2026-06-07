package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.DragEvent;
import com.topjohnwu.superuser.nio.FileSystemManager;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class lo {
    public static ij0 a;
    public static t7 b;
    public static u4 c;
    public static vl d;

    public static long B(Context context, int i) {
        return go.b(context.getResources().getColor(i, context.getTheme()));
    }

    public static final long C(long j) {
        float sqrt = (float) Math.sqrt((H(j) * H(j)) + (G(j) * G(j)));
        if (sqrt > 0.0f) {
            return r(j, sqrt);
        }
        se.h("Can't get the direction of a 0-length vector");
        return 0L;
    }

    public static final go0 D(xu xuVar) {
        go0 go0Var = (go0) xuVar.H(g3.O);
        if (go0Var != null) {
            return go0Var;
        }
        se.t(xuVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final int E(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final long F(rg2 rg2Var) {
        DragEvent dragEvent = (DragEvent) rg2Var.f;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static final float G(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float H(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final void I(xu xuVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = bv.a.iterator();
        while (it.hasNext()) {
            try {
                ((av) it.next()).k(xuVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    qo.g(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            qo.g(th, new q00(xuVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final q10 J(go0 go0Var, boolean z, jo0 jo0Var) {
        if (go0Var instanceof no0) {
            return ((no0) go0Var).N(z, jo0Var);
        }
        return go0Var.O(jo0Var.k(), z, new k(1, jo0Var, jo0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 1));
    }

    public static final boolean K(xu xuVar) {
        go0 go0Var = (go0) xuVar.H(g3.O);
        if (go0Var != null) {
            return go0Var.b();
        }
        return true;
    }

    public static final boolean L(tc0 tc0Var) {
        ar0 ar0Var;
        e81 e81Var;
        ar0 ar0Var2;
        e81 e81Var2 = tc0Var.l;
        if (e81Var2 != null && (ar0Var = e81Var2.s) != null && ar0Var.I() && (e81Var = tc0Var.l) != null && (ar0Var2 = e81Var.s) != null && ar0Var2.H()) {
            return true;
        }
        return false;
    }

    public static final boolean M(ot0 ot0Var, int i) {
        int c2 = ot0Var.c();
        if (i > ot0Var.e() || c2 > i) {
            return false;
        }
        return true;
    }

    public static final boolean N(uy uyVar, float f) {
        float t;
        boolean z;
        uyVar.n().getClass();
        if (uyVar.s()) {
            t = -f;
        } else {
            t = t(uyVar);
        }
        if (t > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [rr0, hq1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [sd2, rr0, java.lang.Object] */
    public static rr0 O(xt0 xt0Var, de0 de0Var) {
        xl1 xl1Var = xl1.s;
        int ordinal = xt0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ?? obj = new Object();
                    obj.e = de0Var;
                    obj.f = xl1Var;
                    return obj;
                }
                se.m();
                return null;
            }
            ?? obj2 = new Object();
            obj2.e = de0Var;
            obj2.f = xl1Var;
            return obj2;
        }
        return new b52(de0Var);
    }

    public static b52 P(de0 de0Var) {
        de0Var.getClass();
        return new b52(de0Var);
    }

    public static final float Q(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int R(float f, int i, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static final long S(long j, long j2) {
        return ha0.a(G(j) - G(j2), H(j) - H(j2));
    }

    public static final Object T(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final long U(long j, long j2) {
        return ha0.a(G(j2) + G(j), H(j2) + H(j));
    }

    public static final void V(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ea2, java.lang.Object] */
    public static final jf W(InputStream inputStream) {
        return new jf(inputStream, (ea2) new Object());
    }

    public static final int X(o31 o31Var) {
        int c2;
        int i = o31Var.b;
        int c3 = o31Var.c(0);
        while (o31Var.b != 0 && o31Var.c(0) == c3) {
            o31Var.f(0, o31Var.d());
            o31Var.e(o31Var.b - 1);
            int i2 = o31Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int c4 = o31Var.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int c5 = o31Var.c(i6);
                if (i5 < i2 && (c2 = o31Var.c(i5)) > c5) {
                    if (c2 > c4) {
                        o31Var.f(i4, c2);
                        o31Var.f(i5, c4);
                        i4 = i5;
                    }
                } else if (c5 > c4) {
                    o31Var.f(i4, c5);
                    o31Var.f(i6, c4);
                    i4 = i6;
                }
            }
        }
        return c3;
    }

    public static final long Y(long j, float f) {
        return ha0.a(G(j) * f, H(j) * f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ir, wk1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList Z(fz1 fz1Var, int i, Integer num) {
        Object obj;
        ?? wk1Var = new wk1(fz1Var);
        int q = fz1Var.q(i);
        p3 a2 = fz1Var.a(i);
        while (i >= 0) {
            if (fz1Var.k(i)) {
                obj = fz1Var.p(fz1Var.b, i);
            } else {
                obj = or.a;
            }
            wk1Var.e(fz1Var.i(i), obj, fz1Var.a.f(i), num);
            if (q >= 0) {
                p3 p3Var = a2;
                a2 = fz1Var.a(q);
                i = q;
                q = fz1Var.q(q);
                num = p3Var;
            } else {
                i = q;
                num = a2;
            }
        }
        return (ArrayList) wk1Var.a;
    }

    public static final void a(y00 y00Var, ur urVar, int i) {
        int i2;
        a12 a12Var;
        urVar.Y(294589392);
        if (urVar.h(y00Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        if (((i2 | i) & 3) == 2 && urVar.A()) {
            urVar.R();
        } else {
            mq1 l = nq1.l(urVar);
            o41 e = fr1.e(y00Var.b().e, urVar);
            List list = (List) e.getValue();
            boolean booleanValue = ((Boolean) urVar.j(im0.a)).booleanValue();
            boolean f = urVar.f(list);
            Object L = urVar.L();
            Object obj = or.a;
            Object obj2 = L;
            if (f || L == obj) {
                a12 a12Var2 = new a12();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    d51 d51Var = (d51) obj3;
                    if (booleanValue || d51Var.l.j.c.compareTo(nu0.h) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                a12Var2.addAll(arrayList);
                urVar.h0(a12Var2);
                obj2 = a12Var2;
            }
            a12 a12Var3 = (a12) obj2;
            c(a12Var3, (List) e.getValue(), urVar, 0);
            o41 e2 = fr1.e(y00Var.b().f, urVar);
            Object L2 = urVar.L();
            if (L2 == obj) {
                L2 = new a12();
                urVar.h0(L2);
            }
            a12 a12Var4 = (a12) L2;
            urVar.X(-367418626);
            ListIterator listIterator = a12Var3.listIterator();
            while (true) {
                ah0 ah0Var = (ah0) listIterator;
                if (!ah0Var.hasNext()) {
                    break;
                }
                d51 d51Var2 = (d51) ah0Var.next();
                r51 r51Var = d51Var2.f;
                r51Var.getClass();
                x00 x00Var = (x00) r51Var;
                boolean h = urVar.h(y00Var) | urVar.h(d51Var2);
                Object L3 = urVar.L();
                if (h || L3 == obj) {
                    L3 = new j1(13, y00Var, d51Var2);
                    urVar.h0(L3);
                }
                bf.c((de0) L3, x00Var.j, go.N(1129586364, new u00(d51Var2, y00Var, l, a12Var4, x00Var), urVar), urVar, 384);
            }
            urVar.p(false);
            Set set = (Set) e2.getValue();
            boolean f2 = urVar.f(e2) | urVar.h(y00Var);
            Object L4 = urVar.L();
            if (!f2 && L4 != obj) {
                a12Var = a12Var4;
            } else {
                a12Var = a12Var4;
                Object tbVar = new tb(e2, y00Var, a12Var, null, 1);
                urVar.h0(tbVar);
                L4 = tbVar;
            }
            bf.j(set, a12Var, (se0) L4, urVar);
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h8(y00Var, i, 8);
        }
    }

    public static final long a0(long j, ih1 ih1Var) {
        long a2 = ih1Var.a(G(j), H(j));
        return ha0.a(Float.intBitsToFloat((int) (a2 >> 32)), Float.intBitsToFloat((int) (a2 & 4294967295L)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
    
        if (r1 != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.t7 b(int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo.b(int, int, int):t7");
    }

    public static final int b0(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void c(List list, Collection collection, ur urVar, int i) {
        int i2;
        int i3;
        urVar.Y(1537894851);
        if (urVar.h(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.h(collection)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        if (((i4 | i3) & 19) == 18 && urVar.A()) {
            urVar.R();
        } else {
            boolean booleanValue = ((Boolean) urVar.j(im0.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                d51 d51Var = (d51) it.next();
                wu0 wu0Var = d51Var.l.j;
                boolean g = urVar.g(booleanValue) | urVar.h(list) | urVar.h(d51Var);
                Object L = urVar.L();
                if (g || L == or.a) {
                    L = new r00(d51Var, list, booleanValue);
                    urVar.h0(L);
                }
                bf.d(wu0Var, (oe0) L, urVar);
            }
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new u2(list, i, 12, collection);
        }
    }

    public static final long c0(long j, long j2) {
        boolean z;
        boolean z2;
        int d2;
        boolean z3;
        boolean z4;
        boolean z5;
        int f = d92.f(j);
        int e = d92.e(j);
        boolean z6 = false;
        if (d92.f(j2) < d92.e(j)) {
            z = true;
        } else {
            z = false;
        }
        if (d92.f(j) < d92.e(j2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z & z2) {
            if (d92.f(j2) <= d92.f(j)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (d92.e(j) <= d92.e(j2)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 & z4) {
                f = d92.f(j2);
                e = f;
            } else {
                if (d92.f(j) <= d92.f(j2)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (d92.e(j2) <= d92.e(j)) {
                    z6 = true;
                }
                if (z5 & z6) {
                    d2 = d92.d(j2);
                } else {
                    int f2 = d92.f(j2);
                    if (f < d92.e(j2) && f2 <= f) {
                        f = d92.f(j2);
                        d2 = d92.d(j2);
                    } else {
                        e = d92.f(j2);
                    }
                }
                e -= d2;
            }
        } else if (e > d92.f(j2)) {
            f -= d92.d(j2);
            d2 = d92.d(j2);
            e -= d2;
        }
        return fr1.a(f, e);
    }

    public static final void d(boolean z, se0 se0Var, ur urVar, int i) {
        int i2;
        int i3;
        urVar.Y(1818896922);
        if (urVar.g(z)) {
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
        if ((i5 & 19) == 18 && urVar.A()) {
            urVar.R();
        } else {
            io.h(z, se0Var, urVar, i5 & WebSocketProtocol.PAYLOAD_SHORT);
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new eu(z, se0Var, i);
        }
    }

    public static final float e(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final String f(Object[] objArr, int i, int i2, d0 d0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == d0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final void g(o31 o31Var, int i) {
        if (o31Var.b != 0 && (o31Var.c(0) == i || o31Var.c(o31Var.b - 1) == i)) {
            return;
        }
        int i2 = o31Var.b;
        o31Var.a(i);
        while (i2 > 0) {
            int i3 = ((i2 + 1) >>> 1) - 1;
            int c2 = o31Var.c(i3);
            if (i <= c2) {
                break;
            }
            o31Var.f(i2, c2);
            i2 = i3;
        }
        o31Var.f(i2, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(11:18|19|20|21|22|23|24|25|(3:27|28|29)|13|14))(6:92|(1:94)|95|96|97|(11:99|100|(1:102)(1:105)|103|104|23|24|25|(0)|13|14)(2:106|107))))|113|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00f8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00c5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd A[Catch: do0 -> 0x01a1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {do0 -> 0x01a1, blocks: (B:25:0x00bf, B:32:0x00dd, B:39:0x0102, B:41:0x0116, B:44:0x012b, B:47:0x0133), top: B:24:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, ul1] */
    /* JADX WARN: Type inference failed for: r20v1, types: [tl1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [sl1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, wl1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x017c -> B:22:0x0185). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.ot0 r27, int r28, int r29, defpackage.c00 r30, defpackage.wt r31) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo.h(ot0, int, int, c00, wt):java.lang.Object");
    }

    public static final boolean i(boolean z, ot0 ot0Var, int i) {
        if (z) {
            if (ot0Var.c() <= i) {
                if (ot0Var.c() == i && ot0Var.d() > 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        if (ot0Var.c() >= i) {
            if (ot0Var.c() == i && ot0Var.d() < 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static float j(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        if (f7 < 0.0f) {
            return -f7;
        }
        return f7;
    }

    public static final al1 k(ey1 ey1Var) {
        ey1Var.getClass();
        return new al1(ey1Var);
    }

    public static final bl1 l(k12 k12Var) {
        k12Var.getClass();
        return new bl1(k12Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ir, wk1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [p3] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List m(jz1 jz1Var, Integer num, int i, Integer num2) {
        int i2;
        int i3;
        int s;
        Object obj;
        int i4;
        b41 b41Var;
        if (!jz1Var.w && jz1Var.p() != 0) {
            ?? wk1Var = new wk1(jz1Var);
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = jz1Var.v;
                if (i2 < 0) {
                    i2 = jz1Var.E(jz1Var.b, i);
                }
            }
            if (num == 0) {
                int N = jz1Var.i - jz1Var.N(jz1Var.b, jz1Var.r(i));
                p31 p31Var = jz1Var.s;
                if (p31Var != null && (b41Var = (b41) p31Var.b(i)) != null) {
                    i4 = b41Var.b;
                } else {
                    i4 = 0;
                }
                num = Integer.valueOf(N + i4);
            }
            int r = jz1Var.r(i) * 5;
            int[] iArr = jz1Var.b;
            if (r < iArr.length) {
                s = jz1Var.s(i);
            } else {
                if (i2 >= 0) {
                    i3 = jz1Var.E(iArr, i2);
                } else {
                    i3 = i2;
                }
                s = jz1Var.s(i2);
                int i5 = i2;
                i2 = i3;
                i = i5;
            }
            while (i >= 0) {
                if ((jz1Var.b[(jz1Var.r(i) * 5) + 1] & FileSystemManager.MODE_WRITE_ONLY) != 0) {
                    obj = jz1Var.t(i);
                } else {
                    obj = or.a;
                }
                wk1Var.e(s, obj, jz1Var.O(i), num);
                num = jz1Var.b(i);
                if (i2 >= 0) {
                    int E = jz1Var.E(jz1Var.b, i2);
                    s = jz1Var.s(i2);
                    int i6 = i2;
                    i2 = E;
                    i = i6;
                } else {
                    i = i2;
                }
            }
            return (ArrayList) wk1Var.a;
        }
        return l60.e;
    }

    public static final float n(tx txVar, float f, float f2) {
        float f3;
        float f4;
        ga0 ga0Var = txVar.a;
        ic icVar = new ic(0.0f);
        int b2 = icVar.b();
        for (int i = 0; i < b2; i++) {
            if (i == 0) {
                f3 = f;
            } else {
                f3 = 0.0f;
            }
            if (i == 0) {
                f4 = f2;
            } else {
                f4 = 0.0f;
            }
            icVar.e(i, ga0Var.i(f3, f4));
        }
        return icVar.a;
    }

    public static final void o(xu xuVar, CancellationException cancellationException) {
        go0 go0Var = (go0) xuVar.H(g3.O);
        if (go0Var != null) {
            go0Var.c(cancellationException);
        }
    }

    public static final o41 p(va0 va0Var, Object obj, wu0 wu0Var, nu0 nu0Var, xu xuVar, ur urVar, int i) {
        boolean z;
        Object[] objArr = {va0Var, wu0Var, nu0Var, xuVar};
        boolean h = urVar.h(wu0Var);
        if ((((i & 7168) ^ 3072) > 2048 && urVar.d(nu0Var.ordinal())) || (i & 3072) == 2048) {
            z = true;
        } else {
            z = false;
        }
        boolean h2 = z | h | urVar.h(xuVar) | urVar.h(va0Var);
        Object L = urVar.L();
        Object obj2 = or.a;
        if (h2 || L == obj2) {
            Object z7Var = new z7(wu0Var, nu0Var, xuVar, va0Var, null, 4);
            urVar.h0(z7Var);
            L = z7Var;
        }
        se0 se0Var = (se0) L;
        Object L2 = urVar.L();
        if (L2 == obj2) {
            L2 = fr1.k(obj);
            urVar.h0(L2);
        }
        o41 o41Var = (o41) L2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h3 = urVar.h(se0Var);
        Object L3 = urVar.L();
        if (h3 || L3 == obj2) {
            L3 = new y02(se0Var, o41Var, null, 3);
            urVar.h0(L3);
        }
        se0 se0Var2 = (se0) L3;
        xu xuVar2 = urVar.R;
        boolean z2 = false;
        for (Object obj3 : Arrays.copyOf(copyOf, copyOf.length)) {
            z2 |= urVar.f(obj3);
        }
        Object L4 = urVar.L();
        if (!z2 && L4 != obj2) {
            return o41Var;
        }
        urVar.h0(new eq0(xuVar2, se0Var2));
        return o41Var;
    }

    public static final o41 q(p22 p22Var, ur urVar) {
        return p(p22Var, p22Var.getValue(), ((uu0) urVar.j(bx0.a)).g(), nu0.h, j60.e, urVar, 0);
    }

    public static final long r(long j, float f) {
        return ha0.a(G(j) / f, H(j) / f);
    }

    public static final float s(long j, long j2) {
        return (H(j2) * H(j)) + (G(j2) * G(j));
    }

    public static final float t(uy uyVar) {
        if (uyVar.n().e == sb1.f) {
            return Float.intBitsToFloat((int) (uyVar.r() >> 32));
        }
        return Float.intBitsToFloat((int) (uyVar.r() & 4294967295L));
    }

    public static final void u(xu xuVar) {
        go0 go0Var = (go0) xuVar.H(g3.O);
        if (go0Var != null && !go0Var.b()) {
            throw go0Var.o();
        }
    }

    public static final float v(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final tc0 w(tc0 tc0Var) {
        tc0 f = ((mc0) ((q5) hp.N(tc0Var)).getFocusOwner()).f();
        if (f != null && f.r) {
            return f;
        }
        return null;
    }

    public static final Integer x(fz1 fz1Var, xr xrVar, int i, int i2) {
        Integer x;
        hm1 hm1Var;
        Object obj;
        int[] iArr = fz1Var.b;
        while (true) {
            rr rrVar = null;
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (fz1Var.j(i) && fz1Var.i(i) == 206 && sn0.r(fz1Var.p(iArr, i), vr.e)) {
                Object h = fz1Var.h(i, 0);
                if (h instanceof hm1) {
                    hm1Var = (hm1) h;
                } else {
                    hm1Var = null;
                }
                if (hm1Var != null) {
                    obj = hm1Var.a;
                } else {
                    obj = null;
                }
                if (obj instanceof rr) {
                    rrVar = (rr) obj;
                }
                if (rrVar != null && rrVar.e == xrVar) {
                    return Integer.valueOf(i);
                }
            }
            if (fz1Var.d(i) && (x = x(fz1Var, xrVar, i + 1, i3)) != null) {
                return Integer.valueOf(x.intValue());
            }
            i = i3;
        }
    }

    public static final pl1 y(tc0 tc0Var) {
        e81 e81Var;
        if (tc0Var.r && (e81Var = tc0Var.l) != null) {
            iq0 D = qo.D(e81Var);
            if (!D.j()) {
                D = null;
            }
            if (D != null) {
                return tc0Var.O0(D);
            }
        }
        return pl1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.tc0 z(defpackage.tc0 r8) {
        /*
            d21 r0 = r8.e
            boolean r0 = r0.r
            r1 = 0
            if (r0 != 0) goto L9
            goto Laa
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.kl0.b(r0)
        L10:
            q41 r0 = new q41
            r2 = 16
            d21[] r3 = new defpackage.d21[r2]
            r0.<init>(r3)
            d21 r8 = r8.e
            d21 r3 = r8.j
            if (r3 != 0) goto L23
            defpackage.hp.i(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.g
            if (r8 == 0) goto Laa
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.k(r8)
            d21 r8 = (defpackage.d21) r8
            int r3 = r8.h
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            defpackage.hp.i(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.g
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La7
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof defpackage.tc0
            r5 = 1
            if (r4 == 0) goto L6c
            tc0 r8 = (defpackage.tc0) r8
            d21 r4 = r8.e
            boolean r4 = r4.r
            if (r4 == 0) goto La2
            sc0 r4 = r8.Q0()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L6b
            r5 = 2
            if (r4 == r5) goto L6b
            r8 = 3
            if (r4 != r8) goto L67
            goto La2
        L67:
            defpackage.se.m()
            return r1
        L6b:
            return r8
        L6c:
            int r4 = r8.g
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La2
            boolean r4 = r8 instanceof defpackage.rz
            if (r4 == 0) goto La2
            r4 = r8
            rz r4 = (defpackage.rz) r4
            d21 r4 = r4.t
            r6 = 0
        L7c:
            if (r4 == 0) goto L9f
            int r7 = r4.g
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9c
            int r6 = r6 + 1
            if (r6 != r5) goto L8a
            r8 = r4
            goto L9c
        L8a:
            if (r3 != 0) goto L93
            q41 r3 = new q41
            d21[] r7 = new defpackage.d21[r2]
            r3.<init>(r7)
        L93:
            if (r8 == 0) goto L99
            r3.b(r8)
            r8 = r1
        L99:
            r3.b(r4)
        L9c:
            d21 r4 = r4.j
            goto L7c
        L9f:
            if (r6 != r5) goto La2
            goto L45
        La2:
            d21 r8 = defpackage.hp.l(r3)
            goto L45
        La7:
            d21 r8 = r8.j
            goto L3c
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo.z(tc0):tc0");
    }

    public abstract pl1 A();
}
