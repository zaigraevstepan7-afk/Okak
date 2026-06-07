package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z80 extends yq1 {
    public final Object g;
    public final String h;
    public final cf2 i;
    public final j02 j;

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Throwable, j02, java.lang.Exception] */
    public z80(Object obj, String str, g3 g3Var, cf2 cf2Var) {
        Collection collection;
        obj.getClass();
        cf2Var.getClass();
        this.g = obj;
        this.h = str;
        this.i = cf2Var;
        ?? exc = new Exception(str + " value: " + obj);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        stackTrace.getClass();
        int length = stackTrace.length + (-2);
        length = length < 0 ? 0 : length;
        if (length >= 0) {
            if (length == 0) {
                collection = l60.e;
            } else {
                int length2 = stackTrace.length;
                if (length >= length2) {
                    collection = bf.e0(stackTrace);
                } else if (length == 1) {
                    collection = xn.E(stackTrace[length2 - 1]);
                } else {
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = length2 - length; i < length2; i++) {
                        arrayList.add(stackTrace[i]);
                    }
                    collection = arrayList;
                }
            }
            exc.setStackTrace((StackTraceElement[]) collection.toArray(new StackTraceElement[0]));
            this.j = exc;
            return;
        }
        se.e(l90.i("Requested element count ", length, " is less than zero."));
        throw null;
    }

    @Override // defpackage.yq1
    public final Object l() {
        int ordinal = this.i.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return null;
                }
                se.m();
                return null;
            }
            Object obj = this.g;
            obj.getClass();
            Log.d("px1", this.h + " value: " + obj);
            return null;
        }
        throw this.j;
    }

    @Override // defpackage.yq1
    public final yq1 y(String str, oe0 oe0Var) {
        return this;
    }
}
