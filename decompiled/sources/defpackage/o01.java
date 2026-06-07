package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o01 extends b0 {
    public final ua e;
    public final ArrayList f;
    public final List g;

    public o01(ua uaVar, vv0 vv0Var, ArrayList arrayList, m31 m31Var) {
        if (m31Var.b == arrayList.size() + 1) {
            int i = m31Var.b;
            if (i != 0) {
                float[] fArr = m31Var.a;
                int i2 = 0;
                float f = 0.0f;
                if (fArr[0] == 0.0f) {
                    if (i != 0) {
                        if (fArr[i - 1] == 1.0f) {
                            this.e = uaVar;
                            this.g = vv0Var;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            while (i2 < size) {
                                int i3 = i2 + 1;
                                if (m31Var.b(i3) - m31Var.b(i2) > 1.0E-4f) {
                                    arrayList2.add(new n01(this, (uv) arrayList.get(i2), f, m31Var.b(i3)));
                                    f = m31Var.b(i3);
                                }
                                i2 = i3;
                            }
                            n01 n01Var = (n01) arrayList2.get(arrayList2.size() - 1);
                            float f2 = n01Var.c;
                            if (1.0f >= f2) {
                                n01Var.c = f2;
                                n01Var.d = 1.0f;
                                this.f = arrayList2;
                                return;
                            }
                            se.h("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
                            throw null;
                        }
                        se.h("Last outline progress value is expected to be one");
                        throw null;
                    }
                    y61.j("FloatList is empty.");
                    throw null;
                }
                se.h("First outline progress value is expected to be zero");
                throw null;
            }
            y61.j("FloatList is empty.");
            throw null;
        }
        se.h("Outline progress size is expected to be the cubics size + 1");
        throw null;
    }

    @Override // defpackage.s
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.s, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof n01)) {
            return false;
        }
        return super.contains((n01) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return (n01) this.f.get(i);
    }

    @Override // defpackage.b0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof n01)) {
            return -1;
        }
        return super.indexOf((n01) obj);
    }

    @Override // defpackage.b0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof n01)) {
            return -1;
        }
        return super.lastIndexOf((n01) obj);
    }
}
