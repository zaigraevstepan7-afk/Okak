package kotlinx.serialization.internal;

import defpackage.cn;
import defpackage.to0;
import defpackage.yq1;
import kotlin.Metadata;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"", "subClassName", "Lto0;", "baseClass", "", "throwSubtypeNotRegistered", "(Ljava/lang/String;Lto0;)Ljava/lang/Void;", "subClass", "(Lto0;Lto0;)Ljava/lang/Void;", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class AbstractPolymorphicSerializerKt {
    public static final Void throwSubtypeNotRegistered(String str, to0 to0Var) {
        String str2;
        to0Var.getClass();
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        cn cnVar = (cn) to0Var;
        sb.append(cnVar.d());
        sb.append('\'');
        String sb2 = sb.toString();
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + sb2 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + sb2 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + cnVar.d() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    public static final Void throwSubtypeNotRegistered(to0 to0Var, to0 to0Var2) {
        to0Var.getClass();
        to0Var2.getClass();
        String d = ((cn) to0Var).d();
        if (d == null) {
            d = String.valueOf(to0Var);
        }
        throwSubtypeNotRegistered(d, to0Var2);
        throw new RuntimeException();
    }
}
