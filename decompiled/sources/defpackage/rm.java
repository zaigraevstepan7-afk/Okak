package defpackage;

import java.lang.ref.SoftReference;
import java.util.IdentityHashMap;
import java.util.function.Supplier;
import org.jsoup.internal.SoftPool;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Entities;
import org.jsoup.parser.CharacterReader;
import org.jsoup.select.Elements;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class rm implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ rm(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        SoftReference lambda$new$0;
        switch (this.a) {
            case 0:
                return CharacterReader.b();
            case 1:
                return CharacterReader.a();
            case 2:
                return new Elements();
            case 3:
                return Entities.a();
            case 4:
                lambda$new$0 = SoftPool.lambda$new$0();
                return lambda$new$0;
            case 5:
                return StringUtil.c();
            default:
                return new IdentityHashMap();
        }
    }
}
