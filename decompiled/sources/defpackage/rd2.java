package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rd2 extends RippleDrawable {
    public final boolean e;
    public co f;
    public Integer g;
    public boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rd2(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L10
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L11
        L10:
            r2 = r1
        L11:
            r4.<init>(r0, r1, r2)
            r4.e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd2.<init>(boolean):void");
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.e) {
            this.h = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.h = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.h;
    }
}
