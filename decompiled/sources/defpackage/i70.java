package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i70 extends b0 implements h70, RandomAccess, Serializable {
    public final Enum[] e;

    public i70(Enum[] enumArr) {
        enumArr.getClass();
        this.e = enumArr;
    }

    @Override // defpackage.s
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.s, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        if (((Enum) bf.W(this.e, r3.ordinal())) != r3) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.e;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        se.u(l90.j("index: ", i, ", size: ", length));
        return null;
    }

    @Override // defpackage.b0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) bf.W(this.e, ordinal)) != r3) {
            return -1;
        }
        return ordinal;
    }

    @Override // defpackage.b0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) bf.W(this.e, ordinal)) != r3) {
            return -1;
        }
        return ordinal;
    }
}
