package defpackage;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qg implements be1 {
    public final Object a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    public qg(rc rcVar, k92 k92Var, List list, c00 c00Var, cd0 cd0Var) {
        List list2;
        int i;
        String str;
        String str2;
        l60 l60Var;
        List list3;
        rc rcVar2 = rcVar;
        k92 k92Var2 = k92Var;
        this.a = rcVar2;
        this.b = list;
        final int i2 = 0;
        de0 de0Var = new de0(this) { // from class: h31
            public final /* synthetic */ qg f;

            {
                this.f = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.de0
            public final Object invoke() {
                int i3 = i2;
                float f = 0.0f;
                ae1 ae1Var = null;
                int i4 = 1;
                qg qgVar = this.f;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) qgVar.e;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float b = ((ae1) r0).a.b();
                            int size = arrayList.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i4);
                                    float b2 = ((ae1) obj).a.b();
                                    r0 = z;
                                    if (Float.compare(b, b2) < 0) {
                                        r0 = obj;
                                        b = b2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                        z = r0;
                                    }
                                }
                            }
                            ae1Var = r0;
                        }
                        ae1 ae1Var2 = ae1Var;
                        if (ae1Var2 != null) {
                            f = ae1Var2.a.b();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) qgVar.e;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((ae1) r02).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i4);
                                    float c2 = ((ae1) obj2).a.i.c();
                                    r02 = z2;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                        z2 = r02;
                                    }
                                }
                            }
                            ae1Var = r02;
                        }
                        ae1 ae1Var3 = ae1Var;
                        if (ae1Var3 != null) {
                            f = ae1Var3.a.i.c();
                        }
                        return Float.valueOf(f);
                }
            }
        };
        xt0 xt0Var = xt0.f;
        this.c = lo.O(xt0Var, de0Var);
        final int i3 = 1;
        this.d = lo.O(xt0Var, new de0(this) { // from class: h31
            public final /* synthetic */ qg f;

            {
                this.f = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // defpackage.de0
            public final Object invoke() {
                int i32 = i3;
                float f = 0.0f;
                ae1 ae1Var = null;
                int i4 = 1;
                qg qgVar = this.f;
                switch (i32) {
                    case 0:
                        ArrayList arrayList = (ArrayList) qgVar.e;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float b = ((ae1) r0).a.b();
                            int size = arrayList.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i4);
                                    float b2 = ((ae1) obj).a.b();
                                    r0 = z;
                                    if (Float.compare(b, b2) < 0) {
                                        r0 = obj;
                                        b = b2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                        z = r0;
                                    }
                                }
                            }
                            ae1Var = r0;
                        }
                        ae1 ae1Var2 = ae1Var;
                        if (ae1Var2 != null) {
                            f = ae1Var2.a.b();
                        }
                        return Float.valueOf(f);
                    default:
                        ArrayList arrayList2 = (ArrayList) qgVar.e;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((ae1) r02).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i4);
                                    float c2 = ((ae1) obj2).a.i.c();
                                    r02 = z2;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                        z2 = r02;
                                    }
                                }
                            }
                            ae1Var = r02;
                        }
                        ae1 ae1Var3 = ae1Var;
                        if (ae1Var3 != null) {
                            f = ae1Var3.a.i.c();
                        }
                        return Float.valueOf(f);
                }
            }
        });
        de1 de1Var = k92Var2.b;
        rc rcVar3 = sc.a;
        ArrayList arrayList = rcVar2.h;
        String str3 = rcVar2.f;
        int i4 = 6;
        l60 l60Var2 = l60.e;
        if (arrayList != null) {
            list2 = wn.x0(arrayList, new uc0(i4));
        } else {
            list2 = l60Var2;
        }
        ArrayList arrayList2 = new ArrayList();
        te teVar = new te();
        int size = list2.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            qc qcVar = (qc) list2.get(i5);
            de1 a = de1Var.a((de1) qcVar.a);
            int i7 = qcVar.b;
            int i8 = qcVar.c;
            if (i7 > i8) {
                ll0.a("Reversed range is not supported");
            }
            while (i6 < i7 && !teVar.isEmpty()) {
                qc qcVar2 = (qc) teVar.last();
                List list4 = list2;
                int i9 = qcVar2.c;
                l60 l60Var3 = l60Var2;
                Object obj = qcVar2.a;
                if (i7 < i9) {
                    arrayList2.add(new qc(obj, i6, i7));
                    i6 = i7;
                    list2 = list4;
                    l60Var2 = l60Var3;
                } else {
                    int i10 = size;
                    arrayList2.add(new qc(obj, i6, i9));
                    i6 = qcVar2.c;
                    while (!teVar.isEmpty() && i6 == ((qc) teVar.last()).c) {
                        teVar.removeLast();
                    }
                    list2 = list4;
                    l60Var2 = l60Var3;
                    size = i10;
                }
            }
            List list5 = list2;
            l60 l60Var4 = l60Var2;
            int i11 = size;
            if (i6 < i7) {
                arrayList2.add(new qc(de1Var, i6, i7));
                i6 = i7;
            }
            qc qcVar3 = (qc) teVar.g();
            if (qcVar3 != null) {
                int i12 = qcVar3.c;
                Object obj2 = qcVar3.a;
                int i13 = qcVar3.b;
                if (i13 == i7 && i12 == i8) {
                    teVar.removeLast();
                    teVar.addLast(new qc(((de1) obj2).a(a), i7, i8));
                } else if (i13 == i12) {
                    arrayList2.add(new qc(obj2, i13, i12));
                    teVar.removeLast();
                    teVar.addLast(new qc(a, i7, i8));
                } else if (i12 >= i8) {
                    teVar.addLast(new qc(((de1) obj2).a(a), i7, i8));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                teVar.addLast(new qc(a, i7, i8));
            }
            i5++;
            list2 = list5;
            l60Var2 = l60Var4;
            size = i11;
        }
        l60 l60Var5 = l60Var2;
        while (i6 <= str3.length() && !teVar.isEmpty()) {
            qc qcVar4 = (qc) teVar.last();
            Object obj3 = qcVar4.a;
            int i14 = qcVar4.c;
            arrayList2.add(new qc(obj3, i6, i14));
            while (!teVar.isEmpty() && i14 == ((qc) teVar.last()).c) {
                teVar.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str3.length()) {
            arrayList2.add(new qc(de1Var, i6, str3.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new qc(de1Var, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i15 = i;
        while (i15 < size2) {
            qc qcVar5 = (qc) arrayList2.get(i15);
            int i16 = qcVar5.b;
            int i17 = qcVar5.c;
            if (i16 != i17) {
                str = str3.substring(i16, i17);
            } else {
                str = "";
            }
            List a2 = sc.a(rcVar2, i16, i17, new p1(6));
            rc rcVar4 = new rc(str, a2 == null ? l60Var5 : a2);
            de1 de1Var2 = (de1) qcVar5.a;
            if (de1Var2.b == 0) {
                str2 = str3;
                de1Var2 = new de1(de1Var2.a, de1Var.b, de1Var2.c, de1Var2.d, de1Var2.e, de1Var2.f, de1Var2.g, de1Var2.h, de1Var2.i);
            } else {
                str2 = str3;
            }
            k92 k92Var3 = new k92(k92Var2.a, de1Var.a(de1Var2));
            ?? r6 = rcVar4.e;
            if (r6 == 0) {
                l60Var = l60Var5;
            } else {
                l60Var = r6;
            }
            List list6 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i18 = 0;
            while (i18 < size3) {
                qc qcVar6 = (qc) list6.get(i18);
                de1 de1Var3 = de1Var;
                int i19 = qcVar6.b;
                k92 k92Var4 = k92Var3;
                int i20 = qcVar6.c;
                if (sc.b(i16, i17, i19, i20)) {
                    if (i16 > i19 || i20 > i17) {
                        ll0.a("placeholder can not overlap with paragraph.");
                    }
                    list3 = list6;
                    arrayList4.add(new qc(qcVar6.a, i19 - i16, i20 - i16));
                } else {
                    list3 = list6;
                }
                i18++;
                list6 = list3;
                k92Var3 = k92Var4;
                de1Var = de1Var3;
            }
            arrayList3.add(new ae1(new m8(str, k92Var3, l60Var, arrayList4, cd0Var, c00Var), i16, i17));
            i15++;
            rcVar2 = rcVar;
            k92Var2 = k92Var;
            str3 = str2;
        }
        this.e = arrayList3;
    }

    @Override // defpackage.be1
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ae1) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.be1
    public float b() {
        return ((Number) ((rr0) this.c).getValue()).floatValue();
    }

    @Override // defpackage.be1
    public float c() {
        return ((Number) ((rr0) this.d).getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ul1] */
    /* JADX WARN: Type inference failed for: r10v1, types: [sl0, java.lang.Object, ql] */
    public ql d(pg pgVar, de0 de0Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        ?? obj = new Object();
        obj.e = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                pgVar.b(th);
                return g3.v;
            }
            mf mfVar = (mf) this.c;
            do {
                i = mfVar.get();
                i2 = i + 1;
            } while (!mfVar.compareAndSet(i, i2));
            int i4 = 1;
            if ((134217727 & i2) == 1) {
                z = true;
            } else {
                z = false;
            }
            obj.e = (i2 >>> 27) & 15;
            ((b41) this.d).a(pgVar);
            if (z && de0Var != null) {
                try {
                    de0Var.invoke();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                b41 b41Var = (b41) this.d;
                                Object[] objArr = b41Var.a;
                                int i5 = b41Var.b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((pg) objArr[i6]).b(th2);
                                }
                                ((b41) this.d).d();
                                mf mfVar2 = (mf) this.c;
                                do {
                                    i3 = mfVar2.get();
                                } while (!mfVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            qd qdVar = new qd(pgVar, this, (Object) obj, i4);
            ?? obj2 = new Object();
            obj2.e = qdVar;
            obj2.f = new AtomicInteger(0);
            return obj2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi e(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r14 = r2.get(r15)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.j(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg.e(int):java.text.Bidi");
    }

    public void f(oe0 oe0Var) {
        int i;
        synchronized (this.a) {
            try {
                b41 b41Var = (b41) this.d;
                this.d = (b41) this.e;
                this.e = b41Var;
                mf mfVar = (mf) this.c;
                do {
                    i = mfVar.get();
                } while (!mfVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = b41Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    oe0Var.invoke(b41Var.f(i3));
                }
                b41Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public float g(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        if (z) {
            return layout.getPrimaryHorizontal(i);
        }
        return layout.getSecondaryHorizontal(i);
    }

    public float h(int i, boolean z, boolean z2) {
        boolean z3;
        Bidi bidi;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        int i4;
        boolean z6;
        boolean z7;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return g(i, z);
        }
        int E = lo.E(layout, i, z2);
        int lineStart = layout.getLineStart(E);
        int lineEnd = layout.getLineEnd(E);
        if (i != lineStart && i != lineEnd) {
            return g(i, z);
        }
        if (i != 0 && i != layout.getText().length()) {
            int i5 = i(i, z2);
            if (layout.getParagraphDirection(layout.getLineForOffset(j(i5))) == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            int k = k(lineEnd, lineStart);
            int j = j(i5);
            int i6 = lineStart - j;
            int i7 = k - j;
            Bidi e = e(i5);
            if (e != null) {
                bidi = e.createLineBidi(i6, i7);
            } else {
                bidi = null;
            }
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                lq0[] lq0VarArr = new lq0[runCount];
                for (int i8 = 0; i8 < runCount; i8++) {
                    int runStart = bidi.getRunStart(i8) + lineStart;
                    int runLimit = bidi.getRunLimit(i8) + lineStart;
                    if (bidi.getRunLevel(i8) % 2 == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    lq0VarArr[i8] = new lq0(runStart, runLimit, z7);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i9 = 0; i9 < runCount2; i9++) {
                    bArr[i9] = (byte) bidi.getRunLevel(i9);
                }
                Bidi.reorderVisually(bArr, 0, lq0VarArr, 0, runCount);
                if (i == lineStart) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < runCount) {
                            if (lq0VarArr[i10].a == i) {
                                i4 = i10;
                                break;
                            }
                            i10++;
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    lq0 lq0Var = lq0VarArr[i4];
                    if (!z && z3 != lq0Var.c) {
                        z6 = z3;
                    } else if (!z3) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (i4 == 0 && z6) {
                        return layout.getLineLeft(E);
                    }
                    if (i4 == runCount - 1 && !z6) {
                        return layout.getLineRight(E);
                    }
                    if (z6) {
                        return layout.getPrimaryHorizontal(lq0VarArr[i4 - 1].a);
                    }
                    return layout.getPrimaryHorizontal(lq0VarArr[i4 + 1].a);
                }
                if (i > k) {
                    i2 = k(i, lineStart);
                } else {
                    i2 = i;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < runCount) {
                        if (lq0VarArr[i11].b == i2) {
                            i3 = i11;
                            break;
                        }
                        i11++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                lq0 lq0Var2 = lq0VarArr[i3];
                if (!z && z3 != lq0Var2.c) {
                    if (!z3) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = z3;
                }
                if (i3 == 0 && z5) {
                    return layout.getLineLeft(E);
                }
                if (i3 == runCount - 1 && !z5) {
                    return layout.getLineRight(E);
                }
                if (z5) {
                    return layout.getPrimaryHorizontal(lq0VarArr[i3 - 1].b);
                }
                return layout.getPrimaryHorizontal(lq0VarArr[i3 + 1].b);
            }
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                if (!z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (i == lineStart) {
                z4 = z3;
            } else if (!z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return layout.getLineLeft(E);
            }
            return layout.getLineRight(E);
        }
        return g(i, z);
    }

    public int i(int i, boolean z) {
        int i2;
        ArrayList arrayList = (ArrayList) this.b;
        int r = xn.r(arrayList, Integer.valueOf(i));
        if (r < 0) {
            i2 = -(r + 1);
        } else {
            i2 = r + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int j(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    public int k(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.a).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((sn0.B(charAt, SharedConstants.DefaultBufferSize) < 0 || sn0.B(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void l(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        r22 r22Var = (r22) ((LinkedHashMap) this.c).get(str);
        if (r22Var != null) {
            r22Var.j(obj);
        }
        r22 r22Var2 = (r22) ((LinkedHashMap) this.d).get(str);
        if (r22Var2 != null) {
            r22Var2.j(obj);
        }
    }

    public qg() {
        this.a = new Object();
        this.c = new AtomicInteger(0);
        this.d = new b41();
        this.e = new b41();
    }

    public qg(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int K = i32.K(((Layout) this.a).getText(), '\n', i, 4);
            i = K < 0 ? ((Layout) this.a).getText().length() : K + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.a).getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.b).size()];
        ((ArrayList) this.b).size();
    }

    public qg(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new rp(this, 2);
    }
}
