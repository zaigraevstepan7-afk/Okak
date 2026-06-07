package kotlinx.serialization.json.internal;

import defpackage.d6;
import defpackage.de0;
import defpackage.fc2;
import defpackage.fo1;
import defpackage.hv;
import defpackage.io;
import defpackage.od2;
import defpackage.se;
import defpackage.sn0;
import defpackage.te0;
import defpackage.vt;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\t\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\u0082@¢\u0006\u0004\b\t\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\nJ\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeReader;", "", "Lkotlinx/serialization/json/JsonConfiguration;", "configuration", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "lexer", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;Lkotlinx/serialization/json/internal/AbstractJsonLexer;)V", "Lkotlinx/serialization/json/JsonElement;", "readObject", "()Lkotlinx/serialization/json/JsonElement;", "Lvx;", "Lod2;", "(Lvx;Lvt;)Ljava/lang/Object;", "Lkotlin/Function0;", "reader", "Lkotlinx/serialization/json/JsonObject;", "readObjectImpl", "(Lde0;)Lkotlinx/serialization/json/JsonObject;", "readArray", "", "isString", "Lkotlinx/serialization/json/JsonPrimitive;", "readValue", "(Z)Lkotlinx/serialization/json/JsonPrimitive;", "readDeepRecursive", "read", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "isLenient", "Z", "trailingCommaAllowed", "", "stackDepth", "I", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonTreeReader {
    private final boolean isLenient;
    private final AbstractJsonLexer lexer;
    private int stackDepth;
    private final boolean trailingCommaAllowed;

    public JsonTreeReader(JsonConfiguration jsonConfiguration, AbstractJsonLexer abstractJsonLexer) {
        jsonConfiguration.getClass();
        abstractJsonLexer.getClass();
        this.lexer = abstractJsonLexer;
        this.isLenient = jsonConfiguration.getIsLenient();
        this.trailingCommaAllowed = jsonConfiguration.getAllowTrailingComma();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement readArray() {
        boolean z;
        byte consumeNextToken = this.lexer.consumeNextToken();
        if (this.lexer.peekNextToken() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.lexer.canConsumeValue()) {
                arrayList.add(read());
                consumeNextToken = this.lexer.consumeNextToken();
                if (consumeNextToken != 4) {
                    AbstractJsonLexer abstractJsonLexer = this.lexer;
                    if (consumeNextToken == 9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i = abstractJsonLexer.currentPosition;
                    if (!z) {
                        AbstractJsonLexer.fail$default(abstractJsonLexer, "Expected end of the array or comma", i, null, 4, null);
                        se.c();
                        return null;
                    }
                }
            }
            if (consumeNextToken == 8) {
                this.lexer.consumeNextToken((byte) 9);
            } else if (consumeNextToken == 4) {
                boolean z2 = this.trailingCommaAllowed;
                AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                if (z2) {
                    abstractJsonLexer2.consumeNextToken((byte) 9);
                } else {
                    JsonExceptionsKt.invalidTrailingComma(abstractJsonLexer2, "array");
                    se.c();
                    return null;
                }
            }
            return new JsonArray(arrayList);
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        se.c();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [wx, java.lang.Object, vt] */
    private final JsonElement readDeepRecursive() {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this, null);
        ?? obj = new Object();
        obj.e = jsonTreeReader$readDeepRecursive$1;
        obj.f = obj;
        hv hvVar = d6.g;
        obj.g = hvVar;
        while (true) {
            Object obj2 = obj.g;
            vt vtVar = obj.f;
            if (vtVar == null) {
                io.K(obj2);
                return (JsonElement) obj2;
            }
            if (sn0.r(hvVar, obj2)) {
                try {
                    te0 te0Var = obj.e;
                    od2 od2Var = od2.a;
                    fc2.t(3, te0Var);
                    Object invoke = te0Var.invoke(obj, od2Var, vtVar);
                    if (invoke != hv.e) {
                        vtVar.resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    vtVar.resumeWith(new fo1(th));
                }
            } else {
                obj.g = hvVar;
                vtVar.resumeWith(obj2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readObject(defpackage.vx r20, defpackage.vt<? super kotlinx.serialization.json.JsonElement> r21) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.readObject(vx, vt):java.lang.Object");
    }

    private final JsonObject readObjectImpl(de0 reader) {
        String consumeString;
        byte consumeNextToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.lexer.canConsumeValue()) {
                    break;
                }
                boolean z = this.isLenient;
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                if (z) {
                    consumeString = abstractJsonLexer.consumeStringLenient();
                } else {
                    consumeString = abstractJsonLexer.consumeString();
                }
                this.lexer.consumeNextToken((byte) 5);
                linkedHashMap.put(consumeString, (JsonElement) reader.invoke());
                consumeNextToken = this.lexer.consumeNextToken();
                if (consumeNextToken != 4) {
                    if (consumeNextToken != 7) {
                        AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                        se.c();
                        return null;
                    }
                }
            }
            if (consumeNextToken == 6) {
                this.lexer.consumeNextToken((byte) 7);
            } else if (consumeNextToken == 4) {
                boolean z2 = this.trailingCommaAllowed;
                AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                if (z2) {
                    abstractJsonLexer2.consumeNextToken((byte) 7);
                } else {
                    JsonExceptionsKt.invalidTrailingComma$default(abstractJsonLexer2, null, 1, null);
                    se.c();
                    return null;
                }
            }
            return new JsonObject(linkedHashMap);
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        se.c();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive readValue(boolean isString) {
        String consumeStringLenient;
        if (!this.isLenient && isString) {
            consumeStringLenient = this.lexer.consumeString();
        } else {
            consumeStringLenient = this.lexer.consumeStringLenient();
        }
        String str = consumeStringLenient;
        if (!isString && sn0.r(str, AbstractJsonLexerKt.NULL)) {
            return JsonNull.INSTANCE;
        }
        return new JsonLiteral(str, isString, null, 4, null);
    }

    public final JsonElement read() {
        JsonElement readObject;
        byte peekNextToken = this.lexer.peekNextToken();
        if (peekNextToken == 1) {
            return readValue(true);
        }
        if (peekNextToken == 0) {
            return readValue(false);
        }
        if (peekNextToken == 6) {
            int i = this.stackDepth + 1;
            this.stackDepth = i;
            if (i == 200) {
                readObject = readDeepRecursive();
            } else {
                readObject = readObject();
            }
            this.stackDepth--;
            return readObject;
        }
        if (peekNextToken == 8) {
            return readArray();
        }
        AbstractJsonLexer.fail$default(this.lexer, "Cannot read Json element because of unexpected " + AbstractJsonLexerKt.tokenDescription(peekNextToken), 0, null, 6, null);
        se.c();
        return null;
    }

    private final JsonElement readObject() {
        byte consumeNextToken = this.lexer.consumeNextToken((byte) 6);
        if (this.lexer.peekNextToken() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.lexer.canConsumeValue()) {
                    break;
                }
                boolean z = this.isLenient;
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                String consumeStringLenient = z ? abstractJsonLexer.consumeStringLenient() : abstractJsonLexer.consumeString();
                this.lexer.consumeNextToken((byte) 5);
                linkedHashMap.put(consumeStringLenient, read());
                consumeNextToken = this.lexer.consumeNextToken();
                if (consumeNextToken != 4) {
                    if (consumeNextToken != 7) {
                        AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, null, 6, null);
                        se.c();
                        return null;
                    }
                }
            }
            if (consumeNextToken == 6) {
                this.lexer.consumeNextToken((byte) 7);
            } else if (consumeNextToken == 4) {
                boolean z2 = this.trailingCommaAllowed;
                AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                if (z2) {
                    abstractJsonLexer2.consumeNextToken((byte) 7);
                } else {
                    JsonExceptionsKt.invalidTrailingComma$default(abstractJsonLexer2, null, 1, null);
                    se.c();
                    return null;
                }
            }
            return new JsonObject(linkedHashMap);
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        se.c();
        return null;
    }
}
