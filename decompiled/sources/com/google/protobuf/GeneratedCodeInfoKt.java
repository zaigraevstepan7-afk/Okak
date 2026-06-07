package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import defpackage.oe0;
import defpackage.yq1;
import defpackage.yx;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Lcom/google/protobuf/GeneratedCodeInfoKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/google/protobuf/GeneratedCodeInfoKt$AnnotationKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation;", "-initializeannotation", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation;", "annotation", "AnnotationKt", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class GeneratedCodeInfoKt {
    public static final GeneratedCodeInfoKt INSTANCE = new GeneratedCodeInfoKt();

    private GeneratedCodeInfoKt() {
    }

    /* renamed from: -initializeannotation, reason: not valid java name */
    public final DescriptorProtos.GeneratedCodeInfo.Annotation m45initializeannotation(oe0 block) {
        block.getClass();
        AnnotationKt.Dsl.Companion companion = AnnotationKt.Dsl.INSTANCE;
        DescriptorProtos.GeneratedCodeInfo.Annotation.Builder newBuilder = DescriptorProtos.GeneratedCodeInfo.Annotation.newBuilder();
        newBuilder.getClass();
        AnnotationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/GeneratedCodeInfoKt$AnnotationKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class AnnotationKt {
        public static final AnnotationKt INSTANCE = new AnnotationKt();

        private AnnotationKt() {
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002CDB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0016J0\u0010\u001c\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\r¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\r¢\u0006\u0004\b%\u0010!J\r\u0010&\u001a\u00020\"¢\u0006\u0004\b&\u0010$J\r\u0010'\u001a\u00020\r¢\u0006\u0004\b'\u0010!J\r\u0010(\u001a\u00020\"¢\u0006\u0004\b(\u0010$J\r\u0010)\u001a\u00020\r¢\u0006\u0004\b)\u0010!J\r\u0010*\u001a\u00020\"¢\u0006\u0004\b*\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001d\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F¢\u0006\u0006\u001a\u0004\b,\u0010-R$\u00104\u001a\u00020/2\u0006\u0010\f\u001a\u00020/8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00109\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010<\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u00106\"\u0004\b;\u00108R$\u0010B\u001a\u00020=2\u0006\u0010\f\u001a\u00020=8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/google/protobuf/GeneratedCodeInfoKt$AnnotationKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation;", "_build", "()Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation;", "Lcom/google/protobuf/kotlin/DslList;", "", "Lcom/google/protobuf/GeneratedCodeInfoKt$AnnotationKt$Dsl$PathProxy;", "value", "Lod2;", "addPath", "(Lcom/google/protobuf/kotlin/DslList;I)V", "add", "plusAssignPath", "plusAssign", "", "values", "addAllPath", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllPath", "index", "setPath", "(Lcom/google/protobuf/kotlin/DslList;II)V", "set", "clearPath", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearSourceFile", "()V", "", "hasSourceFile", "()Z", "clearBegin", "hasBegin", "clearEnd", "hasEnd", "clearSemantic", "hasSemantic", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation$Builder;", "getPath", "()Lcom/google/protobuf/kotlin/DslList;", "path", "", "getSourceFile", "()Ljava/lang/String;", "setSourceFile", "(Ljava/lang/String;)V", "sourceFile", "getBegin", "()I", "setBegin", "(I)V", "begin", "getEnd", "setEnd", "end", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation$Semantic;", "getSemantic", "()Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation$Semantic;", "setSemantic", "(Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation$Semantic;)V", "semantic", "Companion", "PathProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DescriptorProtos.GeneratedCodeInfo.Annotation.Builder _builder;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/GeneratedCodeInfoKt$AnnotationKt$Dsl$PathProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class PathProxy extends DslProxy {
                private PathProxy() {
                }
            }

            private Dsl(DescriptorProtos.GeneratedCodeInfo.Annotation.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ DescriptorProtos.GeneratedCodeInfo.Annotation _build() {
                DescriptorProtos.GeneratedCodeInfo.Annotation build = this._builder.build();
                build.getClass();
                return build;
            }

            public final /* synthetic */ void addAllPath(DslList dslList, Iterable iterable) {
                dslList.getClass();
                iterable.getClass();
                this._builder.addAllPath(iterable);
            }

            public final /* synthetic */ void addPath(DslList dslList, int i) {
                dslList.getClass();
                this._builder.addPath(i);
            }

            public final void clearBegin() {
                this._builder.clearBegin();
            }

            public final void clearEnd() {
                this._builder.clearEnd();
            }

            public final /* synthetic */ void clearPath(DslList dslList) {
                dslList.getClass();
                this._builder.clearPath();
            }

            public final void clearSemantic() {
                this._builder.clearSemantic();
            }

            public final void clearSourceFile() {
                this._builder.clearSourceFile();
            }

            public final int getBegin() {
                return this._builder.getBegin();
            }

            public final int getEnd() {
                return this._builder.getEnd();
            }

            public final /* synthetic */ DslList getPath() {
                List<Integer> pathList = this._builder.getPathList();
                pathList.getClass();
                return new DslList(pathList);
            }

            public final DescriptorProtos.GeneratedCodeInfo.Annotation.Semantic getSemantic() {
                DescriptorProtos.GeneratedCodeInfo.Annotation.Semantic semantic = this._builder.getSemantic();
                semantic.getClass();
                return semantic;
            }

            public final String getSourceFile() {
                String sourceFile = this._builder.getSourceFile();
                sourceFile.getClass();
                return sourceFile;
            }

            public final boolean hasBegin() {
                return this._builder.hasBegin();
            }

            public final boolean hasEnd() {
                return this._builder.hasEnd();
            }

            public final boolean hasSemantic() {
                return this._builder.hasSemantic();
            }

            public final boolean hasSourceFile() {
                return this._builder.hasSourceFile();
            }

            public final /* synthetic */ void plusAssignAllPath(DslList<Integer, PathProxy> dslList, Iterable<Integer> iterable) {
                dslList.getClass();
                iterable.getClass();
                addAllPath(dslList, iterable);
            }

            public final /* synthetic */ void plusAssignPath(DslList<Integer, PathProxy> dslList, int i) {
                dslList.getClass();
                addPath(dslList, i);
            }

            public final void setBegin(int i) {
                this._builder.setBegin(i);
            }

            public final void setEnd(int i) {
                this._builder.setEnd(i);
            }

            public final /* synthetic */ void setPath(DslList dslList, int i, int i2) {
                dslList.getClass();
                this._builder.setPath(i, i2);
            }

            public final void setSemantic(DescriptorProtos.GeneratedCodeInfo.Annotation.Semantic semantic) {
                semantic.getClass();
                this._builder.setSemantic(semantic);
            }

            public final void setSourceFile(String str) {
                str.getClass();
                this._builder.setSourceFile(str);
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/GeneratedCodeInfoKt$AnnotationKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/GeneratedCodeInfoKt$AnnotationKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class Companion {
                public /* synthetic */ Companion(yx yxVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DescriptorProtos.GeneratedCodeInfo.Annotation.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DescriptorProtos.GeneratedCodeInfo.Annotation.Builder builder, yx yxVar) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0016J0\u0010\u001d\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/google/protobuf/GeneratedCodeInfoKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo;", "_build", "()Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo;", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation;", "Lcom/google/protobuf/GeneratedCodeInfoKt$Dsl$AnnotationProxy;", "value", "Lod2;", "addAnnotation", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation;)V", "add", "plusAssignAnnotation", "plusAssign", "", "values", "addAllAnnotation", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllAnnotation", "", "index", "setAnnotation", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation;)V", "set", "clearAnnotation", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Builder;", "getAnnotation", "()Lcom/google/protobuf/kotlin/DslList;", "annotation", "Companion", "AnnotationProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.GeneratedCodeInfo.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/GeneratedCodeInfoKt$Dsl$AnnotationProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class AnnotationProxy extends DslProxy {
            private AnnotationProxy() {
            }
        }

        private Dsl(DescriptorProtos.GeneratedCodeInfo.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DescriptorProtos.GeneratedCodeInfo _build() {
            DescriptorProtos.GeneratedCodeInfo build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllAnnotation(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllAnnotation(iterable);
        }

        public final /* synthetic */ void addAnnotation(DslList dslList, DescriptorProtos.GeneratedCodeInfo.Annotation annotation) {
            dslList.getClass();
            annotation.getClass();
            this._builder.addAnnotation(annotation);
        }

        public final /* synthetic */ void clearAnnotation(DslList dslList) {
            dslList.getClass();
            this._builder.clearAnnotation();
        }

        public final /* synthetic */ DslList getAnnotation() {
            List<DescriptorProtos.GeneratedCodeInfo.Annotation> annotationList = this._builder.getAnnotationList();
            annotationList.getClass();
            return new DslList(annotationList);
        }

        public final /* synthetic */ void plusAssignAllAnnotation(DslList<DescriptorProtos.GeneratedCodeInfo.Annotation, AnnotationProxy> dslList, Iterable<DescriptorProtos.GeneratedCodeInfo.Annotation> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllAnnotation(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAnnotation(DslList<DescriptorProtos.GeneratedCodeInfo.Annotation, AnnotationProxy> dslList, DescriptorProtos.GeneratedCodeInfo.Annotation annotation) {
            dslList.getClass();
            annotation.getClass();
            addAnnotation(dslList, annotation);
        }

        public final /* synthetic */ void setAnnotation(DslList dslList, int i, DescriptorProtos.GeneratedCodeInfo.Annotation annotation) {
            dslList.getClass();
            annotation.getClass();
            this._builder.setAnnotation(i, annotation);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/GeneratedCodeInfoKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/GeneratedCodeInfoKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.GeneratedCodeInfo.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.GeneratedCodeInfo.Builder builder, yx yxVar) {
            this(builder);
        }
    }
}
