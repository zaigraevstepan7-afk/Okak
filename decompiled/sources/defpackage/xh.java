package defpackage;

import android.content.Context;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import java.io.File;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xh extends q42 implements se0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh(Object obj, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new xh((ta2) obj2, vtVar, 0);
            case 1:
                return new xh((de0) obj2, vtVar, 1);
            case 2:
                return new xh((File) obj2, vtVar, 2);
            case 3:
                return new xh((wg1) obj2, vtVar, 3);
            default:
                return new xh((zm1) obj2, vtVar, 4);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        gv gvVar = (gv) obj;
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                ((xh) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 1:
                ((xh) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 2:
                return ((xh) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 3:
                return ((xh) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((xh) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = this.f;
        od2 od2Var = od2.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                io.K(obj);
                ((ta2) obj2).a();
                return od2Var;
            case 1:
                io.K(obj);
                ((de0) obj2).invoke();
                return od2Var;
            case 2:
                io.K(obj);
                return hp.P((File) obj2);
            case 3:
                io.K(obj);
                wg1 wg1Var = (wg1) obj2;
                Context context = wg1Var.b;
                ut1 ut1Var = wg1Var.c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int ordinal = ut1Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        str = "textview";
                    } else {
                        se.m();
                        return null;
                    }
                } else {
                    str = "edittext";
                }
                TextClassifier createTextClassificationSession = textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
                wg1Var.f = createTextClassificationSession;
                return createTextClassificationSession;
            default:
                io.K(obj);
                return Boolean.valueOf(new File(((zm1) obj2).c).delete());
        }
    }
}
