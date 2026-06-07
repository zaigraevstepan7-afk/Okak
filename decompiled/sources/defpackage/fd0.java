package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fd0 extends MetricAffectingSpan {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ fd0(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                return;
            default:
                textPaint.setTypeface((Typeface) obj);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                return;
            default:
                textPaint.setTypeface((Typeface) obj);
                return;
        }
    }
}
