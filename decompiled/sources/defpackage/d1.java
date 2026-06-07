package defpackage;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d1 {
    public static /* synthetic */ LineBreakConfig.Builder b() {
        return new LineBreakConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder c(LineBreakConfig.Builder builder, int i) {
        return builder.setLineBreakStyle(i);
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig d(LineBreakConfig.Builder builder) {
        return builder.build();
    }

    public static /* bridge */ /* synthetic */ BoringLayout.Metrics e(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static /* synthetic */ BoringLayout f(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }

    public static /* bridge */ /* synthetic */ AccessibilityManager$AccessibilityServicesStateChangeListener g(Object obj) {
        return (AccessibilityManager$AccessibilityServicesStateChangeListener) obj;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction h() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    public static /* synthetic */ EditorBoundsInfo.Builder j() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m(yp ypVar) {
        return ypVar.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ void o(StaticLayout.Builder builder, LineBreakConfig lineBreakConfig) {
        builder.setLineBreakConfig(lineBreakConfig);
    }

    public static /* bridge */ /* synthetic */ boolean s(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ boolean t(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder u(LineBreakConfig.Builder builder, int i) {
        return builder.setLineBreakWordStyle(i);
    }
}
