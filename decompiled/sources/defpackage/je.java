package defpackage;

import java.util.concurrent.Executors;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class je extends xp1 {
    public static volatile je c;
    public final Object b;

    public je(int i) {
        switch (i) {
            case 1:
                this.b = new Object();
                Executors.newFixedThreadPool(4, new fz());
                return;
            default:
                this.b = new je(1);
                return;
        }
    }
}
