package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xf0 {
    public final rg2 a;
    public final vl b;
    public final RenderNode c;
    public long d;
    public Paint e;
    public Matrix f;
    public boolean g;
    public float h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public float q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;

    public xf0() {
        rg2 rg2Var = new rg2(6);
        vl vlVar = new vl();
        this.a = rg2Var;
        this.b = vlVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.c = renderNode;
        this.d = 0L;
        renderNode.setClipToBounds(false);
        b(renderNode, 0);
        this.h = 1.0f;
        this.i = 3;
        this.j = 1.0f;
        this.k = 1.0f;
        long j = co.b;
        this.n = j;
        this.o = j;
        this.q = 8.0f;
        this.u = 0;
    }

    public final void a() {
        boolean z;
        boolean z2 = this.r;
        boolean z3 = false;
        if (z2 && !this.g) {
            z = true;
        } else {
            z = false;
        }
        if (z2 && this.g) {
            z3 = true;
        }
        boolean z4 = this.s;
        RenderNode renderNode = this.c;
        if (z != z4) {
            this.s = z;
            renderNode.setClipToBounds(z);
        }
        if (z3 != this.t) {
            this.t = z3;
            renderNode.setClipToOutline(z3);
        }
    }

    public final void b(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.e);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.e;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void c() {
        int i = this.u;
        RenderNode renderNode = this.c;
        if (i != 1 && this.i == 3) {
            b(renderNode, i);
        } else {
            b(renderNode, 1);
        }
    }
}
