package kotlinx.serialization.json.internal;

import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnquotedLiterals;", "Lkotlinx/serialization/json/internal/Composer;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "writer", "", "forceQuoting", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Z)V", "", "value", "Lod2;", "printQuoted", "(Ljava/lang/String;)V", "Z", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ComposerForUnquotedLiterals extends Composer {
    private final boolean forceQuoting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerForUnquotedLiterals(InternalJsonWriter internalJsonWriter, boolean z) {
        super(internalJsonWriter);
        internalJsonWriter.getClass();
        this.forceQuoting = z;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    public void printQuoted(String value) {
        value.getClass();
        if (this.forceQuoting) {
            super.printQuoted(value);
        } else {
            print(value);
        }
    }
}
