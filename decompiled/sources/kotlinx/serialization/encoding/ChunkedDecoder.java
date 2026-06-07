package kotlinx.serialization.encoding;

import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/encoding/ChunkedDecoder;", "", "Lkotlin/Function1;", "", "Lod2;", "consumeChunk", "decodeStringChunked", "(Loe0;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public interface ChunkedDecoder {
    @ExperimentalSerializationApi
    void decodeStringChunked(oe0 consumeChunk);
}
