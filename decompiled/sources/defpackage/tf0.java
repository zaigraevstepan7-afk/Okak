package defpackage;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tf0 {
    public final xf0 a;
    public Outline f;
    public float j;
    public lo k;
    public n8 l;
    public n8 m;
    public boolean n;
    public vl o;
    public f8 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public c00 b = d6.h;
    public jq0 c = jq0.e;
    public oe0 d = i5.F;
    public final n3 e = new n3(this, 14);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final xm r = new Object();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [xm, java.lang.Object] */
    public tf0(xf0 xf0Var) {
        this.a = xf0Var;
        xf0Var.r = false;
        xf0Var.a();
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        xf0 xf0Var = this.a;
        RenderNode renderNode = xf0Var.c;
        if (this.g) {
            boolean z = this.w;
            if (!z && xf0Var.m <= 0.0f) {
                xf0Var.r = false;
                xf0Var.a();
                renderNode.setOutline(null);
                xf0Var.g = false;
                xf0Var.a();
            } else {
                n8 n8Var = this.l;
                if (n8Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = n8Var instanceof n8;
                    if (z2) {
                        Path path = n8Var.a;
                        path.computeBounds(rectF, false);
                        Outline outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (z2) {
                            outline.setPath(path);
                            this.n = !outline.canClip();
                            this.l = n8Var;
                            outline.setAlpha(xf0Var.h);
                            Math.round(rectF.width());
                            Math.round(rectF.height());
                            renderNode.setOutline(outline);
                            xf0Var.g = true;
                            xf0Var.a();
                            if (this.n && this.w) {
                                xf0Var.r = false;
                                xf0Var.a();
                                renderNode.discardDisplayList();
                            } else {
                                xf0Var.r = this.w;
                                xf0Var.a();
                            }
                        } else {
                            se.v("Unable to obtain android.graphics.Path");
                            return;
                        }
                    } else {
                        se.v("Unable to obtain android.graphics.Path");
                        return;
                    }
                } else {
                    xf0Var.r = z;
                    xf0Var.a();
                    Outline outline2 = this.f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f = outline2;
                    }
                    Outline outline3 = outline2;
                    long O = vn.O(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        O = j2;
                    }
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    int i3 = (int) (O >> 32);
                    int i4 = (int) (O & 4294967295L);
                    outline3.setRoundRect(Math.round(Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), this.j);
                    outline3.setAlpha(xf0Var.h);
                    Math.round(Float.intBitsToFloat(i3));
                    Math.round(Float.intBitsToFloat(i4));
                    renderNode.setOutline(outline3);
                    xf0Var.g = true;
                    xf0Var.a();
                }
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            xm xmVar = this.r;
            tf0 tf0Var = (tf0) xmVar.b;
            if (tf0Var != null) {
                tf0Var.e();
                xmVar.b = null;
            }
            j41 j41Var = (j41) xmVar.d;
            if (j41Var != null) {
                Object[] objArr = j41Var.b;
                long[] jArr = j41Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ((tf0) objArr[(i << 3) + i3]).e();
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
                j41Var.b();
            }
            this.a.c.discardDisplayList();
        }
    }

    public final void c(c40 c40Var) {
        xm xmVar = this.r;
        xmVar.c = (tf0) xmVar.b;
        j41 j41Var = (j41) xmVar.d;
        if (j41Var != null && j41Var.h()) {
            j41 j41Var2 = (j41) xmVar.e;
            if (j41Var2 == null) {
                j41 j41Var3 = tr1.a;
                j41Var2 = new j41();
                xmVar.e = j41Var2;
            }
            j41Var2.j(j41Var);
            j41Var.b();
        }
        xmVar.a = true;
        this.d.invoke(c40Var);
        xmVar.a = false;
        tf0 tf0Var = (tf0) xmVar.c;
        if (tf0Var != null) {
            tf0Var.e();
        }
        j41 j41Var4 = (j41) xmVar.e;
        if (j41Var4 != null && j41Var4.h()) {
            Object[] objArr = j41Var4.b;
            long[] jArr = j41Var4.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((tf0) objArr[(i << 3) + i3]).e();
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
            j41Var4.b();
        }
    }

    public final lo d() {
        lo vb1Var;
        lo loVar = this.k;
        n8 n8Var = this.l;
        if (loVar != null) {
            return loVar;
        }
        if (n8Var != null) {
            ub1 ub1Var = new ub1(n8Var);
            this.k = ub1Var;
            return ub1Var;
        }
        long O = vn.O(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            O = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (O >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (O & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            vb1Var = new wb1(hp.f(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            vb1Var = new vb1(new pl1(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = vb1Var;
        return vb1Var;
    }

    public final void e() {
        this.q--;
        b();
    }

    public final void f() {
        c00 c00Var = this.b;
        jq0 jq0Var = this.c;
        n3 n3Var = this.e;
        xf0 xf0Var = this.a;
        vl vlVar = xf0Var.b;
        RenderNode renderNode = xf0Var.c;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        try {
            rg2 rg2Var = xf0Var.a;
            u4 u4Var = (u4) rg2Var.f;
            Canvas canvas = u4Var.a;
            u4Var.a = beginRecording;
            ld ldVar = vlVar.f;
            ldVar.s(c00Var);
            ldVar.t(jq0Var);
            ldVar.g = this;
            ldVar.u(xf0Var.d);
            ldVar.r(u4Var);
            n3Var.invoke(vlVar);
            ((u4) rg2Var.f).a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    public final void g(long j) {
        if (!z81.b(this.v, j)) {
            this.v = j;
            long j2 = 9223372034707292159L & j;
            RenderNode renderNode = this.a.c;
            if (j2 == 9205357640488583168L) {
                renderNode.resetPivot();
            } else {
                renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
                renderNode.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }
    }

    public final void h(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        xf0 xf0Var = this.a;
        xf0Var.c.setPosition(i, i2, ((int) (j2 >> 32)) + i, ((int) (4294967295L & j2)) + i2);
        xf0Var.d = vn.O(j2);
    }

    public final void i(float f, long j, long j2) {
        if (z81.b(this.h, j) && fy1.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
