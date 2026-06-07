package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ExtensionList;
import defpackage.f00;
import defpackage.yq1;
import defpackage.yx;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/FileOptionsKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class FileOptionsKt {
    public static final FileOptionsKt INSTANCE = new FileOptionsKt();

    private FileOptionsKt() {
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 ³\u00012\u00020\u0001:\u0004³\u0001´\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\r\u0010!\u001a\u00020\t¢\u0006\u0004\b!\u0010\u000bJ\r\u0010\"\u001a\u00020\f¢\u0006\u0004\b\"\u0010\u000eJ\r\u0010#\u001a\u00020\t¢\u0006\u0004\b#\u0010\u000bJ\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010\u000bJ\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010\u000eJ\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010\u000bJ\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u000eJ\r\u0010)\u001a\u00020\t¢\u0006\u0004\b)\u0010\u000bJ\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u000eJ\r\u0010+\u001a\u00020\t¢\u0006\u0004\b+\u0010\u000bJ\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010\u000eJ\r\u0010-\u001a\u00020\t¢\u0006\u0004\b-\u0010\u000bJ\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010\u000eJ\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u0010\u000bJ\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010\u000eJ\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u0010\u000bJ\r\u00102\u001a\u00020\f¢\u0006\u0004\b2\u0010\u000eJ\r\u00103\u001a\u00020\t¢\u0006\u0004\b3\u0010\u000bJ\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u0010\u000eJ'\u0010;\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207052\u0006\u00108\u001a\u000206H\u0007¢\u0006\u0004\b9\u0010:J(\u0010=\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207052\u0006\u00108\u001a\u000206H\u0087\n¢\u0006\u0004\b<\u0010:J-\u0010B\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207052\f\u0010?\u001a\b\u0012\u0004\u0012\u0002060>H\u0007¢\u0006\u0004\b@\u0010AJ.\u0010=\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207052\f\u0010?\u001a\b\u0012\u0004\u0012\u0002060>H\u0087\n¢\u0006\u0004\bC\u0010AJ0\u0010H\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207052\u0006\u0010E\u001a\u00020D2\u0006\u00108\u001a\u000206H\u0087\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010K\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020705H\u0007¢\u0006\u0004\bI\u0010JJ.\u0010O\u001a\u00028\u0000\"\b\b\u0000\u0010L*\u00020\u00012\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000MH\u0086\u0002¢\u0006\u0004\bO\u0010PJ@\u0010O\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060S\"\b\b\u0000\u0010Q*\u00020\u00012\u0018\u0010N\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000R0MH\u0087\u0002¢\u0006\u0004\bT\u0010UJ\"\u0010V\u001a\u00020\f2\u0010\u0010N\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030MH\u0086\u0002¢\u0006\u0004\bV\u0010WJ\u001f\u0010K\u001a\u00020\t2\u0010\u0010N\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030M¢\u0006\u0004\bK\u0010XJ3\u0010Y\u001a\u00020\t\"\b\b\u0000\u0010L*\u00020\u00012\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000M2\u0006\u00108\u001a\u00028\u0000¢\u0006\u0004\bY\u0010ZJ<\u0010H\u001a\u00020\t\"\u000e\b\u0000\u0010L*\b\u0012\u0004\u0012\u00028\u00000[2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000M2\u0006\u00108\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bH\u0010\\J,\u0010H\u001a\u00020\t2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020]0M2\u0006\u00108\u001a\u00020]H\u0086\n¢\u0006\u0004\bH\u0010^J6\u0010H\u001a\u00020\t\"\b\b\u0000\u0010L*\u00020_2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000M2\u0006\u00108\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bH\u0010`J/\u0010;\u001a\u00020\t\"\b\b\u0000\u0010Q*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060S2\u0006\u00108\u001a\u00028\u0000¢\u0006\u0004\b;\u0010aJ2\u0010=\u001a\u00020\t\"\b\b\u0000\u0010Q*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060S2\u0006\u00108\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b=\u0010aJ5\u0010B\u001a\u00020\t\"\b\b\u0000\u0010Q*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060S2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>¢\u0006\u0004\bB\u0010bJ8\u0010=\u001a\u00020\t\"\b\b\u0000\u0010Q*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060S2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0086\n¢\u0006\u0004\b=\u0010bJ:\u0010H\u001a\u00020\t\"\b\b\u0000\u0010Q*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060S2\u0006\u0010E\u001a\u00020D2\u0006\u00108\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bH\u0010cJ\u001e\u0010K\u001a\u00020\t*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00060SH\u0086\b¢\u0006\u0004\bK\u0010dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010eR$\u0010k\u001a\u00020f2\u0006\u00108\u001a\u00020f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010n\u001a\u00020f2\u0006\u00108\u001a\u00020f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jR$\u0010r\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010\u000e\"\u0004\bp\u0010qR*\u0010v\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0087\u000e¢\u0006\u0012\u0012\u0004\bu\u0010\u000b\u001a\u0004\bs\u0010\u000e\"\u0004\bt\u0010qR$\u0010y\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010\u000e\"\u0004\bx\u0010qR$\u0010\u007f\u001a\u00020z2\u0006\u00108\u001a\u00020z8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R'\u0010\u0082\u0001\u001a\u00020f2\u0006\u00108\u001a\u00020f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010h\"\u0005\b\u0081\u0001\u0010jR'\u0010\u0085\u0001\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010\u000e\"\u0005\b\u0084\u0001\u0010qR'\u0010\u0088\u0001\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010\u000e\"\u0005\b\u0087\u0001\u0010qR'\u0010\u008b\u0001\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010\u000e\"\u0005\b\u008a\u0001\u0010qR'\u0010\u008e\u0001\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008c\u0001\u0010\u000e\"\u0005\b\u008d\u0001\u0010qR'\u0010\u0091\u0001\u001a\u00020\f2\u0006\u00108\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008f\u0001\u0010\u000e\"\u0005\b\u0090\u0001\u0010qR'\u0010\u0094\u0001\u001a\u00020f2\u0006\u00108\u001a\u00020f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0092\u0001\u0010h\"\u0005\b\u0093\u0001\u0010jR'\u0010\u0097\u0001\u001a\u00020f2\u0006\u00108\u001a\u00020f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0095\u0001\u0010h\"\u0005\b\u0096\u0001\u0010jR'\u0010\u009a\u0001\u001a\u00020f2\u0006\u00108\u001a\u00020f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0098\u0001\u0010h\"\u0005\b\u0099\u0001\u0010jR'\u0010\u009d\u0001\u001a\u00020f2\u0006\u00108\u001a\u00020f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009b\u0001\u0010h\"\u0005\b\u009c\u0001\u0010jR'\u0010 \u0001\u001a\u00020f2\u0006\u00108\u001a\u00020f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009e\u0001\u0010h\"\u0005\b\u009f\u0001\u0010jR'\u0010£\u0001\u001a\u00020f2\u0006\u00108\u001a\u00020f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¡\u0001\u0010h\"\u0005\b¢\u0001\u0010jR'\u0010¦\u0001\u001a\u00020f2\u0006\u00108\u001a\u00020f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¤\u0001\u0010h\"\u0005\b¥\u0001\u0010jR+\u0010¬\u0001\u001a\u00030§\u00012\u0007\u00108\u001a\u00030§\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R\u001b\u0010¯\u0001\u001a\u0005\u0018\u00010§\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R \u0010²\u0001\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207058F¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001¨\u0006µ\u0001"}, d2 = {"Lcom/google/protobuf/FileOptionsKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$FileOptions$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$FileOptions$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$FileOptions;", "_build", "()Lcom/google/protobuf/DescriptorProtos$FileOptions;", "Lod2;", "clearJavaPackage", "()V", "", "hasJavaPackage", "()Z", "clearJavaOuterClassname", "hasJavaOuterClassname", "clearJavaMultipleFiles", "hasJavaMultipleFiles", "clearJavaGenerateEqualsAndHash", "hasJavaGenerateEqualsAndHash", "clearJavaStringCheckUtf8", "hasJavaStringCheckUtf8", "clearOptimizeFor", "hasOptimizeFor", "clearGoPackage", "hasGoPackage", "clearCcGenericServices", "hasCcGenericServices", "clearJavaGenericServices", "hasJavaGenericServices", "clearPyGenericServices", "hasPyGenericServices", "clearDeprecated", "hasDeprecated", "clearCcEnableArenas", "hasCcEnableArenas", "clearObjcClassPrefix", "hasObjcClassPrefix", "clearCsharpNamespace", "hasCsharpNamespace", "clearSwiftPrefix", "hasSwiftPrefix", "clearPhpClassPrefix", "hasPhpClassPrefix", "clearPhpNamespace", "hasPhpNamespace", "clearPhpMetadataNamespace", "hasPhpMetadataNamespace", "clearRubyPackage", "hasRubyPackage", "clearFeatures", "hasFeatures", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;", "Lcom/google/protobuf/FileOptionsKt$Dsl$UninterpretedOptionProxy;", "value", "addUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;)V", "add", "plusAssignUninterpretedOption", "plusAssign", "", "values", "addAllUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllUninterpretedOption", "", "index", "setUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$UninterpretedOption;)V", "set", "clearUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "T", "Lcom/google/protobuf/ExtensionLite;", "extension", "get", "(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "E", "", "Lcom/google/protobuf/kotlin/ExtensionList;", "-getRepeatedExtension", "(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/kotlin/ExtensionList;", "contains", "(Lcom/google/protobuf/ExtensionLite;)Z", "(Lcom/google/protobuf/ExtensionLite;)V", "setExtension", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V", "", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Comparable;)V", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/ByteString;)V", "Lcom/google/protobuf/MessageLite;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/MessageLite;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Iterable;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;ILjava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;)V", "Lcom/google/protobuf/DescriptorProtos$FileOptions$Builder;", "", "getJavaPackage", "()Ljava/lang/String;", "setJavaPackage", "(Ljava/lang/String;)V", "javaPackage", "getJavaOuterClassname", "setJavaOuterClassname", "javaOuterClassname", "getJavaMultipleFiles", "setJavaMultipleFiles", "(Z)V", "javaMultipleFiles", "getJavaGenerateEqualsAndHash", "setJavaGenerateEqualsAndHash", "getJavaGenerateEqualsAndHash$annotations", "javaGenerateEqualsAndHash", "getJavaStringCheckUtf8", "setJavaStringCheckUtf8", "javaStringCheckUtf8", "Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;", "getOptimizeFor", "()Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;", "setOptimizeFor", "(Lcom/google/protobuf/DescriptorProtos$FileOptions$OptimizeMode;)V", "optimizeFor", "getGoPackage", "setGoPackage", "goPackage", "getCcGenericServices", "setCcGenericServices", "ccGenericServices", "getJavaGenericServices", "setJavaGenericServices", "javaGenericServices", "getPyGenericServices", "setPyGenericServices", "pyGenericServices", "getDeprecated", "setDeprecated", "deprecated", "getCcEnableArenas", "setCcEnableArenas", "ccEnableArenas", "getObjcClassPrefix", "setObjcClassPrefix", "objcClassPrefix", "getCsharpNamespace", "setCsharpNamespace", "csharpNamespace", "getSwiftPrefix", "setSwiftPrefix", "swiftPrefix", "getPhpClassPrefix", "setPhpClassPrefix", "phpClassPrefix", "getPhpNamespace", "setPhpNamespace", "phpNamespace", "getPhpMetadataNamespace", "setPhpMetadataNamespace", "phpMetadataNamespace", "getRubyPackage", "setRubyPackage", "rubyPackage", "Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "getFeatures", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "setFeatures", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)V", "features", "getFeaturesOrNull", "(Lcom/google/protobuf/FileOptionsKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "featuresOrNull", "getUninterpretedOption", "()Lcom/google/protobuf/kotlin/DslList;", "uninterpretedOption", "Companion", "UninterpretedOptionProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.FileOptions.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FileOptionsKt$Dsl$UninterpretedOptionProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class UninterpretedOptionProxy extends DslProxy {
            private UninterpretedOptionProxy() {
            }
        }

        private Dsl(DescriptorProtos.FileOptions.Builder builder) {
            this._builder = builder;
        }

        /* renamed from: -getRepeatedExtension, reason: not valid java name */
        public final /* synthetic */ ExtensionList m42getRepeatedExtension(ExtensionLite extension) {
            extension.getClass();
            Object extension2 = this._builder.getExtension(extension);
            extension2.getClass();
            return new ExtensionList(extension, (List) extension2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* synthetic */ DescriptorProtos.FileOptions _build() {
            MessageType build = this._builder.build();
            build.getClass();
            return (DescriptorProtos.FileOptions) build;
        }

        public final /* synthetic */ void add(ExtensionList extensionList, Object obj) {
            extensionList.getClass();
            obj.getClass();
            this._builder.addExtension(extensionList.getExtension(), obj);
        }

        public final /* synthetic */ void addAll(ExtensionList extensionList, Iterable iterable) {
            extensionList.getClass();
            iterable.getClass();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                add(extensionList, it.next());
            }
        }

        public final /* synthetic */ void addAllUninterpretedOption(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllUninterpretedOption(iterable);
        }

        public final /* synthetic */ void addUninterpretedOption(DslList dslList, DescriptorProtos.UninterpretedOption uninterpretedOption) {
            dslList.getClass();
            uninterpretedOption.getClass();
            this._builder.addUninterpretedOption(uninterpretedOption);
        }

        public final /* synthetic */ void clear(ExtensionList<?, DescriptorProtos.FileOptions> extensionList) {
            extensionList.getClass();
            clear(extensionList.getExtension());
        }

        public final void clearCcEnableArenas() {
            this._builder.clearCcEnableArenas();
        }

        public final void clearCcGenericServices() {
            this._builder.clearCcGenericServices();
        }

        public final void clearCsharpNamespace() {
            this._builder.clearCsharpNamespace();
        }

        public final void clearDeprecated() {
            this._builder.clearDeprecated();
        }

        public final void clearFeatures() {
            this._builder.clearFeatures();
        }

        public final void clearGoPackage() {
            this._builder.clearGoPackage();
        }

        public final void clearJavaGenerateEqualsAndHash() {
            this._builder.clearJavaGenerateEqualsAndHash();
        }

        public final void clearJavaGenericServices() {
            this._builder.clearJavaGenericServices();
        }

        public final void clearJavaMultipleFiles() {
            this._builder.clearJavaMultipleFiles();
        }

        public final void clearJavaOuterClassname() {
            this._builder.clearJavaOuterClassname();
        }

        public final void clearJavaPackage() {
            this._builder.clearJavaPackage();
        }

        public final void clearJavaStringCheckUtf8() {
            this._builder.clearJavaStringCheckUtf8();
        }

        public final void clearObjcClassPrefix() {
            this._builder.clearObjcClassPrefix();
        }

        public final void clearOptimizeFor() {
            this._builder.clearOptimizeFor();
        }

        public final void clearPhpClassPrefix() {
            this._builder.clearPhpClassPrefix();
        }

        public final void clearPhpMetadataNamespace() {
            this._builder.clearPhpMetadataNamespace();
        }

        public final void clearPhpNamespace() {
            this._builder.clearPhpNamespace();
        }

        public final void clearPyGenericServices() {
            this._builder.clearPyGenericServices();
        }

        public final void clearRubyPackage() {
            this._builder.clearRubyPackage();
        }

        public final void clearSwiftPrefix() {
            this._builder.clearSwiftPrefix();
        }

        public final /* synthetic */ void clearUninterpretedOption(DslList dslList) {
            dslList.getClass();
            this._builder.clearUninterpretedOption();
        }

        public final /* synthetic */ boolean contains(ExtensionLite extension) {
            extension.getClass();
            return this._builder.hasExtension(extension);
        }

        public final /* synthetic */ Object get(ExtensionLite extension) {
            extension.getClass();
            if (extension.isRepeated()) {
                Object obj = get(extension);
                obj.getClass();
                return obj;
            }
            Object extension2 = this._builder.getExtension(extension);
            extension2.getClass();
            return extension2;
        }

        public final boolean getCcEnableArenas() {
            return this._builder.getCcEnableArenas();
        }

        public final boolean getCcGenericServices() {
            return this._builder.getCcGenericServices();
        }

        public final String getCsharpNamespace() {
            String csharpNamespace = this._builder.getCsharpNamespace();
            csharpNamespace.getClass();
            return csharpNamespace;
        }

        public final boolean getDeprecated() {
            return this._builder.getDeprecated();
        }

        public final DescriptorProtos.FeatureSet getFeatures() {
            DescriptorProtos.FeatureSet features = this._builder.getFeatures();
            features.getClass();
            return features;
        }

        public final DescriptorProtos.FeatureSet getFeaturesOrNull(Dsl dsl) {
            dsl.getClass();
            return FileOptionsKtKt.getFeaturesOrNull(dsl._builder);
        }

        public final String getGoPackage() {
            String goPackage = this._builder.getGoPackage();
            goPackage.getClass();
            return goPackage;
        }

        public final boolean getJavaGenerateEqualsAndHash() {
            return this._builder.getJavaGenerateEqualsAndHash();
        }

        public final boolean getJavaGenericServices() {
            return this._builder.getJavaGenericServices();
        }

        public final boolean getJavaMultipleFiles() {
            return this._builder.getJavaMultipleFiles();
        }

        public final String getJavaOuterClassname() {
            String javaOuterClassname = this._builder.getJavaOuterClassname();
            javaOuterClassname.getClass();
            return javaOuterClassname;
        }

        public final String getJavaPackage() {
            String javaPackage = this._builder.getJavaPackage();
            javaPackage.getClass();
            return javaPackage;
        }

        public final boolean getJavaStringCheckUtf8() {
            return this._builder.getJavaStringCheckUtf8();
        }

        public final String getObjcClassPrefix() {
            String objcClassPrefix = this._builder.getObjcClassPrefix();
            objcClassPrefix.getClass();
            return objcClassPrefix;
        }

        public final DescriptorProtos.FileOptions.OptimizeMode getOptimizeFor() {
            DescriptorProtos.FileOptions.OptimizeMode optimizeFor = this._builder.getOptimizeFor();
            optimizeFor.getClass();
            return optimizeFor;
        }

        public final String getPhpClassPrefix() {
            String phpClassPrefix = this._builder.getPhpClassPrefix();
            phpClassPrefix.getClass();
            return phpClassPrefix;
        }

        public final String getPhpMetadataNamespace() {
            String phpMetadataNamespace = this._builder.getPhpMetadataNamespace();
            phpMetadataNamespace.getClass();
            return phpMetadataNamespace;
        }

        public final String getPhpNamespace() {
            String phpNamespace = this._builder.getPhpNamespace();
            phpNamespace.getClass();
            return phpNamespace;
        }

        public final boolean getPyGenericServices() {
            return this._builder.getPyGenericServices();
        }

        public final String getRubyPackage() {
            String rubyPackage = this._builder.getRubyPackage();
            rubyPackage.getClass();
            return rubyPackage;
        }

        public final String getSwiftPrefix() {
            String swiftPrefix = this._builder.getSwiftPrefix();
            swiftPrefix.getClass();
            return swiftPrefix;
        }

        public final /* synthetic */ DslList getUninterpretedOption() {
            List<DescriptorProtos.UninterpretedOption> uninterpretedOptionList = this._builder.getUninterpretedOptionList();
            uninterpretedOptionList.getClass();
            return new DslList(uninterpretedOptionList);
        }

        public final boolean hasCcEnableArenas() {
            return this._builder.hasCcEnableArenas();
        }

        public final boolean hasCcGenericServices() {
            return this._builder.hasCcGenericServices();
        }

        public final boolean hasCsharpNamespace() {
            return this._builder.hasCsharpNamespace();
        }

        public final boolean hasDeprecated() {
            return this._builder.hasDeprecated();
        }

        public final boolean hasFeatures() {
            return this._builder.hasFeatures();
        }

        public final boolean hasGoPackage() {
            return this._builder.hasGoPackage();
        }

        public final boolean hasJavaGenerateEqualsAndHash() {
            return this._builder.hasJavaGenerateEqualsAndHash();
        }

        public final boolean hasJavaGenericServices() {
            return this._builder.hasJavaGenericServices();
        }

        public final boolean hasJavaMultipleFiles() {
            return this._builder.hasJavaMultipleFiles();
        }

        public final boolean hasJavaOuterClassname() {
            return this._builder.hasJavaOuterClassname();
        }

        public final boolean hasJavaPackage() {
            return this._builder.hasJavaPackage();
        }

        public final boolean hasJavaStringCheckUtf8() {
            return this._builder.hasJavaStringCheckUtf8();
        }

        public final boolean hasObjcClassPrefix() {
            return this._builder.hasObjcClassPrefix();
        }

        public final boolean hasOptimizeFor() {
            return this._builder.hasOptimizeFor();
        }

        public final boolean hasPhpClassPrefix() {
            return this._builder.hasPhpClassPrefix();
        }

        public final boolean hasPhpMetadataNamespace() {
            return this._builder.hasPhpMetadataNamespace();
        }

        public final boolean hasPhpNamespace() {
            return this._builder.hasPhpNamespace();
        }

        public final boolean hasPyGenericServices() {
            return this._builder.hasPyGenericServices();
        }

        public final boolean hasRubyPackage() {
            return this._builder.hasRubyPackage();
        }

        public final boolean hasSwiftPrefix() {
            return this._builder.hasSwiftPrefix();
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.FileOptions> extensionList, E e) {
            extensionList.getClass();
            e.getClass();
            add(extensionList, e);
        }

        public final /* synthetic */ void plusAssignAllUninterpretedOption(DslList<DescriptorProtos.UninterpretedOption, UninterpretedOptionProxy> dslList, Iterable<DescriptorProtos.UninterpretedOption> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllUninterpretedOption(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignUninterpretedOption(DslList<DescriptorProtos.UninterpretedOption, UninterpretedOptionProxy> dslList, DescriptorProtos.UninterpretedOption uninterpretedOption) {
            dslList.getClass();
            uninterpretedOption.getClass();
            addUninterpretedOption(dslList, uninterpretedOption);
        }

        public final /* synthetic */ void set(ExtensionList extensionList, int i, Object obj) {
            extensionList.getClass();
            obj.getClass();
            this._builder.setExtension(extensionList.getExtension(), i, obj);
        }

        public final void setCcEnableArenas(boolean z) {
            this._builder.setCcEnableArenas(z);
        }

        public final void setCcGenericServices(boolean z) {
            this._builder.setCcGenericServices(z);
        }

        public final void setCsharpNamespace(String str) {
            str.getClass();
            this._builder.setCsharpNamespace(str);
        }

        public final void setDeprecated(boolean z) {
            this._builder.setDeprecated(z);
        }

        public final /* synthetic */ void setExtension(ExtensionLite extension, Object value) {
            extension.getClass();
            value.getClass();
            this._builder.setExtension(extension, value);
        }

        public final void setFeatures(DescriptorProtos.FeatureSet featureSet) {
            featureSet.getClass();
            this._builder.setFeatures(featureSet);
        }

        public final void setGoPackage(String str) {
            str.getClass();
            this._builder.setGoPackage(str);
        }

        public final void setJavaGenerateEqualsAndHash(boolean z) {
            this._builder.setJavaGenerateEqualsAndHash(z);
        }

        public final void setJavaGenericServices(boolean z) {
            this._builder.setJavaGenericServices(z);
        }

        public final void setJavaMultipleFiles(boolean z) {
            this._builder.setJavaMultipleFiles(z);
        }

        public final void setJavaOuterClassname(String str) {
            str.getClass();
            this._builder.setJavaOuterClassname(str);
        }

        public final void setJavaPackage(String str) {
            str.getClass();
            this._builder.setJavaPackage(str);
        }

        public final void setJavaStringCheckUtf8(boolean z) {
            this._builder.setJavaStringCheckUtf8(z);
        }

        public final void setObjcClassPrefix(String str) {
            str.getClass();
            this._builder.setObjcClassPrefix(str);
        }

        public final void setOptimizeFor(DescriptorProtos.FileOptions.OptimizeMode optimizeMode) {
            optimizeMode.getClass();
            this._builder.setOptimizeFor(optimizeMode);
        }

        public final void setPhpClassPrefix(String str) {
            str.getClass();
            this._builder.setPhpClassPrefix(str);
        }

        public final void setPhpMetadataNamespace(String str) {
            str.getClass();
            this._builder.setPhpMetadataNamespace(str);
        }

        public final void setPhpNamespace(String str) {
            str.getClass();
            this._builder.setPhpNamespace(str);
        }

        public final void setPyGenericServices(boolean z) {
            this._builder.setPyGenericServices(z);
        }

        public final void setRubyPackage(String str) {
            str.getClass();
            this._builder.setRubyPackage(str);
        }

        public final void setSwiftPrefix(String str) {
            str.getClass();
            this._builder.setSwiftPrefix(str);
        }

        public final /* synthetic */ void setUninterpretedOption(DslList dslList, int i, DescriptorProtos.UninterpretedOption uninterpretedOption) {
            dslList.getClass();
            uninterpretedOption.getClass();
            this._builder.setUninterpretedOption(i, uninterpretedOption);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FileOptionsKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FileOptionsKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$FileOptions$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.FileOptions.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.FileOptions.Builder builder, yx yxVar) {
            this(builder);
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.FileOptions> extensionList, Iterable<? extends E> iterable) {
            extensionList.getClass();
            iterable.getClass();
            addAll(extensionList, iterable);
        }

        public final /* synthetic */ void clear(ExtensionLite extension) {
            extension.getClass();
            this._builder.clearExtension(extension);
        }

        public final /* synthetic */ void set(ExtensionLite<DescriptorProtos.FileOptions, ByteString> extension, ByteString value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends MessageLite> void set(ExtensionLite<DescriptorProtos.FileOptions, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends Comparable<? super T>> void set(ExtensionLite<DescriptorProtos.FileOptions, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        @f00
        public static /* synthetic */ void getJavaGenerateEqualsAndHash$annotations() {
        }
    }
}
