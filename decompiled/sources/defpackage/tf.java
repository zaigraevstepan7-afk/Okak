package defpackage;

import com.elixir.loader.data.api.auth.LoginResponse;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tf implements uf {
    public final LoginResponse a;

    public tf(LoginResponse loginResponse) {
        loginResponse.getClass();
        this.a = loginResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tf) && sn0.r(this.a, ((tf) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.a + ")";
    }
}
