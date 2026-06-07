package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.elixir.loader.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wj1 extends FrameLayout {
    public static final Object g = new Object();
    public final ArrayList e;
    public vj1 f;

    public wj1(Context context, List list) {
        super(context);
        this.e = new ArrayList();
        setProtections(list);
    }

    private e52 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof e52) {
            return (e52) tag;
        }
        e52 e52Var = new e52(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, e52Var);
        return e52Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac A[LOOP:0: B:4:0x0023->B:18:0x00ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.e
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            goto Lba
        La:
            e52 r1 = r13.getOrInstallSystemBarStateMonitor()
            vj1 r2 = new vj1
            r2.<init>(r1, r0)
            r13.f = r2
            int r0 = r13.getChildCount()
            vj1 r1 = r13.f
            java.util.ArrayList r1 = r1.a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L23:
            if (r3 >= r1) goto Lba
            vj1 r4 = r13.f
            java.util.ArrayList r4 = r4.a
            java.lang.Object r4 = r4.get(r3)
            ko r4 = (defpackage.ko) r4
            android.content.Context r5 = r13.getContext()
            int r6 = r3 + r0
            uj1 r7 = r4.b
            int r4 = r4.a
            r8 = 1
            r9 = 4
            r10 = -1
            if (r4 == r8) goto L62
            r8 = 2
            if (r4 == r8) goto L5d
            if (r4 == r9) goto L56
            r8 = 8
            if (r4 != r8) goto L4c
            int r4 = r7.b
            r8 = 80
            goto L66
        L4c:
            java.lang.String r13 = "Unexpected side: "
            java.lang.String r13 = defpackage.l90.g(r4, r13)
            defpackage.se.h(r13)
            return
        L56:
            int r4 = r7.a
            r8 = 5
        L59:
            r12 = r10
            r10 = r4
            r4 = r12
            goto L66
        L5d:
            int r4 = r7.b
            r8 = 48
            goto L66
        L62:
            int r4 = r7.a
            r8 = 3
            goto L59
        L66:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r10, r4, r8)
            yl0 r4 = r7.c
            int r8 = r4.a
            r11.leftMargin = r8
            int r8 = r4.b
            r11.topMargin = r8
            int r8 = r4.c
            r11.rightMargin = r8
            int r4 = r4.d
            r11.bottomMargin = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r5)
            java.lang.Object r5 = defpackage.wj1.g
            r4.setTag(r5)
            float r5 = r7.f
            r4.setTranslationX(r5)
            float r5 = r7.g
            r4.setTranslationY(r5)
            float r5 = r7.h
            r4.setAlpha(r5)
            boolean r5 = r7.d
            if (r5 == 0) goto L9b
            r9 = r2
        L9b:
            r4.setVisibility(r9)
            android.graphics.drawable.ColorDrawable r5 = r7.e
            r4.setBackground(r5)
            sl0 r5 = new sl0
            r5.<init>(r11, r4)
            sl0 r8 = r7.i
            if (r8 != 0) goto Lb5
            r7.i = r5
            r13.addView(r4, r6, r11)
            int r3 = r3 + 1
            goto L23
        Lb5:
            java.lang.String r13 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            defpackage.se.p(r13)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj1.a():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        if (view != null && view.getTag() != g) {
            vj1 vj1Var = this.f;
            if (vj1Var != null) {
                i2 = vj1Var.a.size();
            } else {
                i2 = 0;
            }
            int childCount = getChildCount() - i2;
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        vj1 vj1Var;
        if (this.f != null) {
            removeViews(getChildCount() - this.f.a.size(), this.f.a.size());
            int size = this.f.a.size();
            int i = 0;
            while (true) {
                vj1Var = this.f;
                if (i >= size) {
                    break;
                }
                ((ko) vj1Var.a.get(i)).b.i = null;
                i++;
            }
            ArrayList arrayList = vj1Var.a;
            if (!vj1Var.f) {
                vj1Var.f = true;
                vj1Var.b.b.remove(vj1Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((ko) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.f = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof e52) {
            e52 e52Var = (e52) tag;
            if (!e52Var.b.isEmpty()) {
                return;
            }
            e52Var.a.post(new r5(e52Var, 12));
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
        }
    }

    public void setProtections(List<ko> list) {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
