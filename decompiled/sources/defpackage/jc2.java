package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jc2 extends wm1 {
    @Override // defpackage.wm1
    public final Font n(ud0 ud0Var) {
        String str;
        Font b;
        Uri uri = ud0Var.a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str2 = ud0Var.e;
        if (equals) {
            str = uri.getAuthority();
        } else {
            str = null;
        }
        if (str != null) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (b = ic2.b(create)) != null) {
                if (TextUtils.isEmpty(str2)) {
                    return b;
                }
                try {
                    return new Font.Builder(b).setFontVariationSettings(str2).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
