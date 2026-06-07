package com.elixir.loader;

import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.b50;
import defpackage.f50;
import defpackage.f52;
import defpackage.fq;
import defpackage.fz0;
import defpackage.h12;
import defpackage.l2;
import defpackage.mr;
import defpackage.nq1;
import defpackage.nv1;
import defpackage.s12;
import defpackage.xq1;
import defpackage.yp;
import defpackage.yq1;
import defpackage.zp;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/elixir/loader/MainActivity;", "Lyp;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class MainActivity extends yp {
    public static final /* synthetic */ int x = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [sl1, java.lang.Object] */
    @Override // defpackage.yp, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h12 h12Var;
        mr mrVar;
        f50 f50Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            h12Var = new s12(this);
        } else {
            h12Var = new h12(this);
        }
        h12Var.a();
        super.onCreate(bundle);
        ?? obj = new Object();
        obj.e = true;
        h12Var.b(new l2(obj));
        int i2 = 8;
        nv1 nv1Var = new nv1(i2);
        int i3 = 0;
        f52 f52Var = new f52(0, 0, nv1Var);
        int i4 = b50.a;
        int i5 = b50.b;
        nv1 nv1Var2 = new nv1(i2);
        f52 f52Var2 = new f52(i4, i5, nv1Var2);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) nv1Var.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean booleanValue2 = ((Boolean) nv1Var2.invoke(resources2)).booleanValue();
        f50 f50Var2 = b50.c;
        if (f50Var2 == null) {
            if (i >= 35) {
                f50Var = new Object();
            } else {
                f50Var = new Object();
            }
            f50Var2 = f50Var;
            b50.c = f50Var2;
        }
        f50 f50Var3 = f50Var2;
        Window window = getWindow();
        window.getClass();
        f50Var3.a(f52Var, f52Var2, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        window2.getClass();
        f50Var3.b(window2);
        fq fqVar = new fq(231631427, true, new fz0(obj, i3));
        ViewGroup.LayoutParams layoutParams = zp.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        if (childAt instanceof mr) {
            mrVar = (mr) childAt;
        } else {
            mrVar = null;
        }
        if (mrVar != null) {
            mrVar.setParentCompositionContext(null);
            mrVar.setContent(fqVar);
            return;
        }
        mr mrVar2 = new mr(this);
        mrVar2.setParentCompositionContext(null);
        mrVar2.setContent(fqVar);
        View decorView2 = getWindow().getDecorView();
        if (nq1.d(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (yq1.o(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (xq1.k(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(mrVar2, zp.a);
    }
}
