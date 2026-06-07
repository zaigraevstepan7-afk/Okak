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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/FileDescriptorSetKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class FileDescriptorSetKt {
    public static final FileDescriptorSetKt INSTANCE = new FileDescriptorSetKt();

    private FileDescriptorSetKt() {
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0016J0\u0010\u001d\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010$\u001a\u00028\u0000\"\b\b\u0000\u0010!*\u00020\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\"H\u0086\u0002¢\u0006\u0004\b$\u0010%J@\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(\"\b\b\u0000\u0010&*\u00020\u00012\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'0\"H\u0087\u0002¢\u0006\u0004\b)\u0010*J\"\u0010,\u001a\u00020+2\u0010\u0010#\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\"H\u0086\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010 \u001a\u00020\r2\u0010\u0010#\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\"¢\u0006\u0004\b \u0010.J3\u0010/\u001a\u00020\r\"\b\b\u0000\u0010!*\u00020\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b/\u00100J<\u0010\u001d\u001a\u00020\r\"\u000e\b\u0000\u0010!*\b\u0012\u0004\u0012\u00028\u0000012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u001d\u00102J,\u0010\u001d\u001a\u00020\r2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002030\"2\u0006\u0010\f\u001a\u000203H\u0086\n¢\u0006\u0004\b\u001d\u00104J6\u0010\u001d\u001a\u00020\r\"\b\b\u0000\u0010!*\u0002052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\"2\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u001d\u00106J/\u0010\u0010\u001a\u00020\r\"\b\b\u0000\u0010&*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u00107J2\u0010\u0012\u001a\u00020\r\"\b\b\u0000\u0010&*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(2\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u0012\u00107J5\u0010\u0017\u001a\u00020\r\"\b\b\u0000\u0010&*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0017\u00108J8\u0010\u0012\u001a\u00020\r\"\b\b\u0000\u0010&*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\n¢\u0006\u0004\b\u0012\u00108J:\u0010\u001d\u001a\u00020\r\"\b\b\u0000\u0010&*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060(2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u00109J\u001e\u0010 \u001a\u00020\r*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00060(H\u0086\b¢\u0006\u0004\b \u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u001d\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/google/protobuf/FileDescriptorSetKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$FileDescriptorSet$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$FileDescriptorSet$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$FileDescriptorSet;", "_build", "()Lcom/google/protobuf/DescriptorProtos$FileDescriptorSet;", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;", "Lcom/google/protobuf/FileDescriptorSetKt$Dsl$FileProxy;", "value", "Lod2;", "addFile", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)V", "add", "plusAssignFile", "plusAssign", "", "values", "addAllFile", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllFile", "", "index", "setFile", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$FileDescriptorProto;)V", "set", "clearFile", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "T", "Lcom/google/protobuf/ExtensionLite;", "extension", "get", "(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "E", "", "Lcom/google/protobuf/kotlin/ExtensionList;", "-getRepeatedExtension", "(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/kotlin/ExtensionList;", "", "contains", "(Lcom/google/protobuf/ExtensionLite;)Z", "(Lcom/google/protobuf/ExtensionLite;)V", "setExtension", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V", "", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Comparable;)V", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/ByteString;)V", "Lcom/google/protobuf/MessageLite;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/MessageLite;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Iterable;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;ILjava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;)V", "Lcom/google/protobuf/DescriptorProtos$FileDescriptorSet$Builder;", "getFile", "()Lcom/google/protobuf/kotlin/DslList;", "file", "Companion", "FileProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.FileDescriptorSet.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/FileDescriptorSetKt$Dsl$FileProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class FileProxy extends DslProxy {
            private FileProxy() {
            }
        }

        private Dsl(DescriptorProtos.FileDescriptorSet.Builder builder) {
            this._builder = builder;
        }

        /* renamed from: -getRepeatedExtension, reason: not valid java name */
        public final /* synthetic */ ExtensionList m40getRepeatedExtension(ExtensionLite extension) {
            extension.getClass();
            Object extension2 = this._builder.getExtension(extension);
            extension2.getClass();
            return new ExtensionList(extension, (List) extension2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* synthetic */ DescriptorProtos.FileDescriptorSet _build() {
            MessageType build = this._builder.build();
            build.getClass();
            return (DescriptorProtos.FileDescriptorSet) build;
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

        public final /* synthetic */ void addAllFile(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllFile(iterable);
        }

        public final /* synthetic */ void addFile(DslList dslList, DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
            dslList.getClass();
            fileDescriptorProto.getClass();
            this._builder.addFile(fileDescriptorProto);
        }

        public final /* synthetic */ void clear(ExtensionList<?, DescriptorProtos.FileDescriptorSet> extensionList) {
            extensionList.getClass();
            clear(extensionList.getExtension());
        }

        public final /* synthetic */ void clearFile(DslList dslList) {
            dslList.getClass();
            this._builder.clearFile();
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

        public final /* synthetic */ DslList getFile() {
            List<DescriptorProtos.FileDescriptorProto> fileList = this._builder.getFileList();
            fileList.getClass();
            return new DslList(fileList);
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.FileDescriptorSet> extensionList, E e) {
            extensionList.getClass();
            e.getClass();
            add(extensionList, e);
        }

        public final /* synthetic */ void plusAssignAllFile(DslList<DescriptorProtos.FileDescriptorProto, FileProxy> dslList, Iterable<DescriptorProtos.FileDescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllFile(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignFile(DslList<DescriptorProtos.FileDescriptorProto, FileProxy> dslList, DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
            dslList.getClass();
            fileDescriptorProto.getClass();
            addFile(dslList, fileDescriptorProto);
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

        public final /* synthetic */ void setFile(DslList dslList, int i, DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
            dslList.getClass();
            fileDescriptorProto.getClass();
            this._builder.setFile(i, fileDescriptorProto);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FileDescriptorSetKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FileDescriptorSetKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$FileDescriptorSet$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.FileDescriptorSet.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.FileDescriptorSet.Builder builder, yx yxVar) {
            this(builder);
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.FileDescriptorSet> extensionList, Iterable<? extends E> iterable) {
            extensionList.getClass();
            iterable.getClass();
            addAll(extensionList, iterable);
        }

        public final /* synthetic */ void clear(ExtensionLite extension) {
            extension.getClass();
            this._builder.clearExtension(extension);
        }

        public final /* synthetic */ void set(ExtensionLite<DescriptorProtos.FileDescriptorSet, ByteString> extension, ByteString value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends MessageLite> void set(ExtensionLite<DescriptorProtos.FileDescriptorSet, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends Comparable<? super T>> void set(ExtensionLite<DescriptorProtos.FileDescriptorSet, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }
    }
}
