package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j51 {
    public final c61 a;
    public final td b;
    public w51 c;
    public Bundle d;
    public Bundle[] e;
    public final te f = new te();
    public final r22 g;
    public final r22 h;
    public final yk1 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public uu0 n;
    public k51 o;
    public final ArrayList p;
    public nu0 q;
    public final m1 r;
    public final h71 s;
    public final LinkedHashMap t;
    public oe0 u;
    public t01 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final sw1 z;

    public j51(c61 c61Var, td tdVar) {
        this.a = c61Var;
        this.b = tdVar;
        l60 l60Var = l60.e;
        this.g = d6.j(l60Var);
        r22 j = d6.j(l60Var);
        this.h = j;
        this.i = new yk1(j);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = nu0.f;
        this.r = new m1(this, 1);
        this.s = new h71();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = fc2.i(2, jk.f);
    }

    public static r51 e(int i, r51 r51Var, r51 r51Var2, boolean z) {
        w51 w51Var;
        if (r51Var.f.a == i && (r51Var2 == null || (r51Var.equals(r51Var2) && sn0.r(r51Var.g, r51Var2.g)))) {
            return r51Var;
        }
        if (r51Var instanceof w51) {
            w51Var = (w51) r51Var;
        } else {
            w51Var = null;
        }
        if (w51Var == null) {
            w51Var = r51Var.g;
            w51Var.getClass();
        }
        return w51Var.j.c(i, w51Var, r51Var2, z);
    }

    public static /* synthetic */ void n(j51 j51Var, d51 d51Var) {
        j51Var.m(d51Var, false, new te());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017a, code lost:
    
        r15 = r11.c;
        r15.getClass();
        r1 = r11.c;
        r1.getClass();
        r6 = defpackage.wc0.g(r0, r15, r1.a(r13), h(), r11.o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0192, code lost:
    
        r2.addFirst(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0195, code lost:
    
        r13 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019d, code lost:
    
        if (r13.hasNext() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x019f, code lost:
    
        r15 = (defpackage.d51) r13.next();
        r0 = r11.t.get(r11.s.b(r15.f.e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b5, code lost:
    
        if (r0 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b7, code lost:
    
        ((defpackage.h51) r0).a(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01bd, code lost:
    
        defpackage.y61.f(defpackage.l90.p(new java.lang.StringBuilder("NavigatorBackStack for "), r12.e, " should already be created"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01cf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01d0, code lost:
    
        r4.addAll(r2);
        r4.addLast(r14);
        r12 = defpackage.wn.r0(r2, r14).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e2, code lost:
    
        if (r12.hasNext() == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e4, code lost:
    
        r13 = (defpackage.d51) r12.next();
        r14 = r13.f.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ee, code lost:
    
        if (r14 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f0, code lost:
    
        j(r13, f(r14.f.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01fc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x014a, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0099, code lost:
    
        r5 = ((defpackage.d51) r2.first()).f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = new defpackage.te();
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if ((r12 instanceof defpackage.w51) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        r5.getClass();
        r5 = r5.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r7 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r7.hasPrevious() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        r8 = r7.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (defpackage.sn0.r(((defpackage.d51) r8).f, r5) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        r8 = (defpackage.d51) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r8 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        r8 = defpackage.wc0.g(r0, r5, r13, h(), r11.o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        r2.addFirst(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r4.isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000b, code lost:
    
        if (r2 == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (((defpackage.d51) r4.last()).f != r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        n(r11, (defpackage.d51) r4.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r5 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
    
        if (r5 != r12) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        if (r2.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        if (r5 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (d(r5.f.a, r5) == r5) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r5 = r5.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        if (r5 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r4.isEmpty() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        if (r13 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
    
        if (r13.isEmpty() != true) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bc, code lost:
    
        r8 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        if (r8.hasPrevious() == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        r9 = r8.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        if (defpackage.sn0.r(((defpackage.d51) r9).f, r5) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00db, code lost:
    
        r9 = (defpackage.d51) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dd, code lost:
    
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        r9 = defpackage.wc0.g(r0, r5, r5.a(r7), h(), r11.o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ed, code lost:
    
        r2.addFirst(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bb, code lost:
    
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if ((((defpackage.d51) r4.last()).f instanceof defpackage.x00) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f5, code lost:
    
        if (r2.isEmpty() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
    
        r1 = ((defpackage.d51) r2.first()).f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0104, code lost:
    
        if (r4.isEmpty() != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0110, code lost:
    
        if ((((defpackage.d51) r4.last()).f instanceof defpackage.w51) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0112, code lost:
    
        r3 = ((defpackage.d51) r4.last()).f;
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012b, code lost:
    
        if (((defpackage.w51) r3).j.b.b(r1.f.a) != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
    
        n(r11, (defpackage.d51) r4.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0137, code lost:
    
        r1 = (defpackage.d51) r4.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013d, code lost:
    
        if (r1 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013f, code lost:
    
        r1 = (defpackage.d51) r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0145, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0147, code lost:
    
        r1 = r1.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (l(((defpackage.d51) r4.last()).f.f.a, true, false) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0151, code lost:
    
        if (defpackage.sn0.r(r1, r11.c) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        r15 = r15.listIterator(r15.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015f, code lost:
    
        if (r15.hasPrevious() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0161, code lost:
    
        r1 = r15.previous();
        r3 = ((defpackage.d51) r1).f;
        r5 = r11.c;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0173, code lost:
    
        if (defpackage.sn0.r(r3, r5) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0175, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0176, code lost:
    
        r6 = (defpackage.d51) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0178, code lost:
    
        if (r6 != null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.r51 r12, android.os.Bundle r13, defpackage.d51 r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j51.a(r51, android.os.Bundle, d51, java.util.List):void");
    }

    public final boolean b() {
        te teVar;
        while (true) {
            teVar = this.f;
            if (teVar.isEmpty() || !(((d51) teVar.last()).f instanceof w51)) {
                break;
            }
            n(this, (d51) teVar.last());
        }
        d51 d51Var = (d51) teVar.g();
        ArrayList arrayList = this.y;
        if (d51Var != null) {
            arrayList.add(d51Var);
        }
        this.x++;
        r();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList B0 = wn.B0(arrayList);
            arrayList.clear();
            Iterator it = B0.iterator();
            while (it.hasNext()) {
                d51 d51Var2 = (d51) it.next();
                Iterator it2 = wn.A0(this.p).iterator();
                if (!it2.hasNext()) {
                    this.z.q(d51Var2);
                } else {
                    if (it2.next() != null) {
                        se.s();
                        return false;
                    }
                    r51 r51Var = d51Var2.f;
                    d51Var2.l.a();
                    throw null;
                }
            }
            ArrayList arrayList2 = new ArrayList(teVar);
            r22 r22Var = this.g;
            r22Var.getClass();
            r22Var.k(null, arrayList2);
            ArrayList o = o();
            r22 r22Var2 = this.h;
            r22Var2.getClass();
            r22Var2.k(null, o);
        }
        if (d51Var != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [sl1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [sl1, java.lang.Object] */
    public final boolean c(ArrayList arrayList, r51 r51Var, boolean z, boolean z2) {
        final j51 j51Var;
        boolean z3;
        String str;
        ?? obj = new Object();
        te teVar = new te();
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                g71 g71Var = (g71) it.next();
                ?? obj2 = new Object();
                d51 d51Var = (d51) this.f.last();
                j51Var = this;
                z3 = z2;
                t01 t01Var = new t01((sl1) obj2, (sl1) obj, j51Var, z3, teVar);
                g71Var.getClass();
                d51Var.getClass();
                j51Var.v = t01Var;
                g71Var.e(d51Var, z3);
                j51Var.v = null;
                if (!obj2.e) {
                    break;
                }
                this = j51Var;
                z2 = z3;
            } else {
                j51Var = this;
                z3 = z2;
                break;
            }
        }
        if (z3) {
            final int i = 0;
            LinkedHashMap linkedHashMap = j51Var.l;
            if (!z) {
                r90 r90Var = new r90(new o52(mv1.G(r51Var, new mm0(25)), new oe0(j51Var) { // from class: i51
                    public final /* synthetic */ j51 f;

                    {
                        this.f = j51Var;
                    }

                    @Override // defpackage.oe0
                    public final Object invoke(Object obj3) {
                        boolean containsKey;
                        int i2 = i;
                        j51 j51Var2 = this.f;
                        r51 r51Var2 = (r51) obj3;
                        switch (i2) {
                            case 0:
                                r51Var2.getClass();
                                containsKey = j51Var2.l.containsKey(Integer.valueOf(r51Var2.f.a));
                                break;
                            default:
                                r51Var2.getClass();
                                containsKey = j51Var2.l.containsKey(Integer.valueOf(r51Var2.f.a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (r90Var.hasNext()) {
                    Integer valueOf = Integer.valueOf(((r51) r90Var.next()).f.a);
                    g51 g51Var = (g51) teVar.e();
                    if (g51Var != null) {
                        str = (String) g51Var.a.b;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put(valueOf, str);
                }
            }
            if (!teVar.isEmpty()) {
                f8 f8Var = ((g51) teVar.first()).a;
                final int i2 = 1;
                r90 r90Var2 = new r90(new o52(mv1.G(j51Var.d(f8Var.a, null), new mm0(26)), new oe0(j51Var) { // from class: i51
                    public final /* synthetic */ j51 f;

                    {
                        this.f = j51Var;
                    }

                    @Override // defpackage.oe0
                    public final Object invoke(Object obj3) {
                        boolean containsKey;
                        int i22 = i2;
                        j51 j51Var2 = this.f;
                        r51 r51Var2 = (r51) obj3;
                        switch (i22) {
                            case 0:
                                r51Var2.getClass();
                                containsKey = j51Var2.l.containsKey(Integer.valueOf(r51Var2.f.a));
                                break;
                            default:
                                r51Var2.getClass();
                                containsKey = j51Var2.l.containsKey(Integer.valueOf(r51Var2.f.a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (r90Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((r51) r90Var2.next()).f.a), (String) f8Var.b);
                }
                if (linkedHashMap.values().contains((String) f8Var.b)) {
                    j51Var.m.put((String) f8Var.b, teVar);
                }
            }
        }
        j51Var.b.invoke();
        return obj.e;
    }

    public final r51 d(int i, r51 r51Var) {
        r51 r51Var2;
        w51 w51Var = this.c;
        if (w51Var == null) {
            return null;
        }
        if (w51Var.f.a == i) {
            if (r51Var != null) {
                if (sn0.r(w51Var, r51Var) && r51Var.g == null) {
                    return this.c;
                }
            } else {
                return w51Var;
            }
        }
        d51 d51Var = (d51) this.f.g();
        if (d51Var == null || (r51Var2 = d51Var.f) == null) {
            r51Var2 = this.c;
            r51Var2.getClass();
        }
        return e(i, r51Var2, r51Var, false);
    }

    public final d51 f(int i) {
        Object obj;
        te teVar = this.f;
        ListIterator<E> listIterator = teVar.listIterator(teVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((d51) obj).f.f.a == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        d51 d51Var = (d51) obj;
        if (d51Var != null) {
            return d51Var;
        }
        StringBuilder q = l90.q("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        q.append(g());
        throw new IllegalArgumentException(q.toString().toString());
    }

    public final r51 g() {
        d51 d51Var = (d51) this.f.g();
        if (d51Var != null) {
            return d51Var.f;
        }
        return null;
    }

    public final nu0 h() {
        if (this.n == null) {
            return nu0.g;
        }
        return this.q;
    }

    public final w51 i() {
        r51 r51Var;
        w51 w51Var;
        d51 d51Var = (d51) this.f.g();
        if (d51Var == null || (r51Var = d51Var.f) == null) {
            r51Var = this.c;
            r51Var.getClass();
        }
        if (r51Var instanceof w51) {
            w51Var = (w51) r51Var;
        } else {
            w51Var = null;
        }
        if (w51Var == null) {
            w51 w51Var2 = r51Var.g;
            w51Var2.getClass();
            return w51Var2;
        }
        return w51Var;
    }

    public final void j(d51 d51Var, d51 d51Var2) {
        this.j.put(d51Var, d51Var2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(d51Var2) == null) {
            linkedHashMap.put(d51Var2, new lf());
        }
        Object obj = linkedHashMap.get(d51Var2);
        obj.getClass();
        ((lf) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x025e, code lost:
    
        if (r7.hasNext() == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0260, code lost:
    
        r8 = (defpackage.d51) r7.next();
        r9 = r8.f.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x026a, code lost:
    
        if (r9 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x026c, code lost:
    
        j(r8, f(r9.f.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0277, code lost:
    
        r25.f.addLast(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x027d, code lost:
    
        r6 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0285, code lost:
    
        if (r6.hasNext() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0287, code lost:
    
        r7 = (defpackage.d51) r6.next();
        r8 = r25.s.b(r7.f.e);
        r9 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0299, code lost:
    
        if (r9 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x029c, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x029d, code lost:
    
        if (r9 != null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02a0, code lost:
    
        r8.c(r9);
        r8 = r8.b();
        r9 = r8.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02a9, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02aa, code lost:
    
        r10 = defpackage.wn.B0((java.util.Collection) r8.e.e.getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c4, code lost:
    
        if (r11.hasPrevious() == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02d4, code lost:
    
        if (defpackage.sn0.r(((defpackage.d51) r11.previous()).j, r7.j) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02d6, code lost:
    
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02de, code lost:
    
        r10.set(r11, r7);
        r7 = r8.b;
        r7.getClass();
        r7.k(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ea, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02dd, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02db, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ed, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02ee, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01f2, code lost:
    
        if (r26.f.a == r6.f.a) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01df, code lost:
    
        if (r10.equals(r6) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f4, code lost:
    
        r6 = new defpackage.te();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ff, code lost:
    
        if (defpackage.xn.A(r25.f) < r7) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0201, code lost:
    
        r9 = (defpackage.d51) defpackage.wn.u0(r25.f);
        q(r9);
        r16 = new defpackage.d51(r9.e, r9.f, r9.f.a(r27), r9.h, r9.i, r9.j, r9.k);
        r10 = r16.l;
        r11 = r9.h;
        r10.getClass();
        r11.getClass();
        r10.d = r11;
        r10 = r16.l;
        r9 = r9.l.k;
        r10.getClass();
        r9.getClass();
        r10.k = r9;
        r10.b();
        r6.addFirst(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0256, code lost:
    
        r7 = r6.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[LOOP:1: B:13:0x004e->B:42:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5 A[EDGE_INSN: B:43:0x00e5->B:44:0x00e5 BREAK  A[LOOP:1: B:13:0x004e->B:42:0x00e1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0335 A[LOOP:3: B:58:0x032f->B:60:0x0335, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0179  */
    /* JADX WARN: Type inference failed for: r3v4, types: [sl1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.r51 r26, android.os.Bundle r27, defpackage.l61 r28) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j51.k(r51, android.os.Bundle, l61):void");
    }

    public final boolean l(int i, boolean z, boolean z2) {
        r51 r51Var;
        te teVar = this.f;
        if (teVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = wn.w0(teVar).iterator();
        while (true) {
            if (it.hasNext()) {
                r51Var = ((d51) it.next()).f;
                String str = r51Var.e;
                u51 u51Var = r51Var.f;
                g71 b = this.s.b(str);
                if (z || u51Var.a != i) {
                    arrayList.add(b);
                }
                if (u51Var.a == i) {
                    break;
                }
            } else {
                r51Var = null;
                break;
            }
        }
        if (r51Var == null) {
            int i2 = r51.i;
            Log.i("NavController", "Ignoring popBackStack to destination " + fp.A(this.a.c, i) + " as it was not found on the current back stack");
            return false;
        }
        return c(arrayList, r51Var, z, z2);
    }

    public final void m(d51 d51Var, boolean z, te teVar) {
        k51 k51Var;
        yk1 yk1Var;
        Set set;
        d51Var.getClass();
        te teVar2 = this.f;
        d51 d51Var2 = (d51) teVar2.last();
        if (sn0.r(d51Var2, d51Var)) {
            wn.u0(teVar2);
            h51 h51Var = (h51) this.t.get(this.s.b(d51Var2.f.e));
            boolean z2 = true;
            if ((h51Var == null || (yk1Var = h51Var.f) == null || (set = (Set) yk1Var.e.getValue()) == null || !set.contains(d51Var2)) && !this.k.containsKey(d51Var2)) {
                z2 = false;
            }
            nu0 nu0Var = d51Var2.l.j.c;
            nu0 nu0Var2 = nu0.g;
            if (nu0Var.compareTo(nu0Var2) >= 0) {
                if (z) {
                    d51Var2.a(nu0Var2);
                    teVar.addFirst(new g51(d51Var2));
                }
                if (!z2) {
                    d51Var2.a(nu0.e);
                    q(d51Var2);
                } else {
                    d51Var2.a(nu0Var2);
                }
            }
            if (!z && !z2 && (k51Var = this.o) != null) {
                String str = d51Var2.j;
                str.getClass();
                sg2 sg2Var = (sg2) k51Var.b.remove(str);
                if (sg2Var != null) {
                    sg2Var.a();
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Attempted to pop ");
        sb.append(d51Var.f);
        r51 r51Var = d51Var2.f;
        sb.append(", which is not the top of the back stack (");
        sb.append(r51Var);
        sb.append(')');
        throw new IllegalStateException(sb.toString().toString());
    }

    public final ArrayList o() {
        nu0 nu0Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            nu0Var = nu0.h;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((h51) it.next()).f.e.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                d51 d51Var = (d51) obj;
                if (!arrayList.contains(d51Var) && d51Var.l.k.compareTo(nu0Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            wn.d0(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            d51 d51Var2 = (d51) next;
            if (!arrayList.contains(d51Var2) && d51Var2.l.k.compareTo(nu0Var) >= 0) {
                arrayList3.add(next);
            }
        }
        wn.d0(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((d51) next2).f instanceof w51)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [sl1, java.lang.Object] */
    public final boolean p(int i, Bundle bundle, l61 l61Var) {
        r51 r51Var;
        String str;
        d51 d51Var;
        r51 r51Var2;
        Bundle bundle2;
        ClassLoader classLoader;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str2 = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (sn0.r((String) it.next(), str2)) {
                it.remove();
            }
        }
        te teVar = (te) fc2.r(this.m).remove(str2);
        y50 y50Var = this.a.c;
        ArrayList arrayList = new ArrayList();
        d51 d51Var2 = (d51) this.f.g();
        if ((d51Var2 != null && (r51Var = d51Var2.f) != null) || (r51Var = this.c) != null) {
            if (teVar != null) {
                Iterator it2 = teVar.iterator();
                while (it2.hasNext()) {
                    g51 g51Var = (g51) it2.next();
                    f8 f8Var = g51Var.a;
                    f8 f8Var2 = g51Var.a;
                    r51 e = e(f8Var.a, r51Var, null, true);
                    if (e != null) {
                        nu0 h = h();
                        k51 k51Var = this.o;
                        y50Var.getClass();
                        h.getClass();
                        Bundle bundle3 = (Bundle) f8Var2.c;
                        if (bundle3 != null) {
                            Context context = y50Var.a;
                            if (context != null) {
                                classLoader = context.getClassLoader();
                            } else {
                                classLoader = null;
                            }
                            bundle3.setClassLoader(classLoader);
                            bundle2 = bundle3;
                        } else {
                            bundle2 = null;
                        }
                        String str3 = (String) f8Var2.b;
                        Bundle bundle4 = (Bundle) f8Var2.d;
                        str3.getClass();
                        arrayList.add(new d51(y50Var, e, bundle2, h, k51Var, str3, bundle4));
                        r51Var = e;
                    } else {
                        int i2 = r51.i;
                        y61.o("Restore State failed: destination ", fp.A(y50Var, f8Var2.a), " cannot be found from the current destination ", r51Var);
                        return false;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(((d51) next).f instanceof w51)) {
                    arrayList3.add(next);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                d51 d51Var3 = (d51) it4.next();
                List list = (List) wn.o0(arrayList2);
                if (list != null && (d51Var = (d51) wn.n0(list)) != null && (r51Var2 = d51Var.f) != null) {
                    str = r51Var2.e;
                } else {
                    str = null;
                }
                if (sn0.r(str, d51Var3.f.e)) {
                    list.add(d51Var3);
                } else {
                    arrayList2.add(xn.G(d51Var3));
                }
            }
            ?? obj = new Object();
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                List list2 = (List) it5.next();
                g71 b = this.s.b(((d51) wn.g0(list2)).f.e);
                ArrayList arrayList4 = arrayList;
                this.u = new k2(obj, arrayList4, new Object(), this, bundle, 3);
                b.d(list2, l61Var);
                this.u = null;
                arrayList = arrayList4;
            }
            return obj.e;
        }
        se.p("You must call setGraph() before calling getGraph()");
        return false;
    }

    public final void q(d51 d51Var) {
        Integer num;
        d51Var.getClass();
        d51 d51Var2 = (d51) this.j.remove(d51Var);
        if (d51Var2 != null) {
            LinkedHashMap linkedHashMap = this.k;
            lf lfVar = (lf) linkedHashMap.get(d51Var2);
            if (lfVar != null) {
                num = Integer.valueOf(lfVar.a.decrementAndGet());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                h51 h51Var = (h51) this.t.get(this.s.b(d51Var2.f.e));
                if (h51Var != null) {
                    h51Var.c(d51Var2);
                }
                linkedHashMap.remove(d51Var2);
            }
        }
    }

    public final void r() {
        Boolean bool;
        lf lfVar;
        yk1 yk1Var;
        Set set;
        ArrayList B0 = wn.B0(this.f);
        if (!B0.isEmpty()) {
            ArrayList G = xn.G(((d51) wn.n0(B0)).f);
            ArrayList arrayList = new ArrayList();
            if (wn.n0(G) instanceof x00) {
                Iterator it = wn.w0(B0).iterator();
                while (it.hasNext()) {
                    r51 r51Var = ((d51) it.next()).f;
                    arrayList.add(r51Var);
                    if (!(r51Var instanceof x00) && !(r51Var instanceof w51)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (d51 d51Var : wn.w0(B0)) {
                nu0 nu0Var = d51Var.l.k;
                r51 r51Var2 = d51Var.f;
                r51 r51Var3 = (r51) wn.h0(G);
                nu0 nu0Var2 = nu0.i;
                nu0 nu0Var3 = nu0.h;
                if (r51Var3 != null && r51Var3.f.a == r51Var2.f.a) {
                    if (nu0Var != nu0Var2) {
                        h51 h51Var = (h51) this.t.get(this.s.b(d51Var.f.e));
                        if (h51Var != null && (yk1Var = h51Var.f) != null && (set = (Set) yk1Var.e.getValue()) != null) {
                            bool = Boolean.valueOf(set.contains(d51Var));
                        } else {
                            bool = null;
                        }
                        if (!sn0.r(bool, Boolean.TRUE) && ((lfVar = (lf) this.k.get(d51Var)) == null || lfVar.a.get() != 0)) {
                            hashMap.put(d51Var, nu0Var2);
                        } else {
                            hashMap.put(d51Var, nu0Var3);
                        }
                    }
                    r51 r51Var4 = (r51) wn.h0(arrayList);
                    if (r51Var4 != null && r51Var4.f.a == r51Var2.f.a) {
                        wn.t0(arrayList);
                    }
                    wn.t0(G);
                    w51 w51Var = r51Var2.g;
                    if (w51Var != null) {
                        G.add(w51Var);
                    }
                } else if (!arrayList.isEmpty() && r51Var2.f.a == ((r51) wn.g0(arrayList)).f.a) {
                    r51 r51Var5 = (r51) wn.t0(arrayList);
                    if (nu0Var == nu0Var2) {
                        d51Var.a(nu0Var3);
                    } else if (nu0Var != nu0Var3) {
                        hashMap.put(d51Var, nu0Var3);
                    }
                    w51 w51Var2 = r51Var5.g;
                    if (w51Var2 != null && !arrayList.contains(w51Var2)) {
                        arrayList.add(w51Var2);
                    }
                } else {
                    d51Var.a(nu0.g);
                }
            }
            Iterator it2 = B0.iterator();
            while (it2.hasNext()) {
                d51 d51Var2 = (d51) it2.next();
                nu0 nu0Var4 = (nu0) hashMap.get(d51Var2);
                if (nu0Var4 != null) {
                    d51Var2.a(nu0Var4);
                } else {
                    d51Var2.l.b();
                }
            }
        }
    }
}
