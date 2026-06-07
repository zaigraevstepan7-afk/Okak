package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface qe2 {
    boolean a();

    long b(mc mcVar, mc mcVar2, mc mcVar3);

    mc h(long j, mc mcVar, mc mcVar2, mc mcVar3);

    mc p(long j, mc mcVar, mc mcVar2, mc mcVar3);

    default mc q(mc mcVar, mc mcVar2, mc mcVar3) {
        return h(b(mcVar, mcVar2, mcVar3), mcVar, mcVar2, mcVar3);
    }
}
