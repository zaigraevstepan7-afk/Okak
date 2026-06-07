package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gw1 extends CharacterStyle implements UpdateAppearance {
    public final fw1 e;
    public final float f;
    public final je1 g = fr1.k(new fy1(9205357640488583168L));
    public final j00 h = fr1.h(new vm1(this, 10));

    public gw1(fw1 fw1Var, float f) {
        this.e = fw1Var;
        this.f = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        bf.a0(textPaint, this.f);
        textPaint.setShader((Shader) this.h.getValue());
    }
}
