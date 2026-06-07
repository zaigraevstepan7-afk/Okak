package defpackage;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.window.SplashScreenView;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class y4 {
    public static /* bridge */ /* synthetic */ ScrollCaptureSession e(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget f(q5 q5Var, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(q5Var, rect, point, scrollCaptureCallback);
    }

    public static /* bridge */ /* synthetic */ TranslationResponseValue k(ViewTranslationResponse viewTranslationResponse) {
        return viewTranslationResponse.getValue("android:text");
    }

    public static /* synthetic */ ViewTranslationRequest.Builder l(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse n(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView o(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ CharSequence p(TranslationResponseValue translationResponseValue) {
        return translationResponseValue.getText();
    }

    public static /* synthetic */ void q() {
    }

    public static /* bridge */ /* synthetic */ void r(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static /* bridge */ /* synthetic */ void s(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static /* bridge */ /* synthetic */ void t(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static /* bridge */ /* synthetic */ boolean z(View view) {
        return view instanceof SplashScreenView;
    }
}
