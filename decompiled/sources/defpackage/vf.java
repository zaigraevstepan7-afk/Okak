package defpackage;

import com.elixir.loader.ElixirApplication;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vf extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(st0 st0Var, int i, vt vtVar) {
        super(2, vtVar);
        this.f = 6;
        this.h = st0Var;
        this.g = i;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = 2;
        switch (this.f) {
            case 0:
                return new vf((ag) this.h, vtVar, 0);
            case 1:
                return new vf((zx) this.h, vtVar, 1);
            case 2:
                return new vf((ElixirApplication) this.h, vtVar, i);
            case 3:
                return new vf((yc0) this.h, vtVar, 3);
            case 4:
                return new vf((el0) this.h, vtVar, 4);
            case 5:
                return new vf((sl0) this.h, vtVar, 5);
            case 6:
                return new vf((st0) this.h, this.g, vtVar);
            case 7:
                return new vf((dz0) this.h, vtVar, 7);
            case 8:
                return new vf((j11) this.h, vtVar, 8);
            case 9:
                vf vfVar = new vf(i, vtVar);
                vfVar.h = obj;
                return vfVar;
            case 10:
                return new vf((n00) this.h, vtVar, 10);
            case 11:
                return new vf((co1) this.h, vtVar, 11);
            case 12:
                return new vf((lt1) this.h, vtVar, 12);
            case 13:
                return new vf((w42) this.h, vtVar, 13);
            case 14:
                return new vf((yv) this.h, vtVar, 14);
            case 15:
                return new vf((oe0) this.h, vtVar, 15);
            case 16:
                return new vf((ba2) this.h, vtVar, 16);
            case 17:
                return new vf((dx) this.h, vtVar, 17);
            default:
                return new vf((vf2) this.h, vtVar, 18);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 3:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 4:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 5:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 6:
                ((vf) create((ds1) obj, (vt) obj2)).invokeSuspend(od2Var);
                return od2Var;
            case 7:
                ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
                return hv.e;
            case 8:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 9:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 10:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 11:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 12:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 13:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 14:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 15:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 16:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 17:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((vf) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0260  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x023f -> B:126:0x0230). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0259 -> B:124:0x025c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0146 -> B:73:0x014a). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf(int i, vt vtVar) {
        super(i, vtVar);
        this.f = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf(Object obj, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = obj;
    }
}
