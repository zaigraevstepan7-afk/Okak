package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c52 extends View {
    public final /* synthetic */ ViewGroup e;
    public final /* synthetic */ e52 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c52(e52 e52Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.f = e52Var;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        e52 e52Var = this.f;
        ArrayList arrayList = e52Var.b;
        Drawable background = this.e.getBackground();
        if (background instanceof ColorDrawable) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        if (e52Var.e != i) {
            e52Var.e = i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vj1) arrayList.get(size)).b(i);
            }
        }
    }
}
