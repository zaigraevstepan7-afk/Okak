package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ez1 extends eo1 implements se0 {
    public Object e;
    public Iterator f;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Iterator k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez1(Iterator it, vt vtVar) {
        super(2, vtVar);
        this.k = it;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        ez1 ez1Var = new ez1(this.k, vtVar);
        ez1Var.j = obj;
        return ez1Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((ez1) create((lv1) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        Iterator it;
        int i4;
        int i5;
        int i6;
        so1 so1Var;
        Object[] array;
        lv1 lv1Var = (lv1) this.j;
        int i7 = this.i;
        boolean z = true;
        hv hvVar = hv.e;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 == 5) {
                            } else {
                                se.p("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            i5 = this.h;
                            i6 = this.g;
                            so1Var = (so1) this.e;
                            io.K(obj);
                            so1Var.b();
                        }
                    } else {
                        i5 = this.h;
                        int i8 = this.g;
                        Iterator it2 = this.f;
                        so1 so1Var2 = (so1) this.e;
                        io.K(obj);
                        so1Var2.b();
                        while (true) {
                            int i9 = so1Var2.f;
                            Object[] objArr = so1Var2.e;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                boolean z2 = z;
                                if (so1Var2.a() != i9) {
                                    int i10 = so1Var2.g;
                                    int i11 = so1Var2.h;
                                    objArr[(i10 + i11) % i9] = next;
                                    so1Var2.h = i11 + 1;
                                    if (so1Var2.a() == i9) {
                                        if (so1Var2.h < 2) {
                                            int i12 = i9 + (i9 >> 1) + 1;
                                            if (i12 > 2) {
                                                i12 = 2;
                                            }
                                            if (so1Var2.g == 0) {
                                                array = Arrays.copyOf(objArr, i12);
                                            } else {
                                                array = so1Var2.toArray(new Object[i12]);
                                            }
                                            so1Var2 = new so1(array, so1Var2.h);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(so1Var2);
                                            this.j = lv1Var;
                                            this.e = so1Var2;
                                            this.f = it2;
                                            this.g = i8;
                                            this.h = i5;
                                            this.i = 3;
                                            lv1Var.b(this, arrayList2);
                                            return hvVar;
                                        }
                                    }
                                    z = z2;
                                } else {
                                    se.p("ring buffer is full");
                                    return null;
                                }
                            } else {
                                i6 = i8;
                                so1Var = so1Var2;
                                break;
                            }
                        }
                    }
                    if (so1Var.h > 2) {
                        ArrayList arrayList3 = new ArrayList(so1Var);
                        this.j = lv1Var;
                        this.e = so1Var;
                        this.f = null;
                        this.g = i6;
                        this.h = i5;
                        this.i = 4;
                        lv1Var.b(this, arrayList3);
                        return hvVar;
                    }
                    if (!so1Var.isEmpty()) {
                        this.j = null;
                        this.e = null;
                        this.f = null;
                        this.g = i6;
                        this.h = i5;
                        this.i = 5;
                        lv1Var.b(this, so1Var);
                        return hvVar;
                    }
                    return od2.a;
                }
                io.K(obj);
                return od2.a;
            }
            i = 1;
            i2 = this.h;
            int i13 = this.g;
            Iterator it3 = this.f;
            io.K(obj);
            arrayList = new ArrayList(2);
            it = it3;
            i4 = i13;
            i3 = i2;
        } else {
            i = 1;
            io.K(obj);
            i2 = 0;
            i3 = 0;
            arrayList = new ArrayList(2);
            it = this.k;
            i4 = 2;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i2 > 0) {
                i2--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 2) {
                    this.j = lv1Var;
                    this.e = arrayList;
                    this.f = it;
                    this.g = i4;
                    this.h = i3;
                    this.i = i;
                    lv1Var.b(this, arrayList);
                    return hvVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.j = null;
            this.e = null;
            this.f = null;
            this.g = i4;
            this.h = i3;
            this.i = 2;
            lv1Var.b(this, arrayList);
            return hvVar;
        }
        return od2.a;
    }
}
