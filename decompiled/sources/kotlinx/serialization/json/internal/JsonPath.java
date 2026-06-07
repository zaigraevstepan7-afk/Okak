package kotlinx.serialization.json.internal;

import defpackage.bf;
import defpackage.sn0;
import defpackage.yq1;
import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0003J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath;", "", "<init>", "()V", "it", "", "prettyString", "(Ljava/lang/Object;)Ljava/lang/String;", "Lod2;", "resize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "sd", "pushDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "updateDescriptorIndex", "(I)V", "key", "updateCurrentMapKey", "(Ljava/lang/Object;)V", "resetCurrentMapKey", "popDescriptor", "getPath", "()Ljava/lang/String;", "toString", "", "currentObjectPath", "[Ljava/lang/Object;", "", "indicies", "[I", "currentDepth", "I", "Tombstone", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonPath {
    private int currentDepth;
    private Object[] currentObjectPath = new Object[8];
    private int[] indicies;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath$Tombstone;", "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Tombstone {
        public static final Tombstone INSTANCE = new Tombstone();

        private Tombstone() {
        }
    }

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    private final String prettyString(Object it) {
        SerialDescriptor serialDescriptor;
        String serialName;
        if (it instanceof SerialDescriptor) {
            serialDescriptor = (SerialDescriptor) it;
        } else {
            serialDescriptor = null;
        }
        if (serialDescriptor != null && (serialName = serialDescriptor.getSerialName()) != null) {
            return serialName;
        }
        return String.valueOf(it);
    }

    private final void resize() {
        int i = this.currentDepth * 2;
        this.currentObjectPath = Arrays.copyOf(this.currentObjectPath, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        bf.F(this.indicies, iArr, 0, 0, 14);
        this.indicies = iArr;
    }

    public final String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.currentDepth + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.currentObjectPath[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean r = sn0.r(serialDescriptor.getKind(), StructureKind.LIST.INSTANCE);
                int[] iArr = this.indicies;
                if (r) {
                    if (iArr[i2] != -1) {
                        sb.append("[");
                        sb.append(this.indicies[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.getElementName(i3));
                    }
                }
            } else if (obj != Tombstone.INSTANCE) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final void popDescriptor() {
        int i = this.currentDepth;
        int[] iArr = this.indicies;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.currentDepth = i - 1;
        }
        int i2 = this.currentDepth;
        if (i2 != -1) {
            this.currentDepth = i2 - 1;
        }
    }

    public final void pushDescriptor(SerialDescriptor sd) {
        sd.getClass();
        int i = this.currentDepth + 1;
        this.currentDepth = i;
        if (i == this.currentObjectPath.length) {
            resize();
        }
        this.currentObjectPath[i] = sd;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.indicies;
        int i = this.currentDepth;
        if (iArr[i] == -2) {
            this.currentObjectPath[i] = Tombstone.INSTANCE;
        }
    }

    public String toString() {
        return getPath();
    }

    public final void updateCurrentMapKey(Object key) {
        int[] iArr = this.indicies;
        int i = this.currentDepth;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.currentDepth = i2;
            if (i2 == this.currentObjectPath.length) {
                resize();
            }
        }
        Object[] objArr = this.currentObjectPath;
        int i3 = this.currentDepth;
        objArr[i3] = key;
        this.indicies[i3] = -2;
    }

    public final void updateDescriptorIndex(int index) {
        this.indicies[this.currentDepth] = index;
    }
}
