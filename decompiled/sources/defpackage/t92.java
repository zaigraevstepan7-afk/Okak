package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class t92 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(t92.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public o70[] a;

    public final void a(o70 o70Var) {
        o70Var.d((p70) this);
        o70[] o70VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (o70VarArr == null) {
            o70VarArr = new o70[4];
            this.a = o70VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= o70VarArr.length) {
            o70VarArr = (o70[]) Arrays.copyOf(o70VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = o70VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        o70VarArr[i] = o70Var;
        o70Var.f = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.o70 b(int r9) {
        /*
            r8 = this;
            o70[] r0 = r8.a
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.t92.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            r4.getClass()
            r5 = r0[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            o70[] r5 = r8.a
            r5.getClass()
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            r6.getClass()
            r7 = r5[r4]
            r7.getClass()
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            r4.getClass()
            r5 = r5[r2]
            r5.getClass()
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            r9.getClass()
            r2 = 0
            r9.d(r2)
            r9.f = r3
            int r8 = r1.get(r8)
            r0[r8] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t92.b(int):o70");
    }

    public final void c(int i) {
        while (i > 0) {
            o70[] o70VarArr = this.a;
            o70VarArr.getClass();
            int i2 = (i - 1) / 2;
            o70 o70Var = o70VarArr[i2];
            o70Var.getClass();
            o70 o70Var2 = o70VarArr[i];
            o70Var2.getClass();
            if (o70Var.compareTo(o70Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        o70[] o70VarArr = this.a;
        o70VarArr.getClass();
        o70 o70Var = o70VarArr[i2];
        o70Var.getClass();
        o70 o70Var2 = o70VarArr[i];
        o70Var2.getClass();
        o70VarArr[i] = o70Var;
        o70VarArr[i2] = o70Var2;
        o70Var.f = i;
        o70Var2.f = i2;
    }
}
