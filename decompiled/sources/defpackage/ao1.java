package defpackage;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ao1 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ co1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao1(co1 co1Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.g = co1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        co1 co1Var = this.g;
        switch (i) {
            case 0:
                return new ao1(co1Var, vtVar, 0);
            case 1:
                return new ao1(co1Var, vtVar, 1);
            default:
                return new ao1(co1Var, vtVar, 2);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        gv gvVar = (gv) obj;
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                return ((ao1) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((ao1) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((ao1) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        zm1 zm1Var;
        zm1 zm1Var2;
        zm1 zm1Var3;
        int i = this.f;
        l60 l60Var = l60.e;
        int i2 = 0;
        co1 co1Var = this.g;
        switch (i) {
            case 0:
                io.K(obj);
                File[] listFiles = co1Var.B.listFiles();
                if (listFiles != null) {
                    ArrayList arrayList = new ArrayList();
                    int length = listFiles.length;
                    while (i2 < length) {
                        File file = listFiles[i2];
                        if (file.isFile()) {
                            String name = file.getName();
                            name.getClass();
                            String absolutePath = file.getAbsolutePath();
                            absolutePath.getClass();
                            zm1Var = new zm1(name, an1.g, absolutePath, file.length());
                        } else {
                            zm1Var = null;
                        }
                        if (zm1Var != null) {
                            arrayList.add(zm1Var);
                        }
                        i2++;
                    }
                    return wn.x0(arrayList, new uc0(8));
                }
                return l60Var;
            case 1:
                io.K(obj);
                File[] listFiles2 = co1Var.A.listFiles();
                if (listFiles2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = listFiles2.length;
                    while (i2 < length2) {
                        File file2 = listFiles2[i2];
                        if (file2.isFile()) {
                            String name2 = file2.getName();
                            name2.getClass();
                            String absolutePath2 = file2.getAbsolutePath();
                            absolutePath2.getClass();
                            zm1Var2 = new zm1(name2, an1.f, absolutePath2, file2.length());
                        } else {
                            zm1Var2 = null;
                        }
                        if (zm1Var2 != null) {
                            arrayList2.add(zm1Var2);
                        }
                        i2++;
                    }
                    return wn.x0(arrayList2, new uc0(9));
                }
                return l60Var;
            default:
                io.K(obj);
                File[] listFiles3 = co1Var.z.listFiles();
                if (listFiles3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    int length3 = listFiles3.length;
                    while (i2 < length3) {
                        File file3 = listFiles3[i2];
                        if (file3.isFile()) {
                            String name3 = file3.getName();
                            name3.getClass();
                            String absolutePath3 = file3.getAbsolutePath();
                            absolutePath3.getClass();
                            zm1Var3 = new zm1(name3, an1.e, absolutePath3, file3.length());
                        } else {
                            zm1Var3 = null;
                        }
                        if (zm1Var3 != null) {
                            arrayList3.add(zm1Var3);
                        }
                        i2++;
                    }
                    return wn.x0(arrayList3, new uc0(10));
                }
                return l60Var;
        }
    }
}
