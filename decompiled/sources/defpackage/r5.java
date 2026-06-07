package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import com.topjohnwu.superuser.Shell;
import com.topjohnwu.superuser.ipc.RootService;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r5(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        View view;
        boolean z;
        View findFocus;
        int i2 = this.e;
        WindowInsetsController windowInsetsController = null;
        int i3 = 0;
        Object obj = this.f;
        switch (i2) {
            case 0:
                w5 w5Var = (w5) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    w5Var.h.t(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        w5Var.f();
                        Trace.endSection();
                        w5Var.N = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 1:
                p6 p6Var = (p6) obj;
                boolean h = p6Var.h();
                q5 q5Var = p6Var.e;
                if (h) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        q5Var.t(true);
                        p31 p31Var = p6Var.p;
                        int[] iArr = p31Var.b;
                        long[] jArr = p31Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                    int i6 = i3;
                                    while (i6 < i5) {
                                        if ((255 & j) < 128) {
                                            int i7 = iArr[(i4 << 3) + i6];
                                            if (!p6Var.f().a(i7)) {
                                                i = length;
                                                p6Var.h.add(new ct(i7, p6Var.o, dt.f, null));
                                                p6Var.l.j(od2.a);
                                                j >>= 8;
                                                i6++;
                                                length = i;
                                            }
                                        }
                                        i = length;
                                        j >>= 8;
                                        i6++;
                                        length = i;
                                    }
                                    int i8 = length;
                                    if (i5 == 8) {
                                        length = i8;
                                    }
                                }
                                if (i4 != length) {
                                    i4++;
                                    i3 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        p6Var.k(q5Var.getSemanticsOwner().a(), p6Var.q);
                        Trace.endSection();
                        p6Var.d(p6Var.f());
                        p6Var.n();
                        p6Var.r = false;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                    }
                }
                return;
            case 2:
                ActionMode actionMode = ((x9) obj).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 3:
                yp.h((yp) obj);
                return;
            case 4:
                vp vpVar = (vp) obj;
                Runnable runnable = vpVar.f;
                if (runnable != null) {
                    runnable.run();
                    vpVar.f = null;
                    return;
                }
                return;
            case 5:
                bq.c((bq) obj);
                return;
            case 6:
                ld0 ld0Var = (ld0) obj;
                synchronized (ld0Var.d) {
                    try {
                        if (ld0Var.h != null) {
                            try {
                                ud0 c = ld0Var.c();
                                int i9 = c.f;
                                if (i9 == 2) {
                                    synchronized (ld0Var.d) {
                                    }
                                }
                                if (i9 == 0) {
                                    try {
                                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                        wc0 wc0Var = ld0Var.c;
                                        Context context = ld0Var.a;
                                        wc0Var.getClass();
                                        Typeface a = ic2.a(context, new ud0[]{c});
                                        MappedByteBuffer n = xp1.n(ld0Var.a, c.a);
                                        if (n != null && a != null) {
                                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                            q4 q4Var = new q4(a, xn.L(n));
                                            Trace.endSection();
                                            synchronized (ld0Var.d) {
                                                try {
                                                    hp hpVar = ld0Var.h;
                                                    if (hpVar != null) {
                                                        hpVar.G(q4Var);
                                                    }
                                                } finally {
                                                }
                                            }
                                            ld0Var.b();
                                            return;
                                        }
                                        throw new RuntimeException("Unable to open file.");
                                    } catch (Throwable th2) {
                                        throw th2;
                                    } finally {
                                    }
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                            } catch (Throwable th3) {
                                synchronized (ld0Var.d) {
                                    try {
                                        hp hpVar2 = ld0Var.h;
                                        if (hpVar2 != null) {
                                            hpVar2.F(th3);
                                        }
                                        ld0Var.b();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 7:
                yi1 yi1Var = (yi1) obj;
                wu0 wu0Var = yi1Var.j;
                if (yi1Var.f == 0) {
                    yi1Var.g = true;
                    wu0Var.d(mu0.ON_PAUSE);
                }
                if (yi1Var.e == 0 && yi1Var.g) {
                    wu0Var.d(mu0.ON_STOP);
                    yi1Var.h = true;
                    return;
                }
                return;
            case 8:
                wo1.a((wo1) obj);
                return;
            case 9:
                RootService.a((Shell.Task) obj);
                return;
            case 10:
                ((Iterator) obj).remove();
                return;
            case 11:
                View view2 = (View) obj;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                return;
            case 12:
                c52 c52Var = ((e52) obj).a;
                ViewParent parent = c52Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c52Var);
                    return;
                }
                return;
            default:
                p82 p82Var = (p82) obj;
                ld ldVar = p82Var.b;
                p82Var.n = null;
                q41 q41Var = p82Var.m;
                View view3 = p82Var.a;
                if (!view3.isFocused() && (findFocus = view3.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    q41Var.g();
                    return;
                }
                Object[] objArr = q41Var.e;
                int i10 = q41Var.g;
                Boolean bool = null;
                Boolean bool2 = null;
                for (int i11 = 0; i11 < i10; i11++) {
                    o82 o82Var = (o82) objArr[i11];
                    int ordinal = o82Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2 && ordinal != 3) {
                                se.m();
                                return;
                            }
                            if (!sn0.r(bool, Boolean.FALSE)) {
                                if (o82Var == o82.g) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bool2 = Boolean.valueOf(z);
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    bool2 = bool;
                }
                q41Var.g();
                if (sn0.r(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((rr0) ldVar.g).getValue()).restartInput((View) ldVar.f);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        h12 h12Var = (h12) ((ov1) ldVar.h).f;
                        View view4 = (View) h12Var.g;
                        if (view4 != null && Build.VERSION.SDK_INT < 33) {
                            ((InputMethodManager) view4.getContext().getSystemService("input_method")).isActive();
                        }
                        if (view4 != null) {
                            windowInsetsController = view4.getWindowInsetsController();
                        }
                        if (windowInsetsController != null) {
                            windowInsetsController.show(WindowInsets.Type.ime());
                        }
                        View view5 = (View) h12Var.f;
                        if (view5 != null) {
                            if (!view5.isInEditMode() && !view5.onCheckIsTextEditor()) {
                                view = view5.getRootView().findFocus();
                            } else {
                                view5.requestFocus();
                                view = view5;
                            }
                            if (view == null) {
                                view = view5.getRootView().findViewById(R.id.content);
                            }
                            if (view != null && view.hasWindowFocus()) {
                                view.post(new r5(view, 11));
                            }
                        }
                    } else {
                        h12 h12Var2 = (h12) ((ov1) ldVar.h).f;
                        View view6 = (View) h12Var2.g;
                        if (view6 != null) {
                            windowInsetsController = view6.getWindowInsetsController();
                        }
                        if (windowInsetsController != null) {
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: g12
                                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i12) {
                                    boolean z2;
                                    if ((i12 & 8) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    atomicBoolean.set(z2);
                                }
                            };
                            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                            if (!atomicBoolean.get() && view6 != null) {
                                ((InputMethodManager) view6.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view6.getWindowToken(), 0);
                            }
                            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                            windowInsetsController.hide(WindowInsets.Type.ime());
                        } else {
                            View view7 = (View) h12Var2.f;
                            if (view7 != null) {
                                ((InputMethodManager) view7.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view7.getWindowToken(), 0);
                            }
                        }
                    }
                }
                if (sn0.r(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((rr0) ldVar.g).getValue()).restartInput((View) ldVar.f);
                    return;
                }
                return;
        }
    }
}
