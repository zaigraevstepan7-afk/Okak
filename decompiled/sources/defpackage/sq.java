package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sq extends View.DragShadowBuilder {
    public final d00 a;
    public final long b;
    public final oe0 c;

    public sq(d00 d00Var, long j, oe0 oe0Var) {
        this.a = d00Var;
        this.b = j;
        this.c = oe0Var;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        vl vlVar = new vl();
        Canvas canvas2 = v4.a;
        u4 u4Var = new u4();
        u4Var.a = canvas;
        ul ulVar = vlVar.e;
        c00 c00Var = ulVar.a;
        jq0 jq0Var = ulVar.b;
        tl tlVar = ulVar.c;
        long j = ulVar.d;
        ulVar.a = this.a;
        ulVar.b = jq0.e;
        ulVar.c = u4Var;
        ulVar.d = this.b;
        u4Var.h();
        this.c.invoke(vlVar);
        u4Var.p();
        ulVar.a = c00Var;
        ulVar.b = jq0Var;
        ulVar.c = tlVar;
        ulVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        d00 d00Var = this.a;
        point.set(d00Var.j0(intBitsToFloat / d00Var.a()), d00Var.j0(Float.intBitsToFloat((int) (j & 4294967295L)) / d00Var.a()));
        point2.set(point.x / 2, point.y / 2);
    }
}
