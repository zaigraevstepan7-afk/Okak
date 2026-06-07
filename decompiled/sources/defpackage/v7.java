package defpackage;

import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class v7 {
    public static /* bridge */ /* synthetic */ Class A() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class B() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class C() {
        return RemoveSpaceGesture.class;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder j(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder k(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* bridge */ /* synthetic */ InsertGesture l(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return SelectGesture.class;
    }

    public static /* synthetic */ void n() {
    }

    public static /* bridge */ /* synthetic */ boolean r(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ Class y() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return DeleteGesture.class;
    }
}
