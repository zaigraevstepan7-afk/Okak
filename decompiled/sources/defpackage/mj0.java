package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mj0 {
    public final int a;

    public static String a(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        if (i == 7) {
            return "Done";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mj0) {
            if (this.a != ((mj0) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
