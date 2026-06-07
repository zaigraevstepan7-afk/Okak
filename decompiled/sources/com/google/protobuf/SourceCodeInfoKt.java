package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ExtensionList;
import defpackage.oe0;
import defpackage.yq1;
import defpackage.yx;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Lcom/google/protobuf/SourceCodeInfoKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/google/protobuf/SourceCodeInfoKt$LocationKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location;", "-initializelocation", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location;", "location", "Dsl", "LocationKt", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class SourceCodeInfoKt {
    public static final SourceCodeInfoKt INSTANCE = new SourceCodeInfoKt();

    private SourceCodeInfoKt() {
    }

    /* renamed from: -initializelocation, reason: not valid java name */
    public final DescriptorProtos.SourceCodeInfo.Location m66initializelocation(oe0 block) {
        block.getClass();
        LocationKt.Dsl.Companion companion = LocationKt.Dsl.INSTANCE;
        DescriptorProtos.SourceCodeInfo.Location.Builder newBuilder = DescriptorProtos.SourceCodeInfo.Location.newBuilder();
        newBuilder.getClass();
        LocationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/SourceCodeInfoKt$LocationKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class LocationKt {
        public static final LocationKt INSTANCE = new LocationKt();

        private LocationKt() {
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 G2\u00020\u0001:\u0004GHIJB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0016J0\u0010\u001c\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b!\u0010\u000fJ(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t2\u0006\u0010\f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\"\u0010\u000fJ-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b#\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0087\n¢\u0006\u0004\b$\u0010\u0016J0\u0010\u001c\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b%\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\tH\u0007¢\u0006\u0004\b&\u0010\u001eJ\r\u0010'\u001a\u00020\r¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\r¢\u0006\u0004\b,\u0010(J\r\u0010-\u001a\u00020)¢\u0006\u0004\b-\u0010+J'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\t2\u0006\u0010\f\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\t2\u0006\u0010\f\u001a\u00020.H\u0087\n¢\u0006\u0004\b2\u00101J-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020.0\u0013H\u0007¢\u0006\u0004\b3\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020.0\u0013H\u0087\n¢\u0006\u0004\b4\u0010\u0016J0\u0010\u001c\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\t2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\f\u001a\u00020.H\u0087\u0002¢\u0006\u0004\b5\u00106J\u001f\u0010\u001f\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\tH\u0007¢\u0006\u0004\b5\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u001d\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F¢\u0006\u0006\u001a\u0004\b8\u00109R\u001d\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0\t8F¢\u0006\u0006\u001a\u0004\b;\u00109R$\u0010A\u001a\u00020.2\u0006\u0010\f\u001a\u00020.8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010D\u001a\u00020.2\u0006\u0010\f\u001a\u00020.8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R\u001d\u0010F\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0\t8F¢\u0006\u0006\u001a\u0004\bE\u00109¨\u0006K"}, d2 = {"Lcom/google/protobuf/SourceCodeInfoKt$LocationKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location;", "_build", "()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location;", "Lcom/google/protobuf/kotlin/DslList;", "", "Lcom/google/protobuf/SourceCodeInfoKt$LocationKt$Dsl$PathProxy;", "value", "Lod2;", "addPath", "(Lcom/google/protobuf/kotlin/DslList;I)V", "add", "plusAssignPath", "plusAssign", "", "values", "addAllPath", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllPath", "index", "setPath", "(Lcom/google/protobuf/kotlin/DslList;II)V", "set", "clearPath", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/google/protobuf/SourceCodeInfoKt$LocationKt$Dsl$SpanProxy;", "addSpan", "plusAssignSpan", "addAllSpan", "plusAssignAllSpan", "setSpan", "clearSpan", "clearLeadingComments", "()V", "", "hasLeadingComments", "()Z", "clearTrailingComments", "hasTrailingComments", "", "Lcom/google/protobuf/SourceCodeInfoKt$LocationKt$Dsl$LeadingDetachedCommentsProxy;", "addLeadingDetachedComments", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "plusAssignLeadingDetachedComments", "addAllLeadingDetachedComments", "plusAssignAllLeadingDetachedComments", "setLeadingDetachedComments", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location$Builder;", "getPath", "()Lcom/google/protobuf/kotlin/DslList;", "path", "getSpan", "span", "getLeadingComments", "()Ljava/lang/String;", "setLeadingComments", "(Ljava/lang/String;)V", "leadingComments", "getTrailingComments", "setTrailingComments", "trailingComments", "getLeadingDetachedComments", "leadingDetachedComments", "Companion", "LeadingDetachedCommentsProxy", "PathProxy", "SpanProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DescriptorProtos.SourceCodeInfo.Location.Builder _builder;

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/SourceCodeInfoKt$LocationKt$Dsl$LeadingDetachedCommentsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class LeadingDetachedCommentsProxy extends DslProxy {
                private LeadingDetachedCommentsProxy() {
                }
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/SourceCodeInfoKt$LocationKt$Dsl$PathProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class PathProxy extends DslProxy {
                private PathProxy() {
                }
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/SourceCodeInfoKt$LocationKt$Dsl$SpanProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class SpanProxy extends DslProxy {
                private SpanProxy() {
                }
            }

            private Dsl(DescriptorProtos.SourceCodeInfo.Location.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ DescriptorProtos.SourceCodeInfo.Location _build() {
                DescriptorProtos.SourceCodeInfo.Location build = this._builder.build();
                build.getClass();
                return build;
            }

            public final /* synthetic */ void addAllLeadingDetachedComments(DslList dslList, Iterable iterable) {
                dslList.getClass();
                iterable.getClass();
                this._builder.addAllLeadingDetachedComments(iterable);
            }

            public final /* synthetic */ void addAllPath(DslList dslList, Iterable iterable) {
                dslList.getClass();
                iterable.getClass();
                this._builder.addAllPath(iterable);
            }

            public final /* synthetic */ void addAllSpan(DslList dslList, Iterable iterable) {
                dslList.getClass();
                iterable.getClass();
                this._builder.addAllSpan(iterable);
            }

            public final /* synthetic */ void addLeadingDetachedComments(DslList dslList, String str) {
                dslList.getClass();
                str.getClass();
                this._builder.addLeadingDetachedComments(str);
            }

            public final /* synthetic */ void addPath(DslList dslList, int i) {
                dslList.getClass();
                this._builder.addPath(i);
            }

            public final /* synthetic */ void addSpan(DslList dslList, int i) {
                dslList.getClass();
                this._builder.addSpan(i);
            }

            public final void clearLeadingComments() {
                this._builder.clearLeadingComments();
            }

            public final /* synthetic */ void clearPath(DslList dslList) {
                dslList.getClass();
                this._builder.clearPath();
            }

            public final /* synthetic */ void clearSpan(DslList dslList) {
                dslList.getClass();
                this._builder.clearSpan();
            }

            public final void clearTrailingComments() {
                this._builder.clearTrailingComments();
            }

            public final String getLeadingComments() {
                String leadingComments = this._builder.getLeadingComments();
                leadingComments.getClass();
                return leadingComments;
            }

            public final DslList<String, LeadingDetachedCommentsProxy> getLeadingDetachedComments() {
                List<String> leadingDetachedCommentsList = this._builder.getLeadingDetachedCommentsList();
                leadingDetachedCommentsList.getClass();
                return new DslList<>(leadingDetachedCommentsList);
            }

            public final /* synthetic */ DslList getPath() {
                List<Integer> pathList = this._builder.getPathList();
                pathList.getClass();
                return new DslList(pathList);
            }

            public final /* synthetic */ DslList getSpan() {
                List<Integer> spanList = this._builder.getSpanList();
                spanList.getClass();
                return new DslList(spanList);
            }

            public final String getTrailingComments() {
                String trailingComments = this._builder.getTrailingComments();
                trailingComments.getClass();
                return trailingComments;
            }

            public final boolean hasLeadingComments() {
                return this._builder.hasLeadingComments();
            }

            public final boolean hasTrailingComments() {
                return this._builder.hasTrailingComments();
            }

            public final /* synthetic */ void plusAssignAllLeadingDetachedComments(DslList<String, LeadingDetachedCommentsProxy> dslList, Iterable<String> iterable) {
                dslList.getClass();
                iterable.getClass();
                addAllLeadingDetachedComments(dslList, iterable);
            }

            public final /* synthetic */ void plusAssignAllPath(DslList<Integer, PathProxy> dslList, Iterable<Integer> iterable) {
                dslList.getClass();
                iterable.getClass();
                addAllPath(dslList, iterable);
            }

            public final /* synthetic */ void plusAssignAllSpan(DslList<Integer, SpanProxy> dslList, Iterable<Integer> iterable) {
                dslList.getClass();
                iterable.getClass();
                addAllSpan(dslList, iterable);
            }

            public final /* synthetic */ void plusAssignLeadingDetachedComments(DslList<String, LeadingDetachedCommentsProxy> dslList, String str) {
                dslList.getClass();
                str.getClass();
                addLeadingDetachedComments(dslList, str);
            }

            public final /* synthetic */ void plusAssignPath(DslList<Integer, PathProxy> dslList, int i) {
                dslList.getClass();
                addPath(dslList, i);
            }

            public final /* synthetic */ void plusAssignSpan(DslList<Integer, SpanProxy> dslList, int i) {
                dslList.getClass();
                addSpan(dslList, i);
            }

            public final void setLeadingComments(String str) {
                str.getClass();
                this._builder.setLeadingComments(str);
            }

            public final /* synthetic */ void setLeadingDetachedComments(DslList dslList, int i, String str) {
                dslList.getClass();
                str.getClass();
                this._builder.setLeadingDetachedComments(i, str);
            }

            public final /* synthetic */ void setPath(DslList dslList, int i, int i2) {
                dslList.getClass();
                this._builder.setPath(i, i2);
            }

            public final /* synthetic */ void setSpan(DslList dslList, int i, int i2) {
                dslList.getClass();
                this._builder.setSpan(i, i2);
            }

            public final void setTrailingComments(String str) {
                str.getClass();
                this._builder.setTrailingComments(str);
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/SourceCodeInfoKt$LocationKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/SourceCodeInfoKt$LocationKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class Companion {
                public /* synthetic */ Companion(yx yxVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DescriptorProtos.SourceCodeInfo.Location.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DescriptorProtos.SourceCodeInfo.Location.Builder builder, yx yxVar) {
                this(builder);
            }

            public final /* synthetic */ void setLeadingDetachedComments(DslList dslList) {
                dslList.getClass();
                this._builder.clearLeadingDetachedComments();
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0016J0\u0010\u001d\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010$\u001a\u00028\u0000\"\b\b\u0000\u0010!*\u00020\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\"H\u0086\u0002¢\u0006\u0004\b$\u0010%J@\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(\"\b\b\u0000\u0010&*\u00020\u00012\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'0\"H\u0087\u0002¢\u0006\u0004\b)\u0010*J\"\u0010,\u001a\u00020+2\u0010\u0010#\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\"H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010 \u001a\u00020\r2\u0010\u0010#\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\"¢\u0006\u0004\b \u0010.J3\u0010/\u001a\u00020\r\"\b\b\u0000\u0010!*\u00020\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b/\u00100J<\u0010\u001d\u001a\u00020\r\"\u000e\b\u0000\u0010!*\b\u0012\u0004\u0012\u00028\u0000012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u001d\u00102J,\u0010\u001d\u001a\u00020\r2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002030\"2\u0006\u0010\f\u001a\u000203H\u0086\n¢\u0006\u0004\b\u001d\u00104J6\u0010\u001d\u001a\u00020\r\"\b\b\u0000\u0010!*\u0002052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u001d\u00106J/\u0010\u0010\u001a\u00020\r\"\b\b\u0000\u0010&*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u00107J2\u0010\u0012\u001a\u00020\r\"\b\b\u0000\u0010&*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(2\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u0012\u00107J5\u0010\u0017\u001a\u00020\r\"\b\b\u0000\u0010&*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0017\u00108J8\u0010\u0012\u001a\u00020\r\"\b\b\u0000\u0010&*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\n¢\u0006\u0004\b\u0012\u00108J:\u0010\u001d\u001a\u00020\r\"\b\b\u0000\u0010&*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u00109J\u001e\u0010 \u001a\u00020\r*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00060(H\u0086\b¢\u0006\u0004\b \u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u001d\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/google/protobuf/SourceCodeInfoKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;", "_build", "()Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo;", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location;", "Lcom/google/protobuf/SourceCodeInfoKt$Dsl$LocationProxy;", "value", "Lod2;", "addLocation", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location;)V", "add", "plusAssignLocation", "plusAssign", "", "values", "addAllLocation", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllLocation", "", "index", "setLocation", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Location;)V", "set", "clearLocation", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "T", "Lcom/google/protobuf/ExtensionLite;", "extension", "get", "(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "E", "", "Lcom/google/protobuf/kotlin/ExtensionList;", "-getRepeatedExtension", "(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/kotlin/ExtensionList;", "", "contains", "(Lcom/google/protobuf/ExtensionLite;)Z", "(Lcom/google/protobuf/ExtensionLite;)V", "setExtension", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V", "", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Comparable;)V", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/ByteString;)V", "Lcom/google/protobuf/MessageLite;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/MessageLite;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Iterable;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;ILjava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;)V", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Builder;", "getLocation", "()Lcom/google/protobuf/kotlin/DslList;", "location", "Companion", "LocationProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.SourceCodeInfo.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/SourceCodeInfoKt$Dsl$LocationProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class LocationProxy extends DslProxy {
            private LocationProxy() {
            }
        }

        private Dsl(DescriptorProtos.SourceCodeInfo.Builder builder) {
            this._builder = builder;
        }

        /* renamed from: -getRepeatedExtension, reason: not valid java name */
        public final /* synthetic */ ExtensionList m67getRepeatedExtension(ExtensionLite extension) {
            extension.getClass();
            Object extension2 = this._builder.getExtension(extension);
            extension2.getClass();
            return new ExtensionList(extension, (List) extension2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* synthetic */ DescriptorProtos.SourceCodeInfo _build() {
            MessageType build = this._builder.build();
            build.getClass();
            return (DescriptorProtos.SourceCodeInfo) build;
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

        public final /* synthetic */ void addAllLocation(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllLocation(iterable);
        }

        public final /* synthetic */ void addLocation(DslList dslList, DescriptorProtos.SourceCodeInfo.Location location) {
            dslList.getClass();
            location.getClass();
            this._builder.addLocation(location);
        }

        public final /* synthetic */ void clear(ExtensionList<?, DescriptorProtos.SourceCodeInfo> extensionList) {
            extensionList.getClass();
            clear(extensionList.getExtension());
        }

        public final /* synthetic */ void clearLocation(DslList dslList) {
            dslList.getClass();
            this._builder.clearLocation();
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

        public final /* synthetic */ DslList getLocation() {
            List<DescriptorProtos.SourceCodeInfo.Location> locationList = this._builder.getLocationList();
            locationList.getClass();
            return new DslList(locationList);
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.SourceCodeInfo> extensionList, E e) {
            extensionList.getClass();
            e.getClass();
            add(extensionList, e);
        }

        public final /* synthetic */ void plusAssignAllLocation(DslList<DescriptorProtos.SourceCodeInfo.Location, LocationProxy> dslList, Iterable<DescriptorProtos.SourceCodeInfo.Location> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllLocation(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignLocation(DslList<DescriptorProtos.SourceCodeInfo.Location, LocationProxy> dslList, DescriptorProtos.SourceCodeInfo.Location location) {
            dslList.getClass();
            location.getClass();
            addLocation(dslList, location);
        }

        public final /* synthetic */ void set(ExtensionList extensionList, int i, Object obj) {
            extensionList.getClass();
            obj.getClass();
            this._builder.setExtension(extensionList.getExtension(), i, obj);
        }

        public final /* synthetic */ void setExtension(ExtensionLite extension, Object value) {
            extension.getClass();
            value.getClass();
            this._builder.setExtension(extension, value);
        }

        public final /* synthetic */ void setLocation(DslList dslList, int i, DescriptorProtos.SourceCodeInfo.Location location) {
            dslList.getClass();
            location.getClass();
            this._builder.setLocation(i, location);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/SourceCodeInfoKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/SourceCodeInfoKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$SourceCodeInfo$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.SourceCodeInfo.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.SourceCodeInfo.Builder builder, yx yxVar) {
            this(builder);
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.SourceCodeInfo> extensionList, Iterable<? extends E> iterable) {
            extensionList.getClass();
            iterable.getClass();
            addAll(extensionList, iterable);
        }

        public final /* synthetic */ void clear(ExtensionLite extension) {
            extension.getClass();
            this._builder.clearExtension(extension);
        }

        public final /* synthetic */ void set(ExtensionLite<DescriptorProtos.SourceCodeInfo, ByteString> extension, ByteString value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends MessageLite> void set(ExtensionLite<DescriptorProtos.SourceCodeInfo, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends Comparable<? super T>> void set(ExtensionLite<DescriptorProtos.SourceCodeInfo, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }
    }
}
