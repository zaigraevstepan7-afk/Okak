package kotlinx.serialization.internal;

import defpackage.wc2;
import defpackage.yq1;
import defpackage.yx;
import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068\u0010@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/serialization/internal/UByteArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lwc2;", "bufferWithData", "<init>", "([BLyx;)V", "", "requiredCapacity", "Lod2;", "ensureCapacity$kotlinx_serialization_core", "(I)V", "ensureCapacity", "Lvc2;", "c", "append-7apg3OU$kotlinx_serialization_core", "(B)V", "append", "build-TcUX1vc$kotlinx_serialization_core", "()[B", "build", "buffer", "[B", "value", "position", "I", "getPosition$kotlinx_serialization_core", "()I", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public final class UByteArrayBuilder extends PrimitiveArrayBuilder<wc2> {
    private byte[] buffer;
    private int position;

    private UByteArrayBuilder(byte[] bArr) {
        bArr.getClass();
        this.buffer = bArr;
        this.position = bArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    /* renamed from: append-7apg3OU$kotlinx_serialization_core, reason: not valid java name */
    public final void m86append7apg3OU$kotlinx_serialization_core(byte c) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        byte[] bArr = this.buffer;
        int position = getPosition();
        this.position = position + 1;
        bArr[position] = c;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public /* synthetic */ wc2 build$kotlinx_serialization_core() {
        return new wc2(m87buildTcUX1vc$kotlinx_serialization_core());
    }

    /* renamed from: build-TcUX1vc$kotlinx_serialization_core, reason: not valid java name */
    public byte[] m87buildTcUX1vc$kotlinx_serialization_core() {
        return Arrays.copyOf(this.buffer, getPosition());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        byte[] bArr = this.buffer;
        if (bArr.length < requiredCapacity) {
            int length = bArr.length * 2;
            if (requiredCapacity < length) {
                requiredCapacity = length;
            }
            this.buffer = Arrays.copyOf(bArr, requiredCapacity);
        }
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: getPosition$kotlinx_serialization_core, reason: from getter */
    public int getPosition() {
        return this.position;
    }

    public /* synthetic */ UByteArrayBuilder(byte[] bArr, yx yxVar) {
        this(bArr);
    }
}
