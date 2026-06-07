package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class gc0 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final pl1 a(View view, q5 q5Var) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        q5Var.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(b);
        float f2 = (i - i3) + r1.left;
        return new pl1(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    public static final ac0 b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return null;
                            }
                            return new ac0(6);
                        }
                        return new ac0(4);
                    }
                    return new ac0(5);
                }
                return new ac0(3);
            }
            return new ac0(1);
        }
        return new ac0(2);
    }
}
