package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class DescriptorProtos {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* renamed from: com.google.protobuf.DescriptorProtos$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface DescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        EnumDescriptorProto getEnumType(int i);

        int getEnumTypeCount();

        List<EnumDescriptorProto> getEnumTypeList();

        FieldDescriptorProto getExtension(int i);

        int getExtensionCount();

        List<FieldDescriptorProto> getExtensionList();

        DescriptorProto.ExtensionRange getExtensionRange(int i);

        int getExtensionRangeCount();

        List<DescriptorProto.ExtensionRange> getExtensionRangeList();

        FieldDescriptorProto getField(int i);

        int getFieldCount();

        List<FieldDescriptorProto> getFieldList();

        String getName();

        ByteString getNameBytes();

        DescriptorProto getNestedType(int i);

        int getNestedTypeCount();

        List<DescriptorProto> getNestedTypeList();

        OneofDescriptorProto getOneofDecl(int i);

        int getOneofDeclCount();

        List<OneofDescriptorProto> getOneofDeclList();

        MessageOptions getOptions();

        String getReservedName(int i);

        ByteString getReservedNameBytes(int i);

        int getReservedNameCount();

        List<String> getReservedNameList();

        DescriptorProto.ReservedRange getReservedRange(int i);

        int getReservedRangeCount();

        List<DescriptorProto.ReservedRange> getReservedRangeList();

        SymbolVisibility getVisibility();

        boolean hasName();

        boolean hasOptions();

        boolean hasVisibility();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface EnumDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        EnumOptions getOptions();

        String getReservedName(int i);

        ByteString getReservedNameBytes(int i);

        int getReservedNameCount();

        List<String> getReservedNameList();

        EnumDescriptorProto.EnumReservedRange getReservedRange(int i);

        int getReservedRangeCount();

        List<EnumDescriptorProto.EnumReservedRange> getReservedRangeList();

        EnumValueDescriptorProto getValue(int i);

        int getValueCount();

        List<EnumValueDescriptorProto> getValueList();

        SymbolVisibility getVisibility();

        boolean hasName();

        boolean hasOptions();

        boolean hasVisibility();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface EnumOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<EnumOptions, EnumOptions.Builder> {
        boolean getAllowAlias();

        boolean getDeprecated();

        @Deprecated
        boolean getDeprecatedLegacyJsonFieldConflicts();

        FeatureSet getFeatures();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasAllowAlias();

        boolean hasDeprecated();

        @Deprecated
        boolean hasDeprecatedLegacyJsonFieldConflicts();

        boolean hasFeatures();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface EnumValueDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        int getNumber();

        EnumValueOptions getOptions();

        boolean hasName();

        boolean hasNumber();

        boolean hasOptions();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface EnumValueOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<EnumValueOptions, EnumValueOptions.Builder> {
        boolean getDebugRedact();

        boolean getDeprecated();

        FieldOptions.FeatureSupport getFeatureSupport();

        FeatureSet getFeatures();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDebugRedact();

        boolean hasDeprecated();

        boolean hasFeatureSupport();

        boolean hasFeatures();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface ExtensionRangeOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<ExtensionRangeOptions, ExtensionRangeOptions.Builder> {
        ExtensionRangeOptions.Declaration getDeclaration(int i);

        int getDeclarationCount();

        List<ExtensionRangeOptions.Declaration> getDeclarationList();

        FeatureSet getFeatures();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        ExtensionRangeOptions.VerificationState getVerification();

        boolean hasFeatures();

        boolean hasVerification();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface FeatureSetDefaultsOrBuilder extends MessageLiteOrBuilder {
        FeatureSetDefaults.FeatureSetEditionDefault getDefaults(int i);

        int getDefaultsCount();

        List<FeatureSetDefaults.FeatureSetEditionDefault> getDefaultsList();

        Edition getMaximumEdition();

        Edition getMinimumEdition();

        boolean hasMaximumEdition();

        boolean hasMinimumEdition();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface FeatureSetOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<FeatureSet, FeatureSet.Builder> {
        FeatureSet.VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility();

        FeatureSet.EnforceNamingStyle getEnforceNamingStyle();

        FeatureSet.EnumType getEnumType();

        FeatureSet.FieldPresence getFieldPresence();

        FeatureSet.JsonFormat getJsonFormat();

        FeatureSet.MessageEncoding getMessageEncoding();

        FeatureSet.RepeatedFieldEncoding getRepeatedFieldEncoding();

        FeatureSet.Utf8Validation getUtf8Validation();

        boolean hasDefaultSymbolVisibility();

        boolean hasEnforceNamingStyle();

        boolean hasEnumType();

        boolean hasFieldPresence();

        boolean hasJsonFormat();

        boolean hasMessageEncoding();

        boolean hasRepeatedFieldEncoding();

        boolean hasUtf8Validation();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface FieldDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getDefaultValue();

        ByteString getDefaultValueBytes();

        String getExtendee();

        ByteString getExtendeeBytes();

        String getJsonName();

        ByteString getJsonNameBytes();

        FieldDescriptorProto.Label getLabel();

        String getName();

        ByteString getNameBytes();

        int getNumber();

        int getOneofIndex();

        FieldOptions getOptions();

        boolean getProto3Optional();

        FieldDescriptorProto.Type getType();

        String getTypeName();

        ByteString getTypeNameBytes();

        boolean hasDefaultValue();

        boolean hasExtendee();

        boolean hasJsonName();

        boolean hasLabel();

        boolean hasName();

        boolean hasNumber();

        boolean hasOneofIndex();

        boolean hasOptions();

        boolean hasProto3Optional();

        boolean hasType();

        boolean hasTypeName();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface FieldOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<FieldOptions, FieldOptions.Builder> {
        FieldOptions.CType getCtype();

        boolean getDebugRedact();

        boolean getDeprecated();

        FieldOptions.EditionDefault getEditionDefaults(int i);

        int getEditionDefaultsCount();

        List<FieldOptions.EditionDefault> getEditionDefaultsList();

        FieldOptions.FeatureSupport getFeatureSupport();

        FeatureSet getFeatures();

        FieldOptions.JSType getJstype();

        boolean getLazy();

        boolean getPacked();

        FieldOptions.OptionRetention getRetention();

        FieldOptions.OptionTargetType getTargets(int i);

        int getTargetsCount();

        List<FieldOptions.OptionTargetType> getTargetsList();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean getUnverifiedLazy();

        @Deprecated
        boolean getWeak();

        boolean hasCtype();

        boolean hasDebugRedact();

        boolean hasDeprecated();

        boolean hasFeatureSupport();

        boolean hasFeatures();

        boolean hasJstype();

        boolean hasLazy();

        boolean hasPacked();

        boolean hasRetention();

        boolean hasUnverifiedLazy();

        @Deprecated
        boolean hasWeak();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface FileDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getDependency(int i);

        ByteString getDependencyBytes(int i);

        int getDependencyCount();

        List<String> getDependencyList();

        Edition getEdition();

        EnumDescriptorProto getEnumType(int i);

        int getEnumTypeCount();

        List<EnumDescriptorProto> getEnumTypeList();

        FieldDescriptorProto getExtension(int i);

        int getExtensionCount();

        List<FieldDescriptorProto> getExtensionList();

        DescriptorProto getMessageType(int i);

        int getMessageTypeCount();

        List<DescriptorProto> getMessageTypeList();

        String getName();

        ByteString getNameBytes();

        String getOptionDependency(int i);

        ByteString getOptionDependencyBytes(int i);

        int getOptionDependencyCount();

        List<String> getOptionDependencyList();

        FileOptions getOptions();

        String getPackage();

        ByteString getPackageBytes();

        int getPublicDependency(int i);

        int getPublicDependencyCount();

        List<Integer> getPublicDependencyList();

        ServiceDescriptorProto getService(int i);

        int getServiceCount();

        List<ServiceDescriptorProto> getServiceList();

        SourceCodeInfo getSourceCodeInfo();

        String getSyntax();

        ByteString getSyntaxBytes();

        int getWeakDependency(int i);

        int getWeakDependencyCount();

        List<Integer> getWeakDependencyList();

        boolean hasEdition();

        boolean hasName();

        boolean hasOptions();

        boolean hasPackage();

        boolean hasSourceCodeInfo();

        boolean hasSyntax();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface FileDescriptorSetOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<FileDescriptorSet, FileDescriptorSet.Builder> {
        FileDescriptorProto getFile(int i);

        int getFileCount();

        List<FileDescriptorProto> getFileList();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface FileOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<FileOptions, FileOptions.Builder> {
        boolean getCcEnableArenas();

        boolean getCcGenericServices();

        String getCsharpNamespace();

        ByteString getCsharpNamespaceBytes();

        boolean getDeprecated();

        FeatureSet getFeatures();

        String getGoPackage();

        ByteString getGoPackageBytes();

        @Deprecated
        boolean getJavaGenerateEqualsAndHash();

        boolean getJavaGenericServices();

        boolean getJavaMultipleFiles();

        String getJavaOuterClassname();

        ByteString getJavaOuterClassnameBytes();

        String getJavaPackage();

        ByteString getJavaPackageBytes();

        boolean getJavaStringCheckUtf8();

        String getObjcClassPrefix();

        ByteString getObjcClassPrefixBytes();

        FileOptions.OptimizeMode getOptimizeFor();

        String getPhpClassPrefix();

        ByteString getPhpClassPrefixBytes();

        String getPhpMetadataNamespace();

        ByteString getPhpMetadataNamespaceBytes();

        String getPhpNamespace();

        ByteString getPhpNamespaceBytes();

        boolean getPyGenericServices();

        String getRubyPackage();

        ByteString getRubyPackageBytes();

        String getSwiftPrefix();

        ByteString getSwiftPrefixBytes();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasCcEnableArenas();

        boolean hasCcGenericServices();

        boolean hasCsharpNamespace();

        boolean hasDeprecated();

        boolean hasFeatures();

        boolean hasGoPackage();

        @Deprecated
        boolean hasJavaGenerateEqualsAndHash();

        boolean hasJavaGenericServices();

        boolean hasJavaMultipleFiles();

        boolean hasJavaOuterClassname();

        boolean hasJavaPackage();

        boolean hasJavaStringCheckUtf8();

        boolean hasObjcClassPrefix();

        boolean hasOptimizeFor();

        boolean hasPhpClassPrefix();

        boolean hasPhpMetadataNamespace();

        boolean hasPhpNamespace();

        boolean hasPyGenericServices();

        boolean hasRubyPackage();

        boolean hasSwiftPrefix();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface GeneratedCodeInfoOrBuilder extends MessageLiteOrBuilder {
        GeneratedCodeInfo.Annotation getAnnotation(int i);

        int getAnnotationCount();

        List<GeneratedCodeInfo.Annotation> getAnnotationList();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface MessageOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<MessageOptions, MessageOptions.Builder> {
        boolean getDeprecated();

        @Deprecated
        boolean getDeprecatedLegacyJsonFieldConflicts();

        FeatureSet getFeatures();

        boolean getMapEntry();

        boolean getMessageSetWireFormat();

        boolean getNoStandardDescriptorAccessor();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();

        @Deprecated
        boolean hasDeprecatedLegacyJsonFieldConflicts();

        boolean hasFeatures();

        boolean hasMapEntry();

        boolean hasMessageSetWireFormat();

        boolean hasNoStandardDescriptorAccessor();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface MethodDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        boolean getClientStreaming();

        String getInputType();

        ByteString getInputTypeBytes();

        String getName();

        ByteString getNameBytes();

        MethodOptions getOptions();

        String getOutputType();

        ByteString getOutputTypeBytes();

        boolean getServerStreaming();

        boolean hasClientStreaming();

        boolean hasInputType();

        boolean hasName();

        boolean hasOptions();

        boolean hasOutputType();

        boolean hasServerStreaming();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface MethodOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<MethodOptions, MethodOptions.Builder> {
        boolean getDeprecated();

        FeatureSet getFeatures();

        MethodOptions.IdempotencyLevel getIdempotencyLevel();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasFeatures();

        boolean hasIdempotencyLevel();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface OneofDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        OneofOptions getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface OneofOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<OneofOptions, OneofOptions.Builder> {
        FeatureSet getFeatures();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasFeatures();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface ServiceDescriptorProtoOrBuilder extends MessageLiteOrBuilder {
        MethodDescriptorProto getMethod(int i);

        int getMethodCount();

        List<MethodDescriptorProto> getMethodList();

        String getName();

        ByteString getNameBytes();

        ServiceOptions getOptions();

        boolean hasName();

        boolean hasOptions();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface ServiceOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<ServiceOptions, ServiceOptions.Builder> {
        boolean getDeprecated();

        FeatureSet getFeatures();

        UninterpretedOption getUninterpretedOption(int i);

        int getUninterpretedOptionCount();

        List<UninterpretedOption> getUninterpretedOptionList();

        boolean hasDeprecated();

        boolean hasFeatures();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface SourceCodeInfoOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<SourceCodeInfo, SourceCodeInfo.Builder> {
        SourceCodeInfo.Location getLocation(int i);

        int getLocationCount();

        List<SourceCodeInfo.Location> getLocationList();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public interface UninterpretedOptionOrBuilder extends MessageLiteOrBuilder {
        String getAggregateValue();

        ByteString getAggregateValueBytes();

        double getDoubleValue();

        String getIdentifierValue();

        ByteString getIdentifierValueBytes();

        UninterpretedOption.NamePart getName(int i);

        int getNameCount();

        List<UninterpretedOption.NamePart> getNameList();

        long getNegativeIntValue();

        long getPositiveIntValue();

        ByteString getStringValue();

        boolean hasAggregateValue();

        boolean hasDoubleValue();

        boolean hasIdentifierValue();

        boolean hasNegativeIntValue();

        boolean hasPositiveIntValue();

        boolean hasStringValue();
    }

    private DescriptorProtos() {
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class DescriptorProto extends GeneratedMessageLite<DescriptorProto, Builder> implements DescriptorProtoOrBuilder {
        private static final DescriptorProto DEFAULT_INSTANCE;
        public static final int ENUM_TYPE_FIELD_NUMBER = 4;
        public static final int EXTENSION_FIELD_NUMBER = 6;
        public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NESTED_TYPE_FIELD_NUMBER = 3;
        public static final int ONEOF_DECL_FIELD_NUMBER = 8;
        public static final int OPTIONS_FIELD_NUMBER = 7;
        private static volatile Parser<DescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 10;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
        public static final int VISIBILITY_FIELD_NUMBER = 11;
        private int bitField0_;
        private MessageOptions options_;
        private int visibility_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private Internal.ProtobufList<FieldDescriptorProto> field_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<FieldDescriptorProto> extension_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<DescriptorProto> nestedType_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<EnumDescriptorProto> enumType_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<ExtensionRange> extensionRange_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<OneofDescriptorProto> oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<ReservedRange> reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface ExtensionRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            ExtensionRangeOptions getOptions();

            int getStart();

            boolean hasEnd();

            boolean hasOptions();

            boolean hasStart();
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface ReservedRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        static {
            DescriptorProto descriptorProto = new DescriptorProto();
            DEFAULT_INSTANCE = descriptorProto;
            GeneratedMessageLite.registerDefaultInstance(DescriptorProto.class, descriptorProto);
        }

        private DescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
            ensureEnumTypeIsMutable();
            AbstractMessageLite.addAll(iterable, this.enumType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureExtensionIsMutable();
            AbstractMessageLite.addAll(iterable, this.extension_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
            ensureExtensionRangeIsMutable();
            AbstractMessageLite.addAll(iterable, this.extensionRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllField(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureFieldIsMutable();
            AbstractMessageLite.addAll(iterable, this.field_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNestedType(Iterable<? extends DescriptorProto> iterable) {
            ensureNestedTypeIsMutable();
            AbstractMessageLite.addAll(iterable, this.nestedType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOneofDecl(Iterable<? extends OneofDescriptorProto> iterable) {
            ensureOneofDeclIsMutable();
            AbstractMessageLite.addAll(iterable, this.oneofDecl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractMessageLite.addAll(iterable, this.reservedName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
            ensureReservedRangeIsMutable();
            AbstractMessageLite.addAll(iterable, this.reservedRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtensionRange(ExtensionRange extensionRange) {
            extensionRange.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(extensionRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addField(FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureFieldIsMutable();
            this.field_.add(fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNestedType(DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.add(descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOneofDecl(OneofDescriptorProto oneofDescriptorProto) {
            oneofDescriptorProto.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(oneofDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedNameBytes(ByteString byteString) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(ReservedRange reservedRange) {
            reservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(reservedRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtensionRange() {
            this.extensionRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearField() {
            this.field_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNestedType() {
            this.nestedType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOneofDecl() {
            this.oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVisibility() {
            this.bitField0_ &= -5;
            this.visibility_ = 0;
        }

        private void ensureEnumTypeIsMutable() {
            Internal.ProtobufList<EnumDescriptorProto> protobufList = this.enumType_;
            if (!protobufList.isModifiable()) {
                this.enumType_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureExtensionIsMutable() {
            Internal.ProtobufList<FieldDescriptorProto> protobufList = this.extension_;
            if (!protobufList.isModifiable()) {
                this.extension_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureExtensionRangeIsMutable() {
            Internal.ProtobufList<ExtensionRange> protobufList = this.extensionRange_;
            if (!protobufList.isModifiable()) {
                this.extensionRange_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureFieldIsMutable() {
            Internal.ProtobufList<FieldDescriptorProto> protobufList = this.field_;
            if (!protobufList.isModifiable()) {
                this.field_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureNestedTypeIsMutable() {
            Internal.ProtobufList<DescriptorProto> protobufList = this.nestedType_;
            if (!protobufList.isModifiable()) {
                this.nestedType_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureOneofDeclIsMutable() {
            Internal.ProtobufList<OneofDescriptorProto> protobufList = this.oneofDecl_;
            if (!protobufList.isModifiable()) {
                this.oneofDecl_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureReservedNameIsMutable() {
            Internal.ProtobufList<String> protobufList = this.reservedName_;
            if (!protobufList.isModifiable()) {
                this.reservedName_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureReservedRangeIsMutable() {
            Internal.ProtobufList<ReservedRange> protobufList = this.reservedRange_;
            if (!protobufList.isModifiable()) {
                this.reservedRange_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static DescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(MessageOptions messageOptions) {
            messageOptions.getClass();
            MessageOptions messageOptions2 = this.options_;
            if (messageOptions2 != null && messageOptions2 != MessageOptions.getDefaultInstance()) {
                this.options_ = ((MessageOptions.Builder) MessageOptions.newBuilder(this.options_).mergeFrom((MessageOptions.Builder) messageOptions)).buildPartial();
            } else {
                this.options_ = messageOptions;
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer) {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<DescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEnumType(int i) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtension(int i) {
            ensureExtensionIsMutable();
            this.extension_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtensionRange(int i) {
            ensureExtensionRangeIsMutable();
            this.extensionRange_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeField(int i) {
            ensureFieldIsMutable();
            this.field_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNestedType(int i) {
            ensureNestedTypeIsMutable();
            this.nestedType_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeOneofDecl(int i) {
            ensureOneofDeclIsMutable();
            this.oneofDecl_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeReservedRange(int i) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.set(i, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtensionRange(int i, ExtensionRange extensionRange) {
            extensionRange.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.set(i, extensionRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setField(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureFieldIsMutable();
            this.field_.set(i, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNestedType(int i, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.set(i, descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
            oneofDescriptorProto.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.set(i, oneofDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(MessageOptions messageOptions) {
            messageOptions.getClass();
            this.options_ = messageOptions;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedRange(int i, ReservedRange reservedRange) {
            reservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, reservedRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVisibility(SymbolVisibility symbolVisibility) {
            this.visibility_ = symbolVisibility.getNumber();
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new DescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a\u000b᠌\u0002", new Object[]{"bitField0_", "name_", "field_", FieldDescriptorProto.class, "nestedType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", FieldDescriptorProto.class, "options_", "oneofDecl_", OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_", "visibility_", SymbolVisibility.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DescriptorProto> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (DescriptorProto.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public EnumDescriptorProto getEnumType(int i) {
            return this.enumType_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i) {
            return this.enumType_.get(i);
        }

        public List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public FieldDescriptorProto getExtension(int i) {
            return this.extension_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i) {
            return this.extension_.get(i);
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ExtensionRange getExtensionRange(int i) {
            return this.extensionRange_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getExtensionRangeCount() {
            return this.extensionRange_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<ExtensionRange> getExtensionRangeList() {
            return this.extensionRange_;
        }

        public ExtensionRangeOrBuilder getExtensionRangeOrBuilder(int i) {
            return this.extensionRange_.get(i);
        }

        public List<? extends ExtensionRangeOrBuilder> getExtensionRangeOrBuilderList() {
            return this.extensionRange_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public FieldDescriptorProto getField(int i) {
            return this.field_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getFieldCount() {
            return this.field_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<FieldDescriptorProto> getFieldList() {
            return this.field_;
        }

        public FieldDescriptorProtoOrBuilder getFieldOrBuilder(int i) {
            return this.field_.get(i);
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getFieldOrBuilderList() {
            return this.field_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public DescriptorProto getNestedType(int i) {
            return this.nestedType_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getNestedTypeCount() {
            return this.nestedType_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<DescriptorProto> getNestedTypeList() {
            return this.nestedType_;
        }

        public DescriptorProtoOrBuilder getNestedTypeOrBuilder(int i) {
            return this.nestedType_.get(i);
        }

        public List<? extends DescriptorProtoOrBuilder> getNestedTypeOrBuilderList() {
            return this.nestedType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public OneofDescriptorProto getOneofDecl(int i) {
            return this.oneofDecl_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getOneofDeclCount() {
            return this.oneofDecl_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<OneofDescriptorProto> getOneofDeclList() {
            return this.oneofDecl_;
        }

        public OneofDescriptorProtoOrBuilder getOneofDeclOrBuilder(int i) {
            return this.oneofDecl_.get(i);
        }

        public List<? extends OneofDescriptorProtoOrBuilder> getOneofDeclOrBuilderList() {
            return this.oneofDecl_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public MessageOptions getOptions() {
            MessageOptions messageOptions = this.options_;
            if (messageOptions == null) {
                return MessageOptions.getDefaultInstance();
            }
            return messageOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ByteString getReservedNameBytes(int i) {
            return ByteString.copyFromUtf8(this.reservedName_.get(i));
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public ReservedRange getReservedRange(int i) {
            return this.reservedRange_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public List<ReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public ReservedRangeOrBuilder getReservedRangeOrBuilder(int i) {
            return this.reservedRange_.get(i);
        }

        public List<? extends ReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public SymbolVisibility getVisibility() {
            SymbolVisibility forNumber = SymbolVisibility.forNumber(this.visibility_);
            if (forNumber == null) {
                return SymbolVisibility.VISIBILITY_UNSET;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public boolean hasName() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public boolean hasOptions() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
        public boolean hasVisibility() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class ExtensionRange extends GeneratedMessageLite<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
            private static final ExtensionRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            public static final int OPTIONS_FIELD_NUMBER = 3;
            private static volatile Parser<ExtensionRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private byte memoizedIsInitialized = 2;
            private ExtensionRangeOptions options_;
            private int start_;

            static {
                ExtensionRange extensionRange = new ExtensionRange();
                DEFAULT_INSTANCE = extensionRange;
                GeneratedMessageLite.registerDefaultInstance(ExtensionRange.class, extensionRange);
            }

            private ExtensionRange() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOptions() {
                this.options_ = null;
                this.bitField0_ &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static ExtensionRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeOptions(ExtensionRangeOptions extensionRangeOptions) {
                extensionRangeOptions.getClass();
                ExtensionRangeOptions extensionRangeOptions2 = this.options_;
                if (extensionRangeOptions2 != null && extensionRangeOptions2 != ExtensionRangeOptions.getDefaultInstance()) {
                    this.options_ = ((ExtensionRangeOptions.Builder) ExtensionRangeOptions.newBuilder(this.options_).mergeFrom((ExtensionRangeOptions.Builder) extensionRangeOptions)).buildPartial();
                } else {
                    this.options_ = extensionRangeOptions;
                }
                this.bitField0_ |= 4;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream) {
                return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer) {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ExtensionRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOptions(ExtensionRangeOptions extensionRangeOptions) {
                extensionRangeOptions.getClass();
                this.options_ = extensionRangeOptions;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new ExtensionRange();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ExtensionRange> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (ExtensionRange.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        if (obj == null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        this.memoizedIsInitialized = (byte) i;
                        return null;
                    default:
                        throw null;
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public ExtensionRangeOptions getOptions() {
                ExtensionRangeOptions extensionRangeOptions = this.options_;
                if (extensionRangeOptions == null) {
                    return ExtensionRangeOptions.getDefaultInstance();
                }
                return extensionRangeOptions;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasEnd() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasOptions() {
                if ((this.bitField0_ & 4) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
            public boolean hasStart() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<ExtensionRange, Builder> implements ExtensionRangeOrBuilder {
                private Builder() {
                    super(ExtensionRange.DEFAULT_INSTANCE);
                }

                public Builder clearEnd() {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).clearEnd();
                    return this;
                }

                public Builder clearOptions() {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).clearOptions();
                    return this;
                }

                public Builder clearStart() {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).clearStart();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public int getEnd() {
                    return ((ExtensionRange) this.instance).getEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public ExtensionRangeOptions getOptions() {
                    return ((ExtensionRange) this.instance).getOptions();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public int getStart() {
                    return ((ExtensionRange) this.instance).getStart();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public boolean hasEnd() {
                    return ((ExtensionRange) this.instance).hasEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public boolean hasOptions() {
                    return ((ExtensionRange) this.instance).hasOptions();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ExtensionRangeOrBuilder
                public boolean hasStart() {
                    return ((ExtensionRange) this.instance).hasStart();
                }

                public Builder mergeOptions(ExtensionRangeOptions extensionRangeOptions) {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).mergeOptions(extensionRangeOptions);
                    return this;
                }

                public Builder setEnd(int i) {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).setEnd(i);
                    return this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Builder setOptions(ExtensionRangeOptions.Builder builder) {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).setOptions((ExtensionRangeOptions) builder.build());
                    return this;
                }

                public Builder setStart(int i) {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).setStart(i);
                    return this;
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder setOptions(ExtensionRangeOptions extensionRangeOptions) {
                    copyOnWrite();
                    ((ExtensionRange) this.instance).setOptions(extensionRangeOptions);
                    return this;
                }
            }

            public static Builder newBuilder(ExtensionRange extensionRange) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(extensionRange);
            }

            public static ExtensionRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(ByteString byteString) {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ExtensionRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(byte[] bArr) {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ExtensionRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(InputStream inputStream) {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ExtensionRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ExtensionRange parseFrom(CodedInputStream codedInputStream) {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ExtensionRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class ReservedRange extends GeneratedMessageLite<ReservedRange, Builder> implements ReservedRangeOrBuilder {
            private static final ReservedRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile Parser<ReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            static {
                ReservedRange reservedRange = new ReservedRange();
                DEFAULT_INSTANCE = reservedRange;
                GeneratedMessageLite.registerDefaultInstance(ReservedRange.class, reservedRange);
            }

            private ReservedRange() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static ReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream) {
                return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer) {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<ReservedRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
                AnonymousClass1 anonymousClass1 = null;
                switch (i) {
                    case 1:
                        return new ReservedRange();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<ReservedRange> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (ReservedRange.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return (byte) 1;
                    default:
                        throw null;
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public boolean hasEnd() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
            public boolean hasStart() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<ReservedRange, Builder> implements ReservedRangeOrBuilder {
                private Builder() {
                    super(ReservedRange.DEFAULT_INSTANCE);
                }

                public Builder clearEnd() {
                    copyOnWrite();
                    ((ReservedRange) this.instance).clearEnd();
                    return this;
                }

                public Builder clearStart() {
                    copyOnWrite();
                    ((ReservedRange) this.instance).clearStart();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public int getEnd() {
                    return ((ReservedRange) this.instance).getEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public int getStart() {
                    return ((ReservedRange) this.instance).getStart();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public boolean hasEnd() {
                    return ((ReservedRange) this.instance).hasEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.DescriptorProto.ReservedRangeOrBuilder
                public boolean hasStart() {
                    return ((ReservedRange) this.instance).hasStart();
                }

                public Builder setEnd(int i) {
                    copyOnWrite();
                    ((ReservedRange) this.instance).setEnd(i);
                    return this;
                }

                public Builder setStart(int i) {
                    copyOnWrite();
                    ((ReservedRange) this.instance).setStart(i);
                    return this;
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            public static Builder newBuilder(ReservedRange reservedRange) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(reservedRange);
            }

            public static ReservedRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ReservedRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static ReservedRange parseFrom(ByteString byteString) {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static ReservedRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static ReservedRange parseFrom(byte[] bArr) {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ReservedRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static ReservedRange parseFrom(InputStream inputStream) {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ReservedRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static ReservedRange parseFrom(CodedInputStream codedInputStream) {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static ReservedRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProto, Builder> implements DescriptorProtoOrBuilder {
            private Builder() {
                super(DescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllEnumType(iterable);
                return this;
            }

            public Builder addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllExtension(iterable);
                return this;
            }

            public Builder addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllExtensionRange(iterable);
                return this;
            }

            public Builder addAllField(Iterable<? extends FieldDescriptorProto> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllField(iterable);
                return this;
            }

            public Builder addAllNestedType(Iterable<? extends DescriptorProto> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllNestedType(iterable);
                return this;
            }

            public Builder addAllOneofDecl(Iterable<? extends OneofDescriptorProto> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllOneofDecl(iterable);
                return this;
            }

            public Builder addAllReservedName(Iterable<String> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllReservedName(iterable);
                return this;
            }

            public Builder addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addAllReservedRange(iterable);
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addEnumType(builder.build());
                return this;
            }

            public Builder addExtension(FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtension(builder.build());
                return this;
            }

            public Builder addExtensionRange(ExtensionRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtensionRange(builder.build());
                return this;
            }

            public Builder addField(FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addField(builder.build());
                return this;
            }

            public Builder addNestedType(Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addNestedType(builder.build());
                return this;
            }

            public Builder addOneofDecl(OneofDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addOneofDecl(builder.build());
                return this;
            }

            public Builder addReservedName(String str) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedName(str);
                return this;
            }

            public Builder addReservedNameBytes(ByteString byteString) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedNameBytes(byteString);
                return this;
            }

            public Builder addReservedRange(ReservedRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedRange(builder.build());
                return this;
            }

            public Builder clearEnumType() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearEnumType();
                return this;
            }

            public Builder clearExtension() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearExtension();
                return this;
            }

            public Builder clearExtensionRange() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearExtensionRange();
                return this;
            }

            public Builder clearField() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearField();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearNestedType() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearNestedType();
                return this;
            }

            public Builder clearOneofDecl() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearOneofDecl();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearOptions();
                return this;
            }

            public Builder clearReservedName() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearReservedName();
                return this;
            }

            public Builder clearReservedRange() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearReservedRange();
                return this;
            }

            public Builder clearVisibility() {
                copyOnWrite();
                ((DescriptorProto) this.instance).clearVisibility();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public EnumDescriptorProto getEnumType(int i) {
                return ((DescriptorProto) this.instance).getEnumType(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getEnumTypeCount() {
                return ((DescriptorProto) this.instance).getEnumTypeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<EnumDescriptorProto> getEnumTypeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getEnumTypeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public FieldDescriptorProto getExtension(int i) {
                return ((DescriptorProto) this.instance).getExtension(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getExtensionCount() {
                return ((DescriptorProto) this.instance).getExtensionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<FieldDescriptorProto> getExtensionList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getExtensionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ExtensionRange getExtensionRange(int i) {
                return ((DescriptorProto) this.instance).getExtensionRange(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getExtensionRangeCount() {
                return ((DescriptorProto) this.instance).getExtensionRangeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<ExtensionRange> getExtensionRangeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getExtensionRangeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public FieldDescriptorProto getField(int i) {
                return ((DescriptorProto) this.instance).getField(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getFieldCount() {
                return ((DescriptorProto) this.instance).getFieldCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<FieldDescriptorProto> getFieldList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getFieldList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public String getName() {
                return ((DescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((DescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public DescriptorProto getNestedType(int i) {
                return ((DescriptorProto) this.instance).getNestedType(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getNestedTypeCount() {
                return ((DescriptorProto) this.instance).getNestedTypeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<DescriptorProto> getNestedTypeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getNestedTypeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public OneofDescriptorProto getOneofDecl(int i) {
                return ((DescriptorProto) this.instance).getOneofDecl(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getOneofDeclCount() {
                return ((DescriptorProto) this.instance).getOneofDeclCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<OneofDescriptorProto> getOneofDeclList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getOneofDeclList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public MessageOptions getOptions() {
                return ((DescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public String getReservedName(int i) {
                return ((DescriptorProto) this.instance).getReservedName(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ByteString getReservedNameBytes(int i) {
                return ((DescriptorProto) this.instance).getReservedNameBytes(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getReservedNameCount() {
                return ((DescriptorProto) this.instance).getReservedNameCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getReservedNameList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public ReservedRange getReservedRange(int i) {
                return ((DescriptorProto) this.instance).getReservedRange(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public int getReservedRangeCount() {
                return ((DescriptorProto) this.instance).getReservedRangeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public List<ReservedRange> getReservedRangeList() {
                return Collections.unmodifiableList(((DescriptorProto) this.instance).getReservedRangeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public SymbolVisibility getVisibility() {
                return ((DescriptorProto) this.instance).getVisibility();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public boolean hasName() {
                return ((DescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((DescriptorProto) this.instance).hasOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.DescriptorProtoOrBuilder
            public boolean hasVisibility() {
                return ((DescriptorProto) this.instance).hasVisibility();
            }

            public Builder mergeOptions(MessageOptions messageOptions) {
                copyOnWrite();
                ((DescriptorProto) this.instance).mergeOptions(messageOptions);
                return this;
            }

            public Builder removeEnumType(int i) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeEnumType(i);
                return this;
            }

            public Builder removeExtension(int i) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeExtension(i);
                return this;
            }

            public Builder removeExtensionRange(int i) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeExtensionRange(i);
                return this;
            }

            public Builder removeField(int i) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeField(i);
                return this;
            }

            public Builder removeNestedType(int i) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeNestedType(i);
                return this;
            }

            public Builder removeOneofDecl(int i) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeOneofDecl(i);
                return this;
            }

            public Builder removeReservedRange(int i) {
                copyOnWrite();
                ((DescriptorProto) this.instance).removeReservedRange(i);
                return this;
            }

            public Builder setEnumType(int i, EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setEnumType(i, builder.build());
                return this;
            }

            public Builder setExtension(int i, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setExtension(i, builder.build());
                return this;
            }

            public Builder setExtensionRange(int i, ExtensionRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setExtensionRange(i, builder.build());
                return this;
            }

            public Builder setField(int i, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setField(i, builder.build());
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNestedType(int i, Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setNestedType(i, builder.build());
                return this;
            }

            public Builder setOneofDecl(int i, OneofDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setOneofDecl(i, builder.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(MessageOptions.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setOptions((MessageOptions) builder.build());
                return this;
            }

            public Builder setReservedName(int i, String str) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setReservedName(i, str);
                return this;
            }

            public Builder setReservedRange(int i, ReservedRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setReservedRange(i, builder.build());
                return this;
            }

            public Builder setVisibility(SymbolVisibility symbolVisibility) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setVisibility(symbolVisibility);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addEnumType(i, enumDescriptorProto);
                return this;
            }

            public Builder addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtension(i, fieldDescriptorProto);
                return this;
            }

            public Builder addExtensionRange(int i, ExtensionRange extensionRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtensionRange(i, extensionRange);
                return this;
            }

            public Builder addField(int i, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addField(i, fieldDescriptorProto);
                return this;
            }

            public Builder addNestedType(int i, DescriptorProto descriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addNestedType(i, descriptorProto);
                return this;
            }

            public Builder addOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addOneofDecl(i, oneofDescriptorProto);
                return this;
            }

            public Builder addReservedRange(int i, ReservedRange reservedRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedRange(i, reservedRange);
                return this;
            }

            public Builder setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setEnumType(i, enumDescriptorProto);
                return this;
            }

            public Builder setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setExtension(i, fieldDescriptorProto);
                return this;
            }

            public Builder setExtensionRange(int i, ExtensionRange extensionRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setExtensionRange(i, extensionRange);
                return this;
            }

            public Builder setField(int i, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setField(i, fieldDescriptorProto);
                return this;
            }

            public Builder setNestedType(int i, DescriptorProto descriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setNestedType(i, descriptorProto);
                return this;
            }

            public Builder setOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setOneofDecl(i, oneofDescriptorProto);
                return this;
            }

            public Builder setOptions(MessageOptions messageOptions) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setOptions(messageOptions);
                return this;
            }

            public Builder setReservedRange(int i, ReservedRange reservedRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).setReservedRange(i, reservedRange);
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addEnumType(enumDescriptorProto);
                return this;
            }

            public Builder addExtension(FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtension(fieldDescriptorProto);
                return this;
            }

            public Builder addExtensionRange(ExtensionRange extensionRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtensionRange(extensionRange);
                return this;
            }

            public Builder addField(FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addField(fieldDescriptorProto);
                return this;
            }

            public Builder addNestedType(DescriptorProto descriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addNestedType(descriptorProto);
                return this;
            }

            public Builder addOneofDecl(OneofDescriptorProto oneofDescriptorProto) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addOneofDecl(oneofDescriptorProto);
                return this;
            }

            public Builder addReservedRange(ReservedRange reservedRange) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedRange(reservedRange);
                return this;
            }

            public Builder addEnumType(int i, EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addEnumType(i, builder.build());
                return this;
            }

            public Builder addExtension(int i, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtension(i, builder.build());
                return this;
            }

            public Builder addExtensionRange(int i, ExtensionRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addExtensionRange(i, builder.build());
                return this;
            }

            public Builder addField(int i, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addField(i, builder.build());
                return this;
            }

            public Builder addNestedType(int i, Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addNestedType(i, builder.build());
                return this;
            }

            public Builder addOneofDecl(int i, OneofDescriptorProto.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addOneofDecl(i, builder.build());
                return this;
            }

            public Builder addReservedRange(int i, ReservedRange.Builder builder) {
                copyOnWrite();
                ((DescriptorProto) this.instance).addReservedRange(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(DescriptorProto descriptorProto) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProto);
        }

        public static DescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(ByteString byteString) {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static DescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(i, enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(i, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtensionRange(int i, ExtensionRange extensionRange) {
            extensionRange.getClass();
            ensureExtensionRangeIsMutable();
            this.extensionRange_.add(i, extensionRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addField(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureFieldIsMutable();
            this.field_.add(i, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNestedType(int i, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureNestedTypeIsMutable();
            this.nestedType_.add(i, descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOneofDecl(int i, OneofDescriptorProto oneofDescriptorProto) {
            oneofDescriptorProto.getClass();
            ensureOneofDeclIsMutable();
            this.oneofDecl_.add(i, oneofDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(int i, ReservedRange reservedRange) {
            reservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(i, reservedRange);
        }

        public static DescriptorProto parseFrom(byte[] bArr) {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(InputStream inputStream) {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static DescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static DescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class EnumDescriptorProto extends GeneratedMessageLite<EnumDescriptorProto, Builder> implements EnumDescriptorProtoOrBuilder {
        private static final EnumDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<EnumDescriptorProto> PARSER = null;
        public static final int RESERVED_NAME_FIELD_NUMBER = 5;
        public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
        public static final int VALUE_FIELD_NUMBER = 2;
        public static final int VISIBILITY_FIELD_NUMBER = 6;
        private int bitField0_;
        private EnumOptions options_;
        private int visibility_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private Internal.ProtobufList<EnumValueDescriptorProto> value_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<EnumReservedRange> reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> reservedName_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface EnumReservedRangeOrBuilder extends MessageLiteOrBuilder {
            int getEnd();

            int getStart();

            boolean hasEnd();

            boolean hasStart();
        }

        static {
            EnumDescriptorProto enumDescriptorProto = new EnumDescriptorProto();
            DEFAULT_INSTANCE = enumDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(EnumDescriptorProto.class, enumDescriptorProto);
        }

        private EnumDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedName(Iterable<String> iterable) {
            ensureReservedNameIsMutable();
            AbstractMessageLite.addAll(iterable, this.reservedName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
            ensureReservedRangeIsMutable();
            AbstractMessageLite.addAll(iterable, this.reservedRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllValue(Iterable<? extends EnumValueDescriptorProto> iterable) {
            ensureValueIsMutable();
            AbstractMessageLite.addAll(iterable, this.value_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedName(String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedNameBytes(ByteString byteString) {
            ensureReservedNameIsMutable();
            this.reservedName_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(EnumReservedRange enumReservedRange) {
            enumReservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(enumReservedRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValue(EnumValueDescriptorProto enumValueDescriptorProto) {
            enumValueDescriptorProto.getClass();
            ensureValueIsMutable();
            this.value_.add(enumValueDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedName() {
            this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReservedRange() {
            this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVisibility() {
            this.bitField0_ &= -5;
            this.visibility_ = 0;
        }

        private void ensureReservedNameIsMutable() {
            Internal.ProtobufList<String> protobufList = this.reservedName_;
            if (!protobufList.isModifiable()) {
                this.reservedName_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureReservedRangeIsMutable() {
            Internal.ProtobufList<EnumReservedRange> protobufList = this.reservedRange_;
            if (!protobufList.isModifiable()) {
                this.reservedRange_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureValueIsMutable() {
            Internal.ProtobufList<EnumValueDescriptorProto> protobufList = this.value_;
            if (!protobufList.isModifiable()) {
                this.value_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static EnumDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(EnumOptions enumOptions) {
            enumOptions.getClass();
            EnumOptions enumOptions2 = this.options_;
            if (enumOptions2 != null && enumOptions2 != EnumOptions.getDefaultInstance()) {
                this.options_ = ((EnumOptions.Builder) EnumOptions.newBuilder(this.options_).mergeFrom((EnumOptions.Builder) enumOptions)).buildPartial();
            } else {
                this.options_ = enumOptions;
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnumDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeReservedRange(int i) {
            ensureReservedRangeIsMutable();
            this.reservedRange_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeValue(int i) {
            ensureValueIsMutable();
            this.value_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(EnumOptions enumOptions) {
            enumOptions.getClass();
            this.options_ = enumOptions;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedName(int i, String str) {
            str.getClass();
            ensureReservedNameIsMutable();
            this.reservedName_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReservedRange(int i, EnumReservedRange enumReservedRange) {
            enumReservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.set(i, enumReservedRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
            enumValueDescriptorProto.getClass();
            ensureValueIsMutable();
            this.value_.set(i, enumValueDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVisibility(SymbolVisibility symbolVisibility) {
            this.visibility_ = symbolVisibility.getNumber();
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a\u0006᠌\u0002", new Object[]{"bitField0_", "name_", "value_", EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_", "visibility_", SymbolVisibility.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnumDescriptorProto> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (EnumDescriptorProto.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public EnumOptions getOptions() {
            EnumOptions enumOptions = this.options_;
            if (enumOptions == null) {
                return EnumOptions.getDefaultInstance();
            }
            return enumOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public String getReservedName(int i) {
            return this.reservedName_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public ByteString getReservedNameBytes(int i) {
            return ByteString.copyFromUtf8(this.reservedName_.get(i));
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public int getReservedNameCount() {
            return this.reservedName_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public List<String> getReservedNameList() {
            return this.reservedName_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public EnumReservedRange getReservedRange(int i) {
            return this.reservedRange_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public int getReservedRangeCount() {
            return this.reservedRange_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public List<EnumReservedRange> getReservedRangeList() {
            return this.reservedRange_;
        }

        public EnumReservedRangeOrBuilder getReservedRangeOrBuilder(int i) {
            return this.reservedRange_.get(i);
        }

        public List<? extends EnumReservedRangeOrBuilder> getReservedRangeOrBuilderList() {
            return this.reservedRange_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public EnumValueDescriptorProto getValue(int i) {
            return this.value_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public int getValueCount() {
            return this.value_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public List<EnumValueDescriptorProto> getValueList() {
            return this.value_;
        }

        public EnumValueDescriptorProtoOrBuilder getValueOrBuilder(int i) {
            return this.value_.get(i);
        }

        public List<? extends EnumValueDescriptorProtoOrBuilder> getValueOrBuilderList() {
            return this.value_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public SymbolVisibility getVisibility() {
            SymbolVisibility forNumber = SymbolVisibility.forNumber(this.visibility_);
            if (forNumber == null) {
                return SymbolVisibility.VISIBILITY_UNSET;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public boolean hasName() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public boolean hasOptions() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
        public boolean hasVisibility() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class EnumReservedRange extends GeneratedMessageLite<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
            private static final EnumReservedRange DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 2;
            private static volatile Parser<EnumReservedRange> PARSER = null;
            public static final int START_FIELD_NUMBER = 1;
            private int bitField0_;
            private int end_;
            private int start_;

            static {
                EnumReservedRange enumReservedRange = new EnumReservedRange();
                DEFAULT_INSTANCE = enumReservedRange;
                GeneratedMessageLite.registerDefaultInstance(EnumReservedRange.class, enumReservedRange);
            }

            private EnumReservedRange() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -3;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearStart() {
                this.bitField0_ &= -2;
                this.start_ = 0;
            }

            public static EnumReservedRange getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) {
                return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<EnumReservedRange> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 2;
                this.end_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setStart(int i) {
                this.bitField0_ |= 1;
                this.start_ = i;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
                AnonymousClass1 anonymousClass1 = null;
                switch (i) {
                    case 1:
                        return new EnumReservedRange();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<EnumReservedRange> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (EnumReservedRange.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return (byte) 1;
                    default:
                        throw null;
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public int getStart() {
                return this.start_;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public boolean hasEnd() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
            public boolean hasStart() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<EnumReservedRange, Builder> implements EnumReservedRangeOrBuilder {
                private Builder() {
                    super(EnumReservedRange.DEFAULT_INSTANCE);
                }

                public Builder clearEnd() {
                    copyOnWrite();
                    ((EnumReservedRange) this.instance).clearEnd();
                    return this;
                }

                public Builder clearStart() {
                    copyOnWrite();
                    ((EnumReservedRange) this.instance).clearStart();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public int getEnd() {
                    return ((EnumReservedRange) this.instance).getEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public int getStart() {
                    return ((EnumReservedRange) this.instance).getStart();
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public boolean hasEnd() {
                    return ((EnumReservedRange) this.instance).hasEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProto.EnumReservedRangeOrBuilder
                public boolean hasStart() {
                    return ((EnumReservedRange) this.instance).hasStart();
                }

                public Builder setEnd(int i) {
                    copyOnWrite();
                    ((EnumReservedRange) this.instance).setEnd(i);
                    return this;
                }

                public Builder setStart(int i) {
                    copyOnWrite();
                    ((EnumReservedRange) this.instance).setStart(i);
                    return this;
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            public static Builder newBuilder(EnumReservedRange enumReservedRange) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(enumReservedRange);
            }

            public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static EnumReservedRange parseFrom(ByteString byteString) {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EnumReservedRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static EnumReservedRange parseFrom(byte[] bArr) {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EnumReservedRange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream) {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EnumReservedRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EnumReservedRange parseFrom(CodedInputStream codedInputStream) {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static EnumReservedRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<EnumDescriptorProto, Builder> implements EnumDescriptorProtoOrBuilder {
            private Builder() {
                super(EnumDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder addAllReservedName(Iterable<String> iterable) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addAllReservedName(iterable);
                return this;
            }

            public Builder addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addAllReservedRange(iterable);
                return this;
            }

            public Builder addAllValue(Iterable<? extends EnumValueDescriptorProto> iterable) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addAllValue(iterable);
                return this;
            }

            public Builder addReservedName(String str) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedName(str);
                return this;
            }

            public Builder addReservedNameBytes(ByteString byteString) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedNameBytes(byteString);
                return this;
            }

            public Builder addReservedRange(EnumReservedRange.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedRange(builder.build());
                return this;
            }

            public Builder addValue(EnumValueDescriptorProto.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addValue(builder.build());
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearOptions();
                return this;
            }

            public Builder clearReservedName() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearReservedName();
                return this;
            }

            public Builder clearReservedRange() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearReservedRange();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearValue();
                return this;
            }

            public Builder clearVisibility() {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).clearVisibility();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public String getName() {
                return ((EnumDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((EnumDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public EnumOptions getOptions() {
                return ((EnumDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public String getReservedName(int i) {
                return ((EnumDescriptorProto) this.instance).getReservedName(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public ByteString getReservedNameBytes(int i) {
                return ((EnumDescriptorProto) this.instance).getReservedNameBytes(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public int getReservedNameCount() {
                return ((EnumDescriptorProto) this.instance).getReservedNameCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public List<String> getReservedNameList() {
                return Collections.unmodifiableList(((EnumDescriptorProto) this.instance).getReservedNameList());
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public EnumReservedRange getReservedRange(int i) {
                return ((EnumDescriptorProto) this.instance).getReservedRange(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public int getReservedRangeCount() {
                return ((EnumDescriptorProto) this.instance).getReservedRangeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public List<EnumReservedRange> getReservedRangeList() {
                return Collections.unmodifiableList(((EnumDescriptorProto) this.instance).getReservedRangeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public EnumValueDescriptorProto getValue(int i) {
                return ((EnumDescriptorProto) this.instance).getValue(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public int getValueCount() {
                return ((EnumDescriptorProto) this.instance).getValueCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public List<EnumValueDescriptorProto> getValueList() {
                return Collections.unmodifiableList(((EnumDescriptorProto) this.instance).getValueList());
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public SymbolVisibility getVisibility() {
                return ((EnumDescriptorProto) this.instance).getVisibility();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((EnumDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((EnumDescriptorProto) this.instance).hasOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumDescriptorProtoOrBuilder
            public boolean hasVisibility() {
                return ((EnumDescriptorProto) this.instance).hasVisibility();
            }

            public Builder mergeOptions(EnumOptions enumOptions) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).mergeOptions(enumOptions);
                return this;
            }

            public Builder removeReservedRange(int i) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).removeReservedRange(i);
                return this;
            }

            public Builder removeValue(int i) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).removeValue(i);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(EnumOptions.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setOptions((EnumOptions) builder.build());
                return this;
            }

            public Builder setReservedName(int i, String str) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setReservedName(i, str);
                return this;
            }

            public Builder setReservedRange(int i, EnumReservedRange.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setReservedRange(i, builder.build());
                return this;
            }

            public Builder setValue(int i, EnumValueDescriptorProto.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setValue(i, builder.build());
                return this;
            }

            public Builder setVisibility(SymbolVisibility symbolVisibility) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setVisibility(symbolVisibility);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addReservedRange(int i, EnumReservedRange enumReservedRange) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedRange(i, enumReservedRange);
                return this;
            }

            public Builder addValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addValue(i, enumValueDescriptorProto);
                return this;
            }

            public Builder setOptions(EnumOptions enumOptions) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setOptions(enumOptions);
                return this;
            }

            public Builder setReservedRange(int i, EnumReservedRange enumReservedRange) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setReservedRange(i, enumReservedRange);
                return this;
            }

            public Builder setValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).setValue(i, enumValueDescriptorProto);
                return this;
            }

            public Builder addReservedRange(EnumReservedRange enumReservedRange) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedRange(enumReservedRange);
                return this;
            }

            public Builder addValue(EnumValueDescriptorProto enumValueDescriptorProto) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addValue(enumValueDescriptorProto);
                return this;
            }

            public Builder addReservedRange(int i, EnumReservedRange.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addReservedRange(i, builder.build());
                return this;
            }

            public Builder addValue(int i, EnumValueDescriptorProto.Builder builder) {
                copyOnWrite();
                ((EnumDescriptorProto) this.instance).addValue(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(EnumDescriptorProto enumDescriptorProto) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(enumDescriptorProto);
        }

        public static EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnumDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addReservedRange(int i, EnumReservedRange enumReservedRange) {
            enumReservedRange.getClass();
            ensureReservedRangeIsMutable();
            this.reservedRange_.add(i, enumReservedRange);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValue(int i, EnumValueDescriptorProto enumValueDescriptorProto) {
            enumValueDescriptorProto.getClass();
            ensureValueIsMutable();
            this.value_.add(i, enumValueDescriptorProto);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnumDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class ExtensionRangeOptions extends GeneratedMessageLite.ExtendableMessage<ExtensionRangeOptions, Builder> implements ExtensionRangeOptionsOrBuilder {
        public static final int DECLARATION_FIELD_NUMBER = 2;
        private static final ExtensionRangeOptions DEFAULT_INSTANCE;
        public static final int FEATURES_FIELD_NUMBER = 50;
        private static volatile Parser<ExtensionRangeOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int VERIFICATION_FIELD_NUMBER = 3;
        private int bitField0_;
        private FeatureSet features_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Declaration> declaration_ = GeneratedMessageLite.emptyProtobufList();
        private int verification_ = 1;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface DeclarationOrBuilder extends MessageLiteOrBuilder {
            String getFullName();

            ByteString getFullNameBytes();

            int getNumber();

            boolean getRepeated();

            boolean getReserved();

            String getType();

            ByteString getTypeBytes();

            boolean hasFullName();

            boolean hasNumber();

            boolean hasRepeated();

            boolean hasReserved();

            boolean hasType();
        }

        static {
            ExtensionRangeOptions extensionRangeOptions = new ExtensionRangeOptions();
            DEFAULT_INSTANCE = extensionRangeOptions;
            GeneratedMessageLite.registerDefaultInstance(ExtensionRangeOptions.class, extensionRangeOptions);
        }

        private ExtensionRangeOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDeclaration(Iterable<? extends Declaration> iterable) {
            ensureDeclarationIsMutable();
            AbstractMessageLite.addAll(iterable, this.declaration_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeclaration(Declaration declaration) {
            declaration.getClass();
            ensureDeclarationIsMutable();
            this.declaration_.add(declaration);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeclaration() {
            this.declaration_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerification() {
            this.bitField0_ &= -3;
            this.verification_ = 1;
        }

        private void ensureDeclarationIsMutable() {
            Internal.ProtobufList<Declaration> protobufList = this.declaration_;
            if (!protobufList.isModifiable()) {
                this.declaration_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (!protobufList.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static ExtensionRangeOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            FeatureSet featureSet2 = this.features_;
            if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                this.features_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.features_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
            } else {
                this.features_ = featureSet;
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ExtensionRangeOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDeclaration(int i) {
            ensureDeclarationIsMutable();
            this.declaration_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeclaration(int i, Declaration declaration) {
            declaration.getClass();
            ensureDeclarationIsMutable();
            this.declaration_.set(i, declaration);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            this.features_ = featureSet;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerification(VerificationState verificationState) {
            this.verification_ = verificationState.getNumber();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ExtensionRangeOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0002ϧ\u0004\u0000\u0002\u0002\u0002\u001b\u0003᠌\u00012ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "declaration_", Declaration.class, "verification_", VerificationState.internalGetVerifier(), "features_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ExtensionRangeOptions> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (ExtensionRangeOptions.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public Declaration getDeclaration(int i) {
            return this.declaration_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public int getDeclarationCount() {
            return this.declaration_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public List<Declaration> getDeclarationList() {
            return this.declaration_;
        }

        public DeclarationOrBuilder getDeclarationOrBuilder(int i) {
            return this.declaration_.get(i);
        }

        public List<? extends DeclarationOrBuilder> getDeclarationOrBuilderList() {
            return this.declaration_;
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            if (featureSet == null) {
                return FeatureSet.getDefaultInstance();
            }
            return featureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public VerificationState getVerification() {
            VerificationState forNumber = VerificationState.forNumber(this.verification_);
            if (forNumber == null) {
                return VerificationState.UNVERIFIED;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public boolean hasFeatures() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
        public boolean hasVerification() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Declaration extends GeneratedMessageLite<Declaration, Builder> implements DeclarationOrBuilder {
            private static final Declaration DEFAULT_INSTANCE;
            public static final int FULL_NAME_FIELD_NUMBER = 2;
            public static final int NUMBER_FIELD_NUMBER = 1;
            private static volatile Parser<Declaration> PARSER = null;
            public static final int REPEATED_FIELD_NUMBER = 6;
            public static final int RESERVED_FIELD_NUMBER = 5;
            public static final int TYPE_FIELD_NUMBER = 3;
            private int bitField0_;
            private int number_;
            private boolean repeated_;
            private boolean reserved_;
            private String fullName_ = "";
            private String type_ = "";

            static {
                Declaration declaration = new Declaration();
                DEFAULT_INSTANCE = declaration;
                GeneratedMessageLite.registerDefaultInstance(Declaration.class, declaration);
            }

            private Declaration() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFullName() {
                this.bitField0_ &= -3;
                this.fullName_ = getDefaultInstance().getFullName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNumber() {
                this.bitField0_ &= -2;
                this.number_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRepeated() {
                this.bitField0_ &= -17;
                this.repeated_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearReserved() {
                this.bitField0_ &= -9;
                this.reserved_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearType() {
                this.bitField0_ &= -5;
                this.type_ = getDefaultInstance().getType();
            }

            public static Declaration getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Declaration parseDelimitedFrom(InputStream inputStream) {
                return (Declaration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Declaration parseFrom(ByteBuffer byteBuffer) {
                return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Declaration> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFullName(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.fullName_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFullNameBytes(ByteString byteString) {
                this.fullName_ = byteString.toStringUtf8();
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumber(int i) {
                this.bitField0_ |= 1;
                this.number_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRepeated(boolean z) {
                this.bitField0_ |= 16;
                this.repeated_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setReserved(boolean z) {
                this.bitField0_ |= 8;
                this.reserved_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setType(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.type_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTypeBytes(ByteString byteString) {
                this.type_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
                AnonymousClass1 anonymousClass1 = null;
                switch (i) {
                    case 1:
                        return new Declaration();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "number_", "fullName_", "type_", "reserved_", "repeated_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Declaration> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (Declaration.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return (byte) 1;
                    default:
                        throw null;
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public String getFullName() {
                return this.fullName_;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public ByteString getFullNameBytes() {
                return ByteString.copyFromUtf8(this.fullName_);
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public int getNumber() {
                return this.number_;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public boolean getRepeated() {
                return this.repeated_;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public boolean getReserved() {
                return this.reserved_;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public String getType() {
                return this.type_;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public ByteString getTypeBytes() {
                return ByteString.copyFromUtf8(this.type_);
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasFullName() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasNumber() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasRepeated() {
                if ((this.bitField0_ & 16) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasReserved() {
                if ((this.bitField0_ & 8) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
            public boolean hasType() {
                if ((this.bitField0_ & 4) != 0) {
                    return true;
                }
                return false;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Declaration, Builder> implements DeclarationOrBuilder {
                private Builder() {
                    super(Declaration.DEFAULT_INSTANCE);
                }

                public Builder clearFullName() {
                    copyOnWrite();
                    ((Declaration) this.instance).clearFullName();
                    return this;
                }

                public Builder clearNumber() {
                    copyOnWrite();
                    ((Declaration) this.instance).clearNumber();
                    return this;
                }

                public Builder clearRepeated() {
                    copyOnWrite();
                    ((Declaration) this.instance).clearRepeated();
                    return this;
                }

                public Builder clearReserved() {
                    copyOnWrite();
                    ((Declaration) this.instance).clearReserved();
                    return this;
                }

                public Builder clearType() {
                    copyOnWrite();
                    ((Declaration) this.instance).clearType();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public String getFullName() {
                    return ((Declaration) this.instance).getFullName();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public ByteString getFullNameBytes() {
                    return ((Declaration) this.instance).getFullNameBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public int getNumber() {
                    return ((Declaration) this.instance).getNumber();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public boolean getRepeated() {
                    return ((Declaration) this.instance).getRepeated();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public boolean getReserved() {
                    return ((Declaration) this.instance).getReserved();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public String getType() {
                    return ((Declaration) this.instance).getType();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public ByteString getTypeBytes() {
                    return ((Declaration) this.instance).getTypeBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public boolean hasFullName() {
                    return ((Declaration) this.instance).hasFullName();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public boolean hasNumber() {
                    return ((Declaration) this.instance).hasNumber();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public boolean hasRepeated() {
                    return ((Declaration) this.instance).hasRepeated();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public boolean hasReserved() {
                    return ((Declaration) this.instance).hasReserved();
                }

                @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.DeclarationOrBuilder
                public boolean hasType() {
                    return ((Declaration) this.instance).hasType();
                }

                public Builder setFullName(String str) {
                    copyOnWrite();
                    ((Declaration) this.instance).setFullName(str);
                    return this;
                }

                public Builder setFullNameBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Declaration) this.instance).setFullNameBytes(byteString);
                    return this;
                }

                public Builder setNumber(int i) {
                    copyOnWrite();
                    ((Declaration) this.instance).setNumber(i);
                    return this;
                }

                public Builder setRepeated(boolean z) {
                    copyOnWrite();
                    ((Declaration) this.instance).setRepeated(z);
                    return this;
                }

                public Builder setReserved(boolean z) {
                    copyOnWrite();
                    ((Declaration) this.instance).setReserved(z);
                    return this;
                }

                public Builder setType(String str) {
                    copyOnWrite();
                    ((Declaration) this.instance).setType(str);
                    return this;
                }

                public Builder setTypeBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Declaration) this.instance).setTypeBytes(byteString);
                    return this;
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            public static Builder newBuilder(Declaration declaration) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(declaration);
            }

            public static Declaration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Declaration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Declaration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Declaration parseFrom(ByteString byteString) {
                return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Declaration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Declaration parseFrom(byte[] bArr) {
                return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Declaration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Declaration parseFrom(InputStream inputStream) {
                return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Declaration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Declaration parseFrom(CodedInputStream codedInputStream) {
                return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Declaration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Declaration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ExtensionRangeOptions, Builder> implements ExtensionRangeOptionsOrBuilder {
            private Builder() {
                super(ExtensionRangeOptions.DEFAULT_INSTANCE);
            }

            public Builder addAllDeclaration(Iterable<? extends Declaration> iterable) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addAllDeclaration(iterable);
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addDeclaration(Declaration.Builder builder) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addDeclaration(builder.build());
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder clearDeclaration() {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).clearDeclaration();
                return this;
            }

            public Builder clearFeatures() {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).clearFeatures();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder clearVerification() {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).clearVerification();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public Declaration getDeclaration(int i) {
                return ((ExtensionRangeOptions) this.instance).getDeclaration(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public int getDeclarationCount() {
                return ((ExtensionRangeOptions) this.instance).getDeclarationCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public List<Declaration> getDeclarationList() {
                return Collections.unmodifiableList(((ExtensionRangeOptions) this.instance).getDeclarationList());
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public FeatureSet getFeatures() {
                return ((ExtensionRangeOptions) this.instance).getFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
                return ((ExtensionRangeOptions) this.instance).getUninterpretedOption(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((ExtensionRangeOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((ExtensionRangeOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public VerificationState getVerification() {
                return ((ExtensionRangeOptions) this.instance).getVerification();
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public boolean hasFeatures() {
                return ((ExtensionRangeOptions) this.instance).hasFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.ExtensionRangeOptionsOrBuilder
            public boolean hasVerification() {
                return ((ExtensionRangeOptions) this.instance).hasVerification();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).mergeFeatures(featureSet);
                return this;
            }

            public Builder removeDeclaration(int i) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).removeDeclaration(i);
                return this;
            }

            public Builder removeUninterpretedOption(int i) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).removeUninterpretedOption(i);
                return this;
            }

            public Builder setDeclaration(int i, Declaration.Builder builder) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).setDeclaration(i, builder.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFeatures(FeatureSet.Builder builder) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).setFeatures((FeatureSet) builder.build());
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).setUninterpretedOption(i, builder.build());
                return this;
            }

            public Builder setVerification(VerificationState verificationState) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).setVerification(verificationState);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addDeclaration(int i, Declaration declaration) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addDeclaration(i, declaration);
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder setDeclaration(int i, Declaration declaration) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).setDeclaration(i, declaration);
                return this;
            }

            public Builder setFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).setFeatures(featureSet);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder addDeclaration(Declaration declaration) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addDeclaration(declaration);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder addDeclaration(int i, Declaration.Builder builder) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addDeclaration(i, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ExtensionRangeOptions) this.instance).addUninterpretedOption(i, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum VerificationState implements Internal.EnumLite {
            DECLARATION(0),
            UNVERIFIED(1);

            public static final int DECLARATION_VALUE = 0;
            public static final int UNVERIFIED_VALUE = 1;
            private static final Internal.EnumLiteMap<VerificationState> internalValueMap = new Internal.EnumLiteMap<VerificationState>() { // from class: com.google.protobuf.DescriptorProtos.ExtensionRangeOptions.VerificationState.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public VerificationState findValueByNumber(int i) {
                    return VerificationState.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class VerificationStateVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new VerificationStateVerifier();

                private VerificationStateVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (VerificationState.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            VerificationState(int i) {
                this.value = i;
            }

            public static VerificationState forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return null;
                    }
                    return UNVERIFIED;
                }
                return DECLARATION;
            }

            public static Internal.EnumLiteMap<VerificationState> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return VerificationStateVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static VerificationState valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(ExtensionRangeOptions extensionRangeOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(extensionRangeOptions);
        }

        public static ExtensionRangeOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExtensionRangeOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ExtensionRangeOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDeclaration(int i, Declaration declaration) {
            declaration.getClass();
            ensureDeclarationIsMutable();
            this.declaration_.add(i, declaration);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExtensionRangeOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRangeOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ExtensionRangeOptions parseFrom(CodedInputStream codedInputStream) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ExtensionRangeOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExtensionRangeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class FeatureSet extends GeneratedMessageLite.ExtendableMessage<FeatureSet, Builder> implements FeatureSetOrBuilder {
        private static final FeatureSet DEFAULT_INSTANCE;
        public static final int DEFAULT_SYMBOL_VISIBILITY_FIELD_NUMBER = 8;
        public static final int ENFORCE_NAMING_STYLE_FIELD_NUMBER = 7;
        public static final int ENUM_TYPE_FIELD_NUMBER = 2;
        public static final int FIELD_PRESENCE_FIELD_NUMBER = 1;
        public static final int JSON_FORMAT_FIELD_NUMBER = 6;
        public static final int MESSAGE_ENCODING_FIELD_NUMBER = 5;
        private static volatile Parser<FeatureSet> PARSER = null;
        public static final int REPEATED_FIELD_ENCODING_FIELD_NUMBER = 3;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 4;
        private int bitField0_;
        private int defaultSymbolVisibility_;
        private int enforceNamingStyle_;
        private int enumType_;
        private int fieldPresence_;
        private int jsonFormat_;
        private byte memoizedIsInitialized = 2;
        private int messageEncoding_;
        private int repeatedFieldEncoding_;
        private int utf8Validation_;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface VisibilityFeatureOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            FeatureSet featureSet = new FeatureSet();
            DEFAULT_INSTANCE = featureSet;
            GeneratedMessageLite.registerDefaultInstance(FeatureSet.class, featureSet);
        }

        private FeatureSet() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaultSymbolVisibility() {
            this.bitField0_ &= -129;
            this.defaultSymbolVisibility_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnforceNamingStyle() {
            this.bitField0_ &= -65;
            this.enforceNamingStyle_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumType() {
            this.bitField0_ &= -3;
            this.enumType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFieldPresence() {
            this.bitField0_ &= -2;
            this.fieldPresence_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJsonFormat() {
            this.bitField0_ &= -33;
            this.jsonFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageEncoding() {
            this.bitField0_ &= -17;
            this.messageEncoding_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRepeatedFieldEncoding() {
            this.bitField0_ &= -5;
            this.repeatedFieldEncoding_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUtf8Validation() {
            this.bitField0_ &= -9;
            this.utf8Validation_ = 0;
        }

        public static FeatureSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureSet parseDelimitedFrom(InputStream inputStream) {
            return (FeatureSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSet parseFrom(ByteBuffer byteBuffer) {
            return (FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FeatureSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultSymbolVisibility(VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibility) {
            this.defaultSymbolVisibility_ = defaultSymbolVisibility.getNumber();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnforceNamingStyle(EnforceNamingStyle enforceNamingStyle) {
            this.enforceNamingStyle_ = enforceNamingStyle.getNumber();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumType(EnumType enumType) {
            this.enumType_ = enumType.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFieldPresence(FieldPresence fieldPresence) {
            this.fieldPresence_ = fieldPresence.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJsonFormat(JsonFormat jsonFormat) {
            this.jsonFormat_ = jsonFormat.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageEncoding(MessageEncoding messageEncoding) {
            this.messageEncoding_ = messageEncoding.getNumber();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRepeatedFieldEncoding(RepeatedFieldEncoding repeatedFieldEncoding) {
            this.repeatedFieldEncoding_ = repeatedFieldEncoding.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUtf8Validation(Utf8Validation utf8Validation) {
            this.utf8Validation_ = utf8Validation.getNumber();
            this.bitField0_ |= 8;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FeatureSet();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"bitField0_", "fieldPresence_", FieldPresence.internalGetVerifier(), "enumType_", EnumType.internalGetVerifier(), "repeatedFieldEncoding_", RepeatedFieldEncoding.internalGetVerifier(), "utf8Validation_", Utf8Validation.internalGetVerifier(), "messageEncoding_", MessageEncoding.internalGetVerifier(), "jsonFormat_", JsonFormat.internalGetVerifier(), "enforceNamingStyle_", EnforceNamingStyle.internalGetVerifier(), "defaultSymbolVisibility_", VisibilityFeature.DefaultSymbolVisibility.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FeatureSet> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (FeatureSet.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
            VisibilityFeature.DefaultSymbolVisibility forNumber = VisibilityFeature.DefaultSymbolVisibility.forNumber(this.defaultSymbolVisibility_);
            if (forNumber == null) {
                return VisibilityFeature.DefaultSymbolVisibility.DEFAULT_SYMBOL_VISIBILITY_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public EnforceNamingStyle getEnforceNamingStyle() {
            EnforceNamingStyle forNumber = EnforceNamingStyle.forNumber(this.enforceNamingStyle_);
            if (forNumber == null) {
                return EnforceNamingStyle.ENFORCE_NAMING_STYLE_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public EnumType getEnumType() {
            EnumType forNumber = EnumType.forNumber(this.enumType_);
            if (forNumber == null) {
                return EnumType.ENUM_TYPE_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public FieldPresence getFieldPresence() {
            FieldPresence forNumber = FieldPresence.forNumber(this.fieldPresence_);
            if (forNumber == null) {
                return FieldPresence.FIELD_PRESENCE_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public JsonFormat getJsonFormat() {
            JsonFormat forNumber = JsonFormat.forNumber(this.jsonFormat_);
            if (forNumber == null) {
                return JsonFormat.JSON_FORMAT_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public MessageEncoding getMessageEncoding() {
            MessageEncoding forNumber = MessageEncoding.forNumber(this.messageEncoding_);
            if (forNumber == null) {
                return MessageEncoding.MESSAGE_ENCODING_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public RepeatedFieldEncoding getRepeatedFieldEncoding() {
            RepeatedFieldEncoding forNumber = RepeatedFieldEncoding.forNumber(this.repeatedFieldEncoding_);
            if (forNumber == null) {
                return RepeatedFieldEncoding.REPEATED_FIELD_ENCODING_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public Utf8Validation getUtf8Validation() {
            Utf8Validation forNumber = Utf8Validation.forNumber(this.utf8Validation_);
            if (forNumber == null) {
                return Utf8Validation.UTF8_VALIDATION_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public boolean hasDefaultSymbolVisibility() {
            if ((this.bitField0_ & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public boolean hasEnforceNamingStyle() {
            if ((this.bitField0_ & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public boolean hasEnumType() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public boolean hasFieldPresence() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public boolean hasJsonFormat() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public boolean hasMessageEncoding() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public boolean hasRepeatedFieldEncoding() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
        public boolean hasUtf8Validation() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class VisibilityFeature extends GeneratedMessageLite<VisibilityFeature, Builder> implements VisibilityFeatureOrBuilder {
            private static final VisibilityFeature DEFAULT_INSTANCE;
            private static volatile Parser<VisibilityFeature> PARSER;

            static {
                VisibilityFeature visibilityFeature = new VisibilityFeature();
                DEFAULT_INSTANCE = visibilityFeature;
                GeneratedMessageLite.registerDefaultInstance(VisibilityFeature.class, visibilityFeature);
            }

            private VisibilityFeature() {
            }

            public static VisibilityFeature getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static VisibilityFeature parseDelimitedFrom(InputStream inputStream) {
                return (VisibilityFeature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static VisibilityFeature parseFrom(ByteBuffer byteBuffer) {
                return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<VisibilityFeature> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
                AnonymousClass1 anonymousClass1 = null;
                switch (i) {
                    case 1:
                        return new VisibilityFeature();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<VisibilityFeature> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (VisibilityFeature.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return (byte) 1;
                    default:
                        throw null;
                }
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<VisibilityFeature, Builder> implements VisibilityFeatureOrBuilder {
                private Builder() {
                    super(VisibilityFeature.DEFAULT_INSTANCE);
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public enum DefaultSymbolVisibility implements Internal.EnumLite {
                DEFAULT_SYMBOL_VISIBILITY_UNKNOWN(0),
                EXPORT_ALL(1),
                EXPORT_TOP_LEVEL(2),
                LOCAL_ALL(3),
                STRICT(4);

                public static final int DEFAULT_SYMBOL_VISIBILITY_UNKNOWN_VALUE = 0;
                public static final int EXPORT_ALL_VALUE = 1;
                public static final int EXPORT_TOP_LEVEL_VALUE = 2;
                public static final int LOCAL_ALL_VALUE = 3;
                public static final int STRICT_VALUE = 4;
                private static final Internal.EnumLiteMap<DefaultSymbolVisibility> internalValueMap = new Internal.EnumLiteMap<DefaultSymbolVisibility>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.VisibilityFeature.DefaultSymbolVisibility.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public DefaultSymbolVisibility findValueByNumber(int i) {
                        return DefaultSymbolVisibility.forNumber(i);
                    }
                };
                private final int value;

                /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
                /* loaded from: classes.dex */
                public static final class DefaultSymbolVisibilityVerifier implements Internal.EnumVerifier {
                    static final Internal.EnumVerifier INSTANCE = new DefaultSymbolVisibilityVerifier();

                    private DefaultSymbolVisibilityVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        if (DefaultSymbolVisibility.forNumber(i) != null) {
                            return true;
                        }
                        return false;
                    }
                }

                DefaultSymbolVisibility(int i) {
                    this.value = i;
                }

                public static DefaultSymbolVisibility forNumber(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        return null;
                                    }
                                    return STRICT;
                                }
                                return LOCAL_ALL;
                            }
                            return EXPORT_TOP_LEVEL;
                        }
                        return EXPORT_ALL;
                    }
                    return DEFAULT_SYMBOL_VISIBILITY_UNKNOWN;
                }

                public static Internal.EnumLiteMap<DefaultSymbolVisibility> internalGetValueMap() {
                    return internalValueMap;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return DefaultSymbolVisibilityVerifier.INSTANCE;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static DefaultSymbolVisibility valueOf(int i) {
                    return forNumber(i);
                }
            }

            public static Builder newBuilder(VisibilityFeature visibilityFeature) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(visibilityFeature);
            }

            public static VisibilityFeature parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityFeature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static VisibilityFeature parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static VisibilityFeature parseFrom(ByteString byteString) {
                return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static VisibilityFeature parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static VisibilityFeature parseFrom(byte[] bArr) {
                return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static VisibilityFeature parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static VisibilityFeature parseFrom(InputStream inputStream) {
                return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static VisibilityFeature parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static VisibilityFeature parseFrom(CodedInputStream codedInputStream) {
                return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static VisibilityFeature parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (VisibilityFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<FeatureSet, Builder> implements FeatureSetOrBuilder {
            private Builder() {
                super(FeatureSet.DEFAULT_INSTANCE);
            }

            public Builder clearDefaultSymbolVisibility() {
                copyOnWrite();
                ((FeatureSet) this.instance).clearDefaultSymbolVisibility();
                return this;
            }

            public Builder clearEnforceNamingStyle() {
                copyOnWrite();
                ((FeatureSet) this.instance).clearEnforceNamingStyle();
                return this;
            }

            public Builder clearEnumType() {
                copyOnWrite();
                ((FeatureSet) this.instance).clearEnumType();
                return this;
            }

            public Builder clearFieldPresence() {
                copyOnWrite();
                ((FeatureSet) this.instance).clearFieldPresence();
                return this;
            }

            public Builder clearJsonFormat() {
                copyOnWrite();
                ((FeatureSet) this.instance).clearJsonFormat();
                return this;
            }

            public Builder clearMessageEncoding() {
                copyOnWrite();
                ((FeatureSet) this.instance).clearMessageEncoding();
                return this;
            }

            public Builder clearRepeatedFieldEncoding() {
                copyOnWrite();
                ((FeatureSet) this.instance).clearRepeatedFieldEncoding();
                return this;
            }

            public Builder clearUtf8Validation() {
                copyOnWrite();
                ((FeatureSet) this.instance).clearUtf8Validation();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
                return ((FeatureSet) this.instance).getDefaultSymbolVisibility();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public EnforceNamingStyle getEnforceNamingStyle() {
                return ((FeatureSet) this.instance).getEnforceNamingStyle();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public EnumType getEnumType() {
                return ((FeatureSet) this.instance).getEnumType();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public FieldPresence getFieldPresence() {
                return ((FeatureSet) this.instance).getFieldPresence();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public JsonFormat getJsonFormat() {
                return ((FeatureSet) this.instance).getJsonFormat();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public MessageEncoding getMessageEncoding() {
                return ((FeatureSet) this.instance).getMessageEncoding();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public RepeatedFieldEncoding getRepeatedFieldEncoding() {
                return ((FeatureSet) this.instance).getRepeatedFieldEncoding();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public Utf8Validation getUtf8Validation() {
                return ((FeatureSet) this.instance).getUtf8Validation();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public boolean hasDefaultSymbolVisibility() {
                return ((FeatureSet) this.instance).hasDefaultSymbolVisibility();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public boolean hasEnforceNamingStyle() {
                return ((FeatureSet) this.instance).hasEnforceNamingStyle();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public boolean hasEnumType() {
                return ((FeatureSet) this.instance).hasEnumType();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public boolean hasFieldPresence() {
                return ((FeatureSet) this.instance).hasFieldPresence();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public boolean hasJsonFormat() {
                return ((FeatureSet) this.instance).hasJsonFormat();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public boolean hasMessageEncoding() {
                return ((FeatureSet) this.instance).hasMessageEncoding();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public boolean hasRepeatedFieldEncoding() {
                return ((FeatureSet) this.instance).hasRepeatedFieldEncoding();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetOrBuilder
            public boolean hasUtf8Validation() {
                return ((FeatureSet) this.instance).hasUtf8Validation();
            }

            public Builder setDefaultSymbolVisibility(VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibility) {
                copyOnWrite();
                ((FeatureSet) this.instance).setDefaultSymbolVisibility(defaultSymbolVisibility);
                return this;
            }

            public Builder setEnforceNamingStyle(EnforceNamingStyle enforceNamingStyle) {
                copyOnWrite();
                ((FeatureSet) this.instance).setEnforceNamingStyle(enforceNamingStyle);
                return this;
            }

            public Builder setEnumType(EnumType enumType) {
                copyOnWrite();
                ((FeatureSet) this.instance).setEnumType(enumType);
                return this;
            }

            public Builder setFieldPresence(FieldPresence fieldPresence) {
                copyOnWrite();
                ((FeatureSet) this.instance).setFieldPresence(fieldPresence);
                return this;
            }

            public Builder setJsonFormat(JsonFormat jsonFormat) {
                copyOnWrite();
                ((FeatureSet) this.instance).setJsonFormat(jsonFormat);
                return this;
            }

            public Builder setMessageEncoding(MessageEncoding messageEncoding) {
                copyOnWrite();
                ((FeatureSet) this.instance).setMessageEncoding(messageEncoding);
                return this;
            }

            public Builder setRepeatedFieldEncoding(RepeatedFieldEncoding repeatedFieldEncoding) {
                copyOnWrite();
                ((FeatureSet) this.instance).setRepeatedFieldEncoding(repeatedFieldEncoding);
                return this;
            }

            public Builder setUtf8Validation(Utf8Validation utf8Validation) {
                copyOnWrite();
                ((FeatureSet) this.instance).setUtf8Validation(utf8Validation);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum EnforceNamingStyle implements Internal.EnumLite {
            ENFORCE_NAMING_STYLE_UNKNOWN(0),
            STYLE2024(1),
            STYLE_LEGACY(2);

            public static final int ENFORCE_NAMING_STYLE_UNKNOWN_VALUE = 0;
            public static final int STYLE2024_VALUE = 1;
            public static final int STYLE_LEGACY_VALUE = 2;
            private static final Internal.EnumLiteMap<EnforceNamingStyle> internalValueMap = new Internal.EnumLiteMap<EnforceNamingStyle>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.EnforceNamingStyle.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public EnforceNamingStyle findValueByNumber(int i) {
                    return EnforceNamingStyle.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class EnforceNamingStyleVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new EnforceNamingStyleVerifier();

                private EnforceNamingStyleVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (EnforceNamingStyle.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            EnforceNamingStyle(int i) {
                this.value = i;
            }

            public static EnforceNamingStyle forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return STYLE_LEGACY;
                    }
                    return STYLE2024;
                }
                return ENFORCE_NAMING_STYLE_UNKNOWN;
            }

            public static Internal.EnumLiteMap<EnforceNamingStyle> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return EnforceNamingStyleVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static EnforceNamingStyle valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum EnumType implements Internal.EnumLite {
            ENUM_TYPE_UNKNOWN(0),
            OPEN(1),
            CLOSED(2);

            public static final int CLOSED_VALUE = 2;
            public static final int ENUM_TYPE_UNKNOWN_VALUE = 0;
            public static final int OPEN_VALUE = 1;
            private static final Internal.EnumLiteMap<EnumType> internalValueMap = new Internal.EnumLiteMap<EnumType>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.EnumType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public EnumType findValueByNumber(int i) {
                    return EnumType.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class EnumTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new EnumTypeVerifier();

                private EnumTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (EnumType.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            EnumType(int i) {
                this.value = i;
            }

            public static EnumType forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return CLOSED;
                    }
                    return OPEN;
                }
                return ENUM_TYPE_UNKNOWN;
            }

            public static Internal.EnumLiteMap<EnumType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return EnumTypeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static EnumType valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum FieldPresence implements Internal.EnumLite {
            FIELD_PRESENCE_UNKNOWN(0),
            EXPLICIT(1),
            IMPLICIT(2),
            LEGACY_REQUIRED(3);

            public static final int EXPLICIT_VALUE = 1;
            public static final int FIELD_PRESENCE_UNKNOWN_VALUE = 0;
            public static final int IMPLICIT_VALUE = 2;
            public static final int LEGACY_REQUIRED_VALUE = 3;
            private static final Internal.EnumLiteMap<FieldPresence> internalValueMap = new Internal.EnumLiteMap<FieldPresence>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.FieldPresence.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public FieldPresence findValueByNumber(int i) {
                    return FieldPresence.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class FieldPresenceVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new FieldPresenceVerifier();

                private FieldPresenceVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (FieldPresence.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            FieldPresence(int i) {
                this.value = i;
            }

            public static FieldPresence forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return LEGACY_REQUIRED;
                        }
                        return IMPLICIT;
                    }
                    return EXPLICIT;
                }
                return FIELD_PRESENCE_UNKNOWN;
            }

            public static Internal.EnumLiteMap<FieldPresence> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return FieldPresenceVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static FieldPresence valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum JsonFormat implements Internal.EnumLite {
            JSON_FORMAT_UNKNOWN(0),
            ALLOW(1),
            LEGACY_BEST_EFFORT(2);

            public static final int ALLOW_VALUE = 1;
            public static final int JSON_FORMAT_UNKNOWN_VALUE = 0;
            public static final int LEGACY_BEST_EFFORT_VALUE = 2;
            private static final Internal.EnumLiteMap<JsonFormat> internalValueMap = new Internal.EnumLiteMap<JsonFormat>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.JsonFormat.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public JsonFormat findValueByNumber(int i) {
                    return JsonFormat.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class JsonFormatVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new JsonFormatVerifier();

                private JsonFormatVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (JsonFormat.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            JsonFormat(int i) {
                this.value = i;
            }

            public static JsonFormat forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return LEGACY_BEST_EFFORT;
                    }
                    return ALLOW;
                }
                return JSON_FORMAT_UNKNOWN;
            }

            public static Internal.EnumLiteMap<JsonFormat> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return JsonFormatVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static JsonFormat valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum MessageEncoding implements Internal.EnumLite {
            MESSAGE_ENCODING_UNKNOWN(0),
            LENGTH_PREFIXED(1),
            DELIMITED(2);

            public static final int DELIMITED_VALUE = 2;
            public static final int LENGTH_PREFIXED_VALUE = 1;
            public static final int MESSAGE_ENCODING_UNKNOWN_VALUE = 0;
            private static final Internal.EnumLiteMap<MessageEncoding> internalValueMap = new Internal.EnumLiteMap<MessageEncoding>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.MessageEncoding.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public MessageEncoding findValueByNumber(int i) {
                    return MessageEncoding.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class MessageEncodingVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new MessageEncodingVerifier();

                private MessageEncodingVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (MessageEncoding.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            MessageEncoding(int i) {
                this.value = i;
            }

            public static MessageEncoding forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return DELIMITED;
                    }
                    return LENGTH_PREFIXED;
                }
                return MESSAGE_ENCODING_UNKNOWN;
            }

            public static Internal.EnumLiteMap<MessageEncoding> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return MessageEncodingVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static MessageEncoding valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum RepeatedFieldEncoding implements Internal.EnumLite {
            REPEATED_FIELD_ENCODING_UNKNOWN(0),
            PACKED(1),
            EXPANDED(2);

            public static final int EXPANDED_VALUE = 2;
            public static final int PACKED_VALUE = 1;
            public static final int REPEATED_FIELD_ENCODING_UNKNOWN_VALUE = 0;
            private static final Internal.EnumLiteMap<RepeatedFieldEncoding> internalValueMap = new Internal.EnumLiteMap<RepeatedFieldEncoding>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.RepeatedFieldEncoding.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RepeatedFieldEncoding findValueByNumber(int i) {
                    return RepeatedFieldEncoding.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class RepeatedFieldEncodingVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new RepeatedFieldEncodingVerifier();

                private RepeatedFieldEncodingVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (RepeatedFieldEncoding.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            RepeatedFieldEncoding(int i) {
                this.value = i;
            }

            public static RepeatedFieldEncoding forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return EXPANDED;
                    }
                    return PACKED;
                }
                return REPEATED_FIELD_ENCODING_UNKNOWN;
            }

            public static Internal.EnumLiteMap<RepeatedFieldEncoding> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return RepeatedFieldEncodingVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static RepeatedFieldEncoding valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum Utf8Validation implements Internal.EnumLite {
            UTF8_VALIDATION_UNKNOWN(0),
            VERIFY(2),
            NONE(3);

            public static final int NONE_VALUE = 3;
            public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
            public static final int VERIFY_VALUE = 2;
            private static final Internal.EnumLiteMap<Utf8Validation> internalValueMap = new Internal.EnumLiteMap<Utf8Validation>() { // from class: com.google.protobuf.DescriptorProtos.FeatureSet.Utf8Validation.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Utf8Validation findValueByNumber(int i) {
                    return Utf8Validation.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Utf8ValidationVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new Utf8ValidationVerifier();

                private Utf8ValidationVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (Utf8Validation.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            Utf8Validation(int i) {
                this.value = i;
            }

            public static Utf8Validation forNumber(int i) {
                if (i != 0) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return NONE;
                    }
                    return VERIFY;
                }
                return UTF8_VALIDATION_UNKNOWN;
            }

            public static Internal.EnumLiteMap<Utf8Validation> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return Utf8ValidationVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Utf8Validation valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(FeatureSet featureSet) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(featureSet);
        }

        public static FeatureSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FeatureSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FeatureSet parseFrom(ByteString byteString) {
            return (FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FeatureSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FeatureSet parseFrom(byte[] bArr) {
            return (FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FeatureSet parseFrom(InputStream inputStream) {
            return (FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FeatureSet parseFrom(CodedInputStream codedInputStream) {
            return (FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FeatureSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class FeatureSetDefaults extends GeneratedMessageLite<FeatureSetDefaults, Builder> implements FeatureSetDefaultsOrBuilder {
        public static final int DEFAULTS_FIELD_NUMBER = 1;
        private static final FeatureSetDefaults DEFAULT_INSTANCE;
        public static final int MAXIMUM_EDITION_FIELD_NUMBER = 5;
        public static final int MINIMUM_EDITION_FIELD_NUMBER = 4;
        private static volatile Parser<FeatureSetDefaults> PARSER;
        private int bitField0_;
        private int maximumEdition_;
        private int minimumEdition_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<FeatureSetEditionDefault> defaults_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface FeatureSetEditionDefaultOrBuilder extends MessageLiteOrBuilder {
            Edition getEdition();

            FeatureSet getFixedFeatures();

            FeatureSet getOverridableFeatures();

            boolean hasEdition();

            boolean hasFixedFeatures();

            boolean hasOverridableFeatures();
        }

        static {
            FeatureSetDefaults featureSetDefaults = new FeatureSetDefaults();
            DEFAULT_INSTANCE = featureSetDefaults;
            GeneratedMessageLite.registerDefaultInstance(FeatureSetDefaults.class, featureSetDefaults);
        }

        private FeatureSetDefaults() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDefaults(Iterable<? extends FeatureSetEditionDefault> iterable) {
            ensureDefaultsIsMutable();
            AbstractMessageLite.addAll(iterable, this.defaults_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDefaults(FeatureSetEditionDefault featureSetEditionDefault) {
            featureSetEditionDefault.getClass();
            ensureDefaultsIsMutable();
            this.defaults_.add(featureSetEditionDefault);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaults() {
            this.defaults_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaximumEdition() {
            this.bitField0_ &= -3;
            this.maximumEdition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinimumEdition() {
            this.bitField0_ &= -2;
            this.minimumEdition_ = 0;
        }

        private void ensureDefaultsIsMutable() {
            Internal.ProtobufList<FeatureSetEditionDefault> protobufList = this.defaults_;
            if (!protobufList.isModifiable()) {
                this.defaults_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static FeatureSetDefaults getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureSetDefaults parseDelimitedFrom(InputStream inputStream) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSetDefaults parseFrom(ByteBuffer byteBuffer) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FeatureSetDefaults> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDefaults(int i) {
            ensureDefaultsIsMutable();
            this.defaults_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaults(int i, FeatureSetEditionDefault featureSetEditionDefault) {
            featureSetEditionDefault.getClass();
            ensureDefaultsIsMutable();
            this.defaults_.set(i, featureSetEditionDefault);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaximumEdition(Edition edition) {
            this.maximumEdition_ = edition.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinimumEdition(Edition edition) {
            this.minimumEdition_ = edition.getNumber();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FeatureSetDefaults();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001Л\u0004᠌\u0000\u0005᠌\u0001", new Object[]{"bitField0_", "defaults_", FeatureSetEditionDefault.class, "minimumEdition_", Edition.internalGetVerifier(), "maximumEdition_", Edition.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FeatureSetDefaults> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (FeatureSetDefaults.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
        public FeatureSetEditionDefault getDefaults(int i) {
            return this.defaults_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
        public int getDefaultsCount() {
            return this.defaults_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
        public List<FeatureSetEditionDefault> getDefaultsList() {
            return this.defaults_;
        }

        public FeatureSetEditionDefaultOrBuilder getDefaultsOrBuilder(int i) {
            return this.defaults_.get(i);
        }

        public List<? extends FeatureSetEditionDefaultOrBuilder> getDefaultsOrBuilderList() {
            return this.defaults_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
        public Edition getMaximumEdition() {
            Edition forNumber = Edition.forNumber(this.maximumEdition_);
            if (forNumber == null) {
                return Edition.EDITION_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
        public Edition getMinimumEdition() {
            Edition forNumber = Edition.forNumber(this.minimumEdition_);
            if (forNumber == null) {
                return Edition.EDITION_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
        public boolean hasMaximumEdition() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
        public boolean hasMinimumEdition() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class FeatureSetEditionDefault extends GeneratedMessageLite<FeatureSetEditionDefault, Builder> implements FeatureSetEditionDefaultOrBuilder {
            private static final FeatureSetEditionDefault DEFAULT_INSTANCE;
            public static final int EDITION_FIELD_NUMBER = 3;
            public static final int FIXED_FEATURES_FIELD_NUMBER = 5;
            public static final int OVERRIDABLE_FEATURES_FIELD_NUMBER = 4;
            private static volatile Parser<FeatureSetEditionDefault> PARSER;
            private int bitField0_;
            private int edition_;
            private FeatureSet fixedFeatures_;
            private byte memoizedIsInitialized = 2;
            private FeatureSet overridableFeatures_;

            static {
                FeatureSetEditionDefault featureSetEditionDefault = new FeatureSetEditionDefault();
                DEFAULT_INSTANCE = featureSetEditionDefault;
                GeneratedMessageLite.registerDefaultInstance(FeatureSetEditionDefault.class, featureSetEditionDefault);
            }

            private FeatureSetEditionDefault() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEdition() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearFixedFeatures() {
                this.fixedFeatures_ = null;
                this.bitField0_ &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearOverridableFeatures() {
                this.overridableFeatures_ = null;
                this.bitField0_ &= -3;
            }

            public static FeatureSetEditionDefault getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeFixedFeatures(FeatureSet featureSet) {
                featureSet.getClass();
                FeatureSet featureSet2 = this.fixedFeatures_;
                if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                    this.fixedFeatures_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.fixedFeatures_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
                } else {
                    this.fixedFeatures_ = featureSet;
                }
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Multi-variable type inference failed */
            public void mergeOverridableFeatures(FeatureSet featureSet) {
                featureSet.getClass();
                FeatureSet featureSet2 = this.overridableFeatures_;
                if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                    this.overridableFeatures_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.overridableFeatures_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
                } else {
                    this.overridableFeatures_ = featureSet;
                }
                this.bitField0_ |= 2;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<FeatureSetEditionDefault> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEdition(Edition edition) {
                this.edition_ = edition.getNumber();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setFixedFeatures(FeatureSet featureSet) {
                featureSet.getClass();
                this.fixedFeatures_ = featureSet;
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOverridableFeatures(FeatureSet featureSet) {
                featureSet.getClass();
                this.overridableFeatures_ = featureSet;
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new FeatureSetEditionDefault();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0002\u0003᠌\u0000\u0004ᐉ\u0001\u0005ᐉ\u0002", new Object[]{"bitField0_", "edition_", Edition.internalGetVerifier(), "overridableFeatures_", "fixedFeatures_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<FeatureSetEditionDefault> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (FeatureSetEditionDefault.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        if (obj == null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        this.memoizedIsInitialized = (byte) i;
                        return null;
                    default:
                        throw null;
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public Edition getEdition() {
                Edition forNumber = Edition.forNumber(this.edition_);
                if (forNumber == null) {
                    return Edition.EDITION_UNKNOWN;
                }
                return forNumber;
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public FeatureSet getFixedFeatures() {
                FeatureSet featureSet = this.fixedFeatures_;
                if (featureSet == null) {
                    return FeatureSet.getDefaultInstance();
                }
                return featureSet;
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public FeatureSet getOverridableFeatures() {
                FeatureSet featureSet = this.overridableFeatures_;
                if (featureSet == null) {
                    return FeatureSet.getDefaultInstance();
                }
                return featureSet;
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public boolean hasEdition() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public boolean hasFixedFeatures() {
                if ((this.bitField0_ & 4) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
            public boolean hasOverridableFeatures() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<FeatureSetEditionDefault, Builder> implements FeatureSetEditionDefaultOrBuilder {
                private Builder() {
                    super(FeatureSetEditionDefault.DEFAULT_INSTANCE);
                }

                public Builder clearEdition() {
                    copyOnWrite();
                    ((FeatureSetEditionDefault) this.instance).clearEdition();
                    return this;
                }

                public Builder clearFixedFeatures() {
                    copyOnWrite();
                    ((FeatureSetEditionDefault) this.instance).clearFixedFeatures();
                    return this;
                }

                public Builder clearOverridableFeatures() {
                    copyOnWrite();
                    ((FeatureSetEditionDefault) this.instance).clearOverridableFeatures();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
                public Edition getEdition() {
                    return ((FeatureSetEditionDefault) this.instance).getEdition();
                }

                @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
                public FeatureSet getFixedFeatures() {
                    return ((FeatureSetEditionDefault) this.instance).getFixedFeatures();
                }

                @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
                public FeatureSet getOverridableFeatures() {
                    return ((FeatureSetEditionDefault) this.instance).getOverridableFeatures();
                }

                @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
                public boolean hasEdition() {
                    return ((FeatureSetEditionDefault) this.instance).hasEdition();
                }

                @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
                public boolean hasFixedFeatures() {
                    return ((FeatureSetEditionDefault) this.instance).hasFixedFeatures();
                }

                @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder
                public boolean hasOverridableFeatures() {
                    return ((FeatureSetEditionDefault) this.instance).hasOverridableFeatures();
                }

                public Builder mergeFixedFeatures(FeatureSet featureSet) {
                    copyOnWrite();
                    ((FeatureSetEditionDefault) this.instance).mergeFixedFeatures(featureSet);
                    return this;
                }

                public Builder mergeOverridableFeatures(FeatureSet featureSet) {
                    copyOnWrite();
                    ((FeatureSetEditionDefault) this.instance).mergeOverridableFeatures(featureSet);
                    return this;
                }

                public Builder setEdition(Edition edition) {
                    copyOnWrite();
                    ((FeatureSetEditionDefault) this.instance).setEdition(edition);
                    return this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Builder setFixedFeatures(FeatureSet.Builder builder) {
                    copyOnWrite();
                    ((FeatureSetEditionDefault) this.instance).setFixedFeatures((FeatureSet) builder.build());
                    return this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Builder setOverridableFeatures(FeatureSet.Builder builder) {
                    copyOnWrite();
                    ((FeatureSetEditionDefault) this.instance).setOverridableFeatures((FeatureSet) builder.build());
                    return this;
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }

                public Builder setFixedFeatures(FeatureSet featureSet) {
                    copyOnWrite();
                    ((FeatureSetEditionDefault) this.instance).setFixedFeatures(featureSet);
                    return this;
                }

                public Builder setOverridableFeatures(FeatureSet featureSet) {
                    copyOnWrite();
                    ((FeatureSetEditionDefault) this.instance).setOverridableFeatures(featureSet);
                    return this;
                }
            }

            public static Builder newBuilder(FeatureSetEditionDefault featureSetEditionDefault) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(featureSetEditionDefault);
            }

            public static FeatureSetEditionDefault parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FeatureSetEditionDefault parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static FeatureSetEditionDefault parseFrom(ByteString byteString) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static FeatureSetEditionDefault parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static FeatureSetEditionDefault parseFrom(byte[] bArr) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static FeatureSetEditionDefault parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static FeatureSetEditionDefault parseFrom(InputStream inputStream) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FeatureSetEditionDefault parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FeatureSetEditionDefault parseFrom(CodedInputStream codedInputStream) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static FeatureSetEditionDefault parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSetEditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<FeatureSetDefaults, Builder> implements FeatureSetDefaultsOrBuilder {
            private Builder() {
                super(FeatureSetDefaults.DEFAULT_INSTANCE);
            }

            public Builder addAllDefaults(Iterable<? extends FeatureSetEditionDefault> iterable) {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).addAllDefaults(iterable);
                return this;
            }

            public Builder addDefaults(FeatureSetEditionDefault.Builder builder) {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).addDefaults(builder.build());
                return this;
            }

            public Builder clearDefaults() {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).clearDefaults();
                return this;
            }

            public Builder clearMaximumEdition() {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).clearMaximumEdition();
                return this;
            }

            public Builder clearMinimumEdition() {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).clearMinimumEdition();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
            public FeatureSetEditionDefault getDefaults(int i) {
                return ((FeatureSetDefaults) this.instance).getDefaults(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
            public int getDefaultsCount() {
                return ((FeatureSetDefaults) this.instance).getDefaultsCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
            public List<FeatureSetEditionDefault> getDefaultsList() {
                return Collections.unmodifiableList(((FeatureSetDefaults) this.instance).getDefaultsList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
            public Edition getMaximumEdition() {
                return ((FeatureSetDefaults) this.instance).getMaximumEdition();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
            public Edition getMinimumEdition() {
                return ((FeatureSetDefaults) this.instance).getMinimumEdition();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
            public boolean hasMaximumEdition() {
                return ((FeatureSetDefaults) this.instance).hasMaximumEdition();
            }

            @Override // com.google.protobuf.DescriptorProtos.FeatureSetDefaultsOrBuilder
            public boolean hasMinimumEdition() {
                return ((FeatureSetDefaults) this.instance).hasMinimumEdition();
            }

            public Builder removeDefaults(int i) {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).removeDefaults(i);
                return this;
            }

            public Builder setDefaults(int i, FeatureSetEditionDefault.Builder builder) {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).setDefaults(i, builder.build());
                return this;
            }

            public Builder setMaximumEdition(Edition edition) {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).setMaximumEdition(edition);
                return this;
            }

            public Builder setMinimumEdition(Edition edition) {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).setMinimumEdition(edition);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addDefaults(int i, FeatureSetEditionDefault featureSetEditionDefault) {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).addDefaults(i, featureSetEditionDefault);
                return this;
            }

            public Builder setDefaults(int i, FeatureSetEditionDefault featureSetEditionDefault) {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).setDefaults(i, featureSetEditionDefault);
                return this;
            }

            public Builder addDefaults(FeatureSetEditionDefault featureSetEditionDefault) {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).addDefaults(featureSetEditionDefault);
                return this;
            }

            public Builder addDefaults(int i, FeatureSetEditionDefault.Builder builder) {
                copyOnWrite();
                ((FeatureSetDefaults) this.instance).addDefaults(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(FeatureSetDefaults featureSetDefaults) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(featureSetDefaults);
        }

        public static FeatureSetDefaults parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FeatureSetDefaults parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FeatureSetDefaults parseFrom(ByteString byteString) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FeatureSetDefaults parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDefaults(int i, FeatureSetEditionDefault featureSetEditionDefault) {
            featureSetEditionDefault.getClass();
            ensureDefaultsIsMutable();
            this.defaults_.add(i, featureSetEditionDefault);
        }

        public static FeatureSetDefaults parseFrom(byte[] bArr) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureSetDefaults parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FeatureSetDefaults parseFrom(InputStream inputStream) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureSetDefaults parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FeatureSetDefaults parseFrom(CodedInputStream codedInputStream) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FeatureSetDefaults parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FeatureSetDefaults) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class FieldOptions extends GeneratedMessageLite.ExtendableMessage<FieldOptions, Builder> implements FieldOptionsOrBuilder {
        public static final int CTYPE_FIELD_NUMBER = 1;
        public static final int DEBUG_REDACT_FIELD_NUMBER = 16;
        private static final FieldOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int EDITION_DEFAULTS_FIELD_NUMBER = 20;
        public static final int FEATURES_FIELD_NUMBER = 21;
        public static final int FEATURE_SUPPORT_FIELD_NUMBER = 22;
        public static final int JSTYPE_FIELD_NUMBER = 6;
        public static final int LAZY_FIELD_NUMBER = 5;
        public static final int PACKED_FIELD_NUMBER = 2;
        private static volatile Parser<FieldOptions> PARSER = null;
        public static final int RETENTION_FIELD_NUMBER = 17;
        public static final int TARGETS_FIELD_NUMBER = 19;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
        public static final int WEAK_FIELD_NUMBER = 10;
        private static final Internal.IntListAdapter.IntConverter<OptionTargetType> targets_converter_ = new Internal.IntListAdapter.IntConverter<OptionTargetType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.IntListAdapter.IntConverter
            public OptionTargetType convert(int i) {
                OptionTargetType forNumber = OptionTargetType.forNumber(i);
                if (forNumber == null) {
                    return OptionTargetType.TARGET_TYPE_UNKNOWN;
                }
                return forNumber;
            }
        };
        private int bitField0_;
        private int ctype_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private FeatureSupport featureSupport_;
        private FeatureSet features_;
        private int jstype_;
        private boolean lazy_;
        private boolean packed_;
        private int retention_;
        private boolean unverifiedLazy_;
        private boolean weak_;
        private byte memoizedIsInitialized = 2;
        private Internal.IntList targets_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<EditionDefault> editionDefaults_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface EditionDefaultOrBuilder extends MessageLiteOrBuilder {
            Edition getEdition();

            String getValue();

            ByteString getValueBytes();

            boolean hasEdition();

            boolean hasValue();
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface FeatureSupportOrBuilder extends MessageLiteOrBuilder {
            String getDeprecationWarning();

            ByteString getDeprecationWarningBytes();

            Edition getEditionDeprecated();

            Edition getEditionIntroduced();

            Edition getEditionRemoved();

            boolean hasDeprecationWarning();

            boolean hasEditionDeprecated();

            boolean hasEditionIntroduced();

            boolean hasEditionRemoved();
        }

        static {
            FieldOptions fieldOptions = new FieldOptions();
            DEFAULT_INSTANCE = fieldOptions;
            GeneratedMessageLite.registerDefaultInstance(FieldOptions.class, fieldOptions);
        }

        private FieldOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEditionDefaults(Iterable<? extends EditionDefault> iterable) {
            ensureEditionDefaultsIsMutable();
            AbstractMessageLite.addAll(iterable, this.editionDefaults_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTargets(Iterable<? extends OptionTargetType> iterable) {
            ensureTargetsIsMutable();
            Iterator<? extends OptionTargetType> it = iterable.iterator();
            while (it.hasNext()) {
                this.targets_.addInt(it.next().getNumber());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEditionDefaults(EditionDefault editionDefault) {
            editionDefault.getClass();
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.add(editionDefault);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTargets(OptionTargetType optionTargetType) {
            optionTargetType.getClass();
            ensureTargetsIsMutable();
            this.targets_.addInt(optionTargetType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCtype() {
            this.bitField0_ &= -2;
            this.ctype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDebugRedact() {
            this.bitField0_ &= -129;
            this.debugRedact_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -33;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEditionDefaults() {
            this.editionDefaults_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatureSupport() {
            this.featureSupport_ = null;
            this.bitField0_ &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJstype() {
            this.bitField0_ &= -5;
            this.jstype_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLazy() {
            this.bitField0_ &= -9;
            this.lazy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPacked() {
            this.bitField0_ &= -3;
            this.packed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetention() {
            this.bitField0_ &= -257;
            this.retention_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTargets() {
            this.targets_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnverifiedLazy() {
            this.bitField0_ &= -17;
            this.unverifiedLazy_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeak() {
            this.bitField0_ &= -65;
            this.weak_ = false;
        }

        private void ensureEditionDefaultsIsMutable() {
            Internal.ProtobufList<EditionDefault> protobufList = this.editionDefaults_;
            if (!protobufList.isModifiable()) {
                this.editionDefaults_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureTargetsIsMutable() {
            Internal.IntList intList = this.targets_;
            if (!intList.isModifiable()) {
                this.targets_ = GeneratedMessageLite.mutableCopy(intList);
            }
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (!protobufList.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static FieldOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFeatureSupport(FeatureSupport featureSupport) {
            featureSupport.getClass();
            FeatureSupport featureSupport2 = this.featureSupport_;
            if (featureSupport2 != null && featureSupport2 != FeatureSupport.getDefaultInstance()) {
                this.featureSupport_ = FeatureSupport.newBuilder(this.featureSupport_).mergeFrom((FeatureSupport.Builder) featureSupport).buildPartial();
            } else {
                this.featureSupport_ = featureSupport;
            }
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            FeatureSet featureSet2 = this.features_;
            if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                this.features_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.features_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
            } else {
                this.features_ = featureSet;
            }
            this.bitField0_ |= 512;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream) {
            return (FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer) {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FieldOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEditionDefaults(int i) {
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCtype(CType cType) {
            this.ctype_ = cType.getNumber();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebugRedact(boolean z) {
            this.bitField0_ |= 128;
            this.debugRedact_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 32;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEditionDefaults(int i, EditionDefault editionDefault) {
            editionDefault.getClass();
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.set(i, editionDefault);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatureSupport(FeatureSupport featureSupport) {
            featureSupport.getClass();
            this.featureSupport_ = featureSupport;
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            this.features_ = featureSet;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJstype(JSType jSType) {
            this.jstype_ = jSType.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLazy(boolean z) {
            this.bitField0_ |= 8;
            this.lazy_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPacked(boolean z) {
            this.bitField0_ |= 2;
            this.packed_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetention(OptionRetention optionRetention) {
            this.retention_ = optionRetention.getNumber();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargets(int i, OptionTargetType optionTargetType) {
            optionTargetType.getClass();
            ensureTargetsIsMutable();
            this.targets_.setInt(i, optionTargetType.getNumber());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnverifiedLazy(boolean z) {
            this.bitField0_ |= 16;
            this.unverifiedLazy_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeak(boolean z) {
            this.bitField0_ |= 64;
            this.weak_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001ϧ\u000e\u0000\u0003\u0002\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0006\u000fဇ\u0004\u0010ဇ\u0007\u0011᠌\b\u0013ࠞ\u0014\u001b\u0015ᐉ\t\u0016ဉ\nϧЛ", new Object[]{"bitField0_", "ctype_", CType.internalGetVerifier(), "packed_", "deprecated_", "lazy_", "jstype_", JSType.internalGetVerifier(), "weak_", "unverifiedLazy_", "debugRedact_", "retention_", OptionRetention.internalGetVerifier(), "targets_", OptionTargetType.internalGetVerifier(), "editionDefaults_", EditionDefault.class, "features_", "featureSupport_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FieldOptions> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (FieldOptions.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public CType getCtype() {
            CType forNumber = CType.forNumber(this.ctype_);
            if (forNumber == null) {
                return CType.STRING;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public EditionDefault getEditionDefaults(int i) {
            return this.editionDefaults_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public int getEditionDefaultsCount() {
            return this.editionDefaults_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public List<EditionDefault> getEditionDefaultsList() {
            return this.editionDefaults_;
        }

        public EditionDefaultOrBuilder getEditionDefaultsOrBuilder(int i) {
            return this.editionDefaults_.get(i);
        }

        public List<? extends EditionDefaultOrBuilder> getEditionDefaultsOrBuilderList() {
            return this.editionDefaults_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public FeatureSupport getFeatureSupport() {
            FeatureSupport featureSupport = this.featureSupport_;
            if (featureSupport == null) {
                return FeatureSupport.getDefaultInstance();
            }
            return featureSupport;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            if (featureSet == null) {
                return FeatureSet.getDefaultInstance();
            }
            return featureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public JSType getJstype() {
            JSType forNumber = JSType.forNumber(this.jstype_);
            if (forNumber == null) {
                return JSType.JS_NORMAL;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getLazy() {
            return this.lazy_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getPacked() {
            return this.packed_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public OptionRetention getRetention() {
            OptionRetention forNumber = OptionRetention.forNumber(this.retention_);
            if (forNumber == null) {
                return OptionRetention.RETENTION_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public OptionTargetType getTargets(int i) {
            OptionTargetType forNumber = OptionTargetType.forNumber(this.targets_.getInt(i));
            if (forNumber == null) {
                return OptionTargetType.TARGET_TYPE_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public int getTargetsCount() {
            return this.targets_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public List<OptionTargetType> getTargetsList() {
            return new Internal.IntListAdapter(this.targets_, targets_converter_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean getUnverifiedLazy() {
            return this.unverifiedLazy_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        @Deprecated
        public boolean getWeak() {
            return this.weak_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasCtype() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasDebugRedact() {
            if ((this.bitField0_ & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasDeprecated() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasFeatureSupport() {
            if ((this.bitField0_ & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasFeatures() {
            if ((this.bitField0_ & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasJstype() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasLazy() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasPacked() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasRetention() {
            if ((this.bitField0_ & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        public boolean hasUnverifiedLazy() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
        @Deprecated
        public boolean hasWeak() {
            if ((this.bitField0_ & 64) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class EditionDefault extends GeneratedMessageLite<EditionDefault, Builder> implements EditionDefaultOrBuilder {
            private static final EditionDefault DEFAULT_INSTANCE;
            public static final int EDITION_FIELD_NUMBER = 3;
            private static volatile Parser<EditionDefault> PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 2;
            private int bitField0_;
            private int edition_;
            private String value_ = "";

            static {
                EditionDefault editionDefault = new EditionDefault();
                DEFAULT_INSTANCE = editionDefault;
                GeneratedMessageLite.registerDefaultInstance(EditionDefault.class, editionDefault);
            }

            private EditionDefault() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEdition() {
                this.bitField0_ &= -2;
                this.edition_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearValue() {
                this.bitField0_ &= -3;
                this.value_ = getDefaultInstance().getValue();
            }

            public static EditionDefault getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static EditionDefault parseDelimitedFrom(InputStream inputStream) {
                return (EditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EditionDefault parseFrom(ByteBuffer byteBuffer) {
                return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<EditionDefault> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEdition(Edition edition) {
                this.edition_ = edition.getNumber();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValue(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.value_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setValueBytes(ByteString byteString) {
                this.value_ = byteString.toStringUtf8();
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
                AnonymousClass1 anonymousClass1 = null;
                switch (i) {
                    case 1:
                        return new EditionDefault();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003᠌\u0000", new Object[]{"bitField0_", "value_", "edition_", Edition.internalGetVerifier()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<EditionDefault> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (EditionDefault.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return (byte) 1;
                    default:
                        throw null;
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefaultOrBuilder
            public Edition getEdition() {
                Edition forNumber = Edition.forNumber(this.edition_);
                if (forNumber == null) {
                    return Edition.EDITION_UNKNOWN;
                }
                return forNumber;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefaultOrBuilder
            public String getValue() {
                return this.value_;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefaultOrBuilder
            public ByteString getValueBytes() {
                return ByteString.copyFromUtf8(this.value_);
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefaultOrBuilder
            public boolean hasEdition() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefaultOrBuilder
            public boolean hasValue() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<EditionDefault, Builder> implements EditionDefaultOrBuilder {
                private Builder() {
                    super(EditionDefault.DEFAULT_INSTANCE);
                }

                public Builder clearEdition() {
                    copyOnWrite();
                    ((EditionDefault) this.instance).clearEdition();
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((EditionDefault) this.instance).clearValue();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefaultOrBuilder
                public Edition getEdition() {
                    return ((EditionDefault) this.instance).getEdition();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefaultOrBuilder
                public String getValue() {
                    return ((EditionDefault) this.instance).getValue();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefaultOrBuilder
                public ByteString getValueBytes() {
                    return ((EditionDefault) this.instance).getValueBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefaultOrBuilder
                public boolean hasEdition() {
                    return ((EditionDefault) this.instance).hasEdition();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.EditionDefaultOrBuilder
                public boolean hasValue() {
                    return ((EditionDefault) this.instance).hasValue();
                }

                public Builder setEdition(Edition edition) {
                    copyOnWrite();
                    ((EditionDefault) this.instance).setEdition(edition);
                    return this;
                }

                public Builder setValue(String str) {
                    copyOnWrite();
                    ((EditionDefault) this.instance).setValue(str);
                    return this;
                }

                public Builder setValueBytes(ByteString byteString) {
                    copyOnWrite();
                    ((EditionDefault) this.instance).setValueBytes(byteString);
                    return this;
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            public static Builder newBuilder(EditionDefault editionDefault) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(editionDefault);
            }

            public static EditionDefault parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EditionDefault parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static EditionDefault parseFrom(ByteString byteString) {
                return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static EditionDefault parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static EditionDefault parseFrom(byte[] bArr) {
                return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static EditionDefault parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static EditionDefault parseFrom(InputStream inputStream) {
                return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static EditionDefault parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static EditionDefault parseFrom(CodedInputStream codedInputStream) {
                return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static EditionDefault parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (EditionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class FeatureSupport extends GeneratedMessageLite<FeatureSupport, Builder> implements FeatureSupportOrBuilder {
            private static final FeatureSupport DEFAULT_INSTANCE;
            public static final int DEPRECATION_WARNING_FIELD_NUMBER = 3;
            public static final int EDITION_DEPRECATED_FIELD_NUMBER = 2;
            public static final int EDITION_INTRODUCED_FIELD_NUMBER = 1;
            public static final int EDITION_REMOVED_FIELD_NUMBER = 4;
            private static volatile Parser<FeatureSupport> PARSER;
            private int bitField0_;
            private String deprecationWarning_ = "";
            private int editionDeprecated_;
            private int editionIntroduced_;
            private int editionRemoved_;

            static {
                FeatureSupport featureSupport = new FeatureSupport();
                DEFAULT_INSTANCE = featureSupport;
                GeneratedMessageLite.registerDefaultInstance(FeatureSupport.class, featureSupport);
            }

            private FeatureSupport() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDeprecationWarning() {
                this.bitField0_ &= -5;
                this.deprecationWarning_ = getDefaultInstance().getDeprecationWarning();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEditionDeprecated() {
                this.bitField0_ &= -3;
                this.editionDeprecated_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEditionIntroduced() {
                this.bitField0_ &= -2;
                this.editionIntroduced_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEditionRemoved() {
                this.bitField0_ &= -9;
                this.editionRemoved_ = 0;
            }

            public static FeatureSupport getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static FeatureSupport parseDelimitedFrom(InputStream inputStream) {
                return (FeatureSupport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FeatureSupport parseFrom(ByteBuffer byteBuffer) {
                return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<FeatureSupport> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeprecationWarning(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.deprecationWarning_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDeprecationWarningBytes(ByteString byteString) {
                this.deprecationWarning_ = byteString.toStringUtf8();
                this.bitField0_ |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEditionDeprecated(Edition edition) {
                this.editionDeprecated_ = edition.getNumber();
                this.bitField0_ |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEditionIntroduced(Edition edition) {
                this.editionIntroduced_ = edition.getNumber();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEditionRemoved(Edition edition) {
                this.editionRemoved_ = edition.getNumber();
                this.bitField0_ |= 8;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
                AnonymousClass1 anonymousClass1 = null;
                switch (i) {
                    case 1:
                        return new FeatureSupport();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "editionIntroduced_", Edition.internalGetVerifier(), "editionDeprecated_", Edition.internalGetVerifier(), "deprecationWarning_", "editionRemoved_", Edition.internalGetVerifier()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<FeatureSupport> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (FeatureSupport.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return (byte) 1;
                    default:
                        throw null;
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
            public String getDeprecationWarning() {
                return this.deprecationWarning_;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
            public ByteString getDeprecationWarningBytes() {
                return ByteString.copyFromUtf8(this.deprecationWarning_);
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
            public Edition getEditionDeprecated() {
                Edition forNumber = Edition.forNumber(this.editionDeprecated_);
                if (forNumber == null) {
                    return Edition.EDITION_UNKNOWN;
                }
                return forNumber;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
            public Edition getEditionIntroduced() {
                Edition forNumber = Edition.forNumber(this.editionIntroduced_);
                if (forNumber == null) {
                    return Edition.EDITION_UNKNOWN;
                }
                return forNumber;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
            public Edition getEditionRemoved() {
                Edition forNumber = Edition.forNumber(this.editionRemoved_);
                if (forNumber == null) {
                    return Edition.EDITION_UNKNOWN;
                }
                return forNumber;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
            public boolean hasDeprecationWarning() {
                if ((this.bitField0_ & 4) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
            public boolean hasEditionDeprecated() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
            public boolean hasEditionIntroduced() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
            public boolean hasEditionRemoved() {
                if ((this.bitField0_ & 8) != 0) {
                    return true;
                }
                return false;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<FeatureSupport, Builder> implements FeatureSupportOrBuilder {
                private Builder() {
                    super(FeatureSupport.DEFAULT_INSTANCE);
                }

                public Builder clearDeprecationWarning() {
                    copyOnWrite();
                    ((FeatureSupport) this.instance).clearDeprecationWarning();
                    return this;
                }

                public Builder clearEditionDeprecated() {
                    copyOnWrite();
                    ((FeatureSupport) this.instance).clearEditionDeprecated();
                    return this;
                }

                public Builder clearEditionIntroduced() {
                    copyOnWrite();
                    ((FeatureSupport) this.instance).clearEditionIntroduced();
                    return this;
                }

                public Builder clearEditionRemoved() {
                    copyOnWrite();
                    ((FeatureSupport) this.instance).clearEditionRemoved();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
                public String getDeprecationWarning() {
                    return ((FeatureSupport) this.instance).getDeprecationWarning();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
                public ByteString getDeprecationWarningBytes() {
                    return ((FeatureSupport) this.instance).getDeprecationWarningBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
                public Edition getEditionDeprecated() {
                    return ((FeatureSupport) this.instance).getEditionDeprecated();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
                public Edition getEditionIntroduced() {
                    return ((FeatureSupport) this.instance).getEditionIntroduced();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
                public Edition getEditionRemoved() {
                    return ((FeatureSupport) this.instance).getEditionRemoved();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
                public boolean hasDeprecationWarning() {
                    return ((FeatureSupport) this.instance).hasDeprecationWarning();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
                public boolean hasEditionDeprecated() {
                    return ((FeatureSupport) this.instance).hasEditionDeprecated();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
                public boolean hasEditionIntroduced() {
                    return ((FeatureSupport) this.instance).hasEditionIntroduced();
                }

                @Override // com.google.protobuf.DescriptorProtos.FieldOptions.FeatureSupportOrBuilder
                public boolean hasEditionRemoved() {
                    return ((FeatureSupport) this.instance).hasEditionRemoved();
                }

                public Builder setDeprecationWarning(String str) {
                    copyOnWrite();
                    ((FeatureSupport) this.instance).setDeprecationWarning(str);
                    return this;
                }

                public Builder setDeprecationWarningBytes(ByteString byteString) {
                    copyOnWrite();
                    ((FeatureSupport) this.instance).setDeprecationWarningBytes(byteString);
                    return this;
                }

                public Builder setEditionDeprecated(Edition edition) {
                    copyOnWrite();
                    ((FeatureSupport) this.instance).setEditionDeprecated(edition);
                    return this;
                }

                public Builder setEditionIntroduced(Edition edition) {
                    copyOnWrite();
                    ((FeatureSupport) this.instance).setEditionIntroduced(edition);
                    return this;
                }

                public Builder setEditionRemoved(Edition edition) {
                    copyOnWrite();
                    ((FeatureSupport) this.instance).setEditionRemoved(edition);
                    return this;
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            public static Builder newBuilder(FeatureSupport featureSupport) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(featureSupport);
            }

            public static FeatureSupport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSupport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FeatureSupport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static FeatureSupport parseFrom(ByteString byteString) {
                return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static FeatureSupport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static FeatureSupport parseFrom(byte[] bArr) {
                return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static FeatureSupport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static FeatureSupport parseFrom(InputStream inputStream) {
                return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static FeatureSupport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static FeatureSupport parseFrom(CodedInputStream codedInputStream) {
                return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static FeatureSupport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FeatureSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<FieldOptions, Builder> implements FieldOptionsOrBuilder {
            private Builder() {
                super(FieldOptions.DEFAULT_INSTANCE);
            }

            public Builder addAllEditionDefaults(Iterable<? extends EditionDefault> iterable) {
                copyOnWrite();
                ((FieldOptions) this.instance).addAllEditionDefaults(iterable);
                return this;
            }

            public Builder addAllTargets(Iterable<? extends OptionTargetType> iterable) {
                copyOnWrite();
                ((FieldOptions) this.instance).addAllTargets(iterable);
                return this;
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((FieldOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addEditionDefaults(EditionDefault.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).addEditionDefaults(builder.build());
                return this;
            }

            public Builder addTargets(OptionTargetType optionTargetType) {
                copyOnWrite();
                ((FieldOptions) this.instance).addTargets(optionTargetType);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder clearCtype() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearCtype();
                return this;
            }

            public Builder clearDebugRedact() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearDebugRedact();
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearEditionDefaults() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearEditionDefaults();
                return this;
            }

            public Builder clearFeatureSupport() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearFeatureSupport();
                return this;
            }

            public Builder clearFeatures() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearFeatures();
                return this;
            }

            public Builder clearJstype() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearJstype();
                return this;
            }

            public Builder clearLazy() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearLazy();
                return this;
            }

            public Builder clearPacked() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearPacked();
                return this;
            }

            public Builder clearRetention() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearRetention();
                return this;
            }

            public Builder clearTargets() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearTargets();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            public Builder clearUnverifiedLazy() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearUnverifiedLazy();
                return this;
            }

            @Deprecated
            public Builder clearWeak() {
                copyOnWrite();
                ((FieldOptions) this.instance).clearWeak();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public CType getCtype() {
                return ((FieldOptions) this.instance).getCtype();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getDebugRedact() {
                return ((FieldOptions) this.instance).getDebugRedact();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getDeprecated() {
                return ((FieldOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public EditionDefault getEditionDefaults(int i) {
                return ((FieldOptions) this.instance).getEditionDefaults(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public int getEditionDefaultsCount() {
                return ((FieldOptions) this.instance).getEditionDefaultsCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public List<EditionDefault> getEditionDefaultsList() {
                return Collections.unmodifiableList(((FieldOptions) this.instance).getEditionDefaultsList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public FeatureSupport getFeatureSupport() {
                return ((FieldOptions) this.instance).getFeatureSupport();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public FeatureSet getFeatures() {
                return ((FieldOptions) this.instance).getFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public JSType getJstype() {
                return ((FieldOptions) this.instance).getJstype();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getLazy() {
                return ((FieldOptions) this.instance).getLazy();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getPacked() {
                return ((FieldOptions) this.instance).getPacked();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public OptionRetention getRetention() {
                return ((FieldOptions) this.instance).getRetention();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public OptionTargetType getTargets(int i) {
                return ((FieldOptions) this.instance).getTargets(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public int getTargetsCount() {
                return ((FieldOptions) this.instance).getTargetsCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public List<OptionTargetType> getTargetsList() {
                return ((FieldOptions) this.instance).getTargetsList();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
                return ((FieldOptions) this.instance).getUninterpretedOption(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((FieldOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((FieldOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean getUnverifiedLazy() {
                return ((FieldOptions) this.instance).getUnverifiedLazy();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            @Deprecated
            public boolean getWeak() {
                return ((FieldOptions) this.instance).getWeak();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasCtype() {
                return ((FieldOptions) this.instance).hasCtype();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasDebugRedact() {
                return ((FieldOptions) this.instance).hasDebugRedact();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((FieldOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasFeatureSupport() {
                return ((FieldOptions) this.instance).hasFeatureSupport();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasFeatures() {
                return ((FieldOptions) this.instance).hasFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasJstype() {
                return ((FieldOptions) this.instance).hasJstype();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasLazy() {
                return ((FieldOptions) this.instance).hasLazy();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasPacked() {
                return ((FieldOptions) this.instance).hasPacked();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasRetention() {
                return ((FieldOptions) this.instance).hasRetention();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            public boolean hasUnverifiedLazy() {
                return ((FieldOptions) this.instance).hasUnverifiedLazy();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldOptionsOrBuilder
            @Deprecated
            public boolean hasWeak() {
                return ((FieldOptions) this.instance).hasWeak();
            }

            public Builder mergeFeatureSupport(FeatureSupport featureSupport) {
                copyOnWrite();
                ((FieldOptions) this.instance).mergeFeatureSupport(featureSupport);
                return this;
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((FieldOptions) this.instance).mergeFeatures(featureSet);
                return this;
            }

            public Builder removeEditionDefaults(int i) {
                copyOnWrite();
                ((FieldOptions) this.instance).removeEditionDefaults(i);
                return this;
            }

            public Builder removeUninterpretedOption(int i) {
                copyOnWrite();
                ((FieldOptions) this.instance).removeUninterpretedOption(i);
                return this;
            }

            public Builder setCtype(CType cType) {
                copyOnWrite();
                ((FieldOptions) this.instance).setCtype(cType);
                return this;
            }

            public Builder setDebugRedact(boolean z) {
                copyOnWrite();
                ((FieldOptions) this.instance).setDebugRedact(z);
                return this;
            }

            public Builder setDeprecated(boolean z) {
                copyOnWrite();
                ((FieldOptions) this.instance).setDeprecated(z);
                return this;
            }

            public Builder setEditionDefaults(int i, EditionDefault.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).setEditionDefaults(i, builder.build());
                return this;
            }

            public Builder setFeatureSupport(FeatureSupport.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).setFeatureSupport(builder.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFeatures(FeatureSet.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).setFeatures((FeatureSet) builder.build());
                return this;
            }

            public Builder setJstype(JSType jSType) {
                copyOnWrite();
                ((FieldOptions) this.instance).setJstype(jSType);
                return this;
            }

            public Builder setLazy(boolean z) {
                copyOnWrite();
                ((FieldOptions) this.instance).setLazy(z);
                return this;
            }

            public Builder setPacked(boolean z) {
                copyOnWrite();
                ((FieldOptions) this.instance).setPacked(z);
                return this;
            }

            public Builder setRetention(OptionRetention optionRetention) {
                copyOnWrite();
                ((FieldOptions) this.instance).setRetention(optionRetention);
                return this;
            }

            public Builder setTargets(int i, OptionTargetType optionTargetType) {
                copyOnWrite();
                ((FieldOptions) this.instance).setTargets(i, optionTargetType);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).setUninterpretedOption(i, builder.build());
                return this;
            }

            public Builder setUnverifiedLazy(boolean z) {
                copyOnWrite();
                ((FieldOptions) this.instance).setUnverifiedLazy(z);
                return this;
            }

            @Deprecated
            public Builder setWeak(boolean z) {
                copyOnWrite();
                ((FieldOptions) this.instance).setWeak(z);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addEditionDefaults(int i, EditionDefault editionDefault) {
                copyOnWrite();
                ((FieldOptions) this.instance).addEditionDefaults(i, editionDefault);
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FieldOptions) this.instance).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder setEditionDefaults(int i, EditionDefault editionDefault) {
                copyOnWrite();
                ((FieldOptions) this.instance).setEditionDefaults(i, editionDefault);
                return this;
            }

            public Builder setFeatureSupport(FeatureSupport featureSupport) {
                copyOnWrite();
                ((FieldOptions) this.instance).setFeatureSupport(featureSupport);
                return this;
            }

            public Builder setFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((FieldOptions) this.instance).setFeatures(featureSet);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FieldOptions) this.instance).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder addEditionDefaults(EditionDefault editionDefault) {
                copyOnWrite();
                ((FieldOptions) this.instance).addEditionDefaults(editionDefault);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FieldOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder addEditionDefaults(int i, EditionDefault.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).addEditionDefaults(i, builder.build());
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FieldOptions) this.instance).addUninterpretedOption(i, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum CType implements Internal.EnumLite {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);

            public static final int CORD_VALUE = 1;
            public static final int STRING_PIECE_VALUE = 2;
            public static final int STRING_VALUE = 0;
            private static final Internal.EnumLiteMap<CType> internalValueMap = new Internal.EnumLiteMap<CType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.CType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public CType findValueByNumber(int i) {
                    return CType.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class CTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new CTypeVerifier();

                private CTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (CType.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            CType(int i) {
                this.value = i;
            }

            public static CType forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return STRING_PIECE;
                    }
                    return CORD;
                }
                return STRING;
            }

            public static Internal.EnumLiteMap<CType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return CTypeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static CType valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum JSType implements Internal.EnumLite {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);

            public static final int JS_NORMAL_VALUE = 0;
            public static final int JS_NUMBER_VALUE = 2;
            public static final int JS_STRING_VALUE = 1;
            private static final Internal.EnumLiteMap<JSType> internalValueMap = new Internal.EnumLiteMap<JSType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.JSType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public JSType findValueByNumber(int i) {
                    return JSType.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class JSTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new JSTypeVerifier();

                private JSTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (JSType.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            JSType(int i) {
                this.value = i;
            }

            public static JSType forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return JS_NUMBER;
                    }
                    return JS_STRING;
                }
                return JS_NORMAL;
            }

            public static Internal.EnumLiteMap<JSType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return JSTypeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static JSType valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum OptionRetention implements Internal.EnumLite {
            RETENTION_UNKNOWN(0),
            RETENTION_RUNTIME(1),
            RETENTION_SOURCE(2);

            public static final int RETENTION_RUNTIME_VALUE = 1;
            public static final int RETENTION_SOURCE_VALUE = 2;
            public static final int RETENTION_UNKNOWN_VALUE = 0;
            private static final Internal.EnumLiteMap<OptionRetention> internalValueMap = new Internal.EnumLiteMap<OptionRetention>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.OptionRetention.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public OptionRetention findValueByNumber(int i) {
                    return OptionRetention.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class OptionRetentionVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new OptionRetentionVerifier();

                private OptionRetentionVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (OptionRetention.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            OptionRetention(int i) {
                this.value = i;
            }

            public static OptionRetention forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return RETENTION_SOURCE;
                    }
                    return RETENTION_RUNTIME;
                }
                return RETENTION_UNKNOWN;
            }

            public static Internal.EnumLiteMap<OptionRetention> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return OptionRetentionVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OptionRetention valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum OptionTargetType implements Internal.EnumLite {
            TARGET_TYPE_UNKNOWN(0),
            TARGET_TYPE_FILE(1),
            TARGET_TYPE_EXTENSION_RANGE(2),
            TARGET_TYPE_MESSAGE(3),
            TARGET_TYPE_FIELD(4),
            TARGET_TYPE_ONEOF(5),
            TARGET_TYPE_ENUM(6),
            TARGET_TYPE_ENUM_ENTRY(7),
            TARGET_TYPE_SERVICE(8),
            TARGET_TYPE_METHOD(9);

            public static final int TARGET_TYPE_ENUM_ENTRY_VALUE = 7;
            public static final int TARGET_TYPE_ENUM_VALUE = 6;
            public static final int TARGET_TYPE_EXTENSION_RANGE_VALUE = 2;
            public static final int TARGET_TYPE_FIELD_VALUE = 4;
            public static final int TARGET_TYPE_FILE_VALUE = 1;
            public static final int TARGET_TYPE_MESSAGE_VALUE = 3;
            public static final int TARGET_TYPE_METHOD_VALUE = 9;
            public static final int TARGET_TYPE_ONEOF_VALUE = 5;
            public static final int TARGET_TYPE_SERVICE_VALUE = 8;
            public static final int TARGET_TYPE_UNKNOWN_VALUE = 0;
            private static final Internal.EnumLiteMap<OptionTargetType> internalValueMap = new Internal.EnumLiteMap<OptionTargetType>() { // from class: com.google.protobuf.DescriptorProtos.FieldOptions.OptionTargetType.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public OptionTargetType findValueByNumber(int i) {
                    return OptionTargetType.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class OptionTargetTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new OptionTargetTypeVerifier();

                private OptionTargetTypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (OptionTargetType.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            OptionTargetType(int i) {
                this.value = i;
            }

            public static OptionTargetType forNumber(int i) {
                switch (i) {
                    case 0:
                        return TARGET_TYPE_UNKNOWN;
                    case 1:
                        return TARGET_TYPE_FILE;
                    case 2:
                        return TARGET_TYPE_EXTENSION_RANGE;
                    case 3:
                        return TARGET_TYPE_MESSAGE;
                    case 4:
                        return TARGET_TYPE_FIELD;
                    case 5:
                        return TARGET_TYPE_ONEOF;
                    case 6:
                        return TARGET_TYPE_ENUM;
                    case 7:
                        return TARGET_TYPE_ENUM_ENTRY;
                    case 8:
                        return TARGET_TYPE_SERVICE;
                    case 9:
                        return TARGET_TYPE_METHOD;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<OptionTargetType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return OptionTargetTypeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OptionTargetType valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(FieldOptions fieldOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fieldOptions);
        }

        public static FieldOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(ByteString byteString) {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FieldOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEditionDefaults(int i, EditionDefault editionDefault) {
            editionDefault.getClass();
            ensureEditionDefaultsIsMutable();
            this.editionDefaults_.add(i, editionDefault);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static FieldOptions parseFrom(byte[] bArr) {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(InputStream inputStream) {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FieldOptions parseFrom(CodedInputStream codedInputStream) {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FieldOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class GeneratedCodeInfo extends GeneratedMessageLite<GeneratedCodeInfo, Builder> implements GeneratedCodeInfoOrBuilder {
        public static final int ANNOTATION_FIELD_NUMBER = 1;
        private static final GeneratedCodeInfo DEFAULT_INSTANCE;
        private static volatile Parser<GeneratedCodeInfo> PARSER;
        private Internal.ProtobufList<Annotation> annotation_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
            int getBegin();

            int getEnd();

            int getPath(int i);

            int getPathCount();

            List<Integer> getPathList();

            Annotation.Semantic getSemantic();

            String getSourceFile();

            ByteString getSourceFileBytes();

            boolean hasBegin();

            boolean hasEnd();

            boolean hasSemantic();

            boolean hasSourceFile();
        }

        static {
            GeneratedCodeInfo generatedCodeInfo = new GeneratedCodeInfo();
            DEFAULT_INSTANCE = generatedCodeInfo;
            GeneratedMessageLite.registerDefaultInstance(GeneratedCodeInfo.class, generatedCodeInfo);
        }

        private GeneratedCodeInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAnnotation(Iterable<? extends Annotation> iterable) {
            ensureAnnotationIsMutable();
            AbstractMessageLite.addAll(iterable, this.annotation_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnnotation(Annotation annotation) {
            annotation.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.add(annotation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAnnotation() {
            this.annotation_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureAnnotationIsMutable() {
            Internal.ProtobufList<Annotation> protobufList = this.annotation_;
            if (!protobufList.isModifiable()) {
                this.annotation_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static GeneratedCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GeneratedCodeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAnnotation(int i) {
            ensureAnnotationIsMutable();
            this.annotation_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnnotation(int i, Annotation annotation) {
            annotation.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.set(i, annotation);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            AnonymousClass1 anonymousClass1 = null;
            switch (i) {
                case 1:
                    return new GeneratedCodeInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", Annotation.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GeneratedCodeInfo> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (GeneratedCodeInfo.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
        public Annotation getAnnotation(int i) {
            return this.annotation_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
        public int getAnnotationCount() {
            return this.annotation_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
        public List<Annotation> getAnnotationList() {
            return this.annotation_;
        }

        public AnnotationOrBuilder getAnnotationOrBuilder(int i) {
            return this.annotation_.get(i);
        }

        public List<? extends AnnotationOrBuilder> getAnnotationOrBuilderList() {
            return this.annotation_;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Annotation extends GeneratedMessageLite<Annotation, Builder> implements AnnotationOrBuilder {
            public static final int BEGIN_FIELD_NUMBER = 3;
            private static final Annotation DEFAULT_INSTANCE;
            public static final int END_FIELD_NUMBER = 4;
            private static volatile Parser<Annotation> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SEMANTIC_FIELD_NUMBER = 5;
            public static final int SOURCE_FILE_FIELD_NUMBER = 2;
            private int begin_;
            private int bitField0_;
            private int end_;
            private int semantic_;
            private int pathMemoizedSerializedSize = -1;
            private Internal.IntList path_ = GeneratedMessageLite.emptyIntList();
            private String sourceFile_ = "";

            static {
                Annotation annotation = new Annotation();
                DEFAULT_INSTANCE = annotation;
                GeneratedMessageLite.registerDefaultInstance(Annotation.class, annotation);
            }

            private Annotation() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractMessageLite.addAll(iterable, this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addPath(int i) {
                ensurePathIsMutable();
                this.path_.addInt(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBegin() {
                this.bitField0_ &= -3;
                this.begin_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearEnd() {
                this.bitField0_ &= -5;
                this.end_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPath() {
                this.path_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSemantic() {
                this.bitField0_ &= -9;
                this.semantic_ = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSourceFile() {
                this.bitField0_ &= -2;
                this.sourceFile_ = getDefaultInstance().getSourceFile();
            }

            private void ensurePathIsMutable() {
                Internal.IntList intList = this.path_;
                if (!intList.isModifiable()) {
                    this.path_ = GeneratedMessageLite.mutableCopy(intList);
                }
            }

            public static Annotation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream) {
                return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer) {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Annotation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBegin(int i) {
                this.bitField0_ |= 2;
                this.begin_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setEnd(int i) {
                this.bitField0_ |= 4;
                this.end_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPath(int i, int i2) {
                ensurePathIsMutable();
                this.path_.setInt(i, i2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSemantic(Semantic semantic) {
                this.semantic_ = semantic.getNumber();
                this.bitField0_ |= 8;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSourceFile(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.sourceFile_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSourceFileBytes(ByteString byteString) {
                this.sourceFile_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
                AnonymousClass1 anonymousClass1 = null;
                switch (i) {
                    case 1:
                        return new Annotation();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002\u0005᠌\u0003", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_", "semantic_", Semantic.internalGetVerifier()});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Annotation> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (Annotation.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return (byte) 1;
                    default:
                        throw null;
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getBegin() {
                return this.begin_;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getEnd() {
                return this.end_;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getPath(int i) {
                return this.path_.getInt(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public int getPathCount() {
                return this.path_.size();
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public Semantic getSemantic() {
                Semantic forNumber = Semantic.forNumber(this.semantic_);
                if (forNumber == null) {
                    return Semantic.NONE;
                }
                return forNumber;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public String getSourceFile() {
                return this.sourceFile_;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public ByteString getSourceFileBytes() {
                return ByteString.copyFromUtf8(this.sourceFile_);
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasBegin() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasEnd() {
                if ((this.bitField0_ & 4) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasSemantic() {
                if ((this.bitField0_ & 8) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasSourceFile() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
                private Builder() {
                    super(Annotation.DEFAULT_INSTANCE);
                }

                public Builder addAllPath(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Annotation) this.instance).addAllPath(iterable);
                    return this;
                }

                public Builder addPath(int i) {
                    copyOnWrite();
                    ((Annotation) this.instance).addPath(i);
                    return this;
                }

                public Builder clearBegin() {
                    copyOnWrite();
                    ((Annotation) this.instance).clearBegin();
                    return this;
                }

                public Builder clearEnd() {
                    copyOnWrite();
                    ((Annotation) this.instance).clearEnd();
                    return this;
                }

                public Builder clearPath() {
                    copyOnWrite();
                    ((Annotation) this.instance).clearPath();
                    return this;
                }

                public Builder clearSemantic() {
                    copyOnWrite();
                    ((Annotation) this.instance).clearSemantic();
                    return this;
                }

                public Builder clearSourceFile() {
                    copyOnWrite();
                    ((Annotation) this.instance).clearSourceFile();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getBegin() {
                    return ((Annotation) this.instance).getBegin();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getEnd() {
                    return ((Annotation) this.instance).getEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getPath(int i) {
                    return ((Annotation) this.instance).getPath(i);
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public int getPathCount() {
                    return ((Annotation) this.instance).getPathCount();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((Annotation) this.instance).getPathList());
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public Semantic getSemantic() {
                    return ((Annotation) this.instance).getSemantic();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public String getSourceFile() {
                    return ((Annotation) this.instance).getSourceFile();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public ByteString getSourceFileBytes() {
                    return ((Annotation) this.instance).getSourceFileBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public boolean hasBegin() {
                    return ((Annotation) this.instance).hasBegin();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public boolean hasEnd() {
                    return ((Annotation) this.instance).hasEnd();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public boolean hasSemantic() {
                    return ((Annotation) this.instance).hasSemantic();
                }

                @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.AnnotationOrBuilder
                public boolean hasSourceFile() {
                    return ((Annotation) this.instance).hasSourceFile();
                }

                public Builder setBegin(int i) {
                    copyOnWrite();
                    ((Annotation) this.instance).setBegin(i);
                    return this;
                }

                public Builder setEnd(int i) {
                    copyOnWrite();
                    ((Annotation) this.instance).setEnd(i);
                    return this;
                }

                public Builder setPath(int i, int i2) {
                    copyOnWrite();
                    ((Annotation) this.instance).setPath(i, i2);
                    return this;
                }

                public Builder setSemantic(Semantic semantic) {
                    copyOnWrite();
                    ((Annotation) this.instance).setSemantic(semantic);
                    return this;
                }

                public Builder setSourceFile(String str) {
                    copyOnWrite();
                    ((Annotation) this.instance).setSourceFile(str);
                    return this;
                }

                public Builder setSourceFileBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Annotation) this.instance).setSourceFileBytes(byteString);
                    return this;
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public enum Semantic implements Internal.EnumLite {
                NONE(0),
                SET(1),
                ALIAS(2);

                public static final int ALIAS_VALUE = 2;
                public static final int NONE_VALUE = 0;
                public static final int SET_VALUE = 1;
                private static final Internal.EnumLiteMap<Semantic> internalValueMap = new Internal.EnumLiteMap<Semantic>() { // from class: com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Semantic.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public Semantic findValueByNumber(int i) {
                        return Semantic.forNumber(i);
                    }
                };
                private final int value;

                /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
                /* loaded from: classes.dex */
                public static final class SemanticVerifier implements Internal.EnumVerifier {
                    static final Internal.EnumVerifier INSTANCE = new SemanticVerifier();

                    private SemanticVerifier() {
                    }

                    @Override // com.google.protobuf.Internal.EnumVerifier
                    public boolean isInRange(int i) {
                        if (Semantic.forNumber(i) != null) {
                            return true;
                        }
                        return false;
                    }
                }

                Semantic(int i) {
                    this.value = i;
                }

                public static Semantic forNumber(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                return null;
                            }
                            return ALIAS;
                        }
                        return SET;
                    }
                    return NONE;
                }

                public static Internal.EnumLiteMap<Semantic> internalGetValueMap() {
                    return internalValueMap;
                }

                public static Internal.EnumVerifier internalGetVerifier() {
                    return SemanticVerifier.INSTANCE;
                }

                @Override // com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                @Deprecated
                public static Semantic valueOf(int i) {
                    return forNumber(i);
                }
            }

            public static Builder newBuilder(Annotation annotation) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(annotation);
            }

            public static Annotation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Annotation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Annotation parseFrom(ByteString byteString) {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Annotation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Annotation parseFrom(byte[] bArr) {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Annotation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Annotation parseFrom(InputStream inputStream) {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Annotation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Annotation parseFrom(CodedInputStream codedInputStream) {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Annotation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<GeneratedCodeInfo, Builder> implements GeneratedCodeInfoOrBuilder {
            private Builder() {
                super(GeneratedCodeInfo.DEFAULT_INSTANCE);
            }

            public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).addAllAnnotation(iterable);
                return this;
            }

            public Builder addAnnotation(Annotation.Builder builder) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).addAnnotation(builder.build());
                return this;
            }

            public Builder clearAnnotation() {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).clearAnnotation();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
            public Annotation getAnnotation(int i) {
                return ((GeneratedCodeInfo) this.instance).getAnnotation(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
            public int getAnnotationCount() {
                return ((GeneratedCodeInfo) this.instance).getAnnotationCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.GeneratedCodeInfoOrBuilder
            public List<Annotation> getAnnotationList() {
                return Collections.unmodifiableList(((GeneratedCodeInfo) this.instance).getAnnotationList());
            }

            public Builder removeAnnotation(int i) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).removeAnnotation(i);
                return this;
            }

            public Builder setAnnotation(int i, Annotation.Builder builder) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).setAnnotation(i, builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAnnotation(int i, Annotation annotation) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).addAnnotation(i, annotation);
                return this;
            }

            public Builder setAnnotation(int i, Annotation annotation) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).setAnnotation(i, annotation);
                return this;
            }

            public Builder addAnnotation(Annotation annotation) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).addAnnotation(annotation);
                return this;
            }

            public Builder addAnnotation(int i, Annotation.Builder builder) {
                copyOnWrite();
                ((GeneratedCodeInfo) this.instance).addAnnotation(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(GeneratedCodeInfo generatedCodeInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(generatedCodeInfo);
        }

        public static GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GeneratedCodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAnnotation(int i, Annotation annotation) {
            annotation.getClass();
            ensureAnnotationIsMutable();
            this.annotation_.add(i, annotation);
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GeneratedCodeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GeneratedCodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class SourceCodeInfo extends GeneratedMessageLite.ExtendableMessage<SourceCodeInfo, Builder> implements SourceCodeInfoOrBuilder {
        private static final SourceCodeInfo DEFAULT_INSTANCE;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static volatile Parser<SourceCodeInfo> PARSER;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<Location> location_ = GeneratedMessageLite.emptyProtobufList();

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface LocationOrBuilder extends MessageLiteOrBuilder {
            String getLeadingComments();

            ByteString getLeadingCommentsBytes();

            String getLeadingDetachedComments(int i);

            ByteString getLeadingDetachedCommentsBytes(int i);

            int getLeadingDetachedCommentsCount();

            List<String> getLeadingDetachedCommentsList();

            int getPath(int i);

            int getPathCount();

            List<Integer> getPathList();

            int getSpan(int i);

            int getSpanCount();

            List<Integer> getSpanList();

            String getTrailingComments();

            ByteString getTrailingCommentsBytes();

            boolean hasLeadingComments();

            boolean hasTrailingComments();
        }

        static {
            SourceCodeInfo sourceCodeInfo = new SourceCodeInfo();
            DEFAULT_INSTANCE = sourceCodeInfo;
            GeneratedMessageLite.registerDefaultInstance(SourceCodeInfo.class, sourceCodeInfo);
        }

        private SourceCodeInfo() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLocation(Iterable<? extends Location> iterable) {
            ensureLocationIsMutable();
            AbstractMessageLite.addAll(iterable, this.location_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocation(Location location) {
            location.getClass();
            ensureLocationIsMutable();
            this.location_.add(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocation() {
            this.location_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureLocationIsMutable() {
            Internal.ProtobufList<Location> protobufList = this.location_;
            if (!protobufList.isModifiable()) {
                this.location_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static SourceCodeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream) {
            return (SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer) {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SourceCodeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLocation(int i) {
            ensureLocationIsMutable();
            this.location_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocation(int i, Location location) {
            location.getClass();
            ensureLocationIsMutable();
            this.location_.set(i, location);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new SourceCodeInfo();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", Location.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SourceCodeInfo> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (SourceCodeInfo.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
        public Location getLocation(int i) {
            return this.location_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
        public int getLocationCount() {
            return this.location_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
        public List<Location> getLocationList() {
            return this.location_;
        }

        public LocationOrBuilder getLocationOrBuilder(int i) {
            return this.location_.get(i);
        }

        public List<? extends LocationOrBuilder> getLocationOrBuilderList() {
            return this.location_;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Location extends GeneratedMessageLite<Location, Builder> implements LocationOrBuilder {
            private static final Location DEFAULT_INSTANCE;
            public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
            public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
            private static volatile Parser<Location> PARSER = null;
            public static final int PATH_FIELD_NUMBER = 1;
            public static final int SPAN_FIELD_NUMBER = 2;
            public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
            private int bitField0_;
            private int pathMemoizedSerializedSize = -1;
            private int spanMemoizedSerializedSize = -1;
            private Internal.IntList path_ = GeneratedMessageLite.emptyIntList();
            private Internal.IntList span_ = GeneratedMessageLite.emptyIntList();
            private String leadingComments_ = "";
            private String trailingComments_ = "";
            private Internal.ProtobufList<String> leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();

            static {
                Location location = new Location();
                DEFAULT_INSTANCE = location;
                GeneratedMessageLite.registerDefaultInstance(Location.class, location);
            }

            private Location() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllLeadingDetachedComments(Iterable<String> iterable) {
                ensureLeadingDetachedCommentsIsMutable();
                AbstractMessageLite.addAll(iterable, this.leadingDetachedComments_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllPath(Iterable<? extends Integer> iterable) {
                ensurePathIsMutable();
                AbstractMessageLite.addAll(iterable, this.path_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addAllSpan(Iterable<? extends Integer> iterable) {
                ensureSpanIsMutable();
                AbstractMessageLite.addAll(iterable, this.span_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLeadingDetachedComments(String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addLeadingDetachedCommentsBytes(ByteString byteString) {
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.add(byteString.toStringUtf8());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addPath(int i) {
                ensurePathIsMutable();
                this.path_.addInt(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void addSpan(int i) {
                ensureSpanIsMutable();
                this.span_.addInt(i);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLeadingComments() {
                this.bitField0_ &= -2;
                this.leadingComments_ = getDefaultInstance().getLeadingComments();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLeadingDetachedComments() {
                this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearPath() {
                this.path_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSpan() {
                this.span_ = GeneratedMessageLite.emptyIntList();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTrailingComments() {
                this.bitField0_ &= -3;
                this.trailingComments_ = getDefaultInstance().getTrailingComments();
            }

            private void ensureLeadingDetachedCommentsIsMutable() {
                Internal.ProtobufList<String> protobufList = this.leadingDetachedComments_;
                if (!protobufList.isModifiable()) {
                    this.leadingDetachedComments_ = GeneratedMessageLite.mutableCopy(protobufList);
                }
            }

            private void ensurePathIsMutable() {
                Internal.IntList intList = this.path_;
                if (!intList.isModifiable()) {
                    this.path_ = GeneratedMessageLite.mutableCopy(intList);
                }
            }

            private void ensureSpanIsMutable() {
                Internal.IntList intList = this.span_;
                if (!intList.isModifiable()) {
                    this.span_ = GeneratedMessageLite.mutableCopy(intList);
                }
            }

            public static Location getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Location parseDelimitedFrom(InputStream inputStream) {
                return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Location parseFrom(ByteBuffer byteBuffer) {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Location> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingComments(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.leadingComments_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingCommentsBytes(ByteString byteString) {
                this.leadingComments_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLeadingDetachedComments(int i, String str) {
                str.getClass();
                ensureLeadingDetachedCommentsIsMutable();
                this.leadingDetachedComments_.set(i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setPath(int i, int i2) {
                ensurePathIsMutable();
                this.path_.setInt(i, i2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSpan(int i, int i2) {
                ensureSpanIsMutable();
                this.span_.setInt(i, i2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTrailingComments(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.trailingComments_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTrailingCommentsBytes(ByteString byteString) {
                this.trailingComments_ = byteString.toStringUtf8();
                this.bitField0_ |= 2;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
                AnonymousClass1 anonymousClass1 = null;
                switch (i) {
                    case 1:
                        return new Location();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Location> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (Location.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return (byte) 1;
                    default:
                        throw null;
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public String getLeadingComments() {
                return this.leadingComments_;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public ByteString getLeadingCommentsBytes() {
                return ByteString.copyFromUtf8(this.leadingComments_);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public String getLeadingDetachedComments(int i) {
                return this.leadingDetachedComments_.get(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public ByteString getLeadingDetachedCommentsBytes(int i) {
                return ByteString.copyFromUtf8(this.leadingDetachedComments_.get(i));
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getLeadingDetachedCommentsCount() {
                return this.leadingDetachedComments_.size();
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public List<String> getLeadingDetachedCommentsList() {
                return this.leadingDetachedComments_;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getPath(int i) {
                return this.path_.getInt(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getPathCount() {
                return this.path_.size();
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public List<Integer> getPathList() {
                return this.path_;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getSpan(int i) {
                return this.span_.getInt(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public int getSpanCount() {
                return this.span_.size();
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public List<Integer> getSpanList() {
                return this.span_;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public String getTrailingComments() {
                return this.trailingComments_;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public ByteString getTrailingCommentsBytes() {
                return ByteString.copyFromUtf8(this.trailingComments_);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public boolean hasLeadingComments() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
            public boolean hasTrailingComments() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<Location, Builder> implements LocationOrBuilder {
                private Builder() {
                    super(Location.DEFAULT_INSTANCE);
                }

                public Builder addAllLeadingDetachedComments(Iterable<String> iterable) {
                    copyOnWrite();
                    ((Location) this.instance).addAllLeadingDetachedComments(iterable);
                    return this;
                }

                public Builder addAllPath(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Location) this.instance).addAllPath(iterable);
                    return this;
                }

                public Builder addAllSpan(Iterable<? extends Integer> iterable) {
                    copyOnWrite();
                    ((Location) this.instance).addAllSpan(iterable);
                    return this;
                }

                public Builder addLeadingDetachedComments(String str) {
                    copyOnWrite();
                    ((Location) this.instance).addLeadingDetachedComments(str);
                    return this;
                }

                public Builder addLeadingDetachedCommentsBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Location) this.instance).addLeadingDetachedCommentsBytes(byteString);
                    return this;
                }

                public Builder addPath(int i) {
                    copyOnWrite();
                    ((Location) this.instance).addPath(i);
                    return this;
                }

                public Builder addSpan(int i) {
                    copyOnWrite();
                    ((Location) this.instance).addSpan(i);
                    return this;
                }

                public Builder clearLeadingComments() {
                    copyOnWrite();
                    ((Location) this.instance).clearLeadingComments();
                    return this;
                }

                public Builder clearLeadingDetachedComments() {
                    copyOnWrite();
                    ((Location) this.instance).clearLeadingDetachedComments();
                    return this;
                }

                public Builder clearPath() {
                    copyOnWrite();
                    ((Location) this.instance).clearPath();
                    return this;
                }

                public Builder clearSpan() {
                    copyOnWrite();
                    ((Location) this.instance).clearSpan();
                    return this;
                }

                public Builder clearTrailingComments() {
                    copyOnWrite();
                    ((Location) this.instance).clearTrailingComments();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public String getLeadingComments() {
                    return ((Location) this.instance).getLeadingComments();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public ByteString getLeadingCommentsBytes() {
                    return ((Location) this.instance).getLeadingCommentsBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public String getLeadingDetachedComments(int i) {
                    return ((Location) this.instance).getLeadingDetachedComments(i);
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public ByteString getLeadingDetachedCommentsBytes(int i) {
                    return ((Location) this.instance).getLeadingDetachedCommentsBytes(i);
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getLeadingDetachedCommentsCount() {
                    return ((Location) this.instance).getLeadingDetachedCommentsCount();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public List<String> getLeadingDetachedCommentsList() {
                    return Collections.unmodifiableList(((Location) this.instance).getLeadingDetachedCommentsList());
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getPath(int i) {
                    return ((Location) this.instance).getPath(i);
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getPathCount() {
                    return ((Location) this.instance).getPathCount();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public List<Integer> getPathList() {
                    return Collections.unmodifiableList(((Location) this.instance).getPathList());
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getSpan(int i) {
                    return ((Location) this.instance).getSpan(i);
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public int getSpanCount() {
                    return ((Location) this.instance).getSpanCount();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public List<Integer> getSpanList() {
                    return Collections.unmodifiableList(((Location) this.instance).getSpanList());
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public String getTrailingComments() {
                    return ((Location) this.instance).getTrailingComments();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public ByteString getTrailingCommentsBytes() {
                    return ((Location) this.instance).getTrailingCommentsBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public boolean hasLeadingComments() {
                    return ((Location) this.instance).hasLeadingComments();
                }

                @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfo.LocationOrBuilder
                public boolean hasTrailingComments() {
                    return ((Location) this.instance).hasTrailingComments();
                }

                public Builder setLeadingComments(String str) {
                    copyOnWrite();
                    ((Location) this.instance).setLeadingComments(str);
                    return this;
                }

                public Builder setLeadingCommentsBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Location) this.instance).setLeadingCommentsBytes(byteString);
                    return this;
                }

                public Builder setLeadingDetachedComments(int i, String str) {
                    copyOnWrite();
                    ((Location) this.instance).setLeadingDetachedComments(i, str);
                    return this;
                }

                public Builder setPath(int i, int i2) {
                    copyOnWrite();
                    ((Location) this.instance).setPath(i, i2);
                    return this;
                }

                public Builder setSpan(int i, int i2) {
                    copyOnWrite();
                    ((Location) this.instance).setSpan(i, i2);
                    return this;
                }

                public Builder setTrailingComments(String str) {
                    copyOnWrite();
                    ((Location) this.instance).setTrailingComments(str);
                    return this;
                }

                public Builder setTrailingCommentsBytes(ByteString byteString) {
                    copyOnWrite();
                    ((Location) this.instance).setTrailingCommentsBytes(byteString);
                    return this;
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            public static Builder newBuilder(Location location) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(location);
            }

            public static Location parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Location parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Location parseFrom(ByteString byteString) {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Location parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Location parseFrom(byte[] bArr) {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Location parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Location parseFrom(InputStream inputStream) {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Location parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Location parseFrom(CodedInputStream codedInputStream) {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Location parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<SourceCodeInfo, Builder> implements SourceCodeInfoOrBuilder {
            private Builder() {
                super(SourceCodeInfo.DEFAULT_INSTANCE);
            }

            public Builder addAllLocation(Iterable<? extends Location> iterable) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).addAllLocation(iterable);
                return this;
            }

            public Builder addLocation(Location.Builder builder) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).addLocation(builder.build());
                return this;
            }

            public Builder clearLocation() {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).clearLocation();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
            public Location getLocation(int i) {
                return ((SourceCodeInfo) this.instance).getLocation(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
            public int getLocationCount() {
                return ((SourceCodeInfo) this.instance).getLocationCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.SourceCodeInfoOrBuilder
            public List<Location> getLocationList() {
                return Collections.unmodifiableList(((SourceCodeInfo) this.instance).getLocationList());
            }

            public Builder removeLocation(int i) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).removeLocation(i);
                return this;
            }

            public Builder setLocation(int i, Location.Builder builder) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).setLocation(i, builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addLocation(int i, Location location) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).addLocation(i, location);
                return this;
            }

            public Builder setLocation(int i, Location location) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).setLocation(i, location);
                return this;
            }

            public Builder addLocation(Location location) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).addLocation(location);
                return this;
            }

            public Builder addLocation(int i, Location.Builder builder) {
                copyOnWrite();
                ((SourceCodeInfo) this.instance).addLocation(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(SourceCodeInfo sourceCodeInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sourceCodeInfo);
        }

        public static SourceCodeInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString) {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SourceCodeInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocation(int i, Location location) {
            location.getClass();
            ensureLocationIsMutable();
            this.location_.add(i, location);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr) {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SourceCodeInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream) {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SourceCodeInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SourceCodeInfo parseFrom(CodedInputStream codedInputStream) {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SourceCodeInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class UninterpretedOption extends GeneratedMessageLite<UninterpretedOption, Builder> implements UninterpretedOptionOrBuilder {
        public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
        private static final UninterpretedOption DEFAULT_INSTANCE;
        public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
        public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
        private static volatile Parser<UninterpretedOption> PARSER = null;
        public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
        public static final int STRING_VALUE_FIELD_NUMBER = 7;
        private int bitField0_;
        private double doubleValue_;
        private long negativeIntValue_;
        private long positiveIntValue_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<NamePart> name_ = GeneratedMessageLite.emptyProtobufList();
        private String identifierValue_ = "";
        private ByteString stringValue_ = ByteString.EMPTY;
        private String aggregateValue_ = "";

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public interface NamePartOrBuilder extends MessageLiteOrBuilder {
            boolean getIsExtension();

            String getNamePart();

            ByteString getNamePartBytes();

            boolean hasIsExtension();

            boolean hasNamePart();
        }

        static {
            UninterpretedOption uninterpretedOption = new UninterpretedOption();
            DEFAULT_INSTANCE = uninterpretedOption;
            GeneratedMessageLite.registerDefaultInstance(UninterpretedOption.class, uninterpretedOption);
        }

        private UninterpretedOption() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllName(Iterable<? extends NamePart> iterable) {
            ensureNameIsMutable();
            AbstractMessageLite.addAll(iterable, this.name_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addName(NamePart namePart) {
            namePart.getClass();
            ensureNameIsMutable();
            this.name_.add(namePart);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAggregateValue() {
            this.bitField0_ &= -33;
            this.aggregateValue_ = getDefaultInstance().getAggregateValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDoubleValue() {
            this.bitField0_ &= -9;
            this.doubleValue_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifierValue() {
            this.bitField0_ &= -2;
            this.identifierValue_ = getDefaultInstance().getIdentifierValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativeIntValue() {
            this.bitField0_ &= -5;
            this.negativeIntValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPositiveIntValue() {
            this.bitField0_ &= -3;
            this.positiveIntValue_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            this.bitField0_ &= -17;
            this.stringValue_ = getDefaultInstance().getStringValue();
        }

        private void ensureNameIsMutable() {
            Internal.ProtobufList<NamePart> protobufList = this.name_;
            if (!protobufList.isModifiable()) {
                this.name_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static UninterpretedOption getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream) {
            return (UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer) {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<UninterpretedOption> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeName(int i) {
            ensureNameIsMutable();
            this.name_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAggregateValue(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.aggregateValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAggregateValueBytes(ByteString byteString) {
            this.aggregateValue_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDoubleValue(double d) {
            this.bitField0_ |= 8;
            this.doubleValue_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierValue(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.identifierValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierValueBytes(ByteString byteString) {
            this.identifierValue_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(int i, NamePart namePart) {
            namePart.getClass();
            ensureNameIsMutable();
            this.name_.set(i, namePart);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativeIntValue(long j) {
            this.bitField0_ |= 4;
            this.negativeIntValue_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositiveIntValue(long j) {
            this.bitField0_ |= 2;
            this.positiveIntValue_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(ByteString byteString) {
            byteString.getClass();
            this.bitField0_ |= 16;
            this.stringValue_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new UninterpretedOption();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UninterpretedOption> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (UninterpretedOption.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public String getAggregateValue() {
            return this.aggregateValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public ByteString getAggregateValueBytes() {
            return ByteString.copyFromUtf8(this.aggregateValue_);
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public double getDoubleValue() {
            return this.doubleValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public String getIdentifierValue() {
            return this.identifierValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public ByteString getIdentifierValueBytes() {
            return ByteString.copyFromUtf8(this.identifierValue_);
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public NamePart getName(int i) {
            return this.name_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public int getNameCount() {
            return this.name_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public List<NamePart> getNameList() {
            return this.name_;
        }

        public NamePartOrBuilder getNameOrBuilder(int i) {
            return this.name_.get(i);
        }

        public List<? extends NamePartOrBuilder> getNameOrBuilderList() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public long getNegativeIntValue() {
            return this.negativeIntValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public long getPositiveIntValue() {
            return this.positiveIntValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public ByteString getStringValue() {
            return this.stringValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasAggregateValue() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasDoubleValue() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasIdentifierValue() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasNegativeIntValue() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasPositiveIntValue() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
        public boolean hasStringValue() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class NamePart extends GeneratedMessageLite<NamePart, Builder> implements NamePartOrBuilder {
            private static final NamePart DEFAULT_INSTANCE;
            public static final int IS_EXTENSION_FIELD_NUMBER = 2;
            public static final int NAME_PART_FIELD_NUMBER = 1;
            private static volatile Parser<NamePart> PARSER;
            private int bitField0_;
            private boolean isExtension_;
            private byte memoizedIsInitialized = 2;
            private String namePart_ = "";

            static {
                NamePart namePart = new NamePart();
                DEFAULT_INSTANCE = namePart;
                GeneratedMessageLite.registerDefaultInstance(NamePart.class, namePart);
            }

            private NamePart() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearIsExtension() {
                this.bitField0_ &= -3;
                this.isExtension_ = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNamePart() {
                this.bitField0_ &= -2;
                this.namePart_ = getDefaultInstance().getNamePart();
            }

            public static NamePart getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream) {
                return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer) {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<NamePart> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setIsExtension(boolean z) {
                this.bitField0_ |= 2;
                this.isExtension_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNamePart(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.namePart_ = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNamePartBytes(ByteString byteString) {
                this.namePart_ = byteString.toStringUtf8();
                this.bitField0_ |= 1;
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser parser;
                int i;
                AnonymousClass1 anonymousClass1 = null;
                switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                    case 1:
                        return new NamePart();
                    case 2:
                        return new Builder(anonymousClass1);
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<NamePart> parser2 = PARSER;
                        if (parser2 == null) {
                            synchronized (NamePart.class) {
                                try {
                                    parser = PARSER;
                                    if (parser == null) {
                                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                        PARSER = parser;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return parser;
                        }
                        return parser2;
                    case 6:
                        return Byte.valueOf(this.memoizedIsInitialized);
                    case 7:
                        if (obj == null) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        this.memoizedIsInitialized = (byte) i;
                        return null;
                    default:
                        throw null;
                }
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public boolean getIsExtension() {
                return this.isExtension_;
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public String getNamePart() {
                return this.namePart_;
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public ByteString getNamePartBytes() {
                return ByteString.copyFromUtf8(this.namePart_);
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public boolean hasIsExtension() {
                if ((this.bitField0_ & 2) != 0) {
                    return true;
                }
                return false;
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
            public boolean hasNamePart() {
                if ((this.bitField0_ & 1) != 0) {
                    return true;
                }
                return false;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class Builder extends GeneratedMessageLite.Builder<NamePart, Builder> implements NamePartOrBuilder {
                private Builder() {
                    super(NamePart.DEFAULT_INSTANCE);
                }

                public Builder clearIsExtension() {
                    copyOnWrite();
                    ((NamePart) this.instance).clearIsExtension();
                    return this;
                }

                public Builder clearNamePart() {
                    copyOnWrite();
                    ((NamePart) this.instance).clearNamePart();
                    return this;
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public boolean getIsExtension() {
                    return ((NamePart) this.instance).getIsExtension();
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public String getNamePart() {
                    return ((NamePart) this.instance).getNamePart();
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public ByteString getNamePartBytes() {
                    return ((NamePart) this.instance).getNamePartBytes();
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public boolean hasIsExtension() {
                    return ((NamePart) this.instance).hasIsExtension();
                }

                @Override // com.google.protobuf.DescriptorProtos.UninterpretedOption.NamePartOrBuilder
                public boolean hasNamePart() {
                    return ((NamePart) this.instance).hasNamePart();
                }

                public Builder setIsExtension(boolean z) {
                    copyOnWrite();
                    ((NamePart) this.instance).setIsExtension(z);
                    return this;
                }

                public Builder setNamePart(String str) {
                    copyOnWrite();
                    ((NamePart) this.instance).setNamePart(str);
                    return this;
                }

                public Builder setNamePartBytes(ByteString byteString) {
                    copyOnWrite();
                    ((NamePart) this.instance).setNamePartBytes(byteString);
                    return this;
                }

                public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            public static Builder newBuilder(NamePart namePart) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(namePart);
            }

            public static NamePart parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static NamePart parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static NamePart parseFrom(ByteString byteString) {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static NamePart parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static NamePart parseFrom(byte[] bArr) {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static NamePart parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static NamePart parseFrom(InputStream inputStream) {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static NamePart parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static NamePart parseFrom(CodedInputStream codedInputStream) {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static NamePart parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<UninterpretedOption, Builder> implements UninterpretedOptionOrBuilder {
            private Builder() {
                super(UninterpretedOption.DEFAULT_INSTANCE);
            }

            public Builder addAllName(Iterable<? extends NamePart> iterable) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).addAllName(iterable);
                return this;
            }

            public Builder addName(NamePart.Builder builder) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).addName(builder.build());
                return this;
            }

            public Builder clearAggregateValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearAggregateValue();
                return this;
            }

            public Builder clearDoubleValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearDoubleValue();
                return this;
            }

            public Builder clearIdentifierValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearIdentifierValue();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearName();
                return this;
            }

            public Builder clearNegativeIntValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearNegativeIntValue();
                return this;
            }

            public Builder clearPositiveIntValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearPositiveIntValue();
                return this;
            }

            public Builder clearStringValue() {
                copyOnWrite();
                ((UninterpretedOption) this.instance).clearStringValue();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public String getAggregateValue() {
                return ((UninterpretedOption) this.instance).getAggregateValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public ByteString getAggregateValueBytes() {
                return ((UninterpretedOption) this.instance).getAggregateValueBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public double getDoubleValue() {
                return ((UninterpretedOption) this.instance).getDoubleValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public String getIdentifierValue() {
                return ((UninterpretedOption) this.instance).getIdentifierValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public ByteString getIdentifierValueBytes() {
                return ((UninterpretedOption) this.instance).getIdentifierValueBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public NamePart getName(int i) {
                return ((UninterpretedOption) this.instance).getName(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public int getNameCount() {
                return ((UninterpretedOption) this.instance).getNameCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public List<NamePart> getNameList() {
                return Collections.unmodifiableList(((UninterpretedOption) this.instance).getNameList());
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public long getNegativeIntValue() {
                return ((UninterpretedOption) this.instance).getNegativeIntValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public long getPositiveIntValue() {
                return ((UninterpretedOption) this.instance).getPositiveIntValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public ByteString getStringValue() {
                return ((UninterpretedOption) this.instance).getStringValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasAggregateValue() {
                return ((UninterpretedOption) this.instance).hasAggregateValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasDoubleValue() {
                return ((UninterpretedOption) this.instance).hasDoubleValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasIdentifierValue() {
                return ((UninterpretedOption) this.instance).hasIdentifierValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasNegativeIntValue() {
                return ((UninterpretedOption) this.instance).hasNegativeIntValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasPositiveIntValue() {
                return ((UninterpretedOption) this.instance).hasPositiveIntValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.UninterpretedOptionOrBuilder
            public boolean hasStringValue() {
                return ((UninterpretedOption) this.instance).hasStringValue();
            }

            public Builder removeName(int i) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).removeName(i);
                return this;
            }

            public Builder setAggregateValue(String str) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setAggregateValue(str);
                return this;
            }

            public Builder setAggregateValueBytes(ByteString byteString) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setAggregateValueBytes(byteString);
                return this;
            }

            public Builder setDoubleValue(double d) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setDoubleValue(d);
                return this;
            }

            public Builder setIdentifierValue(String str) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setIdentifierValue(str);
                return this;
            }

            public Builder setIdentifierValueBytes(ByteString byteString) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setIdentifierValueBytes(byteString);
                return this;
            }

            public Builder setName(int i, NamePart.Builder builder) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setName(i, builder.build());
                return this;
            }

            public Builder setNegativeIntValue(long j) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setNegativeIntValue(j);
                return this;
            }

            public Builder setPositiveIntValue(long j) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setPositiveIntValue(j);
                return this;
            }

            public Builder setStringValue(ByteString byteString) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setStringValue(byteString);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addName(int i, NamePart namePart) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).addName(i, namePart);
                return this;
            }

            public Builder setName(int i, NamePart namePart) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).setName(i, namePart);
                return this;
            }

            public Builder addName(NamePart namePart) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).addName(namePart);
                return this;
            }

            public Builder addName(int i, NamePart.Builder builder) {
                copyOnWrite();
                ((UninterpretedOption) this.instance).addName(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(UninterpretedOption uninterpretedOption) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(uninterpretedOption);
        }

        public static UninterpretedOption parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(ByteString byteString) {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static UninterpretedOption parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addName(int i, NamePart namePart) {
            namePart.getClass();
            ensureNameIsMutable();
            this.name_.add(i, namePart);
        }

        public static UninterpretedOption parseFrom(byte[] bArr) {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static UninterpretedOption parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream) {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UninterpretedOption parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static UninterpretedOption parseFrom(CodedInputStream codedInputStream) {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static UninterpretedOption parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class EnumOptions extends GeneratedMessageLite.ExtendableMessage<EnumOptions, Builder> implements EnumOptionsOrBuilder {
        public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
        private static final EnumOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 6;
        public static final int FEATURES_FIELD_NUMBER = 7;
        private static volatile Parser<EnumOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private boolean allowAlias_;
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private FeatureSet features_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        static {
            EnumOptions enumOptions = new EnumOptions();
            DEFAULT_INSTANCE = enumOptions;
            GeneratedMessageLite.registerDefaultInstance(EnumOptions.class, enumOptions);
        }

        private EnumOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllowAlias() {
            this.bitField0_ &= -2;
            this.allowAlias_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecatedLegacyJsonFieldConflicts() {
            this.bitField0_ &= -5;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (!protobufList.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static EnumOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            FeatureSet featureSet2 = this.features_;
            if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                this.features_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.features_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
            } else {
                this.features_ = featureSet;
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream) {
            return (EnumOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer) {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnumOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllowAlias(boolean z) {
            this.bitField0_ |= 1;
            this.allowAlias_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 2;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecatedLegacyJsonFieldConflicts(boolean z) {
            this.bitField0_ |= 4;
            this.deprecatedLegacyJsonFieldConflicts_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            this.features_ = featureSet;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0002ϧ\u0005\u0000\u0001\u0002\u0002ဇ\u0000\u0003ဇ\u0001\u0006ဇ\u0002\u0007ᐉ\u0003ϧЛ", new Object[]{"bitField0_", "allowAlias_", "deprecated_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnumOptions> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (EnumOptions.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean getAllowAlias() {
            return this.allowAlias_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            if (featureSet == null) {
                return FeatureSet.getDefaultInstance();
            }
            return featureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean hasAllowAlias() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean hasDeprecated() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
        public boolean hasFeatures() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumOptions, Builder> implements EnumOptionsOrBuilder {
            private Builder() {
                super(EnumOptions.DEFAULT_INSTANCE);
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((EnumOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder clearAllowAlias() {
                copyOnWrite();
                ((EnumOptions) this.instance).clearAllowAlias();
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((EnumOptions) this.instance).clearDeprecated();
                return this;
            }

            @Deprecated
            public Builder clearDeprecatedLegacyJsonFieldConflicts() {
                copyOnWrite();
                ((EnumOptions) this.instance).clearDeprecatedLegacyJsonFieldConflicts();
                return this;
            }

            public Builder clearFeatures() {
                copyOnWrite();
                ((EnumOptions) this.instance).clearFeatures();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((EnumOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean getAllowAlias() {
                return ((EnumOptions) this.instance).getAllowAlias();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean getDeprecated() {
                return ((EnumOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            @Deprecated
            public boolean getDeprecatedLegacyJsonFieldConflicts() {
                return ((EnumOptions) this.instance).getDeprecatedLegacyJsonFieldConflicts();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public FeatureSet getFeatures() {
                return ((EnumOptions) this.instance).getFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
                return ((EnumOptions) this.instance).getUninterpretedOption(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((EnumOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((EnumOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean hasAllowAlias() {
                return ((EnumOptions) this.instance).hasAllowAlias();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((EnumOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            @Deprecated
            public boolean hasDeprecatedLegacyJsonFieldConflicts() {
                return ((EnumOptions) this.instance).hasDeprecatedLegacyJsonFieldConflicts();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumOptionsOrBuilder
            public boolean hasFeatures() {
                return ((EnumOptions) this.instance).hasFeatures();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((EnumOptions) this.instance).mergeFeatures(featureSet);
                return this;
            }

            public Builder removeUninterpretedOption(int i) {
                copyOnWrite();
                ((EnumOptions) this.instance).removeUninterpretedOption(i);
                return this;
            }

            public Builder setAllowAlias(boolean z) {
                copyOnWrite();
                ((EnumOptions) this.instance).setAllowAlias(z);
                return this;
            }

            public Builder setDeprecated(boolean z) {
                copyOnWrite();
                ((EnumOptions) this.instance).setDeprecated(z);
                return this;
            }

            @Deprecated
            public Builder setDeprecatedLegacyJsonFieldConflicts(boolean z) {
                copyOnWrite();
                ((EnumOptions) this.instance).setDeprecatedLegacyJsonFieldConflicts(z);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFeatures(FeatureSet.Builder builder) {
                copyOnWrite();
                ((EnumOptions) this.instance).setFeatures((FeatureSet) builder.build());
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumOptions) this.instance).setUninterpretedOption(i, builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumOptions) this.instance).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder setFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((EnumOptions) this.instance).setFeatures(featureSet);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumOptions) this.instance).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumOptions) this.instance).addUninterpretedOption(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(EnumOptions enumOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(enumOptions);
        }

        public static EnumOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(ByteString byteString) {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnumOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static EnumOptions parseFrom(byte[] bArr) {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(InputStream inputStream) {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumOptions parseFrom(CodedInputStream codedInputStream) {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnumOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class EnumValueDescriptorProto extends GeneratedMessageLite<EnumValueDescriptorProto, Builder> implements EnumValueDescriptorProtoOrBuilder {
        private static final EnumValueDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<EnumValueDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int number_;
        private EnumValueOptions options_;

        static {
            EnumValueDescriptorProto enumValueDescriptorProto = new EnumValueDescriptorProto();
            DEFAULT_INSTANCE = enumValueDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(EnumValueDescriptorProto.class, enumValueDescriptorProto);
        }

        private EnumValueDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        public static EnumValueDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(EnumValueOptions enumValueOptions) {
            enumValueOptions.getClass();
            EnumValueOptions enumValueOptions2 = this.options_;
            if (enumValueOptions2 != null && enumValueOptions2 != EnumValueOptions.getDefaultInstance()) {
                this.options_ = ((EnumValueOptions.Builder) EnumValueOptions.newBuilder(this.options_).mergeFrom((EnumValueOptions.Builder) enumValueOptions)).buildPartial();
            } else {
                this.options_ = enumValueOptions;
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnumValueDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int i) {
            this.bitField0_ |= 2;
            this.number_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(EnumValueOptions enumValueOptions) {
            enumValueOptions.getClass();
            this.options_ = enumValueOptions;
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumValueDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "name_", "number_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnumValueDescriptorProto> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (EnumValueDescriptorProto.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public EnumValueOptions getOptions() {
            EnumValueOptions enumValueOptions = this.options_;
            if (enumValueOptions == null) {
                return EnumValueOptions.getDefaultInstance();
            }
            return enumValueOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public boolean hasName() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public boolean hasNumber() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
        public boolean hasOptions() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<EnumValueDescriptorProto, Builder> implements EnumValueDescriptorProtoOrBuilder {
            private Builder() {
                super(EnumValueDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder clearName() {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).clearNumber();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).clearOptions();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public String getName() {
                return ((EnumValueDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((EnumValueDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public int getNumber() {
                return ((EnumValueDescriptorProto) this.instance).getNumber();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public EnumValueOptions getOptions() {
                return ((EnumValueDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((EnumValueDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public boolean hasNumber() {
                return ((EnumValueDescriptorProto) this.instance).hasNumber();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((EnumValueDescriptorProto) this.instance).hasOptions();
            }

            public Builder mergeOptions(EnumValueOptions enumValueOptions) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).mergeOptions(enumValueOptions);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNumber(int i) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).setNumber(i);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(EnumValueOptions.Builder builder) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).setOptions((EnumValueOptions) builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder setOptions(EnumValueOptions enumValueOptions) {
                copyOnWrite();
                ((EnumValueDescriptorProto) this.instance).setOptions(enumValueOptions);
                return this;
            }
        }

        public static Builder newBuilder(EnumValueDescriptorProto enumValueDescriptorProto) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(enumValueDescriptorProto);
        }

        public static EnumValueDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnumValueDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumValueDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnumValueDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class EnumValueOptions extends GeneratedMessageLite.ExtendableMessage<EnumValueOptions, Builder> implements EnumValueOptionsOrBuilder {
        public static final int DEBUG_REDACT_FIELD_NUMBER = 3;
        private static final EnumValueOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 1;
        public static final int FEATURES_FIELD_NUMBER = 2;
        public static final int FEATURE_SUPPORT_FIELD_NUMBER = 4;
        private static volatile Parser<EnumValueOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean debugRedact_;
        private boolean deprecated_;
        private FieldOptions.FeatureSupport featureSupport_;
        private FeatureSet features_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        static {
            EnumValueOptions enumValueOptions = new EnumValueOptions();
            DEFAULT_INSTANCE = enumValueOptions;
            GeneratedMessageLite.registerDefaultInstance(EnumValueOptions.class, enumValueOptions);
        }

        private EnumValueOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDebugRedact() {
            this.bitField0_ &= -5;
            this.debugRedact_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatureSupport() {
            this.featureSupport_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (!protobufList.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static EnumValueOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFeatureSupport(FieldOptions.FeatureSupport featureSupport) {
            featureSupport.getClass();
            FieldOptions.FeatureSupport featureSupport2 = this.featureSupport_;
            if (featureSupport2 != null && featureSupport2 != FieldOptions.FeatureSupport.getDefaultInstance()) {
                this.featureSupport_ = FieldOptions.FeatureSupport.newBuilder(this.featureSupport_).mergeFrom((FieldOptions.FeatureSupport.Builder) featureSupport).buildPartial();
            } else {
                this.featureSupport_ = featureSupport;
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            FeatureSet featureSet2 = this.features_;
            if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                this.features_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.features_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
            } else {
                this.features_ = featureSet;
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream) {
            return (EnumValueOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer) {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EnumValueOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDebugRedact(boolean z) {
            this.bitField0_ |= 4;
            this.debugRedact_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatureSupport(FieldOptions.FeatureSupport featureSupport) {
            featureSupport.getClass();
            this.featureSupport_ = featureSupport;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            this.features_ = featureSet;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new EnumValueOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "debugRedact_", "featureSupport_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EnumValueOptions> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (EnumValueOptions.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public boolean getDebugRedact() {
            return this.debugRedact_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public FieldOptions.FeatureSupport getFeatureSupport() {
            FieldOptions.FeatureSupport featureSupport = this.featureSupport_;
            if (featureSupport == null) {
                return FieldOptions.FeatureSupport.getDefaultInstance();
            }
            return featureSupport;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            if (featureSet == null) {
                return FeatureSet.getDefaultInstance();
            }
            return featureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public boolean hasDebugRedact() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public boolean hasDeprecated() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public boolean hasFeatureSupport() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
        public boolean hasFeatures() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumValueOptions, Builder> implements EnumValueOptionsOrBuilder {
            private Builder() {
                super(EnumValueOptions.DEFAULT_INSTANCE);
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder clearDebugRedact() {
                copyOnWrite();
                ((EnumValueOptions) this.instance).clearDebugRedact();
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((EnumValueOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearFeatureSupport() {
                copyOnWrite();
                ((EnumValueOptions) this.instance).clearFeatureSupport();
                return this;
            }

            public Builder clearFeatures() {
                copyOnWrite();
                ((EnumValueOptions) this.instance).clearFeatures();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((EnumValueOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public boolean getDebugRedact() {
                return ((EnumValueOptions) this.instance).getDebugRedact();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public boolean getDeprecated() {
                return ((EnumValueOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public FieldOptions.FeatureSupport getFeatureSupport() {
                return ((EnumValueOptions) this.instance).getFeatureSupport();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public FeatureSet getFeatures() {
                return ((EnumValueOptions) this.instance).getFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
                return ((EnumValueOptions) this.instance).getUninterpretedOption(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((EnumValueOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((EnumValueOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public boolean hasDebugRedact() {
                return ((EnumValueOptions) this.instance).hasDebugRedact();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((EnumValueOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public boolean hasFeatureSupport() {
                return ((EnumValueOptions) this.instance).hasFeatureSupport();
            }

            @Override // com.google.protobuf.DescriptorProtos.EnumValueOptionsOrBuilder
            public boolean hasFeatures() {
                return ((EnumValueOptions) this.instance).hasFeatures();
            }

            public Builder mergeFeatureSupport(FieldOptions.FeatureSupport featureSupport) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).mergeFeatureSupport(featureSupport);
                return this;
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).mergeFeatures(featureSet);
                return this;
            }

            public Builder removeUninterpretedOption(int i) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).removeUninterpretedOption(i);
                return this;
            }

            public Builder setDebugRedact(boolean z) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setDebugRedact(z);
                return this;
            }

            public Builder setDeprecated(boolean z) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setDeprecated(z);
                return this;
            }

            public Builder setFeatureSupport(FieldOptions.FeatureSupport.Builder builder) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setFeatureSupport(builder.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFeatures(FeatureSet.Builder builder) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setFeatures((FeatureSet) builder.build());
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setUninterpretedOption(i, builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder setFeatureSupport(FieldOptions.FeatureSupport featureSupport) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setFeatureSupport(featureSupport);
                return this;
            }

            public Builder setFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setFeatures(featureSet);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((EnumValueOptions) this.instance).addUninterpretedOption(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(EnumValueOptions enumValueOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(enumValueOptions);
        }

        public static EnumValueOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(ByteString byteString) {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EnumValueOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static EnumValueOptions parseFrom(byte[] bArr) {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumValueOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream) {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumValueOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EnumValueOptions parseFrom(CodedInputStream codedInputStream) {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EnumValueOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnumValueOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class FieldDescriptorProto extends GeneratedMessageLite<FieldDescriptorProto, Builder> implements FieldDescriptorProtoOrBuilder {
        private static final FieldDescriptorProto DEFAULT_INSTANCE;
        public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
        public static final int EXTENDEE_FIELD_NUMBER = 2;
        public static final int JSON_NAME_FIELD_NUMBER = 10;
        public static final int LABEL_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int NUMBER_FIELD_NUMBER = 3;
        public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        private static volatile Parser<FieldDescriptorProto> PARSER = null;
        public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 5;
        public static final int TYPE_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private int number_;
        private int oneofIndex_;
        private FieldOptions options_;
        private boolean proto3Optional_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private int label_ = 1;
        private int type_ = 1;
        private String typeName_ = "";
        private String extendee_ = "";
        private String defaultValue_ = "";
        private String jsonName_ = "";

        static {
            FieldDescriptorProto fieldDescriptorProto = new FieldDescriptorProto();
            DEFAULT_INSTANCE = fieldDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(FieldDescriptorProto.class, fieldDescriptorProto);
        }

        private FieldDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaultValue() {
            this.bitField0_ &= -65;
            this.defaultValue_ = getDefaultInstance().getDefaultValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtendee() {
            this.bitField0_ &= -33;
            this.extendee_ = getDefaultInstance().getExtendee();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJsonName() {
            this.bitField0_ &= -257;
            this.jsonName_ = getDefaultInstance().getJsonName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLabel() {
            this.bitField0_ &= -5;
            this.label_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.bitField0_ &= -3;
            this.number_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOneofIndex() {
            this.bitField0_ &= -129;
            this.oneofIndex_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProto3Optional() {
            this.bitField0_ &= -1025;
            this.proto3Optional_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -9;
            this.type_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTypeName() {
            this.bitField0_ &= -17;
            this.typeName_ = getDefaultInstance().getTypeName();
        }

        public static FieldDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(FieldOptions fieldOptions) {
            fieldOptions.getClass();
            FieldOptions fieldOptions2 = this.options_;
            if (fieldOptions2 != null && fieldOptions2 != FieldOptions.getDefaultInstance()) {
                this.options_ = ((FieldOptions.Builder) FieldOptions.newBuilder(this.options_).mergeFrom((FieldOptions.Builder) fieldOptions)).buildPartial();
            } else {
                this.options_ = fieldOptions;
            }
            this.bitField0_ |= 512;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FieldDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultValue(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.defaultValue_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultValueBytes(ByteString byteString) {
            this.defaultValue_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtendee(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.extendee_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtendeeBytes(ByteString byteString) {
            this.extendee_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJsonName(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.jsonName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJsonNameBytes(ByteString byteString) {
            this.jsonName_ = byteString.toStringUtf8();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLabel(Label label) {
            this.label_ = label.getNumber();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(int i) {
            this.bitField0_ |= 2;
            this.number_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOneofIndex(int i) {
            this.bitField0_ |= 128;
            this.oneofIndex_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(FieldOptions fieldOptions) {
            fieldOptions.getClass();
            this.options_ = fieldOptions;
            this.bitField0_ |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProto3Optional(boolean z) {
            this.bitField0_ |= 1024;
            this.proto3Optional_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(Type type) {
            this.type_ = type.getNumber();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeName(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.typeName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeNameBytes(ByteString byteString) {
            this.typeName_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FieldDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004᠌\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", Label.internalGetVerifier(), "type_", Type.internalGetVerifier(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FieldDescriptorProto> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (FieldDescriptorProto.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getDefaultValue() {
            return this.defaultValue_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getDefaultValueBytes() {
            return ByteString.copyFromUtf8(this.defaultValue_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getExtendee() {
            return this.extendee_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getExtendeeBytes() {
            return ByteString.copyFromUtf8(this.extendee_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getJsonName() {
            return this.jsonName_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getJsonNameBytes() {
            return ByteString.copyFromUtf8(this.jsonName_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public Label getLabel() {
            Label forNumber = Label.forNumber(this.label_);
            if (forNumber == null) {
                return Label.LABEL_OPTIONAL;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public int getNumber() {
            return this.number_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public int getOneofIndex() {
            return this.oneofIndex_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public FieldOptions getOptions() {
            FieldOptions fieldOptions = this.options_;
            if (fieldOptions == null) {
                return FieldOptions.getDefaultInstance();
            }
            return fieldOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean getProto3Optional() {
            return this.proto3Optional_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public Type getType() {
            Type forNumber = Type.forNumber(this.type_);
            if (forNumber == null) {
                return Type.TYPE_DOUBLE;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public String getTypeName() {
            return this.typeName_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public ByteString getTypeNameBytes() {
            return ByteString.copyFromUtf8(this.typeName_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasDefaultValue() {
            if ((this.bitField0_ & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasExtendee() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasJsonName() {
            if ((this.bitField0_ & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasLabel() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasName() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasNumber() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasOneofIndex() {
            if ((this.bitField0_ & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasOptions() {
            if ((this.bitField0_ & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasProto3Optional() {
            if ((this.bitField0_ & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasType() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
        public boolean hasTypeName() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<FieldDescriptorProto, Builder> implements FieldDescriptorProtoOrBuilder {
            private Builder() {
                super(FieldDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder clearDefaultValue() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearDefaultValue();
                return this;
            }

            public Builder clearExtendee() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearExtendee();
                return this;
            }

            public Builder clearJsonName() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearJsonName();
                return this;
            }

            public Builder clearLabel() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearLabel();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearNumber();
                return this;
            }

            public Builder clearOneofIndex() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearOneofIndex();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearOptions();
                return this;
            }

            public Builder clearProto3Optional() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearProto3Optional();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearType();
                return this;
            }

            public Builder clearTypeName() {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).clearTypeName();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getDefaultValue() {
                return ((FieldDescriptorProto) this.instance).getDefaultValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getDefaultValueBytes() {
                return ((FieldDescriptorProto) this.instance).getDefaultValueBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getExtendee() {
                return ((FieldDescriptorProto) this.instance).getExtendee();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getExtendeeBytes() {
                return ((FieldDescriptorProto) this.instance).getExtendeeBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getJsonName() {
                return ((FieldDescriptorProto) this.instance).getJsonName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getJsonNameBytes() {
                return ((FieldDescriptorProto) this.instance).getJsonNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public Label getLabel() {
                return ((FieldDescriptorProto) this.instance).getLabel();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getName() {
                return ((FieldDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((FieldDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public int getNumber() {
                return ((FieldDescriptorProto) this.instance).getNumber();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public int getOneofIndex() {
                return ((FieldDescriptorProto) this.instance).getOneofIndex();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public FieldOptions getOptions() {
                return ((FieldDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean getProto3Optional() {
                return ((FieldDescriptorProto) this.instance).getProto3Optional();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public Type getType() {
                return ((FieldDescriptorProto) this.instance).getType();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public String getTypeName() {
                return ((FieldDescriptorProto) this.instance).getTypeName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public ByteString getTypeNameBytes() {
                return ((FieldDescriptorProto) this.instance).getTypeNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasDefaultValue() {
                return ((FieldDescriptorProto) this.instance).hasDefaultValue();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasExtendee() {
                return ((FieldDescriptorProto) this.instance).hasExtendee();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasJsonName() {
                return ((FieldDescriptorProto) this.instance).hasJsonName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasLabel() {
                return ((FieldDescriptorProto) this.instance).hasLabel();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((FieldDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasNumber() {
                return ((FieldDescriptorProto) this.instance).hasNumber();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasOneofIndex() {
                return ((FieldDescriptorProto) this.instance).hasOneofIndex();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((FieldDescriptorProto) this.instance).hasOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasProto3Optional() {
                return ((FieldDescriptorProto) this.instance).hasProto3Optional();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasType() {
                return ((FieldDescriptorProto) this.instance).hasType();
            }

            @Override // com.google.protobuf.DescriptorProtos.FieldDescriptorProtoOrBuilder
            public boolean hasTypeName() {
                return ((FieldDescriptorProto) this.instance).hasTypeName();
            }

            public Builder mergeOptions(FieldOptions fieldOptions) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).mergeOptions(fieldOptions);
                return this;
            }

            public Builder setDefaultValue(String str) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setDefaultValue(str);
                return this;
            }

            public Builder setDefaultValueBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setDefaultValueBytes(byteString);
                return this;
            }

            public Builder setExtendee(String str) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setExtendee(str);
                return this;
            }

            public Builder setExtendeeBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setExtendeeBytes(byteString);
                return this;
            }

            public Builder setJsonName(String str) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setJsonName(str);
                return this;
            }

            public Builder setJsonNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setJsonNameBytes(byteString);
                return this;
            }

            public Builder setLabel(Label label) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setLabel(label);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setNumber(int i) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setNumber(i);
                return this;
            }

            public Builder setOneofIndex(int i) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setOneofIndex(i);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(FieldOptions.Builder builder) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setOptions((FieldOptions) builder.build());
                return this;
            }

            public Builder setProto3Optional(boolean z) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setProto3Optional(z);
                return this;
            }

            public Builder setType(Type type) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setType(type);
                return this;
            }

            public Builder setTypeName(String str) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setTypeName(str);
                return this;
            }

            public Builder setTypeNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setTypeNameBytes(byteString);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder setOptions(FieldOptions fieldOptions) {
                copyOnWrite();
                ((FieldDescriptorProto) this.instance).setOptions(fieldOptions);
                return this;
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum Label implements Internal.EnumLite {
            LABEL_OPTIONAL(1),
            LABEL_REPEATED(3),
            LABEL_REQUIRED(2);

            public static final int LABEL_OPTIONAL_VALUE = 1;
            public static final int LABEL_REPEATED_VALUE = 3;
            public static final int LABEL_REQUIRED_VALUE = 2;
            private static final Internal.EnumLiteMap<Label> internalValueMap = new Internal.EnumLiteMap<Label>() { // from class: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Label.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Label findValueByNumber(int i) {
                    return Label.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class LabelVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new LabelVerifier();

                private LabelVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (Label.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            Label(int i) {
                this.value = i;
            }

            public static Label forNumber(int i) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return LABEL_REPEATED;
                    }
                    return LABEL_REQUIRED;
                }
                return LABEL_OPTIONAL;
            }

            public static Internal.EnumLiteMap<Label> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return LabelVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Label valueOf(int i) {
                return forNumber(i);
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum Type implements Internal.EnumLite {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);

            public static final int TYPE_BOOL_VALUE = 8;
            public static final int TYPE_BYTES_VALUE = 12;
            public static final int TYPE_DOUBLE_VALUE = 1;
            public static final int TYPE_ENUM_VALUE = 14;
            public static final int TYPE_FIXED32_VALUE = 7;
            public static final int TYPE_FIXED64_VALUE = 6;
            public static final int TYPE_FLOAT_VALUE = 2;
            public static final int TYPE_GROUP_VALUE = 10;
            public static final int TYPE_INT32_VALUE = 5;
            public static final int TYPE_INT64_VALUE = 3;
            public static final int TYPE_MESSAGE_VALUE = 11;
            public static final int TYPE_SFIXED32_VALUE = 15;
            public static final int TYPE_SFIXED64_VALUE = 16;
            public static final int TYPE_SINT32_VALUE = 17;
            public static final int TYPE_SINT64_VALUE = 18;
            public static final int TYPE_STRING_VALUE = 9;
            public static final int TYPE_UINT32_VALUE = 13;
            public static final int TYPE_UINT64_VALUE = 4;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.google.protobuf.DescriptorProtos.FieldDescriptorProto.Type.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Type findValueByNumber(int i) {
                    return Type.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class TypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new TypeVerifier();

                private TypeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (Type.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            Type(int i) {
                this.value = i;
            }

            public static Type forNumber(int i) {
                switch (i) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Type> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return TypeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Type valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(FieldDescriptorProto fieldDescriptorProto) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fieldDescriptorProto);
        }

        public static FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FieldDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FieldDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FieldDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FieldDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class FileDescriptorProto extends GeneratedMessageLite<FileDescriptorProto, Builder> implements FileDescriptorProtoOrBuilder {
        private static final FileDescriptorProto DEFAULT_INSTANCE;
        public static final int DEPENDENCY_FIELD_NUMBER = 3;
        public static final int EDITION_FIELD_NUMBER = 14;
        public static final int ENUM_TYPE_FIELD_NUMBER = 5;
        public static final int EXTENSION_FIELD_NUMBER = 7;
        public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 8;
        public static final int OPTION_DEPENDENCY_FIELD_NUMBER = 15;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        private static volatile Parser<FileDescriptorProto> PARSER = null;
        public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
        public static final int SERVICE_FIELD_NUMBER = 6;
        public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
        public static final int SYNTAX_FIELD_NUMBER = 12;
        public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
        private int bitField0_;
        private int edition_;
        private FileOptions options_;
        private SourceCodeInfo sourceCodeInfo_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String package_ = "";
        private Internal.ProtobufList<String> dependency_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.IntList publicDependency_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList weakDependency_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<String> optionDependency_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<DescriptorProto> messageType_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<EnumDescriptorProto> enumType_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<ServiceDescriptorProto> service_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<FieldDescriptorProto> extension_ = GeneratedMessageLite.emptyProtobufList();
        private String syntax_ = "";

        static {
            FileDescriptorProto fileDescriptorProto = new FileDescriptorProto();
            DEFAULT_INSTANCE = fileDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorProto.class, fileDescriptorProto);
        }

        private FileDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDependency(Iterable<String> iterable) {
            ensureDependencyIsMutable();
            AbstractMessageLite.addAll(iterable, this.dependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
            ensureEnumTypeIsMutable();
            AbstractMessageLite.addAll(iterable, this.enumType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
            ensureExtensionIsMutable();
            AbstractMessageLite.addAll(iterable, this.extension_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMessageType(Iterable<? extends DescriptorProto> iterable) {
            ensureMessageTypeIsMutable();
            AbstractMessageLite.addAll(iterable, this.messageType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOptionDependency(Iterable<String> iterable) {
            ensureOptionDependencyIsMutable();
            AbstractMessageLite.addAll(iterable, this.optionDependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPublicDependency(Iterable<? extends Integer> iterable) {
            ensurePublicDependencyIsMutable();
            AbstractMessageLite.addAll(iterable, this.publicDependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllService(Iterable<? extends ServiceDescriptorProto> iterable) {
            ensureServiceIsMutable();
            AbstractMessageLite.addAll(iterable, this.service_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllWeakDependency(Iterable<? extends Integer> iterable) {
            ensureWeakDependencyIsMutable();
            AbstractMessageLite.addAll(iterable, this.weakDependency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDependency(String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDependencyBytes(ByteString byteString) {
            ensureDependencyIsMutable();
            this.dependency_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessageType(DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.add(descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOptionDependency(String str) {
            str.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOptionDependencyBytes(ByteString byteString) {
            ensureOptionDependencyIsMutable();
            this.optionDependency_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPublicDependency(int i) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addService(ServiceDescriptorProto serviceDescriptorProto) {
            serviceDescriptorProto.getClass();
            ensureServiceIsMutable();
            this.service_.add(serviceDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addWeakDependency(int i) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.addInt(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDependency() {
            this.dependency_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEdition() {
            this.bitField0_ &= -33;
            this.edition_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnumType() {
            this.enumType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtension() {
            this.extension_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageType() {
            this.messageType_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptionDependency() {
            this.optionDependency_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPackage() {
            this.bitField0_ &= -3;
            this.package_ = getDefaultInstance().getPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPublicDependency() {
            this.publicDependency_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearService() {
            this.service_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceCodeInfo() {
            this.sourceCodeInfo_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSyntax() {
            this.bitField0_ &= -17;
            this.syntax_ = getDefaultInstance().getSyntax();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeakDependency() {
            this.weakDependency_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureDependencyIsMutable() {
            Internal.ProtobufList<String> protobufList = this.dependency_;
            if (!protobufList.isModifiable()) {
                this.dependency_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureEnumTypeIsMutable() {
            Internal.ProtobufList<EnumDescriptorProto> protobufList = this.enumType_;
            if (!protobufList.isModifiable()) {
                this.enumType_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureExtensionIsMutable() {
            Internal.ProtobufList<FieldDescriptorProto> protobufList = this.extension_;
            if (!protobufList.isModifiable()) {
                this.extension_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureMessageTypeIsMutable() {
            Internal.ProtobufList<DescriptorProto> protobufList = this.messageType_;
            if (!protobufList.isModifiable()) {
                this.messageType_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureOptionDependencyIsMutable() {
            Internal.ProtobufList<String> protobufList = this.optionDependency_;
            if (!protobufList.isModifiable()) {
                this.optionDependency_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensurePublicDependencyIsMutable() {
            Internal.IntList intList = this.publicDependency_;
            if (!intList.isModifiable()) {
                this.publicDependency_ = GeneratedMessageLite.mutableCopy(intList);
            }
        }

        private void ensureServiceIsMutable() {
            Internal.ProtobufList<ServiceDescriptorProto> protobufList = this.service_;
            if (!protobufList.isModifiable()) {
                this.service_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        private void ensureWeakDependencyIsMutable() {
            Internal.IntList intList = this.weakDependency_;
            if (!intList.isModifiable()) {
                this.weakDependency_ = GeneratedMessageLite.mutableCopy(intList);
            }
        }

        public static FileDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(FileOptions fileOptions) {
            fileOptions.getClass();
            FileOptions fileOptions2 = this.options_;
            if (fileOptions2 != null && fileOptions2 != FileOptions.getDefaultInstance()) {
                this.options_ = ((FileOptions.Builder) FileOptions.newBuilder(this.options_).mergeFrom((FileOptions.Builder) fileOptions)).buildPartial();
            } else {
                this.options_ = fileOptions;
            }
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
            sourceCodeInfo.getClass();
            SourceCodeInfo sourceCodeInfo2 = this.sourceCodeInfo_;
            if (sourceCodeInfo2 != null && sourceCodeInfo2 != SourceCodeInfo.getDefaultInstance()) {
                this.sourceCodeInfo_ = ((SourceCodeInfo.Builder) SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mergeFrom((SourceCodeInfo.Builder) sourceCodeInfo)).buildPartial();
            } else {
                this.sourceCodeInfo_ = sourceCodeInfo;
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer) {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FileDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeEnumType(int i) {
            ensureEnumTypeIsMutable();
            this.enumType_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeExtension(int i) {
            ensureExtensionIsMutable();
            this.extension_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMessageType(int i) {
            ensureMessageTypeIsMutable();
            this.messageType_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeService(int i) {
            ensureServiceIsMutable();
            this.service_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDependency(int i, String str) {
            str.getClass();
            ensureDependencyIsMutable();
            this.dependency_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEdition(Edition edition) {
            this.edition_ = edition.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.set(i, enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.set(i, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageType(int i, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.set(i, descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptionDependency(int i, String str) {
            str.getClass();
            ensureOptionDependencyIsMutable();
            this.optionDependency_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(FileOptions fileOptions) {
            fileOptions.getClass();
            this.options_ = fileOptions;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackage(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.package_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPackageBytes(ByteString byteString) {
            this.package_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPublicDependency(int i, int i2) {
            ensurePublicDependencyIsMutable();
            this.publicDependency_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setService(int i, ServiceDescriptorProto serviceDescriptorProto) {
            serviceDescriptorProto.getClass();
            ensureServiceIsMutable();
            this.service_.set(i, serviceDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
            sourceCodeInfo.getClass();
            this.sourceCodeInfo_ = sourceCodeInfo;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyntax(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSyntaxBytes(ByteString byteString) {
            this.syntax_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeakDependency(int i, int i2) {
            ensureWeakDependencyIsMutable();
            this.weakDependency_.setInt(i, i2);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FileDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\b\u0006\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tᐉ\u0003\n\u0016\u000b\u0016\fဈ\u0004\u000e᠌\u0005\u000f\u001a", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProto.class, "enumType_", EnumDescriptorProto.class, "service_", ServiceDescriptorProto.class, "extension_", FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_", "edition_", Edition.internalGetVerifier(), "optionDependency_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FileDescriptorProto> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (FileDescriptorProto.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getDependency(int i) {
            return this.dependency_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getDependencyBytes(int i) {
            return ByteString.copyFromUtf8(this.dependency_.get(i));
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getDependencyCount() {
            return this.dependency_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<String> getDependencyList() {
            return this.dependency_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public Edition getEdition() {
            Edition forNumber = Edition.forNumber(this.edition_);
            if (forNumber == null) {
                return Edition.EDITION_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public EnumDescriptorProto getEnumType(int i) {
            return this.enumType_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getEnumTypeCount() {
            return this.enumType_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<EnumDescriptorProto> getEnumTypeList() {
            return this.enumType_;
        }

        public EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i) {
            return this.enumType_.get(i);
        }

        public List<? extends EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
            return this.enumType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public FieldDescriptorProto getExtension(int i) {
            return this.extension_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getExtensionCount() {
            return this.extension_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<FieldDescriptorProto> getExtensionList() {
            return this.extension_;
        }

        public FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i) {
            return this.extension_.get(i);
        }

        public List<? extends FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
            return this.extension_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public DescriptorProto getMessageType(int i) {
            return this.messageType_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getMessageTypeCount() {
            return this.messageType_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<DescriptorProto> getMessageTypeList() {
            return this.messageType_;
        }

        public DescriptorProtoOrBuilder getMessageTypeOrBuilder(int i) {
            return this.messageType_.get(i);
        }

        public List<? extends DescriptorProtoOrBuilder> getMessageTypeOrBuilderList() {
            return this.messageType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getOptionDependency(int i) {
            return this.optionDependency_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getOptionDependencyBytes(int i) {
            return ByteString.copyFromUtf8(this.optionDependency_.get(i));
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getOptionDependencyCount() {
            return this.optionDependency_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<String> getOptionDependencyList() {
            return this.optionDependency_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public FileOptions getOptions() {
            FileOptions fileOptions = this.options_;
            if (fileOptions == null) {
                return FileOptions.getDefaultInstance();
            }
            return fileOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getPackage() {
            return this.package_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getPackageBytes() {
            return ByteString.copyFromUtf8(this.package_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getPublicDependency(int i) {
            return this.publicDependency_.getInt(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getPublicDependencyCount() {
            return this.publicDependency_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<Integer> getPublicDependencyList() {
            return this.publicDependency_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ServiceDescriptorProto getService(int i) {
            return this.service_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getServiceCount() {
            return this.service_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<ServiceDescriptorProto> getServiceList() {
            return this.service_;
        }

        public ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int i) {
            return this.service_.get(i);
        }

        public List<? extends ServiceDescriptorProtoOrBuilder> getServiceOrBuilderList() {
            return this.service_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public SourceCodeInfo getSourceCodeInfo() {
            SourceCodeInfo sourceCodeInfo = this.sourceCodeInfo_;
            if (sourceCodeInfo == null) {
                return SourceCodeInfo.getDefaultInstance();
            }
            return sourceCodeInfo;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public String getSyntax() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public ByteString getSyntaxBytes() {
            return ByteString.copyFromUtf8(this.syntax_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getWeakDependency(int i) {
            return this.weakDependency_.getInt(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public int getWeakDependencyCount() {
            return this.weakDependency_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public List<Integer> getWeakDependencyList() {
            return this.weakDependency_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasEdition() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasName() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasOptions() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasPackage() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasSourceCodeInfo() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
        public boolean hasSyntax() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<FileDescriptorProto, Builder> implements FileDescriptorProtoOrBuilder {
            private Builder() {
                super(FileDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder addAllDependency(Iterable<String> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllDependency(iterable);
                return this;
            }

            public Builder addAllEnumType(Iterable<? extends EnumDescriptorProto> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllEnumType(iterable);
                return this;
            }

            public Builder addAllExtension(Iterable<? extends FieldDescriptorProto> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllExtension(iterable);
                return this;
            }

            public Builder addAllMessageType(Iterable<? extends DescriptorProto> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllMessageType(iterable);
                return this;
            }

            public Builder addAllOptionDependency(Iterable<String> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllOptionDependency(iterable);
                return this;
            }

            public Builder addAllPublicDependency(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllPublicDependency(iterable);
                return this;
            }

            public Builder addAllService(Iterable<? extends ServiceDescriptorProto> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllService(iterable);
                return this;
            }

            public Builder addAllWeakDependency(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addAllWeakDependency(iterable);
                return this;
            }

            public Builder addDependency(String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addDependency(str);
                return this;
            }

            public Builder addDependencyBytes(ByteString byteString) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addDependencyBytes(byteString);
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addEnumType(builder.build());
                return this;
            }

            public Builder addExtension(FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addExtension(builder.build());
                return this;
            }

            public Builder addMessageType(DescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addMessageType(builder.build());
                return this;
            }

            public Builder addOptionDependency(String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addOptionDependency(str);
                return this;
            }

            public Builder addOptionDependencyBytes(ByteString byteString) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addOptionDependencyBytes(byteString);
                return this;
            }

            public Builder addPublicDependency(int i) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addPublicDependency(i);
                return this;
            }

            public Builder addService(ServiceDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addService(builder.build());
                return this;
            }

            public Builder addWeakDependency(int i) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addWeakDependency(i);
                return this;
            }

            public Builder clearDependency() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearDependency();
                return this;
            }

            public Builder clearEdition() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearEdition();
                return this;
            }

            public Builder clearEnumType() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearEnumType();
                return this;
            }

            public Builder clearExtension() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearExtension();
                return this;
            }

            public Builder clearMessageType() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearMessageType();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearOptionDependency() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearOptionDependency();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearOptions();
                return this;
            }

            public Builder clearPackage() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearPackage();
                return this;
            }

            public Builder clearPublicDependency() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearPublicDependency();
                return this;
            }

            public Builder clearService() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearService();
                return this;
            }

            public Builder clearSourceCodeInfo() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearSourceCodeInfo();
                return this;
            }

            public Builder clearSyntax() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearSyntax();
                return this;
            }

            public Builder clearWeakDependency() {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).clearWeakDependency();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getDependency(int i) {
                return ((FileDescriptorProto) this.instance).getDependency(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getDependencyBytes(int i) {
                return ((FileDescriptorProto) this.instance).getDependencyBytes(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getDependencyCount() {
                return ((FileDescriptorProto) this.instance).getDependencyCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<String> getDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getDependencyList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public Edition getEdition() {
                return ((FileDescriptorProto) this.instance).getEdition();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public EnumDescriptorProto getEnumType(int i) {
                return ((FileDescriptorProto) this.instance).getEnumType(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getEnumTypeCount() {
                return ((FileDescriptorProto) this.instance).getEnumTypeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<EnumDescriptorProto> getEnumTypeList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getEnumTypeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public FieldDescriptorProto getExtension(int i) {
                return ((FileDescriptorProto) this.instance).getExtension(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getExtensionCount() {
                return ((FileDescriptorProto) this.instance).getExtensionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<FieldDescriptorProto> getExtensionList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getExtensionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public DescriptorProto getMessageType(int i) {
                return ((FileDescriptorProto) this.instance).getMessageType(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getMessageTypeCount() {
                return ((FileDescriptorProto) this.instance).getMessageTypeCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<DescriptorProto> getMessageTypeList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getMessageTypeList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getName() {
                return ((FileDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((FileDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getOptionDependency(int i) {
                return ((FileDescriptorProto) this.instance).getOptionDependency(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getOptionDependencyBytes(int i) {
                return ((FileDescriptorProto) this.instance).getOptionDependencyBytes(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getOptionDependencyCount() {
                return ((FileDescriptorProto) this.instance).getOptionDependencyCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<String> getOptionDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getOptionDependencyList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public FileOptions getOptions() {
                return ((FileDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getPackage() {
                return ((FileDescriptorProto) this.instance).getPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getPackageBytes() {
                return ((FileDescriptorProto) this.instance).getPackageBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getPublicDependency(int i) {
                return ((FileDescriptorProto) this.instance).getPublicDependency(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getPublicDependencyCount() {
                return ((FileDescriptorProto) this.instance).getPublicDependencyCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<Integer> getPublicDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getPublicDependencyList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ServiceDescriptorProto getService(int i) {
                return ((FileDescriptorProto) this.instance).getService(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getServiceCount() {
                return ((FileDescriptorProto) this.instance).getServiceCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<ServiceDescriptorProto> getServiceList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getServiceList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public SourceCodeInfo getSourceCodeInfo() {
                return ((FileDescriptorProto) this.instance).getSourceCodeInfo();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public String getSyntax() {
                return ((FileDescriptorProto) this.instance).getSyntax();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public ByteString getSyntaxBytes() {
                return ((FileDescriptorProto) this.instance).getSyntaxBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getWeakDependency(int i) {
                return ((FileDescriptorProto) this.instance).getWeakDependency(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public int getWeakDependencyCount() {
                return ((FileDescriptorProto) this.instance).getWeakDependencyCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public List<Integer> getWeakDependencyList() {
                return Collections.unmodifiableList(((FileDescriptorProto) this.instance).getWeakDependencyList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasEdition() {
                return ((FileDescriptorProto) this.instance).hasEdition();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((FileDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((FileDescriptorProto) this.instance).hasOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasPackage() {
                return ((FileDescriptorProto) this.instance).hasPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasSourceCodeInfo() {
                return ((FileDescriptorProto) this.instance).hasSourceCodeInfo();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorProtoOrBuilder
            public boolean hasSyntax() {
                return ((FileDescriptorProto) this.instance).hasSyntax();
            }

            public Builder mergeOptions(FileOptions fileOptions) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).mergeOptions(fileOptions);
                return this;
            }

            public Builder mergeSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).mergeSourceCodeInfo(sourceCodeInfo);
                return this;
            }

            public Builder removeEnumType(int i) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).removeEnumType(i);
                return this;
            }

            public Builder removeExtension(int i) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).removeExtension(i);
                return this;
            }

            public Builder removeMessageType(int i) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).removeMessageType(i);
                return this;
            }

            public Builder removeService(int i) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).removeService(i);
                return this;
            }

            public Builder setDependency(int i, String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setDependency(i, str);
                return this;
            }

            public Builder setEdition(Edition edition) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setEdition(edition);
                return this;
            }

            public Builder setEnumType(int i, EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setEnumType(i, builder.build());
                return this;
            }

            public Builder setExtension(int i, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setExtension(i, builder.build());
                return this;
            }

            public Builder setMessageType(int i, DescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setMessageType(i, builder.build());
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            public Builder setOptionDependency(int i, String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setOptionDependency(i, str);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(FileOptions.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setOptions((FileOptions) builder.build());
                return this;
            }

            public Builder setPackage(String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setPackage(str);
                return this;
            }

            public Builder setPackageBytes(ByteString byteString) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setPackageBytes(byteString);
                return this;
            }

            public Builder setPublicDependency(int i, int i2) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setPublicDependency(i, i2);
                return this;
            }

            public Builder setService(int i, ServiceDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setService(i, builder.build());
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setSourceCodeInfo(SourceCodeInfo.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setSourceCodeInfo((SourceCodeInfo) builder.build());
                return this;
            }

            public Builder setSyntax(String str) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setSyntax(str);
                return this;
            }

            public Builder setSyntaxBytes(ByteString byteString) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setSyntaxBytes(byteString);
                return this;
            }

            public Builder setWeakDependency(int i, int i2) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setWeakDependency(i, i2);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addEnumType(i, enumDescriptorProto);
                return this;
            }

            public Builder addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addExtension(i, fieldDescriptorProto);
                return this;
            }

            public Builder addMessageType(int i, DescriptorProto descriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addMessageType(i, descriptorProto);
                return this;
            }

            public Builder addService(int i, ServiceDescriptorProto serviceDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addService(i, serviceDescriptorProto);
                return this;
            }

            public Builder setEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setEnumType(i, enumDescriptorProto);
                return this;
            }

            public Builder setExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setExtension(i, fieldDescriptorProto);
                return this;
            }

            public Builder setMessageType(int i, DescriptorProto descriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setMessageType(i, descriptorProto);
                return this;
            }

            public Builder setOptions(FileOptions fileOptions) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setOptions(fileOptions);
                return this;
            }

            public Builder setService(int i, ServiceDescriptorProto serviceDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setService(i, serviceDescriptorProto);
                return this;
            }

            public Builder setSourceCodeInfo(SourceCodeInfo sourceCodeInfo) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).setSourceCodeInfo(sourceCodeInfo);
                return this;
            }

            public Builder addEnumType(EnumDescriptorProto enumDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addEnumType(enumDescriptorProto);
                return this;
            }

            public Builder addExtension(FieldDescriptorProto fieldDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addExtension(fieldDescriptorProto);
                return this;
            }

            public Builder addMessageType(DescriptorProto descriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addMessageType(descriptorProto);
                return this;
            }

            public Builder addService(ServiceDescriptorProto serviceDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addService(serviceDescriptorProto);
                return this;
            }

            public Builder addEnumType(int i, EnumDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addEnumType(i, builder.build());
                return this;
            }

            public Builder addExtension(int i, FieldDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addExtension(i, builder.build());
                return this;
            }

            public Builder addMessageType(int i, DescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addMessageType(i, builder.build());
                return this;
            }

            public Builder addService(int i, ServiceDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorProto) this.instance).addService(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(FileDescriptorProto fileDescriptorProto) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fileDescriptorProto);
        }

        public static FileDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString) {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FileDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addEnumType(int i, EnumDescriptorProto enumDescriptorProto) {
            enumDescriptorProto.getClass();
            ensureEnumTypeIsMutable();
            this.enumType_.add(i, enumDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExtension(int i, FieldDescriptorProto fieldDescriptorProto) {
            fieldDescriptorProto.getClass();
            ensureExtensionIsMutable();
            this.extension_.add(i, fieldDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMessageType(int i, DescriptorProto descriptorProto) {
            descriptorProto.getClass();
            ensureMessageTypeIsMutable();
            this.messageType_.add(i, descriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addService(int i, ServiceDescriptorProto serviceDescriptorProto) {
            serviceDescriptorProto.getClass();
            ensureServiceIsMutable();
            this.service_.add(i, serviceDescriptorProto);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr) {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream) {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FileDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class FileDescriptorSet extends GeneratedMessageLite.ExtendableMessage<FileDescriptorSet, Builder> implements FileDescriptorSetOrBuilder {
        private static final FileDescriptorSet DEFAULT_INSTANCE;
        public static final int FILE_FIELD_NUMBER = 1;
        private static volatile Parser<FileDescriptorSet> PARSER;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<FileDescriptorProto> file_ = GeneratedMessageLite.emptyProtobufList();

        static {
            FileDescriptorSet fileDescriptorSet = new FileDescriptorSet();
            DEFAULT_INSTANCE = fileDescriptorSet;
            GeneratedMessageLite.registerDefaultInstance(FileDescriptorSet.class, fileDescriptorSet);
        }

        private FileDescriptorSet() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFile(Iterable<? extends FileDescriptorProto> iterable) {
            ensureFileIsMutable();
            AbstractMessageLite.addAll(iterable, this.file_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFile(FileDescriptorProto fileDescriptorProto) {
            fileDescriptorProto.getClass();
            ensureFileIsMutable();
            this.file_.add(fileDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFile() {
            this.file_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureFileIsMutable() {
            Internal.ProtobufList<FileDescriptorProto> protobufList = this.file_;
            if (!protobufList.isModifiable()) {
                this.file_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static FileDescriptorSet getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream) {
            return (FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer) {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FileDescriptorSet> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeFile(int i) {
            ensureFileIsMutable();
            this.file_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFile(int i, FileDescriptorProto fileDescriptorProto) {
            fileDescriptorProto.getClass();
            ensureFileIsMutable();
            this.file_.set(i, fileDescriptorProto);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FileDescriptorSet();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", FileDescriptorProto.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FileDescriptorSet> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (FileDescriptorSet.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
        public FileDescriptorProto getFile(int i) {
            return this.file_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
        public int getFileCount() {
            return this.file_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
        public List<FileDescriptorProto> getFileList() {
            return this.file_;
        }

        public FileDescriptorProtoOrBuilder getFileOrBuilder(int i) {
            return this.file_.get(i);
        }

        public List<? extends FileDescriptorProtoOrBuilder> getFileOrBuilderList() {
            return this.file_;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<FileDescriptorSet, Builder> implements FileDescriptorSetOrBuilder {
            private Builder() {
                super(FileDescriptorSet.DEFAULT_INSTANCE);
            }

            public Builder addAllFile(Iterable<? extends FileDescriptorProto> iterable) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).addAllFile(iterable);
                return this;
            }

            public Builder addFile(FileDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).addFile(builder.build());
                return this;
            }

            public Builder clearFile() {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).clearFile();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
            public FileDescriptorProto getFile(int i) {
                return ((FileDescriptorSet) this.instance).getFile(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
            public int getFileCount() {
                return ((FileDescriptorSet) this.instance).getFileCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder
            public List<FileDescriptorProto> getFileList() {
                return Collections.unmodifiableList(((FileDescriptorSet) this.instance).getFileList());
            }

            public Builder removeFile(int i) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).removeFile(i);
                return this;
            }

            public Builder setFile(int i, FileDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).setFile(i, builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addFile(int i, FileDescriptorProto fileDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).addFile(i, fileDescriptorProto);
                return this;
            }

            public Builder setFile(int i, FileDescriptorProto fileDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).setFile(i, fileDescriptorProto);
                return this;
            }

            public Builder addFile(FileDescriptorProto fileDescriptorProto) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).addFile(fileDescriptorProto);
                return this;
            }

            public Builder addFile(int i, FileDescriptorProto.Builder builder) {
                copyOnWrite();
                ((FileDescriptorSet) this.instance).addFile(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(FileDescriptorSet fileDescriptorSet) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fileDescriptorSet);
        }

        public static FileDescriptorSet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString) {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FileDescriptorSet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFile(int i, FileDescriptorProto fileDescriptorProto) {
            fileDescriptorProto.getClass();
            ensureFileIsMutable();
            this.file_.add(i, fileDescriptorProto);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr) {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileDescriptorSet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream) {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileDescriptorSet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileDescriptorSet parseFrom(CodedInputStream codedInputStream) {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FileDescriptorSet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class FileOptions extends GeneratedMessageLite.ExtendableMessage<FileOptions, Builder> implements FileOptionsOrBuilder {
        public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
        public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
        public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
        private static final FileOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 23;
        public static final int FEATURES_FIELD_NUMBER = 50;
        public static final int GO_PACKAGE_FIELD_NUMBER = 11;
        public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
        public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
        public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
        public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
        public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
        public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
        public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
        public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
        private static volatile Parser<FileOptions> PARSER = null;
        public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
        public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
        public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
        public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
        public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
        public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean ccGenericServices_;
        private boolean deprecated_;
        private FeatureSet features_;
        private boolean javaGenerateEqualsAndHash_;
        private boolean javaGenericServices_;
        private boolean javaMultipleFiles_;
        private boolean javaStringCheckUtf8_;
        private boolean pyGenericServices_;
        private byte memoizedIsInitialized = 2;
        private String javaPackage_ = "";
        private String javaOuterClassname_ = "";
        private int optimizeFor_ = 1;
        private String goPackage_ = "";
        private boolean ccEnableArenas_ = true;
        private String objcClassPrefix_ = "";
        private String csharpNamespace_ = "";
        private String swiftPrefix_ = "";
        private String phpClassPrefix_ = "";
        private String phpNamespace_ = "";
        private String phpMetadataNamespace_ = "";
        private String rubyPackage_ = "";
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        static {
            FileOptions fileOptions = new FileOptions();
            DEFAULT_INSTANCE = fileOptions;
            GeneratedMessageLite.registerDefaultInstance(FileOptions.class, fileOptions);
        }

        private FileOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCcEnableArenas() {
            this.bitField0_ &= -2049;
            this.ccEnableArenas_ = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCcGenericServices() {
            this.bitField0_ &= -129;
            this.ccGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCsharpNamespace() {
            this.bitField0_ &= -8193;
            this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -1025;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -524289;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGoPackage() {
            this.bitField0_ &= -65;
            this.goPackage_ = getDefaultInstance().getGoPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaGenerateEqualsAndHash() {
            this.bitField0_ &= -9;
            this.javaGenerateEqualsAndHash_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaGenericServices() {
            this.bitField0_ &= -257;
            this.javaGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaMultipleFiles() {
            this.bitField0_ &= -5;
            this.javaMultipleFiles_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaOuterClassname() {
            this.bitField0_ &= -3;
            this.javaOuterClassname_ = getDefaultInstance().getJavaOuterClassname();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaPackage() {
            this.bitField0_ &= -2;
            this.javaPackage_ = getDefaultInstance().getJavaPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearJavaStringCheckUtf8() {
            this.bitField0_ &= -17;
            this.javaStringCheckUtf8_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearObjcClassPrefix() {
            this.bitField0_ &= -4097;
            this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptimizeFor() {
            this.bitField0_ &= -33;
            this.optimizeFor_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpClassPrefix() {
            this.bitField0_ &= -32769;
            this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpMetadataNamespace() {
            this.bitField0_ &= -131073;
            this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhpNamespace() {
            this.bitField0_ &= -65537;
            this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPyGenericServices() {
            this.bitField0_ &= -513;
            this.pyGenericServices_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRubyPackage() {
            this.bitField0_ &= -262145;
            this.rubyPackage_ = getDefaultInstance().getRubyPackage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwiftPrefix() {
            this.bitField0_ &= -16385;
            this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (!protobufList.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static FileOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            FeatureSet featureSet2 = this.features_;
            if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                this.features_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.features_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
            } else {
                this.features_ = featureSet;
            }
            this.bitField0_ |= 524288;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream) {
            return (FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer) {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FileOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCcEnableArenas(boolean z) {
            this.bitField0_ |= 2048;
            this.ccEnableArenas_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCcGenericServices(boolean z) {
            this.bitField0_ |= 128;
            this.ccGenericServices_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCsharpNamespace(String str) {
            str.getClass();
            this.bitField0_ |= SharedConstants.DefaultBufferSize;
            this.csharpNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCsharpNamespaceBytes(ByteString byteString) {
            this.csharpNamespace_ = byteString.toStringUtf8();
            this.bitField0_ |= SharedConstants.DefaultBufferSize;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1024;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            this.features_ = featureSet;
            this.bitField0_ |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoPackage(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.goPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGoPackageBytes(ByteString byteString) {
            this.goPackage_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaGenerateEqualsAndHash(boolean z) {
            this.bitField0_ |= 8;
            this.javaGenerateEqualsAndHash_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaGenericServices(boolean z) {
            this.bitField0_ |= 256;
            this.javaGenericServices_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaMultipleFiles(boolean z) {
            this.bitField0_ |= 4;
            this.javaMultipleFiles_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaOuterClassname(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.javaOuterClassname_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaOuterClassnameBytes(ByteString byteString) {
            this.javaOuterClassname_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaPackage(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.javaPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaPackageBytes(ByteString byteString) {
            this.javaPackage_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setJavaStringCheckUtf8(boolean z) {
            this.bitField0_ |= 16;
            this.javaStringCheckUtf8_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setObjcClassPrefix(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.objcClassPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setObjcClassPrefixBytes(ByteString byteString) {
            this.objcClassPrefix_ = byteString.toStringUtf8();
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptimizeFor(OptimizeMode optimizeMode) {
            this.optimizeFor_ = optimizeMode.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpClassPrefix(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.phpClassPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpClassPrefixBytes(ByteString byteString) {
            this.phpClassPrefix_ = byteString.toStringUtf8();
            this.bitField0_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpMetadataNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 131072;
            this.phpMetadataNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpMetadataNamespaceBytes(ByteString byteString) {
            this.phpMetadataNamespace_ = byteString.toStringUtf8();
            this.bitField0_ |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpNamespace(String str) {
            str.getClass();
            this.bitField0_ |= 65536;
            this.phpNamespace_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhpNamespaceBytes(ByteString byteString) {
            this.phpNamespace_ = byteString.toStringUtf8();
            this.bitField0_ |= 65536;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPyGenericServices(boolean z) {
            this.bitField0_ |= 512;
            this.pyGenericServices_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRubyPackage(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.rubyPackage_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRubyPackageBytes(ByteString byteString) {
            this.rubyPackage_ = byteString.toStringUtf8();
            this.bitField0_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwiftPrefix(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.swiftPrefix_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwiftPrefixBytes(ByteString byteString) {
            this.swiftPrefix_ = byteString.toStringUtf8();
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new FileOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0002\u0001ဈ\u0000\bဈ\u0001\t᠌\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\n\u001bဇ\u0004\u001fဇ\u000b$ဈ\f%ဈ\r'ဈ\u000e(ဈ\u000f)ဈ\u0010,ဈ\u0011-ဈ\u00122ᐉ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", OptimizeMode.internalGetVerifier(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpMetadataNamespace_", "rubyPackage_", "features_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FileOptions> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (FileOptions.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getCcEnableArenas() {
            return this.ccEnableArenas_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getCcGenericServices() {
            return this.ccGenericServices_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getCsharpNamespace() {
            return this.csharpNamespace_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getCsharpNamespaceBytes() {
            return ByteString.copyFromUtf8(this.csharpNamespace_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            if (featureSet == null) {
                return FeatureSet.getDefaultInstance();
            }
            return featureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getGoPackage() {
            return this.goPackage_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getGoPackageBytes() {
            return ByteString.copyFromUtf8(this.goPackage_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return this.javaGenerateEqualsAndHash_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getJavaGenericServices() {
            return this.javaGenericServices_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getJavaMultipleFiles() {
            return this.javaMultipleFiles_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getJavaOuterClassname() {
            return this.javaOuterClassname_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getJavaOuterClassnameBytes() {
            return ByteString.copyFromUtf8(this.javaOuterClassname_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getJavaPackage() {
            return this.javaPackage_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getJavaPackageBytes() {
            return ByteString.copyFromUtf8(this.javaPackage_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getJavaStringCheckUtf8() {
            return this.javaStringCheckUtf8_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getObjcClassPrefix() {
            return this.objcClassPrefix_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getObjcClassPrefixBytes() {
            return ByteString.copyFromUtf8(this.objcClassPrefix_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public OptimizeMode getOptimizeFor() {
            OptimizeMode forNumber = OptimizeMode.forNumber(this.optimizeFor_);
            if (forNumber == null) {
                return OptimizeMode.SPEED;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getPhpClassPrefix() {
            return this.phpClassPrefix_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getPhpClassPrefixBytes() {
            return ByteString.copyFromUtf8(this.phpClassPrefix_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getPhpMetadataNamespace() {
            return this.phpMetadataNamespace_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getPhpMetadataNamespaceBytes() {
            return ByteString.copyFromUtf8(this.phpMetadataNamespace_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getPhpNamespace() {
            return this.phpNamespace_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getPhpNamespaceBytes() {
            return ByteString.copyFromUtf8(this.phpNamespace_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean getPyGenericServices() {
            return this.pyGenericServices_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getRubyPackage() {
            return this.rubyPackage_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getRubyPackageBytes() {
            return ByteString.copyFromUtf8(this.rubyPackage_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public String getSwiftPrefix() {
            return this.swiftPrefix_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public ByteString getSwiftPrefixBytes() {
            return ByteString.copyFromUtf8(this.swiftPrefix_);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasCcEnableArenas() {
            if ((this.bitField0_ & 2048) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasCcGenericServices() {
            if ((this.bitField0_ & 128) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasCsharpNamespace() {
            if ((this.bitField0_ & SharedConstants.DefaultBufferSize) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasDeprecated() {
            if ((this.bitField0_ & 1024) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasFeatures() {
            if ((this.bitField0_ & 524288) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasGoPackage() {
            if ((this.bitField0_ & 64) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaGenericServices() {
            if ((this.bitField0_ & 256) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaMultipleFiles() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaOuterClassname() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaPackage() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasJavaStringCheckUtf8() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasObjcClassPrefix() {
            if ((this.bitField0_ & 4096) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasOptimizeFor() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpClassPrefix() {
            if ((this.bitField0_ & 32768) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpMetadataNamespace() {
            if ((this.bitField0_ & 131072) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPhpNamespace() {
            if ((this.bitField0_ & 65536) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasPyGenericServices() {
            if ((this.bitField0_ & 512) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasRubyPackage() {
            if ((this.bitField0_ & 262144) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
        public boolean hasSwiftPrefix() {
            if ((this.bitField0_ & 16384) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<FileOptions, Builder> implements FileOptionsOrBuilder {
            private Builder() {
                super(FileOptions.DEFAULT_INSTANCE);
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((FileOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FileOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder clearCcEnableArenas() {
                copyOnWrite();
                ((FileOptions) this.instance).clearCcEnableArenas();
                return this;
            }

            public Builder clearCcGenericServices() {
                copyOnWrite();
                ((FileOptions) this.instance).clearCcGenericServices();
                return this;
            }

            public Builder clearCsharpNamespace() {
                copyOnWrite();
                ((FileOptions) this.instance).clearCsharpNamespace();
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((FileOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearFeatures() {
                copyOnWrite();
                ((FileOptions) this.instance).clearFeatures();
                return this;
            }

            public Builder clearGoPackage() {
                copyOnWrite();
                ((FileOptions) this.instance).clearGoPackage();
                return this;
            }

            @Deprecated
            public Builder clearJavaGenerateEqualsAndHash() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaGenerateEqualsAndHash();
                return this;
            }

            public Builder clearJavaGenericServices() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaGenericServices();
                return this;
            }

            public Builder clearJavaMultipleFiles() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaMultipleFiles();
                return this;
            }

            public Builder clearJavaOuterClassname() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaOuterClassname();
                return this;
            }

            public Builder clearJavaPackage() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaPackage();
                return this;
            }

            public Builder clearJavaStringCheckUtf8() {
                copyOnWrite();
                ((FileOptions) this.instance).clearJavaStringCheckUtf8();
                return this;
            }

            public Builder clearObjcClassPrefix() {
                copyOnWrite();
                ((FileOptions) this.instance).clearObjcClassPrefix();
                return this;
            }

            public Builder clearOptimizeFor() {
                copyOnWrite();
                ((FileOptions) this.instance).clearOptimizeFor();
                return this;
            }

            public Builder clearPhpClassPrefix() {
                copyOnWrite();
                ((FileOptions) this.instance).clearPhpClassPrefix();
                return this;
            }

            public Builder clearPhpMetadataNamespace() {
                copyOnWrite();
                ((FileOptions) this.instance).clearPhpMetadataNamespace();
                return this;
            }

            public Builder clearPhpNamespace() {
                copyOnWrite();
                ((FileOptions) this.instance).clearPhpNamespace();
                return this;
            }

            public Builder clearPyGenericServices() {
                copyOnWrite();
                ((FileOptions) this.instance).clearPyGenericServices();
                return this;
            }

            public Builder clearRubyPackage() {
                copyOnWrite();
                ((FileOptions) this.instance).clearRubyPackage();
                return this;
            }

            public Builder clearSwiftPrefix() {
                copyOnWrite();
                ((FileOptions) this.instance).clearSwiftPrefix();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((FileOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getCcEnableArenas() {
                return ((FileOptions) this.instance).getCcEnableArenas();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getCcGenericServices() {
                return ((FileOptions) this.instance).getCcGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getCsharpNamespace() {
                return ((FileOptions) this.instance).getCsharpNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getCsharpNamespaceBytes() {
                return ((FileOptions) this.instance).getCsharpNamespaceBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getDeprecated() {
                return ((FileOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public FeatureSet getFeatures() {
                return ((FileOptions) this.instance).getFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getGoPackage() {
                return ((FileOptions) this.instance).getGoPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getGoPackageBytes() {
                return ((FileOptions) this.instance).getGoPackageBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            @Deprecated
            public boolean getJavaGenerateEqualsAndHash() {
                return ((FileOptions) this.instance).getJavaGenerateEqualsAndHash();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getJavaGenericServices() {
                return ((FileOptions) this.instance).getJavaGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getJavaMultipleFiles() {
                return ((FileOptions) this.instance).getJavaMultipleFiles();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getJavaOuterClassname() {
                return ((FileOptions) this.instance).getJavaOuterClassname();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getJavaOuterClassnameBytes() {
                return ((FileOptions) this.instance).getJavaOuterClassnameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getJavaPackage() {
                return ((FileOptions) this.instance).getJavaPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getJavaPackageBytes() {
                return ((FileOptions) this.instance).getJavaPackageBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getJavaStringCheckUtf8() {
                return ((FileOptions) this.instance).getJavaStringCheckUtf8();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getObjcClassPrefix() {
                return ((FileOptions) this.instance).getObjcClassPrefix();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getObjcClassPrefixBytes() {
                return ((FileOptions) this.instance).getObjcClassPrefixBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public OptimizeMode getOptimizeFor() {
                return ((FileOptions) this.instance).getOptimizeFor();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getPhpClassPrefix() {
                return ((FileOptions) this.instance).getPhpClassPrefix();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getPhpClassPrefixBytes() {
                return ((FileOptions) this.instance).getPhpClassPrefixBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getPhpMetadataNamespace() {
                return ((FileOptions) this.instance).getPhpMetadataNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getPhpMetadataNamespaceBytes() {
                return ((FileOptions) this.instance).getPhpMetadataNamespaceBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getPhpNamespace() {
                return ((FileOptions) this.instance).getPhpNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getPhpNamespaceBytes() {
                return ((FileOptions) this.instance).getPhpNamespaceBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean getPyGenericServices() {
                return ((FileOptions) this.instance).getPyGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getRubyPackage() {
                return ((FileOptions) this.instance).getRubyPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getRubyPackageBytes() {
                return ((FileOptions) this.instance).getRubyPackageBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public String getSwiftPrefix() {
                return ((FileOptions) this.instance).getSwiftPrefix();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public ByteString getSwiftPrefixBytes() {
                return ((FileOptions) this.instance).getSwiftPrefixBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
                return ((FileOptions) this.instance).getUninterpretedOption(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((FileOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((FileOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasCcEnableArenas() {
                return ((FileOptions) this.instance).hasCcEnableArenas();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasCcGenericServices() {
                return ((FileOptions) this.instance).hasCcGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasCsharpNamespace() {
                return ((FileOptions) this.instance).hasCsharpNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((FileOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasFeatures() {
                return ((FileOptions) this.instance).hasFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasGoPackage() {
                return ((FileOptions) this.instance).hasGoPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            @Deprecated
            public boolean hasJavaGenerateEqualsAndHash() {
                return ((FileOptions) this.instance).hasJavaGenerateEqualsAndHash();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaGenericServices() {
                return ((FileOptions) this.instance).hasJavaGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaMultipleFiles() {
                return ((FileOptions) this.instance).hasJavaMultipleFiles();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaOuterClassname() {
                return ((FileOptions) this.instance).hasJavaOuterClassname();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaPackage() {
                return ((FileOptions) this.instance).hasJavaPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasJavaStringCheckUtf8() {
                return ((FileOptions) this.instance).hasJavaStringCheckUtf8();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasObjcClassPrefix() {
                return ((FileOptions) this.instance).hasObjcClassPrefix();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasOptimizeFor() {
                return ((FileOptions) this.instance).hasOptimizeFor();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpClassPrefix() {
                return ((FileOptions) this.instance).hasPhpClassPrefix();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpMetadataNamespace() {
                return ((FileOptions) this.instance).hasPhpMetadataNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPhpNamespace() {
                return ((FileOptions) this.instance).hasPhpNamespace();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasPyGenericServices() {
                return ((FileOptions) this.instance).hasPyGenericServices();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasRubyPackage() {
                return ((FileOptions) this.instance).hasRubyPackage();
            }

            @Override // com.google.protobuf.DescriptorProtos.FileOptionsOrBuilder
            public boolean hasSwiftPrefix() {
                return ((FileOptions) this.instance).hasSwiftPrefix();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((FileOptions) this.instance).mergeFeatures(featureSet);
                return this;
            }

            public Builder removeUninterpretedOption(int i) {
                copyOnWrite();
                ((FileOptions) this.instance).removeUninterpretedOption(i);
                return this;
            }

            public Builder setCcEnableArenas(boolean z) {
                copyOnWrite();
                ((FileOptions) this.instance).setCcEnableArenas(z);
                return this;
            }

            public Builder setCcGenericServices(boolean z) {
                copyOnWrite();
                ((FileOptions) this.instance).setCcGenericServices(z);
                return this;
            }

            public Builder setCsharpNamespace(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setCsharpNamespace(str);
                return this;
            }

            public Builder setCsharpNamespaceBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setCsharpNamespaceBytes(byteString);
                return this;
            }

            public Builder setDeprecated(boolean z) {
                copyOnWrite();
                ((FileOptions) this.instance).setDeprecated(z);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFeatures(FeatureSet.Builder builder) {
                copyOnWrite();
                ((FileOptions) this.instance).setFeatures((FeatureSet) builder.build());
                return this;
            }

            public Builder setGoPackage(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setGoPackage(str);
                return this;
            }

            public Builder setGoPackageBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setGoPackageBytes(byteString);
                return this;
            }

            @Deprecated
            public Builder setJavaGenerateEqualsAndHash(boolean z) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaGenerateEqualsAndHash(z);
                return this;
            }

            public Builder setJavaGenericServices(boolean z) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaGenericServices(z);
                return this;
            }

            public Builder setJavaMultipleFiles(boolean z) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaMultipleFiles(z);
                return this;
            }

            public Builder setJavaOuterClassname(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaOuterClassname(str);
                return this;
            }

            public Builder setJavaOuterClassnameBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaOuterClassnameBytes(byteString);
                return this;
            }

            public Builder setJavaPackage(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaPackage(str);
                return this;
            }

            public Builder setJavaPackageBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaPackageBytes(byteString);
                return this;
            }

            public Builder setJavaStringCheckUtf8(boolean z) {
                copyOnWrite();
                ((FileOptions) this.instance).setJavaStringCheckUtf8(z);
                return this;
            }

            public Builder setObjcClassPrefix(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setObjcClassPrefix(str);
                return this;
            }

            public Builder setObjcClassPrefixBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setObjcClassPrefixBytes(byteString);
                return this;
            }

            public Builder setOptimizeFor(OptimizeMode optimizeMode) {
                copyOnWrite();
                ((FileOptions) this.instance).setOptimizeFor(optimizeMode);
                return this;
            }

            public Builder setPhpClassPrefix(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpClassPrefix(str);
                return this;
            }

            public Builder setPhpClassPrefixBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpClassPrefixBytes(byteString);
                return this;
            }

            public Builder setPhpMetadataNamespace(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpMetadataNamespace(str);
                return this;
            }

            public Builder setPhpMetadataNamespaceBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpMetadataNamespaceBytes(byteString);
                return this;
            }

            public Builder setPhpNamespace(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpNamespace(str);
                return this;
            }

            public Builder setPhpNamespaceBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setPhpNamespaceBytes(byteString);
                return this;
            }

            public Builder setPyGenericServices(boolean z) {
                copyOnWrite();
                ((FileOptions) this.instance).setPyGenericServices(z);
                return this;
            }

            public Builder setRubyPackage(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setRubyPackage(str);
                return this;
            }

            public Builder setRubyPackageBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setRubyPackageBytes(byteString);
                return this;
            }

            public Builder setSwiftPrefix(String str) {
                copyOnWrite();
                ((FileOptions) this.instance).setSwiftPrefix(str);
                return this;
            }

            public Builder setSwiftPrefixBytes(ByteString byteString) {
                copyOnWrite();
                ((FileOptions) this.instance).setSwiftPrefixBytes(byteString);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FileOptions) this.instance).setUninterpretedOption(i, builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FileOptions) this.instance).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder setFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((FileOptions) this.instance).setFeatures(featureSet);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FileOptions) this.instance).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((FileOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((FileOptions) this.instance).addUninterpretedOption(i, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum OptimizeMode implements Internal.EnumLite {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);

            public static final int CODE_SIZE_VALUE = 2;
            public static final int LITE_RUNTIME_VALUE = 3;
            public static final int SPEED_VALUE = 1;
            private static final Internal.EnumLiteMap<OptimizeMode> internalValueMap = new Internal.EnumLiteMap<OptimizeMode>() { // from class: com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public OptimizeMode findValueByNumber(int i) {
                    return OptimizeMode.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class OptimizeModeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new OptimizeModeVerifier();

                private OptimizeModeVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (OptimizeMode.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            OptimizeMode(int i) {
                this.value = i;
            }

            public static OptimizeMode forNumber(int i) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return null;
                        }
                        return LITE_RUNTIME;
                    }
                    return CODE_SIZE;
                }
                return SPEED;
            }

            public static Internal.EnumLiteMap<OptimizeMode> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return OptimizeModeVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static OptimizeMode valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(FileOptions fileOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(fileOptions);
        }

        public static FileOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FileOptions parseFrom(ByteString byteString) {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FileOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static FileOptions parseFrom(byte[] bArr) {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FileOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FileOptions parseFrom(InputStream inputStream) {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FileOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FileOptions parseFrom(CodedInputStream codedInputStream) {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FileOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class MessageOptions extends GeneratedMessageLite.ExtendableMessage<MessageOptions, Builder> implements MessageOptionsOrBuilder {
        private static final MessageOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 3;
        public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 11;
        public static final int FEATURES_FIELD_NUMBER = 12;
        public static final int MAP_ENTRY_FIELD_NUMBER = 7;
        public static final int MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER = 1;
        public static final int NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER = 2;
        private static volatile Parser<MessageOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecatedLegacyJsonFieldConflicts_;
        private boolean deprecated_;
        private FeatureSet features_;
        private boolean mapEntry_;
        private boolean messageSetWireFormat_;
        private boolean noStandardDescriptorAccessor_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        static {
            MessageOptions messageOptions = new MessageOptions();
            DEFAULT_INSTANCE = messageOptions;
            GeneratedMessageLite.registerDefaultInstance(MessageOptions.class, messageOptions);
        }

        private MessageOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -5;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecatedLegacyJsonFieldConflicts() {
            this.bitField0_ &= -17;
            this.deprecatedLegacyJsonFieldConflicts_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMapEntry() {
            this.bitField0_ &= -9;
            this.mapEntry_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMessageSetWireFormat() {
            this.bitField0_ &= -2;
            this.messageSetWireFormat_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNoStandardDescriptorAccessor() {
            this.bitField0_ &= -3;
            this.noStandardDescriptorAccessor_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (!protobufList.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static MessageOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            FeatureSet featureSet2 = this.features_;
            if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                this.features_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.features_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
            } else {
                this.features_ = featureSet;
            }
            this.bitField0_ |= 32;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream) {
            return (MessageOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer) {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MessageOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 4;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecatedLegacyJsonFieldConflicts(boolean z) {
            this.bitField0_ |= 16;
            this.deprecatedLegacyJsonFieldConflicts_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            this.features_ = featureSet;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMapEntry(boolean z) {
            this.bitField0_ |= 8;
            this.mapEntry_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMessageSetWireFormat(boolean z) {
            this.bitField0_ |= 1;
            this.messageSetWireFormat_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNoStandardDescriptorAccessor(boolean z) {
            this.bitField0_ |= 2;
            this.noStandardDescriptorAccessor_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MessageOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0002\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\u000bဇ\u0004\fᐉ\u0005ϧЛ", new Object[]{"bitField0_", "messageSetWireFormat_", "noStandardDescriptorAccessor_", "deprecated_", "mapEntry_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MessageOptions> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (MessageOptions.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        @Deprecated
        public boolean getDeprecatedLegacyJsonFieldConflicts() {
            return this.deprecatedLegacyJsonFieldConflicts_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            if (featureSet == null) {
                return FeatureSet.getDefaultInstance();
            }
            return featureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getMapEntry() {
            return this.mapEntry_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getMessageSetWireFormat() {
            return this.messageSetWireFormat_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean getNoStandardDescriptorAccessor() {
            return this.noStandardDescriptorAccessor_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasDeprecated() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        @Deprecated
        public boolean hasDeprecatedLegacyJsonFieldConflicts() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasFeatures() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasMapEntry() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasMessageSetWireFormat() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
        public boolean hasNoStandardDescriptorAccessor() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<MessageOptions, Builder> implements MessageOptionsOrBuilder {
            private Builder() {
                super(MessageOptions.DEFAULT_INSTANCE);
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((MessageOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MessageOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearDeprecated();
                return this;
            }

            @Deprecated
            public Builder clearDeprecatedLegacyJsonFieldConflicts() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearDeprecatedLegacyJsonFieldConflicts();
                return this;
            }

            public Builder clearFeatures() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearFeatures();
                return this;
            }

            public Builder clearMapEntry() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearMapEntry();
                return this;
            }

            public Builder clearMessageSetWireFormat() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearMessageSetWireFormat();
                return this;
            }

            public Builder clearNoStandardDescriptorAccessor() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearNoStandardDescriptorAccessor();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((MessageOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getDeprecated() {
                return ((MessageOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            @Deprecated
            public boolean getDeprecatedLegacyJsonFieldConflicts() {
                return ((MessageOptions) this.instance).getDeprecatedLegacyJsonFieldConflicts();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public FeatureSet getFeatures() {
                return ((MessageOptions) this.instance).getFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getMapEntry() {
                return ((MessageOptions) this.instance).getMapEntry();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getMessageSetWireFormat() {
                return ((MessageOptions) this.instance).getMessageSetWireFormat();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean getNoStandardDescriptorAccessor() {
                return ((MessageOptions) this.instance).getNoStandardDescriptorAccessor();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
                return ((MessageOptions) this.instance).getUninterpretedOption(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((MessageOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((MessageOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((MessageOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            @Deprecated
            public boolean hasDeprecatedLegacyJsonFieldConflicts() {
                return ((MessageOptions) this.instance).hasDeprecatedLegacyJsonFieldConflicts();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasFeatures() {
                return ((MessageOptions) this.instance).hasFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasMapEntry() {
                return ((MessageOptions) this.instance).hasMapEntry();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasMessageSetWireFormat() {
                return ((MessageOptions) this.instance).hasMessageSetWireFormat();
            }

            @Override // com.google.protobuf.DescriptorProtos.MessageOptionsOrBuilder
            public boolean hasNoStandardDescriptorAccessor() {
                return ((MessageOptions) this.instance).hasNoStandardDescriptorAccessor();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((MessageOptions) this.instance).mergeFeatures(featureSet);
                return this;
            }

            public Builder removeUninterpretedOption(int i) {
                copyOnWrite();
                ((MessageOptions) this.instance).removeUninterpretedOption(i);
                return this;
            }

            public Builder setDeprecated(boolean z) {
                copyOnWrite();
                ((MessageOptions) this.instance).setDeprecated(z);
                return this;
            }

            @Deprecated
            public Builder setDeprecatedLegacyJsonFieldConflicts(boolean z) {
                copyOnWrite();
                ((MessageOptions) this.instance).setDeprecatedLegacyJsonFieldConflicts(z);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFeatures(FeatureSet.Builder builder) {
                copyOnWrite();
                ((MessageOptions) this.instance).setFeatures((FeatureSet) builder.build());
                return this;
            }

            public Builder setMapEntry(boolean z) {
                copyOnWrite();
                ((MessageOptions) this.instance).setMapEntry(z);
                return this;
            }

            public Builder setMessageSetWireFormat(boolean z) {
                copyOnWrite();
                ((MessageOptions) this.instance).setMessageSetWireFormat(z);
                return this;
            }

            public Builder setNoStandardDescriptorAccessor(boolean z) {
                copyOnWrite();
                ((MessageOptions) this.instance).setNoStandardDescriptorAccessor(z);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MessageOptions) this.instance).setUninterpretedOption(i, builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MessageOptions) this.instance).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder setFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((MessageOptions) this.instance).setFeatures(featureSet);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MessageOptions) this.instance).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MessageOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MessageOptions) this.instance).addUninterpretedOption(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(MessageOptions messageOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(messageOptions);
        }

        public static MessageOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(ByteString byteString) {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MessageOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static MessageOptions parseFrom(byte[] bArr) {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MessageOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(InputStream inputStream) {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MessageOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MessageOptions parseFrom(CodedInputStream codedInputStream) {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MessageOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MessageOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class MethodDescriptorProto extends GeneratedMessageLite<MethodDescriptorProto, Builder> implements MethodDescriptorProtoOrBuilder {
        public static final int CLIENT_STREAMING_FIELD_NUMBER = 5;
        private static final MethodDescriptorProto DEFAULT_INSTANCE;
        public static final int INPUT_TYPE_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_TYPE_FIELD_NUMBER = 3;
        private static volatile Parser<MethodDescriptorProto> PARSER = null;
        public static final int SERVER_STREAMING_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean clientStreaming_;
        private MethodOptions options_;
        private boolean serverStreaming_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private String inputType_ = "";
        private String outputType_ = "";

        static {
            MethodDescriptorProto methodDescriptorProto = new MethodDescriptorProto();
            DEFAULT_INSTANCE = methodDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(MethodDescriptorProto.class, methodDescriptorProto);
        }

        private MethodDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClientStreaming() {
            this.bitField0_ &= -17;
            this.clientStreaming_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInputType() {
            this.bitField0_ &= -3;
            this.inputType_ = getDefaultInstance().getInputType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOutputType() {
            this.bitField0_ &= -5;
            this.outputType_ = getDefaultInstance().getOutputType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearServerStreaming() {
            this.bitField0_ &= -33;
            this.serverStreaming_ = false;
        }

        public static MethodDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(MethodOptions methodOptions) {
            methodOptions.getClass();
            MethodOptions methodOptions2 = this.options_;
            if (methodOptions2 != null && methodOptions2 != MethodOptions.getDefaultInstance()) {
                this.options_ = ((MethodOptions.Builder) MethodOptions.newBuilder(this.options_).mergeFrom((MethodOptions.Builder) methodOptions)).buildPartial();
            } else {
                this.options_ = methodOptions;
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MethodDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientStreaming(boolean z) {
            this.bitField0_ |= 16;
            this.clientStreaming_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputType(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.inputType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputTypeBytes(ByteString byteString) {
            this.inputType_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(MethodOptions methodOptions) {
            methodOptions.getClass();
            this.options_ = methodOptions;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputType(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.outputType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutputTypeBytes(ByteString byteString) {
            this.outputType_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setServerStreaming(boolean z) {
            this.bitField0_ |= 32;
            this.serverStreaming_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MethodDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "name_", "inputType_", "outputType_", "options_", "clientStreaming_", "serverStreaming_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MethodDescriptorProto> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (MethodDescriptorProto.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean getClientStreaming() {
            return this.clientStreaming_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public String getInputType() {
            return this.inputType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public ByteString getInputTypeBytes() {
            return ByteString.copyFromUtf8(this.inputType_);
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public MethodOptions getOptions() {
            MethodOptions methodOptions = this.options_;
            if (methodOptions == null) {
                return MethodOptions.getDefaultInstance();
            }
            return methodOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public String getOutputType() {
            return this.outputType_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public ByteString getOutputTypeBytes() {
            return ByteString.copyFromUtf8(this.outputType_);
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean getServerStreaming() {
            return this.serverStreaming_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasClientStreaming() {
            if ((this.bitField0_ & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasInputType() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasName() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasOptions() {
            if ((this.bitField0_ & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasOutputType() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
        public boolean hasServerStreaming() {
            if ((this.bitField0_ & 32) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<MethodDescriptorProto, Builder> implements MethodDescriptorProtoOrBuilder {
            private Builder() {
                super(MethodDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder clearClientStreaming() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearClientStreaming();
                return this;
            }

            public Builder clearInputType() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearInputType();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearOptions();
                return this;
            }

            public Builder clearOutputType() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearOutputType();
                return this;
            }

            public Builder clearServerStreaming() {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).clearServerStreaming();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean getClientStreaming() {
                return ((MethodDescriptorProto) this.instance).getClientStreaming();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public String getInputType() {
                return ((MethodDescriptorProto) this.instance).getInputType();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public ByteString getInputTypeBytes() {
                return ((MethodDescriptorProto) this.instance).getInputTypeBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public String getName() {
                return ((MethodDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((MethodDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public MethodOptions getOptions() {
                return ((MethodDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public String getOutputType() {
                return ((MethodDescriptorProto) this.instance).getOutputType();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public ByteString getOutputTypeBytes() {
                return ((MethodDescriptorProto) this.instance).getOutputTypeBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean getServerStreaming() {
                return ((MethodDescriptorProto) this.instance).getServerStreaming();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasClientStreaming() {
                return ((MethodDescriptorProto) this.instance).hasClientStreaming();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasInputType() {
                return ((MethodDescriptorProto) this.instance).hasInputType();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((MethodDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((MethodDescriptorProto) this.instance).hasOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasOutputType() {
                return ((MethodDescriptorProto) this.instance).hasOutputType();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodDescriptorProtoOrBuilder
            public boolean hasServerStreaming() {
                return ((MethodDescriptorProto) this.instance).hasServerStreaming();
            }

            public Builder mergeOptions(MethodOptions methodOptions) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).mergeOptions(methodOptions);
                return this;
            }

            public Builder setClientStreaming(boolean z) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setClientStreaming(z);
                return this;
            }

            public Builder setInputType(String str) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setInputType(str);
                return this;
            }

            public Builder setInputTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setInputTypeBytes(byteString);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(MethodOptions.Builder builder) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setOptions((MethodOptions) builder.build());
                return this;
            }

            public Builder setOutputType(String str) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setOutputType(str);
                return this;
            }

            public Builder setOutputTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setOutputTypeBytes(byteString);
                return this;
            }

            public Builder setServerStreaming(boolean z) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setServerStreaming(z);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder setOptions(MethodOptions methodOptions) {
                copyOnWrite();
                ((MethodDescriptorProto) this.instance).setOptions(methodOptions);
                return this;
            }
        }

        public static Builder newBuilder(MethodDescriptorProto methodDescriptorProto) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(methodDescriptorProto);
        }

        public static MethodDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MethodDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MethodDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MethodDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class MethodOptions extends GeneratedMessageLite.ExtendableMessage<MethodOptions, Builder> implements MethodOptionsOrBuilder {
        private static final MethodOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int FEATURES_FIELD_NUMBER = 35;
        public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
        private static volatile Parser<MethodOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private FeatureSet features_;
        private int idempotencyLevel_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        static {
            MethodOptions methodOptions = new MethodOptions();
            DEFAULT_INSTANCE = methodOptions;
            GeneratedMessageLite.registerDefaultInstance(MethodOptions.class, methodOptions);
        }

        private MethodOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -2;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdempotencyLevel() {
            this.bitField0_ &= -3;
            this.idempotencyLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (!protobufList.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static MethodOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            FeatureSet featureSet2 = this.features_;
            if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                this.features_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.features_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
            } else {
                this.features_ = featureSet;
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream) {
            return (MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer) {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<MethodOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 1;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            this.features_ = featureSet;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
            this.idempotencyLevel_ = idempotencyLevel.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new MethodOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001!ϧ\u0004\u0000\u0001\u0002!ဇ\u0000\"᠌\u0001#ᐉ\u0002ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", IdempotencyLevel.internalGetVerifier(), "features_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<MethodOptions> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (MethodOptions.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            if (featureSet == null) {
                return FeatureSet.getDefaultInstance();
            }
            return featureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public IdempotencyLevel getIdempotencyLevel() {
            IdempotencyLevel forNumber = IdempotencyLevel.forNumber(this.idempotencyLevel_);
            if (forNumber == null) {
                return IdempotencyLevel.IDEMPOTENCY_UNKNOWN;
            }
            return forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public boolean hasDeprecated() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public boolean hasFeatures() {
            if ((this.bitField0_ & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
        public boolean hasIdempotencyLevel() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<MethodOptions, Builder> implements MethodOptionsOrBuilder {
            private Builder() {
                super(MethodOptions.DEFAULT_INSTANCE);
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((MethodOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MethodOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((MethodOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearFeatures() {
                copyOnWrite();
                ((MethodOptions) this.instance).clearFeatures();
                return this;
            }

            public Builder clearIdempotencyLevel() {
                copyOnWrite();
                ((MethodOptions) this.instance).clearIdempotencyLevel();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((MethodOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public boolean getDeprecated() {
                return ((MethodOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public FeatureSet getFeatures() {
                return ((MethodOptions) this.instance).getFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public IdempotencyLevel getIdempotencyLevel() {
                return ((MethodOptions) this.instance).getIdempotencyLevel();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
                return ((MethodOptions) this.instance).getUninterpretedOption(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((MethodOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((MethodOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((MethodOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public boolean hasFeatures() {
                return ((MethodOptions) this.instance).hasFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.MethodOptionsOrBuilder
            public boolean hasIdempotencyLevel() {
                return ((MethodOptions) this.instance).hasIdempotencyLevel();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((MethodOptions) this.instance).mergeFeatures(featureSet);
                return this;
            }

            public Builder removeUninterpretedOption(int i) {
                copyOnWrite();
                ((MethodOptions) this.instance).removeUninterpretedOption(i);
                return this;
            }

            public Builder setDeprecated(boolean z) {
                copyOnWrite();
                ((MethodOptions) this.instance).setDeprecated(z);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFeatures(FeatureSet.Builder builder) {
                copyOnWrite();
                ((MethodOptions) this.instance).setFeatures((FeatureSet) builder.build());
                return this;
            }

            public Builder setIdempotencyLevel(IdempotencyLevel idempotencyLevel) {
                copyOnWrite();
                ((MethodOptions) this.instance).setIdempotencyLevel(idempotencyLevel);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MethodOptions) this.instance).setUninterpretedOption(i, builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MethodOptions) this.instance).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder setFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((MethodOptions) this.instance).setFeatures(featureSet);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MethodOptions) this.instance).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((MethodOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((MethodOptions) this.instance).addUninterpretedOption(i, builder.build());
                return this;
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public enum IdempotencyLevel implements Internal.EnumLite {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);

            public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
            public static final int IDEMPOTENT_VALUE = 2;
            public static final int NO_SIDE_EFFECTS_VALUE = 1;
            private static final Internal.EnumLiteMap<IdempotencyLevel> internalValueMap = new Internal.EnumLiteMap<IdempotencyLevel>() { // from class: com.google.protobuf.DescriptorProtos.MethodOptions.IdempotencyLevel.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public IdempotencyLevel findValueByNumber(int i) {
                    return IdempotencyLevel.forNumber(i);
                }
            };
            private final int value;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            /* loaded from: classes.dex */
            public static final class IdempotencyLevelVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new IdempotencyLevelVerifier();

                private IdempotencyLevelVerifier() {
                }

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i) {
                    if (IdempotencyLevel.forNumber(i) != null) {
                        return true;
                    }
                    return false;
                }
            }

            IdempotencyLevel(int i) {
                this.value = i;
            }

            public static IdempotencyLevel forNumber(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return IDEMPOTENT;
                    }
                    return NO_SIDE_EFFECTS;
                }
                return IDEMPOTENCY_UNKNOWN;
            }

            public static Internal.EnumLiteMap<IdempotencyLevel> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return IdempotencyLevelVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static IdempotencyLevel valueOf(int i) {
                return forNumber(i);
            }
        }

        public static Builder newBuilder(MethodOptions methodOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(methodOptions);
        }

        public static MethodOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(ByteString byteString) {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static MethodOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static MethodOptions parseFrom(byte[] bArr) {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MethodOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(InputStream inputStream) {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MethodOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static MethodOptions parseFrom(CodedInputStream codedInputStream) {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static MethodOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class OneofDescriptorProto extends GeneratedMessageLite<OneofDescriptorProto, Builder> implements OneofDescriptorProtoOrBuilder {
        private static final OneofDescriptorProto DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 2;
        private static volatile Parser<OneofDescriptorProto> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private OneofOptions options_;

        static {
            OneofDescriptorProto oneofDescriptorProto = new OneofDescriptorProto();
            DEFAULT_INSTANCE = oneofDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(OneofDescriptorProto.class, oneofDescriptorProto);
        }

        private OneofDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static OneofDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(OneofOptions oneofOptions) {
            oneofOptions.getClass();
            OneofOptions oneofOptions2 = this.options_;
            if (oneofOptions2 != null && oneofOptions2 != OneofOptions.getDefaultInstance()) {
                this.options_ = ((OneofOptions.Builder) OneofOptions.newBuilder(this.options_).mergeFrom((OneofOptions.Builder) oneofOptions)).buildPartial();
            } else {
                this.options_ = oneofOptions;
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OneofDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(OneofOptions oneofOptions) {
            oneofOptions.getClass();
            this.options_ = oneofOptions;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new OneofDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OneofDescriptorProto> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (OneofDescriptorProto.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public OneofOptions getOptions() {
            OneofOptions oneofOptions = this.options_;
            if (oneofOptions == null) {
                return OneofOptions.getDefaultInstance();
            }
            return oneofOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public boolean hasName() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
        public boolean hasOptions() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<OneofDescriptorProto, Builder> implements OneofDescriptorProtoOrBuilder {
            private Builder() {
                super(OneofDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder clearName() {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).clearOptions();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public String getName() {
                return ((OneofDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((OneofDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public OneofOptions getOptions() {
                return ((OneofDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((OneofDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((OneofDescriptorProto) this.instance).hasOptions();
            }

            public Builder mergeOptions(OneofOptions oneofOptions) {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).mergeOptions(oneofOptions);
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(OneofOptions.Builder builder) {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).setOptions((OneofOptions) builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder setOptions(OneofOptions oneofOptions) {
                copyOnWrite();
                ((OneofDescriptorProto) this.instance).setOptions(oneofOptions);
                return this;
            }
        }

        public static Builder newBuilder(OneofDescriptorProto oneofDescriptorProto) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(oneofDescriptorProto);
        }

        public static OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OneofDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OneofDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OneofDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class OneofOptions extends GeneratedMessageLite.ExtendableMessage<OneofOptions, Builder> implements OneofOptionsOrBuilder {
        private static final OneofOptions DEFAULT_INSTANCE;
        public static final int FEATURES_FIELD_NUMBER = 1;
        private static volatile Parser<OneofOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private FeatureSet features_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        static {
            OneofOptions oneofOptions = new OneofOptions();
            DEFAULT_INSTANCE = oneofOptions;
            GeneratedMessageLite.registerDefaultInstance(OneofOptions.class, oneofOptions);
        }

        private OneofOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (!protobufList.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static OneofOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            FeatureSet featureSet2 = this.features_;
            if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                this.features_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.features_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
            } else {
                this.features_ = featureSet;
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream) {
            return (OneofOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer) {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OneofOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            this.features_ = featureSet;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new OneofOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0002\u0001ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "features_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OneofOptions> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (OneofOptions.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            if (featureSet == null) {
                return FeatureSet.getDefaultInstance();
            }
            return featureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
        public boolean hasFeatures() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<OneofOptions, Builder> implements OneofOptionsOrBuilder {
            private Builder() {
                super(OneofOptions.DEFAULT_INSTANCE);
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((OneofOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((OneofOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder clearFeatures() {
                copyOnWrite();
                ((OneofOptions) this.instance).clearFeatures();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((OneofOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public FeatureSet getFeatures() {
                return ((OneofOptions) this.instance).getFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
                return ((OneofOptions) this.instance).getUninterpretedOption(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((OneofOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((OneofOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.OneofOptionsOrBuilder
            public boolean hasFeatures() {
                return ((OneofOptions) this.instance).hasFeatures();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((OneofOptions) this.instance).mergeFeatures(featureSet);
                return this;
            }

            public Builder removeUninterpretedOption(int i) {
                copyOnWrite();
                ((OneofOptions) this.instance).removeUninterpretedOption(i);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFeatures(FeatureSet.Builder builder) {
                copyOnWrite();
                ((OneofOptions) this.instance).setFeatures((FeatureSet) builder.build());
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((OneofOptions) this.instance).setUninterpretedOption(i, builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((OneofOptions) this.instance).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder setFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((OneofOptions) this.instance).setFeatures(featureSet);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((OneofOptions) this.instance).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((OneofOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((OneofOptions) this.instance).addUninterpretedOption(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(OneofOptions oneofOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(oneofOptions);
        }

        public static OneofOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OneofOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OneofOptions parseFrom(ByteString byteString) {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OneofOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static OneofOptions parseFrom(byte[] bArr) {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OneofOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OneofOptions parseFrom(InputStream inputStream) {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OneofOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OneofOptions parseFrom(CodedInputStream codedInputStream) {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OneofOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class ServiceDescriptorProto extends GeneratedMessageLite<ServiceDescriptorProto, Builder> implements ServiceDescriptorProtoOrBuilder {
        private static final ServiceDescriptorProto DEFAULT_INSTANCE;
        public static final int METHOD_FIELD_NUMBER = 2;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<ServiceDescriptorProto> PARSER;
        private int bitField0_;
        private ServiceOptions options_;
        private byte memoizedIsInitialized = 2;
        private String name_ = "";
        private Internal.ProtobufList<MethodDescriptorProto> method_ = GeneratedMessageLite.emptyProtobufList();

        static {
            ServiceDescriptorProto serviceDescriptorProto = new ServiceDescriptorProto();
            DEFAULT_INSTANCE = serviceDescriptorProto;
            GeneratedMessageLite.registerDefaultInstance(ServiceDescriptorProto.class, serviceDescriptorProto);
        }

        private ServiceDescriptorProto() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMethod(Iterable<? extends MethodDescriptorProto> iterable) {
            ensureMethodIsMutable();
            AbstractMessageLite.addAll(iterable, this.method_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMethod(MethodDescriptorProto methodDescriptorProto) {
            methodDescriptorProto.getClass();
            ensureMethodIsMutable();
            this.method_.add(methodDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMethod() {
            this.method_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        private void ensureMethodIsMutable() {
            Internal.ProtobufList<MethodDescriptorProto> protobufList = this.method_;
            if (!protobufList.isModifiable()) {
                this.method_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static ServiceDescriptorProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeOptions(ServiceOptions serviceOptions) {
            serviceOptions.getClass();
            ServiceOptions serviceOptions2 = this.options_;
            if (serviceOptions2 != null && serviceOptions2 != ServiceOptions.getDefaultInstance()) {
                this.options_ = ((ServiceOptions.Builder) ServiceOptions.newBuilder(this.options_).mergeFrom((ServiceOptions.Builder) serviceOptions)).buildPartial();
            } else {
                this.options_ = serviceOptions;
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ServiceDescriptorProto> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeMethod(int i) {
            ensureMethodIsMutable();
            this.method_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMethod(int i, MethodDescriptorProto methodDescriptorProto) {
            methodDescriptorProto.getClass();
            ensureMethodIsMutable();
            this.method_.set(i, methodDescriptorProto);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(ByteString byteString) {
            this.name_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(ServiceOptions serviceOptions) {
            serviceOptions.getClass();
            this.options_ = serviceOptions;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServiceDescriptorProto();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", MethodDescriptorProto.class, "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ServiceDescriptorProto> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (ServiceDescriptorProto.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public MethodDescriptorProto getMethod(int i) {
            return this.method_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public int getMethodCount() {
            return this.method_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public List<MethodDescriptorProto> getMethodList() {
            return this.method_;
        }

        public MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i) {
            return this.method_.get(i);
        }

        public List<? extends MethodDescriptorProtoOrBuilder> getMethodOrBuilderList() {
            return this.method_;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public ServiceOptions getOptions() {
            ServiceOptions serviceOptions = this.options_;
            if (serviceOptions == null) {
                return ServiceOptions.getDefaultInstance();
            }
            return serviceOptions;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public boolean hasName() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
        public boolean hasOptions() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<ServiceDescriptorProto, Builder> implements ServiceDescriptorProtoOrBuilder {
            private Builder() {
                super(ServiceDescriptorProto.DEFAULT_INSTANCE);
            }

            public Builder addAllMethod(Iterable<? extends MethodDescriptorProto> iterable) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).addAllMethod(iterable);
                return this;
            }

            public Builder addMethod(MethodDescriptorProto.Builder builder) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).addMethod(builder.build());
                return this;
            }

            public Builder clearMethod() {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).clearMethod();
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).clearName();
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).clearOptions();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public MethodDescriptorProto getMethod(int i) {
                return ((ServiceDescriptorProto) this.instance).getMethod(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public int getMethodCount() {
                return ((ServiceDescriptorProto) this.instance).getMethodCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public List<MethodDescriptorProto> getMethodList() {
                return Collections.unmodifiableList(((ServiceDescriptorProto) this.instance).getMethodList());
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public String getName() {
                return ((ServiceDescriptorProto) this.instance).getName();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public ByteString getNameBytes() {
                return ((ServiceDescriptorProto) this.instance).getNameBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public ServiceOptions getOptions() {
                return ((ServiceDescriptorProto) this.instance).getOptions();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public boolean hasName() {
                return ((ServiceDescriptorProto) this.instance).hasName();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceDescriptorProtoOrBuilder
            public boolean hasOptions() {
                return ((ServiceDescriptorProto) this.instance).hasOptions();
            }

            public Builder mergeOptions(ServiceOptions serviceOptions) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).mergeOptions(serviceOptions);
                return this;
            }

            public Builder removeMethod(int i) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).removeMethod(i);
                return this;
            }

            public Builder setMethod(int i, MethodDescriptorProto.Builder builder) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setMethod(i, builder.build());
                return this;
            }

            public Builder setName(String str) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setName(str);
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setNameBytes(byteString);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setOptions(ServiceOptions.Builder builder) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setOptions((ServiceOptions) builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addMethod(int i, MethodDescriptorProto methodDescriptorProto) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).addMethod(i, methodDescriptorProto);
                return this;
            }

            public Builder setMethod(int i, MethodDescriptorProto methodDescriptorProto) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setMethod(i, methodDescriptorProto);
                return this;
            }

            public Builder setOptions(ServiceOptions serviceOptions) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).setOptions(serviceOptions);
                return this;
            }

            public Builder addMethod(MethodDescriptorProto methodDescriptorProto) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).addMethod(methodDescriptorProto);
                return this;
            }

            public Builder addMethod(int i, MethodDescriptorProto.Builder builder) {
                copyOnWrite();
                ((ServiceDescriptorProto) this.instance).addMethod(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(ServiceDescriptorProto serviceDescriptorProto) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(serviceDescriptorProto);
        }

        public static ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ServiceDescriptorProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMethod(int i, MethodDescriptorProto methodDescriptorProto) {
            methodDescriptorProto.getClass();
            ensureMethodIsMutable();
            this.method_.add(i, methodDescriptorProto);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceDescriptorProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceDescriptorProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ServiceDescriptorProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class ServiceOptions extends GeneratedMessageLite.ExtendableMessage<ServiceOptions, Builder> implements ServiceOptionsOrBuilder {
        private static final ServiceOptions DEFAULT_INSTANCE;
        public static final int DEPRECATED_FIELD_NUMBER = 33;
        public static final int FEATURES_FIELD_NUMBER = 34;
        private static volatile Parser<ServiceOptions> PARSER = null;
        public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
        private int bitField0_;
        private boolean deprecated_;
        private FeatureSet features_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

        static {
            ServiceOptions serviceOptions = new ServiceOptions();
            DEFAULT_INSTANCE = serviceOptions;
            GeneratedMessageLite.registerDefaultInstance(ServiceOptions.class, serviceOptions);
        }

        private ServiceOptions() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
            ensureUninterpretedOptionIsMutable();
            AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(uninterpretedOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeprecated() {
            this.bitField0_ &= -3;
            this.deprecated_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatures() {
            this.features_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUninterpretedOption() {
            this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureUninterpretedOptionIsMutable() {
            Internal.ProtobufList<UninterpretedOption> protobufList = this.uninterpretedOption_;
            if (!protobufList.isModifiable()) {
                this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(protobufList);
            }
        }

        public static ServiceOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void mergeFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            FeatureSet featureSet2 = this.features_;
            if (featureSet2 != null && featureSet2 != FeatureSet.getDefaultInstance()) {
                this.features_ = ((FeatureSet.Builder) FeatureSet.newBuilder(this.features_).mergeFrom((FeatureSet.Builder) featureSet)).buildPartial();
            } else {
                this.features_ = featureSet;
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream) {
            return (ServiceOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer) {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ServiceOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeUninterpretedOption(int i) {
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeprecated(boolean z) {
            this.bitField0_ |= 2;
            this.deprecated_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatures(FeatureSet featureSet) {
            featureSet.getClass();
            this.features_ = featureSet;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.set(i, uninterpretedOption);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            int i;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ServiceOptions();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0002!ဇ\u0001\"ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "uninterpretedOption_", UninterpretedOption.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ServiceOptions> parser2 = PARSER;
                    if (parser2 == null) {
                        synchronized (ServiceOptions.class) {
                            try {
                                parser = PARSER;
                                if (parser == null) {
                                    parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = parser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return parser;
                    }
                    return parser2;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    if (obj == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public boolean getDeprecated() {
            return this.deprecated_;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public FeatureSet getFeatures() {
            FeatureSet featureSet = this.features_;
            if (featureSet == null) {
                return FeatureSet.getDefaultInstance();
            }
            return featureSet;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public UninterpretedOption getUninterpretedOption(int i) {
            return this.uninterpretedOption_.get(i);
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return this.uninterpretedOption_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public List<UninterpretedOption> getUninterpretedOptionList() {
            return this.uninterpretedOption_;
        }

        public UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i) {
            return this.uninterpretedOption_.get(i);
        }

        public List<? extends UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
            return this.uninterpretedOption_;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public boolean hasDeprecated() {
            if ((this.bitField0_ & 2) != 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
        public boolean hasFeatures() {
            if ((this.bitField0_ & 1) != 0) {
                return true;
            }
            return false;
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ServiceOptions, Builder> implements ServiceOptionsOrBuilder {
            private Builder() {
                super(ServiceOptions.DEFAULT_INSTANCE);
            }

            public Builder addAllUninterpretedOption(Iterable<? extends UninterpretedOption> iterable) {
                copyOnWrite();
                ((ServiceOptions) this.instance).addAllUninterpretedOption(iterable);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ServiceOptions) this.instance).addUninterpretedOption(builder.build());
                return this;
            }

            public Builder clearDeprecated() {
                copyOnWrite();
                ((ServiceOptions) this.instance).clearDeprecated();
                return this;
            }

            public Builder clearFeatures() {
                copyOnWrite();
                ((ServiceOptions) this.instance).clearFeatures();
                return this;
            }

            public Builder clearUninterpretedOption() {
                copyOnWrite();
                ((ServiceOptions) this.instance).clearUninterpretedOption();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public boolean getDeprecated() {
                return ((ServiceOptions) this.instance).getDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public FeatureSet getFeatures() {
                return ((ServiceOptions) this.instance).getFeatures();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public UninterpretedOption getUninterpretedOption(int i) {
                return ((ServiceOptions) this.instance).getUninterpretedOption(i);
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public int getUninterpretedOptionCount() {
                return ((ServiceOptions) this.instance).getUninterpretedOptionCount();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public List<UninterpretedOption> getUninterpretedOptionList() {
                return Collections.unmodifiableList(((ServiceOptions) this.instance).getUninterpretedOptionList());
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public boolean hasDeprecated() {
                return ((ServiceOptions) this.instance).hasDeprecated();
            }

            @Override // com.google.protobuf.DescriptorProtos.ServiceOptionsOrBuilder
            public boolean hasFeatures() {
                return ((ServiceOptions) this.instance).hasFeatures();
            }

            public Builder mergeFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((ServiceOptions) this.instance).mergeFeatures(featureSet);
                return this;
            }

            public Builder removeUninterpretedOption(int i) {
                copyOnWrite();
                ((ServiceOptions) this.instance).removeUninterpretedOption(i);
                return this;
            }

            public Builder setDeprecated(boolean z) {
                copyOnWrite();
                ((ServiceOptions) this.instance).setDeprecated(z);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Builder setFeatures(FeatureSet.Builder builder) {
                copyOnWrite();
                ((ServiceOptions) this.instance).setFeatures((FeatureSet) builder.build());
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ServiceOptions) this.instance).setUninterpretedOption(i, builder.build());
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ServiceOptions) this.instance).addUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder setFeatures(FeatureSet featureSet) {
                copyOnWrite();
                ((ServiceOptions) this.instance).setFeatures(featureSet);
                return this;
            }

            public Builder setUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ServiceOptions) this.instance).setUninterpretedOption(i, uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(UninterpretedOption uninterpretedOption) {
                copyOnWrite();
                ((ServiceOptions) this.instance).addUninterpretedOption(uninterpretedOption);
                return this;
            }

            public Builder addUninterpretedOption(int i, UninterpretedOption.Builder builder) {
                copyOnWrite();
                ((ServiceOptions) this.instance).addUninterpretedOption(i, builder.build());
                return this;
            }
        }

        public static Builder newBuilder(ServiceOptions serviceOptions) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(serviceOptions);
        }

        public static ServiceOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(ByteString byteString) {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ServiceOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUninterpretedOption(int i, UninterpretedOption uninterpretedOption) {
            uninterpretedOption.getClass();
            ensureUninterpretedOptionIsMutable();
            this.uninterpretedOption_.add(i, uninterpretedOption);
        }

        public static ServiceOptions parseFrom(byte[] bArr) {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ServiceOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(InputStream inputStream) {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ServiceOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ServiceOptions parseFrom(CodedInputStream codedInputStream) {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ServiceOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public enum Edition implements Internal.EnumLite {
        EDITION_UNKNOWN(0),
        EDITION_LEGACY(EDITION_LEGACY_VALUE),
        EDITION_PROTO2(EDITION_PROTO2_VALUE),
        EDITION_PROTO3(999),
        EDITION_2023(EDITION_2023_VALUE),
        EDITION_2024(1001),
        EDITION_UNSTABLE(EDITION_UNSTABLE_VALUE),
        EDITION_1_TEST_ONLY(1),
        EDITION_2_TEST_ONLY(2),
        EDITION_99997_TEST_ONLY(EDITION_99997_TEST_ONLY_VALUE),
        EDITION_99998_TEST_ONLY(EDITION_99998_TEST_ONLY_VALUE),
        EDITION_99999_TEST_ONLY(EDITION_99999_TEST_ONLY_VALUE),
        EDITION_MAX(Integer.MAX_VALUE);

        public static final int EDITION_1_TEST_ONLY_VALUE = 1;
        public static final int EDITION_2023_VALUE = 1000;
        public static final int EDITION_2024_VALUE = 1001;
        public static final int EDITION_2_TEST_ONLY_VALUE = 2;
        public static final int EDITION_99997_TEST_ONLY_VALUE = 99997;
        public static final int EDITION_99998_TEST_ONLY_VALUE = 99998;
        public static final int EDITION_99999_TEST_ONLY_VALUE = 99999;
        public static final int EDITION_LEGACY_VALUE = 900;
        public static final int EDITION_MAX_VALUE = Integer.MAX_VALUE;
        public static final int EDITION_PROTO2_VALUE = 998;
        public static final int EDITION_PROTO3_VALUE = 999;
        public static final int EDITION_UNKNOWN_VALUE = 0;
        public static final int EDITION_UNSTABLE_VALUE = 9999;
        private static final Internal.EnumLiteMap<Edition> internalValueMap = new Internal.EnumLiteMap<Edition>() { // from class: com.google.protobuf.DescriptorProtos.Edition.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Edition findValueByNumber(int i) {
                return Edition.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class EditionVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new EditionVerifier();

            private EditionVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                if (Edition.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        Edition(int i) {
            this.value = i;
        }

        public static Edition forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 900) {
                            if (i != 9999) {
                                if (i != Integer.MAX_VALUE) {
                                    switch (i) {
                                        case EDITION_PROTO2_VALUE:
                                            return EDITION_PROTO2;
                                        case 999:
                                            return EDITION_PROTO3;
                                        case EDITION_2023_VALUE:
                                            return EDITION_2023;
                                        case 1001:
                                            return EDITION_2024;
                                        default:
                                            switch (i) {
                                                case EDITION_99997_TEST_ONLY_VALUE:
                                                    return EDITION_99997_TEST_ONLY;
                                                case EDITION_99998_TEST_ONLY_VALUE:
                                                    return EDITION_99998_TEST_ONLY;
                                                case EDITION_99999_TEST_ONLY_VALUE:
                                                    return EDITION_99999_TEST_ONLY;
                                                default:
                                                    return null;
                                            }
                                    }
                                }
                                return EDITION_MAX;
                            }
                            return EDITION_UNSTABLE;
                        }
                        return EDITION_LEGACY;
                    }
                    return EDITION_2_TEST_ONLY;
                }
                return EDITION_1_TEST_ONLY;
            }
            return EDITION_UNKNOWN;
        }

        public static Internal.EnumLiteMap<Edition> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return EditionVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static Edition valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public enum SymbolVisibility implements Internal.EnumLite {
        VISIBILITY_UNSET(0),
        VISIBILITY_LOCAL(1),
        VISIBILITY_EXPORT(2);

        public static final int VISIBILITY_EXPORT_VALUE = 2;
        public static final int VISIBILITY_LOCAL_VALUE = 1;
        public static final int VISIBILITY_UNSET_VALUE = 0;
        private static final Internal.EnumLiteMap<SymbolVisibility> internalValueMap = new Internal.EnumLiteMap<SymbolVisibility>() { // from class: com.google.protobuf.DescriptorProtos.SymbolVisibility.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SymbolVisibility findValueByNumber(int i) {
                return SymbolVisibility.forNumber(i);
            }
        };
        private final int value;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        /* loaded from: classes.dex */
        public static final class SymbolVisibilityVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new SymbolVisibilityVerifier();

            private SymbolVisibilityVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                if (SymbolVisibility.forNumber(i) != null) {
                    return true;
                }
                return false;
            }
        }

        SymbolVisibility(int i) {
            this.value = i;
        }

        public static SymbolVisibility forNumber(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return null;
                    }
                    return VISIBILITY_EXPORT;
                }
                return VISIBILITY_LOCAL;
            }
            return VISIBILITY_UNSET;
        }

        public static Internal.EnumLiteMap<SymbolVisibility> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return SymbolVisibilityVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static SymbolVisibility valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
