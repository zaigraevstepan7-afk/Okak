package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class w01 {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        sn0.k(2, 4.0f);
        a = 8.0f;
        b = 112.0f;
        c = 280.0f;
    }

    public static final void a(final e21 e21Var, final p41 p41Var, final o41 o41Var, final fs1 fs1Var, final kw1 kw1Var, final long j, final float f, final fq fqVar, ur urVar, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        float f2;
        float f3;
        float f4;
        urVar.Y(848986741);
        if (urVar.f(e21Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (urVar.f(p41Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (urVar.f(fs1Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i13 = i12 | i4;
        if (urVar.f(kw1Var)) {
            i5 = 16384;
        } else {
            i5 = SharedConstants.DefaultBufferSize;
        }
        int i14 = i13 | i5;
        if (urVar.e(j)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i15 = i14 | i6;
        if (urVar.c(0.0f)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i16 = i15 | i7;
        if (urVar.c(f)) {
            i8 = 8388608;
        } else {
            i8 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
        }
        int i17 = i16 | i8;
        if (urVar.f(null)) {
            i9 = FileSystemManager.MODE_TRUNCATE;
        } else {
            i9 = FileSystemManager.MODE_APPEND;
        }
        int i18 = i17 | i9;
        if (urVar.h(fqVar)) {
            i10 = FileSystemManager.MODE_WRITE_ONLY;
        } else {
            i10 = FileSystemManager.MODE_READ_ONLY;
        }
        int i19 = i18 | i10;
        boolean z2 = true;
        if ((i19 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i19 & 1, z)) {
            lb2 d = qb2.d(p41Var, "DropDownMenu", urVar, (((i19 >> 3) & 14) | 48) & WebSocketProtocol.PAYLOAD_SHORT);
            u90 a0 = fp.a0(u21.f, urVar);
            u90 a02 = fp.a0(u21.h, urVar);
            ec2 ec2Var = f2.A;
            ir irVar = d.a;
            je1 je1Var = d.d;
            boolean booleanValue = ((Boolean) irVar.c()).booleanValue();
            urVar.X(143964305);
            float f5 = 0.8f;
            float f6 = 1.0f;
            if (booleanValue) {
                f2 = 1.0f;
            } else {
                f2 = 0.8f;
            }
            urVar.p(false);
            Float valueOf = Float.valueOf(f2);
            boolean booleanValue2 = ((Boolean) je1Var.getValue()).booleanValue();
            urVar.X(143964305);
            if (booleanValue2) {
                f5 = 1.0f;
            }
            urVar.p(false);
            Float valueOf2 = Float.valueOf(f5);
            d.f();
            urVar.X(-745957716);
            urVar.p(false);
            kb2 c2 = qb2.c(d, valueOf, valueOf2, a0, ec2Var, urVar, 0);
            boolean booleanValue3 = ((Boolean) d.a.c()).booleanValue();
            urVar.X(892761509);
            if (booleanValue3) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            urVar.p(false);
            Float valueOf3 = Float.valueOf(f3);
            boolean booleanValue4 = ((Boolean) je1Var.getValue()).booleanValue();
            urVar.X(892761509);
            if (!booleanValue4) {
                f6 = 0.0f;
            }
            urVar.p(false);
            Float valueOf4 = Float.valueOf(f6);
            d.f();
            urVar.X(2839488);
            urVar.p(false);
            kb2 c3 = qb2.c(d, valueOf3, valueOf4, a02, ec2Var, urVar, 0);
            boolean booleanValue5 = ((Boolean) urVar.j(im0.a)).booleanValue();
            boolean g = urVar.g(booleanValue5) | urVar.f(c2);
            if ((i19 & 112) != 32) {
                z2 = false;
            }
            boolean f7 = g | z2 | urVar.f(c3);
            Object L = urVar.L();
            if (!f7 && L != or.a) {
                f4 = 0.0f;
            } else {
                f4 = 0.0f;
                Object t01Var = new t01(booleanValue5, p41Var, o41Var, c2, c3);
                urVar.h0(t01Var);
                L = t01Var;
            }
            int i20 = i19 >> 9;
            int i21 = i19 >> 6;
            l42.a(d6.x(b21.a, (oe0) L), kw1Var, j, 0L, f4, f, go.N(-1463404422, new l1(e21Var, fs1Var, fqVar, 7), urVar), urVar, (i20 & 896) | (i20 & 112) | 12582912 | (57344 & i21) | (458752 & i21) | (i21 & 3670016), 8);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(p41Var, o41Var, fs1Var, kw1Var, j, f, fqVar, i) { // from class: u01
                public final /* synthetic */ p41 f;
                public final /* synthetic */ o41 g;
                public final /* synthetic */ fs1 h;
                public final /* synthetic */ kw1 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ float k;
                public final /* synthetic */ fq l;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(385);
                    w01.a(e21.this, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void b(fq fqVar, de0 de0Var, e21 e21Var, se0 se0Var, boolean z, s01 s01Var, pc1 pc1Var, ur urVar, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        urVar.Y(-1325192924);
        if ((i & 6) == 0) {
            if (urVar.h(fqVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(de0Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (urVar.f(e21Var)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (urVar.h(null)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (urVar.h(se0Var)) {
                i7 = 16384;
            } else {
                i7 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (urVar.g(z)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (urVar.f(s01Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (urVar.f(pc1Var)) {
                i4 = 8388608;
            } else {
                i4 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i2 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (urVar.f(null)) {
                i3 = FileSystemManager.MODE_TRUNCATE;
            } else {
                i3 = FileSystemManager.MODE_APPEND;
            }
            i2 |= i3;
        }
        if ((38347923 & i2) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i2 & 1, z2)) {
            e21 J = sn0.J(hy1.i(hy1.b(f2.r(e21Var, null, xo1.a(0.0f, 6, true), z, null, de0Var, 24), 1.0f), b, 48.0f, c, 8), pc1Var);
            up1 a2 = tp1.a(c01.e, g3.p, urVar, 48);
            int x = io.x(urVar);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, J);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, a2);
            op1.q(urVar, kr.e, l);
            gb gbVar = kr.g;
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                l90.s(x, urVar, x, gbVar);
            }
            op1.q(urVar, kr.d, Q);
            t82.a(((pc2) urVar.j(rc2.a)).m, go.N(865999929, new v01(s01Var, z, se0Var, fqVar), urVar), urVar, 48);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new c8(fqVar, de0Var, e21Var, se0Var, z, s01Var, pc1Var, i);
        }
    }
}
