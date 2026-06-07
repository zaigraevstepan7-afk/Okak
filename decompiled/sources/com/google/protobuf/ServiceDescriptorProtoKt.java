package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import defpackage.yq1;
import defpackage.yx;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ServiceDescriptorProtoKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ServiceDescriptorProtoKt {
    public static final ServiceDescriptorProtoKt INSTANCE = new ServiceDescriptorProtoKt();

    private ServiceDescriptorProtoKt() {
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0016\u0010\u0014J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0087\n¢\u0006\u0004\b\u001d\u0010\u001bJ0\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u000bJ\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R$\u0010.\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001d\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8F¢\u0006\u0006\u001a\u0004\b/\u00100R$\u00107\u001a\u0002022\u0006\u0010\u0012\u001a\u0002028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u0010:\u001a\u0004\u0018\u000102*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/google/protobuf/ServiceDescriptorProtoKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;", "_build", "()Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto;", "Lod2;", "clearName", "()V", "", "hasName", "()Z", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;", "Lcom/google/protobuf/ServiceDescriptorProtoKt$Dsl$MethodProxy;", "value", "addMethod", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)V", "add", "plusAssignMethod", "plusAssign", "", "values", "addAllMethod", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllMethod", "", "index", "setMethod", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;)V", "set", "clearMethod", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "clearOptions", "hasOptions", "Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$Builder;", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getMethod", "()Lcom/google/protobuf/kotlin/DslList;", "method", "Lcom/google/protobuf/DescriptorProtos$ServiceOptions;", "getOptions", "()Lcom/google/protobuf/DescriptorProtos$ServiceOptions;", "setOptions", "(Lcom/google/protobuf/DescriptorProtos$ServiceOptions;)V", "options", "getOptionsOrNull", "(Lcom/google/protobuf/ServiceDescriptorProtoKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$ServiceOptions;", "optionsOrNull", "Companion", "MethodProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.ServiceDescriptorProto.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ServiceDescriptorProtoKt$Dsl$MethodProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class MethodProxy extends DslProxy {
            private MethodProxy() {
            }
        }

        private Dsl(DescriptorProtos.ServiceDescriptorProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DescriptorProtos.ServiceDescriptorProto _build() {
            DescriptorProtos.ServiceDescriptorProto build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllMethod(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllMethod(iterable);
        }

        public final /* synthetic */ void addMethod(DslList dslList, DescriptorProtos.MethodDescriptorProto methodDescriptorProto) {
            dslList.getClass();
            methodDescriptorProto.getClass();
            this._builder.addMethod(methodDescriptorProto);
        }

        public final /* synthetic */ void clearMethod(DslList dslList) {
            dslList.getClass();
            this._builder.clearMethod();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearOptions() {
            this._builder.clearOptions();
        }

        public final /* synthetic */ DslList getMethod() {
            List<DescriptorProtos.MethodDescriptorProto> methodList = this._builder.getMethodList();
            methodList.getClass();
            return new DslList(methodList);
        }

        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        public final DescriptorProtos.ServiceOptions getOptions() {
            DescriptorProtos.ServiceOptions options = this._builder.getOptions();
            options.getClass();
            return options;
        }

        public final DescriptorProtos.ServiceOptions getOptionsOrNull(Dsl dsl) {
            dsl.getClass();
            return ServiceDescriptorProtoKtKt.getOptionsOrNull(dsl._builder);
        }

        public final boolean hasName() {
            return this._builder.hasName();
        }

        public final boolean hasOptions() {
            return this._builder.hasOptions();
        }

        public final /* synthetic */ void plusAssignAllMethod(DslList<DescriptorProtos.MethodDescriptorProto, MethodProxy> dslList, Iterable<DescriptorProtos.MethodDescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllMethod(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignMethod(DslList<DescriptorProtos.MethodDescriptorProto, MethodProxy> dslList, DescriptorProtos.MethodDescriptorProto methodDescriptorProto) {
            dslList.getClass();
            methodDescriptorProto.getClass();
            addMethod(dslList, methodDescriptorProto);
        }

        public final /* synthetic */ void setMethod(DslList dslList, int i, DescriptorProtos.MethodDescriptorProto methodDescriptorProto) {
            dslList.getClass();
            methodDescriptorProto.getClass();
            this._builder.setMethod(i, methodDescriptorProto);
        }

        public final void setName(String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public final void setOptions(DescriptorProtos.ServiceOptions serviceOptions) {
            serviceOptions.getClass();
            this._builder.setOptions(serviceOptions);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/ServiceDescriptorProtoKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/ServiceDescriptorProtoKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$ServiceDescriptorProto$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.ServiceDescriptorProto.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.ServiceDescriptorProto.Builder builder, yx yxVar) {
            this(builder);
        }
    }
}
