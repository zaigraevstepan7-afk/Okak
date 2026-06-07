package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class am1 implements Serializable {
    public final Pattern e;

    public am1(String str, int i) {
        str.getClass();
        Pattern compile = Pattern.compile(str, 66);
        compile.getClass();
        this.e = compile;
    }

    public static q4 a(am1 am1Var, String str) {
        am1Var.getClass();
        str.getClass();
        Matcher matcher = am1Var.e.matcher(str);
        matcher.getClass();
        return xn.n(matcher, 0, str);
    }

    public final q4 b(int i, String str) {
        str.getClass();
        Matcher region = this.e.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new q4(region, str);
        }
        return null;
    }

    public final q4 c(String str) {
        str.getClass();
        Matcher matcher = this.e.matcher(str);
        matcher.getClass();
        if (!matcher.matches()) {
            return null;
        }
        return new q4(matcher, str);
    }

    public final String toString() {
        String pattern = this.e.toString();
        pattern.getClass();
        return pattern;
    }

    public am1(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.e = compile;
    }
}
