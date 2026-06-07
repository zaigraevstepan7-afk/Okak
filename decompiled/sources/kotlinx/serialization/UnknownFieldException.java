package kotlinx.serialization;

import defpackage.l90;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/serialization/UnknownFieldException;", "Lkotlinx/serialization/SerializationException;", "message", "", "<init>", "(Ljava/lang/String;)V", "index", "", "(I)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        this(l90.g(i, "An unknown field for index "));
    }

    public UnknownFieldException(String str) {
        super(str);
    }
}
