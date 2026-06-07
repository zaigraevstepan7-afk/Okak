package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface rq0 extends qz {
    default int Q(ty0 ty0Var, e01 e01Var, int i) {
        return b(new yn0(ty0Var, ty0Var.getLayoutDirection()), new my(e01Var, h81.f, i81.f, 2), vs.b(i, 0, 13)).c();
    }

    default int a0(ty0 ty0Var, e01 e01Var, int i) {
        return b(new yn0(ty0Var, ty0Var.getLayoutDirection()), new my(e01Var, h81.e, i81.f, 2), vs.b(i, 0, 13)).c();
    }

    k01 b(l01 l01Var, e01 e01Var, long j);

    default int e(ty0 ty0Var, e01 e01Var, int i) {
        return b(new yn0(ty0Var, ty0Var.getLayoutDirection()), new my(e01Var, h81.f, i81.e, 2), vs.b(0, i, 7)).d();
    }

    default int k0(ty0 ty0Var, e01 e01Var, int i) {
        return b(new yn0(ty0Var, ty0Var.getLayoutDirection()), new my(e01Var, h81.e, i81.e, 2), vs.b(0, i, 7)).d();
    }
}
