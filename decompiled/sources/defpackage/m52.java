package defpackage;

import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.internal.TaggedDecoder;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class m52 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ TaggedDecoder f;
    public final /* synthetic */ DeserializationStrategy g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m52(TaggedDecoder taggedDecoder, DeserializationStrategy deserializationStrategy, Object obj, int i) {
        this.e = i;
        this.f = taggedDecoder;
        this.g = deserializationStrategy;
        this.h = obj;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        Object obj = this.h;
        DeserializationStrategy deserializationStrategy = this.g;
        TaggedDecoder taggedDecoder = this.f;
        switch (i) {
            case 0:
                return TaggedDecoder.b(taggedDecoder, deserializationStrategy, obj);
            default:
                return TaggedDecoder.a(taggedDecoder, deserializationStrategy, obj);
        }
    }
}
