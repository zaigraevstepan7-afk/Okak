package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class l70 extends zu {
    public static final /* synthetic */ int j = 0;
    public long g;
    public boolean h;
    public te i;

    public final void S(boolean z) {
        long j2;
        long j3 = this.g;
        if (z) {
            j2 = 4294967296L;
        } else {
            j2 = 1;
        }
        long j4 = j3 - j2;
        this.g = j4;
        if (j4 <= 0 && this.h) {
            shutdown();
        }
    }

    public final void T(i10 i10Var) {
        te teVar = this.i;
        if (teVar == null) {
            teVar = new te();
            this.i = teVar;
        }
        teVar.addLast(i10Var);
    }

    public final void U(boolean z) {
        long j2;
        long j3 = this.g;
        if (z) {
            j2 = 4294967296L;
        } else {
            j2 = 1;
        }
        this.g = j2 + j3;
        if (!z) {
            this.h = true;
        }
    }

    public abstract long V();

    public final boolean W() {
        Object removeFirst;
        te teVar = this.i;
        if (teVar != null) {
            if (teVar.isEmpty()) {
                removeFirst = null;
            } else {
                removeFirst = teVar.removeFirst();
            }
            i10 i10Var = (i10) removeFirst;
            if (i10Var == null) {
                return false;
            }
            i10Var.run();
            return true;
        }
        return false;
    }

    public abstract void shutdown();
}
