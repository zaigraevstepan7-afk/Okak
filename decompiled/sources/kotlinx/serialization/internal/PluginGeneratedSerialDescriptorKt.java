package kotlinx.serialization.internal;

import defpackage.go;
import defpackage.hh1;
import defpackage.oe0;
import defpackage.sn0;
import defpackage.wn;
import defpackage.yq1;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aA\u0010\u0007\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\f\u001a\u00020\u000b*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "SD", "", "other", "Lkotlin/Function1;", "", "typeParamsAreEqual", "equalsImpl", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/lang/Object;Loe0;)Z", "", "typeParams", "", "hashCodeImpl", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "", "toStringImpl", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/String;", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class PluginGeneratedSerialDescriptorKt {
    public static final /* synthetic */ <SD extends SerialDescriptor> boolean equalsImpl(SD sd, Object obj, oe0 oe0Var) {
        sd.getClass();
        oe0Var.getClass();
        if (sd == obj) {
            return true;
        }
        sn0.R();
        throw null;
    }

    public static final int hashCodeImpl(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        int i;
        serialDescriptor.getClass();
        serialDescriptorArr.getClass();
        int hashCode = (serialDescriptor.getSerialName().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        Iterable<SerialDescriptor> elementDescriptors = SerialDescriptorKt.getElementDescriptors(serialDescriptor);
        Iterator<SerialDescriptor> it = elementDescriptors.iterator();
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i5 = i3 * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                i4 = serialName.hashCode();
            }
            i3 = i5 + i4;
        }
        Iterator<SerialDescriptor> it2 = elementDescriptors.iterator();
        while (it2.hasNext()) {
            int i6 = i2 * 31;
            SerialKind kind = it2.next().getKind();
            if (kind != null) {
                i = kind.hashCode();
            } else {
                i = 0;
            }
            i2 = i6 + i;
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }

    public static final String toStringImpl(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return wn.m0(go.X(0, serialDescriptor.getElementsCount()), ", ", serialDescriptor.getSerialName() + '(', ")", new hh1(serialDescriptor, 0), 24);
    }

    public static final CharSequence toStringImpl$lambda$2(SerialDescriptor serialDescriptor, int i) {
        return serialDescriptor.getElementName(i) + ": " + serialDescriptor.getElementDescriptor(i).getSerialName();
    }
}
