package kotlinx.serialization.descriptors;

import defpackage.b52;
import defpackage.n40;
import defpackage.rr0;
import defpackage.sn0;
import defpackage.tz0;
import defpackage.v3;
import defpackage.vm1;
import defpackage.wn;
import defpackage.xd1;
import defpackage.yj0;
import defpackage.yn;
import defpackage.yq1;
import defpackage.zj0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\"R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00101\u001a\b\u0012\u0004\u0012\u00020\u0003008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0003058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0001058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00109R\u001b\u0010F\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\"¨\u0006G"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptorImpl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "", "serialName", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "", "elementsCount", "", "typeParameters", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "builder", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;ILjava/util/List;Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;)V", "index", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "isElementOptional", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getSerialName", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "I", "getElementsCount", "annotations", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "", "serialNames", "Ljava/util/Set;", "getSerialNames", "()Ljava/util/Set;", "", "elementNames", "[Ljava/lang/String;", "elementDescriptors", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementAnnotations", "[Ljava/util/List;", "", "elementOptionality", "[Z", "", "name2Index", "Ljava/util/Map;", "typeParametersDescriptors", "_hashCode$delegate", "Lrr0;", "get_hashCode", "_hashCode", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {

    /* renamed from: _hashCode$delegate, reason: from kotlin metadata */
    private final rr0 _hashCode;
    private final List<Annotation> annotations;
    private final List<Annotation>[] elementAnnotations;
    private final SerialDescriptor[] elementDescriptors;
    private final String[] elementNames;
    private final boolean[] elementOptionality;
    private final int elementsCount;
    private final SerialKind kind;
    private final Map<String, Integer> name2Index;
    private final String serialName;
    private final Set<String> serialNames;
    private final SerialDescriptor[] typeParametersDescriptors;

    public SerialDescriptorImpl(String str, SerialKind serialKind, int i, List<? extends SerialDescriptor> list, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        str.getClass();
        serialKind.getClass();
        list.getClass();
        classSerialDescriptorBuilder.getClass();
        this.serialName = str;
        this.kind = serialKind;
        this.elementsCount = i;
        this.annotations = classSerialDescriptorBuilder.getAnnotations();
        List<String> elementNames$kotlinx_serialization_core = classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core();
        elementNames$kotlinx_serialization_core.getClass();
        HashSet hashSet = new HashSet(tz0.c0(yn.a0(elementNames$kotlinx_serialization_core, 12)));
        wn.z0(elementNames$kotlinx_serialization_core, hashSet);
        this.serialNames = hashSet;
        this.elementNames = (String[]) classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().toArray(new String[0]);
        this.elementDescriptors = Platform_commonKt.compactArray(classSerialDescriptorBuilder.getElementDescriptors$kotlinx_serialization_core());
        this.elementAnnotations = (List[]) classSerialDescriptorBuilder.getElementAnnotations$kotlinx_serialization_core().toArray(new List[0]);
        List<Boolean> elementOptionality$kotlinx_serialization_core = classSerialDescriptorBuilder.getElementOptionality$kotlinx_serialization_core();
        elementOptionality$kotlinx_serialization_core.getClass();
        boolean[] zArr = new boolean[elementOptionality$kotlinx_serialization_core.size()];
        Iterator<Boolean> it = elementOptionality$kotlinx_serialization_core.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = it.next().booleanValue();
            i2++;
        }
        this.elementOptionality = zArr;
        String[] strArr = this.elementNames;
        strArr.getClass();
        zj0 zj0Var = new zj0(new v3(strArr, 3), 0);
        ArrayList arrayList = new ArrayList(yn.a0(zj0Var, 10));
        Iterator it2 = zj0Var.iterator();
        while (true) {
            n40 n40Var = (n40) it2;
            if (n40Var.f.hasNext()) {
                yj0 yj0Var = (yj0) n40Var.next();
                arrayList.add(new xd1(yj0Var.b, Integer.valueOf(yj0Var.a)));
            } else {
                this.name2Index = tz0.e0(arrayList);
                this.typeParametersDescriptors = Platform_commonKt.compactArray(list);
                this._hashCode = new b52(new vm1(this, 9));
                return;
            }
        }
    }

    public static final int _hashCode_delegate$lambda$1(SerialDescriptorImpl serialDescriptorImpl) {
        return PluginGeneratedSerialDescriptorKt.hashCodeImpl(serialDescriptorImpl, serialDescriptorImpl.typeParametersDescriptors);
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerialDescriptorImpl)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) other;
        if (!sn0.r(getSerialName(), serialDescriptor.getSerialName()) || !Arrays.equals(this.typeParametersDescriptors, ((SerialDescriptorImpl) other).typeParametersDescriptors) || getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            if (!sn0.r(getElementDescriptor(i).getSerialName(), serialDescriptor.getElementDescriptor(i).getSerialName()) || !sn0.r(getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int index) {
        return this.elementAnnotations[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int index) {
        return this.elementDescriptors[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        name.getClass();
        Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int index) {
        return this.elementNames[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.serialNames;
    }

    public int hashCode() {
        return get_hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        return this.elementOptionality[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public boolean getIsInline() {
        return super.getIsInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return super.isNullable();
    }

    public String toString() {
        return PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }
}
