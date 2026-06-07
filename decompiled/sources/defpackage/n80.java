package defpackage;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class n80 extends ef0 implements oe0 {
    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
        return od2.a;
    }
}
