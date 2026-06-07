package defpackage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class th0 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ th0(String str, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = str;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                th0 th0Var = new th0(this.h, vtVar, 0);
                th0Var.g = obj;
                return th0Var;
            default:
                th0 th0Var2 = new th0(this.h, vtVar, 1);
                th0Var2.g = obj;
                return th0Var2;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        gv gvVar = (gv) obj;
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                return ((th0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((th0) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        Object fo1Var;
        Object fo1Var2;
        int i = this.f;
        String str = this.h;
        switch (i) {
            case 0:
                io.K(obj);
                if (str.length() == 0) {
                    return Boolean.FALSE;
                }
                try {
                    boolean z = true;
                    Process start = new ProcessBuilder("su", "-c", "kill -0 " + str).redirectErrorStream(true).start();
                    start.getOutputStream().close();
                    start.getInputStream().close();
                    if (start.waitFor() != 0) {
                        z = false;
                    }
                    fo1Var = Boolean.valueOf(z);
                } catch (Throwable th) {
                    fo1Var = new fo1(th);
                }
                Boolean bool = Boolean.FALSE;
                if (fo1Var instanceof fo1) {
                    return bool;
                }
                return fo1Var;
            default:
                io.K(obj);
                try {
                    Document document = Jsoup.connect("https://play.google.com/store/apps/details?id=" + str + "&hl=en&gl=us").get();
                    document.getClass();
                    Elements select = document.select("div.hAyfc:contains(Current Version) span.htlgb");
                    select.getClass();
                    Element element = (Element) wn.h0(select);
                    if (element != null) {
                        fo1Var2 = element.text();
                    } else {
                        fo1Var2 = null;
                    }
                } catch (Throwable th2) {
                    fo1Var2 = new fo1(th2);
                }
                if (fo1Var2 instanceof fo1) {
                    return null;
                }
                return fo1Var2;
        }
    }
}
