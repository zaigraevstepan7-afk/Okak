package defpackage;

import android.graphics.Region;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.Magnifier;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rg2 implements bi1, he, ho1, fj1 {
    public static final wm1 g = new wm1(22);
    public final /* synthetic */ int e;
    public Object f;

    public rg2(int i) {
        this.e = i;
        switch (i) {
            case 4:
                this.f = new AtomicInteger(0);
                return;
            case 6:
                this.f = new u4();
                return;
            case 9:
                this.f = d6.j(hd2.b);
                return;
            case 12:
                this.f = new TreeSet(bf.t);
                return;
            case 18:
                jz0 jz0Var = new jz0();
                this.f = jz0Var;
                if (!jz0Var.f) {
                    if (jz0Var.g) {
                        fi1.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    jz0Var.a();
                    jz0Var.g = true;
                    return;
                }
                return;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                this.f = new CopyOnWriteArrayList();
                new HashMap();
                return;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                this.f = new ArrayList(32);
                return;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                this.f = new wc0(22);
                return;
            case 25:
                this.f = new py0();
                return;
            case 28:
                this.f = fr1.k(Boolean.FALSE);
                return;
            case 29:
                this.f = new Region();
                return;
            default:
                this.f = new AtomicBoolean(false);
                return;
        }
    }

    public static us0 A(rg2 rg2Var, int i) {
        oe0 oe0Var;
        st0 st0Var = (st0) rg2Var.f;
        i02 e = nq1.e();
        if (e != null) {
            oe0Var = e.e();
        } else {
            oe0Var = null;
        }
        oe0 oe0Var2 = oe0Var;
        i02 j = nq1.j(e);
        try {
            mt0 mt0Var = (mt0) st0Var.f.getValue();
            nq1.o(e, j, oe0Var2);
            return st0Var.p.a(i, mt0Var.j, st0Var.d, new mm0(i, mt0Var));
        } catch (Throwable th) {
            nq1.o(e, j, oe0Var2);
            throw th;
        }
    }

    public void B(float f, float f2) {
        ((ld) this.f).h().o(f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r5.a > ((defpackage.aw) r1).a) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(defpackage.n22 r5) {
        /*
            r4 = this;
            r5.getClass()
            java.lang.Object r4 = r4.f
            r22 r4 = (defpackage.r22) r4
        L7:
            java.lang.Object r0 = r4.getValue()
            r1 = r0
            n22 r1 = (defpackage.n22) r1
            boolean r2 = r1 instanceof defpackage.vk1
            if (r2 != 0) goto L3c
            hd2 r2 = defpackage.hd2.b
            boolean r2 = defpackage.sn0.r(r1, r2)
            if (r2 == 0) goto L1b
            goto L3c
        L1b:
            boolean r2 = r1 instanceof defpackage.aw
            if (r2 == 0) goto L29
            int r2 = r5.a
            r3 = r1
            aw r3 = (defpackage.aw) r3
            int r3 = r3.a
            if (r2 <= r3) goto L3d
            goto L3c
        L29:
            boolean r2 = r1 instanceof defpackage.s90
            if (r2 == 0) goto L2e
            goto L3d
        L2e:
            boolean r4 = r1 instanceof defpackage.w71
            if (r4 == 0) goto L38
            java.lang.String r4 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            defpackage.se.p(r4)
            return
        L38:
            defpackage.se.m()
            return
        L3c:
            r1 = r5
        L3d:
            boolean r0 = r4.i(r0, r1)
            if (r0 == 0) goto L7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg2.C(n22):void");
    }

    public void D(float f) {
        ((ArrayList) this.f).add(new if1(f));
    }

    public void E(float f) {
        ((ArrayList) this.f).add(new hf1(f));
    }

    @Override // defpackage.fj1
    public void a() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.fj1
    public void b(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f).setResultCode(i);
    }

    @Override // defpackage.bi1
    public long c(bn0 bn0Var, long j, jq0 jq0Var, long j2) {
        boolean z;
        long j3 = ((xm0) ((de0) this.f).invoke()).a;
        int i = bn0Var.a + ((int) (j3 >> 32));
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j >> 32);
        if (jq0Var == jq0.e) {
            z = true;
        } else {
            z = false;
        }
        int p = fp.p(i, i2, i3, z);
        return (fp.p(bn0Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (p << 32);
    }

    public void d(ar0 ar0Var) {
        if (!ar0Var.H()) {
            kl0.b("DepthSortedSet.add called on an unattached node");
        }
        ((j12) this.f).add(ar0Var);
    }

    @Override // defpackage.he
    public Object e(ds1 ds1Var, Float f, Float f2, oe0 oe0Var, b02 b02Var) {
        Object c = xp1.c(ds1Var, f.floatValue(), c01.a(0.0f, f2.floatValue(), 28), (tx) this.f, oe0Var, b02Var);
        if (c == hv.e) {
            return c;
        }
        return (dc) c;
    }

    public void f() {
        ((ArrayList) this.f).add(re1.c);
    }

    public void g() {
        ((xr) this.f).getClass();
    }

    public void h(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.f).add(new se1(f, f2, f3, f4, f5, f6));
    }

    public void i(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.f).add(new af1(f, f2, f3, f4, f5, f6));
    }

    public kg2 j(cn cnVar) {
        q4 q4Var = (q4) this.f;
        String c = cnVar.c();
        if (c != null) {
            return q4Var.n(cnVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(c));
        }
        se.h("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public n22 k() {
        return (n22) ((r22) this.f).getValue();
    }

    public o22 l() {
        v50 a = v50.a();
        if (a.c() == 1) {
            return new oj0(true);
        }
        je1 k = fr1.k(Boolean.FALSE);
        ly lyVar = new ly(k, this);
        a.a.writeLock().lock();
        try {
            if (a.c != 1 && a.c != 2) {
                a.b.add(lyVar);
                a.a.writeLock().unlock();
                return k;
            }
            a.d.post(new t50(Arrays.asList(lyVar), a.c, null));
            a.a.writeLock().unlock();
            return k;
        } catch (Throwable th) {
            a.a.writeLock().unlock();
            throw th;
        }
    }

    public long m() {
        Magnifier magnifier = (Magnifier) this.f;
        return (magnifier.getWidth() << 32) | (magnifier.getHeight() & 4294967295L);
    }

    public void n(float f) {
        ((ArrayList) this.f).add(new te1(f));
    }

    public void o(float f) {
        ((ArrayList) this.f).add(new bf1(f));
    }

    public void p(float f, float f2, float f3, float f4) {
        ld ldVar = (ld) this.f;
        tl h = ldVar.h();
        float intBitsToFloat = Float.intBitsToFloat((int) (ldVar.k() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ldVar.k() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            jl0.a("Width and height must be greater than or equal to zero");
        }
        ldVar.u(floatToRawIntBits);
        h.o(f, f2);
    }

    public void q(float f, float f2) {
        ((ArrayList) this.f).add(new ue1(f, f2));
    }

    public void r(float f, float f2) {
        ((ArrayList) this.f).add(new cf1(f, f2));
    }

    public void s(float f, float f2) {
        ((ArrayList) this.f).add(new ve1(f, f2));
    }

    public void t(View view, int i, boolean z) {
        ((AutofillManager) this.f).notifyViewVisibilityChanged(view, i, z);
    }

    public String toString() {
        switch (this.e) {
            case 12:
                return ((j12) this.f).toString();
            default:
                return super.toString();
        }
    }

    public sl0 u(sl0 sl0Var, q5 q5Var) {
        Object obj;
        long j;
        boolean z;
        long E;
        py0 py0Var = (py0) this.f;
        List list = (List) sl0Var.e;
        py0 py0Var2 = new py0(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            sh1 sh1Var = (sh1) list.get(i);
            long j2 = sh1Var.a;
            int n = f2.n(py0Var.f, py0Var.h, j2);
            if (n < 0 || (obj = py0Var.g[n]) == f2.k) {
                obj = null;
            }
            rh1 rh1Var = (rh1) obj;
            if (rh1Var == null) {
                j = sh1Var.b;
                E = sh1Var.d;
                z = false;
            } else {
                j = rh1Var.a;
                z = rh1Var.c;
                E = q5Var.E(rh1Var.b);
            }
            long j3 = sh1Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            py0Var2.b(new qh1(j3, sh1Var.b, sh1Var.d, sh1Var.e, sh1Var.f, j, E, z, sh1Var.g, sh1Var.i, sh1Var.j, sh1Var.k), j3);
            boolean z2 = sh1Var.e;
            if (z2) {
                py0Var.b(new rh1(sh1Var.b, sh1Var.c, z2), j2);
            } else {
                py0Var.c(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new sl0(py0Var2, sl0Var);
    }

    public void v(float f, float f2, float f3, float f4) {
        ((ArrayList) this.f).add(new xe1(f, f2, f3, f4));
    }

    public void w(float f, float f2, float f3, float f4) {
        ((ArrayList) this.f).add(new ff1(f, f2, f3, f4));
    }

    public boolean x(ar0 ar0Var) {
        if (!ar0Var.H()) {
            kl0.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((j12) this.f).remove(ar0Var);
    }

    public void y(long j, float f) {
        tl h = ((ld) this.f).h();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        h.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        h.c(f);
        h.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void z(float f, float f2, long j) {
        tl h = ((ld) this.f).h();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        h.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        h.b(f, f2);
        h.o(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public /* synthetic */ rg2(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    public /* synthetic */ rg2(int i, boolean z) {
        this.e = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r8 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[LOOP:1: B:14:0x0045->B:15:0x0047, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rg2(int[] r25, float[] r26, float[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r2 = 2
            r0.e = r2
            r0.<init>()
            int r3 = r1.length
            r4 = 1
            int r3 = r3 - r4
            ie[][] r5 = new defpackage.ie[r3]
            r6 = 0
            r8 = r4
            r9 = r8
            r7 = r6
        L13:
            if (r7 >= r3) goto L79
            r10 = r25[r7]
            r11 = 3
            if (r10 == 0) goto L28
            if (r10 == r4) goto L31
            if (r10 == r2) goto L2f
            if (r10 == r11) goto L2a
            r11 = 4
            if (r10 == r11) goto L28
            r11 = 5
            if (r10 == r11) goto L28
            r10 = r9
            goto L33
        L28:
            r10 = r11
            goto L33
        L2a:
            if (r8 != r4) goto L31
            goto L2f
        L2d:
            r10 = r8
            goto L33
        L2f:
            r8 = r2
            goto L2d
        L31:
            r8 = r4
            goto L2d
        L33:
            r9 = r27[r7]
            int r17 = r7 + 1
            r18 = r27[r17]
            r11 = r1[r7]
            r12 = r1[r17]
            int r13 = r9.length
            int r13 = r13 / r2
            int r14 = r9.length
            int r14 = r14 % r2
            int r13 = r13 + r14
            ie[] r14 = new defpackage.ie[r13]
            r15 = r6
        L45:
            if (r15 >= r13) goto L71
            int r16 = r15 * 2
            r19 = r9
            ie r9 = new ie
            r20 = r13
            r13 = r19[r16]
            int r21 = r16 + 1
            r22 = r14
            r14 = r19[r21]
            r16 = r18[r16]
            r21 = r18[r21]
            r23 = r21
            r21 = r15
            r15 = r16
            r16 = r23
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r22[r21] = r9
            int r15 = r21 + 1
            r9 = r19
            r13 = r20
            r14 = r22
            goto L45
        L71:
            r22 = r14
            r5[r7] = r22
            r9 = r10
            r7 = r17
            goto L13
        L79:
            r0.f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg2.<init>(int[], float[], float[][]):void");
    }

    public rg2(sg2 sg2Var, pg2 pg2Var, nv nvVar) {
        this.e = 0;
        sg2Var.getClass();
        pg2Var.getClass();
        nvVar.getClass();
        this.f = new q4(sg2Var, pg2Var, nvVar);
    }
}
