package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ExtensionList;
import defpackage.yq1;
import defpackage.yx;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/EnumValueOptionsKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class EnumValueOptionsKt {
    public static final EnumValueOptionsKt INSTANCE = new EnumValueOptionsKt();

    private EnumValueOptionsKt() {
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 b2\u00020\u0001:\u0002bcB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ'\u0010\u001b\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0018\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001d\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0018\u001a\u00020\u0016H\u0087\n¢\u0006\u0004\b\u001c\u0010\u001aJ-\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0007¢\u0006\u0004\b \u0010!J.\u0010\u001d\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0087\n¢\u0006\u0004\b#\u0010!J0\u0010(\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u0016H\u0087\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0007¢\u0006\u0004\b)\u0010*J.\u0010/\u001a\u00028\u0000\"\b\b\u0000\u0010,*\u00020\u00012\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000-H\u0086\u0002¢\u0006\u0004\b/\u00100J@\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000603\"\b\b\u0000\u00101*\u00020\u00012\u0018\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000020-H\u0087\u0002¢\u0006\u0004\b4\u00105J\"\u00106\u001a\u00020\f2\u0010\u0010.\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030-H\u0086\u0002¢\u0006\u0004\b6\u00107J\u001f\u0010+\u001a\u00020\t2\u0010\u0010.\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030-¢\u0006\u0004\b+\u00108J3\u00109\u001a\u00020\t\"\b\b\u0000\u0010,*\u00020\u00012\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b9\u0010:J<\u0010(\u001a\u00020\t\"\u000e\b\u0000\u0010,*\b\u0012\u0004\u0012\u00028\u00000;2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010\u0018\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b(\u0010<J,\u0010(\u001a\u00020\t2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020=0-2\u0006\u0010\u0018\u001a\u00020=H\u0086\n¢\u0006\u0004\b(\u0010>J6\u0010(\u001a\u00020\t\"\b\b\u0000\u0010,*\u00020?2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000-2\u0006\u0010\u0018\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b(\u0010@J/\u0010\u001b\u001a\u00020\t\"\b\b\u0000\u00101*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006032\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010AJ2\u0010\u001d\u001a\u00020\t\"\b\b\u0000\u00101*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006032\u0006\u0010\u0018\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u001d\u0010AJ5\u0010\"\u001a\u00020\t\"\b\b\u0000\u00101*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b\"\u0010BJ8\u0010\u001d\u001a\u00020\t\"\b\b\u0000\u00101*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\n¢\u0006\u0004\b\u001d\u0010BJ:\u0010(\u001a\u00020\t\"\b\b\u0000\u00101*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006032\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0018\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b(\u0010CJ\u001e\u0010+\u001a\u00020\t*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u000603H\u0086\b¢\u0006\u0004\b+\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER$\u0010I\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010\u000e\"\u0004\bG\u0010HR$\u0010O\u001a\u00020J2\u0006\u0010\u0018\u001a\u00020J8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0017\u0010R\u001a\u0004\u0018\u00010J*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bP\u0010QR$\u0010U\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010\u000e\"\u0004\bT\u0010HR$\u0010[\u001a\u00020V2\u0006\u0010\u0018\u001a\u00020V8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0017\u0010^\u001a\u0004\u0018\u00010V*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001d\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158F¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006d"}, d2 = {"Lcom/google/protobuf/EnumValueOptionsKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$EnumValueOptions$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$EnumValueOptions$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;", "_build", "()Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;", "Lod2;", "clearDeprecated", "()V", "", "hasDeprecated", "()Z", "clearFeatures", "hasFeatures", "clearDebugRedact", "hasDebugRedact", "clearFeatureSupport", "hasFeatureSupport", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;", "Lcom/google/protobuf/EnumValueOptionsKt$Dsl$UninterpretedOptionProxy;", "value", "addUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;)V", "add", "plusAssignUninterpretedOption", "plusAssign", "", "values", "addAllUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllUninterpretedOption", "", "index", "setUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$UninterpretedOption;)V", "set", "clearUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "T", "Lcom/google/protobuf/ExtensionLite;", "extension", "get", "(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "E", "", "Lcom/google/protobuf/kotlin/ExtensionList;", "-getRepeatedExtension", "(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/kotlin/ExtensionList;", "contains", "(Lcom/google/protobuf/ExtensionLite;)Z", "(Lcom/google/protobuf/ExtensionLite;)V", "setExtension", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V", "", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Comparable;)V", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/ByteString;)V", "Lcom/google/protobuf/MessageLite;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/MessageLite;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Iterable;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;ILjava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;)V", "Lcom/google/protobuf/DescriptorProtos$EnumValueOptions$Builder;", "getDeprecated", "setDeprecated", "(Z)V", "deprecated", "Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "getFeatures", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "setFeatures", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)V", "features", "getFeaturesOrNull", "(Lcom/google/protobuf/EnumValueOptionsKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "featuresOrNull", "getDebugRedact", "setDebugRedact", "debugRedact", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "getFeatureSupport", "()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "setFeatureSupport", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)V", "featureSupport", "getFeatureSupportOrNull", "(Lcom/google/protobuf/EnumValueOptionsKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "featureSupportOrNull", "getUninterpretedOption", "()Lcom/google/protobuf/kotlin/DslList;", "uninterpretedOption", "Companion", "UninterpretedOptionProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.EnumValueOptions.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/EnumValueOptionsKt$Dsl$UninterpretedOptionProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class UninterpretedOptionProxy extends DslProxy {
            private UninterpretedOptionProxy() {
            }
        }

        private Dsl(DescriptorProtos.EnumValueOptions.Builder builder) {
            this._builder = builder;
        }

        /* renamed from: -getRepeatedExtension, reason: not valid java name */
        public final /* synthetic */ ExtensionList m21getRepeatedExtension(ExtensionLite extension) {
            extension.getClass();
            Object extension2 = this._builder.getExtension(extension);
            extension2.getClass();
            return new ExtensionList(extension, (List) extension2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* synthetic */ DescriptorProtos.EnumValueOptions _build() {
            MessageType build = this._builder.build();
            build.getClass();
            return (DescriptorProtos.EnumValueOptions) build;
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

        public final /* synthetic */ void clear(ExtensionList<?, DescriptorProtos.EnumValueOptions> extensionList) {
            extensionList.getClass();
            clear(extensionList.getExtension());
        }

        public final void clearDebugRedact() {
            this._builder.clearDebugRedact();
        }

        public final void clearDeprecated() {
            this._builder.clearDeprecated();
        }

        public final void clearFeatureSupport() {
            this._builder.clearFeatureSupport();
        }

        public final void clearFeatures() {
            this._builder.clearFeatures();
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

        public final boolean getDebugRedact() {
            return this._builder.getDebugRedact();
        }

        public final boolean getDeprecated() {
            return this._builder.getDeprecated();
        }

        public final DescriptorProtos.FieldOptions.FeatureSupport getFeatureSupport() {
            DescriptorProtos.FieldOptions.FeatureSupport featureSupport = this._builder.getFeatureSupport();
            featureSupport.getClass();
            return featureSupport;
        }

        public final DescriptorProtos.FieldOptions.FeatureSupport getFeatureSupportOrNull(Dsl dsl) {
            dsl.getClass();
            return EnumValueOptionsKtKt.getFeatureSupportOrNull(dsl._builder);
        }

        public final DescriptorProtos.FeatureSet getFeatures() {
            DescriptorProtos.FeatureSet features = this._builder.getFeatures();
            features.getClass();
            return features;
        }

        public final DescriptorProtos.FeatureSet getFeaturesOrNull(Dsl dsl) {
            dsl.getClass();
            return EnumValueOptionsKtKt.getFeaturesOrNull(dsl._builder);
        }

        public final /* synthetic */ DslList getUninterpretedOption() {
            List<DescriptorProtos.UninterpretedOption> uninterpretedOptionList = this._builder.getUninterpretedOptionList();
            uninterpretedOptionList.getClass();
            return new DslList(uninterpretedOptionList);
        }

        public final boolean hasDebugRedact() {
            return this._builder.hasDebugRedact();
        }

        public final boolean hasDeprecated() {
            return this._builder.hasDeprecated();
        }

        public final boolean hasFeatureSupport() {
            return this._builder.hasFeatureSupport();
        }

        public final boolean hasFeatures() {
            return this._builder.hasFeatures();
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.EnumValueOptions> extensionList, E e) {
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

        public final void setDebugRedact(boolean z) {
            this._builder.setDebugRedact(z);
        }

        public final void setDeprecated(boolean z) {
            this._builder.setDeprecated(z);
        }

        public final /* synthetic */ void setExtension(ExtensionLite extension, Object value) {
            extension.getClass();
            value.getClass();
            this._builder.setExtension(extension, value);
        }

        public final void setFeatureSupport(DescriptorProtos.FieldOptions.FeatureSupport featureSupport) {
            featureSupport.getClass();
            this._builder.setFeatureSupport(featureSupport);
        }

        public final void setFeatures(DescriptorProtos.FeatureSet featureSet) {
            featureSet.getClass();
            this._builder.setFeatures(featureSet);
        }

        public final /* synthetic */ void setUninterpretedOption(DslList dslList, int i, DescriptorProtos.UninterpretedOption uninterpretedOption) {
            dslList.getClass();
            uninterpretedOption.getClass();
            this._builder.setUninterpretedOption(i, uninterpretedOption);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/EnumValueOptionsKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/EnumValueOptionsKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$EnumValueOptions$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.EnumValueOptions.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.EnumValueOptions.Builder builder, yx yxVar) {
            this(builder);
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.EnumValueOptions> extensionList, Iterable<? extends E> iterable) {
            extensionList.getClass();
            iterable.getClass();
            addAll(extensionList, iterable);
        }

        public final /* synthetic */ void clear(ExtensionLite extension) {
            extension.getClass();
            this._builder.clearExtension(extension);
        }

        public final /* synthetic */ void set(ExtensionLite<DescriptorProtos.EnumValueOptions, ByteString> extension, ByteString value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends MessageLite> void set(ExtensionLite<DescriptorProtos.EnumValueOptions, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends Comparable<? super T>> void set(ExtensionLite<DescriptorProtos.EnumValueOptions, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }
    }
}
