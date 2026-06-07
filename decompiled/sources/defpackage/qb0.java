package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qb0 extends q42 implements se0 {
    public /* synthetic */ int f;

    /* JADX WARN: Type inference failed for: r1v1, types: [q42, qb0, vt] */
    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        ?? q42Var = new q42(2, vtVar);
        q42Var.f = ((Number) obj).intValue();
        return q42Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((qb0) create(Integer.valueOf(((Number) obj).intValue()), (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        boolean z;
        io.K(obj);
        if (this.f > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
