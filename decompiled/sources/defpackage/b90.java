package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b90 implements Iterable {
    public eq1 e;
    public eq1 f;
    public final WeakHashMap g = new WeakHashMap();
    public int h = 0;
    public final HashMap i = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.dq1) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.b90
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            b90 r6 = (defpackage.b90) r6
            int r1 = r5.h
            int r3 = r6.h
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r5 = r5.iterator()
            java.util.Iterator r6 = r6.iterator()
        L1b:
            r1 = r5
            dq1 r1 = (defpackage.dq1) r1
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L44
            r3 = r6
            dq1 r3 = (defpackage.dq1) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r3.next()
            if (r1 != 0) goto L3b
            if (r3 != 0) goto L43
        L3b:
            if (r1 == 0) goto L1b
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L53
            dq1 r6 = (defpackage.dq1) r6
            boolean r5 = r6.hasNext()
            if (r5 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b90.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            dq1 dq1Var = (dq1) it;
            if (dq1Var.hasNext()) {
                i += ((Map.Entry) dq1Var.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        dq1 dq1Var = new dq1(this.e, this.f, 0);
        this.g.put(dq1Var, Boolean.FALSE);
        return dq1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            dq1 dq1Var = (dq1) it;
            if (dq1Var.hasNext()) {
                sb.append(((Map.Entry) dq1Var.next()).toString());
                if (dq1Var.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
