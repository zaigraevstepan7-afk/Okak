package com.google.protobuf;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@CheckReturnValue
/* loaded from: classes.dex */
final class ListFieldSchemas {
    private static final ListFieldSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final ListFieldSchema LITE_SCHEMA = new ListFieldSchemaLite();

    private ListFieldSchemas() {
    }

    public static ListFieldSchema full() {
        return FULL_SCHEMA;
    }

    public static ListFieldSchema lite() {
        return LITE_SCHEMA;
    }

    private static ListFieldSchema loadSchemaForFullRuntime() {
        if (Android.assumeLiteRuntime) {
            return null;
        }
        try {
            return (ListFieldSchema) Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
