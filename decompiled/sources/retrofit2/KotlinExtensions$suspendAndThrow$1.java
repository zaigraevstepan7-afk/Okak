package retrofit2;

import defpackage.qx;
import defpackage.vt;
import defpackage.wt;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@qx(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
@Metadata(k = 3, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class KotlinExtensions$suspendAndThrow$1 extends wt {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public KotlinExtensions$suspendAndThrow$1(vt<? super KotlinExtensions$suspendAndThrow$1> vtVar) {
        super(vtVar);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.suspendAndThrow(null, this);
    }
}
