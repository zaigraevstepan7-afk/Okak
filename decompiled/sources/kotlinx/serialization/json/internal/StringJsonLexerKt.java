package kotlinx.serialization.json.internal;

import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.json.Json;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"StringJsonLexer", "Lkotlinx/serialization/json/internal/StringJsonLexer;", "json", "Lkotlinx/serialization/json/Json;", "source", "", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class StringJsonLexerKt {
    public static final StringJsonLexer StringJsonLexer(Json json, String str) {
        json.getClass();
        str.getClass();
        if (!json.getConfiguration().getAllowComments()) {
            return new StringJsonLexer(str);
        }
        return new StringJsonLexerWithComments(str);
    }
}
