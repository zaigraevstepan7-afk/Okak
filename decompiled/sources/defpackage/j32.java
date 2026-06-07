package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class j32 extends xp1 {
    public static String s(String str) {
        int i;
        Comparable comparable;
        int i2;
        String str2;
        List R = i32.R(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : R) {
            if (!i32.N((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yn.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i < length) {
                    if (!mp0.C(str3.charAt(i))) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                i = str3.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        int length2 = str.length();
        R.size();
        int size = R.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : R) {
            int i3 = i + 1;
            if (i >= 0) {
                String str4 = (String) obj2;
                if ((i == 0 || i == size) && i32.N(str4)) {
                    str2 = null;
                } else {
                    str4.getClass();
                    if (i2 >= 0) {
                        int length3 = str4.length();
                        if (i2 <= length3) {
                            length3 = i2;
                        }
                        str2 = str4.substring(length3);
                    } else {
                        se.e(l90.i("Requested character count ", i2, " is less than zero."));
                        return null;
                    }
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i = i3;
            } else {
                xn.U();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length2);
        wn.l0(arrayList3, sb, null, 124);
        return sb.toString();
    }

    public static String t(String str) {
        String substring;
        if (!i32.N("|")) {
            List R = i32.R(str);
            int length = str.length();
            R.size();
            int size = R.size() - 1;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : R) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = (String) obj;
                    if ((i == 0 || i == size) && i32.N(str2)) {
                        str2 = null;
                    } else {
                        int length2 = str2.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                if (!mp0.C(str2.charAt(i3))) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 == -1 || !p32.C(str2, "|", i3, false)) {
                            substring = null;
                        } else {
                            substring = str2.substring("|".length() + i3);
                        }
                        if (substring != null) {
                            str2 = substring;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i = i2;
                } else {
                    xn.U();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            wn.l0(arrayList, sb, null, 124);
            return sb.toString();
        }
        se.h("marginPrefix must be non-blank string.");
        return null;
    }
}
