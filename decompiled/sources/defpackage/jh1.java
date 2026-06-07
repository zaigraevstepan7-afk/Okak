package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jh1 {
    public final List a;
    public final sl0 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    public jh1(List list, sl0 sl0Var) {
        int i;
        int i2;
        int i3;
        this.a = list;
        this.b = sl0Var;
        MotionEvent a = a();
        int i4 = 0;
        if (a != null) {
            i = a.getClassification();
        } else {
            i = 0;
        }
        this.c = i;
        MotionEvent a2 = a();
        if (a2 != null) {
            i2 = a2.getButtonState();
        } else {
            i2 = 0;
        }
        this.d = i2;
        MotionEvent a3 = a();
        if (a3 != null) {
            i3 = a3.getMetaState();
        } else {
            i3 = 0;
        }
        this.e = i3;
        MotionEvent a4 = a();
        if (a4 != null) {
            int actionMasked = a4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i4 = 6;
                                break;
                            case 9:
                                i4 = 4;
                                break;
                            case 10:
                                i4 = 5;
                                break;
                        }
                    }
                    i4 = 3;
                }
                i4 = 2;
            }
            i4 = 1;
        } else {
            int size = list.size();
            while (i4 < size) {
                qh1 qh1Var = (qh1) list.get(i4);
                if (qo.q(qh1Var)) {
                    i4 = 2;
                } else if (qo.o(qh1Var)) {
                    i4 = 1;
                } else {
                    i4++;
                }
            }
            i4 = 3;
        }
        this.f = i4;
    }

    public final MotionEvent a() {
        sl0 sl0Var = this.b;
        if (sl0Var != null) {
            return (MotionEvent) ((sl0) sl0Var.f).f;
        }
        return null;
    }
}
