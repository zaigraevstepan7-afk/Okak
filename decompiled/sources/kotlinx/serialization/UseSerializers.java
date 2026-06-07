package kotlinx.serialization;

import defpackage.yq1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Target({})
@Retention(RetentionPolicy.CLASS)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B3\u0012*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u0002\"\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00030\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lkotlinx/serialization/UseSerializers;", "", "", "Lto0;", "Lkotlinx/serialization/KSerializer;", "serializerClasses", "<init>", "(Lkotlin/Array;)V", "()[Ljava/lang/Class;", "kotlinx-serialization-core"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public @interface UseSerializers {
    Class<? extends KSerializer<?>>[] serializerClasses();
}
