package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zq extends eo1 implements se0 {
    public int e;
    public int f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ar j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(ar arVar, vt vtVar) {
        super(2, vtVar);
        this.j = arVar;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        zq zqVar = new zq(this.j, vtVar);
        zqVar.i = obj;
        return zqVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((zq) create((lv1) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        lv1 lv1Var;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        ar arVar = this.j;
        b41 b41Var = arVar.e;
        o31 o31Var = arVar.g;
        int i6 = this.h;
        if (i6 != 0) {
            if (i6 == 1) {
                i = this.g;
                i2 = this.f;
                i3 = this.e;
                lv1Var = (lv1) this.i;
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            lv1Var = (lv1) this.i;
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (i3 < Math.min(arVar.h + 10, o31Var.b)) {
            int i7 = i3 + 1;
            int c = o31Var.c(i3);
            switch (c) {
                case 0:
                    str = "up";
                    break;
                case 1:
                    Object f = b41Var.f(i2);
                    i2++;
                    str = "down " + f;
                    break;
                case 2:
                    str = "remove " + o31Var.c(i7) + ' ' + o31Var.c(i3 + 2);
                    i7 = i3 + 3;
                    break;
                case 3:
                    str = "move " + o31Var.c(i7) + ' ' + o31Var.c(i3 + 2) + ' ' + o31Var.c(i3 + 3);
                    i7 = i3 + 4;
                    break;
                case 4:
                    str = "clear";
                    break;
                case 5:
                    i4 = i3 + 2;
                    int c2 = o31Var.c(i7);
                    i5 = i2 + 1;
                    str2 = "insertBottomUp " + c2 + ' ' + b41Var.f(i2);
                    int i8 = i4;
                    str = str2;
                    i7 = i8;
                    i2 = i5;
                    break;
                case 6:
                    i4 = i3 + 2;
                    int c3 = o31Var.c(i7);
                    i5 = i2 + 1;
                    str2 = "insertTopDown " + c3 + ' ' + b41Var.f(i2);
                    int i82 = i4;
                    str = str2;
                    i7 = i82;
                    i2 = i5;
                    break;
                case 7:
                    Object f2 = b41Var.f(i2);
                    f2.getClass();
                    fc2.t(2, f2);
                    i2 += 2;
                    str = "apply " + ((se0) f2);
                    break;
                case 8:
                    str = "reuse " + arVar.f.f(i);
                    i++;
                    break;
                case 9:
                    str = "recompose pending";
                    break;
                default:
                    str = l90.g(c, "unknown op: ");
                    break;
            }
            this.i = lv1Var;
            this.e = i7;
            this.f = i2;
            this.g = i;
            this.h = 1;
            lv1Var.b(this, i3 + ": " + str);
            return hv.e;
        }
        return od2.a;
    }
}
