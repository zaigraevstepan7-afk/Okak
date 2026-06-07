package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import org.jsoup.internal.Functions;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.TokenQueue;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class m50 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ m50(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object lambda$static$0;
        Object lambda$static$1;
        Object lambda$static$2;
        Object lambda$static$3;
        switch (this.a) {
            case 0:
                return Collections.unmodifiableList((List) obj);
            case 1:
                return Element.b((Node) obj);
            case 2:
                return TokenQueue.escapeCssIdentifier((String) obj);
            case 3:
                return ((Element) obj).html();
            case 4:
                return ((Element) obj).text();
            case 5:
                return ((Element) obj).outerHtml();
            case 6:
                lambda$static$0 = Functions.lambda$static$0(obj);
                return lambda$static$0;
            case 7:
                lambda$static$1 = Functions.lambda$static$1(obj);
                return lambda$static$1;
            case 8:
                lambda$static$2 = Functions.lambda$static$2(obj);
                return lambda$static$2;
            case 9:
                lambda$static$3 = Functions.lambda$static$3(obj);
                return lambda$static$3;
            default:
                return ((StringUtil.StringJoiner) obj).complete();
        }
    }
}
