package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ExtensionList;
import defpackage.f00;
import defpackage.oe0;
import defpackage.yq1;
import defpackage.yx;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/google/protobuf/FieldOptionsKt$EditionDefaultKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;", "-initializeeditionDefault", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;", "editionDefault", "Lcom/google/protobuf/FieldOptionsKt$FeatureSupportKt$Dsl;", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "-initializefeatureSupport", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "featureSupport", "Dsl", "EditionDefaultKt", "FeatureSupportKt", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class FieldOptionsKt {
    public static final FieldOptionsKt INSTANCE = new FieldOptionsKt();

    private FieldOptionsKt() {
    }

    /* renamed from: -initializeeditionDefault, reason: not valid java name */
    public final DescriptorProtos.FieldOptions.EditionDefault m34initializeeditionDefault(oe0 block) {
        block.getClass();
        EditionDefaultKt.Dsl.Companion companion = EditionDefaultKt.Dsl.INSTANCE;
        DescriptorProtos.FieldOptions.EditionDefault.Builder newBuilder = DescriptorProtos.FieldOptions.EditionDefault.newBuilder();
        newBuilder.getClass();
        EditionDefaultKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* renamed from: -initializefeatureSupport, reason: not valid java name */
    public final DescriptorProtos.FieldOptions.FeatureSupport m35initializefeatureSupport(oe0 block) {
        block.getClass();
        FeatureSupportKt.Dsl.Companion companion = FeatureSupportKt.Dsl.INSTANCE;
        DescriptorProtos.FieldOptions.FeatureSupport.Builder newBuilder = DescriptorProtos.FieldOptions.FeatureSupport.newBuilder();
        newBuilder.getClass();
        FeatureSupportKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$EditionDefaultKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class EditionDefaultKt {
        public static final EditionDefaultKt INSTANCE = new EditionDefaultKt();

        private EditionDefaultKt() {
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$EditionDefaultKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;", "_build", "()Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;", "Lod2;", "clearEdition", "()V", "", "hasEdition", "()Z", "clearValue", "hasValue", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$Builder;", "Lcom/google/protobuf/DescriptorProtos$Edition;", "value", "getEdition", "()Lcom/google/protobuf/DescriptorProtos$Edition;", "setEdition", "(Lcom/google/protobuf/DescriptorProtos$Edition;)V", "edition", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "Companion", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DescriptorProtos.FieldOptions.EditionDefault.Builder _builder;

            private Dsl(DescriptorProtos.FieldOptions.EditionDefault.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ DescriptorProtos.FieldOptions.EditionDefault _build() {
                DescriptorProtos.FieldOptions.EditionDefault build = this._builder.build();
                build.getClass();
                return build;
            }

            public final void clearEdition() {
                this._builder.clearEdition();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            public final DescriptorProtos.Edition getEdition() {
                DescriptorProtos.Edition edition = this._builder.getEdition();
                edition.getClass();
                return edition;
            }

            public final String getValue() {
                String value = this._builder.getValue();
                value.getClass();
                return value;
            }

            public final boolean hasEdition() {
                return this._builder.hasEdition();
            }

            public final boolean hasValue() {
                return this._builder.hasValue();
            }

            public final void setEdition(DescriptorProtos.Edition edition) {
                edition.getClass();
                this._builder.setEdition(edition);
            }

            public final void setValue(String str) {
                str.getClass();
                this._builder.setValue(str);
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$EditionDefaultKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FieldOptionsKt$EditionDefaultKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class Companion {
                public /* synthetic */ Companion(yx yxVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DescriptorProtos.FieldOptions.EditionDefault.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DescriptorProtos.FieldOptions.EditionDefault.Builder builder, yx yxVar) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$FeatureSupportKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class FeatureSupportKt {
        public static final FeatureSupportKt INSTANCE = new FeatureSupportKt();

        private FeatureSupportKt() {
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R$\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010%\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020 8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010(\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001b¨\u0006*"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$FeatureSupportKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "_build", "()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "Lod2;", "clearEditionIntroduced", "()V", "", "hasEditionIntroduced", "()Z", "clearEditionDeprecated", "hasEditionDeprecated", "clearDeprecationWarning", "hasDeprecationWarning", "clearEditionRemoved", "hasEditionRemoved", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$Builder;", "Lcom/google/protobuf/DescriptorProtos$Edition;", "value", "getEditionIntroduced", "()Lcom/google/protobuf/DescriptorProtos$Edition;", "setEditionIntroduced", "(Lcom/google/protobuf/DescriptorProtos$Edition;)V", "editionIntroduced", "getEditionDeprecated", "setEditionDeprecated", "editionDeprecated", "", "getDeprecationWarning", "()Ljava/lang/String;", "setDeprecationWarning", "(Ljava/lang/String;)V", "deprecationWarning", "getEditionRemoved", "setEditionRemoved", "editionRemoved", "Companion", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DescriptorProtos.FieldOptions.FeatureSupport.Builder _builder;

            private Dsl(DescriptorProtos.FieldOptions.FeatureSupport.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ DescriptorProtos.FieldOptions.FeatureSupport _build() {
                DescriptorProtos.FieldOptions.FeatureSupport build = this._builder.build();
                build.getClass();
                return build;
            }

            public final void clearDeprecationWarning() {
                this._builder.clearDeprecationWarning();
            }

            public final void clearEditionDeprecated() {
                this._builder.clearEditionDeprecated();
            }

            public final void clearEditionIntroduced() {
                this._builder.clearEditionIntroduced();
            }

            public final void clearEditionRemoved() {
                this._builder.clearEditionRemoved();
            }

            public final String getDeprecationWarning() {
                String deprecationWarning = this._builder.getDeprecationWarning();
                deprecationWarning.getClass();
                return deprecationWarning;
            }

            public final DescriptorProtos.Edition getEditionDeprecated() {
                DescriptorProtos.Edition editionDeprecated = this._builder.getEditionDeprecated();
                editionDeprecated.getClass();
                return editionDeprecated;
            }

            public final DescriptorProtos.Edition getEditionIntroduced() {
                DescriptorProtos.Edition editionIntroduced = this._builder.getEditionIntroduced();
                editionIntroduced.getClass();
                return editionIntroduced;
            }

            public final DescriptorProtos.Edition getEditionRemoved() {
                DescriptorProtos.Edition editionRemoved = this._builder.getEditionRemoved();
                editionRemoved.getClass();
                return editionRemoved;
            }

            public final boolean hasDeprecationWarning() {
                return this._builder.hasDeprecationWarning();
            }

            public final boolean hasEditionDeprecated() {
                return this._builder.hasEditionDeprecated();
            }

            public final boolean hasEditionIntroduced() {
                return this._builder.hasEditionIntroduced();
            }

            public final boolean hasEditionRemoved() {
                return this._builder.hasEditionRemoved();
            }

            public final void setDeprecationWarning(String str) {
                str.getClass();
                this._builder.setDeprecationWarning(str);
            }

            public final void setEditionDeprecated(DescriptorProtos.Edition edition) {
                edition.getClass();
                this._builder.setEditionDeprecated(edition);
            }

            public final void setEditionIntroduced(DescriptorProtos.Edition edition) {
                edition.getClass();
                this._builder.setEditionIntroduced(edition);
            }

            public final void setEditionRemoved(DescriptorProtos.Edition edition) {
                edition.getClass();
                this._builder.setEditionRemoved(edition);
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$FeatureSupportKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FieldOptionsKt$FeatureSupportKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class Companion {
                public /* synthetic */ Companion(yx yxVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DescriptorProtos.FieldOptions.FeatureSupport.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DescriptorProtos.FieldOptions.FeatureSupport.Builder builder, yx yxVar) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 §\u00012\u00020\u0001:\b§\u0001¨\u0001©\u0001ª\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u000bJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ'\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010\"\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010$J(\u0010'\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010\"\u001a\u00020 H\u0087\n¢\u0006\u0004\b&\u0010$J-\u0010,\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0(H\u0007¢\u0006\u0004\b*\u0010+J.\u0010'\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0(H\u0087\n¢\u0006\u0004\b-\u0010+J0\u00102\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010/\u001a\u00020.2\u0006\u0010\"\u001a\u00020 H\u0087\u0002¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0007¢\u0006\u0004\b3\u00104J'\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001f2\u0006\u0010\"\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J(\u0010'\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001f2\u0006\u0010\"\u001a\u000206H\u0087\n¢\u0006\u0004\b:\u00109J-\u0010,\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002060(H\u0007¢\u0006\u0004\b;\u0010+J.\u0010'\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002060(H\u0087\n¢\u0006\u0004\b<\u0010+J0\u00102\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001f2\u0006\u0010/\u001a\u00020.2\u0006\u0010\"\u001a\u000206H\u0087\u0002¢\u0006\u0004\b=\u0010>J\u001f\u00105\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001fH\u0007¢\u0006\u0004\b?\u00104J\r\u0010@\u001a\u00020\t¢\u0006\u0004\b@\u0010\u000bJ\r\u0010A\u001a\u00020\f¢\u0006\u0004\bA\u0010\u000eJ\r\u0010B\u001a\u00020\t¢\u0006\u0004\bB\u0010\u000bJ\r\u0010C\u001a\u00020\f¢\u0006\u0004\bC\u0010\u000eJ'\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0\u001f2\u0006\u0010\"\u001a\u00020DH\u0007¢\u0006\u0004\bF\u0010GJ(\u0010'\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0\u001f2\u0006\u0010\"\u001a\u00020DH\u0087\n¢\u0006\u0004\bH\u0010GJ-\u0010,\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020D0(H\u0007¢\u0006\u0004\bI\u0010+J.\u0010'\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0\u001f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020D0(H\u0087\n¢\u0006\u0004\bJ\u0010+J0\u00102\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0\u001f2\u0006\u0010/\u001a\u00020.2\u0006\u0010\"\u001a\u00020DH\u0087\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u00105\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0\u001fH\u0007¢\u0006\u0004\bM\u00104J.\u0010Q\u001a\u00028\u0000\"\b\b\u0000\u0010N*\u00020\u00012\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000OH\u0086\u0002¢\u0006\u0004\bQ\u0010RJ@\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060U\"\b\b\u0000\u0010S*\u00020\u00012\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000T0OH\u0087\u0002¢\u0006\u0004\bV\u0010WJ\"\u0010X\u001a\u00020\f2\u0010\u0010P\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030OH\u0086\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u00105\u001a\u00020\t2\u0010\u0010P\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030O¢\u0006\u0004\b5\u0010ZJ3\u0010[\u001a\u00020\t\"\b\b\u0000\u0010N*\u00020\u00012\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000O2\u0006\u0010\"\u001a\u00028\u0000¢\u0006\u0004\b[\u0010\\J<\u00102\u001a\u00020\t\"\u000e\b\u0000\u0010N*\b\u0012\u0004\u0012\u00028\u00000]2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000O2\u0006\u0010\"\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b2\u0010^J,\u00102\u001a\u00020\t2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020_0O2\u0006\u0010\"\u001a\u00020_H\u0086\n¢\u0006\u0004\b2\u0010`J6\u00102\u001a\u00020\t\"\b\b\u0000\u0010N*\u00020a2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000O2\u0006\u0010\"\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b2\u0010bJ/\u0010%\u001a\u00020\t\"\b\b\u0000\u0010S*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060U2\u0006\u0010\"\u001a\u00028\u0000¢\u0006\u0004\b%\u0010cJ2\u0010'\u001a\u00020\t\"\b\b\u0000\u0010S*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060U2\u0006\u0010\"\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b'\u0010cJ5\u0010,\u001a\u00020\t\"\b\b\u0000\u0010S*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060U2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(¢\u0006\u0004\b,\u0010dJ8\u0010'\u001a\u00020\t\"\b\b\u0000\u0010S*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060U2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0086\n¢\u0006\u0004\b'\u0010dJ:\u00102\u001a\u00020\t\"\b\b\u0000\u0010S*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060U2\u0006\u0010/\u001a\u00020.2\u0006\u0010\"\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b2\u0010eJ\u001e\u00105\u001a\u00020\t*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00060UH\u0086\b¢\u0006\u0004\b5\u0010fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010gR$\u0010m\u001a\u00020h2\u0006\u0010\"\u001a\u00020h8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010q\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010\u000e\"\u0004\bo\u0010pR$\u0010w\u001a\u00020r2\u0006\u0010\"\u001a\u00020r8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR$\u0010z\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010\u000e\"\u0004\by\u0010pR$\u0010}\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b{\u0010\u000e\"\u0004\b|\u0010pR%\u0010\u0080\u0001\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b~\u0010\u000e\"\u0004\b\u007f\u0010pR.\u0010\u0084\u0001\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0087\u000e¢\u0006\u0015\u0012\u0005\b\u0083\u0001\u0010\u000b\u001a\u0005\b\u0081\u0001\u0010\u000e\"\u0005\b\u0082\u0001\u0010pR'\u0010\u0087\u0001\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010\u000e\"\u0005\b\u0086\u0001\u0010pR+\u0010\u008d\u0001\u001a\u00030\u0088\u00012\u0007\u0010\"\u001a\u00030\u0088\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f8F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0092\u0001\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u001f8F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u008f\u0001R+\u0010\u0098\u0001\u001a\u00030\u0093\u00012\u0007\u0010\"\u001a\u00030\u0093\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001b\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0093\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R+\u0010¡\u0001\u001a\u00030\u009c\u00012\u0007\u0010\"\u001a\u00030\u009c\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R\u001b\u0010¤\u0001\u001a\u0005\u0018\u00010\u009c\u0001*\u00020\u00008F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R \u0010¦\u0001\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0\u001f8F¢\u0006\b\u001a\u0006\b¥\u0001\u0010\u008f\u0001¨\u0006«\u0001"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$FieldOptions;", "_build", "()Lcom/google/protobuf/DescriptorProtos$FieldOptions;", "Lod2;", "clearCtype", "()V", "", "hasCtype", "()Z", "clearPacked", "hasPacked", "clearJstype", "hasJstype", "clearLazy", "hasLazy", "clearUnverifiedLazy", "hasUnverifiedLazy", "clearDeprecated", "hasDeprecated", "clearWeak", "hasWeak", "clearDebugRedact", "hasDebugRedact", "clearRetention", "hasRetention", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;", "Lcom/google/protobuf/FieldOptionsKt$Dsl$TargetsProxy;", "value", "addTargets", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;)V", "add", "plusAssignTargets", "plusAssign", "", "values", "addAllTargets", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllTargets", "", "index", "setTargets", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$FieldOptions$OptionTargetType;)V", "set", "clearTargets", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;", "Lcom/google/protobuf/FieldOptionsKt$Dsl$EditionDefaultsProxy;", "addEditionDefaults", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;)V", "plusAssignEditionDefaults", "addAllEditionDefaults", "plusAssignAllEditionDefaults", "setEditionDefaults", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;)V", "clearEditionDefaults", "clearFeatures", "hasFeatures", "clearFeatureSupport", "hasFeatureSupport", "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;", "Lcom/google/protobuf/FieldOptionsKt$Dsl$UninterpretedOptionProxy;", "addUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;)V", "plusAssignUninterpretedOption", "addAllUninterpretedOption", "plusAssignAllUninterpretedOption", "setUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$UninterpretedOption;)V", "clearUninterpretedOption", "T", "Lcom/google/protobuf/ExtensionLite;", "extension", "get", "(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "E", "", "Lcom/google/protobuf/kotlin/ExtensionList;", "-getRepeatedExtension", "(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/kotlin/ExtensionList;", "contains", "(Lcom/google/protobuf/ExtensionLite;)Z", "(Lcom/google/protobuf/ExtensionLite;)V", "setExtension", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V", "", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Comparable;)V", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/ByteString;)V", "Lcom/google/protobuf/MessageLite;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/MessageLite;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Iterable;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;ILjava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;)V", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$Builder;", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;", "getCtype", "()Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;", "setCtype", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions$CType;)V", "ctype", "getPacked", "setPacked", "(Z)V", "packed", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;", "getJstype", "()Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;", "setJstype", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions$JSType;)V", "jstype", "getLazy", "setLazy", "lazy", "getUnverifiedLazy", "setUnverifiedLazy", "unverifiedLazy", "getDeprecated", "setDeprecated", "deprecated", "getWeak", "setWeak", "getWeak$annotations", "weak", "getDebugRedact", "setDebugRedact", "debugRedact", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;", "getRetention", "()Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;", "setRetention", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions$OptionRetention;)V", "retention", "getTargets", "()Lcom/google/protobuf/kotlin/DslList;", "targets", "getEditionDefaults", "editionDefaults", "Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "getFeatures", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "setFeatures", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)V", "features", "getFeaturesOrNull", "(Lcom/google/protobuf/FieldOptionsKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "featuresOrNull", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "getFeatureSupport", "()Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "setFeatureSupport", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;)V", "featureSupport", "getFeatureSupportOrNull", "(Lcom/google/protobuf/FieldOptionsKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "featureSupportOrNull", "getUninterpretedOption", "uninterpretedOption", "Companion", "EditionDefaultsProxy", "TargetsProxy", "UninterpretedOptionProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.FieldOptions.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$Dsl$EditionDefaultsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class EditionDefaultsProxy extends DslProxy {
            private EditionDefaultsProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$Dsl$TargetsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class TargetsProxy extends DslProxy {
            private TargetsProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$Dsl$UninterpretedOptionProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class UninterpretedOptionProxy extends DslProxy {
            private UninterpretedOptionProxy() {
            }
        }

        private Dsl(DescriptorProtos.FieldOptions.Builder builder) {
            this._builder = builder;
        }

        /* renamed from: -getRepeatedExtension, reason: not valid java name */
        public final /* synthetic */ ExtensionList m36getRepeatedExtension(ExtensionLite extension) {
            extension.getClass();
            Object extension2 = this._builder.getExtension(extension);
            extension2.getClass();
            return new ExtensionList(extension, (List) extension2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* synthetic */ DescriptorProtos.FieldOptions _build() {
            MessageType build = this._builder.build();
            build.getClass();
            return (DescriptorProtos.FieldOptions) build;
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

        public final /* synthetic */ void addAllEditionDefaults(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllEditionDefaults(iterable);
        }

        public final /* synthetic */ void addAllTargets(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllTargets(iterable);
        }

        public final /* synthetic */ void addAllUninterpretedOption(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllUninterpretedOption(iterable);
        }

        public final /* synthetic */ void addEditionDefaults(DslList dslList, DescriptorProtos.FieldOptions.EditionDefault editionDefault) {
            dslList.getClass();
            editionDefault.getClass();
            this._builder.addEditionDefaults(editionDefault);
        }

        public final /* synthetic */ void addTargets(DslList dslList, DescriptorProtos.FieldOptions.OptionTargetType optionTargetType) {
            dslList.getClass();
            optionTargetType.getClass();
            this._builder.addTargets(optionTargetType);
        }

        public final /* synthetic */ void addUninterpretedOption(DslList dslList, DescriptorProtos.UninterpretedOption uninterpretedOption) {
            dslList.getClass();
            uninterpretedOption.getClass();
            this._builder.addUninterpretedOption(uninterpretedOption);
        }

        public final /* synthetic */ void clear(ExtensionList<?, DescriptorProtos.FieldOptions> extensionList) {
            extensionList.getClass();
            clear(extensionList.getExtension());
        }

        public final void clearCtype() {
            this._builder.clearCtype();
        }

        public final void clearDebugRedact() {
            this._builder.clearDebugRedact();
        }

        public final void clearDeprecated() {
            this._builder.clearDeprecated();
        }

        public final /* synthetic */ void clearEditionDefaults(DslList dslList) {
            dslList.getClass();
            this._builder.clearEditionDefaults();
        }

        public final void clearFeatureSupport() {
            this._builder.clearFeatureSupport();
        }

        public final void clearFeatures() {
            this._builder.clearFeatures();
        }

        public final void clearJstype() {
            this._builder.clearJstype();
        }

        public final void clearLazy() {
            this._builder.clearLazy();
        }

        public final void clearPacked() {
            this._builder.clearPacked();
        }

        public final void clearRetention() {
            this._builder.clearRetention();
        }

        public final /* synthetic */ void clearTargets(DslList dslList) {
            dslList.getClass();
            this._builder.clearTargets();
        }

        public final /* synthetic */ void clearUninterpretedOption(DslList dslList) {
            dslList.getClass();
            this._builder.clearUninterpretedOption();
        }

        public final void clearUnverifiedLazy() {
            this._builder.clearUnverifiedLazy();
        }

        public final void clearWeak() {
            this._builder.clearWeak();
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

        public final DescriptorProtos.FieldOptions.CType getCtype() {
            DescriptorProtos.FieldOptions.CType ctype = this._builder.getCtype();
            ctype.getClass();
            return ctype;
        }

        public final boolean getDebugRedact() {
            return this._builder.getDebugRedact();
        }

        public final boolean getDeprecated() {
            return this._builder.getDeprecated();
        }

        public final /* synthetic */ DslList getEditionDefaults() {
            List<DescriptorProtos.FieldOptions.EditionDefault> editionDefaultsList = this._builder.getEditionDefaultsList();
            editionDefaultsList.getClass();
            return new DslList(editionDefaultsList);
        }

        public final DescriptorProtos.FieldOptions.FeatureSupport getFeatureSupport() {
            DescriptorProtos.FieldOptions.FeatureSupport featureSupport = this._builder.getFeatureSupport();
            featureSupport.getClass();
            return featureSupport;
        }

        public final DescriptorProtos.FieldOptions.FeatureSupport getFeatureSupportOrNull(Dsl dsl) {
            dsl.getClass();
            return FieldOptionsKtKt.getFeatureSupportOrNull(dsl._builder);
        }

        public final DescriptorProtos.FeatureSet getFeatures() {
            DescriptorProtos.FeatureSet features = this._builder.getFeatures();
            features.getClass();
            return features;
        }

        public final DescriptorProtos.FeatureSet getFeaturesOrNull(Dsl dsl) {
            dsl.getClass();
            return FieldOptionsKtKt.getFeaturesOrNull(dsl._builder);
        }

        public final DescriptorProtos.FieldOptions.JSType getJstype() {
            DescriptorProtos.FieldOptions.JSType jstype = this._builder.getJstype();
            jstype.getClass();
            return jstype;
        }

        public final boolean getLazy() {
            return this._builder.getLazy();
        }

        public final boolean getPacked() {
            return this._builder.getPacked();
        }

        public final DescriptorProtos.FieldOptions.OptionRetention getRetention() {
            DescriptorProtos.FieldOptions.OptionRetention retention = this._builder.getRetention();
            retention.getClass();
            return retention;
        }

        public final /* synthetic */ DslList getTargets() {
            List<DescriptorProtos.FieldOptions.OptionTargetType> targetsList = this._builder.getTargetsList();
            targetsList.getClass();
            return new DslList(targetsList);
        }

        public final /* synthetic */ DslList getUninterpretedOption() {
            List<DescriptorProtos.UninterpretedOption> uninterpretedOptionList = this._builder.getUninterpretedOptionList();
            uninterpretedOptionList.getClass();
            return new DslList(uninterpretedOptionList);
        }

        public final boolean getUnverifiedLazy() {
            return this._builder.getUnverifiedLazy();
        }

        public final boolean getWeak() {
            return this._builder.getWeak();
        }

        public final boolean hasCtype() {
            return this._builder.hasCtype();
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

        public final boolean hasJstype() {
            return this._builder.hasJstype();
        }

        public final boolean hasLazy() {
            return this._builder.hasLazy();
        }

        public final boolean hasPacked() {
            return this._builder.hasPacked();
        }

        public final boolean hasRetention() {
            return this._builder.hasRetention();
        }

        public final boolean hasUnverifiedLazy() {
            return this._builder.hasUnverifiedLazy();
        }

        public final boolean hasWeak() {
            return this._builder.hasWeak();
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.FieldOptions> extensionList, E e) {
            extensionList.getClass();
            e.getClass();
            add(extensionList, e);
        }

        public final /* synthetic */ void plusAssignAllEditionDefaults(DslList<DescriptorProtos.FieldOptions.EditionDefault, EditionDefaultsProxy> dslList, Iterable<DescriptorProtos.FieldOptions.EditionDefault> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllEditionDefaults(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllTargets(DslList<DescriptorProtos.FieldOptions.OptionTargetType, TargetsProxy> dslList, Iterable<? extends DescriptorProtos.FieldOptions.OptionTargetType> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllTargets(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllUninterpretedOption(DslList<DescriptorProtos.UninterpretedOption, UninterpretedOptionProxy> dslList, Iterable<DescriptorProtos.UninterpretedOption> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllUninterpretedOption(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignEditionDefaults(DslList<DescriptorProtos.FieldOptions.EditionDefault, EditionDefaultsProxy> dslList, DescriptorProtos.FieldOptions.EditionDefault editionDefault) {
            dslList.getClass();
            editionDefault.getClass();
            addEditionDefaults(dslList, editionDefault);
        }

        public final /* synthetic */ void plusAssignTargets(DslList<DescriptorProtos.FieldOptions.OptionTargetType, TargetsProxy> dslList, DescriptorProtos.FieldOptions.OptionTargetType optionTargetType) {
            dslList.getClass();
            optionTargetType.getClass();
            addTargets(dslList, optionTargetType);
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

        public final void setCtype(DescriptorProtos.FieldOptions.CType cType) {
            cType.getClass();
            this._builder.setCtype(cType);
        }

        public final void setDebugRedact(boolean z) {
            this._builder.setDebugRedact(z);
        }

        public final void setDeprecated(boolean z) {
            this._builder.setDeprecated(z);
        }

        public final /* synthetic */ void setEditionDefaults(DslList dslList, int i, DescriptorProtos.FieldOptions.EditionDefault editionDefault) {
            dslList.getClass();
            editionDefault.getClass();
            this._builder.setEditionDefaults(i, editionDefault);
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

        public final void setJstype(DescriptorProtos.FieldOptions.JSType jSType) {
            jSType.getClass();
            this._builder.setJstype(jSType);
        }

        public final void setLazy(boolean z) {
            this._builder.setLazy(z);
        }

        public final void setPacked(boolean z) {
            this._builder.setPacked(z);
        }

        public final void setRetention(DescriptorProtos.FieldOptions.OptionRetention optionRetention) {
            optionRetention.getClass();
            this._builder.setRetention(optionRetention);
        }

        public final /* synthetic */ void setTargets(DslList dslList, int i, DescriptorProtos.FieldOptions.OptionTargetType optionTargetType) {
            dslList.getClass();
            optionTargetType.getClass();
            this._builder.setTargets(i, optionTargetType);
        }

        public final /* synthetic */ void setUninterpretedOption(DslList dslList, int i, DescriptorProtos.UninterpretedOption uninterpretedOption) {
            dslList.getClass();
            uninterpretedOption.getClass();
            this._builder.setUninterpretedOption(i, uninterpretedOption);
        }

        public final void setUnverifiedLazy(boolean z) {
            this._builder.setUnverifiedLazy(z);
        }

        public final void setWeak(boolean z) {
            this._builder.setWeak(z);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FieldOptionsKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FieldOptionsKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.FieldOptions.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.FieldOptions.Builder builder, yx yxVar) {
            this(builder);
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.FieldOptions> extensionList, Iterable<? extends E> iterable) {
            extensionList.getClass();
            iterable.getClass();
            addAll(extensionList, iterable);
        }

        public final /* synthetic */ void clear(ExtensionLite extension) {
            extension.getClass();
            this._builder.clearExtension(extension);
        }

        public final /* synthetic */ void set(ExtensionLite<DescriptorProtos.FieldOptions, ByteString> extension, ByteString value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends MessageLite> void set(ExtensionLite<DescriptorProtos.FieldOptions, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends Comparable<? super T>> void set(ExtensionLite<DescriptorProtos.FieldOptions, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        @f00
        public static /* synthetic */ void getWeak$annotations() {
        }
    }
}
