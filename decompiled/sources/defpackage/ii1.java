package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ii1 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ii1(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        SerialDescriptor descriptor_delegate$lambda$3;
        ds dsVar;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        int i;
        long j;
        x82 d;
        gu0 gu0Var;
        rc rcVar;
        int i2 = this.e;
        vt vtVar = null;
        int i3 = 2;
        int i4 = 0;
        od2 od2Var = od2.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                ((cr) obj2).d = (se0) obj;
                return od2Var;
            case 1:
                j41 j41Var = (j41) obj2;
                ds dsVar2 = (ds) obj;
                Object[] objArr = j41Var.b;
                long[] jArr = j41Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j2 = jArr[i5];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j2) < 128) {
                                    dsVar2.A(objArr[(i5 << 3) + i7]);
                                }
                                j2 >>= 8;
                            }
                            if (i6 != 8) {
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        }
                    }
                }
                return od2Var;
            case 2:
                descriptor_delegate$lambda$3 = SealedClassSerializer.descriptor_delegate$lambda$3((String) obj2, (SealedClassSerializer) obj);
                return descriptor_delegate$lambda$3;
            case 3:
                pz1 pz1Var = (pz1) obj2;
                y80 y80Var = (y80) obj;
                if (!sn0.r(pz1Var, y80Var.a)) {
                    wn.s0(y80Var.b, new hh1(pz1Var, 12));
                    dl1 dl1Var = y80Var.c;
                    if (dl1Var != null && (dsVar = dl1Var.a) != null) {
                        dsVar.s(dl1Var, null);
                    }
                }
                return od2Var;
            case 4:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                if (text != null) {
                    i4 = text.hashCode();
                }
                PendingIntent activity = PendingIntent.getActivity(context, i4, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                    }
                } else {
                    activity.send();
                }
                return od2Var;
            case 5:
                rx.C((gv) obj2, null, new vf((oe0) obj, vtVar, 15), 1);
                return od2Var;
            case 6:
                b82 b82Var = (b82) obj2;
                long j3 = ((en0) ((o41) obj).getValue()).a;
                z81 i8 = b82Var.i();
                long j4 = 9205357640488583168L;
                if (i8 != null) {
                    long j5 = i8.a;
                    rc m = b82Var.m();
                    if (m != null && m.f.length() != 0) {
                        hg0 hg0Var = (hg0) b82Var.q.getValue();
                        if (hg0Var == null) {
                            i = -1;
                        } else {
                            i = d82.a[hg0Var.ordinal()];
                        }
                        if (i != -1) {
                            if (i != 1 && i != 2) {
                                if (i == 3) {
                                    long j6 = b82Var.n().b;
                                    int i9 = d92.c;
                                    j = j6 & 4294967295L;
                                } else {
                                    se.m();
                                    return null;
                                }
                            } else {
                                long j7 = b82Var.n().b;
                                int i10 = d92.c;
                                j = j7 >> 32;
                            }
                            int i11 = (int) j;
                            gu0 gu0Var2 = b82Var.d;
                            if (gu0Var2 != null && (d = gu0Var2.d()) != null && (gu0Var = b82Var.d) != null && (rcVar = gu0Var.a.a) != null) {
                                int p = go.p(b82Var.b.d(i11), 0, rcVar.f.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j5) >> 32));
                                w82 w82Var = d.a;
                                g31 g31Var = w82Var.b;
                                int d2 = g31Var.d(p);
                                float d3 = w82Var.d(d2);
                                float e2 = w82Var.e(d2);
                                float o = go.o(intBitsToFloat, Math.min(d3, e2), Math.max(d3, e2));
                                if (en0.a(j3, 0L) || Math.abs(intBitsToFloat - o) <= ((int) (j3 >> 32)) / 2) {
                                    float f = g31Var.f(d2);
                                    j4 = (Float.floatToRawIntBits(o) << 32) | (Float.floatToRawIntBits(((g31Var.b(d2) - f) / 2.0f) + f) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new z81(j4);
            case 7:
                o41 o41Var = (o41) obj2;
                o41 o41Var2 = (o41) obj;
                if (o41Var.getValue() != null && o41Var2.getValue() != null) {
                    Object value = o41Var.getValue();
                    value.getClass();
                    long u = ((iq0) value).u(0L);
                    Object value2 = o41Var2.getValue();
                    value2.getClass();
                    long j8 = ((z81) value2).a;
                    if (Float.intBitsToFloat((int) (j8 >> 32)) <= Float.intBitsToFloat((int) (u >> 32))) {
                        if (Float.intBitsToFloat((int) (j8 & 4294967295L)) < Float.intBitsToFloat((int) (u & 4294967295L))) {
                            i3 = 1;
                        } else {
                            i3 = 3;
                        }
                    } else if (Float.intBitsToFloat((int) (j8 & 4294967295L)) >= Float.intBitsToFloat((int) (u & 4294967295L))) {
                        i3 = 4;
                    }
                } else {
                    i3 = 0;
                }
                return Integer.valueOf(i3);
            default:
                ((mh2) ((ov1) obj2).f).b((sh2) obj);
                return od2Var;
        }
    }
}
