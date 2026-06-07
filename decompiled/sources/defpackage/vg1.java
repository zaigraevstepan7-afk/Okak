package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vg1 extends q42 implements se0 {
    public b51 f;
    public wg1 g;
    public CharSequence h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ CharSequence l;
    public final /* synthetic */ long m;
    public final /* synthetic */ wg1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg1(long j, vt vtVar, wg1 wg1Var, CharSequence charSequence) {
        super(2, vtVar);
        this.l = charSequence;
        this.m = j;
        this.n = wg1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        vg1 vg1Var = new vg1(this.m, vtVar, this.n, this.l);
        vg1Var.k = obj;
        return vg1Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((vg1) create((TextClassifier) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        wg1 wg1Var;
        long j;
        TextClassification textClassification;
        TextSelection textSelection;
        CharSequence charSequence;
        b51 b51Var;
        TextClassification textClassification2;
        int i = this.j;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    j = this.i;
                    io.K(obj);
                } else {
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                j = this.i;
                charSequence = this.h;
                wg1Var = this.g;
                b51Var = this.f;
                textSelection = (TextSelection) this.k;
                io.K(obj);
                try {
                    textClassification2 = textSelection.getTextClassification();
                    textClassification2.getClass();
                    wg1Var.g.setValue(new e62(charSequence, j, textClassification2));
                } finally {
                    b51Var.f(null);
                }
            }
        } else {
            io.K(obj);
            TextClassifier textClassifier = (TextClassifier) this.k;
            long j2 = this.m;
            int f = d92.f(j2);
            int e = d92.e(j2);
            CharSequence charSequence2 = this.l;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, f, e);
            wg1Var = this.n;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(wg1Var.b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection suggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long a = fr1.a(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            hv hvVar = hv.e;
            if (i2 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    b51 b51Var2 = wg1Var.e;
                    this.k = suggestSelection;
                    this.f = b51Var2;
                    this.g = wg1Var;
                    this.h = charSequence2;
                    this.i = a;
                    this.j = 1;
                    if (b51Var2.d(this) != hvVar) {
                        textSelection = suggestSelection;
                        charSequence = charSequence2;
                        b51Var = b51Var2;
                        j = a;
                        textClassification2 = textSelection.getTextClassification();
                        textClassification2.getClass();
                        wg1Var.g.setValue(new e62(charSequence, j, textClassification2));
                    }
                    return hvVar;
                }
            }
            this.i = a;
            this.j = 2;
            if (wg1.a(this.n, this.l, a, textClassifier, this) != hvVar) {
                j = a;
            }
            return hvVar;
        }
        return new d92(j);
    }
}
