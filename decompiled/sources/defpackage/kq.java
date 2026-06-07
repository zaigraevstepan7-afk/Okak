package defpackage;

import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class kq implements ye0 {
    @Override // defpackage.ye0
    public final Object d(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ur urVar, Integer num) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        pt ptVar = (pt) obj2;
        te0 te0Var = (te0) obj3;
        de0 de0Var = (de0) obj4;
        int intValue = num.intValue();
        int i8 = intValue & 6;
        b21 b21Var = b21.a;
        if (i8 == 0) {
            if (urVar.f(b21Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i = i7 | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            if (urVar.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i |= i6;
        }
        if ((intValue & 384) == 0) {
            if (urVar.g(booleanValue)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i |= i5;
        }
        if ((intValue & 3072) == 0) {
            if (urVar.f(ptVar)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i |= i4;
        }
        if ((intValue & 24576) == 0) {
            if (urVar.h(te0Var)) {
                i3 = 16384;
            } else {
                i3 = SharedConstants.DefaultBufferSize;
            }
            i |= i3;
        }
        if ((intValue & 196608) == 0) {
            if (urVar.h(de0Var)) {
                i2 = 131072;
            } else {
                i2 = 65536;
            }
            i |= i2;
        }
        if ((599187 & i) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i & 1, z)) {
            tt.c(str, booleanValue, ptVar, b21Var, te0Var, de0Var, urVar, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            urVar.R();
        }
        return od2.a;
    }
}
