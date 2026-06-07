package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.elixir.loader.R;
import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class vn {
    public static ij0 a;
    public static ij0 b;
    public static ij0 c;

    public static final void A(ArrayList arrayList, long j, oe0 oe0Var) {
        int size = arrayList.size();
        for (int x = x(d92.f(j), arrayList); x < size; x++) {
            zd1 zd1Var = (zd1) arrayList.get(x);
            if (zd1Var.b < d92.e(j)) {
                if (zd1Var.b != zd1Var.c) {
                    oe0Var.invoke(zd1Var);
                }
            } else {
                return;
            }
        }
    }

    public static Set B() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final xh1 C(View view) {
        xh1 xh1Var = (xh1) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (xh1Var == null) {
            xh1 xh1Var2 = new xh1();
            view.setTag(R.id.pooling_container_listener_holder_tag, xh1Var2);
            return xh1Var2;
        }
        return xh1Var;
    }

    public static final int D(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else if (i3 < 0) {
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        } else {
            se.h("Step is zero.");
            return 0;
        }
        return i2;
    }

    public static final vy0 E(vy0 vy0Var) {
        ar0 ar0Var;
        ar0 ar0Var2 = vy0Var.s.s;
        while (true) {
            ar0 v = ar0Var2.v();
            ar0 ar0Var3 = null;
            if (v != null) {
                ar0Var = v.m;
            } else {
                ar0Var = null;
            }
            if (ar0Var != null) {
                ar0 v2 = ar0Var2.v();
                if (v2 != null) {
                    ar0Var3 = v2.m;
                }
                ar0Var3.getClass();
                ar0 v3 = ar0Var2.v();
                v3.getClass();
                ar0Var2 = v3.m;
                ar0Var2.getClass();
            } else {
                vy0 T0 = ar0Var2.J.d.T0();
                T0.getClass();
                return T0;
            }
        }
    }

    public static final boolean F(ar0 ar0Var) {
        ar0 ar0Var2;
        if (ar0Var.m != null) {
            ar0 v = ar0Var.v();
            if (v != null) {
                ar0Var2 = v.m;
            } else {
                ar0Var2 = null;
            }
            if (ar0Var2 == null || ar0Var.K.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void G(gu0 gu0Var, i82 i82Var, c91 c91Var) {
        oe0 oe0Var;
        i02 e = nq1.e();
        if (e != null) {
            oe0Var = e.e();
        } else {
            oe0Var = null;
        }
        oe0 oe0Var2 = oe0Var;
        i02 j = nq1.j(e);
        try {
            x82 d = gu0Var.d();
            if (d == null) {
                return;
            }
            r82 r82Var = gu0Var.e;
            if (r82Var == null) {
                return;
            }
            iq0 c2 = gu0Var.c();
            if (c2 == null) {
                return;
            }
            fr1.l(i82Var, gu0Var.a, d.a, c2, r82Var, gu0Var.b(), c91Var);
        } finally {
            nq1.o(e, j, oe0Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01be, code lost:
    
        if (r5 == r26.length()) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c6, code lost:
    
        if (r26.charAt(r5) != 'S') goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c8, code lost:
    
        r2 = (r14 * 1000000000) + r15;
        r14 = r9;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d6, code lost:
    
        switch(r8.ordinal()) {
            case 0: goto L130;
            case 1: goto L129;
            case 2: goto L128;
            case 3: goto L127;
            case 4: goto L126;
            case 5: goto L125;
            case 6: goto L124;
            default: goto L123;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d9, code lost:
    
        defpackage.se.t(r8, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0210, code lost:
    
        r14 = r2 * r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e1, code lost:
    
        r21 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020a, code lost:
    
        r2 = defpackage.c01.S(r2 * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e7, code lost:
    
        r21 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ed, code lost:
    
        r21 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f3, code lost:
    
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01f9, code lost:
    
        r21 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ff, code lost:
    
        r21 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0205, code lost:
    
        r21 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0104, code lost:
    
        defpackage.se.h("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0107, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00f2, code lost:
    
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r5 >= r26.length()) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        r3 = r26.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
    
        if ('0' > r3) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r3 >= ':') goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r5 == r26.length()) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        if (r2 == '+') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        if (r2 == '-') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        if (r5 == (r23 + r2)) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        r20 = 4611686018427387903L;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c A[LOOP:5: B:75:0x015a->B:76:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0199 A[LOOP:7: B:87:0x0197->B:88:0x0199, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long H(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn.H(java.lang.String):long");
    }

    public static final View I(qz qzVar) {
        if (!((d21) qzVar).e.r) {
            kl0.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) dr0.a(hp.M(qzVar));
    }

    public static final void J(h1 h1Var, ru1 ru1Var) {
        int i;
        int i2;
        Object g = ru1Var.k().e.g(vu1.g);
        Object obj = null;
        if (g == null) {
            g = null;
        }
        if (g == null) {
            ru1 l = ru1Var.l();
            if (l != null) {
                Object g2 = l.k().e.g(vu1.e);
                if (g2 == null) {
                    g2 = null;
                }
                if (g2 != null) {
                    Object g3 = l.k().e.g(vu1.f);
                    if (g3 != null) {
                        obj = g3;
                    }
                    un unVar = (un) obj;
                    if (unVar == null || (unVar.a >= 0 && unVar.b >= 0)) {
                        if (ru1Var.k().e.c(vu1.I)) {
                            ArrayList arrayList = new ArrayList();
                            List j = ru1.j(4, l);
                            int size = j.size();
                            int i3 = 0;
                            for (int i4 = 0; i4 < size; i4++) {
                                ru1 ru1Var2 = (ru1) j.get(i4);
                                if (ru1Var2.k().e.c(vu1.I)) {
                                    arrayList.add(ru1Var2);
                                    if (ru1Var2.c.w() < ru1Var.c.w()) {
                                        i3++;
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                boolean p = p(arrayList);
                                if (p) {
                                    i = 0;
                                } else {
                                    i = i3;
                                }
                                if (p) {
                                    i2 = i3;
                                } else {
                                    i2 = 0;
                                }
                                Object g4 = ru1Var.k().e.g(vu1.I);
                                if (g4 == null) {
                                    g4 = Boolean.FALSE;
                                }
                                h1Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, false, ((Boolean) g4).booleanValue()));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        se.s();
    }

    public static final void K(pb1 pb1Var, int i, Object obj) {
        pb1Var.h[(pb1Var.i - pb1Var.d[pb1Var.e - 1].b) + i] = obj;
    }

    public static final void L(pb1 pb1Var, int i, Object obj, int i2, Object obj2) {
        int i3 = pb1Var.i - pb1Var.d[pb1Var.e - 1].b;
        Object[] objArr = pb1Var.h;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, wl1] */
    public static final void M(n82 n82Var, gu0 gu0Var, i82 i82Var, nj0 nj0Var, c91 c91Var) {
        sl0 sl0Var = gu0Var.d;
        fu fuVar = gu0Var.v;
        fu fuVar2 = gu0Var.w;
        ?? obj = new Object();
        k1 k1Var = new k1(sl0Var, fuVar, (Object) obj, 18);
        dh1 dh1Var = n82Var.a;
        dh1Var.h(i82Var, nj0Var, k1Var, fuVar2);
        r82 r82Var = new r82(n82Var, dh1Var);
        n82Var.b.set(r82Var);
        obj.e = r82Var;
        gu0Var.e = r82Var;
        G(gu0Var, i82Var, c91Var);
    }

    public static final long N(long j, v40 v40Var) {
        TimeUnit timeUnit = v40Var.e;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            long convert2 = timeUnit2.convert(j, timeUnit);
            r40 r40Var = s40.f;
            long j2 = convert2 << 1;
            int i = u40.a;
            return j2;
        }
        if (v40Var.compareTo(v40.MILLISECONDS) >= 0) {
            long signum = Long.signum(j);
            if (j < -9223372036854775807L) {
                j = -9223372036854775807L;
            }
            return t(xn.u(Math.abs(j), v40Var) * signum);
        }
        return t(go.q(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
    }

    public static final long O(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final void P(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            nl0.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        nl0.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final boolean Q(String str, de0 de0Var) {
        try {
            boolean booleanValue = ((Boolean) de0Var.invoke()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ip, no0] */
    public static ip a() {
        ?? no0Var = new no0(true);
        no0Var.L(null);
        return no0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.zj1 r11, defpackage.se0 r12, defpackage.ur r13, int r14) {
        /*
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.Y(r0)
            fn0 r0 = r13.x
            sf1 r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            ga1 r3 = defpackage.vr.b
            r13.U(r2, r3)
            java.lang.Object r2 = r13.L()
            xl1 r3 = defpackage.or.a
            boolean r3 = defpackage.sn0.r(r2, r3)
            r4 = 0
            if (r3 == 0) goto L22
            r2 = r4
            goto L27
        L22:
            r2.getClass()
            ge2 r2 = (defpackage.ge2) r2
        L27:
            xj1 r3 = r11.a
            ge2 r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L36
            r13.h0(r5)
        L36:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L4e
            boolean r2 = r11.f
            if (r2 != 0) goto L46
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4a
        L46:
            sf1 r1 = r1.b(r3, r5)
        L4a:
            r13.J = r7
        L4c:
            r2 = r8
            goto L89
        L4e:
            fz1 r6 = r13.G
            int r9 = r6.g
            int[] r10 = r6.b
            java.lang.Object r6 = r6.b(r10, r9)
            r6.getClass()
            sf1 r6 = (defpackage.sf1) r6
            boolean r9 = r13.A()
            if (r9 == 0) goto L65
            if (r2 != 0) goto L70
        L65:
            boolean r9 = r11.f
            if (r9 != 0) goto L7e
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L70
            goto L7e
        L70:
            if (r2 == 0) goto L77
            boolean r2 = r13.w
            if (r2 != 0) goto L77
            goto L7c
        L77:
            boolean r2 = r13.w
            if (r2 == 0) goto L7c
            goto L82
        L7c:
            r1 = r6
            goto L82
        L7e:
            sf1 r1 = r1.b(r3, r5)
        L82:
            boolean r2 = r13.y
            if (r2 != 0) goto L88
            if (r6 == r1) goto L4c
        L88:
            r2 = r7
        L89:
            if (r2 == 0) goto L92
            boolean r3 = r13.S
            if (r3 != 0) goto L92
            r13.J(r1)
        L92:
            boolean r3 = r13.w
            r0.c(r3)
            r13.w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            ga1 r3 = defpackage.vr.c
            r13.S(r3, r2, r8, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.b()
            if (r0 == 0) goto Lba
            r8 = r7
        Lba:
            r13.w = r8
            r13.K = r4
            dl1 r13 = r13.r()
            if (r13 == 0) goto Lcb
            cq r0 = new cq
            r0.<init>(r11, r14, r7, r12)
            r13.d = r0
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn.b(zj1, se0, ur, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.zj1[] r8, defpackage.se0 r9, defpackage.ur r10, int r11) {
        /*
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.Y(r0)
            fn0 r0 = r10.x
            sf1 r1 = r10.l()
            r2 = 201(0xc9, float:2.82E-43)
            ga1 r3 = defpackage.vr.b
            r10.U(r2, r3)
            boolean r2 = r10.S
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            sf1 r2 = defpackage.sf1.h
            sf1 r2 = defpackage.xn.W(r8, r1, r2)
            sf1 r1 = r10.g0(r1, r2)
            r10.J = r3
        L25:
            r2 = r4
            goto L72
        L27:
            fz1 r2 = r10.G
            int r5 = r2.g
            java.lang.Object r2 = r2.h(r5, r4)
            r2.getClass()
            sf1 r2 = (defpackage.sf1) r2
            fz1 r5 = r10.G
            int r6 = r5.g
            java.lang.Object r5 = r5.h(r6, r3)
            r5.getClass()
            sf1 r5 = (defpackage.sf1) r5
            sf1 r6 = defpackage.xn.W(r8, r1, r5)
            boolean r7 = r10.A()
            if (r7 == 0) goto L63
            boolean r7 = r10.y
            if (r7 != 0) goto L63
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L56
            goto L63
        L56:
            int r1 = r10.l
            fz1 r5 = r10.G
            int r5 = r5.s()
            int r5 = r5 + r1
            r10.l = r5
            r1 = r2
            goto L25
        L63:
            sf1 r1 = r10.g0(r1, r6)
            boolean r5 = r10.y
            if (r5 != 0) goto L71
            boolean r2 = defpackage.sn0.r(r1, r2)
            if (r2 != 0) goto L25
        L71:
            r2 = r3
        L72:
            if (r2 == 0) goto L7b
            boolean r5 = r10.S
            if (r5 != 0) goto L7b
            r10.J(r1)
        L7b:
            boolean r5 = r10.w
            r0.c(r5)
            r10.w = r2
            r10.K = r1
            r2 = 202(0xca, float:2.83E-43)
            ga1 r5 = defpackage.vr.c
            r10.S(r5, r2, r4, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.invoke(r10, r1)
            r10.p(r4)
            r10.p(r4)
            int r0 = r0.b()
            if (r0 == 0) goto La3
            goto La4
        La3:
            r3 = r4
        La4:
            r10.w = r3
            r0 = 0
            r10.K = r0
            dl1 r10 = r10.r()
            if (r10 == 0) goto Lb7
            cq r0 = new cq
            r1 = 2
            r0.<init>(r8, r11, r1, r9)
            r10.d = r0
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn.c(zj1[], se0, ur, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x03e0, code lost:
    
        if (r3.h == r9) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04bb, code lost:
    
        if (r2 > ((r4 != null ? r4.longValue() : 0) + 5000)) goto L241;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0610 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0666 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x073a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x076e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x07a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0877 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0918 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x097b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0453  */
    /* JADX WARN: Type inference failed for: r0v75, types: [e21] */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v91, types: [e21] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.i82 r69, final defpackage.oe0 r70, final defpackage.e21 r71, final defpackage.k92 r72, final defpackage.y61 r73, final defpackage.oe0 r74, final defpackage.r31 r75, final defpackage.i12 r76, final boolean r77, final int r78, final int r79, final defpackage.nj0 r80, final defpackage.up0 r81, final boolean r82, final boolean r83, final defpackage.fq r84, defpackage.ur r85, final int r86, final int r87) {
        /*
            Method dump skipped, instructions count: 2728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn.d(i82, oe0, e21, k92, y61, oe0, r31, i12, boolean, int, int, nj0, up0, boolean, boolean, fq, ur, int, int):void");
    }

    public static final void e(e21 e21Var, b82 b82Var, fq fqVar, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        urVar.Y(2036174316);
        if (urVar.f(e21Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.h(b82Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            j01 d = hj.d(g3.f, true);
            int hashCode = Long.hashCode(urVar.T);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, e21Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, d);
            op1.q(urVar, kr.e, l);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q);
            hp.a(b82Var, fqVar, urVar, (i5 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new l1(e21Var, b82Var, fqVar, i, 3);
        }
    }

    public static final void f(lb2 lb2Var, e21 e21Var, u90 u90Var, oe0 oe0Var, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        oe0 oe0Var2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        ir irVar = lb2Var.a;
        urVar.Y(-1877370462);
        if ((i & 6) == 0) {
            if (urVar.f(lb2Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(e21Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (urVar.h(u90Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        int i7 = i2 | 3072;
        if ((i & 24576) == 0) {
            if (urVar.h(fqVar)) {
                i3 = 16384;
            } else {
                i3 = SharedConstants.DefaultBufferSize;
            }
            i7 |= i3;
        }
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i7 & 1, z)) {
            Object L = urVar.L();
            Object obj = or.a;
            if (L == obj) {
                L = i5.t;
                urVar.h0(L);
            }
            oe0 oe0Var3 = (oe0) L;
            Object L2 = urVar.L();
            Object obj2 = L2;
            if (L2 == obj) {
                a12 a12Var = new a12();
                a12Var.add(irVar.c());
                urVar.h0(a12Var);
                obj2 = a12Var;
            }
            a12 a12Var2 = (a12) obj2;
            Object L3 = urVar.L();
            if (L3 == obj) {
                long[] jArr = sr1.a;
                L3 = new i41();
                urVar.h0(L3);
            }
            i41 i41Var = (i41) L3;
            je1 je1Var = lb2Var.d;
            if (sn0.r(irVar.c(), je1Var.getValue())) {
                urVar.X(321145192);
                if (a12Var2.size() == 1 && sn0.r(a12Var2.get(0), je1Var.getValue())) {
                    urVar.X(316295552);
                } else {
                    urVar.X(321279546);
                    if ((i7 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object L4 = urVar.L();
                    if (z2 || L4 == obj) {
                        L4 = new n3(lb2Var, 10);
                        urVar.h0(L4);
                    }
                    wn.s0(a12Var2, (oe0) L4);
                    i41Var.a();
                }
                urVar.p(false);
            } else {
                urVar.X(316295552);
            }
            urVar.p(false);
            if (!i41Var.b(je1Var.getValue())) {
                urVar.X(321536443);
                ListIterator listIterator = a12Var2.listIterator();
                int i8 = 0;
                while (true) {
                    ah0 ah0Var = (ah0) listIterator;
                    if (ah0Var.hasNext()) {
                        if (sn0.r(oe0Var3.invoke(ah0Var.next()), oe0Var3.invoke(je1Var.getValue()))) {
                            break;
                        } else {
                            i8++;
                        }
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                if (i8 == -1) {
                    a12Var2.add(je1Var.getValue());
                } else {
                    a12Var2.set(i8, je1Var.getValue());
                }
                i41Var.a();
                int size = a12Var2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    Object obj3 = a12Var2.get(i9);
                    i41Var.m(obj3, go.N(-934471669, new tv(lb2Var, u90Var, obj3, fqVar), urVar));
                }
            } else {
                urVar.X(316295552);
            }
            urVar.p(false);
            j01 d = hj.d(g3.f, false);
            int hashCode = Long.hashCode(urVar.T);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, e21Var);
            lr.b.getClass();
            de0 de0Var = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(de0Var);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, d);
            op1.q(urVar, kr.e, l);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q);
            urVar.X(-1312707512);
            int size2 = a12Var2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Object obj4 = a12Var2.get(i10);
                urVar.V(1171574969, oe0Var3.invoke(obj4));
                se0 se0Var = (se0) i41Var.g(obj4);
                if (se0Var == null) {
                    urVar.X(1959122128);
                } else {
                    urVar.X(1171576145);
                    se0Var.invoke(urVar, 0);
                }
                urVar.p(false);
                urVar.p(false);
            }
            urVar.p(false);
            urVar.p(true);
            oe0Var2 = oe0Var3;
        } else {
            urVar.R();
            oe0Var2 = oe0Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new yb(lb2Var, e21Var, u90Var, oe0Var2, fqVar, i);
        }
    }

    public static final void g(Object obj, e21 e21Var, u90 u90Var, String str, fq fqVar, ur urVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        e21 e21Var2;
        u90 u90Var2;
        urVar.Y(-513216493);
        if (urVar.f(obj)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i;
        int i7 = i6 | 48;
        int i8 = i2 & 4;
        if (i8 != 0) {
            i7 = i6 | 432;
        } else if ((i & 384) == 0) {
            if (urVar.h(u90Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i7 |= i4;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i7 |= 3072;
        } else if ((i & 3072) == 0) {
            if (urVar.f(str)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i7 |= i5;
        }
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i7 & 1, z)) {
            if (i8 != 0) {
                u90Var = mp0.P(0, 7, null);
            }
            u90 u90Var3 = u90Var;
            if (i9 != 0) {
                str = "Crossfade";
            }
            lb2 e = qb2.e(obj, str, urVar, (i7 & 14) | ((i7 >> 6) & 112));
            int i10 = i7 & 58352;
            b21 b21Var = b21.a;
            f(e, b21Var, u90Var3, null, fqVar, urVar, i10);
            u90Var2 = u90Var3;
            e21Var2 = b21Var;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            u90Var2 = u90Var;
        }
        String str2 = str;
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new rv(obj, e21Var2, u90Var2, str2, fqVar, i, i2);
        }
    }

    public static final void h(e21 e21Var, float f, final long j, ur urVar, int i) {
        int i2;
        boolean z;
        final float f2;
        urVar.Y(75144485);
        int i3 = i | 48;
        if (urVar.e(j)) {
            i2 = 256;
        } else {
            i2 = 128;
        }
        int i4 = i3 | i2;
        boolean z2 = true;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i4 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                f2 = f;
            } else {
                f2 = x10.a;
            }
            urVar.q();
            e21 c2 = hy1.c(hy1.b(e21Var, 1.0f), f2);
            if ((((i4 & 896) ^ 384) <= 256 || !urVar.e(j)) && (i4 & 384) != 256) {
                z2 = false;
            }
            Object L = urVar.L();
            if (z2 || L == or.a) {
                L = new oe0() { // from class: y10
                    @Override // defpackage.oe0
                    public final Object invoke(Object obj) {
                        c40 c40Var = (c40) obj;
                        float f3 = f2;
                        float W = c40Var.W(f3);
                        float W2 = c40Var.W(f3) / 2.0f;
                        float intBitsToFloat = Float.intBitsToFloat((int) (c40Var.d() >> 32));
                        float W3 = c40Var.W(f3) / 2.0f;
                        c40.g0(c40Var, j, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(W2) & 4294967295L), (Float.floatToRawIntBits(W3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), W, 0, 496);
                        return od2.a;
                    }
                };
                urVar.h0(L);
            }
            f2.c(c2, (oe0) L, urVar, 0);
        } else {
            urVar.R();
            f2 = f;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new z10(e21Var, f2, j, i);
        }
    }

    public static final long i(int i) {
        long j = i << 32;
        int i2 = jp0.F;
        return j;
    }

    public static final void j(b82 b82Var, boolean z, ur urVar, int i) {
        int i2;
        int i3;
        boolean z2;
        x82 d;
        boolean z3;
        urVar.Y(626339208);
        if (urVar.h(b82Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        int i6 = 0;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i5 & 1, z2)) {
            if (z) {
                urVar.X(1530097388);
                gu0 gu0Var = b82Var.d;
                w82 w82Var = null;
                if (gu0Var != null && (d = gu0Var.d()) != null) {
                    w82 w82Var2 = d.a;
                    gu0 gu0Var2 = b82Var.d;
                    if (gu0Var2 != null) {
                        z3 = gu0Var2.p;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        w82Var = w82Var2;
                    }
                }
                if (w82Var == null) {
                    urVar.X(1530097387);
                } else {
                    urVar.X(1530097388);
                    if (!d92.c(b82Var.n().b)) {
                        urVar.X(2109807302);
                        int d2 = b82Var.b.d((int) (b82Var.n().b >> 32));
                        int d3 = b82Var.b.d((int) (b82Var.n().b & 4294967295L));
                        um1 a2 = w82Var.a(d2);
                        um1 a3 = w82Var.a(Math.max(d3 - 1, 0));
                        gu0 gu0Var3 = b82Var.d;
                        if (gu0Var3 != null && ((Boolean) gu0Var3.m.getValue()).booleanValue()) {
                            urVar.X(2110225306);
                            xp1.b(true, a2, b82Var, urVar, ((i5 << 6) & 896) | 6);
                        } else {
                            urVar.X(2062097806);
                        }
                        urVar.p(false);
                        gu0 gu0Var4 = b82Var.d;
                        if (gu0Var4 != null && ((Boolean) gu0Var4.n.getValue()).booleanValue()) {
                            urVar.X(2110574459);
                            xp1.b(false, a3, b82Var, urVar, ((i5 << 6) & 896) | 6);
                        } else {
                            urVar.X(2062097806);
                        }
                        urVar.p(false);
                    } else {
                        urVar.X(2062097806);
                    }
                    urVar.p(false);
                    gu0 gu0Var5 = b82Var.d;
                    if (gu0Var5 != null) {
                        je1 je1Var = gu0Var5.l;
                        if (!sn0.r(b82Var.t.a.f, b82Var.n().a.f)) {
                            je1Var.setValue(Boolean.FALSE);
                        }
                        if (gu0Var5.b()) {
                            if (((Boolean) je1Var.getValue()).booleanValue()) {
                                b82Var.r();
                            } else {
                                b82Var.o();
                            }
                        }
                    }
                }
                urVar.p(false);
                urVar.p(false);
            } else {
                urVar.X(1989076778);
                urVar.p(false);
                b82Var.o();
            }
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new eu(b82Var, z, i, i6);
        }
    }

    public static final void k(b82 b82Var, ur urVar, int i) {
        int i2;
        boolean z;
        rc m;
        x82 x82Var;
        urVar.Y(-1436003720);
        int i3 = 4;
        int i4 = 2;
        if (urVar.h(b82Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        int i6 = 0;
        if ((i5 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            gu0 gu0Var = b82Var.d;
            if (gu0Var != null && ((Boolean) gu0Var.o.getValue()).booleanValue() && (m = b82Var.m()) != null && m.f.length() > 0) {
                urVar.X(-2112351432);
                boolean f = urVar.f(b82Var);
                Object L = urVar.L();
                xl1 xl1Var = or.a;
                if (f || L == xl1Var) {
                    L = new x72(b82Var);
                    urVar.h0(L);
                }
                b72 b72Var = (b72) L;
                c00 c00Var = (c00) urVar.j(is.h);
                c91 c91Var = b82Var.b;
                long j = b82Var.n().b;
                int i7 = d92.c;
                int d = c91Var.d((int) (j >> 32));
                gu0 gu0Var2 = b82Var.d;
                if (gu0Var2 != null) {
                    x82Var = gu0Var2.d();
                } else {
                    x82Var = null;
                }
                x82Var.getClass();
                w82 w82Var = x82Var.a;
                pl1 c2 = w82Var.c(go.p(d, 0, w82Var.a.a.f.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits((c00Var.W(2.0f) / 2.0f) + c2.a) << 32) | (Float.floatToRawIntBits(c2.d) & 4294967295L);
                boolean e = urVar.e(floatToRawIntBits);
                Object L2 = urVar.L();
                if (e || L2 == xl1Var) {
                    L2 = new ku(floatToRawIntBits);
                    urVar.h0(L2);
                }
                d91 d91Var = (d91) L2;
                boolean h = urVar.h(b72Var) | urVar.h(b82Var);
                Object L3 = urVar.L();
                if (h || L3 == xl1Var) {
                    L3 = new nu(i6, b72Var, b82Var);
                    urVar.h0(L3);
                }
                e21 a2 = s42.a(b21.a, b72Var, (PointerInputEventHandler) L3);
                boolean e2 = urVar.e(floatToRawIntBits);
                Object L4 = urVar.L();
                if (e2 || L4 == xl1Var) {
                    L4 = new v6(i4, floatToRawIntBits);
                    urVar.h0(L4);
                }
                x6.a(d91Var, ou1.a(a2, false, (oe0) L4), 0L, urVar, 0);
            } else {
                urVar.X(2132946858);
            }
            urVar.p(false);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new h8(b82Var, i, i3);
        }
    }

    public static final void l(final uy uyVar, final e21 e21Var, pc1 pc1Var, g3 g3Var, h3 h3Var, final c02 c02Var, final boolean z, l71 l71Var, xl1 xl1Var, j7 j7Var, final fq fqVar, ur urVar, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        final pc1 pc1Var2;
        final g3 g3Var2;
        final h3 h3Var2;
        final l71 l71Var2;
        final xl1 xl1Var2;
        final j7 j7Var2;
        g3 g3Var3;
        j7 a2;
        h3 h3Var3;
        l71 l71Var3;
        pc1 pc1Var3;
        urVar.Y(-1590376023);
        if (urVar.f(uyVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (urVar.f(e21Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 1797504;
        if (urVar.f(c02Var)) {
            i4 = 8388608;
        } else {
            i4 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
        }
        int i7 = i6 | i4 | FileSystemManager.MODE_READ_WRITE;
        boolean z3 = true;
        if ((306783379 & i7) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (urVar.O(i7 & 1, z2)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                pc1Var3 = pc1Var;
                g3Var3 = g3Var;
                h3Var3 = h3Var;
                l71Var3 = l71Var;
                xl1Var2 = xl1Var;
                a2 = j7Var;
            } else {
                rc1 rc1Var = new rc1(0.0f, 0.0f, 0.0f, 0.0f);
                g3 g3Var4 = g3.V;
                ii iiVar = g3.s;
                int i8 = (i7 & 14) | 432;
                if ((((i8 & 14) ^ 6) <= 4 || !urVar.f(uyVar)) && (i8 & 6) != 4) {
                    z3 = false;
                }
                Object L = urVar.L();
                if (z3 || L == or.a) {
                    L = new ty(uyVar);
                    urVar.h0(L);
                }
                xl1 xl1Var3 = xl1.n;
                g3Var3 = g3Var4;
                a2 = hc1.a(urVar);
                h3Var3 = iiVar;
                xl1Var2 = xl1Var3;
                l71Var3 = (ty) L;
                pc1Var3 = rc1Var;
            }
            urVar.q();
            go.h(e21Var, uyVar, pc1Var3, c02Var, z, a2, g3Var3, l71Var3, h3Var3, xl1Var2, fqVar, urVar, ((i7 >> 6) & 458752) | ((i7 >> 3) & 14) | 24576 | ((i7 << 3) & 112) | 3456 | 907542528, 1797510);
            pc1Var2 = pc1Var3;
            j7Var2 = a2;
            g3Var2 = g3Var3;
            h3Var2 = h3Var3;
            l71Var2 = l71Var3;
        } else {
            urVar.R();
            pc1Var2 = pc1Var;
            g3Var2 = g3Var;
            h3Var2 = h3Var;
            l71Var2 = l71Var;
            xl1Var2 = xl1Var;
            j7Var2 = j7Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(e21Var, pc1Var2, g3Var2, h3Var2, c02Var, z, l71Var2, xl1Var2, j7Var2, fqVar, i) { // from class: yc1
                public final /* synthetic */ e21 f;
                public final /* synthetic */ pc1 g;
                public final /* synthetic */ g3 h;
                public final /* synthetic */ h3 i;
                public final /* synthetic */ c02 j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ l71 l;
                public final /* synthetic */ xl1 m;
                public final /* synthetic */ j7 n;
                public final /* synthetic */ fq o;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(100663297);
                    vn.l(uy.this, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final long m(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
                return go.q(j + j2, -4611686018427387903L, 4611686018427387903L);
            }
            return j2;
        }
        if (-4611686018427387903L < j2 && j2 < 4611686018427387903L) {
            return j;
        }
        if ((j2 ^ j) >= 0) {
            return j;
        }
        return 9223372036854759646L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(defpackage.v42 r7, defpackage.kh1 r8, defpackage.eh r9) {
        /*
            boolean r0 = r9 instanceof defpackage.vd0
            if (r0 == 0) goto L13
            r0 = r9
            vd0 r0 = (defpackage.vd0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            vd0 r0 = new vd0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.g
            int r1 = r0.h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            kh1 r7 = r0.f
            v42 r8 = r0.e
            defpackage.io.K(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5d
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r7)
            r7 = 0
            return r7
        L34:
            defpackage.io.K(r9)
            w42 r9 = r7.j
            jh1 r9 = r9.w
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L42:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            qh1 r5 = (defpackage.qh1) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L76
        L4e:
            r0.e = r7
            r0.f = r8
            r0.h = r3
            java.lang.Object r9 = r7.b(r8, r0)
            hv r1 = defpackage.hv.e
            if (r9 != r1) goto L5d
            return r1
        L5d:
            jh1 r9 = (defpackage.jh1) r9
            java.util.List r9 = r9.a
            int r1 = r9.size()
            r4 = r2
        L66:
            if (r4 >= r1) goto L79
            java.lang.Object r5 = r9.get(r4)
            qh1 r5 = (defpackage.qh1) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L73
            goto L4e
        L73:
            int r4 = r4 + 1
            goto L66
        L76:
            int r4 = r4 + 1
            goto L42
        L79:
            od2 r7 = defpackage.od2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vn.n(v42, kh1, eh):java.lang.Object");
    }

    public static final Object o(uh1 uh1Var, se0 se0Var, vt vtVar) {
        Object L0 = ((w42) uh1Var).L0(new d(vtVar.getContext(), se0Var, null, 1), vtVar);
        if (L0 == hv.e) {
            return L0;
        }
        return od2.a;
    }

    public static final boolean p(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = l60.e;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    ru1 ru1Var = (ru1) obj2;
                    ru1 ru1Var2 = (ru1) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (ru1Var2.g().b() >> 32)) - Float.intBitsToFloat((int) (ru1Var.g().b() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (ru1Var2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (ru1Var.g().b() & 4294967295L)));
                    arrayList2.add(new z81((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((z81) wn.g0(list)).a;
            } else {
                if (list.isEmpty()) {
                    iw0.c("Empty collection can't be reduced.");
                }
                Object g0 = wn.g0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        g0 = new z81(z81.e(((z81) g0).a, ((z81) list.get(i2)).a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((z81) g0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean q(pl1 pl1Var, float f, float f2) {
        float f3 = pl1Var.a;
        if (f <= pl1Var.c && f3 <= f) {
            float f4 = pl1Var.b;
            if (f2 <= pl1Var.d && f4 <= f2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final c61 r(Context context) {
        context.getClass();
        c61 c61Var = new c61(context);
        j51 j51Var = c61Var.b;
        h71 h71Var = j51Var.s;
        h71Var.a(new b61(h71Var));
        h71 h71Var2 = j51Var.s;
        h71Var2.a(new wq());
        h71Var2.a(new y00());
        return c61Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList s(vv0 vv0Var, vv0 vv0Var2) {
        Iterator it = xn.z(vv0Var2).iterator();
        zm0 zm0Var = (zm0) it;
        if (zm0Var.g) {
            tm0 tm0Var = (tm0) it;
            int nextInt = tm0Var.nextInt();
            if (zm0Var.g) {
                float v = v(((rj1) vv0Var.get(0)).b, ((rj1) vv0Var2.get(nextInt)).b);
                do {
                    int nextInt2 = tm0Var.nextInt();
                    float v2 = v(((rj1) vv0Var.get(0)).b, ((rj1) vv0Var2.get(nextInt2)).b);
                    if (Float.compare(v, v2) > 0) {
                        nextInt = nextInt2;
                        v = v2;
                    }
                } while (zm0Var.g);
            }
            int a2 = vv0Var.a();
            int a3 = vv0Var2.a();
            ArrayList G = xn.G(vv0Var2.get(nextInt));
            int i = nextInt;
            for (int i2 = 1; i2 < a2; i2++) {
                int i3 = nextInt - (a2 - i2);
                if (i3 <= i) {
                    i3 += a3;
                }
                Iterator it2 = new ym0(i + 1, i3, 1).iterator();
                zm0 zm0Var2 = (zm0) it2;
                if (zm0Var2.g) {
                    tm0 tm0Var2 = (tm0) it2;
                    int nextInt3 = tm0Var2.nextInt();
                    if (zm0Var2.g) {
                        float v3 = v(((rj1) vv0Var.get(i2)).b, ((rj1) vv0Var2.get(nextInt3 % a3)).b);
                        do {
                            int nextInt4 = tm0Var2.nextInt();
                            float v4 = v(((rj1) vv0Var.get(i2)).b, ((rj1) vv0Var2.get(nextInt4 % a3)).b);
                            if (Float.compare(v3, v4) > 0) {
                                nextInt3 = nextInt4;
                                v3 = v4;
                            }
                        } while (zm0Var2.g);
                    }
                    i = nextInt3;
                    G.add(vv0Var2.get(i % a3));
                } else {
                    y61.c();
                    return null;
                }
            }
            return G;
        }
        y61.c();
        return null;
    }

    public static final long t(long j) {
        long j2 = (j << 1) + 1;
        s40.f.getClass();
        int i = u40.a;
        return j2;
    }

    public static final void u(gu0 gu0Var) {
        r82 r82Var = gu0Var.e;
        if (r82Var != null) {
            gu0Var.v.invoke(i82.a((i82) gu0Var.d.e, null, 0L, 3));
            n82 n82Var = r82Var.a;
            AtomicReference atomicReference = n82Var.b;
            while (true) {
                if (atomicReference.compareAndSet(r82Var, null)) {
                    n82Var.a.c();
                    break;
                } else if (atomicReference.get() != r82Var) {
                    break;
                }
            }
        }
        gu0Var.e = null;
    }

    public static final float v(e90 e90Var, e90 e90Var2) {
        e90Var.getClass();
        List list = e90Var.a;
        e90Var2.getClass();
        List list2 = e90Var2.a;
        if ((e90Var instanceof c90) && (e90Var2 instanceof c90) && ((c90) e90Var).d != ((c90) e90Var2).d) {
            return Float.MAX_VALUE;
        }
        float a2 = (((uv) wn.n0(list)).a() + ((uv) wn.g0(list)).a[0]) / 2.0f;
        float b2 = (((uv) wn.n0(list)).b() + ((uv) wn.g0(list)).a[1]) / 2.0f;
        float a3 = (((uv) wn.n0(list2)).a() + ((uv) wn.g0(list2)).a[0]) / 2.0f;
        float f = a2 - a3;
        float b3 = b2 - ((((uv) wn.n0(list2)).b() + ((uv) wn.g0(list2)).a[1]) / 2.0f);
        return (b3 * b3) + (f * f);
    }

    public static final int w(int i, is0 is0Var, Object obj) {
        int e;
        if (obj != null && is0Var.a() != 0 && ((i >= is0Var.a() || !obj.equals(is0Var.c(i))) && (e = is0Var.e(obj)) != -1)) {
            return e;
        }
        return i;
    }

    public static final int x(int i, List list) {
        int i2;
        char c2;
        int i3 = ((zd1) wn.n0(list)).c;
        if (i > ((zd1) wn.n0(list)).c) {
            ll0.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= size) {
                i2 = (i4 + size) >>> 1;
                zd1 zd1Var = (zd1) list.get(i2);
                if (zd1Var.b > i) {
                    c2 = 1;
                } else if (zd1Var.c <= i) {
                    c2 = 65535;
                } else {
                    c2 = 0;
                }
                if (c2 < 0) {
                    i4 = i2 + 1;
                } else {
                    if (c2 <= 0) {
                        break;
                    }
                    size = i2 - 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder q = l90.q("Found paragraph index ", i2, " should be in range [0, ");
        q.append(list.size());
        q.append(").\nDebug info: index=");
        q.append(i);
        q.append(", paragraphs=[");
        q.append(iw0.a(list, null, new mm0(21), 31));
        q.append(AbstractJsonLexerKt.END_LIST);
        ll0.a(q.toString());
        return i2;
    }

    public static final int y(int i, List list) {
        char c2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            zd1 zd1Var = (zd1) list.get(i3);
            if (zd1Var.d > i) {
                c2 = 1;
            } else if (zd1Var.e <= i) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i2 = i3 + 1;
            } else if (c2 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int z(ArrayList arrayList, float f) {
        char c2;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((zd1) wn.n0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            zd1 zd1Var = (zd1) arrayList.get(i2);
            if (zd1Var.f > f) {
                c2 = 1;
            } else if (zd1Var.g <= f) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i = i2 + 1;
            } else if (c2 > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }
}
