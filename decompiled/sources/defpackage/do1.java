package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class do1 extends eh {
    public do1(vt vtVar) {
        super(vtVar);
        if (vtVar != null && vtVar.getContext() != j60.e) {
            se.h("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // defpackage.vt
    public xu getContext() {
        return j60.e;
    }
}
