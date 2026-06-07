package defpackage;

import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.elixir.loader.R;
import java.util.UUID;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class k11 extends bq {
    public de0 i;
    public y11 j;
    public long k;
    public final View l;
    public final h11 m;

    public k11(de0 de0Var, y11 y11Var, long j, View view, jq0 jq0Var, c00 c00Var, UUID uuid, ya yaVar, gv gvVar) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme));
        this.i = de0Var;
        this.j = y11Var;
        this.k = j;
        this.l = view;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            xq1.s(window, false);
            h11 h11Var = new h11(getContext());
            h11Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            h11Var.setClipChildren(false);
            h11Var.setElevation(c00Var.W(8.0f));
            h11Var.setOutlineProvider(new a10(1));
            this.m = h11Var;
            setContentView(h11Var);
            h11Var.setTag(R.id.view_tree_lifecycle_owner, nq1.d(view));
            h11Var.setTag(R.id.view_tree_view_model_store_owner, yq1.o(view));
            h11Var.setTag(R.id.view_tree_saved_state_registry_owner, xq1.k(view));
            h(this.i, this.j, this.k, jq0Var);
            ov1 ov1Var = new ov1(window, window.getDecorView());
            this.j.getClass();
            ov1Var.n(io.D(this.k));
            this.j.getClass();
            ov1Var.l(io.D(this.k));
            b().a(this, new j11(this.j.b, gvVar, yaVar, new v3(this, 20)));
            return;
        }
        se.p("Dialog has no window");
        throw null;
    }

    public final void h(de0 de0Var, y11 y11Var, long j, jq0 jq0Var) {
        WindowManager.LayoutParams layoutParams;
        boolean z;
        int i;
        this.i = de0Var;
        this.j = y11Var;
        this.k = j;
        ct1 ct1Var = y11Var.a;
        ViewGroup.LayoutParams layoutParams2 = this.l.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        int i2 = 1;
        if (layoutParams != null && (layoutParams.flags & SharedConstants.DefaultBufferSize) != 0) {
            z = true;
        } else {
            z = false;
        }
        int ordinal = ct1Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    z = false;
                } else {
                    se.m();
                    return;
                }
            } else {
                z = true;
            }
        }
        Window window = getWindow();
        window.getClass();
        if (z) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, SharedConstants.DefaultBufferSize);
        int ordinal2 = jq0Var.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                se.m();
                return;
            }
        } else {
            i2 = 0;
        }
        this.m.setLayoutDirection(i2);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(48);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.i.invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
