package kotlinx.serialization.internal;

import defpackage.yq1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "seen", "goldenMask", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lod2;", "throwMissingFieldException", "(IILkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "seenArray", "goldenMaskArray", "throwArrayMissingFieldException", "([I[ILkotlinx/serialization/descriptors/SerialDescriptor;)V", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class PluginExceptionsKt {
    @InternalSerializationApi
    public static final void throwArrayMissingFieldException(int[] iArr, int[] iArr2, SerialDescriptor serialDescriptor) {
        iArr.getClass();
        iArr2.getClass();
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr2[i] & (~iArr[i]);
            if (i2 != 0) {
                for (int i3 = 0; i3 < 32; i3++) {
                    if ((i2 & 1) != 0) {
                        arrayList.add(serialDescriptor.getElementName((i * 32) + i3));
                    }
                    i2 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, serialDescriptor.getSerialName());
    }

    @InternalSerializationApi
    public static final void throwMissingFieldException(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.getElementName(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, serialDescriptor.getSerialName());
    }
}
