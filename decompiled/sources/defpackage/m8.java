package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m8 implements be1 {
    public final String a;
    public final k92 b;
    public final List c;
    public final List d;
    public final cd0 e;
    public final c00 f;
    public final ca g;
    public final CharSequence h;
    public final oq0 i;
    public ld j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Code restructure failed: missing block: B:156:0x04b9, code lost:
    
        if ((r5.b.c & 1095216660480L) == 0) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x009d, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0973 A[LOOP:7: B:324:0x0971->B:325:0x0973, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ad  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m8] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, qd2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v81, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.text.TextPaint, android.graphics.Paint, ca] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m8(java.lang.String r39, defpackage.k92 r40, java.util.List r41, java.util.List r42, defpackage.cd0 r43, defpackage.c00 r44) {
        /*
            Method dump skipped, instructions count: 2509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8.<init>(java.lang.String, k92, java.util.List, java.util.List, cd0, c00):void");
    }

    @Override // defpackage.be1
    public final boolean a() {
        boolean z;
        ld ldVar = this.j;
        if (ldVar != null) {
            z = ldVar.n();
        } else {
            z = false;
        }
        if (!z) {
            if (!this.k && f2.h(this.b)) {
                rg2 rg2Var = a60.a;
                rg2 rg2Var2 = a60.a;
                o22 o22Var = (o22) rg2Var2.f;
                if (o22Var == null) {
                    if (v50.d()) {
                        o22Var = rg2Var2.l();
                        rg2Var2.f = o22Var;
                    } else {
                        o22Var = sn0.s;
                    }
                }
                if (((Boolean) o22Var.getValue()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.be1
    public final float b() {
        oq0 oq0Var = this.i;
        float f = oq0Var.e;
        TextPaint textPaint = oq0Var.b;
        if (!Float.isNaN(f)) {
            return oq0Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = oq0Var.a;
        lineInstance.setText(new qm(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new d9(4));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new xd1(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                xd1 xd1Var = (xd1) priorityQueue.peek();
                if (xd1Var != null && ((Number) xd1Var.f).intValue() - ((Number) xd1Var.e).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new xd1(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                xd1 xd1Var2 = (xd1) it.next();
                f2 = Layout.getDesiredWidth(oq0Var.b(), ((Number) xd1Var2.e).intValue(), ((Number) xd1Var2.f).intValue(), textPaint);
                while (it.hasNext()) {
                    xd1 xd1Var3 = (xd1) it.next();
                    f2 = Math.max(f2, Layout.getDesiredWidth(oq0Var.b(), ((Number) xd1Var3.e).intValue(), ((Number) xd1Var3.f).intValue(), textPaint));
                }
            } else {
                y61.c();
                return 0.0f;
            }
        }
        oq0Var.e = f2;
        return f2;
    }

    @Override // defpackage.be1
    public final float c() {
        return this.i.c();
    }
}
