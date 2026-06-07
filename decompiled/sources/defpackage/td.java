package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class td implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ c61 f;

    public /* synthetic */ td(c61 c61Var, int i) {
        this.e = i;
        this.f = c61Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i;
        int i2 = this.e;
        od2 od2Var = od2.a;
        c61 c61Var = this.f;
        switch (i2) {
            case 0:
                c61Var.a("main", new p1(13));
                return od2Var;
            case 1:
                tg tgVar = c61Var.f;
                boolean z = false;
                if (c61Var.g) {
                    te teVar = c61Var.b.f;
                    if (teVar != null && teVar.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = teVar.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (!(((d51) it.next()).f instanceof w51) && (i = i + 1) < 0) {
                                throw new ArithmeticException("Count overflow has happened.");
                            }
                        }
                    }
                    if (i > 1) {
                        z = true;
                    }
                }
                tgVar.e(z);
                return od2Var;
            default:
                Context context = c61Var.a;
                h71 h71Var = c61Var.b.s;
                context.getClass();
                h71Var.getClass();
                return new Object();
        }
    }
}
