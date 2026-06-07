package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t0 extends ClickableSpan {
    public final int e;
    public final h1 f;
    public final int g;

    public t0(int i, h1 h1Var, int i2) {
        this.e = i;
        this.f = h1Var;
        this.g = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.e);
        this.f.a.performAction(this.g, bundle);
    }
}
