package com.google.protobuf;

import com.google.protobuf.Type;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import defpackage.yq1;
import defpackage.yx;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/TypeKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class TypeKt {
    public static final TypeKt INSTANCE = new TypeKt();

    private TypeKt() {
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 `2\u00020\u0001:\u0004`abcB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0087\n¢\u0006\u0004\b\u001a\u0010\u0018J0\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\rH\u0087\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b \u0010!J'\u0010\u0012\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u000f\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J(\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u000f\u001a\u00020#H\u0087\n¢\u0006\u0004\b'\u0010&J-\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020#0\u0015H\u0007¢\u0006\u0004\b(\u0010\u0018J.\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020#0\u0015H\u0087\n¢\u0006\u0004\b)\u0010\u0018J0\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\fH\u0007¢\u0006\u0004\b*\u0010!J'\u0010\u0012\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\f2\u0006\u0010\u000f\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/J(\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\f2\u0006\u0010\u000f\u001a\u00020,H\u0087\n¢\u0006\u0004\b0\u0010/J-\u0010\u0019\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020,0\u0015H\u0007¢\u0006\u0004\b1\u0010\u0018J.\u0010\u0014\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020,0\u0015H\u0087\n¢\u0006\u0004\b2\u0010\u0018J0\u0010\u001f\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020,H\u0087\u0002¢\u0006\u0004\b3\u00104J\u001f\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\fH\u0007¢\u0006\u0004\b5\u0010!J\r\u00106\u001a\u00020\t¢\u0006\u0004\b6\u0010\u000bJ\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\t¢\u0006\u0004\b:\u0010\u000bJ\r\u0010;\u001a\u00020\t¢\u0006\u0004\b;\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<R$\u0010A\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001d\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001d\u0010F\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\f8F¢\u0006\u0006\u001a\u0004\bE\u0010CR\u001d\u0010H\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\f8F¢\u0006\u0006\u001a\u0004\bG\u0010CR$\u0010N\u001a\u00020I2\u0006\u0010\u000f\u001a\u00020I8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0017\u0010Q\u001a\u0004\u0018\u00010I*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bO\u0010PR$\u0010W\u001a\u00020R2\u0006\u0010\u000f\u001a\u00020R8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\\\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010_\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020#8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010>\"\u0004\b^\u0010@¨\u0006d"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl;", "", "Lcom/google/protobuf/Type$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/Type$Builder;)V", "Lcom/google/protobuf/Type;", "_build", "()Lcom/google/protobuf/Type;", "Lod2;", "clearName", "()V", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/Field;", "Lcom/google/protobuf/TypeKt$Dsl$FieldsProxy;", "value", "addFields", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Field;)V", "add", "plusAssignFields", "plusAssign", "", "values", "addAllFields", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllFields", "", "index", "setFields", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Field;)V", "set", "clearFields", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "", "Lcom/google/protobuf/TypeKt$Dsl$OneofsProxy;", "addOneofs", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "plusAssignOneofs", "addAllOneofs", "plusAssignAllOneofs", "setOneofs", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "Lcom/google/protobuf/Option;", "Lcom/google/protobuf/TypeKt$Dsl$OptionsProxy;", "addOptions", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/Option;)V", "plusAssignOptions", "addAllOptions", "plusAssignAllOptions", "setOptions", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/Option;)V", "clearOptions", "clearSourceContext", "", "hasSourceContext", "()Z", "clearSyntax", "clearEdition", "Lcom/google/protobuf/Type$Builder;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getFields", "()Lcom/google/protobuf/kotlin/DslList;", "fields", "getOneofs", "oneofs", "getOptions", "options", "Lcom/google/protobuf/SourceContext;", "getSourceContext", "()Lcom/google/protobuf/SourceContext;", "setSourceContext", "(Lcom/google/protobuf/SourceContext;)V", "sourceContext", "getSourceContextOrNull", "(Lcom/google/protobuf/TypeKt$Dsl;)Lcom/google/protobuf/SourceContext;", "sourceContextOrNull", "Lcom/google/protobuf/Syntax;", "getSyntax", "()Lcom/google/protobuf/Syntax;", "setSyntax", "(Lcom/google/protobuf/Syntax;)V", "syntax", "getSyntaxValue", "()I", "setSyntaxValue", "(I)V", "syntaxValue", "getEdition", "setEdition", "edition", "Companion", "FieldsProxy", "OneofsProxy", "OptionsProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Type.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$FieldsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$OneofsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class OneofsProxy extends DslProxy {
            private OneofsProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$OptionsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Type.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Type _build() {
            Type build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllFields(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllFields(iterable);
        }

        public final /* synthetic */ void addAllOneofs(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllOneofs(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addFields(DslList dslList, Field field) {
            dslList.getClass();
            field.getClass();
            this._builder.addFields(field);
        }

        public final /* synthetic */ void addOneofs(DslList dslList, String str) {
            dslList.getClass();
            str.getClass();
            this._builder.addOneofs(str);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            dslList.getClass();
            option.getClass();
            this._builder.addOptions(option);
        }

        public final void clearEdition() {
            this._builder.clearEdition();
        }

        public final /* synthetic */ void clearFields(DslList dslList) {
            dslList.getClass();
            this._builder.clearFields();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            dslList.getClass();
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final String getEdition() {
            String edition = this._builder.getEdition();
            edition.getClass();
            return edition;
        }

        public final /* synthetic */ DslList getFields() {
            List<Field> fieldsList = this._builder.getFieldsList();
            fieldsList.getClass();
            return new DslList(fieldsList);
        }

        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        public final DslList<String, OneofsProxy> getOneofs() {
            List<String> oneofsList = this._builder.getOneofsList();
            oneofsList.getClass();
            return new DslList<>(oneofsList);
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            optionsList.getClass();
            return new DslList(optionsList);
        }

        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            sourceContext.getClass();
            return sourceContext;
        }

        public final SourceContext getSourceContextOrNull(Dsl dsl) {
            dsl.getClass();
            return TypeKtKt.getSourceContextOrNull(dsl._builder);
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            syntax.getClass();
            return syntax;
        }

        public final int getSyntaxValue() {
            return this._builder.getSyntaxValue();
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllFields(DslList<Field, FieldsProxy> dslList, Iterable<Field> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllFields(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOneofs(DslList<String, OneofsProxy> dslList, Iterable<String> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllOneofs(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignFields(DslList<Field, FieldsProxy> dslList, Field field) {
            dslList.getClass();
            field.getClass();
            addFields(dslList, field);
        }

        public final /* synthetic */ void plusAssignOneofs(DslList<String, OneofsProxy> dslList, String str) {
            dslList.getClass();
            str.getClass();
            addOneofs(dslList, str);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            dslList.getClass();
            option.getClass();
            addOptions(dslList, option);
        }

        public final void setEdition(String str) {
            str.getClass();
            this._builder.setEdition(str);
        }

        public final /* synthetic */ void setFields(DslList dslList, int i, Field field) {
            dslList.getClass();
            field.getClass();
            this._builder.setFields(i, field);
        }

        public final void setName(String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOneofs(DslList dslList, int i, String str) {
            dslList.getClass();
            str.getClass();
            this._builder.setOneofs(i, str);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            dslList.getClass();
            option.getClass();
            this._builder.setOptions(i, option);
        }

        public final void setSourceContext(SourceContext sourceContext) {
            sourceContext.getClass();
            this._builder.setSourceContext(sourceContext);
        }

        public final void setSyntax(Syntax syntax) {
            syntax.getClass();
            this._builder.setSyntax(syntax);
        }

        public final void setSyntaxValue(int i) {
            this._builder.setSyntaxValue(i);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/TypeKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/TypeKt$Dsl;", "builder", "Lcom/google/protobuf/Type$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Type.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Type.Builder builder, yx yxVar) {
            this(builder);
        }

        public final /* synthetic */ void setOneofs(DslList dslList) {
            dslList.getClass();
            this._builder.clearOneofs();
        }
    }
}
