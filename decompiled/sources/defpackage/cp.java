package defpackage;

import java.util.function.ToIntFunction;
import org.jsoup.select.Evaluator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class cp implements ToIntFunction {
    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((Evaluator) obj).cost();
    }
}
