package defpackage;

import android.view.View;
import com.elixir.loader.MainActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal._UtilJvmKt;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeVisitor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class l2 implements NodeVisitor, NodeFilter, t12, q91, EventListener.Factory {
    public final /* synthetic */ Object e;

    public /* synthetic */ l2(Object obj) {
        this.e = obj;
    }

    @Override // defpackage.t12
    public boolean a() {
        sl1 sl1Var = (sl1) this.e;
        int i = MainActivity.x;
        return sl1Var.e;
    }

    @Override // defpackage.q91
    public ni2 b(View view, ni2 ni2Var) {
        e52 e52Var = (e52) this.e;
        ArrayList arrayList = e52Var.b;
        ji2 ji2Var = ni2Var.a;
        yl0 a = yl0.a(ji2Var.f(519), ji2Var.f(64));
        yl0 a2 = yl0.a(ji2Var.g(519), ji2Var.g(64));
        if (!a.equals(e52Var.c) || !a2.equals(e52Var.d)) {
            e52Var.c = a;
            e52Var.d = a2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vj1 vj1Var = (vj1) arrayList.get(size);
                vj1Var.c = a;
                vj1Var.d = a2;
                vj1Var.c();
            }
        }
        return ni2Var;
    }

    public void c() {
        se0 se0Var = (se0) this.e;
        synchronized (q02.c) {
            List list = q02.h;
            list.getClass();
            ArrayList arrayList = new ArrayList(yn.a0(list, 10));
            boolean z = false;
            for (Object obj : list) {
                boolean z2 = true;
                if (!z && sn0.r(obj, se0Var)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(obj);
                }
            }
            q02.h = arrayList;
        }
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return _UtilJvmKt.b((EventListener) this.e, call);
    }

    @Override // org.jsoup.select.NodeFilter
    public NodeFilter.FilterResult head(Node node, int i) {
        return Element.a((AtomicBoolean) this.e, node, i);
    }

    @Override // org.jsoup.select.NodeVisitor
    /* renamed from: head, reason: collision with other method in class */
    public void mo125head(Node node, int i) {
        Element.c((StringBuilder) this.e, node, i);
    }
}
