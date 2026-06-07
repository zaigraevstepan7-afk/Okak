package kotlinx.serialization.internal;

import defpackage.bf;
import defpackage.yq1;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u001b\n\u0002\b\u0006\u001a9\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a_\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00070\u0007H\u0001¢\u0006\u0002\u0010\r\u001ao\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00070\u00072\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"createSimpleEnumSerializer", "Lkotlinx/serialization/KSerializer;", "T", "", "serialName", "", "values", "", "(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;", "createMarkedEnumSerializer", "names", "annotations", "", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "createAnnotatedEnumSerializer", "entryAnnotations", "classAnnotations", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class EnumsKt {
    public static final <T extends Enum<T>> KSerializer<T> createAnnotatedEnumSerializer(String str, T[] tArr, String[] strArr, Annotation[][] annotationArr, Annotation[] annotationArr2) {
        str.getClass();
        tArr.getClass();
        strArr.getClass();
        annotationArr.getClass();
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, tArr.length);
        if (annotationArr2 != null) {
            for (Annotation annotation : annotationArr2) {
                enumDescriptor.pushClassAnnotation(annotation);
            }
        }
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            int i3 = i2 + 1;
            String str2 = (String) bf.W(strArr, i2);
            if (str2 == null) {
                str2 = t.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, str2, false, 2, null);
            Annotation[] annotationArr3 = (Annotation[]) bf.W(annotationArr, i2);
            if (annotationArr3 != null) {
                for (Annotation annotation2 : annotationArr3) {
                    enumDescriptor.pushAnnotation(annotation2);
                }
            }
            i++;
            i2 = i3;
        }
        return new EnumSerializer(str, tArr, enumDescriptor);
    }

    public static final <T extends Enum<T>> KSerializer<T> createMarkedEnumSerializer(String str, T[] tArr, String[] strArr, Annotation[][] annotationArr) {
        str.getClass();
        tArr.getClass();
        strArr.getClass();
        annotationArr.getClass();
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, tArr.length);
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = tArr[i];
            int i3 = i2 + 1;
            String str2 = (String) bf.W(strArr, i2);
            if (str2 == null) {
                str2 = t.name();
            }
            PluginGeneratedSerialDescriptor.addElement$default(enumDescriptor, str2, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) bf.W(annotationArr, i2);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    enumDescriptor.pushAnnotation(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        return new EnumSerializer(str, tArr, enumDescriptor);
    }

    public static final <T extends Enum<T>> KSerializer<T> createSimpleEnumSerializer(String str, T[] tArr) {
        str.getClass();
        tArr.getClass();
        return new EnumSerializer(str, tArr);
    }
}
