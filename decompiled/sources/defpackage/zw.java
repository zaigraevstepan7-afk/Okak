package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zw extends q42 implements se0 {
    public final /* synthetic */ int f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw(int i, vt vtVar, int i2) {
        super(i, vtVar);
        this.f = i2;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                zw zwVar = new zw(2, vtVar, 0);
                zwVar.g = obj;
                return zwVar;
            case 1:
                zw zwVar2 = new zw(2, vtVar, 1);
                zwVar2.g = obj;
                return zwVar2;
            default:
                zw zwVar3 = new zw(2, vtVar, 2);
                zwVar3.g = obj;
                return zwVar3;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((zw) create((n22) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((zw) create((gl1) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((zw) create((uw1) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.f) {
            case 0:
                io.K(obj);
                return Boolean.valueOf(!(((n22) this.g) instanceof s90));
            case 1:
                io.K(obj);
                if (((gl1) this.g) == gl1.e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                io.K(obj);
                if (((uw1) this.g) != uw1.e) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
