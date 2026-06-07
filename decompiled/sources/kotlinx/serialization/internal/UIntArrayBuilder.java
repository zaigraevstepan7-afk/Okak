package kotlinx.serialization.internal;

import defpackage.yq1;
import defpackage.yx;
import defpackage.zc2;
import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/serialization/internal/UIntArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lzc2;", "bufferWithData", "<init>", "([ILyx;)V", "", "requiredCapacity", "Lod2;", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "Lyc2;", "c", "append-WZ4Q5Ns$kotlinx_serialization_core", "append", "build--hP7Qyg$kotlinx_serialization_core", "()[I", "build", "buffer", "[I", "value", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public final class UIntArrayBuilder extends PrimitiveArrayBuilder<zc2> {
    private int[] buffer;
    private int position;

    private UIntArrayBuilder(int[] iArr) {
        iArr.getClass();
        this.buffer = iArr;
        this.position = iArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    /* renamed from: append-WZ4Q5Ns$kotlinx_serialization_core, reason: not valid java name */
    public final void m94appendWZ4Q5Ns$kotlinx_serialization_core(int c) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int[] iArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        iArr[position] = c;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* synthetic */ zc2 build$kotlinx_serialization_core() {
        return new zc2(m95buildhP7Qyg$kotlinx_serialization_core());
    }

    /* renamed from: build--hP7Qyg$kotlinx_serialization_core, reason: not valid java name */
    public int[] m95buildhP7Qyg$kotlinx_serialization_core() {
        return Arrays.copyOf(this.buffer, getPosition());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        int[] iArr = this.buffer;
        if (iArr.length < requiredCapacity) {
            int length = iArr.length * 2;
            if (requiredCapacity < length) {
                requiredCapacity = length;
            }
            this.buffer = Arrays.copyOf(iArr, requiredCapacity);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: getPosition$kotlinx_serialization_core, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    public /* synthetic */ UIntArrayBuilder(int[] iArr, yx yxVar) {
        this(iArr);
    }
}
