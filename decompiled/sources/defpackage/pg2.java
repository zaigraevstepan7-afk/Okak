package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface pg2 {
    default kg2 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default kg2 b(Class cls, k31 k31Var) {
        return a(cls);
    }

    default kg2 c(cn cnVar, k31 k31Var) {
        Class b = cnVar.b();
        b.getClass();
        return b(b, k31Var);
    }
}
