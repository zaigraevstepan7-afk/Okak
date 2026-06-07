package kotlinx.serialization.json.internal;

import defpackage.qx;
import defpackage.vt;
import defpackage.wt;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@qx(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
@Metadata(k = 3, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonTreeReader$readObject$2 extends wt {
    byte B$0;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(JsonTreeReader jsonTreeReader, vt<? super JsonTreeReader$readObject$2> vtVar) {
        super(vtVar);
        this.this$0 = jsonTreeReader;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        Object readObject;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readObject = this.this$0.readObject(null, this);
        return readObject;
    }
}
