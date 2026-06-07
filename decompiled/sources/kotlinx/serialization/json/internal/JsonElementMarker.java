package kotlinx.serialization.json.internal;

import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ElementMarker;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/serialization/json/internal/JsonElementMarker;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "readIfAbsent", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "Lod2;", "mark$kotlinx_serialization_json", "(I)V", "mark", "nextUnmarkedIndex$kotlinx_serialization_json", "()I", "nextUnmarkedIndex", "Lkotlinx/serialization/internal/ElementMarker;", "origin", "Lkotlinx/serialization/internal/ElementMarker;", "value", "isUnmarkedNull", "Z", "isUnmarkedNull$kotlinx_serialization_json", "()Z", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonElementMarker {
    private boolean isUnmarkedNull;
    private final ElementMarker origin;

    public JsonElementMarker(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        this.origin = new ElementMarker(serialDescriptor, new JsonElementMarker$origin$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean readIfAbsent(SerialDescriptor descriptor, int index) {
        boolean z;
        if (!descriptor.isElementOptional(index) && descriptor.getElementDescriptor(index).isNullable()) {
            z = true;
        } else {
            z = false;
        }
        this.isUnmarkedNull = z;
        return z;
    }

    /* renamed from: isUnmarkedNull$kotlinx_serialization_json, reason: from getter */
    public final boolean getIsUnmarkedNull() {
        return this.isUnmarkedNull;
    }

    public final void mark$kotlinx_serialization_json(int index) {
        this.origin.mark(index);
    }

    public final int nextUnmarkedIndex$kotlinx_serialization_json() {
        return this.origin.nextUnmarkedIndex();
    }
}
