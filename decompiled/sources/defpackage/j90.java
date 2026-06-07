package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j90 {
    public final boolean a;
    public final boolean b;
    public final oe1 c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map h;

    public j90(boolean z, boolean z2, oe1 oe1Var, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.a = z;
        this.b = z2;
        this.c = oe1Var;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = tz0.f0(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return wn.m0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ j90(boolean z, boolean z2, oe1 oe1Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, oe1Var, l, l2, l3, l4, m60.e);
    }
}
