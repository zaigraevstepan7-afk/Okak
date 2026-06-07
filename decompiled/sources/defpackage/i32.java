package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i32 extends p32 {
    public static boolean G(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (L(charSequence, str, 0, z, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean H(CharSequence charSequence, char c) {
        charSequence.getClass();
        if (K(charSequence, c, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean I(CharSequence charSequence, String str) {
        if (charSequence instanceof String) {
            return p32.w((String) charSequence, str, false);
        }
        return T(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int J(CharSequence charSequence, String str, int i, boolean z) {
        int i2;
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i2 = 0;
        } else {
            i2 = i;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        ym0 ym0Var = new ym0(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = ym0Var.g;
        int i4 = ym0Var.f;
        int i5 = ym0Var.e;
        if (z2 && (str instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (!p32.z(str, 0, (String) charSequence, i6, str.length(), z)) {
                    if (i6 != i4) {
                        i6 += i3;
                    }
                }
                return i6;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!T(str, 0, charSequence, i5, str.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int K(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (!(charSequence instanceof String)) {
            return M(charSequence, new char[]{c}, i, false);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int L(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return J(charSequence, str, i, z);
    }

    public static final int M(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(bf.c0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (mp0.p(c, charAt, z)) {
                    return i;
                }
            }
            if (i != length) {
                i++;
            } else {
                return -1;
            }
        }
    }

    public static boolean N(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!mp0.C(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char O(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        y61.j("Char sequence is empty.");
        return (char) 0;
    }

    public static int P(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            str.getClass();
            i = str.length() - 1;
        }
        str.getClass();
        return str.lastIndexOf(c, i);
    }

    public static int Q(String str, String str2) {
        str.getClass();
        int length = str.length() - 1;
        str.getClass();
        return str.lastIndexOf(str2, length);
    }

    public static final List R(String str) {
        ov0 ov0Var = new ov0(str);
        if (!ov0Var.hasNext()) {
            return l60.e;
        }
        Object next = ov0Var.next();
        if (!ov0Var.hasNext()) {
            return xn.E(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (ov0Var.hasNext()) {
            arrayList.add(ov0Var.next());
        }
        return arrayList;
    }

    public static String S(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i >= 0) {
            if (i <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i);
                int length = i - str.length();
                int i2 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append('0');
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
                sb.append((CharSequence) str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        se.h(l90.i("Desired length ", i, " is less than zero."));
        return null;
    }

    public static final boolean T(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!mp0.p(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String U(String str, String str2) {
        if (p32.D(str, str2, false)) {
            return str.substring(str2.length());
        }
        return str;
    }

    public static List V(String str, char[] cArr) {
        str.getClass();
        int i = 1;
        if (cArr.length == 1) {
            String valueOf = String.valueOf(cArr[0]);
            int J = J(str, valueOf, 0, false);
            if (J != -1) {
                ArrayList arrayList = new ArrayList(10);
                int i2 = 0;
                do {
                    arrayList.add(str.subSequence(i2, J).toString());
                    i2 = valueOf.length() + J;
                    J = J(str, valueOf, i2, false);
                } while (J != -1);
                arrayList.add(str.subSequence(i2, str.length()).toString());
                return arrayList;
            }
            return xn.E(str.toString());
        }
        zj0 zj0Var = new zj0(new a00(str, new h8(cArr, 21)), i);
        ArrayList arrayList2 = new ArrayList(yn.a0(zj0Var, 10));
        Iterator it = zj0Var.iterator();
        while (true) {
            zz zzVar = (zz) it;
            if (zzVar.hasNext()) {
                an0 an0Var = (an0) zzVar.next();
                an0Var.getClass();
                arrayList2.add(str.subSequence(an0Var.e, an0Var.f + 1).toString());
            } else {
                return arrayList2;
            }
        }
    }

    public static String W(String str, String str2) {
        int L = L(str, str2, 0, false, 6);
        if (L == -1) {
            return str;
        }
        return str.substring(str2.length() + L, str.length());
    }

    public static String X(int i, String str) {
        str.getClass();
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            return str.substring(0, i);
        }
        se.e(l90.i("Requested character count ", i, " is less than zero."));
        return null;
    }

    public static CharSequence Y(String str) {
        int i;
        str.getClass();
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean C = mp0.C(str.charAt(i));
            if (!z) {
                if (!C) {
                    z = true;
                } else {
                    i2++;
                }
            } else {
                if (!C) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i2, length + 1);
    }
}
