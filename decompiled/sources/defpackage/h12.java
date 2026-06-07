package defpackage;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimation;
import com.elixir.loader.MainActivity;
import com.elixir.loader.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class h12 implements ot1 {
    public final /* synthetic */ int e;
    public Object f;
    public Object g;

    public h12(int i) {
        this.e = i;
        switch (i) {
            case 3:
                this.f = new wm1(13);
                this.g = new az0(16);
                return;
            case 4:
            default:
                return;
            case 5:
                this.f = new q41(new Reference[16]);
                this.g = new ReferenceQueue();
                return;
        }
    }

    public void a() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.f;
        Resources.Theme theme = mainActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
    }

    public void b(l2 l2Var) {
        this.g = l2Var;
        View findViewById = ((MainActivity) this.f).findViewById(android.R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new q12(this, findViewById, 0));
    }

    @Override // defpackage.ot1
    public int f(int i) {
        CharSequence charSequence = (CharSequence) this.f;
        do {
            i = ((ne1) this.g).i(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.ot1
    public int g(int i) {
        do {
            i = ((ne1) this.g).j(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.ot1
    public int k(int i) {
        do {
            i = ((ne1) this.g).j(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f).charAt(i)));
        return i;
    }

    @Override // defpackage.ot1
    public int l(int i) {
        do {
            i = ((ne1) this.g).i(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f).charAt(i - 1)));
        return i;
    }

    public String toString() {
        switch (this.e) {
            case 6:
                return "Bounds{lower=" + ((yl0) this.f) + " upper=" + ((yl0) this.g) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h12(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public h12(View view) {
        this.e = 0;
        this.f = view;
        this.g = view;
    }

    public h12(WindowInsetsAnimation.Bounds bounds) {
        this.e = 6;
        this.f = yl0.c(bounds.getLowerBound());
        this.g = yl0.c(bounds.getUpperBound());
    }

    public h12(MainActivity mainActivity) {
        this.e = 1;
        this.f = mainActivity;
        this.g = new y61(17);
    }

    public h12(Window window) {
        this.e = 7;
        this.f = window.getInsetsController();
        this.g = window;
    }
}
