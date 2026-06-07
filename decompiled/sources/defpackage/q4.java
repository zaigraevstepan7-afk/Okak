package defpackage;

import android.graphics.Typeface;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q4 implements cg, d12, te2 {
    public final /* synthetic */ int e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public q4(Typeface typeface, b11 b11Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        this.e = 5;
        this.i = typeface;
        this.f = b11Var;
        this.h = new c11(1024);
        int a = b11Var.a(6);
        if (a != 0) {
            int i6 = a + b11Var.e;
            i = ((ByteBuffer) b11Var.h).getInt(((ByteBuffer) b11Var.h).getInt(i6) + i6);
        } else {
            i = 0;
        }
        this.g = new char[i * 2];
        int a2 = b11Var.a(6);
        if (a2 != 0) {
            int i7 = a2 + b11Var.e;
            i2 = ((ByteBuffer) b11Var.h).getInt(((ByteBuffer) b11Var.h).getInt(i7) + i7);
        } else {
            i2 = 0;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            kc2 kc2Var = new kc2(this, i8);
            a11 b = kc2Var.b();
            int a3 = b.a(4);
            if (a3 != 0) {
                i3 = ((ByteBuffer) b.h).getInt(a3 + b.e);
            } else {
                i3 = 0;
            }
            Character.toChars(i3, (char[]) this.g, i8 * 2);
            a11 b2 = kc2Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i9 = a4 + b2.e;
                i4 = ((ByteBuffer) b2.h).getInt(((ByteBuffer) b2.h).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c11 c11Var = (c11) this.h;
                a11 b3 = kc2Var.b();
                int a5 = b3.a(16);
                if (a5 != 0) {
                    int i10 = a5 + b3.e;
                    i5 = ((ByteBuffer) b3.h).getInt(((ByteBuffer) b3.h).getInt(i10) + i10);
                } else {
                    i5 = 0;
                }
                c11Var.a(kc2Var, 0, i5 - 1);
            } else {
                se.h("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public static void c(q4 q4Var, x61 x61Var) {
        q4Var.getClass();
        x61Var.getClass();
        if (((LinkedHashSet) q4Var.h).add(x61Var)) {
            b71 b71Var = (b71) q4Var.g;
            b71Var.getClass();
            if (x61Var.c == null) {
                b71Var.e.addFirst(x61Var);
                x61Var.c = q4Var;
                b71Var.b();
                return;
            }
            y61.r("Handler '", x61Var, "' is already registered with a dispatcher");
        }
    }

    @Override // defpackage.qe2
    public long b(mc mcVar, mc mcVar2, mc mcVar3) {
        int b = mcVar.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((ov1) this.f).k(i).c(mcVar.a(i), mcVar2.a(i), mcVar3.a(i)));
        }
        return j;
    }

    @Override // defpackage.d12
    public void cancel() {
        ((Socket) this.f).close();
    }

    public void d(a71 a71Var) {
        if (((LinkedHashSet) this.i).add(a71Var)) {
            ((b71) this.g).a(this, a71Var, -1);
        }
    }

    public void e(r91 r91Var, int i) {
        if (i != 1 && i != 0) {
            se.e(l90.g(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.i).add(r91Var)) {
            ((b71) this.g).a(this, r91Var, i);
        }
    }

    public void f(a71 a71Var, v61 v61Var) {
        b71 b71Var = (b71) this.g;
        b71Var.getClass();
        if (b71Var.g == 0) {
            x61 c = b71Var.c(-1);
            b71Var.f = c;
            b71Var.g = -1;
            b71Var.h = a71Var;
            if (v61Var != null) {
                if (c != null) {
                    c.d(v61Var);
                }
                r22 r22Var = b71Var.a;
                d71 d71Var = new d71(v61Var);
                r22Var.getClass();
                r22Var.k(null, d71Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20, types: [d21] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [q41] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [q41] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16, types: [q41] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [q41] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [d21] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [d21] */
    /* JADX WARN: Type inference failed for: r9v9, types: [ub2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(long r18, long r20, defpackage.wt r22) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4.g(long, long, wt):java.lang.Object");
    }

    @Override // defpackage.d12
    public ey1 getSink() {
        return (dz) this.i;
    }

    @Override // defpackage.d12
    public k12 getSource() {
        return (ez) this.h;
    }

    @Override // defpackage.qe2
    public mc h(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        if (((mc) this.h) == null) {
            this.h = mcVar3.c();
        }
        mc mcVar4 = (mc) this.h;
        if (mcVar4 != null) {
            int b = mcVar4.b();
            int i = 0;
            while (true) {
                mc mcVar5 = (mc) this.h;
                if (i < b) {
                    if (mcVar5 != null) {
                        mcVar5.e(i, ((ov1) this.f).k(i).b(j, mcVar.a(i), mcVar2.a(i), mcVar3.a(i)));
                        i++;
                    } else {
                        sn0.V("velocityVector");
                        throw null;
                    }
                } else {
                    if (mcVar5 != null) {
                        return mcVar5;
                    }
                    sn0.V("velocityVector");
                    throw null;
                }
            }
        } else {
            sn0.V("velocityVector");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r4v10, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v8, types: [ub2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(long r11, defpackage.wt r13) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4.i(long, wt):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(defpackage.wt r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.i
            nx r0 = (defpackage.nx) r0
            boolean r1 = r7 instanceof defpackage.uw
            if (r1 == 0) goto L17
            r1 = r7
            uw r1 = (defpackage.uw) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.g = r2
            goto L1c
        L17:
            uw r1 = new uw
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.e
            int r2 = r1.g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.io.K(r7)
            goto L5b
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            return r3
        L33:
            defpackage.io.K(r7)
            goto L68
        L37:
            defpackage.io.K(r7)
            java.lang.Object r7 = r6.h
            java.util.List r7 = (java.util.List) r7
            hv r2 = defpackage.hv.e
            if (r7 == 0) goto L5e
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L49
            goto L5e
        L49:
            ay1 r7 = r0.g()
            xw r5 = new xw
            r5.<init>(r0, r6, r3)
            r1.g = r4
            java.lang.Object r7 = r7.b(r5, r1)
            if (r7 != r2) goto L5b
            goto L67
        L5b:
            aw r7 = (defpackage.aw) r7
            goto L6a
        L5e:
            r1.g = r5
            r6 = 0
            java.lang.Object r7 = defpackage.nx.f(r0, r6, r1)
            if (r7 != r2) goto L68
        L67:
            return r2
        L68:
            aw r7 = (defpackage.aw) r7
        L6a:
            rg2 r6 = r0.g
            r6.C(r7)
            od2 r6 = defpackage.od2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4.j(wt):java.lang.Object");
    }

    public List k() {
        if (((vz0) this.i) == null) {
            this.i = new vz0(this);
        }
        vz0 vz0Var = (vz0) this.i;
        vz0Var.getClass();
        return vz0Var;
    }

    public an0 l() {
        Matcher matcher = (Matcher) this.f;
        return go.X(matcher.start(), matcher.end());
    }

    public kg2 n(cn cnVar, String str) {
        kg2 kg2Var;
        kg2 a;
        synchronized (((wm1) this.i)) {
            try {
                sg2 sg2Var = (sg2) this.f;
                sg2Var.getClass();
                kg2Var = (kg2) sg2Var.a.get(str);
                if (cnVar.e(kg2Var)) {
                    pg2 pg2Var = (pg2) this.g;
                    if (pg2Var instanceof dr1) {
                        dr1 dr1Var = (dr1) pg2Var;
                        kg2Var.getClass();
                        wu0 wu0Var = dr1Var.d;
                        if (wu0Var != null) {
                            sl0 sl0Var = dr1Var.e;
                            sl0Var.getClass();
                            xn.q(kg2Var, sl0Var, wu0Var);
                        }
                    }
                    kg2Var.getClass();
                } else {
                    k31 k31Var = new k31((nv) this.h);
                    k31Var.a.put(rg2.g, str);
                    pg2 pg2Var2 = (pg2) this.g;
                    pg2Var2.getClass();
                    try {
                        try {
                            a = pg2Var2.c(cnVar, k31Var);
                        } catch (AbstractMethodError unused) {
                            Class b = cnVar.b();
                            b.getClass();
                            a = pg2Var2.b(b, k31Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class b2 = cnVar.b();
                        b2.getClass();
                        a = pg2Var2.a(b2);
                    }
                    kg2Var = a;
                    sg2 sg2Var2 = (sg2) this.f;
                    sg2Var2.getClass();
                    kg2Var.getClass();
                    kg2 kg2Var2 = (kg2) sg2Var2.a.put(str, kg2Var);
                    if (kg2Var2 != null) {
                        kg2Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kg2Var;
    }

    @Override // defpackage.qe2
    public mc p(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        if (((mc) this.g) == null) {
            this.g = mcVar.c();
        }
        mc mcVar4 = (mc) this.g;
        if (mcVar4 != null) {
            int b = mcVar4.b();
            int i = 0;
            while (true) {
                mc mcVar5 = (mc) this.g;
                if (i < b) {
                    if (mcVar5 != null) {
                        mcVar5.e(i, ((ov1) this.f).k(i).e(j, mcVar.a(i), mcVar2.a(i), mcVar3.a(i)));
                        i++;
                    } else {
                        sn0.V("valueVector");
                        throw null;
                    }
                } else {
                    if (mcVar5 != null) {
                        return mcVar5;
                    }
                    sn0.V("valueVector");
                    throw null;
                }
            }
        } else {
            sn0.V("valueVector");
            throw null;
        }
    }

    @Override // defpackage.qe2
    public mc q(mc mcVar, mc mcVar2, mc mcVar3) {
        if (((mc) this.i) == null) {
            this.i = mcVar3.c();
        }
        mc mcVar4 = (mc) this.i;
        if (mcVar4 != null) {
            int b = mcVar4.b();
            int i = 0;
            while (true) {
                mc mcVar5 = (mc) this.i;
                if (i < b) {
                    if (mcVar5 != null) {
                        mcVar5.e(i, ((ov1) this.f).k(i).d(mcVar.a(i), mcVar2.a(i), mcVar3.a(i)));
                        i++;
                    } else {
                        sn0.V("endVelocityVector");
                        throw null;
                    }
                } else {
                    if (mcVar5 != null) {
                        return mcVar5;
                    }
                    sn0.V("endVelocityVector");
                    throw null;
                }
            }
        } else {
            sn0.V("endVelocityVector");
            throw null;
        }
    }

    public q4 r() {
        int i;
        CharSequence charSequence = (CharSequence) this.g;
        Matcher matcher = (Matcher) this.f;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 <= charSequence.length()) {
            Matcher matcher2 = matcher.pattern().matcher(charSequence);
            matcher2.getClass();
            return xn.n(matcher2, i2, charSequence);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        if (r10.d(r1) == r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x005b, B:29:0x0065), top: B:24:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(defpackage.wt r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.g
            ip r0 = (defpackage.ip) r0
            boolean r1 = r10 instanceof defpackage.yp1
            if (r1 == 0) goto L17
            r1 = r10
            yp1 r1 = (defpackage.yp1) r1
            int r2 = r1.h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.h = r2
            goto L1c
        L17:
            yp1 r1 = new yp1
            r1.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r1.f
            int r2 = r1.h
            r3 = 2
            r4 = 1
            od2 r5 = defpackage.od2.a
            r6 = 0
            hv r7 = defpackage.hv.e
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L35
            b51 r9 = r1.e
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L33
            goto L71
        L33:
            r10 = move-exception
            goto L7c
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r9)
            return r6
        L3b:
            b51 r2 = r1.e
            defpackage.io.K(r10)
            r10 = r2
            goto L5b
        L42:
            defpackage.io.K(r10)
            boolean r10 = r0.P()
            if (r10 == 0) goto L4c
            return r5
        L4c:
            java.lang.Object r10 = r9.f
            b51 r10 = (defpackage.b51) r10
            r1.e = r10
            r1.h = r4
            java.lang.Object r2 = r10.d(r1)
            if (r2 != r7) goto L5b
            goto L6f
        L5b:
            boolean r2 = r0.P()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L65
            r10.f(r6)
            return r5
        L65:
            r1.e = r10     // Catch: java.lang.Throwable -> L78
            r1.h = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = r9.j(r1)     // Catch: java.lang.Throwable -> L78
            if (r9 != r7) goto L70
        L6f:
            return r7
        L70:
            r9 = r10
        L71:
            r0.R(r5)     // Catch: java.lang.Throwable -> L33
            r9.f(r6)
            return r5
        L78:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L7c:
            r9.f(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4.s(wt):java.lang.Object");
    }

    public String toString() {
        switch (this.e) {
            case 3:
                String socket = ((Socket) this.f).toString();
                socket.getClass();
                return socket;
            default:
                return super.toString();
        }
    }

    public q4(sg2 sg2Var, pg2 pg2Var, nv nvVar) {
        this.e = 10;
        sg2Var.getClass();
        pg2Var.getClass();
        nvVar.getClass();
        this.f = sg2Var;
        this.g = pg2Var;
        this.h = nvVar;
        this.i = new wm1(10);
    }

    public q4(Socket socket) {
        this.e = 3;
        this.f = socket;
        this.g = new AtomicInteger();
        this.h = new ez(this);
        this.i = new dz(this);
    }

    public q4(q5 q5Var, hg hgVar) {
        this.e = 0;
        this.f = q5Var;
        this.g = hgVar;
        AutofillManager autofillManager = (AutofillManager) q5Var.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.h = autofillManager;
            q5Var.setImportantForAutofill(1);
            AutofillId autofillId = q5Var.getAutofillId();
            if (autofillId != null) {
                this.i = autofillId;
                return;
            }
            throw l90.f("Required value was null.");
        }
        se.p("Autofill service could not be located.");
        throw null;
    }

    public q4(l2 l2Var) {
        this.e = 6;
        this.f = l2Var;
        this.g = new b71();
        new LinkedHashSet();
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
    }

    public q4(gv gvVar, r rVar, le leVar, j jVar) {
        this.e = 8;
        this.f = gvVar;
        this.g = jVar;
        this.h = sn0.c(Integer.MAX_VALUE, 6, null);
        this.i = new rg2(4);
        go0 go0Var = (go0) gvVar.A().H(g3.O);
        if (go0Var != null) {
            go0Var.r(new k1(rVar, this, leVar, 17));
        }
    }

    public q4() {
        this.e = 7;
        this.h = new s8(this, 8);
    }

    public q4(Matcher matcher, CharSequence charSequence) {
        this.e = 4;
        charSequence.getClass();
        this.f = matcher;
        this.g = charSequence;
        this.h = new wz0(this, 0);
    }

    public q4(de0 de0Var, e21 e21Var, z00 z00Var, fq fqVar) {
        this.e = 1;
        this.f = de0Var;
        this.g = e21Var;
        this.h = z00Var;
        this.i = fqVar;
    }

    public q4(nx nxVar, List list) {
        this.e = 2;
        this.i = nxVar;
        this.f = new b51();
        this.g = vn.a();
        this.h = wn.A0(list);
    }

    public q4(ov1 ov1Var) {
        this.e = 9;
        this.f = ov1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q4(ea0 ea0Var) {
        this(new ov1(ea0Var, 10));
        this.e = 9;
    }
}
