package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                urVar.A--;
                return;
            default:
                b12 b12Var = (b12) obj;
                b12Var.k--;
                return;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ur) obj).A++;
                return;
            default:
                ((b12) obj).k++;
                return;
        }
    }
}
