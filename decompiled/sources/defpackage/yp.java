package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.elixir.loader.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class yp extends Activity implements tg2, tg0, cr1, z91, w61, uu0 {
    private static final tp Companion = new Object();
    public final wu0 e;
    public final ot f;
    public final rg2 g;
    public final sl0 h;
    public sg2 i;
    public final vp j;
    public final b52 k;
    public final xp l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public boolean s;
    public boolean t;
    public final b52 u;
    public final b52 v;
    public final b52 w;

    public yp() {
        final int i = 1;
        wu0 wu0Var = new wu0(this, true);
        this.e = wu0Var;
        ot otVar = new ot();
        this.f = otVar;
        this.g = new rg2(19);
        br1 br1Var = new br1(this, new vm1(this, 5));
        sl0 sl0Var = new sl0(br1Var);
        this.h = sl0Var;
        this.j = new vp(this);
        this.k = new b52(new op(this, 1));
        new AtomicInteger();
        this.l = new xp(this);
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.u = new b52(new op(this, 2));
        final int i2 = 0;
        wu0Var.a(new su0(this) { // from class: qp
            public final /* synthetic */ yp f;

            {
                this.f = this;
            }

            @Override // defpackage.su0
            public final void g(uu0 uu0Var, mu0 mu0Var) {
                Window window;
                View peekDecorView;
                int i3 = i2;
                yp ypVar = this.f;
                switch (i3) {
                    case 0:
                        if (mu0Var == mu0.ON_STOP && (window = ypVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            return;
                        }
                        return;
                    default:
                        if (mu0Var == mu0.ON_DESTROY) {
                            ypVar.f.b = null;
                            if (!ypVar.isChangingConfigurations()) {
                                ypVar.e().a();
                            }
                            vp vpVar = ypVar.j;
                            yp ypVar2 = vpVar.h;
                            ypVar2.getWindow().getDecorView().removeCallbacks(vpVar);
                            ypVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(vpVar);
                            return;
                        }
                        return;
                }
            }
        });
        wu0Var.a(new su0(this) { // from class: qp
            public final /* synthetic */ yp f;

            {
                this.f = this;
            }

            @Override // defpackage.su0
            public final void g(uu0 uu0Var, mu0 mu0Var) {
                Window window;
                View peekDecorView;
                int i3 = i;
                yp ypVar = this.f;
                switch (i3) {
                    case 0:
                        if (mu0Var == mu0.ON_STOP && (window = ypVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            return;
                        }
                        return;
                    default:
                        if (mu0Var == mu0.ON_DESTROY) {
                            ypVar.f.b = null;
                            if (!ypVar.isChangingConfigurations()) {
                                ypVar.e().a();
                            }
                            vp vpVar = ypVar.j;
                            yp ypVar2 = vpVar.h;
                            ypVar2.getWindow().getDecorView().removeCallbacks(vpVar);
                            ypVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(vpVar);
                            return;
                        }
                        return;
                }
            }
        });
        wu0Var.a(new ol1(this, i));
        br1Var.a();
        c01.v(this);
        ((sl0) sl0Var.f).z("android:support:activity-result", new rp(this, i2));
        sp spVar = new sp(this);
        yp ypVar = otVar.b;
        if (ypVar != null) {
            spVar.a(ypVar);
        }
        otVar.a.add(spVar);
        this.v = new b52(new op(this, 3));
        this.w = new b52(new op(this, 4));
    }

    public static void h(yp ypVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (sn0.r(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            } else {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!sn0.r(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.w61
    public final q4 a() {
        return b().b;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.z91
    public final y91 b() {
        return (y91) this.w.getValue();
    }

    @Override // defpackage.tg0
    public final pg2 c() {
        return (pg2) this.v.getValue();
    }

    @Override // defpackage.tg0
    public final k31 d() {
        Bundle bundle;
        k31 k31Var = new k31();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = k31Var.a;
        if (application != null) {
            linkedHashMap.put(og2.d, getApplication());
        }
        linkedHashMap.put(c01.w, this);
        linkedHashMap.put(c01.x, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(c01.y, bundle);
        }
        return k31Var;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int i = eg2.a;
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int i = eg2.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.tg2
    public final sg2 e() {
        if (getApplication() != null) {
            if (this.i == null) {
                up upVar = (up) getLastNonConfigurationInstance();
                if (upVar != null) {
                    this.i = upVar.a;
                }
                if (this.i == null) {
                    this.i = new sg2();
                }
            }
            sg2 sg2Var = this.i;
            sg2Var.getClass();
            return sg2Var;
        }
        se.p("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // defpackage.cr1
    public final sl0 f() {
        return (sl0) this.h.f;
    }

    @Override // defpackage.uu0
    public final wu0 g() {
        return this.e;
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i = rm1.e;
        pm1.b(this);
    }

    public final void k(Bundle bundle) {
        bundle.getClass();
        wu0 wu0Var = this.e;
        wu0Var.getClass();
        wu0Var.c("setCurrentState");
        wu0Var.e(nu0.g);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (!this.l.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((d10) this.u.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.m.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ys) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.h.x(bundle);
        ot otVar = this.f;
        otVar.getClass();
        otVar.b = this;
        Iterator it = otVar.a.iterator();
        while (it.hasNext()) {
            ((sp) it.next()).a(this);
        }
        j(bundle);
        int i = rm1.e;
        pm1.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                se.s();
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                se.s();
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.s = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.s = false;
            Iterator it = this.p.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((ys) it.next()).accept(new wc0(11));
            }
        } catch (Throwable th) {
            this.s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ys) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            se.s();
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.t = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.t = false;
            Iterator it = this.q.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((ys) it.next()).accept(new wc0(20));
            }
        } catch (Throwable th) {
            this.t = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                se.s();
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.l.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, up] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        up upVar;
        sg2 sg2Var = this.i;
        if (sg2Var == null && (upVar = (up) getLastNonConfigurationInstance()) != null) {
            sg2Var = upVar.a;
        }
        if (sg2Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.a = sg2Var;
        return obj;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        wu0 wu0Var = this.e;
        if (wu0Var != null) {
            wu0Var.c("setCurrentState");
            wu0Var.e(nu0.g);
        }
        k(bundle);
        this.h.y(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ys) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.r.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (ab2.a()) {
                xq1.g("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ce0 ce0Var = (ce0) this.k.getValue();
            synchronized (ce0Var.a) {
                try {
                    ce0Var.b = true;
                    Iterator it = ce0Var.c.iterator();
                    while (it.hasNext()) {
                        ((de0) it.next()).invoke();
                    }
                    ce0Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.s) {
            return;
        }
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ys) it.next()).accept(new wc0(11));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.t) {
            return;
        }
        Iterator it = this.q.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ys) it.next()).accept(new wc0(20));
        }
    }
}
