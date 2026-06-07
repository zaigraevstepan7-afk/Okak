package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p6 implements qy, View.OnAttachStateChangeListener {
    public final q5 e;
    public final e5 f;
    public sl0 g;
    public final ArrayList h = new ArrayList();
    public final long i = 100;
    public m6 j = m6.e;
    public boolean k = true;
    public final lk l = sn0.c(1, 6, null);
    public final Handler m = new Handler(Looper.getMainLooper());
    public p31 n;
    public long o;
    public final p31 p;
    public su1 q;
    public boolean r;
    public final r5 s;

    public p6(q5 q5Var, e5 e5Var) {
        this.e = q5Var;
        this.f = e5Var;
        p31 p31Var = wm0.a;
        p31Var.getClass();
        this.n = p31Var;
        this.p = new p31();
        this.q = new su1(q5Var.getSemanticsOwner().a(), p31Var);
        this.s = new r5(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (defpackage.fp.w(r7.i, r0) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.wt r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.o6
            if (r0 == 0) goto L13
            r0 = r8
            o6 r0 = (defpackage.o6) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            o6 r0 = new o6
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f
            int r1 = r0.h
            r2 = 2
            r3 = 1
            hv r4 = defpackage.hv.e
            if (r1 == 0) goto L39
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            kk r1 = r0.e
            defpackage.io.K(r8)
            goto L46
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r7)
            r7 = 0
            return r7
        L33:
            kk r1 = r0.e
            defpackage.io.K(r8)
            goto L51
        L39:
            defpackage.io.K(r8)
            lk r8 = r7.l
            r8.getClass()
            kk r1 = new kk
            r1.<init>(r8)
        L46:
            r0.e = r1
            r0.h = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L51
            goto L7e
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7f
            r1.c()
            boolean r8 = r7.h()
            if (r8 == 0) goto L65
            r7.j()
        L65:
            boolean r8 = r7.r
            if (r8 != 0) goto L72
            r7.r = r3
            android.os.Handler r8 = r7.m
            r5 r5 = r7.s
            r8.post(r5)
        L72:
            r0.e = r1
            r0.h = r2
            long r5 = r7.i
            java.lang.Object r8 = defpackage.fp.w(r5, r0)
            if (r8 != r4) goto L46
        L7e:
            return r4
        L7f:
            od2 r7 = defpackage.od2.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6.a(wt):java.lang.Object");
    }

    @Override // defpackage.qy
    public final void b(uu0 uu0Var) {
        m(this.e.getSemanticsOwner().a());
        j();
        this.g = null;
    }

    @Override // defpackage.qy
    public final void c(uu0 uu0Var) {
        this.g = (sl0) this.f.invoke();
        l(-1, this.e.getSemanticsOwner().a());
        j();
    }

    public final void d(vm0 vm0Var) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        ru1 ru1Var;
        long[] jArr3;
        su1 su1Var;
        int i3;
        long[] jArr4;
        su1 su1Var2;
        rc rcVar;
        rc rcVar2;
        String str;
        long j3;
        String str2;
        int i4;
        rc rcVar3;
        vm0 vm0Var2 = vm0Var;
        int[] iArr3 = vm0Var2.b;
        long[] jArr5 = vm0Var2.a;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j4 = jArr5[i5];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j4 & 255) < 128) {
                            int i9 = iArr3[(i5 << 3) + i8];
                            c = c2;
                            su1 su1Var3 = (su1) this.p.b(i9);
                            tu1 tu1Var = (tu1) vm0Var2.b(i9);
                            if (tu1Var != null) {
                                ru1Var = tu1Var.a;
                            } else {
                                ru1Var = null;
                            }
                            if (ru1Var != null) {
                                j2 = j5;
                                int i10 = ru1Var.g;
                                i41 i41Var = ru1Var.d.e;
                                String str3 = "Invalid content capture ID";
                                if (su1Var3 == null) {
                                    Object[] objArr = i41Var.b;
                                    long[] jArr6 = i41Var.a;
                                    int i11 = i6;
                                    int length2 = jArr6.length - 2;
                                    iArr2 = iArr3;
                                    jArr2 = jArr5;
                                    if (length2 >= 0) {
                                        int i12 = 0;
                                        while (true) {
                                            long j6 = jArr6[i12];
                                            j = j4;
                                            if ((((~j6) << c) & j6 & j2) != j2) {
                                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                int i14 = 0;
                                                while (i14 < i13) {
                                                    if ((j6 & 255) < 128) {
                                                        j3 = j6;
                                                        zu1 zu1Var = (zu1) objArr[(i12 << 3) + i14];
                                                        zu1 zu1Var2 = vu1.B;
                                                        if (sn0.r(zu1Var, zu1Var2)) {
                                                            Object g = i41Var.g(zu1Var2);
                                                            if (g == null) {
                                                                g = null;
                                                            }
                                                            List list = (List) g;
                                                            if (list != null) {
                                                                rcVar3 = (rc) wn.h0(list);
                                                            } else {
                                                                rcVar3 = null;
                                                            }
                                                            String valueOf = String.valueOf(rcVar3);
                                                            sl0 sl0Var = this.g;
                                                            if (sl0Var != null) {
                                                                str2 = str3;
                                                                i4 = i8;
                                                                AutofillId w = sl0Var.w(i10);
                                                                if (w != null) {
                                                                    ((ContentCaptureSession) sl0Var.f).notifyViewTextChanged(w, valueOf);
                                                                    j6 = j3 >> i11;
                                                                    i14++;
                                                                    i8 = i4;
                                                                    str3 = str2;
                                                                } else {
                                                                    throw l90.f(str2);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        j3 = j6;
                                                    }
                                                    str2 = str3;
                                                    i4 = i8;
                                                    j6 = j3 >> i11;
                                                    i14++;
                                                    i8 = i4;
                                                    str3 = str2;
                                                }
                                                str = str3;
                                                i = i8;
                                                if (i13 != i11) {
                                                    break;
                                                }
                                            } else {
                                                str = str3;
                                                i = i8;
                                            }
                                            if (i12 == length2) {
                                                break;
                                            }
                                            i12++;
                                            j4 = j;
                                            i8 = i;
                                            str3 = str;
                                            i11 = 8;
                                        }
                                    } else {
                                        j = j4;
                                        i = i8;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    jArr2 = jArr5;
                                    j = j4;
                                    i = i8;
                                    Object[] objArr2 = i41Var.b;
                                    long[] jArr7 = i41Var.a;
                                    int length3 = jArr7.length - 2;
                                    if (length3 >= 0) {
                                        int i15 = 0;
                                        while (true) {
                                            long j7 = jArr7[i15];
                                            Object[] objArr3 = objArr2;
                                            long[] jArr8 = jArr7;
                                            if ((((~j7) << c) & j7 & j2) != j2) {
                                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                                int i17 = 0;
                                                while (i17 < i16) {
                                                    if ((j7 & 255) < 128) {
                                                        zu1 zu1Var3 = (zu1) objArr3[(i15 << 3) + i17];
                                                        i3 = i17;
                                                        zu1 zu1Var4 = vu1.B;
                                                        if (sn0.r(zu1Var3, zu1Var4)) {
                                                            Object g2 = su1Var3.a.e.g(zu1Var4);
                                                            if (g2 == null) {
                                                                g2 = null;
                                                            }
                                                            List list2 = (List) g2;
                                                            if (list2 != null) {
                                                                rcVar = (rc) wn.h0(list2);
                                                            } else {
                                                                rcVar = null;
                                                            }
                                                            Object g3 = i41Var.g(zu1Var4);
                                                            if (g3 == null) {
                                                                g3 = null;
                                                            }
                                                            List list3 = (List) g3;
                                                            if (list3 != null) {
                                                                rcVar2 = (rc) wn.h0(list3);
                                                            } else {
                                                                rcVar2 = null;
                                                            }
                                                            if (!sn0.r(rcVar, rcVar2)) {
                                                                String valueOf2 = String.valueOf(rcVar2);
                                                                sl0 sl0Var2 = this.g;
                                                                if (sl0Var2 != null) {
                                                                    jArr4 = jArr8;
                                                                    su1Var2 = su1Var3;
                                                                    AutofillId w2 = sl0Var2.w(i10);
                                                                    if (w2 != null) {
                                                                        ((ContentCaptureSession) sl0Var2.f).notifyViewTextChanged(w2, valueOf2);
                                                                        j7 >>= 8;
                                                                        i17 = i3 + 1;
                                                                        su1Var3 = su1Var2;
                                                                        jArr8 = jArr4;
                                                                    } else {
                                                                        throw l90.f("Invalid content capture ID");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i3 = i17;
                                                    }
                                                    jArr4 = jArr8;
                                                    su1Var2 = su1Var3;
                                                    j7 >>= 8;
                                                    i17 = i3 + 1;
                                                    su1Var3 = su1Var2;
                                                    jArr8 = jArr4;
                                                }
                                                jArr3 = jArr8;
                                                su1Var = su1Var3;
                                                if (i16 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr3 = jArr8;
                                                su1Var = su1Var3;
                                            }
                                            if (i15 == length3) {
                                                break;
                                            }
                                            i15++;
                                            objArr2 = objArr3;
                                            su1Var3 = su1Var;
                                            jArr7 = jArr3;
                                        }
                                    }
                                }
                                i2 = 8;
                            } else {
                                throw l90.f("no value for specified key");
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i8;
                            i2 = i6;
                        }
                        j4 = j >> i2;
                        i8 = i + 1;
                        vm0Var2 = vm0Var;
                        i6 = i2;
                        c2 = c;
                        j5 = j2;
                        iArr3 = iArr2;
                        jArr5 = jArr2;
                    }
                    iArr = iArr3;
                    jArr = jArr5;
                    if (i7 != i6) {
                        return;
                    }
                } else {
                    iArr = iArr3;
                    jArr = jArr5;
                }
                if (i5 != length) {
                    i5++;
                    vm0Var2 = vm0Var;
                    iArr3 = iArr;
                    jArr5 = jArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void e(ru1 ru1Var, se0 se0Var) {
        ru1Var.getClass();
        List j = ru1.j(4, ru1Var);
        int size = j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j.get(i2);
            if (f().a(((ru1) obj).g)) {
                se0Var.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final vm0 f() {
        if (this.k) {
            this.k = false;
            this.n = mp0.t(this.e.getSemanticsOwner(), i5.i);
            this.o = System.currentTimeMillis();
        }
        return this.n;
    }

    public final boolean h() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public final void j() {
        sl0 sl0Var = this.g;
        if (sl0Var != null) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) sl0Var.f;
            ArrayList arrayList = this.h;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ct ctVar = (ct) arrayList.get(i);
                    int ordinal = ctVar.c.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            AutofillId w = sl0Var.w(ctVar.a);
                            if (w != null) {
                                contentCaptureSession.notifyViewDisappeared(w);
                            }
                        } else {
                            se.m();
                            return;
                        }
                    } else {
                        ov1 ov1Var = ctVar.d;
                        if (ov1Var != null) {
                            contentCaptureSession.notifyViewAppeared((ViewStructure) ov1Var.f);
                        }
                    }
                }
                contentCaptureSession.notifyViewsDisappeared(((View) sl0Var.e).getAutofillId(), new long[]{Long.MIN_VALUE});
                arrayList.clear();
            }
        }
    }

    public final void k(ru1 ru1Var, su1 su1Var) {
        e(ru1Var, new g6(1, su1Var, this));
        List j = ru1.j(4, ru1Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ru1 ru1Var2 = (ru1) j.get(i);
            vm0 f = f();
            int i2 = ru1Var2.g;
            if (f.a(i2)) {
                p31 p31Var = this.p;
                if (p31Var.a(i2)) {
                    Object b = p31Var.b(i2);
                    if (b != null) {
                        k(ru1Var2, (su1) b);
                    } else {
                        throw l90.f("node not present in pruned tree before this change");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r18, defpackage.ru1 r19) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6.l(int, ru1):void");
    }

    public final void m(ru1 ru1Var) {
        if (h()) {
            this.h.add(new ct(ru1Var.g, this.o, dt.f, null));
            List j = ru1.j(4, ru1Var);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                m((ru1) j.get(i));
            }
        }
    }

    public final void n() {
        p31 p31Var = this.p;
        p31Var.c();
        vm0 f = f();
        int[] iArr = f.b;
        Object[] objArr = f.c;
        long[] jArr = f.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            p31Var.i(iArr[i4], new su1(((tu1) objArr[i4]).a, f()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.q = new su1(this.e.getSemanticsOwner().a(), f());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.m.removeCallbacks(this.s);
        this.g = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
