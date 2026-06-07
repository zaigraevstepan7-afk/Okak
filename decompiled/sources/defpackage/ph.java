package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ph {
    public static final /* synthetic */ int a = 0;

    static {
        go.e(40.0f, 40.0f);
    }

    public static final void a(final String str, final oe0 oe0Var, final e21 e21Var, final boolean z, final boolean z2, final k92 k92Var, final vp0 vp0Var, final up0 up0Var, final boolean z3, final int i, final int i2, final y61 y61Var, oe0 oe0Var2, final r31 r31Var, final i12 i12Var, final fq fqVar, ur urVar, final int i3) {
        final oe0 oe0Var3;
        oe0 oe0Var4;
        urVar.Y(2026950908);
        int i4 = i3 | (urVar.f(str) ? 4 : 2) | (urVar.h(oe0Var) ? 32 : 16) | (urVar.f(e21Var) ? 256 : 128) | (urVar.g(z) ? 2048 : 1024);
        boolean g = urVar.g(z2);
        int i5 = SharedConstants.DefaultBufferSize;
        int i6 = i4 | (g ? 16384 : 8192) | (urVar.f(k92Var) ? 131072 : 65536) | (urVar.f(vp0Var) ? 1048576 : 524288) | (urVar.f(up0Var) ? 8388608 : HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) | (urVar.g(z3) ? FileSystemManager.MODE_TRUNCATE : FileSystemManager.MODE_APPEND) | (urVar.d(i) ? FileSystemManager.MODE_WRITE_ONLY : FileSystemManager.MODE_READ_ONLY);
        int i7 = 196608 | (urVar.d(i2) ? 4 : 2) | (urVar.f(y61Var) ? 32 : 16) | 384 | (urVar.f(r31Var) ? 2048 : 1024);
        if (urVar.f(i12Var)) {
            i5 = 16384;
        }
        int i8 = i7 | i5;
        if (urVar.O(i6 & 1, ((306783379 & i6) == 306783378 && (i8 & 74899) == 74898) ? false : true)) {
            urVar.T();
            int i9 = i3 & 1;
            Object obj = or.a;
            if (i9 != 0 && !urVar.y()) {
                urVar.R();
                oe0Var4 = oe0Var2;
            } else {
                Object L = urVar.L();
                if (L == obj) {
                    L = new p1(14);
                    urVar.h0(L);
                }
                oe0Var4 = (oe0) L;
            }
            urVar.q();
            Object L2 = urVar.L();
            if (L2 == obj) {
                L2 = fr1.k(new i82(6, str, 0L));
                urVar.h0(L2);
            }
            o41 o41Var = (o41) L2;
            i82 i82Var = (i82) o41Var.getValue();
            i82 i82Var2 = new i82(new rc(str), i82Var.b, i82Var.c);
            boolean f = urVar.f(i82Var2);
            Object L3 = urVar.L();
            if (f || L3 == obj) {
                L3 = new j1(7, i82Var2, o41Var);
                urVar.h0(L3);
            }
            bf.p((de0) L3, urVar);
            boolean z4 = (i6 & 14) == 4;
            Object L4 = urVar.L();
            if (z4 || L4 == obj) {
                L4 = fr1.k(str);
                urVar.h0(L4);
            }
            o41 o41Var2 = (o41) L4;
            vp0Var.getClass();
            Boolean bool = vp0Var.a;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            int i10 = vp0Var.b;
            wp0 wp0Var = new wp0(i10);
            if (i10 == 0) {
                wp0Var = null;
            }
            int i11 = wp0Var != null ? wp0Var.a : 1;
            int i12 = vp0Var.c;
            int i13 = i11;
            mj0 mj0Var = i12 == -1 ? null : new mj0(i12);
            nj0 nj0Var = new nj0(z3, 0, booleanValue, i13, mj0Var != null ? mj0Var.a : 1, ix0.g);
            boolean z5 = false;
            boolean z6 = !z3;
            int i14 = z3 ? 1 : i2;
            int i15 = z3 ? 1 : i;
            boolean f2 = urVar.f(o41Var2);
            if ((i6 & 112) == 32) {
                z5 = true;
            }
            boolean z7 = f2 | z5;
            Object L5 = urVar.L();
            if (z7 || L5 == obj) {
                L5 = new k1(oe0Var, o41Var, o41Var2);
                urVar.h0(L5);
            }
            int i16 = i8 << 9;
            oe0Var3 = oe0Var4;
            vn.d(i82Var2, (oe0) L5, e21Var, k92Var, y61Var, oe0Var3, r31Var, i12Var, z6, i15, i14, nj0Var, up0Var, z, z2, fqVar, urVar, (i6 & 896) | ((i6 >> 6) & 7168) | (i16 & 57344) | 196608 | (3670016 & i16) | (i16 & 29360128), (i6 & 57344) | ((i6 >> 15) & 896) | (i6 & 7168) | 196608);
        } else {
            urVar.R();
            oe0Var3 = oe0Var2;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(str, oe0Var, e21Var, z, z2, k92Var, vp0Var, up0Var, z3, i, i2, y61Var, oe0Var3, r31Var, i12Var, fqVar, i3) { // from class: oh
                public final /* synthetic */ String e;
                public final /* synthetic */ oe0 f;
                public final /* synthetic */ e21 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ k92 j;
                public final /* synthetic */ vp0 k;
                public final /* synthetic */ up0 l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ int n;
                public final /* synthetic */ int o;
                public final /* synthetic */ y61 p;
                public final /* synthetic */ oe0 q;
                public final /* synthetic */ r31 r;
                public final /* synthetic */ i12 s;
                public final /* synthetic */ fq t;

                @Override // defpackage.se0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int b0 = lo.b0(1);
                    ph.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (ur) obj2, b0);
                    return od2.a;
                }
            };
        }
    }
}
