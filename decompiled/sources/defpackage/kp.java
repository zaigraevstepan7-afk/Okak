package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kp implements vt {
    public static final kp f = new kp(0);
    public static final kp g = new kp(1);
    public final /* synthetic */ int e;

    public /* synthetic */ kp(int i) {
        this.e = i;
    }

    @Override // defpackage.vt
    public final xu getContext() {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return j60.e;
        }
    }

    @Override // defpackage.vt
    public final void resumeWith(Object obj) {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
