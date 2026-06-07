package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.WindowManager;
import com.google.protobuf.DescriptorProtos;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xl1 implements w02, wu, zi2, ga0, bd0, oe, qe {
    public static final xl1 f = new xl1(0);
    public static final xl1 g = new xl1(1);
    public static final xl1 h = new xl1(2);
    public static final xl1 i = new xl1(3);
    public static final y61 j = new y61(13);
    public static final y61 k = new y61(14);
    public static final y61 l = new y61(15);
    public static final y61 m = new y61(16);
    public static final xl1 n = new xl1(5);
    public static final xl1 o = new xl1(6);
    public static final xl1 p = new xl1(7);
    public static final y61 q = new y61(22);
    public static final y61 r = new y61(23);
    public static final xl1 s = new xl1(9);
    public static final xl1 t = new xl1(10);
    public static final y61 u = new y61(28);
    public static final xl1 v = new xl1(12);
    public static final bj2 w = new Object();
    public final /* synthetic */ int e;

    public xl1() {
        this.e = 20;
        new az0(16);
        long[] jArr = sr1.a;
        new i41();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bl n(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xl1.n(java.lang.String):bl");
    }

    public static bl o(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) (fc2.n(str.charAt(i3 + 1)) + (fc2.n(str.charAt(i3)) << 4));
            }
            return new bl(bArr);
        }
        se.e("Unexpected hex string: ".concat(str));
        return null;
    }

    public static bl p(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(sm.a);
        bytes.getClass();
        bl blVar = new bl(bytes);
        blVar.g = str;
        return blVar;
    }

    public static bl q(byte[] bArr) {
        bl blVar = bl.h;
        int length = bArr.length;
        rx.q(bArr.length, 0L, length);
        return new bl(bf.H(bArr, 0, length));
    }

    @Override // defpackage.oe, defpackage.qe
    public float a() {
        switch (this.e) {
            case 18:
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    @Override // defpackage.oe
    public void b(c00 c00Var, int i2, int[] iArr, jq0 jq0Var, int[] iArr2) {
        int i3 = this.e;
        jq0 jq0Var2 = jq0.e;
        switch (i3) {
            case 18:
                if (jq0Var == jq0Var2) {
                    c01.H(i2, iArr, iArr2, false);
                    return;
                } else {
                    c01.H(i2, iArr, iArr2, true);
                    return;
                }
            default:
                if (jq0Var == jq0Var2) {
                    c01.I(i2, iArr, iArr2, false);
                    return;
                } else {
                    c01.I(i2, iArr, iArr2, true);
                    return;
                }
        }
    }

    @Override // defpackage.ga0
    public float c() {
        return 0.0f;
    }

    @Override // defpackage.ga0
    public float d(float f2, float f3, long j2) {
        return 0.0f;
    }

    @Override // defpackage.zi2
    public vi2 e(Context context, g3 g3Var) {
        g3Var.getClass();
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f2 = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new vi2(bounds, f2);
    }

    @Override // defpackage.w02
    public boolean f(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                if (obj == obj2) {
                    return true;
                }
                return false;
            default:
                return sn0.r(obj, obj2);
        }
    }

    @Override // defpackage.ga0
    public long g(float f2) {
        return 0L;
    }

    @Override // defpackage.qe
    public void h(c00 c00Var, int i2, int[] iArr, int[] iArr2) {
        switch (this.e) {
            case 18:
                c01.H(i2, iArr, iArr2, false);
                return;
            default:
                c01.I(i2, iArr, iArr2, false);
                return;
        }
    }

    @Override // defpackage.ga0
    public float i(float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.ga0
    public float j(long j2, float f2) {
        return 0.0f;
    }

    public void k(Drawable drawable, ur urVar, int i2) {
        int i3;
        boolean z;
        urVar.Y(257732500);
        int i4 = 2;
        if (urVar.h(drawable)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if ((i5 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            e21 f2 = hy1.f(b21.a, rt.e);
            boolean h2 = urVar.h(drawable);
            Object L = urVar.L();
            if (h2 || L == or.a) {
                L = new hh1(drawable, 17);
                urVar.h0(L);
            }
            hj.a(rx.t(f2, (oe0) L), urVar, 0);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new xx1(this, i2, i4, drawable);
        }
    }

    public void l(final Icon icon, ur urVar, final int i2) {
        int i3;
        boolean z;
        dl1 r2;
        se0 se0Var;
        urVar.Y(2116504409);
        if (urVar.h(icon)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        final int i5 = 0;
        final int i6 = 1;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i4 & 1, z)) {
            Context context = (Context) urVar.j(l6.b);
            boolean f2 = urVar.f(icon) | urVar.f(context);
            Object L = urVar.L();
            if (f2 || L == or.a) {
                L = icon.loadDrawable(context);
                urVar.h0(L);
            }
            Drawable drawable = (Drawable) L;
            if (drawable == null) {
                r2 = urVar.r();
                if (r2 != null) {
                    se0Var = new se0(this, icon, i2, i5) { // from class: n62
                        public final /* synthetic */ int e;
                        public final /* synthetic */ xl1 f;
                        public final /* synthetic */ Icon g;

                        {
                            this.e = i5;
                            this.f = this;
                        }

                        @Override // defpackage.se0
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = this.e;
                            od2 od2Var = od2.a;
                            Icon icon2 = this.g;
                            xl1 xl1Var = this.f;
                            ur urVar2 = (ur) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    xl1Var.l(icon2, urVar2, lo.b0(49));
                                    return od2Var;
                                default:
                                    xl1Var.l(icon2, urVar2, lo.b0(49));
                                    return od2Var;
                            }
                        }
                    };
                    r2.d = se0Var;
                }
                return;
            }
            k(drawable, urVar, 48);
        } else {
            urVar.R();
        }
        r2 = urVar.r();
        if (r2 != null) {
            se0Var = new se0(this, icon, i2, i6) { // from class: n62
                public final /* synthetic */ int e;
                public final /* synthetic */ xl1 f;
                public final /* synthetic */ Icon g;

                {
                    this.e = i6;
                    this.f = this;
                }

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = this.e;
                    od2 od2Var = od2.a;
                    Icon icon2 = this.g;
                    xl1 xl1Var = this.f;
                    ur urVar2 = (ur) obj;
                    ((Integer) obj2).getClass();
                    switch (i7) {
                        case 0:
                            xl1Var.l(icon2, urVar2, lo.b0(49));
                            return od2Var;
                        default:
                            xl1Var.l(icon2, urVar2, lo.b0(49));
                            return od2Var;
                    }
                }
            };
            r2.d = se0Var;
        }
    }

    public long m(long j2, long j3) {
        switch (this.e) {
            case 25:
                float max = Math.max(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i2 = rr1.a;
                return floatToRawIntBits;
            case 26:
                float e = lo.e(j2, j3);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(e) << 32) | (Float.floatToRawIntBits(e) & 4294967295L);
                int i3 = rr1.a;
                return floatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j2 >> 32)) <= Float.intBitsToFloat((int) (j3 >> 32)) && Float.intBitsToFloat((int) (j2 & 4294967295L)) <= Float.intBitsToFloat((int) (j3 & 4294967295L))) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i4 = rr1.a;
                    return floatToRawIntBits3;
                }
                float e2 = lo.e(j2, j3);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(e2) << 32) | (Float.floatToRawIntBits(e2) & 4294967295L);
                int i5 = rr1.a;
                return floatToRawIntBits4;
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return "ReferentialEqualityPolicy";
            case 5:
                return "Start";
            case 6:
                return "StructuralEqualityPolicy";
            case 18:
                return "Arrangement#Center";
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return "Arrangement#SpaceBetween";
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return "Empty";
            case 24:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xl1(int i2) {
        this.e = i2;
    }
}
