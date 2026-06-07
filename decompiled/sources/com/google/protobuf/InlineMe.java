package com.google.protobuf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
/* loaded from: classes.dex */
@interface InlineMe {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}
