package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tk0 extends q42 implements se0 {
    public /* synthetic */ float f;

    /* JADX WARN: Type inference failed for: r1v1, types: [tk0, q42, vt] */
    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        ?? q42Var = new q42(2, vtVar);
        q42Var.f = ((Number) obj).floatValue();
        return q42Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((tk0) create(Float.valueOf(((Number) obj).floatValue()), (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        boolean z;
        io.K(obj);
        if (this.f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
