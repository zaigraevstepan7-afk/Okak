package defpackage;

import java.util.Comparator;
import org.jsoup.nodes.Entities;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class d9 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ d9(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        switch (this.a) {
            case 0:
                return sn0.B(((wi1) obj2).a, ((wi1) obj).a);
            case 1:
                return sn0.B(((ao0) obj).b, ((ao0) obj2).b);
            case 2:
                lambda$static$0 = Entities.EscapeMode.lambda$static$0((String) obj, (String) obj2);
                return lambda$static$0;
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 4:
                xd1 xd1Var = (xd1) obj;
                xd1 xd1Var2 = (xd1) obj2;
                return (((Number) xd1Var.f).intValue() - ((Number) xd1Var.e).intValue()) - (((Number) xd1Var2.f).intValue() - ((Number) xd1Var2.e).intValue());
            case 5:
                ar0 ar0Var = (ar0) obj;
                ar0 ar0Var2 = (ar0) obj2;
                float f = ar0Var.K.p.I;
                float f2 = ar0Var2.K.p.I;
                if (f == f2) {
                    return sn0.B(ar0Var.w(), ar0Var2.w());
                }
                return Float.compare(f, f2);
            default:
                return sn0.B(((nt0) obj).a, ((nt0) obj2).a);
        }
    }
}
