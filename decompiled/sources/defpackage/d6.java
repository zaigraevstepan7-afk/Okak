package defpackage;

import android.util.LongSparseArray;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import com.topjohnwu.superuser.internal.HiddenAPIs;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class d6 {
    public static final ad0 A;
    public static ij0 G;
    public static ij0 H;
    public static io1 k;
    public static final ad0 l;
    public static final ad0 m;
    public static final ad0 n;
    public static final ad0 o;
    public static final ad0 p;
    public static final ad0 z;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Object[] b = new Object[0];
    public static final fq c = new fq(-39202156, false, new le(12));
    public static final fq d = new fq(1582488484, false, new le(13));
    public static final fq e = new fq(414328099, false, new le(14));
    public static final fq f = new fq(-1514016380, false, new le(15));
    public static final hv g = hv.e;
    public static final d00 h = new d00(1.0f, 1.0f);
    public static final mw1 i = mw1.k;
    public static final float j = 40.0f;
    public static final g60 q = new g60(false);
    public static final g60 r = new g60(true);
    public static final no s = no.w;
    public static final float t = 3.0f;
    public static final mw1 u = mw1.g;
    public static final StackTraceElement[] v = new StackTraceElement[0];
    public static final ji0 w = new ji0(2);
    public static final no x = no.s;
    public static final long[] y = new long[0];
    public static final Object B = new Object();
    public static final Object C = new Object();
    public static final Object D = new Object();
    public static final Object E = new Object();
    public static final Object F = new Object();

    static {
        int i2 = 5;
        l = new ad0("COMPLETING_ALREADY", i2);
        m = new ad0("COMPLETING_WAITING_CHILDREN", i2);
        n = new ad0("COMPLETING_RETRY", i2);
        o = new ad0("TOO_LATE_TO_CANCEL", i2);
        p = new ad0("SEALED", i2);
        z = new ad0("NONE", i2);
        A = new ad0("PENDING", i2);
    }

    public static final y A(Object[] objArr) {
        objArr.getClass();
        return new y(objArr);
    }

    public static final e21 B(e21 e21Var, b8 b8Var, gu0 gu0Var, b82 b82Var) {
        return e21Var.d(new au0(b8Var, gu0Var, b82Var));
    }

    public static final e21 C(e21 e21Var, oe0 oe0Var) {
        return e21Var.d(new da1(oe0Var));
    }

    public static final r60 D(lb2 lb2Var, oe0 oe0Var, Object obj, ur urVar) {
        urVar.V(-422486745, lb2Var);
        boolean g2 = lb2Var.g();
        ir irVar = lb2Var.a;
        r60 r60Var = r60.e;
        r60 r60Var2 = r60.g;
        r60 r60Var3 = r60.f;
        if (g2) {
            urVar.X(-212166497);
            urVar.p(false);
            if (((Boolean) oe0Var.invoke(obj)).booleanValue()) {
                r60Var = r60Var3;
            } else if (((Boolean) oe0Var.invoke(irVar.c())).booleanValue()) {
                r60Var = r60Var2;
            }
        } else {
            urVar.X(-211892364);
            Object L = urVar.L();
            if (L == or.a) {
                L = fr1.k(Boolean.FALSE);
                urVar.h0(L);
            }
            o41 o41Var = (o41) L;
            if (((Boolean) oe0Var.invoke(irVar.c())).booleanValue()) {
                o41Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) oe0Var.invoke(obj)).booleanValue()) {
                r60Var = r60Var3;
            } else if (((Boolean) o41Var.getValue()).booleanValue()) {
                r60Var = r60Var2;
            }
            urVar.p(false);
        }
        urVar.p(false);
        return r60Var;
    }

    public static final Object[] E(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] F(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i3] = null;
                            return objArr;
                        }
                        return Arrays.copyOf(objArr2, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return objArr;
    }

    public static final Object G(Object obj) {
        sj0 sj0Var;
        rj0 rj0Var;
        if (obj instanceof sj0) {
            sj0Var = (sj0) obj;
        } else {
            sj0Var = null;
        }
        if (sj0Var != null && (rj0Var = sj0Var.a) != null) {
            return rj0Var;
        }
        return obj;
    }

    public static final void a(lb2 lb2Var, oe0 oe0Var, e21 e21Var, c70 c70Var, u70 u70Var, se0 se0Var, fq fqVar, ur urVar, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ec2 ec2Var;
        Object obj;
        lb2 lb2Var2;
        boolean z9;
        hb2 hb2Var;
        hb2 hb2Var2;
        hb2 hb2Var3;
        boolean z10;
        boolean z11;
        boolean z12;
        hb2 hb2Var4;
        boolean z13;
        hb2 hb2Var5;
        hb2 hb2Var6;
        hb2 hb2Var7;
        hb2 hb2Var8;
        u70 u70Var2;
        c70 c70Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        fq fqVar2 = fqVar;
        urVar.Y(1912839215);
        if ((i2 & 6) == 0) {
            if (urVar.f(lb2Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.h(oe0Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        if ((i2 & 384) == 0) {
            if (urVar.f(e21Var)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        if ((i2 & 3072) == 0) {
            if (urVar.f(c70Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i2 & 24576) == 0) {
            if (urVar.f(u70Var)) {
                i8 = 16384;
            } else {
                i8 = SharedConstants.DefaultBufferSize;
            }
            i3 |= i8;
        }
        if ((196608 & i2) == 0) {
            if (urVar.h(se0Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        int i13 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            if (urVar.h(fqVar2)) {
                i6 = 8388608;
            } else {
                i6 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i13 |= i6;
        }
        int i14 = i13;
        if ((4793491 & i14) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i14 & 1, z2)) {
            je1 je1Var = lb2Var.d;
            ir irVar = lb2Var.a;
            if (!((Boolean) oe0Var.invoke(je1Var.getValue())).booleanValue() && !((Boolean) oe0Var.invoke(irVar.c())).booleanValue() && !lb2Var.g() && !lb2Var.d()) {
                urVar.X(-272333293);
                urVar.p(false);
            } else {
                urVar.X(-232413539);
                int i15 = i14 & 14;
                int i16 = i15 | 48;
                int i17 = i16 & 14;
                if (((i17 ^ 6) > 4 && urVar.f(lb2Var)) || (i16 & 6) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object L = urVar.L();
                boolean z14 = z3;
                Object obj2 = or.a;
                if (z14 || L == obj2) {
                    L = irVar.c();
                    urVar.h0(L);
                }
                if (lb2Var.g()) {
                    L = irVar.c();
                }
                urVar.X(1844425648);
                r60 D2 = D(lb2Var, oe0Var, L, urVar);
                urVar.p(false);
                Object value = lb2Var.d.getValue();
                urVar.X(1844425648);
                r60 D3 = D(lb2Var, oe0Var, value, urVar);
                urVar.p(false);
                int i18 = i17 | 3072;
                nv1 nv1Var = qb2.a;
                int i19 = (i18 & 14) ^ 6;
                if ((i19 > 4 && urVar.f(lb2Var)) || (i18 & 6) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object L2 = urVar.L();
                if (!z4 && L2 != obj2) {
                    i4 = i18;
                    i5 = i14;
                } else {
                    i4 = i18;
                    i5 = i14;
                    L2 = new lb2(new p41(D2), lb2Var, l90.p(new StringBuilder(), lb2Var.c, " > EnterExitTransition"));
                    urVar.h0(L2);
                }
                lb2 lb2Var3 = (lb2) L2;
                if ((i19 > 4 && urVar.f(lb2Var)) || (i4 & 6) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean f2 = z5 | urVar.f(lb2Var3);
                Object L3 = urVar.L();
                if (f2 || L3 == obj2) {
                    L3 = new fl1(10, lb2Var, lb2Var3);
                    urVar.h0(L3);
                }
                bf.d(lb2Var3, (oe0) L3, urVar);
                if (lb2Var.g()) {
                    lb2Var3.k(D2, D3);
                } else {
                    lb2Var3.p(D3);
                    lb2Var3.k.setValue(Boolean.FALSE);
                }
                Object p2 = fr1.p(se0Var, urVar);
                ir irVar2 = lb2Var3.a;
                ir irVar3 = lb2Var3.a;
                je1 je1Var2 = lb2Var3.d;
                Object invoke = se0Var.invoke(irVar2.c(), je1Var2.getValue());
                boolean f3 = urVar.f(lb2Var3) | urVar.f(p2);
                Object L4 = urVar.L();
                vt vtVar = null;
                if (f3 || L4 == obj2) {
                    L4 = new l(lb2Var3, p2, vtVar, 5);
                    urVar.h0(L4);
                }
                se0 se0Var2 = (se0) L4;
                Object L5 = urVar.L();
                if (L5 == obj2) {
                    L5 = fr1.k(invoke);
                    urVar.h0(L5);
                }
                o41 o41Var = (o41) L5;
                boolean h2 = urVar.h(se0Var2);
                Object L6 = urVar.L();
                if (h2 || L6 == obj2) {
                    L6 = new y02(se0Var2, o41Var, vtVar, 0);
                    urVar.h0(L6);
                }
                bf.i(urVar, (se0) L6, od2.a);
                Object c2 = irVar3.c();
                r60 r60Var = r60.g;
                if (c2 == r60Var && je1Var2.getValue() == r60Var && ((Boolean) o41Var.getValue()).booleanValue()) {
                    urVar.X(-272333293);
                    urVar.p(false);
                    z9 = false;
                    fqVar2 = fqVar;
                } else {
                    urVar.X(-231383533);
                    if (i15 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    Object L7 = urVar.L();
                    if (z6 || L7 == obj2) {
                        L7 = new ac();
                        urVar.h0(L7);
                    }
                    ac acVar = (ac) L7;
                    ec2 ec2Var2 = x60.a;
                    ec2 ec2Var3 = f2.G;
                    Object L8 = urVar.L();
                    if (L8 == obj2) {
                        L8 = hs.j;
                        urVar.h0(L8);
                    }
                    de0 de0Var = (de0) L8;
                    boolean f4 = urVar.f(lb2Var3);
                    Object L9 = urVar.L();
                    if (f4 || L9 == obj2) {
                        L9 = fr1.k(c70Var);
                        urVar.h0(L9);
                    }
                    o41 o41Var2 = (o41) L9;
                    Object c3 = irVar3.c();
                    Object value2 = je1Var2.getValue();
                    r60 r60Var2 = r60.f;
                    if (c3 == value2 && irVar3.c() == r60Var2) {
                        if (lb2Var3.g()) {
                            o41Var2.setValue(c70Var);
                        } else {
                            o41Var2.setValue(c70.b);
                        }
                    } else if (je1Var2.getValue() == r60Var2) {
                        o41Var2.setValue(((c70) o41Var2.getValue()).a(c70Var));
                    }
                    c70 c70Var3 = (c70) o41Var2.getValue();
                    boolean f5 = urVar.f(lb2Var3);
                    Object L10 = urVar.L();
                    if (f5 || L10 == obj2) {
                        L10 = fr1.k(u70Var);
                        urVar.h0(L10);
                    }
                    o41 o41Var3 = (o41) L10;
                    if (irVar3.c() == je1Var2.getValue() && irVar3.c() == r60Var2) {
                        if (lb2Var3.g()) {
                            o41Var3.setValue(u70Var);
                        } else {
                            o41Var3.setValue(u70.b);
                        }
                    } else if (je1Var2.getValue() != r60Var2) {
                        o41Var3.setValue(((u70) o41Var3.getValue()).a(u70Var));
                    }
                    u70 u70Var3 = (u70) o41Var3.getValue();
                    nb2 nb2Var = c70Var3.a;
                    nb2 nb2Var2 = u70Var3.a;
                    ly1 ly1Var = nb2Var.b;
                    bm bmVar = nb2Var.c;
                    if (ly1Var == null && nb2Var2.b == null) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (bmVar == null && nb2Var2.c == null) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (z7) {
                        urVar.X(133792645);
                        Object L11 = urVar.L();
                        if (L11 == obj2) {
                            L11 = "Built-in slide";
                            urVar.h0("Built-in slide");
                        }
                        String str = (String) L11;
                        obj = obj2;
                        lb2Var2 = lb2Var3;
                        z9 = false;
                        hb2 b2 = qb2.b(lb2Var2, ec2Var3, str, urVar, 384, 0);
                        ec2Var = ec2Var3;
                        urVar.p(false);
                        hb2Var = b2;
                    } else {
                        ec2Var = ec2Var3;
                        obj = obj2;
                        lb2Var2 = lb2Var3;
                        z9 = false;
                        urVar.X(133898448);
                        urVar.p(false);
                        hb2Var = null;
                    }
                    if (z8) {
                        urVar.X(133990239);
                        ec2 ec2Var4 = f2.H;
                        Object L12 = urVar.L();
                        if (L12 == obj) {
                            L12 = "Built-in shrink/expand";
                            urVar.h0("Built-in shrink/expand");
                        }
                        hb2 b3 = qb2.b(lb2Var2, ec2Var4, (String) L12, urVar, 384, 0);
                        urVar.p(z9);
                        hb2Var2 = b3;
                    } else {
                        urVar.X(134101063);
                        urVar.p(z9);
                        hb2Var2 = null;
                    }
                    if (z8) {
                        urVar.X(134174689);
                        Object L13 = urVar.L();
                        if (L13 == obj) {
                            L13 = "Built-in InterruptionHandlingOffset";
                            urVar.h0("Built-in InterruptionHandlingOffset");
                        }
                        hb2 b4 = qb2.b(lb2Var2, ec2Var, (String) L13, urVar, 384, 0);
                        urVar.p(z9);
                        hb2Var3 = b4;
                    } else {
                        urVar.X(134345095);
                        urVar.p(z9);
                        hb2Var3 = null;
                    }
                    boolean z15 = !z8;
                    float[] fArr = so.a;
                    urVar.X(135150476);
                    urVar.p(z9);
                    ec2 ec2Var5 = f2.A;
                    if (nb2Var.a == null && nb2Var2.a == null) {
                        z10 = z9;
                    } else {
                        z10 = true;
                    }
                    if (nb2Var.d == null && nb2Var2.d == null) {
                        z11 = z9;
                    } else {
                        z11 = true;
                    }
                    if (z10) {
                        urVar.X(-703879421);
                        Object L14 = urVar.L();
                        if (L14 == obj) {
                            L14 = "Built-in alpha";
                            urVar.h0("Built-in alpha");
                        }
                        z12 = z15;
                        hb2 b5 = qb2.b(lb2Var2, ec2Var5, (String) L14, urVar, 384, 0);
                        urVar.p(z9);
                        hb2Var4 = b5;
                    } else {
                        z12 = z15;
                        urVar.X(-703709976);
                        urVar.p(z9);
                        hb2Var4 = null;
                    }
                    if (z11) {
                        urVar.X(-703642333);
                        Object L15 = urVar.L();
                        if (L15 == obj) {
                            L15 = "Built-in scale";
                            urVar.h0("Built-in scale");
                        }
                        z13 = z11;
                        hb2Var5 = hb2Var4;
                        hb2 b6 = qb2.b(lb2Var2, ec2Var5, (String) L15, urVar, 384, 0);
                        urVar.p(z9);
                        hb2Var6 = b6;
                    } else {
                        z13 = z11;
                        hb2Var5 = hb2Var4;
                        urVar.X(-703472888);
                        urVar.p(z9);
                        hb2Var6 = null;
                    }
                    if (z13) {
                        urVar.X(-703395232);
                        hb2Var7 = hb2Var6;
                        hb2Var8 = qb2.b(lb2Var2, x60.a, "TransformOriginInterruptionHandling", urVar, 384, 0);
                        urVar.p(z9);
                    } else {
                        hb2Var7 = hb2Var6;
                        urVar.X(-703222904);
                        urVar.p(z9);
                        hb2Var8 = null;
                    }
                    boolean h3 = urVar.h(hb2Var5) | urVar.f(c70Var3) | urVar.f(u70Var3) | urVar.h(hb2Var7) | urVar.f(lb2Var2) | urVar.h(hb2Var8);
                    Object L16 = urVar.L();
                    if (!h3 && L16 != obj) {
                        u70Var2 = u70Var3;
                        c70Var2 = c70Var3;
                    } else {
                        u70Var2 = u70Var3;
                        c70Var2 = c70Var3;
                        L16 = new t60(hb2Var5, hb2Var7, lb2Var2, c70Var2, u70Var2, hb2Var8);
                        urVar.h0(L16);
                    }
                    t60 t60Var = (t60) L16;
                    boolean g2 = urVar.g(z12) | urVar.f(de0Var);
                    Object L17 = urVar.L();
                    if (g2 || L17 == obj) {
                        L17 = new v60(z12, de0Var);
                        urVar.h0(L17);
                    }
                    b21 b21Var = b21.a;
                    e21 d2 = x(b21Var, (oe0) L17).d(new s60(lb2Var2, hb2Var2, hb2Var3, hb2Var, c70Var2, u70Var2, de0Var, t60Var)).d(b21Var);
                    urVar.X(-7432681);
                    urVar.p(z9);
                    e21 d3 = e21Var.d(d2.d(b21Var));
                    Object L18 = urVar.L();
                    if (L18 == obj) {
                        L18 = new qb(acVar);
                        urVar.h0(L18);
                    }
                    qb qbVar = (qb) L18;
                    int hashCode = Long.hashCode(urVar.T);
                    sf1 l2 = urVar.l();
                    e21 Q = fp.Q(urVar, d3);
                    lr.b.getClass();
                    de0 de0Var2 = kr.b;
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(de0Var2);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, kr.f, qbVar);
                    op1.q(urVar, kr.e, l2);
                    op1.l(urVar, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar, kr.h);
                    op1.q(urVar, kr.d, Q);
                    fqVar2 = fqVar;
                    fqVar2.invoke(acVar, urVar, Integer.valueOf((i5 >> 18) & 112));
                    urVar.p(true);
                    urVar.p(z9);
                }
                urVar.p(z9);
            }
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new vb(lb2Var, oe0Var, e21Var, c70Var, u70Var, se0Var, fqVar2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r32, defpackage.e21 r33, defpackage.c70 r34, defpackage.u70 r35, java.lang.String r36, defpackage.fq r37, defpackage.ur r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6.b(boolean, e21, c70, u70, java.lang.String, fq, ur, int, int):void");
    }

    public static final void c(lb2 lb2Var, oe0 oe0Var, c70 c70Var, u70 u70Var, fq fqVar, ur urVar, int i2) {
        int i3;
        c70 c70Var2;
        u70 u70Var2;
        fq fqVar2;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        urVar.Y(1706321816);
        if ((i2 & 6) == 0) {
            if (urVar.f(lb2Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.h(oe0Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        int i10 = i2 & 384;
        b21 b21Var = b21.a;
        if (i10 == 0) {
            if (urVar.f(b21Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            c70Var2 = c70Var;
            if (urVar.f(c70Var2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        } else {
            c70Var2 = c70Var;
        }
        if ((i2 & 24576) == 0) {
            u70Var2 = u70Var;
            if (urVar.f(u70Var2)) {
                i5 = 16384;
            } else {
                i5 = SharedConstants.DefaultBufferSize;
            }
            i3 |= i5;
        } else {
            u70Var2 = u70Var;
        }
        if ((i2 & 196608) == 0) {
            fqVar2 = fqVar;
            if (urVar.h(fqVar2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        } else {
            fqVar2 = fqVar;
        }
        boolean z4 = false;
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i3 & 1, z2)) {
            int i11 = i3 & 112;
            if (i11 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i12 = i3 & 14;
            if (i12 == 4) {
                z4 = true;
            }
            boolean z5 = z3 | z4;
            Object L = urVar.L();
            Object obj = or.a;
            if (z5 || L == obj) {
                L = new xb(oe0Var, lb2Var);
                urVar.h0(L);
            }
            e21 D2 = mp0.D(b21Var, (te0) L);
            Object L2 = urVar.L();
            if (L2 == obj) {
                L2 = gb.g;
                urVar.h0(L2);
            }
            c70 c70Var3 = c70Var2;
            a(lb2Var, oe0Var, D2, c70Var3, u70Var2, (se0) L2, fqVar2, urVar, ((i3 << 6) & 29360128) | i12 | 196608 | i11 | (i3 & 7168) | (57344 & i3));
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new yb(lb2Var, oe0Var, c70Var, u70Var, fqVar, i2);
        }
    }

    public static final void d(boolean z2, oe0 oe0Var, h32 h32Var, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        ur urVar2;
        oe0Var.getClass();
        h32Var.getClass();
        urVar.Y(-242768750);
        if (urVar.g(z2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (urVar.h(oe0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (urVar.f(h32Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i8 & 1, z3)) {
            urVar2 = urVar;
            rx.c(sn0.L(hy1.b(b21.a, 1.0f), 16.0f, 8.0f), lp1.a(24.0f), r(((mo) urVar.j(oo.a)).F, 0L, urVar, 14), s(62, 0.0f), go.N(-156899360, new g80(3, oe0Var, h32Var, z2), urVar2), urVar2, 196614, 16);
        } else {
            urVar2 = urVar;
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new b80(z2, oe0Var, h32Var, i2);
        }
    }

    public static final void e(final String str, final long j2, final long j3, ur urVar, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        urVar.Y(-2058003289);
        if (urVar.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (urVar.e(j2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (urVar.e(j3)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i8 & 1, z2)) {
            int i9 = i8 << 3;
            l42.a(null, lp1.a(12.0f), j2, j3, 0.0f, 0.0f, go.N(758560492, new nd(str, 9), urVar), urVar, (i9 & 896) | 12582912 | (i9 & 7168), 113);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new se0(str, j2, j3, i2) { // from class: nf2
                public final /* synthetic */ String e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(1);
                    d6.e(this.e, this.f, this.g, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:74|(2:116|117)|76|(11:115|79|(1:114)(1:83)|84|(6:104|105|106|107|108|109)|88|89|90|91|(1:93)(1:101)|94)|78|79|(1:81)|112|114|84|(1:86)|104|105|106|107|108|109|88|89|90|91|(0)(0)|94) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e5, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x018e, code lost:
    
        if (r26.f(r21) == false) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final java.lang.String r19, final defpackage.e21 r20, final defpackage.k92 r21, int r22, boolean r23, final int r24, int r25, defpackage.ur r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6.f(java.lang.String, e21, k92, int, boolean, int, int, ur, int, int):void");
    }

    public static final void g(String str, h32 h32Var, ur urVar, int i2) {
        int i3;
        int i4;
        boolean z2;
        String str2;
        String str3 = str;
        ur urVar2 = urVar;
        urVar2.Y(878572933);
        if (urVar2.f(str3)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (urVar2.f(h32Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i6 & 1, z2)) {
            e21 K = sn0.K(hy1.c, 24.0f);
            j01 d2 = hj.d(g3.j, false);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q = fp.Q(urVar2, K);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar2, gbVar, d2);
            gb gbVar2 = kr.e;
            op1.q(urVar2, gbVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            gb gbVar3 = kr.g;
            op1.l(urVar2, valueOf, gbVar3);
            i5 i5Var = kr.h;
            op1.o(urVar2, i5Var);
            gb gbVar4 = kr.d;
            op1.q(urVar2, gbVar4, Q);
            yo a2 = wo.a(c01.g, g3.s, urVar2, 48);
            int hashCode2 = Long.hashCode(urVar2.T);
            sf1 l3 = urVar2.l();
            b21 b21Var = b21.a;
            e21 Q2 = fp.Q(urVar2, b21Var);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, a2);
            op1.q(urVar2, gbVar2, l3);
            l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q2);
            ij0 n2 = rp1.n();
            String g2 = h32Var.g();
            y22 y22Var = oo.a;
            ej0.a(n2, g2, hy1.f(b21Var, 64.0f), ((mo) urVar2.j(y22Var)).w, urVar2, 384, 0);
            xp1.a(urVar2, hy1.c(b21Var, 16.0f));
            switch (h32Var.a) {
                case 0:
                    str2 = "Oops!";
                    break;
                case 1:
                    str2 = "Ops!";
                    break;
                case 2:
                    str2 = "Упс!";
                    break;
                case 3:
                    str2 = "Ой!";
                    break;
                default:
                    str2 = "哎呀！";
                    break;
            }
            y22 y22Var2 = rc2.a;
            t82.b(str2, null, ((mo) urVar2.j(y22Var)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar2.j(y22Var2)).f, urVar, 0, 0, 131066);
            xp1.a(urVar, hy1.c(b21Var, 8.0f));
            str3 = str;
            t82.b(str3, null, ((mo) urVar.j(y22Var)).s, 0L, null, null, 0L, new b62(3), 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var2)).j, urVar, i6 & 14, 0, 130042);
            urVar2 = urVar;
            urVar2.p(true);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new xx1(str3, i2, 6, h32Var);
        }
    }

    public static final void h(d91 d91Var, i3 i3Var, fq fqVar, ur urVar, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean h2;
        int i6;
        urVar.Y(-1090171650);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = urVar.f(d91Var);
            } else {
                h2 = urVar.h(d91Var);
            }
            if (h2) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.f(i3Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (urVar.h(fqVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        boolean z4 = true;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i3 & 1, z2)) {
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !urVar.f(d91Var))) {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object L = urVar.L();
            if (z5 || L == or.a) {
                L = new ig0(i3Var, d91Var);
                urVar.h0(L);
            }
            c9.a((ig0) L, null, new ci1(false, ct1.e, false), fqVar, urVar, ((i3 << 3) & 7168) | 384, 2);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new h9(d91Var, i3Var, fqVar, i2, 0);
        }
    }

    public static final void i(h32 h32Var, ur urVar, int i2) {
        int i3;
        boolean z2;
        String str;
        ur urVar2 = urVar;
        urVar2.Y(-1246750830);
        if (urVar2.f(h32Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i4 = i2 | i3;
        if ((i4 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i4 & 1, z2)) {
            p90 p90Var = hy1.c;
            j01 d2 = hj.d(g3.j, false);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q = fp.Q(urVar2, p90Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar2, gbVar, d2);
            gb gbVar2 = kr.e;
            op1.q(urVar2, gbVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            gb gbVar3 = kr.g;
            op1.l(urVar2, valueOf, gbVar3);
            i5 i5Var = kr.h;
            op1.o(urVar2, i5Var);
            gb gbVar4 = kr.d;
            op1.q(urVar2, gbVar4, Q);
            yo a2 = wo.a(c01.g, g3.s, urVar2, 48);
            int hashCode2 = Long.hashCode(urVar2.T);
            sf1 l3 = urVar2.l();
            b21 b21Var = b21.a;
            e21 Q2 = fp.Q(urVar2, b21Var);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, a2);
            op1.q(urVar2, gbVar2, l3);
            l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q2);
            urVar2.X(2010515696);
            gh2.b(hy1.j(b21Var, 220.0f), 0L, 0L, null, null, 0.0f, 0.0f, 0.0f, 0.0f, urVar2, 6);
            urVar2.p(false);
            xp1.a(urVar2, hy1.c(b21Var, 16.0f));
            switch (h32Var.a) {
                case 0:
                    str = "Loading...";
                    break;
                case 1:
                    str = "Carregando...";
                    break;
                case 2:
                    str = "Загрузка...";
                    break;
                case 3:
                    str = "Завантаження...";
                    break;
                default:
                    str = "加载中...";
                    break;
            }
            t82.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar2.j(rc2.a)).h, urVar, 0, 0, 131070);
            urVar2 = urVar;
            urVar2.p(true);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new sd(h32Var, i2, 18);
        }
    }

    public static final r22 j(Object obj) {
        if (obj == null) {
            obj = c01.p;
        }
        return new r22(obj);
    }

    public static final void k(final d91 d91Var, final boolean z2, final um1 um1Var, final boolean z3, long j2, final float f2, final e21 e21Var, ur urVar, final int i2) {
        int i3;
        boolean z4;
        final long j3;
        int i4;
        long j4;
        boolean z5;
        final boolean z6;
        hi hiVar;
        boolean z7;
        boolean z8;
        boolean z9;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h2;
        int i9;
        urVar.Y(-466280168);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = urVar.f(d91Var);
            } else {
                h2 = urVar.h(d91Var);
            }
            if (h2) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.g(z2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (urVar.d(um1Var.ordinal())) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (urVar.g(z3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            i3 |= SharedConstants.DefaultBufferSize;
        }
        if ((1572864 & i2) == 0) {
            if (urVar.f(e21Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((533651 & i3) != 533650) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (urVar.O(i3 & 1, z4)) {
            urVar.T();
            if ((i2 & 1) != 0 && !urVar.y()) {
                urVar.R();
                i4 = i3 & (-57345);
                j4 = j2;
            } else {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            }
            urVar.q();
            um1 um1Var2 = um1.f;
            um1 um1Var3 = um1.e;
            if (z2) {
                zu1 zu1Var = gu1.a;
                if ((um1Var == um1Var3 && !z3) || (um1Var == um1Var2 && z3)) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z6 = z9;
            } else {
                zu1 zu1Var2 = gu1.a;
                if ((um1Var == um1Var3 && !z3) || (um1Var == um1Var2 && z3)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                hiVar = bf.b;
            } else {
                hiVar = bf.a;
            }
            int i10 = i4 & 14;
            if (i10 != 4 && ((i4 & 8) == 0 || !urVar.h(d91Var))) {
                z7 = false;
            } else {
                z7 = true;
            }
            if ((i4 & 112) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean g2 = z7 | z8 | urVar.g(z6);
            Object L = urVar.L();
            if (g2 || L == or.a) {
                L = new oe0() { // from class: j9
                    @Override // defpackage.oe0
                    public final Object invoke(Object obj) {
                        hg0 hg0Var;
                        eu1 eu1Var;
                        boolean z10;
                        av1 av1Var = (av1) obj;
                        long a2 = d91.this.a();
                        zu1 zu1Var3 = gu1.a;
                        if (z2) {
                            hg0Var = hg0.f;
                        } else {
                            hg0Var = hg0.g;
                        }
                        if (z6) {
                            eu1Var = eu1.e;
                        } else {
                            eu1Var = eu1.g;
                        }
                        eu1 eu1Var2 = eu1Var;
                        if ((9223372034707292159L & a2) != 9205357640488583168L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        av1Var.a(zu1Var3, new fu1(hg0Var, a2, eu1Var2, z10));
                        return od2.a;
                    }
                };
                urVar.h0(L);
            }
            final e21 a2 = ou1.a(e21Var, false, (oe0) L);
            final hg2 hg2Var = (hg2) urVar.j(is.s);
            long j5 = j4;
            hi hiVar2 = hiVar;
            j3 = j5;
            h(d91Var, hiVar2, go.N(1365123137, new se0() { // from class: k9
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    boolean z10;
                    ur urVar2 = (ur) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (urVar2.O(intValue & 1, z10)) {
                        zj1 a3 = is.s.a(hg2.this);
                        final long j6 = j3;
                        final boolean z11 = z6;
                        final e21 e21Var2 = a2;
                        final d91 d91Var2 = d91Var;
                        vn.b(a3, go.N(1260045569, new se0() { // from class: m9
                            @Override // defpackage.se0
                            public final Object invoke(Object obj3, Object obj4) {
                                boolean z12;
                                me meVar;
                                ur urVar3 = (ur) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                final int i11 = 1;
                                final int i12 = 0;
                                if ((intValue2 & 3) != 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (urVar3.O(intValue2 & 1, z12)) {
                                    long j7 = j6;
                                    boolean z13 = z11;
                                    e21 e21Var3 = e21Var2;
                                    final d91 d91Var3 = d91Var2;
                                    xl1 xl1Var = or.a;
                                    if (j7 != 9205357640488583168L) {
                                        urVar3.X(3458246);
                                        if (z13) {
                                            meVar = mp0.d;
                                        } else {
                                            meVar = mp0.c;
                                        }
                                        e21 e2 = hy1.e(e21Var3, j20.b(j7), j20.a(j7), 0.0f, 0.0f, 12);
                                        up1 a4 = tp1.a(meVar, g3.o, urVar3, 0);
                                        int hashCode = Long.hashCode(urVar3.T);
                                        sf1 l2 = urVar3.l();
                                        e21 Q = fp.Q(urVar3, e2);
                                        lr.b.getClass();
                                        hs hsVar = kr.b;
                                        urVar3.a0();
                                        if (urVar3.S) {
                                            urVar3.k(hsVar);
                                        } else {
                                            urVar3.k0();
                                        }
                                        op1.q(urVar3, kr.f, a4);
                                        op1.q(urVar3, kr.e, l2);
                                        op1.l(urVar3, Integer.valueOf(hashCode), kr.g);
                                        op1.o(urVar3, kr.h);
                                        op1.q(urVar3, kr.d, Q);
                                        boolean h3 = urVar3.h(d91Var3);
                                        Object L2 = urVar3.L();
                                        if (h3 || L2 == xl1Var) {
                                            L2 = new de0() { // from class: n9
                                                @Override // defpackage.de0
                                                public final Object invoke() {
                                                    int i13 = i12;
                                                    boolean z14 = false;
                                                    d91 d91Var4 = d91Var3;
                                                    switch (i13) {
                                                        case 0:
                                                            if ((9223372034707292159L & d91Var4.a()) != 9205357640488583168L) {
                                                                z14 = true;
                                                            }
                                                            return Boolean.valueOf(z14);
                                                        default:
                                                            if ((9223372034707292159L & d91Var4.a()) != 9205357640488583168L) {
                                                                z14 = true;
                                                            }
                                                            return Boolean.valueOf(z14);
                                                    }
                                                }
                                            };
                                            urVar3.h0(L2);
                                        }
                                        d6.l(b21.a, (de0) L2, z13, urVar3, 6);
                                        urVar3.p(true);
                                        urVar3.p(false);
                                    } else {
                                        urVar3.X(4389176);
                                        boolean h4 = urVar3.h(d91Var3);
                                        Object L3 = urVar3.L();
                                        if (h4 || L3 == xl1Var) {
                                            L3 = new de0() { // from class: n9
                                                @Override // defpackage.de0
                                                public final Object invoke() {
                                                    int i13 = i11;
                                                    boolean z14 = false;
                                                    d91 d91Var4 = d91Var3;
                                                    switch (i13) {
                                                        case 0:
                                                            if ((9223372034707292159L & d91Var4.a()) != 9205357640488583168L) {
                                                                z14 = true;
                                                            }
                                                            return Boolean.valueOf(z14);
                                                        default:
                                                            if ((9223372034707292159L & d91Var4.a()) != 9205357640488583168L) {
                                                                z14 = true;
                                                            }
                                                            return Boolean.valueOf(z14);
                                                    }
                                                }
                                            };
                                            urVar3.h0(L3);
                                        }
                                        d6.l(e21Var3, (de0) L3, z13, urVar3, 0);
                                        urVar3.p(false);
                                    }
                                } else {
                                    urVar3.R();
                                }
                                return od2.a;
                            }
                        }, urVar2), urVar2, 56);
                    } else {
                        urVar2.R();
                    }
                    return od2.a;
                }
            }, urVar), urVar, i10 | 384);
        } else {
            urVar.R();
            j3 = j2;
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            final long j6 = j3;
            r2.d = new se0() { // from class: l9
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d6.k(d91.this, z2, um1Var, z3, j6, f2, e21Var, (ur) obj, lo.b0(i2 | 1));
                    return od2.a;
                }
            };
        }
    }

    public static final void l(e21 e21Var, de0 de0Var, boolean z2, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        urVar.Y(2111672474);
        if ((i2 & 6) == 0) {
            if (urVar.f(e21Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if (urVar.h(de0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i3 | i4;
        if (urVar.g(z2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        int i9 = 0;
        if ((i8 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i8 & 1, z3)) {
            zu1 zu1Var = gu1.a;
            xp1.a(urVar, fp.t(hy1.g(e21Var, 25.0f, 25.0f), new p9(i9, de0Var, z2)));
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new o9(e21Var, de0Var, z2, i2);
        }
    }

    public static final void m(ij0 ij0Var, String str, long j2, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        ur urVar2 = urVar;
        str.getClass();
        urVar2.Y(-1660734617);
        if (urVar2.f(ij0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (urVar2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (urVar2.e(j2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i8 & 1, z2)) {
            up1 a2 = tp1.a(c01.e, g3.p, urVar2, 48);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            b21 b21Var = b21.a;
            e21 Q = fp.Q(urVar2, b21Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, kr.f, a2);
            op1.q(urVar2, kr.e, l2);
            op1.l(urVar2, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar2, kr.h);
            op1.q(urVar2, kr.d, Q);
            ej0.a(ij0Var, str, hy1.f(b21Var, 18.0f), j2, urVar2, (i8 & 14) | 384 | (i8 & 112) | ((i8 << 3) & 7168), 0);
            xp1.a(urVar2, hy1.j(b21Var, 6.0f));
            t82.b(str, null, j2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar2.j(rc2.a)).m, 0L, 0L, sd0.i, null, 0L, 0L, null, 16777211), urVar, ((i8 >> 3) & 14) | (i8 & 896), 0, 131066);
            urVar2 = urVar;
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new t6(ij0Var, str, j2, i2, 6);
        }
    }

    public static final void n(ef2 ef2Var, de0 de0Var, h32 h32Var, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        long j2;
        long j3;
        long j4;
        zi ziVar;
        float f2;
        ef2Var.getClass();
        boolean z3 = ef2Var.h;
        boolean z4 = ef2Var.j;
        de0Var.getClass();
        urVar.Y(1723299426);
        if (urVar.f(ef2Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (urVar.h(de0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (urVar.f(h32Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i8 & 1, z2)) {
            if (z4) {
                urVar.X(-1766619406);
                j2 = ((mo) urVar.j(oo.a)).c;
                urVar.p(false);
            } else if (z3) {
                urVar.X(-1766616971);
                j2 = ((mo) urVar.j(oo.a)).I;
                urVar.p(false);
            } else {
                urVar.X(-1766614862);
                j2 = ((mo) urVar.j(oo.a)).F;
                urVar.p(false);
            }
            o22 a2 = dy1.a(j2, mp0.M(0.0f, 200.0f, null, 5), "cardBg", urVar, 432, 8);
            if (z4) {
                urVar.X(-1766606572);
                j3 = ((mo) urVar.j(oo.a)).d;
                urVar.p(false);
            } else if (z3) {
                urVar.X(-1766603756);
                j3 = co.b(((mo) urVar.j(oo.a)).q, 0.5f);
                urVar.p(false);
            } else {
                urVar.X(-1766601685);
                j3 = ((mo) urVar.j(oo.a)).q;
                urVar.p(false);
            }
            o22 a3 = dy1.a(j3, null, "cardContent", urVar, 384, 10);
            if (z4) {
                urVar.X(-1766597271);
                j4 = ((mo) urVar.j(oo.a)).a;
                urVar.p(false);
            } else {
                urVar.X(-1766596659);
                urVar.p(false);
                j4 = co.f;
            }
            boolean z5 = !z3;
            float f3 = 1.0f;
            e21 b2 = hy1.b(b21.a, 1.0f);
            if (z3) {
                f3 = 0.6f;
            }
            e21 p2 = sn0.p(b2, f3);
            kp1 a4 = lp1.a(24.0f);
            long j5 = j4;
            wl r2 = r(((co) a2.getValue()).a, ((co) a3.getValue()).a, urVar, 12);
            if (z4) {
                ziVar = new zi(2.0f, new i12(j5));
            } else {
                ziVar = null;
            }
            if (z4) {
                f2 = 4.0f;
            } else {
                f2 = 0.0f;
            }
            rx.b(de0Var, p2, z5, a4, r2, s(62, f2), ziVar, go.N(1711274893, new mf2(h32Var, ef2Var, a3), urVar), urVar, ((i8 >> 3) & 14) | 100663296, 128);
        } else {
            urVar.R();
        }
        dl1 r3 = urVar.r();
        if (r3 != null) {
            r3.d = new l1(ef2Var, de0Var, h32Var, i2, 14, false);
        }
    }

    public static final void o(ArrayList arrayList, oe0 oe0Var, h32 h32Var, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        oe0Var.getClass();
        urVar.Y(-1615196169);
        if (urVar.h(arrayList)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (urVar.h(oe0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (urVar.f(h32Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        int i10 = 0;
        if ((i9 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i9 & 1, z2)) {
            rc1 rc1Var = new rc1(16.0f, 16.0f, 16.0f, 16.0f);
            pe peVar = new pe(12.0f, true, new le(i10));
            p90 p90Var = hy1.c;
            boolean h2 = urVar.h(arrayList);
            if ((i9 & 112) == 32) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            int i11 = i6 | (h2 ? 1 : 0);
            if ((i9 & 896) == 256) {
                i10 = 1;
            }
            int i12 = i11 | i10;
            Object L = urVar.L();
            if (i12 != 0 || L == or.a) {
                L = new k1(arrayList, oe0Var, h32Var, 21);
                urVar.h0(L);
            }
            io.d(24966, 490, null, null, peVar, urVar, null, (oe0) L, null, p90Var, rc1Var, false);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new l1(arrayList, oe0Var, h32Var, i2, 13);
        }
    }

    public static final void p(vf2 vf2Var, boolean z2, ur urVar, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        boolean z6;
        vf2Var.getClass();
        urVar.Y(2028954055);
        if (urVar.f(vf2Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if ((i5 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i5 & 1, z3)) {
            h32 c2 = jx0.c(urVar);
            o41 q2 = lo.q(vf2Var.f, urVar);
            o41 q3 = lo.q(vf2Var.j, urVar);
            o41 q4 = lo.q(vf2Var.h, urVar);
            p90 p90Var = hy1.c;
            yo a2 = wo.a(c01.g, g3.r, urVar, 0);
            int hashCode = Long.hashCode(urVar.T);
            sf1 l2 = urVar.l();
            e21 Q = fp.Q(urVar, p90Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar, gbVar, a2);
            gb gbVar2 = kr.e;
            op1.q(urVar, gbVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            gb gbVar3 = kr.g;
            op1.l(urVar, valueOf, gbVar3);
            i5 i5Var = kr.h;
            op1.o(urVar, i5Var);
            gb gbVar4 = kr.d;
            op1.q(urVar, gbVar4, Q);
            boolean booleanValue = ((Boolean) q3.getValue()).booleanValue();
            int i6 = i5 & 14;
            if (i6 != 4) {
                z5 = false;
            } else {
                z5 = true;
            }
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (!z5 && L != xl1Var) {
                i4 = 0;
            } else {
                i4 = 0;
                L = new lf2(vf2Var, i4);
                urVar.h0(L);
            }
            d(booleanValue, (oe0) L, c2, urVar, i4);
            pr0 pr0Var = new pr0(1.0f, true);
            j01 d2 = hj.d(g3.f, false);
            int hashCode2 = Long.hashCode(urVar.T);
            sf1 l3 = urVar.l();
            e21 Q2 = fp.Q(urVar, pr0Var);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, d2);
            op1.q(urVar, gbVar2, l3);
            l90.t(hashCode2, urVar, gbVar3, urVar, i5Var);
            op1.q(urVar, gbVar4, Q2);
            sf2 sf2Var = (sf2) q2.getValue();
            if (sf2Var instanceof qf2) {
                urVar.X(-1343874510);
                urVar.X(-1343825871);
                rx.l(0, 0, urVar);
                urVar.p(false);
                urVar.p(false);
            } else if (sf2Var instanceof pf2) {
                urVar.X(-1343574957);
                g(((pf2) sf2Var).a, c2, urVar, 0);
                urVar.p(false);
            } else if (sf2Var instanceof of2) {
                urVar.X(-1343414966);
                boolean booleanValue2 = ((Boolean) q4.getValue()).booleanValue();
                if (i6 != 4) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                Object L2 = urVar.L();
                if (z6 || L2 == xl1Var) {
                    L2 = new vm1(vf2Var, 18);
                    urVar.h0(L2);
                }
                jk1.b(booleanValue2, (de0) L2, p90Var, null, null, null, go.N(-1229869583, new mf2((of2) sf2Var, vf2Var, c2), urVar), urVar, 1573248);
                urVar.p(false);
            } else if (sn0.r(sf2Var, rf2.a)) {
                urVar.X(-1342863507);
                i(c2, urVar, 6);
                urVar.p(false);
            } else {
                urVar.X(-1428825740);
                urVar.p(false);
                se.m();
                return;
            }
            z4 = true;
            urVar.p(true);
            urVar.p(true);
        } else {
            urVar.R();
            z4 = z2;
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new eu(vf2Var, z4, i2, 4);
        }
    }

    public static final e21 q(e21 e21Var, qj qjVar) {
        return e21Var.d(new oj(qjVar));
    }

    public static wl r(long j2, long j3, ur urVar, int i2) {
        long j4;
        long j5;
        long j6;
        long j7;
        if ((i2 & 2) != 0) {
            j4 = oo.b(j2, urVar);
        } else {
            j4 = j3;
        }
        long j8 = co.g;
        long b2 = co.b(j4, 0.38f);
        mo moVar = (mo) urVar.j(oo.a);
        wl wlVar = moVar.Z;
        if (wlVar == null) {
            no noVar = sn0.t;
            j5 = j4;
            wl wlVar2 = new wl(oo.d(moVar, noVar), oo.a(moVar, oo.d(moVar, noVar)), go.t(co.b(oo.d(moVar, sn0.u), sn0.v), oo.d(moVar, noVar)), co.b(oo.a(moVar, oo.d(moVar, noVar)), 0.38f));
            moVar.Z = wlVar2;
            wlVar = wlVar2;
        } else {
            j5 = j4;
        }
        if (j2 != 16) {
            j6 = j2;
        } else {
            j6 = wlVar.a;
        }
        if (j5 != 16) {
            j7 = j5;
        } else {
            j7 = wlVar.b;
        }
        if (j8 == 16) {
            j8 = wlVar.c;
        }
        long j9 = j8;
        if (b2 == 16) {
            b2 = wlVar.d;
        }
        return new wl(j6, j7, j9, b2);
    }

    public static xl s(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        return new xl(f2, sn0.x, sn0.w);
    }

    public static final long t(bl1 bl1Var, bl blVar, int i2, long j2) {
        bl blVar2;
        hk hkVar = bl1Var.f;
        blVar.getClass();
        long j3 = i2;
        rx.q(blVar.d(), 0L, j3);
        long j4 = 0;
        if (!bl1Var.g) {
            int i3 = i2;
            bl blVar3 = blVar;
            loop0: while (true) {
                long j5 = j4;
                long a2 = b.a(hkVar, blVar3, j5, j2, i3);
                if (a2 != -1) {
                    return a2;
                }
                long j6 = hkVar.f;
                long j7 = (j6 - j3) + 1;
                if (j7 >= j2) {
                    break;
                }
                if (j6 < j2) {
                    blVar2 = blVar;
                } else {
                    int max = (int) Math.max(1L, (j6 - j2) + 1);
                    int min = ((int) Math.min(j3, (hkVar.f - j5) + 1)) - 1;
                    if (max > min) {
                        break;
                    }
                    while (true) {
                        blVar2 = blVar;
                        if (!hkVar.r(min, blVar2, hkVar.f - min)) {
                            if (min == max) {
                                break loop0;
                            }
                            min--;
                        } else {
                            break;
                        }
                    }
                }
                if (bl1Var.e.read(hkVar, 8192L) == -1) {
                    break;
                }
                j4 = Math.max(j5, j7);
                i3 = i2;
                blVar3 = blVar2;
            }
            return -1L;
        }
        se.p("closed");
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.t7 u(defpackage.dl r25, float r26) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d6.u(dl, float):t7");
    }

    public static void v(p6 p6Var, LongSparseArray longSparseArray) {
        TranslationResponseValue k2;
        CharSequence p2;
        tu1 tu1Var;
        ru1 ru1Var;
        oe0 oe0Var;
        int size = longSparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            long keyAt = longSparseArray.keyAt(i2);
            ViewTranslationResponse n2 = y4.n(longSparseArray.get(keyAt));
            if (n2 != null && (k2 = y4.k(n2)) != null && (p2 = y4.p(k2)) != null && (tu1Var = (tu1) p6Var.f().b((int) keyAt)) != null && (ru1Var = tu1Var.a) != null) {
                Object g2 = ru1Var.d.e.g(lu1.l);
                if (g2 == null) {
                    g2 = null;
                }
                s0 s0Var = (s0) g2;
                if (s0Var != null && (oe0Var = (oe0) s0Var.b) != null) {
                }
            }
        }
    }

    public static final float w(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final e21 x(e21 e21Var, oe0 oe0Var) {
        return e21Var.d(new oi(oe0Var));
    }

    public static e21 y(float f2, float f3, float f4, float f5, kw1 kw1Var, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        kw1 kw1Var2;
        if ((i2 & 1) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f2;
        }
        if ((i2 & 2) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f3;
        }
        if ((i2 & 4) != 0) {
            f8 = 1.0f;
        } else {
            f8 = f4;
        }
        if ((i2 & 32) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f5;
        }
        long j2 = cb2.b;
        if ((i2 & 2048) != 0) {
            kw1Var2 = w;
        } else {
            kw1Var2 = kw1Var;
        }
        long j3 = wf0.a;
        return new uf0(f6, f7, f8, f9, 0.0f, j2, kw1Var2, false, j3, j3);
    }

    public static e21 z(e21 e21Var, float f2, float f3, kw1 kw1Var, int i2) {
        float f4;
        float f5;
        float f6;
        float f7;
        kw1 kw1Var2;
        boolean z2;
        if ((i2 & 1) != 0) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f2;
        }
        if ((i2 & 256) != 0) {
            f7 = 0.0f;
        } else {
            f7 = f3;
        }
        long j2 = cb2.b;
        if ((i2 & 2048) != 0) {
            kw1Var2 = w;
        } else {
            kw1Var2 = kw1Var;
        }
        if ((i2 & 4096) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z2;
        long j3 = wf0.a;
        return e21Var.d(new uf0(f4, f5, f6, 0.0f, f7, j2, kw1Var2, z3, j3, j3));
    }
}
