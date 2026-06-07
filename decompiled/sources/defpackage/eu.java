package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class eu implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ eu(my1 my1Var, boolean z) {
        this.e = 3;
        this.g = my1Var;
        this.f = z;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ij0 ij0Var;
        String str;
        String str2;
        int i = this.e;
        od2 od2Var = od2.a;
        boolean z2 = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vn.j((b82) obj3, z2, (ur) obj, lo.b0(1));
                return od2Var;
            case 1:
                ((Integer) obj2).getClass();
                lo.d(z2, (se0) obj3, (ur) obj, lo.b0(1));
                return od2Var;
            case 2:
                h32 h32Var = (h32) obj3;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    if (z2) {
                        ij0Var = vn.c;
                        if (ij0Var == null) {
                            hj0 hj0Var = new hj0("Rounded.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i2 = me2.a;
                            i12 i12Var = new i12(co.b);
                            rg2 rg2Var = new rg2(21);
                            rg2Var.s(8.0f, 19.0f);
                            rg2Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            rg2Var.q(10.0f, 7.0f);
                            rg2Var.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            rg2Var.w(-2.0f, 0.9f, -2.0f, 2.0f);
                            rg2Var.E(10.0f);
                            rg2Var.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            rg2Var.f();
                            rg2Var.s(14.0f, 7.0f);
                            rg2Var.E(10.0f);
                            rg2Var.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            rg2Var.w(2.0f, -0.9f, 2.0f, -2.0f);
                            rg2Var.q(18.0f, 7.0f);
                            rg2Var.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            rg2Var.w(-2.0f, 0.9f, -2.0f, 2.0f);
                            rg2Var.f();
                            hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                            ij0Var = hj0Var.b();
                            vn.c = ij0Var;
                        }
                    } else {
                        ij0 ij0Var2 = go.d;
                        if (ij0Var2 != null) {
                            ij0Var = ij0Var2;
                        } else {
                            hj0 hj0Var2 = new hj0("Rounded.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i3 = me2.a;
                            i12 i12Var2 = new i12(co.b);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new ve1(8.0f, 6.82f));
                            arrayList.add(new hf1(10.36f));
                            arrayList.add(new af1(0.0f, 0.79f, 0.87f, 1.27f, 1.54f, 0.84f));
                            arrayList.add(new cf1(8.14f, -5.18f));
                            arrayList.add(new af1(0.62f, -0.39f, 0.62f, -1.29f, 0.0f, -1.69f));
                            arrayList.add(new ue1(9.54f, 5.98f));
                            arrayList.add(new se1(8.87f, 5.55f, 8.0f, 6.03f, 8.0f, 6.82f));
                            arrayList.add(re1.c);
                            hj0.a(hj0Var2, arrayList, i12Var2);
                            ij0 b = hj0Var2.b();
                            go.d = b;
                            ij0Var = b;
                        }
                    }
                    ij0 ij0Var3 = ij0Var;
                    int i4 = h32Var.a;
                    if (z2) {
                        str2 = "Пауза";
                        switch (i4) {
                            case 0:
                                str2 = "Pause";
                                break;
                            case 1:
                                str2 = "Pausar";
                                break;
                            case 2:
                            case 3:
                                break;
                            default:
                                str2 = "暂停";
                                break;
                        }
                    } else {
                        switch (i4) {
                            case 0:
                                str = "Play";
                                break;
                            case 1:
                                str = "Reproduzir";
                                break;
                            case 2:
                                str = "Воспроизвести";
                                break;
                            case 3:
                                str = "Відтворити";
                                break;
                            default:
                                str = "播放";
                                break;
                        }
                        str2 = str;
                    }
                    ej0.a(ij0Var3, str2, hy1.f(b21.a, 22.0f), 0L, urVar, 384, 8);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 3:
                c40 c40Var = (c40) obj;
                ry1 ry1Var = ry1.a;
                c40.q0(c40Var, ((my1) obj3).a(z2, true), c40Var.W(ry1.b) / 2.0f, ((z81) obj2).a, 120);
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                d6.p((vf2) obj3, z2, (ur) obj, lo.b0(1));
                return od2Var;
        }
    }

    public /* synthetic */ eu(Object obj, boolean z, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = z;
    }

    public /* synthetic */ eu(boolean z, se0 se0Var, int i) {
        this.e = 1;
        this.f = z;
        this.g = se0Var;
    }

    public /* synthetic */ eu(boolean z, h32 h32Var) {
        this.e = 2;
        this.f = z;
        this.g = h32Var;
    }
}
