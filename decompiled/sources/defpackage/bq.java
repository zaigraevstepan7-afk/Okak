package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.elixir.loader.R;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class bq extends Dialog implements uu0, z91, w61, cr1 {
    public wu0 e;
    public final sl0 f;
    public final b52 g;
    public final b52 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, 0);
        final int i = 0;
        this.f = new sl0(new br1(this, new vm1(this, 5)));
        this.g = new b52(new de0(this) { // from class: aq
            public final /* synthetic */ bq f;

            {
                this.f = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, a71] */
            @Override // defpackage.de0
            public final Object invoke() {
                int i2 = i;
                bq bqVar = this.f;
                switch (i2) {
                    case 0:
                        ?? obj = new Object();
                        bqVar.b().b.d(obj);
                        return obj;
                    default:
                        return new y91(new r5(bqVar, 5));
                }
            }
        });
        final int i2 = 1;
        this.h = new b52(new de0(this) { // from class: aq
            public final /* synthetic */ bq f;

            {
                this.f = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, a71] */
            @Override // defpackage.de0
            public final Object invoke() {
                int i22 = i2;
                bq bqVar = this.f;
                switch (i22) {
                    case 0:
                        ?? obj = new Object();
                        bqVar.b().b.d(obj);
                        return obj;
                    default:
                        return new y91(new r5(bqVar, 5));
                }
            }
        });
    }

    public static void c(bq bqVar) {
        super.onBackPressed();
    }

    @Override // defpackage.w61
    public final q4 a() {
        return b().b;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.z91
    public final y91 b() {
        return (y91) this.h.getValue();
    }

    public final wu0 d() {
        wu0 wu0Var = this.e;
        if (wu0Var == null) {
            wu0 wu0Var2 = new wu0(this, true);
            this.e = wu0Var2;
            return wu0Var2;
        }
        return wu0Var;
    }

    public final void e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.cr1
    public final sl0 f() {
        return (sl0) this.f.f;
    }

    @Override // defpackage.uu0
    public final wu0 g() {
        return d();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((d10) this.g.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            y91 b = b();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            q4 q4Var = b.b;
            q4Var.e(new r91(onBackInvokedDispatcher, 0), 1);
            q4Var.e(new r91(onBackInvokedDispatcher, 1000000), 0);
        }
        this.f.x(bundle);
        d().d(mu0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.f.y(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        d().d(mu0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        d().d(mu0.ON_DESTROY);
        this.e = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }
}
