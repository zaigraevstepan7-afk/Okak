package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ug0 extends yd0 {
    public final MessageDigest e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug0(mi miVar) {
        super(miVar);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        this.e = messageDigest;
    }

    @Override // defpackage.yd0, defpackage.ey1
    public final void write(hk hkVar, long j) {
        hkVar.getClass();
        rx.q(hkVar.f, 0L, j);
        mt1 mt1Var = hkVar.e;
        mt1Var.getClass();
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, mt1Var.c - mt1Var.b);
            MessageDigest messageDigest = this.e;
            messageDigest.getClass();
            messageDigest.update(mt1Var.a, mt1Var.b, min);
            j2 += min;
            mt1Var = mt1Var.f;
            mt1Var.getClass();
        }
        super.write(hkVar, j);
    }
}
