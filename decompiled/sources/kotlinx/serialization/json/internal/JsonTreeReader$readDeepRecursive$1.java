package kotlinx.serialization.json.internal;

import defpackage.eo1;
import defpackage.hv;
import defpackage.io;
import defpackage.od2;
import defpackage.qx;
import defpackage.se;
import defpackage.te0;
import defpackage.vt;
import defpackage.vx;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvx;", "Lod2;", "Lkotlinx/serialization/json/JsonElement;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, k = 3, mv = {2, 2, 0})
@qx(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class JsonTreeReader$readDeepRecursive$1 extends eo1 implements te0 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(JsonTreeReader jsonTreeReader, vt<? super JsonTreeReader$readDeepRecursive$1> vtVar) {
        super(3, vtVar);
        this.this$0 = jsonTreeReader;
    }

    @Override // defpackage.te0
    public final Object invoke(vx vxVar, od2 od2Var, vt<? super JsonElement> vtVar) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, vtVar);
        jsonTreeReader$readDeepRecursive$1.L$0 = vxVar;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        AbstractJsonLexer abstractJsonLexer;
        AbstractJsonLexer abstractJsonLexer2;
        JsonElement readArray;
        JsonPrimitive readValue;
        JsonPrimitive readValue2;
        vx vxVar = (vx) this.L$0;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            abstractJsonLexer = this.this$0.lexer;
            byte peekNextToken = abstractJsonLexer.peekNextToken();
            if (peekNextToken == 1) {
                readValue2 = this.this$0.readValue(true);
                return readValue2;
            }
            if (peekNextToken == 0) {
                readValue = this.this$0.readValue(false);
                return readValue;
            }
            if (peekNextToken == 6) {
                JsonTreeReader jsonTreeReader = this.this$0;
                this.L$0 = null;
                this.label = 1;
                obj = jsonTreeReader.readObject(vxVar, this);
                hv hvVar = hv.e;
                if (obj == hvVar) {
                    return hvVar;
                }
            } else {
                JsonTreeReader jsonTreeReader2 = this.this$0;
                if (peekNextToken == 8) {
                    readArray = jsonTreeReader2.readArray();
                    return readArray;
                }
                abstractJsonLexer2 = jsonTreeReader2.lexer;
                AbstractJsonLexer.fail$default(abstractJsonLexer2, "Can't begin reading element, unexpected token", 0, null, 6, null);
                se.c();
                return null;
            }
        }
        return (JsonElement) obj;
    }
}
