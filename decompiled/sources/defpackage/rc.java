package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rc implements CharSequence {
    public final List e;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;

    static {
        sl0 sl0Var = lr1.a;
    }

    public rc(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.e = list;
        this.f = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                qc qcVar = (qc) list.get(i);
                Object obj = qcVar.a;
                if (obj instanceof m12) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(qcVar);
                } else if (obj instanceof de1) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(qcVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.g = arrayList;
        this.h = arrayList2;
        List x0 = arrayList2 != null ? wn.x0(arrayList2, new uc0(5)) : null;
        if (x0 != null && !x0.isEmpty()) {
            int i2 = ((qc) wn.g0(x0)).c;
            o31 o31Var = um0.a;
            o31 o31Var2 = new o31(1);
            o31Var2.a(i2);
            int size2 = x0.size();
            for (int i3 = 1; i3 < size2; i3++) {
                qc qcVar2 = (qc) x0.get(i3);
                while (true) {
                    if (o31Var2.b != 0) {
                        int d = o31Var2.d();
                        int i4 = qcVar2.b;
                        int i5 = qcVar2.c;
                        if (i4 >= d) {
                            o31Var2.e(o31Var2.b - 1);
                        } else if (i5 > d) {
                            ll0.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + d);
                        }
                    }
                }
                o31Var2.a(qcVar2.c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (r2.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rc subSequence(int r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 > r11) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.ll0.a(r1)
        L26:
            java.lang.String r1 = r9.f
            if (r10 != 0) goto L31
            int r4 = r1.length()
            if (r11 != r4) goto L31
            return r9
        L31:
            java.lang.String r1 = r1.substring(r10, r11)
            rc r4 = defpackage.sc.a
            if (r10 > r11) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r10)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r11)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.ll0.a(r2)
        L54:
            java.util.List r9 = r9.e
            if (r9 != 0) goto L59
            goto L99
        L59:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r9.size()
            r2.<init>(r3)
            int r3 = r9.size()
        L66:
            if (r0 >= r3) goto L93
            java.lang.Object r4 = r9.get(r0)
            qc r4 = (defpackage.qc) r4
            int r5 = r4.b
            int r6 = r4.c
            boolean r5 = defpackage.sc.b(r10, r11, r5, r6)
            if (r5 == 0) goto L90
            qc r5 = new qc
            java.lang.Object r7 = r4.a
            int r8 = r4.b
            int r8 = java.lang.Math.max(r10, r8)
            int r8 = r8 - r10
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r10
            java.lang.String r4 = r4.d
            r5.<init>(r4, r8, r6, r7)
            r2.add(r5)
        L90:
            int r0 = r0 + 1
            goto L66
        L93:
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L9a
        L99:
            r2 = 0
        L9a:
            rc r9 = new rc
            r9.<init>(r2, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc.subSequence(int, int):rc");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        if (sn0.r(this.f, rcVar.f) && sn0.r(this.e, rcVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f.hashCode() * 31;
        List list = this.e;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f;
    }

    public /* synthetic */ rc(String str) {
        this(str, l60.e);
    }

    public rc(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
