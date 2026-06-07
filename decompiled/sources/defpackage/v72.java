package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v72 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ b82 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v72(b82 b82Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = b82Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        b82 b82Var = this.h;
        switch (i) {
            case 0:
                v72 v72Var = new v72(b82Var, vtVar, 0);
                long j = ((z81) obj).a;
                return v72Var;
            case 1:
                return new v72(b82Var, vtVar, 1);
            default:
                return new v72(b82Var, vtVar, 2);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                long j = ((z81) obj).a;
                return new v72(this.h, (vt) obj2, 0).invokeSuspend(od2Var);
            case 1:
                return ((v72) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((v72) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [ux, java.lang.Object] */
    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        rc rcVar;
        nn nnVar;
        Object obj3;
        Object obj4;
        CharSequence text;
        CharSequence charSequence;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        Parcel parcel;
        int i5;
        int i6;
        rc rcVar2;
        int i7 = this.f;
        jg0 jg0Var = jg0.e;
        hv hvVar = hv.e;
        b82 b82Var = this.h;
        od2 od2Var = od2.a;
        switch (i7) {
            case 0:
                int i8 = this.g;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            io.K(obj);
                            return od2Var;
                        }
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    io.K(obj);
                } else {
                    io.K(obj);
                    this.g = 1;
                    if (b82Var.s(this) == hvVar) {
                        return hvVar;
                    }
                }
                xd1 a = b82.a(b82Var);
                if (a != null) {
                    String str = (String) a.e;
                    long j = ((d92) a.f).a;
                    wg1 wg1Var = b82Var.i;
                    if (wg1Var != null) {
                        this.g = 2;
                        if (str.length() == 0 || d92.c(j)) {
                            obj2 = od2Var;
                        } else {
                            obj2 = rx.S(wg1Var.a, new a8(wg1Var, new m(j, null, wg1Var, str), (vt) null, 8), this);
                        }
                        if (obj2 != hvVar) {
                            obj2 = od2Var;
                        }
                        if (obj2 == hvVar) {
                            return hvVar;
                        }
                    }
                }
                return od2Var;
            case 1:
                int i9 = this.g;
                if (i9 != 0) {
                    if (i9 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    if (!d92.c(b82Var.n().b) && b82Var.j()) {
                        rcVar = xq1.m(b82Var.n());
                        rc o = xq1.o(b82Var.n(), b82Var.n().a.f.length());
                        rc n = xq1.n(b82Var.n(), b82Var.n().a.f.length());
                        pc pcVar = new pc(o);
                        pcVar.a(n);
                        rc b = pcVar.b();
                        int f = d92.f(b82Var.n().b);
                        b82Var.c.invoke(b82.e(b, fr1.a(f, f)));
                        b82Var.q(jg0Var);
                        i = 1;
                        b82Var.a.e = true;
                    } else {
                        i = 1;
                        rcVar = null;
                    }
                    if (rcVar != null && (nnVar = b82Var.g) != null) {
                        mn O = mp0.O(rcVar);
                        this.g = i;
                        ((w4) nnVar).a.a.setPrimaryClip(O.a);
                        if (od2Var == hvVar) {
                            return hvVar;
                        }
                    }
                }
                return od2Var;
            default:
                int i10 = this.g;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            io.K(obj);
                            obj4 = obj;
                            rcVar2 = (rc) obj4;
                            if (rcVar2 != null && b82Var.j()) {
                                pc pcVar2 = new pc(xq1.o(b82Var.n(), b82Var.n().a.f.length()));
                                pcVar2.a(rcVar2);
                                rc b2 = pcVar2.b();
                                rc n2 = xq1.n(b82Var.n(), b82Var.n().a.f.length());
                                pc pcVar3 = new pc(b2);
                                pcVar3.a(n2);
                                rc b3 = pcVar3.b();
                                int length = rcVar2.f.length() + d92.f(b82Var.n().b);
                                b82Var.c.invoke(b82.e(b3, fr1.a(length, length)));
                                b82Var.q(jg0Var);
                                b82Var.a.e = true;
                            }
                            return od2Var;
                        }
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    io.K(obj);
                    obj3 = obj;
                } else {
                    io.K(obj);
                    nn nnVar2 = b82Var.g;
                    if (nnVar2 != null) {
                        this.g = 1;
                        ClipData primaryClip = ((w4) nnVar2).a.a.getPrimaryClip();
                        if (primaryClip != null) {
                            obj3 = new mn(primaryClip);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 == hvVar) {
                            return hvVar;
                        }
                    }
                    return od2Var;
                }
                mn mnVar = (mn) obj3;
                if (mnVar != null) {
                    this.g = 2;
                    int i11 = 0;
                    ClipData.Item itemAt = mnVar.a.getItemAt(0);
                    if (itemAt != null && (text = itemAt.getText()) != null) {
                        if (!(text instanceof Spanned)) {
                            obj4 = new rc(text.toString());
                        } else {
                            Spanned spanned = (Spanned) text;
                            Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                            ArrayList arrayList2 = new ArrayList();
                            annotationArr.getClass();
                            int length2 = annotationArr.length - 1;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    Annotation annotation = annotationArr[i12];
                                    if (!sn0.r(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                        charSequence = text;
                                        i2 = i11;
                                    } else {
                                        int spanStart = spanned.getSpanStart(annotation);
                                        int spanEnd = spanned.getSpanEnd(annotation);
                                        String value = annotation.getValue();
                                        ?? obj5 = new Object();
                                        Parcel obtain = Parcel.obtain();
                                        obj5.a = obtain;
                                        byte[] decode = Base64.decode(value, i11);
                                        charSequence = text;
                                        obtain.unmarshall(decode, i11, decode.length);
                                        obtain.setDataPosition(i11);
                                        Parcel parcel2 = obj5.a;
                                        long j2 = co.g;
                                        long j3 = j2;
                                        long j4 = n92.c;
                                        long j5 = j4;
                                        sd0 sd0Var = null;
                                        qd0 qd0Var = null;
                                        rd0 rd0Var = null;
                                        String str2 = null;
                                        jh jhVar = null;
                                        l82 l82Var = null;
                                        x62 x62Var = null;
                                        hw1 hw1Var = null;
                                        while (parcel2.dataAvail() > 1) {
                                            byte readByte = parcel2.readByte();
                                            if (readByte == 1) {
                                                if (parcel2.dataAvail() >= 8) {
                                                    j2 = obj5.a();
                                                } else {
                                                    i2 = i11;
                                                    arrayList2.add(new qc(new m12(j2, j4, sd0Var, qd0Var, rd0Var, (g52) null, str2, j5, jhVar, l82Var, (ix0) null, j3, x62Var, hw1Var, 49152), spanStart, spanEnd));
                                                }
                                            } else {
                                                i2 = i11;
                                                if (readByte == 2) {
                                                    if (parcel2.dataAvail() >= 5) {
                                                        j4 = obj5.b();
                                                        i11 = i2;
                                                    } else {
                                                        arrayList2.add(new qc(new m12(j2, j4, sd0Var, qd0Var, rd0Var, (g52) null, str2, j5, jhVar, l82Var, (ix0) null, j3, x62Var, hw1Var, 49152), spanStart, spanEnd));
                                                    }
                                                } else if (readByte == 3) {
                                                    if (parcel2.dataAvail() >= 4) {
                                                        sd0Var = new sd0(parcel2.readInt());
                                                        i11 = i2;
                                                    } else {
                                                        arrayList2.add(new qc(new m12(j2, j4, sd0Var, qd0Var, rd0Var, (g52) null, str2, j5, jhVar, l82Var, (ix0) null, j3, x62Var, hw1Var, 49152), spanStart, spanEnd));
                                                    }
                                                } else if (readByte == 4) {
                                                    if (parcel2.dataAvail() >= 1) {
                                                        byte readByte2 = parcel2.readByte();
                                                        if (readByte2 == 0 || readByte2 != 1) {
                                                            i6 = i2;
                                                        } else {
                                                            i6 = 1;
                                                        }
                                                        qd0 qd0Var2 = new qd0(i6);
                                                        i11 = i2;
                                                        qd0Var = qd0Var2;
                                                    } else {
                                                        arrayList2.add(new qc(new m12(j2, j4, sd0Var, qd0Var, rd0Var, (g52) null, str2, j5, jhVar, l82Var, (ix0) null, j3, x62Var, hw1Var, 49152), spanStart, spanEnd));
                                                    }
                                                } else if (readByte == 5) {
                                                    if (parcel2.dataAvail() >= 1) {
                                                        byte readByte3 = parcel2.readByte();
                                                        if (readByte3 != 0) {
                                                            if (readByte3 == 1) {
                                                                i5 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                                                            } else if (readByte3 == 3) {
                                                                i5 = 2;
                                                            } else if (readByte3 == 2) {
                                                                i5 = 1;
                                                            }
                                                            rd0 rd0Var2 = new rd0(i5);
                                                            i11 = i2;
                                                            rd0Var = rd0Var2;
                                                        }
                                                        i5 = i2;
                                                        rd0 rd0Var22 = new rd0(i5);
                                                        i11 = i2;
                                                        rd0Var = rd0Var22;
                                                    } else {
                                                        arrayList2.add(new qc(new m12(j2, j4, sd0Var, qd0Var, rd0Var, (g52) null, str2, j5, jhVar, l82Var, (ix0) null, j3, x62Var, hw1Var, 49152), spanStart, spanEnd));
                                                    }
                                                } else {
                                                    if (readByte == 6) {
                                                        str2 = parcel2.readString();
                                                    } else if (readByte == 7) {
                                                        if (parcel2.dataAvail() >= 5) {
                                                            j5 = obj5.b();
                                                        } else {
                                                            arrayList2.add(new qc(new m12(j2, j4, sd0Var, qd0Var, rd0Var, (g52) null, str2, j5, jhVar, l82Var, (ix0) null, j3, x62Var, hw1Var, 49152), spanStart, spanEnd));
                                                        }
                                                    } else if (readByte == 8) {
                                                        if (parcel2.dataAvail() >= 4) {
                                                            i11 = i2;
                                                            jhVar = new jh(parcel2.readFloat());
                                                        } else {
                                                            arrayList2.add(new qc(new m12(j2, j4, sd0Var, qd0Var, rd0Var, (g52) null, str2, j5, jhVar, l82Var, (ix0) null, j3, x62Var, hw1Var, 49152), spanStart, spanEnd));
                                                        }
                                                    } else if (readByte == 9) {
                                                        if (parcel2.dataAvail() >= 8) {
                                                            l82Var = new l82(parcel2.readFloat(), parcel2.readFloat());
                                                        } else {
                                                            arrayList2.add(new qc(new m12(j2, j4, sd0Var, qd0Var, rd0Var, (g52) null, str2, j5, jhVar, l82Var, (ix0) null, j3, x62Var, hw1Var, 49152), spanStart, spanEnd));
                                                        }
                                                    } else {
                                                        if (readByte == 10) {
                                                            if (parcel2.dataAvail() >= 8) {
                                                                j3 = obj5.a();
                                                            }
                                                        } else if (readByte == 11) {
                                                            if (parcel2.dataAvail() >= 4) {
                                                                int readInt = parcel2.readInt();
                                                                if ((readInt & 2) != 0) {
                                                                    i3 = 1;
                                                                } else {
                                                                    i3 = i2;
                                                                }
                                                                if ((readInt & 1) != 0) {
                                                                    i4 = 1;
                                                                } else {
                                                                    i4 = i2;
                                                                }
                                                                x62 x62Var2 = x62.d;
                                                                parcel = parcel2;
                                                                x62 x62Var3 = x62.c;
                                                                if (i3 != 0 && i4 != 0) {
                                                                    List F = xn.F(x62Var2, x62Var3);
                                                                    Integer valueOf = Integer.valueOf(i2);
                                                                    int size = F.size();
                                                                    int i13 = i2;
                                                                    while (i13 < size) {
                                                                        valueOf = Integer.valueOf(((x62) F.get(i13)).a | valueOf.intValue());
                                                                        i13++;
                                                                        F = F;
                                                                    }
                                                                    x62Var = new x62(valueOf.intValue());
                                                                } else if (i3 != 0) {
                                                                    x62Var = x62Var2;
                                                                } else {
                                                                    if (i4 == 0) {
                                                                        x62Var3 = x62.b;
                                                                    }
                                                                    x62Var = x62Var3;
                                                                }
                                                                i11 = i2;
                                                                parcel2 = parcel;
                                                            }
                                                        } else {
                                                            parcel = parcel2;
                                                            if (readByte != 12) {
                                                                i11 = i2;
                                                                parcel2 = parcel;
                                                            } else if (parcel.dataAvail() >= 20) {
                                                                i11 = i2;
                                                                parcel2 = parcel;
                                                                hw1Var = new hw1(parcel.readFloat(), obj5.a(), (Float.floatToRawIntBits(parcel.readFloat()) << 32) | (Float.floatToRawIntBits(parcel.readFloat()) & 4294967295L));
                                                            }
                                                        }
                                                        arrayList2.add(new qc(new m12(j2, j4, sd0Var, qd0Var, rd0Var, (g52) null, str2, j5, jhVar, l82Var, (ix0) null, j3, x62Var, hw1Var, 49152), spanStart, spanEnd));
                                                    }
                                                    i11 = i2;
                                                }
                                            }
                                        }
                                        i2 = i11;
                                        arrayList2.add(new qc(new m12(j2, j4, sd0Var, qd0Var, rd0Var, (g52) null, str2, j5, jhVar, l82Var, (ix0) null, j3, x62Var, hw1Var, 49152), spanStart, spanEnd));
                                    }
                                    if (i12 != length2) {
                                        i12++;
                                        text = charSequence;
                                        i11 = i2;
                                    }
                                }
                            } else {
                                charSequence = text;
                            }
                            String obj6 = charSequence.toString();
                            rc rcVar3 = sc.a;
                            if (arrayList2.isEmpty()) {
                                arrayList = null;
                            } else {
                                arrayList = arrayList2;
                            }
                            obj4 = new rc(arrayList, obj6);
                        }
                    } else {
                        obj4 = null;
                    }
                    if (obj4 == hvVar) {
                        return hvVar;
                    }
                    rcVar2 = (rc) obj4;
                    if (rcVar2 != null) {
                        pc pcVar22 = new pc(xq1.o(b82Var.n(), b82Var.n().a.f.length()));
                        pcVar22.a(rcVar2);
                        rc b22 = pcVar22.b();
                        rc n22 = xq1.n(b82Var.n(), b82Var.n().a.f.length());
                        pc pcVar32 = new pc(b22);
                        pcVar32.a(n22);
                        rc b32 = pcVar32.b();
                        int length3 = rcVar2.f.length() + d92.f(b82Var.n().b);
                        b82Var.c.invoke(b82.e(b32, fr1.a(length3, length3)));
                        b82Var.q(jg0Var);
                        b82Var.a.e = true;
                    }
                }
                return od2Var;
        }
    }
}
