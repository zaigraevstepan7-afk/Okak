package defpackage;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rf0 extends rz implements b40 {
    public final /* synthetic */ int u = 1;
    public final j7 v;
    public final a50 w;
    public Object x;

    public rf0(w42 w42Var, j7 j7Var, a50 a50Var, pc1 pc1Var) {
        this.v = j7Var;
        this.w = a50Var;
        this.x = pc1Var;
        L0(w42Var);
    }

    public static boolean O0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean P0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode Q0() {
        RenderNode renderNode = (RenderNode) this.x;
        if (renderNode == null) {
            RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
            this.x = renderNode2;
            return renderNode2;
        }
        return renderNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020d  */
    @Override // defpackage.b40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(defpackage.cr0 r26) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf0.f0(cr0):void");
    }

    public rf0(w42 w42Var, j7 j7Var, a50 a50Var) {
        this.v = j7Var;
        this.w = a50Var;
        L0(w42Var);
    }
}
