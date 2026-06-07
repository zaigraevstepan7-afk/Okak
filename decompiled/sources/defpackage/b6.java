package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import com.google.protobuf.DescriptorProtos;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b6 {
    public static final b6 a = new Object();

    public final void a(View view, oh1 oh1Var) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (oh1Var instanceof u8) {
            systemIcon = PointerIcon.getSystemIcon(context, ((u8) oh1Var).b);
        } else {
            systemIcon = PointerIcon.getSystemIcon(context, DescriptorProtos.Edition.EDITION_2023_VALUE);
        }
        if (!sn0.r(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
