package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t50 implements Runnable {
    public final ArrayList e;
    public final int f;

    public t50(List list, int i, Throwable th) {
        go.m(list, "initCallbacks cannot be null");
        this.e = new ArrayList(list);
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        if (this.f != 1) {
            while (i < size) {
                ((ly) arrayList.get(i)).b.f = sn0.s;
                i++;
            }
            return;
        }
        while (i < size) {
            ly lyVar = (ly) arrayList.get(i);
            lyVar.a.setValue(Boolean.TRUE);
            lyVar.b.f = new oj0(true);
            i++;
        }
    }
}
