package kotlinx.serialization.internal;

import defpackage.de0;
import defpackage.l60;
import defpackage.lo;
import defpackage.m60;
import defpackage.rr0;
import defpackage.se;
import defpackage.sn0;
import defpackage.xt0;
import defpackage.yq1;
import defpackage.yx;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010-R\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010+R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0003048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u000107048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R%\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER!\u0010J\u001a\b\u0012\u0004\u0012\u00020\u0001048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010IR\u001b\u0010M\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u0010+R\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00140\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "", "serialName", "Lkotlinx/serialization/internal/GeneratedSerializer;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V", "", "buildIndices", "()Ljava/util/Map;", "name", "", "isOptional", "Lod2;", "addElement", "(Ljava/lang/String;Z)V", "", "annotation", "pushAnnotation", "(Ljava/lang/annotation/Annotation;)V", "a", "pushClassAnnotation", "index", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "isElementOptional", "(I)Z", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementName", "(I)Ljava/lang/String;", "getElementIndex", "(Ljava/lang/String;)I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getSerialName", "Lkotlinx/serialization/internal/GeneratedSerializer;", "I", "getElementsCount", "added", "", "names", "[Ljava/lang/String;", "", "propertiesAnnotations", "[Ljava/util/List;", "classAnnotations", "Ljava/util/List;", "", "elementsOptionality", "[Z", "indices", "Ljava/util/Map;", "Lkotlinx/serialization/KSerializer;", "childSerializers$delegate", "Lrr0;", "getChildSerializers", "()[Lkotlinx/serialization/KSerializer;", "childSerializers", "typeParameterDescriptors$delegate", "getTypeParameterDescriptors$kotlinx_serialization_core", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors", "_hashCode$delegate", "get_hashCode", "_hashCode", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "", "getSerialNames", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {

    /* renamed from: _hashCode$delegate, reason: from kotlin metadata */
    private final rr0 _hashCode;
    private int added;

    /* renamed from: childSerializers$delegate, reason: from kotlin metadata */
    private final rr0 childSerializers;
    private List<Annotation> classAnnotations;
    private final int elementsCount;
    private final boolean[] elementsOptionality;
    private final GeneratedSerializer<?> generatedSerializer;
    private Map<String, Integer> indices;
    private final String[] names;
    private final List<Annotation>[] propertiesAnnotations;
    private final String serialName;

    /* renamed from: typeParameterDescriptors$delegate, reason: from kotlin metadata */
    private final rr0 typeParameterDescriptors;

    public PluginGeneratedSerialDescriptor(String str, GeneratedSerializer<?> generatedSerializer, int i) {
        str.getClass();
        this.serialName = str;
        this.generatedSerializer = generatedSerializer;
        this.elementsCount = i;
        this.added = -1;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i4 = this.elementsCount;
        this.propertiesAnnotations = new List[i4];
        this.elementsOptionality = new boolean[i4];
        this.indices = m60.e;
        de0 de0Var = new de0(this) { // from class: gh1
            public final /* synthetic */ PluginGeneratedSerialDescriptor f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                KSerializer[] childSerializers_delegate$lambda$0;
                SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2;
                int _hashCode_delegate$lambda$3;
                int i5 = i2;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f;
                switch (i5) {
                    case 0:
                        childSerializers_delegate$lambda$0 = PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(pluginGeneratedSerialDescriptor);
                        return childSerializers_delegate$lambda$0;
                    case 1:
                        typeParameterDescriptors_delegate$lambda$2 = PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(pluginGeneratedSerialDescriptor);
                        return typeParameterDescriptors_delegate$lambda$2;
                    default:
                        _hashCode_delegate$lambda$3 = PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(pluginGeneratedSerialDescriptor);
                        return Integer.valueOf(_hashCode_delegate$lambda$3);
                }
            }
        };
        xt0 xt0Var = xt0.e;
        this.childSerializers = lo.O(xt0Var, de0Var);
        final int i5 = 1;
        this.typeParameterDescriptors = lo.O(xt0Var, new de0(this) { // from class: gh1
            public final /* synthetic */ PluginGeneratedSerialDescriptor f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                KSerializer[] childSerializers_delegate$lambda$0;
                SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2;
                int _hashCode_delegate$lambda$3;
                int i52 = i5;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f;
                switch (i52) {
                    case 0:
                        childSerializers_delegate$lambda$0 = PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(pluginGeneratedSerialDescriptor);
                        return childSerializers_delegate$lambda$0;
                    case 1:
                        typeParameterDescriptors_delegate$lambda$2 = PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(pluginGeneratedSerialDescriptor);
                        return typeParameterDescriptors_delegate$lambda$2;
                    default:
                        _hashCode_delegate$lambda$3 = PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(pluginGeneratedSerialDescriptor);
                        return Integer.valueOf(_hashCode_delegate$lambda$3);
                }
            }
        });
        final int i6 = 2;
        this._hashCode = lo.O(xt0Var, new de0(this) { // from class: gh1
            public final /* synthetic */ PluginGeneratedSerialDescriptor f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                KSerializer[] childSerializers_delegate$lambda$0;
                SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2;
                int _hashCode_delegate$lambda$3;
                int i52 = i6;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.f;
                switch (i52) {
                    case 0:
                        childSerializers_delegate$lambda$0 = PluginGeneratedSerialDescriptor.childSerializers_delegate$lambda$0(pluginGeneratedSerialDescriptor);
                        return childSerializers_delegate$lambda$0;
                    case 1:
                        typeParameterDescriptors_delegate$lambda$2 = PluginGeneratedSerialDescriptor.typeParameterDescriptors_delegate$lambda$2(pluginGeneratedSerialDescriptor);
                        return typeParameterDescriptors_delegate$lambda$2;
                    default:
                        _hashCode_delegate$lambda$3 = PluginGeneratedSerialDescriptor._hashCode_delegate$lambda$3(pluginGeneratedSerialDescriptor);
                        return Integer.valueOf(_hashCode_delegate$lambda$3);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _hashCode_delegate$lambda$3(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        return PluginGeneratedSerialDescriptorKt.hashCodeImpl(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core());
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            pluginGeneratedSerialDescriptor.addElement(str, z);
            return;
        }
        se.v("Super calls with default arguments not supported in this target, function: addElement");
    }

    private final Map<String, Integer> buildIndices() {
        HashMap hashMap = new HashMap();
        int length = this.names.length;
        for (int i = 0; i < length; i++) {
            hashMap.put(this.names[i], Integer.valueOf(i));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer[] childSerializers_delegate$lambda$0(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer<?>[] childSerializers;
        GeneratedSerializer<?> generatedSerializer = pluginGeneratedSerialDescriptor.generatedSerializer;
        if (generatedSerializer != null && (childSerializers = generatedSerializer.childSerializers()) != null) {
            return childSerializers;
        }
        return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY;
    }

    private final KSerializer<?>[] getChildSerializers() {
        return (KSerializer[]) this.childSerializers.getValue();
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] typeParameterDescriptors_delegate$lambda$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        ArrayList arrayList;
        KSerializer<?>[] typeParametersSerializers;
        GeneratedSerializer<?> generatedSerializer = pluginGeneratedSerialDescriptor.generatedSerializer;
        if (generatedSerializer != null && (typeParametersSerializers = generatedSerializer.typeParametersSerializers()) != null) {
            arrayList = new ArrayList(typeParametersSerializers.length);
            for (KSerializer<?> kSerializer : typeParametersSerializers) {
                arrayList.add(kSerializer.getDescriptor());
            }
        } else {
            arrayList = null;
        }
        return Platform_commonKt.compactArray(arrayList);
    }

    public final void addElement(String name, boolean isOptional) {
        name.getClass();
        String[] strArr = this.names;
        int i = this.added + 1;
        this.added = i;
        strArr[i] = name;
        this.elementsOptionality[i] = isOptional;
        this.propertiesAnnotations[i] = null;
        if (i == this.elementsCount - 1) {
            this.indices = buildIndices();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PluginGeneratedSerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) other;
        if (!sn0.r(getSerialName(), serialDescriptor.getSerialName()) || !Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), ((PluginGeneratedSerialDescriptor) other).getTypeParameterDescriptors$kotlinx_serialization_core()) || getElementsCount() != serialDescriptor.getElementsCount()) {
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
        List<Annotation> list = this.classAnnotations;
        if (list == null) {
            return l60.e;
        }
        return list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List<Annotation> getElementAnnotations(int index) {
        List<Annotation> list = this.propertiesAnnotations[index];
        if (list == null) {
            return l60.e;
        }
        return list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor getElementDescriptor(int index) {
        return getChildSerializers()[index].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(String name) {
        name.getClass();
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getElementName(int index) {
        return this.names[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialKind getKind() {
        return StructureKind.CLASS.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public Set<String> getSerialNames() {
        return this.indices.keySet();
    }

    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (SerialDescriptor[]) this.typeParameterDescriptors.getValue();
    }

    public int hashCode() {
        return get_hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        return this.elementsOptionality[index];
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

    public final void pushAnnotation(Annotation annotation) {
        annotation.getClass();
        List<Annotation> list = this.propertiesAnnotations[this.added];
        if (list == null) {
            list = new ArrayList<>(1);
            this.propertiesAnnotations[this.added] = list;
        }
        list.add(annotation);
    }

    public final void pushClassAnnotation(Annotation a) {
        a.getClass();
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List<Annotation> list = this.classAnnotations;
        list.getClass();
        list.add(a);
    }

    public String toString() {
        return PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i, int i2, yx yxVar) {
        this(str, (i2 & 2) != 0 ? null : generatedSerializer, i);
    }
}
