package kotlinx.serialization.internal;

import defpackage.yq1;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/internal/DoubleArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "bufferWithData", "<init>", "([D)V", "", "requiredCapacity", "Lod2;", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "", "c", "append$kotlinx_serialization_core", "(D)V", "append", "build$kotlinx_serialization_core", "()[D", "build", "buffer", "[D", "value", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class DoubleArrayBuilder extends PrimitiveArrayBuilder<double[]> {
    private double[] buffer;
    private int position;

    public DoubleArrayBuilder(double[] dArr) {
        dArr.getClass();
        this.buffer = dArr;
        this.position = dArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public final void append$kotlinx_serialization_core(double c) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        double[] dArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        dArr[position] = c;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public double[] build$kotlinx_serialization_core() {
        return Arrays.copyOf(this.buffer, getPosition());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        double[] dArr = this.buffer;
        if (dArr.length < requiredCapacity) {
            int length = dArr.length * 2;
            if (requiredCapacity < length) {
                requiredCapacity = length;
            }
            this.buffer = Arrays.copyOf(dArr, requiredCapacity);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: getPosition$kotlinx_serialization_core, reason: from getter */
    public int getPosition() {
        return this.position;
    }
}
