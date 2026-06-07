package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class il1 extends q42 implements te0 {
    public List f;
    public List g;
    public List h;
    public j41 i;
    public j41 j;
    public j41 k;
    public Set l;
    public j41 m;
    public int n;
    public /* synthetic */ ja o;
    public final /* synthetic */ jl1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il1(jl1 jl1Var, vt vtVar) {
        super(3, vtVar);
        this.p = jl1Var;
    }

    public static final void g(jl1 jl1Var, List list, List list2, List list3, j41 j41Var, j41 j41Var2, j41 j41Var3, j41 j41Var4) {
        char c;
        long j;
        long j2;
        synchronized (jl1Var.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    ds dsVar = (ds) list3.get(i);
                    dsVar.a();
                    jl1Var.L(dsVar);
                }
                list3.clear();
                Object[] objArr = j41Var.b;
                long[] jArr = j41Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    ds dsVar2 = (ds) objArr[(i2 << 3) + i4];
                                    dsVar2.a();
                                    jl1Var.L(dsVar2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                j41Var.b();
                Object[] objArr2 = j41Var2.b;
                long[] jArr2 = j41Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((ds) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                j41Var2.b();
                j41Var3.b();
                Object[] objArr3 = j41Var4.b;
                long[] jArr3 = j41Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    ds dsVar3 = (ds) objArr3[(i8 << 3) + i10];
                                    dsVar3.a();
                                    jl1Var.L(dsVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                j41Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void i(List list, jl1 jl1Var) {
        list.clear();
        synchronized (jl1Var.c) {
            try {
                ArrayList arrayList = jl1Var.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((d31) arrayList.get(i));
                }
                jl1Var.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        il1 il1Var = new il1(this.p, (vt) obj3);
        il1Var.o = (ja) obj2;
        il1Var.invokeSuspend(od2.a);
        return hv.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0124 -> B:6:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01d8 -> B:20:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
