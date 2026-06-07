package defpackage;

import android.content.Context;
import com.elixir.loader.UserSettings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class jx0 {
    public static final js a = new js(new ax0(6));

    public static final void a(rw rwVar, Context context, fq fqVar, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        h32 h32Var;
        rwVar.getClass();
        urVar.Y(910005875);
        if (urVar.h(rwVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.h(context)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        int i6 = 0;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            o41 p = lo.p(rwVar.b, null, ((uu0) urVar.j(bx0.a)).g(), nu0.h, j60.e, urVar, 48);
            UserSettings userSettings = (UserSettings) p.getValue();
            if (userSettings != null && userSettings.getIsLanguageInitialized()) {
                UserSettings userSettings2 = (UserSettings) p.getValue();
                if (userSettings2 != null) {
                    i6 = userSettings2.getLanguage();
                }
            } else {
                i6 = b(context);
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            h32Var = h32.b;
                        } else {
                            h32Var = h32.e;
                        }
                    } else {
                        h32Var = h32.d;
                    }
                } else {
                    h32Var = h32.c;
                }
            } else {
                h32Var = h32.f;
            }
            vn.b(a.a(h32Var), go.N(-807048397, new bj0(fqVar, 5), urVar), urVar, 56);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new l1(rwVar, context, fqVar, i, 5);
        }
    }

    public static final int b(Context context) {
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        if (language != null) {
            int hashCode = language.hashCode();
            if (hashCode != 3588) {
                if (hashCode != 3651) {
                    if (hashCode != 3734) {
                        if (hashCode == 3886 && language.equals("zh")) {
                            return 1;
                        }
                    } else if (language.equals("uk")) {
                        return 4;
                    }
                } else if (language.equals("ru")) {
                    return 3;
                }
            } else if (language.equals("pt")) {
                return 2;
            }
        }
        return 0;
    }

    public static final h32 c(ur urVar) {
        return (h32) urVar.j(a);
    }
}
